@isTest
private class OASUpdatePromoOfferParamsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO1 = OASUpdatePromoOfferParamsDTO.getExample();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO2 = updatePromoOfferParamsDTO1;
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO3 = new OASUpdatePromoOfferParamsDTO();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO4 = updatePromoOfferParamsDTO3;

        System.assert(updatePromoOfferParamsDTO1.equals(updatePromoOfferParamsDTO2));
        System.assert(updatePromoOfferParamsDTO2.equals(updatePromoOfferParamsDTO1));
        System.assert(updatePromoOfferParamsDTO1.equals(updatePromoOfferParamsDTO1));
        System.assert(updatePromoOfferParamsDTO3.equals(updatePromoOfferParamsDTO4));
        System.assert(updatePromoOfferParamsDTO4.equals(updatePromoOfferParamsDTO3));
        System.assert(updatePromoOfferParamsDTO3.equals(updatePromoOfferParamsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO1 = OASUpdatePromoOfferParamsDTO.getExample();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO2 = OASUpdatePromoOfferParamsDTO.getExample();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO3 = new OASUpdatePromoOfferParamsDTO();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO4 = new OASUpdatePromoOfferParamsDTO();

        System.assert(updatePromoOfferParamsDTO1.equals(updatePromoOfferParamsDTO2));
        System.assert(updatePromoOfferParamsDTO2.equals(updatePromoOfferParamsDTO1));
        System.assert(updatePromoOfferParamsDTO3.equals(updatePromoOfferParamsDTO4));
        System.assert(updatePromoOfferParamsDTO4.equals(updatePromoOfferParamsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO1 = OASUpdatePromoOfferParamsDTO.getExample();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO2 = new OASUpdatePromoOfferParamsDTO();

        System.assertEquals(false, updatePromoOfferParamsDTO1.equals('foo'));
        System.assertEquals(false, updatePromoOfferParamsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO1 = OASUpdatePromoOfferParamsDTO.getExample();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO2 = new OASUpdatePromoOfferParamsDTO();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO3;

        System.assertEquals(false, updatePromoOfferParamsDTO1.equals(updatePromoOfferParamsDTO3));
        System.assertEquals(false, updatePromoOfferParamsDTO2.equals(updatePromoOfferParamsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO1 = OASUpdatePromoOfferParamsDTO.getExample();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO2 = new OASUpdatePromoOfferParamsDTO();

        System.assertEquals(updatePromoOfferParamsDTO1.hashCode(), updatePromoOfferParamsDTO1.hashCode());
        System.assertEquals(updatePromoOfferParamsDTO2.hashCode(), updatePromoOfferParamsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO1 = OASUpdatePromoOfferParamsDTO.getExample();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO2 = OASUpdatePromoOfferParamsDTO.getExample();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO3 = new OASUpdatePromoOfferParamsDTO();
        OASUpdatePromoOfferParamsDTO updatePromoOfferParamsDTO4 = new OASUpdatePromoOfferParamsDTO();

        System.assert(updatePromoOfferParamsDTO1.equals(updatePromoOfferParamsDTO2));
        System.assert(updatePromoOfferParamsDTO3.equals(updatePromoOfferParamsDTO4));
        System.assertEquals(updatePromoOfferParamsDTO1.hashCode(), updatePromoOfferParamsDTO2.hashCode());
        System.assertEquals(updatePromoOfferParamsDTO3.hashCode(), updatePromoOfferParamsDTO4.hashCode());
    }
}
