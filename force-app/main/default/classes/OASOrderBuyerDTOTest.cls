@isTest
private class OASOrderBuyerDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBuyerDTO orderBuyerDTO1 = OASOrderBuyerDTO.getExample();
        OASOrderBuyerDTO orderBuyerDTO2 = orderBuyerDTO1;
        OASOrderBuyerDTO orderBuyerDTO3 = new OASOrderBuyerDTO();
        OASOrderBuyerDTO orderBuyerDTO4 = orderBuyerDTO3;

        System.assert(orderBuyerDTO1.equals(orderBuyerDTO2));
        System.assert(orderBuyerDTO2.equals(orderBuyerDTO1));
        System.assert(orderBuyerDTO1.equals(orderBuyerDTO1));
        System.assert(orderBuyerDTO3.equals(orderBuyerDTO4));
        System.assert(orderBuyerDTO4.equals(orderBuyerDTO3));
        System.assert(orderBuyerDTO3.equals(orderBuyerDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBuyerDTO orderBuyerDTO1 = OASOrderBuyerDTO.getExample();
        OASOrderBuyerDTO orderBuyerDTO2 = OASOrderBuyerDTO.getExample();
        OASOrderBuyerDTO orderBuyerDTO3 = new OASOrderBuyerDTO();
        OASOrderBuyerDTO orderBuyerDTO4 = new OASOrderBuyerDTO();

        System.assert(orderBuyerDTO1.equals(orderBuyerDTO2));
        System.assert(orderBuyerDTO2.equals(orderBuyerDTO1));
        System.assert(orderBuyerDTO3.equals(orderBuyerDTO4));
        System.assert(orderBuyerDTO4.equals(orderBuyerDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBuyerDTO orderBuyerDTO1 = OASOrderBuyerDTO.getExample();
        OASOrderBuyerDTO orderBuyerDTO2 = new OASOrderBuyerDTO();

        System.assertEquals(false, orderBuyerDTO1.equals('foo'));
        System.assertEquals(false, orderBuyerDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBuyerDTO orderBuyerDTO1 = OASOrderBuyerDTO.getExample();
        OASOrderBuyerDTO orderBuyerDTO2 = new OASOrderBuyerDTO();
        OASOrderBuyerDTO orderBuyerDTO3;

        System.assertEquals(false, orderBuyerDTO1.equals(orderBuyerDTO3));
        System.assertEquals(false, orderBuyerDTO2.equals(orderBuyerDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBuyerDTO orderBuyerDTO1 = OASOrderBuyerDTO.getExample();
        OASOrderBuyerDTO orderBuyerDTO2 = new OASOrderBuyerDTO();

        System.assertEquals(orderBuyerDTO1.hashCode(), orderBuyerDTO1.hashCode());
        System.assertEquals(orderBuyerDTO2.hashCode(), orderBuyerDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBuyerDTO orderBuyerDTO1 = OASOrderBuyerDTO.getExample();
        OASOrderBuyerDTO orderBuyerDTO2 = OASOrderBuyerDTO.getExample();
        OASOrderBuyerDTO orderBuyerDTO3 = new OASOrderBuyerDTO();
        OASOrderBuyerDTO orderBuyerDTO4 = new OASOrderBuyerDTO();

        System.assert(orderBuyerDTO1.equals(orderBuyerDTO2));
        System.assert(orderBuyerDTO3.equals(orderBuyerDTO4));
        System.assertEquals(orderBuyerDTO1.hashCode(), orderBuyerDTO2.hashCode());
        System.assertEquals(orderBuyerDTO3.hashCode(), orderBuyerDTO4.hashCode());
    }
}
