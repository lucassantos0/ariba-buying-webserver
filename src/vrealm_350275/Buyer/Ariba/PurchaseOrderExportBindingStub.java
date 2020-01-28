/**
 * PurchaseOrderExportBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

public class PurchaseOrderExportBindingStub extends org.apache.axis.client.Stub implements vrealm_350275.Buyer.Ariba.PurchaseOrderExportPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PurchaseOrderExportOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderExportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">PurchaseOrderExportRequest"), vrealm_350275.Buyer.Ariba.PurchaseOrderExportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">PurchaseOrderExportReply"));
        oper.setReturnClass(vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderExportReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public PurchaseOrderExportBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PurchaseOrderExportBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PurchaseOrderExportBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>custom>CustomBoolean");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>custom>CustomDate");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>custom>CustomInteger");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>custom>CustomMoney");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomMoney.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>custom>CustomString");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustomCustomString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Account");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Amount");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>BusinessUnit");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemBusinessUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Company");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCompany.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>CostCenter");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCostCenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>custom");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemCustom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Product");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Project");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemProject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>Region");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemRegion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item>SubAccount");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItemSubAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails>ExpectedAmount>Currency");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmountCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails>MaxAmount>Currency");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsMaxAmountCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>ERPOrder_PurchOrdLineDetails>LineItems>item>TaxDetail>TaxableAmount>Currency");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetailTaxableAmountCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Amount>Currency");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmountCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>ChargeDetail>ChargeType");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemChargeDetailChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>custom>CustomBoolean");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustomCustomBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>custom>CustomDate");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustomCustomDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>custom>CustomInteger");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustomCustomInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>custom>CustomMoney");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustomCustomMoney.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>custom>CustomString");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustomCustomString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description>CommonCommodityCode");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionCommonCommodityCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description>Price");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description>PriceBasisQuantityUOM");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionPriceBasisQuantityUOM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description>UnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescriptionUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>Requisition>Requester");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemRequisitionRequester.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails>ExpectedAmount");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsExpectedAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails>MaxAmount");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetailsMaxAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdLineDetails>LineItems>item>TaxDetail>TaxableAmount");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetailTaxableAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountingsSplitAccountingsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings>SplitAccountings>item");
            qName2 = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>CommodityExportMapEntry>AccountType");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntryAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>custom>CustomBoolean");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustomCustomBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>custom>CustomDate");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustomCustomDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>custom>CustomInteger");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustomCustomInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>custom>CustomMoney");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustomCustomMoney.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>custom>CustomString");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustomCustomString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Description>Price");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Description>UnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescriptionUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Amount");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>BillingAddress");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemBillingAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>ChargeDetail");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>CommodityCode");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCommodityCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>custom");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemCustom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Description");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>LineType");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemLineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Requisition");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemRequisition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>ServiceDetails");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemServiceDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>ShipTo");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemShipTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>Supplier");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>SupplierLocation");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemSupplierLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>TaxCode");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdLineDetails>LineItems>item>TaxDetail");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItemTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Accountings");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemAccountings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>CommodityExportMapEntry");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCommodityExportMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>custom");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemCustom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>Description");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>>ERPOrder_PurchOrdSplitDetails>LineItems>item>ShipTo");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItemShipTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchaseOrderNumberImport>custom>CustomBoolean");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustomCustomBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchaseOrderNumberImport>custom>CustomDate");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustomCustomDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchaseOrderNumberImport>custom>CustomInteger");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustomCustomInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchaseOrderNumberImport>custom>CustomMoney");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustomCustomMoney.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchaseOrderNumberImport>custom>CustomString");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustomCustomString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>custom>CustomBoolean");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustomCustomBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>custom>CustomDate");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustomCustomDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>custom>CustomInteger");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustomCustomInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>custom>CustomMoney");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustomCustomMoney.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>custom>CustomString");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustomCustomString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>Requester>DefaultCurrency");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequesterDefaultCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdHeaderDetails>TotalCost>Currency");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCostCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdLineDetails>custom>CustomBoolean");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsCustomCustomBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdLineDetails>custom>CustomDate");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsCustomCustomDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdLineDetails>custom>CustomInteger");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsCustomCustomInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdLineDetails>custom>CustomMoney");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsCustomCustomMoney.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdLineDetails>custom>CustomString");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsCustomCustomString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdLineDetails>LineItems>item");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdSplitDetails>custom>CustomBoolean");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsCustomCustomBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdSplitDetails>custom>CustomDate");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsCustomCustomDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdSplitDetails>custom>CustomInteger");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsCustomCustomInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdSplitDetails>custom>CustomMoney");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsCustomCustomMoney.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdSplitDetails>custom>CustomString");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsCustomCustomString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdSplitDetails>LineItems>item");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>PurchaseOrderExportReply>ERPOrder_PurchaseOrderNumberImport_Item");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchaseOrderNumberImport");
            qName2 = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>PurchaseOrderExportReply>PurchaseOrderError_PurchOrdErrorImport_Item");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.PurchaseOrderError_PurchOrdErrorImport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderError_PurchOrdErrorImport");
            qName2 = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>PurchaseOrderExportRequest>ERPOrder_PurchOrdHeaderDetails_Item");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdHeaderDetails");
            qName2 = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>PurchaseOrderExportRequest>ERPOrder_PurchOrdLineDetails_Item");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdLineDetails");
            qName2 = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>PurchaseOrderExportRequest>ERPOrder_PurchOrdSplitDetails_Item");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdSplitDetails");
            qName2 = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchaseOrderNumberImport>custom");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImportCustom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>custom");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsCustom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>PaymentTerms");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsPaymentTerms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>ProcurementUnit");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsProcurementUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>Requester");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsRequester.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>Supplier");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>SupplierLocation");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsSupplierLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdHeaderDetails>TotalCost");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetailsTotalCost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdLineDetails>custom");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsCustom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdLineDetails>LineItems");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetailsLineItemsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdLineDetails>LineItems>item");
            qName2 = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdSplitDetails>custom");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsCustom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">ERPOrder_PurchOrdSplitDetails>LineItems");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetailsLineItemsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">>ERPOrder_PurchOrdSplitDetails>LineItems>item");
            qName2 = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">Money_Reference>Currency");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.Money_ReferenceCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">PurchaseOrderExportReply");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">PurchaseOrderExportRequest");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.PurchaseOrderExportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchaseOrderNumberImport");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchaseOrderNumberImport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdHeaderDetails");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdHeaderDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdLineDetails");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdLineDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "ERPOrder_PurchOrdSplitDetails");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.ERPOrder_PurchOrdSplitDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "Money_Reference");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.Money_Reference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderError_PurchOrdErrorImport");
            cachedSerQNames.add(qName);
            cls = vrealm_350275.Buyer.Ariba.PurchaseOrderError_PurchOrdErrorImport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply purchaseOrderExportOperation(vrealm_350275.Buyer.Ariba.PurchaseOrderExportRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("/Process Definition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PurchaseOrderExportOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply) org.apache.axis.utils.JavaUtils.convert(_resp, vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
