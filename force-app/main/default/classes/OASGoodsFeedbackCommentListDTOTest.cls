@isTest
private class OASGoodsFeedbackCommentListDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO1 = OASGoodsFeedbackCommentListDTO.getExample();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO2 = goodsFeedbackCommentListDTO1;
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO3 = new OASGoodsFeedbackCommentListDTO();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO4 = goodsFeedbackCommentListDTO3;

        System.assert(goodsFeedbackCommentListDTO1.equals(goodsFeedbackCommentListDTO2));
        System.assert(goodsFeedbackCommentListDTO2.equals(goodsFeedbackCommentListDTO1));
        System.assert(goodsFeedbackCommentListDTO1.equals(goodsFeedbackCommentListDTO1));
        System.assert(goodsFeedbackCommentListDTO3.equals(goodsFeedbackCommentListDTO4));
        System.assert(goodsFeedbackCommentListDTO4.equals(goodsFeedbackCommentListDTO3));
        System.assert(goodsFeedbackCommentListDTO3.equals(goodsFeedbackCommentListDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO1 = OASGoodsFeedbackCommentListDTO.getExample();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO2 = OASGoodsFeedbackCommentListDTO.getExample();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO3 = new OASGoodsFeedbackCommentListDTO();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO4 = new OASGoodsFeedbackCommentListDTO();

        System.assert(goodsFeedbackCommentListDTO1.equals(goodsFeedbackCommentListDTO2));
        System.assert(goodsFeedbackCommentListDTO2.equals(goodsFeedbackCommentListDTO1));
        System.assert(goodsFeedbackCommentListDTO3.equals(goodsFeedbackCommentListDTO4));
        System.assert(goodsFeedbackCommentListDTO4.equals(goodsFeedbackCommentListDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO1 = OASGoodsFeedbackCommentListDTO.getExample();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO2 = new OASGoodsFeedbackCommentListDTO();

        System.assertEquals(false, goodsFeedbackCommentListDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackCommentListDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO1 = OASGoodsFeedbackCommentListDTO.getExample();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO2 = new OASGoodsFeedbackCommentListDTO();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO3;

        System.assertEquals(false, goodsFeedbackCommentListDTO1.equals(goodsFeedbackCommentListDTO3));
        System.assertEquals(false, goodsFeedbackCommentListDTO2.equals(goodsFeedbackCommentListDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO1 = OASGoodsFeedbackCommentListDTO.getExample();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO2 = new OASGoodsFeedbackCommentListDTO();

        System.assertEquals(goodsFeedbackCommentListDTO1.hashCode(), goodsFeedbackCommentListDTO1.hashCode());
        System.assertEquals(goodsFeedbackCommentListDTO2.hashCode(), goodsFeedbackCommentListDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO1 = OASGoodsFeedbackCommentListDTO.getExample();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO2 = OASGoodsFeedbackCommentListDTO.getExample();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO3 = new OASGoodsFeedbackCommentListDTO();
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO4 = new OASGoodsFeedbackCommentListDTO();

        System.assert(goodsFeedbackCommentListDTO1.equals(goodsFeedbackCommentListDTO2));
        System.assert(goodsFeedbackCommentListDTO3.equals(goodsFeedbackCommentListDTO4));
        System.assertEquals(goodsFeedbackCommentListDTO1.hashCode(), goodsFeedbackCommentListDTO2.hashCode());
        System.assertEquals(goodsFeedbackCommentListDTO3.hashCode(), goodsFeedbackCommentListDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO = new OASGoodsFeedbackCommentListDTO();
        System.assertEquals(new List<OASGoodsFeedbackCommentDTO>(), goodsFeedbackCommentListDTO.comments);
        System.assertEquals(null, goodsFeedbackCommentListDTO.paging);
    }
}
