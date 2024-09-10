@isTest
private class OASGetCampaignLoginsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignLoginsResponse getCampaignLoginsResponse1 = OASGetCampaignLoginsResponse.getExample();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse2 = getCampaignLoginsResponse1;
        OASGetCampaignLoginsResponse getCampaignLoginsResponse3 = new OASGetCampaignLoginsResponse();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse4 = getCampaignLoginsResponse3;

        System.assert(getCampaignLoginsResponse1.equals(getCampaignLoginsResponse2));
        System.assert(getCampaignLoginsResponse2.equals(getCampaignLoginsResponse1));
        System.assert(getCampaignLoginsResponse1.equals(getCampaignLoginsResponse1));
        System.assert(getCampaignLoginsResponse3.equals(getCampaignLoginsResponse4));
        System.assert(getCampaignLoginsResponse4.equals(getCampaignLoginsResponse3));
        System.assert(getCampaignLoginsResponse3.equals(getCampaignLoginsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignLoginsResponse getCampaignLoginsResponse1 = OASGetCampaignLoginsResponse.getExample();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse2 = OASGetCampaignLoginsResponse.getExample();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse3 = new OASGetCampaignLoginsResponse();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse4 = new OASGetCampaignLoginsResponse();

        System.assert(getCampaignLoginsResponse1.equals(getCampaignLoginsResponse2));
        System.assert(getCampaignLoginsResponse2.equals(getCampaignLoginsResponse1));
        System.assert(getCampaignLoginsResponse3.equals(getCampaignLoginsResponse4));
        System.assert(getCampaignLoginsResponse4.equals(getCampaignLoginsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignLoginsResponse getCampaignLoginsResponse1 = OASGetCampaignLoginsResponse.getExample();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse2 = new OASGetCampaignLoginsResponse();

        System.assertEquals(false, getCampaignLoginsResponse1.equals('foo'));
        System.assertEquals(false, getCampaignLoginsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignLoginsResponse getCampaignLoginsResponse1 = OASGetCampaignLoginsResponse.getExample();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse2 = new OASGetCampaignLoginsResponse();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse3;

        System.assertEquals(false, getCampaignLoginsResponse1.equals(getCampaignLoginsResponse3));
        System.assertEquals(false, getCampaignLoginsResponse2.equals(getCampaignLoginsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignLoginsResponse getCampaignLoginsResponse1 = OASGetCampaignLoginsResponse.getExample();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse2 = new OASGetCampaignLoginsResponse();

        System.assertEquals(getCampaignLoginsResponse1.hashCode(), getCampaignLoginsResponse1.hashCode());
        System.assertEquals(getCampaignLoginsResponse2.hashCode(), getCampaignLoginsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignLoginsResponse getCampaignLoginsResponse1 = OASGetCampaignLoginsResponse.getExample();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse2 = OASGetCampaignLoginsResponse.getExample();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse3 = new OASGetCampaignLoginsResponse();
        OASGetCampaignLoginsResponse getCampaignLoginsResponse4 = new OASGetCampaignLoginsResponse();

        System.assert(getCampaignLoginsResponse1.equals(getCampaignLoginsResponse2));
        System.assert(getCampaignLoginsResponse3.equals(getCampaignLoginsResponse4));
        System.assertEquals(getCampaignLoginsResponse1.hashCode(), getCampaignLoginsResponse2.hashCode());
        System.assertEquals(getCampaignLoginsResponse3.hashCode(), getCampaignLoginsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetCampaignLoginsResponse getCampaignLoginsResponse = new OASGetCampaignLoginsResponse();
        System.assertEquals(new List<String>(), getCampaignLoginsResponse.logins);
    }
}
