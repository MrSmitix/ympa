@isTest
private class OASOfferRecommendationDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferRecommendationDTO offerRecommendationDTO1 = OASOfferRecommendationDTO.getExample();
        OASOfferRecommendationDTO offerRecommendationDTO2 = offerRecommendationDTO1;
        OASOfferRecommendationDTO offerRecommendationDTO3 = new OASOfferRecommendationDTO();
        OASOfferRecommendationDTO offerRecommendationDTO4 = offerRecommendationDTO3;

        System.assert(offerRecommendationDTO1.equals(offerRecommendationDTO2));
        System.assert(offerRecommendationDTO2.equals(offerRecommendationDTO1));
        System.assert(offerRecommendationDTO1.equals(offerRecommendationDTO1));
        System.assert(offerRecommendationDTO3.equals(offerRecommendationDTO4));
        System.assert(offerRecommendationDTO4.equals(offerRecommendationDTO3));
        System.assert(offerRecommendationDTO3.equals(offerRecommendationDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferRecommendationDTO offerRecommendationDTO1 = OASOfferRecommendationDTO.getExample();
        OASOfferRecommendationDTO offerRecommendationDTO2 = OASOfferRecommendationDTO.getExample();
        OASOfferRecommendationDTO offerRecommendationDTO3 = new OASOfferRecommendationDTO();
        OASOfferRecommendationDTO offerRecommendationDTO4 = new OASOfferRecommendationDTO();

        System.assert(offerRecommendationDTO1.equals(offerRecommendationDTO2));
        System.assert(offerRecommendationDTO2.equals(offerRecommendationDTO1));
        System.assert(offerRecommendationDTO3.equals(offerRecommendationDTO4));
        System.assert(offerRecommendationDTO4.equals(offerRecommendationDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferRecommendationDTO offerRecommendationDTO1 = OASOfferRecommendationDTO.getExample();
        OASOfferRecommendationDTO offerRecommendationDTO2 = new OASOfferRecommendationDTO();

        System.assertEquals(false, offerRecommendationDTO1.equals('foo'));
        System.assertEquals(false, offerRecommendationDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferRecommendationDTO offerRecommendationDTO1 = OASOfferRecommendationDTO.getExample();
        OASOfferRecommendationDTO offerRecommendationDTO2 = new OASOfferRecommendationDTO();
        OASOfferRecommendationDTO offerRecommendationDTO3;

        System.assertEquals(false, offerRecommendationDTO1.equals(offerRecommendationDTO3));
        System.assertEquals(false, offerRecommendationDTO2.equals(offerRecommendationDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferRecommendationDTO offerRecommendationDTO1 = OASOfferRecommendationDTO.getExample();
        OASOfferRecommendationDTO offerRecommendationDTO2 = new OASOfferRecommendationDTO();

        System.assertEquals(offerRecommendationDTO1.hashCode(), offerRecommendationDTO1.hashCode());
        System.assertEquals(offerRecommendationDTO2.hashCode(), offerRecommendationDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferRecommendationDTO offerRecommendationDTO1 = OASOfferRecommendationDTO.getExample();
        OASOfferRecommendationDTO offerRecommendationDTO2 = OASOfferRecommendationDTO.getExample();
        OASOfferRecommendationDTO offerRecommendationDTO3 = new OASOfferRecommendationDTO();
        OASOfferRecommendationDTO offerRecommendationDTO4 = new OASOfferRecommendationDTO();

        System.assert(offerRecommendationDTO1.equals(offerRecommendationDTO2));
        System.assert(offerRecommendationDTO3.equals(offerRecommendationDTO4));
        System.assertEquals(offerRecommendationDTO1.hashCode(), offerRecommendationDTO2.hashCode());
        System.assertEquals(offerRecommendationDTO3.hashCode(), offerRecommendationDTO4.hashCode());
    }
}
