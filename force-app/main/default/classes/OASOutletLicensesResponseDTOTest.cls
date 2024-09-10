@isTest
private class OASOutletLicensesResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOutletLicensesResponseDTO outletLicensesResponseDTO1 = OASOutletLicensesResponseDTO.getExample();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO2 = outletLicensesResponseDTO1;
        OASOutletLicensesResponseDTO outletLicensesResponseDTO3 = new OASOutletLicensesResponseDTO();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO4 = outletLicensesResponseDTO3;

        System.assert(outletLicensesResponseDTO1.equals(outletLicensesResponseDTO2));
        System.assert(outletLicensesResponseDTO2.equals(outletLicensesResponseDTO1));
        System.assert(outletLicensesResponseDTO1.equals(outletLicensesResponseDTO1));
        System.assert(outletLicensesResponseDTO3.equals(outletLicensesResponseDTO4));
        System.assert(outletLicensesResponseDTO4.equals(outletLicensesResponseDTO3));
        System.assert(outletLicensesResponseDTO3.equals(outletLicensesResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOutletLicensesResponseDTO outletLicensesResponseDTO1 = OASOutletLicensesResponseDTO.getExample();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO2 = OASOutletLicensesResponseDTO.getExample();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO3 = new OASOutletLicensesResponseDTO();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO4 = new OASOutletLicensesResponseDTO();

        System.assert(outletLicensesResponseDTO1.equals(outletLicensesResponseDTO2));
        System.assert(outletLicensesResponseDTO2.equals(outletLicensesResponseDTO1));
        System.assert(outletLicensesResponseDTO3.equals(outletLicensesResponseDTO4));
        System.assert(outletLicensesResponseDTO4.equals(outletLicensesResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOutletLicensesResponseDTO outletLicensesResponseDTO1 = OASOutletLicensesResponseDTO.getExample();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO2 = new OASOutletLicensesResponseDTO();

        System.assertEquals(false, outletLicensesResponseDTO1.equals('foo'));
        System.assertEquals(false, outletLicensesResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOutletLicensesResponseDTO outletLicensesResponseDTO1 = OASOutletLicensesResponseDTO.getExample();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO2 = new OASOutletLicensesResponseDTO();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO3;

        System.assertEquals(false, outletLicensesResponseDTO1.equals(outletLicensesResponseDTO3));
        System.assertEquals(false, outletLicensesResponseDTO2.equals(outletLicensesResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOutletLicensesResponseDTO outletLicensesResponseDTO1 = OASOutletLicensesResponseDTO.getExample();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO2 = new OASOutletLicensesResponseDTO();

        System.assertEquals(outletLicensesResponseDTO1.hashCode(), outletLicensesResponseDTO1.hashCode());
        System.assertEquals(outletLicensesResponseDTO2.hashCode(), outletLicensesResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOutletLicensesResponseDTO outletLicensesResponseDTO1 = OASOutletLicensesResponseDTO.getExample();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO2 = OASOutletLicensesResponseDTO.getExample();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO3 = new OASOutletLicensesResponseDTO();
        OASOutletLicensesResponseDTO outletLicensesResponseDTO4 = new OASOutletLicensesResponseDTO();

        System.assert(outletLicensesResponseDTO1.equals(outletLicensesResponseDTO2));
        System.assert(outletLicensesResponseDTO3.equals(outletLicensesResponseDTO4));
        System.assertEquals(outletLicensesResponseDTO1.hashCode(), outletLicensesResponseDTO2.hashCode());
        System.assertEquals(outletLicensesResponseDTO3.hashCode(), outletLicensesResponseDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOutletLicensesResponseDTO outletLicensesResponseDTO = new OASOutletLicensesResponseDTO();
        System.assertEquals(new List<OASFullOutletLicenseDTO>(), outletLicensesResponseDTO.licenses);
    }
}
