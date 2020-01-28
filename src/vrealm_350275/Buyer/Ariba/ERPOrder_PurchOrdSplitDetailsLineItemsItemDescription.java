/**
 * ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.procure.core.LineItemProductDescription, group
 * name Reference, variant vrealm_350275.
 */
public class ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription  implements java.io.Serializable {
    /* The description of each line item in the purchase order. */
    private java.lang.String description;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionPrice price;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionUnitOfMeasure unitOfMeasure;

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription() {
    }

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription(
           java.lang.String description,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionPrice price,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionUnitOfMeasure unitOfMeasure) {
           this.description = description;
           this.price = price;
           this.unitOfMeasure = unitOfMeasure;
    }


    /**
     * Gets the description value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.
     * 
     * @return description   * The description of each line item in the purchase order.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.
     * 
     * @param description   * The description of each line item in the purchase order.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the price value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.
     * 
     * @return price
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionPrice getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.
     * 
     * @param price
     */
    public void setPrice(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionPrice price) {
        this.price = price;
    }


    /**
     * Gets the unitOfMeasure value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.
     * 
     * @return unitOfMeasure
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }


    /**
     * Sets the unitOfMeasure value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.
     * 
     * @param unitOfMeasure
     */
    public void setUnitOfMeasure(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionUnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription)) return false;
        ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription other = (ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.unitOfMeasure==null && other.getUnitOfMeasure()==null) || 
             (this.unitOfMeasure!=null &&
              this.unitOfMeasure.equals(other.getUnitOfMeasure())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getUnitOfMeasure() != null) {
            _hashCode += getUnitOfMeasure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Description"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Description>Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "UnitOfMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Description>UnitOfMeasure"));
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
