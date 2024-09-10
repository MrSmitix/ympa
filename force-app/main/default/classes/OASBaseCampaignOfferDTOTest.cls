@isTest
private class OASBaseCampaignOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBaseCampaignOfferDTO baseCampaignOfferDTO1 = OASBaseCampaignOfferDTO.getExample();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO2 = baseCampaignOfferDTO1;
        OASBaseCampaignOfferDTO baseCampaignOfferDTO3 = new OASBaseCampaignOfferDTO();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO4 = baseCampaignOfferDTO3;

        System.assert(baseCampaignOfferDTO1.equals(baseCampaignOfferDTO2));
        System.assert(baseCampaignOfferDTO2.equals(baseCampaignOfferDTO1));
        System.assert(baseCampaignOfferDTO1.equals(baseCampaignOfferDTO1));
        System.assert(baseCampaignOfferDTO3.equals(baseCampaignOfferDTO4));
        System.assert(baseCampaignOfferDTO4.equals(baseCampaignOfferDTO3));
        System.assert(baseCampaignOfferDTO3.equals(baseCampaignOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBaseCampaignOfferDTO baseCampaignOfferDTO1 = OASBaseCampaignOfferDTO.getExample();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO2 = OASBaseCampaignOfferDTO.getExample();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO3 = new OASBaseCampaignOfferDTO();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO4 = new OASBaseCampaignOfferDTO();

        System.assert(baseCampaignOfferDTO1.equals(baseCampaignOfferDTO2));
        System.assert(baseCampaignOfferDTO2.equals(baseCampaignOfferDTO1));
        System.assert(baseCampaignOfferDTO3.equals(baseCampaignOfferDTO4));
        System.assert(baseCampaignOfferDTO4.equals(baseCampaignOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBaseCampaignOfferDTO baseCampaignOfferDTO1 = OASBaseCampaignOfferDTO.getExample();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO2 = new OASBaseCampaignOfferDTO();

        System.assertEquals(false, baseCampaignOfferDTO1.equals('foo'));
        System.assertEquals(false, baseCampaignOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBaseCampaignOfferDTO baseCampaignOfferDTO1 = OASBaseCampaignOfferDTO.getExample();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO2 = new OASBaseCampaignOfferDTO();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO3;

        System.assertEquals(false, baseCampaignOfferDTO1.equals(baseCampaignOfferDTO3));
        System.assertEquals(false, baseCampaignOfferDTO2.equals(baseCampaignOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBaseCampaignOfferDTO baseCampaignOfferDTO1 = OASBaseCampaignOfferDTO.getExample();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO2 = new OASBaseCampaignOfferDTO();

        System.assertEquals(baseCampaignOfferDTO1.hashCode(), baseCampaignOfferDTO1.hashCode());
        System.assertEquals(baseCampaignOfferDTO2.hashCode(), baseCampaignOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBaseCampaignOfferDTO baseCampaignOfferDTO1 = OASBaseCampaignOfferDTO.getExample();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO2 = OASBaseCampaignOfferDTO.getExample();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO3 = new OASBaseCampaignOfferDTO();
        OASBaseCampaignOfferDTO baseCampaignOfferDTO4 = new OASBaseCampaignOfferDTO();

        System.assert(baseCampaignOfferDTO1.equals(baseCampaignOfferDTO2));
        System.assert(baseCampaignOfferDTO3.equals(baseCampaignOfferDTO4));
        System.assertEquals(baseCampaignOfferDTO1.hashCode(), baseCampaignOfferDTO2.hashCode());
        System.assertEquals(baseCampaignOfferDTO3.hashCode(), baseCampaignOfferDTO4.hashCode());
    }
}
