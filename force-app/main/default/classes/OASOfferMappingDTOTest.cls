@isTest
private class OASOfferMappingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferMappingDTO offerMappingDTO1 = OASOfferMappingDTO.getExample();
        OASOfferMappingDTO offerMappingDTO2 = offerMappingDTO1;
        OASOfferMappingDTO offerMappingDTO3 = new OASOfferMappingDTO();
        OASOfferMappingDTO offerMappingDTO4 = offerMappingDTO3;

        System.assert(offerMappingDTO1.equals(offerMappingDTO2));
        System.assert(offerMappingDTO2.equals(offerMappingDTO1));
        System.assert(offerMappingDTO1.equals(offerMappingDTO1));
        System.assert(offerMappingDTO3.equals(offerMappingDTO4));
        System.assert(offerMappingDTO4.equals(offerMappingDTO3));
        System.assert(offerMappingDTO3.equals(offerMappingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferMappingDTO offerMappingDTO1 = OASOfferMappingDTO.getExample();
        OASOfferMappingDTO offerMappingDTO2 = OASOfferMappingDTO.getExample();
        OASOfferMappingDTO offerMappingDTO3 = new OASOfferMappingDTO();
        OASOfferMappingDTO offerMappingDTO4 = new OASOfferMappingDTO();

        System.assert(offerMappingDTO1.equals(offerMappingDTO2));
        System.assert(offerMappingDTO2.equals(offerMappingDTO1));
        System.assert(offerMappingDTO3.equals(offerMappingDTO4));
        System.assert(offerMappingDTO4.equals(offerMappingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferMappingDTO offerMappingDTO1 = OASOfferMappingDTO.getExample();
        OASOfferMappingDTO offerMappingDTO2 = new OASOfferMappingDTO();

        System.assertEquals(false, offerMappingDTO1.equals('foo'));
        System.assertEquals(false, offerMappingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferMappingDTO offerMappingDTO1 = OASOfferMappingDTO.getExample();
        OASOfferMappingDTO offerMappingDTO2 = new OASOfferMappingDTO();
        OASOfferMappingDTO offerMappingDTO3;

        System.assertEquals(false, offerMappingDTO1.equals(offerMappingDTO3));
        System.assertEquals(false, offerMappingDTO2.equals(offerMappingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferMappingDTO offerMappingDTO1 = OASOfferMappingDTO.getExample();
        OASOfferMappingDTO offerMappingDTO2 = new OASOfferMappingDTO();

        System.assertEquals(offerMappingDTO1.hashCode(), offerMappingDTO1.hashCode());
        System.assertEquals(offerMappingDTO2.hashCode(), offerMappingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferMappingDTO offerMappingDTO1 = OASOfferMappingDTO.getExample();
        OASOfferMappingDTO offerMappingDTO2 = OASOfferMappingDTO.getExample();
        OASOfferMappingDTO offerMappingDTO3 = new OASOfferMappingDTO();
        OASOfferMappingDTO offerMappingDTO4 = new OASOfferMappingDTO();

        System.assert(offerMappingDTO1.equals(offerMappingDTO2));
        System.assert(offerMappingDTO3.equals(offerMappingDTO4));
        System.assertEquals(offerMappingDTO1.hashCode(), offerMappingDTO2.hashCode());
        System.assertEquals(offerMappingDTO3.hashCode(), offerMappingDTO4.hashCode());
    }
}
