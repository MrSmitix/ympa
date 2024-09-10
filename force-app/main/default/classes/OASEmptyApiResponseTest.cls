@isTest
private class OASEmptyApiResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASEmptyApiResponse emptyApiResponse1 = OASEmptyApiResponse.getExample();
        OASEmptyApiResponse emptyApiResponse2 = emptyApiResponse1;
        OASEmptyApiResponse emptyApiResponse3 = new OASEmptyApiResponse();
        OASEmptyApiResponse emptyApiResponse4 = emptyApiResponse3;

        System.assert(emptyApiResponse1.equals(emptyApiResponse2));
        System.assert(emptyApiResponse2.equals(emptyApiResponse1));
        System.assert(emptyApiResponse1.equals(emptyApiResponse1));
        System.assert(emptyApiResponse3.equals(emptyApiResponse4));
        System.assert(emptyApiResponse4.equals(emptyApiResponse3));
        System.assert(emptyApiResponse3.equals(emptyApiResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEmptyApiResponse emptyApiResponse1 = OASEmptyApiResponse.getExample();
        OASEmptyApiResponse emptyApiResponse2 = OASEmptyApiResponse.getExample();
        OASEmptyApiResponse emptyApiResponse3 = new OASEmptyApiResponse();
        OASEmptyApiResponse emptyApiResponse4 = new OASEmptyApiResponse();

        System.assert(emptyApiResponse1.equals(emptyApiResponse2));
        System.assert(emptyApiResponse2.equals(emptyApiResponse1));
        System.assert(emptyApiResponse3.equals(emptyApiResponse4));
        System.assert(emptyApiResponse4.equals(emptyApiResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEmptyApiResponse emptyApiResponse1 = OASEmptyApiResponse.getExample();
        OASEmptyApiResponse emptyApiResponse2 = new OASEmptyApiResponse();

        System.assertEquals(false, emptyApiResponse1.equals('foo'));
        System.assertEquals(false, emptyApiResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEmptyApiResponse emptyApiResponse1 = OASEmptyApiResponse.getExample();
        OASEmptyApiResponse emptyApiResponse2 = new OASEmptyApiResponse();
        OASEmptyApiResponse emptyApiResponse3;

        System.assertEquals(false, emptyApiResponse1.equals(emptyApiResponse3));
        System.assertEquals(false, emptyApiResponse2.equals(emptyApiResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEmptyApiResponse emptyApiResponse1 = OASEmptyApiResponse.getExample();
        OASEmptyApiResponse emptyApiResponse2 = new OASEmptyApiResponse();

        System.assertEquals(emptyApiResponse1.hashCode(), emptyApiResponse1.hashCode());
        System.assertEquals(emptyApiResponse2.hashCode(), emptyApiResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEmptyApiResponse emptyApiResponse1 = OASEmptyApiResponse.getExample();
        OASEmptyApiResponse emptyApiResponse2 = OASEmptyApiResponse.getExample();
        OASEmptyApiResponse emptyApiResponse3 = new OASEmptyApiResponse();
        OASEmptyApiResponse emptyApiResponse4 = new OASEmptyApiResponse();

        System.assert(emptyApiResponse1.equals(emptyApiResponse2));
        System.assert(emptyApiResponse3.equals(emptyApiResponse4));
        System.assertEquals(emptyApiResponse1.hashCode(), emptyApiResponse2.hashCode());
        System.assertEquals(emptyApiResponse3.hashCode(), emptyApiResponse4.hashCode());
    }
}
