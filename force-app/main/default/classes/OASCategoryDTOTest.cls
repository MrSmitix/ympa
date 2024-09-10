@isTest
private class OASCategoryDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCategoryDTO categoryDTO1 = OASCategoryDTO.getExample();
        OASCategoryDTO categoryDTO2 = categoryDTO1;
        OASCategoryDTO categoryDTO3 = new OASCategoryDTO();
        OASCategoryDTO categoryDTO4 = categoryDTO3;

        System.assert(categoryDTO1.equals(categoryDTO2));
        System.assert(categoryDTO2.equals(categoryDTO1));
        System.assert(categoryDTO1.equals(categoryDTO1));
        System.assert(categoryDTO3.equals(categoryDTO4));
        System.assert(categoryDTO4.equals(categoryDTO3));
        System.assert(categoryDTO3.equals(categoryDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCategoryDTO categoryDTO1 = OASCategoryDTO.getExample();
        OASCategoryDTO categoryDTO2 = OASCategoryDTO.getExample();
        OASCategoryDTO categoryDTO3 = new OASCategoryDTO();
        OASCategoryDTO categoryDTO4 = new OASCategoryDTO();

        System.assert(categoryDTO1.equals(categoryDTO2));
        System.assert(categoryDTO2.equals(categoryDTO1));
        System.assert(categoryDTO3.equals(categoryDTO4));
        System.assert(categoryDTO4.equals(categoryDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCategoryDTO categoryDTO1 = OASCategoryDTO.getExample();
        OASCategoryDTO categoryDTO2 = new OASCategoryDTO();

        System.assertEquals(false, categoryDTO1.equals('foo'));
        System.assertEquals(false, categoryDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCategoryDTO categoryDTO1 = OASCategoryDTO.getExample();
        OASCategoryDTO categoryDTO2 = new OASCategoryDTO();
        OASCategoryDTO categoryDTO3;

        System.assertEquals(false, categoryDTO1.equals(categoryDTO3));
        System.assertEquals(false, categoryDTO2.equals(categoryDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCategoryDTO categoryDTO1 = OASCategoryDTO.getExample();
        OASCategoryDTO categoryDTO2 = new OASCategoryDTO();

        System.assertEquals(categoryDTO1.hashCode(), categoryDTO1.hashCode());
        System.assertEquals(categoryDTO2.hashCode(), categoryDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCategoryDTO categoryDTO1 = OASCategoryDTO.getExample();
        OASCategoryDTO categoryDTO2 = OASCategoryDTO.getExample();
        OASCategoryDTO categoryDTO3 = new OASCategoryDTO();
        OASCategoryDTO categoryDTO4 = new OASCategoryDTO();

        System.assert(categoryDTO1.equals(categoryDTO2));
        System.assert(categoryDTO3.equals(categoryDTO4));
        System.assertEquals(categoryDTO1.hashCode(), categoryDTO2.hashCode());
        System.assertEquals(categoryDTO3.hashCode(), categoryDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCategoryDTO categoryDTO = new OASCategoryDTO();
        System.assertEquals(new List<OASCategoryDTO>(), categoryDTO.children);
        System.assertEquals(null, categoryDTO.id);
        System.assertEquals(null, categoryDTO.name);
    }
}
