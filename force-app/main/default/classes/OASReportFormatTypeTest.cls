@isTest
private class OASReportFormatTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReportFormatType> expected = new Set<OASReportFormatType>{
            OASReportFormatType.FILE,
            OASReportFormatType.CSV
        };
        Set<OASReportFormatType> actual  = new Set<OASReportFormatType>(OASReportFormatType.values());
        System.assertEquals(expected, actual);
    }
}
