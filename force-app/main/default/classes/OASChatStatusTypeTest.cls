@isTest
private class OASChatStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASChatStatusType> expected = new Set<OASChatStatusType>{
            OASChatStatusType.NEW,
            OASChatStatusType.WAITING_FOR_CUSTOMER,
            OASChatStatusType.WAITING_FOR_PARTNER,
            OASChatStatusType.WAITING_FOR_ARBITER,
            OASChatStatusType.WAITING_FOR_MARKET,
            OASChatStatusType.FINISHED
        };
        Set<OASChatStatusType> actual  = new Set<OASChatStatusType>(OASChatStatusType.values());
        System.assertEquals(expected, actual);
    }
}
