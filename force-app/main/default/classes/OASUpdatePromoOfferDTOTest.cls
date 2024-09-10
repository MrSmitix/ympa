@isTest
private class OASUpdatePromoOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePromoOfferDTO updatePromoOfferDTO1 = OASUpdatePromoOfferDTO.getExample();
        OASUpdatePromoOfferDTO updatePromoOfferDTO2 = updatePromoOfferDTO1;
        OASUpdatePromoOfferDTO updatePromoOfferDTO3 = new OASUpdatePromoOfferDTO();
        OASUpdatePromoOfferDTO updatePromoOfferDTO4 = updatePromoOfferDTO3;

        System.assert(updatePromoOfferDTO1.equals(updatePromoOfferDTO2));
        System.assert(updatePromoOfferDTO2.equals(updatePromoOfferDTO1));
        System.assert(updatePromoOfferDTO1.equals(updatePromoOfferDTO1));
        System.assert(updatePromoOfferDTO3.equals(updatePromoOfferDTO4));
        System.assert(updatePromoOfferDTO4.equals(updatePromoOfferDTO3));
        System.assert(updatePromoOfferDTO3.equals(updatePromoOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePromoOfferDTO updatePromoOfferDTO1 = OASUpdatePromoOfferDTO.getExample();
        OASUpdatePromoOfferDTO updatePromoOfferDTO2 = OASUpdatePromoOfferDTO.getExample();
        OASUpdatePromoOfferDTO updatePromoOfferDTO3 = new OASUpdatePromoOfferDTO();
        OASUpdatePromoOfferDTO updatePromoOfferDTO4 = new OASUpdatePromoOfferDTO();

        System.assert(updatePromoOfferDTO1.equals(updatePromoOfferDTO2));
        System.assert(updatePromoOfferDTO2.equals(updatePromoOfferDTO1));
        System.assert(updatePromoOfferDTO3.equals(updatePromoOfferDTO4));
        System.assert(updatePromoOfferDTO4.equals(updatePromoOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePromoOfferDTO updatePromoOfferDTO1 = OASUpdatePromoOfferDTO.getExample();
        OASUpdatePromoOfferDTO updatePromoOfferDTO2 = new OASUpdatePromoOfferDTO();

        System.assertEquals(false, updatePromoOfferDTO1.equals('foo'));
        System.assertEquals(false, updatePromoOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePromoOfferDTO updatePromoOfferDTO1 = OASUpdatePromoOfferDTO.getExample();
        OASUpdatePromoOfferDTO updatePromoOfferDTO2 = new OASUpdatePromoOfferDTO();
        OASUpdatePromoOfferDTO updatePromoOfferDTO3;

        System.assertEquals(false, updatePromoOfferDTO1.equals(updatePromoOfferDTO3));
        System.assertEquals(false, updatePromoOfferDTO2.equals(updatePromoOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePromoOfferDTO updatePromoOfferDTO1 = OASUpdatePromoOfferDTO.getExample();
        OASUpdatePromoOfferDTO updatePromoOfferDTO2 = new OASUpdatePromoOfferDTO();

        System.assertEquals(updatePromoOfferDTO1.hashCode(), updatePromoOfferDTO1.hashCode());
        System.assertEquals(updatePromoOfferDTO2.hashCode(), updatePromoOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePromoOfferDTO updatePromoOfferDTO1 = OASUpdatePromoOfferDTO.getExample();
        OASUpdatePromoOfferDTO updatePromoOfferDTO2 = OASUpdatePromoOfferDTO.getExample();
        OASUpdatePromoOfferDTO updatePromoOfferDTO3 = new OASUpdatePromoOfferDTO();
        OASUpdatePromoOfferDTO updatePromoOfferDTO4 = new OASUpdatePromoOfferDTO();

        System.assert(updatePromoOfferDTO1.equals(updatePromoOfferDTO2));
        System.assert(updatePromoOfferDTO3.equals(updatePromoOfferDTO4));
        System.assertEquals(updatePromoOfferDTO1.hashCode(), updatePromoOfferDTO2.hashCode());
        System.assertEquals(updatePromoOfferDTO3.hashCode(), updatePromoOfferDTO4.hashCode());
    }
}
