@isTest
private class OASDeletePromoOffersResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO1 = OASDeletePromoOffersResultDTO.getExample();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO2 = deletePromoOffersResultDTO1;
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO3 = new OASDeletePromoOffersResultDTO();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO4 = deletePromoOffersResultDTO3;

        System.assert(deletePromoOffersResultDTO1.equals(deletePromoOffersResultDTO2));
        System.assert(deletePromoOffersResultDTO2.equals(deletePromoOffersResultDTO1));
        System.assert(deletePromoOffersResultDTO1.equals(deletePromoOffersResultDTO1));
        System.assert(deletePromoOffersResultDTO3.equals(deletePromoOffersResultDTO4));
        System.assert(deletePromoOffersResultDTO4.equals(deletePromoOffersResultDTO3));
        System.assert(deletePromoOffersResultDTO3.equals(deletePromoOffersResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO1 = OASDeletePromoOffersResultDTO.getExample();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO2 = OASDeletePromoOffersResultDTO.getExample();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO3 = new OASDeletePromoOffersResultDTO();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO4 = new OASDeletePromoOffersResultDTO();

        System.assert(deletePromoOffersResultDTO1.equals(deletePromoOffersResultDTO2));
        System.assert(deletePromoOffersResultDTO2.equals(deletePromoOffersResultDTO1));
        System.assert(deletePromoOffersResultDTO3.equals(deletePromoOffersResultDTO4));
        System.assert(deletePromoOffersResultDTO4.equals(deletePromoOffersResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO1 = OASDeletePromoOffersResultDTO.getExample();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO2 = new OASDeletePromoOffersResultDTO();

        System.assertEquals(false, deletePromoOffersResultDTO1.equals('foo'));
        System.assertEquals(false, deletePromoOffersResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO1 = OASDeletePromoOffersResultDTO.getExample();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO2 = new OASDeletePromoOffersResultDTO();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO3;

        System.assertEquals(false, deletePromoOffersResultDTO1.equals(deletePromoOffersResultDTO3));
        System.assertEquals(false, deletePromoOffersResultDTO2.equals(deletePromoOffersResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO1 = OASDeletePromoOffersResultDTO.getExample();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO2 = new OASDeletePromoOffersResultDTO();

        System.assertEquals(deletePromoOffersResultDTO1.hashCode(), deletePromoOffersResultDTO1.hashCode());
        System.assertEquals(deletePromoOffersResultDTO2.hashCode(), deletePromoOffersResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO1 = OASDeletePromoOffersResultDTO.getExample();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO2 = OASDeletePromoOffersResultDTO.getExample();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO3 = new OASDeletePromoOffersResultDTO();
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO4 = new OASDeletePromoOffersResultDTO();

        System.assert(deletePromoOffersResultDTO1.equals(deletePromoOffersResultDTO2));
        System.assert(deletePromoOffersResultDTO3.equals(deletePromoOffersResultDTO4));
        System.assertEquals(deletePromoOffersResultDTO1.hashCode(), deletePromoOffersResultDTO2.hashCode());
        System.assertEquals(deletePromoOffersResultDTO3.hashCode(), deletePromoOffersResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletePromoOffersResultDTO deletePromoOffersResultDTO = new OASDeletePromoOffersResultDTO();
        System.assertEquals(new List<OASRejectedPromoOfferDeleteDTO>(), deletePromoOffersResultDTO.rejectedOffers);
    }
}
