/**
 * ERPOrder_PurchOrdLineDetailsLineItemsItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

public class ERPOrder_PurchOrdLineDetailsLineItemsItem  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmount amount;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemBillingAddress billingAddress;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemChargeDetail chargeDetail;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCommodityCode commodityCode;

    /* The name of the person to whom the line item will be delivered. */
    private java.lang.String deliverTo;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescription description;

    /* Defines whether or not evaluated receipt                  
     * settlement for the line item is enabled. When the value          
     * is True, the system automatically generates an invoice           
     * after the receipt is fully approved. */
    private java.lang.Boolean ERSAllowed;

    /* The line number used externally to identify               
     * this line item. This is the line number of the                   
     * requisition line item associated with this                       
     * order line item. */
    private java.math.BigInteger externalLineNumber;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemLineType lineType;

    private java.lang.Boolean maskAmount;

    private java.lang.Boolean maskUnitPrice;

    /* The date by which the item is needed. */
    private java.util.Calendar needBy;

    /* Indicates the line number of the corresponding line item. */
    private java.math.BigInteger numberInCollection;

    /* The line number of the Originating System for the line item. */
    private java.math.BigInteger originatingSystemLineNumber;

    /* The reference ID of the Originating System for the line item. */
    private java.lang.String originatingSystemReferenceID;

    /* Line number of the parent of this line item. */
    private java.math.BigInteger parentLineNumber;

    /* The quantity for each line item in the purchase order. */
    private java.math.BigDecimal quantity;

    /* The unique receiving type value for each line item in the purchase
     * order. The possible values are, System Received, Auto Received, Quantity
     * Based, or Amount Based. */
    private java.math.BigInteger receivingType;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemRequisition requisition;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails serviceDetails;

    /* The details of services line item in string format. This string
     * will contain                           all the category specific line
     * item details in a XML format in a single string. This XML        
     * will contain all the category specific fields in the cXML format in
     * a single column. */
    private java.lang.String serviceLineItemDetails;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemShipTo shipTo;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplier supplier;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplierLocation supplierLocation;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxCode taxCode;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail taxDetail;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustom custom;

    public ERPOrder_PurchOrdLineDetailsLineItemsItem() {
    }

    public ERPOrder_PurchOrdLineDetailsLineItemsItem(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmount amount,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemBillingAddress billingAddress,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemChargeDetail chargeDetail,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCommodityCode commodityCode,
           java.lang.String deliverTo,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescription description,
           java.lang.Boolean ERSAllowed,
           java.math.BigInteger externalLineNumber,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemLineType lineType,
           java.lang.Boolean maskAmount,
           java.lang.Boolean maskUnitPrice,
           java.util.Calendar needBy,
           java.math.BigInteger numberInCollection,
           java.math.BigInteger originatingSystemLineNumber,
           java.lang.String originatingSystemReferenceID,
           java.math.BigInteger parentLineNumber,
           java.math.BigDecimal quantity,
           java.math.BigInteger receivingType,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemRequisition requisition,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails serviceDetails,
           java.lang.String serviceLineItemDetails,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemShipTo shipTo,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplier supplier,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplierLocation supplierLocation,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxCode taxCode,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail taxDetail,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustom custom) {
           this.amount = amount;
           this.billingAddress = billingAddress;
           this.chargeDetail = chargeDetail;
           this.commodityCode = commodityCode;
           this.deliverTo = deliverTo;
           this.description = description;
           this.ERSAllowed = ERSAllowed;
           this.externalLineNumber = externalLineNumber;
           this.lineType = lineType;
           this.maskAmount = maskAmount;
           this.maskUnitPrice = maskUnitPrice;
           this.needBy = needBy;
           this.numberInCollection = numberInCollection;
           this.originatingSystemLineNumber = originatingSystemLineNumber;
           this.originatingSystemReferenceID = originatingSystemReferenceID;
           this.parentLineNumber = parentLineNumber;
           this.quantity = quantity;
           this.receivingType = receivingType;
           this.requisition = requisition;
           this.serviceDetails = serviceDetails;
           this.serviceLineItemDetails = serviceLineItemDetails;
           this.shipTo = shipTo;
           this.supplier = supplier;
           this.supplierLocation = supplierLocation;
           this.taxCode = taxCode;
           this.taxDetail = taxDetail;
           this.custom = custom;
    }


    /**
     * Gets the amount value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return amount
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmount getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param amount
     */
    public void setAmount(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmount amount) {
        this.amount = amount;
    }


    /**
     * Gets the billingAddress value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return billingAddress
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemBillingAddress getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemBillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the chargeDetail value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return chargeDetail
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemChargeDetail getChargeDetail() {
        return chargeDetail;
    }


    /**
     * Sets the chargeDetail value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param chargeDetail
     */
    public void setChargeDetail(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemChargeDetail chargeDetail) {
        this.chargeDetail = chargeDetail;
    }


    /**
     * Gets the commodityCode value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return commodityCode
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCommodityCode getCommodityCode() {
        return commodityCode;
    }


    /**
     * Sets the commodityCode value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param commodityCode
     */
    public void setCommodityCode(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCommodityCode commodityCode) {
        this.commodityCode = commodityCode;
    }


    /**
     * Gets the deliverTo value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return deliverTo   * The name of the person to whom the line item will be delivered.
     */
    public java.lang.String getDeliverTo() {
        return deliverTo;
    }


    /**
     * Sets the deliverTo value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param deliverTo   * The name of the person to whom the line item will be delivered.
     */
    public void setDeliverTo(java.lang.String deliverTo) {
        this.deliverTo = deliverTo;
    }


    /**
     * Gets the description value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return description
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param description
     */
    public void setDescription(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescription description) {
        this.description = description;
    }


    /**
     * Gets the ERSAllowed value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return ERSAllowed   * Defines whether or not evaluated receipt                  
     * settlement for the line item is enabled. When the value          
     * is True, the system automatically generates an invoice           
     * after the receipt is fully approved.
     */
    public java.lang.Boolean getERSAllowed() {
        return ERSAllowed;
    }


    /**
     * Sets the ERSAllowed value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param ERSAllowed   * Defines whether or not evaluated receipt                  
     * settlement for the line item is enabled. When the value          
     * is True, the system automatically generates an invoice           
     * after the receipt is fully approved.
     */
    public void setERSAllowed(java.lang.Boolean ERSAllowed) {
        this.ERSAllowed = ERSAllowed;
    }


    /**
     * Gets the externalLineNumber value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return externalLineNumber   * The line number used externally to identify               
     * this line item. This is the line number of the                   
     * requisition line item associated with this                       
     * order line item.
     */
    public java.math.BigInteger getExternalLineNumber() {
        return externalLineNumber;
    }


    /**
     * Sets the externalLineNumber value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param externalLineNumber   * The line number used externally to identify               
     * this line item. This is the line number of the                   
     * requisition line item associated with this                       
     * order line item.
     */
    public void setExternalLineNumber(java.math.BigInteger externalLineNumber) {
        this.externalLineNumber = externalLineNumber;
    }


    /**
     * Gets the lineType value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return lineType
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemLineType getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param lineType
     */
    public void setLineType(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemLineType lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the maskAmount value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return maskAmount
     */
    public java.lang.Boolean getMaskAmount() {
        return maskAmount;
    }


    /**
     * Sets the maskAmount value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param maskAmount
     */
    public void setMaskAmount(java.lang.Boolean maskAmount) {
        this.maskAmount = maskAmount;
    }


    /**
     * Gets the maskUnitPrice value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return maskUnitPrice
     */
    public java.lang.Boolean getMaskUnitPrice() {
        return maskUnitPrice;
    }


    /**
     * Sets the maskUnitPrice value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param maskUnitPrice
     */
    public void setMaskUnitPrice(java.lang.Boolean maskUnitPrice) {
        this.maskUnitPrice = maskUnitPrice;
    }


    /**
     * Gets the needBy value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return needBy   * The date by which the item is needed.
     */
    public java.util.Calendar getNeedBy() {
        return needBy;
    }


    /**
     * Sets the needBy value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param needBy   * The date by which the item is needed.
     */
    public void setNeedBy(java.util.Calendar needBy) {
        this.needBy = needBy;
    }


    /**
     * Gets the numberInCollection value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return numberInCollection   * Indicates the line number of the corresponding line item.
     */
    public java.math.BigInteger getNumberInCollection() {
        return numberInCollection;
    }


    /**
     * Sets the numberInCollection value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param numberInCollection   * Indicates the line number of the corresponding line item.
     */
    public void setNumberInCollection(java.math.BigInteger numberInCollection) {
        this.numberInCollection = numberInCollection;
    }


    /**
     * Gets the originatingSystemLineNumber value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return originatingSystemLineNumber   * The line number of the Originating System for the line item.
     */
    public java.math.BigInteger getOriginatingSystemLineNumber() {
        return originatingSystemLineNumber;
    }


    /**
     * Sets the originatingSystemLineNumber value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param originatingSystemLineNumber   * The line number of the Originating System for the line item.
     */
    public void setOriginatingSystemLineNumber(java.math.BigInteger originatingSystemLineNumber) {
        this.originatingSystemLineNumber = originatingSystemLineNumber;
    }


    /**
     * Gets the originatingSystemReferenceID value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return originatingSystemReferenceID   * The reference ID of the Originating System for the line item.
     */
    public java.lang.String getOriginatingSystemReferenceID() {
        return originatingSystemReferenceID;
    }


    /**
     * Sets the originatingSystemReferenceID value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param originatingSystemReferenceID   * The reference ID of the Originating System for the line item.
     */
    public void setOriginatingSystemReferenceID(java.lang.String originatingSystemReferenceID) {
        this.originatingSystemReferenceID = originatingSystemReferenceID;
    }


    /**
     * Gets the parentLineNumber value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return parentLineNumber   * Line number of the parent of this line item.
     */
    public java.math.BigInteger getParentLineNumber() {
        return parentLineNumber;
    }


    /**
     * Sets the parentLineNumber value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param parentLineNumber   * Line number of the parent of this line item.
     */
    public void setParentLineNumber(java.math.BigInteger parentLineNumber) {
        this.parentLineNumber = parentLineNumber;
    }


    /**
     * Gets the quantity value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return quantity   * The quantity for each line item in the purchase order.
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param quantity   * The quantity for each line item in the purchase order.
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the receivingType value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return receivingType   * The unique receiving type value for each line item in the purchase
     * order. The possible values are, System Received, Auto Received, Quantity
     * Based, or Amount Based.
     */
    public java.math.BigInteger getReceivingType() {
        return receivingType;
    }


    /**
     * Sets the receivingType value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param receivingType   * The unique receiving type value for each line item in the purchase
     * order. The possible values are, System Received, Auto Received, Quantity
     * Based, or Amount Based.
     */
    public void setReceivingType(java.math.BigInteger receivingType) {
        this.receivingType = receivingType;
    }


    /**
     * Gets the requisition value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return requisition
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemRequisition getRequisition() {
        return requisition;
    }


    /**
     * Sets the requisition value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param requisition
     */
    public void setRequisition(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemRequisition requisition) {
        this.requisition = requisition;
    }


    /**
     * Gets the serviceDetails value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return serviceDetails
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails getServiceDetails() {
        return serviceDetails;
    }


    /**
     * Sets the serviceDetails value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param serviceDetails
     */
    public void setServiceDetails(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails serviceDetails) {
        this.serviceDetails = serviceDetails;
    }


    /**
     * Gets the serviceLineItemDetails value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return serviceLineItemDetails   * The details of services line item in string format. This string
     * will contain                           all the category specific line
     * item details in a XML format in a single string. This XML        
     * will contain all the category specific fields in the cXML format in
     * a single column.
     */
    public java.lang.String getServiceLineItemDetails() {
        return serviceLineItemDetails;
    }


    /**
     * Sets the serviceLineItemDetails value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param serviceLineItemDetails   * The details of services line item in string format. This string
     * will contain                           all the category specific line
     * item details in a XML format in a single string. This XML        
     * will contain all the category specific fields in the cXML format in
     * a single column.
     */
    public void setServiceLineItemDetails(java.lang.String serviceLineItemDetails) {
        this.serviceLineItemDetails = serviceLineItemDetails;
    }


    /**
     * Gets the shipTo value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return shipTo
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemShipTo getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param shipTo
     */
    public void setShipTo(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemShipTo shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the supplier value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return supplier
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplier getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param supplier
     */
    public void setSupplier(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplier supplier) {
        this.supplier = supplier;
    }


    /**
     * Gets the supplierLocation value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return supplierLocation
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplierLocation getSupplierLocation() {
        return supplierLocation;
    }


    /**
     * Sets the supplierLocation value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param supplierLocation
     */
    public void setSupplierLocation(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplierLocation supplierLocation) {
        this.supplierLocation = supplierLocation;
    }


    /**
     * Gets the taxCode value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return taxCode
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxCode getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxCode taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxDetail value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return taxDetail
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail getTaxDetail() {
        return taxDetail;
    }


    /**
     * Sets the taxDetail value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param taxDetail
     */
    public void setTaxDetail(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail taxDetail) {
        this.taxDetail = taxDetail;
    }


    /**
     * Gets the custom value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @return custom
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustom getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this ERPOrder_PurchOrdLineDetailsLineItemsItem.
     * 
     * @param custom
     */
    public void setCustom(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustom custom) {
        this.custom = custom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdLineDetailsLineItemsItem)) return false;
        ERPOrder_PurchOrdLineDetailsLineItemsItem other = (ERPOrder_PurchOrdLineDetailsLineItemsItem) obj;
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
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.chargeDetail==null && other.getChargeDetail()==null) || 
             (this.chargeDetail!=null &&
              this.chargeDetail.equals(other.getChargeDetail()))) &&
            ((this.commodityCode==null && other.getCommodityCode()==null) || 
             (this.commodityCode!=null &&
              this.commodityCode.equals(other.getCommodityCode()))) &&
            ((this.deliverTo==null && other.getDeliverTo()==null) || 
             (this.deliverTo!=null &&
              this.deliverTo.equals(other.getDeliverTo()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.ERSAllowed==null && other.getERSAllowed()==null) || 
             (this.ERSAllowed!=null &&
              this.ERSAllowed.equals(other.getERSAllowed()))) &&
            ((this.externalLineNumber==null && other.getExternalLineNumber()==null) || 
             (this.externalLineNumber!=null &&
              this.externalLineNumber.equals(other.getExternalLineNumber()))) &&
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.maskAmount==null && other.getMaskAmount()==null) || 
             (this.maskAmount!=null &&
              this.maskAmount.equals(other.getMaskAmount()))) &&
            ((this.maskUnitPrice==null && other.getMaskUnitPrice()==null) || 
             (this.maskUnitPrice!=null &&
              this.maskUnitPrice.equals(other.getMaskUnitPrice()))) &&
            ((this.needBy==null && other.getNeedBy()==null) || 
             (this.needBy!=null &&
              this.needBy.equals(other.getNeedBy()))) &&
            ((this.numberInCollection==null && other.getNumberInCollection()==null) || 
             (this.numberInCollection!=null &&
              this.numberInCollection.equals(other.getNumberInCollection()))) &&
            ((this.originatingSystemLineNumber==null && other.getOriginatingSystemLineNumber()==null) || 
             (this.originatingSystemLineNumber!=null &&
              this.originatingSystemLineNumber.equals(other.getOriginatingSystemLineNumber()))) &&
            ((this.originatingSystemReferenceID==null && other.getOriginatingSystemReferenceID()==null) || 
             (this.originatingSystemReferenceID!=null &&
              this.originatingSystemReferenceID.equals(other.getOriginatingSystemReferenceID()))) &&
            ((this.parentLineNumber==null && other.getParentLineNumber()==null) || 
             (this.parentLineNumber!=null &&
              this.parentLineNumber.equals(other.getParentLineNumber()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.receivingType==null && other.getReceivingType()==null) || 
             (this.receivingType!=null &&
              this.receivingType.equals(other.getReceivingType()))) &&
            ((this.requisition==null && other.getRequisition()==null) || 
             (this.requisition!=null &&
              this.requisition.equals(other.getRequisition()))) &&
            ((this.serviceDetails==null && other.getServiceDetails()==null) || 
             (this.serviceDetails!=null &&
              this.serviceDetails.equals(other.getServiceDetails()))) &&
            ((this.serviceLineItemDetails==null && other.getServiceLineItemDetails()==null) || 
             (this.serviceLineItemDetails!=null &&
              this.serviceLineItemDetails.equals(other.getServiceLineItemDetails()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              this.supplier.equals(other.getSupplier()))) &&
            ((this.supplierLocation==null && other.getSupplierLocation()==null) || 
             (this.supplierLocation!=null &&
              this.supplierLocation.equals(other.getSupplierLocation()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxDetail==null && other.getTaxDetail()==null) || 
             (this.taxDetail!=null &&
              this.taxDetail.equals(other.getTaxDetail()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getChargeDetail() != null) {
            _hashCode += getChargeDetail().hashCode();
        }
        if (getCommodityCode() != null) {
            _hashCode += getCommodityCode().hashCode();
        }
        if (getDeliverTo() != null) {
            _hashCode += getDeliverTo().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getERSAllowed() != null) {
            _hashCode += getERSAllowed().hashCode();
        }
        if (getExternalLineNumber() != null) {
            _hashCode += getExternalLineNumber().hashCode();
        }
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
        }
        if (getMaskAmount() != null) {
            _hashCode += getMaskAmount().hashCode();
        }
        if (getMaskUnitPrice() != null) {
            _hashCode += getMaskUnitPrice().hashCode();
        }
        if (getNeedBy() != null) {
            _hashCode += getNeedBy().hashCode();
        }
        if (getNumberInCollection() != null) {
            _hashCode += getNumberInCollection().hashCode();
        }
        if (getOriginatingSystemLineNumber() != null) {
            _hashCode += getOriginatingSystemLineNumber().hashCode();
        }
        if (getOriginatingSystemReferenceID() != null) {
            _hashCode += getOriginatingSystemReferenceID().hashCode();
        }
        if (getParentLineNumber() != null) {
            _hashCode += getParentLineNumber().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getReceivingType() != null) {
            _hashCode += getReceivingType().hashCode();
        }
        if (getRequisition() != null) {
            _hashCode += getRequisition().hashCode();
        }
        if (getServiceDetails() != null) {
            _hashCode += getServiceDetails().hashCode();
        }
        if (getServiceLineItemDetails() != null) {
            _hashCode += getServiceLineItemDetails().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getSupplier() != null) {
            _hashCode += getSupplier().hashCode();
        }
        if (getSupplierLocation() != null) {
            _hashCode += getSupplierLocation().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxDetail() != null) {
            _hashCode += getTaxDetail().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdLineDetailsLineItemsItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdLineDetails>LineItems>item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "BillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>BillingAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>ChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "CommodityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>CommodityCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "DeliverTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERSAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERSAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ExternalLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "LineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>LineType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "MaskAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "MaskUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "NeedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberInCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "NumberInCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originatingSystemLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "OriginatingSystemLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("parentLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ParentLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ReceivingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requisition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Requisition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Requisition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ServiceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLineItemDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ServiceLineItemDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>ShipTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Supplier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "SupplierLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>SupplierLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "TaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>TaxCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "TaxDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>TaxDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>custom"));
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
