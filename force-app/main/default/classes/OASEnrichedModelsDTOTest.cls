@isTest
private class OASEnrichedModelsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnrichedModelsDTO enrichedModelsDTO1 = OASEnrichedModelsDTO.getExample();
        OASEnrichedModelsDTO enrichedModelsDTO2 = enrichedModelsDTO1;
        OASEnrichedModelsDTO enrichedModelsDTO3 = new OASEnrichedModelsDTO();
        OASEnrichedModelsDTO enrichedModelsDTO4 = enrichedModelsDTO3;

        System.assert(enrichedModelsDTO1.equals(enrichedModelsDTO2));
        System.assert(enrichedModelsDTO2.equals(enrichedModelsDTO1));
        System.assert(enrichedModelsDTO1.equals(enrichedModelsDTO1));
        System.assert(enrichedModelsDTO3.equals(enrichedModelsDTO4));
        System.assert(enrichedModelsDTO4.equals(enrichedModelsDTO3));
        System.assert(enrichedModelsDTO3.equals(enrichedModelsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnrichedModelsDTO enrichedModelsDTO1 = OASEnrichedModelsDTO.getExample();
        OASEnrichedModelsDTO enrichedModelsDTO2 = OASEnrichedModelsDTO.getExample();
        OASEnrichedModelsDTO enrichedModelsDTO3 = new OASEnrichedModelsDTO();
        OASEnrichedModelsDTO enrichedModelsDTO4 = new OASEnrichedModelsDTO();

        System.assert(enrichedModelsDTO1.equals(enrichedModelsDTO2));
        System.assert(enrichedModelsDTO2.equals(enrichedModelsDTO1));
        System.assert(enrichedModelsDTO3.equals(enrichedModelsDTO4));
        System.assert(enrichedModelsDTO4.equals(enrichedModelsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnrichedModelsDTO enrichedModelsDTO1 = OASEnrichedModelsDTO.getExample();
        OASEnrichedModelsDTO enrichedModelsDTO2 = new OASEnrichedModelsDTO();

        System.assertEquals(false, enrichedModelsDTO1.equals('foo'));
        System.assertEquals(false, enrichedModelsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnrichedModelsDTO enrichedModelsDTO1 = OASEnrichedModelsDTO.getExample();
        OASEnrichedModelsDTO enrichedModelsDTO2 = new OASEnrichedModelsDTO();
        OASEnrichedModelsDTO enrichedModelsDTO3;

        System.assertEquals(false, enrichedModelsDTO1.equals(enrichedModelsDTO3));
        System.assertEquals(false, enrichedModelsDTO2.equals(enrichedModelsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnrichedModelsDTO enrichedModelsDTO1 = OASEnrichedModelsDTO.getExample();
        OASEnrichedModelsDTO enrichedModelsDTO2 = new OASEnrichedModelsDTO();

        System.assertEquals(enrichedModelsDTO1.hashCode(), enrichedModelsDTO1.hashCode());
        System.assertEquals(enrichedModelsDTO2.hashCode(), enrichedModelsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnrichedModelsDTO enrichedModelsDTO1 = OASEnrichedModelsDTO.getExample();
        OASEnrichedModelsDTO enrichedModelsDTO2 = OASEnrichedModelsDTO.getExample();
        OASEnrichedModelsDTO enrichedModelsDTO3 = new OASEnrichedModelsDTO();
        OASEnrichedModelsDTO enrichedModelsDTO4 = new OASEnrichedModelsDTO();

        System.assert(enrichedModelsDTO1.equals(enrichedModelsDTO2));
        System.assert(enrichedModelsDTO3.equals(enrichedModelsDTO4));
        System.assertEquals(enrichedModelsDTO1.hashCode(), enrichedModelsDTO2.hashCode());
        System.assertEquals(enrichedModelsDTO3.hashCode(), enrichedModelsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEnrichedModelsDTO enrichedModelsDTO = new OASEnrichedModelsDTO();
        System.assertEquals(new List<OASEnrichedModelDTO>(), enrichedModelsDTO.models);
    }
}
