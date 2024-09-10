@isTest
private class OASUpdateOrderStorageLimitRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest1 = OASUpdateOrderStorageLimitRequest.getExample();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest2 = updateOrderStorageLimitRequest1;
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest3 = new OASUpdateOrderStorageLimitRequest();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest4 = updateOrderStorageLimitRequest3;

        System.assert(updateOrderStorageLimitRequest1.equals(updateOrderStorageLimitRequest2));
        System.assert(updateOrderStorageLimitRequest2.equals(updateOrderStorageLimitRequest1));
        System.assert(updateOrderStorageLimitRequest1.equals(updateOrderStorageLimitRequest1));
        System.assert(updateOrderStorageLimitRequest3.equals(updateOrderStorageLimitRequest4));
        System.assert(updateOrderStorageLimitRequest4.equals(updateOrderStorageLimitRequest3));
        System.assert(updateOrderStorageLimitRequest3.equals(updateOrderStorageLimitRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest1 = OASUpdateOrderStorageLimitRequest.getExample();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest2 = OASUpdateOrderStorageLimitRequest.getExample();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest3 = new OASUpdateOrderStorageLimitRequest();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest4 = new OASUpdateOrderStorageLimitRequest();

        System.assert(updateOrderStorageLimitRequest1.equals(updateOrderStorageLimitRequest2));
        System.assert(updateOrderStorageLimitRequest2.equals(updateOrderStorageLimitRequest1));
        System.assert(updateOrderStorageLimitRequest3.equals(updateOrderStorageLimitRequest4));
        System.assert(updateOrderStorageLimitRequest4.equals(updateOrderStorageLimitRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest1 = OASUpdateOrderStorageLimitRequest.getExample();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest2 = new OASUpdateOrderStorageLimitRequest();

        System.assertEquals(false, updateOrderStorageLimitRequest1.equals('foo'));
        System.assertEquals(false, updateOrderStorageLimitRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest1 = OASUpdateOrderStorageLimitRequest.getExample();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest2 = new OASUpdateOrderStorageLimitRequest();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest3;

        System.assertEquals(false, updateOrderStorageLimitRequest1.equals(updateOrderStorageLimitRequest3));
        System.assertEquals(false, updateOrderStorageLimitRequest2.equals(updateOrderStorageLimitRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest1 = OASUpdateOrderStorageLimitRequest.getExample();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest2 = new OASUpdateOrderStorageLimitRequest();

        System.assertEquals(updateOrderStorageLimitRequest1.hashCode(), updateOrderStorageLimitRequest1.hashCode());
        System.assertEquals(updateOrderStorageLimitRequest2.hashCode(), updateOrderStorageLimitRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest1 = OASUpdateOrderStorageLimitRequest.getExample();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest2 = OASUpdateOrderStorageLimitRequest.getExample();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest3 = new OASUpdateOrderStorageLimitRequest();
        OASUpdateOrderStorageLimitRequest updateOrderStorageLimitRequest4 = new OASUpdateOrderStorageLimitRequest();

        System.assert(updateOrderStorageLimitRequest1.equals(updateOrderStorageLimitRequest2));
        System.assert(updateOrderStorageLimitRequest3.equals(updateOrderStorageLimitRequest4));
        System.assertEquals(updateOrderStorageLimitRequest1.hashCode(), updateOrderStorageLimitRequest2.hashCode());
        System.assertEquals(updateOrderStorageLimitRequest3.hashCode(), updateOrderStorageLimitRequest4.hashCode());
    }
}
