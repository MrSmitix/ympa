@isTest
private class OASGoodsFeedbackDescriptionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO1 = OASGoodsFeedbackDescriptionDTO.getExample();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO2 = goodsFeedbackDescriptionDTO1;
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO3 = new OASGoodsFeedbackDescriptionDTO();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO4 = goodsFeedbackDescriptionDTO3;

        System.assert(goodsFeedbackDescriptionDTO1.equals(goodsFeedbackDescriptionDTO2));
        System.assert(goodsFeedbackDescriptionDTO2.equals(goodsFeedbackDescriptionDTO1));
        System.assert(goodsFeedbackDescriptionDTO1.equals(goodsFeedbackDescriptionDTO1));
        System.assert(goodsFeedbackDescriptionDTO3.equals(goodsFeedbackDescriptionDTO4));
        System.assert(goodsFeedbackDescriptionDTO4.equals(goodsFeedbackDescriptionDTO3));
        System.assert(goodsFeedbackDescriptionDTO3.equals(goodsFeedbackDescriptionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO1 = OASGoodsFeedbackDescriptionDTO.getExample();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO2 = OASGoodsFeedbackDescriptionDTO.getExample();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO3 = new OASGoodsFeedbackDescriptionDTO();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO4 = new OASGoodsFeedbackDescriptionDTO();

        System.assert(goodsFeedbackDescriptionDTO1.equals(goodsFeedbackDescriptionDTO2));
        System.assert(goodsFeedbackDescriptionDTO2.equals(goodsFeedbackDescriptionDTO1));
        System.assert(goodsFeedbackDescriptionDTO3.equals(goodsFeedbackDescriptionDTO4));
        System.assert(goodsFeedbackDescriptionDTO4.equals(goodsFeedbackDescriptionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO1 = OASGoodsFeedbackDescriptionDTO.getExample();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO2 = new OASGoodsFeedbackDescriptionDTO();

        System.assertEquals(false, goodsFeedbackDescriptionDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackDescriptionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO1 = OASGoodsFeedbackDescriptionDTO.getExample();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO2 = new OASGoodsFeedbackDescriptionDTO();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO3;

        System.assertEquals(false, goodsFeedbackDescriptionDTO1.equals(goodsFeedbackDescriptionDTO3));
        System.assertEquals(false, goodsFeedbackDescriptionDTO2.equals(goodsFeedbackDescriptionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO1 = OASGoodsFeedbackDescriptionDTO.getExample();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO2 = new OASGoodsFeedbackDescriptionDTO();

        System.assertEquals(goodsFeedbackDescriptionDTO1.hashCode(), goodsFeedbackDescriptionDTO1.hashCode());
        System.assertEquals(goodsFeedbackDescriptionDTO2.hashCode(), goodsFeedbackDescriptionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO1 = OASGoodsFeedbackDescriptionDTO.getExample();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO2 = OASGoodsFeedbackDescriptionDTO.getExample();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO3 = new OASGoodsFeedbackDescriptionDTO();
        OASGoodsFeedbackDescriptionDTO goodsFeedbackDescriptionDTO4 = new OASGoodsFeedbackDescriptionDTO();

        System.assert(goodsFeedbackDescriptionDTO1.equals(goodsFeedbackDescriptionDTO2));
        System.assert(goodsFeedbackDescriptionDTO3.equals(goodsFeedbackDescriptionDTO4));
        System.assertEquals(goodsFeedbackDescriptionDTO1.hashCode(), goodsFeedbackDescriptionDTO2.hashCode());
        System.assertEquals(goodsFeedbackDescriptionDTO3.hashCode(), goodsFeedbackDescriptionDTO4.hashCode());
    }
}
