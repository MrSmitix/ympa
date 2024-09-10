@isTest
private class OASOfferCardDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferCardDTO offerCardDTO1 = OASOfferCardDTO.getExample();
        OASOfferCardDTO offerCardDTO2 = offerCardDTO1;
        OASOfferCardDTO offerCardDTO3 = new OASOfferCardDTO();
        OASOfferCardDTO offerCardDTO4 = offerCardDTO3;

        System.assert(offerCardDTO1.equals(offerCardDTO2));
        System.assert(offerCardDTO2.equals(offerCardDTO1));
        System.assert(offerCardDTO1.equals(offerCardDTO1));
        System.assert(offerCardDTO3.equals(offerCardDTO4));
        System.assert(offerCardDTO4.equals(offerCardDTO3));
        System.assert(offerCardDTO3.equals(offerCardDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferCardDTO offerCardDTO1 = OASOfferCardDTO.getExample();
        OASOfferCardDTO offerCardDTO2 = OASOfferCardDTO.getExample();
        OASOfferCardDTO offerCardDTO3 = new OASOfferCardDTO();
        OASOfferCardDTO offerCardDTO4 = new OASOfferCardDTO();

        System.assert(offerCardDTO1.equals(offerCardDTO2));
        System.assert(offerCardDTO2.equals(offerCardDTO1));
        System.assert(offerCardDTO3.equals(offerCardDTO4));
        System.assert(offerCardDTO4.equals(offerCardDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferCardDTO offerCardDTO1 = OASOfferCardDTO.getExample();
        OASOfferCardDTO offerCardDTO2 = new OASOfferCardDTO();

        System.assertEquals(false, offerCardDTO1.equals('foo'));
        System.assertEquals(false, offerCardDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferCardDTO offerCardDTO1 = OASOfferCardDTO.getExample();
        OASOfferCardDTO offerCardDTO2 = new OASOfferCardDTO();
        OASOfferCardDTO offerCardDTO3;

        System.assertEquals(false, offerCardDTO1.equals(offerCardDTO3));
        System.assertEquals(false, offerCardDTO2.equals(offerCardDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferCardDTO offerCardDTO1 = OASOfferCardDTO.getExample();
        OASOfferCardDTO offerCardDTO2 = new OASOfferCardDTO();

        System.assertEquals(offerCardDTO1.hashCode(), offerCardDTO1.hashCode());
        System.assertEquals(offerCardDTO2.hashCode(), offerCardDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferCardDTO offerCardDTO1 = OASOfferCardDTO.getExample();
        OASOfferCardDTO offerCardDTO2 = OASOfferCardDTO.getExample();
        OASOfferCardDTO offerCardDTO3 = new OASOfferCardDTO();
        OASOfferCardDTO offerCardDTO4 = new OASOfferCardDTO();

        System.assert(offerCardDTO1.equals(offerCardDTO2));
        System.assert(offerCardDTO3.equals(offerCardDTO4));
        System.assertEquals(offerCardDTO1.hashCode(), offerCardDTO2.hashCode());
        System.assertEquals(offerCardDTO3.hashCode(), offerCardDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferCardDTO offerCardDTO = new OASOfferCardDTO();
        System.assertEquals(new List<OASParameterValueDTO>(), offerCardDTO.parameterValues);
        System.assertEquals(new List<OASOfferCardRecommendationDTO>(), offerCardDTO.recommendations);
        System.assertEquals(new List<OASOfferErrorDTO>(), offerCardDTO.errors);
        System.assertEquals(new List<OASOfferErrorDTO>(), offerCardDTO.warnings);
        System.assertEquals(null, offerCardDTO.offerId);
        System.assertEquals(null, offerCardDTO.mapping);
        System.assertEquals(null, offerCardDTO.cardStatus);
        System.assertEquals(null, offerCardDTO.contentRating);
    }
}
