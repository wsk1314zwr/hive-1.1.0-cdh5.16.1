/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hive.service.auth.ldap;

import com.google.common.base.Strings;
import org.apache.hadoop.hive.conf.HiveConf;

/**
 * A factory for common types of directory service search queries.
 */
public final class QueryFactory {

  private final String guidAttr;
  private final String groupClassAttr;
  private final String groupMembershipAttr;

  /**
   * Constructs the factory based on provided Hive configuration.
   * @param conf Hive configuration
   */
  public QueryFactory(HiveConf conf) {
    guidAttr = conf.getVar(HiveConf.ConfVars.HIVE_SERVER2_PLAIN_LDAP_GUIDKEY);
    groupClassAttr = conf.getVar(HiveConf.ConfVars.HIVE_SERVER2_PLAIN_LDAP_GROUPCLASS_KEY);
    groupMembershipAttr = conf.getVar(
        HiveConf.ConfVars.HIVE_SERVER2_PLAIN_LDAP_GROUPMEMBERSHIP_KEY);
  }

  /**
   * Returns a query for finding Group DN based on group unique ID.
   * @param groupId group unique identifier
   * @return an instance of {@link Query}
   */
  public Query findGroupDnById(String groupId) {
    return Query.builder()
        .filter("(&(objectClass=<groupClassAttr>)(<guidAttr>=<groupID>))")
        .map("guidAttr", guidAttr)
        .map("groupClassAttr", groupClassAttr)
        .map("groupID", groupId)
        .limit(2)
        .build();
  }

  /**
   * Returns a query for finding user DN based on user RDN.
   * @param userRdn user RDN
   * @return an instance of {@link Query}
   */
  public Query findUserDnByRdn(String userRdn) {
    return Query.builder()
        .filter("(&(|(objectClass=person)(objectClass=user)(objectClass=inetOrgPerson))"
            + "(<userRdn>))")
        .limit(2)
        .map("userRdn", userRdn)
        .build();
  }

  /**
   * Returns a query for finding user DN based on DN pattern.
   * <br>
   * Name of this method was derived from the original implementation of LDAP authentication.
   * This method should be replaced by {@link QueryFactory#findUserDnByRdn(java.lang.String).
   *
   * @param rdn user RDN
   * @return an instance of {@link Query}
   */
  public Query findDnByPattern(String rdn) {
    return Query.builder()
        .filter("(<rdn>)")
        .map("rdn", rdn)
        .limit(2)
        .build();
  }

  /**
   * Returns a query for finding user DN based on user unique name.
   * @param userName user unique name (uid or sAMAccountName)
   * @return an instance of {@link Query}
   */
  public Query findUserDnByName(String userName) {
    return Query.builder()
        .filter("(&(|(objectClass=person)(objectClass=user)(objectClass=inetOrgPerson))"
            + "(|(uid=<userName>)(sAMAccountName=<userName>)))")
        .map("userName", userName)
        .limit(2)
        .build();
  }

  /**
   * Returns a query for finding groups to which the user belongs.
   * @param userName username
   * @param userDn user DN
   * @return an instance of {@link Query}
   */
  public Query findGroupsForUser(String userName, String userDn) {
    return Query.builder()
        .filter("(&(objectClass=<groupClassAttr>)(|(<groupMembershipAttr>=<userDn>)"
            + "(<groupMembershipAttr>=<userName>)))")
        .map("groupClassAttr", groupClassAttr)
        .map("groupMembershipAttr", groupMembershipAttr)
        .map("userName", userName)
        .map("userDn", userDn)
        .build();
  }

  /**
   * Returns a query object created for the custom filter.
   * <br>
   * This query is configured to return a group membership attribute as part of the search result.
   * @param searchFilter custom search filter
   * @return an instance of {@link Query}
   */
  public Query customQuery(String searchFilter) {
    Query.QueryBuilder builder = Query.builder();
    builder.filter(searchFilter);
    if (!Strings.isNullOrEmpty(groupMembershipAttr)) {
      builder.returnAttribute(groupMembershipAttr);
    }
    return builder.build();
  }
}
