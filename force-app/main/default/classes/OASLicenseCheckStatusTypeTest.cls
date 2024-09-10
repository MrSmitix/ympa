@isTest
private class OASLicenseCheckStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASLicenseCheckStatusType> expected = new Set<OASLicenseCheckStatusType>{
            OASLicenseCheckStatusType.NEW,
            OASLicenseCheckStatusType.SUCCESS,
            OASLicenseCheckStatusType.FAIL,
            OASLicenseCheckStatusType.REVOKE,
            OASLicenseCheckStatusType.DONT_WANT,
            OASLicenseCheckStatusType.FAIL_MANUAL
        };
        Set<OASLicenseCheckStatusType> actual  = new Set<OASLicenseCheckStatusType>(OASLicenseCheckStatusType.values());
        System.assertEquals(expected, actual);
    }
}
