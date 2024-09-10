@isTest
private class OASOrderBusinessBuyerDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO1 = OASOrderBusinessBuyerDTO.getExample();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO2 = orderBusinessBuyerDTO1;
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO3 = new OASOrderBusinessBuyerDTO();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO4 = orderBusinessBuyerDTO3;

        System.assert(orderBusinessBuyerDTO1.equals(orderBusinessBuyerDTO2));
        System.assert(orderBusinessBuyerDTO2.equals(orderBusinessBuyerDTO1));
        System.assert(orderBusinessBuyerDTO1.equals(orderBusinessBuyerDTO1));
        System.assert(orderBusinessBuyerDTO3.equals(orderBusinessBuyerDTO4));
        System.assert(orderBusinessBuyerDTO4.equals(orderBusinessBuyerDTO3));
        System.assert(orderBusinessBuyerDTO3.equals(orderBusinessBuyerDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO1 = OASOrderBusinessBuyerDTO.getExample();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO2 = OASOrderBusinessBuyerDTO.getExample();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO3 = new OASOrderBusinessBuyerDTO();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO4 = new OASOrderBusinessBuyerDTO();

        System.assert(orderBusinessBuyerDTO1.equals(orderBusinessBuyerDTO2));
        System.assert(orderBusinessBuyerDTO2.equals(orderBusinessBuyerDTO1));
        System.assert(orderBusinessBuyerDTO3.equals(orderBusinessBuyerDTO4));
        System.assert(orderBusinessBuyerDTO4.equals(orderBusinessBuyerDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO1 = OASOrderBusinessBuyerDTO.getExample();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO2 = new OASOrderBusinessBuyerDTO();

        System.assertEquals(false, orderBusinessBuyerDTO1.equals('foo'));
        System.assertEquals(false, orderBusinessBuyerDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO1 = OASOrderBusinessBuyerDTO.getExample();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO2 = new OASOrderBusinessBuyerDTO();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO3;

        System.assertEquals(false, orderBusinessBuyerDTO1.equals(orderBusinessBuyerDTO3));
        System.assertEquals(false, orderBusinessBuyerDTO2.equals(orderBusinessBuyerDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO1 = OASOrderBusinessBuyerDTO.getExample();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO2 = new OASOrderBusinessBuyerDTO();

        System.assertEquals(orderBusinessBuyerDTO1.hashCode(), orderBusinessBuyerDTO1.hashCode());
        System.assertEquals(orderBusinessBuyerDTO2.hashCode(), orderBusinessBuyerDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO1 = OASOrderBusinessBuyerDTO.getExample();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO2 = OASOrderBusinessBuyerDTO.getExample();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO3 = new OASOrderBusinessBuyerDTO();
        OASOrderBusinessBuyerDTO orderBusinessBuyerDTO4 = new OASOrderBusinessBuyerDTO();

        System.assert(orderBusinessBuyerDTO1.equals(orderBusinessBuyerDTO2));
        System.assert(orderBusinessBuyerDTO3.equals(orderBusinessBuyerDTO4));
        System.assertEquals(orderBusinessBuyerDTO1.hashCode(), orderBusinessBuyerDTO2.hashCode());
        System.assertEquals(orderBusinessBuyerDTO3.hashCode(), orderBusinessBuyerDTO4.hashCode());
    }
}
