@isTest
private class OASGetReturnResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetReturnResponse getReturnResponse1 = OASGetReturnResponse.getExample();
        OASGetReturnResponse getReturnResponse2 = getReturnResponse1;
        OASGetReturnResponse getReturnResponse3 = new OASGetReturnResponse();
        OASGetReturnResponse getReturnResponse4 = getReturnResponse3;

        System.assert(getReturnResponse1.equals(getReturnResponse2));
        System.assert(getReturnResponse2.equals(getReturnResponse1));
        System.assert(getReturnResponse1.equals(getReturnResponse1));
        System.assert(getReturnResponse3.equals(getReturnResponse4));
        System.assert(getReturnResponse4.equals(getReturnResponse3));
        System.assert(getReturnResponse3.equals(getReturnResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetReturnResponse getReturnResponse1 = OASGetReturnResponse.getExample();
        OASGetReturnResponse getReturnResponse2 = OASGetReturnResponse.getExample();
        OASGetReturnResponse getReturnResponse3 = new OASGetReturnResponse();
        OASGetReturnResponse getReturnResponse4 = new OASGetReturnResponse();

        System.assert(getReturnResponse1.equals(getReturnResponse2));
        System.assert(getReturnResponse2.equals(getReturnResponse1));
        System.assert(getReturnResponse3.equals(getReturnResponse4));
        System.assert(getReturnResponse4.equals(getReturnResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetReturnResponse getReturnResponse1 = OASGetReturnResponse.getExample();
        OASGetReturnResponse getReturnResponse2 = new OASGetReturnResponse();

        System.assertEquals(false, getReturnResponse1.equals('foo'));
        System.assertEquals(false, getReturnResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetReturnResponse getReturnResponse1 = OASGetReturnResponse.getExample();
        OASGetReturnResponse getReturnResponse2 = new OASGetReturnResponse();
        OASGetReturnResponse getReturnResponse3;

        System.assertEquals(false, getReturnResponse1.equals(getReturnResponse3));
        System.assertEquals(false, getReturnResponse2.equals(getReturnResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetReturnResponse getReturnResponse1 = OASGetReturnResponse.getExample();
        OASGetReturnResponse getReturnResponse2 = new OASGetReturnResponse();

        System.assertEquals(getReturnResponse1.hashCode(), getReturnResponse1.hashCode());
        System.assertEquals(getReturnResponse2.hashCode(), getReturnResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetReturnResponse getReturnResponse1 = OASGetReturnResponse.getExample();
        OASGetReturnResponse getReturnResponse2 = OASGetReturnResponse.getExample();
        OASGetReturnResponse getReturnResponse3 = new OASGetReturnResponse();
        OASGetReturnResponse getReturnResponse4 = new OASGetReturnResponse();

        System.assert(getReturnResponse1.equals(getReturnResponse2));
        System.assert(getReturnResponse3.equals(getReturnResponse4));
        System.assertEquals(getReturnResponse1.hashCode(), getReturnResponse2.hashCode());
        System.assertEquals(getReturnResponse3.hashCode(), getReturnResponse4.hashCode());
    }
}
