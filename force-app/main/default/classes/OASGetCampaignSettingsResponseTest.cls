@isTest
private class OASGetCampaignSettingsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignSettingsResponse getCampaignSettingsResponse1 = OASGetCampaignSettingsResponse.getExample();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse2 = getCampaignSettingsResponse1;
        OASGetCampaignSettingsResponse getCampaignSettingsResponse3 = new OASGetCampaignSettingsResponse();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse4 = getCampaignSettingsResponse3;

        System.assert(getCampaignSettingsResponse1.equals(getCampaignSettingsResponse2));
        System.assert(getCampaignSettingsResponse2.equals(getCampaignSettingsResponse1));
        System.assert(getCampaignSettingsResponse1.equals(getCampaignSettingsResponse1));
        System.assert(getCampaignSettingsResponse3.equals(getCampaignSettingsResponse4));
        System.assert(getCampaignSettingsResponse4.equals(getCampaignSettingsResponse3));
        System.assert(getCampaignSettingsResponse3.equals(getCampaignSettingsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignSettingsResponse getCampaignSettingsResponse1 = OASGetCampaignSettingsResponse.getExample();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse2 = OASGetCampaignSettingsResponse.getExample();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse3 = new OASGetCampaignSettingsResponse();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse4 = new OASGetCampaignSettingsResponse();

        System.assert(getCampaignSettingsResponse1.equals(getCampaignSettingsResponse2));
        System.assert(getCampaignSettingsResponse2.equals(getCampaignSettingsResponse1));
        System.assert(getCampaignSettingsResponse3.equals(getCampaignSettingsResponse4));
        System.assert(getCampaignSettingsResponse4.equals(getCampaignSettingsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignSettingsResponse getCampaignSettingsResponse1 = OASGetCampaignSettingsResponse.getExample();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse2 = new OASGetCampaignSettingsResponse();

        System.assertEquals(false, getCampaignSettingsResponse1.equals('foo'));
        System.assertEquals(false, getCampaignSettingsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignSettingsResponse getCampaignSettingsResponse1 = OASGetCampaignSettingsResponse.getExample();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse2 = new OASGetCampaignSettingsResponse();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse3;

        System.assertEquals(false, getCampaignSettingsResponse1.equals(getCampaignSettingsResponse3));
        System.assertEquals(false, getCampaignSettingsResponse2.equals(getCampaignSettingsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignSettingsResponse getCampaignSettingsResponse1 = OASGetCampaignSettingsResponse.getExample();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse2 = new OASGetCampaignSettingsResponse();

        System.assertEquals(getCampaignSettingsResponse1.hashCode(), getCampaignSettingsResponse1.hashCode());
        System.assertEquals(getCampaignSettingsResponse2.hashCode(), getCampaignSettingsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignSettingsResponse getCampaignSettingsResponse1 = OASGetCampaignSettingsResponse.getExample();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse2 = OASGetCampaignSettingsResponse.getExample();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse3 = new OASGetCampaignSettingsResponse();
        OASGetCampaignSettingsResponse getCampaignSettingsResponse4 = new OASGetCampaignSettingsResponse();

        System.assert(getCampaignSettingsResponse1.equals(getCampaignSettingsResponse2));
        System.assert(getCampaignSettingsResponse3.equals(getCampaignSettingsResponse4));
        System.assertEquals(getCampaignSettingsResponse1.hashCode(), getCampaignSettingsResponse2.hashCode());
        System.assertEquals(getCampaignSettingsResponse3.hashCode(), getCampaignSettingsResponse4.hashCode());
    }
}
