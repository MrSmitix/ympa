@isTest
private class OASGoodsFeedbackIdentifiersDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO1 = OASGoodsFeedbackIdentifiersDTO.getExample();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO2 = goodsFeedbackIdentifiersDTO1;
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO3 = new OASGoodsFeedbackIdentifiersDTO();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO4 = goodsFeedbackIdentifiersDTO3;

        System.assert(goodsFeedbackIdentifiersDTO1.equals(goodsFeedbackIdentifiersDTO2));
        System.assert(goodsFeedbackIdentifiersDTO2.equals(goodsFeedbackIdentifiersDTO1));
        System.assert(goodsFeedbackIdentifiersDTO1.equals(goodsFeedbackIdentifiersDTO1));
        System.assert(goodsFeedbackIdentifiersDTO3.equals(goodsFeedbackIdentifiersDTO4));
        System.assert(goodsFeedbackIdentifiersDTO4.equals(goodsFeedbackIdentifiersDTO3));
        System.assert(goodsFeedbackIdentifiersDTO3.equals(goodsFeedbackIdentifiersDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO1 = OASGoodsFeedbackIdentifiersDTO.getExample();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO2 = OASGoodsFeedbackIdentifiersDTO.getExample();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO3 = new OASGoodsFeedbackIdentifiersDTO();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO4 = new OASGoodsFeedbackIdentifiersDTO();

        System.assert(goodsFeedbackIdentifiersDTO1.equals(goodsFeedbackIdentifiersDTO2));
        System.assert(goodsFeedbackIdentifiersDTO2.equals(goodsFeedbackIdentifiersDTO1));
        System.assert(goodsFeedbackIdentifiersDTO3.equals(goodsFeedbackIdentifiersDTO4));
        System.assert(goodsFeedbackIdentifiersDTO4.equals(goodsFeedbackIdentifiersDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO1 = OASGoodsFeedbackIdentifiersDTO.getExample();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO2 = new OASGoodsFeedbackIdentifiersDTO();

        System.assertEquals(false, goodsFeedbackIdentifiersDTO1.equals('foo'));
        System.assertEquals(false, goodsFeedbackIdentifiersDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO1 = OASGoodsFeedbackIdentifiersDTO.getExample();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO2 = new OASGoodsFeedbackIdentifiersDTO();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO3;

        System.assertEquals(false, goodsFeedbackIdentifiersDTO1.equals(goodsFeedbackIdentifiersDTO3));
        System.assertEquals(false, goodsFeedbackIdentifiersDTO2.equals(goodsFeedbackIdentifiersDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO1 = OASGoodsFeedbackIdentifiersDTO.getExample();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO2 = new OASGoodsFeedbackIdentifiersDTO();

        System.assertEquals(goodsFeedbackIdentifiersDTO1.hashCode(), goodsFeedbackIdentifiersDTO1.hashCode());
        System.assertEquals(goodsFeedbackIdentifiersDTO2.hashCode(), goodsFeedbackIdentifiersDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO1 = OASGoodsFeedbackIdentifiersDTO.getExample();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO2 = OASGoodsFeedbackIdentifiersDTO.getExample();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO3 = new OASGoodsFeedbackIdentifiersDTO();
        OASGoodsFeedbackIdentifiersDTO goodsFeedbackIdentifiersDTO4 = new OASGoodsFeedbackIdentifiersDTO();

        System.assert(goodsFeedbackIdentifiersDTO1.equals(goodsFeedbackIdentifiersDTO2));
        System.assert(goodsFeedbackIdentifiersDTO3.equals(goodsFeedbackIdentifiersDTO4));
        System.assertEquals(goodsFeedbackIdentifiersDTO1.hashCode(), goodsFeedbackIdentifiersDTO2.hashCode());
        System.assertEquals(goodsFeedbackIdentifiersDTO3.hashCode(), goodsFeedbackIdentifiersDTO4.hashCode());
    }
}
