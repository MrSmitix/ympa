@isTest
private class OASGetOrderResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOrderResponse getOrderResponse1 = OASGetOrderResponse.getExample();
        OASGetOrderResponse getOrderResponse2 = getOrderResponse1;
        OASGetOrderResponse getOrderResponse3 = new OASGetOrderResponse();
        OASGetOrderResponse getOrderResponse4 = getOrderResponse3;

        System.assert(getOrderResponse1.equals(getOrderResponse2));
        System.assert(getOrderResponse2.equals(getOrderResponse1));
        System.assert(getOrderResponse1.equals(getOrderResponse1));
        System.assert(getOrderResponse3.equals(getOrderResponse4));
        System.assert(getOrderResponse4.equals(getOrderResponse3));
        System.assert(getOrderResponse3.equals(getOrderResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOrderResponse getOrderResponse1 = OASGetOrderResponse.getExample();
        OASGetOrderResponse getOrderResponse2 = OASGetOrderResponse.getExample();
        OASGetOrderResponse getOrderResponse3 = new OASGetOrderResponse();
        OASGetOrderResponse getOrderResponse4 = new OASGetOrderResponse();

        System.assert(getOrderResponse1.equals(getOrderResponse2));
        System.assert(getOrderResponse2.equals(getOrderResponse1));
        System.assert(getOrderResponse3.equals(getOrderResponse4));
        System.assert(getOrderResponse4.equals(getOrderResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOrderResponse getOrderResponse1 = OASGetOrderResponse.getExample();
        OASGetOrderResponse getOrderResponse2 = new OASGetOrderResponse();

        System.assertEquals(false, getOrderResponse1.equals('foo'));
        System.assertEquals(false, getOrderResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOrderResponse getOrderResponse1 = OASGetOrderResponse.getExample();
        OASGetOrderResponse getOrderResponse2 = new OASGetOrderResponse();
        OASGetOrderResponse getOrderResponse3;

        System.assertEquals(false, getOrderResponse1.equals(getOrderResponse3));
        System.assertEquals(false, getOrderResponse2.equals(getOrderResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOrderResponse getOrderResponse1 = OASGetOrderResponse.getExample();
        OASGetOrderResponse getOrderResponse2 = new OASGetOrderResponse();

        System.assertEquals(getOrderResponse1.hashCode(), getOrderResponse1.hashCode());
        System.assertEquals(getOrderResponse2.hashCode(), getOrderResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOrderResponse getOrderResponse1 = OASGetOrderResponse.getExample();
        OASGetOrderResponse getOrderResponse2 = OASGetOrderResponse.getExample();
        OASGetOrderResponse getOrderResponse3 = new OASGetOrderResponse();
        OASGetOrderResponse getOrderResponse4 = new OASGetOrderResponse();

        System.assert(getOrderResponse1.equals(getOrderResponse2));
        System.assert(getOrderResponse3.equals(getOrderResponse4));
        System.assertEquals(getOrderResponse1.hashCode(), getOrderResponse2.hashCode());
        System.assertEquals(getOrderResponse3.hashCode(), getOrderResponse4.hashCode());
    }
}
