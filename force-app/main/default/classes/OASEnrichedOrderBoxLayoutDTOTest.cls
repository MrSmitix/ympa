@isTest
private class OASEnrichedOrderBoxLayoutDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO1 = OASEnrichedOrderBoxLayoutDTO.getExample();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO2 = enrichedOrderBoxLayoutDTO1;
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO3 = new OASEnrichedOrderBoxLayoutDTO();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO4 = enrichedOrderBoxLayoutDTO3;

        System.assert(enrichedOrderBoxLayoutDTO1.equals(enrichedOrderBoxLayoutDTO2));
        System.assert(enrichedOrderBoxLayoutDTO2.equals(enrichedOrderBoxLayoutDTO1));
        System.assert(enrichedOrderBoxLayoutDTO1.equals(enrichedOrderBoxLayoutDTO1));
        System.assert(enrichedOrderBoxLayoutDTO3.equals(enrichedOrderBoxLayoutDTO4));
        System.assert(enrichedOrderBoxLayoutDTO4.equals(enrichedOrderBoxLayoutDTO3));
        System.assert(enrichedOrderBoxLayoutDTO3.equals(enrichedOrderBoxLayoutDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO1 = OASEnrichedOrderBoxLayoutDTO.getExample();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO2 = OASEnrichedOrderBoxLayoutDTO.getExample();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO3 = new OASEnrichedOrderBoxLayoutDTO();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO4 = new OASEnrichedOrderBoxLayoutDTO();

        System.assert(enrichedOrderBoxLayoutDTO1.equals(enrichedOrderBoxLayoutDTO2));
        System.assert(enrichedOrderBoxLayoutDTO2.equals(enrichedOrderBoxLayoutDTO1));
        System.assert(enrichedOrderBoxLayoutDTO3.equals(enrichedOrderBoxLayoutDTO4));
        System.assert(enrichedOrderBoxLayoutDTO4.equals(enrichedOrderBoxLayoutDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO1 = OASEnrichedOrderBoxLayoutDTO.getExample();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO2 = new OASEnrichedOrderBoxLayoutDTO();

        System.assertEquals(false, enrichedOrderBoxLayoutDTO1.equals('foo'));
        System.assertEquals(false, enrichedOrderBoxLayoutDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO1 = OASEnrichedOrderBoxLayoutDTO.getExample();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO2 = new OASEnrichedOrderBoxLayoutDTO();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO3;

        System.assertEquals(false, enrichedOrderBoxLayoutDTO1.equals(enrichedOrderBoxLayoutDTO3));
        System.assertEquals(false, enrichedOrderBoxLayoutDTO2.equals(enrichedOrderBoxLayoutDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO1 = OASEnrichedOrderBoxLayoutDTO.getExample();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO2 = new OASEnrichedOrderBoxLayoutDTO();

        System.assertEquals(enrichedOrderBoxLayoutDTO1.hashCode(), enrichedOrderBoxLayoutDTO1.hashCode());
        System.assertEquals(enrichedOrderBoxLayoutDTO2.hashCode(), enrichedOrderBoxLayoutDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO1 = OASEnrichedOrderBoxLayoutDTO.getExample();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO2 = OASEnrichedOrderBoxLayoutDTO.getExample();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO3 = new OASEnrichedOrderBoxLayoutDTO();
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO4 = new OASEnrichedOrderBoxLayoutDTO();

        System.assert(enrichedOrderBoxLayoutDTO1.equals(enrichedOrderBoxLayoutDTO2));
        System.assert(enrichedOrderBoxLayoutDTO3.equals(enrichedOrderBoxLayoutDTO4));
        System.assertEquals(enrichedOrderBoxLayoutDTO1.hashCode(), enrichedOrderBoxLayoutDTO2.hashCode());
        System.assertEquals(enrichedOrderBoxLayoutDTO3.hashCode(), enrichedOrderBoxLayoutDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEnrichedOrderBoxLayoutDTO enrichedOrderBoxLayoutDTO = new OASEnrichedOrderBoxLayoutDTO();
        System.assertEquals(new List<OASOrderBoxLayoutItemDTO>(), enrichedOrderBoxLayoutDTO.items);
        System.assertEquals(null, enrichedOrderBoxLayoutDTO.boxId);
    }
}
