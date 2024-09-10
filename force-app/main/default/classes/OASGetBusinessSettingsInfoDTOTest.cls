@isTest
private class OASGetBusinessSettingsInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO1 = OASGetBusinessSettingsInfoDTO.getExample();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO2 = getBusinessSettingsInfoDTO1;
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO3 = new OASGetBusinessSettingsInfoDTO();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO4 = getBusinessSettingsInfoDTO3;

        System.assert(getBusinessSettingsInfoDTO1.equals(getBusinessSettingsInfoDTO2));
        System.assert(getBusinessSettingsInfoDTO2.equals(getBusinessSettingsInfoDTO1));
        System.assert(getBusinessSettingsInfoDTO1.equals(getBusinessSettingsInfoDTO1));
        System.assert(getBusinessSettingsInfoDTO3.equals(getBusinessSettingsInfoDTO4));
        System.assert(getBusinessSettingsInfoDTO4.equals(getBusinessSettingsInfoDTO3));
        System.assert(getBusinessSettingsInfoDTO3.equals(getBusinessSettingsInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO1 = OASGetBusinessSettingsInfoDTO.getExample();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO2 = OASGetBusinessSettingsInfoDTO.getExample();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO3 = new OASGetBusinessSettingsInfoDTO();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO4 = new OASGetBusinessSettingsInfoDTO();

        System.assert(getBusinessSettingsInfoDTO1.equals(getBusinessSettingsInfoDTO2));
        System.assert(getBusinessSettingsInfoDTO2.equals(getBusinessSettingsInfoDTO1));
        System.assert(getBusinessSettingsInfoDTO3.equals(getBusinessSettingsInfoDTO4));
        System.assert(getBusinessSettingsInfoDTO4.equals(getBusinessSettingsInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO1 = OASGetBusinessSettingsInfoDTO.getExample();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO2 = new OASGetBusinessSettingsInfoDTO();

        System.assertEquals(false, getBusinessSettingsInfoDTO1.equals('foo'));
        System.assertEquals(false, getBusinessSettingsInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO1 = OASGetBusinessSettingsInfoDTO.getExample();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO2 = new OASGetBusinessSettingsInfoDTO();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO3;

        System.assertEquals(false, getBusinessSettingsInfoDTO1.equals(getBusinessSettingsInfoDTO3));
        System.assertEquals(false, getBusinessSettingsInfoDTO2.equals(getBusinessSettingsInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO1 = OASGetBusinessSettingsInfoDTO.getExample();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO2 = new OASGetBusinessSettingsInfoDTO();

        System.assertEquals(getBusinessSettingsInfoDTO1.hashCode(), getBusinessSettingsInfoDTO1.hashCode());
        System.assertEquals(getBusinessSettingsInfoDTO2.hashCode(), getBusinessSettingsInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO1 = OASGetBusinessSettingsInfoDTO.getExample();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO2 = OASGetBusinessSettingsInfoDTO.getExample();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO3 = new OASGetBusinessSettingsInfoDTO();
        OASGetBusinessSettingsInfoDTO getBusinessSettingsInfoDTO4 = new OASGetBusinessSettingsInfoDTO();

        System.assert(getBusinessSettingsInfoDTO1.equals(getBusinessSettingsInfoDTO2));
        System.assert(getBusinessSettingsInfoDTO3.equals(getBusinessSettingsInfoDTO4));
        System.assertEquals(getBusinessSettingsInfoDTO1.hashCode(), getBusinessSettingsInfoDTO2.hashCode());
        System.assertEquals(getBusinessSettingsInfoDTO3.hashCode(), getBusinessSettingsInfoDTO4.hashCode());
    }
}
