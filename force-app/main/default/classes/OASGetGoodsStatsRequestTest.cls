@isTest
private class OASGetGoodsStatsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetGoodsStatsRequest getGoodsStatsRequest1 = OASGetGoodsStatsRequest.getExample();
        OASGetGoodsStatsRequest getGoodsStatsRequest2 = getGoodsStatsRequest1;
        OASGetGoodsStatsRequest getGoodsStatsRequest3 = new OASGetGoodsStatsRequest();
        OASGetGoodsStatsRequest getGoodsStatsRequest4 = getGoodsStatsRequest3;

        System.assert(getGoodsStatsRequest1.equals(getGoodsStatsRequest2));
        System.assert(getGoodsStatsRequest2.equals(getGoodsStatsRequest1));
        System.assert(getGoodsStatsRequest1.equals(getGoodsStatsRequest1));
        System.assert(getGoodsStatsRequest3.equals(getGoodsStatsRequest4));
        System.assert(getGoodsStatsRequest4.equals(getGoodsStatsRequest3));
        System.assert(getGoodsStatsRequest3.equals(getGoodsStatsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetGoodsStatsRequest getGoodsStatsRequest1 = OASGetGoodsStatsRequest.getExample();
        OASGetGoodsStatsRequest getGoodsStatsRequest2 = OASGetGoodsStatsRequest.getExample();
        OASGetGoodsStatsRequest getGoodsStatsRequest3 = new OASGetGoodsStatsRequest();
        OASGetGoodsStatsRequest getGoodsStatsRequest4 = new OASGetGoodsStatsRequest();

        System.assert(getGoodsStatsRequest1.equals(getGoodsStatsRequest2));
        System.assert(getGoodsStatsRequest2.equals(getGoodsStatsRequest1));
        System.assert(getGoodsStatsRequest3.equals(getGoodsStatsRequest4));
        System.assert(getGoodsStatsRequest4.equals(getGoodsStatsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetGoodsStatsRequest getGoodsStatsRequest1 = OASGetGoodsStatsRequest.getExample();
        OASGetGoodsStatsRequest getGoodsStatsRequest2 = new OASGetGoodsStatsRequest();

        System.assertEquals(false, getGoodsStatsRequest1.equals('foo'));
        System.assertEquals(false, getGoodsStatsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetGoodsStatsRequest getGoodsStatsRequest1 = OASGetGoodsStatsRequest.getExample();
        OASGetGoodsStatsRequest getGoodsStatsRequest2 = new OASGetGoodsStatsRequest();
        OASGetGoodsStatsRequest getGoodsStatsRequest3;

        System.assertEquals(false, getGoodsStatsRequest1.equals(getGoodsStatsRequest3));
        System.assertEquals(false, getGoodsStatsRequest2.equals(getGoodsStatsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetGoodsStatsRequest getGoodsStatsRequest1 = OASGetGoodsStatsRequest.getExample();
        OASGetGoodsStatsRequest getGoodsStatsRequest2 = new OASGetGoodsStatsRequest();

        System.assertEquals(getGoodsStatsRequest1.hashCode(), getGoodsStatsRequest1.hashCode());
        System.assertEquals(getGoodsStatsRequest2.hashCode(), getGoodsStatsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetGoodsStatsRequest getGoodsStatsRequest1 = OASGetGoodsStatsRequest.getExample();
        OASGetGoodsStatsRequest getGoodsStatsRequest2 = OASGetGoodsStatsRequest.getExample();
        OASGetGoodsStatsRequest getGoodsStatsRequest3 = new OASGetGoodsStatsRequest();
        OASGetGoodsStatsRequest getGoodsStatsRequest4 = new OASGetGoodsStatsRequest();

        System.assert(getGoodsStatsRequest1.equals(getGoodsStatsRequest2));
        System.assert(getGoodsStatsRequest3.equals(getGoodsStatsRequest4));
        System.assertEquals(getGoodsStatsRequest1.hashCode(), getGoodsStatsRequest2.hashCode());
        System.assertEquals(getGoodsStatsRequest3.hashCode(), getGoodsStatsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetGoodsStatsRequest getGoodsStatsRequest = new OASGetGoodsStatsRequest();
        System.assertEquals(new List<String>(), getGoodsStatsRequest.shopSkus);
    }
}
