@isTest
private class OASUpdateOrderStatusesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest1 = OASUpdateOrderStatusesRequest.getExample();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest2 = updateOrderStatusesRequest1;
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest3 = new OASUpdateOrderStatusesRequest();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest4 = updateOrderStatusesRequest3;

        System.assert(updateOrderStatusesRequest1.equals(updateOrderStatusesRequest2));
        System.assert(updateOrderStatusesRequest2.equals(updateOrderStatusesRequest1));
        System.assert(updateOrderStatusesRequest1.equals(updateOrderStatusesRequest1));
        System.assert(updateOrderStatusesRequest3.equals(updateOrderStatusesRequest4));
        System.assert(updateOrderStatusesRequest4.equals(updateOrderStatusesRequest3));
        System.assert(updateOrderStatusesRequest3.equals(updateOrderStatusesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest1 = OASUpdateOrderStatusesRequest.getExample();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest2 = OASUpdateOrderStatusesRequest.getExample();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest3 = new OASUpdateOrderStatusesRequest();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest4 = new OASUpdateOrderStatusesRequest();

        System.assert(updateOrderStatusesRequest1.equals(updateOrderStatusesRequest2));
        System.assert(updateOrderStatusesRequest2.equals(updateOrderStatusesRequest1));
        System.assert(updateOrderStatusesRequest3.equals(updateOrderStatusesRequest4));
        System.assert(updateOrderStatusesRequest4.equals(updateOrderStatusesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest1 = OASUpdateOrderStatusesRequest.getExample();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest2 = new OASUpdateOrderStatusesRequest();

        System.assertEquals(false, updateOrderStatusesRequest1.equals('foo'));
        System.assertEquals(false, updateOrderStatusesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest1 = OASUpdateOrderStatusesRequest.getExample();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest2 = new OASUpdateOrderStatusesRequest();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest3;

        System.assertEquals(false, updateOrderStatusesRequest1.equals(updateOrderStatusesRequest3));
        System.assertEquals(false, updateOrderStatusesRequest2.equals(updateOrderStatusesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest1 = OASUpdateOrderStatusesRequest.getExample();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest2 = new OASUpdateOrderStatusesRequest();

        System.assertEquals(updateOrderStatusesRequest1.hashCode(), updateOrderStatusesRequest1.hashCode());
        System.assertEquals(updateOrderStatusesRequest2.hashCode(), updateOrderStatusesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest1 = OASUpdateOrderStatusesRequest.getExample();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest2 = OASUpdateOrderStatusesRequest.getExample();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest3 = new OASUpdateOrderStatusesRequest();
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest4 = new OASUpdateOrderStatusesRequest();

        System.assert(updateOrderStatusesRequest1.equals(updateOrderStatusesRequest2));
        System.assert(updateOrderStatusesRequest3.equals(updateOrderStatusesRequest4));
        System.assertEquals(updateOrderStatusesRequest1.hashCode(), updateOrderStatusesRequest2.hashCode());
        System.assertEquals(updateOrderStatusesRequest3.hashCode(), updateOrderStatusesRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOrderStatusesRequest updateOrderStatusesRequest = new OASUpdateOrderStatusesRequest();
        System.assertEquals(new List<OASOrderStateDTO>(), updateOrderStatusesRequest.orders);
    }
}
