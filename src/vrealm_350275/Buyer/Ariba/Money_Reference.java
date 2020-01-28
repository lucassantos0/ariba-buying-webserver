/**
 * Money_Reference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Name null, type ariba.basic.core.Money, variant vrealm_350275.
 */
public class Money_Reference  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.math.BigDecimal amountInReportingCurrency;

    private java.math.BigDecimal approxAmountInBaseCurrency;

    private java.util.Calendar conversionDate;

    private vrealm_350275.Buyer.Ariba.Money_ReferenceCurrency currency;

    public Money_Reference() {
    }

    public Money_Reference(
           java.math.BigDecimal amount,
           java.math.BigDecimal amountInReportingCurrency,
           java.math.BigDecimal approxAmountInBaseCurrency,
           java.util.Calendar conversionDate,
           vrealm_350275.Buyer.Ariba.Money_ReferenceCurrency currency) {
           this.amount = amount;
           this.amountInReportingCurrency = amountInReportingCurrency;
           this.approxAmountInBaseCurrency = approxAmountInBaseCurrency;
           this.conversionDate = conversionDate;
           this.currency = currency;
    }


    /**
     * Gets the amount value for this Money_Reference.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Money_Reference.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountInReportingCurrency value for this Money_Reference.
     * 
     * @return amountInReportingCurrency
     */
    public java.math.BigDecimal getAmountInReportingCurrency() {
        return amountInReportingCurrency;
    }


    /**
     * Sets the amountInReportingCurrency value for this Money_Reference.
     * 
     * @param amountInReportingCurrency
     */
    public void setAmountInReportingCurrency(java.math.BigDecimal amountInReportingCurrency) {
        this.amountInReportingCurrency = amountInReportingCurrency;
    }


    /**
     * Gets the approxAmountInBaseCurrency value for this Money_Reference.
     * 
     * @return approxAmountInBaseCurrency
     */
    public java.math.BigDecimal getApproxAmountInBaseCurrency() {
        return approxAmountInBaseCurrency;
    }


    /**
     * Sets the approxAmountInBaseCurrency value for this Money_Reference.
     * 
     * @param approxAmountInBaseCurrency
     */
    public void setApproxAmountInBaseCurrency(java.math.BigDecimal approxAmountInBaseCurrency) {
        this.approxAmountInBaseCurrency = approxAmountInBaseCurrency;
    }


    /**
     * Gets the conversionDate value for this Money_Reference.
     * 
     * @return conversionDate
     */
    public java.util.Calendar getConversionDate() {
        return conversionDate;
    }


    /**
     * Sets the conversionDate value for this Money_Reference.
     * 
     * @param conversionDate
     */
    public void setConversionDate(java.util.Calendar conversionDate) {
        this.conversionDate = conversionDate;
    }


    /**
     * Gets the currency value for this Money_Reference.
     * 
     * @return currency
     */
    public vrealm_350275.Buyer.Ariba.Money_ReferenceCurrency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Money_Reference.
     * 
     * @param currency
     */
    public void setCurrency(vrealm_350275.Buyer.Ariba.Money_ReferenceCurrency currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Money_Reference)) return false;
        Money_Reference other = (Money_Reference) obj;
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
            ((this.amountInReportingCurrency==null && other.getAmountInReportingCurrency()==null) || 
             (this.amountInReportingCurrency!=null &&
              this.amountInReportingCurrency.equals(other.getAmountInReportingCurrency()))) &&
            ((this.approxAmountInBaseCurrency==null && other.getApproxAmountInBaseCurrency()==null) || 
             (this.approxAmountInBaseCurrency!=null &&
              this.approxAmountInBaseCurrency.equals(other.getApproxAmountInBaseCurrency()))) &&
            ((this.conversionDate==null && other.getConversionDate()==null) || 
             (this.conversionDate!=null &&
              this.conversionDate.equals(other.getConversionDate()))) &&
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
        if (getAmountInReportingCurrency() != null) {
            _hashCode += getAmountInReportingCurrency().hashCode();
        }
        if (getApproxAmountInBaseCurrency() != null) {
            _hashCode += getApproxAmountInBaseCurrency().hashCode();
        }
        if (getConversionDate() != null) {
            _hashCode += getConversionDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Money_Reference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Money_Reference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountInReportingCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "AmountInReportingCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approxAmountInBaseCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ApproxAmountInBaseCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ConversionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">Money_Reference>Currency"));
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
