@isTest
private class OASCategoryParameterDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCategoryParameterDTO categoryParameterDTO1 = OASCategoryParameterDTO.getExample();
        OASCategoryParameterDTO categoryParameterDTO2 = categoryParameterDTO1;
        OASCategoryParameterDTO categoryParameterDTO3 = new OASCategoryParameterDTO();
        OASCategoryParameterDTO categoryParameterDTO4 = categoryParameterDTO3;

        System.assert(categoryParameterDTO1.equals(categoryParameterDTO2));
        System.assert(categoryParameterDTO2.equals(categoryParameterDTO1));
        System.assert(categoryParameterDTO1.equals(categoryParameterDTO1));
        System.assert(categoryParameterDTO3.equals(categoryParameterDTO4));
        System.assert(categoryParameterDTO4.equals(categoryParameterDTO3));
        System.assert(categoryParameterDTO3.equals(categoryParameterDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCategoryParameterDTO categoryParameterDTO1 = OASCategoryParameterDTO.getExample();
        OASCategoryParameterDTO categoryParameterDTO2 = OASCategoryParameterDTO.getExample();
        OASCategoryParameterDTO categoryParameterDTO3 = new OASCategoryParameterDTO();
        OASCategoryParameterDTO categoryParameterDTO4 = new OASCategoryParameterDTO();

        System.assert(categoryParameterDTO1.equals(categoryParameterDTO2));
        System.assert(categoryParameterDTO2.equals(categoryParameterDTO1));
        System.assert(categoryParameterDTO3.equals(categoryParameterDTO4));
        System.assert(categoryParameterDTO4.equals(categoryParameterDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCategoryParameterDTO categoryParameterDTO1 = OASCategoryParameterDTO.getExample();
        OASCategoryParameterDTO categoryParameterDTO2 = new OASCategoryParameterDTO();

        System.assertEquals(false, categoryParameterDTO1.equals('foo'));
        System.assertEquals(false, categoryParameterDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCategoryParameterDTO categoryParameterDTO1 = OASCategoryParameterDTO.getExample();
        OASCategoryParameterDTO categoryParameterDTO2 = new OASCategoryParameterDTO();
        OASCategoryParameterDTO categoryParameterDTO3;

        System.assertEquals(false, categoryParameterDTO1.equals(categoryParameterDTO3));
        System.assertEquals(false, categoryParameterDTO2.equals(categoryParameterDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCategoryParameterDTO categoryParameterDTO1 = OASCategoryParameterDTO.getExample();
        OASCategoryParameterDTO categoryParameterDTO2 = new OASCategoryParameterDTO();

        System.assertEquals(categoryParameterDTO1.hashCode(), categoryParameterDTO1.hashCode());
        System.assertEquals(categoryParameterDTO2.hashCode(), categoryParameterDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCategoryParameterDTO categoryParameterDTO1 = OASCategoryParameterDTO.getExample();
        OASCategoryParameterDTO categoryParameterDTO2 = OASCategoryParameterDTO.getExample();
        OASCategoryParameterDTO categoryParameterDTO3 = new OASCategoryParameterDTO();
        OASCategoryParameterDTO categoryParameterDTO4 = new OASCategoryParameterDTO();

        System.assert(categoryParameterDTO1.equals(categoryParameterDTO2));
        System.assert(categoryParameterDTO3.equals(categoryParameterDTO4));
        System.assertEquals(categoryParameterDTO1.hashCode(), categoryParameterDTO2.hashCode());
        System.assertEquals(categoryParameterDTO3.hashCode(), categoryParameterDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCategoryParameterDTO categoryParameterDTO = new OASCategoryParameterDTO();
        System.assertEquals(new List<OASOfferCardRecommendationType>(), categoryParameterDTO.recommendationTypes);
        System.assertEquals(new List<OASParameterValueOptionDTO>(), categoryParameterDTO.values);
        System.assertEquals(new List<OASValueRestrictionDTO>(), categoryParameterDTO.valueRestrictions);
        System.assertEquals(null, categoryParameterDTO.id);
        System.assertEquals(null, categoryParameterDTO.name);
        System.assertEquals(null, categoryParameterDTO.type);
        System.assertEquals(null, categoryParameterDTO.unit);
        System.assertEquals(null, categoryParameterDTO.description);
        System.assertEquals(null, categoryParameterDTO.required);
        System.assertEquals(null, categoryParameterDTO.filtering);
        System.assertEquals(null, categoryParameterDTO.distinctive);
        System.assertEquals(null, categoryParameterDTO.multivalue);
        System.assertEquals(null, categoryParameterDTO.allowCustomValues);
        System.assertEquals(null, categoryParameterDTO.constraints);
    }
}
