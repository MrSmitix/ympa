@isTest
private class OASFullOutletLicenseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFullOutletLicenseDTO fullOutletLicenseDTO1 = OASFullOutletLicenseDTO.getExample();
        OASFullOutletLicenseDTO fullOutletLicenseDTO2 = fullOutletLicenseDTO1;
        OASFullOutletLicenseDTO fullOutletLicenseDTO3 = new OASFullOutletLicenseDTO();
        OASFullOutletLicenseDTO fullOutletLicenseDTO4 = fullOutletLicenseDTO3;

        System.assert(fullOutletLicenseDTO1.equals(fullOutletLicenseDTO2));
        System.assert(fullOutletLicenseDTO2.equals(fullOutletLicenseDTO1));
        System.assert(fullOutletLicenseDTO1.equals(fullOutletLicenseDTO1));
        System.assert(fullOutletLicenseDTO3.equals(fullOutletLicenseDTO4));
        System.assert(fullOutletLicenseDTO4.equals(fullOutletLicenseDTO3));
        System.assert(fullOutletLicenseDTO3.equals(fullOutletLicenseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFullOutletLicenseDTO fullOutletLicenseDTO1 = OASFullOutletLicenseDTO.getExample();
        OASFullOutletLicenseDTO fullOutletLicenseDTO2 = OASFullOutletLicenseDTO.getExample();
        OASFullOutletLicenseDTO fullOutletLicenseDTO3 = new OASFullOutletLicenseDTO();
        OASFullOutletLicenseDTO fullOutletLicenseDTO4 = new OASFullOutletLicenseDTO();

        System.assert(fullOutletLicenseDTO1.equals(fullOutletLicenseDTO2));
        System.assert(fullOutletLicenseDTO2.equals(fullOutletLicenseDTO1));
        System.assert(fullOutletLicenseDTO3.equals(fullOutletLicenseDTO4));
        System.assert(fullOutletLicenseDTO4.equals(fullOutletLicenseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFullOutletLicenseDTO fullOutletLicenseDTO1 = OASFullOutletLicenseDTO.getExample();
        OASFullOutletLicenseDTO fullOutletLicenseDTO2 = new OASFullOutletLicenseDTO();

        System.assertEquals(false, fullOutletLicenseDTO1.equals('foo'));
        System.assertEquals(false, fullOutletLicenseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFullOutletLicenseDTO fullOutletLicenseDTO1 = OASFullOutletLicenseDTO.getExample();
        OASFullOutletLicenseDTO fullOutletLicenseDTO2 = new OASFullOutletLicenseDTO();
        OASFullOutletLicenseDTO fullOutletLicenseDTO3;

        System.assertEquals(false, fullOutletLicenseDTO1.equals(fullOutletLicenseDTO3));
        System.assertEquals(false, fullOutletLicenseDTO2.equals(fullOutletLicenseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFullOutletLicenseDTO fullOutletLicenseDTO1 = OASFullOutletLicenseDTO.getExample();
        OASFullOutletLicenseDTO fullOutletLicenseDTO2 = new OASFullOutletLicenseDTO();

        System.assertEquals(fullOutletLicenseDTO1.hashCode(), fullOutletLicenseDTO1.hashCode());
        System.assertEquals(fullOutletLicenseDTO2.hashCode(), fullOutletLicenseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFullOutletLicenseDTO fullOutletLicenseDTO1 = OASFullOutletLicenseDTO.getExample();
        OASFullOutletLicenseDTO fullOutletLicenseDTO2 = OASFullOutletLicenseDTO.getExample();
        OASFullOutletLicenseDTO fullOutletLicenseDTO3 = new OASFullOutletLicenseDTO();
        OASFullOutletLicenseDTO fullOutletLicenseDTO4 = new OASFullOutletLicenseDTO();

        System.assert(fullOutletLicenseDTO1.equals(fullOutletLicenseDTO2));
        System.assert(fullOutletLicenseDTO3.equals(fullOutletLicenseDTO4));
        System.assertEquals(fullOutletLicenseDTO1.hashCode(), fullOutletLicenseDTO2.hashCode());
        System.assertEquals(fullOutletLicenseDTO3.hashCode(), fullOutletLicenseDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFullOutletLicenseDTO fullOutletLicenseDTO = new OASFullOutletLicenseDTO();
        Map<String, String> x-property-mappings = fullOutletLicenseDTO.getx-property-mappings();
        System.assertEquals('r_number', x-property-mappings.get('number'));
    }
}
