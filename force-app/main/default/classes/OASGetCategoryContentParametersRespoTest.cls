@isTest
private class OASGetCategoryContentParametersRespoTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse1 = OASGetCategoryContentParametersRespo.getExample();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse2 = getCategoryContentParametersResponse1;
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse3 = new OASGetCategoryContentParametersRespo();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse4 = getCategoryContentParametersResponse3;

        System.assert(getCategoryContentParametersResponse1.equals(getCategoryContentParametersResponse2));
        System.assert(getCategoryContentParametersResponse2.equals(getCategoryContentParametersResponse1));
        System.assert(getCategoryContentParametersResponse1.equals(getCategoryContentParametersResponse1));
        System.assert(getCategoryContentParametersResponse3.equals(getCategoryContentParametersResponse4));
        System.assert(getCategoryContentParametersResponse4.equals(getCategoryContentParametersResponse3));
        System.assert(getCategoryContentParametersResponse3.equals(getCategoryContentParametersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse1 = OASGetCategoryContentParametersRespo.getExample();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse2 = OASGetCategoryContentParametersRespo.getExample();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse3 = new OASGetCategoryContentParametersRespo();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse4 = new OASGetCategoryContentParametersRespo();

        System.assert(getCategoryContentParametersResponse1.equals(getCategoryContentParametersResponse2));
        System.assert(getCategoryContentParametersResponse2.equals(getCategoryContentParametersResponse1));
        System.assert(getCategoryContentParametersResponse3.equals(getCategoryContentParametersResponse4));
        System.assert(getCategoryContentParametersResponse4.equals(getCategoryContentParametersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse1 = OASGetCategoryContentParametersRespo.getExample();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse2 = new OASGetCategoryContentParametersRespo();

        System.assertEquals(false, getCategoryContentParametersResponse1.equals('foo'));
        System.assertEquals(false, getCategoryContentParametersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse1 = OASGetCategoryContentParametersRespo.getExample();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse2 = new OASGetCategoryContentParametersRespo();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse3;

        System.assertEquals(false, getCategoryContentParametersResponse1.equals(getCategoryContentParametersResponse3));
        System.assertEquals(false, getCategoryContentParametersResponse2.equals(getCategoryContentParametersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse1 = OASGetCategoryContentParametersRespo.getExample();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse2 = new OASGetCategoryContentParametersRespo();

        System.assertEquals(getCategoryContentParametersResponse1.hashCode(), getCategoryContentParametersResponse1.hashCode());
        System.assertEquals(getCategoryContentParametersResponse2.hashCode(), getCategoryContentParametersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse1 = OASGetCategoryContentParametersRespo.getExample();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse2 = OASGetCategoryContentParametersRespo.getExample();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse3 = new OASGetCategoryContentParametersRespo();
        OASGetCategoryContentParametersRespo getCategoryContentParametersResponse4 = new OASGetCategoryContentParametersRespo();

        System.assert(getCategoryContentParametersResponse1.equals(getCategoryContentParametersResponse2));
        System.assert(getCategoryContentParametersResponse3.equals(getCategoryContentParametersResponse4));
        System.assertEquals(getCategoryContentParametersResponse1.hashCode(), getCategoryContentParametersResponse2.hashCode());
        System.assertEquals(getCategoryContentParametersResponse3.hashCode(), getCategoryContentParametersResponse4.hashCode());
    }
}
