@isTest
private class OASQualityRatingComponentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASQualityRatingComponentDTO qualityRatingComponentDTO1 = OASQualityRatingComponentDTO.getExample();
        OASQualityRatingComponentDTO qualityRatingComponentDTO2 = qualityRatingComponentDTO1;
        OASQualityRatingComponentDTO qualityRatingComponentDTO3 = new OASQualityRatingComponentDTO();
        OASQualityRatingComponentDTO qualityRatingComponentDTO4 = qualityRatingComponentDTO3;

        System.assert(qualityRatingComponentDTO1.equals(qualityRatingComponentDTO2));
        System.assert(qualityRatingComponentDTO2.equals(qualityRatingComponentDTO1));
        System.assert(qualityRatingComponentDTO1.equals(qualityRatingComponentDTO1));
        System.assert(qualityRatingComponentDTO3.equals(qualityRatingComponentDTO4));
        System.assert(qualityRatingComponentDTO4.equals(qualityRatingComponentDTO3));
        System.assert(qualityRatingComponentDTO3.equals(qualityRatingComponentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQualityRatingComponentDTO qualityRatingComponentDTO1 = OASQualityRatingComponentDTO.getExample();
        OASQualityRatingComponentDTO qualityRatingComponentDTO2 = OASQualityRatingComponentDTO.getExample();
        OASQualityRatingComponentDTO qualityRatingComponentDTO3 = new OASQualityRatingComponentDTO();
        OASQualityRatingComponentDTO qualityRatingComponentDTO4 = new OASQualityRatingComponentDTO();

        System.assert(qualityRatingComponentDTO1.equals(qualityRatingComponentDTO2));
        System.assert(qualityRatingComponentDTO2.equals(qualityRatingComponentDTO1));
        System.assert(qualityRatingComponentDTO3.equals(qualityRatingComponentDTO4));
        System.assert(qualityRatingComponentDTO4.equals(qualityRatingComponentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQualityRatingComponentDTO qualityRatingComponentDTO1 = OASQualityRatingComponentDTO.getExample();
        OASQualityRatingComponentDTO qualityRatingComponentDTO2 = new OASQualityRatingComponentDTO();

        System.assertEquals(false, qualityRatingComponentDTO1.equals('foo'));
        System.assertEquals(false, qualityRatingComponentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQualityRatingComponentDTO qualityRatingComponentDTO1 = OASQualityRatingComponentDTO.getExample();
        OASQualityRatingComponentDTO qualityRatingComponentDTO2 = new OASQualityRatingComponentDTO();
        OASQualityRatingComponentDTO qualityRatingComponentDTO3;

        System.assertEquals(false, qualityRatingComponentDTO1.equals(qualityRatingComponentDTO3));
        System.assertEquals(false, qualityRatingComponentDTO2.equals(qualityRatingComponentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQualityRatingComponentDTO qualityRatingComponentDTO1 = OASQualityRatingComponentDTO.getExample();
        OASQualityRatingComponentDTO qualityRatingComponentDTO2 = new OASQualityRatingComponentDTO();

        System.assertEquals(qualityRatingComponentDTO1.hashCode(), qualityRatingComponentDTO1.hashCode());
        System.assertEquals(qualityRatingComponentDTO2.hashCode(), qualityRatingComponentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQualityRatingComponentDTO qualityRatingComponentDTO1 = OASQualityRatingComponentDTO.getExample();
        OASQualityRatingComponentDTO qualityRatingComponentDTO2 = OASQualityRatingComponentDTO.getExample();
        OASQualityRatingComponentDTO qualityRatingComponentDTO3 = new OASQualityRatingComponentDTO();
        OASQualityRatingComponentDTO qualityRatingComponentDTO4 = new OASQualityRatingComponentDTO();

        System.assert(qualityRatingComponentDTO1.equals(qualityRatingComponentDTO2));
        System.assert(qualityRatingComponentDTO3.equals(qualityRatingComponentDTO4));
        System.assertEquals(qualityRatingComponentDTO1.hashCode(), qualityRatingComponentDTO2.hashCode());
        System.assertEquals(qualityRatingComponentDTO3.hashCode(), qualityRatingComponentDTO4.hashCode());
    }
}
