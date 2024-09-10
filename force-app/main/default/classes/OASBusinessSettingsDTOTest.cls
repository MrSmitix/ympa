@isTest
private class OASBusinessSettingsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessSettingsDTO businessSettingsDTO1 = OASBusinessSettingsDTO.getExample();
        OASBusinessSettingsDTO businessSettingsDTO2 = businessSettingsDTO1;
        OASBusinessSettingsDTO businessSettingsDTO3 = new OASBusinessSettingsDTO();
        OASBusinessSettingsDTO businessSettingsDTO4 = businessSettingsDTO3;

        System.assert(businessSettingsDTO1.equals(businessSettingsDTO2));
        System.assert(businessSettingsDTO2.equals(businessSettingsDTO1));
        System.assert(businessSettingsDTO1.equals(businessSettingsDTO1));
        System.assert(businessSettingsDTO3.equals(businessSettingsDTO4));
        System.assert(businessSettingsDTO4.equals(businessSettingsDTO3));
        System.assert(businessSettingsDTO3.equals(businessSettingsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessSettingsDTO businessSettingsDTO1 = OASBusinessSettingsDTO.getExample();
        OASBusinessSettingsDTO businessSettingsDTO2 = OASBusinessSettingsDTO.getExample();
        OASBusinessSettingsDTO businessSettingsDTO3 = new OASBusinessSettingsDTO();
        OASBusinessSettingsDTO businessSettingsDTO4 = new OASBusinessSettingsDTO();

        System.assert(businessSettingsDTO1.equals(businessSettingsDTO2));
        System.assert(businessSettingsDTO2.equals(businessSettingsDTO1));
        System.assert(businessSettingsDTO3.equals(businessSettingsDTO4));
        System.assert(businessSettingsDTO4.equals(businessSettingsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessSettingsDTO businessSettingsDTO1 = OASBusinessSettingsDTO.getExample();
        OASBusinessSettingsDTO businessSettingsDTO2 = new OASBusinessSettingsDTO();

        System.assertEquals(false, businessSettingsDTO1.equals('foo'));
        System.assertEquals(false, businessSettingsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessSettingsDTO businessSettingsDTO1 = OASBusinessSettingsDTO.getExample();
        OASBusinessSettingsDTO businessSettingsDTO2 = new OASBusinessSettingsDTO();
        OASBusinessSettingsDTO businessSettingsDTO3;

        System.assertEquals(false, businessSettingsDTO1.equals(businessSettingsDTO3));
        System.assertEquals(false, businessSettingsDTO2.equals(businessSettingsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessSettingsDTO businessSettingsDTO1 = OASBusinessSettingsDTO.getExample();
        OASBusinessSettingsDTO businessSettingsDTO2 = new OASBusinessSettingsDTO();

        System.assertEquals(businessSettingsDTO1.hashCode(), businessSettingsDTO1.hashCode());
        System.assertEquals(businessSettingsDTO2.hashCode(), businessSettingsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessSettingsDTO businessSettingsDTO1 = OASBusinessSettingsDTO.getExample();
        OASBusinessSettingsDTO businessSettingsDTO2 = OASBusinessSettingsDTO.getExample();
        OASBusinessSettingsDTO businessSettingsDTO3 = new OASBusinessSettingsDTO();
        OASBusinessSettingsDTO businessSettingsDTO4 = new OASBusinessSettingsDTO();

        System.assert(businessSettingsDTO1.equals(businessSettingsDTO2));
        System.assert(businessSettingsDTO3.equals(businessSettingsDTO4));
        System.assertEquals(businessSettingsDTO1.hashCode(), businessSettingsDTO2.hashCode());
        System.assertEquals(businessSettingsDTO3.hashCode(), businessSettingsDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBusinessSettingsDTO businessSettingsDTO = new OASBusinessSettingsDTO();
        Map<String, String> x-property-mappings = businessSettingsDTO.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }
}
