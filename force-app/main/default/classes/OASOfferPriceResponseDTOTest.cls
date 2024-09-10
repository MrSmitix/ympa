@isTest
private class OASOfferPriceResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferPriceResponseDTO offerPriceResponseDTO1 = OASOfferPriceResponseDTO.getExample();
        OASOfferPriceResponseDTO offerPriceResponseDTO2 = offerPriceResponseDTO1;
        OASOfferPriceResponseDTO offerPriceResponseDTO3 = new OASOfferPriceResponseDTO();
        OASOfferPriceResponseDTO offerPriceResponseDTO4 = offerPriceResponseDTO3;

        System.assert(offerPriceResponseDTO1.equals(offerPriceResponseDTO2));
        System.assert(offerPriceResponseDTO2.equals(offerPriceResponseDTO1));
        System.assert(offerPriceResponseDTO1.equals(offerPriceResponseDTO1));
        System.assert(offerPriceResponseDTO3.equals(offerPriceResponseDTO4));
        System.assert(offerPriceResponseDTO4.equals(offerPriceResponseDTO3));
        System.assert(offerPriceResponseDTO3.equals(offerPriceResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferPriceResponseDTO offerPriceResponseDTO1 = OASOfferPriceResponseDTO.getExample();
        OASOfferPriceResponseDTO offerPriceResponseDTO2 = OASOfferPriceResponseDTO.getExample();
        OASOfferPriceResponseDTO offerPriceResponseDTO3 = new OASOfferPriceResponseDTO();
        OASOfferPriceResponseDTO offerPriceResponseDTO4 = new OASOfferPriceResponseDTO();

        System.assert(offerPriceResponseDTO1.equals(offerPriceResponseDTO2));
        System.assert(offerPriceResponseDTO2.equals(offerPriceResponseDTO1));
        System.assert(offerPriceResponseDTO3.equals(offerPriceResponseDTO4));
        System.assert(offerPriceResponseDTO4.equals(offerPriceResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferPriceResponseDTO offerPriceResponseDTO1 = OASOfferPriceResponseDTO.getExample();
        OASOfferPriceResponseDTO offerPriceResponseDTO2 = new OASOfferPriceResponseDTO();

        System.assertEquals(false, offerPriceResponseDTO1.equals('foo'));
        System.assertEquals(false, offerPriceResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferPriceResponseDTO offerPriceResponseDTO1 = OASOfferPriceResponseDTO.getExample();
        OASOfferPriceResponseDTO offerPriceResponseDTO2 = new OASOfferPriceResponseDTO();
        OASOfferPriceResponseDTO offerPriceResponseDTO3;

        System.assertEquals(false, offerPriceResponseDTO1.equals(offerPriceResponseDTO3));
        System.assertEquals(false, offerPriceResponseDTO2.equals(offerPriceResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferPriceResponseDTO offerPriceResponseDTO1 = OASOfferPriceResponseDTO.getExample();
        OASOfferPriceResponseDTO offerPriceResponseDTO2 = new OASOfferPriceResponseDTO();

        System.assertEquals(offerPriceResponseDTO1.hashCode(), offerPriceResponseDTO1.hashCode());
        System.assertEquals(offerPriceResponseDTO2.hashCode(), offerPriceResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferPriceResponseDTO offerPriceResponseDTO1 = OASOfferPriceResponseDTO.getExample();
        OASOfferPriceResponseDTO offerPriceResponseDTO2 = OASOfferPriceResponseDTO.getExample();
        OASOfferPriceResponseDTO offerPriceResponseDTO3 = new OASOfferPriceResponseDTO();
        OASOfferPriceResponseDTO offerPriceResponseDTO4 = new OASOfferPriceResponseDTO();

        System.assert(offerPriceResponseDTO1.equals(offerPriceResponseDTO2));
        System.assert(offerPriceResponseDTO3.equals(offerPriceResponseDTO4));
        System.assertEquals(offerPriceResponseDTO1.hashCode(), offerPriceResponseDTO2.hashCode());
        System.assertEquals(offerPriceResponseDTO3.hashCode(), offerPriceResponseDTO4.hashCode());
    }
}
