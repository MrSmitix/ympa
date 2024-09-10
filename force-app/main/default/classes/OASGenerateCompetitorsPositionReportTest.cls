@isTest
private class OASGenerateCompetitorsPositionReportTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest1 = OASGenerateCompetitorsPositionReport.getExample();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest2 = generateCompetitorsPositionReportRequest1;
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest3 = new OASGenerateCompetitorsPositionReport();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest4 = generateCompetitorsPositionReportRequest3;

        System.assert(generateCompetitorsPositionReportRequest1.equals(generateCompetitorsPositionReportRequest2));
        System.assert(generateCompetitorsPositionReportRequest2.equals(generateCompetitorsPositionReportRequest1));
        System.assert(generateCompetitorsPositionReportRequest1.equals(generateCompetitorsPositionReportRequest1));
        System.assert(generateCompetitorsPositionReportRequest3.equals(generateCompetitorsPositionReportRequest4));
        System.assert(generateCompetitorsPositionReportRequest4.equals(generateCompetitorsPositionReportRequest3));
        System.assert(generateCompetitorsPositionReportRequest3.equals(generateCompetitorsPositionReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest1 = OASGenerateCompetitorsPositionReport.getExample();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest2 = OASGenerateCompetitorsPositionReport.getExample();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest3 = new OASGenerateCompetitorsPositionReport();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest4 = new OASGenerateCompetitorsPositionReport();

        System.assert(generateCompetitorsPositionReportRequest1.equals(generateCompetitorsPositionReportRequest2));
        System.assert(generateCompetitorsPositionReportRequest2.equals(generateCompetitorsPositionReportRequest1));
        System.assert(generateCompetitorsPositionReportRequest3.equals(generateCompetitorsPositionReportRequest4));
        System.assert(generateCompetitorsPositionReportRequest4.equals(generateCompetitorsPositionReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest1 = OASGenerateCompetitorsPositionReport.getExample();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest2 = new OASGenerateCompetitorsPositionReport();

        System.assertEquals(false, generateCompetitorsPositionReportRequest1.equals('foo'));
        System.assertEquals(false, generateCompetitorsPositionReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest1 = OASGenerateCompetitorsPositionReport.getExample();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest2 = new OASGenerateCompetitorsPositionReport();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest3;

        System.assertEquals(false, generateCompetitorsPositionReportRequest1.equals(generateCompetitorsPositionReportRequest3));
        System.assertEquals(false, generateCompetitorsPositionReportRequest2.equals(generateCompetitorsPositionReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest1 = OASGenerateCompetitorsPositionReport.getExample();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest2 = new OASGenerateCompetitorsPositionReport();

        System.assertEquals(generateCompetitorsPositionReportRequest1.hashCode(), generateCompetitorsPositionReportRequest1.hashCode());
        System.assertEquals(generateCompetitorsPositionReportRequest2.hashCode(), generateCompetitorsPositionReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest1 = OASGenerateCompetitorsPositionReport.getExample();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest2 = OASGenerateCompetitorsPositionReport.getExample();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest3 = new OASGenerateCompetitorsPositionReport();
        OASGenerateCompetitorsPositionReport generateCompetitorsPositionReportRequest4 = new OASGenerateCompetitorsPositionReport();

        System.assert(generateCompetitorsPositionReportRequest1.equals(generateCompetitorsPositionReportRequest2));
        System.assert(generateCompetitorsPositionReportRequest3.equals(generateCompetitorsPositionReportRequest4));
        System.assertEquals(generateCompetitorsPositionReportRequest1.hashCode(), generateCompetitorsPositionReportRequest2.hashCode());
        System.assertEquals(generateCompetitorsPositionReportRequest3.hashCode(), generateCompetitorsPositionReportRequest4.hashCode());
    }
}
