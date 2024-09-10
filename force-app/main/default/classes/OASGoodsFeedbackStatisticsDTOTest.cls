@isTest
private class OASGoodsFeedbackStatisticsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO1 = OASGoodsFeedbackStatisticsDTO.getExample();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO2 = goodsFeedbackStatisticsDTO1;
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO3 = new OASGoodsFeedbackStatisticsDTO();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO4 = goodsFeedbackStatisticsDTO3;

        System.assert(goodsFeedbackStatisticsDTO1.equals(goodsFeedbackStatisticsDTO2));
        System.assert(goodsFeedbackStatisticsDTO2.equals(goodsFeedbackStatisticsDTO1));
        System.assert(goodsFeedbackStatisticsDTO1.equals(goodsFeedbackStatisticsDTO1));
        System.assert(goodsFeedbackStatisticsDTO3.equals(goodsFeedbackStatisticsDTO4));
        System.assert(goodsFeedbackStatisticsDTO4.equals(goodsFeedbackStatisticsDTO3));
        System.assert(goodsFeedbackStatisticsDTO3.equals(goodsFeedbackStatisticsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO1 = OASGoodsFeedbackStatisticsDTO.getExample();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO2 = OASGoodsFeedbackStatisticsDTO.getExample();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO3 = new OASGoodsFeedbackStatisticsDTO();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO4 = new OASGoodsFeedbackStatisticsDTO();

        System.assert(goodsFeedbackStatisticsDTO1.equals(goodsFeedbackStatisticsDTO2));
        System.assert(goodsFeedbackStatisticsDTO2.equals(goodsFeedbackStatisticsDTO1));
        System.assert(goodsFeedbackStatisticsDTO3.equals(goodsFeedbackStatisticsDTO4));
        System.assert(goodsFeedbackStatisticsDTO4.equals(goodsFeedbackStatisticsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO1 = OASGoodsFeedbackStatisticsDTO.getExample();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO2 = new OASGoodsFeedbackStatisticsDTO();

        System.assertEquals(false, goodsFeedbackStatisticsDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackStatisticsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO1 = OASGoodsFeedbackStatisticsDTO.getExample();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO2 = new OASGoodsFeedbackStatisticsDTO();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO3;

        System.assertEquals(false, goodsFeedbackStatisticsDTO1.equals(goodsFeedbackStatisticsDTO3));
        System.assertEquals(false, goodsFeedbackStatisticsDTO2.equals(goodsFeedbackStatisticsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO1 = OASGoodsFeedbackStatisticsDTO.getExample();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO2 = new OASGoodsFeedbackStatisticsDTO();

        System.assertEquals(goodsFeedbackStatisticsDTO1.hashCode(), goodsFeedbackStatisticsDTO1.hashCode());
        System.assertEquals(goodsFeedbackStatisticsDTO2.hashCode(), goodsFeedbackStatisticsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO1 = OASGoodsFeedbackStatisticsDTO.getExample();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO2 = OASGoodsFeedbackStatisticsDTO.getExample();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO3 = new OASGoodsFeedbackStatisticsDTO();
        OASGoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO4 = new OASGoodsFeedbackStatisticsDTO();

        System.assert(goodsFeedbackStatisticsDTO1.equals(goodsFeedbackStatisticsDTO2));
        System.assert(goodsFeedbackStatisticsDTO3.equals(goodsFeedbackStatisticsDTO4));
        System.assertEquals(goodsFeedbackStatisticsDTO1.hashCode(), goodsFeedbackStatisticsDTO2.hashCode());
        System.assertEquals(goodsFeedbackStatisticsDTO3.hashCode(), goodsFeedbackStatisticsDTO4.hashCode());
    }
}
