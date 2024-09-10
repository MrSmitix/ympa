@isTest
private class OASPageFormatTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPageFormatType> expected = new Set<OASPageFormatType>{
            OASPageFormatType.A7,
            OASPageFormatType.A4
        };
        Set<OASPageFormatType> actual  = new Set<OASPageFormatType>(OASPageFormatType.values());
        System.assertEquals(expected, actual);
    }
}
