@isTest
private class OASDeleteHiddenOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest1 = OASDeleteHiddenOffersRequest.getExample();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest2 = deleteHiddenOffersRequest1;
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest3 = new OASDeleteHiddenOffersRequest();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest4 = deleteHiddenOffersRequest3;

        System.assert(deleteHiddenOffersRequest1.equals(deleteHiddenOffersRequest2));
        System.assert(deleteHiddenOffersRequest2.equals(deleteHiddenOffersRequest1));
        System.assert(deleteHiddenOffersRequest1.equals(deleteHiddenOffersRequest1));
        System.assert(deleteHiddenOffersRequest3.equals(deleteHiddenOffersRequest4));
        System.assert(deleteHiddenOffersRequest4.equals(deleteHiddenOffersRequest3));
        System.assert(deleteHiddenOffersRequest3.equals(deleteHiddenOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest1 = OASDeleteHiddenOffersRequest.getExample();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest2 = OASDeleteHiddenOffersRequest.getExample();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest3 = new OASDeleteHiddenOffersRequest();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest4 = new OASDeleteHiddenOffersRequest();

        System.assert(deleteHiddenOffersRequest1.equals(deleteHiddenOffersRequest2));
        System.assert(deleteHiddenOffersRequest2.equals(deleteHiddenOffersRequest1));
        System.assert(deleteHiddenOffersRequest3.equals(deleteHiddenOffersRequest4));
        System.assert(deleteHiddenOffersRequest4.equals(deleteHiddenOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest1 = OASDeleteHiddenOffersRequest.getExample();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest2 = new OASDeleteHiddenOffersRequest();

        System.assertEquals(false, deleteHiddenOffersRequest1.equals('foo'));
        System.assertEquals(false, deleteHiddenOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest1 = OASDeleteHiddenOffersRequest.getExample();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest2 = new OASDeleteHiddenOffersRequest();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest3;

        System.assertEquals(false, deleteHiddenOffersRequest1.equals(deleteHiddenOffersRequest3));
        System.assertEquals(false, deleteHiddenOffersRequest2.equals(deleteHiddenOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest1 = OASDeleteHiddenOffersRequest.getExample();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest2 = new OASDeleteHiddenOffersRequest();

        System.assertEquals(deleteHiddenOffersRequest1.hashCode(), deleteHiddenOffersRequest1.hashCode());
        System.assertEquals(deleteHiddenOffersRequest2.hashCode(), deleteHiddenOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest1 = OASDeleteHiddenOffersRequest.getExample();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest2 = OASDeleteHiddenOffersRequest.getExample();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest3 = new OASDeleteHiddenOffersRequest();
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest4 = new OASDeleteHiddenOffersRequest();

        System.assert(deleteHiddenOffersRequest1.equals(deleteHiddenOffersRequest2));
        System.assert(deleteHiddenOffersRequest3.equals(deleteHiddenOffersRequest4));
        System.assertEquals(deleteHiddenOffersRequest1.hashCode(), deleteHiddenOffersRequest2.hashCode());
        System.assertEquals(deleteHiddenOffersRequest3.hashCode(), deleteHiddenOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteHiddenOffersRequest deleteHiddenOffersRequest = new OASDeleteHiddenOffersRequest();
        System.assertEquals(new List<OASHiddenOfferDTO>(), deleteHiddenOffersRequest.hiddenOffers);
    }
}
