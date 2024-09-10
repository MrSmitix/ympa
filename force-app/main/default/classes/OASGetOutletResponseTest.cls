@isTest
private class OASGetOutletResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOutletResponse getOutletResponse1 = OASGetOutletResponse.getExample();
        OASGetOutletResponse getOutletResponse2 = getOutletResponse1;
        OASGetOutletResponse getOutletResponse3 = new OASGetOutletResponse();
        OASGetOutletResponse getOutletResponse4 = getOutletResponse3;

        System.assert(getOutletResponse1.equals(getOutletResponse2));
        System.assert(getOutletResponse2.equals(getOutletResponse1));
        System.assert(getOutletResponse1.equals(getOutletResponse1));
        System.assert(getOutletResponse3.equals(getOutletResponse4));
        System.assert(getOutletResponse4.equals(getOutletResponse3));
        System.assert(getOutletResponse3.equals(getOutletResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOutletResponse getOutletResponse1 = OASGetOutletResponse.getExample();
        OASGetOutletResponse getOutletResponse2 = OASGetOutletResponse.getExample();
        OASGetOutletResponse getOutletResponse3 = new OASGetOutletResponse();
        OASGetOutletResponse getOutletResponse4 = new OASGetOutletResponse();

        System.assert(getOutletResponse1.equals(getOutletResponse2));
        System.assert(getOutletResponse2.equals(getOutletResponse1));
        System.assert(getOutletResponse3.equals(getOutletResponse4));
        System.assert(getOutletResponse4.equals(getOutletResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOutletResponse getOutletResponse1 = OASGetOutletResponse.getExample();
        OASGetOutletResponse getOutletResponse2 = new OASGetOutletResponse();

        System.assertEquals(false, getOutletResponse1.equals('foo'));
        System.assertEquals(false, getOutletResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOutletResponse getOutletResponse1 = OASGetOutletResponse.getExample();
        OASGetOutletResponse getOutletResponse2 = new OASGetOutletResponse();
        OASGetOutletResponse getOutletResponse3;

        System.assertEquals(false, getOutletResponse1.equals(getOutletResponse3));
        System.assertEquals(false, getOutletResponse2.equals(getOutletResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOutletResponse getOutletResponse1 = OASGetOutletResponse.getExample();
        OASGetOutletResponse getOutletResponse2 = new OASGetOutletResponse();

        System.assertEquals(getOutletResponse1.hashCode(), getOutletResponse1.hashCode());
        System.assertEquals(getOutletResponse2.hashCode(), getOutletResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOutletResponse getOutletResponse1 = OASGetOutletResponse.getExample();
        OASGetOutletResponse getOutletResponse2 = OASGetOutletResponse.getExample();
        OASGetOutletResponse getOutletResponse3 = new OASGetOutletResponse();
        OASGetOutletResponse getOutletResponse4 = new OASGetOutletResponse();

        System.assert(getOutletResponse1.equals(getOutletResponse2));
        System.assert(getOutletResponse3.equals(getOutletResponse4));
        System.assertEquals(getOutletResponse1.hashCode(), getOutletResponse2.hashCode());
        System.assertEquals(getOutletResponse3.hashCode(), getOutletResponse4.hashCode());
    }
}
