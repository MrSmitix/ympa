@isTest
private class OASOutletStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOutletStatusType> expected = new Set<OASOutletStatusType>{
            OASOutletStatusType.AT_MODERATION,
            OASOutletStatusType.FAILED,
            OASOutletStatusType.MODERATED,
            OASOutletStatusType.NONMODERATED,
            OASOutletStatusType.UNKNOWN
        };
        Set<OASOutletStatusType> actual  = new Set<OASOutletStatusType>(OASOutletStatusType.values());
        System.assertEquals(expected, actual);
    }
}
