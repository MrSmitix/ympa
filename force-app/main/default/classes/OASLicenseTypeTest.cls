@isTest
private class OASLicenseTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASLicenseType> expected = new Set<OASLicenseType>{
            OASLicenseType.ALCOHOL,
            OASLicenseType.UNKNOWN
        };
        Set<OASLicenseType> actual  = new Set<OASLicenseType>(OASLicenseType.values());
        System.assertEquals(expected, actual);
    }
}
