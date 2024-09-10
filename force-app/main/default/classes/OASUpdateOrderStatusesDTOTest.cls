@isTest
private class OASUpdateOrderStatusesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO1 = OASUpdateOrderStatusesDTO.getExample();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO2 = updateOrderStatusesDTO1;
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO3 = new OASUpdateOrderStatusesDTO();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO4 = updateOrderStatusesDTO3;

        System.assert(updateOrderStatusesDTO1.equals(updateOrderStatusesDTO2));
        System.assert(updateOrderStatusesDTO2.equals(updateOrderStatusesDTO1));
        System.assert(updateOrderStatusesDTO1.equals(updateOrderStatusesDTO1));
        System.assert(updateOrderStatusesDTO3.equals(updateOrderStatusesDTO4));
        System.assert(updateOrderStatusesDTO4.equals(updateOrderStatusesDTO3));
        System.assert(updateOrderStatusesDTO3.equals(updateOrderStatusesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO1 = OASUpdateOrderStatusesDTO.getExample();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO2 = OASUpdateOrderStatusesDTO.getExample();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO3 = new OASUpdateOrderStatusesDTO();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO4 = new OASUpdateOrderStatusesDTO();

        System.assert(updateOrderStatusesDTO1.equals(updateOrderStatusesDTO2));
        System.assert(updateOrderStatusesDTO2.equals(updateOrderStatusesDTO1));
        System.assert(updateOrderStatusesDTO3.equals(updateOrderStatusesDTO4));
        System.assert(updateOrderStatusesDTO4.equals(updateOrderStatusesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO1 = OASUpdateOrderStatusesDTO.getExample();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO2 = new OASUpdateOrderStatusesDTO();

        System.assertEquals(false, updateOrderStatusesDTO1.equals('foo'));
        System.assertEquals(false, updateOrderStatusesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO1 = OASUpdateOrderStatusesDTO.getExample();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO2 = new OASUpdateOrderStatusesDTO();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO3;

        System.assertEquals(false, updateOrderStatusesDTO1.equals(updateOrderStatusesDTO3));
        System.assertEquals(false, updateOrderStatusesDTO2.equals(updateOrderStatusesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO1 = OASUpdateOrderStatusesDTO.getExample();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO2 = new OASUpdateOrderStatusesDTO();

        System.assertEquals(updateOrderStatusesDTO1.hashCode(), updateOrderStatusesDTO1.hashCode());
        System.assertEquals(updateOrderStatusesDTO2.hashCode(), updateOrderStatusesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO1 = OASUpdateOrderStatusesDTO.getExample();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO2 = OASUpdateOrderStatusesDTO.getExample();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO3 = new OASUpdateOrderStatusesDTO();
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO4 = new OASUpdateOrderStatusesDTO();

        System.assert(updateOrderStatusesDTO1.equals(updateOrderStatusesDTO2));
        System.assert(updateOrderStatusesDTO3.equals(updateOrderStatusesDTO4));
        System.assertEquals(updateOrderStatusesDTO1.hashCode(), updateOrderStatusesDTO2.hashCode());
        System.assertEquals(updateOrderStatusesDTO3.hashCode(), updateOrderStatusesDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOrderStatusesDTO updateOrderStatusesDTO = new OASUpdateOrderStatusesDTO();
        System.assertEquals(new List<OASUpdateOrderStatusDTO>(), updateOrderStatusesDTO.orders);
    }
}
