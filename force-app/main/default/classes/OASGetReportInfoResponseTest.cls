@isTest
private class OASGetReportInfoResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetReportInfoResponse getReportInfoResponse1 = OASGetReportInfoResponse.getExample();
        OASGetReportInfoResponse getReportInfoResponse2 = getReportInfoResponse1;
        OASGetReportInfoResponse getReportInfoResponse3 = new OASGetReportInfoResponse();
        OASGetReportInfoResponse getReportInfoResponse4 = getReportInfoResponse3;

        System.assert(getReportInfoResponse1.equals(getReportInfoResponse2));
        System.assert(getReportInfoResponse2.equals(getReportInfoResponse1));
        System.assert(getReportInfoResponse1.equals(getReportInfoResponse1));
        System.assert(getReportInfoResponse3.equals(getReportInfoResponse4));
        System.assert(getReportInfoResponse4.equals(getReportInfoResponse3));
        System.assert(getReportInfoResponse3.equals(getReportInfoResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetReportInfoResponse getReportInfoResponse1 = OASGetReportInfoResponse.getExample();
        OASGetReportInfoResponse getReportInfoResponse2 = OASGetReportInfoResponse.getExample();
        OASGetReportInfoResponse getReportInfoResponse3 = new OASGetReportInfoResponse();
        OASGetReportInfoResponse getReportInfoResponse4 = new OASGetReportInfoResponse();

        System.assert(getReportInfoResponse1.equals(getReportInfoResponse2));
        System.assert(getReportInfoResponse2.equals(getReportInfoResponse1));
        System.assert(getReportInfoResponse3.equals(getReportInfoResponse4));
        System.assert(getReportInfoResponse4.equals(getReportInfoResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetReportInfoResponse getReportInfoResponse1 = OASGetReportInfoResponse.getExample();
        OASGetReportInfoResponse getReportInfoResponse2 = new OASGetReportInfoResponse();

        System.assertEquals(false, getReportInfoResponse1.equals('foo'));
        System.assertEquals(false, getReportInfoResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetReportInfoResponse getReportInfoResponse1 = OASGetReportInfoResponse.getExample();
        OASGetReportInfoResponse getReportInfoResponse2 = new OASGetReportInfoResponse();
        OASGetReportInfoResponse getReportInfoResponse3;

        System.assertEquals(false, getReportInfoResponse1.equals(getReportInfoResponse3));
        System.assertEquals(false, getReportInfoResponse2.equals(getReportInfoResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetReportInfoResponse getReportInfoResponse1 = OASGetReportInfoResponse.getExample();
        OASGetReportInfoResponse getReportInfoResponse2 = new OASGetReportInfoResponse();

        System.assertEquals(getReportInfoResponse1.hashCode(), getReportInfoResponse1.hashCode());
        System.assertEquals(getReportInfoResponse2.hashCode(), getReportInfoResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetReportInfoResponse getReportInfoResponse1 = OASGetReportInfoResponse.getExample();
        OASGetReportInfoResponse getReportInfoResponse2 = OASGetReportInfoResponse.getExample();
        OASGetReportInfoResponse getReportInfoResponse3 = new OASGetReportInfoResponse();
        OASGetReportInfoResponse getReportInfoResponse4 = new OASGetReportInfoResponse();

        System.assert(getReportInfoResponse1.equals(getReportInfoResponse2));
        System.assert(getReportInfoResponse3.equals(getReportInfoResponse4));
        System.assertEquals(getReportInfoResponse1.hashCode(), getReportInfoResponse2.hashCode());
        System.assertEquals(getReportInfoResponse3.hashCode(), getReportInfoResponse4.hashCode());
    }
}
