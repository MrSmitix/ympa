@isTest
private class OASGetOfferMappingEntriesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse1 = OASGetOfferMappingEntriesResponse.getExample();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse2 = getOfferMappingEntriesResponse1;
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse3 = new OASGetOfferMappingEntriesResponse();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse4 = getOfferMappingEntriesResponse3;

        System.assert(getOfferMappingEntriesResponse1.equals(getOfferMappingEntriesResponse2));
        System.assert(getOfferMappingEntriesResponse2.equals(getOfferMappingEntriesResponse1));
        System.assert(getOfferMappingEntriesResponse1.equals(getOfferMappingEntriesResponse1));
        System.assert(getOfferMappingEntriesResponse3.equals(getOfferMappingEntriesResponse4));
        System.assert(getOfferMappingEntriesResponse4.equals(getOfferMappingEntriesResponse3));
        System.assert(getOfferMappingEntriesResponse3.equals(getOfferMappingEntriesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse1 = OASGetOfferMappingEntriesResponse.getExample();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse2 = OASGetOfferMappingEntriesResponse.getExample();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse3 = new OASGetOfferMappingEntriesResponse();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse4 = new OASGetOfferMappingEntriesResponse();

        System.assert(getOfferMappingEntriesResponse1.equals(getOfferMappingEntriesResponse2));
        System.assert(getOfferMappingEntriesResponse2.equals(getOfferMappingEntriesResponse1));
        System.assert(getOfferMappingEntriesResponse3.equals(getOfferMappingEntriesResponse4));
        System.assert(getOfferMappingEntriesResponse4.equals(getOfferMappingEntriesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse1 = OASGetOfferMappingEntriesResponse.getExample();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse2 = new OASGetOfferMappingEntriesResponse();

        System.assertEquals(false, getOfferMappingEntriesResponse1.equals('foo'));
        System.assertEquals(false, getOfferMappingEntriesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse1 = OASGetOfferMappingEntriesResponse.getExample();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse2 = new OASGetOfferMappingEntriesResponse();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse3;

        System.assertEquals(false, getOfferMappingEntriesResponse1.equals(getOfferMappingEntriesResponse3));
        System.assertEquals(false, getOfferMappingEntriesResponse2.equals(getOfferMappingEntriesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse1 = OASGetOfferMappingEntriesResponse.getExample();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse2 = new OASGetOfferMappingEntriesResponse();

        System.assertEquals(getOfferMappingEntriesResponse1.hashCode(), getOfferMappingEntriesResponse1.hashCode());
        System.assertEquals(getOfferMappingEntriesResponse2.hashCode(), getOfferMappingEntriesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse1 = OASGetOfferMappingEntriesResponse.getExample();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse2 = OASGetOfferMappingEntriesResponse.getExample();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse3 = new OASGetOfferMappingEntriesResponse();
        OASGetOfferMappingEntriesResponse getOfferMappingEntriesResponse4 = new OASGetOfferMappingEntriesResponse();

        System.assert(getOfferMappingEntriesResponse1.equals(getOfferMappingEntriesResponse2));
        System.assert(getOfferMappingEntriesResponse3.equals(getOfferMappingEntriesResponse4));
        System.assertEquals(getOfferMappingEntriesResponse1.hashCode(), getOfferMappingEntriesResponse2.hashCode());
        System.assertEquals(getOfferMappingEntriesResponse3.hashCode(), getOfferMappingEntriesResponse4.hashCode());
    }
}
