/**
 * ERPOrder_PurchOrdHeaderDetailsRequester.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Class name ariba.user.core.User, group name PurchOrdHeaderDetails,
 * variant vrealm_350275.
 */
public class ERPOrder_PurchOrdHeaderDetailsRequester  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequesterDefaultCurrency defaultCurrency;

    public ERPOrder_PurchOrdHeaderDetailsRequester() {
    }

    public ERPOrder_PurchOrdHeaderDetailsRequester(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequesterDefaultCurrency defaultCurrency) {
           this.defaultCurrency = defaultCurrency;
    }


    /**
     * Gets the defaultCurrency value for this ERPOrder_PurchOrdHeaderDetailsRequester.
     * 
     * @return defaultCurrency
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequesterDefaultCurrency getDefaultCurrency() {
        return defaultCurrency;
    }


    /**
     * Sets the defaultCurrency value for this ERPOrder_PurchOrdHeaderDetailsRequester.
     * 
     * @param defaultCurrency
     */
    public void setDefaultCurrency(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequesterDefaultCurrency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdHeaderDetailsRequester)) return false;
        ERPOrder_PurchOrdHeaderDetailsRequester other = (ERPOrder_PurchOrdHeaderDetailsRequester) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultCurrency==null && other.getDefaultCurrency()==null) || 
             (this.defaultCurrency!=null &&
              this.defaultCurrency.equals(other.getDefaultCurrency())));
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
        if (getDefaultCurrency() != null) {
            _hashCode += getDefaultCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdHeaderDetailsRequester.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>Requester"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "DefaultCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>Requester>DefaultCurrency"));
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
