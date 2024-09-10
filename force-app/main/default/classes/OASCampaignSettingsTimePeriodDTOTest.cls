@isTest
private class OASCampaignSettingsTimePeriodDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO1 = OASCampaignSettingsTimePeriodDTO.getExample();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO2 = campaignSettingsTimePeriodDTO1;
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO3 = new OASCampaignSettingsTimePeriodDTO();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO4 = campaignSettingsTimePeriodDTO3;

        System.assert(campaignSettingsTimePeriodDTO1.equals(campaignSettingsTimePeriodDTO2));
        System.assert(campaignSettingsTimePeriodDTO2.equals(campaignSettingsTimePeriodDTO1));
        System.assert(campaignSettingsTimePeriodDTO1.equals(campaignSettingsTimePeriodDTO1));
        System.assert(campaignSettingsTimePeriodDTO3.equals(campaignSettingsTimePeriodDTO4));
        System.assert(campaignSettingsTimePeriodDTO4.equals(campaignSettingsTimePeriodDTO3));
        System.assert(campaignSettingsTimePeriodDTO3.equals(campaignSettingsTimePeriodDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO1 = OASCampaignSettingsTimePeriodDTO.getExample();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO2 = OASCampaignSettingsTimePeriodDTO.getExample();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO3 = new OASCampaignSettingsTimePeriodDTO();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO4 = new OASCampaignSettingsTimePeriodDTO();

        System.assert(campaignSettingsTimePeriodDTO1.equals(campaignSettingsTimePeriodDTO2));
        System.assert(campaignSettingsTimePeriodDTO2.equals(campaignSettingsTimePeriodDTO1));
        System.assert(campaignSettingsTimePeriodDTO3.equals(campaignSettingsTimePeriodDTO4));
        System.assert(campaignSettingsTimePeriodDTO4.equals(campaignSettingsTimePeriodDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO1 = OASCampaignSettingsTimePeriodDTO.getExample();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO2 = new OASCampaignSettingsTimePeriodDTO();

        System.assertEquals(false, campaignSettingsTimePeriodDTO1.equals('foo'));
        System.assertEquals(false, campaignSettingsTimePeriodDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO1 = OASCampaignSettingsTimePeriodDTO.getExample();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO2 = new OASCampaignSettingsTimePeriodDTO();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO3;

        System.assertEquals(false, campaignSettingsTimePeriodDTO1.equals(campaignSettingsTimePeriodDTO3));
        System.assertEquals(false, campaignSettingsTimePeriodDTO2.equals(campaignSettingsTimePeriodDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO1 = OASCampaignSettingsTimePeriodDTO.getExample();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO2 = new OASCampaignSettingsTimePeriodDTO();

        System.assertEquals(campaignSettingsTimePeriodDTO1.hashCode(), campaignSettingsTimePeriodDTO1.hashCode());
        System.assertEquals(campaignSettingsTimePeriodDTO2.hashCode(), campaignSettingsTimePeriodDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO1 = OASCampaignSettingsTimePeriodDTO.getExample();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO2 = OASCampaignSettingsTimePeriodDTO.getExample();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO3 = new OASCampaignSettingsTimePeriodDTO();
        OASCampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO4 = new OASCampaignSettingsTimePeriodDTO();

        System.assert(campaignSettingsTimePeriodDTO1.equals(campaignSettingsTimePeriodDTO2));
        System.assert(campaignSettingsTimePeriodDTO3.equals(campaignSettingsTimePeriodDTO4));
        System.assertEquals(campaignSettingsTimePeriodDTO1.hashCode(), campaignSettingsTimePeriodDTO2.hashCode());
        System.assertEquals(campaignSettingsTimePeriodDTO3.hashCode(), campaignSettingsTimePeriodDTO4.hashCode());
    }
}
