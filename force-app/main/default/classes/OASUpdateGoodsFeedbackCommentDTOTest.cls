@isTest
private class OASUpdateGoodsFeedbackCommentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO1 = OASUpdateGoodsFeedbackCommentDTO.getExample();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO2 = updateGoodsFeedbackCommentDTO1;
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO3 = new OASUpdateGoodsFeedbackCommentDTO();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO4 = updateGoodsFeedbackCommentDTO3;

        System.assert(updateGoodsFeedbackCommentDTO1.equals(updateGoodsFeedbackCommentDTO2));
        System.assert(updateGoodsFeedbackCommentDTO2.equals(updateGoodsFeedbackCommentDTO1));
        System.assert(updateGoodsFeedbackCommentDTO1.equals(updateGoodsFeedbackCommentDTO1));
        System.assert(updateGoodsFeedbackCommentDTO3.equals(updateGoodsFeedbackCommentDTO4));
        System.assert(updateGoodsFeedbackCommentDTO4.equals(updateGoodsFeedbackCommentDTO3));
        System.assert(updateGoodsFeedbackCommentDTO3.equals(updateGoodsFeedbackCommentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO1 = OASUpdateGoodsFeedbackCommentDTO.getExample();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO2 = OASUpdateGoodsFeedbackCommentDTO.getExample();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO3 = new OASUpdateGoodsFeedbackCommentDTO();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO4 = new OASUpdateGoodsFeedbackCommentDTO();

        System.assert(updateGoodsFeedbackCommentDTO1.equals(updateGoodsFeedbackCommentDTO2));
        System.assert(updateGoodsFeedbackCommentDTO2.equals(updateGoodsFeedbackCommentDTO1));
        System.assert(updateGoodsFeedbackCommentDTO3.equals(updateGoodsFeedbackCommentDTO4));
        System.assert(updateGoodsFeedbackCommentDTO4.equals(updateGoodsFeedbackCommentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO1 = OASUpdateGoodsFeedbackCommentDTO.getExample();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO2 = new OASUpdateGoodsFeedbackCommentDTO();

        System.assertEquals(false, updateGoodsFeedbackCommentDTO1.equals('foo'));
        System.assertEquals(false, updateGoodsFeedbackCommentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO1 = OASUpdateGoodsFeedbackCommentDTO.getExample();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO2 = new OASUpdateGoodsFeedbackCommentDTO();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO3;

        System.assertEquals(false, updateGoodsFeedbackCommentDTO1.equals(updateGoodsFeedbackCommentDTO3));
        System.assertEquals(false, updateGoodsFeedbackCommentDTO2.equals(updateGoodsFeedbackCommentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO1 = OASUpdateGoodsFeedbackCommentDTO.getExample();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO2 = new OASUpdateGoodsFeedbackCommentDTO();

        System.assertEquals(updateGoodsFeedbackCommentDTO1.hashCode(), updateGoodsFeedbackCommentDTO1.hashCode());
        System.assertEquals(updateGoodsFeedbackCommentDTO2.hashCode(), updateGoodsFeedbackCommentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO1 = OASUpdateGoodsFeedbackCommentDTO.getExample();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO2 = OASUpdateGoodsFeedbackCommentDTO.getExample();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO3 = new OASUpdateGoodsFeedbackCommentDTO();
        OASUpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO4 = new OASUpdateGoodsFeedbackCommentDTO();

        System.assert(updateGoodsFeedbackCommentDTO1.equals(updateGoodsFeedbackCommentDTO2));
        System.assert(updateGoodsFeedbackCommentDTO3.equals(updateGoodsFeedbackCommentDTO4));
        System.assertEquals(updateGoodsFeedbackCommentDTO1.hashCode(), updateGoodsFeedbackCommentDTO2.hashCode());
        System.assertEquals(updateGoodsFeedbackCommentDTO3.hashCode(), updateGoodsFeedbackCommentDTO4.hashCode());
    }
}
