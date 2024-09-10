@isTest
private class OASGetQuarantineOffersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetQuarantineOffersRequest getQuarantineOffersRequest1 = OASGetQuarantineOffersRequest.getExample();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest2 = getQuarantineOffersRequest1;
        OASGetQuarantineOffersRequest getQuarantineOffersRequest3 = new OASGetQuarantineOffersRequest();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest4 = getQuarantineOffersRequest3;

        System.assert(getQuarantineOffersRequest1.equals(getQuarantineOffersRequest2));
        System.assert(getQuarantineOffersRequest2.equals(getQuarantineOffersRequest1));
        System.assert(getQuarantineOffersRequest1.equals(getQuarantineOffersRequest1));
        System.assert(getQuarantineOffersRequest3.equals(getQuarantineOffersRequest4));
        System.assert(getQuarantineOffersRequest4.equals(getQuarantineOffersRequest3));
        System.assert(getQuarantineOffersRequest3.equals(getQuarantineOffersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetQuarantineOffersRequest getQuarantineOffersRequest1 = OASGetQuarantineOffersRequest.getExample();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest2 = OASGetQuarantineOffersRequest.getExample();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest3 = new OASGetQuarantineOffersRequest();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest4 = new OASGetQuarantineOffersRequest();

        System.assert(getQuarantineOffersRequest1.equals(getQuarantineOffersRequest2));
        System.assert(getQuarantineOffersRequest2.equals(getQuarantineOffersRequest1));
        System.assert(getQuarantineOffersRequest3.equals(getQuarantineOffersRequest4));
        System.assert(getQuarantineOffersRequest4.equals(getQuarantineOffersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetQuarantineOffersRequest getQuarantineOffersRequest1 = OASGetQuarantineOffersRequest.getExample();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest2 = new OASGetQuarantineOffersRequest();

        System.assertEquals(false, getQuarantineOffersRequest1.equals('foo'));
        System.assertEquals(false, getQuarantineOffersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetQuarantineOffersRequest getQuarantineOffersRequest1 = OASGetQuarantineOffersRequest.getExample();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest2 = new OASGetQuarantineOffersRequest();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest3;

        System.assertEquals(false, getQuarantineOffersRequest1.equals(getQuarantineOffersRequest3));
        System.assertEquals(false, getQuarantineOffersRequest2.equals(getQuarantineOffersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetQuarantineOffersRequest getQuarantineOffersRequest1 = OASGetQuarantineOffersRequest.getExample();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest2 = new OASGetQuarantineOffersRequest();

        System.assertEquals(getQuarantineOffersRequest1.hashCode(), getQuarantineOffersRequest1.hashCode());
        System.assertEquals(getQuarantineOffersRequest2.hashCode(), getQuarantineOffersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetQuarantineOffersRequest getQuarantineOffersRequest1 = OASGetQuarantineOffersRequest.getExample();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest2 = OASGetQuarantineOffersRequest.getExample();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest3 = new OASGetQuarantineOffersRequest();
        OASGetQuarantineOffersRequest getQuarantineOffersRequest4 = new OASGetQuarantineOffersRequest();

        System.assert(getQuarantineOffersRequest1.equals(getQuarantineOffersRequest2));
        System.assert(getQuarantineOffersRequest3.equals(getQuarantineOffersRequest4));
        System.assertEquals(getQuarantineOffersRequest1.hashCode(), getQuarantineOffersRequest2.hashCode());
        System.assertEquals(getQuarantineOffersRequest3.hashCode(), getQuarantineOffersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetQuarantineOffersRequest getQuarantineOffersRequest = new OASGetQuarantineOffersRequest();
        System.assertEquals(new List<String>(), getQuarantineOffersRequest.offerIds);
        System.assertEquals(new List<OASOfferCardStatusType>(), getQuarantineOffersRequest.cardStatuses);
        System.assertEquals(new List<Integer>(), getQuarantineOffersRequest.categoryIds);
        System.assertEquals(new List<String>(), getQuarantineOffersRequest.vendorNames);
        System.assertEquals(new List<String>(), getQuarantineOffersRequest.tags);
    }
}
