@isTest
private class OASGetRegionWithChildrenResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse1 = OASGetRegionWithChildrenResponse.getExample();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse2 = getRegionWithChildrenResponse1;
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse3 = new OASGetRegionWithChildrenResponse();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse4 = getRegionWithChildrenResponse3;

        System.assert(getRegionWithChildrenResponse1.equals(getRegionWithChildrenResponse2));
        System.assert(getRegionWithChildrenResponse2.equals(getRegionWithChildrenResponse1));
        System.assert(getRegionWithChildrenResponse1.equals(getRegionWithChildrenResponse1));
        System.assert(getRegionWithChildrenResponse3.equals(getRegionWithChildrenResponse4));
        System.assert(getRegionWithChildrenResponse4.equals(getRegionWithChildrenResponse3));
        System.assert(getRegionWithChildrenResponse3.equals(getRegionWithChildrenResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse1 = OASGetRegionWithChildrenResponse.getExample();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse2 = OASGetRegionWithChildrenResponse.getExample();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse3 = new OASGetRegionWithChildrenResponse();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse4 = new OASGetRegionWithChildrenResponse();

        System.assert(getRegionWithChildrenResponse1.equals(getRegionWithChildrenResponse2));
        System.assert(getRegionWithChildrenResponse2.equals(getRegionWithChildrenResponse1));
        System.assert(getRegionWithChildrenResponse3.equals(getRegionWithChildrenResponse4));
        System.assert(getRegionWithChildrenResponse4.equals(getRegionWithChildrenResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse1 = OASGetRegionWithChildrenResponse.getExample();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse2 = new OASGetRegionWithChildrenResponse();

        System.assertEquals(false, getRegionWithChildrenResponse1.equals('foo'));
        System.assertEquals(false, getRegionWithChildrenResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse1 = OASGetRegionWithChildrenResponse.getExample();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse2 = new OASGetRegionWithChildrenResponse();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse3;

        System.assertEquals(false, getRegionWithChildrenResponse1.equals(getRegionWithChildrenResponse3));
        System.assertEquals(false, getRegionWithChildrenResponse2.equals(getRegionWithChildrenResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse1 = OASGetRegionWithChildrenResponse.getExample();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse2 = new OASGetRegionWithChildrenResponse();

        System.assertEquals(getRegionWithChildrenResponse1.hashCode(), getRegionWithChildrenResponse1.hashCode());
        System.assertEquals(getRegionWithChildrenResponse2.hashCode(), getRegionWithChildrenResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse1 = OASGetRegionWithChildrenResponse.getExample();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse2 = OASGetRegionWithChildrenResponse.getExample();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse3 = new OASGetRegionWithChildrenResponse();
        OASGetRegionWithChildrenResponse getRegionWithChildrenResponse4 = new OASGetRegionWithChildrenResponse();

        System.assert(getRegionWithChildrenResponse1.equals(getRegionWithChildrenResponse2));
        System.assert(getRegionWithChildrenResponse3.equals(getRegionWithChildrenResponse4));
        System.assertEquals(getRegionWithChildrenResponse1.hashCode(), getRegionWithChildrenResponse2.hashCode());
        System.assertEquals(getRegionWithChildrenResponse3.hashCode(), getRegionWithChildrenResponse4.hashCode());
    }
}
