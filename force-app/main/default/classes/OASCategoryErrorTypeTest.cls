@isTest
private class OASCategoryErrorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASCategoryErrorType> expected = new Set<OASCategoryErrorType>{
            OASCategoryErrorType.UNKNOWN_CATEGORY,
            OASCategoryErrorType.CATEGORY_IS_NOT_LEAF
        };
        Set<OASCategoryErrorType> actual  = new Set<OASCategoryErrorType>(OASCategoryErrorType.values());
        System.assertEquals(expected, actual);
    }
}
