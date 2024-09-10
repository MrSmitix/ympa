@isTest
private class OASOrderItemPromoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderItemPromoDTO orderItemPromoDTO1 = OASOrderItemPromoDTO.getExample();
        OASOrderItemPromoDTO orderItemPromoDTO2 = orderItemPromoDTO1;
        OASOrderItemPromoDTO orderItemPromoDTO3 = new OASOrderItemPromoDTO();
        OASOrderItemPromoDTO orderItemPromoDTO4 = orderItemPromoDTO3;

        System.assert(orderItemPromoDTO1.equals(orderItemPromoDTO2));
        System.assert(orderItemPromoDTO2.equals(orderItemPromoDTO1));
        System.assert(orderItemPromoDTO1.equals(orderItemPromoDTO1));
        System.assert(orderItemPromoDTO3.equals(orderItemPromoDTO4));
        System.assert(orderItemPromoDTO4.equals(orderItemPromoDTO3));
        System.assert(orderItemPromoDTO3.equals(orderItemPromoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderItemPromoDTO orderItemPromoDTO1 = OASOrderItemPromoDTO.getExample();
        OASOrderItemPromoDTO orderItemPromoDTO2 = OASOrderItemPromoDTO.getExample();
        OASOrderItemPromoDTO orderItemPromoDTO3 = new OASOrderItemPromoDTO();
        OASOrderItemPromoDTO orderItemPromoDTO4 = new OASOrderItemPromoDTO();

        System.assert(orderItemPromoDTO1.equals(orderItemPromoDTO2));
        System.assert(orderItemPromoDTO2.equals(orderItemPromoDTO1));
        System.assert(orderItemPromoDTO3.equals(orderItemPromoDTO4));
        System.assert(orderItemPromoDTO4.equals(orderItemPromoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderItemPromoDTO orderItemPromoDTO1 = OASOrderItemPromoDTO.getExample();
        OASOrderItemPromoDTO orderItemPromoDTO2 = new OASOrderItemPromoDTO();

        System.assertEquals(false, orderItemPromoDTO1.equals('foo'));
        System.assertEquals(false, orderItemPromoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderItemPromoDTO orderItemPromoDTO1 = OASOrderItemPromoDTO.getExample();
        OASOrderItemPromoDTO orderItemPromoDTO2 = new OASOrderItemPromoDTO();
        OASOrderItemPromoDTO orderItemPromoDTO3;

        System.assertEquals(false, orderItemPromoDTO1.equals(orderItemPromoDTO3));
        System.assertEquals(false, orderItemPromoDTO2.equals(orderItemPromoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderItemPromoDTO orderItemPromoDTO1 = OASOrderItemPromoDTO.getExample();
        OASOrderItemPromoDTO orderItemPromoDTO2 = new OASOrderItemPromoDTO();

        System.assertEquals(orderItemPromoDTO1.hashCode(), orderItemPromoDTO1.hashCode());
        System.assertEquals(orderItemPromoDTO2.hashCode(), orderItemPromoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderItemPromoDTO orderItemPromoDTO1 = OASOrderItemPromoDTO.getExample();
        OASOrderItemPromoDTO orderItemPromoDTO2 = OASOrderItemPromoDTO.getExample();
        OASOrderItemPromoDTO orderItemPromoDTO3 = new OASOrderItemPromoDTO();
        OASOrderItemPromoDTO orderItemPromoDTO4 = new OASOrderItemPromoDTO();

        System.assert(orderItemPromoDTO1.equals(orderItemPromoDTO2));
        System.assert(orderItemPromoDTO3.equals(orderItemPromoDTO4));
        System.assertEquals(orderItemPromoDTO1.hashCode(), orderItemPromoDTO2.hashCode());
        System.assertEquals(orderItemPromoDTO3.hashCode(), orderItemPromoDTO4.hashCode());
    }
}
