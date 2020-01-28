/**
 * ERPOrder_PurchaseOrderNumberImport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Name null, type ariba.purchasing.core.ERPOrder, variant vrealm_350275.
 */
public class ERPOrder_PurchaseOrderNumberImport  implements java.io.Serializable {
    /* The unique ID of the ERP purchase order for which it shows
     * a status. */
    private java.lang.String ERPPONumber;

    /* The unique ID of the purchase order. */
    private java.lang.String uniqueName;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustom custom;

    public ERPOrder_PurchaseOrderNumberImport() {
    }

    public ERPOrder_PurchaseOrderNumberImport(
           java.lang.String ERPPONumber,
           java.lang.String uniqueName,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustom custom) {
           this.ERPPONumber = ERPPONumber;
           this.uniqueName = uniqueName;
           this.custom = custom;
    }


    /**
     * Gets the ERPPONumber value for this ERPOrder_PurchaseOrderNumberImport.
     * 
     * @return ERPPONumber   * The unique ID of the ERP purchase order for which it shows
     * a status.
     */
    public java.lang.String getERPPONumber() {
        return ERPPONumber;
    }


    /**
     * Sets the ERPPONumber value for this ERPOrder_PurchaseOrderNumberImport.
     * 
     * @param ERPPONumber   * The unique ID of the ERP purchase order for which it shows
     * a status.
     */
    public void setERPPONumber(java.lang.String ERPPONumber) {
        this.ERPPONumber = ERPPONumber;
    }


    /**
     * Gets the uniqueName value for this ERPOrder_PurchaseOrderNumberImport.
     * 
     * @return uniqueName   * The unique ID of the purchase order.
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ERPOrder_PurchaseOrderNumberImport.
     * 
     * @param uniqueName   * The unique ID of the purchase order.
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the custom value for this ERPOrder_PurchaseOrderNumberImport.
     * 
     * @return custom
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustom getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this ERPOrder_PurchaseOrderNumberImport.
     * 
     * @param custom
     */
    public void setCustom(vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustom custom) {
        this.custom = custom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchaseOrderNumberImport)) return false;
        ERPOrder_PurchaseOrderNumberImport other = (ERPOrder_PurchaseOrderNumberImport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ERPPONumber==null && other.getERPPONumber()==null) || 
             (this.ERPPONumber!=null &&
              this.ERPPONumber.equals(other.getERPPONumber()))) &&
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom())));
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
        if (getERPPONumber() != null) {
            _hashCode += getERPPONumber().hashCode();
        }
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchaseOrderNumberImport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchaseOrderNumberImport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERPPONumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPPONumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "UniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchaseOrderNumberImport>custom"));
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
