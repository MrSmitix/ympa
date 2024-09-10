@isTest
private class OASGetOfferMappingsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferMappingsRequest getOfferMappingsRequest1 = OASGetOfferMappingsRequest.getExample();
        OASGetOfferMappingsRequest getOfferMappingsRequest2 = getOfferMappingsRequest1;
        OASGetOfferMappingsRequest getOfferMappingsRequest3 = new OASGetOfferMappingsRequest();
        OASGetOfferMappingsRequest getOfferMappingsRequest4 = getOfferMappingsRequest3;

        System.assert(getOfferMappingsRequest1.equals(getOfferMappingsRequest2));
        System.assert(getOfferMappingsRequest2.equals(getOfferMappingsRequest1));
        System.assert(getOfferMappingsRequest1.equals(getOfferMappingsRequest1));
        System.assert(getOfferMappingsRequest3.equals(getOfferMappingsRequest4));
        System.assert(getOfferMappingsRequest4.equals(getOfferMappingsRequest3));
        System.assert(getOfferMappingsRequest3.equals(getOfferMappingsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferMappingsRequest getOfferMappingsRequest1 = OASGetOfferMappingsRequest.getExample();
        OASGetOfferMappingsRequest getOfferMappingsRequest2 = OASGetOfferMappingsRequest.getExample();
        OASGetOfferMappingsRequest getOfferMappingsRequest3 = new OASGetOfferMappingsRequest();
        OASGetOfferMappingsRequest getOfferMappingsRequest4 = new OASGetOfferMappingsRequest();

        System.assert(getOfferMappingsRequest1.equals(getOfferMappingsRequest2));
        System.assert(getOfferMappingsRequest2.equals(getOfferMappingsRequest1));
        System.assert(getOfferMappingsRequest3.equals(getOfferMappingsRequest4));
        System.assert(getOfferMappingsRequest4.equals(getOfferMappingsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferMappingsRequest getOfferMappingsRequest1 = OASGetOfferMappingsRequest.getExample();
        OASGetOfferMappingsRequest getOfferMappingsRequest2 = new OASGetOfferMappingsRequest();

        System.assertEquals(false, getOfferMappingsRequest1.equals('foo'));
        System.assertEquals(false, getOfferMappingsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferMappingsRequest getOfferMappingsRequest1 = OASGetOfferMappingsRequest.getExample();
        OASGetOfferMappingsRequest getOfferMappingsRequest2 = new OASGetOfferMappingsRequest();
        OASGetOfferMappingsRequest getOfferMappingsRequest3;

        System.assertEquals(false, getOfferMappingsRequest1.equals(getOfferMappingsRequest3));
        System.assertEquals(false, getOfferMappingsRequest2.equals(getOfferMappingsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferMappingsRequest getOfferMappingsRequest1 = OASGetOfferMappingsRequest.getExample();
        OASGetOfferMappingsRequest getOfferMappingsRequest2 = new OASGetOfferMappingsRequest();

        System.assertEquals(getOfferMappingsRequest1.hashCode(), getOfferMappingsRequest1.hashCode());
        System.assertEquals(getOfferMappingsRequest2.hashCode(), getOfferMappingsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferMappingsRequest getOfferMappingsRequest1 = OASGetOfferMappingsRequest.getExample();
        OASGetOfferMappingsRequest getOfferMappingsRequest2 = OASGetOfferMappingsRequest.getExample();
        OASGetOfferMappingsRequest getOfferMappingsRequest3 = new OASGetOfferMappingsRequest();
        OASGetOfferMappingsRequest getOfferMappingsRequest4 = new OASGetOfferMappingsRequest();

        System.assert(getOfferMappingsRequest1.equals(getOfferMappingsRequest2));
        System.assert(getOfferMappingsRequest3.equals(getOfferMappingsRequest4));
        System.assertEquals(getOfferMappingsRequest1.hashCode(), getOfferMappingsRequest2.hashCode());
        System.assertEquals(getOfferMappingsRequest3.hashCode(), getOfferMappingsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOfferMappingsRequest getOfferMappingsRequest = new OASGetOfferMappingsRequest();
        System.assertEquals(new List<String>(), getOfferMappingsRequest.offerIds);
        System.assertEquals(new List<OASOfferCardStatusType>(), getOfferMappingsRequest.cardStatuses);
        System.assertEquals(new List<Integer>(), getOfferMappingsRequest.categoryIds);
        System.assertEquals(new List<String>(), getOfferMappingsRequest.vendorNames);
        System.assertEquals(new List<String>(), getOfferMappingsRequest.tags);
        System.assertEquals(null, getOfferMappingsRequest.archived);
    }
}
