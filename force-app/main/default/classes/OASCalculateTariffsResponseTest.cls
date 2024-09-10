@isTest
private class OASCalculateTariffsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCalculateTariffsResponse calculateTariffsResponse1 = OASCalculateTariffsResponse.getExample();
        OASCalculateTariffsResponse calculateTariffsResponse2 = calculateTariffsResponse1;
        OASCalculateTariffsResponse calculateTariffsResponse3 = new OASCalculateTariffsResponse();
        OASCalculateTariffsResponse calculateTariffsResponse4 = calculateTariffsResponse3;

        System.assert(calculateTariffsResponse1.equals(calculateTariffsResponse2));
        System.assert(calculateTariffsResponse2.equals(calculateTariffsResponse1));
        System.assert(calculateTariffsResponse1.equals(calculateTariffsResponse1));
        System.assert(calculateTariffsResponse3.equals(calculateTariffsResponse4));
        System.assert(calculateTariffsResponse4.equals(calculateTariffsResponse3));
        System.assert(calculateTariffsResponse3.equals(calculateTariffsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCalculateTariffsResponse calculateTariffsResponse1 = OASCalculateTariffsResponse.getExample();
        OASCalculateTariffsResponse calculateTariffsResponse2 = OASCalculateTariffsResponse.getExample();
        OASCalculateTariffsResponse calculateTariffsResponse3 = new OASCalculateTariffsResponse();
        OASCalculateTariffsResponse calculateTariffsResponse4 = new OASCalculateTariffsResponse();

        System.assert(calculateTariffsResponse1.equals(calculateTariffsResponse2));
        System.assert(calculateTariffsResponse2.equals(calculateTariffsResponse1));
        System.assert(calculateTariffsResponse3.equals(calculateTariffsResponse4));
        System.assert(calculateTariffsResponse4.equals(calculateTariffsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCalculateTariffsResponse calculateTariffsResponse1 = OASCalculateTariffsResponse.getExample();
        OASCalculateTariffsResponse calculateTariffsResponse2 = new OASCalculateTariffsResponse();

        System.assertEquals(false, calculateTariffsResponse1.equals('foo'));
        System.assertEquals(false, calculateTariffsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCalculateTariffsResponse calculateTariffsResponse1 = OASCalculateTariffsResponse.getExample();
        OASCalculateTariffsResponse calculateTariffsResponse2 = new OASCalculateTariffsResponse();
        OASCalculateTariffsResponse calculateTariffsResponse3;

        System.assertEquals(false, calculateTariffsResponse1.equals(calculateTariffsResponse3));
        System.assertEquals(false, calculateTariffsResponse2.equals(calculateTariffsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCalculateTariffsResponse calculateTariffsResponse1 = OASCalculateTariffsResponse.getExample();
        OASCalculateTariffsResponse calculateTariffsResponse2 = new OASCalculateTariffsResponse();

        System.assertEquals(calculateTariffsResponse1.hashCode(), calculateTariffsResponse1.hashCode());
        System.assertEquals(calculateTariffsResponse2.hashCode(), calculateTariffsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCalculateTariffsResponse calculateTariffsResponse1 = OASCalculateTariffsResponse.getExample();
        OASCalculateTariffsResponse calculateTariffsResponse2 = OASCalculateTariffsResponse.getExample();
        OASCalculateTariffsResponse calculateTariffsResponse3 = new OASCalculateTariffsResponse();
        OASCalculateTariffsResponse calculateTariffsResponse4 = new OASCalculateTariffsResponse();

        System.assert(calculateTariffsResponse1.equals(calculateTariffsResponse2));
        System.assert(calculateTariffsResponse3.equals(calculateTariffsResponse4));
        System.assertEquals(calculateTariffsResponse1.hashCode(), calculateTariffsResponse2.hashCode());
        System.assertEquals(calculateTariffsResponse3.hashCode(), calculateTariffsResponse4.hashCode());
    }
}
