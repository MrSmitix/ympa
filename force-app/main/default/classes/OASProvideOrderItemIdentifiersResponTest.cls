@isTest
private class OASProvideOrderItemIdentifiersResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse1 = OASProvideOrderItemIdentifiersRespon.getExample();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse2 = provideOrderItemIdentifiersResponse1;
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse3 = new OASProvideOrderItemIdentifiersRespon();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse4 = provideOrderItemIdentifiersResponse3;

        System.assert(provideOrderItemIdentifiersResponse1.equals(provideOrderItemIdentifiersResponse2));
        System.assert(provideOrderItemIdentifiersResponse2.equals(provideOrderItemIdentifiersResponse1));
        System.assert(provideOrderItemIdentifiersResponse1.equals(provideOrderItemIdentifiersResponse1));
        System.assert(provideOrderItemIdentifiersResponse3.equals(provideOrderItemIdentifiersResponse4));
        System.assert(provideOrderItemIdentifiersResponse4.equals(provideOrderItemIdentifiersResponse3));
        System.assert(provideOrderItemIdentifiersResponse3.equals(provideOrderItemIdentifiersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse1 = OASProvideOrderItemIdentifiersRespon.getExample();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse2 = OASProvideOrderItemIdentifiersRespon.getExample();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse3 = new OASProvideOrderItemIdentifiersRespon();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse4 = new OASProvideOrderItemIdentifiersRespon();

        System.assert(provideOrderItemIdentifiersResponse1.equals(provideOrderItemIdentifiersResponse2));
        System.assert(provideOrderItemIdentifiersResponse2.equals(provideOrderItemIdentifiersResponse1));
        System.assert(provideOrderItemIdentifiersResponse3.equals(provideOrderItemIdentifiersResponse4));
        System.assert(provideOrderItemIdentifiersResponse4.equals(provideOrderItemIdentifiersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse1 = OASProvideOrderItemIdentifiersRespon.getExample();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse2 = new OASProvideOrderItemIdentifiersRespon();

        System.assertEquals(false, provideOrderItemIdentifiersResponse1.equals('foo'));
        System.assertEquals(false, provideOrderItemIdentifiersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse1 = OASProvideOrderItemIdentifiersRespon.getExample();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse2 = new OASProvideOrderItemIdentifiersRespon();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse3;

        System.assertEquals(false, provideOrderItemIdentifiersResponse1.equals(provideOrderItemIdentifiersResponse3));
        System.assertEquals(false, provideOrderItemIdentifiersResponse2.equals(provideOrderItemIdentifiersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse1 = OASProvideOrderItemIdentifiersRespon.getExample();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse2 = new OASProvideOrderItemIdentifiersRespon();

        System.assertEquals(provideOrderItemIdentifiersResponse1.hashCode(), provideOrderItemIdentifiersResponse1.hashCode());
        System.assertEquals(provideOrderItemIdentifiersResponse2.hashCode(), provideOrderItemIdentifiersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse1 = OASProvideOrderItemIdentifiersRespon.getExample();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse2 = OASProvideOrderItemIdentifiersRespon.getExample();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse3 = new OASProvideOrderItemIdentifiersRespon();
        OASProvideOrderItemIdentifiersRespon provideOrderItemIdentifiersResponse4 = new OASProvideOrderItemIdentifiersRespon();

        System.assert(provideOrderItemIdentifiersResponse1.equals(provideOrderItemIdentifiersResponse2));
        System.assert(provideOrderItemIdentifiersResponse3.equals(provideOrderItemIdentifiersResponse4));
        System.assertEquals(provideOrderItemIdentifiersResponse1.hashCode(), provideOrderItemIdentifiersResponse2.hashCode());
        System.assertEquals(provideOrderItemIdentifiersResponse3.hashCode(), provideOrderItemIdentifiersResponse4.hashCode());
    }
}
