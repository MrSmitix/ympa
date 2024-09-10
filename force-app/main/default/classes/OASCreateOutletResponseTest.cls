@isTest
private class OASCreateOutletResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateOutletResponse createOutletResponse1 = OASCreateOutletResponse.getExample();
        OASCreateOutletResponse createOutletResponse2 = createOutletResponse1;
        OASCreateOutletResponse createOutletResponse3 = new OASCreateOutletResponse();
        OASCreateOutletResponse createOutletResponse4 = createOutletResponse3;

        System.assert(createOutletResponse1.equals(createOutletResponse2));
        System.assert(createOutletResponse2.equals(createOutletResponse1));
        System.assert(createOutletResponse1.equals(createOutletResponse1));
        System.assert(createOutletResponse3.equals(createOutletResponse4));
        System.assert(createOutletResponse4.equals(createOutletResponse3));
        System.assert(createOutletResponse3.equals(createOutletResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateOutletResponse createOutletResponse1 = OASCreateOutletResponse.getExample();
        OASCreateOutletResponse createOutletResponse2 = OASCreateOutletResponse.getExample();
        OASCreateOutletResponse createOutletResponse3 = new OASCreateOutletResponse();
        OASCreateOutletResponse createOutletResponse4 = new OASCreateOutletResponse();

        System.assert(createOutletResponse1.equals(createOutletResponse2));
        System.assert(createOutletResponse2.equals(createOutletResponse1));
        System.assert(createOutletResponse3.equals(createOutletResponse4));
        System.assert(createOutletResponse4.equals(createOutletResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateOutletResponse createOutletResponse1 = OASCreateOutletResponse.getExample();
        OASCreateOutletResponse createOutletResponse2 = new OASCreateOutletResponse();

        System.assertEquals(false, createOutletResponse1.equals('foo'));
        System.assertEquals(false, createOutletResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateOutletResponse createOutletResponse1 = OASCreateOutletResponse.getExample();
        OASCreateOutletResponse createOutletResponse2 = new OASCreateOutletResponse();
        OASCreateOutletResponse createOutletResponse3;

        System.assertEquals(false, createOutletResponse1.equals(createOutletResponse3));
        System.assertEquals(false, createOutletResponse2.equals(createOutletResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateOutletResponse createOutletResponse1 = OASCreateOutletResponse.getExample();
        OASCreateOutletResponse createOutletResponse2 = new OASCreateOutletResponse();

        System.assertEquals(createOutletResponse1.hashCode(), createOutletResponse1.hashCode());
        System.assertEquals(createOutletResponse2.hashCode(), createOutletResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateOutletResponse createOutletResponse1 = OASCreateOutletResponse.getExample();
        OASCreateOutletResponse createOutletResponse2 = OASCreateOutletResponse.getExample();
        OASCreateOutletResponse createOutletResponse3 = new OASCreateOutletResponse();
        OASCreateOutletResponse createOutletResponse4 = new OASCreateOutletResponse();

        System.assert(createOutletResponse1.equals(createOutletResponse2));
        System.assert(createOutletResponse3.equals(createOutletResponse4));
        System.assertEquals(createOutletResponse1.hashCode(), createOutletResponse2.hashCode());
        System.assertEquals(createOutletResponse3.hashCode(), createOutletResponse4.hashCode());
    }
}
