@isTest
private class OASRegionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASRegionType> expected = new Set<OASRegionType>{
            OASRegionType.OTHER,
            OASRegionType.CONTINENT,
            OASRegionType.REGION,
            OASRegionType.COUNTRY,
            OASRegionType.COUNTRY_DISTRICT,
            OASRegionType.REPUBLIC,
            OASRegionType.CITY,
            OASRegionType.VILLAGE,
            OASRegionType.CITY_DISTRICT,
            OASRegionType.SUBWAY_STATION,
            OASRegionType.REPUBLIC_AREA
        };
        Set<OASRegionType> actual  = new Set<OASRegionType>(OASRegionType.values());
        System.assertEquals(expected, actual);
    }
}
