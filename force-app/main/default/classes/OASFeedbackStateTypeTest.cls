@isTest
private class OASFeedbackStateTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFeedbackStateType> expected = new Set<OASFeedbackStateType>{
            OASFeedbackStateType.LAST,
            OASFeedbackStateType.PREVIOUS,
            OASFeedbackStateType.DELETED
        };
        Set<OASFeedbackStateType> actual  = new Set<OASFeedbackStateType>(OASFeedbackStateType.values());
        System.assertEquals(expected, actual);
    }
}
