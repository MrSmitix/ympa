@isTest
private class OASGetPromoBestsellerInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO1 = OASGetPromoBestsellerInfoDTO.getExample();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO2 = getPromoBestsellerInfoDTO1;
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO3 = new OASGetPromoBestsellerInfoDTO();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO4 = getPromoBestsellerInfoDTO3;

        System.assert(getPromoBestsellerInfoDTO1.equals(getPromoBestsellerInfoDTO2));
        System.assert(getPromoBestsellerInfoDTO2.equals(getPromoBestsellerInfoDTO1));
        System.assert(getPromoBestsellerInfoDTO1.equals(getPromoBestsellerInfoDTO1));
        System.assert(getPromoBestsellerInfoDTO3.equals(getPromoBestsellerInfoDTO4));
        System.assert(getPromoBestsellerInfoDTO4.equals(getPromoBestsellerInfoDTO3));
        System.assert(getPromoBestsellerInfoDTO3.equals(getPromoBestsellerInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO1 = OASGetPromoBestsellerInfoDTO.getExample();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO2 = OASGetPromoBestsellerInfoDTO.getExample();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO3 = new OASGetPromoBestsellerInfoDTO();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO4 = new OASGetPromoBestsellerInfoDTO();

        System.assert(getPromoBestsellerInfoDTO1.equals(getPromoBestsellerInfoDTO2));
        System.assert(getPromoBestsellerInfoDTO2.equals(getPromoBestsellerInfoDTO1));
        System.assert(getPromoBestsellerInfoDTO3.equals(getPromoBestsellerInfoDTO4));
        System.assert(getPromoBestsellerInfoDTO4.equals(getPromoBestsellerInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO1 = OASGetPromoBestsellerInfoDTO.getExample();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO2 = new OASGetPromoBestsellerInfoDTO();

        System.assertEquals(false, getPromoBestsellerInfoDTO1.equals('foo'));
        System.assertEquals(false, getPromoBestsellerInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO1 = OASGetPromoBestsellerInfoDTO.getExample();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO2 = new OASGetPromoBestsellerInfoDTO();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO3;

        System.assertEquals(false, getPromoBestsellerInfoDTO1.equals(getPromoBestsellerInfoDTO3));
        System.assertEquals(false, getPromoBestsellerInfoDTO2.equals(getPromoBestsellerInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO1 = OASGetPromoBestsellerInfoDTO.getExample();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO2 = new OASGetPromoBestsellerInfoDTO();

        System.assertEquals(getPromoBestsellerInfoDTO1.hashCode(), getPromoBestsellerInfoDTO1.hashCode());
        System.assertEquals(getPromoBestsellerInfoDTO2.hashCode(), getPromoBestsellerInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO1 = OASGetPromoBestsellerInfoDTO.getExample();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO2 = OASGetPromoBestsellerInfoDTO.getExample();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO3 = new OASGetPromoBestsellerInfoDTO();
        OASGetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO4 = new OASGetPromoBestsellerInfoDTO();

        System.assert(getPromoBestsellerInfoDTO1.equals(getPromoBestsellerInfoDTO2));
        System.assert(getPromoBestsellerInfoDTO3.equals(getPromoBestsellerInfoDTO4));
        System.assertEquals(getPromoBestsellerInfoDTO1.hashCode(), getPromoBestsellerInfoDTO2.hashCode());
        System.assertEquals(getPromoBestsellerInfoDTO3.hashCode(), getPromoBestsellerInfoDTO4.hashCode());
    }
}
