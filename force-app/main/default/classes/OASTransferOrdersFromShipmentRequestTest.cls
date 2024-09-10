@isTest
private class OASTransferOrdersFromShipmentRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest1 = OASTransferOrdersFromShipmentRequest.getExample();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest2 = transferOrdersFromShipmentRequest1;
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest3 = new OASTransferOrdersFromShipmentRequest();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest4 = transferOrdersFromShipmentRequest3;

        System.assert(transferOrdersFromShipmentRequest1.equals(transferOrdersFromShipmentRequest2));
        System.assert(transferOrdersFromShipmentRequest2.equals(transferOrdersFromShipmentRequest1));
        System.assert(transferOrdersFromShipmentRequest1.equals(transferOrdersFromShipmentRequest1));
        System.assert(transferOrdersFromShipmentRequest3.equals(transferOrdersFromShipmentRequest4));
        System.assert(transferOrdersFromShipmentRequest4.equals(transferOrdersFromShipmentRequest3));
        System.assert(transferOrdersFromShipmentRequest3.equals(transferOrdersFromShipmentRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest1 = OASTransferOrdersFromShipmentRequest.getExample();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest2 = OASTransferOrdersFromShipmentRequest.getExample();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest3 = new OASTransferOrdersFromShipmentRequest();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest4 = new OASTransferOrdersFromShipmentRequest();

        System.assert(transferOrdersFromShipmentRequest1.equals(transferOrdersFromShipmentRequest2));
        System.assert(transferOrdersFromShipmentRequest2.equals(transferOrdersFromShipmentRequest1));
        System.assert(transferOrdersFromShipmentRequest3.equals(transferOrdersFromShipmentRequest4));
        System.assert(transferOrdersFromShipmentRequest4.equals(transferOrdersFromShipmentRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest1 = OASTransferOrdersFromShipmentRequest.getExample();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest2 = new OASTransferOrdersFromShipmentRequest();

        System.assertEquals(false, transferOrdersFromShipmentRequest1.equals('foo'));
        System.assertEquals(false, transferOrdersFromShipmentRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest1 = OASTransferOrdersFromShipmentRequest.getExample();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest2 = new OASTransferOrdersFromShipmentRequest();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest3;

        System.assertEquals(false, transferOrdersFromShipmentRequest1.equals(transferOrdersFromShipmentRequest3));
        System.assertEquals(false, transferOrdersFromShipmentRequest2.equals(transferOrdersFromShipmentRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest1 = OASTransferOrdersFromShipmentRequest.getExample();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest2 = new OASTransferOrdersFromShipmentRequest();

        System.assertEquals(transferOrdersFromShipmentRequest1.hashCode(), transferOrdersFromShipmentRequest1.hashCode());
        System.assertEquals(transferOrdersFromShipmentRequest2.hashCode(), transferOrdersFromShipmentRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest1 = OASTransferOrdersFromShipmentRequest.getExample();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest2 = OASTransferOrdersFromShipmentRequest.getExample();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest3 = new OASTransferOrdersFromShipmentRequest();
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest4 = new OASTransferOrdersFromShipmentRequest();

        System.assert(transferOrdersFromShipmentRequest1.equals(transferOrdersFromShipmentRequest2));
        System.assert(transferOrdersFromShipmentRequest3.equals(transferOrdersFromShipmentRequest4));
        System.assertEquals(transferOrdersFromShipmentRequest1.hashCode(), transferOrdersFromShipmentRequest2.hashCode());
        System.assertEquals(transferOrdersFromShipmentRequest3.hashCode(), transferOrdersFromShipmentRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest = new OASTransferOrdersFromShipmentRequest();
        System.assertEquals(new List<Long>(), transferOrdersFromShipmentRequest.orderIds);
    }
}
