@isTest
private class OASOfferCampaignStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferCampaignStatusType> expected = new Set<OASOfferCampaignStatusType>{
            OASOfferCampaignStatusType.PUBLISHED,
            OASOfferCampaignStatusType.CHECKING,
            OASOfferCampaignStatusType.DISABLED_BY_PARTNER,
            OASOfferCampaignStatusType.DISABLED_AUTOMATICALLY,
            OASOfferCampaignStatusType.REJECTED_BY_MARKET,
            OASOfferCampaignStatusType.CREATING_CARD,
            OASOfferCampaignStatusType.NO_CARD,
            OASOfferCampaignStatusType.NO_STOCKS,
            OASOfferCampaignStatusType.ARCHIVED
        };
        Set<OASOfferCampaignStatusType> actual  = new Set<OASOfferCampaignStatusType>(OASOfferCampaignStatusType.values());
        System.assertEquals(expected, actual);
    }
}
