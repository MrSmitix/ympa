@isTest
private class OASWarningPromoOfferUpdateDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO1 = OASWarningPromoOfferUpdateDTO.getExample();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO2 = warningPromoOfferUpdateDTO1;
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO3 = new OASWarningPromoOfferUpdateDTO();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO4 = warningPromoOfferUpdateDTO3;

        System.assert(warningPromoOfferUpdateDTO1.equals(warningPromoOfferUpdateDTO2));
        System.assert(warningPromoOfferUpdateDTO2.equals(warningPromoOfferUpdateDTO1));
        System.assert(warningPromoOfferUpdateDTO1.equals(warningPromoOfferUpdateDTO1));
        System.assert(warningPromoOfferUpdateDTO3.equals(warningPromoOfferUpdateDTO4));
        System.assert(warningPromoOfferUpdateDTO4.equals(warningPromoOfferUpdateDTO3));
        System.assert(warningPromoOfferUpdateDTO3.equals(warningPromoOfferUpdateDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO1 = OASWarningPromoOfferUpdateDTO.getExample();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO2 = OASWarningPromoOfferUpdateDTO.getExample();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO3 = new OASWarningPromoOfferUpdateDTO();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO4 = new OASWarningPromoOfferUpdateDTO();

        System.assert(warningPromoOfferUpdateDTO1.equals(warningPromoOfferUpdateDTO2));
        System.assert(warningPromoOfferUpdateDTO2.equals(warningPromoOfferUpdateDTO1));
        System.assert(warningPromoOfferUpdateDTO3.equals(warningPromoOfferUpdateDTO4));
        System.assert(warningPromoOfferUpdateDTO4.equals(warningPromoOfferUpdateDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO1 = OASWarningPromoOfferUpdateDTO.getExample();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO2 = new OASWarningPromoOfferUpdateDTO();

        System.assertEquals(false, warningPromoOfferUpdateDTO1.equals('foo'));
        System.assertEquals(false, warningPromoOfferUpdateDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO1 = OASWarningPromoOfferUpdateDTO.getExample();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO2 = new OASWarningPromoOfferUpdateDTO();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO3;

        System.assertEquals(false, warningPromoOfferUpdateDTO1.equals(warningPromoOfferUpdateDTO3));
        System.assertEquals(false, warningPromoOfferUpdateDTO2.equals(warningPromoOfferUpdateDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO1 = OASWarningPromoOfferUpdateDTO.getExample();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO2 = new OASWarningPromoOfferUpdateDTO();

        System.assertEquals(warningPromoOfferUpdateDTO1.hashCode(), warningPromoOfferUpdateDTO1.hashCode());
        System.assertEquals(warningPromoOfferUpdateDTO2.hashCode(), warningPromoOfferUpdateDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO1 = OASWarningPromoOfferUpdateDTO.getExample();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO2 = OASWarningPromoOfferUpdateDTO.getExample();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO3 = new OASWarningPromoOfferUpdateDTO();
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO4 = new OASWarningPromoOfferUpdateDTO();

        System.assert(warningPromoOfferUpdateDTO1.equals(warningPromoOfferUpdateDTO2));
        System.assert(warningPromoOfferUpdateDTO3.equals(warningPromoOfferUpdateDTO4));
        System.assertEquals(warningPromoOfferUpdateDTO1.hashCode(), warningPromoOfferUpdateDTO2.hashCode());
        System.assertEquals(warningPromoOfferUpdateDTO3.hashCode(), warningPromoOfferUpdateDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASWarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO = new OASWarningPromoOfferUpdateDTO();
        System.assertEquals(new List<OASPromoOfferUpdateWarningDTO>(), warningPromoOfferUpdateDTO.warnings);
        System.assertEquals(null, warningPromoOfferUpdateDTO.offerId);
    }
}
