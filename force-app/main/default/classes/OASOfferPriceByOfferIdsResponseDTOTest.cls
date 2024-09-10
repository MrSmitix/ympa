@isTest
private class OASOfferPriceByOfferIdsResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO1 = OASOfferPriceByOfferIdsResponseDTO.getExample();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO2 = offerPriceByOfferIdsResponseDTO1;
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO3 = new OASOfferPriceByOfferIdsResponseDTO();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO4 = offerPriceByOfferIdsResponseDTO3;

        System.assert(offerPriceByOfferIdsResponseDTO1.equals(offerPriceByOfferIdsResponseDTO2));
        System.assert(offerPriceByOfferIdsResponseDTO2.equals(offerPriceByOfferIdsResponseDTO1));
        System.assert(offerPriceByOfferIdsResponseDTO1.equals(offerPriceByOfferIdsResponseDTO1));
        System.assert(offerPriceByOfferIdsResponseDTO3.equals(offerPriceByOfferIdsResponseDTO4));
        System.assert(offerPriceByOfferIdsResponseDTO4.equals(offerPriceByOfferIdsResponseDTO3));
        System.assert(offerPriceByOfferIdsResponseDTO3.equals(offerPriceByOfferIdsResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO1 = OASOfferPriceByOfferIdsResponseDTO.getExample();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO2 = OASOfferPriceByOfferIdsResponseDTO.getExample();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO3 = new OASOfferPriceByOfferIdsResponseDTO();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO4 = new OASOfferPriceByOfferIdsResponseDTO();

        System.assert(offerPriceByOfferIdsResponseDTO1.equals(offerPriceByOfferIdsResponseDTO2));
        System.assert(offerPriceByOfferIdsResponseDTO2.equals(offerPriceByOfferIdsResponseDTO1));
        System.assert(offerPriceByOfferIdsResponseDTO3.equals(offerPriceByOfferIdsResponseDTO4));
        System.assert(offerPriceByOfferIdsResponseDTO4.equals(offerPriceByOfferIdsResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO1 = OASOfferPriceByOfferIdsResponseDTO.getExample();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO2 = new OASOfferPriceByOfferIdsResponseDTO();

        System.assertEquals(false, offerPriceByOfferIdsResponseDTO1.equals('foo'));
        System.assertEquals(false, offerPriceByOfferIdsResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO1 = OASOfferPriceByOfferIdsResponseDTO.getExample();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO2 = new OASOfferPriceByOfferIdsResponseDTO();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO3;

        System.assertEquals(false, offerPriceByOfferIdsResponseDTO1.equals(offerPriceByOfferIdsResponseDTO3));
        System.assertEquals(false, offerPriceByOfferIdsResponseDTO2.equals(offerPriceByOfferIdsResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO1 = OASOfferPriceByOfferIdsResponseDTO.getExample();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO2 = new OASOfferPriceByOfferIdsResponseDTO();

        System.assertEquals(offerPriceByOfferIdsResponseDTO1.hashCode(), offerPriceByOfferIdsResponseDTO1.hashCode());
        System.assertEquals(offerPriceByOfferIdsResponseDTO2.hashCode(), offerPriceByOfferIdsResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO1 = OASOfferPriceByOfferIdsResponseDTO.getExample();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO2 = OASOfferPriceByOfferIdsResponseDTO.getExample();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO3 = new OASOfferPriceByOfferIdsResponseDTO();
        OASOfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO4 = new OASOfferPriceByOfferIdsResponseDTO();

        System.assert(offerPriceByOfferIdsResponseDTO1.equals(offerPriceByOfferIdsResponseDTO2));
        System.assert(offerPriceByOfferIdsResponseDTO3.equals(offerPriceByOfferIdsResponseDTO4));
        System.assertEquals(offerPriceByOfferIdsResponseDTO1.hashCode(), offerPriceByOfferIdsResponseDTO2.hashCode());
        System.assertEquals(offerPriceByOfferIdsResponseDTO3.hashCode(), offerPriceByOfferIdsResponseDTO4.hashCode());
    }
}
