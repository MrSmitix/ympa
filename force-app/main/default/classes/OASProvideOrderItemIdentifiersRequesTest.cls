@isTest
private class OASProvideOrderItemIdentifiersRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest1 = OASProvideOrderItemIdentifiersReques.getExample();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest2 = provideOrderItemIdentifiersRequest1;
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest3 = new OASProvideOrderItemIdentifiersReques();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest4 = provideOrderItemIdentifiersRequest3;

        System.assert(provideOrderItemIdentifiersRequest1.equals(provideOrderItemIdentifiersRequest2));
        System.assert(provideOrderItemIdentifiersRequest2.equals(provideOrderItemIdentifiersRequest1));
        System.assert(provideOrderItemIdentifiersRequest1.equals(provideOrderItemIdentifiersRequest1));
        System.assert(provideOrderItemIdentifiersRequest3.equals(provideOrderItemIdentifiersRequest4));
        System.assert(provideOrderItemIdentifiersRequest4.equals(provideOrderItemIdentifiersRequest3));
        System.assert(provideOrderItemIdentifiersRequest3.equals(provideOrderItemIdentifiersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest1 = OASProvideOrderItemIdentifiersReques.getExample();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest2 = OASProvideOrderItemIdentifiersReques.getExample();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest3 = new OASProvideOrderItemIdentifiersReques();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest4 = new OASProvideOrderItemIdentifiersReques();

        System.assert(provideOrderItemIdentifiersRequest1.equals(provideOrderItemIdentifiersRequest2));
        System.assert(provideOrderItemIdentifiersRequest2.equals(provideOrderItemIdentifiersRequest1));
        System.assert(provideOrderItemIdentifiersRequest3.equals(provideOrderItemIdentifiersRequest4));
        System.assert(provideOrderItemIdentifiersRequest4.equals(provideOrderItemIdentifiersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest1 = OASProvideOrderItemIdentifiersReques.getExample();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest2 = new OASProvideOrderItemIdentifiersReques();

        System.assertEquals(false, provideOrderItemIdentifiersRequest1.equals('foo'));
        System.assertEquals(false, provideOrderItemIdentifiersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest1 = OASProvideOrderItemIdentifiersReques.getExample();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest2 = new OASProvideOrderItemIdentifiersReques();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest3;

        System.assertEquals(false, provideOrderItemIdentifiersRequest1.equals(provideOrderItemIdentifiersRequest3));
        System.assertEquals(false, provideOrderItemIdentifiersRequest2.equals(provideOrderItemIdentifiersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest1 = OASProvideOrderItemIdentifiersReques.getExample();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest2 = new OASProvideOrderItemIdentifiersReques();

        System.assertEquals(provideOrderItemIdentifiersRequest1.hashCode(), provideOrderItemIdentifiersRequest1.hashCode());
        System.assertEquals(provideOrderItemIdentifiersRequest2.hashCode(), provideOrderItemIdentifiersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest1 = OASProvideOrderItemIdentifiersReques.getExample();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest2 = OASProvideOrderItemIdentifiersReques.getExample();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest3 = new OASProvideOrderItemIdentifiersReques();
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest4 = new OASProvideOrderItemIdentifiersReques();

        System.assert(provideOrderItemIdentifiersRequest1.equals(provideOrderItemIdentifiersRequest2));
        System.assert(provideOrderItemIdentifiersRequest3.equals(provideOrderItemIdentifiersRequest4));
        System.assertEquals(provideOrderItemIdentifiersRequest1.hashCode(), provideOrderItemIdentifiersRequest2.hashCode());
        System.assertEquals(provideOrderItemIdentifiersRequest3.hashCode(), provideOrderItemIdentifiersRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProvideOrderItemIdentifiersReques provideOrderItemIdentifiersRequest = new OASProvideOrderItemIdentifiersReques();
        System.assertEquals(new List<OASOrderItemInstanceModificationDTO>(), provideOrderItemIdentifiersRequest.items);
    }
}
