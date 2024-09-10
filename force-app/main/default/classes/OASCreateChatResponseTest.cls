@isTest
private class OASCreateChatResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatResponse createChatResponse1 = OASCreateChatResponse.getExample();
        OASCreateChatResponse createChatResponse2 = createChatResponse1;
        OASCreateChatResponse createChatResponse3 = new OASCreateChatResponse();
        OASCreateChatResponse createChatResponse4 = createChatResponse3;

        System.assert(createChatResponse1.equals(createChatResponse2));
        System.assert(createChatResponse2.equals(createChatResponse1));
        System.assert(createChatResponse1.equals(createChatResponse1));
        System.assert(createChatResponse3.equals(createChatResponse4));
        System.assert(createChatResponse4.equals(createChatResponse3));
        System.assert(createChatResponse3.equals(createChatResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatResponse createChatResponse1 = OASCreateChatResponse.getExample();
        OASCreateChatResponse createChatResponse2 = OASCreateChatResponse.getExample();
        OASCreateChatResponse createChatResponse3 = new OASCreateChatResponse();
        OASCreateChatResponse createChatResponse4 = new OASCreateChatResponse();

        System.assert(createChatResponse1.equals(createChatResponse2));
        System.assert(createChatResponse2.equals(createChatResponse1));
        System.assert(createChatResponse3.equals(createChatResponse4));
        System.assert(createChatResponse4.equals(createChatResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatResponse createChatResponse1 = OASCreateChatResponse.getExample();
        OASCreateChatResponse createChatResponse2 = new OASCreateChatResponse();

        System.assertEquals(false, createChatResponse1.equals('foo'));
        System.assertEquals(false, createChatResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatResponse createChatResponse1 = OASCreateChatResponse.getExample();
        OASCreateChatResponse createChatResponse2 = new OASCreateChatResponse();
        OASCreateChatResponse createChatResponse3;

        System.assertEquals(false, createChatResponse1.equals(createChatResponse3));
        System.assertEquals(false, createChatResponse2.equals(createChatResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatResponse createChatResponse1 = OASCreateChatResponse.getExample();
        OASCreateChatResponse createChatResponse2 = new OASCreateChatResponse();

        System.assertEquals(createChatResponse1.hashCode(), createChatResponse1.hashCode());
        System.assertEquals(createChatResponse2.hashCode(), createChatResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatResponse createChatResponse1 = OASCreateChatResponse.getExample();
        OASCreateChatResponse createChatResponse2 = OASCreateChatResponse.getExample();
        OASCreateChatResponse createChatResponse3 = new OASCreateChatResponse();
        OASCreateChatResponse createChatResponse4 = new OASCreateChatResponse();

        System.assert(createChatResponse1.equals(createChatResponse2));
        System.assert(createChatResponse3.equals(createChatResponse4));
        System.assertEquals(createChatResponse1.hashCode(), createChatResponse2.hashCode());
        System.assertEquals(createChatResponse3.hashCode(), createChatResponse4.hashCode());
    }
}
