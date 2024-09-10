@isTest
private class OASGetCampaignOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignOffersResponse getCampaignOffersResponse1 = OASGetCampaignOffersResponse.getExample();
        OASGetCampaignOffersResponse getCampaignOffersResponse2 = getCampaignOffersResponse1;
        OASGetCampaignOffersResponse getCampaignOffersResponse3 = new OASGetCampaignOffersResponse();
        OASGetCampaignOffersResponse getCampaignOffersResponse4 = getCampaignOffersResponse3;

        System.assert(getCampaignOffersResponse1.equals(getCampaignOffersResponse2));
        System.assert(getCampaignOffersResponse2.equals(getCampaignOffersResponse1));
        System.assert(getCampaignOffersResponse1.equals(getCampaignOffersResponse1));
        System.assert(getCampaignOffersResponse3.equals(getCampaignOffersResponse4));
        System.assert(getCampaignOffersResponse4.equals(getCampaignOffersResponse3));
        System.assert(getCampaignOffersResponse3.equals(getCampaignOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignOffersResponse getCampaignOffersResponse1 = OASGetCampaignOffersResponse.getExample();
        OASGetCampaignOffersResponse getCampaignOffersResponse2 = OASGetCampaignOffersResponse.getExample();
        OASGetCampaignOffersResponse getCampaignOffersResponse3 = new OASGetCampaignOffersResponse();
        OASGetCampaignOffersResponse getCampaignOffersResponse4 = new OASGetCampaignOffersResponse();

        System.assert(getCampaignOffersResponse1.equals(getCampaignOffersResponse2));
        System.assert(getCampaignOffersResponse2.equals(getCampaignOffersResponse1));
        System.assert(getCampaignOffersResponse3.equals(getCampaignOffersResponse4));
        System.assert(getCampaignOffersResponse4.equals(getCampaignOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignOffersResponse getCampaignOffersResponse1 = OASGetCampaignOffersResponse.getExample();
        OASGetCampaignOffersResponse getCampaignOffersResponse2 = new OASGetCampaignOffersResponse();

        System.assertEquals(false, getCampaignOffersResponse1.equals('foo'));
        System.assertEquals(false, getCampaignOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignOffersResponse getCampaignOffersResponse1 = OASGetCampaignOffersResponse.getExample();
        OASGetCampaignOffersResponse getCampaignOffersResponse2 = new OASGetCampaignOffersResponse();
        OASGetCampaignOffersResponse getCampaignOffersResponse3;

        System.assertEquals(false, getCampaignOffersResponse1.equals(getCampaignOffersResponse3));
        System.assertEquals(false, getCampaignOffersResponse2.equals(getCampaignOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignOffersResponse getCampaignOffersResponse1 = OASGetCampaignOffersResponse.getExample();
        OASGetCampaignOffersResponse getCampaignOffersResponse2 = new OASGetCampaignOffersResponse();

        System.assertEquals(getCampaignOffersResponse1.hashCode(), getCampaignOffersResponse1.hashCode());
        System.assertEquals(getCampaignOffersResponse2.hashCode(), getCampaignOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignOffersResponse getCampaignOffersResponse1 = OASGetCampaignOffersResponse.getExample();
        OASGetCampaignOffersResponse getCampaignOffersResponse2 = OASGetCampaignOffersResponse.getExample();
        OASGetCampaignOffersResponse getCampaignOffersResponse3 = new OASGetCampaignOffersResponse();
        OASGetCampaignOffersResponse getCampaignOffersResponse4 = new OASGetCampaignOffersResponse();

        System.assert(getCampaignOffersResponse1.equals(getCampaignOffersResponse2));
        System.assert(getCampaignOffersResponse3.equals(getCampaignOffersResponse4));
        System.assertEquals(getCampaignOffersResponse1.hashCode(), getCampaignOffersResponse2.hashCode());
        System.assertEquals(getCampaignOffersResponse3.hashCode(), getCampaignOffersResponse4.hashCode());
    }
}
