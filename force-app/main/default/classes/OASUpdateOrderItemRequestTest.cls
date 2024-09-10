@isTest
private class OASUpdateOrderItemRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOrderItemRequest updateOrderItemRequest1 = OASUpdateOrderItemRequest.getExample();
        OASUpdateOrderItemRequest updateOrderItemRequest2 = updateOrderItemRequest1;
        OASUpdateOrderItemRequest updateOrderItemRequest3 = new OASUpdateOrderItemRequest();
        OASUpdateOrderItemRequest updateOrderItemRequest4 = updateOrderItemRequest3;

        System.assert(updateOrderItemRequest1.equals(updateOrderItemRequest2));
        System.assert(updateOrderItemRequest2.equals(updateOrderItemRequest1));
        System.assert(updateOrderItemRequest1.equals(updateOrderItemRequest1));
        System.assert(updateOrderItemRequest3.equals(updateOrderItemRequest4));
        System.assert(updateOrderItemRequest4.equals(updateOrderItemRequest3));
        System.assert(updateOrderItemRequest3.equals(updateOrderItemRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOrderItemRequest updateOrderItemRequest1 = OASUpdateOrderItemRequest.getExample();
        OASUpdateOrderItemRequest updateOrderItemRequest2 = OASUpdateOrderItemRequest.getExample();
        OASUpdateOrderItemRequest updateOrderItemRequest3 = new OASUpdateOrderItemRequest();
        OASUpdateOrderItemRequest updateOrderItemRequest4 = new OASUpdateOrderItemRequest();

        System.assert(updateOrderItemRequest1.equals(updateOrderItemRequest2));
        System.assert(updateOrderItemRequest2.equals(updateOrderItemRequest1));
        System.assert(updateOrderItemRequest3.equals(updateOrderItemRequest4));
        System.assert(updateOrderItemRequest4.equals(updateOrderItemRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOrderItemRequest updateOrderItemRequest1 = OASUpdateOrderItemRequest.getExample();
        OASUpdateOrderItemRequest updateOrderItemRequest2 = new OASUpdateOrderItemRequest();

        System.assertEquals(false, updateOrderItemRequest1.equals('foo'));
        System.assertEquals(false, updateOrderItemRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOrderItemRequest updateOrderItemRequest1 = OASUpdateOrderItemRequest.getExample();
        OASUpdateOrderItemRequest updateOrderItemRequest2 = new OASUpdateOrderItemRequest();
        OASUpdateOrderItemRequest updateOrderItemRequest3;

        System.assertEquals(false, updateOrderItemRequest1.equals(updateOrderItemRequest3));
        System.assertEquals(false, updateOrderItemRequest2.equals(updateOrderItemRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOrderItemRequest updateOrderItemRequest1 = OASUpdateOrderItemRequest.getExample();
        OASUpdateOrderItemRequest updateOrderItemRequest2 = new OASUpdateOrderItemRequest();

        System.assertEquals(updateOrderItemRequest1.hashCode(), updateOrderItemRequest1.hashCode());
        System.assertEquals(updateOrderItemRequest2.hashCode(), updateOrderItemRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOrderItemRequest updateOrderItemRequest1 = OASUpdateOrderItemRequest.getExample();
        OASUpdateOrderItemRequest updateOrderItemRequest2 = OASUpdateOrderItemRequest.getExample();
        OASUpdateOrderItemRequest updateOrderItemRequest3 = new OASUpdateOrderItemRequest();
        OASUpdateOrderItemRequest updateOrderItemRequest4 = new OASUpdateOrderItemRequest();

        System.assert(updateOrderItemRequest1.equals(updateOrderItemRequest2));
        System.assert(updateOrderItemRequest3.equals(updateOrderItemRequest4));
        System.assertEquals(updateOrderItemRequest1.hashCode(), updateOrderItemRequest2.hashCode());
        System.assertEquals(updateOrderItemRequest3.hashCode(), updateOrderItemRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOrderItemRequest updateOrderItemRequest = new OASUpdateOrderItemRequest();
        System.assertEquals(new List<OASOrderItemModificationDTO>(), updateOrderItemRequest.items);
        System.assertEquals(null, updateOrderItemRequest.reason);
    }
}
