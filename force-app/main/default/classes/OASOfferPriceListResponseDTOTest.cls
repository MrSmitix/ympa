@isTest
private class OASOfferPriceListResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferPriceListResponseDTO offerPriceListResponseDTO1 = OASOfferPriceListResponseDTO.getExample();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO2 = offerPriceListResponseDTO1;
        OASOfferPriceListResponseDTO offerPriceListResponseDTO3 = new OASOfferPriceListResponseDTO();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO4 = offerPriceListResponseDTO3;

        System.assert(offerPriceListResponseDTO1.equals(offerPriceListResponseDTO2));
        System.assert(offerPriceListResponseDTO2.equals(offerPriceListResponseDTO1));
        System.assert(offerPriceListResponseDTO1.equals(offerPriceListResponseDTO1));
        System.assert(offerPriceListResponseDTO3.equals(offerPriceListResponseDTO4));
        System.assert(offerPriceListResponseDTO4.equals(offerPriceListResponseDTO3));
        System.assert(offerPriceListResponseDTO3.equals(offerPriceListResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferPriceListResponseDTO offerPriceListResponseDTO1 = OASOfferPriceListResponseDTO.getExample();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO2 = OASOfferPriceListResponseDTO.getExample();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO3 = new OASOfferPriceListResponseDTO();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO4 = new OASOfferPriceListResponseDTO();

        System.assert(offerPriceListResponseDTO1.equals(offerPriceListResponseDTO2));
        System.assert(offerPriceListResponseDTO2.equals(offerPriceListResponseDTO1));
        System.assert(offerPriceListResponseDTO3.equals(offerPriceListResponseDTO4));
        System.assert(offerPriceListResponseDTO4.equals(offerPriceListResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferPriceListResponseDTO offerPriceListResponseDTO1 = OASOfferPriceListResponseDTO.getExample();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO2 = new OASOfferPriceListResponseDTO();

        System.assertEquals(false, offerPriceListResponseDTO1.equals('foo'));
        System.assertEquals(false, offerPriceListResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferPriceListResponseDTO offerPriceListResponseDTO1 = OASOfferPriceListResponseDTO.getExample();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO2 = new OASOfferPriceListResponseDTO();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO3;

        System.assertEquals(false, offerPriceListResponseDTO1.equals(offerPriceListResponseDTO3));
        System.assertEquals(false, offerPriceListResponseDTO2.equals(offerPriceListResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferPriceListResponseDTO offerPriceListResponseDTO1 = OASOfferPriceListResponseDTO.getExample();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO2 = new OASOfferPriceListResponseDTO();

        System.assertEquals(offerPriceListResponseDTO1.hashCode(), offerPriceListResponseDTO1.hashCode());
        System.assertEquals(offerPriceListResponseDTO2.hashCode(), offerPriceListResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferPriceListResponseDTO offerPriceListResponseDTO1 = OASOfferPriceListResponseDTO.getExample();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO2 = OASOfferPriceListResponseDTO.getExample();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO3 = new OASOfferPriceListResponseDTO();
        OASOfferPriceListResponseDTO offerPriceListResponseDTO4 = new OASOfferPriceListResponseDTO();

        System.assert(offerPriceListResponseDTO1.equals(offerPriceListResponseDTO2));
        System.assert(offerPriceListResponseDTO3.equals(offerPriceListResponseDTO4));
        System.assertEquals(offerPriceListResponseDTO1.hashCode(), offerPriceListResponseDTO2.hashCode());
        System.assertEquals(offerPriceListResponseDTO3.hashCode(), offerPriceListResponseDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferPriceListResponseDTO offerPriceListResponseDTO = new OASOfferPriceListResponseDTO();
        System.assertEquals(new List<OASOfferPriceResponseDTO>(), offerPriceListResponseDTO.offers);
        System.assertEquals(null, offerPriceListResponseDTO.paging);
        System.assertEquals(null, offerPriceListResponseDTO.total);
    }
}
