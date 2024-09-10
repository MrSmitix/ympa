@isTest
private class OASGoodsFeedbackCommentAuthorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASGoodsFeedbackCommentAuthorType> expected = new Set<OASGoodsFeedbackCommentAuthorType>{
            OASGoodsFeedbackCommentAuthorType.USER,
            OASGoodsFeedbackCommentAuthorType.BUSINESS
        };
        Set<OASGoodsFeedbackCommentAuthorType> actual  = new Set<OASGoodsFeedbackCommentAuthorType>(OASGoodsFeedbackCommentAuthorType.values());
        System.assertEquals(expected, actual);
    }
}
