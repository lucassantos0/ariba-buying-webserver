/**
 * ERPOrder_PurchOrdLineDetailsLineItemsItemLineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.procure.core.ProcureLineType, group name Reference,
 * variant vrealm_350275.
 */
public class ERPOrder_PurchOrdLineDetailsLineItemsItemLineType  implements java.io.Serializable {
    /* This integer value specifies the category of the line item.
     * This value is 1 or blank for normal catalog and non-catalog line items,
     * it is 2 for tax lines, 4 for charge lines with OOTB ShippingCharge,
     * 8                                           for charge lines with
     * OOTB HandlingCharge, 16 for charge lines with                    
     * customer-configured charge types, and 32 for discount lines. */
    private java.math.BigInteger category;

    /* Line type of child line that contain information on taxes,
     * charges, and discount lines. This line type can be Tax, Charge, or
     * Discount */
    private java.lang.String uniqueName;

    public ERPOrder_PurchOrdLineDetailsLineItemsItemLineType() {
    }

    public ERPOrder_PurchOrdLineDetailsLineItemsItemLineType(
           java.math.BigInteger category,
           java.lang.String uniqueName) {
           this.category = category;
           this.uniqueName = uniqueName;
    }


    /**
     * Gets the category value for this ERPOrder_PurchOrdLineDetailsLineItemsItemLineType.
     * 
     * @return category   * This integer value specifies the category of the line item.
     * This value is 1 or blank for normal catalog and non-catalog line items,
     * it is 2 for tax lines, 4 for charge lines with OOTB ShippingCharge,
     * 8                                           for charge lines with
     * OOTB HandlingCharge, 16 for charge lines with                    
     * customer-configured charge types, and 32 for discount lines.
     */
    public java.math.BigInteger getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ERPOrder_PurchOrdLineDetailsLineItemsItemLineType.
     * 
     * @param category   * This integer value specifies the category of the line item.
     * This value is 1 or blank for normal catalog and non-catalog line items,
     * it is 2 for tax lines, 4 for charge lines with OOTB ShippingCharge,
     * 8                                           for charge lines with
     * OOTB HandlingCharge, 16 for charge lines with                    
     * customer-configured charge types, and 32 for discount lines.
     */
    public void setCategory(java.math.BigInteger category) {
        this.category = category;
    }


    /**
     * Gets the uniqueName value for this ERPOrder_PurchOrdLineDetailsLineItemsItemLineType.
     * 
     * @return uniqueName   * Line type of child line that contain information on taxes,
     * charges, and discount lines. This line type can be Tax, Charge, or
     * Discount
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ERPOrder_PurchOrdLineDetailsLineItemsItemLineType.
     * 
     * @param uniqueName   * Line type of child line that contain information on taxes,
     * charges, and discount lines. This line type can be Tax, Charge, or
     * Discount
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdLineDetailsLineItemsItemLineType)) return false;
        ERPOrder_PurchOrdLineDetailsLineItemsItemLineType other = (ERPOrder_PurchOrdLineDetailsLineItemsItemLineType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
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
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdLineDetailsLineItemsItemLineType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>LineType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "UniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
