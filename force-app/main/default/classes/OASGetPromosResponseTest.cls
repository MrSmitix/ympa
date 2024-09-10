@isTest
private class OASGetPromosResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromosResponse getPromosResponse1 = OASGetPromosResponse.getExample();
        OASGetPromosResponse getPromosResponse2 = getPromosResponse1;
        OASGetPromosResponse getPromosResponse3 = new OASGetPromosResponse();
        OASGetPromosResponse getPromosResponse4 = getPromosResponse3;

        System.assert(getPromosResponse1.equals(getPromosResponse2));
        System.assert(getPromosResponse2.equals(getPromosResponse1));
        System.assert(getPromosResponse1.equals(getPromosResponse1));
        System.assert(getPromosResponse3.equals(getPromosResponse4));
        System.assert(getPromosResponse4.equals(getPromosResponse3));
        System.assert(getPromosResponse3.equals(getPromosResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromosResponse getPromosResponse1 = OASGetPromosResponse.getExample();
        OASGetPromosResponse getPromosResponse2 = OASGetPromosResponse.getExample();
        OASGetPromosResponse getPromosResponse3 = new OASGetPromosResponse();
        OASGetPromosResponse getPromosResponse4 = new OASGetPromosResponse();

        System.assert(getPromosResponse1.equals(getPromosResponse2));
        System.assert(getPromosResponse2.equals(getPromosResponse1));
        System.assert(getPromosResponse3.equals(getPromosResponse4));
        System.assert(getPromosResponse4.equals(getPromosResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromosResponse getPromosResponse1 = OASGetPromosResponse.getExample();
        OASGetPromosResponse getPromosResponse2 = new OASGetPromosResponse();

        System.assertEquals(false, getPromosResponse1.equals('foo'));
        System.assertEquals(false, getPromosResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromosResponse getPromosResponse1 = OASGetPromosResponse.getExample();
        OASGetPromosResponse getPromosResponse2 = new OASGetPromosResponse();
        OASGetPromosResponse getPromosResponse3;

        System.assertEquals(false, getPromosResponse1.equals(getPromosResponse3));
        System.assertEquals(false, getPromosResponse2.equals(getPromosResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromosResponse getPromosResponse1 = OASGetPromosResponse.getExample();
        OASGetPromosResponse getPromosResponse2 = new OASGetPromosResponse();

        System.assertEquals(getPromosResponse1.hashCode(), getPromosResponse1.hashCode());
        System.assertEquals(getPromosResponse2.hashCode(), getPromosResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromosResponse getPromosResponse1 = OASGetPromosResponse.getExample();
        OASGetPromosResponse getPromosResponse2 = OASGetPromosResponse.getExample();
        OASGetPromosResponse getPromosResponse3 = new OASGetPromosResponse();
        OASGetPromosResponse getPromosResponse4 = new OASGetPromosResponse();

        System.assert(getPromosResponse1.equals(getPromosResponse2));
        System.assert(getPromosResponse3.equals(getPromosResponse4));
        System.assertEquals(getPromosResponse1.hashCode(), getPromosResponse2.hashCode());
        System.assertEquals(getPromosResponse3.hashCode(), getPromosResponse4.hashCode());
    }
}
