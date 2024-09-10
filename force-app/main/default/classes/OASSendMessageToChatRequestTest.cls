@isTest
private class OASSendMessageToChatRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSendMessageToChatRequest sendMessageToChatRequest1 = OASSendMessageToChatRequest.getExample();
        OASSendMessageToChatRequest sendMessageToChatRequest2 = sendMessageToChatRequest1;
        OASSendMessageToChatRequest sendMessageToChatRequest3 = new OASSendMessageToChatRequest();
        OASSendMessageToChatRequest sendMessageToChatRequest4 = sendMessageToChatRequest3;

        System.assert(sendMessageToChatRequest1.equals(sendMessageToChatRequest2));
        System.assert(sendMessageToChatRequest2.equals(sendMessageToChatRequest1));
        System.assert(sendMessageToChatRequest1.equals(sendMessageToChatRequest1));
        System.assert(sendMessageToChatRequest3.equals(sendMessageToChatRequest4));
        System.assert(sendMessageToChatRequest4.equals(sendMessageToChatRequest3));
        System.assert(sendMessageToChatRequest3.equals(sendMessageToChatRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSendMessageToChatRequest sendMessageToChatRequest1 = OASSendMessageToChatRequest.getExample();
        OASSendMessageToChatRequest sendMessageToChatRequest2 = OASSendMessageToChatRequest.getExample();
        OASSendMessageToChatRequest sendMessageToChatRequest3 = new OASSendMessageToChatRequest();
        OASSendMessageToChatRequest sendMessageToChatRequest4 = new OASSendMessageToChatRequest();

        System.assert(sendMessageToChatRequest1.equals(sendMessageToChatRequest2));
        System.assert(sendMessageToChatRequest2.equals(sendMessageToChatRequest1));
        System.assert(sendMessageToChatRequest3.equals(sendMessageToChatRequest4));
        System.assert(sendMessageToChatRequest4.equals(sendMessageToChatRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSendMessageToChatRequest sendMessageToChatRequest1 = OASSendMessageToChatRequest.getExample();
        OASSendMessageToChatRequest sendMessageToChatRequest2 = new OASSendMessageToChatRequest();

        System.assertEquals(false, sendMessageToChatRequest1.equals('foo'));
        System.assertEquals(false, sendMessageToChatRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSendMessageToChatRequest sendMessageToChatRequest1 = OASSendMessageToChatRequest.getExample();
        OASSendMessageToChatRequest sendMessageToChatRequest2 = new OASSendMessageToChatRequest();
        OASSendMessageToChatRequest sendMessageToChatRequest3;

        System.assertEquals(false, sendMessageToChatRequest1.equals(sendMessageToChatRequest3));
        System.assertEquals(false, sendMessageToChatRequest2.equals(sendMessageToChatRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSendMessageToChatRequest sendMessageToChatRequest1 = OASSendMessageToChatRequest.getExample();
        OASSendMessageToChatRequest sendMessageToChatRequest2 = new OASSendMessageToChatRequest();

        System.assertEquals(sendMessageToChatRequest1.hashCode(), sendMessageToChatRequest1.hashCode());
        System.assertEquals(sendMessageToChatRequest2.hashCode(), sendMessageToChatRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSendMessageToChatRequest sendMessageToChatRequest1 = OASSendMessageToChatRequest.getExample();
        OASSendMessageToChatRequest sendMessageToChatRequest2 = OASSendMessageToChatRequest.getExample();
        OASSendMessageToChatRequest sendMessageToChatRequest3 = new OASSendMessageToChatRequest();
        OASSendMessageToChatRequest sendMessageToChatRequest4 = new OASSendMessageToChatRequest();

        System.assert(sendMessageToChatRequest1.equals(sendMessageToChatRequest2));
        System.assert(sendMessageToChatRequest3.equals(sendMessageToChatRequest4));
        System.assertEquals(sendMessageToChatRequest1.hashCode(), sendMessageToChatRequest2.hashCode());
        System.assertEquals(sendMessageToChatRequest3.hashCode(), sendMessageToChatRequest4.hashCode());
    }
}
