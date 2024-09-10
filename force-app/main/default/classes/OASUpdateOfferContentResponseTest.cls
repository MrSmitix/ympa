@isTest
private class OASUpdateOfferContentResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferContentResponse updateOfferContentResponse1 = OASUpdateOfferContentResponse.getExample();
        OASUpdateOfferContentResponse updateOfferContentResponse2 = updateOfferContentResponse1;
        OASUpdateOfferContentResponse updateOfferContentResponse3 = new OASUpdateOfferContentResponse();
        OASUpdateOfferContentResponse updateOfferContentResponse4 = updateOfferContentResponse3;

        System.assert(updateOfferContentResponse1.equals(updateOfferContentResponse2));
        System.assert(updateOfferContentResponse2.equals(updateOfferContentResponse1));
        System.assert(updateOfferContentResponse1.equals(updateOfferContentResponse1));
        System.assert(updateOfferContentResponse3.equals(updateOfferContentResponse4));
        System.assert(updateOfferContentResponse4.equals(updateOfferContentResponse3));
        System.assert(updateOfferContentResponse3.equals(updateOfferContentResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferContentResponse updateOfferContentResponse1 = OASUpdateOfferContentResponse.getExample();
        OASUpdateOfferContentResponse updateOfferContentResponse2 = OASUpdateOfferContentResponse.getExample();
        OASUpdateOfferContentResponse updateOfferContentResponse3 = new OASUpdateOfferContentResponse();
        OASUpdateOfferContentResponse updateOfferContentResponse4 = new OASUpdateOfferContentResponse();

        System.assert(updateOfferContentResponse1.equals(updateOfferContentResponse2));
        System.assert(updateOfferContentResponse2.equals(updateOfferContentResponse1));
        System.assert(updateOfferContentResponse3.equals(updateOfferContentResponse4));
        System.assert(updateOfferContentResponse4.equals(updateOfferContentResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferContentResponse updateOfferContentResponse1 = OASUpdateOfferContentResponse.getExample();
        OASUpdateOfferContentResponse updateOfferContentResponse2 = new OASUpdateOfferContentResponse();

        System.assertEquals(false, updateOfferContentResponse1.equals('foo'));
        System.assertEquals(false, updateOfferContentResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferContentResponse updateOfferContentResponse1 = OASUpdateOfferContentResponse.getExample();
        OASUpdateOfferContentResponse updateOfferContentResponse2 = new OASUpdateOfferContentResponse();
        OASUpdateOfferContentResponse updateOfferContentResponse3;

        System.assertEquals(false, updateOfferContentResponse1.equals(updateOfferContentResponse3));
        System.assertEquals(false, updateOfferContentResponse2.equals(updateOfferContentResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferContentResponse updateOfferContentResponse1 = OASUpdateOfferContentResponse.getExample();
        OASUpdateOfferContentResponse updateOfferContentResponse2 = new OASUpdateOfferContentResponse();

        System.assertEquals(updateOfferContentResponse1.hashCode(), updateOfferContentResponse1.hashCode());
        System.assertEquals(updateOfferContentResponse2.hashCode(), updateOfferContentResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferContentResponse updateOfferContentResponse1 = OASUpdateOfferContentResponse.getExample();
        OASUpdateOfferContentResponse updateOfferContentResponse2 = OASUpdateOfferContentResponse.getExample();
        OASUpdateOfferContentResponse updateOfferContentResponse3 = new OASUpdateOfferContentResponse();
        OASUpdateOfferContentResponse updateOfferContentResponse4 = new OASUpdateOfferContentResponse();

        System.assert(updateOfferContentResponse1.equals(updateOfferContentResponse2));
        System.assert(updateOfferContentResponse3.equals(updateOfferContentResponse4));
        System.assertEquals(updateOfferContentResponse1.hashCode(), updateOfferContentResponse2.hashCode());
        System.assertEquals(updateOfferContentResponse3.hashCode(), updateOfferContentResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOfferContentResponse updateOfferContentResponse = new OASUpdateOfferContentResponse();
        System.assertEquals(new List<OASUpdateOfferContentResultDTO>(), updateOfferContentResponse.results);
        System.assertEquals(null, updateOfferContentResponse.status);
    }
}
