/**
 * ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.common.core.CommodityExportMapEntry, group name
 * Reference, variant vrealm_350275.
 */
public class ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType accountType;

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry() {
    }

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType accountType) {
           this.accountType = accountType;
    }


    /**
     * Gets the accountType value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry.
     * 
     * @return accountType
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry.
     * 
     * @param accountType
     */
    public void setAccountType(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType accountType) {
        this.accountType = accountType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry)) return false;
        ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry other = (ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType())));
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>CommodityExportMapEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>CommodityExportMapEntry>AccountType"));
        elemField.setMinOccurs(0);
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
