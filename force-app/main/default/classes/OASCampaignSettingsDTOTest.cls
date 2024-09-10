@isTest
private class OASCampaignSettingsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignSettingsDTO campaignSettingsDTO1 = OASCampaignSettingsDTO.getExample();
        OASCampaignSettingsDTO campaignSettingsDTO2 = campaignSettingsDTO1;
        OASCampaignSettingsDTO campaignSettingsDTO3 = new OASCampaignSettingsDTO();
        OASCampaignSettingsDTO campaignSettingsDTO4 = campaignSettingsDTO3;

        System.assert(campaignSettingsDTO1.equals(campaignSettingsDTO2));
        System.assert(campaignSettingsDTO2.equals(campaignSettingsDTO1));
        System.assert(campaignSettingsDTO1.equals(campaignSettingsDTO1));
        System.assert(campaignSettingsDTO3.equals(campaignSettingsDTO4));
        System.assert(campaignSettingsDTO4.equals(campaignSettingsDTO3));
        System.assert(campaignSettingsDTO3.equals(campaignSettingsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignSettingsDTO campaignSettingsDTO1 = OASCampaignSettingsDTO.getExample();
        OASCampaignSettingsDTO campaignSettingsDTO2 = OASCampaignSettingsDTO.getExample();
        OASCampaignSettingsDTO campaignSettingsDTO3 = new OASCampaignSettingsDTO();
        OASCampaignSettingsDTO campaignSettingsDTO4 = new OASCampaignSettingsDTO();

        System.assert(campaignSettingsDTO1.equals(campaignSettingsDTO2));
        System.assert(campaignSettingsDTO2.equals(campaignSettingsDTO1));
        System.assert(campaignSettingsDTO3.equals(campaignSettingsDTO4));
        System.assert(campaignSettingsDTO4.equals(campaignSettingsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignSettingsDTO campaignSettingsDTO1 = OASCampaignSettingsDTO.getExample();
        OASCampaignSettingsDTO campaignSettingsDTO2 = new OASCampaignSettingsDTO();

        System.assertEquals(false, campaignSettingsDTO1.equals('foo'));
        System.assertEquals(false, campaignSettingsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignSettingsDTO campaignSettingsDTO1 = OASCampaignSettingsDTO.getExample();
        OASCampaignSettingsDTO campaignSettingsDTO2 = new OASCampaignSettingsDTO();
        OASCampaignSettingsDTO campaignSettingsDTO3;

        System.assertEquals(false, campaignSettingsDTO1.equals(campaignSettingsDTO3));
        System.assertEquals(false, campaignSettingsDTO2.equals(campaignSettingsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignSettingsDTO campaignSettingsDTO1 = OASCampaignSettingsDTO.getExample();
        OASCampaignSettingsDTO campaignSettingsDTO2 = new OASCampaignSettingsDTO();

        System.assertEquals(campaignSettingsDTO1.hashCode(), campaignSettingsDTO1.hashCode());
        System.assertEquals(campaignSettingsDTO2.hashCode(), campaignSettingsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignSettingsDTO campaignSettingsDTO1 = OASCampaignSettingsDTO.getExample();
        OASCampaignSettingsDTO campaignSettingsDTO2 = OASCampaignSettingsDTO.getExample();
        OASCampaignSettingsDTO campaignSettingsDTO3 = new OASCampaignSettingsDTO();
        OASCampaignSettingsDTO campaignSettingsDTO4 = new OASCampaignSettingsDTO();

        System.assert(campaignSettingsDTO1.equals(campaignSettingsDTO2));
        System.assert(campaignSettingsDTO3.equals(campaignSettingsDTO4));
        System.assertEquals(campaignSettingsDTO1.hashCode(), campaignSettingsDTO2.hashCode());
        System.assertEquals(campaignSettingsDTO3.hashCode(), campaignSettingsDTO4.hashCode());
    }
}
