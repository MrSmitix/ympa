@isTest
private class OASOrderItemInstanceModificationDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO1 = OASOrderItemInstanceModificationDTO.getExample();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO2 = orderItemInstanceModificationDTO1;
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO3 = new OASOrderItemInstanceModificationDTO();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO4 = orderItemInstanceModificationDTO3;

        System.assert(orderItemInstanceModificationDTO1.equals(orderItemInstanceModificationDTO2));
        System.assert(orderItemInstanceModificationDTO2.equals(orderItemInstanceModificationDTO1));
        System.assert(orderItemInstanceModificationDTO1.equals(orderItemInstanceModificationDTO1));
        System.assert(orderItemInstanceModificationDTO3.equals(orderItemInstanceModificationDTO4));
        System.assert(orderItemInstanceModificationDTO4.equals(orderItemInstanceModificationDTO3));
        System.assert(orderItemInstanceModificationDTO3.equals(orderItemInstanceModificationDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO1 = OASOrderItemInstanceModificationDTO.getExample();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO2 = OASOrderItemInstanceModificationDTO.getExample();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO3 = new OASOrderItemInstanceModificationDTO();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO4 = new OASOrderItemInstanceModificationDTO();

        System.assert(orderItemInstanceModificationDTO1.equals(orderItemInstanceModificationDTO2));
        System.assert(orderItemInstanceModificationDTO2.equals(orderItemInstanceModificationDTO1));
        System.assert(orderItemInstanceModificationDTO3.equals(orderItemInstanceModificationDTO4));
        System.assert(orderItemInstanceModificationDTO4.equals(orderItemInstanceModificationDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO1 = OASOrderItemInstanceModificationDTO.getExample();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO2 = new OASOrderItemInstanceModificationDTO();

        System.assertEquals(false, orderItemInstanceModificationDTO1.equals('foo'));
        System.assertEquals(false, orderItemInstanceModificationDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO1 = OASOrderItemInstanceModificationDTO.getExample();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO2 = new OASOrderItemInstanceModificationDTO();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO3;

        System.assertEquals(false, orderItemInstanceModificationDTO1.equals(orderItemInstanceModificationDTO3));
        System.assertEquals(false, orderItemInstanceModificationDTO2.equals(orderItemInstanceModificationDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO1 = OASOrderItemInstanceModificationDTO.getExample();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO2 = new OASOrderItemInstanceModificationDTO();

        System.assertEquals(orderItemInstanceModificationDTO1.hashCode(), orderItemInstanceModificationDTO1.hashCode());
        System.assertEquals(orderItemInstanceModificationDTO2.hashCode(), orderItemInstanceModificationDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO1 = OASOrderItemInstanceModificationDTO.getExample();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO2 = OASOrderItemInstanceModificationDTO.getExample();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO3 = new OASOrderItemInstanceModificationDTO();
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO4 = new OASOrderItemInstanceModificationDTO();

        System.assert(orderItemInstanceModificationDTO1.equals(orderItemInstanceModificationDTO2));
        System.assert(orderItemInstanceModificationDTO3.equals(orderItemInstanceModificationDTO4));
        System.assertEquals(orderItemInstanceModificationDTO1.hashCode(), orderItemInstanceModificationDTO2.hashCode());
        System.assertEquals(orderItemInstanceModificationDTO3.hashCode(), orderItemInstanceModificationDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderItemInstanceModificationDTO orderItemInstanceModificationDTO = new OASOrderItemInstanceModificationDTO();
        System.assertEquals(new List<OASBriefOrderItemInstanceDTO>(), orderItemInstanceModificationDTO.instances);
        System.assertEquals(null, orderItemInstanceModificationDTO.id);
    }
}
