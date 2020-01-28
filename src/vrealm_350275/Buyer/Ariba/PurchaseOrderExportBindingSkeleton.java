/**
 * PurchaseOrderExportBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

public class PurchaseOrderExportBindingSkeleton implements vrealm_350275.Buyer.Ariba.PurchaseOrderExportPortType, org.apache.axis.wsdl.Skeleton {
    private vrealm_350275.Buyer.Ariba.PurchaseOrderExportPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderExportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">PurchaseOrderExportRequest"), vrealm_350275.Buyer.Ariba.PurchaseOrderExportRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("purchaseOrderExportOperation", _params, new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", "PurchaseOrderExportReply"));
        _oper.setReturnType(new javax.xml.namespace.QName("urn:Ariba:Buyer:vrealm_350275", ">PurchaseOrderExportReply"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "PurchaseOrderExportOperation"));
        _oper.setSoapAction("/Process Definition");
        _myOperationsList.add(_oper);
        if (_myOperations.get("purchaseOrderExportOperation") == null) {
            _myOperations.put("purchaseOrderExportOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("purchaseOrderExportOperation")).add(_oper);
    }

    public PurchaseOrderExportBindingSkeleton() {
        this.impl = new vrealm_350275.Buyer.Ariba.PurchaseOrderExportBindingImpl();
    }

    public PurchaseOrderExportBindingSkeleton(vrealm_350275.Buyer.Ariba.PurchaseOrderExportPortType impl) {
        this.impl = impl;
    }
    public vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply purchaseOrderExportOperation(vrealm_350275.Buyer.Ariba.PurchaseOrderExportRequest body) throws java.rmi.RemoteException
    {
        vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply ret = impl.purchaseOrderExportOperation(body);
        return ret;
    }

}
