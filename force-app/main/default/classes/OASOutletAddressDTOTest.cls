@isTest
private class OASOutletAddressDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOutletAddressDTO outletAddressDTO1 = OASOutletAddressDTO.getExample();
        OASOutletAddressDTO outletAddressDTO2 = outletAddressDTO1;
        OASOutletAddressDTO outletAddressDTO3 = new OASOutletAddressDTO();
        OASOutletAddressDTO outletAddressDTO4 = outletAddressDTO3;

        System.assert(outletAddressDTO1.equals(outletAddressDTO2));
        System.assert(outletAddressDTO2.equals(outletAddressDTO1));
        System.assert(outletAddressDTO1.equals(outletAddressDTO1));
        System.assert(outletAddressDTO3.equals(outletAddressDTO4));
        System.assert(outletAddressDTO4.equals(outletAddressDTO3));
        System.assert(outletAddressDTO3.equals(outletAddressDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOutletAddressDTO outletAddressDTO1 = OASOutletAddressDTO.getExample();
        OASOutletAddressDTO outletAddressDTO2 = OASOutletAddressDTO.getExample();
        OASOutletAddressDTO outletAddressDTO3 = new OASOutletAddressDTO();
        OASOutletAddressDTO outletAddressDTO4 = new OASOutletAddressDTO();

        System.assert(outletAddressDTO1.equals(outletAddressDTO2));
        System.assert(outletAddressDTO2.equals(outletAddressDTO1));
        System.assert(outletAddressDTO3.equals(outletAddressDTO4));
        System.assert(outletAddressDTO4.equals(outletAddressDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOutletAddressDTO outletAddressDTO1 = OASOutletAddressDTO.getExample();
        OASOutletAddressDTO outletAddressDTO2 = new OASOutletAddressDTO();

        System.assertEquals(false, outletAddressDTO1.equals('foo'));
        System.assertEquals(false, outletAddressDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOutletAddressDTO outletAddressDTO1 = OASOutletAddressDTO.getExample();
        OASOutletAddressDTO outletAddressDTO2 = new OASOutletAddressDTO();
        OASOutletAddressDTO outletAddressDTO3;

        System.assertEquals(false, outletAddressDTO1.equals(outletAddressDTO3));
        System.assertEquals(false, outletAddressDTO2.equals(outletAddressDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOutletAddressDTO outletAddressDTO1 = OASOutletAddressDTO.getExample();
        OASOutletAddressDTO outletAddressDTO2 = new OASOutletAddressDTO();

        System.assertEquals(outletAddressDTO1.hashCode(), outletAddressDTO1.hashCode());
        System.assertEquals(outletAddressDTO2.hashCode(), outletAddressDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOutletAddressDTO outletAddressDTO1 = OASOutletAddressDTO.getExample();
        OASOutletAddressDTO outletAddressDTO2 = OASOutletAddressDTO.getExample();
        OASOutletAddressDTO outletAddressDTO3 = new OASOutletAddressDTO();
        OASOutletAddressDTO outletAddressDTO4 = new OASOutletAddressDTO();

        System.assert(outletAddressDTO1.equals(outletAddressDTO2));
        System.assert(outletAddressDTO3.equals(outletAddressDTO4));
        System.assertEquals(outletAddressDTO1.hashCode(), outletAddressDTO2.hashCode());
        System.assertEquals(outletAddressDTO3.hashCode(), outletAddressDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOutletAddressDTO outletAddressDTO = new OASOutletAddressDTO();
        Map<String, String> x-property-mappings = outletAddressDTO.getx-property-mappings();
        System.assertEquals('r_number', x-property-mappings.get('number'));
    }
}
