@isTest
private class OASPromoOfferPromocodeParamsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO1 = OASPromoOfferPromocodeParamsDTO.getExample();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO2 = promoOfferPromocodeParamsDTO1;
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO3 = new OASPromoOfferPromocodeParamsDTO();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO4 = promoOfferPromocodeParamsDTO3;

        System.assert(promoOfferPromocodeParamsDTO1.equals(promoOfferPromocodeParamsDTO2));
        System.assert(promoOfferPromocodeParamsDTO2.equals(promoOfferPromocodeParamsDTO1));
        System.assert(promoOfferPromocodeParamsDTO1.equals(promoOfferPromocodeParamsDTO1));
        System.assert(promoOfferPromocodeParamsDTO3.equals(promoOfferPromocodeParamsDTO4));
        System.assert(promoOfferPromocodeParamsDTO4.equals(promoOfferPromocodeParamsDTO3));
        System.assert(promoOfferPromocodeParamsDTO3.equals(promoOfferPromocodeParamsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO1 = OASPromoOfferPromocodeParamsDTO.getExample();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO2 = OASPromoOfferPromocodeParamsDTO.getExample();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO3 = new OASPromoOfferPromocodeParamsDTO();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO4 = new OASPromoOfferPromocodeParamsDTO();

        System.assert(promoOfferPromocodeParamsDTO1.equals(promoOfferPromocodeParamsDTO2));
        System.assert(promoOfferPromocodeParamsDTO2.equals(promoOfferPromocodeParamsDTO1));
        System.assert(promoOfferPromocodeParamsDTO3.equals(promoOfferPromocodeParamsDTO4));
        System.assert(promoOfferPromocodeParamsDTO4.equals(promoOfferPromocodeParamsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO1 = OASPromoOfferPromocodeParamsDTO.getExample();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO2 = new OASPromoOfferPromocodeParamsDTO();

        System.assertEquals(false, promoOfferPromocodeParamsDTO1.equals('foo'));
        System.assertEquals(false, promoOfferPromocodeParamsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO1 = OASPromoOfferPromocodeParamsDTO.getExample();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO2 = new OASPromoOfferPromocodeParamsDTO();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO3;

        System.assertEquals(false, promoOfferPromocodeParamsDTO1.equals(promoOfferPromocodeParamsDTO3));
        System.assertEquals(false, promoOfferPromocodeParamsDTO2.equals(promoOfferPromocodeParamsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO1 = OASPromoOfferPromocodeParamsDTO.getExample();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO2 = new OASPromoOfferPromocodeParamsDTO();

        System.assertEquals(promoOfferPromocodeParamsDTO1.hashCode(), promoOfferPromocodeParamsDTO1.hashCode());
        System.assertEquals(promoOfferPromocodeParamsDTO2.hashCode(), promoOfferPromocodeParamsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO1 = OASPromoOfferPromocodeParamsDTO.getExample();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO2 = OASPromoOfferPromocodeParamsDTO.getExample();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO3 = new OASPromoOfferPromocodeParamsDTO();
        OASPromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO4 = new OASPromoOfferPromocodeParamsDTO();

        System.assert(promoOfferPromocodeParamsDTO1.equals(promoOfferPromocodeParamsDTO2));
        System.assert(promoOfferPromocodeParamsDTO3.equals(promoOfferPromocodeParamsDTO4));
        System.assertEquals(promoOfferPromocodeParamsDTO1.hashCode(), promoOfferPromocodeParamsDTO2.hashCode());
        System.assertEquals(promoOfferPromocodeParamsDTO3.hashCode(), promoOfferPromocodeParamsDTO4.hashCode());
    }
}
