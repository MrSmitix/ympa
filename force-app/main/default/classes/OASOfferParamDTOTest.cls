@isTest
private class OASOfferParamDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferParamDTO offerParamDTO1 = OASOfferParamDTO.getExample();
        OASOfferParamDTO offerParamDTO2 = offerParamDTO1;
        OASOfferParamDTO offerParamDTO3 = new OASOfferParamDTO();
        OASOfferParamDTO offerParamDTO4 = offerParamDTO3;

        System.assert(offerParamDTO1.equals(offerParamDTO2));
        System.assert(offerParamDTO2.equals(offerParamDTO1));
        System.assert(offerParamDTO1.equals(offerParamDTO1));
        System.assert(offerParamDTO3.equals(offerParamDTO4));
        System.assert(offerParamDTO4.equals(offerParamDTO3));
        System.assert(offerParamDTO3.equals(offerParamDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferParamDTO offerParamDTO1 = OASOfferParamDTO.getExample();
        OASOfferParamDTO offerParamDTO2 = OASOfferParamDTO.getExample();
        OASOfferParamDTO offerParamDTO3 = new OASOfferParamDTO();
        OASOfferParamDTO offerParamDTO4 = new OASOfferParamDTO();

        System.assert(offerParamDTO1.equals(offerParamDTO2));
        System.assert(offerParamDTO2.equals(offerParamDTO1));
        System.assert(offerParamDTO3.equals(offerParamDTO4));
        System.assert(offerParamDTO4.equals(offerParamDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferParamDTO offerParamDTO1 = OASOfferParamDTO.getExample();
        OASOfferParamDTO offerParamDTO2 = new OASOfferParamDTO();

        System.assertEquals(false, offerParamDTO1.equals('foo'));
        System.assertEquals(false, offerParamDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferParamDTO offerParamDTO1 = OASOfferParamDTO.getExample();
        OASOfferParamDTO offerParamDTO2 = new OASOfferParamDTO();
        OASOfferParamDTO offerParamDTO3;

        System.assertEquals(false, offerParamDTO1.equals(offerParamDTO3));
        System.assertEquals(false, offerParamDTO2.equals(offerParamDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferParamDTO offerParamDTO1 = OASOfferParamDTO.getExample();
        OASOfferParamDTO offerParamDTO2 = new OASOfferParamDTO();

        System.assertEquals(offerParamDTO1.hashCode(), offerParamDTO1.hashCode());
        System.assertEquals(offerParamDTO2.hashCode(), offerParamDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferParamDTO offerParamDTO1 = OASOfferParamDTO.getExample();
        OASOfferParamDTO offerParamDTO2 = OASOfferParamDTO.getExample();
        OASOfferParamDTO offerParamDTO3 = new OASOfferParamDTO();
        OASOfferParamDTO offerParamDTO4 = new OASOfferParamDTO();

        System.assert(offerParamDTO1.equals(offerParamDTO2));
        System.assert(offerParamDTO3.equals(offerParamDTO4));
        System.assertEquals(offerParamDTO1.hashCode(), offerParamDTO2.hashCode());
        System.assertEquals(offerParamDTO3.hashCode(), offerParamDTO4.hashCode());
    }
}
