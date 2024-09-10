@isTest
private class OASGetChatHistoryResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetChatHistoryResponse getChatHistoryResponse1 = OASGetChatHistoryResponse.getExample();
        OASGetChatHistoryResponse getChatHistoryResponse2 = getChatHistoryResponse1;
        OASGetChatHistoryResponse getChatHistoryResponse3 = new OASGetChatHistoryResponse();
        OASGetChatHistoryResponse getChatHistoryResponse4 = getChatHistoryResponse3;

        System.assert(getChatHistoryResponse1.equals(getChatHistoryResponse2));
        System.assert(getChatHistoryResponse2.equals(getChatHistoryResponse1));
        System.assert(getChatHistoryResponse1.equals(getChatHistoryResponse1));
        System.assert(getChatHistoryResponse3.equals(getChatHistoryResponse4));
        System.assert(getChatHistoryResponse4.equals(getChatHistoryResponse3));
        System.assert(getChatHistoryResponse3.equals(getChatHistoryResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetChatHistoryResponse getChatHistoryResponse1 = OASGetChatHistoryResponse.getExample();
        OASGetChatHistoryResponse getChatHistoryResponse2 = OASGetChatHistoryResponse.getExample();
        OASGetChatHistoryResponse getChatHistoryResponse3 = new OASGetChatHistoryResponse();
        OASGetChatHistoryResponse getChatHistoryResponse4 = new OASGetChatHistoryResponse();

        System.assert(getChatHistoryResponse1.equals(getChatHistoryResponse2));
        System.assert(getChatHistoryResponse2.equals(getChatHistoryResponse1));
        System.assert(getChatHistoryResponse3.equals(getChatHistoryResponse4));
        System.assert(getChatHistoryResponse4.equals(getChatHistoryResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetChatHistoryResponse getChatHistoryResponse1 = OASGetChatHistoryResponse.getExample();
        OASGetChatHistoryResponse getChatHistoryResponse2 = new OASGetChatHistoryResponse();

        System.assertEquals(false, getChatHistoryResponse1.equals('foo'));
        System.assertEquals(false, getChatHistoryResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetChatHistoryResponse getChatHistoryResponse1 = OASGetChatHistoryResponse.getExample();
        OASGetChatHistoryResponse getChatHistoryResponse2 = new OASGetChatHistoryResponse();
        OASGetChatHistoryResponse getChatHistoryResponse3;

        System.assertEquals(false, getChatHistoryResponse1.equals(getChatHistoryResponse3));
        System.assertEquals(false, getChatHistoryResponse2.equals(getChatHistoryResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetChatHistoryResponse getChatHistoryResponse1 = OASGetChatHistoryResponse.getExample();
        OASGetChatHistoryResponse getChatHistoryResponse2 = new OASGetChatHistoryResponse();

        System.assertEquals(getChatHistoryResponse1.hashCode(), getChatHistoryResponse1.hashCode());
        System.assertEquals(getChatHistoryResponse2.hashCode(), getChatHistoryResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetChatHistoryResponse getChatHistoryResponse1 = OASGetChatHistoryResponse.getExample();
        OASGetChatHistoryResponse getChatHistoryResponse2 = OASGetChatHistoryResponse.getExample();
        OASGetChatHistoryResponse getChatHistoryResponse3 = new OASGetChatHistoryResponse();
        OASGetChatHistoryResponse getChatHistoryResponse4 = new OASGetChatHistoryResponse();

        System.assert(getChatHistoryResponse1.equals(getChatHistoryResponse2));
        System.assert(getChatHistoryResponse3.equals(getChatHistoryResponse4));
        System.assertEquals(getChatHistoryResponse1.hashCode(), getChatHistoryResponse2.hashCode());
        System.assertEquals(getChatHistoryResponse3.hashCode(), getChatHistoryResponse4.hashCode());
    }
}
