@isTest
private class OASGenerateUnitedMarketplaceServicesTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest1 = OASGenerateUnitedMarketplaceServices.getExample();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest2 = generateUnitedMarketplaceServicesReportRequest1;
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest3 = new OASGenerateUnitedMarketplaceServices();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest4 = generateUnitedMarketplaceServicesReportRequest3;

        System.assert(generateUnitedMarketplaceServicesReportRequest1.equals(generateUnitedMarketplaceServicesReportRequest2));
        System.assert(generateUnitedMarketplaceServicesReportRequest2.equals(generateUnitedMarketplaceServicesReportRequest1));
        System.assert(generateUnitedMarketplaceServicesReportRequest1.equals(generateUnitedMarketplaceServicesReportRequest1));
        System.assert(generateUnitedMarketplaceServicesReportRequest3.equals(generateUnitedMarketplaceServicesReportRequest4));
        System.assert(generateUnitedMarketplaceServicesReportRequest4.equals(generateUnitedMarketplaceServicesReportRequest3));
        System.assert(generateUnitedMarketplaceServicesReportRequest3.equals(generateUnitedMarketplaceServicesReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest1 = OASGenerateUnitedMarketplaceServices.getExample();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest2 = OASGenerateUnitedMarketplaceServices.getExample();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest3 = new OASGenerateUnitedMarketplaceServices();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest4 = new OASGenerateUnitedMarketplaceServices();

        System.assert(generateUnitedMarketplaceServicesReportRequest1.equals(generateUnitedMarketplaceServicesReportRequest2));
        System.assert(generateUnitedMarketplaceServicesReportRequest2.equals(generateUnitedMarketplaceServicesReportRequest1));
        System.assert(generateUnitedMarketplaceServicesReportRequest3.equals(generateUnitedMarketplaceServicesReportRequest4));
        System.assert(generateUnitedMarketplaceServicesReportRequest4.equals(generateUnitedMarketplaceServicesReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest1 = OASGenerateUnitedMarketplaceServices.getExample();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest2 = new OASGenerateUnitedMarketplaceServices();

        System.assertEquals(false, generateUnitedMarketplaceServicesReportRequest1.equals('foo'));
        System.assertEquals(false, generateUnitedMarketplaceServicesReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest1 = OASGenerateUnitedMarketplaceServices.getExample();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest2 = new OASGenerateUnitedMarketplaceServices();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest3;

        System.assertEquals(false, generateUnitedMarketplaceServicesReportRequest1.equals(generateUnitedMarketplaceServicesReportRequest3));
        System.assertEquals(false, generateUnitedMarketplaceServicesReportRequest2.equals(generateUnitedMarketplaceServicesReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest1 = OASGenerateUnitedMarketplaceServices.getExample();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest2 = new OASGenerateUnitedMarketplaceServices();

        System.assertEquals(generateUnitedMarketplaceServicesReportRequest1.hashCode(), generateUnitedMarketplaceServicesReportRequest1.hashCode());
        System.assertEquals(generateUnitedMarketplaceServicesReportRequest2.hashCode(), generateUnitedMarketplaceServicesReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest1 = OASGenerateUnitedMarketplaceServices.getExample();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest2 = OASGenerateUnitedMarketplaceServices.getExample();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest3 = new OASGenerateUnitedMarketplaceServices();
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest4 = new OASGenerateUnitedMarketplaceServices();

        System.assert(generateUnitedMarketplaceServicesReportRequest1.equals(generateUnitedMarketplaceServicesReportRequest2));
        System.assert(generateUnitedMarketplaceServicesReportRequest3.equals(generateUnitedMarketplaceServicesReportRequest4));
        System.assertEquals(generateUnitedMarketplaceServicesReportRequest1.hashCode(), generateUnitedMarketplaceServicesReportRequest2.hashCode());
        System.assertEquals(generateUnitedMarketplaceServicesReportRequest3.hashCode(), generateUnitedMarketplaceServicesReportRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGenerateUnitedMarketplaceServices generateUnitedMarketplaceServicesReportRequest = new OASGenerateUnitedMarketplaceServices();
        System.assertEquals(new List<OASPlacementType>(), generateUnitedMarketplaceServicesReportRequest.placementPrograms);
        System.assertEquals(new List<String>(), generateUnitedMarketplaceServicesReportRequest.inns);
        System.assertEquals(new List<Long>(), generateUnitedMarketplaceServicesReportRequest.campaignIds);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.businessId);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.dateTimeFrom);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.dateTimeTo);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.dateFrom);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.dateTo);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.yearFrom);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.monthFrom);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.yearTo);
        System.assertEquals(null, generateUnitedMarketplaceServicesReportRequest.monthTo);
    }
}
