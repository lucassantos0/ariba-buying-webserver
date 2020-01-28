/**
 * ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

public class ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.util.Calendar _value;

    private java.lang.String name;  // attribute

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate() {
    }

    // Simple Types must have a String constructor
    public ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate(java.util.Calendar _value) {
        this._value = _value;
    }
    public ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate(java.lang.String _value) {
        java.util.Calendar cal =
            (java.util.Calendar) new org.apache.axis.encoding.ser.CalendarDeserializer(
                java.lang.String.class, org.apache.axis.Constants.XSD_STRING).makeValue(_value);
        this._value = cal;
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : new org.apache.axis.encoding.ser.CalendarSerializer().getValueAsString(_value, null);
    }


    /**
     * Gets the _value value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate.
     * 
     * @return _value
     */
    public java.util.Calendar get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate.
     * 
     * @param _value
     */
    public void set_value(java.util.Calendar _value) {
        this._value = _value;
    }


    /**
     * Gets the name value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate)) return false;
        ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate other = (ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>custom>CustomDate"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.SimpleSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
