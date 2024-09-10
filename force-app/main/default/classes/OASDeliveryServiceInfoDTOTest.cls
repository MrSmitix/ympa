@isTest
private class OASDeliveryServiceInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO1 = OASDeliveryServiceInfoDTO.getExample();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO2 = deliveryServiceInfoDTO1;
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO3 = new OASDeliveryServiceInfoDTO();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO4 = deliveryServiceInfoDTO3;

        System.assert(deliveryServiceInfoDTO1.equals(deliveryServiceInfoDTO2));
        System.assert(deliveryServiceInfoDTO2.equals(deliveryServiceInfoDTO1));
        System.assert(deliveryServiceInfoDTO1.equals(deliveryServiceInfoDTO1));
        System.assert(deliveryServiceInfoDTO3.equals(deliveryServiceInfoDTO4));
        System.assert(deliveryServiceInfoDTO4.equals(deliveryServiceInfoDTO3));
        System.assert(deliveryServiceInfoDTO3.equals(deliveryServiceInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO1 = OASDeliveryServiceInfoDTO.getExample();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO2 = OASDeliveryServiceInfoDTO.getExample();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO3 = new OASDeliveryServiceInfoDTO();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO4 = new OASDeliveryServiceInfoDTO();

        System.assert(deliveryServiceInfoDTO1.equals(deliveryServiceInfoDTO2));
        System.assert(deliveryServiceInfoDTO2.equals(deliveryServiceInfoDTO1));
        System.assert(deliveryServiceInfoDTO3.equals(deliveryServiceInfoDTO4));
        System.assert(deliveryServiceInfoDTO4.equals(deliveryServiceInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO1 = OASDeliveryServiceInfoDTO.getExample();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO2 = new OASDeliveryServiceInfoDTO();

        System.assertEquals(false, deliveryServiceInfoDTO1.equals('foo'));
        System.assertEquals(false, deliveryServiceInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO1 = OASDeliveryServiceInfoDTO.getExample();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO2 = new OASDeliveryServiceInfoDTO();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO3;

        System.assertEquals(false, deliveryServiceInfoDTO1.equals(deliveryServiceInfoDTO3));
        System.assertEquals(false, deliveryServiceInfoDTO2.equals(deliveryServiceInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO1 = OASDeliveryServiceInfoDTO.getExample();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO2 = new OASDeliveryServiceInfoDTO();

        System.assertEquals(deliveryServiceInfoDTO1.hashCode(), deliveryServiceInfoDTO1.hashCode());
        System.assertEquals(deliveryServiceInfoDTO2.hashCode(), deliveryServiceInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO1 = OASDeliveryServiceInfoDTO.getExample();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO2 = OASDeliveryServiceInfoDTO.getExample();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO3 = new OASDeliveryServiceInfoDTO();
        OASDeliveryServiceInfoDTO deliveryServiceInfoDTO4 = new OASDeliveryServiceInfoDTO();

        System.assert(deliveryServiceInfoDTO1.equals(deliveryServiceInfoDTO2));
        System.assert(deliveryServiceInfoDTO3.equals(deliveryServiceInfoDTO4));
        System.assertEquals(deliveryServiceInfoDTO1.hashCode(), deliveryServiceInfoDTO2.hashCode());
        System.assertEquals(deliveryServiceInfoDTO3.hashCode(), deliveryServiceInfoDTO4.hashCode());
    }
}
