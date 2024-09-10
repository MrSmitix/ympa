@isTest
private class OASQualityRatingAffectedOrderDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO1 = OASQualityRatingAffectedOrderDTO.getExample();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO2 = qualityRatingAffectedOrderDTO1;
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO3 = new OASQualityRatingAffectedOrderDTO();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO4 = qualityRatingAffectedOrderDTO3;

        System.assert(qualityRatingAffectedOrderDTO1.equals(qualityRatingAffectedOrderDTO2));
        System.assert(qualityRatingAffectedOrderDTO2.equals(qualityRatingAffectedOrderDTO1));
        System.assert(qualityRatingAffectedOrderDTO1.equals(qualityRatingAffectedOrderDTO1));
        System.assert(qualityRatingAffectedOrderDTO3.equals(qualityRatingAffectedOrderDTO4));
        System.assert(qualityRatingAffectedOrderDTO4.equals(qualityRatingAffectedOrderDTO3));
        System.assert(qualityRatingAffectedOrderDTO3.equals(qualityRatingAffectedOrderDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO1 = OASQualityRatingAffectedOrderDTO.getExample();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO2 = OASQualityRatingAffectedOrderDTO.getExample();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO3 = new OASQualityRatingAffectedOrderDTO();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO4 = new OASQualityRatingAffectedOrderDTO();

        System.assert(qualityRatingAffectedOrderDTO1.equals(qualityRatingAffectedOrderDTO2));
        System.assert(qualityRatingAffectedOrderDTO2.equals(qualityRatingAffectedOrderDTO1));
        System.assert(qualityRatingAffectedOrderDTO3.equals(qualityRatingAffectedOrderDTO4));
        System.assert(qualityRatingAffectedOrderDTO4.equals(qualityRatingAffectedOrderDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO1 = OASQualityRatingAffectedOrderDTO.getExample();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO2 = new OASQualityRatingAffectedOrderDTO();

        System.assertEquals(false, qualityRatingAffectedOrderDTO1.equals('foo'));
        System.assertEquals(false, qualityRatingAffectedOrderDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO1 = OASQualityRatingAffectedOrderDTO.getExample();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO2 = new OASQualityRatingAffectedOrderDTO();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO3;

        System.assertEquals(false, qualityRatingAffectedOrderDTO1.equals(qualityRatingAffectedOrderDTO3));
        System.assertEquals(false, qualityRatingAffectedOrderDTO2.equals(qualityRatingAffectedOrderDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO1 = OASQualityRatingAffectedOrderDTO.getExample();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO2 = new OASQualityRatingAffectedOrderDTO();

        System.assertEquals(qualityRatingAffectedOrderDTO1.hashCode(), qualityRatingAffectedOrderDTO1.hashCode());
        System.assertEquals(qualityRatingAffectedOrderDTO2.hashCode(), qualityRatingAffectedOrderDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO1 = OASQualityRatingAffectedOrderDTO.getExample();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO2 = OASQualityRatingAffectedOrderDTO.getExample();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO3 = new OASQualityRatingAffectedOrderDTO();
        OASQualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO4 = new OASQualityRatingAffectedOrderDTO();

        System.assert(qualityRatingAffectedOrderDTO1.equals(qualityRatingAffectedOrderDTO2));
        System.assert(qualityRatingAffectedOrderDTO3.equals(qualityRatingAffectedOrderDTO4));
        System.assertEquals(qualityRatingAffectedOrderDTO1.hashCode(), qualityRatingAffectedOrderDTO2.hashCode());
        System.assertEquals(qualityRatingAffectedOrderDTO3.hashCode(), qualityRatingAffectedOrderDTO4.hashCode());
    }
}
