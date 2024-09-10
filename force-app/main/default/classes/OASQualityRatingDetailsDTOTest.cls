@isTest
private class OASQualityRatingDetailsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO1 = OASQualityRatingDetailsDTO.getExample();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO2 = qualityRatingDetailsDTO1;
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO3 = new OASQualityRatingDetailsDTO();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO4 = qualityRatingDetailsDTO3;

        System.assert(qualityRatingDetailsDTO1.equals(qualityRatingDetailsDTO2));
        System.assert(qualityRatingDetailsDTO2.equals(qualityRatingDetailsDTO1));
        System.assert(qualityRatingDetailsDTO1.equals(qualityRatingDetailsDTO1));
        System.assert(qualityRatingDetailsDTO3.equals(qualityRatingDetailsDTO4));
        System.assert(qualityRatingDetailsDTO4.equals(qualityRatingDetailsDTO3));
        System.assert(qualityRatingDetailsDTO3.equals(qualityRatingDetailsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO1 = OASQualityRatingDetailsDTO.getExample();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO2 = OASQualityRatingDetailsDTO.getExample();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO3 = new OASQualityRatingDetailsDTO();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO4 = new OASQualityRatingDetailsDTO();

        System.assert(qualityRatingDetailsDTO1.equals(qualityRatingDetailsDTO2));
        System.assert(qualityRatingDetailsDTO2.equals(qualityRatingDetailsDTO1));
        System.assert(qualityRatingDetailsDTO3.equals(qualityRatingDetailsDTO4));
        System.assert(qualityRatingDetailsDTO4.equals(qualityRatingDetailsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO1 = OASQualityRatingDetailsDTO.getExample();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO2 = new OASQualityRatingDetailsDTO();

        System.assertEquals(false, qualityRatingDetailsDTO1.equals('foo'));
        System.assertEquals(false, qualityRatingDetailsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO1 = OASQualityRatingDetailsDTO.getExample();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO2 = new OASQualityRatingDetailsDTO();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO3;

        System.assertEquals(false, qualityRatingDetailsDTO1.equals(qualityRatingDetailsDTO3));
        System.assertEquals(false, qualityRatingDetailsDTO2.equals(qualityRatingDetailsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO1 = OASQualityRatingDetailsDTO.getExample();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO2 = new OASQualityRatingDetailsDTO();

        System.assertEquals(qualityRatingDetailsDTO1.hashCode(), qualityRatingDetailsDTO1.hashCode());
        System.assertEquals(qualityRatingDetailsDTO2.hashCode(), qualityRatingDetailsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO1 = OASQualityRatingDetailsDTO.getExample();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO2 = OASQualityRatingDetailsDTO.getExample();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO3 = new OASQualityRatingDetailsDTO();
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO4 = new OASQualityRatingDetailsDTO();

        System.assert(qualityRatingDetailsDTO1.equals(qualityRatingDetailsDTO2));
        System.assert(qualityRatingDetailsDTO3.equals(qualityRatingDetailsDTO4));
        System.assertEquals(qualityRatingDetailsDTO1.hashCode(), qualityRatingDetailsDTO2.hashCode());
        System.assertEquals(qualityRatingDetailsDTO3.hashCode(), qualityRatingDetailsDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASQualityRatingDetailsDTO qualityRatingDetailsDTO = new OASQualityRatingDetailsDTO();
        System.assertEquals(new List<OASQualityRatingAffectedOrderDTO>(), qualityRatingDetailsDTO.affectedOrders);
    }
}
