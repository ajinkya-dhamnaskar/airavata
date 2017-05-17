/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.sharing.registry.models;

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
/**
 * <p>Container object for search criteria</p>
 * <li><b>searchField</b> : Entity search field</li>
 * <li><b>value</b> : Search value</li>
 * <li><b>searchCondition</b> : EQUAL, LIKE etc..</li>
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class SearchCriteria implements org.apache.thrift.TBase<SearchCriteria, SearchCriteria._Fields>, java.io.Serializable, Cloneable, Comparable<SearchCriteria> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SearchCriteria");

  private static final org.apache.thrift.protocol.TField SEARCH_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("searchField", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEARCH_CONDITION_FIELD_DESC = new org.apache.thrift.protocol.TField("searchCondition", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SearchCriteriaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SearchCriteriaTupleSchemeFactory());
  }

  /**
   * 
   * @see EntitySearchField
   */
  public EntitySearchField searchField; // optional
  public String value; // optional
  /**
   * 
   * @see SearchCondition
   */
  public SearchCondition searchCondition; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see EntitySearchField
     */
    SEARCH_FIELD((short)1, "searchField"),
    VALUE((short)2, "value"),
    /**
     * 
     * @see SearchCondition
     */
    SEARCH_CONDITION((short)3, "searchCondition");

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
        case 1: // SEARCH_FIELD
          return SEARCH_FIELD;
        case 2: // VALUE
          return VALUE;
        case 3: // SEARCH_CONDITION
          return SEARCH_CONDITION;
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
  private static final _Fields optionals[] = {_Fields.SEARCH_FIELD,_Fields.VALUE,_Fields.SEARCH_CONDITION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEARCH_FIELD, new org.apache.thrift.meta_data.FieldMetaData("searchField", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, EntitySearchField.class)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEARCH_CONDITION, new org.apache.thrift.meta_data.FieldMetaData("searchCondition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SearchCondition.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SearchCriteria.class, metaDataMap);
  }

  public SearchCriteria() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SearchCriteria(SearchCriteria other) {
    if (other.isSetSearchField()) {
      this.searchField = other.searchField;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
    if (other.isSetSearchCondition()) {
      this.searchCondition = other.searchCondition;
    }
  }

  public SearchCriteria deepCopy() {
    return new SearchCriteria(this);
  }

  @Override
  public void clear() {
    this.searchField = null;
    this.value = null;
    this.searchCondition = null;
  }

  /**
   * 
   * @see EntitySearchField
   */
  public EntitySearchField getSearchField() {
    return this.searchField;
  }

  /**
   * 
   * @see EntitySearchField
   */
  public SearchCriteria setSearchField(EntitySearchField searchField) {
    this.searchField = searchField;
    return this;
  }

  public void unsetSearchField() {
    this.searchField = null;
  }

  /** Returns true if field searchField is set (has been assigned a value) and false otherwise */
  public boolean isSetSearchField() {
    return this.searchField != null;
  }

  public void setSearchFieldIsSet(boolean value) {
    if (!value) {
      this.searchField = null;
    }
  }

  public String getValue() {
    return this.value;
  }

  public SearchCriteria setValue(String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  /**
   * 
   * @see SearchCondition
   */
  public SearchCondition getSearchCondition() {
    return this.searchCondition;
  }

  /**
   * 
   * @see SearchCondition
   */
  public SearchCriteria setSearchCondition(SearchCondition searchCondition) {
    this.searchCondition = searchCondition;
    return this;
  }

  public void unsetSearchCondition() {
    this.searchCondition = null;
  }

  /** Returns true if field searchCondition is set (has been assigned a value) and false otherwise */
  public boolean isSetSearchCondition() {
    return this.searchCondition != null;
  }

  public void setSearchConditionIsSet(boolean value) {
    if (!value) {
      this.searchCondition = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SEARCH_FIELD:
      if (value == null) {
        unsetSearchField();
      } else {
        setSearchField((EntitySearchField)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((String)value);
      }
      break;

    case SEARCH_CONDITION:
      if (value == null) {
        unsetSearchCondition();
      } else {
        setSearchCondition((SearchCondition)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SEARCH_FIELD:
      return getSearchField();

    case VALUE:
      return getValue();

    case SEARCH_CONDITION:
      return getSearchCondition();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SEARCH_FIELD:
      return isSetSearchField();
    case VALUE:
      return isSetValue();
    case SEARCH_CONDITION:
      return isSetSearchCondition();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SearchCriteria)
      return this.equals((SearchCriteria)that);
    return false;
  }

  public boolean equals(SearchCriteria that) {
    if (that == null)
      return false;

    boolean this_present_searchField = true && this.isSetSearchField();
    boolean that_present_searchField = true && that.isSetSearchField();
    if (this_present_searchField || that_present_searchField) {
      if (!(this_present_searchField && that_present_searchField))
        return false;
      if (!this.searchField.equals(that.searchField))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_searchCondition = true && this.isSetSearchCondition();
    boolean that_present_searchCondition = true && that.isSetSearchCondition();
    if (this_present_searchCondition || that_present_searchCondition) {
      if (!(this_present_searchCondition && that_present_searchCondition))
        return false;
      if (!this.searchCondition.equals(that.searchCondition))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_searchField = true && (isSetSearchField());
    list.add(present_searchField);
    if (present_searchField)
      list.add(searchField.getValue());

    boolean present_value = true && (isSetValue());
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_searchCondition = true && (isSetSearchCondition());
    list.add(present_searchCondition);
    if (present_searchCondition)
      list.add(searchCondition.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(SearchCriteria other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSearchField()).compareTo(other.isSetSearchField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSearchField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.searchField, other.searchField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSearchCondition()).compareTo(other.isSetSearchCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSearchCondition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.searchCondition, other.searchCondition);
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
    StringBuilder sb = new StringBuilder("SearchCriteria(");
    boolean first = true;

    if (isSetSearchField()) {
      sb.append("searchField:");
      if (this.searchField == null) {
        sb.append("null");
      } else {
        sb.append(this.searchField);
      }
      first = false;
    }
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        sb.append(this.value);
      }
      first = false;
    }
    if (isSetSearchCondition()) {
      if (!first) sb.append(", ");
      sb.append("searchCondition:");
      if (this.searchCondition == null) {
        sb.append("null");
      } else {
        sb.append(this.searchCondition);
      }
      first = false;
    }
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

  private static class SearchCriteriaStandardSchemeFactory implements SchemeFactory {
    public SearchCriteriaStandardScheme getScheme() {
      return new SearchCriteriaStandardScheme();
    }
  }

  private static class SearchCriteriaStandardScheme extends StandardScheme<SearchCriteria> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SearchCriteria struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEARCH_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.searchField = org.apache.airavata.sharing.registry.models.EntitySearchField.findByValue(iprot.readI32());
              struct.setSearchFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEARCH_CONDITION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.searchCondition = org.apache.airavata.sharing.registry.models.SearchCondition.findByValue(iprot.readI32());
              struct.setSearchConditionIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SearchCriteria struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.searchField != null) {
        if (struct.isSetSearchField()) {
          oprot.writeFieldBegin(SEARCH_FIELD_FIELD_DESC);
          oprot.writeI32(struct.searchField.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          oprot.writeString(struct.value);
          oprot.writeFieldEnd();
        }
      }
      if (struct.searchCondition != null) {
        if (struct.isSetSearchCondition()) {
          oprot.writeFieldBegin(SEARCH_CONDITION_FIELD_DESC);
          oprot.writeI32(struct.searchCondition.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SearchCriteriaTupleSchemeFactory implements SchemeFactory {
    public SearchCriteriaTupleScheme getScheme() {
      return new SearchCriteriaTupleScheme();
    }
  }

  private static class SearchCriteriaTupleScheme extends TupleScheme<SearchCriteria> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SearchCriteria struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSearchField()) {
        optionals.set(0);
      }
      if (struct.isSetValue()) {
        optionals.set(1);
      }
      if (struct.isSetSearchCondition()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSearchField()) {
        oprot.writeI32(struct.searchField.getValue());
      }
      if (struct.isSetValue()) {
        oprot.writeString(struct.value);
      }
      if (struct.isSetSearchCondition()) {
        oprot.writeI32(struct.searchCondition.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SearchCriteria struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.searchField = org.apache.airavata.sharing.registry.models.EntitySearchField.findByValue(iprot.readI32());
        struct.setSearchFieldIsSet(true);
      }
      if (incoming.get(1)) {
        struct.value = iprot.readString();
        struct.setValueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.searchCondition = org.apache.airavata.sharing.registry.models.SearchCondition.findByValue(iprot.readI32());
        struct.setSearchConditionIsSet(true);
      }
    }
  }

}

