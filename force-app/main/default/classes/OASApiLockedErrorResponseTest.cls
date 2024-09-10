@isTest
private class OASApiLockedErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiLockedErrorResponse apiLockedErrorResponse1 = OASApiLockedErrorResponse.getExample();
        OASApiLockedErrorResponse apiLockedErrorResponse2 = apiLockedErrorResponse1;
        OASApiLockedErrorResponse apiLockedErrorResponse3 = new OASApiLockedErrorResponse();
        OASApiLockedErrorResponse apiLockedErrorResponse4 = apiLockedErrorResponse3;

        System.assert(apiLockedErrorResponse1.equals(apiLockedErrorResponse2));
        System.assert(apiLockedErrorResponse2.equals(apiLockedErrorResponse1));
        System.assert(apiLockedErrorResponse1.equals(apiLockedErrorResponse1));
        System.assert(apiLockedErrorResponse3.equals(apiLockedErrorResponse4));
        System.assert(apiLockedErrorResponse4.equals(apiLockedErrorResponse3));
        System.assert(apiLockedErrorResponse3.equals(apiLockedErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiLockedErrorResponse apiLockedErrorResponse1 = OASApiLockedErrorResponse.getExample();
        OASApiLockedErrorResponse apiLockedErrorResponse2 = OASApiLockedErrorResponse.getExample();
        OASApiLockedErrorResponse apiLockedErrorResponse3 = new OASApiLockedErrorResponse();
        OASApiLockedErrorResponse apiLockedErrorResponse4 = new OASApiLockedErrorResponse();

        System.assert(apiLockedErrorResponse1.equals(apiLockedErrorResponse2));
        System.assert(apiLockedErrorResponse2.equals(apiLockedErrorResponse1));
        System.assert(apiLockedErrorResponse3.equals(apiLockedErrorResponse4));
        System.assert(apiLockedErrorResponse4.equals(apiLockedErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiLockedErrorResponse apiLockedErrorResponse1 = OASApiLockedErrorResponse.getExample();
        OASApiLockedErrorResponse apiLockedErrorResponse2 = new OASApiLockedErrorResponse();

        System.assertEquals(false, apiLockedErrorResponse1.equals('foo'));
        System.assertEquals(false, apiLockedErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiLockedErrorResponse apiLockedErrorResponse1 = OASApiLockedErrorResponse.getExample();
        OASApiLockedErrorResponse apiLockedErrorResponse2 = new OASApiLockedErrorResponse();
        OASApiLockedErrorResponse apiLockedErrorResponse3;

        System.assertEquals(false, apiLockedErrorResponse1.equals(apiLockedErrorResponse3));
        System.assertEquals(false, apiLockedErrorResponse2.equals(apiLockedErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiLockedErrorResponse apiLockedErrorResponse1 = OASApiLockedErrorResponse.getExample();
        OASApiLockedErrorResponse apiLockedErrorResponse2 = new OASApiLockedErrorResponse();

        System.assertEquals(apiLockedErrorResponse1.hashCode(), apiLockedErrorResponse1.hashCode());
        System.assertEquals(apiLockedErrorResponse2.hashCode(), apiLockedErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiLockedErrorResponse apiLockedErrorResponse1 = OASApiLockedErrorResponse.getExample();
        OASApiLockedErrorResponse apiLockedErrorResponse2 = OASApiLockedErrorResponse.getExample();
        OASApiLockedErrorResponse apiLockedErrorResponse3 = new OASApiLockedErrorResponse();
        OASApiLockedErrorResponse apiLockedErrorResponse4 = new OASApiLockedErrorResponse();

        System.assert(apiLockedErrorResponse1.equals(apiLockedErrorResponse2));
        System.assert(apiLockedErrorResponse3.equals(apiLockedErrorResponse4));
        System.assertEquals(apiLockedErrorResponse1.hashCode(), apiLockedErrorResponse2.hashCode());
        System.assertEquals(apiLockedErrorResponse3.hashCode(), apiLockedErrorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiLockedErrorResponse apiLockedErrorResponse = new OASApiLockedErrorResponse();
        System.assertEquals(new List<OASApiErrorDTO>(), apiLockedErrorResponse.errors);
        System.assertEquals(null, apiLockedErrorResponse.status);
    }
}
