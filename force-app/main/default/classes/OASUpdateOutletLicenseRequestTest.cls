@isTest
private class OASUpdateOutletLicenseRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest1 = OASUpdateOutletLicenseRequest.getExample();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest2 = updateOutletLicenseRequest1;
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest3 = new OASUpdateOutletLicenseRequest();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest4 = updateOutletLicenseRequest3;

        System.assert(updateOutletLicenseRequest1.equals(updateOutletLicenseRequest2));
        System.assert(updateOutletLicenseRequest2.equals(updateOutletLicenseRequest1));
        System.assert(updateOutletLicenseRequest1.equals(updateOutletLicenseRequest1));
        System.assert(updateOutletLicenseRequest3.equals(updateOutletLicenseRequest4));
        System.assert(updateOutletLicenseRequest4.equals(updateOutletLicenseRequest3));
        System.assert(updateOutletLicenseRequest3.equals(updateOutletLicenseRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest1 = OASUpdateOutletLicenseRequest.getExample();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest2 = OASUpdateOutletLicenseRequest.getExample();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest3 = new OASUpdateOutletLicenseRequest();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest4 = new OASUpdateOutletLicenseRequest();

        System.assert(updateOutletLicenseRequest1.equals(updateOutletLicenseRequest2));
        System.assert(updateOutletLicenseRequest2.equals(updateOutletLicenseRequest1));
        System.assert(updateOutletLicenseRequest3.equals(updateOutletLicenseRequest4));
        System.assert(updateOutletLicenseRequest4.equals(updateOutletLicenseRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest1 = OASUpdateOutletLicenseRequest.getExample();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest2 = new OASUpdateOutletLicenseRequest();

        System.assertEquals(false, updateOutletLicenseRequest1.equals('foo'));
        System.assertEquals(false, updateOutletLicenseRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest1 = OASUpdateOutletLicenseRequest.getExample();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest2 = new OASUpdateOutletLicenseRequest();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest3;

        System.assertEquals(false, updateOutletLicenseRequest1.equals(updateOutletLicenseRequest3));
        System.assertEquals(false, updateOutletLicenseRequest2.equals(updateOutletLicenseRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest1 = OASUpdateOutletLicenseRequest.getExample();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest2 = new OASUpdateOutletLicenseRequest();

        System.assertEquals(updateOutletLicenseRequest1.hashCode(), updateOutletLicenseRequest1.hashCode());
        System.assertEquals(updateOutletLicenseRequest2.hashCode(), updateOutletLicenseRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest1 = OASUpdateOutletLicenseRequest.getExample();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest2 = OASUpdateOutletLicenseRequest.getExample();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest3 = new OASUpdateOutletLicenseRequest();
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest4 = new OASUpdateOutletLicenseRequest();

        System.assert(updateOutletLicenseRequest1.equals(updateOutletLicenseRequest2));
        System.assert(updateOutletLicenseRequest3.equals(updateOutletLicenseRequest4));
        System.assertEquals(updateOutletLicenseRequest1.hashCode(), updateOutletLicenseRequest2.hashCode());
        System.assertEquals(updateOutletLicenseRequest3.hashCode(), updateOutletLicenseRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOutletLicenseRequest updateOutletLicenseRequest = new OASUpdateOutletLicenseRequest();
        System.assertEquals(new List<OASOutletLicenseDTO>(), updateOutletLicenseRequest.licenses);
    }
}
