@isTest
private class OASGetCampaignResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignResponse getCampaignResponse1 = OASGetCampaignResponse.getExample();
        OASGetCampaignResponse getCampaignResponse2 = getCampaignResponse1;
        OASGetCampaignResponse getCampaignResponse3 = new OASGetCampaignResponse();
        OASGetCampaignResponse getCampaignResponse4 = getCampaignResponse3;

        System.assert(getCampaignResponse1.equals(getCampaignResponse2));
        System.assert(getCampaignResponse2.equals(getCampaignResponse1));
        System.assert(getCampaignResponse1.equals(getCampaignResponse1));
        System.assert(getCampaignResponse3.equals(getCampaignResponse4));
        System.assert(getCampaignResponse4.equals(getCampaignResponse3));
        System.assert(getCampaignResponse3.equals(getCampaignResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignResponse getCampaignResponse1 = OASGetCampaignResponse.getExample();
        OASGetCampaignResponse getCampaignResponse2 = OASGetCampaignResponse.getExample();
        OASGetCampaignResponse getCampaignResponse3 = new OASGetCampaignResponse();
        OASGetCampaignResponse getCampaignResponse4 = new OASGetCampaignResponse();

        System.assert(getCampaignResponse1.equals(getCampaignResponse2));
        System.assert(getCampaignResponse2.equals(getCampaignResponse1));
        System.assert(getCampaignResponse3.equals(getCampaignResponse4));
        System.assert(getCampaignResponse4.equals(getCampaignResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignResponse getCampaignResponse1 = OASGetCampaignResponse.getExample();
        OASGetCampaignResponse getCampaignResponse2 = new OASGetCampaignResponse();

        System.assertEquals(false, getCampaignResponse1.equals('foo'));
        System.assertEquals(false, getCampaignResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignResponse getCampaignResponse1 = OASGetCampaignResponse.getExample();
        OASGetCampaignResponse getCampaignResponse2 = new OASGetCampaignResponse();
        OASGetCampaignResponse getCampaignResponse3;

        System.assertEquals(false, getCampaignResponse1.equals(getCampaignResponse3));
        System.assertEquals(false, getCampaignResponse2.equals(getCampaignResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignResponse getCampaignResponse1 = OASGetCampaignResponse.getExample();
        OASGetCampaignResponse getCampaignResponse2 = new OASGetCampaignResponse();

        System.assertEquals(getCampaignResponse1.hashCode(), getCampaignResponse1.hashCode());
        System.assertEquals(getCampaignResponse2.hashCode(), getCampaignResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignResponse getCampaignResponse1 = OASGetCampaignResponse.getExample();
        OASGetCampaignResponse getCampaignResponse2 = OASGetCampaignResponse.getExample();
        OASGetCampaignResponse getCampaignResponse3 = new OASGetCampaignResponse();
        OASGetCampaignResponse getCampaignResponse4 = new OASGetCampaignResponse();

        System.assert(getCampaignResponse1.equals(getCampaignResponse2));
        System.assert(getCampaignResponse3.equals(getCampaignResponse4));
        System.assertEquals(getCampaignResponse1.hashCode(), getCampaignResponse2.hashCode());
        System.assertEquals(getCampaignResponse3.hashCode(), getCampaignResponse4.hashCode());
    }
}
