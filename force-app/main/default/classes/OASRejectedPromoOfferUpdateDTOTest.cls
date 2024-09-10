@isTest
private class OASRejectedPromoOfferUpdateDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO1 = OASRejectedPromoOfferUpdateDTO.getExample();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO2 = rejectedPromoOfferUpdateDTO1;
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO3 = new OASRejectedPromoOfferUpdateDTO();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO4 = rejectedPromoOfferUpdateDTO3;

        System.assert(rejectedPromoOfferUpdateDTO1.equals(rejectedPromoOfferUpdateDTO2));
        System.assert(rejectedPromoOfferUpdateDTO2.equals(rejectedPromoOfferUpdateDTO1));
        System.assert(rejectedPromoOfferUpdateDTO1.equals(rejectedPromoOfferUpdateDTO1));
        System.assert(rejectedPromoOfferUpdateDTO3.equals(rejectedPromoOfferUpdateDTO4));
        System.assert(rejectedPromoOfferUpdateDTO4.equals(rejectedPromoOfferUpdateDTO3));
        System.assert(rejectedPromoOfferUpdateDTO3.equals(rejectedPromoOfferUpdateDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO1 = OASRejectedPromoOfferUpdateDTO.getExample();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO2 = OASRejectedPromoOfferUpdateDTO.getExample();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO3 = new OASRejectedPromoOfferUpdateDTO();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO4 = new OASRejectedPromoOfferUpdateDTO();

        System.assert(rejectedPromoOfferUpdateDTO1.equals(rejectedPromoOfferUpdateDTO2));
        System.assert(rejectedPromoOfferUpdateDTO2.equals(rejectedPromoOfferUpdateDTO1));
        System.assert(rejectedPromoOfferUpdateDTO3.equals(rejectedPromoOfferUpdateDTO4));
        System.assert(rejectedPromoOfferUpdateDTO4.equals(rejectedPromoOfferUpdateDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO1 = OASRejectedPromoOfferUpdateDTO.getExample();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO2 = new OASRejectedPromoOfferUpdateDTO();

        System.assertEquals(false, rejectedPromoOfferUpdateDTO1.equals('foo'));
        System.assertEquals(false, rejectedPromoOfferUpdateDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO1 = OASRejectedPromoOfferUpdateDTO.getExample();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO2 = new OASRejectedPromoOfferUpdateDTO();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO3;

        System.assertEquals(false, rejectedPromoOfferUpdateDTO1.equals(rejectedPromoOfferUpdateDTO3));
        System.assertEquals(false, rejectedPromoOfferUpdateDTO2.equals(rejectedPromoOfferUpdateDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO1 = OASRejectedPromoOfferUpdateDTO.getExample();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO2 = new OASRejectedPromoOfferUpdateDTO();

        System.assertEquals(rejectedPromoOfferUpdateDTO1.hashCode(), rejectedPromoOfferUpdateDTO1.hashCode());
        System.assertEquals(rejectedPromoOfferUpdateDTO2.hashCode(), rejectedPromoOfferUpdateDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO1 = OASRejectedPromoOfferUpdateDTO.getExample();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO2 = OASRejectedPromoOfferUpdateDTO.getExample();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO3 = new OASRejectedPromoOfferUpdateDTO();
        OASRejectedPromoOfferUpdateDTO rejectedPromoOfferUpdateDTO4 = new OASRejectedPromoOfferUpdateDTO();

        System.assert(rejectedPromoOfferUpdateDTO1.equals(rejectedPromoOfferUpdateDTO2));
        System.assert(rejectedPromoOfferUpdateDTO3.equals(rejectedPromoOfferUpdateDTO4));
        System.assertEquals(rejectedPromoOfferUpdateDTO1.hashCode(), rejectedPromoOfferUpdateDTO2.hashCode());
        System.assertEquals(rejectedPromoOfferUpdateDTO3.hashCode(), rejectedPromoOfferUpdateDTO4.hashCode());
    }
}
