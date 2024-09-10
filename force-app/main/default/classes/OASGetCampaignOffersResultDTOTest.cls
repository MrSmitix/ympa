@isTest
private class OASGetCampaignOffersResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO1 = OASGetCampaignOffersResultDTO.getExample();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO2 = getCampaignOffersResultDTO1;
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO3 = new OASGetCampaignOffersResultDTO();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO4 = getCampaignOffersResultDTO3;

        System.assert(getCampaignOffersResultDTO1.equals(getCampaignOffersResultDTO2));
        System.assert(getCampaignOffersResultDTO2.equals(getCampaignOffersResultDTO1));
        System.assert(getCampaignOffersResultDTO1.equals(getCampaignOffersResultDTO1));
        System.assert(getCampaignOffersResultDTO3.equals(getCampaignOffersResultDTO4));
        System.assert(getCampaignOffersResultDTO4.equals(getCampaignOffersResultDTO3));
        System.assert(getCampaignOffersResultDTO3.equals(getCampaignOffersResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO1 = OASGetCampaignOffersResultDTO.getExample();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO2 = OASGetCampaignOffersResultDTO.getExample();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO3 = new OASGetCampaignOffersResultDTO();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO4 = new OASGetCampaignOffersResultDTO();

        System.assert(getCampaignOffersResultDTO1.equals(getCampaignOffersResultDTO2));
        System.assert(getCampaignOffersResultDTO2.equals(getCampaignOffersResultDTO1));
        System.assert(getCampaignOffersResultDTO3.equals(getCampaignOffersResultDTO4));
        System.assert(getCampaignOffersResultDTO4.equals(getCampaignOffersResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO1 = OASGetCampaignOffersResultDTO.getExample();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO2 = new OASGetCampaignOffersResultDTO();

        System.assertEquals(false, getCampaignOffersResultDTO1.equals('foo'));
        System.assertEquals(false, getCampaignOffersResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO1 = OASGetCampaignOffersResultDTO.getExample();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO2 = new OASGetCampaignOffersResultDTO();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO3;

        System.assertEquals(false, getCampaignOffersResultDTO1.equals(getCampaignOffersResultDTO3));
        System.assertEquals(false, getCampaignOffersResultDTO2.equals(getCampaignOffersResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO1 = OASGetCampaignOffersResultDTO.getExample();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO2 = new OASGetCampaignOffersResultDTO();

        System.assertEquals(getCampaignOffersResultDTO1.hashCode(), getCampaignOffersResultDTO1.hashCode());
        System.assertEquals(getCampaignOffersResultDTO2.hashCode(), getCampaignOffersResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO1 = OASGetCampaignOffersResultDTO.getExample();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO2 = OASGetCampaignOffersResultDTO.getExample();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO3 = new OASGetCampaignOffersResultDTO();
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO4 = new OASGetCampaignOffersResultDTO();

        System.assert(getCampaignOffersResultDTO1.equals(getCampaignOffersResultDTO2));
        System.assert(getCampaignOffersResultDTO3.equals(getCampaignOffersResultDTO4));
        System.assertEquals(getCampaignOffersResultDTO1.hashCode(), getCampaignOffersResultDTO2.hashCode());
        System.assertEquals(getCampaignOffersResultDTO3.hashCode(), getCampaignOffersResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetCampaignOffersResultDTO getCampaignOffersResultDTO = new OASGetCampaignOffersResultDTO();
        System.assertEquals(new List<OASGetCampaignOfferDTO>(), getCampaignOffersResultDTO.offers);
        System.assertEquals(null, getCampaignOffersResultDTO.paging);
    }
}
