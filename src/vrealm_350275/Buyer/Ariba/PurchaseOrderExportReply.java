/**
 * PurchaseOrderExportReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

public class PurchaseOrderExportReply  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImport[] ERPOrder_PurchaseOrderNumberImport_Item;

    private vrealm_350275.Buyer.Ariba.PurchaseOrderError_PurchOrdErrorImport[] purchaseOrderError_PurchOrdErrorImport_Item;

    private java.lang.String partition;  // attribute

    private java.lang.String variant;  // attribute

    public PurchaseOrderExportReply() {
    }

    public PurchaseOrderExportReply(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImport[] ERPOrder_PurchaseOrderNumberImport_Item,
           vrealm_350275.Buyer.Ariba.PurchaseOrderError_PurchOrdErrorImport[] purchaseOrderError_PurchOrdErrorImport_Item,
           java.lang.String partition,
           java.lang.String variant) {
           this.ERPOrder_PurchaseOrderNumberImport_Item = ERPOrder_PurchaseOrderNumberImport_Item;
           this.purchaseOrderError_PurchOrdErrorImport_Item = purchaseOrderError_PurchOrdErrorImport_Item;
           this.partition = partition;
           this.variant = variant;
    }


    /**
     * Gets the ERPOrder_PurchaseOrderNumberImport_Item value for this PurchaseOrderExportReply.
     * 
     * @return ERPOrder_PurchaseOrderNumberImport_Item
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImport[] getERPOrder_PurchaseOrderNumberImport_Item() {
        return ERPOrder_PurchaseOrderNumberImport_Item;
    }


    /**
     * Sets the ERPOrder_PurchaseOrderNumberImport_Item value for this PurchaseOrderExportReply.
     * 
     * @param ERPOrder_PurchaseOrderNumberImport_Item
     */
    public void setERPOrder_PurchaseOrderNumberImport_Item(vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImport[] ERPOrder_PurchaseOrderNumberImport_Item) {
        this.ERPOrder_PurchaseOrderNumberImport_Item = ERPOrder_PurchaseOrderNumberImport_Item;
    }


    /**
     * Gets the purchaseOrderError_PurchOrdErrorImport_Item value for this PurchaseOrderExportReply.
     * 
     * @return purchaseOrderError_PurchOrdErrorImport_Item
     */
    public vrealm_350275.Buyer.Ariba.PurchaseOrderError_PurchOrdErrorImport[] getPurchaseOrderError_PurchOrdErrorImport_Item() {
        return purchaseOrderError_PurchOrdErrorImport_Item;
    }


    /**
     * Sets the purchaseOrderError_PurchOrdErrorImport_Item value for this PurchaseOrderExportReply.
     * 
     * @param purchaseOrderError_PurchOrdErrorImport_Item
     */
    public void setPurchaseOrderError_PurchOrdErrorImport_Item(vrealm_350275.Buyer.Ariba.PurchaseOrderError_PurchOrdErrorImport[] purchaseOrderError_PurchOrdErrorImport_Item) {
        this.purchaseOrderError_PurchOrdErrorImport_Item = purchaseOrderError_PurchOrdErrorImport_Item;
    }


    /**
     * Gets the partition value for this PurchaseOrderExportReply.
     * 
     * @return partition
     */
    public java.lang.String getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this PurchaseOrderExportReply.
     * 
     * @param partition
     */
    public void setPartition(java.lang.String partition) {
        this.partition = partition;
    }


    /**
     * Gets the variant value for this PurchaseOrderExportReply.
     * 
     * @return variant
     */
    public java.lang.String getVariant() {
        return variant;
    }


    /**
     * Sets the variant value for this PurchaseOrderExportReply.
     * 
     * @param variant
     */
    public void setVariant(java.lang.String variant) {
        this.variant = variant;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderExportReply)) return false;
        PurchaseOrderExportReply other = (PurchaseOrderExportReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ERPOrder_PurchaseOrderNumberImport_Item==null && other.getERPOrder_PurchaseOrderNumberImport_Item()==null) || 
             (this.ERPOrder_PurchaseOrderNumberImport_Item!=null &&
              java.util.Arrays.equals(this.ERPOrder_PurchaseOrderNumberImport_Item, other.getERPOrder_PurchaseOrderNumberImport_Item()))) &&
            ((this.purchaseOrderError_PurchOrdErrorImport_Item==null && other.getPurchaseOrderError_PurchOrdErrorImport_Item()==null) || 
             (this.purchaseOrderError_PurchOrdErrorImport_Item!=null &&
              java.util.Arrays.equals(this.purchaseOrderError_PurchOrdErrorImport_Item, other.getPurchaseOrderError_PurchOrdErrorImport_Item()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            ((this.variant==null && other.getVariant()==null) || 
             (this.variant!=null &&
              this.variant.equals(other.getVariant())));
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
        if (getERPOrder_PurchaseOrderNumberImport_Item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getERPOrder_PurchaseOrderNumberImport_Item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getERPOrder_PurchaseOrderNumberImport_Item(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderError_PurchOrdErrorImport_Item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderError_PurchOrdErrorImport_Item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderError_PurchOrdErrorImport_Item(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        if (getVariant() != null) {
            _hashCode += getVariant().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderExportReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">PurchaseOrderExportReply"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("partition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "partition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("variant");
        attrField.setXmlName(new javax.xml.namespace.QName("", "variant"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERPOrder_PurchaseOrderNumberImport_Item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchaseOrderNumberImport_Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchaseOrderNumberImport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderError_PurchOrdErrorImport_Item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderError_PurchOrdErrorImport_Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderError_PurchOrdErrorImport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item"));
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
