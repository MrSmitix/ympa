@isTest
private class OASGetBidsInfoResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBidsInfoResponse getBidsInfoResponse1 = OASGetBidsInfoResponse.getExample();
        OASGetBidsInfoResponse getBidsInfoResponse2 = getBidsInfoResponse1;
        OASGetBidsInfoResponse getBidsInfoResponse3 = new OASGetBidsInfoResponse();
        OASGetBidsInfoResponse getBidsInfoResponse4 = getBidsInfoResponse3;

        System.assert(getBidsInfoResponse1.equals(getBidsInfoResponse2));
        System.assert(getBidsInfoResponse2.equals(getBidsInfoResponse1));
        System.assert(getBidsInfoResponse1.equals(getBidsInfoResponse1));
        System.assert(getBidsInfoResponse3.equals(getBidsInfoResponse4));
        System.assert(getBidsInfoResponse4.equals(getBidsInfoResponse3));
        System.assert(getBidsInfoResponse3.equals(getBidsInfoResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBidsInfoResponse getBidsInfoResponse1 = OASGetBidsInfoResponse.getExample();
        OASGetBidsInfoResponse getBidsInfoResponse2 = OASGetBidsInfoResponse.getExample();
        OASGetBidsInfoResponse getBidsInfoResponse3 = new OASGetBidsInfoResponse();
        OASGetBidsInfoResponse getBidsInfoResponse4 = new OASGetBidsInfoResponse();

        System.assert(getBidsInfoResponse1.equals(getBidsInfoResponse2));
        System.assert(getBidsInfoResponse2.equals(getBidsInfoResponse1));
        System.assert(getBidsInfoResponse3.equals(getBidsInfoResponse4));
        System.assert(getBidsInfoResponse4.equals(getBidsInfoResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBidsInfoResponse getBidsInfoResponse1 = OASGetBidsInfoResponse.getExample();
        OASGetBidsInfoResponse getBidsInfoResponse2 = new OASGetBidsInfoResponse();

        System.assertEquals(false, getBidsInfoResponse1.equals('foo'));
        System.assertEquals(false, getBidsInfoResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBidsInfoResponse getBidsInfoResponse1 = OASGetBidsInfoResponse.getExample();
        OASGetBidsInfoResponse getBidsInfoResponse2 = new OASGetBidsInfoResponse();
        OASGetBidsInfoResponse getBidsInfoResponse3;

        System.assertEquals(false, getBidsInfoResponse1.equals(getBidsInfoResponse3));
        System.assertEquals(false, getBidsInfoResponse2.equals(getBidsInfoResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBidsInfoResponse getBidsInfoResponse1 = OASGetBidsInfoResponse.getExample();
        OASGetBidsInfoResponse getBidsInfoResponse2 = new OASGetBidsInfoResponse();

        System.assertEquals(getBidsInfoResponse1.hashCode(), getBidsInfoResponse1.hashCode());
        System.assertEquals(getBidsInfoResponse2.hashCode(), getBidsInfoResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBidsInfoResponse getBidsInfoResponse1 = OASGetBidsInfoResponse.getExample();
        OASGetBidsInfoResponse getBidsInfoResponse2 = OASGetBidsInfoResponse.getExample();
        OASGetBidsInfoResponse getBidsInfoResponse3 = new OASGetBidsInfoResponse();
        OASGetBidsInfoResponse getBidsInfoResponse4 = new OASGetBidsInfoResponse();

        System.assert(getBidsInfoResponse1.equals(getBidsInfoResponse2));
        System.assert(getBidsInfoResponse3.equals(getBidsInfoResponse4));
        System.assertEquals(getBidsInfoResponse1.hashCode(), getBidsInfoResponse2.hashCode());
        System.assertEquals(getBidsInfoResponse3.hashCode(), getBidsInfoResponse4.hashCode());
    }
}
