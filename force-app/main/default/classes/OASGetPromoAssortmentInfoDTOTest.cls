@isTest
private class OASGetPromoAssortmentInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO1 = OASGetPromoAssortmentInfoDTO.getExample();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO2 = getPromoAssortmentInfoDTO1;
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO3 = new OASGetPromoAssortmentInfoDTO();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO4 = getPromoAssortmentInfoDTO3;

        System.assert(getPromoAssortmentInfoDTO1.equals(getPromoAssortmentInfoDTO2));
        System.assert(getPromoAssortmentInfoDTO2.equals(getPromoAssortmentInfoDTO1));
        System.assert(getPromoAssortmentInfoDTO1.equals(getPromoAssortmentInfoDTO1));
        System.assert(getPromoAssortmentInfoDTO3.equals(getPromoAssortmentInfoDTO4));
        System.assert(getPromoAssortmentInfoDTO4.equals(getPromoAssortmentInfoDTO3));
        System.assert(getPromoAssortmentInfoDTO3.equals(getPromoAssortmentInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO1 = OASGetPromoAssortmentInfoDTO.getExample();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO2 = OASGetPromoAssortmentInfoDTO.getExample();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO3 = new OASGetPromoAssortmentInfoDTO();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO4 = new OASGetPromoAssortmentInfoDTO();

        System.assert(getPromoAssortmentInfoDTO1.equals(getPromoAssortmentInfoDTO2));
        System.assert(getPromoAssortmentInfoDTO2.equals(getPromoAssortmentInfoDTO1));
        System.assert(getPromoAssortmentInfoDTO3.equals(getPromoAssortmentInfoDTO4));
        System.assert(getPromoAssortmentInfoDTO4.equals(getPromoAssortmentInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO1 = OASGetPromoAssortmentInfoDTO.getExample();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO2 = new OASGetPromoAssortmentInfoDTO();

        System.assertEquals(false, getPromoAssortmentInfoDTO1.equals('foo'));
        System.assertEquals(false, getPromoAssortmentInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO1 = OASGetPromoAssortmentInfoDTO.getExample();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO2 = new OASGetPromoAssortmentInfoDTO();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO3;

        System.assertEquals(false, getPromoAssortmentInfoDTO1.equals(getPromoAssortmentInfoDTO3));
        System.assertEquals(false, getPromoAssortmentInfoDTO2.equals(getPromoAssortmentInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO1 = OASGetPromoAssortmentInfoDTO.getExample();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO2 = new OASGetPromoAssortmentInfoDTO();

        System.assertEquals(getPromoAssortmentInfoDTO1.hashCode(), getPromoAssortmentInfoDTO1.hashCode());
        System.assertEquals(getPromoAssortmentInfoDTO2.hashCode(), getPromoAssortmentInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO1 = OASGetPromoAssortmentInfoDTO.getExample();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO2 = OASGetPromoAssortmentInfoDTO.getExample();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO3 = new OASGetPromoAssortmentInfoDTO();
        OASGetPromoAssortmentInfoDTO getPromoAssortmentInfoDTO4 = new OASGetPromoAssortmentInfoDTO();

        System.assert(getPromoAssortmentInfoDTO1.equals(getPromoAssortmentInfoDTO2));
        System.assert(getPromoAssortmentInfoDTO3.equals(getPromoAssortmentInfoDTO4));
        System.assertEquals(getPromoAssortmentInfoDTO1.hashCode(), getPromoAssortmentInfoDTO2.hashCode());
        System.assertEquals(getPromoAssortmentInfoDTO3.hashCode(), getPromoAssortmentInfoDTO4.hashCode());
    }
}
