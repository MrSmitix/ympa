@isTest
private class OASGetGoodsStatsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetGoodsStatsResponse getGoodsStatsResponse1 = OASGetGoodsStatsResponse.getExample();
        OASGetGoodsStatsResponse getGoodsStatsResponse2 = getGoodsStatsResponse1;
        OASGetGoodsStatsResponse getGoodsStatsResponse3 = new OASGetGoodsStatsResponse();
        OASGetGoodsStatsResponse getGoodsStatsResponse4 = getGoodsStatsResponse3;

        System.assert(getGoodsStatsResponse1.equals(getGoodsStatsResponse2));
        System.assert(getGoodsStatsResponse2.equals(getGoodsStatsResponse1));
        System.assert(getGoodsStatsResponse1.equals(getGoodsStatsResponse1));
        System.assert(getGoodsStatsResponse3.equals(getGoodsStatsResponse4));
        System.assert(getGoodsStatsResponse4.equals(getGoodsStatsResponse3));
        System.assert(getGoodsStatsResponse3.equals(getGoodsStatsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetGoodsStatsResponse getGoodsStatsResponse1 = OASGetGoodsStatsResponse.getExample();
        OASGetGoodsStatsResponse getGoodsStatsResponse2 = OASGetGoodsStatsResponse.getExample();
        OASGetGoodsStatsResponse getGoodsStatsResponse3 = new OASGetGoodsStatsResponse();
        OASGetGoodsStatsResponse getGoodsStatsResponse4 = new OASGetGoodsStatsResponse();

        System.assert(getGoodsStatsResponse1.equals(getGoodsStatsResponse2));
        System.assert(getGoodsStatsResponse2.equals(getGoodsStatsResponse1));
        System.assert(getGoodsStatsResponse3.equals(getGoodsStatsResponse4));
        System.assert(getGoodsStatsResponse4.equals(getGoodsStatsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetGoodsStatsResponse getGoodsStatsResponse1 = OASGetGoodsStatsResponse.getExample();
        OASGetGoodsStatsResponse getGoodsStatsResponse2 = new OASGetGoodsStatsResponse();

        System.assertEquals(false, getGoodsStatsResponse1.equals('foo'));
        System.assertEquals(false, getGoodsStatsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetGoodsStatsResponse getGoodsStatsResponse1 = OASGetGoodsStatsResponse.getExample();
        OASGetGoodsStatsResponse getGoodsStatsResponse2 = new OASGetGoodsStatsResponse();
        OASGetGoodsStatsResponse getGoodsStatsResponse3;

        System.assertEquals(false, getGoodsStatsResponse1.equals(getGoodsStatsResponse3));
        System.assertEquals(false, getGoodsStatsResponse2.equals(getGoodsStatsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetGoodsStatsResponse getGoodsStatsResponse1 = OASGetGoodsStatsResponse.getExample();
        OASGetGoodsStatsResponse getGoodsStatsResponse2 = new OASGetGoodsStatsResponse();

        System.assertEquals(getGoodsStatsResponse1.hashCode(), getGoodsStatsResponse1.hashCode());
        System.assertEquals(getGoodsStatsResponse2.hashCode(), getGoodsStatsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetGoodsStatsResponse getGoodsStatsResponse1 = OASGetGoodsStatsResponse.getExample();
        OASGetGoodsStatsResponse getGoodsStatsResponse2 = OASGetGoodsStatsResponse.getExample();
        OASGetGoodsStatsResponse getGoodsStatsResponse3 = new OASGetGoodsStatsResponse();
        OASGetGoodsStatsResponse getGoodsStatsResponse4 = new OASGetGoodsStatsResponse();

        System.assert(getGoodsStatsResponse1.equals(getGoodsStatsResponse2));
        System.assert(getGoodsStatsResponse3.equals(getGoodsStatsResponse4));
        System.assertEquals(getGoodsStatsResponse1.hashCode(), getGoodsStatsResponse2.hashCode());
        System.assertEquals(getGoodsStatsResponse3.hashCode(), getGoodsStatsResponse4.hashCode());
    }
}
