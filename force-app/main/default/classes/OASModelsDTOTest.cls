@isTest
private class OASModelsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASModelsDTO modelsDTO1 = OASModelsDTO.getExample();
        OASModelsDTO modelsDTO2 = modelsDTO1;
        OASModelsDTO modelsDTO3 = new OASModelsDTO();
        OASModelsDTO modelsDTO4 = modelsDTO3;

        System.assert(modelsDTO1.equals(modelsDTO2));
        System.assert(modelsDTO2.equals(modelsDTO1));
        System.assert(modelsDTO1.equals(modelsDTO1));
        System.assert(modelsDTO3.equals(modelsDTO4));
        System.assert(modelsDTO4.equals(modelsDTO3));
        System.assert(modelsDTO3.equals(modelsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModelsDTO modelsDTO1 = OASModelsDTO.getExample();
        OASModelsDTO modelsDTO2 = OASModelsDTO.getExample();
        OASModelsDTO modelsDTO3 = new OASModelsDTO();
        OASModelsDTO modelsDTO4 = new OASModelsDTO();

        System.assert(modelsDTO1.equals(modelsDTO2));
        System.assert(modelsDTO2.equals(modelsDTO1));
        System.assert(modelsDTO3.equals(modelsDTO4));
        System.assert(modelsDTO4.equals(modelsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModelsDTO modelsDTO1 = OASModelsDTO.getExample();
        OASModelsDTO modelsDTO2 = new OASModelsDTO();

        System.assertEquals(false, modelsDTO1.equals('foo'));
        System.assertEquals(false, modelsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModelsDTO modelsDTO1 = OASModelsDTO.getExample();
        OASModelsDTO modelsDTO2 = new OASModelsDTO();
        OASModelsDTO modelsDTO3;

        System.assertEquals(false, modelsDTO1.equals(modelsDTO3));
        System.assertEquals(false, modelsDTO2.equals(modelsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModelsDTO modelsDTO1 = OASModelsDTO.getExample();
        OASModelsDTO modelsDTO2 = new OASModelsDTO();

        System.assertEquals(modelsDTO1.hashCode(), modelsDTO1.hashCode());
        System.assertEquals(modelsDTO2.hashCode(), modelsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModelsDTO modelsDTO1 = OASModelsDTO.getExample();
        OASModelsDTO modelsDTO2 = OASModelsDTO.getExample();
        OASModelsDTO modelsDTO3 = new OASModelsDTO();
        OASModelsDTO modelsDTO4 = new OASModelsDTO();

        System.assert(modelsDTO1.equals(modelsDTO2));
        System.assert(modelsDTO3.equals(modelsDTO4));
        System.assertEquals(modelsDTO1.hashCode(), modelsDTO2.hashCode());
        System.assertEquals(modelsDTO3.hashCode(), modelsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASModelsDTO modelsDTO = new OASModelsDTO();
        System.assertEquals(new List<OASModelDTO>(), modelsDTO.models);
    }
}
