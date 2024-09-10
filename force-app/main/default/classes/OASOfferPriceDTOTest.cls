@isTest
private class OASOfferPriceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferPriceDTO offerPriceDTO1 = OASOfferPriceDTO.getExample();
        OASOfferPriceDTO offerPriceDTO2 = offerPriceDTO1;
        OASOfferPriceDTO offerPriceDTO3 = new OASOfferPriceDTO();
        OASOfferPriceDTO offerPriceDTO4 = offerPriceDTO3;

        System.assert(offerPriceDTO1.equals(offerPriceDTO2));
        System.assert(offerPriceDTO2.equals(offerPriceDTO1));
        System.assert(offerPriceDTO1.equals(offerPriceDTO1));
        System.assert(offerPriceDTO3.equals(offerPriceDTO4));
        System.assert(offerPriceDTO4.equals(offerPriceDTO3));
        System.assert(offerPriceDTO3.equals(offerPriceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferPriceDTO offerPriceDTO1 = OASOfferPriceDTO.getExample();
        OASOfferPriceDTO offerPriceDTO2 = OASOfferPriceDTO.getExample();
        OASOfferPriceDTO offerPriceDTO3 = new OASOfferPriceDTO();
        OASOfferPriceDTO offerPriceDTO4 = new OASOfferPriceDTO();

        System.assert(offerPriceDTO1.equals(offerPriceDTO2));
        System.assert(offerPriceDTO2.equals(offerPriceDTO1));
        System.assert(offerPriceDTO3.equals(offerPriceDTO4));
        System.assert(offerPriceDTO4.equals(offerPriceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferPriceDTO offerPriceDTO1 = OASOfferPriceDTO.getExample();
        OASOfferPriceDTO offerPriceDTO2 = new OASOfferPriceDTO();

        System.assertEquals(false, offerPriceDTO1.equals('foo'));
        System.assertEquals(false, offerPriceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferPriceDTO offerPriceDTO1 = OASOfferPriceDTO.getExample();
        OASOfferPriceDTO offerPriceDTO2 = new OASOfferPriceDTO();
        OASOfferPriceDTO offerPriceDTO3;

        System.assertEquals(false, offerPriceDTO1.equals(offerPriceDTO3));
        System.assertEquals(false, offerPriceDTO2.equals(offerPriceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferPriceDTO offerPriceDTO1 = OASOfferPriceDTO.getExample();
        OASOfferPriceDTO offerPriceDTO2 = new OASOfferPriceDTO();

        System.assertEquals(offerPriceDTO1.hashCode(), offerPriceDTO1.hashCode());
        System.assertEquals(offerPriceDTO2.hashCode(), offerPriceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferPriceDTO offerPriceDTO1 = OASOfferPriceDTO.getExample();
        OASOfferPriceDTO offerPriceDTO2 = OASOfferPriceDTO.getExample();
        OASOfferPriceDTO offerPriceDTO3 = new OASOfferPriceDTO();
        OASOfferPriceDTO offerPriceDTO4 = new OASOfferPriceDTO();

        System.assert(offerPriceDTO1.equals(offerPriceDTO2));
        System.assert(offerPriceDTO3.equals(offerPriceDTO4));
        System.assertEquals(offerPriceDTO1.hashCode(), offerPriceDTO2.hashCode());
        System.assertEquals(offerPriceDTO3.hashCode(), offerPriceDTO4.hashCode());
    }
}
