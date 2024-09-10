@isTest
private class OASOrderDeliveryAddressDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO1 = OASOrderDeliveryAddressDTO.getExample();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO2 = orderDeliveryAddressDTO1;
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO3 = new OASOrderDeliveryAddressDTO();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO4 = orderDeliveryAddressDTO3;

        System.assert(orderDeliveryAddressDTO1.equals(orderDeliveryAddressDTO2));
        System.assert(orderDeliveryAddressDTO2.equals(orderDeliveryAddressDTO1));
        System.assert(orderDeliveryAddressDTO1.equals(orderDeliveryAddressDTO1));
        System.assert(orderDeliveryAddressDTO3.equals(orderDeliveryAddressDTO4));
        System.assert(orderDeliveryAddressDTO4.equals(orderDeliveryAddressDTO3));
        System.assert(orderDeliveryAddressDTO3.equals(orderDeliveryAddressDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO1 = OASOrderDeliveryAddressDTO.getExample();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO2 = OASOrderDeliveryAddressDTO.getExample();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO3 = new OASOrderDeliveryAddressDTO();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO4 = new OASOrderDeliveryAddressDTO();

        System.assert(orderDeliveryAddressDTO1.equals(orderDeliveryAddressDTO2));
        System.assert(orderDeliveryAddressDTO2.equals(orderDeliveryAddressDTO1));
        System.assert(orderDeliveryAddressDTO3.equals(orderDeliveryAddressDTO4));
        System.assert(orderDeliveryAddressDTO4.equals(orderDeliveryAddressDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO1 = OASOrderDeliveryAddressDTO.getExample();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO2 = new OASOrderDeliveryAddressDTO();

        System.assertEquals(false, orderDeliveryAddressDTO1.equals('foo'));
        System.assertEquals(false, orderDeliveryAddressDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO1 = OASOrderDeliveryAddressDTO.getExample();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO2 = new OASOrderDeliveryAddressDTO();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO3;

        System.assertEquals(false, orderDeliveryAddressDTO1.equals(orderDeliveryAddressDTO3));
        System.assertEquals(false, orderDeliveryAddressDTO2.equals(orderDeliveryAddressDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO1 = OASOrderDeliveryAddressDTO.getExample();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO2 = new OASOrderDeliveryAddressDTO();

        System.assertEquals(orderDeliveryAddressDTO1.hashCode(), orderDeliveryAddressDTO1.hashCode());
        System.assertEquals(orderDeliveryAddressDTO2.hashCode(), orderDeliveryAddressDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO1 = OASOrderDeliveryAddressDTO.getExample();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO2 = OASOrderDeliveryAddressDTO.getExample();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO3 = new OASOrderDeliveryAddressDTO();
        OASOrderDeliveryAddressDTO orderDeliveryAddressDTO4 = new OASOrderDeliveryAddressDTO();

        System.assert(orderDeliveryAddressDTO1.equals(orderDeliveryAddressDTO2));
        System.assert(orderDeliveryAddressDTO3.equals(orderDeliveryAddressDTO4));
        System.assertEquals(orderDeliveryAddressDTO1.hashCode(), orderDeliveryAddressDTO2.hashCode());
        System.assertEquals(orderDeliveryAddressDTO3.hashCode(), orderDeliveryAddressDTO4.hashCode());
    }
}
