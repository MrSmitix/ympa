@isTest
private class OASOfferProcessingStateDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferProcessingStateDTO offerProcessingStateDTO1 = OASOfferProcessingStateDTO.getExample();
        OASOfferProcessingStateDTO offerProcessingStateDTO2 = offerProcessingStateDTO1;
        OASOfferProcessingStateDTO offerProcessingStateDTO3 = new OASOfferProcessingStateDTO();
        OASOfferProcessingStateDTO offerProcessingStateDTO4 = offerProcessingStateDTO3;

        System.assert(offerProcessingStateDTO1.equals(offerProcessingStateDTO2));
        System.assert(offerProcessingStateDTO2.equals(offerProcessingStateDTO1));
        System.assert(offerProcessingStateDTO1.equals(offerProcessingStateDTO1));
        System.assert(offerProcessingStateDTO3.equals(offerProcessingStateDTO4));
        System.assert(offerProcessingStateDTO4.equals(offerProcessingStateDTO3));
        System.assert(offerProcessingStateDTO3.equals(offerProcessingStateDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferProcessingStateDTO offerProcessingStateDTO1 = OASOfferProcessingStateDTO.getExample();
        OASOfferProcessingStateDTO offerProcessingStateDTO2 = OASOfferProcessingStateDTO.getExample();
        OASOfferProcessingStateDTO offerProcessingStateDTO3 = new OASOfferProcessingStateDTO();
        OASOfferProcessingStateDTO offerProcessingStateDTO4 = new OASOfferProcessingStateDTO();

        System.assert(offerProcessingStateDTO1.equals(offerProcessingStateDTO2));
        System.assert(offerProcessingStateDTO2.equals(offerProcessingStateDTO1));
        System.assert(offerProcessingStateDTO3.equals(offerProcessingStateDTO4));
        System.assert(offerProcessingStateDTO4.equals(offerProcessingStateDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferProcessingStateDTO offerProcessingStateDTO1 = OASOfferProcessingStateDTO.getExample();
        OASOfferProcessingStateDTO offerProcessingStateDTO2 = new OASOfferProcessingStateDTO();

        System.assertEquals(false, offerProcessingStateDTO1.equals('foo'));
        System.assertEquals(false, offerProcessingStateDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferProcessingStateDTO offerProcessingStateDTO1 = OASOfferProcessingStateDTO.getExample();
        OASOfferProcessingStateDTO offerProcessingStateDTO2 = new OASOfferProcessingStateDTO();
        OASOfferProcessingStateDTO offerProcessingStateDTO3;

        System.assertEquals(false, offerProcessingStateDTO1.equals(offerProcessingStateDTO3));
        System.assertEquals(false, offerProcessingStateDTO2.equals(offerProcessingStateDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferProcessingStateDTO offerProcessingStateDTO1 = OASOfferProcessingStateDTO.getExample();
        OASOfferProcessingStateDTO offerProcessingStateDTO2 = new OASOfferProcessingStateDTO();

        System.assertEquals(offerProcessingStateDTO1.hashCode(), offerProcessingStateDTO1.hashCode());
        System.assertEquals(offerProcessingStateDTO2.hashCode(), offerProcessingStateDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferProcessingStateDTO offerProcessingStateDTO1 = OASOfferProcessingStateDTO.getExample();
        OASOfferProcessingStateDTO offerProcessingStateDTO2 = OASOfferProcessingStateDTO.getExample();
        OASOfferProcessingStateDTO offerProcessingStateDTO3 = new OASOfferProcessingStateDTO();
        OASOfferProcessingStateDTO offerProcessingStateDTO4 = new OASOfferProcessingStateDTO();

        System.assert(offerProcessingStateDTO1.equals(offerProcessingStateDTO2));
        System.assert(offerProcessingStateDTO3.equals(offerProcessingStateDTO4));
        System.assertEquals(offerProcessingStateDTO1.hashCode(), offerProcessingStateDTO2.hashCode());
        System.assertEquals(offerProcessingStateDTO3.hashCode(), offerProcessingStateDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferProcessingStateDTO offerProcessingStateDTO = new OASOfferProcessingStateDTO();
        System.assertEquals(new List<OASOfferProcessingNoteDTO>(), offerProcessingStateDTO.notes);
        System.assertEquals(null, offerProcessingStateDTO.status);
    }
}
