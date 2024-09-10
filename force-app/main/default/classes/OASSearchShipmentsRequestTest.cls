@isTest
private class OASSearchShipmentsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSearchShipmentsRequest searchShipmentsRequest1 = OASSearchShipmentsRequest.getExample();
        OASSearchShipmentsRequest searchShipmentsRequest2 = searchShipmentsRequest1;
        OASSearchShipmentsRequest searchShipmentsRequest3 = new OASSearchShipmentsRequest();
        OASSearchShipmentsRequest searchShipmentsRequest4 = searchShipmentsRequest3;

        System.assert(searchShipmentsRequest1.equals(searchShipmentsRequest2));
        System.assert(searchShipmentsRequest2.equals(searchShipmentsRequest1));
        System.assert(searchShipmentsRequest1.equals(searchShipmentsRequest1));
        System.assert(searchShipmentsRequest3.equals(searchShipmentsRequest4));
        System.assert(searchShipmentsRequest4.equals(searchShipmentsRequest3));
        System.assert(searchShipmentsRequest3.equals(searchShipmentsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSearchShipmentsRequest searchShipmentsRequest1 = OASSearchShipmentsRequest.getExample();
        OASSearchShipmentsRequest searchShipmentsRequest2 = OASSearchShipmentsRequest.getExample();
        OASSearchShipmentsRequest searchShipmentsRequest3 = new OASSearchShipmentsRequest();
        OASSearchShipmentsRequest searchShipmentsRequest4 = new OASSearchShipmentsRequest();

        System.assert(searchShipmentsRequest1.equals(searchShipmentsRequest2));
        System.assert(searchShipmentsRequest2.equals(searchShipmentsRequest1));
        System.assert(searchShipmentsRequest3.equals(searchShipmentsRequest4));
        System.assert(searchShipmentsRequest4.equals(searchShipmentsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSearchShipmentsRequest searchShipmentsRequest1 = OASSearchShipmentsRequest.getExample();
        OASSearchShipmentsRequest searchShipmentsRequest2 = new OASSearchShipmentsRequest();

        System.assertEquals(false, searchShipmentsRequest1.equals('foo'));
        System.assertEquals(false, searchShipmentsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSearchShipmentsRequest searchShipmentsRequest1 = OASSearchShipmentsRequest.getExample();
        OASSearchShipmentsRequest searchShipmentsRequest2 = new OASSearchShipmentsRequest();
        OASSearchShipmentsRequest searchShipmentsRequest3;

        System.assertEquals(false, searchShipmentsRequest1.equals(searchShipmentsRequest3));
        System.assertEquals(false, searchShipmentsRequest2.equals(searchShipmentsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSearchShipmentsRequest searchShipmentsRequest1 = OASSearchShipmentsRequest.getExample();
        OASSearchShipmentsRequest searchShipmentsRequest2 = new OASSearchShipmentsRequest();

        System.assertEquals(searchShipmentsRequest1.hashCode(), searchShipmentsRequest1.hashCode());
        System.assertEquals(searchShipmentsRequest2.hashCode(), searchShipmentsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSearchShipmentsRequest searchShipmentsRequest1 = OASSearchShipmentsRequest.getExample();
        OASSearchShipmentsRequest searchShipmentsRequest2 = OASSearchShipmentsRequest.getExample();
        OASSearchShipmentsRequest searchShipmentsRequest3 = new OASSearchShipmentsRequest();
        OASSearchShipmentsRequest searchShipmentsRequest4 = new OASSearchShipmentsRequest();

        System.assert(searchShipmentsRequest1.equals(searchShipmentsRequest2));
        System.assert(searchShipmentsRequest3.equals(searchShipmentsRequest4));
        System.assertEquals(searchShipmentsRequest1.hashCode(), searchShipmentsRequest2.hashCode());
        System.assertEquals(searchShipmentsRequest3.hashCode(), searchShipmentsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSearchShipmentsRequest searchShipmentsRequest = new OASSearchShipmentsRequest();
        System.assertEquals(new List<OASShipmentStatusType>(), searchShipmentsRequest.statuses);
        System.assertEquals(new List<Long>(), searchShipmentsRequest.orderIds);
        System.assertEquals(true, searchShipmentsRequest.cancelledOrders);
        System.assertEquals(null, searchShipmentsRequest.dateFrom);
        System.assertEquals(null, searchShipmentsRequest.dateTo);
    }
}
