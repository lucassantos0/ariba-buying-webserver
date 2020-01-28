/**
 * ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

public class ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem  implements java.io.Serializable {
    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAccount account;

    /* The unique ID of the accounting combination for each split
     * line item in the purchase order. */
    private java.lang.String accountingCombinationID;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAmount amount;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemBusinessUnit businessUnit;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCompany company;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCostCenter costCenter;

    /* The serial number of each split line item. */
    private java.math.BigInteger numberInCollection;

    /* The line number of a split line item in the purchase order. */
    private java.lang.String POLineNumber;

    /* The split accounting percentage for each split line item in
     * the purchase order. */
    private java.math.BigDecimal percentage;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProduct product;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProject project;

    /* The quantity for each split line item in the purchase order. */
    private java.math.BigDecimal quantity;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemRegion region;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemSubAccount subAccount;

    private vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustom custom;

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem() {
    }

    public ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem(
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAccount account,
           java.lang.String accountingCombinationID,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAmount amount,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemBusinessUnit businessUnit,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCompany company,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCostCenter costCenter,
           java.math.BigInteger numberInCollection,
           java.lang.String POLineNumber,
           java.math.BigDecimal percentage,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProduct product,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProject project,
           java.math.BigDecimal quantity,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemRegion region,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemSubAccount subAccount,
           vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustom custom) {
           this.account = account;
           this.accountingCombinationID = accountingCombinationID;
           this.amount = amount;
           this.businessUnit = businessUnit;
           this.company = company;
           this.costCenter = costCenter;
           this.numberInCollection = numberInCollection;
           this.POLineNumber = POLineNumber;
           this.percentage = percentage;
           this.product = product;
           this.project = project;
           this.quantity = quantity;
           this.region = region;
           this.subAccount = subAccount;
           this.custom = custom;
    }


    /**
     * Gets the account value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return account
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param account
     */
    public void setAccount(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAccount account) {
        this.account = account;
    }


    /**
     * Gets the accountingCombinationID value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return accountingCombinationID   * The unique ID of the accounting combination for each split
     * line item in the purchase order.
     */
    public java.lang.String getAccountingCombinationID() {
        return accountingCombinationID;
    }


    /**
     * Sets the accountingCombinationID value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param accountingCombinationID   * The unique ID of the accounting combination for each split
     * line item in the purchase order.
     */
    public void setAccountingCombinationID(java.lang.String accountingCombinationID) {
        this.accountingCombinationID = accountingCombinationID;
    }


    /**
     * Gets the amount value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return amount
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAmount getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param amount
     */
    public void setAmount(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAmount amount) {
        this.amount = amount;
    }


    /**
     * Gets the businessUnit value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return businessUnit
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemBusinessUnit getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemBusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the company value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return company
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCompany getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param company
     */
    public void setCompany(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCompany company) {
        this.company = company;
    }


    /**
     * Gets the costCenter value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return costCenter
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCostCenter getCostCenter() {
        return costCenter;
    }


    /**
     * Sets the costCenter value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param costCenter
     */
    public void setCostCenter(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCostCenter costCenter) {
        this.costCenter = costCenter;
    }


    /**
     * Gets the numberInCollection value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return numberInCollection   * The serial number of each split line item.
     */
    public java.math.BigInteger getNumberInCollection() {
        return numberInCollection;
    }


    /**
     * Sets the numberInCollection value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param numberInCollection   * The serial number of each split line item.
     */
    public void setNumberInCollection(java.math.BigInteger numberInCollection) {
        this.numberInCollection = numberInCollection;
    }


    /**
     * Gets the POLineNumber value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return POLineNumber   * The line number of a split line item in the purchase order.
     */
    public java.lang.String getPOLineNumber() {
        return POLineNumber;
    }


    /**
     * Sets the POLineNumber value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param POLineNumber   * The line number of a split line item in the purchase order.
     */
    public void setPOLineNumber(java.lang.String POLineNumber) {
        this.POLineNumber = POLineNumber;
    }


    /**
     * Gets the percentage value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return percentage   * The split accounting percentage for each split line item in
     * the purchase order.
     */
    public java.math.BigDecimal getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param percentage   * The split accounting percentage for each split line item in
     * the purchase order.
     */
    public void setPercentage(java.math.BigDecimal percentage) {
        this.percentage = percentage;
    }


    /**
     * Gets the product value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return product
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProduct getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param product
     */
    public void setProduct(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProduct product) {
        this.product = product;
    }


    /**
     * Gets the project value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return project
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProject getProject() {
        return project;
    }


    /**
     * Sets the project value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param project
     */
    public void setProject(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProject project) {
        this.project = project;
    }


    /**
     * Gets the quantity value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return quantity   * The quantity for each split line item in the purchase order.
     */
    public java.math.BigDecimal getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param quantity   * The quantity for each split line item in the purchase order.
     */
    public void setQuantity(java.math.BigDecimal quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the region value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return region
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemRegion getRegion() {
        return region;
    }


    /**
     * Sets the region value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param region
     */
    public void setRegion(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemRegion region) {
        this.region = region;
    }


    /**
     * Gets the subAccount value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return subAccount
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemSubAccount getSubAccount() {
        return subAccount;
    }


    /**
     * Sets the subAccount value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param subAccount
     */
    public void setSubAccount(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemSubAccount subAccount) {
        this.subAccount = subAccount;
    }


    /**
     * Gets the custom value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @return custom
     */
    public vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustom getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.
     * 
     * @param custom
     */
    public void setCustom(vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustom custom) {
        this.custom = custom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem)) return false;
        ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem other = (ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountingCombinationID==null && other.getAccountingCombinationID()==null) || 
             (this.accountingCombinationID!=null &&
              this.accountingCombinationID.equals(other.getAccountingCombinationID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.costCenter==null && other.getCostCenter()==null) || 
             (this.costCenter!=null &&
              this.costCenter.equals(other.getCostCenter()))) &&
            ((this.numberInCollection==null && other.getNumberInCollection()==null) || 
             (this.numberInCollection!=null &&
              this.numberInCollection.equals(other.getNumberInCollection()))) &&
            ((this.POLineNumber==null && other.getPOLineNumber()==null) || 
             (this.POLineNumber!=null &&
              this.POLineNumber.equals(other.getPOLineNumber()))) &&
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.subAccount==null && other.getSubAccount()==null) || 
             (this.subAccount!=null &&
              this.subAccount.equals(other.getSubAccount()))) &&
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountingCombinationID() != null) {
            _hashCode += getAccountingCombinationID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCostCenter() != null) {
            _hashCode += getCostCenter().hashCode();
        }
        if (getNumberInCollection() != null) {
            _hashCode += getNumberInCollection().hashCode();
        }
        if (getPOLineNumber() != null) {
            _hashCode += getPOLineNumber().hashCode();
        }
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getSubAccount() != null) {
            _hashCode += getSubAccount().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingCombinationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "AccountingCombinationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "BusinessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>BusinessUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Company"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "CostCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>CostCenter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberInCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "NumberInCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "POLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Percentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Region"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "SubAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>SubAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>custom"));
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
