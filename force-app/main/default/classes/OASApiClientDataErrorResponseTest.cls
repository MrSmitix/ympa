@isTest
private class OASApiClientDataErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiClientDataErrorResponse apiClientDataErrorResponse1 = OASApiClientDataErrorResponse.getExample();
        OASApiClientDataErrorResponse apiClientDataErrorResponse2 = apiClientDataErrorResponse1;
        OASApiClientDataErrorResponse apiClientDataErrorResponse3 = new OASApiClientDataErrorResponse();
        OASApiClientDataErrorResponse apiClientDataErrorResponse4 = apiClientDataErrorResponse3;

        System.assert(apiClientDataErrorResponse1.equals(apiClientDataErrorResponse2));
        System.assert(apiClientDataErrorResponse2.equals(apiClientDataErrorResponse1));
        System.assert(apiClientDataErrorResponse1.equals(apiClientDataErrorResponse1));
        System.assert(apiClientDataErrorResponse3.equals(apiClientDataErrorResponse4));
        System.assert(apiClientDataErrorResponse4.equals(apiClientDataErrorResponse3));
        System.assert(apiClientDataErrorResponse3.equals(apiClientDataErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiClientDataErrorResponse apiClientDataErrorResponse1 = OASApiClientDataErrorResponse.getExample();
        OASApiClientDataErrorResponse apiClientDataErrorResponse2 = OASApiClientDataErrorResponse.getExample();
        OASApiClientDataErrorResponse apiClientDataErrorResponse3 = new OASApiClientDataErrorResponse();
        OASApiClientDataErrorResponse apiClientDataErrorResponse4 = new OASApiClientDataErrorResponse();

        System.assert(apiClientDataErrorResponse1.equals(apiClientDataErrorResponse2));
        System.assert(apiClientDataErrorResponse2.equals(apiClientDataErrorResponse1));
        System.assert(apiClientDataErrorResponse3.equals(apiClientDataErrorResponse4));
        System.assert(apiClientDataErrorResponse4.equals(apiClientDataErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiClientDataErrorResponse apiClientDataErrorResponse1 = OASApiClientDataErrorResponse.getExample();
        OASApiClientDataErrorResponse apiClientDataErrorResponse2 = new OASApiClientDataErrorResponse();

        System.assertEquals(false, apiClientDataErrorResponse1.equals('foo'));
        System.assertEquals(false, apiClientDataErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiClientDataErrorResponse apiClientDataErrorResponse1 = OASApiClientDataErrorResponse.getExample();
        OASApiClientDataErrorResponse apiClientDataErrorResponse2 = new OASApiClientDataErrorResponse();
        OASApiClientDataErrorResponse apiClientDataErrorResponse3;

        System.assertEquals(false, apiClientDataErrorResponse1.equals(apiClientDataErrorResponse3));
        System.assertEquals(false, apiClientDataErrorResponse2.equals(apiClientDataErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiClientDataErrorResponse apiClientDataErrorResponse1 = OASApiClientDataErrorResponse.getExample();
        OASApiClientDataErrorResponse apiClientDataErrorResponse2 = new OASApiClientDataErrorResponse();

        System.assertEquals(apiClientDataErrorResponse1.hashCode(), apiClientDataErrorResponse1.hashCode());
        System.assertEquals(apiClientDataErrorResponse2.hashCode(), apiClientDataErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiClientDataErrorResponse apiClientDataErrorResponse1 = OASApiClientDataErrorResponse.getExample();
        OASApiClientDataErrorResponse apiClientDataErrorResponse2 = OASApiClientDataErrorResponse.getExample();
        OASApiClientDataErrorResponse apiClientDataErrorResponse3 = new OASApiClientDataErrorResponse();
        OASApiClientDataErrorResponse apiClientDataErrorResponse4 = new OASApiClientDataErrorResponse();

        System.assert(apiClientDataErrorResponse1.equals(apiClientDataErrorResponse2));
        System.assert(apiClientDataErrorResponse3.equals(apiClientDataErrorResponse4));
        System.assertEquals(apiClientDataErrorResponse1.hashCode(), apiClientDataErrorResponse2.hashCode());
        System.assertEquals(apiClientDataErrorResponse3.hashCode(), apiClientDataErrorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiClientDataErrorResponse apiClientDataErrorResponse = new OASApiClientDataErrorResponse();
        System.assertEquals(new List<OASApiErrorDTO>(), apiClientDataErrorResponse.errors);
        System.assertEquals(null, apiClientDataErrorResponse.status);
    }
}
