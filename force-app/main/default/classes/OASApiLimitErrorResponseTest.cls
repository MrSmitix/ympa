@isTest
private class OASApiLimitErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiLimitErrorResponse apiLimitErrorResponse1 = OASApiLimitErrorResponse.getExample();
        OASApiLimitErrorResponse apiLimitErrorResponse2 = apiLimitErrorResponse1;
        OASApiLimitErrorResponse apiLimitErrorResponse3 = new OASApiLimitErrorResponse();
        OASApiLimitErrorResponse apiLimitErrorResponse4 = apiLimitErrorResponse3;

        System.assert(apiLimitErrorResponse1.equals(apiLimitErrorResponse2));
        System.assert(apiLimitErrorResponse2.equals(apiLimitErrorResponse1));
        System.assert(apiLimitErrorResponse1.equals(apiLimitErrorResponse1));
        System.assert(apiLimitErrorResponse3.equals(apiLimitErrorResponse4));
        System.assert(apiLimitErrorResponse4.equals(apiLimitErrorResponse3));
        System.assert(apiLimitErrorResponse3.equals(apiLimitErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiLimitErrorResponse apiLimitErrorResponse1 = OASApiLimitErrorResponse.getExample();
        OASApiLimitErrorResponse apiLimitErrorResponse2 = OASApiLimitErrorResponse.getExample();
        OASApiLimitErrorResponse apiLimitErrorResponse3 = new OASApiLimitErrorResponse();
        OASApiLimitErrorResponse apiLimitErrorResponse4 = new OASApiLimitErrorResponse();

        System.assert(apiLimitErrorResponse1.equals(apiLimitErrorResponse2));
        System.assert(apiLimitErrorResponse2.equals(apiLimitErrorResponse1));
        System.assert(apiLimitErrorResponse3.equals(apiLimitErrorResponse4));
        System.assert(apiLimitErrorResponse4.equals(apiLimitErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiLimitErrorResponse apiLimitErrorResponse1 = OASApiLimitErrorResponse.getExample();
        OASApiLimitErrorResponse apiLimitErrorResponse2 = new OASApiLimitErrorResponse();

        System.assertEquals(false, apiLimitErrorResponse1.equals('foo'));
        System.assertEquals(false, apiLimitErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiLimitErrorResponse apiLimitErrorResponse1 = OASApiLimitErrorResponse.getExample();
        OASApiLimitErrorResponse apiLimitErrorResponse2 = new OASApiLimitErrorResponse();
        OASApiLimitErrorResponse apiLimitErrorResponse3;

        System.assertEquals(false, apiLimitErrorResponse1.equals(apiLimitErrorResponse3));
        System.assertEquals(false, apiLimitErrorResponse2.equals(apiLimitErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiLimitErrorResponse apiLimitErrorResponse1 = OASApiLimitErrorResponse.getExample();
        OASApiLimitErrorResponse apiLimitErrorResponse2 = new OASApiLimitErrorResponse();

        System.assertEquals(apiLimitErrorResponse1.hashCode(), apiLimitErrorResponse1.hashCode());
        System.assertEquals(apiLimitErrorResponse2.hashCode(), apiLimitErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiLimitErrorResponse apiLimitErrorResponse1 = OASApiLimitErrorResponse.getExample();
        OASApiLimitErrorResponse apiLimitErrorResponse2 = OASApiLimitErrorResponse.getExample();
        OASApiLimitErrorResponse apiLimitErrorResponse3 = new OASApiLimitErrorResponse();
        OASApiLimitErrorResponse apiLimitErrorResponse4 = new OASApiLimitErrorResponse();

        System.assert(apiLimitErrorResponse1.equals(apiLimitErrorResponse2));
        System.assert(apiLimitErrorResponse3.equals(apiLimitErrorResponse4));
        System.assertEquals(apiLimitErrorResponse1.hashCode(), apiLimitErrorResponse2.hashCode());
        System.assertEquals(apiLimitErrorResponse3.hashCode(), apiLimitErrorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiLimitErrorResponse apiLimitErrorResponse = new OASApiLimitErrorResponse();
        System.assertEquals(new List<OASApiErrorDTO>(), apiLimitErrorResponse.errors);
        System.assertEquals(null, apiLimitErrorResponse.status);
    }
}
