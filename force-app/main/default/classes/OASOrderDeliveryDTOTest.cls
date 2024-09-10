@isTest
private class OASOrderDeliveryDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderDeliveryDTO orderDeliveryDTO1 = OASOrderDeliveryDTO.getExample();
        OASOrderDeliveryDTO orderDeliveryDTO2 = orderDeliveryDTO1;
        OASOrderDeliveryDTO orderDeliveryDTO3 = new OASOrderDeliveryDTO();
        OASOrderDeliveryDTO orderDeliveryDTO4 = orderDeliveryDTO3;

        System.assert(orderDeliveryDTO1.equals(orderDeliveryDTO2));
        System.assert(orderDeliveryDTO2.equals(orderDeliveryDTO1));
        System.assert(orderDeliveryDTO1.equals(orderDeliveryDTO1));
        System.assert(orderDeliveryDTO3.equals(orderDeliveryDTO4));
        System.assert(orderDeliveryDTO4.equals(orderDeliveryDTO3));
        System.assert(orderDeliveryDTO3.equals(orderDeliveryDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderDeliveryDTO orderDeliveryDTO1 = OASOrderDeliveryDTO.getExample();
        OASOrderDeliveryDTO orderDeliveryDTO2 = OASOrderDeliveryDTO.getExample();
        OASOrderDeliveryDTO orderDeliveryDTO3 = new OASOrderDeliveryDTO();
        OASOrderDeliveryDTO orderDeliveryDTO4 = new OASOrderDeliveryDTO();

        System.assert(orderDeliveryDTO1.equals(orderDeliveryDTO2));
        System.assert(orderDeliveryDTO2.equals(orderDeliveryDTO1));
        System.assert(orderDeliveryDTO3.equals(orderDeliveryDTO4));
        System.assert(orderDeliveryDTO4.equals(orderDeliveryDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderDeliveryDTO orderDeliveryDTO1 = OASOrderDeliveryDTO.getExample();
        OASOrderDeliveryDTO orderDeliveryDTO2 = new OASOrderDeliveryDTO();

        System.assertEquals(false, orderDeliveryDTO1.equals('foo'));
        System.assertEquals(false, orderDeliveryDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderDeliveryDTO orderDeliveryDTO1 = OASOrderDeliveryDTO.getExample();
        OASOrderDeliveryDTO orderDeliveryDTO2 = new OASOrderDeliveryDTO();
        OASOrderDeliveryDTO orderDeliveryDTO3;

        System.assertEquals(false, orderDeliveryDTO1.equals(orderDeliveryDTO3));
        System.assertEquals(false, orderDeliveryDTO2.equals(orderDeliveryDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderDeliveryDTO orderDeliveryDTO1 = OASOrderDeliveryDTO.getExample();
        OASOrderDeliveryDTO orderDeliveryDTO2 = new OASOrderDeliveryDTO();

        System.assertEquals(orderDeliveryDTO1.hashCode(), orderDeliveryDTO1.hashCode());
        System.assertEquals(orderDeliveryDTO2.hashCode(), orderDeliveryDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderDeliveryDTO orderDeliveryDTO1 = OASOrderDeliveryDTO.getExample();
        OASOrderDeliveryDTO orderDeliveryDTO2 = OASOrderDeliveryDTO.getExample();
        OASOrderDeliveryDTO orderDeliveryDTO3 = new OASOrderDeliveryDTO();
        OASOrderDeliveryDTO orderDeliveryDTO4 = new OASOrderDeliveryDTO();

        System.assert(orderDeliveryDTO1.equals(orderDeliveryDTO2));
        System.assert(orderDeliveryDTO3.equals(orderDeliveryDTO4));
        System.assertEquals(orderDeliveryDTO1.hashCode(), orderDeliveryDTO2.hashCode());
        System.assertEquals(orderDeliveryDTO3.hashCode(), orderDeliveryDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderDeliveryDTO orderDeliveryDTO = new OASOrderDeliveryDTO();
        System.assertEquals(new List<OASOrderTrackDTO>(), orderDeliveryDTO.tracks);
        System.assertEquals(new List<OASOrderShipmentDTO>(), orderDeliveryDTO.shipments);
        System.assertEquals(null, orderDeliveryDTO.id);
        System.assertEquals(null, orderDeliveryDTO.type);
        System.assertEquals(null, orderDeliveryDTO.serviceName);
        System.assertEquals(null, orderDeliveryDTO.price);
        System.assertEquals(null, orderDeliveryDTO.deliveryPartnerType);
        System.assertEquals(null, orderDeliveryDTO.courier);
        System.assertEquals(null, orderDeliveryDTO.dates);
        System.assertEquals(null, orderDeliveryDTO.region);
        System.assertEquals(null, orderDeliveryDTO.address);
        System.assertEquals(null, orderDeliveryDTO.vat);
        System.assertEquals(null, orderDeliveryDTO.deliveryServiceId);
        System.assertEquals(null, orderDeliveryDTO.liftType);
        System.assertEquals(null, orderDeliveryDTO.liftPrice);
        System.assertEquals(null, orderDeliveryDTO.outletCode);
        System.assertEquals(null, orderDeliveryDTO.outletStorageLimitDate);
        System.assertEquals(null, orderDeliveryDTO.dispatchType);
        System.assertEquals(null, orderDeliveryDTO.estimated);
        System.assertEquals(null, orderDeliveryDTO.eacType);
        System.assertEquals(null, orderDeliveryDTO.eacCode);
    }
}
