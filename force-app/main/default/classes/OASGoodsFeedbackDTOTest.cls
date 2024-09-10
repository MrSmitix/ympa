@isTest
private class OASGoodsFeedbackDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackDTO goodsFeedbackDTO1 = OASGoodsFeedbackDTO.getExample();
        OASGoodsFeedbackDTO goodsFeedbackDTO2 = goodsFeedbackDTO1;
        OASGoodsFeedbackDTO goodsFeedbackDTO3 = new OASGoodsFeedbackDTO();
        OASGoodsFeedbackDTO goodsFeedbackDTO4 = goodsFeedbackDTO3;

        System.assert(goodsFeedbackDTO1.equals(goodsFeedbackDTO2));
        System.assert(goodsFeedbackDTO2.equals(goodsFeedbackDTO1));
        System.assert(goodsFeedbackDTO1.equals(goodsFeedbackDTO1));
        System.assert(goodsFeedbackDTO3.equals(goodsFeedbackDTO4));
        System.assert(goodsFeedbackDTO4.equals(goodsFeedbackDTO3));
        System.assert(goodsFeedbackDTO3.equals(goodsFeedbackDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackDTO goodsFeedbackDTO1 = OASGoodsFeedbackDTO.getExample();
        OASGoodsFeedbackDTO goodsFeedbackDTO2 = OASGoodsFeedbackDTO.getExample();
        OASGoodsFeedbackDTO goodsFeedbackDTO3 = new OASGoodsFeedbackDTO();
        OASGoodsFeedbackDTO goodsFeedbackDTO4 = new OASGoodsFeedbackDTO();

        System.assert(goodsFeedbackDTO1.equals(goodsFeedbackDTO2));
        System.assert(goodsFeedbackDTO2.equals(goodsFeedbackDTO1));
        System.assert(goodsFeedbackDTO3.equals(goodsFeedbackDTO4));
        System.assert(goodsFeedbackDTO4.equals(goodsFeedbackDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackDTO goodsFeedbackDTO1 = OASGoodsFeedbackDTO.getExample();
        OASGoodsFeedbackDTO goodsFeedbackDTO2 = new OASGoodsFeedbackDTO();

        System.assertEquals(false, goodsFeedbackDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackDTO goodsFeedbackDTO1 = OASGoodsFeedbackDTO.getExample();
        OASGoodsFeedbackDTO goodsFeedbackDTO2 = new OASGoodsFeedbackDTO();
        OASGoodsFeedbackDTO goodsFeedbackDTO3;

        System.assertEquals(false, goodsFeedbackDTO1.equals(goodsFeedbackDTO3));
        System.assertEquals(false, goodsFeedbackDTO2.equals(goodsFeedbackDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackDTO goodsFeedbackDTO1 = OASGoodsFeedbackDTO.getExample();
        OASGoodsFeedbackDTO goodsFeedbackDTO2 = new OASGoodsFeedbackDTO();

        System.assertEquals(goodsFeedbackDTO1.hashCode(), goodsFeedbackDTO1.hashCode());
        System.assertEquals(goodsFeedbackDTO2.hashCode(), goodsFeedbackDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackDTO goodsFeedbackDTO1 = OASGoodsFeedbackDTO.getExample();
        OASGoodsFeedbackDTO goodsFeedbackDTO2 = OASGoodsFeedbackDTO.getExample();
        OASGoodsFeedbackDTO goodsFeedbackDTO3 = new OASGoodsFeedbackDTO();
        OASGoodsFeedbackDTO goodsFeedbackDTO4 = new OASGoodsFeedbackDTO();

        System.assert(goodsFeedbackDTO1.equals(goodsFeedbackDTO2));
        System.assert(goodsFeedbackDTO3.equals(goodsFeedbackDTO4));
        System.assertEquals(goodsFeedbackDTO1.hashCode(), goodsFeedbackDTO2.hashCode());
        System.assertEquals(goodsFeedbackDTO3.hashCode(), goodsFeedbackDTO4.hashCode());
    }
}
