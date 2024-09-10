@isTest
private class OASGetQualityRatingRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetQualityRatingRequest getQualityRatingRequest1 = OASGetQualityRatingRequest.getExample();
        OASGetQualityRatingRequest getQualityRatingRequest2 = getQualityRatingRequest1;
        OASGetQualityRatingRequest getQualityRatingRequest3 = new OASGetQualityRatingRequest();
        OASGetQualityRatingRequest getQualityRatingRequest4 = getQualityRatingRequest3;

        System.assert(getQualityRatingRequest1.equals(getQualityRatingRequest2));
        System.assert(getQualityRatingRequest2.equals(getQualityRatingRequest1));
        System.assert(getQualityRatingRequest1.equals(getQualityRatingRequest1));
        System.assert(getQualityRatingRequest3.equals(getQualityRatingRequest4));
        System.assert(getQualityRatingRequest4.equals(getQualityRatingRequest3));
        System.assert(getQualityRatingRequest3.equals(getQualityRatingRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetQualityRatingRequest getQualityRatingRequest1 = OASGetQualityRatingRequest.getExample();
        OASGetQualityRatingRequest getQualityRatingRequest2 = OASGetQualityRatingRequest.getExample();
        OASGetQualityRatingRequest getQualityRatingRequest3 = new OASGetQualityRatingRequest();
        OASGetQualityRatingRequest getQualityRatingRequest4 = new OASGetQualityRatingRequest();

        System.assert(getQualityRatingRequest1.equals(getQualityRatingRequest2));
        System.assert(getQualityRatingRequest2.equals(getQualityRatingRequest1));
        System.assert(getQualityRatingRequest3.equals(getQualityRatingRequest4));
        System.assert(getQualityRatingRequest4.equals(getQualityRatingRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetQualityRatingRequest getQualityRatingRequest1 = OASGetQualityRatingRequest.getExample();
        OASGetQualityRatingRequest getQualityRatingRequest2 = new OASGetQualityRatingRequest();

        System.assertEquals(false, getQualityRatingRequest1.equals('foo'));
        System.assertEquals(false, getQualityRatingRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetQualityRatingRequest getQualityRatingRequest1 = OASGetQualityRatingRequest.getExample();
        OASGetQualityRatingRequest getQualityRatingRequest2 = new OASGetQualityRatingRequest();
        OASGetQualityRatingRequest getQualityRatingRequest3;

        System.assertEquals(false, getQualityRatingRequest1.equals(getQualityRatingRequest3));
        System.assertEquals(false, getQualityRatingRequest2.equals(getQualityRatingRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetQualityRatingRequest getQualityRatingRequest1 = OASGetQualityRatingRequest.getExample();
        OASGetQualityRatingRequest getQualityRatingRequest2 = new OASGetQualityRatingRequest();

        System.assertEquals(getQualityRatingRequest1.hashCode(), getQualityRatingRequest1.hashCode());
        System.assertEquals(getQualityRatingRequest2.hashCode(), getQualityRatingRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetQualityRatingRequest getQualityRatingRequest1 = OASGetQualityRatingRequest.getExample();
        OASGetQualityRatingRequest getQualityRatingRequest2 = OASGetQualityRatingRequest.getExample();
        OASGetQualityRatingRequest getQualityRatingRequest3 = new OASGetQualityRatingRequest();
        OASGetQualityRatingRequest getQualityRatingRequest4 = new OASGetQualityRatingRequest();

        System.assert(getQualityRatingRequest1.equals(getQualityRatingRequest2));
        System.assert(getQualityRatingRequest3.equals(getQualityRatingRequest4));
        System.assertEquals(getQualityRatingRequest1.hashCode(), getQualityRatingRequest2.hashCode());
        System.assertEquals(getQualityRatingRequest3.hashCode(), getQualityRatingRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetQualityRatingRequest getQualityRatingRequest = new OASGetQualityRatingRequest();
        System.assertEquals(new List<Long>(), getQualityRatingRequest.campaignIds);
        System.assertEquals(null, getQualityRatingRequest.dateFrom);
        System.assertEquals(null, getQualityRatingRequest.dateTo);
    }
}
