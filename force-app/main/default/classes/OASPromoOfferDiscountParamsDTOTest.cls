@isTest
private class OASPromoOfferDiscountParamsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO1 = OASPromoOfferDiscountParamsDTO.getExample();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO2 = promoOfferDiscountParamsDTO1;
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO3 = new OASPromoOfferDiscountParamsDTO();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO4 = promoOfferDiscountParamsDTO3;

        System.assert(promoOfferDiscountParamsDTO1.equals(promoOfferDiscountParamsDTO2));
        System.assert(promoOfferDiscountParamsDTO2.equals(promoOfferDiscountParamsDTO1));
        System.assert(promoOfferDiscountParamsDTO1.equals(promoOfferDiscountParamsDTO1));
        System.assert(promoOfferDiscountParamsDTO3.equals(promoOfferDiscountParamsDTO4));
        System.assert(promoOfferDiscountParamsDTO4.equals(promoOfferDiscountParamsDTO3));
        System.assert(promoOfferDiscountParamsDTO3.equals(promoOfferDiscountParamsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO1 = OASPromoOfferDiscountParamsDTO.getExample();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO2 = OASPromoOfferDiscountParamsDTO.getExample();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO3 = new OASPromoOfferDiscountParamsDTO();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO4 = new OASPromoOfferDiscountParamsDTO();

        System.assert(promoOfferDiscountParamsDTO1.equals(promoOfferDiscountParamsDTO2));
        System.assert(promoOfferDiscountParamsDTO2.equals(promoOfferDiscountParamsDTO1));
        System.assert(promoOfferDiscountParamsDTO3.equals(promoOfferDiscountParamsDTO4));
        System.assert(promoOfferDiscountParamsDTO4.equals(promoOfferDiscountParamsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO1 = OASPromoOfferDiscountParamsDTO.getExample();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO2 = new OASPromoOfferDiscountParamsDTO();

        System.assertEquals(false, promoOfferDiscountParamsDTO1.equals('foo'));
        System.assertEquals(false, promoOfferDiscountParamsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO1 = OASPromoOfferDiscountParamsDTO.getExample();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO2 = new OASPromoOfferDiscountParamsDTO();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO3;

        System.assertEquals(false, promoOfferDiscountParamsDTO1.equals(promoOfferDiscountParamsDTO3));
        System.assertEquals(false, promoOfferDiscountParamsDTO2.equals(promoOfferDiscountParamsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO1 = OASPromoOfferDiscountParamsDTO.getExample();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO2 = new OASPromoOfferDiscountParamsDTO();

        System.assertEquals(promoOfferDiscountParamsDTO1.hashCode(), promoOfferDiscountParamsDTO1.hashCode());
        System.assertEquals(promoOfferDiscountParamsDTO2.hashCode(), promoOfferDiscountParamsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO1 = OASPromoOfferDiscountParamsDTO.getExample();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO2 = OASPromoOfferDiscountParamsDTO.getExample();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO3 = new OASPromoOfferDiscountParamsDTO();
        OASPromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO4 = new OASPromoOfferDiscountParamsDTO();

        System.assert(promoOfferDiscountParamsDTO1.equals(promoOfferDiscountParamsDTO2));
        System.assert(promoOfferDiscountParamsDTO3.equals(promoOfferDiscountParamsDTO4));
        System.assertEquals(promoOfferDiscountParamsDTO1.hashCode(), promoOfferDiscountParamsDTO2.hashCode());
        System.assertEquals(promoOfferDiscountParamsDTO3.hashCode(), promoOfferDiscountParamsDTO4.hashCode());
    }
}
