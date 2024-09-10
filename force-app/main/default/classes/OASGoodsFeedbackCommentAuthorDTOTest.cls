@isTest
private class OASGoodsFeedbackCommentAuthorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO1 = OASGoodsFeedbackCommentAuthorDTO.getExample();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO2 = goodsFeedbackCommentAuthorDTO1;
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO3 = new OASGoodsFeedbackCommentAuthorDTO();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO4 = goodsFeedbackCommentAuthorDTO3;

        System.assert(goodsFeedbackCommentAuthorDTO1.equals(goodsFeedbackCommentAuthorDTO2));
        System.assert(goodsFeedbackCommentAuthorDTO2.equals(goodsFeedbackCommentAuthorDTO1));
        System.assert(goodsFeedbackCommentAuthorDTO1.equals(goodsFeedbackCommentAuthorDTO1));
        System.assert(goodsFeedbackCommentAuthorDTO3.equals(goodsFeedbackCommentAuthorDTO4));
        System.assert(goodsFeedbackCommentAuthorDTO4.equals(goodsFeedbackCommentAuthorDTO3));
        System.assert(goodsFeedbackCommentAuthorDTO3.equals(goodsFeedbackCommentAuthorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO1 = OASGoodsFeedbackCommentAuthorDTO.getExample();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO2 = OASGoodsFeedbackCommentAuthorDTO.getExample();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO3 = new OASGoodsFeedbackCommentAuthorDTO();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO4 = new OASGoodsFeedbackCommentAuthorDTO();

        System.assert(goodsFeedbackCommentAuthorDTO1.equals(goodsFeedbackCommentAuthorDTO2));
        System.assert(goodsFeedbackCommentAuthorDTO2.equals(goodsFeedbackCommentAuthorDTO1));
        System.assert(goodsFeedbackCommentAuthorDTO3.equals(goodsFeedbackCommentAuthorDTO4));
        System.assert(goodsFeedbackCommentAuthorDTO4.equals(goodsFeedbackCommentAuthorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO1 = OASGoodsFeedbackCommentAuthorDTO.getExample();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO2 = new OASGoodsFeedbackCommentAuthorDTO();

        System.assertEquals(false, goodsFeedbackCommentAuthorDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackCommentAuthorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO1 = OASGoodsFeedbackCommentAuthorDTO.getExample();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO2 = new OASGoodsFeedbackCommentAuthorDTO();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO3;

        System.assertEquals(false, goodsFeedbackCommentAuthorDTO1.equals(goodsFeedbackCommentAuthorDTO3));
        System.assertEquals(false, goodsFeedbackCommentAuthorDTO2.equals(goodsFeedbackCommentAuthorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO1 = OASGoodsFeedbackCommentAuthorDTO.getExample();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO2 = new OASGoodsFeedbackCommentAuthorDTO();

        System.assertEquals(goodsFeedbackCommentAuthorDTO1.hashCode(), goodsFeedbackCommentAuthorDTO1.hashCode());
        System.assertEquals(goodsFeedbackCommentAuthorDTO2.hashCode(), goodsFeedbackCommentAuthorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO1 = OASGoodsFeedbackCommentAuthorDTO.getExample();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO2 = OASGoodsFeedbackCommentAuthorDTO.getExample();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO3 = new OASGoodsFeedbackCommentAuthorDTO();
        OASGoodsFeedbackCommentAuthorDTO goodsFeedbackCommentAuthorDTO4 = new OASGoodsFeedbackCommentAuthorDTO();

        System.assert(goodsFeedbackCommentAuthorDTO1.equals(goodsFeedbackCommentAuthorDTO2));
        System.assert(goodsFeedbackCommentAuthorDTO3.equals(goodsFeedbackCommentAuthorDTO4));
        System.assertEquals(goodsFeedbackCommentAuthorDTO1.hashCode(), goodsFeedbackCommentAuthorDTO2.hashCode());
        System.assertEquals(goodsFeedbackCommentAuthorDTO3.hashCode(), goodsFeedbackCommentAuthorDTO4.hashCode());
    }
}
