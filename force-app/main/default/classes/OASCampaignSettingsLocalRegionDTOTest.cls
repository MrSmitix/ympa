@isTest
private class OASCampaignSettingsLocalRegionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO1 = OASCampaignSettingsLocalRegionDTO.getExample();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO2 = campaignSettingsLocalRegionDTO1;
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO3 = new OASCampaignSettingsLocalRegionDTO();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO4 = campaignSettingsLocalRegionDTO3;

        System.assert(campaignSettingsLocalRegionDTO1.equals(campaignSettingsLocalRegionDTO2));
        System.assert(campaignSettingsLocalRegionDTO2.equals(campaignSettingsLocalRegionDTO1));
        System.assert(campaignSettingsLocalRegionDTO1.equals(campaignSettingsLocalRegionDTO1));
        System.assert(campaignSettingsLocalRegionDTO3.equals(campaignSettingsLocalRegionDTO4));
        System.assert(campaignSettingsLocalRegionDTO4.equals(campaignSettingsLocalRegionDTO3));
        System.assert(campaignSettingsLocalRegionDTO3.equals(campaignSettingsLocalRegionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO1 = OASCampaignSettingsLocalRegionDTO.getExample();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO2 = OASCampaignSettingsLocalRegionDTO.getExample();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO3 = new OASCampaignSettingsLocalRegionDTO();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO4 = new OASCampaignSettingsLocalRegionDTO();

        System.assert(campaignSettingsLocalRegionDTO1.equals(campaignSettingsLocalRegionDTO2));
        System.assert(campaignSettingsLocalRegionDTO2.equals(campaignSettingsLocalRegionDTO1));
        System.assert(campaignSettingsLocalRegionDTO3.equals(campaignSettingsLocalRegionDTO4));
        System.assert(campaignSettingsLocalRegionDTO4.equals(campaignSettingsLocalRegionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO1 = OASCampaignSettingsLocalRegionDTO.getExample();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO2 = new OASCampaignSettingsLocalRegionDTO();

        System.assertEquals(false, campaignSettingsLocalRegionDTO1.equals('foo'));
        System.assertEquals(false, campaignSettingsLocalRegionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO1 = OASCampaignSettingsLocalRegionDTO.getExample();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO2 = new OASCampaignSettingsLocalRegionDTO();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO3;

        System.assertEquals(false, campaignSettingsLocalRegionDTO1.equals(campaignSettingsLocalRegionDTO3));
        System.assertEquals(false, campaignSettingsLocalRegionDTO2.equals(campaignSettingsLocalRegionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO1 = OASCampaignSettingsLocalRegionDTO.getExample();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO2 = new OASCampaignSettingsLocalRegionDTO();

        System.assertEquals(campaignSettingsLocalRegionDTO1.hashCode(), campaignSettingsLocalRegionDTO1.hashCode());
        System.assertEquals(campaignSettingsLocalRegionDTO2.hashCode(), campaignSettingsLocalRegionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO1 = OASCampaignSettingsLocalRegionDTO.getExample();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO2 = OASCampaignSettingsLocalRegionDTO.getExample();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO3 = new OASCampaignSettingsLocalRegionDTO();
        OASCampaignSettingsLocalRegionDTO campaignSettingsLocalRegionDTO4 = new OASCampaignSettingsLocalRegionDTO();

        System.assert(campaignSettingsLocalRegionDTO1.equals(campaignSettingsLocalRegionDTO2));
        System.assert(campaignSettingsLocalRegionDTO3.equals(campaignSettingsLocalRegionDTO4));
        System.assertEquals(campaignSettingsLocalRegionDTO1.hashCode(), campaignSettingsLocalRegionDTO2.hashCode());
        System.assertEquals(campaignSettingsLocalRegionDTO3.hashCode(), campaignSettingsLocalRegionDTO4.hashCode());
    }
}
