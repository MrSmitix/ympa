@isTest
private class OASUpdatePromoOffersResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO1 = OASUpdatePromoOffersResultDTO.getExample();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO2 = updatePromoOffersResultDTO1;
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO3 = new OASUpdatePromoOffersResultDTO();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO4 = updatePromoOffersResultDTO3;

        System.assert(updatePromoOffersResultDTO1.equals(updatePromoOffersResultDTO2));
        System.assert(updatePromoOffersResultDTO2.equals(updatePromoOffersResultDTO1));
        System.assert(updatePromoOffersResultDTO1.equals(updatePromoOffersResultDTO1));
        System.assert(updatePromoOffersResultDTO3.equals(updatePromoOffersResultDTO4));
        System.assert(updatePromoOffersResultDTO4.equals(updatePromoOffersResultDTO3));
        System.assert(updatePromoOffersResultDTO3.equals(updatePromoOffersResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO1 = OASUpdatePromoOffersResultDTO.getExample();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO2 = OASUpdatePromoOffersResultDTO.getExample();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO3 = new OASUpdatePromoOffersResultDTO();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO4 = new OASUpdatePromoOffersResultDTO();

        System.assert(updatePromoOffersResultDTO1.equals(updatePromoOffersResultDTO2));
        System.assert(updatePromoOffersResultDTO2.equals(updatePromoOffersResultDTO1));
        System.assert(updatePromoOffersResultDTO3.equals(updatePromoOffersResultDTO4));
        System.assert(updatePromoOffersResultDTO4.equals(updatePromoOffersResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO1 = OASUpdatePromoOffersResultDTO.getExample();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO2 = new OASUpdatePromoOffersResultDTO();

        System.assertEquals(false, updatePromoOffersResultDTO1.equals('foo'));
        System.assertEquals(false, updatePromoOffersResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO1 = OASUpdatePromoOffersResultDTO.getExample();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO2 = new OASUpdatePromoOffersResultDTO();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO3;

        System.assertEquals(false, updatePromoOffersResultDTO1.equals(updatePromoOffersResultDTO3));
        System.assertEquals(false, updatePromoOffersResultDTO2.equals(updatePromoOffersResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO1 = OASUpdatePromoOffersResultDTO.getExample();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO2 = new OASUpdatePromoOffersResultDTO();

        System.assertEquals(updatePromoOffersResultDTO1.hashCode(), updatePromoOffersResultDTO1.hashCode());
        System.assertEquals(updatePromoOffersResultDTO2.hashCode(), updatePromoOffersResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO1 = OASUpdatePromoOffersResultDTO.getExample();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO2 = OASUpdatePromoOffersResultDTO.getExample();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO3 = new OASUpdatePromoOffersResultDTO();
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO4 = new OASUpdatePromoOffersResultDTO();

        System.assert(updatePromoOffersResultDTO1.equals(updatePromoOffersResultDTO2));
        System.assert(updatePromoOffersResultDTO3.equals(updatePromoOffersResultDTO4));
        System.assertEquals(updatePromoOffersResultDTO1.hashCode(), updatePromoOffersResultDTO2.hashCode());
        System.assertEquals(updatePromoOffersResultDTO3.hashCode(), updatePromoOffersResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdatePromoOffersResultDTO updatePromoOffersResultDTO = new OASUpdatePromoOffersResultDTO();
        System.assertEquals(new List<OASRejectedPromoOfferUpdateDTO>(), updatePromoOffersResultDTO.rejectedOffers);
        System.assertEquals(new List<OASWarningPromoOfferUpdateDTO>(), updatePromoOffersResultDTO.warningOffers);
    }
}
