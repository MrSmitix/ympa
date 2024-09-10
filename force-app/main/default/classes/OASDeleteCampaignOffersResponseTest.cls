@isTest
private class OASDeleteCampaignOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse1 = OASDeleteCampaignOffersResponse.getExample();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse2 = deleteCampaignOffersResponse1;
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse3 = new OASDeleteCampaignOffersResponse();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse4 = deleteCampaignOffersResponse3;

        System.assert(deleteCampaignOffersResponse1.equals(deleteCampaignOffersResponse2));
        System.assert(deleteCampaignOffersResponse2.equals(deleteCampaignOffersResponse1));
        System.assert(deleteCampaignOffersResponse1.equals(deleteCampaignOffersResponse1));
        System.assert(deleteCampaignOffersResponse3.equals(deleteCampaignOffersResponse4));
        System.assert(deleteCampaignOffersResponse4.equals(deleteCampaignOffersResponse3));
        System.assert(deleteCampaignOffersResponse3.equals(deleteCampaignOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse1 = OASDeleteCampaignOffersResponse.getExample();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse2 = OASDeleteCampaignOffersResponse.getExample();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse3 = new OASDeleteCampaignOffersResponse();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse4 = new OASDeleteCampaignOffersResponse();

        System.assert(deleteCampaignOffersResponse1.equals(deleteCampaignOffersResponse2));
        System.assert(deleteCampaignOffersResponse2.equals(deleteCampaignOffersResponse1));
        System.assert(deleteCampaignOffersResponse3.equals(deleteCampaignOffersResponse4));
        System.assert(deleteCampaignOffersResponse4.equals(deleteCampaignOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse1 = OASDeleteCampaignOffersResponse.getExample();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse2 = new OASDeleteCampaignOffersResponse();

        System.assertEquals(false, deleteCampaignOffersResponse1.equals('foo'));
        System.assertEquals(false, deleteCampaignOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse1 = OASDeleteCampaignOffersResponse.getExample();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse2 = new OASDeleteCampaignOffersResponse();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse3;

        System.assertEquals(false, deleteCampaignOffersResponse1.equals(deleteCampaignOffersResponse3));
        System.assertEquals(false, deleteCampaignOffersResponse2.equals(deleteCampaignOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse1 = OASDeleteCampaignOffersResponse.getExample();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse2 = new OASDeleteCampaignOffersResponse();

        System.assertEquals(deleteCampaignOffersResponse1.hashCode(), deleteCampaignOffersResponse1.hashCode());
        System.assertEquals(deleteCampaignOffersResponse2.hashCode(), deleteCampaignOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse1 = OASDeleteCampaignOffersResponse.getExample();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse2 = OASDeleteCampaignOffersResponse.getExample();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse3 = new OASDeleteCampaignOffersResponse();
        OASDeleteCampaignOffersResponse deleteCampaignOffersResponse4 = new OASDeleteCampaignOffersResponse();

        System.assert(deleteCampaignOffersResponse1.equals(deleteCampaignOffersResponse2));
        System.assert(deleteCampaignOffersResponse3.equals(deleteCampaignOffersResponse4));
        System.assertEquals(deleteCampaignOffersResponse1.hashCode(), deleteCampaignOffersResponse2.hashCode());
        System.assertEquals(deleteCampaignOffersResponse3.hashCode(), deleteCampaignOffersResponse4.hashCode());
    }
}
