@isTest
private class OASApiUnauthorizedErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse1 = OASApiUnauthorizedErrorResponse.getExample();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse2 = apiUnauthorizedErrorResponse1;
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse3 = new OASApiUnauthorizedErrorResponse();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse4 = apiUnauthorizedErrorResponse3;

        System.assert(apiUnauthorizedErrorResponse1.equals(apiUnauthorizedErrorResponse2));
        System.assert(apiUnauthorizedErrorResponse2.equals(apiUnauthorizedErrorResponse1));
        System.assert(apiUnauthorizedErrorResponse1.equals(apiUnauthorizedErrorResponse1));
        System.assert(apiUnauthorizedErrorResponse3.equals(apiUnauthorizedErrorResponse4));
        System.assert(apiUnauthorizedErrorResponse4.equals(apiUnauthorizedErrorResponse3));
        System.assert(apiUnauthorizedErrorResponse3.equals(apiUnauthorizedErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse1 = OASApiUnauthorizedErrorResponse.getExample();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse2 = OASApiUnauthorizedErrorResponse.getExample();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse3 = new OASApiUnauthorizedErrorResponse();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse4 = new OASApiUnauthorizedErrorResponse();

        System.assert(apiUnauthorizedErrorResponse1.equals(apiUnauthorizedErrorResponse2));
        System.assert(apiUnauthorizedErrorResponse2.equals(apiUnauthorizedErrorResponse1));
        System.assert(apiUnauthorizedErrorResponse3.equals(apiUnauthorizedErrorResponse4));
        System.assert(apiUnauthorizedErrorResponse4.equals(apiUnauthorizedErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse1 = OASApiUnauthorizedErrorResponse.getExample();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse2 = new OASApiUnauthorizedErrorResponse();

        System.assertEquals(false, apiUnauthorizedErrorResponse1.equals('foo'));
        System.assertEquals(false, apiUnauthorizedErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse1 = OASApiUnauthorizedErrorResponse.getExample();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse2 = new OASApiUnauthorizedErrorResponse();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse3;

        System.assertEquals(false, apiUnauthorizedErrorResponse1.equals(apiUnauthorizedErrorResponse3));
        System.assertEquals(false, apiUnauthorizedErrorResponse2.equals(apiUnauthorizedErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse1 = OASApiUnauthorizedErrorResponse.getExample();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse2 = new OASApiUnauthorizedErrorResponse();

        System.assertEquals(apiUnauthorizedErrorResponse1.hashCode(), apiUnauthorizedErrorResponse1.hashCode());
        System.assertEquals(apiUnauthorizedErrorResponse2.hashCode(), apiUnauthorizedErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse1 = OASApiUnauthorizedErrorResponse.getExample();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse2 = OASApiUnauthorizedErrorResponse.getExample();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse3 = new OASApiUnauthorizedErrorResponse();
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse4 = new OASApiUnauthorizedErrorResponse();

        System.assert(apiUnauthorizedErrorResponse1.equals(apiUnauthorizedErrorResponse2));
        System.assert(apiUnauthorizedErrorResponse3.equals(apiUnauthorizedErrorResponse4));
        System.assertEquals(apiUnauthorizedErrorResponse1.hashCode(), apiUnauthorizedErrorResponse2.hashCode());
        System.assertEquals(apiUnauthorizedErrorResponse3.hashCode(), apiUnauthorizedErrorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiUnauthorizedErrorResponse apiUnauthorizedErrorResponse = new OASApiUnauthorizedErrorResponse();
        System.assertEquals(new List<OASApiErrorDTO>(), apiUnauthorizedErrorResponse.errors);
        System.assertEquals(null, apiUnauthorizedErrorResponse.status);
    }
}
