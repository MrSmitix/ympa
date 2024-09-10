@isTest
private class OASChangeOutletRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASChangeOutletRequest changeOutletRequest1 = OASChangeOutletRequest.getExample();
        OASChangeOutletRequest changeOutletRequest2 = changeOutletRequest1;
        OASChangeOutletRequest changeOutletRequest3 = new OASChangeOutletRequest();
        OASChangeOutletRequest changeOutletRequest4 = changeOutletRequest3;

        System.assert(changeOutletRequest1.equals(changeOutletRequest2));
        System.assert(changeOutletRequest2.equals(changeOutletRequest1));
        System.assert(changeOutletRequest1.equals(changeOutletRequest1));
        System.assert(changeOutletRequest3.equals(changeOutletRequest4));
        System.assert(changeOutletRequest4.equals(changeOutletRequest3));
        System.assert(changeOutletRequest3.equals(changeOutletRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChangeOutletRequest changeOutletRequest1 = OASChangeOutletRequest.getExample();
        OASChangeOutletRequest changeOutletRequest2 = OASChangeOutletRequest.getExample();
        OASChangeOutletRequest changeOutletRequest3 = new OASChangeOutletRequest();
        OASChangeOutletRequest changeOutletRequest4 = new OASChangeOutletRequest();

        System.assert(changeOutletRequest1.equals(changeOutletRequest2));
        System.assert(changeOutletRequest2.equals(changeOutletRequest1));
        System.assert(changeOutletRequest3.equals(changeOutletRequest4));
        System.assert(changeOutletRequest4.equals(changeOutletRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChangeOutletRequest changeOutletRequest1 = OASChangeOutletRequest.getExample();
        OASChangeOutletRequest changeOutletRequest2 = new OASChangeOutletRequest();

        System.assertEquals(false, changeOutletRequest1.equals('foo'));
        System.assertEquals(false, changeOutletRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChangeOutletRequest changeOutletRequest1 = OASChangeOutletRequest.getExample();
        OASChangeOutletRequest changeOutletRequest2 = new OASChangeOutletRequest();
        OASChangeOutletRequest changeOutletRequest3;

        System.assertEquals(false, changeOutletRequest1.equals(changeOutletRequest3));
        System.assertEquals(false, changeOutletRequest2.equals(changeOutletRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChangeOutletRequest changeOutletRequest1 = OASChangeOutletRequest.getExample();
        OASChangeOutletRequest changeOutletRequest2 = new OASChangeOutletRequest();

        System.assertEquals(changeOutletRequest1.hashCode(), changeOutletRequest1.hashCode());
        System.assertEquals(changeOutletRequest2.hashCode(), changeOutletRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChangeOutletRequest changeOutletRequest1 = OASChangeOutletRequest.getExample();
        OASChangeOutletRequest changeOutletRequest2 = OASChangeOutletRequest.getExample();
        OASChangeOutletRequest changeOutletRequest3 = new OASChangeOutletRequest();
        OASChangeOutletRequest changeOutletRequest4 = new OASChangeOutletRequest();

        System.assert(changeOutletRequest1.equals(changeOutletRequest2));
        System.assert(changeOutletRequest3.equals(changeOutletRequest4));
        System.assertEquals(changeOutletRequest1.hashCode(), changeOutletRequest2.hashCode());
        System.assertEquals(changeOutletRequest3.hashCode(), changeOutletRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChangeOutletRequest changeOutletRequest = new OASChangeOutletRequest();
        System.assertEquals(new List<String>(), changeOutletRequest.phones);
        System.assertEquals(new List<OASOutletDeliveryRuleDTO>(), changeOutletRequest.deliveryRules);
        System.assertEquals(null, changeOutletRequest.name);
        System.assertEquals(null, changeOutletRequest.type);
        System.assertEquals(null, changeOutletRequest.coords);
        System.assertEquals(null, changeOutletRequest.isMain);
        System.assertEquals(null, changeOutletRequest.shopOutletCode);
        System.assertEquals(null, changeOutletRequest.visibility);
        System.assertEquals(null, changeOutletRequest.address);
        System.assertEquals(null, changeOutletRequest.workingSchedule);
        System.assertEquals(null, changeOutletRequest.storagePeriod);
    }
}
