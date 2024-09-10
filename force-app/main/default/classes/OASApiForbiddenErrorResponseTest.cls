@isTest
private class OASApiForbiddenErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse1 = OASApiForbiddenErrorResponse.getExample();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse2 = apiForbiddenErrorResponse1;
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse3 = new OASApiForbiddenErrorResponse();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse4 = apiForbiddenErrorResponse3;

        System.assert(apiForbiddenErrorResponse1.equals(apiForbiddenErrorResponse2));
        System.assert(apiForbiddenErrorResponse2.equals(apiForbiddenErrorResponse1));
        System.assert(apiForbiddenErrorResponse1.equals(apiForbiddenErrorResponse1));
        System.assert(apiForbiddenErrorResponse3.equals(apiForbiddenErrorResponse4));
        System.assert(apiForbiddenErrorResponse4.equals(apiForbiddenErrorResponse3));
        System.assert(apiForbiddenErrorResponse3.equals(apiForbiddenErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse1 = OASApiForbiddenErrorResponse.getExample();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse2 = OASApiForbiddenErrorResponse.getExample();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse3 = new OASApiForbiddenErrorResponse();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse4 = new OASApiForbiddenErrorResponse();

        System.assert(apiForbiddenErrorResponse1.equals(apiForbiddenErrorResponse2));
        System.assert(apiForbiddenErrorResponse2.equals(apiForbiddenErrorResponse1));
        System.assert(apiForbiddenErrorResponse3.equals(apiForbiddenErrorResponse4));
        System.assert(apiForbiddenErrorResponse4.equals(apiForbiddenErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse1 = OASApiForbiddenErrorResponse.getExample();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse2 = new OASApiForbiddenErrorResponse();

        System.assertEquals(false, apiForbiddenErrorResponse1.equals('foo'));
        System.assertEquals(false, apiForbiddenErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse1 = OASApiForbiddenErrorResponse.getExample();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse2 = new OASApiForbiddenErrorResponse();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse3;

        System.assertEquals(false, apiForbiddenErrorResponse1.equals(apiForbiddenErrorResponse3));
        System.assertEquals(false, apiForbiddenErrorResponse2.equals(apiForbiddenErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse1 = OASApiForbiddenErrorResponse.getExample();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse2 = new OASApiForbiddenErrorResponse();

        System.assertEquals(apiForbiddenErrorResponse1.hashCode(), apiForbiddenErrorResponse1.hashCode());
        System.assertEquals(apiForbiddenErrorResponse2.hashCode(), apiForbiddenErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse1 = OASApiForbiddenErrorResponse.getExample();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse2 = OASApiForbiddenErrorResponse.getExample();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse3 = new OASApiForbiddenErrorResponse();
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse4 = new OASApiForbiddenErrorResponse();

        System.assert(apiForbiddenErrorResponse1.equals(apiForbiddenErrorResponse2));
        System.assert(apiForbiddenErrorResponse3.equals(apiForbiddenErrorResponse4));
        System.assertEquals(apiForbiddenErrorResponse1.hashCode(), apiForbiddenErrorResponse2.hashCode());
        System.assertEquals(apiForbiddenErrorResponse3.hashCode(), apiForbiddenErrorResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASApiForbiddenErrorResponse apiForbiddenErrorResponse = new OASApiForbiddenErrorResponse();
        System.assertEquals(new List<OASApiErrorDTO>(), apiForbiddenErrorResponse.errors);
        System.assertEquals(null, apiForbiddenErrorResponse.status);
    }
}
