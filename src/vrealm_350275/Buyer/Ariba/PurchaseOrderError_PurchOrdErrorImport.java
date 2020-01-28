/**
 * PurchaseOrderError_PurchOrdErrorImport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Name null, type ariba.integration.core.PurchaseOrderError, variant
 * vrealm_350275.
 */
public class PurchaseOrderError_PurchOrdErrorImport  implements java.io.Serializable {
    /* The timestamp of the error. */
    private java.util.Calendar date;

    /* The error code associated with the error when the purchase
     * order was exported to ERP. */
    private java.lang.String errorCode;

    /* The field that resulted in error when the purchase order was
     * exported to ERP. */
    private java.lang.String errorColumn;

    /* The line number of a split line item that resulted in error
     * when the purchase order was exported to ERP. */
    private java.lang.String errorDistributionNumber;

    /* The line number that resulted in error when the purchase order
     * was exported to ERP. */
    private java.lang.String errorLineNumber;

    /* The field that is used to store the error message, if any,
     * when purchase order is exported to ERP. Use this when the error message
     * is more than 40 characters long. Use ErrorValue otherwise. */
    private java.lang.String errorMessage;

    /* The name of the error table in the ERP system. */
    private java.lang.String errorTable;

    /* The description of the error. */
    private java.lang.String errorValue;

    /* The unique ID of the purchase order. */
    private java.lang.String id;

    public PurchaseOrderError_PurchOrdErrorImport() {
    }

    public PurchaseOrderError_PurchOrdErrorImport(
           java.util.Calendar date,
           java.lang.String errorCode,
           java.lang.String errorColumn,
           java.lang.String errorDistributionNumber,
           java.lang.String errorLineNumber,
           java.lang.String errorMessage,
           java.lang.String errorTable,
           java.lang.String errorValue,
           java.lang.String id) {
           this.date = date;
           this.errorCode = errorCode;
           this.errorColumn = errorColumn;
           this.errorDistributionNumber = errorDistributionNumber;
           this.errorLineNumber = errorLineNumber;
           this.errorMessage = errorMessage;
           this.errorTable = errorTable;
           this.errorValue = errorValue;
           this.id = id;
    }


    /**
     * Gets the date value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return date   * The timestamp of the error.
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param date   * The timestamp of the error.
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the errorCode value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return errorCode   * The error code associated with the error when the purchase
     * order was exported to ERP.
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param errorCode   * The error code associated with the error when the purchase
     * order was exported to ERP.
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorColumn value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return errorColumn   * The field that resulted in error when the purchase order was
     * exported to ERP.
     */
    public java.lang.String getErrorColumn() {
        return errorColumn;
    }


    /**
     * Sets the errorColumn value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param errorColumn   * The field that resulted in error when the purchase order was
     * exported to ERP.
     */
    public void setErrorColumn(java.lang.String errorColumn) {
        this.errorColumn = errorColumn;
    }


    /**
     * Gets the errorDistributionNumber value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return errorDistributionNumber   * The line number of a split line item that resulted in error
     * when the purchase order was exported to ERP.
     */
    public java.lang.String getErrorDistributionNumber() {
        return errorDistributionNumber;
    }


    /**
     * Sets the errorDistributionNumber value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param errorDistributionNumber   * The line number of a split line item that resulted in error
     * when the purchase order was exported to ERP.
     */
    public void setErrorDistributionNumber(java.lang.String errorDistributionNumber) {
        this.errorDistributionNumber = errorDistributionNumber;
    }


    /**
     * Gets the errorLineNumber value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return errorLineNumber   * The line number that resulted in error when the purchase order
     * was exported to ERP.
     */
    public java.lang.String getErrorLineNumber() {
        return errorLineNumber;
    }


    /**
     * Sets the errorLineNumber value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param errorLineNumber   * The line number that resulted in error when the purchase order
     * was exported to ERP.
     */
    public void setErrorLineNumber(java.lang.String errorLineNumber) {
        this.errorLineNumber = errorLineNumber;
    }


    /**
     * Gets the errorMessage value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return errorMessage   * The field that is used to store the error message, if any,
     * when purchase order is exported to ERP. Use this when the error message
     * is more than 40 characters long. Use ErrorValue otherwise.
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param errorMessage   * The field that is used to store the error message, if any,
     * when purchase order is exported to ERP. Use this when the error message
     * is more than 40 characters long. Use ErrorValue otherwise.
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the errorTable value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return errorTable   * The name of the error table in the ERP system.
     */
    public java.lang.String getErrorTable() {
        return errorTable;
    }


    /**
     * Sets the errorTable value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param errorTable   * The name of the error table in the ERP system.
     */
    public void setErrorTable(java.lang.String errorTable) {
        this.errorTable = errorTable;
    }


    /**
     * Gets the errorValue value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return errorValue   * The description of the error.
     */
    public java.lang.String getErrorValue() {
        return errorValue;
    }


    /**
     * Sets the errorValue value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param errorValue   * The description of the error.
     */
    public void setErrorValue(java.lang.String errorValue) {
        this.errorValue = errorValue;
    }


    /**
     * Gets the id value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @return id   * The unique ID of the purchase order.
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PurchaseOrderError_PurchOrdErrorImport.
     * 
     * @param id   * The unique ID of the purchase order.
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderError_PurchOrdErrorImport)) return false;
        PurchaseOrderError_PurchOrdErrorImport other = (PurchaseOrderError_PurchOrdErrorImport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorColumn==null && other.getErrorColumn()==null) || 
             (this.errorColumn!=null &&
              this.errorColumn.equals(other.getErrorColumn()))) &&
            ((this.errorDistributionNumber==null && other.getErrorDistributionNumber()==null) || 
             (this.errorDistributionNumber!=null &&
              this.errorDistributionNumber.equals(other.getErrorDistributionNumber()))) &&
            ((this.errorLineNumber==null && other.getErrorLineNumber()==null) || 
             (this.errorLineNumber!=null &&
              this.errorLineNumber.equals(other.getErrorLineNumber()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.errorTable==null && other.getErrorTable()==null) || 
             (this.errorTable!=null &&
              this.errorTable.equals(other.getErrorTable()))) &&
            ((this.errorValue==null && other.getErrorValue()==null) || 
             (this.errorValue!=null &&
              this.errorValue.equals(other.getErrorValue()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorColumn() != null) {
            _hashCode += getErrorColumn().hashCode();
        }
        if (getErrorDistributionNumber() != null) {
            _hashCode += getErrorDistributionNumber().hashCode();
        }
        if (getErrorLineNumber() != null) {
            _hashCode += getErrorLineNumber().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getErrorTable() != null) {
            _hashCode += getErrorTable().hashCode();
        }
        if (getErrorValue() != null) {
            _hashCode += getErrorValue().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderError_PurchOrdErrorImport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderError_PurchOrdErrorImport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ErrorColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDistributionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ErrorDistributionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ErrorLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorTable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ErrorTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ErrorValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
