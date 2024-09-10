@isTest
private class OASCategoryErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCategoryErrorDTO categoryErrorDTO1 = OASCategoryErrorDTO.getExample();
        OASCategoryErrorDTO categoryErrorDTO2 = categoryErrorDTO1;
        OASCategoryErrorDTO categoryErrorDTO3 = new OASCategoryErrorDTO();
        OASCategoryErrorDTO categoryErrorDTO4 = categoryErrorDTO3;

        System.assert(categoryErrorDTO1.equals(categoryErrorDTO2));
        System.assert(categoryErrorDTO2.equals(categoryErrorDTO1));
        System.assert(categoryErrorDTO1.equals(categoryErrorDTO1));
        System.assert(categoryErrorDTO3.equals(categoryErrorDTO4));
        System.assert(categoryErrorDTO4.equals(categoryErrorDTO3));
        System.assert(categoryErrorDTO3.equals(categoryErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCategoryErrorDTO categoryErrorDTO1 = OASCategoryErrorDTO.getExample();
        OASCategoryErrorDTO categoryErrorDTO2 = OASCategoryErrorDTO.getExample();
        OASCategoryErrorDTO categoryErrorDTO3 = new OASCategoryErrorDTO();
        OASCategoryErrorDTO categoryErrorDTO4 = new OASCategoryErrorDTO();

        System.assert(categoryErrorDTO1.equals(categoryErrorDTO2));
        System.assert(categoryErrorDTO2.equals(categoryErrorDTO1));
        System.assert(categoryErrorDTO3.equals(categoryErrorDTO4));
        System.assert(categoryErrorDTO4.equals(categoryErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCategoryErrorDTO categoryErrorDTO1 = OASCategoryErrorDTO.getExample();
        OASCategoryErrorDTO categoryErrorDTO2 = new OASCategoryErrorDTO();

        System.assertEquals(false, categoryErrorDTO1.equals('foo'));
        System.assertEquals(false, categoryErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCategoryErrorDTO categoryErrorDTO1 = OASCategoryErrorDTO.getExample();
        OASCategoryErrorDTO categoryErrorDTO2 = new OASCategoryErrorDTO();
        OASCategoryErrorDTO categoryErrorDTO3;

        System.assertEquals(false, categoryErrorDTO1.equals(categoryErrorDTO3));
        System.assertEquals(false, categoryErrorDTO2.equals(categoryErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCategoryErrorDTO categoryErrorDTO1 = OASCategoryErrorDTO.getExample();
        OASCategoryErrorDTO categoryErrorDTO2 = new OASCategoryErrorDTO();

        System.assertEquals(categoryErrorDTO1.hashCode(), categoryErrorDTO1.hashCode());
        System.assertEquals(categoryErrorDTO2.hashCode(), categoryErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCategoryErrorDTO categoryErrorDTO1 = OASCategoryErrorDTO.getExample();
        OASCategoryErrorDTO categoryErrorDTO2 = OASCategoryErrorDTO.getExample();
        OASCategoryErrorDTO categoryErrorDTO3 = new OASCategoryErrorDTO();
        OASCategoryErrorDTO categoryErrorDTO4 = new OASCategoryErrorDTO();

        System.assert(categoryErrorDTO1.equals(categoryErrorDTO2));
        System.assert(categoryErrorDTO3.equals(categoryErrorDTO4));
        System.assertEquals(categoryErrorDTO1.hashCode(), categoryErrorDTO2.hashCode());
        System.assertEquals(categoryErrorDTO3.hashCode(), categoryErrorDTO4.hashCode());
    }
}
