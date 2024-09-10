@isTest
private class OASPromoOfferAutoParticipatingDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO1 = OASPromoOfferAutoParticipatingDetail.getExample();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO2 = promoOfferAutoParticipatingDetailsDTO1;
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO3 = new OASPromoOfferAutoParticipatingDetail();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO4 = promoOfferAutoParticipatingDetailsDTO3;

        System.assert(promoOfferAutoParticipatingDetailsDTO1.equals(promoOfferAutoParticipatingDetailsDTO2));
        System.assert(promoOfferAutoParticipatingDetailsDTO2.equals(promoOfferAutoParticipatingDetailsDTO1));
        System.assert(promoOfferAutoParticipatingDetailsDTO1.equals(promoOfferAutoParticipatingDetailsDTO1));
        System.assert(promoOfferAutoParticipatingDetailsDTO3.equals(promoOfferAutoParticipatingDetailsDTO4));
        System.assert(promoOfferAutoParticipatingDetailsDTO4.equals(promoOfferAutoParticipatingDetailsDTO3));
        System.assert(promoOfferAutoParticipatingDetailsDTO3.equals(promoOfferAutoParticipatingDetailsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO1 = OASPromoOfferAutoParticipatingDetail.getExample();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO2 = OASPromoOfferAutoParticipatingDetail.getExample();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO3 = new OASPromoOfferAutoParticipatingDetail();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO4 = new OASPromoOfferAutoParticipatingDetail();

        System.assert(promoOfferAutoParticipatingDetailsDTO1.equals(promoOfferAutoParticipatingDetailsDTO2));
        System.assert(promoOfferAutoParticipatingDetailsDTO2.equals(promoOfferAutoParticipatingDetailsDTO1));
        System.assert(promoOfferAutoParticipatingDetailsDTO3.equals(promoOfferAutoParticipatingDetailsDTO4));
        System.assert(promoOfferAutoParticipatingDetailsDTO4.equals(promoOfferAutoParticipatingDetailsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO1 = OASPromoOfferAutoParticipatingDetail.getExample();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO2 = new OASPromoOfferAutoParticipatingDetail();

        System.assertEquals(false, promoOfferAutoParticipatingDetailsDTO1.equals('foo'));
        System.assertEquals(false, promoOfferAutoParticipatingDetailsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO1 = OASPromoOfferAutoParticipatingDetail.getExample();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO2 = new OASPromoOfferAutoParticipatingDetail();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO3;

        System.assertEquals(false, promoOfferAutoParticipatingDetailsDTO1.equals(promoOfferAutoParticipatingDetailsDTO3));
        System.assertEquals(false, promoOfferAutoParticipatingDetailsDTO2.equals(promoOfferAutoParticipatingDetailsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO1 = OASPromoOfferAutoParticipatingDetail.getExample();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO2 = new OASPromoOfferAutoParticipatingDetail();

        System.assertEquals(promoOfferAutoParticipatingDetailsDTO1.hashCode(), promoOfferAutoParticipatingDetailsDTO1.hashCode());
        System.assertEquals(promoOfferAutoParticipatingDetailsDTO2.hashCode(), promoOfferAutoParticipatingDetailsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO1 = OASPromoOfferAutoParticipatingDetail.getExample();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO2 = OASPromoOfferAutoParticipatingDetail.getExample();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO3 = new OASPromoOfferAutoParticipatingDetail();
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO4 = new OASPromoOfferAutoParticipatingDetail();

        System.assert(promoOfferAutoParticipatingDetailsDTO1.equals(promoOfferAutoParticipatingDetailsDTO2));
        System.assert(promoOfferAutoParticipatingDetailsDTO3.equals(promoOfferAutoParticipatingDetailsDTO4));
        System.assertEquals(promoOfferAutoParticipatingDetailsDTO1.hashCode(), promoOfferAutoParticipatingDetailsDTO2.hashCode());
        System.assertEquals(promoOfferAutoParticipatingDetailsDTO3.hashCode(), promoOfferAutoParticipatingDetailsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPromoOfferAutoParticipatingDetail promoOfferAutoParticipatingDetailsDTO = new OASPromoOfferAutoParticipatingDetail();
        System.assertEquals(new List<Long>(), promoOfferAutoParticipatingDetailsDTO.campaignIds);
    }
}
