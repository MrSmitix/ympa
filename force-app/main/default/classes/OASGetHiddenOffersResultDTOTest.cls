@isTest
private class OASGetHiddenOffersResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO1 = OASGetHiddenOffersResultDTO.getExample();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO2 = getHiddenOffersResultDTO1;
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO3 = new OASGetHiddenOffersResultDTO();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO4 = getHiddenOffersResultDTO3;

        System.assert(getHiddenOffersResultDTO1.equals(getHiddenOffersResultDTO2));
        System.assert(getHiddenOffersResultDTO2.equals(getHiddenOffersResultDTO1));
        System.assert(getHiddenOffersResultDTO1.equals(getHiddenOffersResultDTO1));
        System.assert(getHiddenOffersResultDTO3.equals(getHiddenOffersResultDTO4));
        System.assert(getHiddenOffersResultDTO4.equals(getHiddenOffersResultDTO3));
        System.assert(getHiddenOffersResultDTO3.equals(getHiddenOffersResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO1 = OASGetHiddenOffersResultDTO.getExample();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO2 = OASGetHiddenOffersResultDTO.getExample();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO3 = new OASGetHiddenOffersResultDTO();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO4 = new OASGetHiddenOffersResultDTO();

        System.assert(getHiddenOffersResultDTO1.equals(getHiddenOffersResultDTO2));
        System.assert(getHiddenOffersResultDTO2.equals(getHiddenOffersResultDTO1));
        System.assert(getHiddenOffersResultDTO3.equals(getHiddenOffersResultDTO4));
        System.assert(getHiddenOffersResultDTO4.equals(getHiddenOffersResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO1 = OASGetHiddenOffersResultDTO.getExample();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO2 = new OASGetHiddenOffersResultDTO();

        System.assertEquals(false, getHiddenOffersResultDTO1.equals('foo'));
        System.assertEquals(false, getHiddenOffersResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO1 = OASGetHiddenOffersResultDTO.getExample();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO2 = new OASGetHiddenOffersResultDTO();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO3;

        System.assertEquals(false, getHiddenOffersResultDTO1.equals(getHiddenOffersResultDTO3));
        System.assertEquals(false, getHiddenOffersResultDTO2.equals(getHiddenOffersResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO1 = OASGetHiddenOffersResultDTO.getExample();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO2 = new OASGetHiddenOffersResultDTO();

        System.assertEquals(getHiddenOffersResultDTO1.hashCode(), getHiddenOffersResultDTO1.hashCode());
        System.assertEquals(getHiddenOffersResultDTO2.hashCode(), getHiddenOffersResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO1 = OASGetHiddenOffersResultDTO.getExample();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO2 = OASGetHiddenOffersResultDTO.getExample();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO3 = new OASGetHiddenOffersResultDTO();
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO4 = new OASGetHiddenOffersResultDTO();

        System.assert(getHiddenOffersResultDTO1.equals(getHiddenOffersResultDTO2));
        System.assert(getHiddenOffersResultDTO3.equals(getHiddenOffersResultDTO4));
        System.assertEquals(getHiddenOffersResultDTO1.hashCode(), getHiddenOffersResultDTO2.hashCode());
        System.assertEquals(getHiddenOffersResultDTO3.hashCode(), getHiddenOffersResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetHiddenOffersResultDTO getHiddenOffersResultDTO = new OASGetHiddenOffersResultDTO();
        System.assertEquals(new List<OASHiddenOfferDTO>(), getHiddenOffersResultDTO.hiddenOffers);
        System.assertEquals(null, getHiddenOffersResultDTO.paging);
    }
}
