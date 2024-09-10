@isTest
private class OASGetQuarantineOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetQuarantineOffersResponse getQuarantineOffersResponse1 = OASGetQuarantineOffersResponse.getExample();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse2 = getQuarantineOffersResponse1;
        OASGetQuarantineOffersResponse getQuarantineOffersResponse3 = new OASGetQuarantineOffersResponse();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse4 = getQuarantineOffersResponse3;

        System.assert(getQuarantineOffersResponse1.equals(getQuarantineOffersResponse2));
        System.assert(getQuarantineOffersResponse2.equals(getQuarantineOffersResponse1));
        System.assert(getQuarantineOffersResponse1.equals(getQuarantineOffersResponse1));
        System.assert(getQuarantineOffersResponse3.equals(getQuarantineOffersResponse4));
        System.assert(getQuarantineOffersResponse4.equals(getQuarantineOffersResponse3));
        System.assert(getQuarantineOffersResponse3.equals(getQuarantineOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetQuarantineOffersResponse getQuarantineOffersResponse1 = OASGetQuarantineOffersResponse.getExample();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse2 = OASGetQuarantineOffersResponse.getExample();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse3 = new OASGetQuarantineOffersResponse();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse4 = new OASGetQuarantineOffersResponse();

        System.assert(getQuarantineOffersResponse1.equals(getQuarantineOffersResponse2));
        System.assert(getQuarantineOffersResponse2.equals(getQuarantineOffersResponse1));
        System.assert(getQuarantineOffersResponse3.equals(getQuarantineOffersResponse4));
        System.assert(getQuarantineOffersResponse4.equals(getQuarantineOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetQuarantineOffersResponse getQuarantineOffersResponse1 = OASGetQuarantineOffersResponse.getExample();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse2 = new OASGetQuarantineOffersResponse();

        System.assertEquals(false, getQuarantineOffersResponse1.equals('foo'));
        System.assertEquals(false, getQuarantineOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetQuarantineOffersResponse getQuarantineOffersResponse1 = OASGetQuarantineOffersResponse.getExample();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse2 = new OASGetQuarantineOffersResponse();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse3;

        System.assertEquals(false, getQuarantineOffersResponse1.equals(getQuarantineOffersResponse3));
        System.assertEquals(false, getQuarantineOffersResponse2.equals(getQuarantineOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetQuarantineOffersResponse getQuarantineOffersResponse1 = OASGetQuarantineOffersResponse.getExample();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse2 = new OASGetQuarantineOffersResponse();

        System.assertEquals(getQuarantineOffersResponse1.hashCode(), getQuarantineOffersResponse1.hashCode());
        System.assertEquals(getQuarantineOffersResponse2.hashCode(), getQuarantineOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetQuarantineOffersResponse getQuarantineOffersResponse1 = OASGetQuarantineOffersResponse.getExample();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse2 = OASGetQuarantineOffersResponse.getExample();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse3 = new OASGetQuarantineOffersResponse();
        OASGetQuarantineOffersResponse getQuarantineOffersResponse4 = new OASGetQuarantineOffersResponse();

        System.assert(getQuarantineOffersResponse1.equals(getQuarantineOffersResponse2));
        System.assert(getQuarantineOffersResponse3.equals(getQuarantineOffersResponse4));
        System.assertEquals(getQuarantineOffersResponse1.hashCode(), getQuarantineOffersResponse2.hashCode());
        System.assertEquals(getQuarantineOffersResponse3.hashCode(), getQuarantineOffersResponse4.hashCode());
    }
}
