@isTest
private class OASCampaignsQualityRatingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO1 = OASCampaignsQualityRatingDTO.getExample();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO2 = campaignsQualityRatingDTO1;
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO3 = new OASCampaignsQualityRatingDTO();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO4 = campaignsQualityRatingDTO3;

        System.assert(campaignsQualityRatingDTO1.equals(campaignsQualityRatingDTO2));
        System.assert(campaignsQualityRatingDTO2.equals(campaignsQualityRatingDTO1));
        System.assert(campaignsQualityRatingDTO1.equals(campaignsQualityRatingDTO1));
        System.assert(campaignsQualityRatingDTO3.equals(campaignsQualityRatingDTO4));
        System.assert(campaignsQualityRatingDTO4.equals(campaignsQualityRatingDTO3));
        System.assert(campaignsQualityRatingDTO3.equals(campaignsQualityRatingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO1 = OASCampaignsQualityRatingDTO.getExample();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO2 = OASCampaignsQualityRatingDTO.getExample();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO3 = new OASCampaignsQualityRatingDTO();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO4 = new OASCampaignsQualityRatingDTO();

        System.assert(campaignsQualityRatingDTO1.equals(campaignsQualityRatingDTO2));
        System.assert(campaignsQualityRatingDTO2.equals(campaignsQualityRatingDTO1));
        System.assert(campaignsQualityRatingDTO3.equals(campaignsQualityRatingDTO4));
        System.assert(campaignsQualityRatingDTO4.equals(campaignsQualityRatingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO1 = OASCampaignsQualityRatingDTO.getExample();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO2 = new OASCampaignsQualityRatingDTO();

        System.assertEquals(false, campaignsQualityRatingDTO1.equals('foo'));
        System.assertEquals(false, campaignsQualityRatingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO1 = OASCampaignsQualityRatingDTO.getExample();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO2 = new OASCampaignsQualityRatingDTO();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO3;

        System.assertEquals(false, campaignsQualityRatingDTO1.equals(campaignsQualityRatingDTO3));
        System.assertEquals(false, campaignsQualityRatingDTO2.equals(campaignsQualityRatingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO1 = OASCampaignsQualityRatingDTO.getExample();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO2 = new OASCampaignsQualityRatingDTO();

        System.assertEquals(campaignsQualityRatingDTO1.hashCode(), campaignsQualityRatingDTO1.hashCode());
        System.assertEquals(campaignsQualityRatingDTO2.hashCode(), campaignsQualityRatingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO1 = OASCampaignsQualityRatingDTO.getExample();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO2 = OASCampaignsQualityRatingDTO.getExample();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO3 = new OASCampaignsQualityRatingDTO();
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO4 = new OASCampaignsQualityRatingDTO();

        System.assert(campaignsQualityRatingDTO1.equals(campaignsQualityRatingDTO2));
        System.assert(campaignsQualityRatingDTO3.equals(campaignsQualityRatingDTO4));
        System.assertEquals(campaignsQualityRatingDTO1.hashCode(), campaignsQualityRatingDTO2.hashCode());
        System.assertEquals(campaignsQualityRatingDTO3.hashCode(), campaignsQualityRatingDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignsQualityRatingDTO campaignsQualityRatingDTO = new OASCampaignsQualityRatingDTO();
        System.assertEquals(new List<OASCampaignQualityRatingDTO>(), campaignsQualityRatingDTO.campaignRatings);
    }
}
