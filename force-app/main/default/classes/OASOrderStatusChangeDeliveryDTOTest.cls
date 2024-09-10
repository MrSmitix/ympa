@isTest
private class OASOrderStatusChangeDeliveryDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO1 = OASOrderStatusChangeDeliveryDTO.getExample();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO2 = orderStatusChangeDeliveryDTO1;
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO3 = new OASOrderStatusChangeDeliveryDTO();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO4 = orderStatusChangeDeliveryDTO3;

        System.assert(orderStatusChangeDeliveryDTO1.equals(orderStatusChangeDeliveryDTO2));
        System.assert(orderStatusChangeDeliveryDTO2.equals(orderStatusChangeDeliveryDTO1));
        System.assert(orderStatusChangeDeliveryDTO1.equals(orderStatusChangeDeliveryDTO1));
        System.assert(orderStatusChangeDeliveryDTO3.equals(orderStatusChangeDeliveryDTO4));
        System.assert(orderStatusChangeDeliveryDTO4.equals(orderStatusChangeDeliveryDTO3));
        System.assert(orderStatusChangeDeliveryDTO3.equals(orderStatusChangeDeliveryDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO1 = OASOrderStatusChangeDeliveryDTO.getExample();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO2 = OASOrderStatusChangeDeliveryDTO.getExample();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO3 = new OASOrderStatusChangeDeliveryDTO();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO4 = new OASOrderStatusChangeDeliveryDTO();

        System.assert(orderStatusChangeDeliveryDTO1.equals(orderStatusChangeDeliveryDTO2));
        System.assert(orderStatusChangeDeliveryDTO2.equals(orderStatusChangeDeliveryDTO1));
        System.assert(orderStatusChangeDeliveryDTO3.equals(orderStatusChangeDeliveryDTO4));
        System.assert(orderStatusChangeDeliveryDTO4.equals(orderStatusChangeDeliveryDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO1 = OASOrderStatusChangeDeliveryDTO.getExample();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO2 = new OASOrderStatusChangeDeliveryDTO();

        System.assertEquals(false, orderStatusChangeDeliveryDTO1.equals('foo'));
        System.assertEquals(false, orderStatusChangeDeliveryDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO1 = OASOrderStatusChangeDeliveryDTO.getExample();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO2 = new OASOrderStatusChangeDeliveryDTO();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO3;

        System.assertEquals(false, orderStatusChangeDeliveryDTO1.equals(orderStatusChangeDeliveryDTO3));
        System.assertEquals(false, orderStatusChangeDeliveryDTO2.equals(orderStatusChangeDeliveryDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO1 = OASOrderStatusChangeDeliveryDTO.getExample();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO2 = new OASOrderStatusChangeDeliveryDTO();

        System.assertEquals(orderStatusChangeDeliveryDTO1.hashCode(), orderStatusChangeDeliveryDTO1.hashCode());
        System.assertEquals(orderStatusChangeDeliveryDTO2.hashCode(), orderStatusChangeDeliveryDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO1 = OASOrderStatusChangeDeliveryDTO.getExample();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO2 = OASOrderStatusChangeDeliveryDTO.getExample();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO3 = new OASOrderStatusChangeDeliveryDTO();
        OASOrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO4 = new OASOrderStatusChangeDeliveryDTO();

        System.assert(orderStatusChangeDeliveryDTO1.equals(orderStatusChangeDeliveryDTO2));
        System.assert(orderStatusChangeDeliveryDTO3.equals(orderStatusChangeDeliveryDTO4));
        System.assertEquals(orderStatusChangeDeliveryDTO1.hashCode(), orderStatusChangeDeliveryDTO2.hashCode());
        System.assertEquals(orderStatusChangeDeliveryDTO3.hashCode(), orderStatusChangeDeliveryDTO4.hashCode());
    }
}
