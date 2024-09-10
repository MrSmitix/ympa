@isTest
private class OASRejectedPromoOfferDeleteDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO1 = OASRejectedPromoOfferDeleteDTO.getExample();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO2 = rejectedPromoOfferDeleteDTO1;
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO3 = new OASRejectedPromoOfferDeleteDTO();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO4 = rejectedPromoOfferDeleteDTO3;

        System.assert(rejectedPromoOfferDeleteDTO1.equals(rejectedPromoOfferDeleteDTO2));
        System.assert(rejectedPromoOfferDeleteDTO2.equals(rejectedPromoOfferDeleteDTO1));
        System.assert(rejectedPromoOfferDeleteDTO1.equals(rejectedPromoOfferDeleteDTO1));
        System.assert(rejectedPromoOfferDeleteDTO3.equals(rejectedPromoOfferDeleteDTO4));
        System.assert(rejectedPromoOfferDeleteDTO4.equals(rejectedPromoOfferDeleteDTO3));
        System.assert(rejectedPromoOfferDeleteDTO3.equals(rejectedPromoOfferDeleteDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO1 = OASRejectedPromoOfferDeleteDTO.getExample();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO2 = OASRejectedPromoOfferDeleteDTO.getExample();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO3 = new OASRejectedPromoOfferDeleteDTO();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO4 = new OASRejectedPromoOfferDeleteDTO();

        System.assert(rejectedPromoOfferDeleteDTO1.equals(rejectedPromoOfferDeleteDTO2));
        System.assert(rejectedPromoOfferDeleteDTO2.equals(rejectedPromoOfferDeleteDTO1));
        System.assert(rejectedPromoOfferDeleteDTO3.equals(rejectedPromoOfferDeleteDTO4));
        System.assert(rejectedPromoOfferDeleteDTO4.equals(rejectedPromoOfferDeleteDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO1 = OASRejectedPromoOfferDeleteDTO.getExample();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO2 = new OASRejectedPromoOfferDeleteDTO();

        System.assertEquals(false, rejectedPromoOfferDeleteDTO1.equals('foo'));
        System.assertEquals(false, rejectedPromoOfferDeleteDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO1 = OASRejectedPromoOfferDeleteDTO.getExample();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO2 = new OASRejectedPromoOfferDeleteDTO();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO3;

        System.assertEquals(false, rejectedPromoOfferDeleteDTO1.equals(rejectedPromoOfferDeleteDTO3));
        System.assertEquals(false, rejectedPromoOfferDeleteDTO2.equals(rejectedPromoOfferDeleteDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO1 = OASRejectedPromoOfferDeleteDTO.getExample();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO2 = new OASRejectedPromoOfferDeleteDTO();

        System.assertEquals(rejectedPromoOfferDeleteDTO1.hashCode(), rejectedPromoOfferDeleteDTO1.hashCode());
        System.assertEquals(rejectedPromoOfferDeleteDTO2.hashCode(), rejectedPromoOfferDeleteDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO1 = OASRejectedPromoOfferDeleteDTO.getExample();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO2 = OASRejectedPromoOfferDeleteDTO.getExample();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO3 = new OASRejectedPromoOfferDeleteDTO();
        OASRejectedPromoOfferDeleteDTO rejectedPromoOfferDeleteDTO4 = new OASRejectedPromoOfferDeleteDTO();

        System.assert(rejectedPromoOfferDeleteDTO1.equals(rejectedPromoOfferDeleteDTO2));
        System.assert(rejectedPromoOfferDeleteDTO3.equals(rejectedPromoOfferDeleteDTO4));
        System.assertEquals(rejectedPromoOfferDeleteDTO1.hashCode(), rejectedPromoOfferDeleteDTO2.hashCode());
        System.assertEquals(rejectedPromoOfferDeleteDTO3.hashCode(), rejectedPromoOfferDeleteDTO4.hashCode());
    }
}
