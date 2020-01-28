/**
 * ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.tax.core.TaxDetail, group name Reference, variant
 * vrealm_350275.
 */
public class ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail  implements java.io.Serializable {
    /* Specifies whether the tax is deductible. This field is applicable
     * only for tax lines */
    private java.lang.Boolean isDeductible;

    /* Per unit rate of the tax applied on the quantity of the line
     * item. This field is applicable only for tax lines */
    private java.math.BigDecimal perUnit;

    /* Percentage rate of the tax applied on the Base amount or taxable
     * amount of the line item. This field is applicable only for tax lines */
    private java.math.BigDecimal percent;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetailTaxableAmount taxableAmount;

    public ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail() {
    }

    public ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail(
           java.lang.Boolean isDeductible,
           java.math.BigDecimal perUnit,
           java.math.BigDecimal percent,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetailTaxableAmount taxableAmount) {
           this.isDeductible = isDeductible;
           this.perUnit = perUnit;
           this.percent = percent;
           this.taxableAmount = taxableAmount;
    }


    /**
     * Gets the isDeductible value for this ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.
     * 
     * @return isDeductible   * Specifies whether the tax is deductible. This field is applicable
     * only for tax lines
     */
    public java.lang.Boolean getIsDeductible() {
        return isDeductible;
    }


    /**
     * Sets the isDeductible value for this ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.
     * 
     * @param isDeductible   * Specifies whether the tax is deductible. This field is applicable
     * only for tax lines
     */
    public void setIsDeductible(java.lang.Boolean isDeductible) {
        this.isDeductible = isDeductible;
    }


    /**
     * Gets the perUnit value for this ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.
     * 
     * @return perUnit   * Per unit rate of the tax applied on the quantity of the line
     * item. This field is applicable only for tax lines
     */
    public java.math.BigDecimal getPerUnit() {
        return perUnit;
    }


    /**
     * Sets the perUnit value for this ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.
     * 
     * @param perUnit   * Per unit rate of the tax applied on the quantity of the line
     * item. This field is applicable only for tax lines
     */
    public void setPerUnit(java.math.BigDecimal perUnit) {
        this.perUnit = perUnit;
    }


    /**
     * Gets the percent value for this ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.
     * 
     * @return percent   * Percentage rate of the tax applied on the Base amount or taxable
     * amount of the line item. This field is applicable only for tax lines
     */
    public java.math.BigDecimal getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.
     * 
     * @param percent   * Percentage rate of the tax applied on the Base amount or taxable
     * amount of the line item. This field is applicable only for tax lines
     */
    public void setPercent(java.math.BigDecimal percent) {
        this.percent = percent;
    }


    /**
     * Gets the taxableAmount value for this ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.
     * 
     * @return taxableAmount
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetailTaxableAmount getTaxableAmount() {
        return taxableAmount;
    }


    /**
     * Sets the taxableAmount value for this ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.
     * 
     * @param taxableAmount
     */
    public void setTaxableAmount(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetailTaxableAmount taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail)) return false;
        ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail other = (ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isDeductible==null && other.getIsDeductible()==null) || 
             (this.isDeductible!=null &&
              this.isDeductible.equals(other.getIsDeductible()))) &&
            ((this.perUnit==null && other.getPerUnit()==null) || 
             (this.perUnit!=null &&
              this.perUnit.equals(other.getPerUnit()))) &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent()))) &&
            ((this.taxableAmount==null && other.getTaxableAmount()==null) || 
             (this.taxableAmount!=null &&
              this.taxableAmount.equals(other.getTaxableAmount())));
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
        if (getIsDeductible() != null) {
            _hashCode += getIsDeductible().hashCode();
        }
        if (getPerUnit() != null) {
            _hashCode += getPerUnit().hashCode();
        }
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        if (getTaxableAmount() != null) {
            _hashCode += getTaxableAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>TaxDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeductible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "IsDeductible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "TaxableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>TaxDetail>TaxableAmount"));
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
