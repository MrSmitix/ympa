@isTest
private class OASShipmentStatusChangeDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO1 = OASShipmentStatusChangeDTO.getExample();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO2 = shipmentStatusChangeDTO1;
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO3 = new OASShipmentStatusChangeDTO();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO4 = shipmentStatusChangeDTO3;

        System.assert(shipmentStatusChangeDTO1.equals(shipmentStatusChangeDTO2));
        System.assert(shipmentStatusChangeDTO2.equals(shipmentStatusChangeDTO1));
        System.assert(shipmentStatusChangeDTO1.equals(shipmentStatusChangeDTO1));
        System.assert(shipmentStatusChangeDTO3.equals(shipmentStatusChangeDTO4));
        System.assert(shipmentStatusChangeDTO4.equals(shipmentStatusChangeDTO3));
        System.assert(shipmentStatusChangeDTO3.equals(shipmentStatusChangeDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO1 = OASShipmentStatusChangeDTO.getExample();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO2 = OASShipmentStatusChangeDTO.getExample();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO3 = new OASShipmentStatusChangeDTO();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO4 = new OASShipmentStatusChangeDTO();

        System.assert(shipmentStatusChangeDTO1.equals(shipmentStatusChangeDTO2));
        System.assert(shipmentStatusChangeDTO2.equals(shipmentStatusChangeDTO1));
        System.assert(shipmentStatusChangeDTO3.equals(shipmentStatusChangeDTO4));
        System.assert(shipmentStatusChangeDTO4.equals(shipmentStatusChangeDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO1 = OASShipmentStatusChangeDTO.getExample();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO2 = new OASShipmentStatusChangeDTO();

        System.assertEquals(false, shipmentStatusChangeDTO1.equals('foo'));
        System.assertEquals(false, shipmentStatusChangeDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO1 = OASShipmentStatusChangeDTO.getExample();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO2 = new OASShipmentStatusChangeDTO();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO3;

        System.assertEquals(false, shipmentStatusChangeDTO1.equals(shipmentStatusChangeDTO3));
        System.assertEquals(false, shipmentStatusChangeDTO2.equals(shipmentStatusChangeDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO1 = OASShipmentStatusChangeDTO.getExample();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO2 = new OASShipmentStatusChangeDTO();

        System.assertEquals(shipmentStatusChangeDTO1.hashCode(), shipmentStatusChangeDTO1.hashCode());
        System.assertEquals(shipmentStatusChangeDTO2.hashCode(), shipmentStatusChangeDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO1 = OASShipmentStatusChangeDTO.getExample();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO2 = OASShipmentStatusChangeDTO.getExample();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO3 = new OASShipmentStatusChangeDTO();
        OASShipmentStatusChangeDTO shipmentStatusChangeDTO4 = new OASShipmentStatusChangeDTO();

        System.assert(shipmentStatusChangeDTO1.equals(shipmentStatusChangeDTO2));
        System.assert(shipmentStatusChangeDTO3.equals(shipmentStatusChangeDTO4));
        System.assertEquals(shipmentStatusChangeDTO1.hashCode(), shipmentStatusChangeDTO2.hashCode());
        System.assertEquals(shipmentStatusChangeDTO3.hashCode(), shipmentStatusChangeDTO4.hashCode());
    }
}
