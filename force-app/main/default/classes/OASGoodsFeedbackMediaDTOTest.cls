@isTest
private class OASGoodsFeedbackMediaDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO1 = OASGoodsFeedbackMediaDTO.getExample();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO2 = goodsFeedbackMediaDTO1;
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO3 = new OASGoodsFeedbackMediaDTO();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO4 = goodsFeedbackMediaDTO3;

        System.assert(goodsFeedbackMediaDTO1.equals(goodsFeedbackMediaDTO2));
        System.assert(goodsFeedbackMediaDTO2.equals(goodsFeedbackMediaDTO1));
        System.assert(goodsFeedbackMediaDTO1.equals(goodsFeedbackMediaDTO1));
        System.assert(goodsFeedbackMediaDTO3.equals(goodsFeedbackMediaDTO4));
        System.assert(goodsFeedbackMediaDTO4.equals(goodsFeedbackMediaDTO3));
        System.assert(goodsFeedbackMediaDTO3.equals(goodsFeedbackMediaDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO1 = OASGoodsFeedbackMediaDTO.getExample();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO2 = OASGoodsFeedbackMediaDTO.getExample();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO3 = new OASGoodsFeedbackMediaDTO();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO4 = new OASGoodsFeedbackMediaDTO();

        System.assert(goodsFeedbackMediaDTO1.equals(goodsFeedbackMediaDTO2));
        System.assert(goodsFeedbackMediaDTO2.equals(goodsFeedbackMediaDTO1));
        System.assert(goodsFeedbackMediaDTO3.equals(goodsFeedbackMediaDTO4));
        System.assert(goodsFeedbackMediaDTO4.equals(goodsFeedbackMediaDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO1 = OASGoodsFeedbackMediaDTO.getExample();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO2 = new OASGoodsFeedbackMediaDTO();

        System.assertEquals(false, goodsFeedbackMediaDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackMediaDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO1 = OASGoodsFeedbackMediaDTO.getExample();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO2 = new OASGoodsFeedbackMediaDTO();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO3;

        System.assertEquals(false, goodsFeedbackMediaDTO1.equals(goodsFeedbackMediaDTO3));
        System.assertEquals(false, goodsFeedbackMediaDTO2.equals(goodsFeedbackMediaDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO1 = OASGoodsFeedbackMediaDTO.getExample();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO2 = new OASGoodsFeedbackMediaDTO();

        System.assertEquals(goodsFeedbackMediaDTO1.hashCode(), goodsFeedbackMediaDTO1.hashCode());
        System.assertEquals(goodsFeedbackMediaDTO2.hashCode(), goodsFeedbackMediaDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO1 = OASGoodsFeedbackMediaDTO.getExample();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO2 = OASGoodsFeedbackMediaDTO.getExample();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO3 = new OASGoodsFeedbackMediaDTO();
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO4 = new OASGoodsFeedbackMediaDTO();

        System.assert(goodsFeedbackMediaDTO1.equals(goodsFeedbackMediaDTO2));
        System.assert(goodsFeedbackMediaDTO3.equals(goodsFeedbackMediaDTO4));
        System.assertEquals(goodsFeedbackMediaDTO1.hashCode(), goodsFeedbackMediaDTO2.hashCode());
        System.assertEquals(goodsFeedbackMediaDTO3.hashCode(), goodsFeedbackMediaDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGoodsFeedbackMediaDTO goodsFeedbackMediaDTO = new OASGoodsFeedbackMediaDTO();
        System.assertEquals(new List<String>(), goodsFeedbackMediaDTO.photos);
        System.assertEquals(new List<String>(), goodsFeedbackMediaDTO.videos);
    }
}
