@isTest
private class OASChatTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASChatType> expected = new Set<OASChatType>{
            OASChatType.CHAT,
            OASChatType.ARBITRAGE
        };
        Set<OASChatType> actual  = new Set<OASChatType>(OASChatType.values());
        System.assertEquals(expected, actual);
    }
}
