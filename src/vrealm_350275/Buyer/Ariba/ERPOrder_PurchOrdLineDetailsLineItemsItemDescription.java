/**
 * ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.procure.core.LineItemProductDescription, group
 * name Reference, variant vrealm_350275.
 */
public class ERPOrder_PurchOrdLineDetailsLineItemsItemDescription  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionCommonCommodityCode commonCommodityCode;

    /* Ratio used to convert the ordered unit to the price unit. 
     * The unit price is based on the price unit quantity and the price unit. */
    private java.math.BigDecimal conversionFactor;

    /* The Description of each line item in the purchase order. */
    private java.lang.String description;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPrice price;

    /* The quantity corresponding to the unit price of the item specified
     * by the supplier.                                  The unit price is
     * based on the price unit quantity of the item. */
    private java.math.BigDecimal priceBasisQuantity;

    /* Any information for quantity-based pricing.               
     * Buyers can use this field to store any information on the unit conversion
     * calculation */
    private java.lang.String priceBasisQuantityDesc;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPriceBasisQuantityUOM priceBasisQuantityUOM;

    /* The ShortName of each line item in the purchase order. */
    private java.lang.String shortName;

    /* The SupplierPartAuxiliaryID for each line item in the purchase
     * order. */
    private java.lang.String supplierPartAuxiliaryID;

    /* The SupplierPartNumber for each line item in the purchase order. */
    private java.lang.String supplierPartNumber;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionUnitOfMeasure unitOfMeasure;

    public ERPOrder_PurchOrdLineDetailsLineItemsItemDescription() {
    }

    public ERPOrder_PurchOrdLineDetailsLineItemsItemDescription(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionCommonCommodityCode commonCommodityCode,
           java.math.BigDecimal conversionFactor,
           java.lang.String description,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPrice price,
           java.math.BigDecimal priceBasisQuantity,
           java.lang.String priceBasisQuantityDesc,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPriceBasisQuantityUOM priceBasisQuantityUOM,
           java.lang.String shortName,
           java.lang.String supplierPartAuxiliaryID,
           java.lang.String supplierPartNumber,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionUnitOfMeasure unitOfMeasure) {
           this.commonCommodityCode = commonCommodityCode;
           this.conversionFactor = conversionFactor;
           this.description = description;
           this.price = price;
           this.priceBasisQuantity = priceBasisQuantity;
           this.priceBasisQuantityDesc = priceBasisQuantityDesc;
           this.priceBasisQuantityUOM = priceBasisQuantityUOM;
           this.shortName = shortName;
           this.supplierPartAuxiliaryID = supplierPartAuxiliaryID;
           this.supplierPartNumber = supplierPartNumber;
           this.unitOfMeasure = unitOfMeasure;
    }


    /**
     * Gets the commonCommodityCode value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return commonCommodityCode
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionCommonCommodityCode getCommonCommodityCode() {
        return commonCommodityCode;
    }


    /**
     * Sets the commonCommodityCode value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param commonCommodityCode
     */
    public void setCommonCommodityCode(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionCommonCommodityCode commonCommodityCode) {
        this.commonCommodityCode = commonCommodityCode;
    }


    /**
     * Gets the conversionFactor value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return conversionFactor   * Ratio used to convert the ordered unit to the price unit. 
     * The unit price is based on the price unit quantity and the price unit.
     */
    public java.math.BigDecimal getConversionFactor() {
        return conversionFactor;
    }


    /**
     * Sets the conversionFactor value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param conversionFactor   * Ratio used to convert the ordered unit to the price unit. 
     * The unit price is based on the price unit quantity and the price unit.
     */
    public void setConversionFactor(java.math.BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }


    /**
     * Gets the description value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return description   * The Description of each line item in the purchase order.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param description   * The Description of each line item in the purchase order.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the price value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return price
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPrice getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param price
     */
    public void setPrice(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPrice price) {
        this.price = price;
    }


    /**
     * Gets the priceBasisQuantity value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return priceBasisQuantity   * The quantity corresponding to the unit price of the item specified
     * by the supplier.                                  The unit price is
     * based on the price unit quantity of the item.
     */
    public java.math.BigDecimal getPriceBasisQuantity() {
        return priceBasisQuantity;
    }


    /**
     * Sets the priceBasisQuantity value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param priceBasisQuantity   * The quantity corresponding to the unit price of the item specified
     * by the supplier.                                  The unit price is
     * based on the price unit quantity of the item.
     */
    public void setPriceBasisQuantity(java.math.BigDecimal priceBasisQuantity) {
        this.priceBasisQuantity = priceBasisQuantity;
    }


    /**
     * Gets the priceBasisQuantityDesc value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return priceBasisQuantityDesc   * Any information for quantity-based pricing.               
     * Buyers can use this field to store any information on the unit conversion
     * calculation
     */
    public java.lang.String getPriceBasisQuantityDesc() {
        return priceBasisQuantityDesc;
    }


    /**
     * Sets the priceBasisQuantityDesc value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param priceBasisQuantityDesc   * Any information for quantity-based pricing.               
     * Buyers can use this field to store any information on the unit conversion
     * calculation
     */
    public void setPriceBasisQuantityDesc(java.lang.String priceBasisQuantityDesc) {
        this.priceBasisQuantityDesc = priceBasisQuantityDesc;
    }


    /**
     * Gets the priceBasisQuantityUOM value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return priceBasisQuantityUOM
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPriceBasisQuantityUOM getPriceBasisQuantityUOM() {
        return priceBasisQuantityUOM;
    }


    /**
     * Sets the priceBasisQuantityUOM value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param priceBasisQuantityUOM
     */
    public void setPriceBasisQuantityUOM(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPriceBasisQuantityUOM priceBasisQuantityUOM) {
        this.priceBasisQuantityUOM = priceBasisQuantityUOM;
    }


    /**
     * Gets the shortName value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return shortName   * The ShortName of each line item in the purchase order.
     */
    public java.lang.String getShortName() {
        return shortName;
    }


    /**
     * Sets the shortName value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param shortName   * The ShortName of each line item in the purchase order.
     */
    public void setShortName(java.lang.String shortName) {
        this.shortName = shortName;
    }


    /**
     * Gets the supplierPartAuxiliaryID value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return supplierPartAuxiliaryID   * The SupplierPartAuxiliaryID for each line item in the purchase
     * order.
     */
    public java.lang.String getSupplierPartAuxiliaryID() {
        return supplierPartAuxiliaryID;
    }


    /**
     * Sets the supplierPartAuxiliaryID value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param supplierPartAuxiliaryID   * The SupplierPartAuxiliaryID for each line item in the purchase
     * order.
     */
    public void setSupplierPartAuxiliaryID(java.lang.String supplierPartAuxiliaryID) {
        this.supplierPartAuxiliaryID = supplierPartAuxiliaryID;
    }


    /**
     * Gets the supplierPartNumber value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return supplierPartNumber   * The SupplierPartNumber for each line item in the purchase order.
     */
    public java.lang.String getSupplierPartNumber() {
        return supplierPartNumber;
    }


    /**
     * Sets the supplierPartNumber value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param supplierPartNumber   * The SupplierPartNumber for each line item in the purchase order.
     */
    public void setSupplierPartNumber(java.lang.String supplierPartNumber) {
        this.supplierPartNumber = supplierPartNumber;
    }


    /**
     * Gets the unitOfMeasure value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @return unitOfMeasure
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }


    /**
     * Sets the unitOfMeasure value for this ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.
     * 
     * @param unitOfMeasure
     */
    public void setUnitOfMeasure(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionUnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdLineDetailsLineItemsItemDescription)) return false;
        ERPOrder_PurchOrdLineDetailsLineItemsItemDescription other = (ERPOrder_PurchOrdLineDetailsLineItemsItemDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commonCommodityCode==null && other.getCommonCommodityCode()==null) || 
             (this.commonCommodityCode!=null &&
              this.commonCommodityCode.equals(other.getCommonCommodityCode()))) &&
            ((this.conversionFactor==null && other.getConversionFactor()==null) || 
             (this.conversionFactor!=null &&
              this.conversionFactor.equals(other.getConversionFactor()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.priceBasisQuantity==null && other.getPriceBasisQuantity()==null) || 
             (this.priceBasisQuantity!=null &&
              this.priceBasisQuantity.equals(other.getPriceBasisQuantity()))) &&
            ((this.priceBasisQuantityDesc==null && other.getPriceBasisQuantityDesc()==null) || 
             (this.priceBasisQuantityDesc!=null &&
              this.priceBasisQuantityDesc.equals(other.getPriceBasisQuantityDesc()))) &&
            ((this.priceBasisQuantityUOM==null && other.getPriceBasisQuantityUOM()==null) || 
             (this.priceBasisQuantityUOM!=null &&
              this.priceBasisQuantityUOM.equals(other.getPriceBasisQuantityUOM()))) &&
            ((this.shortName==null && other.getShortName()==null) || 
             (this.shortName!=null &&
              this.shortName.equals(other.getShortName()))) &&
            ((this.supplierPartAuxiliaryID==null && other.getSupplierPartAuxiliaryID()==null) || 
             (this.supplierPartAuxiliaryID!=null &&
              this.supplierPartAuxiliaryID.equals(other.getSupplierPartAuxiliaryID()))) &&
            ((this.supplierPartNumber==null && other.getSupplierPartNumber()==null) || 
             (this.supplierPartNumber!=null &&
              this.supplierPartNumber.equals(other.getSupplierPartNumber()))) &&
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
        if (getCommonCommodityCode() != null) {
            _hashCode += getCommonCommodityCode().hashCode();
        }
        if (getConversionFactor() != null) {
            _hashCode += getConversionFactor().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPriceBasisQuantity() != null) {
            _hashCode += getPriceBasisQuantity().hashCode();
        }
        if (getPriceBasisQuantityDesc() != null) {
            _hashCode += getPriceBasisQuantityDesc().hashCode();
        }
        if (getPriceBasisQuantityUOM() != null) {
            _hashCode += getPriceBasisQuantityUOM().hashCode();
        }
        if (getShortName() != null) {
            _hashCode += getShortName().hashCode();
        }
        if (getSupplierPartAuxiliaryID() != null) {
            _hashCode += getSupplierPartAuxiliaryID().hashCode();
        }
        if (getSupplierPartNumber() != null) {
            _hashCode += getSupplierPartNumber().hashCode();
        }
        if (getUnitOfMeasure() != null) {
            _hashCode += getUnitOfMeasure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonCommodityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "CommonCommodityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description>CommonCommodityCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ConversionFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description>Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceBasisQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PriceBasisQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceBasisQuantityDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PriceBasisQuantityDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceBasisQuantityUOM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PriceBasisQuantityUOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description>PriceBasisQuantityUOM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ShortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierPartAuxiliaryID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "SupplierPartAuxiliaryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierPartNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "SupplierPartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "UnitOfMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description>UnitOfMeasure"));
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
