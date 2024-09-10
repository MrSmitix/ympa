@isTest
private class OASOrderShipmentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderShipmentDTO orderShipmentDTO1 = OASOrderShipmentDTO.getExample();
        OASOrderShipmentDTO orderShipmentDTO2 = orderShipmentDTO1;
        OASOrderShipmentDTO orderShipmentDTO3 = new OASOrderShipmentDTO();
        OASOrderShipmentDTO orderShipmentDTO4 = orderShipmentDTO3;

        System.assert(orderShipmentDTO1.equals(orderShipmentDTO2));
        System.assert(orderShipmentDTO2.equals(orderShipmentDTO1));
        System.assert(orderShipmentDTO1.equals(orderShipmentDTO1));
        System.assert(orderShipmentDTO3.equals(orderShipmentDTO4));
        System.assert(orderShipmentDTO4.equals(orderShipmentDTO3));
        System.assert(orderShipmentDTO3.equals(orderShipmentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderShipmentDTO orderShipmentDTO1 = OASOrderShipmentDTO.getExample();
        OASOrderShipmentDTO orderShipmentDTO2 = OASOrderShipmentDTO.getExample();
        OASOrderShipmentDTO orderShipmentDTO3 = new OASOrderShipmentDTO();
        OASOrderShipmentDTO orderShipmentDTO4 = new OASOrderShipmentDTO();

        System.assert(orderShipmentDTO1.equals(orderShipmentDTO2));
        System.assert(orderShipmentDTO2.equals(orderShipmentDTO1));
        System.assert(orderShipmentDTO3.equals(orderShipmentDTO4));
        System.assert(orderShipmentDTO4.equals(orderShipmentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderShipmentDTO orderShipmentDTO1 = OASOrderShipmentDTO.getExample();
        OASOrderShipmentDTO orderShipmentDTO2 = new OASOrderShipmentDTO();

        System.assertEquals(false, orderShipmentDTO1.equals('foo'));
        System.assertEquals(false, orderShipmentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderShipmentDTO orderShipmentDTO1 = OASOrderShipmentDTO.getExample();
        OASOrderShipmentDTO orderShipmentDTO2 = new OASOrderShipmentDTO();
        OASOrderShipmentDTO orderShipmentDTO3;

        System.assertEquals(false, orderShipmentDTO1.equals(orderShipmentDTO3));
        System.assertEquals(false, orderShipmentDTO2.equals(orderShipmentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderShipmentDTO orderShipmentDTO1 = OASOrderShipmentDTO.getExample();
        OASOrderShipmentDTO orderShipmentDTO2 = new OASOrderShipmentDTO();

        System.assertEquals(orderShipmentDTO1.hashCode(), orderShipmentDTO1.hashCode());
        System.assertEquals(orderShipmentDTO2.hashCode(), orderShipmentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderShipmentDTO orderShipmentDTO1 = OASOrderShipmentDTO.getExample();
        OASOrderShipmentDTO orderShipmentDTO2 = OASOrderShipmentDTO.getExample();
        OASOrderShipmentDTO orderShipmentDTO3 = new OASOrderShipmentDTO();
        OASOrderShipmentDTO orderShipmentDTO4 = new OASOrderShipmentDTO();

        System.assert(orderShipmentDTO1.equals(orderShipmentDTO2));
        System.assert(orderShipmentDTO3.equals(orderShipmentDTO4));
        System.assertEquals(orderShipmentDTO1.hashCode(), orderShipmentDTO2.hashCode());
        System.assertEquals(orderShipmentDTO3.hashCode(), orderShipmentDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderShipmentDTO orderShipmentDTO = new OASOrderShipmentDTO();
        System.assertEquals(new List<OASOrderTrackDTO>(), orderShipmentDTO.tracks);
        System.assertEquals(new List<OASOrderParcelBoxDTO>(), orderShipmentDTO.boxes);
        System.assertEquals(null, orderShipmentDTO.id);
        System.assertEquals(null, orderShipmentDTO.shipmentDate);
        System.assertEquals(null, orderShipmentDTO.shipmentTime);
    }
}
