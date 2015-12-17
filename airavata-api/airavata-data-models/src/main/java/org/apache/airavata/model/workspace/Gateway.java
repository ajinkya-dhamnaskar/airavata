/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.workspace;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-17")
public class Gateway implements org.apache.thrift.TBase<Gateway, Gateway._Fields>, java.io.Serializable, Cloneable, Comparable<Gateway> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Gateway");

  private static final org.apache.thrift.protocol.TField GATEWAY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GATEWAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DOMAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("domain", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EMAIL_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("emailAddress", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GatewayStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GatewayTupleSchemeFactory());
  }

  private String gatewayId; // required
  private String gatewayName; // optional
  private String domain; // optional
  private String emailAddress; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GATEWAY_ID((short)1, "gatewayId"),
    GATEWAY_NAME((short)2, "gatewayName"),
    DOMAIN((short)3, "domain"),
    EMAIL_ADDRESS((short)4, "emailAddress");

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
        case 1: // GATEWAY_ID
          return GATEWAY_ID;
        case 2: // GATEWAY_NAME
          return GATEWAY_NAME;
        case 3: // DOMAIN
          return DOMAIN;
        case 4: // EMAIL_ADDRESS
          return EMAIL_ADDRESS;
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
  private static final _Fields optionals[] = {_Fields.GATEWAY_NAME,_Fields.DOMAIN,_Fields.EMAIL_ADDRESS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GATEWAY_ID, new org.apache.thrift.meta_data.FieldMetaData("gatewayId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GATEWAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("gatewayName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOMAIN, new org.apache.thrift.meta_data.FieldMetaData("domain", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("emailAddress", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Gateway.class, metaDataMap);
  }

  public Gateway() {
  }

  public Gateway(
    String gatewayId)
  {
    this();
    this.gatewayId = gatewayId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Gateway(Gateway other) {
    if (other.isSetGatewayId()) {
      this.gatewayId = other.gatewayId;
    }
    if (other.isSetGatewayName()) {
      this.gatewayName = other.gatewayName;
    }
    if (other.isSetDomain()) {
      this.domain = other.domain;
    }
    if (other.isSetEmailAddress()) {
      this.emailAddress = other.emailAddress;
    }
  }

  public Gateway deepCopy() {
    return new Gateway(this);
  }

  @Override
  public void clear() {
    this.gatewayId = null;
    this.gatewayName = null;
    this.domain = null;
    this.emailAddress = null;
  }

  public String getGatewayId() {
    return this.gatewayId;
  }

  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }

  public void unsetGatewayId() {
    this.gatewayId = null;
  }

  /** Returns true if field gatewayId is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayId() {
    return this.gatewayId != null;
  }

  public void setGatewayIdIsSet(boolean value) {
    if (!value) {
      this.gatewayId = null;
    }
  }

  public String getGatewayName() {
    return this.gatewayName;
  }

  public void setGatewayName(String gatewayName) {
    this.gatewayName = gatewayName;
  }

  public void unsetGatewayName() {
    this.gatewayName = null;
  }

  /** Returns true if field gatewayName is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayName() {
    return this.gatewayName != null;
  }

  public void setGatewayNameIsSet(boolean value) {
    if (!value) {
      this.gatewayName = null;
    }
  }

  public String getDomain() {
    return this.domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public void unsetDomain() {
    this.domain = null;
  }

  /** Returns true if field domain is set (has been assigned a value) and false otherwise */
  public boolean isSetDomain() {
    return this.domain != null;
  }

  public void setDomainIsSet(boolean value) {
    if (!value) {
      this.domain = null;
    }
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void unsetEmailAddress() {
    this.emailAddress = null;
  }

  /** Returns true if field emailAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetEmailAddress() {
    return this.emailAddress != null;
  }

  public void setEmailAddressIsSet(boolean value) {
    if (!value) {
      this.emailAddress = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GATEWAY_ID:
      if (value == null) {
        unsetGatewayId();
      } else {
        setGatewayId((String)value);
      }
      break;

    case GATEWAY_NAME:
      if (value == null) {
        unsetGatewayName();
      } else {
        setGatewayName((String)value);
      }
      break;

    case DOMAIN:
      if (value == null) {
        unsetDomain();
      } else {
        setDomain((String)value);
      }
      break;

    case EMAIL_ADDRESS:
      if (value == null) {
        unsetEmailAddress();
      } else {
        setEmailAddress((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GATEWAY_ID:
      return getGatewayId();

    case GATEWAY_NAME:
      return getGatewayName();

    case DOMAIN:
      return getDomain();

    case EMAIL_ADDRESS:
      return getEmailAddress();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GATEWAY_ID:
      return isSetGatewayId();
    case GATEWAY_NAME:
      return isSetGatewayName();
    case DOMAIN:
      return isSetDomain();
    case EMAIL_ADDRESS:
      return isSetEmailAddress();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Gateway)
      return this.equals((Gateway)that);
    return false;
  }

  public boolean equals(Gateway that) {
    if (that == null)
      return false;

    boolean this_present_gatewayId = true && this.isSetGatewayId();
    boolean that_present_gatewayId = true && that.isSetGatewayId();
    if (this_present_gatewayId || that_present_gatewayId) {
      if (!(this_present_gatewayId && that_present_gatewayId))
        return false;
      if (!this.gatewayId.equals(that.gatewayId))
        return false;
    }

    boolean this_present_gatewayName = true && this.isSetGatewayName();
    boolean that_present_gatewayName = true && that.isSetGatewayName();
    if (this_present_gatewayName || that_present_gatewayName) {
      if (!(this_present_gatewayName && that_present_gatewayName))
        return false;
      if (!this.gatewayName.equals(that.gatewayName))
        return false;
    }

    boolean this_present_domain = true && this.isSetDomain();
    boolean that_present_domain = true && that.isSetDomain();
    if (this_present_domain || that_present_domain) {
      if (!(this_present_domain && that_present_domain))
        return false;
      if (!this.domain.equals(that.domain))
        return false;
    }

    boolean this_present_emailAddress = true && this.isSetEmailAddress();
    boolean that_present_emailAddress = true && that.isSetEmailAddress();
    if (this_present_emailAddress || that_present_emailAddress) {
      if (!(this_present_emailAddress && that_present_emailAddress))
        return false;
      if (!this.emailAddress.equals(that.emailAddress))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_gatewayId = true && (isSetGatewayId());
    list.add(present_gatewayId);
    if (present_gatewayId)
      list.add(gatewayId);

    boolean present_gatewayName = true && (isSetGatewayName());
    list.add(present_gatewayName);
    if (present_gatewayName)
      list.add(gatewayName);

    boolean present_domain = true && (isSetDomain());
    list.add(present_domain);
    if (present_domain)
      list.add(domain);

    boolean present_emailAddress = true && (isSetEmailAddress());
    list.add(present_emailAddress);
    if (present_emailAddress)
      list.add(emailAddress);

    return list.hashCode();
  }

  @Override
  public int compareTo(Gateway other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGatewayId()).compareTo(other.isSetGatewayId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayId, other.gatewayId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGatewayName()).compareTo(other.isSetGatewayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayName, other.gatewayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDomain()).compareTo(other.isSetDomain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain, other.domain);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmailAddress()).compareTo(other.isSetEmailAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmailAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emailAddress, other.emailAddress);
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
    StringBuilder sb = new StringBuilder("Gateway(");
    boolean first = true;

    sb.append("gatewayId:");
    if (this.gatewayId == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayId);
    }
    first = false;
    if (isSetGatewayName()) {
      if (!first) sb.append(", ");
      sb.append("gatewayName:");
      if (this.gatewayName == null) {
        sb.append("null");
      } else {
        sb.append(this.gatewayName);
      }
      first = false;
    }
    if (isSetDomain()) {
      if (!first) sb.append(", ");
      sb.append("domain:");
      if (this.domain == null) {
        sb.append("null");
      } else {
        sb.append(this.domain);
      }
      first = false;
    }
    if (isSetEmailAddress()) {
      if (!first) sb.append(", ");
      sb.append("emailAddress:");
      if (this.emailAddress == null) {
        sb.append("null");
      } else {
        sb.append(this.emailAddress);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetGatewayId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayId' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GatewayStandardSchemeFactory implements SchemeFactory {
    public GatewayStandardScheme getScheme() {
      return new GatewayStandardScheme();
    }
  }

  private static class GatewayStandardScheme extends StandardScheme<Gateway> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Gateway struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GATEWAY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayId = iprot.readString();
              struct.setGatewayIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GATEWAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayName = iprot.readString();
              struct.setGatewayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DOMAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.domain = iprot.readString();
              struct.setDomainIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EMAIL_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.emailAddress = iprot.readString();
              struct.setEmailAddressIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Gateway struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.gatewayId != null) {
        oprot.writeFieldBegin(GATEWAY_ID_FIELD_DESC);
        oprot.writeString(struct.gatewayId);
        oprot.writeFieldEnd();
      }
      if (struct.gatewayName != null) {
        if (struct.isSetGatewayName()) {
          oprot.writeFieldBegin(GATEWAY_NAME_FIELD_DESC);
          oprot.writeString(struct.gatewayName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.domain != null) {
        if (struct.isSetDomain()) {
          oprot.writeFieldBegin(DOMAIN_FIELD_DESC);
          oprot.writeString(struct.domain);
          oprot.writeFieldEnd();
        }
      }
      if (struct.emailAddress != null) {
        if (struct.isSetEmailAddress()) {
          oprot.writeFieldBegin(EMAIL_ADDRESS_FIELD_DESC);
          oprot.writeString(struct.emailAddress);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GatewayTupleSchemeFactory implements SchemeFactory {
    public GatewayTupleScheme getScheme() {
      return new GatewayTupleScheme();
    }
  }

  private static class GatewayTupleScheme extends TupleScheme<Gateway> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Gateway struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.gatewayId);
      BitSet optionals = new BitSet();
      if (struct.isSetGatewayName()) {
        optionals.set(0);
      }
      if (struct.isSetDomain()) {
        optionals.set(1);
      }
      if (struct.isSetEmailAddress()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetGatewayName()) {
        oprot.writeString(struct.gatewayName);
      }
      if (struct.isSetDomain()) {
        oprot.writeString(struct.domain);
      }
      if (struct.isSetEmailAddress()) {
        oprot.writeString(struct.emailAddress);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Gateway struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.gatewayId = iprot.readString();
      struct.setGatewayIdIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.gatewayName = iprot.readString();
        struct.setGatewayNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.domain = iprot.readString();
        struct.setDomainIsSet(true);
      }
      if (incoming.get(2)) {
        struct.emailAddress = iprot.readString();
        struct.setEmailAddressIsSet(true);
      }
    }
  }

}

