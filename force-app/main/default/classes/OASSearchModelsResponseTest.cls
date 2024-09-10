@isTest
private class OASSearchModelsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSearchModelsResponse searchModelsResponse1 = OASSearchModelsResponse.getExample();
        OASSearchModelsResponse searchModelsResponse2 = searchModelsResponse1;
        OASSearchModelsResponse searchModelsResponse3 = new OASSearchModelsResponse();
        OASSearchModelsResponse searchModelsResponse4 = searchModelsResponse3;

        System.assert(searchModelsResponse1.equals(searchModelsResponse2));
        System.assert(searchModelsResponse2.equals(searchModelsResponse1));
        System.assert(searchModelsResponse1.equals(searchModelsResponse1));
        System.assert(searchModelsResponse3.equals(searchModelsResponse4));
        System.assert(searchModelsResponse4.equals(searchModelsResponse3));
        System.assert(searchModelsResponse3.equals(searchModelsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSearchModelsResponse searchModelsResponse1 = OASSearchModelsResponse.getExample();
        OASSearchModelsResponse searchModelsResponse2 = OASSearchModelsResponse.getExample();
        OASSearchModelsResponse searchModelsResponse3 = new OASSearchModelsResponse();
        OASSearchModelsResponse searchModelsResponse4 = new OASSearchModelsResponse();

        System.assert(searchModelsResponse1.equals(searchModelsResponse2));
        System.assert(searchModelsResponse2.equals(searchModelsResponse1));
        System.assert(searchModelsResponse3.equals(searchModelsResponse4));
        System.assert(searchModelsResponse4.equals(searchModelsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSearchModelsResponse searchModelsResponse1 = OASSearchModelsResponse.getExample();
        OASSearchModelsResponse searchModelsResponse2 = new OASSearchModelsResponse();

        System.assertEquals(false, searchModelsResponse1.equals('foo'));
        System.assertEquals(false, searchModelsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSearchModelsResponse searchModelsResponse1 = OASSearchModelsResponse.getExample();
        OASSearchModelsResponse searchModelsResponse2 = new OASSearchModelsResponse();
        OASSearchModelsResponse searchModelsResponse3;

        System.assertEquals(false, searchModelsResponse1.equals(searchModelsResponse3));
        System.assertEquals(false, searchModelsResponse2.equals(searchModelsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSearchModelsResponse searchModelsResponse1 = OASSearchModelsResponse.getExample();
        OASSearchModelsResponse searchModelsResponse2 = new OASSearchModelsResponse();

        System.assertEquals(searchModelsResponse1.hashCode(), searchModelsResponse1.hashCode());
        System.assertEquals(searchModelsResponse2.hashCode(), searchModelsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSearchModelsResponse searchModelsResponse1 = OASSearchModelsResponse.getExample();
        OASSearchModelsResponse searchModelsResponse2 = OASSearchModelsResponse.getExample();
        OASSearchModelsResponse searchModelsResponse3 = new OASSearchModelsResponse();
        OASSearchModelsResponse searchModelsResponse4 = new OASSearchModelsResponse();

        System.assert(searchModelsResponse1.equals(searchModelsResponse2));
        System.assert(searchModelsResponse3.equals(searchModelsResponse4));
        System.assertEquals(searchModelsResponse1.hashCode(), searchModelsResponse2.hashCode());
        System.assertEquals(searchModelsResponse3.hashCode(), searchModelsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSearchModelsResponse searchModelsResponse = new OASSearchModelsResponse();
        Map<String, String> x-property-mappings = searchModelsResponse.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSearchModelsResponse searchModelsResponse = new OASSearchModelsResponse();
        System.assertEquals(new List<OASModelDTO>(), searchModelsResponse.models);
        System.assertEquals(null, searchModelsResponse.r_currency);
        System.assertEquals(null, searchModelsResponse.regionId);
        System.assertEquals(null, searchModelsResponse.pager);
    }
}
