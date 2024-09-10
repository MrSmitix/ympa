@isTest
private class OASShelfsStatisticsAttributionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASShelfsStatisticsAttributionType> expected = new Set<OASShelfsStatisticsAttributionType>{
            OASShelfsStatisticsAttributionType.CLICKS,
            OASShelfsStatisticsAttributionType.SHOWS
        };
        Set<OASShelfsStatisticsAttributionType> actual  = new Set<OASShelfsStatisticsAttributionType>(OASShelfsStatisticsAttributionType.values());
        System.assertEquals(expected, actual);
    }
}
