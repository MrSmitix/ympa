@isTest
private class OASFeedbackReactionStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedbackReactionStatusType> expected = new Set<OASFeedbackReactionStatusType>{
            OASFeedbackReactionStatusType.ALL,
            OASFeedbackReactionStatusType.NEED_REACTION
        };
        Set<OASFeedbackReactionStatusType> actual  = new Set<OASFeedbackReactionStatusType>(OASFeedbackReactionStatusType.values());
        System.assertEquals(expected, actual);
    }
}
