@isTest
private class OASAddHiddenOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddHiddenOffersRequest addHiddenOffersRequest1 = OASAddHiddenOffersRequest.getExample();
        OASAddHiddenOffersRequest addHiddenOffersRequest2 = addHiddenOffersRequest1;
        OASAddHiddenOffersRequest addHiddenOffersRequest3 = new OASAddHiddenOffersRequest();
        OASAddHiddenOffersRequest addHiddenOffersRequest4 = addHiddenOffersRequest3;

        System.assert(addHiddenOffersRequest1.equals(addHiddenOffersRequest2));
        System.assert(addHiddenOffersRequest2.equals(addHiddenOffersRequest1));
        System.assert(addHiddenOffersRequest1.equals(addHiddenOffersRequest1));
        System.assert(addHiddenOffersRequest3.equals(addHiddenOffersRequest4));
        System.assert(addHiddenOffersRequest4.equals(addHiddenOffersRequest3));
        System.assert(addHiddenOffersRequest3.equals(addHiddenOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddHiddenOffersRequest addHiddenOffersRequest1 = OASAddHiddenOffersRequest.getExample();
        OASAddHiddenOffersRequest addHiddenOffersRequest2 = OASAddHiddenOffersRequest.getExample();
        OASAddHiddenOffersRequest addHiddenOffersRequest3 = new OASAddHiddenOffersRequest();
        OASAddHiddenOffersRequest addHiddenOffersRequest4 = new OASAddHiddenOffersRequest();

        System.assert(addHiddenOffersRequest1.equals(addHiddenOffersRequest2));
        System.assert(addHiddenOffersRequest2.equals(addHiddenOffersRequest1));
        System.assert(addHiddenOffersRequest3.equals(addHiddenOffersRequest4));
        System.assert(addHiddenOffersRequest4.equals(addHiddenOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddHiddenOffersRequest addHiddenOffersRequest1 = OASAddHiddenOffersRequest.getExample();
        OASAddHiddenOffersRequest addHiddenOffersRequest2 = new OASAddHiddenOffersRequest();

        System.assertEquals(false, addHiddenOffersRequest1.equals('foo'));
        System.assertEquals(false, addHiddenOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddHiddenOffersRequest addHiddenOffersRequest1 = OASAddHiddenOffersRequest.getExample();
        OASAddHiddenOffersRequest addHiddenOffersRequest2 = new OASAddHiddenOffersRequest();
        OASAddHiddenOffersRequest addHiddenOffersRequest3;

        System.assertEquals(false, addHiddenOffersRequest1.equals(addHiddenOffersRequest3));
        System.assertEquals(false, addHiddenOffersRequest2.equals(addHiddenOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddHiddenOffersRequest addHiddenOffersRequest1 = OASAddHiddenOffersRequest.getExample();
        OASAddHiddenOffersRequest addHiddenOffersRequest2 = new OASAddHiddenOffersRequest();

        System.assertEquals(addHiddenOffersRequest1.hashCode(), addHiddenOffersRequest1.hashCode());
        System.assertEquals(addHiddenOffersRequest2.hashCode(), addHiddenOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddHiddenOffersRequest addHiddenOffersRequest1 = OASAddHiddenOffersRequest.getExample();
        OASAddHiddenOffersRequest addHiddenOffersRequest2 = OASAddHiddenOffersRequest.getExample();
        OASAddHiddenOffersRequest addHiddenOffersRequest3 = new OASAddHiddenOffersRequest();
        OASAddHiddenOffersRequest addHiddenOffersRequest4 = new OASAddHiddenOffersRequest();

        System.assert(addHiddenOffersRequest1.equals(addHiddenOffersRequest2));
        System.assert(addHiddenOffersRequest3.equals(addHiddenOffersRequest4));
        System.assertEquals(addHiddenOffersRequest1.hashCode(), addHiddenOffersRequest2.hashCode());
        System.assertEquals(addHiddenOffersRequest3.hashCode(), addHiddenOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAddHiddenOffersRequest addHiddenOffersRequest = new OASAddHiddenOffersRequest();
        System.assertEquals(new List<OASHiddenOfferDTO>(), addHiddenOffersRequest.hiddenOffers);
    }
}
