@isTest
private class OASGenerateUnitedOrdersRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest1 = OASGenerateUnitedOrdersRequest.getExample();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest2 = generateUnitedOrdersRequest1;
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest3 = new OASGenerateUnitedOrdersRequest();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest4 = generateUnitedOrdersRequest3;

        System.assert(generateUnitedOrdersRequest1.equals(generateUnitedOrdersRequest2));
        System.assert(generateUnitedOrdersRequest2.equals(generateUnitedOrdersRequest1));
        System.assert(generateUnitedOrdersRequest1.equals(generateUnitedOrdersRequest1));
        System.assert(generateUnitedOrdersRequest3.equals(generateUnitedOrdersRequest4));
        System.assert(generateUnitedOrdersRequest4.equals(generateUnitedOrdersRequest3));
        System.assert(generateUnitedOrdersRequest3.equals(generateUnitedOrdersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest1 = OASGenerateUnitedOrdersRequest.getExample();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest2 = OASGenerateUnitedOrdersRequest.getExample();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest3 = new OASGenerateUnitedOrdersRequest();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest4 = new OASGenerateUnitedOrdersRequest();

        System.assert(generateUnitedOrdersRequest1.equals(generateUnitedOrdersRequest2));
        System.assert(generateUnitedOrdersRequest2.equals(generateUnitedOrdersRequest1));
        System.assert(generateUnitedOrdersRequest3.equals(generateUnitedOrdersRequest4));
        System.assert(generateUnitedOrdersRequest4.equals(generateUnitedOrdersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest1 = OASGenerateUnitedOrdersRequest.getExample();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest2 = new OASGenerateUnitedOrdersRequest();

        System.assertEquals(false, generateUnitedOrdersRequest1.equals('foo'));
        System.assertEquals(false, generateUnitedOrdersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest1 = OASGenerateUnitedOrdersRequest.getExample();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest2 = new OASGenerateUnitedOrdersRequest();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest3;

        System.assertEquals(false, generateUnitedOrdersRequest1.equals(generateUnitedOrdersRequest3));
        System.assertEquals(false, generateUnitedOrdersRequest2.equals(generateUnitedOrdersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest1 = OASGenerateUnitedOrdersRequest.getExample();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest2 = new OASGenerateUnitedOrdersRequest();

        System.assertEquals(generateUnitedOrdersRequest1.hashCode(), generateUnitedOrdersRequest1.hashCode());
        System.assertEquals(generateUnitedOrdersRequest2.hashCode(), generateUnitedOrdersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest1 = OASGenerateUnitedOrdersRequest.getExample();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest2 = OASGenerateUnitedOrdersRequest.getExample();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest3 = new OASGenerateUnitedOrdersRequest();
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest4 = new OASGenerateUnitedOrdersRequest();

        System.assert(generateUnitedOrdersRequest1.equals(generateUnitedOrdersRequest2));
        System.assert(generateUnitedOrdersRequest3.equals(generateUnitedOrdersRequest4));
        System.assertEquals(generateUnitedOrdersRequest1.hashCode(), generateUnitedOrdersRequest2.hashCode());
        System.assertEquals(generateUnitedOrdersRequest3.hashCode(), generateUnitedOrdersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGenerateUnitedOrdersRequest generateUnitedOrdersRequest = new OASGenerateUnitedOrdersRequest();
        System.assertEquals(new List<Long>(), generateUnitedOrdersRequest.campaignIds);
        System.assertEquals(null, generateUnitedOrdersRequest.businessId);
        System.assertEquals(null, generateUnitedOrdersRequest.dateFrom);
        System.assertEquals(null, generateUnitedOrdersRequest.dateTo);
        System.assertEquals(null, generateUnitedOrdersRequest.promoId);
    }
}
