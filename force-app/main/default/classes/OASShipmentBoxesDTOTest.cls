@isTest
private class OASShipmentBoxesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASShipmentBoxesDTO shipmentBoxesDTO1 = OASShipmentBoxesDTO.getExample();
        OASShipmentBoxesDTO shipmentBoxesDTO2 = shipmentBoxesDTO1;
        OASShipmentBoxesDTO shipmentBoxesDTO3 = new OASShipmentBoxesDTO();
        OASShipmentBoxesDTO shipmentBoxesDTO4 = shipmentBoxesDTO3;

        System.assert(shipmentBoxesDTO1.equals(shipmentBoxesDTO2));
        System.assert(shipmentBoxesDTO2.equals(shipmentBoxesDTO1));
        System.assert(shipmentBoxesDTO1.equals(shipmentBoxesDTO1));
        System.assert(shipmentBoxesDTO3.equals(shipmentBoxesDTO4));
        System.assert(shipmentBoxesDTO4.equals(shipmentBoxesDTO3));
        System.assert(shipmentBoxesDTO3.equals(shipmentBoxesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASShipmentBoxesDTO shipmentBoxesDTO1 = OASShipmentBoxesDTO.getExample();
        OASShipmentBoxesDTO shipmentBoxesDTO2 = OASShipmentBoxesDTO.getExample();
        OASShipmentBoxesDTO shipmentBoxesDTO3 = new OASShipmentBoxesDTO();
        OASShipmentBoxesDTO shipmentBoxesDTO4 = new OASShipmentBoxesDTO();

        System.assert(shipmentBoxesDTO1.equals(shipmentBoxesDTO2));
        System.assert(shipmentBoxesDTO2.equals(shipmentBoxesDTO1));
        System.assert(shipmentBoxesDTO3.equals(shipmentBoxesDTO4));
        System.assert(shipmentBoxesDTO4.equals(shipmentBoxesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASShipmentBoxesDTO shipmentBoxesDTO1 = OASShipmentBoxesDTO.getExample();
        OASShipmentBoxesDTO shipmentBoxesDTO2 = new OASShipmentBoxesDTO();

        System.assertEquals(false, shipmentBoxesDTO1.equals('foo'));
        System.assertEquals(false, shipmentBoxesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASShipmentBoxesDTO shipmentBoxesDTO1 = OASShipmentBoxesDTO.getExample();
        OASShipmentBoxesDTO shipmentBoxesDTO2 = new OASShipmentBoxesDTO();
        OASShipmentBoxesDTO shipmentBoxesDTO3;

        System.assertEquals(false, shipmentBoxesDTO1.equals(shipmentBoxesDTO3));
        System.assertEquals(false, shipmentBoxesDTO2.equals(shipmentBoxesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASShipmentBoxesDTO shipmentBoxesDTO1 = OASShipmentBoxesDTO.getExample();
        OASShipmentBoxesDTO shipmentBoxesDTO2 = new OASShipmentBoxesDTO();

        System.assertEquals(shipmentBoxesDTO1.hashCode(), shipmentBoxesDTO1.hashCode());
        System.assertEquals(shipmentBoxesDTO2.hashCode(), shipmentBoxesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASShipmentBoxesDTO shipmentBoxesDTO1 = OASShipmentBoxesDTO.getExample();
        OASShipmentBoxesDTO shipmentBoxesDTO2 = OASShipmentBoxesDTO.getExample();
        OASShipmentBoxesDTO shipmentBoxesDTO3 = new OASShipmentBoxesDTO();
        OASShipmentBoxesDTO shipmentBoxesDTO4 = new OASShipmentBoxesDTO();

        System.assert(shipmentBoxesDTO1.equals(shipmentBoxesDTO2));
        System.assert(shipmentBoxesDTO3.equals(shipmentBoxesDTO4));
        System.assertEquals(shipmentBoxesDTO1.hashCode(), shipmentBoxesDTO2.hashCode());
        System.assertEquals(shipmentBoxesDTO3.hashCode(), shipmentBoxesDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASShipmentBoxesDTO shipmentBoxesDTO = new OASShipmentBoxesDTO();
        System.assertEquals(new List<OASParcelBoxDTO>(), shipmentBoxesDTO.boxes);
    }
}
