/**
 * ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.basic.core.Currency, group name Reference, variant
 * vrealm_350275.
 */
public class ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency  implements java.io.Serializable {
    /* The currency code of ExpectedAmount. */
    private java.lang.String uniqueName;

    public ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency() {
    }

    public ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency(
           java.lang.String uniqueName) {
           this.uniqueName = uniqueName;
    }


    /**
     * Gets the uniqueName value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency.
     * 
     * @return uniqueName   * The currency code of ExpectedAmount.
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency.
     * 
     * @param uniqueName   * The currency code of ExpectedAmount.
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency)) return false;
        ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency other = (ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName())));
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
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails>ExpectedAmount>Currency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "UniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
