@isTest
private class OASGetCategoriesMaxSaleQuantumRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest1 = OASGetCategoriesMaxSaleQuantumReques.getExample();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest2 = getCategoriesMaxSaleQuantumRequest1;
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest3 = new OASGetCategoriesMaxSaleQuantumReques();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest4 = getCategoriesMaxSaleQuantumRequest3;

        System.assert(getCategoriesMaxSaleQuantumRequest1.equals(getCategoriesMaxSaleQuantumRequest2));
        System.assert(getCategoriesMaxSaleQuantumRequest2.equals(getCategoriesMaxSaleQuantumRequest1));
        System.assert(getCategoriesMaxSaleQuantumRequest1.equals(getCategoriesMaxSaleQuantumRequest1));
        System.assert(getCategoriesMaxSaleQuantumRequest3.equals(getCategoriesMaxSaleQuantumRequest4));
        System.assert(getCategoriesMaxSaleQuantumRequest4.equals(getCategoriesMaxSaleQuantumRequest3));
        System.assert(getCategoriesMaxSaleQuantumRequest3.equals(getCategoriesMaxSaleQuantumRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest1 = OASGetCategoriesMaxSaleQuantumReques.getExample();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest2 = OASGetCategoriesMaxSaleQuantumReques.getExample();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest3 = new OASGetCategoriesMaxSaleQuantumReques();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest4 = new OASGetCategoriesMaxSaleQuantumReques();

        System.assert(getCategoriesMaxSaleQuantumRequest1.equals(getCategoriesMaxSaleQuantumRequest2));
        System.assert(getCategoriesMaxSaleQuantumRequest2.equals(getCategoriesMaxSaleQuantumRequest1));
        System.assert(getCategoriesMaxSaleQuantumRequest3.equals(getCategoriesMaxSaleQuantumRequest4));
        System.assert(getCategoriesMaxSaleQuantumRequest4.equals(getCategoriesMaxSaleQuantumRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest1 = OASGetCategoriesMaxSaleQuantumReques.getExample();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest2 = new OASGetCategoriesMaxSaleQuantumReques();

        System.assertEquals(false, getCategoriesMaxSaleQuantumRequest1.equals('foo'));
        System.assertEquals(false, getCategoriesMaxSaleQuantumRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest1 = OASGetCategoriesMaxSaleQuantumReques.getExample();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest2 = new OASGetCategoriesMaxSaleQuantumReques();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest3;

        System.assertEquals(false, getCategoriesMaxSaleQuantumRequest1.equals(getCategoriesMaxSaleQuantumRequest3));
        System.assertEquals(false, getCategoriesMaxSaleQuantumRequest2.equals(getCategoriesMaxSaleQuantumRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest1 = OASGetCategoriesMaxSaleQuantumReques.getExample();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest2 = new OASGetCategoriesMaxSaleQuantumReques();

        System.assertEquals(getCategoriesMaxSaleQuantumRequest1.hashCode(), getCategoriesMaxSaleQuantumRequest1.hashCode());
        System.assertEquals(getCategoriesMaxSaleQuantumRequest2.hashCode(), getCategoriesMaxSaleQuantumRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest1 = OASGetCategoriesMaxSaleQuantumReques.getExample();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest2 = OASGetCategoriesMaxSaleQuantumReques.getExample();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest3 = new OASGetCategoriesMaxSaleQuantumReques();
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest4 = new OASGetCategoriesMaxSaleQuantumReques();

        System.assert(getCategoriesMaxSaleQuantumRequest1.equals(getCategoriesMaxSaleQuantumRequest2));
        System.assert(getCategoriesMaxSaleQuantumRequest3.equals(getCategoriesMaxSaleQuantumRequest4));
        System.assertEquals(getCategoriesMaxSaleQuantumRequest1.hashCode(), getCategoriesMaxSaleQuantumRequest2.hashCode());
        System.assertEquals(getCategoriesMaxSaleQuantumRequest3.hashCode(), getCategoriesMaxSaleQuantumRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetCategoriesMaxSaleQuantumReques getCategoriesMaxSaleQuantumRequest = new OASGetCategoriesMaxSaleQuantumReques();
        System.assertEquals(new List<Long>(), getCategoriesMaxSaleQuantumRequest.marketCategoryIds);
    }
}
