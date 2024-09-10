@isTest
private class OASOrderItemModificationDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderItemModificationDTO orderItemModificationDTO1 = OASOrderItemModificationDTO.getExample();
        OASOrderItemModificationDTO orderItemModificationDTO2 = orderItemModificationDTO1;
        OASOrderItemModificationDTO orderItemModificationDTO3 = new OASOrderItemModificationDTO();
        OASOrderItemModificationDTO orderItemModificationDTO4 = orderItemModificationDTO3;

        System.assert(orderItemModificationDTO1.equals(orderItemModificationDTO2));
        System.assert(orderItemModificationDTO2.equals(orderItemModificationDTO1));
        System.assert(orderItemModificationDTO1.equals(orderItemModificationDTO1));
        System.assert(orderItemModificationDTO3.equals(orderItemModificationDTO4));
        System.assert(orderItemModificationDTO4.equals(orderItemModificationDTO3));
        System.assert(orderItemModificationDTO3.equals(orderItemModificationDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderItemModificationDTO orderItemModificationDTO1 = OASOrderItemModificationDTO.getExample();
        OASOrderItemModificationDTO orderItemModificationDTO2 = OASOrderItemModificationDTO.getExample();
        OASOrderItemModificationDTO orderItemModificationDTO3 = new OASOrderItemModificationDTO();
        OASOrderItemModificationDTO orderItemModificationDTO4 = new OASOrderItemModificationDTO();

        System.assert(orderItemModificationDTO1.equals(orderItemModificationDTO2));
        System.assert(orderItemModificationDTO2.equals(orderItemModificationDTO1));
        System.assert(orderItemModificationDTO3.equals(orderItemModificationDTO4));
        System.assert(orderItemModificationDTO4.equals(orderItemModificationDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderItemModificationDTO orderItemModificationDTO1 = OASOrderItemModificationDTO.getExample();
        OASOrderItemModificationDTO orderItemModificationDTO2 = new OASOrderItemModificationDTO();

        System.assertEquals(false, orderItemModificationDTO1.equals('foo'));
        System.assertEquals(false, orderItemModificationDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderItemModificationDTO orderItemModificationDTO1 = OASOrderItemModificationDTO.getExample();
        OASOrderItemModificationDTO orderItemModificationDTO2 = new OASOrderItemModificationDTO();
        OASOrderItemModificationDTO orderItemModificationDTO3;

        System.assertEquals(false, orderItemModificationDTO1.equals(orderItemModificationDTO3));
        System.assertEquals(false, orderItemModificationDTO2.equals(orderItemModificationDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderItemModificationDTO orderItemModificationDTO1 = OASOrderItemModificationDTO.getExample();
        OASOrderItemModificationDTO orderItemModificationDTO2 = new OASOrderItemModificationDTO();

        System.assertEquals(orderItemModificationDTO1.hashCode(), orderItemModificationDTO1.hashCode());
        System.assertEquals(orderItemModificationDTO2.hashCode(), orderItemModificationDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderItemModificationDTO orderItemModificationDTO1 = OASOrderItemModificationDTO.getExample();
        OASOrderItemModificationDTO orderItemModificationDTO2 = OASOrderItemModificationDTO.getExample();
        OASOrderItemModificationDTO orderItemModificationDTO3 = new OASOrderItemModificationDTO();
        OASOrderItemModificationDTO orderItemModificationDTO4 = new OASOrderItemModificationDTO();

        System.assert(orderItemModificationDTO1.equals(orderItemModificationDTO2));
        System.assert(orderItemModificationDTO3.equals(orderItemModificationDTO4));
        System.assertEquals(orderItemModificationDTO1.hashCode(), orderItemModificationDTO2.hashCode());
        System.assertEquals(orderItemModificationDTO3.hashCode(), orderItemModificationDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderItemModificationDTO orderItemModificationDTO = new OASOrderItemModificationDTO();
        System.assertEquals(new List<OASBriefOrderItemInstanceDTO>(), orderItemModificationDTO.instances);
        System.assertEquals(null, orderItemModificationDTO.id);
        System.assertEquals(null, orderItemModificationDTO.count);
    }
}
