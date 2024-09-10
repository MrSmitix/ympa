@isTest
private class OASUpdateOrderStatusRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOrderStatusRequest updateOrderStatusRequest1 = OASUpdateOrderStatusRequest.getExample();
        OASUpdateOrderStatusRequest updateOrderStatusRequest2 = updateOrderStatusRequest1;
        OASUpdateOrderStatusRequest updateOrderStatusRequest3 = new OASUpdateOrderStatusRequest();
        OASUpdateOrderStatusRequest updateOrderStatusRequest4 = updateOrderStatusRequest3;

        System.assert(updateOrderStatusRequest1.equals(updateOrderStatusRequest2));
        System.assert(updateOrderStatusRequest2.equals(updateOrderStatusRequest1));
        System.assert(updateOrderStatusRequest1.equals(updateOrderStatusRequest1));
        System.assert(updateOrderStatusRequest3.equals(updateOrderStatusRequest4));
        System.assert(updateOrderStatusRequest4.equals(updateOrderStatusRequest3));
        System.assert(updateOrderStatusRequest3.equals(updateOrderStatusRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOrderStatusRequest updateOrderStatusRequest1 = OASUpdateOrderStatusRequest.getExample();
        OASUpdateOrderStatusRequest updateOrderStatusRequest2 = OASUpdateOrderStatusRequest.getExample();
        OASUpdateOrderStatusRequest updateOrderStatusRequest3 = new OASUpdateOrderStatusRequest();
        OASUpdateOrderStatusRequest updateOrderStatusRequest4 = new OASUpdateOrderStatusRequest();

        System.assert(updateOrderStatusRequest1.equals(updateOrderStatusRequest2));
        System.assert(updateOrderStatusRequest2.equals(updateOrderStatusRequest1));
        System.assert(updateOrderStatusRequest3.equals(updateOrderStatusRequest4));
        System.assert(updateOrderStatusRequest4.equals(updateOrderStatusRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOrderStatusRequest updateOrderStatusRequest1 = OASUpdateOrderStatusRequest.getExample();
        OASUpdateOrderStatusRequest updateOrderStatusRequest2 = new OASUpdateOrderStatusRequest();

        System.assertEquals(false, updateOrderStatusRequest1.equals('foo'));
        System.assertEquals(false, updateOrderStatusRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOrderStatusRequest updateOrderStatusRequest1 = OASUpdateOrderStatusRequest.getExample();
        OASUpdateOrderStatusRequest updateOrderStatusRequest2 = new OASUpdateOrderStatusRequest();
        OASUpdateOrderStatusRequest updateOrderStatusRequest3;

        System.assertEquals(false, updateOrderStatusRequest1.equals(updateOrderStatusRequest3));
        System.assertEquals(false, updateOrderStatusRequest2.equals(updateOrderStatusRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOrderStatusRequest updateOrderStatusRequest1 = OASUpdateOrderStatusRequest.getExample();
        OASUpdateOrderStatusRequest updateOrderStatusRequest2 = new OASUpdateOrderStatusRequest();

        System.assertEquals(updateOrderStatusRequest1.hashCode(), updateOrderStatusRequest1.hashCode());
        System.assertEquals(updateOrderStatusRequest2.hashCode(), updateOrderStatusRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOrderStatusRequest updateOrderStatusRequest1 = OASUpdateOrderStatusRequest.getExample();
        OASUpdateOrderStatusRequest updateOrderStatusRequest2 = OASUpdateOrderStatusRequest.getExample();
        OASUpdateOrderStatusRequest updateOrderStatusRequest3 = new OASUpdateOrderStatusRequest();
        OASUpdateOrderStatusRequest updateOrderStatusRequest4 = new OASUpdateOrderStatusRequest();

        System.assert(updateOrderStatusRequest1.equals(updateOrderStatusRequest2));
        System.assert(updateOrderStatusRequest3.equals(updateOrderStatusRequest4));
        System.assertEquals(updateOrderStatusRequest1.hashCode(), updateOrderStatusRequest2.hashCode());
        System.assertEquals(updateOrderStatusRequest3.hashCode(), updateOrderStatusRequest4.hashCode());
    }
}
