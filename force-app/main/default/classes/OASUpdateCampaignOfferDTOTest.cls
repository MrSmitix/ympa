@isTest
private class OASUpdateCampaignOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO1 = OASUpdateCampaignOfferDTO.getExample();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO2 = updateCampaignOfferDTO1;
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO3 = new OASUpdateCampaignOfferDTO();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO4 = updateCampaignOfferDTO3;

        System.assert(updateCampaignOfferDTO1.equals(updateCampaignOfferDTO2));
        System.assert(updateCampaignOfferDTO2.equals(updateCampaignOfferDTO1));
        System.assert(updateCampaignOfferDTO1.equals(updateCampaignOfferDTO1));
        System.assert(updateCampaignOfferDTO3.equals(updateCampaignOfferDTO4));
        System.assert(updateCampaignOfferDTO4.equals(updateCampaignOfferDTO3));
        System.assert(updateCampaignOfferDTO3.equals(updateCampaignOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO1 = OASUpdateCampaignOfferDTO.getExample();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO2 = OASUpdateCampaignOfferDTO.getExample();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO3 = new OASUpdateCampaignOfferDTO();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO4 = new OASUpdateCampaignOfferDTO();

        System.assert(updateCampaignOfferDTO1.equals(updateCampaignOfferDTO2));
        System.assert(updateCampaignOfferDTO2.equals(updateCampaignOfferDTO1));
        System.assert(updateCampaignOfferDTO3.equals(updateCampaignOfferDTO4));
        System.assert(updateCampaignOfferDTO4.equals(updateCampaignOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO1 = OASUpdateCampaignOfferDTO.getExample();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO2 = new OASUpdateCampaignOfferDTO();

        System.assertEquals(false, updateCampaignOfferDTO1.equals('foo'));
        System.assertEquals(false, updateCampaignOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO1 = OASUpdateCampaignOfferDTO.getExample();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO2 = new OASUpdateCampaignOfferDTO();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO3;

        System.assertEquals(false, updateCampaignOfferDTO1.equals(updateCampaignOfferDTO3));
        System.assertEquals(false, updateCampaignOfferDTO2.equals(updateCampaignOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO1 = OASUpdateCampaignOfferDTO.getExample();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO2 = new OASUpdateCampaignOfferDTO();

        System.assertEquals(updateCampaignOfferDTO1.hashCode(), updateCampaignOfferDTO1.hashCode());
        System.assertEquals(updateCampaignOfferDTO2.hashCode(), updateCampaignOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO1 = OASUpdateCampaignOfferDTO.getExample();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO2 = OASUpdateCampaignOfferDTO.getExample();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO3 = new OASUpdateCampaignOfferDTO();
        OASUpdateCampaignOfferDTO updateCampaignOfferDTO4 = new OASUpdateCampaignOfferDTO();

        System.assert(updateCampaignOfferDTO1.equals(updateCampaignOfferDTO2));
        System.assert(updateCampaignOfferDTO3.equals(updateCampaignOfferDTO4));
        System.assertEquals(updateCampaignOfferDTO1.hashCode(), updateCampaignOfferDTO2.hashCode());
        System.assertEquals(updateCampaignOfferDTO3.hashCode(), updateCampaignOfferDTO4.hashCode());
    }
}
