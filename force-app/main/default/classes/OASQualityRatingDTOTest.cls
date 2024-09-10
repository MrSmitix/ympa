@isTest
private class OASQualityRatingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASQualityRatingDTO qualityRatingDTO1 = OASQualityRatingDTO.getExample();
        OASQualityRatingDTO qualityRatingDTO2 = qualityRatingDTO1;
        OASQualityRatingDTO qualityRatingDTO3 = new OASQualityRatingDTO();
        OASQualityRatingDTO qualityRatingDTO4 = qualityRatingDTO3;

        System.assert(qualityRatingDTO1.equals(qualityRatingDTO2));
        System.assert(qualityRatingDTO2.equals(qualityRatingDTO1));
        System.assert(qualityRatingDTO1.equals(qualityRatingDTO1));
        System.assert(qualityRatingDTO3.equals(qualityRatingDTO4));
        System.assert(qualityRatingDTO4.equals(qualityRatingDTO3));
        System.assert(qualityRatingDTO3.equals(qualityRatingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQualityRatingDTO qualityRatingDTO1 = OASQualityRatingDTO.getExample();
        OASQualityRatingDTO qualityRatingDTO2 = OASQualityRatingDTO.getExample();
        OASQualityRatingDTO qualityRatingDTO3 = new OASQualityRatingDTO();
        OASQualityRatingDTO qualityRatingDTO4 = new OASQualityRatingDTO();

        System.assert(qualityRatingDTO1.equals(qualityRatingDTO2));
        System.assert(qualityRatingDTO2.equals(qualityRatingDTO1));
        System.assert(qualityRatingDTO3.equals(qualityRatingDTO4));
        System.assert(qualityRatingDTO4.equals(qualityRatingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQualityRatingDTO qualityRatingDTO1 = OASQualityRatingDTO.getExample();
        OASQualityRatingDTO qualityRatingDTO2 = new OASQualityRatingDTO();

        System.assertEquals(false, qualityRatingDTO1.equals('foo'));
        System.assertEquals(false, qualityRatingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQualityRatingDTO qualityRatingDTO1 = OASQualityRatingDTO.getExample();
        OASQualityRatingDTO qualityRatingDTO2 = new OASQualityRatingDTO();
        OASQualityRatingDTO qualityRatingDTO3;

        System.assertEquals(false, qualityRatingDTO1.equals(qualityRatingDTO3));
        System.assertEquals(false, qualityRatingDTO2.equals(qualityRatingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQualityRatingDTO qualityRatingDTO1 = OASQualityRatingDTO.getExample();
        OASQualityRatingDTO qualityRatingDTO2 = new OASQualityRatingDTO();

        System.assertEquals(qualityRatingDTO1.hashCode(), qualityRatingDTO1.hashCode());
        System.assertEquals(qualityRatingDTO2.hashCode(), qualityRatingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQualityRatingDTO qualityRatingDTO1 = OASQualityRatingDTO.getExample();
        OASQualityRatingDTO qualityRatingDTO2 = OASQualityRatingDTO.getExample();
        OASQualityRatingDTO qualityRatingDTO3 = new OASQualityRatingDTO();
        OASQualityRatingDTO qualityRatingDTO4 = new OASQualityRatingDTO();

        System.assert(qualityRatingDTO1.equals(qualityRatingDTO2));
        System.assert(qualityRatingDTO3.equals(qualityRatingDTO4));
        System.assertEquals(qualityRatingDTO1.hashCode(), qualityRatingDTO2.hashCode());
        System.assertEquals(qualityRatingDTO3.hashCode(), qualityRatingDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASQualityRatingDTO qualityRatingDTO = new OASQualityRatingDTO();
        System.assertEquals(new List<OASQualityRatingComponentDTO>(), qualityRatingDTO.components);
        System.assertEquals(null, qualityRatingDTO.rating);
        System.assertEquals(null, qualityRatingDTO.calculationDate);
    }
}
