@isTest
private class OASCalculateTariffsOfferInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO1 = OASCalculateTariffsOfferInfoDTO.getExample();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO2 = calculateTariffsOfferInfoDTO1;
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO3 = new OASCalculateTariffsOfferInfoDTO();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO4 = calculateTariffsOfferInfoDTO3;

        System.assert(calculateTariffsOfferInfoDTO1.equals(calculateTariffsOfferInfoDTO2));
        System.assert(calculateTariffsOfferInfoDTO2.equals(calculateTariffsOfferInfoDTO1));
        System.assert(calculateTariffsOfferInfoDTO1.equals(calculateTariffsOfferInfoDTO1));
        System.assert(calculateTariffsOfferInfoDTO3.equals(calculateTariffsOfferInfoDTO4));
        System.assert(calculateTariffsOfferInfoDTO4.equals(calculateTariffsOfferInfoDTO3));
        System.assert(calculateTariffsOfferInfoDTO3.equals(calculateTariffsOfferInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO1 = OASCalculateTariffsOfferInfoDTO.getExample();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO2 = OASCalculateTariffsOfferInfoDTO.getExample();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO3 = new OASCalculateTariffsOfferInfoDTO();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO4 = new OASCalculateTariffsOfferInfoDTO();

        System.assert(calculateTariffsOfferInfoDTO1.equals(calculateTariffsOfferInfoDTO2));
        System.assert(calculateTariffsOfferInfoDTO2.equals(calculateTariffsOfferInfoDTO1));
        System.assert(calculateTariffsOfferInfoDTO3.equals(calculateTariffsOfferInfoDTO4));
        System.assert(calculateTariffsOfferInfoDTO4.equals(calculateTariffsOfferInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO1 = OASCalculateTariffsOfferInfoDTO.getExample();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO2 = new OASCalculateTariffsOfferInfoDTO();

        System.assertEquals(false, calculateTariffsOfferInfoDTO1.equals('foo'));
        System.assertEquals(false, calculateTariffsOfferInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO1 = OASCalculateTariffsOfferInfoDTO.getExample();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO2 = new OASCalculateTariffsOfferInfoDTO();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO3;

        System.assertEquals(false, calculateTariffsOfferInfoDTO1.equals(calculateTariffsOfferInfoDTO3));
        System.assertEquals(false, calculateTariffsOfferInfoDTO2.equals(calculateTariffsOfferInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO1 = OASCalculateTariffsOfferInfoDTO.getExample();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO2 = new OASCalculateTariffsOfferInfoDTO();

        System.assertEquals(calculateTariffsOfferInfoDTO1.hashCode(), calculateTariffsOfferInfoDTO1.hashCode());
        System.assertEquals(calculateTariffsOfferInfoDTO2.hashCode(), calculateTariffsOfferInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO1 = OASCalculateTariffsOfferInfoDTO.getExample();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO2 = OASCalculateTariffsOfferInfoDTO.getExample();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO3 = new OASCalculateTariffsOfferInfoDTO();
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO4 = new OASCalculateTariffsOfferInfoDTO();

        System.assert(calculateTariffsOfferInfoDTO1.equals(calculateTariffsOfferInfoDTO2));
        System.assert(calculateTariffsOfferInfoDTO3.equals(calculateTariffsOfferInfoDTO4));
        System.assertEquals(calculateTariffsOfferInfoDTO1.hashCode(), calculateTariffsOfferInfoDTO2.hashCode());
        System.assertEquals(calculateTariffsOfferInfoDTO3.hashCode(), calculateTariffsOfferInfoDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCalculateTariffsOfferInfoDTO calculateTariffsOfferInfoDTO = new OASCalculateTariffsOfferInfoDTO();
        System.assertEquals(new List<OASCalculatedTariffDTO>(), calculateTariffsOfferInfoDTO.tariffs);
        System.assertEquals(null, calculateTariffsOfferInfoDTO.offer);
    }
}
