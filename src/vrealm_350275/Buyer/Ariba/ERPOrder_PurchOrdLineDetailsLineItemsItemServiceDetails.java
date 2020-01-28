/**
 * ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.procure.core.ServiceDetails, group name Reference,
 * variant vrealm_350275.
 */
public class ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmount expectedAmount;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsMaxAmount maxAmount;

    /* Indication whether a service entry sheet is required or not. */
    private java.lang.Boolean nonSESBasedInvoice;

    /* Indication whether a service entry sheet is required or not. */
    private java.lang.Boolean requiresServiceEntry;

    /* The Service End date for the parent line item in Service PO. */
    private java.util.Calendar serviceEndDate;

    /* The Service Start date for the parent line item in Service
     * PO. */
    private java.util.Calendar serviceStartDate;

    public ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails() {
    }

    public ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmount expectedAmount,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsMaxAmount maxAmount,
           java.lang.Boolean nonSESBasedInvoice,
           java.lang.Boolean requiresServiceEntry,
           java.util.Calendar serviceEndDate,
           java.util.Calendar serviceStartDate) {
           this.expectedAmount = expectedAmount;
           this.maxAmount = maxAmount;
           this.nonSESBasedInvoice = nonSESBasedInvoice;
           this.requiresServiceEntry = requiresServiceEntry;
           this.serviceEndDate = serviceEndDate;
           this.serviceStartDate = serviceStartDate;
    }


    /**
     * Gets the expectedAmount value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @return expectedAmount
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmount getExpectedAmount() {
        return expectedAmount;
    }


    /**
     * Sets the expectedAmount value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @param expectedAmount
     */
    public void setExpectedAmount(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmount expectedAmount) {
        this.expectedAmount = expectedAmount;
    }


    /**
     * Gets the maxAmount value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @return maxAmount
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsMaxAmount getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsMaxAmount maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the nonSESBasedInvoice value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @return nonSESBasedInvoice   * Indication whether a service entry sheet is required or not.
     */
    public java.lang.Boolean getNonSESBasedInvoice() {
        return nonSESBasedInvoice;
    }


    /**
     * Sets the nonSESBasedInvoice value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @param nonSESBasedInvoice   * Indication whether a service entry sheet is required or not.
     */
    public void setNonSESBasedInvoice(java.lang.Boolean nonSESBasedInvoice) {
        this.nonSESBasedInvoice = nonSESBasedInvoice;
    }


    /**
     * Gets the requiresServiceEntry value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @return requiresServiceEntry   * Indication whether a service entry sheet is required or not.
     */
    public java.lang.Boolean getRequiresServiceEntry() {
        return requiresServiceEntry;
    }


    /**
     * Sets the requiresServiceEntry value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @param requiresServiceEntry   * Indication whether a service entry sheet is required or not.
     */
    public void setRequiresServiceEntry(java.lang.Boolean requiresServiceEntry) {
        this.requiresServiceEntry = requiresServiceEntry;
    }


    /**
     * Gets the serviceEndDate value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @return serviceEndDate   * The Service End date for the parent line item in Service PO.
     */
    public java.util.Calendar getServiceEndDate() {
        return serviceEndDate;
    }


    /**
     * Sets the serviceEndDate value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @param serviceEndDate   * The Service End date for the parent line item in Service PO.
     */
    public void setServiceEndDate(java.util.Calendar serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }


    /**
     * Gets the serviceStartDate value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @return serviceStartDate   * The Service Start date for the parent line item in Service
     * PO.
     */
    public java.util.Calendar getServiceStartDate() {
        return serviceStartDate;
    }


    /**
     * Sets the serviceStartDate value for this ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.
     * 
     * @param serviceStartDate   * The Service Start date for the parent line item in Service
     * PO.
     */
    public void setServiceStartDate(java.util.Calendar serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails)) return false;
        ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails other = (ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expectedAmount==null && other.getExpectedAmount()==null) || 
             (this.expectedAmount!=null &&
              this.expectedAmount.equals(other.getExpectedAmount()))) &&
            ((this.maxAmount==null && other.getMaxAmount()==null) || 
             (this.maxAmount!=null &&
              this.maxAmount.equals(other.getMaxAmount()))) &&
            ((this.nonSESBasedInvoice==null && other.getNonSESBasedInvoice()==null) || 
             (this.nonSESBasedInvoice!=null &&
              this.nonSESBasedInvoice.equals(other.getNonSESBasedInvoice()))) &&
            ((this.requiresServiceEntry==null && other.getRequiresServiceEntry()==null) || 
             (this.requiresServiceEntry!=null &&
              this.requiresServiceEntry.equals(other.getRequiresServiceEntry()))) &&
            ((this.serviceEndDate==null && other.getServiceEndDate()==null) || 
             (this.serviceEndDate!=null &&
              this.serviceEndDate.equals(other.getServiceEndDate()))) &&
            ((this.serviceStartDate==null && other.getServiceStartDate()==null) || 
             (this.serviceStartDate!=null &&
              this.serviceStartDate.equals(other.getServiceStartDate())));
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
        if (getExpectedAmount() != null) {
            _hashCode += getExpectedAmount().hashCode();
        }
        if (getMaxAmount() != null) {
            _hashCode += getMaxAmount().hashCode();
        }
        if (getNonSESBasedInvoice() != null) {
            _hashCode += getNonSESBasedInvoice().hashCode();
        }
        if (getRequiresServiceEntry() != null) {
            _hashCode += getRequiresServiceEntry().hashCode();
        }
        if (getServiceEndDate() != null) {
            _hashCode += getServiceEndDate().hashCode();
        }
        if (getServiceStartDate() != null) {
            _hashCode += getServiceStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ExpectedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails>ExpectedAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "MaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails>MaxAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonSESBasedInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "NonSESBasedInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiresServiceEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "RequiresServiceEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ServiceEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ServiceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
