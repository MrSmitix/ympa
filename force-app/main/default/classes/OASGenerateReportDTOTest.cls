@isTest
private class OASGenerateReportDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerateReportDTO generateReportDTO1 = OASGenerateReportDTO.getExample();
        OASGenerateReportDTO generateReportDTO2 = generateReportDTO1;
        OASGenerateReportDTO generateReportDTO3 = new OASGenerateReportDTO();
        OASGenerateReportDTO generateReportDTO4 = generateReportDTO3;

        System.assert(generateReportDTO1.equals(generateReportDTO2));
        System.assert(generateReportDTO2.equals(generateReportDTO1));
        System.assert(generateReportDTO1.equals(generateReportDTO1));
        System.assert(generateReportDTO3.equals(generateReportDTO4));
        System.assert(generateReportDTO4.equals(generateReportDTO3));
        System.assert(generateReportDTO3.equals(generateReportDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerateReportDTO generateReportDTO1 = OASGenerateReportDTO.getExample();
        OASGenerateReportDTO generateReportDTO2 = OASGenerateReportDTO.getExample();
        OASGenerateReportDTO generateReportDTO3 = new OASGenerateReportDTO();
        OASGenerateReportDTO generateReportDTO4 = new OASGenerateReportDTO();

        System.assert(generateReportDTO1.equals(generateReportDTO2));
        System.assert(generateReportDTO2.equals(generateReportDTO1));
        System.assert(generateReportDTO3.equals(generateReportDTO4));
        System.assert(generateReportDTO4.equals(generateReportDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerateReportDTO generateReportDTO1 = OASGenerateReportDTO.getExample();
        OASGenerateReportDTO generateReportDTO2 = new OASGenerateReportDTO();

        System.assertEquals(false, generateReportDTO1.equals('foo'));
        System.assertEquals(false, generateReportDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerateReportDTO generateReportDTO1 = OASGenerateReportDTO.getExample();
        OASGenerateReportDTO generateReportDTO2 = new OASGenerateReportDTO();
        OASGenerateReportDTO generateReportDTO3;

        System.assertEquals(false, generateReportDTO1.equals(generateReportDTO3));
        System.assertEquals(false, generateReportDTO2.equals(generateReportDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerateReportDTO generateReportDTO1 = OASGenerateReportDTO.getExample();
        OASGenerateReportDTO generateReportDTO2 = new OASGenerateReportDTO();

        System.assertEquals(generateReportDTO1.hashCode(), generateReportDTO1.hashCode());
        System.assertEquals(generateReportDTO2.hashCode(), generateReportDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerateReportDTO generateReportDTO1 = OASGenerateReportDTO.getExample();
        OASGenerateReportDTO generateReportDTO2 = OASGenerateReportDTO.getExample();
        OASGenerateReportDTO generateReportDTO3 = new OASGenerateReportDTO();
        OASGenerateReportDTO generateReportDTO4 = new OASGenerateReportDTO();

        System.assert(generateReportDTO1.equals(generateReportDTO2));
        System.assert(generateReportDTO3.equals(generateReportDTO4));
        System.assertEquals(generateReportDTO1.hashCode(), generateReportDTO2.hashCode());
        System.assertEquals(generateReportDTO3.hashCode(), generateReportDTO4.hashCode());
    }
}
