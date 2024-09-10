@isTest
private class OASUpdateOrderStatusDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOrderStatusDTO updateOrderStatusDTO1 = OASUpdateOrderStatusDTO.getExample();
        OASUpdateOrderStatusDTO updateOrderStatusDTO2 = updateOrderStatusDTO1;
        OASUpdateOrderStatusDTO updateOrderStatusDTO3 = new OASUpdateOrderStatusDTO();
        OASUpdateOrderStatusDTO updateOrderStatusDTO4 = updateOrderStatusDTO3;

        System.assert(updateOrderStatusDTO1.equals(updateOrderStatusDTO2));
        System.assert(updateOrderStatusDTO2.equals(updateOrderStatusDTO1));
        System.assert(updateOrderStatusDTO1.equals(updateOrderStatusDTO1));
        System.assert(updateOrderStatusDTO3.equals(updateOrderStatusDTO4));
        System.assert(updateOrderStatusDTO4.equals(updateOrderStatusDTO3));
        System.assert(updateOrderStatusDTO3.equals(updateOrderStatusDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOrderStatusDTO updateOrderStatusDTO1 = OASUpdateOrderStatusDTO.getExample();
        OASUpdateOrderStatusDTO updateOrderStatusDTO2 = OASUpdateOrderStatusDTO.getExample();
        OASUpdateOrderStatusDTO updateOrderStatusDTO3 = new OASUpdateOrderStatusDTO();
        OASUpdateOrderStatusDTO updateOrderStatusDTO4 = new OASUpdateOrderStatusDTO();

        System.assert(updateOrderStatusDTO1.equals(updateOrderStatusDTO2));
        System.assert(updateOrderStatusDTO2.equals(updateOrderStatusDTO1));
        System.assert(updateOrderStatusDTO3.equals(updateOrderStatusDTO4));
        System.assert(updateOrderStatusDTO4.equals(updateOrderStatusDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOrderStatusDTO updateOrderStatusDTO1 = OASUpdateOrderStatusDTO.getExample();
        OASUpdateOrderStatusDTO updateOrderStatusDTO2 = new OASUpdateOrderStatusDTO();

        System.assertEquals(false, updateOrderStatusDTO1.equals('foo'));
        System.assertEquals(false, updateOrderStatusDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOrderStatusDTO updateOrderStatusDTO1 = OASUpdateOrderStatusDTO.getExample();
        OASUpdateOrderStatusDTO updateOrderStatusDTO2 = new OASUpdateOrderStatusDTO();
        OASUpdateOrderStatusDTO updateOrderStatusDTO3;

        System.assertEquals(false, updateOrderStatusDTO1.equals(updateOrderStatusDTO3));
        System.assertEquals(false, updateOrderStatusDTO2.equals(updateOrderStatusDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOrderStatusDTO updateOrderStatusDTO1 = OASUpdateOrderStatusDTO.getExample();
        OASUpdateOrderStatusDTO updateOrderStatusDTO2 = new OASUpdateOrderStatusDTO();

        System.assertEquals(updateOrderStatusDTO1.hashCode(), updateOrderStatusDTO1.hashCode());
        System.assertEquals(updateOrderStatusDTO2.hashCode(), updateOrderStatusDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOrderStatusDTO updateOrderStatusDTO1 = OASUpdateOrderStatusDTO.getExample();
        OASUpdateOrderStatusDTO updateOrderStatusDTO2 = OASUpdateOrderStatusDTO.getExample();
        OASUpdateOrderStatusDTO updateOrderStatusDTO3 = new OASUpdateOrderStatusDTO();
        OASUpdateOrderStatusDTO updateOrderStatusDTO4 = new OASUpdateOrderStatusDTO();

        System.assert(updateOrderStatusDTO1.equals(updateOrderStatusDTO2));
        System.assert(updateOrderStatusDTO3.equals(updateOrderStatusDTO4));
        System.assertEquals(updateOrderStatusDTO1.hashCode(), updateOrderStatusDTO2.hashCode());
        System.assertEquals(updateOrderStatusDTO3.hashCode(), updateOrderStatusDTO4.hashCode());
    }
}
