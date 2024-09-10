@isTest
private class OASApiErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiErrorResponse apiErrorResponse1 = OASApiErrorResponse.getExample();
        OASApiErrorResponse apiErrorResponse2 = apiErrorResponse1;
        OASApiErrorResponse apiErrorResponse3 = new OASApiErrorResponse();
        OASApiErrorResponse apiErrorResponse4 = apiErrorResponse3;

        System.assert(apiErrorResponse1.equals(apiErrorResponse2));
        System.assert(apiErrorResponse2.equals(apiErrorResponse1));
        System.assert(apiErrorResponse1.equals(apiErrorResponse1));
        System.assert(apiErrorResponse3.equals(apiErrorResponse4));
        System.assert(apiErrorResponse4.equals(apiErrorResponse3));
        System.assert(apiErrorResponse3.equals(apiErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiErrorResponse apiErrorResponse1 = OASApiErrorResponse.getExample();
        OASApiErrorResponse apiErrorResponse2 = OASApiErrorResponse.getExample();
        OASApiErrorResponse apiErrorResponse3 = new OASApiErrorResponse();
        OASApiErrorResponse apiErrorResponse4 = new OASApiErrorResponse();

        System.assert(apiErrorResponse1.equals(apiErrorResponse2));
        System.assert(apiErrorResponse2.equals(apiErrorResponse1));
        System.assert(apiErrorResponse3.equals(apiErrorResponse4));
        System.assert(apiErrorResponse4.equals(apiErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiErrorResponse apiErrorResponse1 = OASApiErrorResponse.getExample();
        OASApiErrorResponse apiErrorResponse2 = new OASApiErrorResponse();

        System.assertEquals(false, apiErrorResponse1.equals('foo'));
        System.assertEquals(false, apiErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiErrorResponse apiErrorResponse1 = OASApiErrorResponse.getExample();
        OASApiErrorResponse apiErrorResponse2 = new OASApiErrorResponse();
        OASApiErrorResponse apiErrorResponse3;

        System.assertEquals(false, apiErrorResponse1.equals(apiErrorResponse3));
        System.assertEquals(false, apiErrorResponse2.equals(apiErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiErrorResponse apiErrorResponse1 = OASApiErrorResponse.getExample();
        OASApiErrorResponse apiErrorResponse2 = new OASApiErrorResponse();

        System.assertEquals(apiErrorResponse1.hashCode(), apiErrorResponse1.hashCode());
        System.assertEquals(apiErrorResponse2.hashCode(), apiErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiErrorResponse apiErrorResponse1 = OASApiErrorResponse.getExample();
        OASApiErrorResponse apiErrorResponse2 = OASApiErrorResponse.getExample();
        OASApiErrorResponse apiErrorResponse3 = new OASApiErrorResponse();
        OASApiErrorResponse apiErrorResponse4 = new OASApiErrorResponse();

        System.assert(apiErrorResponse1.equals(apiErrorResponse2));
        System.assert(apiErrorResponse3.equals(apiErrorResponse4));
        System.assertEquals(apiErrorResponse1.hashCode(), apiErrorResponse2.hashCode());
        System.assertEquals(apiErrorResponse3.hashCode(), apiErrorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiErrorResponse apiErrorResponse = new OASApiErrorResponse();
        System.assertEquals(new List<OASApiErrorDTO>(), apiErrorResponse.errors);
        System.assertEquals(null, apiErrorResponse.status);
    }
}
