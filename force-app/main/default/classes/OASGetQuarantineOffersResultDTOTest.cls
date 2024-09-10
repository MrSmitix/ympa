@isTest
private class OASGetQuarantineOffersResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO1 = OASGetQuarantineOffersResultDTO.getExample();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO2 = getQuarantineOffersResultDTO1;
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO3 = new OASGetQuarantineOffersResultDTO();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO4 = getQuarantineOffersResultDTO3;

        System.assert(getQuarantineOffersResultDTO1.equals(getQuarantineOffersResultDTO2));
        System.assert(getQuarantineOffersResultDTO2.equals(getQuarantineOffersResultDTO1));
        System.assert(getQuarantineOffersResultDTO1.equals(getQuarantineOffersResultDTO1));
        System.assert(getQuarantineOffersResultDTO3.equals(getQuarantineOffersResultDTO4));
        System.assert(getQuarantineOffersResultDTO4.equals(getQuarantineOffersResultDTO3));
        System.assert(getQuarantineOffersResultDTO3.equals(getQuarantineOffersResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO1 = OASGetQuarantineOffersResultDTO.getExample();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO2 = OASGetQuarantineOffersResultDTO.getExample();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO3 = new OASGetQuarantineOffersResultDTO();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO4 = new OASGetQuarantineOffersResultDTO();

        System.assert(getQuarantineOffersResultDTO1.equals(getQuarantineOffersResultDTO2));
        System.assert(getQuarantineOffersResultDTO2.equals(getQuarantineOffersResultDTO1));
        System.assert(getQuarantineOffersResultDTO3.equals(getQuarantineOffersResultDTO4));
        System.assert(getQuarantineOffersResultDTO4.equals(getQuarantineOffersResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO1 = OASGetQuarantineOffersResultDTO.getExample();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO2 = new OASGetQuarantineOffersResultDTO();

        System.assertEquals(false, getQuarantineOffersResultDTO1.equals('foo'));
        System.assertEquals(false, getQuarantineOffersResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO1 = OASGetQuarantineOffersResultDTO.getExample();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO2 = new OASGetQuarantineOffersResultDTO();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO3;

        System.assertEquals(false, getQuarantineOffersResultDTO1.equals(getQuarantineOffersResultDTO3));
        System.assertEquals(false, getQuarantineOffersResultDTO2.equals(getQuarantineOffersResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO1 = OASGetQuarantineOffersResultDTO.getExample();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO2 = new OASGetQuarantineOffersResultDTO();

        System.assertEquals(getQuarantineOffersResultDTO1.hashCode(), getQuarantineOffersResultDTO1.hashCode());
        System.assertEquals(getQuarantineOffersResultDTO2.hashCode(), getQuarantineOffersResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO1 = OASGetQuarantineOffersResultDTO.getExample();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO2 = OASGetQuarantineOffersResultDTO.getExample();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO3 = new OASGetQuarantineOffersResultDTO();
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO4 = new OASGetQuarantineOffersResultDTO();

        System.assert(getQuarantineOffersResultDTO1.equals(getQuarantineOffersResultDTO2));
        System.assert(getQuarantineOffersResultDTO3.equals(getQuarantineOffersResultDTO4));
        System.assertEquals(getQuarantineOffersResultDTO1.hashCode(), getQuarantineOffersResultDTO2.hashCode());
        System.assertEquals(getQuarantineOffersResultDTO3.hashCode(), getQuarantineOffersResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetQuarantineOffersResultDTO getQuarantineOffersResultDTO = new OASGetQuarantineOffersResultDTO();
        System.assertEquals(new List<OASQuarantineOfferDTO>(), getQuarantineOffersResultDTO.offers);
        System.assertEquals(null, getQuarantineOffersResultDTO.paging);
    }
}
