@isTest
private class OASGenerateShelfsStatisticsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest1 = OASGenerateShelfsStatisticsRequest.getExample();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest2 = generateShelfsStatisticsRequest1;
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest3 = new OASGenerateShelfsStatisticsRequest();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest4 = generateShelfsStatisticsRequest3;

        System.assert(generateShelfsStatisticsRequest1.equals(generateShelfsStatisticsRequest2));
        System.assert(generateShelfsStatisticsRequest2.equals(generateShelfsStatisticsRequest1));
        System.assert(generateShelfsStatisticsRequest1.equals(generateShelfsStatisticsRequest1));
        System.assert(generateShelfsStatisticsRequest3.equals(generateShelfsStatisticsRequest4));
        System.assert(generateShelfsStatisticsRequest4.equals(generateShelfsStatisticsRequest3));
        System.assert(generateShelfsStatisticsRequest3.equals(generateShelfsStatisticsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest1 = OASGenerateShelfsStatisticsRequest.getExample();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest2 = OASGenerateShelfsStatisticsRequest.getExample();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest3 = new OASGenerateShelfsStatisticsRequest();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest4 = new OASGenerateShelfsStatisticsRequest();

        System.assert(generateShelfsStatisticsRequest1.equals(generateShelfsStatisticsRequest2));
        System.assert(generateShelfsStatisticsRequest2.equals(generateShelfsStatisticsRequest1));
        System.assert(generateShelfsStatisticsRequest3.equals(generateShelfsStatisticsRequest4));
        System.assert(generateShelfsStatisticsRequest4.equals(generateShelfsStatisticsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest1 = OASGenerateShelfsStatisticsRequest.getExample();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest2 = new OASGenerateShelfsStatisticsRequest();

        System.assertEquals(false, generateShelfsStatisticsRequest1.equals('foo'));
        System.assertEquals(false, generateShelfsStatisticsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest1 = OASGenerateShelfsStatisticsRequest.getExample();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest2 = new OASGenerateShelfsStatisticsRequest();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest3;

        System.assertEquals(false, generateShelfsStatisticsRequest1.equals(generateShelfsStatisticsRequest3));
        System.assertEquals(false, generateShelfsStatisticsRequest2.equals(generateShelfsStatisticsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest1 = OASGenerateShelfsStatisticsRequest.getExample();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest2 = new OASGenerateShelfsStatisticsRequest();

        System.assertEquals(generateShelfsStatisticsRequest1.hashCode(), generateShelfsStatisticsRequest1.hashCode());
        System.assertEquals(generateShelfsStatisticsRequest2.hashCode(), generateShelfsStatisticsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest1 = OASGenerateShelfsStatisticsRequest.getExample();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest2 = OASGenerateShelfsStatisticsRequest.getExample();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest3 = new OASGenerateShelfsStatisticsRequest();
        OASGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest4 = new OASGenerateShelfsStatisticsRequest();

        System.assert(generateShelfsStatisticsRequest1.equals(generateShelfsStatisticsRequest2));
        System.assert(generateShelfsStatisticsRequest3.equals(generateShelfsStatisticsRequest4));
        System.assertEquals(generateShelfsStatisticsRequest1.hashCode(), generateShelfsStatisticsRequest2.hashCode());
        System.assertEquals(generateShelfsStatisticsRequest3.hashCode(), generateShelfsStatisticsRequest4.hashCode());
    }
}
