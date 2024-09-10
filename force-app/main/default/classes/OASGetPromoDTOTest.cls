@isTest
private class OASGetPromoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPromoDTO getPromoDTO1 = OASGetPromoDTO.getExample();
        OASGetPromoDTO getPromoDTO2 = getPromoDTO1;
        OASGetPromoDTO getPromoDTO3 = new OASGetPromoDTO();
        OASGetPromoDTO getPromoDTO4 = getPromoDTO3;

        System.assert(getPromoDTO1.equals(getPromoDTO2));
        System.assert(getPromoDTO2.equals(getPromoDTO1));
        System.assert(getPromoDTO1.equals(getPromoDTO1));
        System.assert(getPromoDTO3.equals(getPromoDTO4));
        System.assert(getPromoDTO4.equals(getPromoDTO3));
        System.assert(getPromoDTO3.equals(getPromoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPromoDTO getPromoDTO1 = OASGetPromoDTO.getExample();
        OASGetPromoDTO getPromoDTO2 = OASGetPromoDTO.getExample();
        OASGetPromoDTO getPromoDTO3 = new OASGetPromoDTO();
        OASGetPromoDTO getPromoDTO4 = new OASGetPromoDTO();

        System.assert(getPromoDTO1.equals(getPromoDTO2));
        System.assert(getPromoDTO2.equals(getPromoDTO1));
        System.assert(getPromoDTO3.equals(getPromoDTO4));
        System.assert(getPromoDTO4.equals(getPromoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPromoDTO getPromoDTO1 = OASGetPromoDTO.getExample();
        OASGetPromoDTO getPromoDTO2 = new OASGetPromoDTO();

        System.assertEquals(false, getPromoDTO1.equals('foo'));
        System.assertEquals(false, getPromoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPromoDTO getPromoDTO1 = OASGetPromoDTO.getExample();
        OASGetPromoDTO getPromoDTO2 = new OASGetPromoDTO();
        OASGetPromoDTO getPromoDTO3;

        System.assertEquals(false, getPromoDTO1.equals(getPromoDTO3));
        System.assertEquals(false, getPromoDTO2.equals(getPromoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPromoDTO getPromoDTO1 = OASGetPromoDTO.getExample();
        OASGetPromoDTO getPromoDTO2 = new OASGetPromoDTO();

        System.assertEquals(getPromoDTO1.hashCode(), getPromoDTO1.hashCode());
        System.assertEquals(getPromoDTO2.hashCode(), getPromoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPromoDTO getPromoDTO1 = OASGetPromoDTO.getExample();
        OASGetPromoDTO getPromoDTO2 = OASGetPromoDTO.getExample();
        OASGetPromoDTO getPromoDTO3 = new OASGetPromoDTO();
        OASGetPromoDTO getPromoDTO4 = new OASGetPromoDTO();

        System.assert(getPromoDTO1.equals(getPromoDTO2));
        System.assert(getPromoDTO3.equals(getPromoDTO4));
        System.assertEquals(getPromoDTO1.hashCode(), getPromoDTO2.hashCode());
        System.assertEquals(getPromoDTO3.hashCode(), getPromoDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetPromoDTO getPromoDTO = new OASGetPromoDTO();
        System.assertEquals(new List<OASChannelType>(), getPromoDTO.channels);
        System.assertEquals(null, getPromoDTO.id);
        System.assertEquals(null, getPromoDTO.name);
        System.assertEquals(null, getPromoDTO.period);
        System.assertEquals(null, getPromoDTO.participating);
        System.assertEquals(null, getPromoDTO.assortmentInfo);
        System.assertEquals(null, getPromoDTO.mechanicsInfo);
        System.assertEquals(null, getPromoDTO.bestsellerInfo);
        System.assertEquals(null, getPromoDTO.constraints);
    }
}
