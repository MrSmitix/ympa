@isTest
private class OASOrdersStatsCommissionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO1 = OASOrdersStatsCommissionDTO.getExample();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO2 = ordersStatsCommissionDTO1;
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO3 = new OASOrdersStatsCommissionDTO();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO4 = ordersStatsCommissionDTO3;

        System.assert(ordersStatsCommissionDTO1.equals(ordersStatsCommissionDTO2));
        System.assert(ordersStatsCommissionDTO2.equals(ordersStatsCommissionDTO1));
        System.assert(ordersStatsCommissionDTO1.equals(ordersStatsCommissionDTO1));
        System.assert(ordersStatsCommissionDTO3.equals(ordersStatsCommissionDTO4));
        System.assert(ordersStatsCommissionDTO4.equals(ordersStatsCommissionDTO3));
        System.assert(ordersStatsCommissionDTO3.equals(ordersStatsCommissionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO1 = OASOrdersStatsCommissionDTO.getExample();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO2 = OASOrdersStatsCommissionDTO.getExample();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO3 = new OASOrdersStatsCommissionDTO();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO4 = new OASOrdersStatsCommissionDTO();

        System.assert(ordersStatsCommissionDTO1.equals(ordersStatsCommissionDTO2));
        System.assert(ordersStatsCommissionDTO2.equals(ordersStatsCommissionDTO1));
        System.assert(ordersStatsCommissionDTO3.equals(ordersStatsCommissionDTO4));
        System.assert(ordersStatsCommissionDTO4.equals(ordersStatsCommissionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO1 = OASOrdersStatsCommissionDTO.getExample();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO2 = new OASOrdersStatsCommissionDTO();

        System.assertEquals(false, ordersStatsCommissionDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsCommissionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO1 = OASOrdersStatsCommissionDTO.getExample();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO2 = new OASOrdersStatsCommissionDTO();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO3;

        System.assertEquals(false, ordersStatsCommissionDTO1.equals(ordersStatsCommissionDTO3));
        System.assertEquals(false, ordersStatsCommissionDTO2.equals(ordersStatsCommissionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO1 = OASOrdersStatsCommissionDTO.getExample();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO2 = new OASOrdersStatsCommissionDTO();

        System.assertEquals(ordersStatsCommissionDTO1.hashCode(), ordersStatsCommissionDTO1.hashCode());
        System.assertEquals(ordersStatsCommissionDTO2.hashCode(), ordersStatsCommissionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO1 = OASOrdersStatsCommissionDTO.getExample();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO2 = OASOrdersStatsCommissionDTO.getExample();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO3 = new OASOrdersStatsCommissionDTO();
        OASOrdersStatsCommissionDTO ordersStatsCommissionDTO4 = new OASOrdersStatsCommissionDTO();

        System.assert(ordersStatsCommissionDTO1.equals(ordersStatsCommissionDTO2));
        System.assert(ordersStatsCommissionDTO3.equals(ordersStatsCommissionDTO4));
        System.assertEquals(ordersStatsCommissionDTO1.hashCode(), ordersStatsCommissionDTO2.hashCode());
        System.assertEquals(ordersStatsCommissionDTO3.hashCode(), ordersStatsCommissionDTO4.hashCode());
    }
}
