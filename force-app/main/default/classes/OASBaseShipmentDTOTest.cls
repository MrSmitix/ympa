@isTest
private class OASBaseShipmentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBaseShipmentDTO baseShipmentDTO1 = OASBaseShipmentDTO.getExample();
        OASBaseShipmentDTO baseShipmentDTO2 = baseShipmentDTO1;
        OASBaseShipmentDTO baseShipmentDTO3 = new OASBaseShipmentDTO();
        OASBaseShipmentDTO baseShipmentDTO4 = baseShipmentDTO3;

        System.assert(baseShipmentDTO1.equals(baseShipmentDTO2));
        System.assert(baseShipmentDTO2.equals(baseShipmentDTO1));
        System.assert(baseShipmentDTO1.equals(baseShipmentDTO1));
        System.assert(baseShipmentDTO3.equals(baseShipmentDTO4));
        System.assert(baseShipmentDTO4.equals(baseShipmentDTO3));
        System.assert(baseShipmentDTO3.equals(baseShipmentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBaseShipmentDTO baseShipmentDTO1 = OASBaseShipmentDTO.getExample();
        OASBaseShipmentDTO baseShipmentDTO2 = OASBaseShipmentDTO.getExample();
        OASBaseShipmentDTO baseShipmentDTO3 = new OASBaseShipmentDTO();
        OASBaseShipmentDTO baseShipmentDTO4 = new OASBaseShipmentDTO();

        System.assert(baseShipmentDTO1.equals(baseShipmentDTO2));
        System.assert(baseShipmentDTO2.equals(baseShipmentDTO1));
        System.assert(baseShipmentDTO3.equals(baseShipmentDTO4));
        System.assert(baseShipmentDTO4.equals(baseShipmentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBaseShipmentDTO baseShipmentDTO1 = OASBaseShipmentDTO.getExample();
        OASBaseShipmentDTO baseShipmentDTO2 = new OASBaseShipmentDTO();

        System.assertEquals(false, baseShipmentDTO1.equals('foo'));
        System.assertEquals(false, baseShipmentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBaseShipmentDTO baseShipmentDTO1 = OASBaseShipmentDTO.getExample();
        OASBaseShipmentDTO baseShipmentDTO2 = new OASBaseShipmentDTO();
        OASBaseShipmentDTO baseShipmentDTO3;

        System.assertEquals(false, baseShipmentDTO1.equals(baseShipmentDTO3));
        System.assertEquals(false, baseShipmentDTO2.equals(baseShipmentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBaseShipmentDTO baseShipmentDTO1 = OASBaseShipmentDTO.getExample();
        OASBaseShipmentDTO baseShipmentDTO2 = new OASBaseShipmentDTO();

        System.assertEquals(baseShipmentDTO1.hashCode(), baseShipmentDTO1.hashCode());
        System.assertEquals(baseShipmentDTO2.hashCode(), baseShipmentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBaseShipmentDTO baseShipmentDTO1 = OASBaseShipmentDTO.getExample();
        OASBaseShipmentDTO baseShipmentDTO2 = OASBaseShipmentDTO.getExample();
        OASBaseShipmentDTO baseShipmentDTO3 = new OASBaseShipmentDTO();
        OASBaseShipmentDTO baseShipmentDTO4 = new OASBaseShipmentDTO();

        System.assert(baseShipmentDTO1.equals(baseShipmentDTO2));
        System.assert(baseShipmentDTO3.equals(baseShipmentDTO4));
        System.assertEquals(baseShipmentDTO1.hashCode(), baseShipmentDTO2.hashCode());
        System.assertEquals(baseShipmentDTO3.hashCode(), baseShipmentDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBaseShipmentDTO baseShipmentDTO = new OASBaseShipmentDTO();
        System.assertEquals(new List<Long>(), baseShipmentDTO.orderIds);
        System.assertEquals(null, baseShipmentDTO.id);
        System.assertEquals(null, baseShipmentDTO.planIntervalFrom);
        System.assertEquals(null, baseShipmentDTO.planIntervalTo);
        System.assertEquals(null, baseShipmentDTO.shipmentType);
        System.assertEquals(null, baseShipmentDTO.warehouse);
        System.assertEquals(null, baseShipmentDTO.warehouseTo);
        System.assertEquals(null, baseShipmentDTO.externalId);
        System.assertEquals(null, baseShipmentDTO.deliveryService);
        System.assertEquals(null, baseShipmentDTO.palletsCount);
        System.assertEquals(null, baseShipmentDTO.draftCount);
        System.assertEquals(null, baseShipmentDTO.plannedCount);
        System.assertEquals(null, baseShipmentDTO.factCount);
    }
}
