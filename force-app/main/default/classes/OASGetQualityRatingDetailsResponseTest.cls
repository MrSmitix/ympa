@isTest
private class OASGetQualityRatingDetailsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse1 = OASGetQualityRatingDetailsResponse.getExample();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse2 = getQualityRatingDetailsResponse1;
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse3 = new OASGetQualityRatingDetailsResponse();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse4 = getQualityRatingDetailsResponse3;

        System.assert(getQualityRatingDetailsResponse1.equals(getQualityRatingDetailsResponse2));
        System.assert(getQualityRatingDetailsResponse2.equals(getQualityRatingDetailsResponse1));
        System.assert(getQualityRatingDetailsResponse1.equals(getQualityRatingDetailsResponse1));
        System.assert(getQualityRatingDetailsResponse3.equals(getQualityRatingDetailsResponse4));
        System.assert(getQualityRatingDetailsResponse4.equals(getQualityRatingDetailsResponse3));
        System.assert(getQualityRatingDetailsResponse3.equals(getQualityRatingDetailsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse1 = OASGetQualityRatingDetailsResponse.getExample();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse2 = OASGetQualityRatingDetailsResponse.getExample();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse3 = new OASGetQualityRatingDetailsResponse();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse4 = new OASGetQualityRatingDetailsResponse();

        System.assert(getQualityRatingDetailsResponse1.equals(getQualityRatingDetailsResponse2));
        System.assert(getQualityRatingDetailsResponse2.equals(getQualityRatingDetailsResponse1));
        System.assert(getQualityRatingDetailsResponse3.equals(getQualityRatingDetailsResponse4));
        System.assert(getQualityRatingDetailsResponse4.equals(getQualityRatingDetailsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse1 = OASGetQualityRatingDetailsResponse.getExample();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse2 = new OASGetQualityRatingDetailsResponse();

        System.assertEquals(false, getQualityRatingDetailsResponse1.equals('foo'));
        System.assertEquals(false, getQualityRatingDetailsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse1 = OASGetQualityRatingDetailsResponse.getExample();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse2 = new OASGetQualityRatingDetailsResponse();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse3;

        System.assertEquals(false, getQualityRatingDetailsResponse1.equals(getQualityRatingDetailsResponse3));
        System.assertEquals(false, getQualityRatingDetailsResponse2.equals(getQualityRatingDetailsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse1 = OASGetQualityRatingDetailsResponse.getExample();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse2 = new OASGetQualityRatingDetailsResponse();

        System.assertEquals(getQualityRatingDetailsResponse1.hashCode(), getQualityRatingDetailsResponse1.hashCode());
        System.assertEquals(getQualityRatingDetailsResponse2.hashCode(), getQualityRatingDetailsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse1 = OASGetQualityRatingDetailsResponse.getExample();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse2 = OASGetQualityRatingDetailsResponse.getExample();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse3 = new OASGetQualityRatingDetailsResponse();
        OASGetQualityRatingDetailsResponse getQualityRatingDetailsResponse4 = new OASGetQualityRatingDetailsResponse();

        System.assert(getQualityRatingDetailsResponse1.equals(getQualityRatingDetailsResponse2));
        System.assert(getQualityRatingDetailsResponse3.equals(getQualityRatingDetailsResponse4));
        System.assertEquals(getQualityRatingDetailsResponse1.hashCode(), getQualityRatingDetailsResponse2.hashCode());
        System.assertEquals(getQualityRatingDetailsResponse3.hashCode(), getQualityRatingDetailsResponse4.hashCode());
    }
}
