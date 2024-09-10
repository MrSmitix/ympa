@isTest
private class OASOrderSubsidyDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderSubsidyDTO orderSubsidyDTO1 = OASOrderSubsidyDTO.getExample();
        OASOrderSubsidyDTO orderSubsidyDTO2 = orderSubsidyDTO1;
        OASOrderSubsidyDTO orderSubsidyDTO3 = new OASOrderSubsidyDTO();
        OASOrderSubsidyDTO orderSubsidyDTO4 = orderSubsidyDTO3;

        System.assert(orderSubsidyDTO1.equals(orderSubsidyDTO2));
        System.assert(orderSubsidyDTO2.equals(orderSubsidyDTO1));
        System.assert(orderSubsidyDTO1.equals(orderSubsidyDTO1));
        System.assert(orderSubsidyDTO3.equals(orderSubsidyDTO4));
        System.assert(orderSubsidyDTO4.equals(orderSubsidyDTO3));
        System.assert(orderSubsidyDTO3.equals(orderSubsidyDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderSubsidyDTO orderSubsidyDTO1 = OASOrderSubsidyDTO.getExample();
        OASOrderSubsidyDTO orderSubsidyDTO2 = OASOrderSubsidyDTO.getExample();
        OASOrderSubsidyDTO orderSubsidyDTO3 = new OASOrderSubsidyDTO();
        OASOrderSubsidyDTO orderSubsidyDTO4 = new OASOrderSubsidyDTO();

        System.assert(orderSubsidyDTO1.equals(orderSubsidyDTO2));
        System.assert(orderSubsidyDTO2.equals(orderSubsidyDTO1));
        System.assert(orderSubsidyDTO3.equals(orderSubsidyDTO4));
        System.assert(orderSubsidyDTO4.equals(orderSubsidyDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderSubsidyDTO orderSubsidyDTO1 = OASOrderSubsidyDTO.getExample();
        OASOrderSubsidyDTO orderSubsidyDTO2 = new OASOrderSubsidyDTO();

        System.assertEquals(false, orderSubsidyDTO1.equals('foo'));
        System.assertEquals(false, orderSubsidyDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderSubsidyDTO orderSubsidyDTO1 = OASOrderSubsidyDTO.getExample();
        OASOrderSubsidyDTO orderSubsidyDTO2 = new OASOrderSubsidyDTO();
        OASOrderSubsidyDTO orderSubsidyDTO3;

        System.assertEquals(false, orderSubsidyDTO1.equals(orderSubsidyDTO3));
        System.assertEquals(false, orderSubsidyDTO2.equals(orderSubsidyDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderSubsidyDTO orderSubsidyDTO1 = OASOrderSubsidyDTO.getExample();
        OASOrderSubsidyDTO orderSubsidyDTO2 = new OASOrderSubsidyDTO();

        System.assertEquals(orderSubsidyDTO1.hashCode(), orderSubsidyDTO1.hashCode());
        System.assertEquals(orderSubsidyDTO2.hashCode(), orderSubsidyDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderSubsidyDTO orderSubsidyDTO1 = OASOrderSubsidyDTO.getExample();
        OASOrderSubsidyDTO orderSubsidyDTO2 = OASOrderSubsidyDTO.getExample();
        OASOrderSubsidyDTO orderSubsidyDTO3 = new OASOrderSubsidyDTO();
        OASOrderSubsidyDTO orderSubsidyDTO4 = new OASOrderSubsidyDTO();

        System.assert(orderSubsidyDTO1.equals(orderSubsidyDTO2));
        System.assert(orderSubsidyDTO3.equals(orderSubsidyDTO4));
        System.assertEquals(orderSubsidyDTO1.hashCode(), orderSubsidyDTO2.hashCode());
        System.assertEquals(orderSubsidyDTO3.hashCode(), orderSubsidyDTO4.hashCode());
    }
}
