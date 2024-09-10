@isTest
private class OASUpdateOrderStatusResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOrderStatusResponse updateOrderStatusResponse1 = OASUpdateOrderStatusResponse.getExample();
        OASUpdateOrderStatusResponse updateOrderStatusResponse2 = updateOrderStatusResponse1;
        OASUpdateOrderStatusResponse updateOrderStatusResponse3 = new OASUpdateOrderStatusResponse();
        OASUpdateOrderStatusResponse updateOrderStatusResponse4 = updateOrderStatusResponse3;

        System.assert(updateOrderStatusResponse1.equals(updateOrderStatusResponse2));
        System.assert(updateOrderStatusResponse2.equals(updateOrderStatusResponse1));
        System.assert(updateOrderStatusResponse1.equals(updateOrderStatusResponse1));
        System.assert(updateOrderStatusResponse3.equals(updateOrderStatusResponse4));
        System.assert(updateOrderStatusResponse4.equals(updateOrderStatusResponse3));
        System.assert(updateOrderStatusResponse3.equals(updateOrderStatusResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOrderStatusResponse updateOrderStatusResponse1 = OASUpdateOrderStatusResponse.getExample();
        OASUpdateOrderStatusResponse updateOrderStatusResponse2 = OASUpdateOrderStatusResponse.getExample();
        OASUpdateOrderStatusResponse updateOrderStatusResponse3 = new OASUpdateOrderStatusResponse();
        OASUpdateOrderStatusResponse updateOrderStatusResponse4 = new OASUpdateOrderStatusResponse();

        System.assert(updateOrderStatusResponse1.equals(updateOrderStatusResponse2));
        System.assert(updateOrderStatusResponse2.equals(updateOrderStatusResponse1));
        System.assert(updateOrderStatusResponse3.equals(updateOrderStatusResponse4));
        System.assert(updateOrderStatusResponse4.equals(updateOrderStatusResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOrderStatusResponse updateOrderStatusResponse1 = OASUpdateOrderStatusResponse.getExample();
        OASUpdateOrderStatusResponse updateOrderStatusResponse2 = new OASUpdateOrderStatusResponse();

        System.assertEquals(false, updateOrderStatusResponse1.equals('foo'));
        System.assertEquals(false, updateOrderStatusResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOrderStatusResponse updateOrderStatusResponse1 = OASUpdateOrderStatusResponse.getExample();
        OASUpdateOrderStatusResponse updateOrderStatusResponse2 = new OASUpdateOrderStatusResponse();
        OASUpdateOrderStatusResponse updateOrderStatusResponse3;

        System.assertEquals(false, updateOrderStatusResponse1.equals(updateOrderStatusResponse3));
        System.assertEquals(false, updateOrderStatusResponse2.equals(updateOrderStatusResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOrderStatusResponse updateOrderStatusResponse1 = OASUpdateOrderStatusResponse.getExample();
        OASUpdateOrderStatusResponse updateOrderStatusResponse2 = new OASUpdateOrderStatusResponse();

        System.assertEquals(updateOrderStatusResponse1.hashCode(), updateOrderStatusResponse1.hashCode());
        System.assertEquals(updateOrderStatusResponse2.hashCode(), updateOrderStatusResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOrderStatusResponse updateOrderStatusResponse1 = OASUpdateOrderStatusResponse.getExample();
        OASUpdateOrderStatusResponse updateOrderStatusResponse2 = OASUpdateOrderStatusResponse.getExample();
        OASUpdateOrderStatusResponse updateOrderStatusResponse3 = new OASUpdateOrderStatusResponse();
        OASUpdateOrderStatusResponse updateOrderStatusResponse4 = new OASUpdateOrderStatusResponse();

        System.assert(updateOrderStatusResponse1.equals(updateOrderStatusResponse2));
        System.assert(updateOrderStatusResponse3.equals(updateOrderStatusResponse4));
        System.assertEquals(updateOrderStatusResponse1.hashCode(), updateOrderStatusResponse2.hashCode());
        System.assertEquals(updateOrderStatusResponse3.hashCode(), updateOrderStatusResponse4.hashCode());
    }
}
