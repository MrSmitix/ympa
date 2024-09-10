@isTest
private class OASGetPricesByOfferIdsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse1 = OASGetPricesByOfferIdsResponse.getExample();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse2 = getPricesByOfferIdsResponse1;
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse3 = new OASGetPricesByOfferIdsResponse();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse4 = getPricesByOfferIdsResponse3;

        System.assert(getPricesByOfferIdsResponse1.equals(getPricesByOfferIdsResponse2));
        System.assert(getPricesByOfferIdsResponse2.equals(getPricesByOfferIdsResponse1));
        System.assert(getPricesByOfferIdsResponse1.equals(getPricesByOfferIdsResponse1));
        System.assert(getPricesByOfferIdsResponse3.equals(getPricesByOfferIdsResponse4));
        System.assert(getPricesByOfferIdsResponse4.equals(getPricesByOfferIdsResponse3));
        System.assert(getPricesByOfferIdsResponse3.equals(getPricesByOfferIdsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse1 = OASGetPricesByOfferIdsResponse.getExample();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse2 = OASGetPricesByOfferIdsResponse.getExample();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse3 = new OASGetPricesByOfferIdsResponse();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse4 = new OASGetPricesByOfferIdsResponse();

        System.assert(getPricesByOfferIdsResponse1.equals(getPricesByOfferIdsResponse2));
        System.assert(getPricesByOfferIdsResponse2.equals(getPricesByOfferIdsResponse1));
        System.assert(getPricesByOfferIdsResponse3.equals(getPricesByOfferIdsResponse4));
        System.assert(getPricesByOfferIdsResponse4.equals(getPricesByOfferIdsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse1 = OASGetPricesByOfferIdsResponse.getExample();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse2 = new OASGetPricesByOfferIdsResponse();

        System.assertEquals(false, getPricesByOfferIdsResponse1.equals('foo'));
        System.assertEquals(false, getPricesByOfferIdsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse1 = OASGetPricesByOfferIdsResponse.getExample();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse2 = new OASGetPricesByOfferIdsResponse();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse3;

        System.assertEquals(false, getPricesByOfferIdsResponse1.equals(getPricesByOfferIdsResponse3));
        System.assertEquals(false, getPricesByOfferIdsResponse2.equals(getPricesByOfferIdsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse1 = OASGetPricesByOfferIdsResponse.getExample();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse2 = new OASGetPricesByOfferIdsResponse();

        System.assertEquals(getPricesByOfferIdsResponse1.hashCode(), getPricesByOfferIdsResponse1.hashCode());
        System.assertEquals(getPricesByOfferIdsResponse2.hashCode(), getPricesByOfferIdsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse1 = OASGetPricesByOfferIdsResponse.getExample();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse2 = OASGetPricesByOfferIdsResponse.getExample();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse3 = new OASGetPricesByOfferIdsResponse();
        OASGetPricesByOfferIdsResponse getPricesByOfferIdsResponse4 = new OASGetPricesByOfferIdsResponse();

        System.assert(getPricesByOfferIdsResponse1.equals(getPricesByOfferIdsResponse2));
        System.assert(getPricesByOfferIdsResponse3.equals(getPricesByOfferIdsResponse4));
        System.assertEquals(getPricesByOfferIdsResponse1.hashCode(), getPricesByOfferIdsResponse2.hashCode());
        System.assertEquals(getPricesByOfferIdsResponse3.hashCode(), getPricesByOfferIdsResponse4.hashCode());
    }
}
