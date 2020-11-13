/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ShowLocksResponse implements org.apache.thrift.TBase<ShowLocksResponse, ShowLocksResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ShowLocksResponse");

  private static final org.apache.thrift.protocol.TField LOCKS_FIELD_DESC = new org.apache.thrift.protocol.TField("locks", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ShowLocksResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ShowLocksResponseTupleSchemeFactory());
  }

  private List<ShowLocksResponseElement> locks; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOCKS((short)1, "locks");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LOCKS
          return LOCKS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOCKS, new org.apache.thrift.meta_data.FieldMetaData("locks", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ShowLocksResponseElement.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ShowLocksResponse.class, metaDataMap);
  }

  public ShowLocksResponse() {
  }

  public ShowLocksResponse(
    List<ShowLocksResponseElement> locks)
  {
    this();
    this.locks = locks;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ShowLocksResponse(ShowLocksResponse other) {
    if (other.isSetLocks()) {
      List<ShowLocksResponseElement> __this__locks = new ArrayList<ShowLocksResponseElement>();
      for (ShowLocksResponseElement other_element : other.locks) {
        __this__locks.add(new ShowLocksResponseElement(other_element));
      }
      this.locks = __this__locks;
    }
  }

  public ShowLocksResponse deepCopy() {
    return new ShowLocksResponse(this);
  }

  @Override
  public void clear() {
    this.locks = null;
  }

  public int getLocksSize() {
    return (this.locks == null) ? 0 : this.locks.size();
  }

  public java.util.Iterator<ShowLocksResponseElement> getLocksIterator() {
    return (this.locks == null) ? null : this.locks.iterator();
  }

  public void addToLocks(ShowLocksResponseElement elem) {
    if (this.locks == null) {
      this.locks = new ArrayList<ShowLocksResponseElement>();
    }
    this.locks.add(elem);
  }

  public List<ShowLocksResponseElement> getLocks() {
    return this.locks;
  }

  public void setLocks(List<ShowLocksResponseElement> locks) {
    this.locks = locks;
  }

  public void unsetLocks() {
    this.locks = null;
  }

  /** Returns true if field locks is set (has been assigned a value) and false otherwise */
  public boolean isSetLocks() {
    return this.locks != null;
  }

  public void setLocksIsSet(boolean value) {
    if (!value) {
      this.locks = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOCKS:
      if (value == null) {
        unsetLocks();
      } else {
        setLocks((List<ShowLocksResponseElement>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOCKS:
      return getLocks();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOCKS:
      return isSetLocks();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ShowLocksResponse)
      return this.equals((ShowLocksResponse)that);
    return false;
  }

  public boolean equals(ShowLocksResponse that) {
    if (that == null)
      return false;

    boolean this_present_locks = true && this.isSetLocks();
    boolean that_present_locks = true && that.isSetLocks();
    if (this_present_locks || that_present_locks) {
      if (!(this_present_locks && that_present_locks))
        return false;
      if (!this.locks.equals(that.locks))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_locks = true && (isSetLocks());
    builder.append(present_locks);
    if (present_locks)
      builder.append(locks);

    return builder.toHashCode();
  }

  public int compareTo(ShowLocksResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ShowLocksResponse typedOther = (ShowLocksResponse)other;

    lastComparison = Boolean.valueOf(isSetLocks()).compareTo(typedOther.isSetLocks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locks, typedOther.locks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ShowLocksResponse(");
    boolean first = true;

    sb.append("locks:");
    if (this.locks == null) {
      sb.append("null");
    } else {
      sb.append(this.locks);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ShowLocksResponseStandardSchemeFactory implements SchemeFactory {
    public ShowLocksResponseStandardScheme getScheme() {
      return new ShowLocksResponseStandardScheme();
    }
  }

  private static class ShowLocksResponseStandardScheme extends StandardScheme<ShowLocksResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ShowLocksResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOCKS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list460 = iprot.readListBegin();
                struct.locks = new ArrayList<ShowLocksResponseElement>(_list460.size);
                for (int _i461 = 0; _i461 < _list460.size; ++_i461)
                {
                  ShowLocksResponseElement _elem462; // required
                  _elem462 = new ShowLocksResponseElement();
                  _elem462.read(iprot);
                  struct.locks.add(_elem462);
                }
                iprot.readListEnd();
              }
              struct.setLocksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ShowLocksResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.locks != null) {
        oprot.writeFieldBegin(LOCKS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.locks.size()));
          for (ShowLocksResponseElement _iter463 : struct.locks)
          {
            _iter463.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ShowLocksResponseTupleSchemeFactory implements SchemeFactory {
    public ShowLocksResponseTupleScheme getScheme() {
      return new ShowLocksResponseTupleScheme();
    }
  }

  private static class ShowLocksResponseTupleScheme extends TupleScheme<ShowLocksResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ShowLocksResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLocks()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLocks()) {
        {
          oprot.writeI32(struct.locks.size());
          for (ShowLocksResponseElement _iter464 : struct.locks)
          {
            _iter464.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ShowLocksResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list465 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.locks = new ArrayList<ShowLocksResponseElement>(_list465.size);
          for (int _i466 = 0; _i466 < _list465.size; ++_i466)
          {
            ShowLocksResponseElement _elem467; // required
            _elem467 = new ShowLocksResponseElement();
            _elem467.read(iprot);
            struct.locks.add(_elem467);
          }
        }
        struct.setLocksIsSet(true);
      }
    }
  }

}
