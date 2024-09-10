@isTest
private class OASOrderBuyerInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBuyerInfoDTO orderBuyerInfoDTO1 = OASOrderBuyerInfoDTO.getExample();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO2 = orderBuyerInfoDTO1;
        OASOrderBuyerInfoDTO orderBuyerInfoDTO3 = new OASOrderBuyerInfoDTO();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO4 = orderBuyerInfoDTO3;

        System.assert(orderBuyerInfoDTO1.equals(orderBuyerInfoDTO2));
        System.assert(orderBuyerInfoDTO2.equals(orderBuyerInfoDTO1));
        System.assert(orderBuyerInfoDTO1.equals(orderBuyerInfoDTO1));
        System.assert(orderBuyerInfoDTO3.equals(orderBuyerInfoDTO4));
        System.assert(orderBuyerInfoDTO4.equals(orderBuyerInfoDTO3));
        System.assert(orderBuyerInfoDTO3.equals(orderBuyerInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBuyerInfoDTO orderBuyerInfoDTO1 = OASOrderBuyerInfoDTO.getExample();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO2 = OASOrderBuyerInfoDTO.getExample();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO3 = new OASOrderBuyerInfoDTO();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO4 = new OASOrderBuyerInfoDTO();

        System.assert(orderBuyerInfoDTO1.equals(orderBuyerInfoDTO2));
        System.assert(orderBuyerInfoDTO2.equals(orderBuyerInfoDTO1));
        System.assert(orderBuyerInfoDTO3.equals(orderBuyerInfoDTO4));
        System.assert(orderBuyerInfoDTO4.equals(orderBuyerInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBuyerInfoDTO orderBuyerInfoDTO1 = OASOrderBuyerInfoDTO.getExample();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO2 = new OASOrderBuyerInfoDTO();

        System.assertEquals(false, orderBuyerInfoDTO1.equals('foo'));
        System.assertEquals(false, orderBuyerInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBuyerInfoDTO orderBuyerInfoDTO1 = OASOrderBuyerInfoDTO.getExample();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO2 = new OASOrderBuyerInfoDTO();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO3;

        System.assertEquals(false, orderBuyerInfoDTO1.equals(orderBuyerInfoDTO3));
        System.assertEquals(false, orderBuyerInfoDTO2.equals(orderBuyerInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBuyerInfoDTO orderBuyerInfoDTO1 = OASOrderBuyerInfoDTO.getExample();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO2 = new OASOrderBuyerInfoDTO();

        System.assertEquals(orderBuyerInfoDTO1.hashCode(), orderBuyerInfoDTO1.hashCode());
        System.assertEquals(orderBuyerInfoDTO2.hashCode(), orderBuyerInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBuyerInfoDTO orderBuyerInfoDTO1 = OASOrderBuyerInfoDTO.getExample();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO2 = OASOrderBuyerInfoDTO.getExample();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO3 = new OASOrderBuyerInfoDTO();
        OASOrderBuyerInfoDTO orderBuyerInfoDTO4 = new OASOrderBuyerInfoDTO();

        System.assert(orderBuyerInfoDTO1.equals(orderBuyerInfoDTO2));
        System.assert(orderBuyerInfoDTO3.equals(orderBuyerInfoDTO4));
        System.assertEquals(orderBuyerInfoDTO1.hashCode(), orderBuyerInfoDTO2.hashCode());
        System.assertEquals(orderBuyerInfoDTO3.hashCode(), orderBuyerInfoDTO4.hashCode());
    }
}
