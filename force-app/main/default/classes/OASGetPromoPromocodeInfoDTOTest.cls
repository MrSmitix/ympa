@isTest
private class OASGetPromoPromocodeInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO1 = OASGetPromoPromocodeInfoDTO.getExample();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO2 = getPromoPromocodeInfoDTO1;
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO3 = new OASGetPromoPromocodeInfoDTO();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO4 = getPromoPromocodeInfoDTO3;

        System.assert(getPromoPromocodeInfoDTO1.equals(getPromoPromocodeInfoDTO2));
        System.assert(getPromoPromocodeInfoDTO2.equals(getPromoPromocodeInfoDTO1));
        System.assert(getPromoPromocodeInfoDTO1.equals(getPromoPromocodeInfoDTO1));
        System.assert(getPromoPromocodeInfoDTO3.equals(getPromoPromocodeInfoDTO4));
        System.assert(getPromoPromocodeInfoDTO4.equals(getPromoPromocodeInfoDTO3));
        System.assert(getPromoPromocodeInfoDTO3.equals(getPromoPromocodeInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO1 = OASGetPromoPromocodeInfoDTO.getExample();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO2 = OASGetPromoPromocodeInfoDTO.getExample();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO3 = new OASGetPromoPromocodeInfoDTO();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO4 = new OASGetPromoPromocodeInfoDTO();

        System.assert(getPromoPromocodeInfoDTO1.equals(getPromoPromocodeInfoDTO2));
        System.assert(getPromoPromocodeInfoDTO2.equals(getPromoPromocodeInfoDTO1));
        System.assert(getPromoPromocodeInfoDTO3.equals(getPromoPromocodeInfoDTO4));
        System.assert(getPromoPromocodeInfoDTO4.equals(getPromoPromocodeInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO1 = OASGetPromoPromocodeInfoDTO.getExample();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO2 = new OASGetPromoPromocodeInfoDTO();

        System.assertEquals(false, getPromoPromocodeInfoDTO1.equals('foo'));
        System.assertEquals(false, getPromoPromocodeInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO1 = OASGetPromoPromocodeInfoDTO.getExample();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO2 = new OASGetPromoPromocodeInfoDTO();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO3;

        System.assertEquals(false, getPromoPromocodeInfoDTO1.equals(getPromoPromocodeInfoDTO3));
        System.assertEquals(false, getPromoPromocodeInfoDTO2.equals(getPromoPromocodeInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO1 = OASGetPromoPromocodeInfoDTO.getExample();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO2 = new OASGetPromoPromocodeInfoDTO();

        System.assertEquals(getPromoPromocodeInfoDTO1.hashCode(), getPromoPromocodeInfoDTO1.hashCode());
        System.assertEquals(getPromoPromocodeInfoDTO2.hashCode(), getPromoPromocodeInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO1 = OASGetPromoPromocodeInfoDTO.getExample();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO2 = OASGetPromoPromocodeInfoDTO.getExample();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO3 = new OASGetPromoPromocodeInfoDTO();
        OASGetPromoPromocodeInfoDTO getPromoPromocodeInfoDTO4 = new OASGetPromoPromocodeInfoDTO();

        System.assert(getPromoPromocodeInfoDTO1.equals(getPromoPromocodeInfoDTO2));
        System.assert(getPromoPromocodeInfoDTO3.equals(getPromoPromocodeInfoDTO4));
        System.assertEquals(getPromoPromocodeInfoDTO1.hashCode(), getPromoPromocodeInfoDTO2.hashCode());
        System.assertEquals(getPromoPromocodeInfoDTO3.hashCode(), getPromoPromocodeInfoDTO4.hashCode());
    }
}
