@isTest
private class OASGetModelsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetModelsResponse getModelsResponse1 = OASGetModelsResponse.getExample();
        OASGetModelsResponse getModelsResponse2 = getModelsResponse1;
        OASGetModelsResponse getModelsResponse3 = new OASGetModelsResponse();
        OASGetModelsResponse getModelsResponse4 = getModelsResponse3;

        System.assert(getModelsResponse1.equals(getModelsResponse2));
        System.assert(getModelsResponse2.equals(getModelsResponse1));
        System.assert(getModelsResponse1.equals(getModelsResponse1));
        System.assert(getModelsResponse3.equals(getModelsResponse4));
        System.assert(getModelsResponse4.equals(getModelsResponse3));
        System.assert(getModelsResponse3.equals(getModelsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetModelsResponse getModelsResponse1 = OASGetModelsResponse.getExample();
        OASGetModelsResponse getModelsResponse2 = OASGetModelsResponse.getExample();
        OASGetModelsResponse getModelsResponse3 = new OASGetModelsResponse();
        OASGetModelsResponse getModelsResponse4 = new OASGetModelsResponse();

        System.assert(getModelsResponse1.equals(getModelsResponse2));
        System.assert(getModelsResponse2.equals(getModelsResponse1));
        System.assert(getModelsResponse3.equals(getModelsResponse4));
        System.assert(getModelsResponse4.equals(getModelsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetModelsResponse getModelsResponse1 = OASGetModelsResponse.getExample();
        OASGetModelsResponse getModelsResponse2 = new OASGetModelsResponse();

        System.assertEquals(false, getModelsResponse1.equals('foo'));
        System.assertEquals(false, getModelsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetModelsResponse getModelsResponse1 = OASGetModelsResponse.getExample();
        OASGetModelsResponse getModelsResponse2 = new OASGetModelsResponse();
        OASGetModelsResponse getModelsResponse3;

        System.assertEquals(false, getModelsResponse1.equals(getModelsResponse3));
        System.assertEquals(false, getModelsResponse2.equals(getModelsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetModelsResponse getModelsResponse1 = OASGetModelsResponse.getExample();
        OASGetModelsResponse getModelsResponse2 = new OASGetModelsResponse();

        System.assertEquals(getModelsResponse1.hashCode(), getModelsResponse1.hashCode());
        System.assertEquals(getModelsResponse2.hashCode(), getModelsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetModelsResponse getModelsResponse1 = OASGetModelsResponse.getExample();
        OASGetModelsResponse getModelsResponse2 = OASGetModelsResponse.getExample();
        OASGetModelsResponse getModelsResponse3 = new OASGetModelsResponse();
        OASGetModelsResponse getModelsResponse4 = new OASGetModelsResponse();

        System.assert(getModelsResponse1.equals(getModelsResponse2));
        System.assert(getModelsResponse3.equals(getModelsResponse4));
        System.assertEquals(getModelsResponse1.hashCode(), getModelsResponse2.hashCode());
        System.assertEquals(getModelsResponse3.hashCode(), getModelsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGetModelsResponse getModelsResponse = new OASGetModelsResponse();
        Map<String, String> x-property-mappings = getModelsResponse.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetModelsResponse getModelsResponse = new OASGetModelsResponse();
        System.assertEquals(new List<OASModelDTO>(), getModelsResponse.models);
        System.assertEquals(null, getModelsResponse.r_currency);
        System.assertEquals(null, getModelsResponse.regionId);
    }
}
