@isTest
private class OASGetSuggestedOfferMappingsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest1 = OASGetSuggestedOfferMappingsRequest.getExample();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest2 = getSuggestedOfferMappingsRequest1;
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest3 = new OASGetSuggestedOfferMappingsRequest();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest4 = getSuggestedOfferMappingsRequest3;

        System.assert(getSuggestedOfferMappingsRequest1.equals(getSuggestedOfferMappingsRequest2));
        System.assert(getSuggestedOfferMappingsRequest2.equals(getSuggestedOfferMappingsRequest1));
        System.assert(getSuggestedOfferMappingsRequest1.equals(getSuggestedOfferMappingsRequest1));
        System.assert(getSuggestedOfferMappingsRequest3.equals(getSuggestedOfferMappingsRequest4));
        System.assert(getSuggestedOfferMappingsRequest4.equals(getSuggestedOfferMappingsRequest3));
        System.assert(getSuggestedOfferMappingsRequest3.equals(getSuggestedOfferMappingsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest1 = OASGetSuggestedOfferMappingsRequest.getExample();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest2 = OASGetSuggestedOfferMappingsRequest.getExample();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest3 = new OASGetSuggestedOfferMappingsRequest();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest4 = new OASGetSuggestedOfferMappingsRequest();

        System.assert(getSuggestedOfferMappingsRequest1.equals(getSuggestedOfferMappingsRequest2));
        System.assert(getSuggestedOfferMappingsRequest2.equals(getSuggestedOfferMappingsRequest1));
        System.assert(getSuggestedOfferMappingsRequest3.equals(getSuggestedOfferMappingsRequest4));
        System.assert(getSuggestedOfferMappingsRequest4.equals(getSuggestedOfferMappingsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest1 = OASGetSuggestedOfferMappingsRequest.getExample();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest2 = new OASGetSuggestedOfferMappingsRequest();

        System.assertEquals(false, getSuggestedOfferMappingsRequest1.equals('foo'));
        System.assertEquals(false, getSuggestedOfferMappingsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest1 = OASGetSuggestedOfferMappingsRequest.getExample();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest2 = new OASGetSuggestedOfferMappingsRequest();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest3;

        System.assertEquals(false, getSuggestedOfferMappingsRequest1.equals(getSuggestedOfferMappingsRequest3));
        System.assertEquals(false, getSuggestedOfferMappingsRequest2.equals(getSuggestedOfferMappingsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest1 = OASGetSuggestedOfferMappingsRequest.getExample();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest2 = new OASGetSuggestedOfferMappingsRequest();

        System.assertEquals(getSuggestedOfferMappingsRequest1.hashCode(), getSuggestedOfferMappingsRequest1.hashCode());
        System.assertEquals(getSuggestedOfferMappingsRequest2.hashCode(), getSuggestedOfferMappingsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest1 = OASGetSuggestedOfferMappingsRequest.getExample();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest2 = OASGetSuggestedOfferMappingsRequest.getExample();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest3 = new OASGetSuggestedOfferMappingsRequest();
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest4 = new OASGetSuggestedOfferMappingsRequest();

        System.assert(getSuggestedOfferMappingsRequest1.equals(getSuggestedOfferMappingsRequest2));
        System.assert(getSuggestedOfferMappingsRequest3.equals(getSuggestedOfferMappingsRequest4));
        System.assertEquals(getSuggestedOfferMappingsRequest1.hashCode(), getSuggestedOfferMappingsRequest2.hashCode());
        System.assertEquals(getSuggestedOfferMappingsRequest3.hashCode(), getSuggestedOfferMappingsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = new OASGetSuggestedOfferMappingsRequest();
        System.assertEquals(new List<OASSuggestedOfferDTO>(), getSuggestedOfferMappingsRequest.offers);
    }
}
