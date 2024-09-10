@isTest
private class OASUpdateOfferContentRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferContentRequest updateOfferContentRequest1 = OASUpdateOfferContentRequest.getExample();
        OASUpdateOfferContentRequest updateOfferContentRequest2 = updateOfferContentRequest1;
        OASUpdateOfferContentRequest updateOfferContentRequest3 = new OASUpdateOfferContentRequest();
        OASUpdateOfferContentRequest updateOfferContentRequest4 = updateOfferContentRequest3;

        System.assert(updateOfferContentRequest1.equals(updateOfferContentRequest2));
        System.assert(updateOfferContentRequest2.equals(updateOfferContentRequest1));
        System.assert(updateOfferContentRequest1.equals(updateOfferContentRequest1));
        System.assert(updateOfferContentRequest3.equals(updateOfferContentRequest4));
        System.assert(updateOfferContentRequest4.equals(updateOfferContentRequest3));
        System.assert(updateOfferContentRequest3.equals(updateOfferContentRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferContentRequest updateOfferContentRequest1 = OASUpdateOfferContentRequest.getExample();
        OASUpdateOfferContentRequest updateOfferContentRequest2 = OASUpdateOfferContentRequest.getExample();
        OASUpdateOfferContentRequest updateOfferContentRequest3 = new OASUpdateOfferContentRequest();
        OASUpdateOfferContentRequest updateOfferContentRequest4 = new OASUpdateOfferContentRequest();

        System.assert(updateOfferContentRequest1.equals(updateOfferContentRequest2));
        System.assert(updateOfferContentRequest2.equals(updateOfferContentRequest1));
        System.assert(updateOfferContentRequest3.equals(updateOfferContentRequest4));
        System.assert(updateOfferContentRequest4.equals(updateOfferContentRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferContentRequest updateOfferContentRequest1 = OASUpdateOfferContentRequest.getExample();
        OASUpdateOfferContentRequest updateOfferContentRequest2 = new OASUpdateOfferContentRequest();

        System.assertEquals(false, updateOfferContentRequest1.equals('foo'));
        System.assertEquals(false, updateOfferContentRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferContentRequest updateOfferContentRequest1 = OASUpdateOfferContentRequest.getExample();
        OASUpdateOfferContentRequest updateOfferContentRequest2 = new OASUpdateOfferContentRequest();
        OASUpdateOfferContentRequest updateOfferContentRequest3;

        System.assertEquals(false, updateOfferContentRequest1.equals(updateOfferContentRequest3));
        System.assertEquals(false, updateOfferContentRequest2.equals(updateOfferContentRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferContentRequest updateOfferContentRequest1 = OASUpdateOfferContentRequest.getExample();
        OASUpdateOfferContentRequest updateOfferContentRequest2 = new OASUpdateOfferContentRequest();

        System.assertEquals(updateOfferContentRequest1.hashCode(), updateOfferContentRequest1.hashCode());
        System.assertEquals(updateOfferContentRequest2.hashCode(), updateOfferContentRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferContentRequest updateOfferContentRequest1 = OASUpdateOfferContentRequest.getExample();
        OASUpdateOfferContentRequest updateOfferContentRequest2 = OASUpdateOfferContentRequest.getExample();
        OASUpdateOfferContentRequest updateOfferContentRequest3 = new OASUpdateOfferContentRequest();
        OASUpdateOfferContentRequest updateOfferContentRequest4 = new OASUpdateOfferContentRequest();

        System.assert(updateOfferContentRequest1.equals(updateOfferContentRequest2));
        System.assert(updateOfferContentRequest3.equals(updateOfferContentRequest4));
        System.assertEquals(updateOfferContentRequest1.hashCode(), updateOfferContentRequest2.hashCode());
        System.assertEquals(updateOfferContentRequest3.hashCode(), updateOfferContentRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOfferContentRequest updateOfferContentRequest = new OASUpdateOfferContentRequest();
        System.assertEquals(new List<OASOfferContentDTO>(), updateOfferContentRequest.offersContent);
    }
}
