@isTest
private class OASGetOfferMappingsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferMappingsResponse getOfferMappingsResponse1 = OASGetOfferMappingsResponse.getExample();
        OASGetOfferMappingsResponse getOfferMappingsResponse2 = getOfferMappingsResponse1;
        OASGetOfferMappingsResponse getOfferMappingsResponse3 = new OASGetOfferMappingsResponse();
        OASGetOfferMappingsResponse getOfferMappingsResponse4 = getOfferMappingsResponse3;

        System.assert(getOfferMappingsResponse1.equals(getOfferMappingsResponse2));
        System.assert(getOfferMappingsResponse2.equals(getOfferMappingsResponse1));
        System.assert(getOfferMappingsResponse1.equals(getOfferMappingsResponse1));
        System.assert(getOfferMappingsResponse3.equals(getOfferMappingsResponse4));
        System.assert(getOfferMappingsResponse4.equals(getOfferMappingsResponse3));
        System.assert(getOfferMappingsResponse3.equals(getOfferMappingsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferMappingsResponse getOfferMappingsResponse1 = OASGetOfferMappingsResponse.getExample();
        OASGetOfferMappingsResponse getOfferMappingsResponse2 = OASGetOfferMappingsResponse.getExample();
        OASGetOfferMappingsResponse getOfferMappingsResponse3 = new OASGetOfferMappingsResponse();
        OASGetOfferMappingsResponse getOfferMappingsResponse4 = new OASGetOfferMappingsResponse();

        System.assert(getOfferMappingsResponse1.equals(getOfferMappingsResponse2));
        System.assert(getOfferMappingsResponse2.equals(getOfferMappingsResponse1));
        System.assert(getOfferMappingsResponse3.equals(getOfferMappingsResponse4));
        System.assert(getOfferMappingsResponse4.equals(getOfferMappingsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferMappingsResponse getOfferMappingsResponse1 = OASGetOfferMappingsResponse.getExample();
        OASGetOfferMappingsResponse getOfferMappingsResponse2 = new OASGetOfferMappingsResponse();

        System.assertEquals(false, getOfferMappingsResponse1.equals('foo'));
        System.assertEquals(false, getOfferMappingsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferMappingsResponse getOfferMappingsResponse1 = OASGetOfferMappingsResponse.getExample();
        OASGetOfferMappingsResponse getOfferMappingsResponse2 = new OASGetOfferMappingsResponse();
        OASGetOfferMappingsResponse getOfferMappingsResponse3;

        System.assertEquals(false, getOfferMappingsResponse1.equals(getOfferMappingsResponse3));
        System.assertEquals(false, getOfferMappingsResponse2.equals(getOfferMappingsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferMappingsResponse getOfferMappingsResponse1 = OASGetOfferMappingsResponse.getExample();
        OASGetOfferMappingsResponse getOfferMappingsResponse2 = new OASGetOfferMappingsResponse();

        System.assertEquals(getOfferMappingsResponse1.hashCode(), getOfferMappingsResponse1.hashCode());
        System.assertEquals(getOfferMappingsResponse2.hashCode(), getOfferMappingsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferMappingsResponse getOfferMappingsResponse1 = OASGetOfferMappingsResponse.getExample();
        OASGetOfferMappingsResponse getOfferMappingsResponse2 = OASGetOfferMappingsResponse.getExample();
        OASGetOfferMappingsResponse getOfferMappingsResponse3 = new OASGetOfferMappingsResponse();
        OASGetOfferMappingsResponse getOfferMappingsResponse4 = new OASGetOfferMappingsResponse();

        System.assert(getOfferMappingsResponse1.equals(getOfferMappingsResponse2));
        System.assert(getOfferMappingsResponse3.equals(getOfferMappingsResponse4));
        System.assertEquals(getOfferMappingsResponse1.hashCode(), getOfferMappingsResponse2.hashCode());
        System.assertEquals(getOfferMappingsResponse3.hashCode(), getOfferMappingsResponse4.hashCode());
    }
}
