@isTest
private class OASGetChatsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetChatsRequest getChatsRequest1 = OASGetChatsRequest.getExample();
        OASGetChatsRequest getChatsRequest2 = getChatsRequest1;
        OASGetChatsRequest getChatsRequest3 = new OASGetChatsRequest();
        OASGetChatsRequest getChatsRequest4 = getChatsRequest3;

        System.assert(getChatsRequest1.equals(getChatsRequest2));
        System.assert(getChatsRequest2.equals(getChatsRequest1));
        System.assert(getChatsRequest1.equals(getChatsRequest1));
        System.assert(getChatsRequest3.equals(getChatsRequest4));
        System.assert(getChatsRequest4.equals(getChatsRequest3));
        System.assert(getChatsRequest3.equals(getChatsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetChatsRequest getChatsRequest1 = OASGetChatsRequest.getExample();
        OASGetChatsRequest getChatsRequest2 = OASGetChatsRequest.getExample();
        OASGetChatsRequest getChatsRequest3 = new OASGetChatsRequest();
        OASGetChatsRequest getChatsRequest4 = new OASGetChatsRequest();

        System.assert(getChatsRequest1.equals(getChatsRequest2));
        System.assert(getChatsRequest2.equals(getChatsRequest1));
        System.assert(getChatsRequest3.equals(getChatsRequest4));
        System.assert(getChatsRequest4.equals(getChatsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetChatsRequest getChatsRequest1 = OASGetChatsRequest.getExample();
        OASGetChatsRequest getChatsRequest2 = new OASGetChatsRequest();

        System.assertEquals(false, getChatsRequest1.equals('foo'));
        System.assertEquals(false, getChatsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetChatsRequest getChatsRequest1 = OASGetChatsRequest.getExample();
        OASGetChatsRequest getChatsRequest2 = new OASGetChatsRequest();
        OASGetChatsRequest getChatsRequest3;

        System.assertEquals(false, getChatsRequest1.equals(getChatsRequest3));
        System.assertEquals(false, getChatsRequest2.equals(getChatsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetChatsRequest getChatsRequest1 = OASGetChatsRequest.getExample();
        OASGetChatsRequest getChatsRequest2 = new OASGetChatsRequest();

        System.assertEquals(getChatsRequest1.hashCode(), getChatsRequest1.hashCode());
        System.assertEquals(getChatsRequest2.hashCode(), getChatsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetChatsRequest getChatsRequest1 = OASGetChatsRequest.getExample();
        OASGetChatsRequest getChatsRequest2 = OASGetChatsRequest.getExample();
        OASGetChatsRequest getChatsRequest3 = new OASGetChatsRequest();
        OASGetChatsRequest getChatsRequest4 = new OASGetChatsRequest();

        System.assert(getChatsRequest1.equals(getChatsRequest2));
        System.assert(getChatsRequest3.equals(getChatsRequest4));
        System.assertEquals(getChatsRequest1.hashCode(), getChatsRequest2.hashCode());
        System.assertEquals(getChatsRequest3.hashCode(), getChatsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetChatsRequest getChatsRequest = new OASGetChatsRequest();
        System.assertEquals(new List<Long>(), getChatsRequest.orderIds);
        System.assertEquals(new List<OASChatType>(), getChatsRequest.types);
        System.assertEquals(new List<OASChatStatusType>(), getChatsRequest.statuses);
    }
}
