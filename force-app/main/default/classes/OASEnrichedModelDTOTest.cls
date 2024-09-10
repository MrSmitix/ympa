@isTest
private class OASEnrichedModelDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnrichedModelDTO enrichedModelDTO1 = OASEnrichedModelDTO.getExample();
        OASEnrichedModelDTO enrichedModelDTO2 = enrichedModelDTO1;
        OASEnrichedModelDTO enrichedModelDTO3 = new OASEnrichedModelDTO();
        OASEnrichedModelDTO enrichedModelDTO4 = enrichedModelDTO3;

        System.assert(enrichedModelDTO1.equals(enrichedModelDTO2));
        System.assert(enrichedModelDTO2.equals(enrichedModelDTO1));
        System.assert(enrichedModelDTO1.equals(enrichedModelDTO1));
        System.assert(enrichedModelDTO3.equals(enrichedModelDTO4));
        System.assert(enrichedModelDTO4.equals(enrichedModelDTO3));
        System.assert(enrichedModelDTO3.equals(enrichedModelDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnrichedModelDTO enrichedModelDTO1 = OASEnrichedModelDTO.getExample();
        OASEnrichedModelDTO enrichedModelDTO2 = OASEnrichedModelDTO.getExample();
        OASEnrichedModelDTO enrichedModelDTO3 = new OASEnrichedModelDTO();
        OASEnrichedModelDTO enrichedModelDTO4 = new OASEnrichedModelDTO();

        System.assert(enrichedModelDTO1.equals(enrichedModelDTO2));
        System.assert(enrichedModelDTO2.equals(enrichedModelDTO1));
        System.assert(enrichedModelDTO3.equals(enrichedModelDTO4));
        System.assert(enrichedModelDTO4.equals(enrichedModelDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnrichedModelDTO enrichedModelDTO1 = OASEnrichedModelDTO.getExample();
        OASEnrichedModelDTO enrichedModelDTO2 = new OASEnrichedModelDTO();

        System.assertEquals(false, enrichedModelDTO1.equals('foo'));
        System.assertEquals(false, enrichedModelDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnrichedModelDTO enrichedModelDTO1 = OASEnrichedModelDTO.getExample();
        OASEnrichedModelDTO enrichedModelDTO2 = new OASEnrichedModelDTO();
        OASEnrichedModelDTO enrichedModelDTO3;

        System.assertEquals(false, enrichedModelDTO1.equals(enrichedModelDTO3));
        System.assertEquals(false, enrichedModelDTO2.equals(enrichedModelDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnrichedModelDTO enrichedModelDTO1 = OASEnrichedModelDTO.getExample();
        OASEnrichedModelDTO enrichedModelDTO2 = new OASEnrichedModelDTO();

        System.assertEquals(enrichedModelDTO1.hashCode(), enrichedModelDTO1.hashCode());
        System.assertEquals(enrichedModelDTO2.hashCode(), enrichedModelDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnrichedModelDTO enrichedModelDTO1 = OASEnrichedModelDTO.getExample();
        OASEnrichedModelDTO enrichedModelDTO2 = OASEnrichedModelDTO.getExample();
        OASEnrichedModelDTO enrichedModelDTO3 = new OASEnrichedModelDTO();
        OASEnrichedModelDTO enrichedModelDTO4 = new OASEnrichedModelDTO();

        System.assert(enrichedModelDTO1.equals(enrichedModelDTO2));
        System.assert(enrichedModelDTO3.equals(enrichedModelDTO4));
        System.assertEquals(enrichedModelDTO1.hashCode(), enrichedModelDTO2.hashCode());
        System.assertEquals(enrichedModelDTO3.hashCode(), enrichedModelDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEnrichedModelDTO enrichedModelDTO = new OASEnrichedModelDTO();
        System.assertEquals(new List<OASModelOfferDTO>(), enrichedModelDTO.offers);
        System.assertEquals(null, enrichedModelDTO.id);
        System.assertEquals(null, enrichedModelDTO.name);
        System.assertEquals(null, enrichedModelDTO.prices);
        System.assertEquals(null, enrichedModelDTO.offlineOffers);
        System.assertEquals(null, enrichedModelDTO.onlineOffers);
    }
}
