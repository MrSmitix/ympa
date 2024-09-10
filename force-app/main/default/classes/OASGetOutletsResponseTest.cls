@isTest
private class OASGetOutletsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOutletsResponse getOutletsResponse1 = OASGetOutletsResponse.getExample();
        OASGetOutletsResponse getOutletsResponse2 = getOutletsResponse1;
        OASGetOutletsResponse getOutletsResponse3 = new OASGetOutletsResponse();
        OASGetOutletsResponse getOutletsResponse4 = getOutletsResponse3;

        System.assert(getOutletsResponse1.equals(getOutletsResponse2));
        System.assert(getOutletsResponse2.equals(getOutletsResponse1));
        System.assert(getOutletsResponse1.equals(getOutletsResponse1));
        System.assert(getOutletsResponse3.equals(getOutletsResponse4));
        System.assert(getOutletsResponse4.equals(getOutletsResponse3));
        System.assert(getOutletsResponse3.equals(getOutletsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOutletsResponse getOutletsResponse1 = OASGetOutletsResponse.getExample();
        OASGetOutletsResponse getOutletsResponse2 = OASGetOutletsResponse.getExample();
        OASGetOutletsResponse getOutletsResponse3 = new OASGetOutletsResponse();
        OASGetOutletsResponse getOutletsResponse4 = new OASGetOutletsResponse();

        System.assert(getOutletsResponse1.equals(getOutletsResponse2));
        System.assert(getOutletsResponse2.equals(getOutletsResponse1));
        System.assert(getOutletsResponse3.equals(getOutletsResponse4));
        System.assert(getOutletsResponse4.equals(getOutletsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOutletsResponse getOutletsResponse1 = OASGetOutletsResponse.getExample();
        OASGetOutletsResponse getOutletsResponse2 = new OASGetOutletsResponse();

        System.assertEquals(false, getOutletsResponse1.equals('foo'));
        System.assertEquals(false, getOutletsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOutletsResponse getOutletsResponse1 = OASGetOutletsResponse.getExample();
        OASGetOutletsResponse getOutletsResponse2 = new OASGetOutletsResponse();
        OASGetOutletsResponse getOutletsResponse3;

        System.assertEquals(false, getOutletsResponse1.equals(getOutletsResponse3));
        System.assertEquals(false, getOutletsResponse2.equals(getOutletsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOutletsResponse getOutletsResponse1 = OASGetOutletsResponse.getExample();
        OASGetOutletsResponse getOutletsResponse2 = new OASGetOutletsResponse();

        System.assertEquals(getOutletsResponse1.hashCode(), getOutletsResponse1.hashCode());
        System.assertEquals(getOutletsResponse2.hashCode(), getOutletsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOutletsResponse getOutletsResponse1 = OASGetOutletsResponse.getExample();
        OASGetOutletsResponse getOutletsResponse2 = OASGetOutletsResponse.getExample();
        OASGetOutletsResponse getOutletsResponse3 = new OASGetOutletsResponse();
        OASGetOutletsResponse getOutletsResponse4 = new OASGetOutletsResponse();

        System.assert(getOutletsResponse1.equals(getOutletsResponse2));
        System.assert(getOutletsResponse3.equals(getOutletsResponse4));
        System.assertEquals(getOutletsResponse1.hashCode(), getOutletsResponse2.hashCode());
        System.assertEquals(getOutletsResponse3.hashCode(), getOutletsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOutletsResponse getOutletsResponse = new OASGetOutletsResponse();
        System.assertEquals(new List<OASFullOutletDTO>(), getOutletsResponse.outlets);
        System.assertEquals(null, getOutletsResponse.paging);
        System.assertEquals(null, getOutletsResponse.pager);
    }
}
