@isTest
private class OASShipmentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASShipmentDTO shipmentDTO1 = OASShipmentDTO.getExample();
        OASShipmentDTO shipmentDTO2 = shipmentDTO1;
        OASShipmentDTO shipmentDTO3 = new OASShipmentDTO();
        OASShipmentDTO shipmentDTO4 = shipmentDTO3;

        System.assert(shipmentDTO1.equals(shipmentDTO2));
        System.assert(shipmentDTO2.equals(shipmentDTO1));
        System.assert(shipmentDTO1.equals(shipmentDTO1));
        System.assert(shipmentDTO3.equals(shipmentDTO4));
        System.assert(shipmentDTO4.equals(shipmentDTO3));
        System.assert(shipmentDTO3.equals(shipmentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASShipmentDTO shipmentDTO1 = OASShipmentDTO.getExample();
        OASShipmentDTO shipmentDTO2 = OASShipmentDTO.getExample();
        OASShipmentDTO shipmentDTO3 = new OASShipmentDTO();
        OASShipmentDTO shipmentDTO4 = new OASShipmentDTO();

        System.assert(shipmentDTO1.equals(shipmentDTO2));
        System.assert(shipmentDTO2.equals(shipmentDTO1));
        System.assert(shipmentDTO3.equals(shipmentDTO4));
        System.assert(shipmentDTO4.equals(shipmentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASShipmentDTO shipmentDTO1 = OASShipmentDTO.getExample();
        OASShipmentDTO shipmentDTO2 = new OASShipmentDTO();

        System.assertEquals(false, shipmentDTO1.equals('foo'));
        System.assertEquals(false, shipmentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASShipmentDTO shipmentDTO1 = OASShipmentDTO.getExample();
        OASShipmentDTO shipmentDTO2 = new OASShipmentDTO();
        OASShipmentDTO shipmentDTO3;

        System.assertEquals(false, shipmentDTO1.equals(shipmentDTO3));
        System.assertEquals(false, shipmentDTO2.equals(shipmentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASShipmentDTO shipmentDTO1 = OASShipmentDTO.getExample();
        OASShipmentDTO shipmentDTO2 = new OASShipmentDTO();

        System.assertEquals(shipmentDTO1.hashCode(), shipmentDTO1.hashCode());
        System.assertEquals(shipmentDTO2.hashCode(), shipmentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASShipmentDTO shipmentDTO1 = OASShipmentDTO.getExample();
        OASShipmentDTO shipmentDTO2 = OASShipmentDTO.getExample();
        OASShipmentDTO shipmentDTO3 = new OASShipmentDTO();
        OASShipmentDTO shipmentDTO4 = new OASShipmentDTO();

        System.assert(shipmentDTO1.equals(shipmentDTO2));
        System.assert(shipmentDTO3.equals(shipmentDTO4));
        System.assertEquals(shipmentDTO1.hashCode(), shipmentDTO2.hashCode());
        System.assertEquals(shipmentDTO3.hashCode(), shipmentDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASShipmentDTO shipmentDTO = new OASShipmentDTO();
        System.assertEquals(new List<Long>(), shipmentDTO.orderIds);
        System.assertEquals(new List<OASShipmentActionType>(), shipmentDTO.availableActions);
        System.assertEquals(null, shipmentDTO.id);
        System.assertEquals(null, shipmentDTO.planIntervalFrom);
        System.assertEquals(null, shipmentDTO.planIntervalTo);
        System.assertEquals(null, shipmentDTO.shipmentType);
        System.assertEquals(null, shipmentDTO.warehouse);
        System.assertEquals(null, shipmentDTO.warehouseTo);
        System.assertEquals(null, shipmentDTO.externalId);
        System.assertEquals(null, shipmentDTO.deliveryService);
        System.assertEquals(null, shipmentDTO.palletsCount);
        System.assertEquals(null, shipmentDTO.draftCount);
        System.assertEquals(null, shipmentDTO.plannedCount);
        System.assertEquals(null, shipmentDTO.factCount);
        System.assertEquals(null, shipmentDTO.currentStatus);
    }
}
