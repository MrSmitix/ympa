@isTest
private class OASDayOfWeekTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASDayOfWeekType> expected = new Set<OASDayOfWeekType>{
            OASDayOfWeekType.MONDAY,
            OASDayOfWeekType.TUESDAY,
            OASDayOfWeekType.WEDNESDAY,
            OASDayOfWeekType.THURSDAY,
            OASDayOfWeekType.FRIDAY,
            OASDayOfWeekType.SATURDAY,
            OASDayOfWeekType.SUNDAY
        };
        Set<OASDayOfWeekType> actual  = new Set<OASDayOfWeekType>(OASDayOfWeekType.values());
        System.assertEquals(expected, actual);
    }
}
