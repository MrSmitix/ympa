@isTest
private class OASGetFeedsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetFeedsResponse getFeedsResponse1 = OASGetFeedsResponse.getExample();
        OASGetFeedsResponse getFeedsResponse2 = getFeedsResponse1;
        OASGetFeedsResponse getFeedsResponse3 = new OASGetFeedsResponse();
        OASGetFeedsResponse getFeedsResponse4 = getFeedsResponse3;

        System.assert(getFeedsResponse1.equals(getFeedsResponse2));
        System.assert(getFeedsResponse2.equals(getFeedsResponse1));
        System.assert(getFeedsResponse1.equals(getFeedsResponse1));
        System.assert(getFeedsResponse3.equals(getFeedsResponse4));
        System.assert(getFeedsResponse4.equals(getFeedsResponse3));
        System.assert(getFeedsResponse3.equals(getFeedsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetFeedsResponse getFeedsResponse1 = OASGetFeedsResponse.getExample();
        OASGetFeedsResponse getFeedsResponse2 = OASGetFeedsResponse.getExample();
        OASGetFeedsResponse getFeedsResponse3 = new OASGetFeedsResponse();
        OASGetFeedsResponse getFeedsResponse4 = new OASGetFeedsResponse();

        System.assert(getFeedsResponse1.equals(getFeedsResponse2));
        System.assert(getFeedsResponse2.equals(getFeedsResponse1));
        System.assert(getFeedsResponse3.equals(getFeedsResponse4));
        System.assert(getFeedsResponse4.equals(getFeedsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetFeedsResponse getFeedsResponse1 = OASGetFeedsResponse.getExample();
        OASGetFeedsResponse getFeedsResponse2 = new OASGetFeedsResponse();

        System.assertEquals(false, getFeedsResponse1.equals('foo'));
        System.assertEquals(false, getFeedsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetFeedsResponse getFeedsResponse1 = OASGetFeedsResponse.getExample();
        OASGetFeedsResponse getFeedsResponse2 = new OASGetFeedsResponse();
        OASGetFeedsResponse getFeedsResponse3;

        System.assertEquals(false, getFeedsResponse1.equals(getFeedsResponse3));
        System.assertEquals(false, getFeedsResponse2.equals(getFeedsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetFeedsResponse getFeedsResponse1 = OASGetFeedsResponse.getExample();
        OASGetFeedsResponse getFeedsResponse2 = new OASGetFeedsResponse();

        System.assertEquals(getFeedsResponse1.hashCode(), getFeedsResponse1.hashCode());
        System.assertEquals(getFeedsResponse2.hashCode(), getFeedsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetFeedsResponse getFeedsResponse1 = OASGetFeedsResponse.getExample();
        OASGetFeedsResponse getFeedsResponse2 = OASGetFeedsResponse.getExample();
        OASGetFeedsResponse getFeedsResponse3 = new OASGetFeedsResponse();
        OASGetFeedsResponse getFeedsResponse4 = new OASGetFeedsResponse();

        System.assert(getFeedsResponse1.equals(getFeedsResponse2));
        System.assert(getFeedsResponse3.equals(getFeedsResponse4));
        System.assertEquals(getFeedsResponse1.hashCode(), getFeedsResponse2.hashCode());
        System.assertEquals(getFeedsResponse3.hashCode(), getFeedsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetFeedsResponse getFeedsResponse = new OASGetFeedsResponse();
        System.assertEquals(new List<OASFeedDTO>(), getFeedsResponse.feeds);
    }
}
