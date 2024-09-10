@isTest
private class OASPickupAddressDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPickupAddressDTO pickupAddressDTO1 = OASPickupAddressDTO.getExample();
        OASPickupAddressDTO pickupAddressDTO2 = pickupAddressDTO1;
        OASPickupAddressDTO pickupAddressDTO3 = new OASPickupAddressDTO();
        OASPickupAddressDTO pickupAddressDTO4 = pickupAddressDTO3;

        System.assert(pickupAddressDTO1.equals(pickupAddressDTO2));
        System.assert(pickupAddressDTO2.equals(pickupAddressDTO1));
        System.assert(pickupAddressDTO1.equals(pickupAddressDTO1));
        System.assert(pickupAddressDTO3.equals(pickupAddressDTO4));
        System.assert(pickupAddressDTO4.equals(pickupAddressDTO3));
        System.assert(pickupAddressDTO3.equals(pickupAddressDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPickupAddressDTO pickupAddressDTO1 = OASPickupAddressDTO.getExample();
        OASPickupAddressDTO pickupAddressDTO2 = OASPickupAddressDTO.getExample();
        OASPickupAddressDTO pickupAddressDTO3 = new OASPickupAddressDTO();
        OASPickupAddressDTO pickupAddressDTO4 = new OASPickupAddressDTO();

        System.assert(pickupAddressDTO1.equals(pickupAddressDTO2));
        System.assert(pickupAddressDTO2.equals(pickupAddressDTO1));
        System.assert(pickupAddressDTO3.equals(pickupAddressDTO4));
        System.assert(pickupAddressDTO4.equals(pickupAddressDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPickupAddressDTO pickupAddressDTO1 = OASPickupAddressDTO.getExample();
        OASPickupAddressDTO pickupAddressDTO2 = new OASPickupAddressDTO();

        System.assertEquals(false, pickupAddressDTO1.equals('foo'));
        System.assertEquals(false, pickupAddressDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPickupAddressDTO pickupAddressDTO1 = OASPickupAddressDTO.getExample();
        OASPickupAddressDTO pickupAddressDTO2 = new OASPickupAddressDTO();
        OASPickupAddressDTO pickupAddressDTO3;

        System.assertEquals(false, pickupAddressDTO1.equals(pickupAddressDTO3));
        System.assertEquals(false, pickupAddressDTO2.equals(pickupAddressDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPickupAddressDTO pickupAddressDTO1 = OASPickupAddressDTO.getExample();
        OASPickupAddressDTO pickupAddressDTO2 = new OASPickupAddressDTO();

        System.assertEquals(pickupAddressDTO1.hashCode(), pickupAddressDTO1.hashCode());
        System.assertEquals(pickupAddressDTO2.hashCode(), pickupAddressDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPickupAddressDTO pickupAddressDTO1 = OASPickupAddressDTO.getExample();
        OASPickupAddressDTO pickupAddressDTO2 = OASPickupAddressDTO.getExample();
        OASPickupAddressDTO pickupAddressDTO3 = new OASPickupAddressDTO();
        OASPickupAddressDTO pickupAddressDTO4 = new OASPickupAddressDTO();

        System.assert(pickupAddressDTO1.equals(pickupAddressDTO2));
        System.assert(pickupAddressDTO3.equals(pickupAddressDTO4));
        System.assertEquals(pickupAddressDTO1.hashCode(), pickupAddressDTO2.hashCode());
        System.assertEquals(pickupAddressDTO3.hashCode(), pickupAddressDTO4.hashCode());
    }
}
