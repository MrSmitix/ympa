@isTest
private class OASCalculateTariffsResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO1 = OASCalculateTariffsResponseDTO.getExample();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO2 = calculateTariffsResponseDTO1;
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO3 = new OASCalculateTariffsResponseDTO();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO4 = calculateTariffsResponseDTO3;

        System.assert(calculateTariffsResponseDTO1.equals(calculateTariffsResponseDTO2));
        System.assert(calculateTariffsResponseDTO2.equals(calculateTariffsResponseDTO1));
        System.assert(calculateTariffsResponseDTO1.equals(calculateTariffsResponseDTO1));
        System.assert(calculateTariffsResponseDTO3.equals(calculateTariffsResponseDTO4));
        System.assert(calculateTariffsResponseDTO4.equals(calculateTariffsResponseDTO3));
        System.assert(calculateTariffsResponseDTO3.equals(calculateTariffsResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO1 = OASCalculateTariffsResponseDTO.getExample();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO2 = OASCalculateTariffsResponseDTO.getExample();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO3 = new OASCalculateTariffsResponseDTO();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO4 = new OASCalculateTariffsResponseDTO();

        System.assert(calculateTariffsResponseDTO1.equals(calculateTariffsResponseDTO2));
        System.assert(calculateTariffsResponseDTO2.equals(calculateTariffsResponseDTO1));
        System.assert(calculateTariffsResponseDTO3.equals(calculateTariffsResponseDTO4));
        System.assert(calculateTariffsResponseDTO4.equals(calculateTariffsResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO1 = OASCalculateTariffsResponseDTO.getExample();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO2 = new OASCalculateTariffsResponseDTO();

        System.assertEquals(false, calculateTariffsResponseDTO1.equals('foo'));
        System.assertEquals(false, calculateTariffsResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO1 = OASCalculateTariffsResponseDTO.getExample();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO2 = new OASCalculateTariffsResponseDTO();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO3;

        System.assertEquals(false, calculateTariffsResponseDTO1.equals(calculateTariffsResponseDTO3));
        System.assertEquals(false, calculateTariffsResponseDTO2.equals(calculateTariffsResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO1 = OASCalculateTariffsResponseDTO.getExample();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO2 = new OASCalculateTariffsResponseDTO();

        System.assertEquals(calculateTariffsResponseDTO1.hashCode(), calculateTariffsResponseDTO1.hashCode());
        System.assertEquals(calculateTariffsResponseDTO2.hashCode(), calculateTariffsResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO1 = OASCalculateTariffsResponseDTO.getExample();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO2 = OASCalculateTariffsResponseDTO.getExample();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO3 = new OASCalculateTariffsResponseDTO();
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO4 = new OASCalculateTariffsResponseDTO();

        System.assert(calculateTariffsResponseDTO1.equals(calculateTariffsResponseDTO2));
        System.assert(calculateTariffsResponseDTO3.equals(calculateTariffsResponseDTO4));
        System.assertEquals(calculateTariffsResponseDTO1.hashCode(), calculateTariffsResponseDTO2.hashCode());
        System.assertEquals(calculateTariffsResponseDTO3.hashCode(), calculateTariffsResponseDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCalculateTariffsResponseDTO calculateTariffsResponseDTO = new OASCalculateTariffsResponseDTO();
        System.assertEquals(new List<OASCalculateTariffsOfferInfoDTO>(), calculateTariffsResponseDTO.offers);
    }
}
