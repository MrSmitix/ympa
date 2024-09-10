@isTest
private class OASOrderItemDetailDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderItemDetailDTO orderItemDetailDTO1 = OASOrderItemDetailDTO.getExample();
        OASOrderItemDetailDTO orderItemDetailDTO2 = orderItemDetailDTO1;
        OASOrderItemDetailDTO orderItemDetailDTO3 = new OASOrderItemDetailDTO();
        OASOrderItemDetailDTO orderItemDetailDTO4 = orderItemDetailDTO3;

        System.assert(orderItemDetailDTO1.equals(orderItemDetailDTO2));
        System.assert(orderItemDetailDTO2.equals(orderItemDetailDTO1));
        System.assert(orderItemDetailDTO1.equals(orderItemDetailDTO1));
        System.assert(orderItemDetailDTO3.equals(orderItemDetailDTO4));
        System.assert(orderItemDetailDTO4.equals(orderItemDetailDTO3));
        System.assert(orderItemDetailDTO3.equals(orderItemDetailDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderItemDetailDTO orderItemDetailDTO1 = OASOrderItemDetailDTO.getExample();
        OASOrderItemDetailDTO orderItemDetailDTO2 = OASOrderItemDetailDTO.getExample();
        OASOrderItemDetailDTO orderItemDetailDTO3 = new OASOrderItemDetailDTO();
        OASOrderItemDetailDTO orderItemDetailDTO4 = new OASOrderItemDetailDTO();

        System.assert(orderItemDetailDTO1.equals(orderItemDetailDTO2));
        System.assert(orderItemDetailDTO2.equals(orderItemDetailDTO1));
        System.assert(orderItemDetailDTO3.equals(orderItemDetailDTO4));
        System.assert(orderItemDetailDTO4.equals(orderItemDetailDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderItemDetailDTO orderItemDetailDTO1 = OASOrderItemDetailDTO.getExample();
        OASOrderItemDetailDTO orderItemDetailDTO2 = new OASOrderItemDetailDTO();

        System.assertEquals(false, orderItemDetailDTO1.equals('foo'));
        System.assertEquals(false, orderItemDetailDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderItemDetailDTO orderItemDetailDTO1 = OASOrderItemDetailDTO.getExample();
        OASOrderItemDetailDTO orderItemDetailDTO2 = new OASOrderItemDetailDTO();
        OASOrderItemDetailDTO orderItemDetailDTO3;

        System.assertEquals(false, orderItemDetailDTO1.equals(orderItemDetailDTO3));
        System.assertEquals(false, orderItemDetailDTO2.equals(orderItemDetailDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderItemDetailDTO orderItemDetailDTO1 = OASOrderItemDetailDTO.getExample();
        OASOrderItemDetailDTO orderItemDetailDTO2 = new OASOrderItemDetailDTO();

        System.assertEquals(orderItemDetailDTO1.hashCode(), orderItemDetailDTO1.hashCode());
        System.assertEquals(orderItemDetailDTO2.hashCode(), orderItemDetailDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderItemDetailDTO orderItemDetailDTO1 = OASOrderItemDetailDTO.getExample();
        OASOrderItemDetailDTO orderItemDetailDTO2 = OASOrderItemDetailDTO.getExample();
        OASOrderItemDetailDTO orderItemDetailDTO3 = new OASOrderItemDetailDTO();
        OASOrderItemDetailDTO orderItemDetailDTO4 = new OASOrderItemDetailDTO();

        System.assert(orderItemDetailDTO1.equals(orderItemDetailDTO2));
        System.assert(orderItemDetailDTO3.equals(orderItemDetailDTO4));
        System.assertEquals(orderItemDetailDTO1.hashCode(), orderItemDetailDTO2.hashCode());
        System.assertEquals(orderItemDetailDTO3.hashCode(), orderItemDetailDTO4.hashCode());
    }
}
