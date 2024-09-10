@isTest
private class OASOrderBoxLayoutPartialCountDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO1 = OASOrderBoxLayoutPartialCountDTO.getExample();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO2 = orderBoxLayoutPartialCountDTO1;
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO3 = new OASOrderBoxLayoutPartialCountDTO();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO4 = orderBoxLayoutPartialCountDTO3;

        System.assert(orderBoxLayoutPartialCountDTO1.equals(orderBoxLayoutPartialCountDTO2));
        System.assert(orderBoxLayoutPartialCountDTO2.equals(orderBoxLayoutPartialCountDTO1));
        System.assert(orderBoxLayoutPartialCountDTO1.equals(orderBoxLayoutPartialCountDTO1));
        System.assert(orderBoxLayoutPartialCountDTO3.equals(orderBoxLayoutPartialCountDTO4));
        System.assert(orderBoxLayoutPartialCountDTO4.equals(orderBoxLayoutPartialCountDTO3));
        System.assert(orderBoxLayoutPartialCountDTO3.equals(orderBoxLayoutPartialCountDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO1 = OASOrderBoxLayoutPartialCountDTO.getExample();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO2 = OASOrderBoxLayoutPartialCountDTO.getExample();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO3 = new OASOrderBoxLayoutPartialCountDTO();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO4 = new OASOrderBoxLayoutPartialCountDTO();

        System.assert(orderBoxLayoutPartialCountDTO1.equals(orderBoxLayoutPartialCountDTO2));
        System.assert(orderBoxLayoutPartialCountDTO2.equals(orderBoxLayoutPartialCountDTO1));
        System.assert(orderBoxLayoutPartialCountDTO3.equals(orderBoxLayoutPartialCountDTO4));
        System.assert(orderBoxLayoutPartialCountDTO4.equals(orderBoxLayoutPartialCountDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO1 = OASOrderBoxLayoutPartialCountDTO.getExample();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO2 = new OASOrderBoxLayoutPartialCountDTO();

        System.assertEquals(false, orderBoxLayoutPartialCountDTO1.equals('foo'));
        System.assertEquals(false, orderBoxLayoutPartialCountDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO1 = OASOrderBoxLayoutPartialCountDTO.getExample();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO2 = new OASOrderBoxLayoutPartialCountDTO();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO3;

        System.assertEquals(false, orderBoxLayoutPartialCountDTO1.equals(orderBoxLayoutPartialCountDTO3));
        System.assertEquals(false, orderBoxLayoutPartialCountDTO2.equals(orderBoxLayoutPartialCountDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO1 = OASOrderBoxLayoutPartialCountDTO.getExample();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO2 = new OASOrderBoxLayoutPartialCountDTO();

        System.assertEquals(orderBoxLayoutPartialCountDTO1.hashCode(), orderBoxLayoutPartialCountDTO1.hashCode());
        System.assertEquals(orderBoxLayoutPartialCountDTO2.hashCode(), orderBoxLayoutPartialCountDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO1 = OASOrderBoxLayoutPartialCountDTO.getExample();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO2 = OASOrderBoxLayoutPartialCountDTO.getExample();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO3 = new OASOrderBoxLayoutPartialCountDTO();
        OASOrderBoxLayoutPartialCountDTO orderBoxLayoutPartialCountDTO4 = new OASOrderBoxLayoutPartialCountDTO();

        System.assert(orderBoxLayoutPartialCountDTO1.equals(orderBoxLayoutPartialCountDTO2));
        System.assert(orderBoxLayoutPartialCountDTO3.equals(orderBoxLayoutPartialCountDTO4));
        System.assertEquals(orderBoxLayoutPartialCountDTO1.hashCode(), orderBoxLayoutPartialCountDTO2.hashCode());
        System.assertEquals(orderBoxLayoutPartialCountDTO3.hashCode(), orderBoxLayoutPartialCountDTO4.hashCode());
    }
}
