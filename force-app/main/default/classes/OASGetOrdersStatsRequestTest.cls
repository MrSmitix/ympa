@isTest
private class OASGetOrdersStatsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOrdersStatsRequest getOrdersStatsRequest1 = OASGetOrdersStatsRequest.getExample();
        OASGetOrdersStatsRequest getOrdersStatsRequest2 = getOrdersStatsRequest1;
        OASGetOrdersStatsRequest getOrdersStatsRequest3 = new OASGetOrdersStatsRequest();
        OASGetOrdersStatsRequest getOrdersStatsRequest4 = getOrdersStatsRequest3;

        System.assert(getOrdersStatsRequest1.equals(getOrdersStatsRequest2));
        System.assert(getOrdersStatsRequest2.equals(getOrdersStatsRequest1));
        System.assert(getOrdersStatsRequest1.equals(getOrdersStatsRequest1));
        System.assert(getOrdersStatsRequest3.equals(getOrdersStatsRequest4));
        System.assert(getOrdersStatsRequest4.equals(getOrdersStatsRequest3));
        System.assert(getOrdersStatsRequest3.equals(getOrdersStatsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOrdersStatsRequest getOrdersStatsRequest1 = OASGetOrdersStatsRequest.getExample();
        OASGetOrdersStatsRequest getOrdersStatsRequest2 = OASGetOrdersStatsRequest.getExample();
        OASGetOrdersStatsRequest getOrdersStatsRequest3 = new OASGetOrdersStatsRequest();
        OASGetOrdersStatsRequest getOrdersStatsRequest4 = new OASGetOrdersStatsRequest();

        System.assert(getOrdersStatsRequest1.equals(getOrdersStatsRequest2));
        System.assert(getOrdersStatsRequest2.equals(getOrdersStatsRequest1));
        System.assert(getOrdersStatsRequest3.equals(getOrdersStatsRequest4));
        System.assert(getOrdersStatsRequest4.equals(getOrdersStatsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOrdersStatsRequest getOrdersStatsRequest1 = OASGetOrdersStatsRequest.getExample();
        OASGetOrdersStatsRequest getOrdersStatsRequest2 = new OASGetOrdersStatsRequest();

        System.assertEquals(false, getOrdersStatsRequest1.equals('foo'));
        System.assertEquals(false, getOrdersStatsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOrdersStatsRequest getOrdersStatsRequest1 = OASGetOrdersStatsRequest.getExample();
        OASGetOrdersStatsRequest getOrdersStatsRequest2 = new OASGetOrdersStatsRequest();
        OASGetOrdersStatsRequest getOrdersStatsRequest3;

        System.assertEquals(false, getOrdersStatsRequest1.equals(getOrdersStatsRequest3));
        System.assertEquals(false, getOrdersStatsRequest2.equals(getOrdersStatsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOrdersStatsRequest getOrdersStatsRequest1 = OASGetOrdersStatsRequest.getExample();
        OASGetOrdersStatsRequest getOrdersStatsRequest2 = new OASGetOrdersStatsRequest();

        System.assertEquals(getOrdersStatsRequest1.hashCode(), getOrdersStatsRequest1.hashCode());
        System.assertEquals(getOrdersStatsRequest2.hashCode(), getOrdersStatsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOrdersStatsRequest getOrdersStatsRequest1 = OASGetOrdersStatsRequest.getExample();
        OASGetOrdersStatsRequest getOrdersStatsRequest2 = OASGetOrdersStatsRequest.getExample();
        OASGetOrdersStatsRequest getOrdersStatsRequest3 = new OASGetOrdersStatsRequest();
        OASGetOrdersStatsRequest getOrdersStatsRequest4 = new OASGetOrdersStatsRequest();

        System.assert(getOrdersStatsRequest1.equals(getOrdersStatsRequest2));
        System.assert(getOrdersStatsRequest3.equals(getOrdersStatsRequest4));
        System.assertEquals(getOrdersStatsRequest1.hashCode(), getOrdersStatsRequest2.hashCode());
        System.assertEquals(getOrdersStatsRequest3.hashCode(), getOrdersStatsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOrdersStatsRequest getOrdersStatsRequest = new OASGetOrdersStatsRequest();
        System.assertEquals(new List<Long>(), getOrdersStatsRequest.orders);
        System.assertEquals(new List<OASOrderStatsStatusType>(), getOrdersStatsRequest.statuses);
        System.assertEquals(null, getOrdersStatsRequest.dateFrom);
        System.assertEquals(null, getOrdersStatsRequest.dateTo);
        System.assertEquals(null, getOrdersStatsRequest.updateFrom);
        System.assertEquals(null, getOrdersStatsRequest.updateTo);
        System.assertEquals(null, getOrdersStatsRequest.hasCis);
    }
}
