@isTest
private class OASOutletLicenseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOutletLicenseDTO outletLicenseDTO1 = OASOutletLicenseDTO.getExample();
        OASOutletLicenseDTO outletLicenseDTO2 = outletLicenseDTO1;
        OASOutletLicenseDTO outletLicenseDTO3 = new OASOutletLicenseDTO();
        OASOutletLicenseDTO outletLicenseDTO4 = outletLicenseDTO3;

        System.assert(outletLicenseDTO1.equals(outletLicenseDTO2));
        System.assert(outletLicenseDTO2.equals(outletLicenseDTO1));
        System.assert(outletLicenseDTO1.equals(outletLicenseDTO1));
        System.assert(outletLicenseDTO3.equals(outletLicenseDTO4));
        System.assert(outletLicenseDTO4.equals(outletLicenseDTO3));
        System.assert(outletLicenseDTO3.equals(outletLicenseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOutletLicenseDTO outletLicenseDTO1 = OASOutletLicenseDTO.getExample();
        OASOutletLicenseDTO outletLicenseDTO2 = OASOutletLicenseDTO.getExample();
        OASOutletLicenseDTO outletLicenseDTO3 = new OASOutletLicenseDTO();
        OASOutletLicenseDTO outletLicenseDTO4 = new OASOutletLicenseDTO();

        System.assert(outletLicenseDTO1.equals(outletLicenseDTO2));
        System.assert(outletLicenseDTO2.equals(outletLicenseDTO1));
        System.assert(outletLicenseDTO3.equals(outletLicenseDTO4));
        System.assert(outletLicenseDTO4.equals(outletLicenseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOutletLicenseDTO outletLicenseDTO1 = OASOutletLicenseDTO.getExample();
        OASOutletLicenseDTO outletLicenseDTO2 = new OASOutletLicenseDTO();

        System.assertEquals(false, outletLicenseDTO1.equals('foo'));
        System.assertEquals(false, outletLicenseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOutletLicenseDTO outletLicenseDTO1 = OASOutletLicenseDTO.getExample();
        OASOutletLicenseDTO outletLicenseDTO2 = new OASOutletLicenseDTO();
        OASOutletLicenseDTO outletLicenseDTO3;

        System.assertEquals(false, outletLicenseDTO1.equals(outletLicenseDTO3));
        System.assertEquals(false, outletLicenseDTO2.equals(outletLicenseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOutletLicenseDTO outletLicenseDTO1 = OASOutletLicenseDTO.getExample();
        OASOutletLicenseDTO outletLicenseDTO2 = new OASOutletLicenseDTO();

        System.assertEquals(outletLicenseDTO1.hashCode(), outletLicenseDTO1.hashCode());
        System.assertEquals(outletLicenseDTO2.hashCode(), outletLicenseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOutletLicenseDTO outletLicenseDTO1 = OASOutletLicenseDTO.getExample();
        OASOutletLicenseDTO outletLicenseDTO2 = OASOutletLicenseDTO.getExample();
        OASOutletLicenseDTO outletLicenseDTO3 = new OASOutletLicenseDTO();
        OASOutletLicenseDTO outletLicenseDTO4 = new OASOutletLicenseDTO();

        System.assert(outletLicenseDTO1.equals(outletLicenseDTO2));
        System.assert(outletLicenseDTO3.equals(outletLicenseDTO4));
        System.assertEquals(outletLicenseDTO1.hashCode(), outletLicenseDTO2.hashCode());
        System.assertEquals(outletLicenseDTO3.hashCode(), outletLicenseDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOutletLicenseDTO outletLicenseDTO = new OASOutletLicenseDTO();
        Map<String, String> x-property-mappings = outletLicenseDTO.getx-property-mappings();
        System.assertEquals('r_number', x-property-mappings.get('number'));
    }
}
