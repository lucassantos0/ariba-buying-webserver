/**
 * PurchaseOrderExportBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vrealm_350275.Buyer.Ariba;

public class PurchaseOrderExportBindingImpl implements vrealm_350275.Buyer.Ariba.PurchaseOrderExportPortType{
    public vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply purchaseOrderExportOperation(vrealm_350275.Buyer.Ariba.PurchaseOrderExportRequest body) throws java.rmi.RemoteException {
        
    	vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply reply = new vrealm_350275.Buyer.Ariba.PurchaseOrderExportReply();
    	reply.setPartition(body.getPartition());
    	reply.setVariant(body.getVariant());
    	ERPOrder_PurchaseOrderNumberImport[] items = new ERPOrder_PurchaseOrderNumberImport[1];
    	items[0] = new ERPOrder_PurchaseOrderNumberImport();
    	items[0].setERPPONumber( String.valueOf(java.time.Instant.now().getEpochSecond()) );
    	items[0].setUniqueName(body.getERPOrder_PurchOrdHeaderDetails_Item()[0].getName());
    	reply.setERPOrder_PurchaseOrderNumberImport_Item(items);
    	return reply;
    }
}
