@isTest
private class OASOrderDeliveryDateDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderDeliveryDateDTO orderDeliveryDateDTO1 = OASOrderDeliveryDateDTO.getExample();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO2 = orderDeliveryDateDTO1;
        OASOrderDeliveryDateDTO orderDeliveryDateDTO3 = new OASOrderDeliveryDateDTO();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO4 = orderDeliveryDateDTO3;

        System.assert(orderDeliveryDateDTO1.equals(orderDeliveryDateDTO2));
        System.assert(orderDeliveryDateDTO2.equals(orderDeliveryDateDTO1));
        System.assert(orderDeliveryDateDTO1.equals(orderDeliveryDateDTO1));
        System.assert(orderDeliveryDateDTO3.equals(orderDeliveryDateDTO4));
        System.assert(orderDeliveryDateDTO4.equals(orderDeliveryDateDTO3));
        System.assert(orderDeliveryDateDTO3.equals(orderDeliveryDateDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderDeliveryDateDTO orderDeliveryDateDTO1 = OASOrderDeliveryDateDTO.getExample();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO2 = OASOrderDeliveryDateDTO.getExample();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO3 = new OASOrderDeliveryDateDTO();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO4 = new OASOrderDeliveryDateDTO();

        System.assert(orderDeliveryDateDTO1.equals(orderDeliveryDateDTO2));
        System.assert(orderDeliveryDateDTO2.equals(orderDeliveryDateDTO1));
        System.assert(orderDeliveryDateDTO3.equals(orderDeliveryDateDTO4));
        System.assert(orderDeliveryDateDTO4.equals(orderDeliveryDateDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderDeliveryDateDTO orderDeliveryDateDTO1 = OASOrderDeliveryDateDTO.getExample();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO2 = new OASOrderDeliveryDateDTO();

        System.assertEquals(false, orderDeliveryDateDTO1.equals('foo'));
        System.assertEquals(false, orderDeliveryDateDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderDeliveryDateDTO orderDeliveryDateDTO1 = OASOrderDeliveryDateDTO.getExample();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO2 = new OASOrderDeliveryDateDTO();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO3;

        System.assertEquals(false, orderDeliveryDateDTO1.equals(orderDeliveryDateDTO3));
        System.assertEquals(false, orderDeliveryDateDTO2.equals(orderDeliveryDateDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderDeliveryDateDTO orderDeliveryDateDTO1 = OASOrderDeliveryDateDTO.getExample();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO2 = new OASOrderDeliveryDateDTO();

        System.assertEquals(orderDeliveryDateDTO1.hashCode(), orderDeliveryDateDTO1.hashCode());
        System.assertEquals(orderDeliveryDateDTO2.hashCode(), orderDeliveryDateDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderDeliveryDateDTO orderDeliveryDateDTO1 = OASOrderDeliveryDateDTO.getExample();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO2 = OASOrderDeliveryDateDTO.getExample();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO3 = new OASOrderDeliveryDateDTO();
        OASOrderDeliveryDateDTO orderDeliveryDateDTO4 = new OASOrderDeliveryDateDTO();

        System.assert(orderDeliveryDateDTO1.equals(orderDeliveryDateDTO2));
        System.assert(orderDeliveryDateDTO3.equals(orderDeliveryDateDTO4));
        System.assertEquals(orderDeliveryDateDTO1.hashCode(), orderDeliveryDateDTO2.hashCode());
        System.assertEquals(orderDeliveryDateDTO3.hashCode(), orderDeliveryDateDTO4.hashCode());
    }
}
