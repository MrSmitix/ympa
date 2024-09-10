@isTest
private class OASGetCategoriesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCategoriesRequest getCategoriesRequest1 = OASGetCategoriesRequest.getExample();
        OASGetCategoriesRequest getCategoriesRequest2 = getCategoriesRequest1;
        OASGetCategoriesRequest getCategoriesRequest3 = new OASGetCategoriesRequest();
        OASGetCategoriesRequest getCategoriesRequest4 = getCategoriesRequest3;

        System.assert(getCategoriesRequest1.equals(getCategoriesRequest2));
        System.assert(getCategoriesRequest2.equals(getCategoriesRequest1));
        System.assert(getCategoriesRequest1.equals(getCategoriesRequest1));
        System.assert(getCategoriesRequest3.equals(getCategoriesRequest4));
        System.assert(getCategoriesRequest4.equals(getCategoriesRequest3));
        System.assert(getCategoriesRequest3.equals(getCategoriesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCategoriesRequest getCategoriesRequest1 = OASGetCategoriesRequest.getExample();
        OASGetCategoriesRequest getCategoriesRequest2 = OASGetCategoriesRequest.getExample();
        OASGetCategoriesRequest getCategoriesRequest3 = new OASGetCategoriesRequest();
        OASGetCategoriesRequest getCategoriesRequest4 = new OASGetCategoriesRequest();

        System.assert(getCategoriesRequest1.equals(getCategoriesRequest2));
        System.assert(getCategoriesRequest2.equals(getCategoriesRequest1));
        System.assert(getCategoriesRequest3.equals(getCategoriesRequest4));
        System.assert(getCategoriesRequest4.equals(getCategoriesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCategoriesRequest getCategoriesRequest1 = OASGetCategoriesRequest.getExample();
        OASGetCategoriesRequest getCategoriesRequest2 = new OASGetCategoriesRequest();

        System.assertEquals(false, getCategoriesRequest1.equals('foo'));
        System.assertEquals(false, getCategoriesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCategoriesRequest getCategoriesRequest1 = OASGetCategoriesRequest.getExample();
        OASGetCategoriesRequest getCategoriesRequest2 = new OASGetCategoriesRequest();
        OASGetCategoriesRequest getCategoriesRequest3;

        System.assertEquals(false, getCategoriesRequest1.equals(getCategoriesRequest3));
        System.assertEquals(false, getCategoriesRequest2.equals(getCategoriesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCategoriesRequest getCategoriesRequest1 = OASGetCategoriesRequest.getExample();
        OASGetCategoriesRequest getCategoriesRequest2 = new OASGetCategoriesRequest();

        System.assertEquals(getCategoriesRequest1.hashCode(), getCategoriesRequest1.hashCode());
        System.assertEquals(getCategoriesRequest2.hashCode(), getCategoriesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCategoriesRequest getCategoriesRequest1 = OASGetCategoriesRequest.getExample();
        OASGetCategoriesRequest getCategoriesRequest2 = OASGetCategoriesRequest.getExample();
        OASGetCategoriesRequest getCategoriesRequest3 = new OASGetCategoriesRequest();
        OASGetCategoriesRequest getCategoriesRequest4 = new OASGetCategoriesRequest();

        System.assert(getCategoriesRequest1.equals(getCategoriesRequest2));
        System.assert(getCategoriesRequest3.equals(getCategoriesRequest4));
        System.assertEquals(getCategoriesRequest1.hashCode(), getCategoriesRequest2.hashCode());
        System.assertEquals(getCategoriesRequest3.hashCode(), getCategoriesRequest4.hashCode());
    }
}
