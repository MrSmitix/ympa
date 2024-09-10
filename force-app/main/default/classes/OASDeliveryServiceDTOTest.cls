@isTest
private class OASDeliveryServiceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeliveryServiceDTO deliveryServiceDTO1 = OASDeliveryServiceDTO.getExample();
        OASDeliveryServiceDTO deliveryServiceDTO2 = deliveryServiceDTO1;
        OASDeliveryServiceDTO deliveryServiceDTO3 = new OASDeliveryServiceDTO();
        OASDeliveryServiceDTO deliveryServiceDTO4 = deliveryServiceDTO3;

        System.assert(deliveryServiceDTO1.equals(deliveryServiceDTO2));
        System.assert(deliveryServiceDTO2.equals(deliveryServiceDTO1));
        System.assert(deliveryServiceDTO1.equals(deliveryServiceDTO1));
        System.assert(deliveryServiceDTO3.equals(deliveryServiceDTO4));
        System.assert(deliveryServiceDTO4.equals(deliveryServiceDTO3));
        System.assert(deliveryServiceDTO3.equals(deliveryServiceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeliveryServiceDTO deliveryServiceDTO1 = OASDeliveryServiceDTO.getExample();
        OASDeliveryServiceDTO deliveryServiceDTO2 = OASDeliveryServiceDTO.getExample();
        OASDeliveryServiceDTO deliveryServiceDTO3 = new OASDeliveryServiceDTO();
        OASDeliveryServiceDTO deliveryServiceDTO4 = new OASDeliveryServiceDTO();

        System.assert(deliveryServiceDTO1.equals(deliveryServiceDTO2));
        System.assert(deliveryServiceDTO2.equals(deliveryServiceDTO1));
        System.assert(deliveryServiceDTO3.equals(deliveryServiceDTO4));
        System.assert(deliveryServiceDTO4.equals(deliveryServiceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeliveryServiceDTO deliveryServiceDTO1 = OASDeliveryServiceDTO.getExample();
        OASDeliveryServiceDTO deliveryServiceDTO2 = new OASDeliveryServiceDTO();

        System.assertEquals(false, deliveryServiceDTO1.equals('foo'));
        System.assertEquals(false, deliveryServiceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeliveryServiceDTO deliveryServiceDTO1 = OASDeliveryServiceDTO.getExample();
        OASDeliveryServiceDTO deliveryServiceDTO2 = new OASDeliveryServiceDTO();
        OASDeliveryServiceDTO deliveryServiceDTO3;

        System.assertEquals(false, deliveryServiceDTO1.equals(deliveryServiceDTO3));
        System.assertEquals(false, deliveryServiceDTO2.equals(deliveryServiceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeliveryServiceDTO deliveryServiceDTO1 = OASDeliveryServiceDTO.getExample();
        OASDeliveryServiceDTO deliveryServiceDTO2 = new OASDeliveryServiceDTO();

        System.assertEquals(deliveryServiceDTO1.hashCode(), deliveryServiceDTO1.hashCode());
        System.assertEquals(deliveryServiceDTO2.hashCode(), deliveryServiceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeliveryServiceDTO deliveryServiceDTO1 = OASDeliveryServiceDTO.getExample();
        OASDeliveryServiceDTO deliveryServiceDTO2 = OASDeliveryServiceDTO.getExample();
        OASDeliveryServiceDTO deliveryServiceDTO3 = new OASDeliveryServiceDTO();
        OASDeliveryServiceDTO deliveryServiceDTO4 = new OASDeliveryServiceDTO();

        System.assert(deliveryServiceDTO1.equals(deliveryServiceDTO2));
        System.assert(deliveryServiceDTO3.equals(deliveryServiceDTO4));
        System.assertEquals(deliveryServiceDTO1.hashCode(), deliveryServiceDTO2.hashCode());
        System.assertEquals(deliveryServiceDTO3.hashCode(), deliveryServiceDTO4.hashCode());
    }
}
