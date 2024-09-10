@isTest
private class OASAddOffersToArchiveRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddOffersToArchiveRequest addOffersToArchiveRequest1 = OASAddOffersToArchiveRequest.getExample();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest2 = addOffersToArchiveRequest1;
        OASAddOffersToArchiveRequest addOffersToArchiveRequest3 = new OASAddOffersToArchiveRequest();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest4 = addOffersToArchiveRequest3;

        System.assert(addOffersToArchiveRequest1.equals(addOffersToArchiveRequest2));
        System.assert(addOffersToArchiveRequest2.equals(addOffersToArchiveRequest1));
        System.assert(addOffersToArchiveRequest1.equals(addOffersToArchiveRequest1));
        System.assert(addOffersToArchiveRequest3.equals(addOffersToArchiveRequest4));
        System.assert(addOffersToArchiveRequest4.equals(addOffersToArchiveRequest3));
        System.assert(addOffersToArchiveRequest3.equals(addOffersToArchiveRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddOffersToArchiveRequest addOffersToArchiveRequest1 = OASAddOffersToArchiveRequest.getExample();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest2 = OASAddOffersToArchiveRequest.getExample();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest3 = new OASAddOffersToArchiveRequest();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest4 = new OASAddOffersToArchiveRequest();

        System.assert(addOffersToArchiveRequest1.equals(addOffersToArchiveRequest2));
        System.assert(addOffersToArchiveRequest2.equals(addOffersToArchiveRequest1));
        System.assert(addOffersToArchiveRequest3.equals(addOffersToArchiveRequest4));
        System.assert(addOffersToArchiveRequest4.equals(addOffersToArchiveRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddOffersToArchiveRequest addOffersToArchiveRequest1 = OASAddOffersToArchiveRequest.getExample();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest2 = new OASAddOffersToArchiveRequest();

        System.assertEquals(false, addOffersToArchiveRequest1.equals('foo'));
        System.assertEquals(false, addOffersToArchiveRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddOffersToArchiveRequest addOffersToArchiveRequest1 = OASAddOffersToArchiveRequest.getExample();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest2 = new OASAddOffersToArchiveRequest();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest3;

        System.assertEquals(false, addOffersToArchiveRequest1.equals(addOffersToArchiveRequest3));
        System.assertEquals(false, addOffersToArchiveRequest2.equals(addOffersToArchiveRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddOffersToArchiveRequest addOffersToArchiveRequest1 = OASAddOffersToArchiveRequest.getExample();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest2 = new OASAddOffersToArchiveRequest();

        System.assertEquals(addOffersToArchiveRequest1.hashCode(), addOffersToArchiveRequest1.hashCode());
        System.assertEquals(addOffersToArchiveRequest2.hashCode(), addOffersToArchiveRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddOffersToArchiveRequest addOffersToArchiveRequest1 = OASAddOffersToArchiveRequest.getExample();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest2 = OASAddOffersToArchiveRequest.getExample();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest3 = new OASAddOffersToArchiveRequest();
        OASAddOffersToArchiveRequest addOffersToArchiveRequest4 = new OASAddOffersToArchiveRequest();

        System.assert(addOffersToArchiveRequest1.equals(addOffersToArchiveRequest2));
        System.assert(addOffersToArchiveRequest3.equals(addOffersToArchiveRequest4));
        System.assertEquals(addOffersToArchiveRequest1.hashCode(), addOffersToArchiveRequest2.hashCode());
        System.assertEquals(addOffersToArchiveRequest3.hashCode(), addOffersToArchiveRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAddOffersToArchiveRequest addOffersToArchiveRequest = new OASAddOffersToArchiveRequest();
        System.assertEquals(new List<String>(), addOffersToArchiveRequest.offerIds);
    }
}
