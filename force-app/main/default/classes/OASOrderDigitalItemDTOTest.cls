@isTest
private class OASOrderDigitalItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderDigitalItemDTO orderDigitalItemDTO1 = OASOrderDigitalItemDTO.getExample();
        OASOrderDigitalItemDTO orderDigitalItemDTO2 = orderDigitalItemDTO1;
        OASOrderDigitalItemDTO orderDigitalItemDTO3 = new OASOrderDigitalItemDTO();
        OASOrderDigitalItemDTO orderDigitalItemDTO4 = orderDigitalItemDTO3;

        System.assert(orderDigitalItemDTO1.equals(orderDigitalItemDTO2));
        System.assert(orderDigitalItemDTO2.equals(orderDigitalItemDTO1));
        System.assert(orderDigitalItemDTO1.equals(orderDigitalItemDTO1));
        System.assert(orderDigitalItemDTO3.equals(orderDigitalItemDTO4));
        System.assert(orderDigitalItemDTO4.equals(orderDigitalItemDTO3));
        System.assert(orderDigitalItemDTO3.equals(orderDigitalItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderDigitalItemDTO orderDigitalItemDTO1 = OASOrderDigitalItemDTO.getExample();
        OASOrderDigitalItemDTO orderDigitalItemDTO2 = OASOrderDigitalItemDTO.getExample();
        OASOrderDigitalItemDTO orderDigitalItemDTO3 = new OASOrderDigitalItemDTO();
        OASOrderDigitalItemDTO orderDigitalItemDTO4 = new OASOrderDigitalItemDTO();

        System.assert(orderDigitalItemDTO1.equals(orderDigitalItemDTO2));
        System.assert(orderDigitalItemDTO2.equals(orderDigitalItemDTO1));
        System.assert(orderDigitalItemDTO3.equals(orderDigitalItemDTO4));
        System.assert(orderDigitalItemDTO4.equals(orderDigitalItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderDigitalItemDTO orderDigitalItemDTO1 = OASOrderDigitalItemDTO.getExample();
        OASOrderDigitalItemDTO orderDigitalItemDTO2 = new OASOrderDigitalItemDTO();

        System.assertEquals(false, orderDigitalItemDTO1.equals('foo'));
        System.assertEquals(false, orderDigitalItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderDigitalItemDTO orderDigitalItemDTO1 = OASOrderDigitalItemDTO.getExample();
        OASOrderDigitalItemDTO orderDigitalItemDTO2 = new OASOrderDigitalItemDTO();
        OASOrderDigitalItemDTO orderDigitalItemDTO3;

        System.assertEquals(false, orderDigitalItemDTO1.equals(orderDigitalItemDTO3));
        System.assertEquals(false, orderDigitalItemDTO2.equals(orderDigitalItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderDigitalItemDTO orderDigitalItemDTO1 = OASOrderDigitalItemDTO.getExample();
        OASOrderDigitalItemDTO orderDigitalItemDTO2 = new OASOrderDigitalItemDTO();

        System.assertEquals(orderDigitalItemDTO1.hashCode(), orderDigitalItemDTO1.hashCode());
        System.assertEquals(orderDigitalItemDTO2.hashCode(), orderDigitalItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderDigitalItemDTO orderDigitalItemDTO1 = OASOrderDigitalItemDTO.getExample();
        OASOrderDigitalItemDTO orderDigitalItemDTO2 = OASOrderDigitalItemDTO.getExample();
        OASOrderDigitalItemDTO orderDigitalItemDTO3 = new OASOrderDigitalItemDTO();
        OASOrderDigitalItemDTO orderDigitalItemDTO4 = new OASOrderDigitalItemDTO();

        System.assert(orderDigitalItemDTO1.equals(orderDigitalItemDTO2));
        System.assert(orderDigitalItemDTO3.equals(orderDigitalItemDTO4));
        System.assertEquals(orderDigitalItemDTO1.hashCode(), orderDigitalItemDTO2.hashCode());
        System.assertEquals(orderDigitalItemDTO3.hashCode(), orderDigitalItemDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrderDigitalItemDTO orderDigitalItemDTO = new OASOrderDigitalItemDTO();
        Map<String, String> x-property-mappings = orderDigitalItemDTO.getx-property-mappings();
        System.assertEquals('activateTill', x-property-mappings.get('activate_till'));
    }
}
