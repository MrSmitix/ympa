@isTest
private class OASOfferMappingEntriesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferMappingEntriesDTO offerMappingEntriesDTO1 = OASOfferMappingEntriesDTO.getExample();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO2 = offerMappingEntriesDTO1;
        OASOfferMappingEntriesDTO offerMappingEntriesDTO3 = new OASOfferMappingEntriesDTO();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO4 = offerMappingEntriesDTO3;

        System.assert(offerMappingEntriesDTO1.equals(offerMappingEntriesDTO2));
        System.assert(offerMappingEntriesDTO2.equals(offerMappingEntriesDTO1));
        System.assert(offerMappingEntriesDTO1.equals(offerMappingEntriesDTO1));
        System.assert(offerMappingEntriesDTO3.equals(offerMappingEntriesDTO4));
        System.assert(offerMappingEntriesDTO4.equals(offerMappingEntriesDTO3));
        System.assert(offerMappingEntriesDTO3.equals(offerMappingEntriesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferMappingEntriesDTO offerMappingEntriesDTO1 = OASOfferMappingEntriesDTO.getExample();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO2 = OASOfferMappingEntriesDTO.getExample();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO3 = new OASOfferMappingEntriesDTO();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO4 = new OASOfferMappingEntriesDTO();

        System.assert(offerMappingEntriesDTO1.equals(offerMappingEntriesDTO2));
        System.assert(offerMappingEntriesDTO2.equals(offerMappingEntriesDTO1));
        System.assert(offerMappingEntriesDTO3.equals(offerMappingEntriesDTO4));
        System.assert(offerMappingEntriesDTO4.equals(offerMappingEntriesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferMappingEntriesDTO offerMappingEntriesDTO1 = OASOfferMappingEntriesDTO.getExample();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO2 = new OASOfferMappingEntriesDTO();

        System.assertEquals(false, offerMappingEntriesDTO1.equals('foo'));
        System.assertEquals(false, offerMappingEntriesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferMappingEntriesDTO offerMappingEntriesDTO1 = OASOfferMappingEntriesDTO.getExample();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO2 = new OASOfferMappingEntriesDTO();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO3;

        System.assertEquals(false, offerMappingEntriesDTO1.equals(offerMappingEntriesDTO3));
        System.assertEquals(false, offerMappingEntriesDTO2.equals(offerMappingEntriesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferMappingEntriesDTO offerMappingEntriesDTO1 = OASOfferMappingEntriesDTO.getExample();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO2 = new OASOfferMappingEntriesDTO();

        System.assertEquals(offerMappingEntriesDTO1.hashCode(), offerMappingEntriesDTO1.hashCode());
        System.assertEquals(offerMappingEntriesDTO2.hashCode(), offerMappingEntriesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferMappingEntriesDTO offerMappingEntriesDTO1 = OASOfferMappingEntriesDTO.getExample();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO2 = OASOfferMappingEntriesDTO.getExample();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO3 = new OASOfferMappingEntriesDTO();
        OASOfferMappingEntriesDTO offerMappingEntriesDTO4 = new OASOfferMappingEntriesDTO();

        System.assert(offerMappingEntriesDTO1.equals(offerMappingEntriesDTO2));
        System.assert(offerMappingEntriesDTO3.equals(offerMappingEntriesDTO4));
        System.assertEquals(offerMappingEntriesDTO1.hashCode(), offerMappingEntriesDTO2.hashCode());
        System.assertEquals(offerMappingEntriesDTO3.hashCode(), offerMappingEntriesDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferMappingEntriesDTO offerMappingEntriesDTO = new OASOfferMappingEntriesDTO();
        System.assertEquals(new List<OASOfferMappingEntryDTO>(), offerMappingEntriesDTO.offerMappingEntries);
        System.assertEquals(null, offerMappingEntriesDTO.paging);
    }
}
