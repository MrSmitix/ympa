@isTest
private class OASDeleteCampaignOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest1 = OASDeleteCampaignOffersRequest.getExample();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest2 = deleteCampaignOffersRequest1;
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest3 = new OASDeleteCampaignOffersRequest();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest4 = deleteCampaignOffersRequest3;

        System.assert(deleteCampaignOffersRequest1.equals(deleteCampaignOffersRequest2));
        System.assert(deleteCampaignOffersRequest2.equals(deleteCampaignOffersRequest1));
        System.assert(deleteCampaignOffersRequest1.equals(deleteCampaignOffersRequest1));
        System.assert(deleteCampaignOffersRequest3.equals(deleteCampaignOffersRequest4));
        System.assert(deleteCampaignOffersRequest4.equals(deleteCampaignOffersRequest3));
        System.assert(deleteCampaignOffersRequest3.equals(deleteCampaignOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest1 = OASDeleteCampaignOffersRequest.getExample();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest2 = OASDeleteCampaignOffersRequest.getExample();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest3 = new OASDeleteCampaignOffersRequest();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest4 = new OASDeleteCampaignOffersRequest();

        System.assert(deleteCampaignOffersRequest1.equals(deleteCampaignOffersRequest2));
        System.assert(deleteCampaignOffersRequest2.equals(deleteCampaignOffersRequest1));
        System.assert(deleteCampaignOffersRequest3.equals(deleteCampaignOffersRequest4));
        System.assert(deleteCampaignOffersRequest4.equals(deleteCampaignOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest1 = OASDeleteCampaignOffersRequest.getExample();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest2 = new OASDeleteCampaignOffersRequest();

        System.assertEquals(false, deleteCampaignOffersRequest1.equals('foo'));
        System.assertEquals(false, deleteCampaignOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest1 = OASDeleteCampaignOffersRequest.getExample();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest2 = new OASDeleteCampaignOffersRequest();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest3;

        System.assertEquals(false, deleteCampaignOffersRequest1.equals(deleteCampaignOffersRequest3));
        System.assertEquals(false, deleteCampaignOffersRequest2.equals(deleteCampaignOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest1 = OASDeleteCampaignOffersRequest.getExample();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest2 = new OASDeleteCampaignOffersRequest();

        System.assertEquals(deleteCampaignOffersRequest1.hashCode(), deleteCampaignOffersRequest1.hashCode());
        System.assertEquals(deleteCampaignOffersRequest2.hashCode(), deleteCampaignOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest1 = OASDeleteCampaignOffersRequest.getExample();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest2 = OASDeleteCampaignOffersRequest.getExample();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest3 = new OASDeleteCampaignOffersRequest();
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest4 = new OASDeleteCampaignOffersRequest();

        System.assert(deleteCampaignOffersRequest1.equals(deleteCampaignOffersRequest2));
        System.assert(deleteCampaignOffersRequest3.equals(deleteCampaignOffersRequest4));
        System.assertEquals(deleteCampaignOffersRequest1.hashCode(), deleteCampaignOffersRequest2.hashCode());
        System.assertEquals(deleteCampaignOffersRequest3.hashCode(), deleteCampaignOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteCampaignOffersRequest deleteCampaignOffersRequest = new OASDeleteCampaignOffersRequest();
        System.assertEquals(new List<String>(), deleteCampaignOffersRequest.offerIds);
    }
}
