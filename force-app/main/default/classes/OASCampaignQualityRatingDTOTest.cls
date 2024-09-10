@isTest
private class OASCampaignQualityRatingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignQualityRatingDTO campaignQualityRatingDTO1 = OASCampaignQualityRatingDTO.getExample();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO2 = campaignQualityRatingDTO1;
        OASCampaignQualityRatingDTO campaignQualityRatingDTO3 = new OASCampaignQualityRatingDTO();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO4 = campaignQualityRatingDTO3;

        System.assert(campaignQualityRatingDTO1.equals(campaignQualityRatingDTO2));
        System.assert(campaignQualityRatingDTO2.equals(campaignQualityRatingDTO1));
        System.assert(campaignQualityRatingDTO1.equals(campaignQualityRatingDTO1));
        System.assert(campaignQualityRatingDTO3.equals(campaignQualityRatingDTO4));
        System.assert(campaignQualityRatingDTO4.equals(campaignQualityRatingDTO3));
        System.assert(campaignQualityRatingDTO3.equals(campaignQualityRatingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignQualityRatingDTO campaignQualityRatingDTO1 = OASCampaignQualityRatingDTO.getExample();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO2 = OASCampaignQualityRatingDTO.getExample();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO3 = new OASCampaignQualityRatingDTO();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO4 = new OASCampaignQualityRatingDTO();

        System.assert(campaignQualityRatingDTO1.equals(campaignQualityRatingDTO2));
        System.assert(campaignQualityRatingDTO2.equals(campaignQualityRatingDTO1));
        System.assert(campaignQualityRatingDTO3.equals(campaignQualityRatingDTO4));
        System.assert(campaignQualityRatingDTO4.equals(campaignQualityRatingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignQualityRatingDTO campaignQualityRatingDTO1 = OASCampaignQualityRatingDTO.getExample();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO2 = new OASCampaignQualityRatingDTO();

        System.assertEquals(false, campaignQualityRatingDTO1.equals('foo'));
        System.assertEquals(false, campaignQualityRatingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignQualityRatingDTO campaignQualityRatingDTO1 = OASCampaignQualityRatingDTO.getExample();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO2 = new OASCampaignQualityRatingDTO();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO3;

        System.assertEquals(false, campaignQualityRatingDTO1.equals(campaignQualityRatingDTO3));
        System.assertEquals(false, campaignQualityRatingDTO2.equals(campaignQualityRatingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignQualityRatingDTO campaignQualityRatingDTO1 = OASCampaignQualityRatingDTO.getExample();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO2 = new OASCampaignQualityRatingDTO();

        System.assertEquals(campaignQualityRatingDTO1.hashCode(), campaignQualityRatingDTO1.hashCode());
        System.assertEquals(campaignQualityRatingDTO2.hashCode(), campaignQualityRatingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignQualityRatingDTO campaignQualityRatingDTO1 = OASCampaignQualityRatingDTO.getExample();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO2 = OASCampaignQualityRatingDTO.getExample();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO3 = new OASCampaignQualityRatingDTO();
        OASCampaignQualityRatingDTO campaignQualityRatingDTO4 = new OASCampaignQualityRatingDTO();

        System.assert(campaignQualityRatingDTO1.equals(campaignQualityRatingDTO2));
        System.assert(campaignQualityRatingDTO3.equals(campaignQualityRatingDTO4));
        System.assertEquals(campaignQualityRatingDTO1.hashCode(), campaignQualityRatingDTO2.hashCode());
        System.assertEquals(campaignQualityRatingDTO3.hashCode(), campaignQualityRatingDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignQualityRatingDTO campaignQualityRatingDTO = new OASCampaignQualityRatingDTO();
        System.assertEquals(new List<OASQualityRatingDTO>(), campaignQualityRatingDTO.ratings);
        System.assertEquals(null, campaignQualityRatingDTO.campaignId);
    }
}
