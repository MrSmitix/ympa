@isTest
private class OASApiServerErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiServerErrorResponse apiServerErrorResponse1 = OASApiServerErrorResponse.getExample();
        OASApiServerErrorResponse apiServerErrorResponse2 = apiServerErrorResponse1;
        OASApiServerErrorResponse apiServerErrorResponse3 = new OASApiServerErrorResponse();
        OASApiServerErrorResponse apiServerErrorResponse4 = apiServerErrorResponse3;

        System.assert(apiServerErrorResponse1.equals(apiServerErrorResponse2));
        System.assert(apiServerErrorResponse2.equals(apiServerErrorResponse1));
        System.assert(apiServerErrorResponse1.equals(apiServerErrorResponse1));
        System.assert(apiServerErrorResponse3.equals(apiServerErrorResponse4));
        System.assert(apiServerErrorResponse4.equals(apiServerErrorResponse3));
        System.assert(apiServerErrorResponse3.equals(apiServerErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiServerErrorResponse apiServerErrorResponse1 = OASApiServerErrorResponse.getExample();
        OASApiServerErrorResponse apiServerErrorResponse2 = OASApiServerErrorResponse.getExample();
        OASApiServerErrorResponse apiServerErrorResponse3 = new OASApiServerErrorResponse();
        OASApiServerErrorResponse apiServerErrorResponse4 = new OASApiServerErrorResponse();

        System.assert(apiServerErrorResponse1.equals(apiServerErrorResponse2));
        System.assert(apiServerErrorResponse2.equals(apiServerErrorResponse1));
        System.assert(apiServerErrorResponse3.equals(apiServerErrorResponse4));
        System.assert(apiServerErrorResponse4.equals(apiServerErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiServerErrorResponse apiServerErrorResponse1 = OASApiServerErrorResponse.getExample();
        OASApiServerErrorResponse apiServerErrorResponse2 = new OASApiServerErrorResponse();

        System.assertEquals(false, apiServerErrorResponse1.equals('foo'));
        System.assertEquals(false, apiServerErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiServerErrorResponse apiServerErrorResponse1 = OASApiServerErrorResponse.getExample();
        OASApiServerErrorResponse apiServerErrorResponse2 = new OASApiServerErrorResponse();
        OASApiServerErrorResponse apiServerErrorResponse3;

        System.assertEquals(false, apiServerErrorResponse1.equals(apiServerErrorResponse3));
        System.assertEquals(false, apiServerErrorResponse2.equals(apiServerErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiServerErrorResponse apiServerErrorResponse1 = OASApiServerErrorResponse.getExample();
        OASApiServerErrorResponse apiServerErrorResponse2 = new OASApiServerErrorResponse();

        System.assertEquals(apiServerErrorResponse1.hashCode(), apiServerErrorResponse1.hashCode());
        System.assertEquals(apiServerErrorResponse2.hashCode(), apiServerErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiServerErrorResponse apiServerErrorResponse1 = OASApiServerErrorResponse.getExample();
        OASApiServerErrorResponse apiServerErrorResponse2 = OASApiServerErrorResponse.getExample();
        OASApiServerErrorResponse apiServerErrorResponse3 = new OASApiServerErrorResponse();
        OASApiServerErrorResponse apiServerErrorResponse4 = new OASApiServerErrorResponse();

        System.assert(apiServerErrorResponse1.equals(apiServerErrorResponse2));
        System.assert(apiServerErrorResponse3.equals(apiServerErrorResponse4));
        System.assertEquals(apiServerErrorResponse1.hashCode(), apiServerErrorResponse2.hashCode());
        System.assertEquals(apiServerErrorResponse3.hashCode(), apiServerErrorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiServerErrorResponse apiServerErrorResponse = new OASApiServerErrorResponse();
        System.assertEquals(new List<OASApiErrorDTO>(), apiServerErrorResponse.errors);
        System.assertEquals(null, apiServerErrorResponse.status);
    }
}
