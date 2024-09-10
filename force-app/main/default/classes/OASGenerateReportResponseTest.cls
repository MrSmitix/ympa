@isTest
private class OASGenerateReportResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateReportResponse generateReportResponse1 = OASGenerateReportResponse.getExample();
        OASGenerateReportResponse generateReportResponse2 = generateReportResponse1;
        OASGenerateReportResponse generateReportResponse3 = new OASGenerateReportResponse();
        OASGenerateReportResponse generateReportResponse4 = generateReportResponse3;

        System.assert(generateReportResponse1.equals(generateReportResponse2));
        System.assert(generateReportResponse2.equals(generateReportResponse1));
        System.assert(generateReportResponse1.equals(generateReportResponse1));
        System.assert(generateReportResponse3.equals(generateReportResponse4));
        System.assert(generateReportResponse4.equals(generateReportResponse3));
        System.assert(generateReportResponse3.equals(generateReportResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateReportResponse generateReportResponse1 = OASGenerateReportResponse.getExample();
        OASGenerateReportResponse generateReportResponse2 = OASGenerateReportResponse.getExample();
        OASGenerateReportResponse generateReportResponse3 = new OASGenerateReportResponse();
        OASGenerateReportResponse generateReportResponse4 = new OASGenerateReportResponse();

        System.assert(generateReportResponse1.equals(generateReportResponse2));
        System.assert(generateReportResponse2.equals(generateReportResponse1));
        System.assert(generateReportResponse3.equals(generateReportResponse4));
        System.assert(generateReportResponse4.equals(generateReportResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateReportResponse generateReportResponse1 = OASGenerateReportResponse.getExample();
        OASGenerateReportResponse generateReportResponse2 = new OASGenerateReportResponse();

        System.assertEquals(false, generateReportResponse1.equals('foo'));
        System.assertEquals(false, generateReportResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateReportResponse generateReportResponse1 = OASGenerateReportResponse.getExample();
        OASGenerateReportResponse generateReportResponse2 = new OASGenerateReportResponse();
        OASGenerateReportResponse generateReportResponse3;

        System.assertEquals(false, generateReportResponse1.equals(generateReportResponse3));
        System.assertEquals(false, generateReportResponse2.equals(generateReportResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateReportResponse generateReportResponse1 = OASGenerateReportResponse.getExample();
        OASGenerateReportResponse generateReportResponse2 = new OASGenerateReportResponse();

        System.assertEquals(generateReportResponse1.hashCode(), generateReportResponse1.hashCode());
        System.assertEquals(generateReportResponse2.hashCode(), generateReportResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateReportResponse generateReportResponse1 = OASGenerateReportResponse.getExample();
        OASGenerateReportResponse generateReportResponse2 = OASGenerateReportResponse.getExample();
        OASGenerateReportResponse generateReportResponse3 = new OASGenerateReportResponse();
        OASGenerateReportResponse generateReportResponse4 = new OASGenerateReportResponse();

        System.assert(generateReportResponse1.equals(generateReportResponse2));
        System.assert(generateReportResponse3.equals(generateReportResponse4));
        System.assertEquals(generateReportResponse1.hashCode(), generateReportResponse2.hashCode());
        System.assertEquals(generateReportResponse3.hashCode(), generateReportResponse4.hashCode());
    }
}
