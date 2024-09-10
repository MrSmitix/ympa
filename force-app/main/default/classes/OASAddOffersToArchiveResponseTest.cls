@isTest
private class OASAddOffersToArchiveResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddOffersToArchiveResponse addOffersToArchiveResponse1 = OASAddOffersToArchiveResponse.getExample();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse2 = addOffersToArchiveResponse1;
        OASAddOffersToArchiveResponse addOffersToArchiveResponse3 = new OASAddOffersToArchiveResponse();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse4 = addOffersToArchiveResponse3;

        System.assert(addOffersToArchiveResponse1.equals(addOffersToArchiveResponse2));
        System.assert(addOffersToArchiveResponse2.equals(addOffersToArchiveResponse1));
        System.assert(addOffersToArchiveResponse1.equals(addOffersToArchiveResponse1));
        System.assert(addOffersToArchiveResponse3.equals(addOffersToArchiveResponse4));
        System.assert(addOffersToArchiveResponse4.equals(addOffersToArchiveResponse3));
        System.assert(addOffersToArchiveResponse3.equals(addOffersToArchiveResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddOffersToArchiveResponse addOffersToArchiveResponse1 = OASAddOffersToArchiveResponse.getExample();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse2 = OASAddOffersToArchiveResponse.getExample();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse3 = new OASAddOffersToArchiveResponse();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse4 = new OASAddOffersToArchiveResponse();

        System.assert(addOffersToArchiveResponse1.equals(addOffersToArchiveResponse2));
        System.assert(addOffersToArchiveResponse2.equals(addOffersToArchiveResponse1));
        System.assert(addOffersToArchiveResponse3.equals(addOffersToArchiveResponse4));
        System.assert(addOffersToArchiveResponse4.equals(addOffersToArchiveResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddOffersToArchiveResponse addOffersToArchiveResponse1 = OASAddOffersToArchiveResponse.getExample();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse2 = new OASAddOffersToArchiveResponse();

        System.assertEquals(false, addOffersToArchiveResponse1.equals('foo'));
        System.assertEquals(false, addOffersToArchiveResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddOffersToArchiveResponse addOffersToArchiveResponse1 = OASAddOffersToArchiveResponse.getExample();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse2 = new OASAddOffersToArchiveResponse();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse3;

        System.assertEquals(false, addOffersToArchiveResponse1.equals(addOffersToArchiveResponse3));
        System.assertEquals(false, addOffersToArchiveResponse2.equals(addOffersToArchiveResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddOffersToArchiveResponse addOffersToArchiveResponse1 = OASAddOffersToArchiveResponse.getExample();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse2 = new OASAddOffersToArchiveResponse();

        System.assertEquals(addOffersToArchiveResponse1.hashCode(), addOffersToArchiveResponse1.hashCode());
        System.assertEquals(addOffersToArchiveResponse2.hashCode(), addOffersToArchiveResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddOffersToArchiveResponse addOffersToArchiveResponse1 = OASAddOffersToArchiveResponse.getExample();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse2 = OASAddOffersToArchiveResponse.getExample();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse3 = new OASAddOffersToArchiveResponse();
        OASAddOffersToArchiveResponse addOffersToArchiveResponse4 = new OASAddOffersToArchiveResponse();

        System.assert(addOffersToArchiveResponse1.equals(addOffersToArchiveResponse2));
        System.assert(addOffersToArchiveResponse3.equals(addOffersToArchiveResponse4));
        System.assertEquals(addOffersToArchiveResponse1.hashCode(), addOffersToArchiveResponse2.hashCode());
        System.assertEquals(addOffersToArchiveResponse3.hashCode(), addOffersToArchiveResponse4.hashCode());
    }
}
