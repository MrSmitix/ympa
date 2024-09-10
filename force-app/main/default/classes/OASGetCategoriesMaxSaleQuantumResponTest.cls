@isTest
private class OASGetCategoriesMaxSaleQuantumResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse1 = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse2 = getCategoriesMaxSaleQuantumResponse1;
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse3 = new OASGetCategoriesMaxSaleQuantumRespon();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse4 = getCategoriesMaxSaleQuantumResponse3;

        System.assert(getCategoriesMaxSaleQuantumResponse1.equals(getCategoriesMaxSaleQuantumResponse2));
        System.assert(getCategoriesMaxSaleQuantumResponse2.equals(getCategoriesMaxSaleQuantumResponse1));
        System.assert(getCategoriesMaxSaleQuantumResponse1.equals(getCategoriesMaxSaleQuantumResponse1));
        System.assert(getCategoriesMaxSaleQuantumResponse3.equals(getCategoriesMaxSaleQuantumResponse4));
        System.assert(getCategoriesMaxSaleQuantumResponse4.equals(getCategoriesMaxSaleQuantumResponse3));
        System.assert(getCategoriesMaxSaleQuantumResponse3.equals(getCategoriesMaxSaleQuantumResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse1 = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse2 = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse3 = new OASGetCategoriesMaxSaleQuantumRespon();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse4 = new OASGetCategoriesMaxSaleQuantumRespon();

        System.assert(getCategoriesMaxSaleQuantumResponse1.equals(getCategoriesMaxSaleQuantumResponse2));
        System.assert(getCategoriesMaxSaleQuantumResponse2.equals(getCategoriesMaxSaleQuantumResponse1));
        System.assert(getCategoriesMaxSaleQuantumResponse3.equals(getCategoriesMaxSaleQuantumResponse4));
        System.assert(getCategoriesMaxSaleQuantumResponse4.equals(getCategoriesMaxSaleQuantumResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse1 = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse2 = new OASGetCategoriesMaxSaleQuantumRespon();

        System.assertEquals(false, getCategoriesMaxSaleQuantumResponse1.equals('foo'));
        System.assertEquals(false, getCategoriesMaxSaleQuantumResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse1 = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse2 = new OASGetCategoriesMaxSaleQuantumRespon();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse3;

        System.assertEquals(false, getCategoriesMaxSaleQuantumResponse1.equals(getCategoriesMaxSaleQuantumResponse3));
        System.assertEquals(false, getCategoriesMaxSaleQuantumResponse2.equals(getCategoriesMaxSaleQuantumResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse1 = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse2 = new OASGetCategoriesMaxSaleQuantumRespon();

        System.assertEquals(getCategoriesMaxSaleQuantumResponse1.hashCode(), getCategoriesMaxSaleQuantumResponse1.hashCode());
        System.assertEquals(getCategoriesMaxSaleQuantumResponse2.hashCode(), getCategoriesMaxSaleQuantumResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse1 = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse2 = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse3 = new OASGetCategoriesMaxSaleQuantumRespon();
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse4 = new OASGetCategoriesMaxSaleQuantumRespon();

        System.assert(getCategoriesMaxSaleQuantumResponse1.equals(getCategoriesMaxSaleQuantumResponse2));
        System.assert(getCategoriesMaxSaleQuantumResponse3.equals(getCategoriesMaxSaleQuantumResponse4));
        System.assertEquals(getCategoriesMaxSaleQuantumResponse1.hashCode(), getCategoriesMaxSaleQuantumResponse2.hashCode());
        System.assertEquals(getCategoriesMaxSaleQuantumResponse3.hashCode(), getCategoriesMaxSaleQuantumResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetCategoriesMaxSaleQuantumRespon getCategoriesMaxSaleQuantumResponse = new OASGetCategoriesMaxSaleQuantumRespon();
        System.assertEquals(new List<OASMaxSaleQuantumDTO>(), getCategoriesMaxSaleQuantumResponse.results);
        System.assertEquals(new List<OASCategoryErrorDTO>(), getCategoriesMaxSaleQuantumResponse.errors);
        System.assertEquals(null, getCategoriesMaxSaleQuantumResponse.status);
    }
}
