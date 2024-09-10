@isTest
private class OASPromoOfferParamsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromoOfferParamsDTO promoOfferParamsDTO1 = OASPromoOfferParamsDTO.getExample();
        OASPromoOfferParamsDTO promoOfferParamsDTO2 = promoOfferParamsDTO1;
        OASPromoOfferParamsDTO promoOfferParamsDTO3 = new OASPromoOfferParamsDTO();
        OASPromoOfferParamsDTO promoOfferParamsDTO4 = promoOfferParamsDTO3;

        System.assert(promoOfferParamsDTO1.equals(promoOfferParamsDTO2));
        System.assert(promoOfferParamsDTO2.equals(promoOfferParamsDTO1));
        System.assert(promoOfferParamsDTO1.equals(promoOfferParamsDTO1));
        System.assert(promoOfferParamsDTO3.equals(promoOfferParamsDTO4));
        System.assert(promoOfferParamsDTO4.equals(promoOfferParamsDTO3));
        System.assert(promoOfferParamsDTO3.equals(promoOfferParamsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromoOfferParamsDTO promoOfferParamsDTO1 = OASPromoOfferParamsDTO.getExample();
        OASPromoOfferParamsDTO promoOfferParamsDTO2 = OASPromoOfferParamsDTO.getExample();
        OASPromoOfferParamsDTO promoOfferParamsDTO3 = new OASPromoOfferParamsDTO();
        OASPromoOfferParamsDTO promoOfferParamsDTO4 = new OASPromoOfferParamsDTO();

        System.assert(promoOfferParamsDTO1.equals(promoOfferParamsDTO2));
        System.assert(promoOfferParamsDTO2.equals(promoOfferParamsDTO1));
        System.assert(promoOfferParamsDTO3.equals(promoOfferParamsDTO4));
        System.assert(promoOfferParamsDTO4.equals(promoOfferParamsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromoOfferParamsDTO promoOfferParamsDTO1 = OASPromoOfferParamsDTO.getExample();
        OASPromoOfferParamsDTO promoOfferParamsDTO2 = new OASPromoOfferParamsDTO();

        System.assertEquals(false, promoOfferParamsDTO1.equals('foo'));
        System.assertEquals(false, promoOfferParamsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromoOfferParamsDTO promoOfferParamsDTO1 = OASPromoOfferParamsDTO.getExample();
        OASPromoOfferParamsDTO promoOfferParamsDTO2 = new OASPromoOfferParamsDTO();
        OASPromoOfferParamsDTO promoOfferParamsDTO3;

        System.assertEquals(false, promoOfferParamsDTO1.equals(promoOfferParamsDTO3));
        System.assertEquals(false, promoOfferParamsDTO2.equals(promoOfferParamsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromoOfferParamsDTO promoOfferParamsDTO1 = OASPromoOfferParamsDTO.getExample();
        OASPromoOfferParamsDTO promoOfferParamsDTO2 = new OASPromoOfferParamsDTO();

        System.assertEquals(promoOfferParamsDTO1.hashCode(), promoOfferParamsDTO1.hashCode());
        System.assertEquals(promoOfferParamsDTO2.hashCode(), promoOfferParamsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromoOfferParamsDTO promoOfferParamsDTO1 = OASPromoOfferParamsDTO.getExample();
        OASPromoOfferParamsDTO promoOfferParamsDTO2 = OASPromoOfferParamsDTO.getExample();
        OASPromoOfferParamsDTO promoOfferParamsDTO3 = new OASPromoOfferParamsDTO();
        OASPromoOfferParamsDTO promoOfferParamsDTO4 = new OASPromoOfferParamsDTO();

        System.assert(promoOfferParamsDTO1.equals(promoOfferParamsDTO2));
        System.assert(promoOfferParamsDTO3.equals(promoOfferParamsDTO4));
        System.assertEquals(promoOfferParamsDTO1.hashCode(), promoOfferParamsDTO2.hashCode());
        System.assertEquals(promoOfferParamsDTO3.hashCode(), promoOfferParamsDTO4.hashCode());
    }
}
