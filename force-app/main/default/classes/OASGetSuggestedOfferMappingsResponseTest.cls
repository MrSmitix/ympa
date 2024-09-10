@isTest
private class OASGetSuggestedOfferMappingsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse1 = OASGetSuggestedOfferMappingsResponse.getExample();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse2 = getSuggestedOfferMappingsResponse1;
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse3 = new OASGetSuggestedOfferMappingsResponse();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse4 = getSuggestedOfferMappingsResponse3;

        System.assert(getSuggestedOfferMappingsResponse1.equals(getSuggestedOfferMappingsResponse2));
        System.assert(getSuggestedOfferMappingsResponse2.equals(getSuggestedOfferMappingsResponse1));
        System.assert(getSuggestedOfferMappingsResponse1.equals(getSuggestedOfferMappingsResponse1));
        System.assert(getSuggestedOfferMappingsResponse3.equals(getSuggestedOfferMappingsResponse4));
        System.assert(getSuggestedOfferMappingsResponse4.equals(getSuggestedOfferMappingsResponse3));
        System.assert(getSuggestedOfferMappingsResponse3.equals(getSuggestedOfferMappingsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse1 = OASGetSuggestedOfferMappingsResponse.getExample();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse2 = OASGetSuggestedOfferMappingsResponse.getExample();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse3 = new OASGetSuggestedOfferMappingsResponse();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse4 = new OASGetSuggestedOfferMappingsResponse();

        System.assert(getSuggestedOfferMappingsResponse1.equals(getSuggestedOfferMappingsResponse2));
        System.assert(getSuggestedOfferMappingsResponse2.equals(getSuggestedOfferMappingsResponse1));
        System.assert(getSuggestedOfferMappingsResponse3.equals(getSuggestedOfferMappingsResponse4));
        System.assert(getSuggestedOfferMappingsResponse4.equals(getSuggestedOfferMappingsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse1 = OASGetSuggestedOfferMappingsResponse.getExample();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse2 = new OASGetSuggestedOfferMappingsResponse();

        System.assertEquals(false, getSuggestedOfferMappingsResponse1.equals('foo'));
        System.assertEquals(false, getSuggestedOfferMappingsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse1 = OASGetSuggestedOfferMappingsResponse.getExample();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse2 = new OASGetSuggestedOfferMappingsResponse();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse3;

        System.assertEquals(false, getSuggestedOfferMappingsResponse1.equals(getSuggestedOfferMappingsResponse3));
        System.assertEquals(false, getSuggestedOfferMappingsResponse2.equals(getSuggestedOfferMappingsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse1 = OASGetSuggestedOfferMappingsResponse.getExample();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse2 = new OASGetSuggestedOfferMappingsResponse();

        System.assertEquals(getSuggestedOfferMappingsResponse1.hashCode(), getSuggestedOfferMappingsResponse1.hashCode());
        System.assertEquals(getSuggestedOfferMappingsResponse2.hashCode(), getSuggestedOfferMappingsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse1 = OASGetSuggestedOfferMappingsResponse.getExample();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse2 = OASGetSuggestedOfferMappingsResponse.getExample();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse3 = new OASGetSuggestedOfferMappingsResponse();
        OASGetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse4 = new OASGetSuggestedOfferMappingsResponse();

        System.assert(getSuggestedOfferMappingsResponse1.equals(getSuggestedOfferMappingsResponse2));
        System.assert(getSuggestedOfferMappingsResponse3.equals(getSuggestedOfferMappingsResponse4));
        System.assertEquals(getSuggestedOfferMappingsResponse1.hashCode(), getSuggestedOfferMappingsResponse2.hashCode());
        System.assertEquals(getSuggestedOfferMappingsResponse3.hashCode(), getSuggestedOfferMappingsResponse4.hashCode());
    }
}
