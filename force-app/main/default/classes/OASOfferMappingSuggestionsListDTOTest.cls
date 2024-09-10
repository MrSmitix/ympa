@isTest
private class OASOfferMappingSuggestionsListDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO1 = OASOfferMappingSuggestionsListDTO.getExample();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO2 = offerMappingSuggestionsListDTO1;
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO3 = new OASOfferMappingSuggestionsListDTO();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO4 = offerMappingSuggestionsListDTO3;

        System.assert(offerMappingSuggestionsListDTO1.equals(offerMappingSuggestionsListDTO2));
        System.assert(offerMappingSuggestionsListDTO2.equals(offerMappingSuggestionsListDTO1));
        System.assert(offerMappingSuggestionsListDTO1.equals(offerMappingSuggestionsListDTO1));
        System.assert(offerMappingSuggestionsListDTO3.equals(offerMappingSuggestionsListDTO4));
        System.assert(offerMappingSuggestionsListDTO4.equals(offerMappingSuggestionsListDTO3));
        System.assert(offerMappingSuggestionsListDTO3.equals(offerMappingSuggestionsListDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO1 = OASOfferMappingSuggestionsListDTO.getExample();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO2 = OASOfferMappingSuggestionsListDTO.getExample();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO3 = new OASOfferMappingSuggestionsListDTO();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO4 = new OASOfferMappingSuggestionsListDTO();

        System.assert(offerMappingSuggestionsListDTO1.equals(offerMappingSuggestionsListDTO2));
        System.assert(offerMappingSuggestionsListDTO2.equals(offerMappingSuggestionsListDTO1));
        System.assert(offerMappingSuggestionsListDTO3.equals(offerMappingSuggestionsListDTO4));
        System.assert(offerMappingSuggestionsListDTO4.equals(offerMappingSuggestionsListDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO1 = OASOfferMappingSuggestionsListDTO.getExample();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO2 = new OASOfferMappingSuggestionsListDTO();

        System.assertEquals(false, offerMappingSuggestionsListDTO1.equals('foo'));
        System.assertEquals(false, offerMappingSuggestionsListDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO1 = OASOfferMappingSuggestionsListDTO.getExample();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO2 = new OASOfferMappingSuggestionsListDTO();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO3;

        System.assertEquals(false, offerMappingSuggestionsListDTO1.equals(offerMappingSuggestionsListDTO3));
        System.assertEquals(false, offerMappingSuggestionsListDTO2.equals(offerMappingSuggestionsListDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO1 = OASOfferMappingSuggestionsListDTO.getExample();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO2 = new OASOfferMappingSuggestionsListDTO();

        System.assertEquals(offerMappingSuggestionsListDTO1.hashCode(), offerMappingSuggestionsListDTO1.hashCode());
        System.assertEquals(offerMappingSuggestionsListDTO2.hashCode(), offerMappingSuggestionsListDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO1 = OASOfferMappingSuggestionsListDTO.getExample();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO2 = OASOfferMappingSuggestionsListDTO.getExample();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO3 = new OASOfferMappingSuggestionsListDTO();
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO4 = new OASOfferMappingSuggestionsListDTO();

        System.assert(offerMappingSuggestionsListDTO1.equals(offerMappingSuggestionsListDTO2));
        System.assert(offerMappingSuggestionsListDTO3.equals(offerMappingSuggestionsListDTO4));
        System.assertEquals(offerMappingSuggestionsListDTO1.hashCode(), offerMappingSuggestionsListDTO2.hashCode());
        System.assertEquals(offerMappingSuggestionsListDTO3.hashCode(), offerMappingSuggestionsListDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO = new OASOfferMappingSuggestionsListDTO();
        System.assertEquals(new List<OASEnrichedMappingsOfferDTO>(), offerMappingSuggestionsListDTO.offers);
    }
}
