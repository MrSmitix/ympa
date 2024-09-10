@isTest
private class OASOrderStatusChangeDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderStatusChangeDTO orderStatusChangeDTO1 = OASOrderStatusChangeDTO.getExample();
        OASOrderStatusChangeDTO orderStatusChangeDTO2 = orderStatusChangeDTO1;
        OASOrderStatusChangeDTO orderStatusChangeDTO3 = new OASOrderStatusChangeDTO();
        OASOrderStatusChangeDTO orderStatusChangeDTO4 = orderStatusChangeDTO3;

        System.assert(orderStatusChangeDTO1.equals(orderStatusChangeDTO2));
        System.assert(orderStatusChangeDTO2.equals(orderStatusChangeDTO1));
        System.assert(orderStatusChangeDTO1.equals(orderStatusChangeDTO1));
        System.assert(orderStatusChangeDTO3.equals(orderStatusChangeDTO4));
        System.assert(orderStatusChangeDTO4.equals(orderStatusChangeDTO3));
        System.assert(orderStatusChangeDTO3.equals(orderStatusChangeDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderStatusChangeDTO orderStatusChangeDTO1 = OASOrderStatusChangeDTO.getExample();
        OASOrderStatusChangeDTO orderStatusChangeDTO2 = OASOrderStatusChangeDTO.getExample();
        OASOrderStatusChangeDTO orderStatusChangeDTO3 = new OASOrderStatusChangeDTO();
        OASOrderStatusChangeDTO orderStatusChangeDTO4 = new OASOrderStatusChangeDTO();

        System.assert(orderStatusChangeDTO1.equals(orderStatusChangeDTO2));
        System.assert(orderStatusChangeDTO2.equals(orderStatusChangeDTO1));
        System.assert(orderStatusChangeDTO3.equals(orderStatusChangeDTO4));
        System.assert(orderStatusChangeDTO4.equals(orderStatusChangeDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderStatusChangeDTO orderStatusChangeDTO1 = OASOrderStatusChangeDTO.getExample();
        OASOrderStatusChangeDTO orderStatusChangeDTO2 = new OASOrderStatusChangeDTO();

        System.assertEquals(false, orderStatusChangeDTO1.equals('foo'));
        System.assertEquals(false, orderStatusChangeDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderStatusChangeDTO orderStatusChangeDTO1 = OASOrderStatusChangeDTO.getExample();
        OASOrderStatusChangeDTO orderStatusChangeDTO2 = new OASOrderStatusChangeDTO();
        OASOrderStatusChangeDTO orderStatusChangeDTO3;

        System.assertEquals(false, orderStatusChangeDTO1.equals(orderStatusChangeDTO3));
        System.assertEquals(false, orderStatusChangeDTO2.equals(orderStatusChangeDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderStatusChangeDTO orderStatusChangeDTO1 = OASOrderStatusChangeDTO.getExample();
        OASOrderStatusChangeDTO orderStatusChangeDTO2 = new OASOrderStatusChangeDTO();

        System.assertEquals(orderStatusChangeDTO1.hashCode(), orderStatusChangeDTO1.hashCode());
        System.assertEquals(orderStatusChangeDTO2.hashCode(), orderStatusChangeDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderStatusChangeDTO orderStatusChangeDTO1 = OASOrderStatusChangeDTO.getExample();
        OASOrderStatusChangeDTO orderStatusChangeDTO2 = OASOrderStatusChangeDTO.getExample();
        OASOrderStatusChangeDTO orderStatusChangeDTO3 = new OASOrderStatusChangeDTO();
        OASOrderStatusChangeDTO orderStatusChangeDTO4 = new OASOrderStatusChangeDTO();

        System.assert(orderStatusChangeDTO1.equals(orderStatusChangeDTO2));
        System.assert(orderStatusChangeDTO3.equals(orderStatusChangeDTO4));
        System.assertEquals(orderStatusChangeDTO1.hashCode(), orderStatusChangeDTO2.hashCode());
        System.assertEquals(orderStatusChangeDTO3.hashCode(), orderStatusChangeDTO4.hashCode());
    }
}
