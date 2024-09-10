@isTest
private class OASGetChatsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetChatsResponse getChatsResponse1 = OASGetChatsResponse.getExample();
        OASGetChatsResponse getChatsResponse2 = getChatsResponse1;
        OASGetChatsResponse getChatsResponse3 = new OASGetChatsResponse();
        OASGetChatsResponse getChatsResponse4 = getChatsResponse3;

        System.assert(getChatsResponse1.equals(getChatsResponse2));
        System.assert(getChatsResponse2.equals(getChatsResponse1));
        System.assert(getChatsResponse1.equals(getChatsResponse1));
        System.assert(getChatsResponse3.equals(getChatsResponse4));
        System.assert(getChatsResponse4.equals(getChatsResponse3));
        System.assert(getChatsResponse3.equals(getChatsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetChatsResponse getChatsResponse1 = OASGetChatsResponse.getExample();
        OASGetChatsResponse getChatsResponse2 = OASGetChatsResponse.getExample();
        OASGetChatsResponse getChatsResponse3 = new OASGetChatsResponse();
        OASGetChatsResponse getChatsResponse4 = new OASGetChatsResponse();

        System.assert(getChatsResponse1.equals(getChatsResponse2));
        System.assert(getChatsResponse2.equals(getChatsResponse1));
        System.assert(getChatsResponse3.equals(getChatsResponse4));
        System.assert(getChatsResponse4.equals(getChatsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetChatsResponse getChatsResponse1 = OASGetChatsResponse.getExample();
        OASGetChatsResponse getChatsResponse2 = new OASGetChatsResponse();

        System.assertEquals(false, getChatsResponse1.equals('foo'));
        System.assertEquals(false, getChatsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetChatsResponse getChatsResponse1 = OASGetChatsResponse.getExample();
        OASGetChatsResponse getChatsResponse2 = new OASGetChatsResponse();
        OASGetChatsResponse getChatsResponse3;

        System.assertEquals(false, getChatsResponse1.equals(getChatsResponse3));
        System.assertEquals(false, getChatsResponse2.equals(getChatsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetChatsResponse getChatsResponse1 = OASGetChatsResponse.getExample();
        OASGetChatsResponse getChatsResponse2 = new OASGetChatsResponse();

        System.assertEquals(getChatsResponse1.hashCode(), getChatsResponse1.hashCode());
        System.assertEquals(getChatsResponse2.hashCode(), getChatsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetChatsResponse getChatsResponse1 = OASGetChatsResponse.getExample();
        OASGetChatsResponse getChatsResponse2 = OASGetChatsResponse.getExample();
        OASGetChatsResponse getChatsResponse3 = new OASGetChatsResponse();
        OASGetChatsResponse getChatsResponse4 = new OASGetChatsResponse();

        System.assert(getChatsResponse1.equals(getChatsResponse2));
        System.assert(getChatsResponse3.equals(getChatsResponse4));
        System.assertEquals(getChatsResponse1.hashCode(), getChatsResponse2.hashCode());
        System.assertEquals(getChatsResponse3.hashCode(), getChatsResponse4.hashCode());
    }
}
