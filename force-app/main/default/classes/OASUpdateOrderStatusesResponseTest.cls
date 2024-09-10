@isTest
private class OASUpdateOrderStatusesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse1 = OASUpdateOrderStatusesResponse.getExample();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse2 = updateOrderStatusesResponse1;
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse3 = new OASUpdateOrderStatusesResponse();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse4 = updateOrderStatusesResponse3;

        System.assert(updateOrderStatusesResponse1.equals(updateOrderStatusesResponse2));
        System.assert(updateOrderStatusesResponse2.equals(updateOrderStatusesResponse1));
        System.assert(updateOrderStatusesResponse1.equals(updateOrderStatusesResponse1));
        System.assert(updateOrderStatusesResponse3.equals(updateOrderStatusesResponse4));
        System.assert(updateOrderStatusesResponse4.equals(updateOrderStatusesResponse3));
        System.assert(updateOrderStatusesResponse3.equals(updateOrderStatusesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse1 = OASUpdateOrderStatusesResponse.getExample();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse2 = OASUpdateOrderStatusesResponse.getExample();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse3 = new OASUpdateOrderStatusesResponse();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse4 = new OASUpdateOrderStatusesResponse();

        System.assert(updateOrderStatusesResponse1.equals(updateOrderStatusesResponse2));
        System.assert(updateOrderStatusesResponse2.equals(updateOrderStatusesResponse1));
        System.assert(updateOrderStatusesResponse3.equals(updateOrderStatusesResponse4));
        System.assert(updateOrderStatusesResponse4.equals(updateOrderStatusesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse1 = OASUpdateOrderStatusesResponse.getExample();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse2 = new OASUpdateOrderStatusesResponse();

        System.assertEquals(false, updateOrderStatusesResponse1.equals('foo'));
        System.assertEquals(false, updateOrderStatusesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse1 = OASUpdateOrderStatusesResponse.getExample();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse2 = new OASUpdateOrderStatusesResponse();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse3;

        System.assertEquals(false, updateOrderStatusesResponse1.equals(updateOrderStatusesResponse3));
        System.assertEquals(false, updateOrderStatusesResponse2.equals(updateOrderStatusesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse1 = OASUpdateOrderStatusesResponse.getExample();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse2 = new OASUpdateOrderStatusesResponse();

        System.assertEquals(updateOrderStatusesResponse1.hashCode(), updateOrderStatusesResponse1.hashCode());
        System.assertEquals(updateOrderStatusesResponse2.hashCode(), updateOrderStatusesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse1 = OASUpdateOrderStatusesResponse.getExample();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse2 = OASUpdateOrderStatusesResponse.getExample();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse3 = new OASUpdateOrderStatusesResponse();
        OASUpdateOrderStatusesResponse updateOrderStatusesResponse4 = new OASUpdateOrderStatusesResponse();

        System.assert(updateOrderStatusesResponse1.equals(updateOrderStatusesResponse2));
        System.assert(updateOrderStatusesResponse3.equals(updateOrderStatusesResponse4));
        System.assertEquals(updateOrderStatusesResponse1.hashCode(), updateOrderStatusesResponse2.hashCode());
        System.assertEquals(updateOrderStatusesResponse3.hashCode(), updateOrderStatusesResponse4.hashCode());
    }
}
