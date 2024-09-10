@isTest
private class OASPromoOfferUpdateWarningDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO1 = OASPromoOfferUpdateWarningDTO.getExample();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO2 = promoOfferUpdateWarningDTO1;
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO3 = new OASPromoOfferUpdateWarningDTO();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO4 = promoOfferUpdateWarningDTO3;

        System.assert(promoOfferUpdateWarningDTO1.equals(promoOfferUpdateWarningDTO2));
        System.assert(promoOfferUpdateWarningDTO2.equals(promoOfferUpdateWarningDTO1));
        System.assert(promoOfferUpdateWarningDTO1.equals(promoOfferUpdateWarningDTO1));
        System.assert(promoOfferUpdateWarningDTO3.equals(promoOfferUpdateWarningDTO4));
        System.assert(promoOfferUpdateWarningDTO4.equals(promoOfferUpdateWarningDTO3));
        System.assert(promoOfferUpdateWarningDTO3.equals(promoOfferUpdateWarningDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO1 = OASPromoOfferUpdateWarningDTO.getExample();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO2 = OASPromoOfferUpdateWarningDTO.getExample();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO3 = new OASPromoOfferUpdateWarningDTO();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO4 = new OASPromoOfferUpdateWarningDTO();

        System.assert(promoOfferUpdateWarningDTO1.equals(promoOfferUpdateWarningDTO2));
        System.assert(promoOfferUpdateWarningDTO2.equals(promoOfferUpdateWarningDTO1));
        System.assert(promoOfferUpdateWarningDTO3.equals(promoOfferUpdateWarningDTO4));
        System.assert(promoOfferUpdateWarningDTO4.equals(promoOfferUpdateWarningDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO1 = OASPromoOfferUpdateWarningDTO.getExample();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO2 = new OASPromoOfferUpdateWarningDTO();

        System.assertEquals(false, promoOfferUpdateWarningDTO1.equals('foo'));
        System.assertEquals(false, promoOfferUpdateWarningDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO1 = OASPromoOfferUpdateWarningDTO.getExample();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO2 = new OASPromoOfferUpdateWarningDTO();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO3;

        System.assertEquals(false, promoOfferUpdateWarningDTO1.equals(promoOfferUpdateWarningDTO3));
        System.assertEquals(false, promoOfferUpdateWarningDTO2.equals(promoOfferUpdateWarningDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO1 = OASPromoOfferUpdateWarningDTO.getExample();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO2 = new OASPromoOfferUpdateWarningDTO();

        System.assertEquals(promoOfferUpdateWarningDTO1.hashCode(), promoOfferUpdateWarningDTO1.hashCode());
        System.assertEquals(promoOfferUpdateWarningDTO2.hashCode(), promoOfferUpdateWarningDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO1 = OASPromoOfferUpdateWarningDTO.getExample();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO2 = OASPromoOfferUpdateWarningDTO.getExample();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO3 = new OASPromoOfferUpdateWarningDTO();
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO4 = new OASPromoOfferUpdateWarningDTO();

        System.assert(promoOfferUpdateWarningDTO1.equals(promoOfferUpdateWarningDTO2));
        System.assert(promoOfferUpdateWarningDTO3.equals(promoOfferUpdateWarningDTO4));
        System.assertEquals(promoOfferUpdateWarningDTO1.hashCode(), promoOfferUpdateWarningDTO2.hashCode());
        System.assertEquals(promoOfferUpdateWarningDTO3.hashCode(), promoOfferUpdateWarningDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPromoOfferUpdateWarningDTO promoOfferUpdateWarningDTO = new OASPromoOfferUpdateWarningDTO();
        System.assertEquals(new List<Long>(), promoOfferUpdateWarningDTO.campaignIds);
        System.assertEquals(null, promoOfferUpdateWarningDTO.code);
    }
}
