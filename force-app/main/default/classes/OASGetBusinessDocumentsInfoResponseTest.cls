@isTest
private class OASGetBusinessDocumentsInfoResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse1 = OASGetBusinessDocumentsInfoResponse.getExample();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse2 = getBusinessDocumentsInfoResponse1;
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse3 = new OASGetBusinessDocumentsInfoResponse();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse4 = getBusinessDocumentsInfoResponse3;

        System.assert(getBusinessDocumentsInfoResponse1.equals(getBusinessDocumentsInfoResponse2));
        System.assert(getBusinessDocumentsInfoResponse2.equals(getBusinessDocumentsInfoResponse1));
        System.assert(getBusinessDocumentsInfoResponse1.equals(getBusinessDocumentsInfoResponse1));
        System.assert(getBusinessDocumentsInfoResponse3.equals(getBusinessDocumentsInfoResponse4));
        System.assert(getBusinessDocumentsInfoResponse4.equals(getBusinessDocumentsInfoResponse3));
        System.assert(getBusinessDocumentsInfoResponse3.equals(getBusinessDocumentsInfoResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse1 = OASGetBusinessDocumentsInfoResponse.getExample();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse2 = OASGetBusinessDocumentsInfoResponse.getExample();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse3 = new OASGetBusinessDocumentsInfoResponse();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse4 = new OASGetBusinessDocumentsInfoResponse();

        System.assert(getBusinessDocumentsInfoResponse1.equals(getBusinessDocumentsInfoResponse2));
        System.assert(getBusinessDocumentsInfoResponse2.equals(getBusinessDocumentsInfoResponse1));
        System.assert(getBusinessDocumentsInfoResponse3.equals(getBusinessDocumentsInfoResponse4));
        System.assert(getBusinessDocumentsInfoResponse4.equals(getBusinessDocumentsInfoResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse1 = OASGetBusinessDocumentsInfoResponse.getExample();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse2 = new OASGetBusinessDocumentsInfoResponse();

        System.assertEquals(false, getBusinessDocumentsInfoResponse1.equals('foo'));
        System.assertEquals(false, getBusinessDocumentsInfoResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse1 = OASGetBusinessDocumentsInfoResponse.getExample();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse2 = new OASGetBusinessDocumentsInfoResponse();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse3;

        System.assertEquals(false, getBusinessDocumentsInfoResponse1.equals(getBusinessDocumentsInfoResponse3));
        System.assertEquals(false, getBusinessDocumentsInfoResponse2.equals(getBusinessDocumentsInfoResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse1 = OASGetBusinessDocumentsInfoResponse.getExample();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse2 = new OASGetBusinessDocumentsInfoResponse();

        System.assertEquals(getBusinessDocumentsInfoResponse1.hashCode(), getBusinessDocumentsInfoResponse1.hashCode());
        System.assertEquals(getBusinessDocumentsInfoResponse2.hashCode(), getBusinessDocumentsInfoResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse1 = OASGetBusinessDocumentsInfoResponse.getExample();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse2 = OASGetBusinessDocumentsInfoResponse.getExample();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse3 = new OASGetBusinessDocumentsInfoResponse();
        OASGetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse4 = new OASGetBusinessDocumentsInfoResponse();

        System.assert(getBusinessDocumentsInfoResponse1.equals(getBusinessDocumentsInfoResponse2));
        System.assert(getBusinessDocumentsInfoResponse3.equals(getBusinessDocumentsInfoResponse4));
        System.assertEquals(getBusinessDocumentsInfoResponse1.hashCode(), getBusinessDocumentsInfoResponse2.hashCode());
        System.assertEquals(getBusinessDocumentsInfoResponse3.hashCode(), getBusinessDocumentsInfoResponse4.hashCode());
    }
}
