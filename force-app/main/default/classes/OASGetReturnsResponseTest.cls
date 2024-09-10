@isTest
private class OASGetReturnsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetReturnsResponse getReturnsResponse1 = OASGetReturnsResponse.getExample();
        OASGetReturnsResponse getReturnsResponse2 = getReturnsResponse1;
        OASGetReturnsResponse getReturnsResponse3 = new OASGetReturnsResponse();
        OASGetReturnsResponse getReturnsResponse4 = getReturnsResponse3;

        System.assert(getReturnsResponse1.equals(getReturnsResponse2));
        System.assert(getReturnsResponse2.equals(getReturnsResponse1));
        System.assert(getReturnsResponse1.equals(getReturnsResponse1));
        System.assert(getReturnsResponse3.equals(getReturnsResponse4));
        System.assert(getReturnsResponse4.equals(getReturnsResponse3));
        System.assert(getReturnsResponse3.equals(getReturnsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetReturnsResponse getReturnsResponse1 = OASGetReturnsResponse.getExample();
        OASGetReturnsResponse getReturnsResponse2 = OASGetReturnsResponse.getExample();
        OASGetReturnsResponse getReturnsResponse3 = new OASGetReturnsResponse();
        OASGetReturnsResponse getReturnsResponse4 = new OASGetReturnsResponse();

        System.assert(getReturnsResponse1.equals(getReturnsResponse2));
        System.assert(getReturnsResponse2.equals(getReturnsResponse1));
        System.assert(getReturnsResponse3.equals(getReturnsResponse4));
        System.assert(getReturnsResponse4.equals(getReturnsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetReturnsResponse getReturnsResponse1 = OASGetReturnsResponse.getExample();
        OASGetReturnsResponse getReturnsResponse2 = new OASGetReturnsResponse();

        System.assertEquals(false, getReturnsResponse1.equals('foo'));
        System.assertEquals(false, getReturnsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetReturnsResponse getReturnsResponse1 = OASGetReturnsResponse.getExample();
        OASGetReturnsResponse getReturnsResponse2 = new OASGetReturnsResponse();
        OASGetReturnsResponse getReturnsResponse3;

        System.assertEquals(false, getReturnsResponse1.equals(getReturnsResponse3));
        System.assertEquals(false, getReturnsResponse2.equals(getReturnsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetReturnsResponse getReturnsResponse1 = OASGetReturnsResponse.getExample();
        OASGetReturnsResponse getReturnsResponse2 = new OASGetReturnsResponse();

        System.assertEquals(getReturnsResponse1.hashCode(), getReturnsResponse1.hashCode());
        System.assertEquals(getReturnsResponse2.hashCode(), getReturnsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetReturnsResponse getReturnsResponse1 = OASGetReturnsResponse.getExample();
        OASGetReturnsResponse getReturnsResponse2 = OASGetReturnsResponse.getExample();
        OASGetReturnsResponse getReturnsResponse3 = new OASGetReturnsResponse();
        OASGetReturnsResponse getReturnsResponse4 = new OASGetReturnsResponse();

        System.assert(getReturnsResponse1.equals(getReturnsResponse2));
        System.assert(getReturnsResponse3.equals(getReturnsResponse4));
        System.assertEquals(getReturnsResponse1.hashCode(), getReturnsResponse2.hashCode());
        System.assertEquals(getReturnsResponse3.hashCode(), getReturnsResponse4.hashCode());
    }
}
