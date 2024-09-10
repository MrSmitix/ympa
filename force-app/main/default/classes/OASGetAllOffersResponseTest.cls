@isTest
private class OASGetAllOffersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetAllOffersResponse getAllOffersResponse1 = OASGetAllOffersResponse.getExample();
        OASGetAllOffersResponse getAllOffersResponse2 = getAllOffersResponse1;
        OASGetAllOffersResponse getAllOffersResponse3 = new OASGetAllOffersResponse();
        OASGetAllOffersResponse getAllOffersResponse4 = getAllOffersResponse3;

        System.assert(getAllOffersResponse1.equals(getAllOffersResponse2));
        System.assert(getAllOffersResponse2.equals(getAllOffersResponse1));
        System.assert(getAllOffersResponse1.equals(getAllOffersResponse1));
        System.assert(getAllOffersResponse3.equals(getAllOffersResponse4));
        System.assert(getAllOffersResponse4.equals(getAllOffersResponse3));
        System.assert(getAllOffersResponse3.equals(getAllOffersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetAllOffersResponse getAllOffersResponse1 = OASGetAllOffersResponse.getExample();
        OASGetAllOffersResponse getAllOffersResponse2 = OASGetAllOffersResponse.getExample();
        OASGetAllOffersResponse getAllOffersResponse3 = new OASGetAllOffersResponse();
        OASGetAllOffersResponse getAllOffersResponse4 = new OASGetAllOffersResponse();

        System.assert(getAllOffersResponse1.equals(getAllOffersResponse2));
        System.assert(getAllOffersResponse2.equals(getAllOffersResponse1));
        System.assert(getAllOffersResponse3.equals(getAllOffersResponse4));
        System.assert(getAllOffersResponse4.equals(getAllOffersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetAllOffersResponse getAllOffersResponse1 = OASGetAllOffersResponse.getExample();
        OASGetAllOffersResponse getAllOffersResponse2 = new OASGetAllOffersResponse();

        System.assertEquals(false, getAllOffersResponse1.equals('foo'));
        System.assertEquals(false, getAllOffersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetAllOffersResponse getAllOffersResponse1 = OASGetAllOffersResponse.getExample();
        OASGetAllOffersResponse getAllOffersResponse2 = new OASGetAllOffersResponse();
        OASGetAllOffersResponse getAllOffersResponse3;

        System.assertEquals(false, getAllOffersResponse1.equals(getAllOffersResponse3));
        System.assertEquals(false, getAllOffersResponse2.equals(getAllOffersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetAllOffersResponse getAllOffersResponse1 = OASGetAllOffersResponse.getExample();
        OASGetAllOffersResponse getAllOffersResponse2 = new OASGetAllOffersResponse();

        System.assertEquals(getAllOffersResponse1.hashCode(), getAllOffersResponse1.hashCode());
        System.assertEquals(getAllOffersResponse2.hashCode(), getAllOffersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetAllOffersResponse getAllOffersResponse1 = OASGetAllOffersResponse.getExample();
        OASGetAllOffersResponse getAllOffersResponse2 = OASGetAllOffersResponse.getExample();
        OASGetAllOffersResponse getAllOffersResponse3 = new OASGetAllOffersResponse();
        OASGetAllOffersResponse getAllOffersResponse4 = new OASGetAllOffersResponse();

        System.assert(getAllOffersResponse1.equals(getAllOffersResponse2));
        System.assert(getAllOffersResponse3.equals(getAllOffersResponse4));
        System.assertEquals(getAllOffersResponse1.hashCode(), getAllOffersResponse2.hashCode());
        System.assertEquals(getAllOffersResponse3.hashCode(), getAllOffersResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetAllOffersResponse getAllOffersResponse = new OASGetAllOffersResponse();
        System.assertEquals(new List<OASOfferDTO>(), getAllOffersResponse.offers);
    }
}
