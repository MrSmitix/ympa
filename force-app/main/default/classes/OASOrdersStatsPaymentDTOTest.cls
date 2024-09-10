@isTest
private class OASOrdersStatsPaymentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO1 = OASOrdersStatsPaymentDTO.getExample();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO2 = ordersStatsPaymentDTO1;
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO3 = new OASOrdersStatsPaymentDTO();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO4 = ordersStatsPaymentDTO3;

        System.assert(ordersStatsPaymentDTO1.equals(ordersStatsPaymentDTO2));
        System.assert(ordersStatsPaymentDTO2.equals(ordersStatsPaymentDTO1));
        System.assert(ordersStatsPaymentDTO1.equals(ordersStatsPaymentDTO1));
        System.assert(ordersStatsPaymentDTO3.equals(ordersStatsPaymentDTO4));
        System.assert(ordersStatsPaymentDTO4.equals(ordersStatsPaymentDTO3));
        System.assert(ordersStatsPaymentDTO3.equals(ordersStatsPaymentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO1 = OASOrdersStatsPaymentDTO.getExample();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO2 = OASOrdersStatsPaymentDTO.getExample();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO3 = new OASOrdersStatsPaymentDTO();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO4 = new OASOrdersStatsPaymentDTO();

        System.assert(ordersStatsPaymentDTO1.equals(ordersStatsPaymentDTO2));
        System.assert(ordersStatsPaymentDTO2.equals(ordersStatsPaymentDTO1));
        System.assert(ordersStatsPaymentDTO3.equals(ordersStatsPaymentDTO4));
        System.assert(ordersStatsPaymentDTO4.equals(ordersStatsPaymentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO1 = OASOrdersStatsPaymentDTO.getExample();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO2 = new OASOrdersStatsPaymentDTO();

        System.assertEquals(false, ordersStatsPaymentDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsPaymentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO1 = OASOrdersStatsPaymentDTO.getExample();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO2 = new OASOrdersStatsPaymentDTO();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO3;

        System.assertEquals(false, ordersStatsPaymentDTO1.equals(ordersStatsPaymentDTO3));
        System.assertEquals(false, ordersStatsPaymentDTO2.equals(ordersStatsPaymentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO1 = OASOrdersStatsPaymentDTO.getExample();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO2 = new OASOrdersStatsPaymentDTO();

        System.assertEquals(ordersStatsPaymentDTO1.hashCode(), ordersStatsPaymentDTO1.hashCode());
        System.assertEquals(ordersStatsPaymentDTO2.hashCode(), ordersStatsPaymentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO1 = OASOrdersStatsPaymentDTO.getExample();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO2 = OASOrdersStatsPaymentDTO.getExample();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO3 = new OASOrdersStatsPaymentDTO();
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO4 = new OASOrdersStatsPaymentDTO();

        System.assert(ordersStatsPaymentDTO1.equals(ordersStatsPaymentDTO2));
        System.assert(ordersStatsPaymentDTO3.equals(ordersStatsPaymentDTO4));
        System.assertEquals(ordersStatsPaymentDTO1.hashCode(), ordersStatsPaymentDTO2.hashCode());
        System.assertEquals(ordersStatsPaymentDTO3.hashCode(), ordersStatsPaymentDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrdersStatsPaymentDTO ordersStatsPaymentDTO = new OASOrdersStatsPaymentDTO();
        Map<String, String> x-property-mappings = ordersStatsPaymentDTO.getx-property-mappings();
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }
}
