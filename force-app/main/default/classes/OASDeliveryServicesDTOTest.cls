@isTest
private class OASDeliveryServicesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeliveryServicesDTO deliveryServicesDTO1 = OASDeliveryServicesDTO.getExample();
        OASDeliveryServicesDTO deliveryServicesDTO2 = deliveryServicesDTO1;
        OASDeliveryServicesDTO deliveryServicesDTO3 = new OASDeliveryServicesDTO();
        OASDeliveryServicesDTO deliveryServicesDTO4 = deliveryServicesDTO3;

        System.assert(deliveryServicesDTO1.equals(deliveryServicesDTO2));
        System.assert(deliveryServicesDTO2.equals(deliveryServicesDTO1));
        System.assert(deliveryServicesDTO1.equals(deliveryServicesDTO1));
        System.assert(deliveryServicesDTO3.equals(deliveryServicesDTO4));
        System.assert(deliveryServicesDTO4.equals(deliveryServicesDTO3));
        System.assert(deliveryServicesDTO3.equals(deliveryServicesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeliveryServicesDTO deliveryServicesDTO1 = OASDeliveryServicesDTO.getExample();
        OASDeliveryServicesDTO deliveryServicesDTO2 = OASDeliveryServicesDTO.getExample();
        OASDeliveryServicesDTO deliveryServicesDTO3 = new OASDeliveryServicesDTO();
        OASDeliveryServicesDTO deliveryServicesDTO4 = new OASDeliveryServicesDTO();

        System.assert(deliveryServicesDTO1.equals(deliveryServicesDTO2));
        System.assert(deliveryServicesDTO2.equals(deliveryServicesDTO1));
        System.assert(deliveryServicesDTO3.equals(deliveryServicesDTO4));
        System.assert(deliveryServicesDTO4.equals(deliveryServicesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeliveryServicesDTO deliveryServicesDTO1 = OASDeliveryServicesDTO.getExample();
        OASDeliveryServicesDTO deliveryServicesDTO2 = new OASDeliveryServicesDTO();

        System.assertEquals(false, deliveryServicesDTO1.equals('foo'));
        System.assertEquals(false, deliveryServicesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeliveryServicesDTO deliveryServicesDTO1 = OASDeliveryServicesDTO.getExample();
        OASDeliveryServicesDTO deliveryServicesDTO2 = new OASDeliveryServicesDTO();
        OASDeliveryServicesDTO deliveryServicesDTO3;

        System.assertEquals(false, deliveryServicesDTO1.equals(deliveryServicesDTO3));
        System.assertEquals(false, deliveryServicesDTO2.equals(deliveryServicesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeliveryServicesDTO deliveryServicesDTO1 = OASDeliveryServicesDTO.getExample();
        OASDeliveryServicesDTO deliveryServicesDTO2 = new OASDeliveryServicesDTO();

        System.assertEquals(deliveryServicesDTO1.hashCode(), deliveryServicesDTO1.hashCode());
        System.assertEquals(deliveryServicesDTO2.hashCode(), deliveryServicesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeliveryServicesDTO deliveryServicesDTO1 = OASDeliveryServicesDTO.getExample();
        OASDeliveryServicesDTO deliveryServicesDTO2 = OASDeliveryServicesDTO.getExample();
        OASDeliveryServicesDTO deliveryServicesDTO3 = new OASDeliveryServicesDTO();
        OASDeliveryServicesDTO deliveryServicesDTO4 = new OASDeliveryServicesDTO();

        System.assert(deliveryServicesDTO1.equals(deliveryServicesDTO2));
        System.assert(deliveryServicesDTO3.equals(deliveryServicesDTO4));
        System.assertEquals(deliveryServicesDTO1.hashCode(), deliveryServicesDTO2.hashCode());
        System.assertEquals(deliveryServicesDTO3.hashCode(), deliveryServicesDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeliveryServicesDTO deliveryServicesDTO = new OASDeliveryServicesDTO();
        System.assertEquals(new List<OASDeliveryServiceInfoDTO>(), deliveryServicesDTO.deliveryService);
    }
}
