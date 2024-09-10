@isTest
private class OASCalculateTariffsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCalculateTariffsRequest calculateTariffsRequest1 = OASCalculateTariffsRequest.getExample();
        OASCalculateTariffsRequest calculateTariffsRequest2 = calculateTariffsRequest1;
        OASCalculateTariffsRequest calculateTariffsRequest3 = new OASCalculateTariffsRequest();
        OASCalculateTariffsRequest calculateTariffsRequest4 = calculateTariffsRequest3;

        System.assert(calculateTariffsRequest1.equals(calculateTariffsRequest2));
        System.assert(calculateTariffsRequest2.equals(calculateTariffsRequest1));
        System.assert(calculateTariffsRequest1.equals(calculateTariffsRequest1));
        System.assert(calculateTariffsRequest3.equals(calculateTariffsRequest4));
        System.assert(calculateTariffsRequest4.equals(calculateTariffsRequest3));
        System.assert(calculateTariffsRequest3.equals(calculateTariffsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCalculateTariffsRequest calculateTariffsRequest1 = OASCalculateTariffsRequest.getExample();
        OASCalculateTariffsRequest calculateTariffsRequest2 = OASCalculateTariffsRequest.getExample();
        OASCalculateTariffsRequest calculateTariffsRequest3 = new OASCalculateTariffsRequest();
        OASCalculateTariffsRequest calculateTariffsRequest4 = new OASCalculateTariffsRequest();

        System.assert(calculateTariffsRequest1.equals(calculateTariffsRequest2));
        System.assert(calculateTariffsRequest2.equals(calculateTariffsRequest1));
        System.assert(calculateTariffsRequest3.equals(calculateTariffsRequest4));
        System.assert(calculateTariffsRequest4.equals(calculateTariffsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCalculateTariffsRequest calculateTariffsRequest1 = OASCalculateTariffsRequest.getExample();
        OASCalculateTariffsRequest calculateTariffsRequest2 = new OASCalculateTariffsRequest();

        System.assertEquals(false, calculateTariffsRequest1.equals('foo'));
        System.assertEquals(false, calculateTariffsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCalculateTariffsRequest calculateTariffsRequest1 = OASCalculateTariffsRequest.getExample();
        OASCalculateTariffsRequest calculateTariffsRequest2 = new OASCalculateTariffsRequest();
        OASCalculateTariffsRequest calculateTariffsRequest3;

        System.assertEquals(false, calculateTariffsRequest1.equals(calculateTariffsRequest3));
        System.assertEquals(false, calculateTariffsRequest2.equals(calculateTariffsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCalculateTariffsRequest calculateTariffsRequest1 = OASCalculateTariffsRequest.getExample();
        OASCalculateTariffsRequest calculateTariffsRequest2 = new OASCalculateTariffsRequest();

        System.assertEquals(calculateTariffsRequest1.hashCode(), calculateTariffsRequest1.hashCode());
        System.assertEquals(calculateTariffsRequest2.hashCode(), calculateTariffsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCalculateTariffsRequest calculateTariffsRequest1 = OASCalculateTariffsRequest.getExample();
        OASCalculateTariffsRequest calculateTariffsRequest2 = OASCalculateTariffsRequest.getExample();
        OASCalculateTariffsRequest calculateTariffsRequest3 = new OASCalculateTariffsRequest();
        OASCalculateTariffsRequest calculateTariffsRequest4 = new OASCalculateTariffsRequest();

        System.assert(calculateTariffsRequest1.equals(calculateTariffsRequest2));
        System.assert(calculateTariffsRequest3.equals(calculateTariffsRequest4));
        System.assertEquals(calculateTariffsRequest1.hashCode(), calculateTariffsRequest2.hashCode());
        System.assertEquals(calculateTariffsRequest3.hashCode(), calculateTariffsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCalculateTariffsRequest calculateTariffsRequest = new OASCalculateTariffsRequest();
        System.assertEquals(new List<OASCalculateTariffsOfferDTO>(), calculateTariffsRequest.offers);
        System.assertEquals(null, calculateTariffsRequest.parameters);
    }
}
