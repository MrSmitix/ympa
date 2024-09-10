@isTest
private class OASGetRegionsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetRegionsResponse getRegionsResponse1 = OASGetRegionsResponse.getExample();
        OASGetRegionsResponse getRegionsResponse2 = getRegionsResponse1;
        OASGetRegionsResponse getRegionsResponse3 = new OASGetRegionsResponse();
        OASGetRegionsResponse getRegionsResponse4 = getRegionsResponse3;

        System.assert(getRegionsResponse1.equals(getRegionsResponse2));
        System.assert(getRegionsResponse2.equals(getRegionsResponse1));
        System.assert(getRegionsResponse1.equals(getRegionsResponse1));
        System.assert(getRegionsResponse3.equals(getRegionsResponse4));
        System.assert(getRegionsResponse4.equals(getRegionsResponse3));
        System.assert(getRegionsResponse3.equals(getRegionsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetRegionsResponse getRegionsResponse1 = OASGetRegionsResponse.getExample();
        OASGetRegionsResponse getRegionsResponse2 = OASGetRegionsResponse.getExample();
        OASGetRegionsResponse getRegionsResponse3 = new OASGetRegionsResponse();
        OASGetRegionsResponse getRegionsResponse4 = new OASGetRegionsResponse();

        System.assert(getRegionsResponse1.equals(getRegionsResponse2));
        System.assert(getRegionsResponse2.equals(getRegionsResponse1));
        System.assert(getRegionsResponse3.equals(getRegionsResponse4));
        System.assert(getRegionsResponse4.equals(getRegionsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetRegionsResponse getRegionsResponse1 = OASGetRegionsResponse.getExample();
        OASGetRegionsResponse getRegionsResponse2 = new OASGetRegionsResponse();

        System.assertEquals(false, getRegionsResponse1.equals('foo'));
        System.assertEquals(false, getRegionsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetRegionsResponse getRegionsResponse1 = OASGetRegionsResponse.getExample();
        OASGetRegionsResponse getRegionsResponse2 = new OASGetRegionsResponse();
        OASGetRegionsResponse getRegionsResponse3;

        System.assertEquals(false, getRegionsResponse1.equals(getRegionsResponse3));
        System.assertEquals(false, getRegionsResponse2.equals(getRegionsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetRegionsResponse getRegionsResponse1 = OASGetRegionsResponse.getExample();
        OASGetRegionsResponse getRegionsResponse2 = new OASGetRegionsResponse();

        System.assertEquals(getRegionsResponse1.hashCode(), getRegionsResponse1.hashCode());
        System.assertEquals(getRegionsResponse2.hashCode(), getRegionsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetRegionsResponse getRegionsResponse1 = OASGetRegionsResponse.getExample();
        OASGetRegionsResponse getRegionsResponse2 = OASGetRegionsResponse.getExample();
        OASGetRegionsResponse getRegionsResponse3 = new OASGetRegionsResponse();
        OASGetRegionsResponse getRegionsResponse4 = new OASGetRegionsResponse();

        System.assert(getRegionsResponse1.equals(getRegionsResponse2));
        System.assert(getRegionsResponse3.equals(getRegionsResponse4));
        System.assertEquals(getRegionsResponse1.hashCode(), getRegionsResponse2.hashCode());
        System.assertEquals(getRegionsResponse3.hashCode(), getRegionsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetRegionsResponse getRegionsResponse = new OASGetRegionsResponse();
        System.assertEquals(new List<OASRegionDTO>(), getRegionsResponse.regions);
        System.assertEquals(null, getRegionsResponse.paging);
    }
}
