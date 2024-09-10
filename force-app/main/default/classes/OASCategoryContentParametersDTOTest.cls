@isTest
private class OASCategoryContentParametersDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCategoryContentParametersDTO categoryContentParametersDTO1 = OASCategoryContentParametersDTO.getExample();
        OASCategoryContentParametersDTO categoryContentParametersDTO2 = categoryContentParametersDTO1;
        OASCategoryContentParametersDTO categoryContentParametersDTO3 = new OASCategoryContentParametersDTO();
        OASCategoryContentParametersDTO categoryContentParametersDTO4 = categoryContentParametersDTO3;

        System.assert(categoryContentParametersDTO1.equals(categoryContentParametersDTO2));
        System.assert(categoryContentParametersDTO2.equals(categoryContentParametersDTO1));
        System.assert(categoryContentParametersDTO1.equals(categoryContentParametersDTO1));
        System.assert(categoryContentParametersDTO3.equals(categoryContentParametersDTO4));
        System.assert(categoryContentParametersDTO4.equals(categoryContentParametersDTO3));
        System.assert(categoryContentParametersDTO3.equals(categoryContentParametersDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCategoryContentParametersDTO categoryContentParametersDTO1 = OASCategoryContentParametersDTO.getExample();
        OASCategoryContentParametersDTO categoryContentParametersDTO2 = OASCategoryContentParametersDTO.getExample();
        OASCategoryContentParametersDTO categoryContentParametersDTO3 = new OASCategoryContentParametersDTO();
        OASCategoryContentParametersDTO categoryContentParametersDTO4 = new OASCategoryContentParametersDTO();

        System.assert(categoryContentParametersDTO1.equals(categoryContentParametersDTO2));
        System.assert(categoryContentParametersDTO2.equals(categoryContentParametersDTO1));
        System.assert(categoryContentParametersDTO3.equals(categoryContentParametersDTO4));
        System.assert(categoryContentParametersDTO4.equals(categoryContentParametersDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCategoryContentParametersDTO categoryContentParametersDTO1 = OASCategoryContentParametersDTO.getExample();
        OASCategoryContentParametersDTO categoryContentParametersDTO2 = new OASCategoryContentParametersDTO();

        System.assertEquals(false, categoryContentParametersDTO1.equals('foo'));
        System.assertEquals(false, categoryContentParametersDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCategoryContentParametersDTO categoryContentParametersDTO1 = OASCategoryContentParametersDTO.getExample();
        OASCategoryContentParametersDTO categoryContentParametersDTO2 = new OASCategoryContentParametersDTO();
        OASCategoryContentParametersDTO categoryContentParametersDTO3;

        System.assertEquals(false, categoryContentParametersDTO1.equals(categoryContentParametersDTO3));
        System.assertEquals(false, categoryContentParametersDTO2.equals(categoryContentParametersDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCategoryContentParametersDTO categoryContentParametersDTO1 = OASCategoryContentParametersDTO.getExample();
        OASCategoryContentParametersDTO categoryContentParametersDTO2 = new OASCategoryContentParametersDTO();

        System.assertEquals(categoryContentParametersDTO1.hashCode(), categoryContentParametersDTO1.hashCode());
        System.assertEquals(categoryContentParametersDTO2.hashCode(), categoryContentParametersDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCategoryContentParametersDTO categoryContentParametersDTO1 = OASCategoryContentParametersDTO.getExample();
        OASCategoryContentParametersDTO categoryContentParametersDTO2 = OASCategoryContentParametersDTO.getExample();
        OASCategoryContentParametersDTO categoryContentParametersDTO3 = new OASCategoryContentParametersDTO();
        OASCategoryContentParametersDTO categoryContentParametersDTO4 = new OASCategoryContentParametersDTO();

        System.assert(categoryContentParametersDTO1.equals(categoryContentParametersDTO2));
        System.assert(categoryContentParametersDTO3.equals(categoryContentParametersDTO4));
        System.assertEquals(categoryContentParametersDTO1.hashCode(), categoryContentParametersDTO2.hashCode());
        System.assertEquals(categoryContentParametersDTO3.hashCode(), categoryContentParametersDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCategoryContentParametersDTO categoryContentParametersDTO = new OASCategoryContentParametersDTO();
        System.assertEquals(new List<OASCategoryParameterDTO>(), categoryContentParametersDTO.parameters);
        System.assertEquals(null, categoryContentParametersDTO.categoryId);
    }
}
