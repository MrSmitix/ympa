@isTest
private class OASCategoryParameterUnitDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCategoryParameterUnitDTO categoryParameterUnitDTO1 = OASCategoryParameterUnitDTO.getExample();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO2 = categoryParameterUnitDTO1;
        OASCategoryParameterUnitDTO categoryParameterUnitDTO3 = new OASCategoryParameterUnitDTO();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO4 = categoryParameterUnitDTO3;

        System.assert(categoryParameterUnitDTO1.equals(categoryParameterUnitDTO2));
        System.assert(categoryParameterUnitDTO2.equals(categoryParameterUnitDTO1));
        System.assert(categoryParameterUnitDTO1.equals(categoryParameterUnitDTO1));
        System.assert(categoryParameterUnitDTO3.equals(categoryParameterUnitDTO4));
        System.assert(categoryParameterUnitDTO4.equals(categoryParameterUnitDTO3));
        System.assert(categoryParameterUnitDTO3.equals(categoryParameterUnitDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCategoryParameterUnitDTO categoryParameterUnitDTO1 = OASCategoryParameterUnitDTO.getExample();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO2 = OASCategoryParameterUnitDTO.getExample();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO3 = new OASCategoryParameterUnitDTO();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO4 = new OASCategoryParameterUnitDTO();

        System.assert(categoryParameterUnitDTO1.equals(categoryParameterUnitDTO2));
        System.assert(categoryParameterUnitDTO2.equals(categoryParameterUnitDTO1));
        System.assert(categoryParameterUnitDTO3.equals(categoryParameterUnitDTO4));
        System.assert(categoryParameterUnitDTO4.equals(categoryParameterUnitDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCategoryParameterUnitDTO categoryParameterUnitDTO1 = OASCategoryParameterUnitDTO.getExample();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO2 = new OASCategoryParameterUnitDTO();

        System.assertEquals(false, categoryParameterUnitDTO1.equals('foo'));
        System.assertEquals(false, categoryParameterUnitDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCategoryParameterUnitDTO categoryParameterUnitDTO1 = OASCategoryParameterUnitDTO.getExample();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO2 = new OASCategoryParameterUnitDTO();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO3;

        System.assertEquals(false, categoryParameterUnitDTO1.equals(categoryParameterUnitDTO3));
        System.assertEquals(false, categoryParameterUnitDTO2.equals(categoryParameterUnitDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCategoryParameterUnitDTO categoryParameterUnitDTO1 = OASCategoryParameterUnitDTO.getExample();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO2 = new OASCategoryParameterUnitDTO();

        System.assertEquals(categoryParameterUnitDTO1.hashCode(), categoryParameterUnitDTO1.hashCode());
        System.assertEquals(categoryParameterUnitDTO2.hashCode(), categoryParameterUnitDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCategoryParameterUnitDTO categoryParameterUnitDTO1 = OASCategoryParameterUnitDTO.getExample();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO2 = OASCategoryParameterUnitDTO.getExample();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO3 = new OASCategoryParameterUnitDTO();
        OASCategoryParameterUnitDTO categoryParameterUnitDTO4 = new OASCategoryParameterUnitDTO();

        System.assert(categoryParameterUnitDTO1.equals(categoryParameterUnitDTO2));
        System.assert(categoryParameterUnitDTO3.equals(categoryParameterUnitDTO4));
        System.assertEquals(categoryParameterUnitDTO1.hashCode(), categoryParameterUnitDTO2.hashCode());
        System.assertEquals(categoryParameterUnitDTO3.hashCode(), categoryParameterUnitDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCategoryParameterUnitDTO categoryParameterUnitDTO = new OASCategoryParameterUnitDTO();
        System.assertEquals(new List<OASUnitDTO>(), categoryParameterUnitDTO.units);
        System.assertEquals(null, categoryParameterUnitDTO.defaultUnitId);
    }
}
