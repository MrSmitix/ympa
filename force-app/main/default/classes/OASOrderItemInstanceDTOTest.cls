@isTest
private class OASOrderItemInstanceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderItemInstanceDTO orderItemInstanceDTO1 = OASOrderItemInstanceDTO.getExample();
        OASOrderItemInstanceDTO orderItemInstanceDTO2 = orderItemInstanceDTO1;
        OASOrderItemInstanceDTO orderItemInstanceDTO3 = new OASOrderItemInstanceDTO();
        OASOrderItemInstanceDTO orderItemInstanceDTO4 = orderItemInstanceDTO3;

        System.assert(orderItemInstanceDTO1.equals(orderItemInstanceDTO2));
        System.assert(orderItemInstanceDTO2.equals(orderItemInstanceDTO1));
        System.assert(orderItemInstanceDTO1.equals(orderItemInstanceDTO1));
        System.assert(orderItemInstanceDTO3.equals(orderItemInstanceDTO4));
        System.assert(orderItemInstanceDTO4.equals(orderItemInstanceDTO3));
        System.assert(orderItemInstanceDTO3.equals(orderItemInstanceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderItemInstanceDTO orderItemInstanceDTO1 = OASOrderItemInstanceDTO.getExample();
        OASOrderItemInstanceDTO orderItemInstanceDTO2 = OASOrderItemInstanceDTO.getExample();
        OASOrderItemInstanceDTO orderItemInstanceDTO3 = new OASOrderItemInstanceDTO();
        OASOrderItemInstanceDTO orderItemInstanceDTO4 = new OASOrderItemInstanceDTO();

        System.assert(orderItemInstanceDTO1.equals(orderItemInstanceDTO2));
        System.assert(orderItemInstanceDTO2.equals(orderItemInstanceDTO1));
        System.assert(orderItemInstanceDTO3.equals(orderItemInstanceDTO4));
        System.assert(orderItemInstanceDTO4.equals(orderItemInstanceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderItemInstanceDTO orderItemInstanceDTO1 = OASOrderItemInstanceDTO.getExample();
        OASOrderItemInstanceDTO orderItemInstanceDTO2 = new OASOrderItemInstanceDTO();

        System.assertEquals(false, orderItemInstanceDTO1.equals('foo'));
        System.assertEquals(false, orderItemInstanceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderItemInstanceDTO orderItemInstanceDTO1 = OASOrderItemInstanceDTO.getExample();
        OASOrderItemInstanceDTO orderItemInstanceDTO2 = new OASOrderItemInstanceDTO();
        OASOrderItemInstanceDTO orderItemInstanceDTO3;

        System.assertEquals(false, orderItemInstanceDTO1.equals(orderItemInstanceDTO3));
        System.assertEquals(false, orderItemInstanceDTO2.equals(orderItemInstanceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderItemInstanceDTO orderItemInstanceDTO1 = OASOrderItemInstanceDTO.getExample();
        OASOrderItemInstanceDTO orderItemInstanceDTO2 = new OASOrderItemInstanceDTO();

        System.assertEquals(orderItemInstanceDTO1.hashCode(), orderItemInstanceDTO1.hashCode());
        System.assertEquals(orderItemInstanceDTO2.hashCode(), orderItemInstanceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderItemInstanceDTO orderItemInstanceDTO1 = OASOrderItemInstanceDTO.getExample();
        OASOrderItemInstanceDTO orderItemInstanceDTO2 = OASOrderItemInstanceDTO.getExample();
        OASOrderItemInstanceDTO orderItemInstanceDTO3 = new OASOrderItemInstanceDTO();
        OASOrderItemInstanceDTO orderItemInstanceDTO4 = new OASOrderItemInstanceDTO();

        System.assert(orderItemInstanceDTO1.equals(orderItemInstanceDTO2));
        System.assert(orderItemInstanceDTO3.equals(orderItemInstanceDTO4));
        System.assertEquals(orderItemInstanceDTO1.hashCode(), orderItemInstanceDTO2.hashCode());
        System.assertEquals(orderItemInstanceDTO3.hashCode(), orderItemInstanceDTO4.hashCode());
    }
}
