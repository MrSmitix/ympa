@isTest
private class OASOfferCardRecommendationDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferCardRecommendationDTO offerCardRecommendationDTO1 = OASOfferCardRecommendationDTO.getExample();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO2 = offerCardRecommendationDTO1;
        OASOfferCardRecommendationDTO offerCardRecommendationDTO3 = new OASOfferCardRecommendationDTO();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO4 = offerCardRecommendationDTO3;

        System.assert(offerCardRecommendationDTO1.equals(offerCardRecommendationDTO2));
        System.assert(offerCardRecommendationDTO2.equals(offerCardRecommendationDTO1));
        System.assert(offerCardRecommendationDTO1.equals(offerCardRecommendationDTO1));
        System.assert(offerCardRecommendationDTO3.equals(offerCardRecommendationDTO4));
        System.assert(offerCardRecommendationDTO4.equals(offerCardRecommendationDTO3));
        System.assert(offerCardRecommendationDTO3.equals(offerCardRecommendationDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferCardRecommendationDTO offerCardRecommendationDTO1 = OASOfferCardRecommendationDTO.getExample();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO2 = OASOfferCardRecommendationDTO.getExample();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO3 = new OASOfferCardRecommendationDTO();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO4 = new OASOfferCardRecommendationDTO();

        System.assert(offerCardRecommendationDTO1.equals(offerCardRecommendationDTO2));
        System.assert(offerCardRecommendationDTO2.equals(offerCardRecommendationDTO1));
        System.assert(offerCardRecommendationDTO3.equals(offerCardRecommendationDTO4));
        System.assert(offerCardRecommendationDTO4.equals(offerCardRecommendationDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferCardRecommendationDTO offerCardRecommendationDTO1 = OASOfferCardRecommendationDTO.getExample();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO2 = new OASOfferCardRecommendationDTO();

        System.assertEquals(false, offerCardRecommendationDTO1.equals('foo'));
        System.assertEquals(false, offerCardRecommendationDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferCardRecommendationDTO offerCardRecommendationDTO1 = OASOfferCardRecommendationDTO.getExample();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO2 = new OASOfferCardRecommendationDTO();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO3;

        System.assertEquals(false, offerCardRecommendationDTO1.equals(offerCardRecommendationDTO3));
        System.assertEquals(false, offerCardRecommendationDTO2.equals(offerCardRecommendationDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferCardRecommendationDTO offerCardRecommendationDTO1 = OASOfferCardRecommendationDTO.getExample();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO2 = new OASOfferCardRecommendationDTO();

        System.assertEquals(offerCardRecommendationDTO1.hashCode(), offerCardRecommendationDTO1.hashCode());
        System.assertEquals(offerCardRecommendationDTO2.hashCode(), offerCardRecommendationDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferCardRecommendationDTO offerCardRecommendationDTO1 = OASOfferCardRecommendationDTO.getExample();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO2 = OASOfferCardRecommendationDTO.getExample();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO3 = new OASOfferCardRecommendationDTO();
        OASOfferCardRecommendationDTO offerCardRecommendationDTO4 = new OASOfferCardRecommendationDTO();

        System.assert(offerCardRecommendationDTO1.equals(offerCardRecommendationDTO2));
        System.assert(offerCardRecommendationDTO3.equals(offerCardRecommendationDTO4));
        System.assertEquals(offerCardRecommendationDTO1.hashCode(), offerCardRecommendationDTO2.hashCode());
        System.assertEquals(offerCardRecommendationDTO3.hashCode(), offerCardRecommendationDTO4.hashCode());
    }
}
