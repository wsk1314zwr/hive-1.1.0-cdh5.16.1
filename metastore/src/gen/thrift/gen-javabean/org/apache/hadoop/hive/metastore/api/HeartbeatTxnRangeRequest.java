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

@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class HeartbeatTxnRangeRequest implements org.apache.thrift.TBase<HeartbeatTxnRangeRequest, HeartbeatTxnRangeRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartbeatTxnRangeRequest");

  private static final org.apache.thrift.protocol.TField MIN_FIELD_DESC = new org.apache.thrift.protocol.TField("min", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField MAX_FIELD_DESC = new org.apache.thrift.protocol.TField("max", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HeartbeatTxnRangeRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HeartbeatTxnRangeRequestTupleSchemeFactory());
  }

  private long min; // required
  private long max; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MIN((short)1, "min"),
    MAX((short)2, "max");

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
        case 1: // MIN
          return MIN;
        case 2: // MAX
          return MAX;
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
  private static final int __MIN_ISSET_ID = 0;
  private static final int __MAX_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MIN, new org.apache.thrift.meta_data.FieldMetaData("min", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX, new org.apache.thrift.meta_data.FieldMetaData("max", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartbeatTxnRangeRequest.class, metaDataMap);
  }

  public HeartbeatTxnRangeRequest() {
  }

  public HeartbeatTxnRangeRequest(
    long min,
    long max)
  {
    this();
    this.min = min;
    setMinIsSet(true);
    this.max = max;
    setMaxIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartbeatTxnRangeRequest(HeartbeatTxnRangeRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.min = other.min;
    this.max = other.max;
  }

  public HeartbeatTxnRangeRequest deepCopy() {
    return new HeartbeatTxnRangeRequest(this);
  }

  @Override
  public void clear() {
    setMinIsSet(false);
    this.min = 0;
    setMaxIsSet(false);
    this.max = 0;
  }

  public long getMin() {
    return this.min;
  }

  public void setMin(long min) {
    this.min = min;
    setMinIsSet(true);
  }

  public void unsetMin() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MIN_ISSET_ID);
  }

  /** Returns true if field min is set (has been assigned a value) and false otherwise */
  public boolean isSetMin() {
    return EncodingUtils.testBit(__isset_bitfield, __MIN_ISSET_ID);
  }

  public void setMinIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MIN_ISSET_ID, value);
  }

  public long getMax() {
    return this.max;
  }

  public void setMax(long max) {
    this.max = max;
    setMaxIsSet(true);
  }

  public void unsetMax() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAX_ISSET_ID);
  }

  /** Returns true if field max is set (has been assigned a value) and false otherwise */
  public boolean isSetMax() {
    return EncodingUtils.testBit(__isset_bitfield, __MAX_ISSET_ID);
  }

  public void setMaxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MIN:
      if (value == null) {
        unsetMin();
      } else {
        setMin((Long)value);
      }
      break;

    case MAX:
      if (value == null) {
        unsetMax();
      } else {
        setMax((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MIN:
      return Long.valueOf(getMin());

    case MAX:
      return Long.valueOf(getMax());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MIN:
      return isSetMin();
    case MAX:
      return isSetMax();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HeartbeatTxnRangeRequest)
      return this.equals((HeartbeatTxnRangeRequest)that);
    return false;
  }

  public boolean equals(HeartbeatTxnRangeRequest that) {
    if (that == null)
      return false;

    boolean this_present_min = true;
    boolean that_present_min = true;
    if (this_present_min || that_present_min) {
      if (!(this_present_min && that_present_min))
        return false;
      if (this.min != that.min)
        return false;
    }

    boolean this_present_max = true;
    boolean that_present_max = true;
    if (this_present_max || that_present_max) {
      if (!(this_present_max && that_present_max))
        return false;
      if (this.max != that.max)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_min = true;
    builder.append(present_min);
    if (present_min)
      builder.append(min);

    boolean present_max = true;
    builder.append(present_max);
    if (present_max)
      builder.append(max);

    return builder.toHashCode();
  }

  public int compareTo(HeartbeatTxnRangeRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HeartbeatTxnRangeRequest typedOther = (HeartbeatTxnRangeRequest)other;

    lastComparison = Boolean.valueOf(isSetMin()).compareTo(typedOther.isSetMin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.min, typedOther.min);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMax()).compareTo(typedOther.isSetMax());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max, typedOther.max);
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
    StringBuilder sb = new StringBuilder("HeartbeatTxnRangeRequest(");
    boolean first = true;

    sb.append("min:");
    sb.append(this.min);
    first = false;
    if (!first) sb.append(", ");
    sb.append("max:");
    sb.append(this.max);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMin()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'min' is unset! Struct:" + toString());
    }

    if (!isSetMax()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'max' is unset! Struct:" + toString());
    }

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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HeartbeatTxnRangeRequestStandardSchemeFactory implements SchemeFactory {
    public HeartbeatTxnRangeRequestStandardScheme getScheme() {
      return new HeartbeatTxnRangeRequestStandardScheme();
    }
  }

  private static class HeartbeatTxnRangeRequestStandardScheme extends StandardScheme<HeartbeatTxnRangeRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HeartbeatTxnRangeRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.min = iprot.readI64();
              struct.setMinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.max = iprot.readI64();
              struct.setMaxIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HeartbeatTxnRangeRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MIN_FIELD_DESC);
      oprot.writeI64(struct.min);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_FIELD_DESC);
      oprot.writeI64(struct.max);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeartbeatTxnRangeRequestTupleSchemeFactory implements SchemeFactory {
    public HeartbeatTxnRangeRequestTupleScheme getScheme() {
      return new HeartbeatTxnRangeRequestTupleScheme();
    }
  }

  private static class HeartbeatTxnRangeRequestTupleScheme extends TupleScheme<HeartbeatTxnRangeRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HeartbeatTxnRangeRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.min);
      oprot.writeI64(struct.max);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HeartbeatTxnRangeRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.min = iprot.readI64();
      struct.setMinIsSet(true);
      struct.max = iprot.readI64();
      struct.setMaxIsSet(true);
    }
  }

}

