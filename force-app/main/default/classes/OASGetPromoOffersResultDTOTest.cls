@isTest
private class OASGetPromoOffersResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoOffersResultDTO getPromoOffersResultDTO1 = OASGetPromoOffersResultDTO.getExample();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO2 = getPromoOffersResultDTO1;
        OASGetPromoOffersResultDTO getPromoOffersResultDTO3 = new OASGetPromoOffersResultDTO();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO4 = getPromoOffersResultDTO3;

        System.assert(getPromoOffersResultDTO1.equals(getPromoOffersResultDTO2));
        System.assert(getPromoOffersResultDTO2.equals(getPromoOffersResultDTO1));
        System.assert(getPromoOffersResultDTO1.equals(getPromoOffersResultDTO1));
        System.assert(getPromoOffersResultDTO3.equals(getPromoOffersResultDTO4));
        System.assert(getPromoOffersResultDTO4.equals(getPromoOffersResultDTO3));
        System.assert(getPromoOffersResultDTO3.equals(getPromoOffersResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoOffersResultDTO getPromoOffersResultDTO1 = OASGetPromoOffersResultDTO.getExample();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO2 = OASGetPromoOffersResultDTO.getExample();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO3 = new OASGetPromoOffersResultDTO();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO4 = new OASGetPromoOffersResultDTO();

        System.assert(getPromoOffersResultDTO1.equals(getPromoOffersResultDTO2));
        System.assert(getPromoOffersResultDTO2.equals(getPromoOffersResultDTO1));
        System.assert(getPromoOffersResultDTO3.equals(getPromoOffersResultDTO4));
        System.assert(getPromoOffersResultDTO4.equals(getPromoOffersResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoOffersResultDTO getPromoOffersResultDTO1 = OASGetPromoOffersResultDTO.getExample();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO2 = new OASGetPromoOffersResultDTO();

        System.assertEquals(false, getPromoOffersResultDTO1.equals('foo'));
        System.assertEquals(false, getPromoOffersResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoOffersResultDTO getPromoOffersResultDTO1 = OASGetPromoOffersResultDTO.getExample();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO2 = new OASGetPromoOffersResultDTO();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO3;

        System.assertEquals(false, getPromoOffersResultDTO1.equals(getPromoOffersResultDTO3));
        System.assertEquals(false, getPromoOffersResultDTO2.equals(getPromoOffersResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoOffersResultDTO getPromoOffersResultDTO1 = OASGetPromoOffersResultDTO.getExample();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO2 = new OASGetPromoOffersResultDTO();

        System.assertEquals(getPromoOffersResultDTO1.hashCode(), getPromoOffersResultDTO1.hashCode());
        System.assertEquals(getPromoOffersResultDTO2.hashCode(), getPromoOffersResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoOffersResultDTO getPromoOffersResultDTO1 = OASGetPromoOffersResultDTO.getExample();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO2 = OASGetPromoOffersResultDTO.getExample();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO3 = new OASGetPromoOffersResultDTO();
        OASGetPromoOffersResultDTO getPromoOffersResultDTO4 = new OASGetPromoOffersResultDTO();

        System.assert(getPromoOffersResultDTO1.equals(getPromoOffersResultDTO2));
        System.assert(getPromoOffersResultDTO3.equals(getPromoOffersResultDTO4));
        System.assertEquals(getPromoOffersResultDTO1.hashCode(), getPromoOffersResultDTO2.hashCode());
        System.assertEquals(getPromoOffersResultDTO3.hashCode(), getPromoOffersResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetPromoOffersResultDTO getPromoOffersResultDTO = new OASGetPromoOffersResultDTO();
        System.assertEquals(new List<OASGetPromoOfferDTO>(), getPromoOffersResultDTO.offers);
        System.assertEquals(null, getPromoOffersResultDTO.paging);
    }
}
