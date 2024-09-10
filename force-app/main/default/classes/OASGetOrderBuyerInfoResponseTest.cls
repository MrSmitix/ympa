@isTest
private class OASGetOrderBuyerInfoResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse1 = OASGetOrderBuyerInfoResponse.getExample();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse2 = getOrderBuyerInfoResponse1;
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse3 = new OASGetOrderBuyerInfoResponse();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse4 = getOrderBuyerInfoResponse3;

        System.assert(getOrderBuyerInfoResponse1.equals(getOrderBuyerInfoResponse2));
        System.assert(getOrderBuyerInfoResponse2.equals(getOrderBuyerInfoResponse1));
        System.assert(getOrderBuyerInfoResponse1.equals(getOrderBuyerInfoResponse1));
        System.assert(getOrderBuyerInfoResponse3.equals(getOrderBuyerInfoResponse4));
        System.assert(getOrderBuyerInfoResponse4.equals(getOrderBuyerInfoResponse3));
        System.assert(getOrderBuyerInfoResponse3.equals(getOrderBuyerInfoResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse1 = OASGetOrderBuyerInfoResponse.getExample();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse2 = OASGetOrderBuyerInfoResponse.getExample();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse3 = new OASGetOrderBuyerInfoResponse();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse4 = new OASGetOrderBuyerInfoResponse();

        System.assert(getOrderBuyerInfoResponse1.equals(getOrderBuyerInfoResponse2));
        System.assert(getOrderBuyerInfoResponse2.equals(getOrderBuyerInfoResponse1));
        System.assert(getOrderBuyerInfoResponse3.equals(getOrderBuyerInfoResponse4));
        System.assert(getOrderBuyerInfoResponse4.equals(getOrderBuyerInfoResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse1 = OASGetOrderBuyerInfoResponse.getExample();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse2 = new OASGetOrderBuyerInfoResponse();

        System.assertEquals(false, getOrderBuyerInfoResponse1.equals('foo'));
        System.assertEquals(false, getOrderBuyerInfoResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse1 = OASGetOrderBuyerInfoResponse.getExample();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse2 = new OASGetOrderBuyerInfoResponse();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse3;

        System.assertEquals(false, getOrderBuyerInfoResponse1.equals(getOrderBuyerInfoResponse3));
        System.assertEquals(false, getOrderBuyerInfoResponse2.equals(getOrderBuyerInfoResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse1 = OASGetOrderBuyerInfoResponse.getExample();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse2 = new OASGetOrderBuyerInfoResponse();

        System.assertEquals(getOrderBuyerInfoResponse1.hashCode(), getOrderBuyerInfoResponse1.hashCode());
        System.assertEquals(getOrderBuyerInfoResponse2.hashCode(), getOrderBuyerInfoResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse1 = OASGetOrderBuyerInfoResponse.getExample();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse2 = OASGetOrderBuyerInfoResponse.getExample();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse3 = new OASGetOrderBuyerInfoResponse();
        OASGetOrderBuyerInfoResponse getOrderBuyerInfoResponse4 = new OASGetOrderBuyerInfoResponse();

        System.assert(getOrderBuyerInfoResponse1.equals(getOrderBuyerInfoResponse2));
        System.assert(getOrderBuyerInfoResponse3.equals(getOrderBuyerInfoResponse4));
        System.assertEquals(getOrderBuyerInfoResponse1.hashCode(), getOrderBuyerInfoResponse2.hashCode());
        System.assertEquals(getOrderBuyerInfoResponse3.hashCode(), getOrderBuyerInfoResponse4.hashCode());
    }
}
