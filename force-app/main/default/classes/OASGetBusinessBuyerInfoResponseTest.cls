@isTest
private class OASGetBusinessBuyerInfoResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse1 = OASGetBusinessBuyerInfoResponse.getExample();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse2 = getBusinessBuyerInfoResponse1;
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse3 = new OASGetBusinessBuyerInfoResponse();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse4 = getBusinessBuyerInfoResponse3;

        System.assert(getBusinessBuyerInfoResponse1.equals(getBusinessBuyerInfoResponse2));
        System.assert(getBusinessBuyerInfoResponse2.equals(getBusinessBuyerInfoResponse1));
        System.assert(getBusinessBuyerInfoResponse1.equals(getBusinessBuyerInfoResponse1));
        System.assert(getBusinessBuyerInfoResponse3.equals(getBusinessBuyerInfoResponse4));
        System.assert(getBusinessBuyerInfoResponse4.equals(getBusinessBuyerInfoResponse3));
        System.assert(getBusinessBuyerInfoResponse3.equals(getBusinessBuyerInfoResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse1 = OASGetBusinessBuyerInfoResponse.getExample();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse2 = OASGetBusinessBuyerInfoResponse.getExample();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse3 = new OASGetBusinessBuyerInfoResponse();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse4 = new OASGetBusinessBuyerInfoResponse();

        System.assert(getBusinessBuyerInfoResponse1.equals(getBusinessBuyerInfoResponse2));
        System.assert(getBusinessBuyerInfoResponse2.equals(getBusinessBuyerInfoResponse1));
        System.assert(getBusinessBuyerInfoResponse3.equals(getBusinessBuyerInfoResponse4));
        System.assert(getBusinessBuyerInfoResponse4.equals(getBusinessBuyerInfoResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse1 = OASGetBusinessBuyerInfoResponse.getExample();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse2 = new OASGetBusinessBuyerInfoResponse();

        System.assertEquals(false, getBusinessBuyerInfoResponse1.equals('foo'));
        System.assertEquals(false, getBusinessBuyerInfoResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse1 = OASGetBusinessBuyerInfoResponse.getExample();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse2 = new OASGetBusinessBuyerInfoResponse();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse3;

        System.assertEquals(false, getBusinessBuyerInfoResponse1.equals(getBusinessBuyerInfoResponse3));
        System.assertEquals(false, getBusinessBuyerInfoResponse2.equals(getBusinessBuyerInfoResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse1 = OASGetBusinessBuyerInfoResponse.getExample();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse2 = new OASGetBusinessBuyerInfoResponse();

        System.assertEquals(getBusinessBuyerInfoResponse1.hashCode(), getBusinessBuyerInfoResponse1.hashCode());
        System.assertEquals(getBusinessBuyerInfoResponse2.hashCode(), getBusinessBuyerInfoResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse1 = OASGetBusinessBuyerInfoResponse.getExample();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse2 = OASGetBusinessBuyerInfoResponse.getExample();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse3 = new OASGetBusinessBuyerInfoResponse();
        OASGetBusinessBuyerInfoResponse getBusinessBuyerInfoResponse4 = new OASGetBusinessBuyerInfoResponse();

        System.assert(getBusinessBuyerInfoResponse1.equals(getBusinessBuyerInfoResponse2));
        System.assert(getBusinessBuyerInfoResponse3.equals(getBusinessBuyerInfoResponse4));
        System.assertEquals(getBusinessBuyerInfoResponse1.hashCode(), getBusinessBuyerInfoResponse2.hashCode());
        System.assertEquals(getBusinessBuyerInfoResponse3.hashCode(), getBusinessBuyerInfoResponse4.hashCode());
    }
}
