@isTest
private class OASOrderStatusChangeDeliveryDatesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO1 = OASOrderStatusChangeDeliveryDatesDTO.getExample();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO2 = orderStatusChangeDeliveryDatesDTO1;
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO3 = new OASOrderStatusChangeDeliveryDatesDTO();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO4 = orderStatusChangeDeliveryDatesDTO3;

        System.assert(orderStatusChangeDeliveryDatesDTO1.equals(orderStatusChangeDeliveryDatesDTO2));
        System.assert(orderStatusChangeDeliveryDatesDTO2.equals(orderStatusChangeDeliveryDatesDTO1));
        System.assert(orderStatusChangeDeliveryDatesDTO1.equals(orderStatusChangeDeliveryDatesDTO1));
        System.assert(orderStatusChangeDeliveryDatesDTO3.equals(orderStatusChangeDeliveryDatesDTO4));
        System.assert(orderStatusChangeDeliveryDatesDTO4.equals(orderStatusChangeDeliveryDatesDTO3));
        System.assert(orderStatusChangeDeliveryDatesDTO3.equals(orderStatusChangeDeliveryDatesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO1 = OASOrderStatusChangeDeliveryDatesDTO.getExample();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO2 = OASOrderStatusChangeDeliveryDatesDTO.getExample();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO3 = new OASOrderStatusChangeDeliveryDatesDTO();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO4 = new OASOrderStatusChangeDeliveryDatesDTO();

        System.assert(orderStatusChangeDeliveryDatesDTO1.equals(orderStatusChangeDeliveryDatesDTO2));
        System.assert(orderStatusChangeDeliveryDatesDTO2.equals(orderStatusChangeDeliveryDatesDTO1));
        System.assert(orderStatusChangeDeliveryDatesDTO3.equals(orderStatusChangeDeliveryDatesDTO4));
        System.assert(orderStatusChangeDeliveryDatesDTO4.equals(orderStatusChangeDeliveryDatesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO1 = OASOrderStatusChangeDeliveryDatesDTO.getExample();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO2 = new OASOrderStatusChangeDeliveryDatesDTO();

        System.assertEquals(false, orderStatusChangeDeliveryDatesDTO1.equals('foo'));
        System.assertEquals(false, orderStatusChangeDeliveryDatesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO1 = OASOrderStatusChangeDeliveryDatesDTO.getExample();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO2 = new OASOrderStatusChangeDeliveryDatesDTO();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO3;

        System.assertEquals(false, orderStatusChangeDeliveryDatesDTO1.equals(orderStatusChangeDeliveryDatesDTO3));
        System.assertEquals(false, orderStatusChangeDeliveryDatesDTO2.equals(orderStatusChangeDeliveryDatesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO1 = OASOrderStatusChangeDeliveryDatesDTO.getExample();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO2 = new OASOrderStatusChangeDeliveryDatesDTO();

        System.assertEquals(orderStatusChangeDeliveryDatesDTO1.hashCode(), orderStatusChangeDeliveryDatesDTO1.hashCode());
        System.assertEquals(orderStatusChangeDeliveryDatesDTO2.hashCode(), orderStatusChangeDeliveryDatesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO1 = OASOrderStatusChangeDeliveryDatesDTO.getExample();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO2 = OASOrderStatusChangeDeliveryDatesDTO.getExample();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO3 = new OASOrderStatusChangeDeliveryDatesDTO();
        OASOrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO4 = new OASOrderStatusChangeDeliveryDatesDTO();

        System.assert(orderStatusChangeDeliveryDatesDTO1.equals(orderStatusChangeDeliveryDatesDTO2));
        System.assert(orderStatusChangeDeliveryDatesDTO3.equals(orderStatusChangeDeliveryDatesDTO4));
        System.assertEquals(orderStatusChangeDeliveryDatesDTO1.hashCode(), orderStatusChangeDeliveryDatesDTO2.hashCode());
        System.assertEquals(orderStatusChangeDeliveryDatesDTO3.hashCode(), orderStatusChangeDeliveryDatesDTO4.hashCode());
    }
}
