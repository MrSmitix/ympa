@isTest
private class OASGetHiddenOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetHiddenOffersResponse getHiddenOffersResponse1 = OASGetHiddenOffersResponse.getExample();
        OASGetHiddenOffersResponse getHiddenOffersResponse2 = getHiddenOffersResponse1;
        OASGetHiddenOffersResponse getHiddenOffersResponse3 = new OASGetHiddenOffersResponse();
        OASGetHiddenOffersResponse getHiddenOffersResponse4 = getHiddenOffersResponse3;

        System.assert(getHiddenOffersResponse1.equals(getHiddenOffersResponse2));
        System.assert(getHiddenOffersResponse2.equals(getHiddenOffersResponse1));
        System.assert(getHiddenOffersResponse1.equals(getHiddenOffersResponse1));
        System.assert(getHiddenOffersResponse3.equals(getHiddenOffersResponse4));
        System.assert(getHiddenOffersResponse4.equals(getHiddenOffersResponse3));
        System.assert(getHiddenOffersResponse3.equals(getHiddenOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetHiddenOffersResponse getHiddenOffersResponse1 = OASGetHiddenOffersResponse.getExample();
        OASGetHiddenOffersResponse getHiddenOffersResponse2 = OASGetHiddenOffersResponse.getExample();
        OASGetHiddenOffersResponse getHiddenOffersResponse3 = new OASGetHiddenOffersResponse();
        OASGetHiddenOffersResponse getHiddenOffersResponse4 = new OASGetHiddenOffersResponse();

        System.assert(getHiddenOffersResponse1.equals(getHiddenOffersResponse2));
        System.assert(getHiddenOffersResponse2.equals(getHiddenOffersResponse1));
        System.assert(getHiddenOffersResponse3.equals(getHiddenOffersResponse4));
        System.assert(getHiddenOffersResponse4.equals(getHiddenOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetHiddenOffersResponse getHiddenOffersResponse1 = OASGetHiddenOffersResponse.getExample();
        OASGetHiddenOffersResponse getHiddenOffersResponse2 = new OASGetHiddenOffersResponse();

        System.assertEquals(false, getHiddenOffersResponse1.equals('foo'));
        System.assertEquals(false, getHiddenOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetHiddenOffersResponse getHiddenOffersResponse1 = OASGetHiddenOffersResponse.getExample();
        OASGetHiddenOffersResponse getHiddenOffersResponse2 = new OASGetHiddenOffersResponse();
        OASGetHiddenOffersResponse getHiddenOffersResponse3;

        System.assertEquals(false, getHiddenOffersResponse1.equals(getHiddenOffersResponse3));
        System.assertEquals(false, getHiddenOffersResponse2.equals(getHiddenOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetHiddenOffersResponse getHiddenOffersResponse1 = OASGetHiddenOffersResponse.getExample();
        OASGetHiddenOffersResponse getHiddenOffersResponse2 = new OASGetHiddenOffersResponse();

        System.assertEquals(getHiddenOffersResponse1.hashCode(), getHiddenOffersResponse1.hashCode());
        System.assertEquals(getHiddenOffersResponse2.hashCode(), getHiddenOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetHiddenOffersResponse getHiddenOffersResponse1 = OASGetHiddenOffersResponse.getExample();
        OASGetHiddenOffersResponse getHiddenOffersResponse2 = OASGetHiddenOffersResponse.getExample();
        OASGetHiddenOffersResponse getHiddenOffersResponse3 = new OASGetHiddenOffersResponse();
        OASGetHiddenOffersResponse getHiddenOffersResponse4 = new OASGetHiddenOffersResponse();

        System.assert(getHiddenOffersResponse1.equals(getHiddenOffersResponse2));
        System.assert(getHiddenOffersResponse3.equals(getHiddenOffersResponse4));
        System.assertEquals(getHiddenOffersResponse1.hashCode(), getHiddenOffersResponse2.hashCode());
        System.assertEquals(getHiddenOffersResponse3.hashCode(), getHiddenOffersResponse4.hashCode());
    }
}
