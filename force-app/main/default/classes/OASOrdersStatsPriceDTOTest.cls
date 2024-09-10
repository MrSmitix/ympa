@isTest
private class OASOrdersStatsPriceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsPriceDTO ordersStatsPriceDTO1 = OASOrdersStatsPriceDTO.getExample();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO2 = ordersStatsPriceDTO1;
        OASOrdersStatsPriceDTO ordersStatsPriceDTO3 = new OASOrdersStatsPriceDTO();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO4 = ordersStatsPriceDTO3;

        System.assert(ordersStatsPriceDTO1.equals(ordersStatsPriceDTO2));
        System.assert(ordersStatsPriceDTO2.equals(ordersStatsPriceDTO1));
        System.assert(ordersStatsPriceDTO1.equals(ordersStatsPriceDTO1));
        System.assert(ordersStatsPriceDTO3.equals(ordersStatsPriceDTO4));
        System.assert(ordersStatsPriceDTO4.equals(ordersStatsPriceDTO3));
        System.assert(ordersStatsPriceDTO3.equals(ordersStatsPriceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsPriceDTO ordersStatsPriceDTO1 = OASOrdersStatsPriceDTO.getExample();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO2 = OASOrdersStatsPriceDTO.getExample();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO3 = new OASOrdersStatsPriceDTO();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO4 = new OASOrdersStatsPriceDTO();

        System.assert(ordersStatsPriceDTO1.equals(ordersStatsPriceDTO2));
        System.assert(ordersStatsPriceDTO2.equals(ordersStatsPriceDTO1));
        System.assert(ordersStatsPriceDTO3.equals(ordersStatsPriceDTO4));
        System.assert(ordersStatsPriceDTO4.equals(ordersStatsPriceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsPriceDTO ordersStatsPriceDTO1 = OASOrdersStatsPriceDTO.getExample();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO2 = new OASOrdersStatsPriceDTO();

        System.assertEquals(false, ordersStatsPriceDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsPriceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsPriceDTO ordersStatsPriceDTO1 = OASOrdersStatsPriceDTO.getExample();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO2 = new OASOrdersStatsPriceDTO();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO3;

        System.assertEquals(false, ordersStatsPriceDTO1.equals(ordersStatsPriceDTO3));
        System.assertEquals(false, ordersStatsPriceDTO2.equals(ordersStatsPriceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsPriceDTO ordersStatsPriceDTO1 = OASOrdersStatsPriceDTO.getExample();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO2 = new OASOrdersStatsPriceDTO();

        System.assertEquals(ordersStatsPriceDTO1.hashCode(), ordersStatsPriceDTO1.hashCode());
        System.assertEquals(ordersStatsPriceDTO2.hashCode(), ordersStatsPriceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsPriceDTO ordersStatsPriceDTO1 = OASOrdersStatsPriceDTO.getExample();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO2 = OASOrdersStatsPriceDTO.getExample();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO3 = new OASOrdersStatsPriceDTO();
        OASOrdersStatsPriceDTO ordersStatsPriceDTO4 = new OASOrdersStatsPriceDTO();

        System.assert(ordersStatsPriceDTO1.equals(ordersStatsPriceDTO2));
        System.assert(ordersStatsPriceDTO3.equals(ordersStatsPriceDTO4));
        System.assertEquals(ordersStatsPriceDTO1.hashCode(), ordersStatsPriceDTO2.hashCode());
        System.assertEquals(ordersStatsPriceDTO3.hashCode(), ordersStatsPriceDTO4.hashCode());
    }
}
