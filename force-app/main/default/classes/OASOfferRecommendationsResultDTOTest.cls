@isTest
private class OASOfferRecommendationsResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO1 = OASOfferRecommendationsResultDTO.getExample();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO2 = offerRecommendationsResultDTO1;
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO3 = new OASOfferRecommendationsResultDTO();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO4 = offerRecommendationsResultDTO3;

        System.assert(offerRecommendationsResultDTO1.equals(offerRecommendationsResultDTO2));
        System.assert(offerRecommendationsResultDTO2.equals(offerRecommendationsResultDTO1));
        System.assert(offerRecommendationsResultDTO1.equals(offerRecommendationsResultDTO1));
        System.assert(offerRecommendationsResultDTO3.equals(offerRecommendationsResultDTO4));
        System.assert(offerRecommendationsResultDTO4.equals(offerRecommendationsResultDTO3));
        System.assert(offerRecommendationsResultDTO3.equals(offerRecommendationsResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO1 = OASOfferRecommendationsResultDTO.getExample();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO2 = OASOfferRecommendationsResultDTO.getExample();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO3 = new OASOfferRecommendationsResultDTO();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO4 = new OASOfferRecommendationsResultDTO();

        System.assert(offerRecommendationsResultDTO1.equals(offerRecommendationsResultDTO2));
        System.assert(offerRecommendationsResultDTO2.equals(offerRecommendationsResultDTO1));
        System.assert(offerRecommendationsResultDTO3.equals(offerRecommendationsResultDTO4));
        System.assert(offerRecommendationsResultDTO4.equals(offerRecommendationsResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO1 = OASOfferRecommendationsResultDTO.getExample();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO2 = new OASOfferRecommendationsResultDTO();

        System.assertEquals(false, offerRecommendationsResultDTO1.equals('foo'));
        System.assertEquals(false, offerRecommendationsResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO1 = OASOfferRecommendationsResultDTO.getExample();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO2 = new OASOfferRecommendationsResultDTO();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO3;

        System.assertEquals(false, offerRecommendationsResultDTO1.equals(offerRecommendationsResultDTO3));
        System.assertEquals(false, offerRecommendationsResultDTO2.equals(offerRecommendationsResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO1 = OASOfferRecommendationsResultDTO.getExample();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO2 = new OASOfferRecommendationsResultDTO();

        System.assertEquals(offerRecommendationsResultDTO1.hashCode(), offerRecommendationsResultDTO1.hashCode());
        System.assertEquals(offerRecommendationsResultDTO2.hashCode(), offerRecommendationsResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO1 = OASOfferRecommendationsResultDTO.getExample();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO2 = OASOfferRecommendationsResultDTO.getExample();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO3 = new OASOfferRecommendationsResultDTO();
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO4 = new OASOfferRecommendationsResultDTO();

        System.assert(offerRecommendationsResultDTO1.equals(offerRecommendationsResultDTO2));
        System.assert(offerRecommendationsResultDTO3.equals(offerRecommendationsResultDTO4));
        System.assertEquals(offerRecommendationsResultDTO1.hashCode(), offerRecommendationsResultDTO2.hashCode());
        System.assertEquals(offerRecommendationsResultDTO3.hashCode(), offerRecommendationsResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferRecommendationsResultDTO offerRecommendationsResultDTO = new OASOfferRecommendationsResultDTO();
        System.assertEquals(new List<OASOfferRecommendationDTO>(), offerRecommendationsResultDTO.offerRecommendations);
        System.assertEquals(null, offerRecommendationsResultDTO.paging);
    }
}
