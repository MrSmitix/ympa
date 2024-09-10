@isTest
private class OASGoodsFeedbackListDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackListDTO goodsFeedbackListDTO1 = OASGoodsFeedbackListDTO.getExample();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO2 = goodsFeedbackListDTO1;
        OASGoodsFeedbackListDTO goodsFeedbackListDTO3 = new OASGoodsFeedbackListDTO();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO4 = goodsFeedbackListDTO3;

        System.assert(goodsFeedbackListDTO1.equals(goodsFeedbackListDTO2));
        System.assert(goodsFeedbackListDTO2.equals(goodsFeedbackListDTO1));
        System.assert(goodsFeedbackListDTO1.equals(goodsFeedbackListDTO1));
        System.assert(goodsFeedbackListDTO3.equals(goodsFeedbackListDTO4));
        System.assert(goodsFeedbackListDTO4.equals(goodsFeedbackListDTO3));
        System.assert(goodsFeedbackListDTO3.equals(goodsFeedbackListDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackListDTO goodsFeedbackListDTO1 = OASGoodsFeedbackListDTO.getExample();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO2 = OASGoodsFeedbackListDTO.getExample();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO3 = new OASGoodsFeedbackListDTO();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO4 = new OASGoodsFeedbackListDTO();

        System.assert(goodsFeedbackListDTO1.equals(goodsFeedbackListDTO2));
        System.assert(goodsFeedbackListDTO2.equals(goodsFeedbackListDTO1));
        System.assert(goodsFeedbackListDTO3.equals(goodsFeedbackListDTO4));
        System.assert(goodsFeedbackListDTO4.equals(goodsFeedbackListDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackListDTO goodsFeedbackListDTO1 = OASGoodsFeedbackListDTO.getExample();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO2 = new OASGoodsFeedbackListDTO();

        System.assertEquals(false, goodsFeedbackListDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackListDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackListDTO goodsFeedbackListDTO1 = OASGoodsFeedbackListDTO.getExample();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO2 = new OASGoodsFeedbackListDTO();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO3;

        System.assertEquals(false, goodsFeedbackListDTO1.equals(goodsFeedbackListDTO3));
        System.assertEquals(false, goodsFeedbackListDTO2.equals(goodsFeedbackListDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackListDTO goodsFeedbackListDTO1 = OASGoodsFeedbackListDTO.getExample();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO2 = new OASGoodsFeedbackListDTO();

        System.assertEquals(goodsFeedbackListDTO1.hashCode(), goodsFeedbackListDTO1.hashCode());
        System.assertEquals(goodsFeedbackListDTO2.hashCode(), goodsFeedbackListDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackListDTO goodsFeedbackListDTO1 = OASGoodsFeedbackListDTO.getExample();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO2 = OASGoodsFeedbackListDTO.getExample();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO3 = new OASGoodsFeedbackListDTO();
        OASGoodsFeedbackListDTO goodsFeedbackListDTO4 = new OASGoodsFeedbackListDTO();

        System.assert(goodsFeedbackListDTO1.equals(goodsFeedbackListDTO2));
        System.assert(goodsFeedbackListDTO3.equals(goodsFeedbackListDTO4));
        System.assertEquals(goodsFeedbackListDTO1.hashCode(), goodsFeedbackListDTO2.hashCode());
        System.assertEquals(goodsFeedbackListDTO3.hashCode(), goodsFeedbackListDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGoodsFeedbackListDTO goodsFeedbackListDTO = new OASGoodsFeedbackListDTO();
        System.assertEquals(new List<OASGoodsFeedbackDTO>(), goodsFeedbackListDTO.feedbacks);
        System.assertEquals(null, goodsFeedbackListDTO.paging);
    }
}
