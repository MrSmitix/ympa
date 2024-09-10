@isTest
private class OASOfferWeightDimensionsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO1 = OASOfferWeightDimensionsDTO.getExample();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO2 = offerWeightDimensionsDTO1;
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO3 = new OASOfferWeightDimensionsDTO();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO4 = offerWeightDimensionsDTO3;

        System.assert(offerWeightDimensionsDTO1.equals(offerWeightDimensionsDTO2));
        System.assert(offerWeightDimensionsDTO2.equals(offerWeightDimensionsDTO1));
        System.assert(offerWeightDimensionsDTO1.equals(offerWeightDimensionsDTO1));
        System.assert(offerWeightDimensionsDTO3.equals(offerWeightDimensionsDTO4));
        System.assert(offerWeightDimensionsDTO4.equals(offerWeightDimensionsDTO3));
        System.assert(offerWeightDimensionsDTO3.equals(offerWeightDimensionsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO1 = OASOfferWeightDimensionsDTO.getExample();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO2 = OASOfferWeightDimensionsDTO.getExample();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO3 = new OASOfferWeightDimensionsDTO();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO4 = new OASOfferWeightDimensionsDTO();

        System.assert(offerWeightDimensionsDTO1.equals(offerWeightDimensionsDTO2));
        System.assert(offerWeightDimensionsDTO2.equals(offerWeightDimensionsDTO1));
        System.assert(offerWeightDimensionsDTO3.equals(offerWeightDimensionsDTO4));
        System.assert(offerWeightDimensionsDTO4.equals(offerWeightDimensionsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO1 = OASOfferWeightDimensionsDTO.getExample();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO2 = new OASOfferWeightDimensionsDTO();

        System.assertEquals(false, offerWeightDimensionsDTO1.equals('foo'));
        System.assertEquals(false, offerWeightDimensionsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO1 = OASOfferWeightDimensionsDTO.getExample();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO2 = new OASOfferWeightDimensionsDTO();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO3;

        System.assertEquals(false, offerWeightDimensionsDTO1.equals(offerWeightDimensionsDTO3));
        System.assertEquals(false, offerWeightDimensionsDTO2.equals(offerWeightDimensionsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO1 = OASOfferWeightDimensionsDTO.getExample();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO2 = new OASOfferWeightDimensionsDTO();

        System.assertEquals(offerWeightDimensionsDTO1.hashCode(), offerWeightDimensionsDTO1.hashCode());
        System.assertEquals(offerWeightDimensionsDTO2.hashCode(), offerWeightDimensionsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO1 = OASOfferWeightDimensionsDTO.getExample();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO2 = OASOfferWeightDimensionsDTO.getExample();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO3 = new OASOfferWeightDimensionsDTO();
        OASOfferWeightDimensionsDTO offerWeightDimensionsDTO4 = new OASOfferWeightDimensionsDTO();

        System.assert(offerWeightDimensionsDTO1.equals(offerWeightDimensionsDTO2));
        System.assert(offerWeightDimensionsDTO3.equals(offerWeightDimensionsDTO4));
        System.assertEquals(offerWeightDimensionsDTO1.hashCode(), offerWeightDimensionsDTO2.hashCode());
        System.assertEquals(offerWeightDimensionsDTO3.hashCode(), offerWeightDimensionsDTO4.hashCode());
    }
}
