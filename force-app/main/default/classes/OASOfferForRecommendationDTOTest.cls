@isTest
private class OASOfferForRecommendationDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferForRecommendationDTO offerForRecommendationDTO1 = OASOfferForRecommendationDTO.getExample();
        OASOfferForRecommendationDTO offerForRecommendationDTO2 = offerForRecommendationDTO1;
        OASOfferForRecommendationDTO offerForRecommendationDTO3 = new OASOfferForRecommendationDTO();
        OASOfferForRecommendationDTO offerForRecommendationDTO4 = offerForRecommendationDTO3;

        System.assert(offerForRecommendationDTO1.equals(offerForRecommendationDTO2));
        System.assert(offerForRecommendationDTO2.equals(offerForRecommendationDTO1));
        System.assert(offerForRecommendationDTO1.equals(offerForRecommendationDTO1));
        System.assert(offerForRecommendationDTO3.equals(offerForRecommendationDTO4));
        System.assert(offerForRecommendationDTO4.equals(offerForRecommendationDTO3));
        System.assert(offerForRecommendationDTO3.equals(offerForRecommendationDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferForRecommendationDTO offerForRecommendationDTO1 = OASOfferForRecommendationDTO.getExample();
        OASOfferForRecommendationDTO offerForRecommendationDTO2 = OASOfferForRecommendationDTO.getExample();
        OASOfferForRecommendationDTO offerForRecommendationDTO3 = new OASOfferForRecommendationDTO();
        OASOfferForRecommendationDTO offerForRecommendationDTO4 = new OASOfferForRecommendationDTO();

        System.assert(offerForRecommendationDTO1.equals(offerForRecommendationDTO2));
        System.assert(offerForRecommendationDTO2.equals(offerForRecommendationDTO1));
        System.assert(offerForRecommendationDTO3.equals(offerForRecommendationDTO4));
        System.assert(offerForRecommendationDTO4.equals(offerForRecommendationDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferForRecommendationDTO offerForRecommendationDTO1 = OASOfferForRecommendationDTO.getExample();
        OASOfferForRecommendationDTO offerForRecommendationDTO2 = new OASOfferForRecommendationDTO();

        System.assertEquals(false, offerForRecommendationDTO1.equals('foo'));
        System.assertEquals(false, offerForRecommendationDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferForRecommendationDTO offerForRecommendationDTO1 = OASOfferForRecommendationDTO.getExample();
        OASOfferForRecommendationDTO offerForRecommendationDTO2 = new OASOfferForRecommendationDTO();
        OASOfferForRecommendationDTO offerForRecommendationDTO3;

        System.assertEquals(false, offerForRecommendationDTO1.equals(offerForRecommendationDTO3));
        System.assertEquals(false, offerForRecommendationDTO2.equals(offerForRecommendationDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferForRecommendationDTO offerForRecommendationDTO1 = OASOfferForRecommendationDTO.getExample();
        OASOfferForRecommendationDTO offerForRecommendationDTO2 = new OASOfferForRecommendationDTO();

        System.assertEquals(offerForRecommendationDTO1.hashCode(), offerForRecommendationDTO1.hashCode());
        System.assertEquals(offerForRecommendationDTO2.hashCode(), offerForRecommendationDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferForRecommendationDTO offerForRecommendationDTO1 = OASOfferForRecommendationDTO.getExample();
        OASOfferForRecommendationDTO offerForRecommendationDTO2 = OASOfferForRecommendationDTO.getExample();
        OASOfferForRecommendationDTO offerForRecommendationDTO3 = new OASOfferForRecommendationDTO();
        OASOfferForRecommendationDTO offerForRecommendationDTO4 = new OASOfferForRecommendationDTO();

        System.assert(offerForRecommendationDTO1.equals(offerForRecommendationDTO2));
        System.assert(offerForRecommendationDTO3.equals(offerForRecommendationDTO4));
        System.assertEquals(offerForRecommendationDTO1.hashCode(), offerForRecommendationDTO2.hashCode());
        System.assertEquals(offerForRecommendationDTO3.hashCode(), offerForRecommendationDTO4.hashCode());
    }
}
