@isTest
private class OASOrdersStatsDeliveryRegionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO1 = OASOrdersStatsDeliveryRegionDTO.getExample();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO2 = ordersStatsDeliveryRegionDTO1;
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO3 = new OASOrdersStatsDeliveryRegionDTO();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO4 = ordersStatsDeliveryRegionDTO3;

        System.assert(ordersStatsDeliveryRegionDTO1.equals(ordersStatsDeliveryRegionDTO2));
        System.assert(ordersStatsDeliveryRegionDTO2.equals(ordersStatsDeliveryRegionDTO1));
        System.assert(ordersStatsDeliveryRegionDTO1.equals(ordersStatsDeliveryRegionDTO1));
        System.assert(ordersStatsDeliveryRegionDTO3.equals(ordersStatsDeliveryRegionDTO4));
        System.assert(ordersStatsDeliveryRegionDTO4.equals(ordersStatsDeliveryRegionDTO3));
        System.assert(ordersStatsDeliveryRegionDTO3.equals(ordersStatsDeliveryRegionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO1 = OASOrdersStatsDeliveryRegionDTO.getExample();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO2 = OASOrdersStatsDeliveryRegionDTO.getExample();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO3 = new OASOrdersStatsDeliveryRegionDTO();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO4 = new OASOrdersStatsDeliveryRegionDTO();

        System.assert(ordersStatsDeliveryRegionDTO1.equals(ordersStatsDeliveryRegionDTO2));
        System.assert(ordersStatsDeliveryRegionDTO2.equals(ordersStatsDeliveryRegionDTO1));
        System.assert(ordersStatsDeliveryRegionDTO3.equals(ordersStatsDeliveryRegionDTO4));
        System.assert(ordersStatsDeliveryRegionDTO4.equals(ordersStatsDeliveryRegionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO1 = OASOrdersStatsDeliveryRegionDTO.getExample();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO2 = new OASOrdersStatsDeliveryRegionDTO();

        System.assertEquals(false, ordersStatsDeliveryRegionDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsDeliveryRegionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO1 = OASOrdersStatsDeliveryRegionDTO.getExample();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO2 = new OASOrdersStatsDeliveryRegionDTO();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO3;

        System.assertEquals(false, ordersStatsDeliveryRegionDTO1.equals(ordersStatsDeliveryRegionDTO3));
        System.assertEquals(false, ordersStatsDeliveryRegionDTO2.equals(ordersStatsDeliveryRegionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO1 = OASOrdersStatsDeliveryRegionDTO.getExample();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO2 = new OASOrdersStatsDeliveryRegionDTO();

        System.assertEquals(ordersStatsDeliveryRegionDTO1.hashCode(), ordersStatsDeliveryRegionDTO1.hashCode());
        System.assertEquals(ordersStatsDeliveryRegionDTO2.hashCode(), ordersStatsDeliveryRegionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO1 = OASOrdersStatsDeliveryRegionDTO.getExample();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO2 = OASOrdersStatsDeliveryRegionDTO.getExample();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO3 = new OASOrdersStatsDeliveryRegionDTO();
        OASOrdersStatsDeliveryRegionDTO ordersStatsDeliveryRegionDTO4 = new OASOrdersStatsDeliveryRegionDTO();

        System.assert(ordersStatsDeliveryRegionDTO1.equals(ordersStatsDeliveryRegionDTO2));
        System.assert(ordersStatsDeliveryRegionDTO3.equals(ordersStatsDeliveryRegionDTO4));
        System.assertEquals(ordersStatsDeliveryRegionDTO1.hashCode(), ordersStatsDeliveryRegionDTO2.hashCode());
        System.assertEquals(ordersStatsDeliveryRegionDTO3.hashCode(), ordersStatsDeliveryRegionDTO4.hashCode());
    }
}
