@isTest
private class OASGetQualityRatingResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetQualityRatingResponse getQualityRatingResponse1 = OASGetQualityRatingResponse.getExample();
        OASGetQualityRatingResponse getQualityRatingResponse2 = getQualityRatingResponse1;
        OASGetQualityRatingResponse getQualityRatingResponse3 = new OASGetQualityRatingResponse();
        OASGetQualityRatingResponse getQualityRatingResponse4 = getQualityRatingResponse3;

        System.assert(getQualityRatingResponse1.equals(getQualityRatingResponse2));
        System.assert(getQualityRatingResponse2.equals(getQualityRatingResponse1));
        System.assert(getQualityRatingResponse1.equals(getQualityRatingResponse1));
        System.assert(getQualityRatingResponse3.equals(getQualityRatingResponse4));
        System.assert(getQualityRatingResponse4.equals(getQualityRatingResponse3));
        System.assert(getQualityRatingResponse3.equals(getQualityRatingResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetQualityRatingResponse getQualityRatingResponse1 = OASGetQualityRatingResponse.getExample();
        OASGetQualityRatingResponse getQualityRatingResponse2 = OASGetQualityRatingResponse.getExample();
        OASGetQualityRatingResponse getQualityRatingResponse3 = new OASGetQualityRatingResponse();
        OASGetQualityRatingResponse getQualityRatingResponse4 = new OASGetQualityRatingResponse();

        System.assert(getQualityRatingResponse1.equals(getQualityRatingResponse2));
        System.assert(getQualityRatingResponse2.equals(getQualityRatingResponse1));
        System.assert(getQualityRatingResponse3.equals(getQualityRatingResponse4));
        System.assert(getQualityRatingResponse4.equals(getQualityRatingResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetQualityRatingResponse getQualityRatingResponse1 = OASGetQualityRatingResponse.getExample();
        OASGetQualityRatingResponse getQualityRatingResponse2 = new OASGetQualityRatingResponse();

        System.assertEquals(false, getQualityRatingResponse1.equals('foo'));
        System.assertEquals(false, getQualityRatingResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetQualityRatingResponse getQualityRatingResponse1 = OASGetQualityRatingResponse.getExample();
        OASGetQualityRatingResponse getQualityRatingResponse2 = new OASGetQualityRatingResponse();
        OASGetQualityRatingResponse getQualityRatingResponse3;

        System.assertEquals(false, getQualityRatingResponse1.equals(getQualityRatingResponse3));
        System.assertEquals(false, getQualityRatingResponse2.equals(getQualityRatingResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetQualityRatingResponse getQualityRatingResponse1 = OASGetQualityRatingResponse.getExample();
        OASGetQualityRatingResponse getQualityRatingResponse2 = new OASGetQualityRatingResponse();

        System.assertEquals(getQualityRatingResponse1.hashCode(), getQualityRatingResponse1.hashCode());
        System.assertEquals(getQualityRatingResponse2.hashCode(), getQualityRatingResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetQualityRatingResponse getQualityRatingResponse1 = OASGetQualityRatingResponse.getExample();
        OASGetQualityRatingResponse getQualityRatingResponse2 = OASGetQualityRatingResponse.getExample();
        OASGetQualityRatingResponse getQualityRatingResponse3 = new OASGetQualityRatingResponse();
        OASGetQualityRatingResponse getQualityRatingResponse4 = new OASGetQualityRatingResponse();

        System.assert(getQualityRatingResponse1.equals(getQualityRatingResponse2));
        System.assert(getQualityRatingResponse3.equals(getQualityRatingResponse4));
        System.assertEquals(getQualityRatingResponse1.hashCode(), getQualityRatingResponse2.hashCode());
        System.assertEquals(getQualityRatingResponse3.hashCode(), getQualityRatingResponse4.hashCode());
    }
}
