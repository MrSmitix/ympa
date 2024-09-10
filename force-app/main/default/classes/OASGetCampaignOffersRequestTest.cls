@isTest
private class OASGetCampaignOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCampaignOffersRequest getCampaignOffersRequest1 = OASGetCampaignOffersRequest.getExample();
        OASGetCampaignOffersRequest getCampaignOffersRequest2 = getCampaignOffersRequest1;
        OASGetCampaignOffersRequest getCampaignOffersRequest3 = new OASGetCampaignOffersRequest();
        OASGetCampaignOffersRequest getCampaignOffersRequest4 = getCampaignOffersRequest3;

        System.assert(getCampaignOffersRequest1.equals(getCampaignOffersRequest2));
        System.assert(getCampaignOffersRequest2.equals(getCampaignOffersRequest1));
        System.assert(getCampaignOffersRequest1.equals(getCampaignOffersRequest1));
        System.assert(getCampaignOffersRequest3.equals(getCampaignOffersRequest4));
        System.assert(getCampaignOffersRequest4.equals(getCampaignOffersRequest3));
        System.assert(getCampaignOffersRequest3.equals(getCampaignOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCampaignOffersRequest getCampaignOffersRequest1 = OASGetCampaignOffersRequest.getExample();
        OASGetCampaignOffersRequest getCampaignOffersRequest2 = OASGetCampaignOffersRequest.getExample();
        OASGetCampaignOffersRequest getCampaignOffersRequest3 = new OASGetCampaignOffersRequest();
        OASGetCampaignOffersRequest getCampaignOffersRequest4 = new OASGetCampaignOffersRequest();

        System.assert(getCampaignOffersRequest1.equals(getCampaignOffersRequest2));
        System.assert(getCampaignOffersRequest2.equals(getCampaignOffersRequest1));
        System.assert(getCampaignOffersRequest3.equals(getCampaignOffersRequest4));
        System.assert(getCampaignOffersRequest4.equals(getCampaignOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCampaignOffersRequest getCampaignOffersRequest1 = OASGetCampaignOffersRequest.getExample();
        OASGetCampaignOffersRequest getCampaignOffersRequest2 = new OASGetCampaignOffersRequest();

        System.assertEquals(false, getCampaignOffersRequest1.equals('foo'));
        System.assertEquals(false, getCampaignOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCampaignOffersRequest getCampaignOffersRequest1 = OASGetCampaignOffersRequest.getExample();
        OASGetCampaignOffersRequest getCampaignOffersRequest2 = new OASGetCampaignOffersRequest();
        OASGetCampaignOffersRequest getCampaignOffersRequest3;

        System.assertEquals(false, getCampaignOffersRequest1.equals(getCampaignOffersRequest3));
        System.assertEquals(false, getCampaignOffersRequest2.equals(getCampaignOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCampaignOffersRequest getCampaignOffersRequest1 = OASGetCampaignOffersRequest.getExample();
        OASGetCampaignOffersRequest getCampaignOffersRequest2 = new OASGetCampaignOffersRequest();

        System.assertEquals(getCampaignOffersRequest1.hashCode(), getCampaignOffersRequest1.hashCode());
        System.assertEquals(getCampaignOffersRequest2.hashCode(), getCampaignOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCampaignOffersRequest getCampaignOffersRequest1 = OASGetCampaignOffersRequest.getExample();
        OASGetCampaignOffersRequest getCampaignOffersRequest2 = OASGetCampaignOffersRequest.getExample();
        OASGetCampaignOffersRequest getCampaignOffersRequest3 = new OASGetCampaignOffersRequest();
        OASGetCampaignOffersRequest getCampaignOffersRequest4 = new OASGetCampaignOffersRequest();

        System.assert(getCampaignOffersRequest1.equals(getCampaignOffersRequest2));
        System.assert(getCampaignOffersRequest3.equals(getCampaignOffersRequest4));
        System.assertEquals(getCampaignOffersRequest1.hashCode(), getCampaignOffersRequest2.hashCode());
        System.assertEquals(getCampaignOffersRequest3.hashCode(), getCampaignOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetCampaignOffersRequest getCampaignOffersRequest = new OASGetCampaignOffersRequest();
        System.assertEquals(new List<String>(), getCampaignOffersRequest.offerIds);
        System.assertEquals(new List<OASOfferCampaignStatusType>(), getCampaignOffersRequest.statuses);
        System.assertEquals(new List<Integer>(), getCampaignOffersRequest.categoryIds);
        System.assertEquals(new List<String>(), getCampaignOffersRequest.vendorNames);
        System.assertEquals(new List<String>(), getCampaignOffersRequest.tags);
    }
}
