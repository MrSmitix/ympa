@isTest
private class OASApiResponseStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASApiResponseStatusType> expected = new Set<OASApiResponseStatusType>{
            OASApiResponseStatusType.OK,
            OASApiResponseStatusType.ERROR
        };
        Set<OASApiResponseStatusType> actual  = new Set<OASApiResponseStatusType>(OASApiResponseStatusType.values());
        System.assertEquals(expected, actual);
    }
}
