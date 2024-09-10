@isTest
private class OASGetModelsOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetModelsOffersResponse getModelsOffersResponse1 = OASGetModelsOffersResponse.getExample();
        OASGetModelsOffersResponse getModelsOffersResponse2 = getModelsOffersResponse1;
        OASGetModelsOffersResponse getModelsOffersResponse3 = new OASGetModelsOffersResponse();
        OASGetModelsOffersResponse getModelsOffersResponse4 = getModelsOffersResponse3;

        System.assert(getModelsOffersResponse1.equals(getModelsOffersResponse2));
        System.assert(getModelsOffersResponse2.equals(getModelsOffersResponse1));
        System.assert(getModelsOffersResponse1.equals(getModelsOffersResponse1));
        System.assert(getModelsOffersResponse3.equals(getModelsOffersResponse4));
        System.assert(getModelsOffersResponse4.equals(getModelsOffersResponse3));
        System.assert(getModelsOffersResponse3.equals(getModelsOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetModelsOffersResponse getModelsOffersResponse1 = OASGetModelsOffersResponse.getExample();
        OASGetModelsOffersResponse getModelsOffersResponse2 = OASGetModelsOffersResponse.getExample();
        OASGetModelsOffersResponse getModelsOffersResponse3 = new OASGetModelsOffersResponse();
        OASGetModelsOffersResponse getModelsOffersResponse4 = new OASGetModelsOffersResponse();

        System.assert(getModelsOffersResponse1.equals(getModelsOffersResponse2));
        System.assert(getModelsOffersResponse2.equals(getModelsOffersResponse1));
        System.assert(getModelsOffersResponse3.equals(getModelsOffersResponse4));
        System.assert(getModelsOffersResponse4.equals(getModelsOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetModelsOffersResponse getModelsOffersResponse1 = OASGetModelsOffersResponse.getExample();
        OASGetModelsOffersResponse getModelsOffersResponse2 = new OASGetModelsOffersResponse();

        System.assertEquals(false, getModelsOffersResponse1.equals('foo'));
        System.assertEquals(false, getModelsOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetModelsOffersResponse getModelsOffersResponse1 = OASGetModelsOffersResponse.getExample();
        OASGetModelsOffersResponse getModelsOffersResponse2 = new OASGetModelsOffersResponse();
        OASGetModelsOffersResponse getModelsOffersResponse3;

        System.assertEquals(false, getModelsOffersResponse1.equals(getModelsOffersResponse3));
        System.assertEquals(false, getModelsOffersResponse2.equals(getModelsOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetModelsOffersResponse getModelsOffersResponse1 = OASGetModelsOffersResponse.getExample();
        OASGetModelsOffersResponse getModelsOffersResponse2 = new OASGetModelsOffersResponse();

        System.assertEquals(getModelsOffersResponse1.hashCode(), getModelsOffersResponse1.hashCode());
        System.assertEquals(getModelsOffersResponse2.hashCode(), getModelsOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetModelsOffersResponse getModelsOffersResponse1 = OASGetModelsOffersResponse.getExample();
        OASGetModelsOffersResponse getModelsOffersResponse2 = OASGetModelsOffersResponse.getExample();
        OASGetModelsOffersResponse getModelsOffersResponse3 = new OASGetModelsOffersResponse();
        OASGetModelsOffersResponse getModelsOffersResponse4 = new OASGetModelsOffersResponse();

        System.assert(getModelsOffersResponse1.equals(getModelsOffersResponse2));
        System.assert(getModelsOffersResponse3.equals(getModelsOffersResponse4));
        System.assertEquals(getModelsOffersResponse1.hashCode(), getModelsOffersResponse2.hashCode());
        System.assertEquals(getModelsOffersResponse3.hashCode(), getModelsOffersResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGetModelsOffersResponse getModelsOffersResponse = new OASGetModelsOffersResponse();
        Map<String, String> x-property-mappings = getModelsOffersResponse.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetModelsOffersResponse getModelsOffersResponse = new OASGetModelsOffersResponse();
        System.assertEquals(new List<OASEnrichedModelDTO>(), getModelsOffersResponse.models);
        System.assertEquals(null, getModelsOffersResponse.r_currency);
        System.assertEquals(null, getModelsOffersResponse.regionId);
    }
}
