@isTest
private class OASGetOutletLicensesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOutletLicensesResponse getOutletLicensesResponse1 = OASGetOutletLicensesResponse.getExample();
        OASGetOutletLicensesResponse getOutletLicensesResponse2 = getOutletLicensesResponse1;
        OASGetOutletLicensesResponse getOutletLicensesResponse3 = new OASGetOutletLicensesResponse();
        OASGetOutletLicensesResponse getOutletLicensesResponse4 = getOutletLicensesResponse3;

        System.assert(getOutletLicensesResponse1.equals(getOutletLicensesResponse2));
        System.assert(getOutletLicensesResponse2.equals(getOutletLicensesResponse1));
        System.assert(getOutletLicensesResponse1.equals(getOutletLicensesResponse1));
        System.assert(getOutletLicensesResponse3.equals(getOutletLicensesResponse4));
        System.assert(getOutletLicensesResponse4.equals(getOutletLicensesResponse3));
        System.assert(getOutletLicensesResponse3.equals(getOutletLicensesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOutletLicensesResponse getOutletLicensesResponse1 = OASGetOutletLicensesResponse.getExample();
        OASGetOutletLicensesResponse getOutletLicensesResponse2 = OASGetOutletLicensesResponse.getExample();
        OASGetOutletLicensesResponse getOutletLicensesResponse3 = new OASGetOutletLicensesResponse();
        OASGetOutletLicensesResponse getOutletLicensesResponse4 = new OASGetOutletLicensesResponse();

        System.assert(getOutletLicensesResponse1.equals(getOutletLicensesResponse2));
        System.assert(getOutletLicensesResponse2.equals(getOutletLicensesResponse1));
        System.assert(getOutletLicensesResponse3.equals(getOutletLicensesResponse4));
        System.assert(getOutletLicensesResponse4.equals(getOutletLicensesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOutletLicensesResponse getOutletLicensesResponse1 = OASGetOutletLicensesResponse.getExample();
        OASGetOutletLicensesResponse getOutletLicensesResponse2 = new OASGetOutletLicensesResponse();

        System.assertEquals(false, getOutletLicensesResponse1.equals('foo'));
        System.assertEquals(false, getOutletLicensesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOutletLicensesResponse getOutletLicensesResponse1 = OASGetOutletLicensesResponse.getExample();
        OASGetOutletLicensesResponse getOutletLicensesResponse2 = new OASGetOutletLicensesResponse();
        OASGetOutletLicensesResponse getOutletLicensesResponse3;

        System.assertEquals(false, getOutletLicensesResponse1.equals(getOutletLicensesResponse3));
        System.assertEquals(false, getOutletLicensesResponse2.equals(getOutletLicensesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOutletLicensesResponse getOutletLicensesResponse1 = OASGetOutletLicensesResponse.getExample();
        OASGetOutletLicensesResponse getOutletLicensesResponse2 = new OASGetOutletLicensesResponse();

        System.assertEquals(getOutletLicensesResponse1.hashCode(), getOutletLicensesResponse1.hashCode());
        System.assertEquals(getOutletLicensesResponse2.hashCode(), getOutletLicensesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOutletLicensesResponse getOutletLicensesResponse1 = OASGetOutletLicensesResponse.getExample();
        OASGetOutletLicensesResponse getOutletLicensesResponse2 = OASGetOutletLicensesResponse.getExample();
        OASGetOutletLicensesResponse getOutletLicensesResponse3 = new OASGetOutletLicensesResponse();
        OASGetOutletLicensesResponse getOutletLicensesResponse4 = new OASGetOutletLicensesResponse();

        System.assert(getOutletLicensesResponse1.equals(getOutletLicensesResponse2));
        System.assert(getOutletLicensesResponse3.equals(getOutletLicensesResponse4));
        System.assertEquals(getOutletLicensesResponse1.hashCode(), getOutletLicensesResponse2.hashCode());
        System.assertEquals(getOutletLicensesResponse3.hashCode(), getOutletLicensesResponse4.hashCode());
    }
}
