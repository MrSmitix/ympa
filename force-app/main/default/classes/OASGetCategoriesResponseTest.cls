@isTest
private class OASGetCategoriesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCategoriesResponse getCategoriesResponse1 = OASGetCategoriesResponse.getExample();
        OASGetCategoriesResponse getCategoriesResponse2 = getCategoriesResponse1;
        OASGetCategoriesResponse getCategoriesResponse3 = new OASGetCategoriesResponse();
        OASGetCategoriesResponse getCategoriesResponse4 = getCategoriesResponse3;

        System.assert(getCategoriesResponse1.equals(getCategoriesResponse2));
        System.assert(getCategoriesResponse2.equals(getCategoriesResponse1));
        System.assert(getCategoriesResponse1.equals(getCategoriesResponse1));
        System.assert(getCategoriesResponse3.equals(getCategoriesResponse4));
        System.assert(getCategoriesResponse4.equals(getCategoriesResponse3));
        System.assert(getCategoriesResponse3.equals(getCategoriesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCategoriesResponse getCategoriesResponse1 = OASGetCategoriesResponse.getExample();
        OASGetCategoriesResponse getCategoriesResponse2 = OASGetCategoriesResponse.getExample();
        OASGetCategoriesResponse getCategoriesResponse3 = new OASGetCategoriesResponse();
        OASGetCategoriesResponse getCategoriesResponse4 = new OASGetCategoriesResponse();

        System.assert(getCategoriesResponse1.equals(getCategoriesResponse2));
        System.assert(getCategoriesResponse2.equals(getCategoriesResponse1));
        System.assert(getCategoriesResponse3.equals(getCategoriesResponse4));
        System.assert(getCategoriesResponse4.equals(getCategoriesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCategoriesResponse getCategoriesResponse1 = OASGetCategoriesResponse.getExample();
        OASGetCategoriesResponse getCategoriesResponse2 = new OASGetCategoriesResponse();

        System.assertEquals(false, getCategoriesResponse1.equals('foo'));
        System.assertEquals(false, getCategoriesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCategoriesResponse getCategoriesResponse1 = OASGetCategoriesResponse.getExample();
        OASGetCategoriesResponse getCategoriesResponse2 = new OASGetCategoriesResponse();
        OASGetCategoriesResponse getCategoriesResponse3;

        System.assertEquals(false, getCategoriesResponse1.equals(getCategoriesResponse3));
        System.assertEquals(false, getCategoriesResponse2.equals(getCategoriesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCategoriesResponse getCategoriesResponse1 = OASGetCategoriesResponse.getExample();
        OASGetCategoriesResponse getCategoriesResponse2 = new OASGetCategoriesResponse();

        System.assertEquals(getCategoriesResponse1.hashCode(), getCategoriesResponse1.hashCode());
        System.assertEquals(getCategoriesResponse2.hashCode(), getCategoriesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCategoriesResponse getCategoriesResponse1 = OASGetCategoriesResponse.getExample();
        OASGetCategoriesResponse getCategoriesResponse2 = OASGetCategoriesResponse.getExample();
        OASGetCategoriesResponse getCategoriesResponse3 = new OASGetCategoriesResponse();
        OASGetCategoriesResponse getCategoriesResponse4 = new OASGetCategoriesResponse();

        System.assert(getCategoriesResponse1.equals(getCategoriesResponse2));
        System.assert(getCategoriesResponse3.equals(getCategoriesResponse4));
        System.assertEquals(getCategoriesResponse1.hashCode(), getCategoriesResponse2.hashCode());
        System.assertEquals(getCategoriesResponse3.hashCode(), getCategoriesResponse4.hashCode());
    }
}
