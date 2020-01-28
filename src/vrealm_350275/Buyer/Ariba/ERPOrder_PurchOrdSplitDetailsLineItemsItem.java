/**
 * ERPOrder_PurchOrdSplitDetailsLineItemsItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

public class ERPOrder_PurchOrdSplitDetailsLineItemsItem  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountings accountings;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry commodityExportMapEntry;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription description;

    /* The line number of a line item in the purchase order. */
    private java.math.BigInteger numberInCollection;

    /* The unique receiving type value for each line item in the purchase
     * order. The possible values are, System Received, Auto Received, Quantity
     * Based, or Amount Based. */
    private java.math.BigInteger receivingType;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemShipTo shipTo;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustom custom;

    public ERPOrder_PurchOrdSplitDetailsLineItemsItem() {
    }

    public ERPOrder_PurchOrdSplitDetailsLineItemsItem(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountings accountings,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry commodityExportMapEntry,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription description,
           java.math.BigInteger numberInCollection,
           java.math.BigInteger receivingType,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemShipTo shipTo,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustom custom) {
           this.accountings = accountings;
           this.commodityExportMapEntry = commodityExportMapEntry;
           this.description = description;
           this.numberInCollection = numberInCollection;
           this.receivingType = receivingType;
           this.shipTo = shipTo;
           this.custom = custom;
    }


    /**
     * Gets the accountings value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @return accountings
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountings getAccountings() {
        return accountings;
    }


    /**
     * Sets the accountings value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @param accountings
     */
    public void setAccountings(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountings accountings) {
        this.accountings = accountings;
    }


    /**
     * Gets the commodityExportMapEntry value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @return commodityExportMapEntry
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry getCommodityExportMapEntry() {
        return commodityExportMapEntry;
    }


    /**
     * Sets the commodityExportMapEntry value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @param commodityExportMapEntry
     */
    public void setCommodityExportMapEntry(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry commodityExportMapEntry) {
        this.commodityExportMapEntry = commodityExportMapEntry;
    }


    /**
     * Gets the description value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @return description
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @param description
     */
    public void setDescription(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription description) {
        this.description = description;
    }


    /**
     * Gets the numberInCollection value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @return numberInCollection   * The line number of a line item in the purchase order.
     */
    public java.math.BigInteger getNumberInCollection() {
        return numberInCollection;
    }


    /**
     * Sets the numberInCollection value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @param numberInCollection   * The line number of a line item in the purchase order.
     */
    public void setNumberInCollection(java.math.BigInteger numberInCollection) {
        this.numberInCollection = numberInCollection;
    }


    /**
     * Gets the receivingType value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @return receivingType   * The unique receiving type value for each line item in the purchase
     * order. The possible values are, System Received, Auto Received, Quantity
     * Based, or Amount Based.
     */
    public java.math.BigInteger getReceivingType() {
        return receivingType;
    }


    /**
     * Sets the receivingType value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @param receivingType   * The unique receiving type value for each line item in the purchase
     * order. The possible values are, System Received, Auto Received, Quantity
     * Based, or Amount Based.
     */
    public void setReceivingType(java.math.BigInteger receivingType) {
        this.receivingType = receivingType;
    }


    /**
     * Gets the shipTo value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @return shipTo
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemShipTo getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @param shipTo
     */
    public void setShipTo(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemShipTo shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the custom value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @return custom
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustom getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this ERPOrder_PurchOrdSplitDetailsLineItemsItem.
     * 
     * @param custom
     */
    public void setCustom(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustom custom) {
        this.custom = custom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdSplitDetailsLineItemsItem)) return false;
        ERPOrder_PurchOrdSplitDetailsLineItemsItem other = (ERPOrder_PurchOrdSplitDetailsLineItemsItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountings==null && other.getAccountings()==null) || 
             (this.accountings!=null &&
              this.accountings.equals(other.getAccountings()))) &&
            ((this.commodityExportMapEntry==null && other.getCommodityExportMapEntry()==null) || 
             (this.commodityExportMapEntry!=null &&
              this.commodityExportMapEntry.equals(other.getCommodityExportMapEntry()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.numberInCollection==null && other.getNumberInCollection()==null) || 
             (this.numberInCollection!=null &&
              this.numberInCollection.equals(other.getNumberInCollection()))) &&
            ((this.receivingType==null && other.getReceivingType()==null) || 
             (this.receivingType!=null &&
              this.receivingType.equals(other.getReceivingType()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
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
        if (getAccountings() != null) {
            _hashCode += getAccountings().hashCode();
        }
        if (getCommodityExportMapEntry() != null) {
            _hashCode += getCommodityExportMapEntry().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getNumberInCollection() != null) {
            _hashCode += getNumberInCollection().hashCode();
        }
        if (getReceivingType() != null) {
            _hashCode += getReceivingType().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdSplitDetailsLineItemsItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdSplitDetails>LineItems>item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Accountings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityExportMapEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "CommodityExportMapEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>CommodityExportMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberInCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "NumberInCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ReceivingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>ShipTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>custom"));
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
