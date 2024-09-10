@isTest
private class OASGetCampaignOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignOfferDTO getCampaignOfferDTO1 = OASGetCampaignOfferDTO.getExample();
        OASGetCampaignOfferDTO getCampaignOfferDTO2 = getCampaignOfferDTO1;
        OASGetCampaignOfferDTO getCampaignOfferDTO3 = new OASGetCampaignOfferDTO();
        OASGetCampaignOfferDTO getCampaignOfferDTO4 = getCampaignOfferDTO3;

        System.assert(getCampaignOfferDTO1.equals(getCampaignOfferDTO2));
        System.assert(getCampaignOfferDTO2.equals(getCampaignOfferDTO1));
        System.assert(getCampaignOfferDTO1.equals(getCampaignOfferDTO1));
        System.assert(getCampaignOfferDTO3.equals(getCampaignOfferDTO4));
        System.assert(getCampaignOfferDTO4.equals(getCampaignOfferDTO3));
        System.assert(getCampaignOfferDTO3.equals(getCampaignOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignOfferDTO getCampaignOfferDTO1 = OASGetCampaignOfferDTO.getExample();
        OASGetCampaignOfferDTO getCampaignOfferDTO2 = OASGetCampaignOfferDTO.getExample();
        OASGetCampaignOfferDTO getCampaignOfferDTO3 = new OASGetCampaignOfferDTO();
        OASGetCampaignOfferDTO getCampaignOfferDTO4 = new OASGetCampaignOfferDTO();

        System.assert(getCampaignOfferDTO1.equals(getCampaignOfferDTO2));
        System.assert(getCampaignOfferDTO2.equals(getCampaignOfferDTO1));
        System.assert(getCampaignOfferDTO3.equals(getCampaignOfferDTO4));
        System.assert(getCampaignOfferDTO4.equals(getCampaignOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignOfferDTO getCampaignOfferDTO1 = OASGetCampaignOfferDTO.getExample();
        OASGetCampaignOfferDTO getCampaignOfferDTO2 = new OASGetCampaignOfferDTO();

        System.assertEquals(false, getCampaignOfferDTO1.equals('foo'));
        System.assertEquals(false, getCampaignOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignOfferDTO getCampaignOfferDTO1 = OASGetCampaignOfferDTO.getExample();
        OASGetCampaignOfferDTO getCampaignOfferDTO2 = new OASGetCampaignOfferDTO();
        OASGetCampaignOfferDTO getCampaignOfferDTO3;

        System.assertEquals(false, getCampaignOfferDTO1.equals(getCampaignOfferDTO3));
        System.assertEquals(false, getCampaignOfferDTO2.equals(getCampaignOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignOfferDTO getCampaignOfferDTO1 = OASGetCampaignOfferDTO.getExample();
        OASGetCampaignOfferDTO getCampaignOfferDTO2 = new OASGetCampaignOfferDTO();

        System.assertEquals(getCampaignOfferDTO1.hashCode(), getCampaignOfferDTO1.hashCode());
        System.assertEquals(getCampaignOfferDTO2.hashCode(), getCampaignOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignOfferDTO getCampaignOfferDTO1 = OASGetCampaignOfferDTO.getExample();
        OASGetCampaignOfferDTO getCampaignOfferDTO2 = OASGetCampaignOfferDTO.getExample();
        OASGetCampaignOfferDTO getCampaignOfferDTO3 = new OASGetCampaignOfferDTO();
        OASGetCampaignOfferDTO getCampaignOfferDTO4 = new OASGetCampaignOfferDTO();

        System.assert(getCampaignOfferDTO1.equals(getCampaignOfferDTO2));
        System.assert(getCampaignOfferDTO3.equals(getCampaignOfferDTO4));
        System.assertEquals(getCampaignOfferDTO1.hashCode(), getCampaignOfferDTO2.hashCode());
        System.assertEquals(getCampaignOfferDTO3.hashCode(), getCampaignOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetCampaignOfferDTO getCampaignOfferDTO = new OASGetCampaignOfferDTO();
        System.assertEquals(new List<OASOfferErrorDTO>(), getCampaignOfferDTO.errors);
        System.assertEquals(new List<OASOfferErrorDTO>(), getCampaignOfferDTO.warnings);
        System.assertEquals(null, getCampaignOfferDTO.offerId);
        System.assertEquals(null, getCampaignOfferDTO.quantum);
        System.assertEquals(null, getCampaignOfferDTO.available);
        System.assertEquals(null, getCampaignOfferDTO.basicPrice);
        System.assertEquals(null, getCampaignOfferDTO.campaignPrice);
        System.assertEquals(null, getCampaignOfferDTO.status);
    }
}
