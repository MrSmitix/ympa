@isTest
private class OASEacVerificationStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASEacVerificationStatusType> expected = new Set<OASEacVerificationStatusType>{
            OASEacVerificationStatusType.ACCEPTED,
            OASEacVerificationStatusType.REJECTED,
            OASEacVerificationStatusType.NEED_UPDATE
        };
        Set<OASEacVerificationStatusType> actual  = new Set<OASEacVerificationStatusType>(OASEacVerificationStatusType.values());
        System.assertEquals(expected, actual);
    }
}
