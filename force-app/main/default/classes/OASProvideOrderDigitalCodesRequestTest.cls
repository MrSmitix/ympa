@isTest
private class OASProvideOrderDigitalCodesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest1 = OASProvideOrderDigitalCodesRequest.getExample();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest2 = provideOrderDigitalCodesRequest1;
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest3 = new OASProvideOrderDigitalCodesRequest();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest4 = provideOrderDigitalCodesRequest3;

        System.assert(provideOrderDigitalCodesRequest1.equals(provideOrderDigitalCodesRequest2));
        System.assert(provideOrderDigitalCodesRequest2.equals(provideOrderDigitalCodesRequest1));
        System.assert(provideOrderDigitalCodesRequest1.equals(provideOrderDigitalCodesRequest1));
        System.assert(provideOrderDigitalCodesRequest3.equals(provideOrderDigitalCodesRequest4));
        System.assert(provideOrderDigitalCodesRequest4.equals(provideOrderDigitalCodesRequest3));
        System.assert(provideOrderDigitalCodesRequest3.equals(provideOrderDigitalCodesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest1 = OASProvideOrderDigitalCodesRequest.getExample();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest2 = OASProvideOrderDigitalCodesRequest.getExample();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest3 = new OASProvideOrderDigitalCodesRequest();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest4 = new OASProvideOrderDigitalCodesRequest();

        System.assert(provideOrderDigitalCodesRequest1.equals(provideOrderDigitalCodesRequest2));
        System.assert(provideOrderDigitalCodesRequest2.equals(provideOrderDigitalCodesRequest1));
        System.assert(provideOrderDigitalCodesRequest3.equals(provideOrderDigitalCodesRequest4));
        System.assert(provideOrderDigitalCodesRequest4.equals(provideOrderDigitalCodesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest1 = OASProvideOrderDigitalCodesRequest.getExample();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest2 = new OASProvideOrderDigitalCodesRequest();

        System.assertEquals(false, provideOrderDigitalCodesRequest1.equals('foo'));
        System.assertEquals(false, provideOrderDigitalCodesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest1 = OASProvideOrderDigitalCodesRequest.getExample();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest2 = new OASProvideOrderDigitalCodesRequest();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest3;

        System.assertEquals(false, provideOrderDigitalCodesRequest1.equals(provideOrderDigitalCodesRequest3));
        System.assertEquals(false, provideOrderDigitalCodesRequest2.equals(provideOrderDigitalCodesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest1 = OASProvideOrderDigitalCodesRequest.getExample();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest2 = new OASProvideOrderDigitalCodesRequest();

        System.assertEquals(provideOrderDigitalCodesRequest1.hashCode(), provideOrderDigitalCodesRequest1.hashCode());
        System.assertEquals(provideOrderDigitalCodesRequest2.hashCode(), provideOrderDigitalCodesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest1 = OASProvideOrderDigitalCodesRequest.getExample();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest2 = OASProvideOrderDigitalCodesRequest.getExample();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest3 = new OASProvideOrderDigitalCodesRequest();
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest4 = new OASProvideOrderDigitalCodesRequest();

        System.assert(provideOrderDigitalCodesRequest1.equals(provideOrderDigitalCodesRequest2));
        System.assert(provideOrderDigitalCodesRequest3.equals(provideOrderDigitalCodesRequest4));
        System.assertEquals(provideOrderDigitalCodesRequest1.hashCode(), provideOrderDigitalCodesRequest2.hashCode());
        System.assertEquals(provideOrderDigitalCodesRequest3.hashCode(), provideOrderDigitalCodesRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest = new OASProvideOrderDigitalCodesRequest();
        System.assertEquals(new List<OASOrderDigitalItemDTO>(), provideOrderDigitalCodesRequest.items);
    }
}
