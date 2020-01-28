/**
 * PurchaseOrderExportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

@SuppressWarnings("serial")
public class PurchaseOrderExportRequest  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetails[] ERPOrder_PurchOrdHeaderDetails_Item;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetails[] ERPOrder_PurchOrdLineDetails_Item;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetails[] ERPOrder_PurchOrdSplitDetails_Item;

    private java.lang.String partition;  // attribute

    private java.lang.String variant;  // attribute

    public PurchaseOrderExportRequest() {
    }

    public PurchaseOrderExportRequest(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetails[] ERPOrder_PurchOrdHeaderDetails_Item,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetails[] ERPOrder_PurchOrdLineDetails_Item,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetails[] ERPOrder_PurchOrdSplitDetails_Item,
           java.lang.String partition,
           java.lang.String variant) {
           this.ERPOrder_PurchOrdHeaderDetails_Item = ERPOrder_PurchOrdHeaderDetails_Item;
           this.ERPOrder_PurchOrdLineDetails_Item = ERPOrder_PurchOrdLineDetails_Item;
           this.ERPOrder_PurchOrdSplitDetails_Item = ERPOrder_PurchOrdSplitDetails_Item;
           this.partition = partition;
           this.variant = variant;
    }


    /**
     * Gets the ERPOrder_PurchOrdHeaderDetails_Item value for this PurchaseOrderExportRequest.
     * 
     * @return ERPOrder_PurchOrdHeaderDetails_Item
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetails[] getERPOrder_PurchOrdHeaderDetails_Item() {
        return ERPOrder_PurchOrdHeaderDetails_Item;
    }


    /**
     * Sets the ERPOrder_PurchOrdHeaderDetails_Item value for this PurchaseOrderExportRequest.
     * 
     * @param ERPOrder_PurchOrdHeaderDetails_Item
     */
    public void setERPOrder_PurchOrdHeaderDetails_Item(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetails[] ERPOrder_PurchOrdHeaderDetails_Item) {
        this.ERPOrder_PurchOrdHeaderDetails_Item = ERPOrder_PurchOrdHeaderDetails_Item;
    }


    /**
     * Gets the ERPOrder_PurchOrdLineDetails_Item value for this PurchaseOrderExportRequest.
     * 
     * @return ERPOrder_PurchOrdLineDetails_Item
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetails[] getERPOrder_PurchOrdLineDetails_Item() {
        return ERPOrder_PurchOrdLineDetails_Item;
    }


    /**
     * Sets the ERPOrder_PurchOrdLineDetails_Item value for this PurchaseOrderExportRequest.
     * 
     * @param ERPOrder_PurchOrdLineDetails_Item
     */
    public void setERPOrder_PurchOrdLineDetails_Item(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetails[] ERPOrder_PurchOrdLineDetails_Item) {
        this.ERPOrder_PurchOrdLineDetails_Item = ERPOrder_PurchOrdLineDetails_Item;
    }


    /**
     * Gets the ERPOrder_PurchOrdSplitDetails_Item value for this PurchaseOrderExportRequest.
     * 
     * @return ERPOrder_PurchOrdSplitDetails_Item
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetails[] getERPOrder_PurchOrdSplitDetails_Item() {
        return ERPOrder_PurchOrdSplitDetails_Item;
    }


    /**
     * Sets the ERPOrder_PurchOrdSplitDetails_Item value for this PurchaseOrderExportRequest.
     * 
     * @param ERPOrder_PurchOrdSplitDetails_Item
     */
    public void setERPOrder_PurchOrdSplitDetails_Item(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetails[] ERPOrder_PurchOrdSplitDetails_Item) {
        this.ERPOrder_PurchOrdSplitDetails_Item = ERPOrder_PurchOrdSplitDetails_Item;
    }


    /**
     * Gets the partition value for this PurchaseOrderExportRequest.
     * 
     * @return partition
     */
    public java.lang.String getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this PurchaseOrderExportRequest.
     * 
     * @param partition
     */
    public void setPartition(java.lang.String partition) {
        this.partition = partition;
    }


    /**
     * Gets the variant value for this PurchaseOrderExportRequest.
     * 
     * @return variant
     */
    public java.lang.String getVariant() {
        return variant;
    }


    /**
     * Sets the variant value for this PurchaseOrderExportRequest.
     * 
     * @param variant
     */
    public void setVariant(java.lang.String variant) {
        this.variant = variant;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderExportRequest)) return false;
        PurchaseOrderExportRequest other = (PurchaseOrderExportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ERPOrder_PurchOrdHeaderDetails_Item==null && other.getERPOrder_PurchOrdHeaderDetails_Item()==null) || 
             (this.ERPOrder_PurchOrdHeaderDetails_Item!=null &&
              java.util.Arrays.equals(this.ERPOrder_PurchOrdHeaderDetails_Item, other.getERPOrder_PurchOrdHeaderDetails_Item()))) &&
            ((this.ERPOrder_PurchOrdLineDetails_Item==null && other.getERPOrder_PurchOrdLineDetails_Item()==null) || 
             (this.ERPOrder_PurchOrdLineDetails_Item!=null &&
              java.util.Arrays.equals(this.ERPOrder_PurchOrdLineDetails_Item, other.getERPOrder_PurchOrdLineDetails_Item()))) &&
            ((this.ERPOrder_PurchOrdSplitDetails_Item==null && other.getERPOrder_PurchOrdSplitDetails_Item()==null) || 
             (this.ERPOrder_PurchOrdSplitDetails_Item!=null &&
              java.util.Arrays.equals(this.ERPOrder_PurchOrdSplitDetails_Item, other.getERPOrder_PurchOrdSplitDetails_Item()))) &&
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
        if (getERPOrder_PurchOrdHeaderDetails_Item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getERPOrder_PurchOrdHeaderDetails_Item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getERPOrder_PurchOrdHeaderDetails_Item(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getERPOrder_PurchOrdLineDetails_Item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getERPOrder_PurchOrdLineDetails_Item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getERPOrder_PurchOrdLineDetails_Item(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getERPOrder_PurchOrdSplitDetails_Item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getERPOrder_PurchOrdSplitDetails_Item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getERPOrder_PurchOrdSplitDetails_Item(), i);
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
        new org.apache.axis.description.TypeDesc(PurchaseOrderExportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">PurchaseOrderExportRequest"));
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
        elemField.setFieldName("ERPOrder_PurchOrdHeaderDetails_Item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdHeaderDetails_Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdHeaderDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERPOrder_PurchOrdLineDetails_Item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdLineDetails_Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdLineDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERPOrder_PurchOrdSplitDetails_Item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdSplitDetails_Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdSplitDetails"));
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
