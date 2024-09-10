@isTest
private class OASRegionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASRegionDTO regionDTO1 = OASRegionDTO.getExample();
        OASRegionDTO regionDTO2 = regionDTO1;
        OASRegionDTO regionDTO3 = new OASRegionDTO();
        OASRegionDTO regionDTO4 = regionDTO3;

        System.assert(regionDTO1.equals(regionDTO2));
        System.assert(regionDTO2.equals(regionDTO1));
        System.assert(regionDTO1.equals(regionDTO1));
        System.assert(regionDTO3.equals(regionDTO4));
        System.assert(regionDTO4.equals(regionDTO3));
        System.assert(regionDTO3.equals(regionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRegionDTO regionDTO1 = OASRegionDTO.getExample();
        OASRegionDTO regionDTO2 = OASRegionDTO.getExample();
        OASRegionDTO regionDTO3 = new OASRegionDTO();
        OASRegionDTO regionDTO4 = new OASRegionDTO();

        System.assert(regionDTO1.equals(regionDTO2));
        System.assert(regionDTO2.equals(regionDTO1));
        System.assert(regionDTO3.equals(regionDTO4));
        System.assert(regionDTO4.equals(regionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRegionDTO regionDTO1 = OASRegionDTO.getExample();
        OASRegionDTO regionDTO2 = new OASRegionDTO();

        System.assertEquals(false, regionDTO1.equals('foo'));
        System.assertEquals(false, regionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRegionDTO regionDTO1 = OASRegionDTO.getExample();
        OASRegionDTO regionDTO2 = new OASRegionDTO();
        OASRegionDTO regionDTO3;

        System.assertEquals(false, regionDTO1.equals(regionDTO3));
        System.assertEquals(false, regionDTO2.equals(regionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRegionDTO regionDTO1 = OASRegionDTO.getExample();
        OASRegionDTO regionDTO2 = new OASRegionDTO();

        System.assertEquals(regionDTO1.hashCode(), regionDTO1.hashCode());
        System.assertEquals(regionDTO2.hashCode(), regionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRegionDTO regionDTO1 = OASRegionDTO.getExample();
        OASRegionDTO regionDTO2 = OASRegionDTO.getExample();
        OASRegionDTO regionDTO3 = new OASRegionDTO();
        OASRegionDTO regionDTO4 = new OASRegionDTO();

        System.assert(regionDTO1.equals(regionDTO2));
        System.assert(regionDTO3.equals(regionDTO4));
        System.assertEquals(regionDTO1.hashCode(), regionDTO2.hashCode());
        System.assertEquals(regionDTO3.hashCode(), regionDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRegionDTO regionDTO = new OASRegionDTO();
        System.assertEquals(new List<OASRegionDTO>(), regionDTO.children);
        System.assertEquals(null, regionDTO.id);
        System.assertEquals(null, regionDTO.name);
        System.assertEquals(null, regionDTO.type);
        System.assertEquals(null, regionDTO.parent);
    }
}
