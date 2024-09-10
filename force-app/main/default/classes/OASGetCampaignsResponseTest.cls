@isTest
private class OASGetCampaignsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignsResponse getCampaignsResponse1 = OASGetCampaignsResponse.getExample();
        OASGetCampaignsResponse getCampaignsResponse2 = getCampaignsResponse1;
        OASGetCampaignsResponse getCampaignsResponse3 = new OASGetCampaignsResponse();
        OASGetCampaignsResponse getCampaignsResponse4 = getCampaignsResponse3;

        System.assert(getCampaignsResponse1.equals(getCampaignsResponse2));
        System.assert(getCampaignsResponse2.equals(getCampaignsResponse1));
        System.assert(getCampaignsResponse1.equals(getCampaignsResponse1));
        System.assert(getCampaignsResponse3.equals(getCampaignsResponse4));
        System.assert(getCampaignsResponse4.equals(getCampaignsResponse3));
        System.assert(getCampaignsResponse3.equals(getCampaignsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignsResponse getCampaignsResponse1 = OASGetCampaignsResponse.getExample();
        OASGetCampaignsResponse getCampaignsResponse2 = OASGetCampaignsResponse.getExample();
        OASGetCampaignsResponse getCampaignsResponse3 = new OASGetCampaignsResponse();
        OASGetCampaignsResponse getCampaignsResponse4 = new OASGetCampaignsResponse();

        System.assert(getCampaignsResponse1.equals(getCampaignsResponse2));
        System.assert(getCampaignsResponse2.equals(getCampaignsResponse1));
        System.assert(getCampaignsResponse3.equals(getCampaignsResponse4));
        System.assert(getCampaignsResponse4.equals(getCampaignsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignsResponse getCampaignsResponse1 = OASGetCampaignsResponse.getExample();
        OASGetCampaignsResponse getCampaignsResponse2 = new OASGetCampaignsResponse();

        System.assertEquals(false, getCampaignsResponse1.equals('foo'));
        System.assertEquals(false, getCampaignsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignsResponse getCampaignsResponse1 = OASGetCampaignsResponse.getExample();
        OASGetCampaignsResponse getCampaignsResponse2 = new OASGetCampaignsResponse();
        OASGetCampaignsResponse getCampaignsResponse3;

        System.assertEquals(false, getCampaignsResponse1.equals(getCampaignsResponse3));
        System.assertEquals(false, getCampaignsResponse2.equals(getCampaignsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignsResponse getCampaignsResponse1 = OASGetCampaignsResponse.getExample();
        OASGetCampaignsResponse getCampaignsResponse2 = new OASGetCampaignsResponse();

        System.assertEquals(getCampaignsResponse1.hashCode(), getCampaignsResponse1.hashCode());
        System.assertEquals(getCampaignsResponse2.hashCode(), getCampaignsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignsResponse getCampaignsResponse1 = OASGetCampaignsResponse.getExample();
        OASGetCampaignsResponse getCampaignsResponse2 = OASGetCampaignsResponse.getExample();
        OASGetCampaignsResponse getCampaignsResponse3 = new OASGetCampaignsResponse();
        OASGetCampaignsResponse getCampaignsResponse4 = new OASGetCampaignsResponse();

        System.assert(getCampaignsResponse1.equals(getCampaignsResponse2));
        System.assert(getCampaignsResponse3.equals(getCampaignsResponse4));
        System.assertEquals(getCampaignsResponse1.hashCode(), getCampaignsResponse2.hashCode());
        System.assertEquals(getCampaignsResponse3.hashCode(), getCampaignsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetCampaignsResponse getCampaignsResponse = new OASGetCampaignsResponse();
        System.assertEquals(new List<OASCampaignDTO>(), getCampaignsResponse.campaigns);
        System.assertEquals(null, getCampaignsResponse.pager);
    }
}
