@isTest
private class OASOfferMappingInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferMappingInfoDTO offerMappingInfoDTO1 = OASOfferMappingInfoDTO.getExample();
        OASOfferMappingInfoDTO offerMappingInfoDTO2 = offerMappingInfoDTO1;
        OASOfferMappingInfoDTO offerMappingInfoDTO3 = new OASOfferMappingInfoDTO();
        OASOfferMappingInfoDTO offerMappingInfoDTO4 = offerMappingInfoDTO3;

        System.assert(offerMappingInfoDTO1.equals(offerMappingInfoDTO2));
        System.assert(offerMappingInfoDTO2.equals(offerMappingInfoDTO1));
        System.assert(offerMappingInfoDTO1.equals(offerMappingInfoDTO1));
        System.assert(offerMappingInfoDTO3.equals(offerMappingInfoDTO4));
        System.assert(offerMappingInfoDTO4.equals(offerMappingInfoDTO3));
        System.assert(offerMappingInfoDTO3.equals(offerMappingInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferMappingInfoDTO offerMappingInfoDTO1 = OASOfferMappingInfoDTO.getExample();
        OASOfferMappingInfoDTO offerMappingInfoDTO2 = OASOfferMappingInfoDTO.getExample();
        OASOfferMappingInfoDTO offerMappingInfoDTO3 = new OASOfferMappingInfoDTO();
        OASOfferMappingInfoDTO offerMappingInfoDTO4 = new OASOfferMappingInfoDTO();

        System.assert(offerMappingInfoDTO1.equals(offerMappingInfoDTO2));
        System.assert(offerMappingInfoDTO2.equals(offerMappingInfoDTO1));
        System.assert(offerMappingInfoDTO3.equals(offerMappingInfoDTO4));
        System.assert(offerMappingInfoDTO4.equals(offerMappingInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferMappingInfoDTO offerMappingInfoDTO1 = OASOfferMappingInfoDTO.getExample();
        OASOfferMappingInfoDTO offerMappingInfoDTO2 = new OASOfferMappingInfoDTO();

        System.assertEquals(false, offerMappingInfoDTO1.equals('foo'));
        System.assertEquals(false, offerMappingInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferMappingInfoDTO offerMappingInfoDTO1 = OASOfferMappingInfoDTO.getExample();
        OASOfferMappingInfoDTO offerMappingInfoDTO2 = new OASOfferMappingInfoDTO();
        OASOfferMappingInfoDTO offerMappingInfoDTO3;

        System.assertEquals(false, offerMappingInfoDTO1.equals(offerMappingInfoDTO3));
        System.assertEquals(false, offerMappingInfoDTO2.equals(offerMappingInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferMappingInfoDTO offerMappingInfoDTO1 = OASOfferMappingInfoDTO.getExample();
        OASOfferMappingInfoDTO offerMappingInfoDTO2 = new OASOfferMappingInfoDTO();

        System.assertEquals(offerMappingInfoDTO1.hashCode(), offerMappingInfoDTO1.hashCode());
        System.assertEquals(offerMappingInfoDTO2.hashCode(), offerMappingInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferMappingInfoDTO offerMappingInfoDTO1 = OASOfferMappingInfoDTO.getExample();
        OASOfferMappingInfoDTO offerMappingInfoDTO2 = OASOfferMappingInfoDTO.getExample();
        OASOfferMappingInfoDTO offerMappingInfoDTO3 = new OASOfferMappingInfoDTO();
        OASOfferMappingInfoDTO offerMappingInfoDTO4 = new OASOfferMappingInfoDTO();

        System.assert(offerMappingInfoDTO1.equals(offerMappingInfoDTO2));
        System.assert(offerMappingInfoDTO3.equals(offerMappingInfoDTO4));
        System.assertEquals(offerMappingInfoDTO1.hashCode(), offerMappingInfoDTO2.hashCode());
        System.assertEquals(offerMappingInfoDTO3.hashCode(), offerMappingInfoDTO4.hashCode());
    }
}
