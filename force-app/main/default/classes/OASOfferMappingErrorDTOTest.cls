@isTest
private class OASOfferMappingErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferMappingErrorDTO offerMappingErrorDTO1 = OASOfferMappingErrorDTO.getExample();
        OASOfferMappingErrorDTO offerMappingErrorDTO2 = offerMappingErrorDTO1;
        OASOfferMappingErrorDTO offerMappingErrorDTO3 = new OASOfferMappingErrorDTO();
        OASOfferMappingErrorDTO offerMappingErrorDTO4 = offerMappingErrorDTO3;

        System.assert(offerMappingErrorDTO1.equals(offerMappingErrorDTO2));
        System.assert(offerMappingErrorDTO2.equals(offerMappingErrorDTO1));
        System.assert(offerMappingErrorDTO1.equals(offerMappingErrorDTO1));
        System.assert(offerMappingErrorDTO3.equals(offerMappingErrorDTO4));
        System.assert(offerMappingErrorDTO4.equals(offerMappingErrorDTO3));
        System.assert(offerMappingErrorDTO3.equals(offerMappingErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferMappingErrorDTO offerMappingErrorDTO1 = OASOfferMappingErrorDTO.getExample();
        OASOfferMappingErrorDTO offerMappingErrorDTO2 = OASOfferMappingErrorDTO.getExample();
        OASOfferMappingErrorDTO offerMappingErrorDTO3 = new OASOfferMappingErrorDTO();
        OASOfferMappingErrorDTO offerMappingErrorDTO4 = new OASOfferMappingErrorDTO();

        System.assert(offerMappingErrorDTO1.equals(offerMappingErrorDTO2));
        System.assert(offerMappingErrorDTO2.equals(offerMappingErrorDTO1));
        System.assert(offerMappingErrorDTO3.equals(offerMappingErrorDTO4));
        System.assert(offerMappingErrorDTO4.equals(offerMappingErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferMappingErrorDTO offerMappingErrorDTO1 = OASOfferMappingErrorDTO.getExample();
        OASOfferMappingErrorDTO offerMappingErrorDTO2 = new OASOfferMappingErrorDTO();

        System.assertEquals(false, offerMappingErrorDTO1.equals('foo'));
        System.assertEquals(false, offerMappingErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferMappingErrorDTO offerMappingErrorDTO1 = OASOfferMappingErrorDTO.getExample();
        OASOfferMappingErrorDTO offerMappingErrorDTO2 = new OASOfferMappingErrorDTO();
        OASOfferMappingErrorDTO offerMappingErrorDTO3;

        System.assertEquals(false, offerMappingErrorDTO1.equals(offerMappingErrorDTO3));
        System.assertEquals(false, offerMappingErrorDTO2.equals(offerMappingErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferMappingErrorDTO offerMappingErrorDTO1 = OASOfferMappingErrorDTO.getExample();
        OASOfferMappingErrorDTO offerMappingErrorDTO2 = new OASOfferMappingErrorDTO();

        System.assertEquals(offerMappingErrorDTO1.hashCode(), offerMappingErrorDTO1.hashCode());
        System.assertEquals(offerMappingErrorDTO2.hashCode(), offerMappingErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferMappingErrorDTO offerMappingErrorDTO1 = OASOfferMappingErrorDTO.getExample();
        OASOfferMappingErrorDTO offerMappingErrorDTO2 = OASOfferMappingErrorDTO.getExample();
        OASOfferMappingErrorDTO offerMappingErrorDTO3 = new OASOfferMappingErrorDTO();
        OASOfferMappingErrorDTO offerMappingErrorDTO4 = new OASOfferMappingErrorDTO();

        System.assert(offerMappingErrorDTO1.equals(offerMappingErrorDTO2));
        System.assert(offerMappingErrorDTO3.equals(offerMappingErrorDTO4));
        System.assertEquals(offerMappingErrorDTO1.hashCode(), offerMappingErrorDTO2.hashCode());
        System.assertEquals(offerMappingErrorDTO3.hashCode(), offerMappingErrorDTO4.hashCode());
    }
}
