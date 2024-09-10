@isTest
private class OASGetSuggestedOfferMappingEntriesReTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse1 = OASGetSuggestedOfferMappingEntriesRe.getExample();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse2 = getSuggestedOfferMappingEntriesResponse1;
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse3 = new OASGetSuggestedOfferMappingEntriesRe();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse4 = getSuggestedOfferMappingEntriesResponse3;

        System.assert(getSuggestedOfferMappingEntriesResponse1.equals(getSuggestedOfferMappingEntriesResponse2));
        System.assert(getSuggestedOfferMappingEntriesResponse2.equals(getSuggestedOfferMappingEntriesResponse1));
        System.assert(getSuggestedOfferMappingEntriesResponse1.equals(getSuggestedOfferMappingEntriesResponse1));
        System.assert(getSuggestedOfferMappingEntriesResponse3.equals(getSuggestedOfferMappingEntriesResponse4));
        System.assert(getSuggestedOfferMappingEntriesResponse4.equals(getSuggestedOfferMappingEntriesResponse3));
        System.assert(getSuggestedOfferMappingEntriesResponse3.equals(getSuggestedOfferMappingEntriesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse1 = OASGetSuggestedOfferMappingEntriesRe.getExample();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse2 = OASGetSuggestedOfferMappingEntriesRe.getExample();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse3 = new OASGetSuggestedOfferMappingEntriesRe();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse4 = new OASGetSuggestedOfferMappingEntriesRe();

        System.assert(getSuggestedOfferMappingEntriesResponse1.equals(getSuggestedOfferMappingEntriesResponse2));
        System.assert(getSuggestedOfferMappingEntriesResponse2.equals(getSuggestedOfferMappingEntriesResponse1));
        System.assert(getSuggestedOfferMappingEntriesResponse3.equals(getSuggestedOfferMappingEntriesResponse4));
        System.assert(getSuggestedOfferMappingEntriesResponse4.equals(getSuggestedOfferMappingEntriesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse1 = OASGetSuggestedOfferMappingEntriesRe.getExample();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse2 = new OASGetSuggestedOfferMappingEntriesRe();

        System.assertEquals(false, getSuggestedOfferMappingEntriesResponse1.equals('foo'));
        System.assertEquals(false, getSuggestedOfferMappingEntriesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse1 = OASGetSuggestedOfferMappingEntriesRe.getExample();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse2 = new OASGetSuggestedOfferMappingEntriesRe();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse3;

        System.assertEquals(false, getSuggestedOfferMappingEntriesResponse1.equals(getSuggestedOfferMappingEntriesResponse3));
        System.assertEquals(false, getSuggestedOfferMappingEntriesResponse2.equals(getSuggestedOfferMappingEntriesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse1 = OASGetSuggestedOfferMappingEntriesRe.getExample();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse2 = new OASGetSuggestedOfferMappingEntriesRe();

        System.assertEquals(getSuggestedOfferMappingEntriesResponse1.hashCode(), getSuggestedOfferMappingEntriesResponse1.hashCode());
        System.assertEquals(getSuggestedOfferMappingEntriesResponse2.hashCode(), getSuggestedOfferMappingEntriesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse1 = OASGetSuggestedOfferMappingEntriesRe.getExample();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse2 = OASGetSuggestedOfferMappingEntriesRe.getExample();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse3 = new OASGetSuggestedOfferMappingEntriesRe();
        OASGetSuggestedOfferMappingEntriesRe getSuggestedOfferMappingEntriesResponse4 = new OASGetSuggestedOfferMappingEntriesRe();

        System.assert(getSuggestedOfferMappingEntriesResponse1.equals(getSuggestedOfferMappingEntriesResponse2));
        System.assert(getSuggestedOfferMappingEntriesResponse3.equals(getSuggestedOfferMappingEntriesResponse4));
        System.assertEquals(getSuggestedOfferMappingEntriesResponse1.hashCode(), getSuggestedOfferMappingEntriesResponse2.hashCode());
        System.assertEquals(getSuggestedOfferMappingEntriesResponse3.hashCode(), getSuggestedOfferMappingEntriesResponse4.hashCode());
    }
}
