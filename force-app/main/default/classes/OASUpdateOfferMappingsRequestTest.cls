@isTest
private class OASUpdateOfferMappingsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest1 = OASUpdateOfferMappingsRequest.getExample();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest2 = updateOfferMappingsRequest1;
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest3 = new OASUpdateOfferMappingsRequest();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest4 = updateOfferMappingsRequest3;

        System.assert(updateOfferMappingsRequest1.equals(updateOfferMappingsRequest2));
        System.assert(updateOfferMappingsRequest2.equals(updateOfferMappingsRequest1));
        System.assert(updateOfferMappingsRequest1.equals(updateOfferMappingsRequest1));
        System.assert(updateOfferMappingsRequest3.equals(updateOfferMappingsRequest4));
        System.assert(updateOfferMappingsRequest4.equals(updateOfferMappingsRequest3));
        System.assert(updateOfferMappingsRequest3.equals(updateOfferMappingsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest1 = OASUpdateOfferMappingsRequest.getExample();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest2 = OASUpdateOfferMappingsRequest.getExample();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest3 = new OASUpdateOfferMappingsRequest();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest4 = new OASUpdateOfferMappingsRequest();

        System.assert(updateOfferMappingsRequest1.equals(updateOfferMappingsRequest2));
        System.assert(updateOfferMappingsRequest2.equals(updateOfferMappingsRequest1));
        System.assert(updateOfferMappingsRequest3.equals(updateOfferMappingsRequest4));
        System.assert(updateOfferMappingsRequest4.equals(updateOfferMappingsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest1 = OASUpdateOfferMappingsRequest.getExample();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest2 = new OASUpdateOfferMappingsRequest();

        System.assertEquals(false, updateOfferMappingsRequest1.equals('foo'));
        System.assertEquals(false, updateOfferMappingsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest1 = OASUpdateOfferMappingsRequest.getExample();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest2 = new OASUpdateOfferMappingsRequest();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest3;

        System.assertEquals(false, updateOfferMappingsRequest1.equals(updateOfferMappingsRequest3));
        System.assertEquals(false, updateOfferMappingsRequest2.equals(updateOfferMappingsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest1 = OASUpdateOfferMappingsRequest.getExample();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest2 = new OASUpdateOfferMappingsRequest();

        System.assertEquals(updateOfferMappingsRequest1.hashCode(), updateOfferMappingsRequest1.hashCode());
        System.assertEquals(updateOfferMappingsRequest2.hashCode(), updateOfferMappingsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest1 = OASUpdateOfferMappingsRequest.getExample();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest2 = OASUpdateOfferMappingsRequest.getExample();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest3 = new OASUpdateOfferMappingsRequest();
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest4 = new OASUpdateOfferMappingsRequest();

        System.assert(updateOfferMappingsRequest1.equals(updateOfferMappingsRequest2));
        System.assert(updateOfferMappingsRequest3.equals(updateOfferMappingsRequest4));
        System.assertEquals(updateOfferMappingsRequest1.hashCode(), updateOfferMappingsRequest2.hashCode());
        System.assertEquals(updateOfferMappingsRequest3.hashCode(), updateOfferMappingsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOfferMappingsRequest updateOfferMappingsRequest = new OASUpdateOfferMappingsRequest();
        System.assertEquals(new List<OASUpdateOfferMappingDTO>(), updateOfferMappingsRequest.offerMappings);
        System.assertEquals(null, updateOfferMappingsRequest.onlyPartnerMediaContent);
    }
}
