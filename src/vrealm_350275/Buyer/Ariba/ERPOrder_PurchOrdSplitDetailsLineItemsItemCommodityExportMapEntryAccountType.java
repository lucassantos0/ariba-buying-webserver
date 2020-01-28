/**
 * ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.common.core.AccountType, group name Reference,
 * variant vrealm_350275.
 */
public class ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType  implements java.io.Serializable {
    /* The unique accounting type for each line item in the purchase
     * order. */
    private java.lang.String uniqueName;

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType() {
    }

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType(
           java.lang.String uniqueName) {
           this.uniqueName = uniqueName;
    }


    /**
     * Gets the uniqueName value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType.
     * 
     * @return uniqueName   * The unique accounting type for each line item in the purchase
     * order.
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType.
     * 
     * @param uniqueName   * The unique accounting type for each line item in the purchase
     * order.
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType)) return false;
        ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType other = (ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType) obj;
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
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>CommodityExportMapEntry>AccountType"));
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
