/**
 * ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.basic.core.Money, group name Reference, variant
 * vrealm_350275.
 */
public class ERPOrder_PurchOrdLineDetailsLineItemsItemAmount  implements java.io.Serializable {
    /* The amount for each line item in the purchase order. */
    private java.math.BigDecimal amount;

    /* The amount in base currency for each line item in the purchase
     * order. */
    private java.math.BigDecimal approxAmountInBaseCurrency;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmountCurrency currency;

    public ERPOrder_PurchOrdLineDetailsLineItemsItemAmount() {
    }

    public ERPOrder_PurchOrdLineDetailsLineItemsItemAmount(
           java.math.BigDecimal amount,
           java.math.BigDecimal approxAmountInBaseCurrency,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmountCurrency currency) {
           this.amount = amount;
           this.approxAmountInBaseCurrency = approxAmountInBaseCurrency;
           this.currency = currency;
    }


    /**
     * Gets the amount value for this ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.
     * 
     * @return amount   * The amount for each line item in the purchase order.
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.
     * 
     * @param amount   * The amount for each line item in the purchase order.
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the approxAmountInBaseCurrency value for this ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.
     * 
     * @return approxAmountInBaseCurrency   * The amount in base currency for each line item in the purchase
     * order.
     */
    public java.math.BigDecimal getApproxAmountInBaseCurrency() {
        return approxAmountInBaseCurrency;
    }


    /**
     * Sets the approxAmountInBaseCurrency value for this ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.
     * 
     * @param approxAmountInBaseCurrency   * The amount in base currency for each line item in the purchase
     * order.
     */
    public void setApproxAmountInBaseCurrency(java.math.BigDecimal approxAmountInBaseCurrency) {
        this.approxAmountInBaseCurrency = approxAmountInBaseCurrency;
    }


    /**
     * Gets the currency value for this ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.
     * 
     * @return currency
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmountCurrency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.
     * 
     * @param currency
     */
    public void setCurrency(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmountCurrency currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdLineDetailsLineItemsItemAmount)) return false;
        ERPOrder_PurchOrdLineDetailsLineItemsItemAmount other = (ERPOrder_PurchOrdLineDetailsLineItemsItemAmount) obj;
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
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Amount"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Amount>Currency"));
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
