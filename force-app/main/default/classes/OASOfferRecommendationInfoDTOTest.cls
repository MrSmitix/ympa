@isTest
private class OASOfferRecommendationInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO1 = OASOfferRecommendationInfoDTO.getExample();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO2 = offerRecommendationInfoDTO1;
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO3 = new OASOfferRecommendationInfoDTO();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO4 = offerRecommendationInfoDTO3;

        System.assert(offerRecommendationInfoDTO1.equals(offerRecommendationInfoDTO2));
        System.assert(offerRecommendationInfoDTO2.equals(offerRecommendationInfoDTO1));
        System.assert(offerRecommendationInfoDTO1.equals(offerRecommendationInfoDTO1));
        System.assert(offerRecommendationInfoDTO3.equals(offerRecommendationInfoDTO4));
        System.assert(offerRecommendationInfoDTO4.equals(offerRecommendationInfoDTO3));
        System.assert(offerRecommendationInfoDTO3.equals(offerRecommendationInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO1 = OASOfferRecommendationInfoDTO.getExample();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO2 = OASOfferRecommendationInfoDTO.getExample();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO3 = new OASOfferRecommendationInfoDTO();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO4 = new OASOfferRecommendationInfoDTO();

        System.assert(offerRecommendationInfoDTO1.equals(offerRecommendationInfoDTO2));
        System.assert(offerRecommendationInfoDTO2.equals(offerRecommendationInfoDTO1));
        System.assert(offerRecommendationInfoDTO3.equals(offerRecommendationInfoDTO4));
        System.assert(offerRecommendationInfoDTO4.equals(offerRecommendationInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO1 = OASOfferRecommendationInfoDTO.getExample();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO2 = new OASOfferRecommendationInfoDTO();

        System.assertEquals(false, offerRecommendationInfoDTO1.equals('foo'));
        System.assertEquals(false, offerRecommendationInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO1 = OASOfferRecommendationInfoDTO.getExample();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO2 = new OASOfferRecommendationInfoDTO();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO3;

        System.assertEquals(false, offerRecommendationInfoDTO1.equals(offerRecommendationInfoDTO3));
        System.assertEquals(false, offerRecommendationInfoDTO2.equals(offerRecommendationInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO1 = OASOfferRecommendationInfoDTO.getExample();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO2 = new OASOfferRecommendationInfoDTO();

        System.assertEquals(offerRecommendationInfoDTO1.hashCode(), offerRecommendationInfoDTO1.hashCode());
        System.assertEquals(offerRecommendationInfoDTO2.hashCode(), offerRecommendationInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO1 = OASOfferRecommendationInfoDTO.getExample();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO2 = OASOfferRecommendationInfoDTO.getExample();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO3 = new OASOfferRecommendationInfoDTO();
        OASOfferRecommendationInfoDTO offerRecommendationInfoDTO4 = new OASOfferRecommendationInfoDTO();

        System.assert(offerRecommendationInfoDTO1.equals(offerRecommendationInfoDTO2));
        System.assert(offerRecommendationInfoDTO3.equals(offerRecommendationInfoDTO4));
        System.assertEquals(offerRecommendationInfoDTO1.hashCode(), offerRecommendationInfoDTO2.hashCode());
        System.assertEquals(offerRecommendationInfoDTO3.hashCode(), offerRecommendationInfoDTO4.hashCode());
    }
}
