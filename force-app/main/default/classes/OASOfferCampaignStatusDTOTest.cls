@isTest
private class OASOfferCampaignStatusDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferCampaignStatusDTO offerCampaignStatusDTO1 = OASOfferCampaignStatusDTO.getExample();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO2 = offerCampaignStatusDTO1;
        OASOfferCampaignStatusDTO offerCampaignStatusDTO3 = new OASOfferCampaignStatusDTO();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO4 = offerCampaignStatusDTO3;

        System.assert(offerCampaignStatusDTO1.equals(offerCampaignStatusDTO2));
        System.assert(offerCampaignStatusDTO2.equals(offerCampaignStatusDTO1));
        System.assert(offerCampaignStatusDTO1.equals(offerCampaignStatusDTO1));
        System.assert(offerCampaignStatusDTO3.equals(offerCampaignStatusDTO4));
        System.assert(offerCampaignStatusDTO4.equals(offerCampaignStatusDTO3));
        System.assert(offerCampaignStatusDTO3.equals(offerCampaignStatusDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferCampaignStatusDTO offerCampaignStatusDTO1 = OASOfferCampaignStatusDTO.getExample();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO2 = OASOfferCampaignStatusDTO.getExample();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO3 = new OASOfferCampaignStatusDTO();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO4 = new OASOfferCampaignStatusDTO();

        System.assert(offerCampaignStatusDTO1.equals(offerCampaignStatusDTO2));
        System.assert(offerCampaignStatusDTO2.equals(offerCampaignStatusDTO1));
        System.assert(offerCampaignStatusDTO3.equals(offerCampaignStatusDTO4));
        System.assert(offerCampaignStatusDTO4.equals(offerCampaignStatusDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferCampaignStatusDTO offerCampaignStatusDTO1 = OASOfferCampaignStatusDTO.getExample();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO2 = new OASOfferCampaignStatusDTO();

        System.assertEquals(false, offerCampaignStatusDTO1.equals('foo'));
        System.assertEquals(false, offerCampaignStatusDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferCampaignStatusDTO offerCampaignStatusDTO1 = OASOfferCampaignStatusDTO.getExample();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO2 = new OASOfferCampaignStatusDTO();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO3;

        System.assertEquals(false, offerCampaignStatusDTO1.equals(offerCampaignStatusDTO3));
        System.assertEquals(false, offerCampaignStatusDTO2.equals(offerCampaignStatusDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferCampaignStatusDTO offerCampaignStatusDTO1 = OASOfferCampaignStatusDTO.getExample();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO2 = new OASOfferCampaignStatusDTO();

        System.assertEquals(offerCampaignStatusDTO1.hashCode(), offerCampaignStatusDTO1.hashCode());
        System.assertEquals(offerCampaignStatusDTO2.hashCode(), offerCampaignStatusDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferCampaignStatusDTO offerCampaignStatusDTO1 = OASOfferCampaignStatusDTO.getExample();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO2 = OASOfferCampaignStatusDTO.getExample();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO3 = new OASOfferCampaignStatusDTO();
        OASOfferCampaignStatusDTO offerCampaignStatusDTO4 = new OASOfferCampaignStatusDTO();

        System.assert(offerCampaignStatusDTO1.equals(offerCampaignStatusDTO2));
        System.assert(offerCampaignStatusDTO3.equals(offerCampaignStatusDTO4));
        System.assertEquals(offerCampaignStatusDTO1.hashCode(), offerCampaignStatusDTO2.hashCode());
        System.assertEquals(offerCampaignStatusDTO3.hashCode(), offerCampaignStatusDTO4.hashCode());
    }
}
