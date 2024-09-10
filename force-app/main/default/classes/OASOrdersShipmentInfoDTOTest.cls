@isTest
private class OASOrdersShipmentInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO1 = OASOrdersShipmentInfoDTO.getExample();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO2 = ordersShipmentInfoDTO1;
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO3 = new OASOrdersShipmentInfoDTO();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO4 = ordersShipmentInfoDTO3;

        System.assert(ordersShipmentInfoDTO1.equals(ordersShipmentInfoDTO2));
        System.assert(ordersShipmentInfoDTO2.equals(ordersShipmentInfoDTO1));
        System.assert(ordersShipmentInfoDTO1.equals(ordersShipmentInfoDTO1));
        System.assert(ordersShipmentInfoDTO3.equals(ordersShipmentInfoDTO4));
        System.assert(ordersShipmentInfoDTO4.equals(ordersShipmentInfoDTO3));
        System.assert(ordersShipmentInfoDTO3.equals(ordersShipmentInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO1 = OASOrdersShipmentInfoDTO.getExample();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO2 = OASOrdersShipmentInfoDTO.getExample();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO3 = new OASOrdersShipmentInfoDTO();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO4 = new OASOrdersShipmentInfoDTO();

        System.assert(ordersShipmentInfoDTO1.equals(ordersShipmentInfoDTO2));
        System.assert(ordersShipmentInfoDTO2.equals(ordersShipmentInfoDTO1));
        System.assert(ordersShipmentInfoDTO3.equals(ordersShipmentInfoDTO4));
        System.assert(ordersShipmentInfoDTO4.equals(ordersShipmentInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO1 = OASOrdersShipmentInfoDTO.getExample();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO2 = new OASOrdersShipmentInfoDTO();

        System.assertEquals(false, ordersShipmentInfoDTO1.equals('foo'));
        System.assertEquals(false, ordersShipmentInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO1 = OASOrdersShipmentInfoDTO.getExample();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO2 = new OASOrdersShipmentInfoDTO();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO3;

        System.assertEquals(false, ordersShipmentInfoDTO1.equals(ordersShipmentInfoDTO3));
        System.assertEquals(false, ordersShipmentInfoDTO2.equals(ordersShipmentInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO1 = OASOrdersShipmentInfoDTO.getExample();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO2 = new OASOrdersShipmentInfoDTO();

        System.assertEquals(ordersShipmentInfoDTO1.hashCode(), ordersShipmentInfoDTO1.hashCode());
        System.assertEquals(ordersShipmentInfoDTO2.hashCode(), ordersShipmentInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO1 = OASOrdersShipmentInfoDTO.getExample();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO2 = OASOrdersShipmentInfoDTO.getExample();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO3 = new OASOrdersShipmentInfoDTO();
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO4 = new OASOrdersShipmentInfoDTO();

        System.assert(ordersShipmentInfoDTO1.equals(ordersShipmentInfoDTO2));
        System.assert(ordersShipmentInfoDTO3.equals(ordersShipmentInfoDTO4));
        System.assertEquals(ordersShipmentInfoDTO1.hashCode(), ordersShipmentInfoDTO2.hashCode());
        System.assertEquals(ordersShipmentInfoDTO3.hashCode(), ordersShipmentInfoDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrdersShipmentInfoDTO ordersShipmentInfoDTO = new OASOrdersShipmentInfoDTO();
        System.assertEquals(new List<Long>(), ordersShipmentInfoDTO.orderIdsWithLabels);
        System.assertEquals(new List<Long>(), ordersShipmentInfoDTO.orderIdsWithoutLabels);
    }
}
