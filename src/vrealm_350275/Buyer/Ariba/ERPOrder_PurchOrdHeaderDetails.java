/**
 * ERPOrder_PurchOrdHeaderDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;


/**
 * Name null, type ariba.purchasing.core.ERPOrder, variant vrealm_350275.
 */
public class ERPOrder_PurchOrdHeaderDetails  implements java.io.Serializable {
    /* Indicates Amendment Requisition ID  associated with this PurchaseOrder. */
    private java.lang.String amendmentReqID;

    /* Indicates the date on which the order is created. */
    private java.util.Calendar createDate;

    /* The date until which the order is on hold. */
    private java.util.Calendar holdTillDate;

    /* Indicates whether this PurchaseOrder is a                 
     * Service Order. */
    private java.lang.Boolean isServiceOrder;

    /* Specifies the title of the ERP order. */
    private java.lang.String name;

    /* Defines the ordering method category for each purchase    
     * order. */
    private java.lang.String orderMethodCategory;

    /* The originating system for the original                   
     * requisition. This field is only populated by                     
     * the Requisition Import feature. */
    private java.lang.String originatingSystem;

    /* The originating system reference ID of the                
     * original requisition. This field is only populated               
     * by the Requisition Import feature. */
    private java.lang.String originatingSystemReferenceID;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsPaymentTerms paymentTerms;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsProcurementUnit procurementUnit;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequester requester;

    /* Indicates whether the supplier is a subcontractor. */
    private java.math.BigInteger subContractor;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplier supplier;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplierLocation supplierLocation;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCost totalCost;

    /* Defines the unique purchase order ID. */
    private java.lang.String uniqueName;

    /* The version number of the purchase order. */
    private java.math.BigInteger versionNumber;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustom custom;

    public ERPOrder_PurchOrdHeaderDetails() {
    }

    public ERPOrder_PurchOrdHeaderDetails(
           java.lang.String amendmentReqID,
           java.util.Calendar createDate,
           java.util.Calendar holdTillDate,
           java.lang.Boolean isServiceOrder,
           java.lang.String name,
           java.lang.String orderMethodCategory,
           java.lang.String originatingSystem,
           java.lang.String originatingSystemReferenceID,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsPaymentTerms paymentTerms,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsProcurementUnit procurementUnit,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequester requester,
           java.math.BigInteger subContractor,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplier supplier,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplierLocation supplierLocation,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCost totalCost,
           java.lang.String uniqueName,
           java.math.BigInteger versionNumber,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustom custom) {
           this.amendmentReqID = amendmentReqID;
           this.createDate = createDate;
           this.holdTillDate = holdTillDate;
           this.isServiceOrder = isServiceOrder;
           this.name = name;
           this.orderMethodCategory = orderMethodCategory;
           this.originatingSystem = originatingSystem;
           this.originatingSystemReferenceID = originatingSystemReferenceID;
           this.paymentTerms = paymentTerms;
           this.procurementUnit = procurementUnit;
           this.requester = requester;
           this.subContractor = subContractor;
           this.supplier = supplier;
           this.supplierLocation = supplierLocation;
           this.totalCost = totalCost;
           this.uniqueName = uniqueName;
           this.versionNumber = versionNumber;
           this.custom = custom;
    }


    /**
     * Gets the amendmentReqID value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return amendmentReqID   * Indicates Amendment Requisition ID  associated with this PurchaseOrder.
     */
    public java.lang.String getAmendmentReqID() {
        return amendmentReqID;
    }


    /**
     * Sets the amendmentReqID value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param amendmentReqID   * Indicates Amendment Requisition ID  associated with this PurchaseOrder.
     */
    public void setAmendmentReqID(java.lang.String amendmentReqID) {
        this.amendmentReqID = amendmentReqID;
    }


    /**
     * Gets the createDate value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return createDate   * Indicates the date on which the order is created.
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param createDate   * Indicates the date on which the order is created.
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the holdTillDate value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return holdTillDate   * The date until which the order is on hold.
     */
    public java.util.Calendar getHoldTillDate() {
        return holdTillDate;
    }


    /**
     * Sets the holdTillDate value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param holdTillDate   * The date until which the order is on hold.
     */
    public void setHoldTillDate(java.util.Calendar holdTillDate) {
        this.holdTillDate = holdTillDate;
    }


    /**
     * Gets the isServiceOrder value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return isServiceOrder   * Indicates whether this PurchaseOrder is a                 
     * Service Order.
     */
    public java.lang.Boolean getIsServiceOrder() {
        return isServiceOrder;
    }


    /**
     * Sets the isServiceOrder value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param isServiceOrder   * Indicates whether this PurchaseOrder is a                 
     * Service Order.
     */
    public void setIsServiceOrder(java.lang.Boolean isServiceOrder) {
        this.isServiceOrder = isServiceOrder;
    }


    /**
     * Gets the name value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return name   * Specifies the title of the ERP order.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param name   * Specifies the title of the ERP order.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the orderMethodCategory value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return orderMethodCategory   * Defines the ordering method category for each purchase    
     * order.
     */
    public java.lang.String getOrderMethodCategory() {
        return orderMethodCategory;
    }


    /**
     * Sets the orderMethodCategory value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param orderMethodCategory   * Defines the ordering method category for each purchase    
     * order.
     */
    public void setOrderMethodCategory(java.lang.String orderMethodCategory) {
        this.orderMethodCategory = orderMethodCategory;
    }


    /**
     * Gets the originatingSystem value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return originatingSystem   * The originating system for the original                   
     * requisition. This field is only populated by                     
     * the Requisition Import feature.
     */
    public java.lang.String getOriginatingSystem() {
        return originatingSystem;
    }


    /**
     * Sets the originatingSystem value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param originatingSystem   * The originating system for the original                   
     * requisition. This field is only populated by                     
     * the Requisition Import feature.
     */
    public void setOriginatingSystem(java.lang.String originatingSystem) {
        this.originatingSystem = originatingSystem;
    }


    /**
     * Gets the originatingSystemReferenceID value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return originatingSystemReferenceID   * The originating system reference ID of the                
     * original requisition. This field is only populated               
     * by the Requisition Import feature.
     */
    public java.lang.String getOriginatingSystemReferenceID() {
        return originatingSystemReferenceID;
    }


    /**
     * Sets the originatingSystemReferenceID value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param originatingSystemReferenceID   * The originating system reference ID of the                
     * original requisition. This field is only populated               
     * by the Requisition Import feature.
     */
    public void setOriginatingSystemReferenceID(java.lang.String originatingSystemReferenceID) {
        this.originatingSystemReferenceID = originatingSystemReferenceID;
    }


    /**
     * Gets the paymentTerms value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return paymentTerms
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsPaymentTerms getPaymentTerms() {
        return paymentTerms;
    }


    /**
     * Sets the paymentTerms value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param paymentTerms
     */
    public void setPaymentTerms(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsPaymentTerms paymentTerms) {
        this.paymentTerms = paymentTerms;
    }


    /**
     * Gets the procurementUnit value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return procurementUnit
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsProcurementUnit getProcurementUnit() {
        return procurementUnit;
    }


    /**
     * Sets the procurementUnit value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param procurementUnit
     */
    public void setProcurementUnit(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsProcurementUnit procurementUnit) {
        this.procurementUnit = procurementUnit;
    }


    /**
     * Gets the requester value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return requester
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequester getRequester() {
        return requester;
    }


    /**
     * Sets the requester value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param requester
     */
    public void setRequester(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequester requester) {
        this.requester = requester;
    }


    /**
     * Gets the subContractor value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return subContractor   * Indicates whether the supplier is a subcontractor.
     */
    public java.math.BigInteger getSubContractor() {
        return subContractor;
    }


    /**
     * Sets the subContractor value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param subContractor   * Indicates whether the supplier is a subcontractor.
     */
    public void setSubContractor(java.math.BigInteger subContractor) {
        this.subContractor = subContractor;
    }


    /**
     * Gets the supplier value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return supplier
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplier getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param supplier
     */
    public void setSupplier(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplier supplier) {
        this.supplier = supplier;
    }


    /**
     * Gets the supplierLocation value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return supplierLocation
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplierLocation getSupplierLocation() {
        return supplierLocation;
    }


    /**
     * Sets the supplierLocation value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param supplierLocation
     */
    public void setSupplierLocation(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplierLocation supplierLocation) {
        this.supplierLocation = supplierLocation;
    }


    /**
     * Gets the totalCost value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return totalCost
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCost getTotalCost() {
        return totalCost;
    }


    /**
     * Sets the totalCost value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param totalCost
     */
    public void setTotalCost(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCost totalCost) {
        this.totalCost = totalCost;
    }


    /**
     * Gets the uniqueName value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return uniqueName   * Defines the unique purchase order ID.
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param uniqueName   * Defines the unique purchase order ID.
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the versionNumber value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return versionNumber   * The version number of the purchase order.
     */
    public java.math.BigInteger getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param versionNumber   * The version number of the purchase order.
     */
    public void setVersionNumber(java.math.BigInteger versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the custom value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @return custom
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustom getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this ERPOrder_PurchOrdHeaderDetails.
     * 
     * @param custom
     */
    public void setCustom(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustom custom) {
        this.custom = custom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdHeaderDetails)) return false;
        ERPOrder_PurchOrdHeaderDetails other = (ERPOrder_PurchOrdHeaderDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amendmentReqID==null && other.getAmendmentReqID()==null) || 
             (this.amendmentReqID!=null &&
              this.amendmentReqID.equals(other.getAmendmentReqID()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.holdTillDate==null && other.getHoldTillDate()==null) || 
             (this.holdTillDate!=null &&
              this.holdTillDate.equals(other.getHoldTillDate()))) &&
            ((this.isServiceOrder==null && other.getIsServiceOrder()==null) || 
             (this.isServiceOrder!=null &&
              this.isServiceOrder.equals(other.getIsServiceOrder()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.orderMethodCategory==null && other.getOrderMethodCategory()==null) || 
             (this.orderMethodCategory!=null &&
              this.orderMethodCategory.equals(other.getOrderMethodCategory()))) &&
            ((this.originatingSystem==null && other.getOriginatingSystem()==null) || 
             (this.originatingSystem!=null &&
              this.originatingSystem.equals(other.getOriginatingSystem()))) &&
            ((this.originatingSystemReferenceID==null && other.getOriginatingSystemReferenceID()==null) || 
             (this.originatingSystemReferenceID!=null &&
              this.originatingSystemReferenceID.equals(other.getOriginatingSystemReferenceID()))) &&
            ((this.paymentTerms==null && other.getPaymentTerms()==null) || 
             (this.paymentTerms!=null &&
              this.paymentTerms.equals(other.getPaymentTerms()))) &&
            ((this.procurementUnit==null && other.getProcurementUnit()==null) || 
             (this.procurementUnit!=null &&
              this.procurementUnit.equals(other.getProcurementUnit()))) &&
            ((this.requester==null && other.getRequester()==null) || 
             (this.requester!=null &&
              this.requester.equals(other.getRequester()))) &&
            ((this.subContractor==null && other.getSubContractor()==null) || 
             (this.subContractor!=null &&
              this.subContractor.equals(other.getSubContractor()))) &&
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              this.supplier.equals(other.getSupplier()))) &&
            ((this.supplierLocation==null && other.getSupplierLocation()==null) || 
             (this.supplierLocation!=null &&
              this.supplierLocation.equals(other.getSupplierLocation()))) &&
            ((this.totalCost==null && other.getTotalCost()==null) || 
             (this.totalCost!=null &&
              this.totalCost.equals(other.getTotalCost()))) &&
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber()))) &&
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
        if (getAmendmentReqID() != null) {
            _hashCode += getAmendmentReqID().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getHoldTillDate() != null) {
            _hashCode += getHoldTillDate().hashCode();
        }
        if (getIsServiceOrder() != null) {
            _hashCode += getIsServiceOrder().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOrderMethodCategory() != null) {
            _hashCode += getOrderMethodCategory().hashCode();
        }
        if (getOriginatingSystem() != null) {
            _hashCode += getOriginatingSystem().hashCode();
        }
        if (getOriginatingSystemReferenceID() != null) {
            _hashCode += getOriginatingSystemReferenceID().hashCode();
        }
        if (getPaymentTerms() != null) {
            _hashCode += getPaymentTerms().hashCode();
        }
        if (getProcurementUnit() != null) {
            _hashCode += getProcurementUnit().hashCode();
        }
        if (getRequester() != null) {
            _hashCode += getRequester().hashCode();
        }
        if (getSubContractor() != null) {
            _hashCode += getSubContractor().hashCode();
        }
        if (getSupplier() != null) {
            _hashCode += getSupplier().hashCode();
        }
        if (getSupplierLocation() != null) {
            _hashCode += getSupplierLocation().hashCode();
        }
        if (getTotalCost() != null) {
            _hashCode += getTotalCost().hashCode();
        }
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdHeaderDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdHeaderDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amendmentReqID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "AmendmentReqID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdTillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "HoldTillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isServiceOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "IsServiceOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderMethodCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "OrderMethodCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "OriginatingSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingSystemReferenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "OriginatingSystemReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PaymentTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>PaymentTerms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procurementUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ProcurementUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>ProcurementUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requester");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Requester"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>Requester"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subContractor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "SubContractor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>Supplier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "SupplierLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>SupplierLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "TotalCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>TotalCost"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "UniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "VersionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>custom"));
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
