@isTest
private class OASUpdateOfferMappingEntryRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest1 = OASUpdateOfferMappingEntryRequest.getExample();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest2 = updateOfferMappingEntryRequest1;
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest3 = new OASUpdateOfferMappingEntryRequest();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest4 = updateOfferMappingEntryRequest3;

        System.assert(updateOfferMappingEntryRequest1.equals(updateOfferMappingEntryRequest2));
        System.assert(updateOfferMappingEntryRequest2.equals(updateOfferMappingEntryRequest1));
        System.assert(updateOfferMappingEntryRequest1.equals(updateOfferMappingEntryRequest1));
        System.assert(updateOfferMappingEntryRequest3.equals(updateOfferMappingEntryRequest4));
        System.assert(updateOfferMappingEntryRequest4.equals(updateOfferMappingEntryRequest3));
        System.assert(updateOfferMappingEntryRequest3.equals(updateOfferMappingEntryRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest1 = OASUpdateOfferMappingEntryRequest.getExample();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest2 = OASUpdateOfferMappingEntryRequest.getExample();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest3 = new OASUpdateOfferMappingEntryRequest();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest4 = new OASUpdateOfferMappingEntryRequest();

        System.assert(updateOfferMappingEntryRequest1.equals(updateOfferMappingEntryRequest2));
        System.assert(updateOfferMappingEntryRequest2.equals(updateOfferMappingEntryRequest1));
        System.assert(updateOfferMappingEntryRequest3.equals(updateOfferMappingEntryRequest4));
        System.assert(updateOfferMappingEntryRequest4.equals(updateOfferMappingEntryRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest1 = OASUpdateOfferMappingEntryRequest.getExample();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest2 = new OASUpdateOfferMappingEntryRequest();

        System.assertEquals(false, updateOfferMappingEntryRequest1.equals('foo'));
        System.assertEquals(false, updateOfferMappingEntryRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest1 = OASUpdateOfferMappingEntryRequest.getExample();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest2 = new OASUpdateOfferMappingEntryRequest();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest3;

        System.assertEquals(false, updateOfferMappingEntryRequest1.equals(updateOfferMappingEntryRequest3));
        System.assertEquals(false, updateOfferMappingEntryRequest2.equals(updateOfferMappingEntryRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest1 = OASUpdateOfferMappingEntryRequest.getExample();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest2 = new OASUpdateOfferMappingEntryRequest();

        System.assertEquals(updateOfferMappingEntryRequest1.hashCode(), updateOfferMappingEntryRequest1.hashCode());
        System.assertEquals(updateOfferMappingEntryRequest2.hashCode(), updateOfferMappingEntryRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest1 = OASUpdateOfferMappingEntryRequest.getExample();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest2 = OASUpdateOfferMappingEntryRequest.getExample();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest3 = new OASUpdateOfferMappingEntryRequest();
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest4 = new OASUpdateOfferMappingEntryRequest();

        System.assert(updateOfferMappingEntryRequest1.equals(updateOfferMappingEntryRequest2));
        System.assert(updateOfferMappingEntryRequest3.equals(updateOfferMappingEntryRequest4));
        System.assertEquals(updateOfferMappingEntryRequest1.hashCode(), updateOfferMappingEntryRequest2.hashCode());
        System.assertEquals(updateOfferMappingEntryRequest3.hashCode(), updateOfferMappingEntryRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = new OASUpdateOfferMappingEntryRequest();
        System.assertEquals(new List<OASUpdateOfferMappingEntryDTO>(), updateOfferMappingEntryRequest.offerMappingEntries);
    }
}
