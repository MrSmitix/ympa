@isTest
private class OASGoodsFeedbackCommentStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASGoodsFeedbackCommentStatusType> expected = new Set<OASGoodsFeedbackCommentStatusType>{
            OASGoodsFeedbackCommentStatusType.PUBLISHED,
            OASGoodsFeedbackCommentStatusType.UNMODERATED,
            OASGoodsFeedbackCommentStatusType.BANNED,
            OASGoodsFeedbackCommentStatusType.DELETED
        };
        Set<OASGoodsFeedbackCommentStatusType> actual  = new Set<OASGoodsFeedbackCommentStatusType>(OASGoodsFeedbackCommentStatusType.values());
        System.assertEquals(expected, actual);
    }
}
