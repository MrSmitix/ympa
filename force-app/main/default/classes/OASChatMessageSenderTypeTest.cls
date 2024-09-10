@isTest
private class OASChatMessageSenderTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASChatMessageSenderType> expected = new Set<OASChatMessageSenderType>{
            OASChatMessageSenderType.PARTNER,
            OASChatMessageSenderType.CUSTOMER,
            OASChatMessageSenderType.MARKET,
            OASChatMessageSenderType.SUPPORT
        };
        Set<OASChatMessageSenderType> actual  = new Set<OASChatMessageSenderType>(OASChatMessageSenderType.values());
        System.assertEquals(expected, actual);
    }
}
