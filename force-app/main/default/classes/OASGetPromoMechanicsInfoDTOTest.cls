@isTest
private class OASGetPromoMechanicsInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO1 = OASGetPromoMechanicsInfoDTO.getExample();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO2 = getPromoMechanicsInfoDTO1;
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO3 = new OASGetPromoMechanicsInfoDTO();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO4 = getPromoMechanicsInfoDTO3;

        System.assert(getPromoMechanicsInfoDTO1.equals(getPromoMechanicsInfoDTO2));
        System.assert(getPromoMechanicsInfoDTO2.equals(getPromoMechanicsInfoDTO1));
        System.assert(getPromoMechanicsInfoDTO1.equals(getPromoMechanicsInfoDTO1));
        System.assert(getPromoMechanicsInfoDTO3.equals(getPromoMechanicsInfoDTO4));
        System.assert(getPromoMechanicsInfoDTO4.equals(getPromoMechanicsInfoDTO3));
        System.assert(getPromoMechanicsInfoDTO3.equals(getPromoMechanicsInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO1 = OASGetPromoMechanicsInfoDTO.getExample();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO2 = OASGetPromoMechanicsInfoDTO.getExample();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO3 = new OASGetPromoMechanicsInfoDTO();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO4 = new OASGetPromoMechanicsInfoDTO();

        System.assert(getPromoMechanicsInfoDTO1.equals(getPromoMechanicsInfoDTO2));
        System.assert(getPromoMechanicsInfoDTO2.equals(getPromoMechanicsInfoDTO1));
        System.assert(getPromoMechanicsInfoDTO3.equals(getPromoMechanicsInfoDTO4));
        System.assert(getPromoMechanicsInfoDTO4.equals(getPromoMechanicsInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO1 = OASGetPromoMechanicsInfoDTO.getExample();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO2 = new OASGetPromoMechanicsInfoDTO();

        System.assertEquals(false, getPromoMechanicsInfoDTO1.equals('foo'));
        System.assertEquals(false, getPromoMechanicsInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO1 = OASGetPromoMechanicsInfoDTO.getExample();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO2 = new OASGetPromoMechanicsInfoDTO();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO3;

        System.assertEquals(false, getPromoMechanicsInfoDTO1.equals(getPromoMechanicsInfoDTO3));
        System.assertEquals(false, getPromoMechanicsInfoDTO2.equals(getPromoMechanicsInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO1 = OASGetPromoMechanicsInfoDTO.getExample();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO2 = new OASGetPromoMechanicsInfoDTO();

        System.assertEquals(getPromoMechanicsInfoDTO1.hashCode(), getPromoMechanicsInfoDTO1.hashCode());
        System.assertEquals(getPromoMechanicsInfoDTO2.hashCode(), getPromoMechanicsInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO1 = OASGetPromoMechanicsInfoDTO.getExample();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO2 = OASGetPromoMechanicsInfoDTO.getExample();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO3 = new OASGetPromoMechanicsInfoDTO();
        OASGetPromoMechanicsInfoDTO getPromoMechanicsInfoDTO4 = new OASGetPromoMechanicsInfoDTO();

        System.assert(getPromoMechanicsInfoDTO1.equals(getPromoMechanicsInfoDTO2));
        System.assert(getPromoMechanicsInfoDTO3.equals(getPromoMechanicsInfoDTO4));
        System.assertEquals(getPromoMechanicsInfoDTO1.hashCode(), getPromoMechanicsInfoDTO2.hashCode());
        System.assertEquals(getPromoMechanicsInfoDTO3.hashCode(), getPromoMechanicsInfoDTO4.hashCode());
    }
}
