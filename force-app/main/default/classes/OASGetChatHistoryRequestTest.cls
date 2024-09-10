@isTest
private class OASGetChatHistoryRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetChatHistoryRequest getChatHistoryRequest1 = OASGetChatHistoryRequest.getExample();
        OASGetChatHistoryRequest getChatHistoryRequest2 = getChatHistoryRequest1;
        OASGetChatHistoryRequest getChatHistoryRequest3 = new OASGetChatHistoryRequest();
        OASGetChatHistoryRequest getChatHistoryRequest4 = getChatHistoryRequest3;

        System.assert(getChatHistoryRequest1.equals(getChatHistoryRequest2));
        System.assert(getChatHistoryRequest2.equals(getChatHistoryRequest1));
        System.assert(getChatHistoryRequest1.equals(getChatHistoryRequest1));
        System.assert(getChatHistoryRequest3.equals(getChatHistoryRequest4));
        System.assert(getChatHistoryRequest4.equals(getChatHistoryRequest3));
        System.assert(getChatHistoryRequest3.equals(getChatHistoryRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetChatHistoryRequest getChatHistoryRequest1 = OASGetChatHistoryRequest.getExample();
        OASGetChatHistoryRequest getChatHistoryRequest2 = OASGetChatHistoryRequest.getExample();
        OASGetChatHistoryRequest getChatHistoryRequest3 = new OASGetChatHistoryRequest();
        OASGetChatHistoryRequest getChatHistoryRequest4 = new OASGetChatHistoryRequest();

        System.assert(getChatHistoryRequest1.equals(getChatHistoryRequest2));
        System.assert(getChatHistoryRequest2.equals(getChatHistoryRequest1));
        System.assert(getChatHistoryRequest3.equals(getChatHistoryRequest4));
        System.assert(getChatHistoryRequest4.equals(getChatHistoryRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetChatHistoryRequest getChatHistoryRequest1 = OASGetChatHistoryRequest.getExample();
        OASGetChatHistoryRequest getChatHistoryRequest2 = new OASGetChatHistoryRequest();

        System.assertEquals(false, getChatHistoryRequest1.equals('foo'));
        System.assertEquals(false, getChatHistoryRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetChatHistoryRequest getChatHistoryRequest1 = OASGetChatHistoryRequest.getExample();
        OASGetChatHistoryRequest getChatHistoryRequest2 = new OASGetChatHistoryRequest();
        OASGetChatHistoryRequest getChatHistoryRequest3;

        System.assertEquals(false, getChatHistoryRequest1.equals(getChatHistoryRequest3));
        System.assertEquals(false, getChatHistoryRequest2.equals(getChatHistoryRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetChatHistoryRequest getChatHistoryRequest1 = OASGetChatHistoryRequest.getExample();
        OASGetChatHistoryRequest getChatHistoryRequest2 = new OASGetChatHistoryRequest();

        System.assertEquals(getChatHistoryRequest1.hashCode(), getChatHistoryRequest1.hashCode());
        System.assertEquals(getChatHistoryRequest2.hashCode(), getChatHistoryRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetChatHistoryRequest getChatHistoryRequest1 = OASGetChatHistoryRequest.getExample();
        OASGetChatHistoryRequest getChatHistoryRequest2 = OASGetChatHistoryRequest.getExample();
        OASGetChatHistoryRequest getChatHistoryRequest3 = new OASGetChatHistoryRequest();
        OASGetChatHistoryRequest getChatHistoryRequest4 = new OASGetChatHistoryRequest();

        System.assert(getChatHistoryRequest1.equals(getChatHistoryRequest2));
        System.assert(getChatHistoryRequest3.equals(getChatHistoryRequest4));
        System.assertEquals(getChatHistoryRequest1.hashCode(), getChatHistoryRequest2.hashCode());
        System.assertEquals(getChatHistoryRequest3.hashCode(), getChatHistoryRequest4.hashCode());
    }
}
