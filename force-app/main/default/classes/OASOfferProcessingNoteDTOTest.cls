@isTest
private class OASOfferProcessingNoteDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferProcessingNoteDTO offerProcessingNoteDTO1 = OASOfferProcessingNoteDTO.getExample();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO2 = offerProcessingNoteDTO1;
        OASOfferProcessingNoteDTO offerProcessingNoteDTO3 = new OASOfferProcessingNoteDTO();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO4 = offerProcessingNoteDTO3;

        System.assert(offerProcessingNoteDTO1.equals(offerProcessingNoteDTO2));
        System.assert(offerProcessingNoteDTO2.equals(offerProcessingNoteDTO1));
        System.assert(offerProcessingNoteDTO1.equals(offerProcessingNoteDTO1));
        System.assert(offerProcessingNoteDTO3.equals(offerProcessingNoteDTO4));
        System.assert(offerProcessingNoteDTO4.equals(offerProcessingNoteDTO3));
        System.assert(offerProcessingNoteDTO3.equals(offerProcessingNoteDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferProcessingNoteDTO offerProcessingNoteDTO1 = OASOfferProcessingNoteDTO.getExample();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO2 = OASOfferProcessingNoteDTO.getExample();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO3 = new OASOfferProcessingNoteDTO();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO4 = new OASOfferProcessingNoteDTO();

        System.assert(offerProcessingNoteDTO1.equals(offerProcessingNoteDTO2));
        System.assert(offerProcessingNoteDTO2.equals(offerProcessingNoteDTO1));
        System.assert(offerProcessingNoteDTO3.equals(offerProcessingNoteDTO4));
        System.assert(offerProcessingNoteDTO4.equals(offerProcessingNoteDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferProcessingNoteDTO offerProcessingNoteDTO1 = OASOfferProcessingNoteDTO.getExample();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO2 = new OASOfferProcessingNoteDTO();

        System.assertEquals(false, offerProcessingNoteDTO1.equals('foo'));
        System.assertEquals(false, offerProcessingNoteDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferProcessingNoteDTO offerProcessingNoteDTO1 = OASOfferProcessingNoteDTO.getExample();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO2 = new OASOfferProcessingNoteDTO();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO3;

        System.assertEquals(false, offerProcessingNoteDTO1.equals(offerProcessingNoteDTO3));
        System.assertEquals(false, offerProcessingNoteDTO2.equals(offerProcessingNoteDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferProcessingNoteDTO offerProcessingNoteDTO1 = OASOfferProcessingNoteDTO.getExample();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO2 = new OASOfferProcessingNoteDTO();

        System.assertEquals(offerProcessingNoteDTO1.hashCode(), offerProcessingNoteDTO1.hashCode());
        System.assertEquals(offerProcessingNoteDTO2.hashCode(), offerProcessingNoteDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferProcessingNoteDTO offerProcessingNoteDTO1 = OASOfferProcessingNoteDTO.getExample();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO2 = OASOfferProcessingNoteDTO.getExample();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO3 = new OASOfferProcessingNoteDTO();
        OASOfferProcessingNoteDTO offerProcessingNoteDTO4 = new OASOfferProcessingNoteDTO();

        System.assert(offerProcessingNoteDTO1.equals(offerProcessingNoteDTO2));
        System.assert(offerProcessingNoteDTO3.equals(offerProcessingNoteDTO4));
        System.assertEquals(offerProcessingNoteDTO1.hashCode(), offerProcessingNoteDTO2.hashCode());
        System.assertEquals(offerProcessingNoteDTO3.hashCode(), offerProcessingNoteDTO4.hashCode());
    }
}
