@isTest
private class OASGetPromosResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromosResultDTO getPromosResultDTO1 = OASGetPromosResultDTO.getExample();
        OASGetPromosResultDTO getPromosResultDTO2 = getPromosResultDTO1;
        OASGetPromosResultDTO getPromosResultDTO3 = new OASGetPromosResultDTO();
        OASGetPromosResultDTO getPromosResultDTO4 = getPromosResultDTO3;

        System.assert(getPromosResultDTO1.equals(getPromosResultDTO2));
        System.assert(getPromosResultDTO2.equals(getPromosResultDTO1));
        System.assert(getPromosResultDTO1.equals(getPromosResultDTO1));
        System.assert(getPromosResultDTO3.equals(getPromosResultDTO4));
        System.assert(getPromosResultDTO4.equals(getPromosResultDTO3));
        System.assert(getPromosResultDTO3.equals(getPromosResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromosResultDTO getPromosResultDTO1 = OASGetPromosResultDTO.getExample();
        OASGetPromosResultDTO getPromosResultDTO2 = OASGetPromosResultDTO.getExample();
        OASGetPromosResultDTO getPromosResultDTO3 = new OASGetPromosResultDTO();
        OASGetPromosResultDTO getPromosResultDTO4 = new OASGetPromosResultDTO();

        System.assert(getPromosResultDTO1.equals(getPromosResultDTO2));
        System.assert(getPromosResultDTO2.equals(getPromosResultDTO1));
        System.assert(getPromosResultDTO3.equals(getPromosResultDTO4));
        System.assert(getPromosResultDTO4.equals(getPromosResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromosResultDTO getPromosResultDTO1 = OASGetPromosResultDTO.getExample();
        OASGetPromosResultDTO getPromosResultDTO2 = new OASGetPromosResultDTO();

        System.assertEquals(false, getPromosResultDTO1.equals('foo'));
        System.assertEquals(false, getPromosResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromosResultDTO getPromosResultDTO1 = OASGetPromosResultDTO.getExample();
        OASGetPromosResultDTO getPromosResultDTO2 = new OASGetPromosResultDTO();
        OASGetPromosResultDTO getPromosResultDTO3;

        System.assertEquals(false, getPromosResultDTO1.equals(getPromosResultDTO3));
        System.assertEquals(false, getPromosResultDTO2.equals(getPromosResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromosResultDTO getPromosResultDTO1 = OASGetPromosResultDTO.getExample();
        OASGetPromosResultDTO getPromosResultDTO2 = new OASGetPromosResultDTO();

        System.assertEquals(getPromosResultDTO1.hashCode(), getPromosResultDTO1.hashCode());
        System.assertEquals(getPromosResultDTO2.hashCode(), getPromosResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromosResultDTO getPromosResultDTO1 = OASGetPromosResultDTO.getExample();
        OASGetPromosResultDTO getPromosResultDTO2 = OASGetPromosResultDTO.getExample();
        OASGetPromosResultDTO getPromosResultDTO3 = new OASGetPromosResultDTO();
        OASGetPromosResultDTO getPromosResultDTO4 = new OASGetPromosResultDTO();

        System.assert(getPromosResultDTO1.equals(getPromosResultDTO2));
        System.assert(getPromosResultDTO3.equals(getPromosResultDTO4));
        System.assertEquals(getPromosResultDTO1.hashCode(), getPromosResultDTO2.hashCode());
        System.assertEquals(getPromosResultDTO3.hashCode(), getPromosResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetPromosResultDTO getPromosResultDTO = new OASGetPromosResultDTO();
        System.assertEquals(new List<OASGetPromoDTO>(), getPromosResultDTO.promos);
    }
}
