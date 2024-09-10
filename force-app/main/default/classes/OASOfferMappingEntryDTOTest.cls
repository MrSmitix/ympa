@isTest
private class OASOfferMappingEntryDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferMappingEntryDTO offerMappingEntryDTO1 = OASOfferMappingEntryDTO.getExample();
        OASOfferMappingEntryDTO offerMappingEntryDTO2 = offerMappingEntryDTO1;
        OASOfferMappingEntryDTO offerMappingEntryDTO3 = new OASOfferMappingEntryDTO();
        OASOfferMappingEntryDTO offerMappingEntryDTO4 = offerMappingEntryDTO3;

        System.assert(offerMappingEntryDTO1.equals(offerMappingEntryDTO2));
        System.assert(offerMappingEntryDTO2.equals(offerMappingEntryDTO1));
        System.assert(offerMappingEntryDTO1.equals(offerMappingEntryDTO1));
        System.assert(offerMappingEntryDTO3.equals(offerMappingEntryDTO4));
        System.assert(offerMappingEntryDTO4.equals(offerMappingEntryDTO3));
        System.assert(offerMappingEntryDTO3.equals(offerMappingEntryDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferMappingEntryDTO offerMappingEntryDTO1 = OASOfferMappingEntryDTO.getExample();
        OASOfferMappingEntryDTO offerMappingEntryDTO2 = OASOfferMappingEntryDTO.getExample();
        OASOfferMappingEntryDTO offerMappingEntryDTO3 = new OASOfferMappingEntryDTO();
        OASOfferMappingEntryDTO offerMappingEntryDTO4 = new OASOfferMappingEntryDTO();

        System.assert(offerMappingEntryDTO1.equals(offerMappingEntryDTO2));
        System.assert(offerMappingEntryDTO2.equals(offerMappingEntryDTO1));
        System.assert(offerMappingEntryDTO3.equals(offerMappingEntryDTO4));
        System.assert(offerMappingEntryDTO4.equals(offerMappingEntryDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferMappingEntryDTO offerMappingEntryDTO1 = OASOfferMappingEntryDTO.getExample();
        OASOfferMappingEntryDTO offerMappingEntryDTO2 = new OASOfferMappingEntryDTO();

        System.assertEquals(false, offerMappingEntryDTO1.equals('foo'));
        System.assertEquals(false, offerMappingEntryDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferMappingEntryDTO offerMappingEntryDTO1 = OASOfferMappingEntryDTO.getExample();
        OASOfferMappingEntryDTO offerMappingEntryDTO2 = new OASOfferMappingEntryDTO();
        OASOfferMappingEntryDTO offerMappingEntryDTO3;

        System.assertEquals(false, offerMappingEntryDTO1.equals(offerMappingEntryDTO3));
        System.assertEquals(false, offerMappingEntryDTO2.equals(offerMappingEntryDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferMappingEntryDTO offerMappingEntryDTO1 = OASOfferMappingEntryDTO.getExample();
        OASOfferMappingEntryDTO offerMappingEntryDTO2 = new OASOfferMappingEntryDTO();

        System.assertEquals(offerMappingEntryDTO1.hashCode(), offerMappingEntryDTO1.hashCode());
        System.assertEquals(offerMappingEntryDTO2.hashCode(), offerMappingEntryDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferMappingEntryDTO offerMappingEntryDTO1 = OASOfferMappingEntryDTO.getExample();
        OASOfferMappingEntryDTO offerMappingEntryDTO2 = OASOfferMappingEntryDTO.getExample();
        OASOfferMappingEntryDTO offerMappingEntryDTO3 = new OASOfferMappingEntryDTO();
        OASOfferMappingEntryDTO offerMappingEntryDTO4 = new OASOfferMappingEntryDTO();

        System.assert(offerMappingEntryDTO1.equals(offerMappingEntryDTO2));
        System.assert(offerMappingEntryDTO3.equals(offerMappingEntryDTO4));
        System.assertEquals(offerMappingEntryDTO1.hashCode(), offerMappingEntryDTO2.hashCode());
        System.assertEquals(offerMappingEntryDTO3.hashCode(), offerMappingEntryDTO4.hashCode());
    }
}
