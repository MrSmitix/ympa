@isTest
private class OASCampaignSettingsDeliveryDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO1 = OASCampaignSettingsDeliveryDTO.getExample();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO2 = campaignSettingsDeliveryDTO1;
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO3 = new OASCampaignSettingsDeliveryDTO();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO4 = campaignSettingsDeliveryDTO3;

        System.assert(campaignSettingsDeliveryDTO1.equals(campaignSettingsDeliveryDTO2));
        System.assert(campaignSettingsDeliveryDTO2.equals(campaignSettingsDeliveryDTO1));
        System.assert(campaignSettingsDeliveryDTO1.equals(campaignSettingsDeliveryDTO1));
        System.assert(campaignSettingsDeliveryDTO3.equals(campaignSettingsDeliveryDTO4));
        System.assert(campaignSettingsDeliveryDTO4.equals(campaignSettingsDeliveryDTO3));
        System.assert(campaignSettingsDeliveryDTO3.equals(campaignSettingsDeliveryDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO1 = OASCampaignSettingsDeliveryDTO.getExample();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO2 = OASCampaignSettingsDeliveryDTO.getExample();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO3 = new OASCampaignSettingsDeliveryDTO();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO4 = new OASCampaignSettingsDeliveryDTO();

        System.assert(campaignSettingsDeliveryDTO1.equals(campaignSettingsDeliveryDTO2));
        System.assert(campaignSettingsDeliveryDTO2.equals(campaignSettingsDeliveryDTO1));
        System.assert(campaignSettingsDeliveryDTO3.equals(campaignSettingsDeliveryDTO4));
        System.assert(campaignSettingsDeliveryDTO4.equals(campaignSettingsDeliveryDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO1 = OASCampaignSettingsDeliveryDTO.getExample();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO2 = new OASCampaignSettingsDeliveryDTO();

        System.assertEquals(false, campaignSettingsDeliveryDTO1.equals('foo'));
        System.assertEquals(false, campaignSettingsDeliveryDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO1 = OASCampaignSettingsDeliveryDTO.getExample();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO2 = new OASCampaignSettingsDeliveryDTO();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO3;

        System.assertEquals(false, campaignSettingsDeliveryDTO1.equals(campaignSettingsDeliveryDTO3));
        System.assertEquals(false, campaignSettingsDeliveryDTO2.equals(campaignSettingsDeliveryDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO1 = OASCampaignSettingsDeliveryDTO.getExample();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO2 = new OASCampaignSettingsDeliveryDTO();

        System.assertEquals(campaignSettingsDeliveryDTO1.hashCode(), campaignSettingsDeliveryDTO1.hashCode());
        System.assertEquals(campaignSettingsDeliveryDTO2.hashCode(), campaignSettingsDeliveryDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO1 = OASCampaignSettingsDeliveryDTO.getExample();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO2 = OASCampaignSettingsDeliveryDTO.getExample();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO3 = new OASCampaignSettingsDeliveryDTO();
        OASCampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO4 = new OASCampaignSettingsDeliveryDTO();

        System.assert(campaignSettingsDeliveryDTO1.equals(campaignSettingsDeliveryDTO2));
        System.assert(campaignSettingsDeliveryDTO3.equals(campaignSettingsDeliveryDTO4));
        System.assertEquals(campaignSettingsDeliveryDTO1.hashCode(), campaignSettingsDeliveryDTO2.hashCode());
        System.assertEquals(campaignSettingsDeliveryDTO3.hashCode(), campaignSettingsDeliveryDTO4.hashCode());
    }
}
