@isTest
private class OASTurnoverTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASTurnoverType> expected = new Set<OASTurnoverType>{
            OASTurnoverType.LOW,
            OASTurnoverType.ALMOST_LOW,
            OASTurnoverType.HIGH,
            OASTurnoverType.VERY_HIGH,
            OASTurnoverType.NO_SALES,
            OASTurnoverType.FREE_STORE
        };
        Set<OASTurnoverType> actual  = new Set<OASTurnoverType>(OASTurnoverType.values());
        System.assertEquals(expected, actual);
    }
}
