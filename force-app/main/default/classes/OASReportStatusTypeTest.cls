@isTest
private class OASReportStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReportStatusType> expected = new Set<OASReportStatusType>{
            OASReportStatusType.PENDING,
            OASReportStatusType.PROCESSING,
            OASReportStatusType.FAILED,
            OASReportStatusType.DONE
        };
        Set<OASReportStatusType> actual  = new Set<OASReportStatusType>(OASReportStatusType.values());
        System.assertEquals(expected, actual);
    }
}
