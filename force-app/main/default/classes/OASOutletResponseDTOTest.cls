@isTest
private class OASOutletResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOutletResponseDTO outletResponseDTO1 = OASOutletResponseDTO.getExample();
        OASOutletResponseDTO outletResponseDTO2 = outletResponseDTO1;
        OASOutletResponseDTO outletResponseDTO3 = new OASOutletResponseDTO();
        OASOutletResponseDTO outletResponseDTO4 = outletResponseDTO3;

        System.assert(outletResponseDTO1.equals(outletResponseDTO2));
        System.assert(outletResponseDTO2.equals(outletResponseDTO1));
        System.assert(outletResponseDTO1.equals(outletResponseDTO1));
        System.assert(outletResponseDTO3.equals(outletResponseDTO4));
        System.assert(outletResponseDTO4.equals(outletResponseDTO3));
        System.assert(outletResponseDTO3.equals(outletResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOutletResponseDTO outletResponseDTO1 = OASOutletResponseDTO.getExample();
        OASOutletResponseDTO outletResponseDTO2 = OASOutletResponseDTO.getExample();
        OASOutletResponseDTO outletResponseDTO3 = new OASOutletResponseDTO();
        OASOutletResponseDTO outletResponseDTO4 = new OASOutletResponseDTO();

        System.assert(outletResponseDTO1.equals(outletResponseDTO2));
        System.assert(outletResponseDTO2.equals(outletResponseDTO1));
        System.assert(outletResponseDTO3.equals(outletResponseDTO4));
        System.assert(outletResponseDTO4.equals(outletResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOutletResponseDTO outletResponseDTO1 = OASOutletResponseDTO.getExample();
        OASOutletResponseDTO outletResponseDTO2 = new OASOutletResponseDTO();

        System.assertEquals(false, outletResponseDTO1.equals('foo'));
        System.assertEquals(false, outletResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOutletResponseDTO outletResponseDTO1 = OASOutletResponseDTO.getExample();
        OASOutletResponseDTO outletResponseDTO2 = new OASOutletResponseDTO();
        OASOutletResponseDTO outletResponseDTO3;

        System.assertEquals(false, outletResponseDTO1.equals(outletResponseDTO3));
        System.assertEquals(false, outletResponseDTO2.equals(outletResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOutletResponseDTO outletResponseDTO1 = OASOutletResponseDTO.getExample();
        OASOutletResponseDTO outletResponseDTO2 = new OASOutletResponseDTO();

        System.assertEquals(outletResponseDTO1.hashCode(), outletResponseDTO1.hashCode());
        System.assertEquals(outletResponseDTO2.hashCode(), outletResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOutletResponseDTO outletResponseDTO1 = OASOutletResponseDTO.getExample();
        OASOutletResponseDTO outletResponseDTO2 = OASOutletResponseDTO.getExample();
        OASOutletResponseDTO outletResponseDTO3 = new OASOutletResponseDTO();
        OASOutletResponseDTO outletResponseDTO4 = new OASOutletResponseDTO();

        System.assert(outletResponseDTO1.equals(outletResponseDTO2));
        System.assert(outletResponseDTO3.equals(outletResponseDTO4));
        System.assertEquals(outletResponseDTO1.hashCode(), outletResponseDTO2.hashCode());
        System.assertEquals(outletResponseDTO3.hashCode(), outletResponseDTO4.hashCode());
    }
}
