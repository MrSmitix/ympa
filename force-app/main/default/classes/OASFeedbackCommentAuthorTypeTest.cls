@isTest
private class OASFeedbackCommentAuthorTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedbackCommentAuthorType> expected = new Set<OASFeedbackCommentAuthorType>{
            OASFeedbackCommentAuthorType.USER,
            OASFeedbackCommentAuthorType.SHOP
        };
        Set<OASFeedbackCommentAuthorType> actual  = new Set<OASFeedbackCommentAuthorType>(OASFeedbackCommentAuthorType.values());
        System.assertEquals(expected, actual);
    }
}
