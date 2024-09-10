@isTest
private class OASGetOrdersStatsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOrdersStatsResponse getOrdersStatsResponse1 = OASGetOrdersStatsResponse.getExample();
        OASGetOrdersStatsResponse getOrdersStatsResponse2 = getOrdersStatsResponse1;
        OASGetOrdersStatsResponse getOrdersStatsResponse3 = new OASGetOrdersStatsResponse();
        OASGetOrdersStatsResponse getOrdersStatsResponse4 = getOrdersStatsResponse3;

        System.assert(getOrdersStatsResponse1.equals(getOrdersStatsResponse2));
        System.assert(getOrdersStatsResponse2.equals(getOrdersStatsResponse1));
        System.assert(getOrdersStatsResponse1.equals(getOrdersStatsResponse1));
        System.assert(getOrdersStatsResponse3.equals(getOrdersStatsResponse4));
        System.assert(getOrdersStatsResponse4.equals(getOrdersStatsResponse3));
        System.assert(getOrdersStatsResponse3.equals(getOrdersStatsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOrdersStatsResponse getOrdersStatsResponse1 = OASGetOrdersStatsResponse.getExample();
        OASGetOrdersStatsResponse getOrdersStatsResponse2 = OASGetOrdersStatsResponse.getExample();
        OASGetOrdersStatsResponse getOrdersStatsResponse3 = new OASGetOrdersStatsResponse();
        OASGetOrdersStatsResponse getOrdersStatsResponse4 = new OASGetOrdersStatsResponse();

        System.assert(getOrdersStatsResponse1.equals(getOrdersStatsResponse2));
        System.assert(getOrdersStatsResponse2.equals(getOrdersStatsResponse1));
        System.assert(getOrdersStatsResponse3.equals(getOrdersStatsResponse4));
        System.assert(getOrdersStatsResponse4.equals(getOrdersStatsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOrdersStatsResponse getOrdersStatsResponse1 = OASGetOrdersStatsResponse.getExample();
        OASGetOrdersStatsResponse getOrdersStatsResponse2 = new OASGetOrdersStatsResponse();

        System.assertEquals(false, getOrdersStatsResponse1.equals('foo'));
        System.assertEquals(false, getOrdersStatsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOrdersStatsResponse getOrdersStatsResponse1 = OASGetOrdersStatsResponse.getExample();
        OASGetOrdersStatsResponse getOrdersStatsResponse2 = new OASGetOrdersStatsResponse();
        OASGetOrdersStatsResponse getOrdersStatsResponse3;

        System.assertEquals(false, getOrdersStatsResponse1.equals(getOrdersStatsResponse3));
        System.assertEquals(false, getOrdersStatsResponse2.equals(getOrdersStatsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOrdersStatsResponse getOrdersStatsResponse1 = OASGetOrdersStatsResponse.getExample();
        OASGetOrdersStatsResponse getOrdersStatsResponse2 = new OASGetOrdersStatsResponse();

        System.assertEquals(getOrdersStatsResponse1.hashCode(), getOrdersStatsResponse1.hashCode());
        System.assertEquals(getOrdersStatsResponse2.hashCode(), getOrdersStatsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOrdersStatsResponse getOrdersStatsResponse1 = OASGetOrdersStatsResponse.getExample();
        OASGetOrdersStatsResponse getOrdersStatsResponse2 = OASGetOrdersStatsResponse.getExample();
        OASGetOrdersStatsResponse getOrdersStatsResponse3 = new OASGetOrdersStatsResponse();
        OASGetOrdersStatsResponse getOrdersStatsResponse4 = new OASGetOrdersStatsResponse();

        System.assert(getOrdersStatsResponse1.equals(getOrdersStatsResponse2));
        System.assert(getOrdersStatsResponse3.equals(getOrdersStatsResponse4));
        System.assertEquals(getOrdersStatsResponse1.hashCode(), getOrdersStatsResponse2.hashCode());
        System.assertEquals(getOrdersStatsResponse3.hashCode(), getOrdersStatsResponse4.hashCode());
    }
}
