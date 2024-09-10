@isTest
private class OASGenerateUnitedNettingReportRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest1 = OASGenerateUnitedNettingReportReques.getExample();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest2 = generateUnitedNettingReportRequest1;
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest3 = new OASGenerateUnitedNettingReportReques();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest4 = generateUnitedNettingReportRequest3;

        System.assert(generateUnitedNettingReportRequest1.equals(generateUnitedNettingReportRequest2));
        System.assert(generateUnitedNettingReportRequest2.equals(generateUnitedNettingReportRequest1));
        System.assert(generateUnitedNettingReportRequest1.equals(generateUnitedNettingReportRequest1));
        System.assert(generateUnitedNettingReportRequest3.equals(generateUnitedNettingReportRequest4));
        System.assert(generateUnitedNettingReportRequest4.equals(generateUnitedNettingReportRequest3));
        System.assert(generateUnitedNettingReportRequest3.equals(generateUnitedNettingReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest1 = OASGenerateUnitedNettingReportReques.getExample();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest2 = OASGenerateUnitedNettingReportReques.getExample();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest3 = new OASGenerateUnitedNettingReportReques();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest4 = new OASGenerateUnitedNettingReportReques();

        System.assert(generateUnitedNettingReportRequest1.equals(generateUnitedNettingReportRequest2));
        System.assert(generateUnitedNettingReportRequest2.equals(generateUnitedNettingReportRequest1));
        System.assert(generateUnitedNettingReportRequest3.equals(generateUnitedNettingReportRequest4));
        System.assert(generateUnitedNettingReportRequest4.equals(generateUnitedNettingReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest1 = OASGenerateUnitedNettingReportReques.getExample();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest2 = new OASGenerateUnitedNettingReportReques();

        System.assertEquals(false, generateUnitedNettingReportRequest1.equals('foo'));
        System.assertEquals(false, generateUnitedNettingReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest1 = OASGenerateUnitedNettingReportReques.getExample();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest2 = new OASGenerateUnitedNettingReportReques();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest3;

        System.assertEquals(false, generateUnitedNettingReportRequest1.equals(generateUnitedNettingReportRequest3));
        System.assertEquals(false, generateUnitedNettingReportRequest2.equals(generateUnitedNettingReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest1 = OASGenerateUnitedNettingReportReques.getExample();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest2 = new OASGenerateUnitedNettingReportReques();

        System.assertEquals(generateUnitedNettingReportRequest1.hashCode(), generateUnitedNettingReportRequest1.hashCode());
        System.assertEquals(generateUnitedNettingReportRequest2.hashCode(), generateUnitedNettingReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest1 = OASGenerateUnitedNettingReportReques.getExample();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest2 = OASGenerateUnitedNettingReportReques.getExample();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest3 = new OASGenerateUnitedNettingReportReques();
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest4 = new OASGenerateUnitedNettingReportReques();

        System.assert(generateUnitedNettingReportRequest1.equals(generateUnitedNettingReportRequest2));
        System.assert(generateUnitedNettingReportRequest3.equals(generateUnitedNettingReportRequest4));
        System.assertEquals(generateUnitedNettingReportRequest1.hashCode(), generateUnitedNettingReportRequest2.hashCode());
        System.assertEquals(generateUnitedNettingReportRequest3.hashCode(), generateUnitedNettingReportRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGenerateUnitedNettingReportReques generateUnitedNettingReportRequest = new OASGenerateUnitedNettingReportReques();
        System.assertEquals(new List<OASPlacementType>(), generateUnitedNettingReportRequest.placementPrograms);
        System.assertEquals(new List<String>(), generateUnitedNettingReportRequest.inns);
        System.assertEquals(new List<Long>(), generateUnitedNettingReportRequest.campaignIds);
        System.assertEquals(null, generateUnitedNettingReportRequest.businessId);
        System.assertEquals(null, generateUnitedNettingReportRequest.dateTimeFrom);
        System.assertEquals(null, generateUnitedNettingReportRequest.dateTimeTo);
        System.assertEquals(null, generateUnitedNettingReportRequest.dateFrom);
        System.assertEquals(null, generateUnitedNettingReportRequest.dateTo);
        System.assertEquals(null, generateUnitedNettingReportRequest.bankOrderId);
        System.assertEquals(null, generateUnitedNettingReportRequest.bankOrderDateTime);
    }
}
