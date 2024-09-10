@isTest
private class OASGetPromoOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoOfferDTO getPromoOfferDTO1 = OASGetPromoOfferDTO.getExample();
        OASGetPromoOfferDTO getPromoOfferDTO2 = getPromoOfferDTO1;
        OASGetPromoOfferDTO getPromoOfferDTO3 = new OASGetPromoOfferDTO();
        OASGetPromoOfferDTO getPromoOfferDTO4 = getPromoOfferDTO3;

        System.assert(getPromoOfferDTO1.equals(getPromoOfferDTO2));
        System.assert(getPromoOfferDTO2.equals(getPromoOfferDTO1));
        System.assert(getPromoOfferDTO1.equals(getPromoOfferDTO1));
        System.assert(getPromoOfferDTO3.equals(getPromoOfferDTO4));
        System.assert(getPromoOfferDTO4.equals(getPromoOfferDTO3));
        System.assert(getPromoOfferDTO3.equals(getPromoOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoOfferDTO getPromoOfferDTO1 = OASGetPromoOfferDTO.getExample();
        OASGetPromoOfferDTO getPromoOfferDTO2 = OASGetPromoOfferDTO.getExample();
        OASGetPromoOfferDTO getPromoOfferDTO3 = new OASGetPromoOfferDTO();
        OASGetPromoOfferDTO getPromoOfferDTO4 = new OASGetPromoOfferDTO();

        System.assert(getPromoOfferDTO1.equals(getPromoOfferDTO2));
        System.assert(getPromoOfferDTO2.equals(getPromoOfferDTO1));
        System.assert(getPromoOfferDTO3.equals(getPromoOfferDTO4));
        System.assert(getPromoOfferDTO4.equals(getPromoOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoOfferDTO getPromoOfferDTO1 = OASGetPromoOfferDTO.getExample();
        OASGetPromoOfferDTO getPromoOfferDTO2 = new OASGetPromoOfferDTO();

        System.assertEquals(false, getPromoOfferDTO1.equals('foo'));
        System.assertEquals(false, getPromoOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoOfferDTO getPromoOfferDTO1 = OASGetPromoOfferDTO.getExample();
        OASGetPromoOfferDTO getPromoOfferDTO2 = new OASGetPromoOfferDTO();
        OASGetPromoOfferDTO getPromoOfferDTO3;

        System.assertEquals(false, getPromoOfferDTO1.equals(getPromoOfferDTO3));
        System.assertEquals(false, getPromoOfferDTO2.equals(getPromoOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoOfferDTO getPromoOfferDTO1 = OASGetPromoOfferDTO.getExample();
        OASGetPromoOfferDTO getPromoOfferDTO2 = new OASGetPromoOfferDTO();

        System.assertEquals(getPromoOfferDTO1.hashCode(), getPromoOfferDTO1.hashCode());
        System.assertEquals(getPromoOfferDTO2.hashCode(), getPromoOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoOfferDTO getPromoOfferDTO1 = OASGetPromoOfferDTO.getExample();
        OASGetPromoOfferDTO getPromoOfferDTO2 = OASGetPromoOfferDTO.getExample();
        OASGetPromoOfferDTO getPromoOfferDTO3 = new OASGetPromoOfferDTO();
        OASGetPromoOfferDTO getPromoOfferDTO4 = new OASGetPromoOfferDTO();

        System.assert(getPromoOfferDTO1.equals(getPromoOfferDTO2));
        System.assert(getPromoOfferDTO3.equals(getPromoOfferDTO4));
        System.assertEquals(getPromoOfferDTO1.hashCode(), getPromoOfferDTO2.hashCode());
        System.assertEquals(getPromoOfferDTO3.hashCode(), getPromoOfferDTO4.hashCode());
    }
}
