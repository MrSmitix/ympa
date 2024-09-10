@isTest
private class OASModelDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASModelDTO modelDTO1 = OASModelDTO.getExample();
        OASModelDTO modelDTO2 = modelDTO1;
        OASModelDTO modelDTO3 = new OASModelDTO();
        OASModelDTO modelDTO4 = modelDTO3;

        System.assert(modelDTO1.equals(modelDTO2));
        System.assert(modelDTO2.equals(modelDTO1));
        System.assert(modelDTO1.equals(modelDTO1));
        System.assert(modelDTO3.equals(modelDTO4));
        System.assert(modelDTO4.equals(modelDTO3));
        System.assert(modelDTO3.equals(modelDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModelDTO modelDTO1 = OASModelDTO.getExample();
        OASModelDTO modelDTO2 = OASModelDTO.getExample();
        OASModelDTO modelDTO3 = new OASModelDTO();
        OASModelDTO modelDTO4 = new OASModelDTO();

        System.assert(modelDTO1.equals(modelDTO2));
        System.assert(modelDTO2.equals(modelDTO1));
        System.assert(modelDTO3.equals(modelDTO4));
        System.assert(modelDTO4.equals(modelDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModelDTO modelDTO1 = OASModelDTO.getExample();
        OASModelDTO modelDTO2 = new OASModelDTO();

        System.assertEquals(false, modelDTO1.equals('foo'));
        System.assertEquals(false, modelDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModelDTO modelDTO1 = OASModelDTO.getExample();
        OASModelDTO modelDTO2 = new OASModelDTO();
        OASModelDTO modelDTO3;

        System.assertEquals(false, modelDTO1.equals(modelDTO3));
        System.assertEquals(false, modelDTO2.equals(modelDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModelDTO modelDTO1 = OASModelDTO.getExample();
        OASModelDTO modelDTO2 = new OASModelDTO();

        System.assertEquals(modelDTO1.hashCode(), modelDTO1.hashCode());
        System.assertEquals(modelDTO2.hashCode(), modelDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModelDTO modelDTO1 = OASModelDTO.getExample();
        OASModelDTO modelDTO2 = OASModelDTO.getExample();
        OASModelDTO modelDTO3 = new OASModelDTO();
        OASModelDTO modelDTO4 = new OASModelDTO();

        System.assert(modelDTO1.equals(modelDTO2));
        System.assert(modelDTO3.equals(modelDTO4));
        System.assertEquals(modelDTO1.hashCode(), modelDTO2.hashCode());
        System.assertEquals(modelDTO3.hashCode(), modelDTO4.hashCode());
    }
}
