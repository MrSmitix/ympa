@isTest
private class OASCalculateTariffsOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO1 = OASCalculateTariffsOfferDTO.getExample();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO2 = calculateTariffsOfferDTO1;
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO3 = new OASCalculateTariffsOfferDTO();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO4 = calculateTariffsOfferDTO3;

        System.assert(calculateTariffsOfferDTO1.equals(calculateTariffsOfferDTO2));
        System.assert(calculateTariffsOfferDTO2.equals(calculateTariffsOfferDTO1));
        System.assert(calculateTariffsOfferDTO1.equals(calculateTariffsOfferDTO1));
        System.assert(calculateTariffsOfferDTO3.equals(calculateTariffsOfferDTO4));
        System.assert(calculateTariffsOfferDTO4.equals(calculateTariffsOfferDTO3));
        System.assert(calculateTariffsOfferDTO3.equals(calculateTariffsOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO1 = OASCalculateTariffsOfferDTO.getExample();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO2 = OASCalculateTariffsOfferDTO.getExample();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO3 = new OASCalculateTariffsOfferDTO();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO4 = new OASCalculateTariffsOfferDTO();

        System.assert(calculateTariffsOfferDTO1.equals(calculateTariffsOfferDTO2));
        System.assert(calculateTariffsOfferDTO2.equals(calculateTariffsOfferDTO1));
        System.assert(calculateTariffsOfferDTO3.equals(calculateTariffsOfferDTO4));
        System.assert(calculateTariffsOfferDTO4.equals(calculateTariffsOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO1 = OASCalculateTariffsOfferDTO.getExample();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO2 = new OASCalculateTariffsOfferDTO();

        System.assertEquals(false, calculateTariffsOfferDTO1.equals('foo'));
        System.assertEquals(false, calculateTariffsOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO1 = OASCalculateTariffsOfferDTO.getExample();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO2 = new OASCalculateTariffsOfferDTO();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO3;

        System.assertEquals(false, calculateTariffsOfferDTO1.equals(calculateTariffsOfferDTO3));
        System.assertEquals(false, calculateTariffsOfferDTO2.equals(calculateTariffsOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO1 = OASCalculateTariffsOfferDTO.getExample();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO2 = new OASCalculateTariffsOfferDTO();

        System.assertEquals(calculateTariffsOfferDTO1.hashCode(), calculateTariffsOfferDTO1.hashCode());
        System.assertEquals(calculateTariffsOfferDTO2.hashCode(), calculateTariffsOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO1 = OASCalculateTariffsOfferDTO.getExample();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO2 = OASCalculateTariffsOfferDTO.getExample();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO3 = new OASCalculateTariffsOfferDTO();
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO4 = new OASCalculateTariffsOfferDTO();

        System.assert(calculateTariffsOfferDTO1.equals(calculateTariffsOfferDTO2));
        System.assert(calculateTariffsOfferDTO3.equals(calculateTariffsOfferDTO4));
        System.assertEquals(calculateTariffsOfferDTO1.hashCode(), calculateTariffsOfferDTO2.hashCode());
        System.assertEquals(calculateTariffsOfferDTO3.hashCode(), calculateTariffsOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCalculateTariffsOfferDTO calculateTariffsOfferDTO = new OASCalculateTariffsOfferDTO();
        System.assertEquals(1, calculateTariffsOfferDTO.quantity);
        System.assertEquals(null, calculateTariffsOfferDTO.categoryId);
        System.assertEquals(null, calculateTariffsOfferDTO.price);
        System.assertEquals(null, calculateTariffsOfferDTO.length);
        System.assertEquals(null, calculateTariffsOfferDTO.width);
        System.assertEquals(null, calculateTariffsOfferDTO.height);
        System.assertEquals(null, calculateTariffsOfferDTO.weight);
    }
}
