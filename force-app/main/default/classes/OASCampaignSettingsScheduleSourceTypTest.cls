@isTest
private class OASCampaignSettingsScheduleSourceTypTest {
    @isTest
    private static void allowableValues() {
        Set<OASCampaignSettingsScheduleSourceTyp> expected = new Set<OASCampaignSettingsScheduleSourceTyp>{
            OASCampaignSettingsScheduleSourceTyp.WEB,
            OASCampaignSettingsScheduleSourceTyp.YML
        };
        Set<OASCampaignSettingsScheduleSourceTyp> actual  = new Set<OASCampaignSettingsScheduleSourceTyp>(OASCampaignSettingsScheduleSourceTyp.values());
        System.assertEquals(expected, actual);
    }
}
