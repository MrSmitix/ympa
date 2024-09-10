@isTest
private class OASCampaignSettingsScheduleDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO1 = OASCampaignSettingsScheduleDTO.getExample();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO2 = campaignSettingsScheduleDTO1;
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO3 = new OASCampaignSettingsScheduleDTO();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO4 = campaignSettingsScheduleDTO3;

        System.assert(campaignSettingsScheduleDTO1.equals(campaignSettingsScheduleDTO2));
        System.assert(campaignSettingsScheduleDTO2.equals(campaignSettingsScheduleDTO1));
        System.assert(campaignSettingsScheduleDTO1.equals(campaignSettingsScheduleDTO1));
        System.assert(campaignSettingsScheduleDTO3.equals(campaignSettingsScheduleDTO4));
        System.assert(campaignSettingsScheduleDTO4.equals(campaignSettingsScheduleDTO3));
        System.assert(campaignSettingsScheduleDTO3.equals(campaignSettingsScheduleDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO1 = OASCampaignSettingsScheduleDTO.getExample();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO2 = OASCampaignSettingsScheduleDTO.getExample();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO3 = new OASCampaignSettingsScheduleDTO();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO4 = new OASCampaignSettingsScheduleDTO();

        System.assert(campaignSettingsScheduleDTO1.equals(campaignSettingsScheduleDTO2));
        System.assert(campaignSettingsScheduleDTO2.equals(campaignSettingsScheduleDTO1));
        System.assert(campaignSettingsScheduleDTO3.equals(campaignSettingsScheduleDTO4));
        System.assert(campaignSettingsScheduleDTO4.equals(campaignSettingsScheduleDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO1 = OASCampaignSettingsScheduleDTO.getExample();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO2 = new OASCampaignSettingsScheduleDTO();

        System.assertEquals(false, campaignSettingsScheduleDTO1.equals('foo'));
        System.assertEquals(false, campaignSettingsScheduleDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO1 = OASCampaignSettingsScheduleDTO.getExample();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO2 = new OASCampaignSettingsScheduleDTO();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO3;

        System.assertEquals(false, campaignSettingsScheduleDTO1.equals(campaignSettingsScheduleDTO3));
        System.assertEquals(false, campaignSettingsScheduleDTO2.equals(campaignSettingsScheduleDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO1 = OASCampaignSettingsScheduleDTO.getExample();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO2 = new OASCampaignSettingsScheduleDTO();

        System.assertEquals(campaignSettingsScheduleDTO1.hashCode(), campaignSettingsScheduleDTO1.hashCode());
        System.assertEquals(campaignSettingsScheduleDTO2.hashCode(), campaignSettingsScheduleDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO1 = OASCampaignSettingsScheduleDTO.getExample();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO2 = OASCampaignSettingsScheduleDTO.getExample();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO3 = new OASCampaignSettingsScheduleDTO();
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO4 = new OASCampaignSettingsScheduleDTO();

        System.assert(campaignSettingsScheduleDTO1.equals(campaignSettingsScheduleDTO2));
        System.assert(campaignSettingsScheduleDTO3.equals(campaignSettingsScheduleDTO4));
        System.assertEquals(campaignSettingsScheduleDTO1.hashCode(), campaignSettingsScheduleDTO2.hashCode());
        System.assertEquals(campaignSettingsScheduleDTO3.hashCode(), campaignSettingsScheduleDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCampaignSettingsScheduleDTO campaignSettingsScheduleDTO = new OASCampaignSettingsScheduleDTO();
        System.assertEquals(new List<String>(), campaignSettingsScheduleDTO.customHolidays);
        System.assertEquals(new List<String>(), campaignSettingsScheduleDTO.customWorkingDays);
        System.assertEquals(new List<String>(), campaignSettingsScheduleDTO.totalHolidays);
        System.assertEquals(new List<Integer>(), campaignSettingsScheduleDTO.weeklyHolidays);
        System.assertEquals(null, campaignSettingsScheduleDTO.availableOnHolidays);
        System.assertEquals(null, campaignSettingsScheduleDTO.period);
    }
}
