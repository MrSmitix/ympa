@isTest
private class OASGetCampaignRegionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignRegionResponse getCampaignRegionResponse1 = OASGetCampaignRegionResponse.getExample();
        OASGetCampaignRegionResponse getCampaignRegionResponse2 = getCampaignRegionResponse1;
        OASGetCampaignRegionResponse getCampaignRegionResponse3 = new OASGetCampaignRegionResponse();
        OASGetCampaignRegionResponse getCampaignRegionResponse4 = getCampaignRegionResponse3;

        System.assert(getCampaignRegionResponse1.equals(getCampaignRegionResponse2));
        System.assert(getCampaignRegionResponse2.equals(getCampaignRegionResponse1));
        System.assert(getCampaignRegionResponse1.equals(getCampaignRegionResponse1));
        System.assert(getCampaignRegionResponse3.equals(getCampaignRegionResponse4));
        System.assert(getCampaignRegionResponse4.equals(getCampaignRegionResponse3));
        System.assert(getCampaignRegionResponse3.equals(getCampaignRegionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignRegionResponse getCampaignRegionResponse1 = OASGetCampaignRegionResponse.getExample();
        OASGetCampaignRegionResponse getCampaignRegionResponse2 = OASGetCampaignRegionResponse.getExample();
        OASGetCampaignRegionResponse getCampaignRegionResponse3 = new OASGetCampaignRegionResponse();
        OASGetCampaignRegionResponse getCampaignRegionResponse4 = new OASGetCampaignRegionResponse();

        System.assert(getCampaignRegionResponse1.equals(getCampaignRegionResponse2));
        System.assert(getCampaignRegionResponse2.equals(getCampaignRegionResponse1));
        System.assert(getCampaignRegionResponse3.equals(getCampaignRegionResponse4));
        System.assert(getCampaignRegionResponse4.equals(getCampaignRegionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignRegionResponse getCampaignRegionResponse1 = OASGetCampaignRegionResponse.getExample();
        OASGetCampaignRegionResponse getCampaignRegionResponse2 = new OASGetCampaignRegionResponse();

        System.assertEquals(false, getCampaignRegionResponse1.equals('foo'));
        System.assertEquals(false, getCampaignRegionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignRegionResponse getCampaignRegionResponse1 = OASGetCampaignRegionResponse.getExample();
        OASGetCampaignRegionResponse getCampaignRegionResponse2 = new OASGetCampaignRegionResponse();
        OASGetCampaignRegionResponse getCampaignRegionResponse3;

        System.assertEquals(false, getCampaignRegionResponse1.equals(getCampaignRegionResponse3));
        System.assertEquals(false, getCampaignRegionResponse2.equals(getCampaignRegionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignRegionResponse getCampaignRegionResponse1 = OASGetCampaignRegionResponse.getExample();
        OASGetCampaignRegionResponse getCampaignRegionResponse2 = new OASGetCampaignRegionResponse();

        System.assertEquals(getCampaignRegionResponse1.hashCode(), getCampaignRegionResponse1.hashCode());
        System.assertEquals(getCampaignRegionResponse2.hashCode(), getCampaignRegionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignRegionResponse getCampaignRegionResponse1 = OASGetCampaignRegionResponse.getExample();
        OASGetCampaignRegionResponse getCampaignRegionResponse2 = OASGetCampaignRegionResponse.getExample();
        OASGetCampaignRegionResponse getCampaignRegionResponse3 = new OASGetCampaignRegionResponse();
        OASGetCampaignRegionResponse getCampaignRegionResponse4 = new OASGetCampaignRegionResponse();

        System.assert(getCampaignRegionResponse1.equals(getCampaignRegionResponse2));
        System.assert(getCampaignRegionResponse3.equals(getCampaignRegionResponse4));
        System.assertEquals(getCampaignRegionResponse1.hashCode(), getCampaignRegionResponse2.hashCode());
        System.assertEquals(getCampaignRegionResponse3.hashCode(), getCampaignRegionResponse4.hashCode());
    }
}
