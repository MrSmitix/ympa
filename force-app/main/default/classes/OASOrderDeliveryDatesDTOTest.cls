@isTest
private class OASOrderDeliveryDatesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO1 = OASOrderDeliveryDatesDTO.getExample();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO2 = orderDeliveryDatesDTO1;
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO3 = new OASOrderDeliveryDatesDTO();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO4 = orderDeliveryDatesDTO3;

        System.assert(orderDeliveryDatesDTO1.equals(orderDeliveryDatesDTO2));
        System.assert(orderDeliveryDatesDTO2.equals(orderDeliveryDatesDTO1));
        System.assert(orderDeliveryDatesDTO1.equals(orderDeliveryDatesDTO1));
        System.assert(orderDeliveryDatesDTO3.equals(orderDeliveryDatesDTO4));
        System.assert(orderDeliveryDatesDTO4.equals(orderDeliveryDatesDTO3));
        System.assert(orderDeliveryDatesDTO3.equals(orderDeliveryDatesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO1 = OASOrderDeliveryDatesDTO.getExample();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO2 = OASOrderDeliveryDatesDTO.getExample();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO3 = new OASOrderDeliveryDatesDTO();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO4 = new OASOrderDeliveryDatesDTO();

        System.assert(orderDeliveryDatesDTO1.equals(orderDeliveryDatesDTO2));
        System.assert(orderDeliveryDatesDTO2.equals(orderDeliveryDatesDTO1));
        System.assert(orderDeliveryDatesDTO3.equals(orderDeliveryDatesDTO4));
        System.assert(orderDeliveryDatesDTO4.equals(orderDeliveryDatesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO1 = OASOrderDeliveryDatesDTO.getExample();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO2 = new OASOrderDeliveryDatesDTO();

        System.assertEquals(false, orderDeliveryDatesDTO1.equals('foo'));
        System.assertEquals(false, orderDeliveryDatesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO1 = OASOrderDeliveryDatesDTO.getExample();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO2 = new OASOrderDeliveryDatesDTO();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO3;

        System.assertEquals(false, orderDeliveryDatesDTO1.equals(orderDeliveryDatesDTO3));
        System.assertEquals(false, orderDeliveryDatesDTO2.equals(orderDeliveryDatesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO1 = OASOrderDeliveryDatesDTO.getExample();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO2 = new OASOrderDeliveryDatesDTO();

        System.assertEquals(orderDeliveryDatesDTO1.hashCode(), orderDeliveryDatesDTO1.hashCode());
        System.assertEquals(orderDeliveryDatesDTO2.hashCode(), orderDeliveryDatesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO1 = OASOrderDeliveryDatesDTO.getExample();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO2 = OASOrderDeliveryDatesDTO.getExample();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO3 = new OASOrderDeliveryDatesDTO();
        OASOrderDeliveryDatesDTO orderDeliveryDatesDTO4 = new OASOrderDeliveryDatesDTO();

        System.assert(orderDeliveryDatesDTO1.equals(orderDeliveryDatesDTO2));
        System.assert(orderDeliveryDatesDTO3.equals(orderDeliveryDatesDTO4));
        System.assertEquals(orderDeliveryDatesDTO1.hashCode(), orderDeliveryDatesDTO2.hashCode());
        System.assertEquals(orderDeliveryDatesDTO3.hashCode(), orderDeliveryDatesDTO4.hashCode());
    }
}
