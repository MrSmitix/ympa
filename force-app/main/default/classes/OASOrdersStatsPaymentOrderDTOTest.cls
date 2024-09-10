@isTest
private class OASOrdersStatsPaymentOrderDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO1 = OASOrdersStatsPaymentOrderDTO.getExample();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO2 = ordersStatsPaymentOrderDTO1;
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO3 = new OASOrdersStatsPaymentOrderDTO();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO4 = ordersStatsPaymentOrderDTO3;

        System.assert(ordersStatsPaymentOrderDTO1.equals(ordersStatsPaymentOrderDTO2));
        System.assert(ordersStatsPaymentOrderDTO2.equals(ordersStatsPaymentOrderDTO1));
        System.assert(ordersStatsPaymentOrderDTO1.equals(ordersStatsPaymentOrderDTO1));
        System.assert(ordersStatsPaymentOrderDTO3.equals(ordersStatsPaymentOrderDTO4));
        System.assert(ordersStatsPaymentOrderDTO4.equals(ordersStatsPaymentOrderDTO3));
        System.assert(ordersStatsPaymentOrderDTO3.equals(ordersStatsPaymentOrderDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO1 = OASOrdersStatsPaymentOrderDTO.getExample();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO2 = OASOrdersStatsPaymentOrderDTO.getExample();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO3 = new OASOrdersStatsPaymentOrderDTO();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO4 = new OASOrdersStatsPaymentOrderDTO();

        System.assert(ordersStatsPaymentOrderDTO1.equals(ordersStatsPaymentOrderDTO2));
        System.assert(ordersStatsPaymentOrderDTO2.equals(ordersStatsPaymentOrderDTO1));
        System.assert(ordersStatsPaymentOrderDTO3.equals(ordersStatsPaymentOrderDTO4));
        System.assert(ordersStatsPaymentOrderDTO4.equals(ordersStatsPaymentOrderDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO1 = OASOrdersStatsPaymentOrderDTO.getExample();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO2 = new OASOrdersStatsPaymentOrderDTO();

        System.assertEquals(false, ordersStatsPaymentOrderDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsPaymentOrderDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO1 = OASOrdersStatsPaymentOrderDTO.getExample();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO2 = new OASOrdersStatsPaymentOrderDTO();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO3;

        System.assertEquals(false, ordersStatsPaymentOrderDTO1.equals(ordersStatsPaymentOrderDTO3));
        System.assertEquals(false, ordersStatsPaymentOrderDTO2.equals(ordersStatsPaymentOrderDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO1 = OASOrdersStatsPaymentOrderDTO.getExample();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO2 = new OASOrdersStatsPaymentOrderDTO();

        System.assertEquals(ordersStatsPaymentOrderDTO1.hashCode(), ordersStatsPaymentOrderDTO1.hashCode());
        System.assertEquals(ordersStatsPaymentOrderDTO2.hashCode(), ordersStatsPaymentOrderDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO1 = OASOrdersStatsPaymentOrderDTO.getExample();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO2 = OASOrdersStatsPaymentOrderDTO.getExample();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO3 = new OASOrdersStatsPaymentOrderDTO();
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO4 = new OASOrdersStatsPaymentOrderDTO();

        System.assert(ordersStatsPaymentOrderDTO1.equals(ordersStatsPaymentOrderDTO2));
        System.assert(ordersStatsPaymentOrderDTO3.equals(ordersStatsPaymentOrderDTO4));
        System.assertEquals(ordersStatsPaymentOrderDTO1.hashCode(), ordersStatsPaymentOrderDTO2.hashCode());
        System.assertEquals(ordersStatsPaymentOrderDTO3.hashCode(), ordersStatsPaymentOrderDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrdersStatsPaymentOrderDTO ordersStatsPaymentOrderDTO = new OASOrdersStatsPaymentOrderDTO();
        Map<String, String> x-property-mappings = ordersStatsPaymentOrderDTO.getx-property-mappings();
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }
}
