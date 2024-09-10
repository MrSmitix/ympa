@isTest
private class OASShipmentInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASShipmentInfoDTO shipmentInfoDTO1 = OASShipmentInfoDTO.getExample();
        OASShipmentInfoDTO shipmentInfoDTO2 = shipmentInfoDTO1;
        OASShipmentInfoDTO shipmentInfoDTO3 = new OASShipmentInfoDTO();
        OASShipmentInfoDTO shipmentInfoDTO4 = shipmentInfoDTO3;

        System.assert(shipmentInfoDTO1.equals(shipmentInfoDTO2));
        System.assert(shipmentInfoDTO2.equals(shipmentInfoDTO1));
        System.assert(shipmentInfoDTO1.equals(shipmentInfoDTO1));
        System.assert(shipmentInfoDTO3.equals(shipmentInfoDTO4));
        System.assert(shipmentInfoDTO4.equals(shipmentInfoDTO3));
        System.assert(shipmentInfoDTO3.equals(shipmentInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASShipmentInfoDTO shipmentInfoDTO1 = OASShipmentInfoDTO.getExample();
        OASShipmentInfoDTO shipmentInfoDTO2 = OASShipmentInfoDTO.getExample();
        OASShipmentInfoDTO shipmentInfoDTO3 = new OASShipmentInfoDTO();
        OASShipmentInfoDTO shipmentInfoDTO4 = new OASShipmentInfoDTO();

        System.assert(shipmentInfoDTO1.equals(shipmentInfoDTO2));
        System.assert(shipmentInfoDTO2.equals(shipmentInfoDTO1));
        System.assert(shipmentInfoDTO3.equals(shipmentInfoDTO4));
        System.assert(shipmentInfoDTO4.equals(shipmentInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASShipmentInfoDTO shipmentInfoDTO1 = OASShipmentInfoDTO.getExample();
        OASShipmentInfoDTO shipmentInfoDTO2 = new OASShipmentInfoDTO();

        System.assertEquals(false, shipmentInfoDTO1.equals('foo'));
        System.assertEquals(false, shipmentInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASShipmentInfoDTO shipmentInfoDTO1 = OASShipmentInfoDTO.getExample();
        OASShipmentInfoDTO shipmentInfoDTO2 = new OASShipmentInfoDTO();
        OASShipmentInfoDTO shipmentInfoDTO3;

        System.assertEquals(false, shipmentInfoDTO1.equals(shipmentInfoDTO3));
        System.assertEquals(false, shipmentInfoDTO2.equals(shipmentInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASShipmentInfoDTO shipmentInfoDTO1 = OASShipmentInfoDTO.getExample();
        OASShipmentInfoDTO shipmentInfoDTO2 = new OASShipmentInfoDTO();

        System.assertEquals(shipmentInfoDTO1.hashCode(), shipmentInfoDTO1.hashCode());
        System.assertEquals(shipmentInfoDTO2.hashCode(), shipmentInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASShipmentInfoDTO shipmentInfoDTO1 = OASShipmentInfoDTO.getExample();
        OASShipmentInfoDTO shipmentInfoDTO2 = OASShipmentInfoDTO.getExample();
        OASShipmentInfoDTO shipmentInfoDTO3 = new OASShipmentInfoDTO();
        OASShipmentInfoDTO shipmentInfoDTO4 = new OASShipmentInfoDTO();

        System.assert(shipmentInfoDTO1.equals(shipmentInfoDTO2));
        System.assert(shipmentInfoDTO3.equals(shipmentInfoDTO4));
        System.assertEquals(shipmentInfoDTO1.hashCode(), shipmentInfoDTO2.hashCode());
        System.assertEquals(shipmentInfoDTO3.hashCode(), shipmentInfoDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASShipmentInfoDTO shipmentInfoDTO = new OASShipmentInfoDTO();
        System.assertEquals(new List<Long>(), shipmentInfoDTO.orderIds);
        System.assertEquals(null, shipmentInfoDTO.id);
        System.assertEquals(null, shipmentInfoDTO.planIntervalFrom);
        System.assertEquals(null, shipmentInfoDTO.planIntervalTo);
        System.assertEquals(null, shipmentInfoDTO.shipmentType);
        System.assertEquals(null, shipmentInfoDTO.warehouse);
        System.assertEquals(null, shipmentInfoDTO.warehouseTo);
        System.assertEquals(null, shipmentInfoDTO.externalId);
        System.assertEquals(null, shipmentInfoDTO.deliveryService);
        System.assertEquals(null, shipmentInfoDTO.palletsCount);
        System.assertEquals(null, shipmentInfoDTO.draftCount);
        System.assertEquals(null, shipmentInfoDTO.plannedCount);
        System.assertEquals(null, shipmentInfoDTO.factCount);
        System.assertEquals(null, shipmentInfoDTO.status);
        System.assertEquals(null, shipmentInfoDTO.statusDescription);
        System.assertEquals(null, shipmentInfoDTO.statusUpdateTime);
    }
}
