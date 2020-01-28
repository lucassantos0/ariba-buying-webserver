/**
 * ERPOrder_PurchOrdHeaderDetailsTotalCost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.basic.core.Money, group name PurchOrdHeaderDetails,
 * variant vrealm_350275.
 */
public class ERPOrder_PurchOrdHeaderDetailsTotalCost  implements java.io.Serializable {
    /* Indicates the total amount of the purchase order. */
    private java.math.BigDecimal amount;

    /* The approximate total amount of the purchase order in the base
     * currency. */
    private java.math.BigDecimal approxAmountInBaseCurrency;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCostCurrency currency;

    public ERPOrder_PurchOrdHeaderDetailsTotalCost() {
    }

    public ERPOrder_PurchOrdHeaderDetailsTotalCost(
           java.math.BigDecimal amount,
           java.math.BigDecimal approxAmountInBaseCurrency,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCostCurrency currency) {
           this.amount = amount;
           this.approxAmountInBaseCurrency = approxAmountInBaseCurrency;
           this.currency = currency;
    }


    /**
     * Gets the amount value for this ERPOrder_PurchOrdHeaderDetailsTotalCost.
     * 
     * @return amount   * Indicates the total amount of the purchase order.
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ERPOrder_PurchOrdHeaderDetailsTotalCost.
     * 
     * @param amount   * Indicates the total amount of the purchase order.
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the approxAmountInBaseCurrency value for this ERPOrder_PurchOrdHeaderDetailsTotalCost.
     * 
     * @return approxAmountInBaseCurrency   * The approximate total amount of the purchase order in the base
     * currency.
     */
    public java.math.BigDecimal getApproxAmountInBaseCurrency() {
        return approxAmountInBaseCurrency;
    }


    /**
     * Sets the approxAmountInBaseCurrency value for this ERPOrder_PurchOrdHeaderDetailsTotalCost.
     * 
     * @param approxAmountInBaseCurrency   * The approximate total amount of the purchase order in the base
     * currency.
     */
    public void setApproxAmountInBaseCurrency(java.math.BigDecimal approxAmountInBaseCurrency) {
        this.approxAmountInBaseCurrency = approxAmountInBaseCurrency;
    }


    /**
     * Gets the currency value for this ERPOrder_PurchOrdHeaderDetailsTotalCost.
     * 
     * @return currency
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCostCurrency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ERPOrder_PurchOrdHeaderDetailsTotalCost.
     * 
     * @param currency
     */
    public void setCurrency(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCostCurrency currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdHeaderDetailsTotalCost)) return false;
        ERPOrder_PurchOrdHeaderDetailsTotalCost other = (ERPOrder_PurchOrdHeaderDetailsTotalCost) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.approxAmountInBaseCurrency==null && other.getApproxAmountInBaseCurrency()==null) || 
             (this.approxAmountInBaseCurrency!=null &&
              this.approxAmountInBaseCurrency.equals(other.getApproxAmountInBaseCurrency()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getApproxAmountInBaseCurrency() != null) {
            _hashCode += getApproxAmountInBaseCurrency().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdHeaderDetailsTotalCost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>TotalCost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approxAmountInBaseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ApproxAmountInBaseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>TotalCost>Currency"));
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
