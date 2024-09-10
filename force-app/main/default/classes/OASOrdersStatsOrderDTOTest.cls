@isTest
private class OASOrdersStatsOrderDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersStatsOrderDTO ordersStatsOrderDTO1 = OASOrdersStatsOrderDTO.getExample();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO2 = ordersStatsOrderDTO1;
        OASOrdersStatsOrderDTO ordersStatsOrderDTO3 = new OASOrdersStatsOrderDTO();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO4 = ordersStatsOrderDTO3;

        System.assert(ordersStatsOrderDTO1.equals(ordersStatsOrderDTO2));
        System.assert(ordersStatsOrderDTO2.equals(ordersStatsOrderDTO1));
        System.assert(ordersStatsOrderDTO1.equals(ordersStatsOrderDTO1));
        System.assert(ordersStatsOrderDTO3.equals(ordersStatsOrderDTO4));
        System.assert(ordersStatsOrderDTO4.equals(ordersStatsOrderDTO3));
        System.assert(ordersStatsOrderDTO3.equals(ordersStatsOrderDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersStatsOrderDTO ordersStatsOrderDTO1 = OASOrdersStatsOrderDTO.getExample();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO2 = OASOrdersStatsOrderDTO.getExample();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO3 = new OASOrdersStatsOrderDTO();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO4 = new OASOrdersStatsOrderDTO();

        System.assert(ordersStatsOrderDTO1.equals(ordersStatsOrderDTO2));
        System.assert(ordersStatsOrderDTO2.equals(ordersStatsOrderDTO1));
        System.assert(ordersStatsOrderDTO3.equals(ordersStatsOrderDTO4));
        System.assert(ordersStatsOrderDTO4.equals(ordersStatsOrderDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersStatsOrderDTO ordersStatsOrderDTO1 = OASOrdersStatsOrderDTO.getExample();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO2 = new OASOrdersStatsOrderDTO();

        System.assertEquals(false, ordersStatsOrderDTO1.equals('foo'));
        System.assertEquals(false, ordersStatsOrderDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersStatsOrderDTO ordersStatsOrderDTO1 = OASOrdersStatsOrderDTO.getExample();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO2 = new OASOrdersStatsOrderDTO();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO3;

        System.assertEquals(false, ordersStatsOrderDTO1.equals(ordersStatsOrderDTO3));
        System.assertEquals(false, ordersStatsOrderDTO2.equals(ordersStatsOrderDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersStatsOrderDTO ordersStatsOrderDTO1 = OASOrdersStatsOrderDTO.getExample();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO2 = new OASOrdersStatsOrderDTO();

        System.assertEquals(ordersStatsOrderDTO1.hashCode(), ordersStatsOrderDTO1.hashCode());
        System.assertEquals(ordersStatsOrderDTO2.hashCode(), ordersStatsOrderDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersStatsOrderDTO ordersStatsOrderDTO1 = OASOrdersStatsOrderDTO.getExample();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO2 = OASOrdersStatsOrderDTO.getExample();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO3 = new OASOrdersStatsOrderDTO();
        OASOrdersStatsOrderDTO ordersStatsOrderDTO4 = new OASOrdersStatsOrderDTO();

        System.assert(ordersStatsOrderDTO1.equals(ordersStatsOrderDTO2));
        System.assert(ordersStatsOrderDTO3.equals(ordersStatsOrderDTO4));
        System.assertEquals(ordersStatsOrderDTO1.hashCode(), ordersStatsOrderDTO2.hashCode());
        System.assertEquals(ordersStatsOrderDTO3.hashCode(), ordersStatsOrderDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrdersStatsOrderDTO ordersStatsOrderDTO = new OASOrdersStatsOrderDTO();
        System.assertEquals(new List<OASOrdersStatsItemDTO>(), ordersStatsOrderDTO.items);
        System.assertEquals(new List<OASOrdersStatsItemDTO>(), ordersStatsOrderDTO.initialItems);
        System.assertEquals(new List<OASOrdersStatsPaymentDTO>(), ordersStatsOrderDTO.payments);
        System.assertEquals(new List<OASOrdersStatsCommissionDTO>(), ordersStatsOrderDTO.commissions);
        System.assertEquals(null, ordersStatsOrderDTO.id);
        System.assertEquals(null, ordersStatsOrderDTO.creationDate);
        System.assertEquals(null, ordersStatsOrderDTO.statusUpdateDate);
        System.assertEquals(null, ordersStatsOrderDTO.status);
        System.assertEquals(null, ordersStatsOrderDTO.partnerOrderId);
        System.assertEquals(null, ordersStatsOrderDTO.paymentType);
        System.assertEquals(null, ordersStatsOrderDTO.fake);
        System.assertEquals(null, ordersStatsOrderDTO.deliveryRegion);
    }
}
