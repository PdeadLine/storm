/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-27")
public class MetricInfo implements org.apache.thrift.TBase<MetricInfo, MetricInfo._Fields>, java.io.Serializable, Cloneable, Comparable<MetricInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetricInfo");

  private static final org.apache.thrift.protocol.TField BASE_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("baseMetric", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField INPUT_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("inputMetric", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField OUTPUT_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("outputMetric", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetricInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetricInfoTupleSchemeFactory());
  }

  private Map<String,MetricWindow> baseMetric; // required
  private Map<String,Map<String,MetricWindow>> inputMetric; // optional
  private Map<String,Map<String,MetricWindow>> outputMetric; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE_METRIC((short)1, "baseMetric"),
    INPUT_METRIC((short)2, "inputMetric"),
    OUTPUT_METRIC((short)3, "outputMetric");

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
        case 1: // BASE_METRIC
          return BASE_METRIC;
        case 2: // INPUT_METRIC
          return INPUT_METRIC;
        case 3: // OUTPUT_METRIC
          return OUTPUT_METRIC;
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
  private static final _Fields optionals[] = {_Fields.INPUT_METRIC,_Fields.OUTPUT_METRIC};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_METRIC, new org.apache.thrift.meta_data.FieldMetaData("baseMetric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricWindow.class))));
    tmpMap.put(_Fields.INPUT_METRIC, new org.apache.thrift.meta_data.FieldMetaData("inputMetric", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricWindow.class)))));
    tmpMap.put(_Fields.OUTPUT_METRIC, new org.apache.thrift.meta_data.FieldMetaData("outputMetric", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricWindow.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetricInfo.class, metaDataMap);
  }

  public MetricInfo() {
  }

  public MetricInfo(
    Map<String,MetricWindow> baseMetric)
  {
    this();
    this.baseMetric = baseMetric;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricInfo(MetricInfo other) {
    if (other.is_set_baseMetric()) {
      Map<String,MetricWindow> __this__baseMetric = new HashMap<String,MetricWindow>(other.baseMetric.size());
      for (Map.Entry<String, MetricWindow> other_element : other.baseMetric.entrySet()) {

        String other_element_key = other_element.getKey();
        MetricWindow other_element_value = other_element.getValue();

        String __this__baseMetric_copy_key = other_element_key;

        MetricWindow __this__baseMetric_copy_value = new MetricWindow(other_element_value);

        __this__baseMetric.put(__this__baseMetric_copy_key, __this__baseMetric_copy_value);
      }
      this.baseMetric = __this__baseMetric;
    }
    if (other.is_set_inputMetric()) {
      Map<String,Map<String,MetricWindow>> __this__inputMetric = new HashMap<String,Map<String,MetricWindow>>(other.inputMetric.size());
      for (Map.Entry<String, Map<String,MetricWindow>> other_element : other.inputMetric.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<String,MetricWindow> other_element_value = other_element.getValue();

        String __this__inputMetric_copy_key = other_element_key;

        Map<String,MetricWindow> __this__inputMetric_copy_value = new HashMap<String,MetricWindow>(other_element_value.size());
        for (Map.Entry<String, MetricWindow> other_element_value_element : other_element_value.entrySet()) {

          String other_element_value_element_key = other_element_value_element.getKey();
          MetricWindow other_element_value_element_value = other_element_value_element.getValue();

          String __this__inputMetric_copy_value_copy_key = other_element_value_element_key;

          MetricWindow __this__inputMetric_copy_value_copy_value = new MetricWindow(other_element_value_element_value);

          __this__inputMetric_copy_value.put(__this__inputMetric_copy_value_copy_key, __this__inputMetric_copy_value_copy_value);
        }

        __this__inputMetric.put(__this__inputMetric_copy_key, __this__inputMetric_copy_value);
      }
      this.inputMetric = __this__inputMetric;
    }
    if (other.is_set_outputMetric()) {
      Map<String,Map<String,MetricWindow>> __this__outputMetric = new HashMap<String,Map<String,MetricWindow>>(other.outputMetric.size());
      for (Map.Entry<String, Map<String,MetricWindow>> other_element : other.outputMetric.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<String,MetricWindow> other_element_value = other_element.getValue();

        String __this__outputMetric_copy_key = other_element_key;

        Map<String,MetricWindow> __this__outputMetric_copy_value = new HashMap<String,MetricWindow>(other_element_value.size());
        for (Map.Entry<String, MetricWindow> other_element_value_element : other_element_value.entrySet()) {

          String other_element_value_element_key = other_element_value_element.getKey();
          MetricWindow other_element_value_element_value = other_element_value_element.getValue();

          String __this__outputMetric_copy_value_copy_key = other_element_value_element_key;

          MetricWindow __this__outputMetric_copy_value_copy_value = new MetricWindow(other_element_value_element_value);

          __this__outputMetric_copy_value.put(__this__outputMetric_copy_value_copy_key, __this__outputMetric_copy_value_copy_value);
        }

        __this__outputMetric.put(__this__outputMetric_copy_key, __this__outputMetric_copy_value);
      }
      this.outputMetric = __this__outputMetric;
    }
  }

  public MetricInfo deepCopy() {
    return new MetricInfo(this);
  }

  @Override
  public void clear() {
    this.baseMetric = null;
    this.inputMetric = null;
    this.outputMetric = null;
  }

  public int get_baseMetric_size() {
    return (this.baseMetric == null) ? 0 : this.baseMetric.size();
  }

  public void put_to_baseMetric(String key, MetricWindow val) {
    if (this.baseMetric == null) {
      this.baseMetric = new HashMap<String,MetricWindow>();
    }
    this.baseMetric.put(key, val);
  }

  public Map<String,MetricWindow> get_baseMetric() {
    return this.baseMetric;
  }

  public void set_baseMetric(Map<String,MetricWindow> baseMetric) {
    this.baseMetric = baseMetric;
  }

  public void unset_baseMetric() {
    this.baseMetric = null;
  }

  /** Returns true if field baseMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_baseMetric() {
    return this.baseMetric != null;
  }

  public void set_baseMetric_isSet(boolean value) {
    if (!value) {
      this.baseMetric = null;
    }
  }

  public int get_inputMetric_size() {
    return (this.inputMetric == null) ? 0 : this.inputMetric.size();
  }

  public void put_to_inputMetric(String key, Map<String,MetricWindow> val) {
    if (this.inputMetric == null) {
      this.inputMetric = new HashMap<String,Map<String,MetricWindow>>();
    }
    this.inputMetric.put(key, val);
  }

  public Map<String,Map<String,MetricWindow>> get_inputMetric() {
    return this.inputMetric;
  }

  public void set_inputMetric(Map<String,Map<String,MetricWindow>> inputMetric) {
    this.inputMetric = inputMetric;
  }

  public void unset_inputMetric() {
    this.inputMetric = null;
  }

  /** Returns true if field inputMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_inputMetric() {
    return this.inputMetric != null;
  }

  public void set_inputMetric_isSet(boolean value) {
    if (!value) {
      this.inputMetric = null;
    }
  }

  public int get_outputMetric_size() {
    return (this.outputMetric == null) ? 0 : this.outputMetric.size();
  }

  public void put_to_outputMetric(String key, Map<String,MetricWindow> val) {
    if (this.outputMetric == null) {
      this.outputMetric = new HashMap<String,Map<String,MetricWindow>>();
    }
    this.outputMetric.put(key, val);
  }

  public Map<String,Map<String,MetricWindow>> get_outputMetric() {
    return this.outputMetric;
  }

  public void set_outputMetric(Map<String,Map<String,MetricWindow>> outputMetric) {
    this.outputMetric = outputMetric;
  }

  public void unset_outputMetric() {
    this.outputMetric = null;
  }

  /** Returns true if field outputMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_outputMetric() {
    return this.outputMetric != null;
  }

  public void set_outputMetric_isSet(boolean value) {
    if (!value) {
      this.outputMetric = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BASE_METRIC:
      if (value == null) {
        unset_baseMetric();
      } else {
        set_baseMetric((Map<String,MetricWindow>)value);
      }
      break;

    case INPUT_METRIC:
      if (value == null) {
        unset_inputMetric();
      } else {
        set_inputMetric((Map<String,Map<String,MetricWindow>>)value);
      }
      break;

    case OUTPUT_METRIC:
      if (value == null) {
        unset_outputMetric();
      } else {
        set_outputMetric((Map<String,Map<String,MetricWindow>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_METRIC:
      return get_baseMetric();

    case INPUT_METRIC:
      return get_inputMetric();

    case OUTPUT_METRIC:
      return get_outputMetric();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BASE_METRIC:
      return is_set_baseMetric();
    case INPUT_METRIC:
      return is_set_inputMetric();
    case OUTPUT_METRIC:
      return is_set_outputMetric();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricInfo)
      return this.equals((MetricInfo)that);
    return false;
  }

  public boolean equals(MetricInfo that) {
    if (that == null)
      return false;

    boolean this_present_baseMetric = true && this.is_set_baseMetric();
    boolean that_present_baseMetric = true && that.is_set_baseMetric();
    if (this_present_baseMetric || that_present_baseMetric) {
      if (!(this_present_baseMetric && that_present_baseMetric))
        return false;
      if (!this.baseMetric.equals(that.baseMetric))
        return false;
    }

    boolean this_present_inputMetric = true && this.is_set_inputMetric();
    boolean that_present_inputMetric = true && that.is_set_inputMetric();
    if (this_present_inputMetric || that_present_inputMetric) {
      if (!(this_present_inputMetric && that_present_inputMetric))
        return false;
      if (!this.inputMetric.equals(that.inputMetric))
        return false;
    }

    boolean this_present_outputMetric = true && this.is_set_outputMetric();
    boolean that_present_outputMetric = true && that.is_set_outputMetric();
    if (this_present_outputMetric || that_present_outputMetric) {
      if (!(this_present_outputMetric && that_present_outputMetric))
        return false;
      if (!this.outputMetric.equals(that.outputMetric))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_baseMetric = true && (is_set_baseMetric());
    list.add(present_baseMetric);
    if (present_baseMetric)
      list.add(baseMetric);

    boolean present_inputMetric = true && (is_set_inputMetric());
    list.add(present_inputMetric);
    if (present_inputMetric)
      list.add(inputMetric);

    boolean present_outputMetric = true && (is_set_outputMetric());
    list.add(present_outputMetric);
    if (present_outputMetric)
      list.add(outputMetric);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetricInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_baseMetric()).compareTo(other.is_set_baseMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_baseMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.baseMetric, other.baseMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_inputMetric()).compareTo(other.is_set_inputMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_inputMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputMetric, other.inputMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_outputMetric()).compareTo(other.is_set_outputMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_outputMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outputMetric, other.outputMetric);
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
    StringBuilder sb = new StringBuilder("MetricInfo(");
    boolean first = true;

    sb.append("baseMetric:");
    if (this.baseMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.baseMetric);
    }
    first = false;
    if (is_set_inputMetric()) {
      if (!first) sb.append(", ");
      sb.append("inputMetric:");
      if (this.inputMetric == null) {
        sb.append("null");
      } else {
        sb.append(this.inputMetric);
      }
      first = false;
    }
    if (is_set_outputMetric()) {
      if (!first) sb.append(", ");
      sb.append("outputMetric:");
      if (this.outputMetric == null) {
        sb.append("null");
      } else {
        sb.append(this.outputMetric);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_baseMetric()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'baseMetric' is unset! Struct:" + toString());
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

  private static class MetricInfoStandardSchemeFactory implements SchemeFactory {
    public MetricInfoStandardScheme getScheme() {
      return new MetricInfoStandardScheme();
    }
  }

  private static class MetricInfoStandardScheme extends StandardScheme<MetricInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MetricInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map116 = iprot.readMapBegin();
                struct.baseMetric = new HashMap<String,MetricWindow>(2*_map116.size);
                String _key117;
                MetricWindow _val118;
                for (int _i119 = 0; _i119 < _map116.size; ++_i119)
                {
                  _key117 = iprot.readString();
                  _val118 = new MetricWindow();
                  _val118.read(iprot);
                  struct.baseMetric.put(_key117, _val118);
                }
                iprot.readMapEnd();
              }
              struct.set_baseMetric_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INPUT_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map120 = iprot.readMapBegin();
                struct.inputMetric = new HashMap<String,Map<String,MetricWindow>>(2*_map120.size);
                String _key121;
                Map<String,MetricWindow> _val122;
                for (int _i123 = 0; _i123 < _map120.size; ++_i123)
                {
                  _key121 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map124 = iprot.readMapBegin();
                    _val122 = new HashMap<String,MetricWindow>(2*_map124.size);
                    String _key125;
                    MetricWindow _val126;
                    for (int _i127 = 0; _i127 < _map124.size; ++_i127)
                    {
                      _key125 = iprot.readString();
                      _val126 = new MetricWindow();
                      _val126.read(iprot);
                      _val122.put(_key125, _val126);
                    }
                    iprot.readMapEnd();
                  }
                  struct.inputMetric.put(_key121, _val122);
                }
                iprot.readMapEnd();
              }
              struct.set_inputMetric_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OUTPUT_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map128 = iprot.readMapBegin();
                struct.outputMetric = new HashMap<String,Map<String,MetricWindow>>(2*_map128.size);
                String _key129;
                Map<String,MetricWindow> _val130;
                for (int _i131 = 0; _i131 < _map128.size; ++_i131)
                {
                  _key129 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map132 = iprot.readMapBegin();
                    _val130 = new HashMap<String,MetricWindow>(2*_map132.size);
                    String _key133;
                    MetricWindow _val134;
                    for (int _i135 = 0; _i135 < _map132.size; ++_i135)
                    {
                      _key133 = iprot.readString();
                      _val134 = new MetricWindow();
                      _val134.read(iprot);
                      _val130.put(_key133, _val134);
                    }
                    iprot.readMapEnd();
                  }
                  struct.outputMetric.put(_key129, _val130);
                }
                iprot.readMapEnd();
              }
              struct.set_outputMetric_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MetricInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.baseMetric != null) {
        oprot.writeFieldBegin(BASE_METRIC_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.baseMetric.size()));
          for (Map.Entry<String, MetricWindow> _iter136 : struct.baseMetric.entrySet())
          {
            oprot.writeString(_iter136.getKey());
            _iter136.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.inputMetric != null) {
        if (struct.is_set_inputMetric()) {
          oprot.writeFieldBegin(INPUT_METRIC_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.inputMetric.size()));
            for (Map.Entry<String, Map<String,MetricWindow>> _iter137 : struct.inputMetric.entrySet())
            {
              oprot.writeString(_iter137.getKey());
              {
                oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, _iter137.getValue().size()));
                for (Map.Entry<String, MetricWindow> _iter138 : _iter137.getValue().entrySet())
                {
                  oprot.writeString(_iter138.getKey());
                  _iter138.getValue().write(oprot);
                }
                oprot.writeMapEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.outputMetric != null) {
        if (struct.is_set_outputMetric()) {
          oprot.writeFieldBegin(OUTPUT_METRIC_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.outputMetric.size()));
            for (Map.Entry<String, Map<String,MetricWindow>> _iter139 : struct.outputMetric.entrySet())
            {
              oprot.writeString(_iter139.getKey());
              {
                oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, _iter139.getValue().size()));
                for (Map.Entry<String, MetricWindow> _iter140 : _iter139.getValue().entrySet())
                {
                  oprot.writeString(_iter140.getKey());
                  _iter140.getValue().write(oprot);
                }
                oprot.writeMapEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetricInfoTupleSchemeFactory implements SchemeFactory {
    public MetricInfoTupleScheme getScheme() {
      return new MetricInfoTupleScheme();
    }
  }

  private static class MetricInfoTupleScheme extends TupleScheme<MetricInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MetricInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.baseMetric.size());
        for (Map.Entry<String, MetricWindow> _iter141 : struct.baseMetric.entrySet())
        {
          oprot.writeString(_iter141.getKey());
          _iter141.getValue().write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.is_set_inputMetric()) {
        optionals.set(0);
      }
      if (struct.is_set_outputMetric()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.is_set_inputMetric()) {
        {
          oprot.writeI32(struct.inputMetric.size());
          for (Map.Entry<String, Map<String,MetricWindow>> _iter142 : struct.inputMetric.entrySet())
          {
            oprot.writeString(_iter142.getKey());
            {
              oprot.writeI32(_iter142.getValue().size());
              for (Map.Entry<String, MetricWindow> _iter143 : _iter142.getValue().entrySet())
              {
                oprot.writeString(_iter143.getKey());
                _iter143.getValue().write(oprot);
              }
            }
          }
        }
      }
      if (struct.is_set_outputMetric()) {
        {
          oprot.writeI32(struct.outputMetric.size());
          for (Map.Entry<String, Map<String,MetricWindow>> _iter144 : struct.outputMetric.entrySet())
          {
            oprot.writeString(_iter144.getKey());
            {
              oprot.writeI32(_iter144.getValue().size());
              for (Map.Entry<String, MetricWindow> _iter145 : _iter144.getValue().entrySet())
              {
                oprot.writeString(_iter145.getKey());
                _iter145.getValue().write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MetricInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map146 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.baseMetric = new HashMap<String,MetricWindow>(2*_map146.size);
        String _key147;
        MetricWindow _val148;
        for (int _i149 = 0; _i149 < _map146.size; ++_i149)
        {
          _key147 = iprot.readString();
          _val148 = new MetricWindow();
          _val148.read(iprot);
          struct.baseMetric.put(_key147, _val148);
        }
      }
      struct.set_baseMetric_isSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map150 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
          struct.inputMetric = new HashMap<String,Map<String,MetricWindow>>(2*_map150.size);
          String _key151;
          Map<String,MetricWindow> _val152;
          for (int _i153 = 0; _i153 < _map150.size; ++_i153)
          {
            _key151 = iprot.readString();
            {
              org.apache.thrift.protocol.TMap _map154 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val152 = new HashMap<String,MetricWindow>(2*_map154.size);
              String _key155;
              MetricWindow _val156;
              for (int _i157 = 0; _i157 < _map154.size; ++_i157)
              {
                _key155 = iprot.readString();
                _val156 = new MetricWindow();
                _val156.read(iprot);
                _val152.put(_key155, _val156);
              }
            }
            struct.inputMetric.put(_key151, _val152);
          }
        }
        struct.set_inputMetric_isSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map158 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
          struct.outputMetric = new HashMap<String,Map<String,MetricWindow>>(2*_map158.size);
          String _key159;
          Map<String,MetricWindow> _val160;
          for (int _i161 = 0; _i161 < _map158.size; ++_i161)
          {
            _key159 = iprot.readString();
            {
              org.apache.thrift.protocol.TMap _map162 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val160 = new HashMap<String,MetricWindow>(2*_map162.size);
              String _key163;
              MetricWindow _val164;
              for (int _i165 = 0; _i165 < _map162.size; ++_i165)
              {
                _key163 = iprot.readString();
                _val164 = new MetricWindow();
                _val164.read(iprot);
                _val160.put(_key163, _val164);
              }
            }
            struct.outputMetric.put(_key159, _val160);
          }
        }
        struct.set_outputMetric_isSet(true);
      }
    }
  }

}
