@isTest
private class OASUpdatePromoOfferDiscountParamsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO1 = OASUpdatePromoOfferDiscountParamsDTO.getExample();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO2 = updatePromoOfferDiscountParamsDTO1;
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO3 = new OASUpdatePromoOfferDiscountParamsDTO();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO4 = updatePromoOfferDiscountParamsDTO3;

        System.assert(updatePromoOfferDiscountParamsDTO1.equals(updatePromoOfferDiscountParamsDTO2));
        System.assert(updatePromoOfferDiscountParamsDTO2.equals(updatePromoOfferDiscountParamsDTO1));
        System.assert(updatePromoOfferDiscountParamsDTO1.equals(updatePromoOfferDiscountParamsDTO1));
        System.assert(updatePromoOfferDiscountParamsDTO3.equals(updatePromoOfferDiscountParamsDTO4));
        System.assert(updatePromoOfferDiscountParamsDTO4.equals(updatePromoOfferDiscountParamsDTO3));
        System.assert(updatePromoOfferDiscountParamsDTO3.equals(updatePromoOfferDiscountParamsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO1 = OASUpdatePromoOfferDiscountParamsDTO.getExample();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO2 = OASUpdatePromoOfferDiscountParamsDTO.getExample();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO3 = new OASUpdatePromoOfferDiscountParamsDTO();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO4 = new OASUpdatePromoOfferDiscountParamsDTO();

        System.assert(updatePromoOfferDiscountParamsDTO1.equals(updatePromoOfferDiscountParamsDTO2));
        System.assert(updatePromoOfferDiscountParamsDTO2.equals(updatePromoOfferDiscountParamsDTO1));
        System.assert(updatePromoOfferDiscountParamsDTO3.equals(updatePromoOfferDiscountParamsDTO4));
        System.assert(updatePromoOfferDiscountParamsDTO4.equals(updatePromoOfferDiscountParamsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO1 = OASUpdatePromoOfferDiscountParamsDTO.getExample();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO2 = new OASUpdatePromoOfferDiscountParamsDTO();

        System.assertEquals(false, updatePromoOfferDiscountParamsDTO1.equals('foo'));
        System.assertEquals(false, updatePromoOfferDiscountParamsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO1 = OASUpdatePromoOfferDiscountParamsDTO.getExample();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO2 = new OASUpdatePromoOfferDiscountParamsDTO();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO3;

        System.assertEquals(false, updatePromoOfferDiscountParamsDTO1.equals(updatePromoOfferDiscountParamsDTO3));
        System.assertEquals(false, updatePromoOfferDiscountParamsDTO2.equals(updatePromoOfferDiscountParamsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO1 = OASUpdatePromoOfferDiscountParamsDTO.getExample();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO2 = new OASUpdatePromoOfferDiscountParamsDTO();

        System.assertEquals(updatePromoOfferDiscountParamsDTO1.hashCode(), updatePromoOfferDiscountParamsDTO1.hashCode());
        System.assertEquals(updatePromoOfferDiscountParamsDTO2.hashCode(), updatePromoOfferDiscountParamsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO1 = OASUpdatePromoOfferDiscountParamsDTO.getExample();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO2 = OASUpdatePromoOfferDiscountParamsDTO.getExample();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO3 = new OASUpdatePromoOfferDiscountParamsDTO();
        OASUpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO4 = new OASUpdatePromoOfferDiscountParamsDTO();

        System.assert(updatePromoOfferDiscountParamsDTO1.equals(updatePromoOfferDiscountParamsDTO2));
        System.assert(updatePromoOfferDiscountParamsDTO3.equals(updatePromoOfferDiscountParamsDTO4));
        System.assertEquals(updatePromoOfferDiscountParamsDTO1.hashCode(), updatePromoOfferDiscountParamsDTO2.hashCode());
        System.assertEquals(updatePromoOfferDiscountParamsDTO3.hashCode(), updatePromoOfferDiscountParamsDTO4.hashCode());
    }
}
