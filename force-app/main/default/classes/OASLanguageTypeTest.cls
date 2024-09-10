@isTest
private class OASLanguageTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASLanguageType> expected = new Set<OASLanguageType>{
            OASLanguageType.RU,
            OASLanguageType.EN
        };
        Set<OASLanguageType> actual  = new Set<OASLanguageType>(OASLanguageType.values());
        System.assertEquals(expected, actual);
    }
}
