@isTest
private class OASReportInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASReportInfoDTO reportInfoDTO1 = OASReportInfoDTO.getExample();
        OASReportInfoDTO reportInfoDTO2 = reportInfoDTO1;
        OASReportInfoDTO reportInfoDTO3 = new OASReportInfoDTO();
        OASReportInfoDTO reportInfoDTO4 = reportInfoDTO3;

        System.assert(reportInfoDTO1.equals(reportInfoDTO2));
        System.assert(reportInfoDTO2.equals(reportInfoDTO1));
        System.assert(reportInfoDTO1.equals(reportInfoDTO1));
        System.assert(reportInfoDTO3.equals(reportInfoDTO4));
        System.assert(reportInfoDTO4.equals(reportInfoDTO3));
        System.assert(reportInfoDTO3.equals(reportInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASReportInfoDTO reportInfoDTO1 = OASReportInfoDTO.getExample();
        OASReportInfoDTO reportInfoDTO2 = OASReportInfoDTO.getExample();
        OASReportInfoDTO reportInfoDTO3 = new OASReportInfoDTO();
        OASReportInfoDTO reportInfoDTO4 = new OASReportInfoDTO();

        System.assert(reportInfoDTO1.equals(reportInfoDTO2));
        System.assert(reportInfoDTO2.equals(reportInfoDTO1));
        System.assert(reportInfoDTO3.equals(reportInfoDTO4));
        System.assert(reportInfoDTO4.equals(reportInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASReportInfoDTO reportInfoDTO1 = OASReportInfoDTO.getExample();
        OASReportInfoDTO reportInfoDTO2 = new OASReportInfoDTO();

        System.assertEquals(false, reportInfoDTO1.equals('foo'));
        System.assertEquals(false, reportInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASReportInfoDTO reportInfoDTO1 = OASReportInfoDTO.getExample();
        OASReportInfoDTO reportInfoDTO2 = new OASReportInfoDTO();
        OASReportInfoDTO reportInfoDTO3;

        System.assertEquals(false, reportInfoDTO1.equals(reportInfoDTO3));
        System.assertEquals(false, reportInfoDTO2.equals(reportInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASReportInfoDTO reportInfoDTO1 = OASReportInfoDTO.getExample();
        OASReportInfoDTO reportInfoDTO2 = new OASReportInfoDTO();

        System.assertEquals(reportInfoDTO1.hashCode(), reportInfoDTO1.hashCode());
        System.assertEquals(reportInfoDTO2.hashCode(), reportInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASReportInfoDTO reportInfoDTO1 = OASReportInfoDTO.getExample();
        OASReportInfoDTO reportInfoDTO2 = OASReportInfoDTO.getExample();
        OASReportInfoDTO reportInfoDTO3 = new OASReportInfoDTO();
        OASReportInfoDTO reportInfoDTO4 = new OASReportInfoDTO();

        System.assert(reportInfoDTO1.equals(reportInfoDTO2));
        System.assert(reportInfoDTO3.equals(reportInfoDTO4));
        System.assertEquals(reportInfoDTO1.hashCode(), reportInfoDTO2.hashCode());
        System.assertEquals(reportInfoDTO3.hashCode(), reportInfoDTO4.hashCode());
    }
}
