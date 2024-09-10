@isTest
private class OASUpdateOfferMappingsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse1 = OASUpdateOfferMappingsResponse.getExample();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse2 = updateOfferMappingsResponse1;
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse3 = new OASUpdateOfferMappingsResponse();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse4 = updateOfferMappingsResponse3;

        System.assert(updateOfferMappingsResponse1.equals(updateOfferMappingsResponse2));
        System.assert(updateOfferMappingsResponse2.equals(updateOfferMappingsResponse1));
        System.assert(updateOfferMappingsResponse1.equals(updateOfferMappingsResponse1));
        System.assert(updateOfferMappingsResponse3.equals(updateOfferMappingsResponse4));
        System.assert(updateOfferMappingsResponse4.equals(updateOfferMappingsResponse3));
        System.assert(updateOfferMappingsResponse3.equals(updateOfferMappingsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse1 = OASUpdateOfferMappingsResponse.getExample();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse2 = OASUpdateOfferMappingsResponse.getExample();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse3 = new OASUpdateOfferMappingsResponse();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse4 = new OASUpdateOfferMappingsResponse();

        System.assert(updateOfferMappingsResponse1.equals(updateOfferMappingsResponse2));
        System.assert(updateOfferMappingsResponse2.equals(updateOfferMappingsResponse1));
        System.assert(updateOfferMappingsResponse3.equals(updateOfferMappingsResponse4));
        System.assert(updateOfferMappingsResponse4.equals(updateOfferMappingsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse1 = OASUpdateOfferMappingsResponse.getExample();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse2 = new OASUpdateOfferMappingsResponse();

        System.assertEquals(false, updateOfferMappingsResponse1.equals('foo'));
        System.assertEquals(false, updateOfferMappingsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse1 = OASUpdateOfferMappingsResponse.getExample();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse2 = new OASUpdateOfferMappingsResponse();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse3;

        System.assertEquals(false, updateOfferMappingsResponse1.equals(updateOfferMappingsResponse3));
        System.assertEquals(false, updateOfferMappingsResponse2.equals(updateOfferMappingsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse1 = OASUpdateOfferMappingsResponse.getExample();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse2 = new OASUpdateOfferMappingsResponse();

        System.assertEquals(updateOfferMappingsResponse1.hashCode(), updateOfferMappingsResponse1.hashCode());
        System.assertEquals(updateOfferMappingsResponse2.hashCode(), updateOfferMappingsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse1 = OASUpdateOfferMappingsResponse.getExample();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse2 = OASUpdateOfferMappingsResponse.getExample();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse3 = new OASUpdateOfferMappingsResponse();
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse4 = new OASUpdateOfferMappingsResponse();

        System.assert(updateOfferMappingsResponse1.equals(updateOfferMappingsResponse2));
        System.assert(updateOfferMappingsResponse3.equals(updateOfferMappingsResponse4));
        System.assertEquals(updateOfferMappingsResponse1.hashCode(), updateOfferMappingsResponse2.hashCode());
        System.assertEquals(updateOfferMappingsResponse3.hashCode(), updateOfferMappingsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOfferMappingsResponse updateOfferMappingsResponse = new OASUpdateOfferMappingsResponse();
        System.assertEquals(new List<OASUpdateOfferMappingResultDTO>(), updateOfferMappingsResponse.results);
        System.assertEquals(null, updateOfferMappingsResponse.status);
    }
}
