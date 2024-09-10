@isTest
private class OASDeleteCampaignOffersDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO1 = OASDeleteCampaignOffersDTO.getExample();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO2 = deleteCampaignOffersDTO1;
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO3 = new OASDeleteCampaignOffersDTO();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO4 = deleteCampaignOffersDTO3;

        System.assert(deleteCampaignOffersDTO1.equals(deleteCampaignOffersDTO2));
        System.assert(deleteCampaignOffersDTO2.equals(deleteCampaignOffersDTO1));
        System.assert(deleteCampaignOffersDTO1.equals(deleteCampaignOffersDTO1));
        System.assert(deleteCampaignOffersDTO3.equals(deleteCampaignOffersDTO4));
        System.assert(deleteCampaignOffersDTO4.equals(deleteCampaignOffersDTO3));
        System.assert(deleteCampaignOffersDTO3.equals(deleteCampaignOffersDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO1 = OASDeleteCampaignOffersDTO.getExample();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO2 = OASDeleteCampaignOffersDTO.getExample();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO3 = new OASDeleteCampaignOffersDTO();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO4 = new OASDeleteCampaignOffersDTO();

        System.assert(deleteCampaignOffersDTO1.equals(deleteCampaignOffersDTO2));
        System.assert(deleteCampaignOffersDTO2.equals(deleteCampaignOffersDTO1));
        System.assert(deleteCampaignOffersDTO3.equals(deleteCampaignOffersDTO4));
        System.assert(deleteCampaignOffersDTO4.equals(deleteCampaignOffersDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO1 = OASDeleteCampaignOffersDTO.getExample();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO2 = new OASDeleteCampaignOffersDTO();

        System.assertEquals(false, deleteCampaignOffersDTO1.equals('foo'));
        System.assertEquals(false, deleteCampaignOffersDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO1 = OASDeleteCampaignOffersDTO.getExample();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO2 = new OASDeleteCampaignOffersDTO();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO3;

        System.assertEquals(false, deleteCampaignOffersDTO1.equals(deleteCampaignOffersDTO3));
        System.assertEquals(false, deleteCampaignOffersDTO2.equals(deleteCampaignOffersDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO1 = OASDeleteCampaignOffersDTO.getExample();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO2 = new OASDeleteCampaignOffersDTO();

        System.assertEquals(deleteCampaignOffersDTO1.hashCode(), deleteCampaignOffersDTO1.hashCode());
        System.assertEquals(deleteCampaignOffersDTO2.hashCode(), deleteCampaignOffersDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO1 = OASDeleteCampaignOffersDTO.getExample();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO2 = OASDeleteCampaignOffersDTO.getExample();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO3 = new OASDeleteCampaignOffersDTO();
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO4 = new OASDeleteCampaignOffersDTO();

        System.assert(deleteCampaignOffersDTO1.equals(deleteCampaignOffersDTO2));
        System.assert(deleteCampaignOffersDTO3.equals(deleteCampaignOffersDTO4));
        System.assertEquals(deleteCampaignOffersDTO1.hashCode(), deleteCampaignOffersDTO2.hashCode());
        System.assertEquals(deleteCampaignOffersDTO3.hashCode(), deleteCampaignOffersDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteCampaignOffersDTO deleteCampaignOffersDTO = new OASDeleteCampaignOffersDTO();
        System.assertEquals(new List<String>(), deleteCampaignOffersDTO.notDeletedOfferIds);
    }
}
