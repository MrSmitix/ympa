@isTest
private class OASGetBusinessSettingsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessSettingsResponse getBusinessSettingsResponse1 = OASGetBusinessSettingsResponse.getExample();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse2 = getBusinessSettingsResponse1;
        OASGetBusinessSettingsResponse getBusinessSettingsResponse3 = new OASGetBusinessSettingsResponse();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse4 = getBusinessSettingsResponse3;

        System.assert(getBusinessSettingsResponse1.equals(getBusinessSettingsResponse2));
        System.assert(getBusinessSettingsResponse2.equals(getBusinessSettingsResponse1));
        System.assert(getBusinessSettingsResponse1.equals(getBusinessSettingsResponse1));
        System.assert(getBusinessSettingsResponse3.equals(getBusinessSettingsResponse4));
        System.assert(getBusinessSettingsResponse4.equals(getBusinessSettingsResponse3));
        System.assert(getBusinessSettingsResponse3.equals(getBusinessSettingsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessSettingsResponse getBusinessSettingsResponse1 = OASGetBusinessSettingsResponse.getExample();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse2 = OASGetBusinessSettingsResponse.getExample();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse3 = new OASGetBusinessSettingsResponse();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse4 = new OASGetBusinessSettingsResponse();

        System.assert(getBusinessSettingsResponse1.equals(getBusinessSettingsResponse2));
        System.assert(getBusinessSettingsResponse2.equals(getBusinessSettingsResponse1));
        System.assert(getBusinessSettingsResponse3.equals(getBusinessSettingsResponse4));
        System.assert(getBusinessSettingsResponse4.equals(getBusinessSettingsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessSettingsResponse getBusinessSettingsResponse1 = OASGetBusinessSettingsResponse.getExample();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse2 = new OASGetBusinessSettingsResponse();

        System.assertEquals(false, getBusinessSettingsResponse1.equals('foo'));
        System.assertEquals(false, getBusinessSettingsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessSettingsResponse getBusinessSettingsResponse1 = OASGetBusinessSettingsResponse.getExample();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse2 = new OASGetBusinessSettingsResponse();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse3;

        System.assertEquals(false, getBusinessSettingsResponse1.equals(getBusinessSettingsResponse3));
        System.assertEquals(false, getBusinessSettingsResponse2.equals(getBusinessSettingsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessSettingsResponse getBusinessSettingsResponse1 = OASGetBusinessSettingsResponse.getExample();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse2 = new OASGetBusinessSettingsResponse();

        System.assertEquals(getBusinessSettingsResponse1.hashCode(), getBusinessSettingsResponse1.hashCode());
        System.assertEquals(getBusinessSettingsResponse2.hashCode(), getBusinessSettingsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessSettingsResponse getBusinessSettingsResponse1 = OASGetBusinessSettingsResponse.getExample();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse2 = OASGetBusinessSettingsResponse.getExample();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse3 = new OASGetBusinessSettingsResponse();
        OASGetBusinessSettingsResponse getBusinessSettingsResponse4 = new OASGetBusinessSettingsResponse();

        System.assert(getBusinessSettingsResponse1.equals(getBusinessSettingsResponse2));
        System.assert(getBusinessSettingsResponse3.equals(getBusinessSettingsResponse4));
        System.assertEquals(getBusinessSettingsResponse1.hashCode(), getBusinessSettingsResponse2.hashCode());
        System.assertEquals(getBusinessSettingsResponse3.hashCode(), getBusinessSettingsResponse4.hashCode());
    }
}
