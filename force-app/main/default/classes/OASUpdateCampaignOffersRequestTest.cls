@isTest
private class OASUpdateCampaignOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest1 = OASUpdateCampaignOffersRequest.getExample();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest2 = updateCampaignOffersRequest1;
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest3 = new OASUpdateCampaignOffersRequest();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest4 = updateCampaignOffersRequest3;

        System.assert(updateCampaignOffersRequest1.equals(updateCampaignOffersRequest2));
        System.assert(updateCampaignOffersRequest2.equals(updateCampaignOffersRequest1));
        System.assert(updateCampaignOffersRequest1.equals(updateCampaignOffersRequest1));
        System.assert(updateCampaignOffersRequest3.equals(updateCampaignOffersRequest4));
        System.assert(updateCampaignOffersRequest4.equals(updateCampaignOffersRequest3));
        System.assert(updateCampaignOffersRequest3.equals(updateCampaignOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest1 = OASUpdateCampaignOffersRequest.getExample();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest2 = OASUpdateCampaignOffersRequest.getExample();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest3 = new OASUpdateCampaignOffersRequest();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest4 = new OASUpdateCampaignOffersRequest();

        System.assert(updateCampaignOffersRequest1.equals(updateCampaignOffersRequest2));
        System.assert(updateCampaignOffersRequest2.equals(updateCampaignOffersRequest1));
        System.assert(updateCampaignOffersRequest3.equals(updateCampaignOffersRequest4));
        System.assert(updateCampaignOffersRequest4.equals(updateCampaignOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest1 = OASUpdateCampaignOffersRequest.getExample();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest2 = new OASUpdateCampaignOffersRequest();

        System.assertEquals(false, updateCampaignOffersRequest1.equals('foo'));
        System.assertEquals(false, updateCampaignOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest1 = OASUpdateCampaignOffersRequest.getExample();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest2 = new OASUpdateCampaignOffersRequest();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest3;

        System.assertEquals(false, updateCampaignOffersRequest1.equals(updateCampaignOffersRequest3));
        System.assertEquals(false, updateCampaignOffersRequest2.equals(updateCampaignOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest1 = OASUpdateCampaignOffersRequest.getExample();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest2 = new OASUpdateCampaignOffersRequest();

        System.assertEquals(updateCampaignOffersRequest1.hashCode(), updateCampaignOffersRequest1.hashCode());
        System.assertEquals(updateCampaignOffersRequest2.hashCode(), updateCampaignOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest1 = OASUpdateCampaignOffersRequest.getExample();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest2 = OASUpdateCampaignOffersRequest.getExample();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest3 = new OASUpdateCampaignOffersRequest();
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest4 = new OASUpdateCampaignOffersRequest();

        System.assert(updateCampaignOffersRequest1.equals(updateCampaignOffersRequest2));
        System.assert(updateCampaignOffersRequest3.equals(updateCampaignOffersRequest4));
        System.assertEquals(updateCampaignOffersRequest1.hashCode(), updateCampaignOffersRequest2.hashCode());
        System.assertEquals(updateCampaignOffersRequest3.hashCode(), updateCampaignOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateCampaignOffersRequest updateCampaignOffersRequest = new OASUpdateCampaignOffersRequest();
        System.assertEquals(new List<OASUpdateCampaignOfferDTO>(), updateCampaignOffersRequest.offers);
    }
}
