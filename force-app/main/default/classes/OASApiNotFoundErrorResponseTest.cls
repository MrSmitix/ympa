@isTest
private class OASApiNotFoundErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse1 = OASApiNotFoundErrorResponse.getExample();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse2 = apiNotFoundErrorResponse1;
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse3 = new OASApiNotFoundErrorResponse();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse4 = apiNotFoundErrorResponse3;

        System.assert(apiNotFoundErrorResponse1.equals(apiNotFoundErrorResponse2));
        System.assert(apiNotFoundErrorResponse2.equals(apiNotFoundErrorResponse1));
        System.assert(apiNotFoundErrorResponse1.equals(apiNotFoundErrorResponse1));
        System.assert(apiNotFoundErrorResponse3.equals(apiNotFoundErrorResponse4));
        System.assert(apiNotFoundErrorResponse4.equals(apiNotFoundErrorResponse3));
        System.assert(apiNotFoundErrorResponse3.equals(apiNotFoundErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse1 = OASApiNotFoundErrorResponse.getExample();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse2 = OASApiNotFoundErrorResponse.getExample();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse3 = new OASApiNotFoundErrorResponse();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse4 = new OASApiNotFoundErrorResponse();

        System.assert(apiNotFoundErrorResponse1.equals(apiNotFoundErrorResponse2));
        System.assert(apiNotFoundErrorResponse2.equals(apiNotFoundErrorResponse1));
        System.assert(apiNotFoundErrorResponse3.equals(apiNotFoundErrorResponse4));
        System.assert(apiNotFoundErrorResponse4.equals(apiNotFoundErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse1 = OASApiNotFoundErrorResponse.getExample();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse2 = new OASApiNotFoundErrorResponse();

        System.assertEquals(false, apiNotFoundErrorResponse1.equals('foo'));
        System.assertEquals(false, apiNotFoundErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse1 = OASApiNotFoundErrorResponse.getExample();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse2 = new OASApiNotFoundErrorResponse();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse3;

        System.assertEquals(false, apiNotFoundErrorResponse1.equals(apiNotFoundErrorResponse3));
        System.assertEquals(false, apiNotFoundErrorResponse2.equals(apiNotFoundErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse1 = OASApiNotFoundErrorResponse.getExample();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse2 = new OASApiNotFoundErrorResponse();

        System.assertEquals(apiNotFoundErrorResponse1.hashCode(), apiNotFoundErrorResponse1.hashCode());
        System.assertEquals(apiNotFoundErrorResponse2.hashCode(), apiNotFoundErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse1 = OASApiNotFoundErrorResponse.getExample();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse2 = OASApiNotFoundErrorResponse.getExample();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse3 = new OASApiNotFoundErrorResponse();
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse4 = new OASApiNotFoundErrorResponse();

        System.assert(apiNotFoundErrorResponse1.equals(apiNotFoundErrorResponse2));
        System.assert(apiNotFoundErrorResponse3.equals(apiNotFoundErrorResponse4));
        System.assertEquals(apiNotFoundErrorResponse1.hashCode(), apiNotFoundErrorResponse2.hashCode());
        System.assertEquals(apiNotFoundErrorResponse3.hashCode(), apiNotFoundErrorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiNotFoundErrorResponse apiNotFoundErrorResponse = new OASApiNotFoundErrorResponse();
        System.assertEquals(new List<OASApiErrorDTO>(), apiNotFoundErrorResponse.errors);
        System.assertEquals(null, apiNotFoundErrorResponse.status);
    }
}
