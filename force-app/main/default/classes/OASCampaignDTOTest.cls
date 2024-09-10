@isTest
private class OASCampaignDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignDTO campaignDTO1 = OASCampaignDTO.getExample();
        OASCampaignDTO campaignDTO2 = campaignDTO1;
        OASCampaignDTO campaignDTO3 = new OASCampaignDTO();
        OASCampaignDTO campaignDTO4 = campaignDTO3;

        System.assert(campaignDTO1.equals(campaignDTO2));
        System.assert(campaignDTO2.equals(campaignDTO1));
        System.assert(campaignDTO1.equals(campaignDTO1));
        System.assert(campaignDTO3.equals(campaignDTO4));
        System.assert(campaignDTO4.equals(campaignDTO3));
        System.assert(campaignDTO3.equals(campaignDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignDTO campaignDTO1 = OASCampaignDTO.getExample();
        OASCampaignDTO campaignDTO2 = OASCampaignDTO.getExample();
        OASCampaignDTO campaignDTO3 = new OASCampaignDTO();
        OASCampaignDTO campaignDTO4 = new OASCampaignDTO();

        System.assert(campaignDTO1.equals(campaignDTO2));
        System.assert(campaignDTO2.equals(campaignDTO1));
        System.assert(campaignDTO3.equals(campaignDTO4));
        System.assert(campaignDTO4.equals(campaignDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignDTO campaignDTO1 = OASCampaignDTO.getExample();
        OASCampaignDTO campaignDTO2 = new OASCampaignDTO();

        System.assertEquals(false, campaignDTO1.equals('foo'));
        System.assertEquals(false, campaignDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignDTO campaignDTO1 = OASCampaignDTO.getExample();
        OASCampaignDTO campaignDTO2 = new OASCampaignDTO();
        OASCampaignDTO campaignDTO3;

        System.assertEquals(false, campaignDTO1.equals(campaignDTO3));
        System.assertEquals(false, campaignDTO2.equals(campaignDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignDTO campaignDTO1 = OASCampaignDTO.getExample();
        OASCampaignDTO campaignDTO2 = new OASCampaignDTO();

        System.assertEquals(campaignDTO1.hashCode(), campaignDTO1.hashCode());
        System.assertEquals(campaignDTO2.hashCode(), campaignDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignDTO campaignDTO1 = OASCampaignDTO.getExample();
        OASCampaignDTO campaignDTO2 = OASCampaignDTO.getExample();
        OASCampaignDTO campaignDTO3 = new OASCampaignDTO();
        OASCampaignDTO campaignDTO4 = new OASCampaignDTO();

        System.assert(campaignDTO1.equals(campaignDTO2));
        System.assert(campaignDTO3.equals(campaignDTO4));
        System.assertEquals(campaignDTO1.hashCode(), campaignDTO2.hashCode());
        System.assertEquals(campaignDTO3.hashCode(), campaignDTO4.hashCode());
    }
}
