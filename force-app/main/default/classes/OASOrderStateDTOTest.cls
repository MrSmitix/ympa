@isTest
private class OASOrderStateDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderStateDTO orderStateDTO1 = OASOrderStateDTO.getExample();
        OASOrderStateDTO orderStateDTO2 = orderStateDTO1;
        OASOrderStateDTO orderStateDTO3 = new OASOrderStateDTO();
        OASOrderStateDTO orderStateDTO4 = orderStateDTO3;

        System.assert(orderStateDTO1.equals(orderStateDTO2));
        System.assert(orderStateDTO2.equals(orderStateDTO1));
        System.assert(orderStateDTO1.equals(orderStateDTO1));
        System.assert(orderStateDTO3.equals(orderStateDTO4));
        System.assert(orderStateDTO4.equals(orderStateDTO3));
        System.assert(orderStateDTO3.equals(orderStateDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderStateDTO orderStateDTO1 = OASOrderStateDTO.getExample();
        OASOrderStateDTO orderStateDTO2 = OASOrderStateDTO.getExample();
        OASOrderStateDTO orderStateDTO3 = new OASOrderStateDTO();
        OASOrderStateDTO orderStateDTO4 = new OASOrderStateDTO();

        System.assert(orderStateDTO1.equals(orderStateDTO2));
        System.assert(orderStateDTO2.equals(orderStateDTO1));
        System.assert(orderStateDTO3.equals(orderStateDTO4));
        System.assert(orderStateDTO4.equals(orderStateDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderStateDTO orderStateDTO1 = OASOrderStateDTO.getExample();
        OASOrderStateDTO orderStateDTO2 = new OASOrderStateDTO();

        System.assertEquals(false, orderStateDTO1.equals('foo'));
        System.assertEquals(false, orderStateDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderStateDTO orderStateDTO1 = OASOrderStateDTO.getExample();
        OASOrderStateDTO orderStateDTO2 = new OASOrderStateDTO();
        OASOrderStateDTO orderStateDTO3;

        System.assertEquals(false, orderStateDTO1.equals(orderStateDTO3));
        System.assertEquals(false, orderStateDTO2.equals(orderStateDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderStateDTO orderStateDTO1 = OASOrderStateDTO.getExample();
        OASOrderStateDTO orderStateDTO2 = new OASOrderStateDTO();

        System.assertEquals(orderStateDTO1.hashCode(), orderStateDTO1.hashCode());
        System.assertEquals(orderStateDTO2.hashCode(), orderStateDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderStateDTO orderStateDTO1 = OASOrderStateDTO.getExample();
        OASOrderStateDTO orderStateDTO2 = OASOrderStateDTO.getExample();
        OASOrderStateDTO orderStateDTO3 = new OASOrderStateDTO();
        OASOrderStateDTO orderStateDTO4 = new OASOrderStateDTO();

        System.assert(orderStateDTO1.equals(orderStateDTO2));
        System.assert(orderStateDTO3.equals(orderStateDTO4));
        System.assertEquals(orderStateDTO1.hashCode(), orderStateDTO2.hashCode());
        System.assertEquals(orderStateDTO3.hashCode(), orderStateDTO4.hashCode());
    }
}
