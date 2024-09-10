@isTest
private class OASGetPricesByOfferIdsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest1 = OASGetPricesByOfferIdsRequest.getExample();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest2 = getPricesByOfferIdsRequest1;
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest3 = new OASGetPricesByOfferIdsRequest();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest4 = getPricesByOfferIdsRequest3;

        System.assert(getPricesByOfferIdsRequest1.equals(getPricesByOfferIdsRequest2));
        System.assert(getPricesByOfferIdsRequest2.equals(getPricesByOfferIdsRequest1));
        System.assert(getPricesByOfferIdsRequest1.equals(getPricesByOfferIdsRequest1));
        System.assert(getPricesByOfferIdsRequest3.equals(getPricesByOfferIdsRequest4));
        System.assert(getPricesByOfferIdsRequest4.equals(getPricesByOfferIdsRequest3));
        System.assert(getPricesByOfferIdsRequest3.equals(getPricesByOfferIdsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest1 = OASGetPricesByOfferIdsRequest.getExample();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest2 = OASGetPricesByOfferIdsRequest.getExample();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest3 = new OASGetPricesByOfferIdsRequest();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest4 = new OASGetPricesByOfferIdsRequest();

        System.assert(getPricesByOfferIdsRequest1.equals(getPricesByOfferIdsRequest2));
        System.assert(getPricesByOfferIdsRequest2.equals(getPricesByOfferIdsRequest1));
        System.assert(getPricesByOfferIdsRequest3.equals(getPricesByOfferIdsRequest4));
        System.assert(getPricesByOfferIdsRequest4.equals(getPricesByOfferIdsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest1 = OASGetPricesByOfferIdsRequest.getExample();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest2 = new OASGetPricesByOfferIdsRequest();

        System.assertEquals(false, getPricesByOfferIdsRequest1.equals('foo'));
        System.assertEquals(false, getPricesByOfferIdsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest1 = OASGetPricesByOfferIdsRequest.getExample();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest2 = new OASGetPricesByOfferIdsRequest();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest3;

        System.assertEquals(false, getPricesByOfferIdsRequest1.equals(getPricesByOfferIdsRequest3));
        System.assertEquals(false, getPricesByOfferIdsRequest2.equals(getPricesByOfferIdsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest1 = OASGetPricesByOfferIdsRequest.getExample();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest2 = new OASGetPricesByOfferIdsRequest();

        System.assertEquals(getPricesByOfferIdsRequest1.hashCode(), getPricesByOfferIdsRequest1.hashCode());
        System.assertEquals(getPricesByOfferIdsRequest2.hashCode(), getPricesByOfferIdsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest1 = OASGetPricesByOfferIdsRequest.getExample();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest2 = OASGetPricesByOfferIdsRequest.getExample();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest3 = new OASGetPricesByOfferIdsRequest();
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest4 = new OASGetPricesByOfferIdsRequest();

        System.assert(getPricesByOfferIdsRequest1.equals(getPricesByOfferIdsRequest2));
        System.assert(getPricesByOfferIdsRequest3.equals(getPricesByOfferIdsRequest4));
        System.assertEquals(getPricesByOfferIdsRequest1.hashCode(), getPricesByOfferIdsRequest2.hashCode());
        System.assertEquals(getPricesByOfferIdsRequest3.hashCode(), getPricesByOfferIdsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetPricesByOfferIdsRequest getPricesByOfferIdsRequest = new OASGetPricesByOfferIdsRequest();
        System.assertEquals(new List<String>(), getPricesByOfferIdsRequest.offerIds);
    }
}
