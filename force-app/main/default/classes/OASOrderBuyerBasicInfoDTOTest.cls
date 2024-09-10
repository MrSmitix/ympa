@isTest
private class OASOrderBuyerBasicInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO1 = OASOrderBuyerBasicInfoDTO.getExample();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO2 = orderBuyerBasicInfoDTO1;
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO3 = new OASOrderBuyerBasicInfoDTO();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO4 = orderBuyerBasicInfoDTO3;

        System.assert(orderBuyerBasicInfoDTO1.equals(orderBuyerBasicInfoDTO2));
        System.assert(orderBuyerBasicInfoDTO2.equals(orderBuyerBasicInfoDTO1));
        System.assert(orderBuyerBasicInfoDTO1.equals(orderBuyerBasicInfoDTO1));
        System.assert(orderBuyerBasicInfoDTO3.equals(orderBuyerBasicInfoDTO4));
        System.assert(orderBuyerBasicInfoDTO4.equals(orderBuyerBasicInfoDTO3));
        System.assert(orderBuyerBasicInfoDTO3.equals(orderBuyerBasicInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO1 = OASOrderBuyerBasicInfoDTO.getExample();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO2 = OASOrderBuyerBasicInfoDTO.getExample();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO3 = new OASOrderBuyerBasicInfoDTO();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO4 = new OASOrderBuyerBasicInfoDTO();

        System.assert(orderBuyerBasicInfoDTO1.equals(orderBuyerBasicInfoDTO2));
        System.assert(orderBuyerBasicInfoDTO2.equals(orderBuyerBasicInfoDTO1));
        System.assert(orderBuyerBasicInfoDTO3.equals(orderBuyerBasicInfoDTO4));
        System.assert(orderBuyerBasicInfoDTO4.equals(orderBuyerBasicInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO1 = OASOrderBuyerBasicInfoDTO.getExample();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO2 = new OASOrderBuyerBasicInfoDTO();

        System.assertEquals(false, orderBuyerBasicInfoDTO1.equals('foo'));
        System.assertEquals(false, orderBuyerBasicInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO1 = OASOrderBuyerBasicInfoDTO.getExample();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO2 = new OASOrderBuyerBasicInfoDTO();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO3;

        System.assertEquals(false, orderBuyerBasicInfoDTO1.equals(orderBuyerBasicInfoDTO3));
        System.assertEquals(false, orderBuyerBasicInfoDTO2.equals(orderBuyerBasicInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO1 = OASOrderBuyerBasicInfoDTO.getExample();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO2 = new OASOrderBuyerBasicInfoDTO();

        System.assertEquals(orderBuyerBasicInfoDTO1.hashCode(), orderBuyerBasicInfoDTO1.hashCode());
        System.assertEquals(orderBuyerBasicInfoDTO2.hashCode(), orderBuyerBasicInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO1 = OASOrderBuyerBasicInfoDTO.getExample();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO2 = OASOrderBuyerBasicInfoDTO.getExample();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO3 = new OASOrderBuyerBasicInfoDTO();
        OASOrderBuyerBasicInfoDTO orderBuyerBasicInfoDTO4 = new OASOrderBuyerBasicInfoDTO();

        System.assert(orderBuyerBasicInfoDTO1.equals(orderBuyerBasicInfoDTO2));
        System.assert(orderBuyerBasicInfoDTO3.equals(orderBuyerBasicInfoDTO4));
        System.assertEquals(orderBuyerBasicInfoDTO1.hashCode(), orderBuyerBasicInfoDTO2.hashCode());
        System.assertEquals(orderBuyerBasicInfoDTO3.hashCode(), orderBuyerBasicInfoDTO4.hashCode());
    }
}
