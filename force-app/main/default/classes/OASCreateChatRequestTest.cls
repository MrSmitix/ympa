@isTest
private class OASCreateChatRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatRequest createChatRequest1 = OASCreateChatRequest.getExample();
        OASCreateChatRequest createChatRequest2 = createChatRequest1;
        OASCreateChatRequest createChatRequest3 = new OASCreateChatRequest();
        OASCreateChatRequest createChatRequest4 = createChatRequest3;

        System.assert(createChatRequest1.equals(createChatRequest2));
        System.assert(createChatRequest2.equals(createChatRequest1));
        System.assert(createChatRequest1.equals(createChatRequest1));
        System.assert(createChatRequest3.equals(createChatRequest4));
        System.assert(createChatRequest4.equals(createChatRequest3));
        System.assert(createChatRequest3.equals(createChatRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatRequest createChatRequest1 = OASCreateChatRequest.getExample();
        OASCreateChatRequest createChatRequest2 = OASCreateChatRequest.getExample();
        OASCreateChatRequest createChatRequest3 = new OASCreateChatRequest();
        OASCreateChatRequest createChatRequest4 = new OASCreateChatRequest();

        System.assert(createChatRequest1.equals(createChatRequest2));
        System.assert(createChatRequest2.equals(createChatRequest1));
        System.assert(createChatRequest3.equals(createChatRequest4));
        System.assert(createChatRequest4.equals(createChatRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatRequest createChatRequest1 = OASCreateChatRequest.getExample();
        OASCreateChatRequest createChatRequest2 = new OASCreateChatRequest();

        System.assertEquals(false, createChatRequest1.equals('foo'));
        System.assertEquals(false, createChatRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatRequest createChatRequest1 = OASCreateChatRequest.getExample();
        OASCreateChatRequest createChatRequest2 = new OASCreateChatRequest();
        OASCreateChatRequest createChatRequest3;

        System.assertEquals(false, createChatRequest1.equals(createChatRequest3));
        System.assertEquals(false, createChatRequest2.equals(createChatRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatRequest createChatRequest1 = OASCreateChatRequest.getExample();
        OASCreateChatRequest createChatRequest2 = new OASCreateChatRequest();

        System.assertEquals(createChatRequest1.hashCode(), createChatRequest1.hashCode());
        System.assertEquals(createChatRequest2.hashCode(), createChatRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatRequest createChatRequest1 = OASCreateChatRequest.getExample();
        OASCreateChatRequest createChatRequest2 = OASCreateChatRequest.getExample();
        OASCreateChatRequest createChatRequest3 = new OASCreateChatRequest();
        OASCreateChatRequest createChatRequest4 = new OASCreateChatRequest();

        System.assert(createChatRequest1.equals(createChatRequest2));
        System.assert(createChatRequest3.equals(createChatRequest4));
        System.assertEquals(createChatRequest1.hashCode(), createChatRequest2.hashCode());
        System.assertEquals(createChatRequest3.hashCode(), createChatRequest4.hashCode());
    }
}
