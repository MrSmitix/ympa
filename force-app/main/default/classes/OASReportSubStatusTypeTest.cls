@isTest
private class OASReportSubStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReportSubStatusType> expected = new Set<OASReportSubStatusType>{
            OASReportSubStatusType.NO_DATA,
            OASReportSubStatusType.TOO_LARGE,
            OASReportSubStatusType.RESOURCE_NOT_FOUND
        };
        Set<OASReportSubStatusType> actual  = new Set<OASReportSubStatusType>(OASReportSubStatusType.values());
        System.assertEquals(expected, actual);
    }
}
