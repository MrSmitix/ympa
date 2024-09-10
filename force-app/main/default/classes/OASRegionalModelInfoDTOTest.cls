@isTest
private class OASRegionalModelInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASRegionalModelInfoDTO regionalModelInfoDTO1 = OASRegionalModelInfoDTO.getExample();
        OASRegionalModelInfoDTO regionalModelInfoDTO2 = regionalModelInfoDTO1;
        OASRegionalModelInfoDTO regionalModelInfoDTO3 = new OASRegionalModelInfoDTO();
        OASRegionalModelInfoDTO regionalModelInfoDTO4 = regionalModelInfoDTO3;

        System.assert(regionalModelInfoDTO1.equals(regionalModelInfoDTO2));
        System.assert(regionalModelInfoDTO2.equals(regionalModelInfoDTO1));
        System.assert(regionalModelInfoDTO1.equals(regionalModelInfoDTO1));
        System.assert(regionalModelInfoDTO3.equals(regionalModelInfoDTO4));
        System.assert(regionalModelInfoDTO4.equals(regionalModelInfoDTO3));
        System.assert(regionalModelInfoDTO3.equals(regionalModelInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRegionalModelInfoDTO regionalModelInfoDTO1 = OASRegionalModelInfoDTO.getExample();
        OASRegionalModelInfoDTO regionalModelInfoDTO2 = OASRegionalModelInfoDTO.getExample();
        OASRegionalModelInfoDTO regionalModelInfoDTO3 = new OASRegionalModelInfoDTO();
        OASRegionalModelInfoDTO regionalModelInfoDTO4 = new OASRegionalModelInfoDTO();

        System.assert(regionalModelInfoDTO1.equals(regionalModelInfoDTO2));
        System.assert(regionalModelInfoDTO2.equals(regionalModelInfoDTO1));
        System.assert(regionalModelInfoDTO3.equals(regionalModelInfoDTO4));
        System.assert(regionalModelInfoDTO4.equals(regionalModelInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRegionalModelInfoDTO regionalModelInfoDTO1 = OASRegionalModelInfoDTO.getExample();
        OASRegionalModelInfoDTO regionalModelInfoDTO2 = new OASRegionalModelInfoDTO();

        System.assertEquals(false, regionalModelInfoDTO1.equals('foo'));
        System.assertEquals(false, regionalModelInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRegionalModelInfoDTO regionalModelInfoDTO1 = OASRegionalModelInfoDTO.getExample();
        OASRegionalModelInfoDTO regionalModelInfoDTO2 = new OASRegionalModelInfoDTO();
        OASRegionalModelInfoDTO regionalModelInfoDTO3;

        System.assertEquals(false, regionalModelInfoDTO1.equals(regionalModelInfoDTO3));
        System.assertEquals(false, regionalModelInfoDTO2.equals(regionalModelInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRegionalModelInfoDTO regionalModelInfoDTO1 = OASRegionalModelInfoDTO.getExample();
        OASRegionalModelInfoDTO regionalModelInfoDTO2 = new OASRegionalModelInfoDTO();

        System.assertEquals(regionalModelInfoDTO1.hashCode(), regionalModelInfoDTO1.hashCode());
        System.assertEquals(regionalModelInfoDTO2.hashCode(), regionalModelInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRegionalModelInfoDTO regionalModelInfoDTO1 = OASRegionalModelInfoDTO.getExample();
        OASRegionalModelInfoDTO regionalModelInfoDTO2 = OASRegionalModelInfoDTO.getExample();
        OASRegionalModelInfoDTO regionalModelInfoDTO3 = new OASRegionalModelInfoDTO();
        OASRegionalModelInfoDTO regionalModelInfoDTO4 = new OASRegionalModelInfoDTO();

        System.assert(regionalModelInfoDTO1.equals(regionalModelInfoDTO2));
        System.assert(regionalModelInfoDTO3.equals(regionalModelInfoDTO4));
        System.assertEquals(regionalModelInfoDTO1.hashCode(), regionalModelInfoDTO2.hashCode());
        System.assertEquals(regionalModelInfoDTO3.hashCode(), regionalModelInfoDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRegionalModelInfoDTO regionalModelInfoDTO = new OASRegionalModelInfoDTO();
        Map<String, String> x-property-mappings = regionalModelInfoDTO.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }
}
