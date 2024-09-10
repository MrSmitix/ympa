@isTest
private class OASOrderItemsModificationResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO1 = OASOrderItemsModificationResultDTO.getExample();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO2 = orderItemsModificationResultDTO1;
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO3 = new OASOrderItemsModificationResultDTO();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO4 = orderItemsModificationResultDTO3;

        System.assert(orderItemsModificationResultDTO1.equals(orderItemsModificationResultDTO2));
        System.assert(orderItemsModificationResultDTO2.equals(orderItemsModificationResultDTO1));
        System.assert(orderItemsModificationResultDTO1.equals(orderItemsModificationResultDTO1));
        System.assert(orderItemsModificationResultDTO3.equals(orderItemsModificationResultDTO4));
        System.assert(orderItemsModificationResultDTO4.equals(orderItemsModificationResultDTO3));
        System.assert(orderItemsModificationResultDTO3.equals(orderItemsModificationResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO1 = OASOrderItemsModificationResultDTO.getExample();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO2 = OASOrderItemsModificationResultDTO.getExample();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO3 = new OASOrderItemsModificationResultDTO();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO4 = new OASOrderItemsModificationResultDTO();

        System.assert(orderItemsModificationResultDTO1.equals(orderItemsModificationResultDTO2));
        System.assert(orderItemsModificationResultDTO2.equals(orderItemsModificationResultDTO1));
        System.assert(orderItemsModificationResultDTO3.equals(orderItemsModificationResultDTO4));
        System.assert(orderItemsModificationResultDTO4.equals(orderItemsModificationResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO1 = OASOrderItemsModificationResultDTO.getExample();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO2 = new OASOrderItemsModificationResultDTO();

        System.assertEquals(false, orderItemsModificationResultDTO1.equals('foo'));
        System.assertEquals(false, orderItemsModificationResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO1 = OASOrderItemsModificationResultDTO.getExample();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO2 = new OASOrderItemsModificationResultDTO();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO3;

        System.assertEquals(false, orderItemsModificationResultDTO1.equals(orderItemsModificationResultDTO3));
        System.assertEquals(false, orderItemsModificationResultDTO2.equals(orderItemsModificationResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO1 = OASOrderItemsModificationResultDTO.getExample();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO2 = new OASOrderItemsModificationResultDTO();

        System.assertEquals(orderItemsModificationResultDTO1.hashCode(), orderItemsModificationResultDTO1.hashCode());
        System.assertEquals(orderItemsModificationResultDTO2.hashCode(), orderItemsModificationResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO1 = OASOrderItemsModificationResultDTO.getExample();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO2 = OASOrderItemsModificationResultDTO.getExample();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO3 = new OASOrderItemsModificationResultDTO();
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO4 = new OASOrderItemsModificationResultDTO();

        System.assert(orderItemsModificationResultDTO1.equals(orderItemsModificationResultDTO2));
        System.assert(orderItemsModificationResultDTO3.equals(orderItemsModificationResultDTO4));
        System.assertEquals(orderItemsModificationResultDTO1.hashCode(), orderItemsModificationResultDTO2.hashCode());
        System.assertEquals(orderItemsModificationResultDTO3.hashCode(), orderItemsModificationResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderItemsModificationResultDTO orderItemsModificationResultDTO = new OASOrderItemsModificationResultDTO();
        System.assertEquals(new List<OASBriefOrderItemDTO>(), orderItemsModificationResultDTO.items);
    }
}
