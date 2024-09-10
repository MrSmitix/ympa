@isTest
private class OASReturnTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASReturnType> expected = new Set<OASReturnType>{
            OASReturnType.UNREDEEMED,
            OASReturnType.RETURN
        };
        Set<OASReturnType> actual  = new Set<OASReturnType>(OASReturnType.values());
        System.assertEquals(expected, actual);
    }
}
