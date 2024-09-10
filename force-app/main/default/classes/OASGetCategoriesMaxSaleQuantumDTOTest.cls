@isTest
private class OASGetCategoriesMaxSaleQuantumDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO1 = OASGetCategoriesMaxSaleQuantumDTO.getExample();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO2 = getCategoriesMaxSaleQuantumDTO1;
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO3 = new OASGetCategoriesMaxSaleQuantumDTO();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO4 = getCategoriesMaxSaleQuantumDTO3;

        System.assert(getCategoriesMaxSaleQuantumDTO1.equals(getCategoriesMaxSaleQuantumDTO2));
        System.assert(getCategoriesMaxSaleQuantumDTO2.equals(getCategoriesMaxSaleQuantumDTO1));
        System.assert(getCategoriesMaxSaleQuantumDTO1.equals(getCategoriesMaxSaleQuantumDTO1));
        System.assert(getCategoriesMaxSaleQuantumDTO3.equals(getCategoriesMaxSaleQuantumDTO4));
        System.assert(getCategoriesMaxSaleQuantumDTO4.equals(getCategoriesMaxSaleQuantumDTO3));
        System.assert(getCategoriesMaxSaleQuantumDTO3.equals(getCategoriesMaxSaleQuantumDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO1 = OASGetCategoriesMaxSaleQuantumDTO.getExample();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO2 = OASGetCategoriesMaxSaleQuantumDTO.getExample();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO3 = new OASGetCategoriesMaxSaleQuantumDTO();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO4 = new OASGetCategoriesMaxSaleQuantumDTO();

        System.assert(getCategoriesMaxSaleQuantumDTO1.equals(getCategoriesMaxSaleQuantumDTO2));
        System.assert(getCategoriesMaxSaleQuantumDTO2.equals(getCategoriesMaxSaleQuantumDTO1));
        System.assert(getCategoriesMaxSaleQuantumDTO3.equals(getCategoriesMaxSaleQuantumDTO4));
        System.assert(getCategoriesMaxSaleQuantumDTO4.equals(getCategoriesMaxSaleQuantumDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO1 = OASGetCategoriesMaxSaleQuantumDTO.getExample();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO2 = new OASGetCategoriesMaxSaleQuantumDTO();

        System.assertEquals(false, getCategoriesMaxSaleQuantumDTO1.equals('foo'));
        System.assertEquals(false, getCategoriesMaxSaleQuantumDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO1 = OASGetCategoriesMaxSaleQuantumDTO.getExample();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO2 = new OASGetCategoriesMaxSaleQuantumDTO();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO3;

        System.assertEquals(false, getCategoriesMaxSaleQuantumDTO1.equals(getCategoriesMaxSaleQuantumDTO3));
        System.assertEquals(false, getCategoriesMaxSaleQuantumDTO2.equals(getCategoriesMaxSaleQuantumDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO1 = OASGetCategoriesMaxSaleQuantumDTO.getExample();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO2 = new OASGetCategoriesMaxSaleQuantumDTO();

        System.assertEquals(getCategoriesMaxSaleQuantumDTO1.hashCode(), getCategoriesMaxSaleQuantumDTO1.hashCode());
        System.assertEquals(getCategoriesMaxSaleQuantumDTO2.hashCode(), getCategoriesMaxSaleQuantumDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO1 = OASGetCategoriesMaxSaleQuantumDTO.getExample();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO2 = OASGetCategoriesMaxSaleQuantumDTO.getExample();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO3 = new OASGetCategoriesMaxSaleQuantumDTO();
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO4 = new OASGetCategoriesMaxSaleQuantumDTO();

        System.assert(getCategoriesMaxSaleQuantumDTO1.equals(getCategoriesMaxSaleQuantumDTO2));
        System.assert(getCategoriesMaxSaleQuantumDTO3.equals(getCategoriesMaxSaleQuantumDTO4));
        System.assertEquals(getCategoriesMaxSaleQuantumDTO1.hashCode(), getCategoriesMaxSaleQuantumDTO2.hashCode());
        System.assertEquals(getCategoriesMaxSaleQuantumDTO3.hashCode(), getCategoriesMaxSaleQuantumDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO = new OASGetCategoriesMaxSaleQuantumDTO();
        System.assertEquals(new List<OASMaxSaleQuantumDTO>(), getCategoriesMaxSaleQuantumDTO.results);
        System.assertEquals(new List<OASCategoryErrorDTO>(), getCategoriesMaxSaleQuantumDTO.errors);
    }
}
