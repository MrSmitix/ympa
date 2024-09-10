@isTest
private class OASGoodsFeedbackCommentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO1 = OASGoodsFeedbackCommentDTO.getExample();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO2 = goodsFeedbackCommentDTO1;
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO3 = new OASGoodsFeedbackCommentDTO();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO4 = goodsFeedbackCommentDTO3;

        System.assert(goodsFeedbackCommentDTO1.equals(goodsFeedbackCommentDTO2));
        System.assert(goodsFeedbackCommentDTO2.equals(goodsFeedbackCommentDTO1));
        System.assert(goodsFeedbackCommentDTO1.equals(goodsFeedbackCommentDTO1));
        System.assert(goodsFeedbackCommentDTO3.equals(goodsFeedbackCommentDTO4));
        System.assert(goodsFeedbackCommentDTO4.equals(goodsFeedbackCommentDTO3));
        System.assert(goodsFeedbackCommentDTO3.equals(goodsFeedbackCommentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO1 = OASGoodsFeedbackCommentDTO.getExample();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO2 = OASGoodsFeedbackCommentDTO.getExample();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO3 = new OASGoodsFeedbackCommentDTO();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO4 = new OASGoodsFeedbackCommentDTO();

        System.assert(goodsFeedbackCommentDTO1.equals(goodsFeedbackCommentDTO2));
        System.assert(goodsFeedbackCommentDTO2.equals(goodsFeedbackCommentDTO1));
        System.assert(goodsFeedbackCommentDTO3.equals(goodsFeedbackCommentDTO4));
        System.assert(goodsFeedbackCommentDTO4.equals(goodsFeedbackCommentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO1 = OASGoodsFeedbackCommentDTO.getExample();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO2 = new OASGoodsFeedbackCommentDTO();

        System.assertEquals(false, goodsFeedbackCommentDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackCommentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO1 = OASGoodsFeedbackCommentDTO.getExample();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO2 = new OASGoodsFeedbackCommentDTO();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO3;

        System.assertEquals(false, goodsFeedbackCommentDTO1.equals(goodsFeedbackCommentDTO3));
        System.assertEquals(false, goodsFeedbackCommentDTO2.equals(goodsFeedbackCommentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO1 = OASGoodsFeedbackCommentDTO.getExample();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO2 = new OASGoodsFeedbackCommentDTO();

        System.assertEquals(goodsFeedbackCommentDTO1.hashCode(), goodsFeedbackCommentDTO1.hashCode());
        System.assertEquals(goodsFeedbackCommentDTO2.hashCode(), goodsFeedbackCommentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO1 = OASGoodsFeedbackCommentDTO.getExample();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO2 = OASGoodsFeedbackCommentDTO.getExample();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO3 = new OASGoodsFeedbackCommentDTO();
        OASGoodsFeedbackCommentDTO goodsFeedbackCommentDTO4 = new OASGoodsFeedbackCommentDTO();

        System.assert(goodsFeedbackCommentDTO1.equals(goodsFeedbackCommentDTO2));
        System.assert(goodsFeedbackCommentDTO3.equals(goodsFeedbackCommentDTO4));
        System.assertEquals(goodsFeedbackCommentDTO1.hashCode(), goodsFeedbackCommentDTO2.hashCode());
        System.assertEquals(goodsFeedbackCommentDTO3.hashCode(), goodsFeedbackCommentDTO4.hashCode());
    }
}
