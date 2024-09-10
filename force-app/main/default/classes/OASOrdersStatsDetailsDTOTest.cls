@isTest
private class OASOrdersStatsDetailsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO1 = OASOrdersStatsDetailsDTO.getExample();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO2 = ordersStatsDetailsDTO1;
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO3 = new OASOrdersStatsDetailsDTO();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO4 = ordersStatsDetailsDTO3;

        System.assert(ordersStatsDetailsDTO1.equals(ordersStatsDetailsDTO2));
        System.assert(ordersStatsDetailsDTO2.equals(ordersStatsDetailsDTO1));
        System.assert(ordersStatsDetailsDTO1.equals(ordersStatsDetailsDTO1));
        System.assert(ordersStatsDetailsDTO3.equals(ordersStatsDetailsDTO4));
        System.assert(ordersStatsDetailsDTO4.equals(ordersStatsDetailsDTO3));
        System.assert(ordersStatsDetailsDTO3.equals(ordersStatsDetailsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO1 = OASOrdersStatsDetailsDTO.getExample();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO2 = OASOrdersStatsDetailsDTO.getExample();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO3 = new OASOrdersStatsDetailsDTO();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO4 = new OASOrdersStatsDetailsDTO();

        System.assert(ordersStatsDetailsDTO1.equals(ordersStatsDetailsDTO2));
        System.assert(ordersStatsDetailsDTO2.equals(ordersStatsDetailsDTO1));
        System.assert(ordersStatsDetailsDTO3.equals(ordersStatsDetailsDTO4));
        System.assert(ordersStatsDetailsDTO4.equals(ordersStatsDetailsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO1 = OASOrdersStatsDetailsDTO.getExample();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO2 = new OASOrdersStatsDetailsDTO();

        System.assertEquals(false, ordersStatsDetailsDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsDetailsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO1 = OASOrdersStatsDetailsDTO.getExample();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO2 = new OASOrdersStatsDetailsDTO();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO3;

        System.assertEquals(false, ordersStatsDetailsDTO1.equals(ordersStatsDetailsDTO3));
        System.assertEquals(false, ordersStatsDetailsDTO2.equals(ordersStatsDetailsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO1 = OASOrdersStatsDetailsDTO.getExample();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO2 = new OASOrdersStatsDetailsDTO();

        System.assertEquals(ordersStatsDetailsDTO1.hashCode(), ordersStatsDetailsDTO1.hashCode());
        System.assertEquals(ordersStatsDetailsDTO2.hashCode(), ordersStatsDetailsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO1 = OASOrdersStatsDetailsDTO.getExample();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO2 = OASOrdersStatsDetailsDTO.getExample();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO3 = new OASOrdersStatsDetailsDTO();
        OASOrdersStatsDetailsDTO ordersStatsDetailsDTO4 = new OASOrdersStatsDetailsDTO();

        System.assert(ordersStatsDetailsDTO1.equals(ordersStatsDetailsDTO2));
        System.assert(ordersStatsDetailsDTO3.equals(ordersStatsDetailsDTO4));
        System.assertEquals(ordersStatsDetailsDTO1.hashCode(), ordersStatsDetailsDTO2.hashCode());
        System.assertEquals(ordersStatsDetailsDTO3.hashCode(), ordersStatsDetailsDTO4.hashCode());
    }
}
