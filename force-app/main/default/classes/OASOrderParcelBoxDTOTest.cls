@isTest
private class OASOrderParcelBoxDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderParcelBoxDTO orderParcelBoxDTO1 = OASOrderParcelBoxDTO.getExample();
        OASOrderParcelBoxDTO orderParcelBoxDTO2 = orderParcelBoxDTO1;
        OASOrderParcelBoxDTO orderParcelBoxDTO3 = new OASOrderParcelBoxDTO();
        OASOrderParcelBoxDTO orderParcelBoxDTO4 = orderParcelBoxDTO3;

        System.assert(orderParcelBoxDTO1.equals(orderParcelBoxDTO2));
        System.assert(orderParcelBoxDTO2.equals(orderParcelBoxDTO1));
        System.assert(orderParcelBoxDTO1.equals(orderParcelBoxDTO1));
        System.assert(orderParcelBoxDTO3.equals(orderParcelBoxDTO4));
        System.assert(orderParcelBoxDTO4.equals(orderParcelBoxDTO3));
        System.assert(orderParcelBoxDTO3.equals(orderParcelBoxDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderParcelBoxDTO orderParcelBoxDTO1 = OASOrderParcelBoxDTO.getExample();
        OASOrderParcelBoxDTO orderParcelBoxDTO2 = OASOrderParcelBoxDTO.getExample();
        OASOrderParcelBoxDTO orderParcelBoxDTO3 = new OASOrderParcelBoxDTO();
        OASOrderParcelBoxDTO orderParcelBoxDTO4 = new OASOrderParcelBoxDTO();

        System.assert(orderParcelBoxDTO1.equals(orderParcelBoxDTO2));
        System.assert(orderParcelBoxDTO2.equals(orderParcelBoxDTO1));
        System.assert(orderParcelBoxDTO3.equals(orderParcelBoxDTO4));
        System.assert(orderParcelBoxDTO4.equals(orderParcelBoxDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderParcelBoxDTO orderParcelBoxDTO1 = OASOrderParcelBoxDTO.getExample();
        OASOrderParcelBoxDTO orderParcelBoxDTO2 = new OASOrderParcelBoxDTO();

        System.assertEquals(false, orderParcelBoxDTO1.equals('foo'));
        System.assertEquals(false, orderParcelBoxDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderParcelBoxDTO orderParcelBoxDTO1 = OASOrderParcelBoxDTO.getExample();
        OASOrderParcelBoxDTO orderParcelBoxDTO2 = new OASOrderParcelBoxDTO();
        OASOrderParcelBoxDTO orderParcelBoxDTO3;

        System.assertEquals(false, orderParcelBoxDTO1.equals(orderParcelBoxDTO3));
        System.assertEquals(false, orderParcelBoxDTO2.equals(orderParcelBoxDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderParcelBoxDTO orderParcelBoxDTO1 = OASOrderParcelBoxDTO.getExample();
        OASOrderParcelBoxDTO orderParcelBoxDTO2 = new OASOrderParcelBoxDTO();

        System.assertEquals(orderParcelBoxDTO1.hashCode(), orderParcelBoxDTO1.hashCode());
        System.assertEquals(orderParcelBoxDTO2.hashCode(), orderParcelBoxDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderParcelBoxDTO orderParcelBoxDTO1 = OASOrderParcelBoxDTO.getExample();
        OASOrderParcelBoxDTO orderParcelBoxDTO2 = OASOrderParcelBoxDTO.getExample();
        OASOrderParcelBoxDTO orderParcelBoxDTO3 = new OASOrderParcelBoxDTO();
        OASOrderParcelBoxDTO orderParcelBoxDTO4 = new OASOrderParcelBoxDTO();

        System.assert(orderParcelBoxDTO1.equals(orderParcelBoxDTO2));
        System.assert(orderParcelBoxDTO3.equals(orderParcelBoxDTO4));
        System.assertEquals(orderParcelBoxDTO1.hashCode(), orderParcelBoxDTO2.hashCode());
        System.assertEquals(orderParcelBoxDTO3.hashCode(), orderParcelBoxDTO4.hashCode());
    }
}
