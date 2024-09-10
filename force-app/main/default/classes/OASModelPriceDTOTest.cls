@isTest
private class OASModelPriceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASModelPriceDTO modelPriceDTO1 = OASModelPriceDTO.getExample();
        OASModelPriceDTO modelPriceDTO2 = modelPriceDTO1;
        OASModelPriceDTO modelPriceDTO3 = new OASModelPriceDTO();
        OASModelPriceDTO modelPriceDTO4 = modelPriceDTO3;

        System.assert(modelPriceDTO1.equals(modelPriceDTO2));
        System.assert(modelPriceDTO2.equals(modelPriceDTO1));
        System.assert(modelPriceDTO1.equals(modelPriceDTO1));
        System.assert(modelPriceDTO3.equals(modelPriceDTO4));
        System.assert(modelPriceDTO4.equals(modelPriceDTO3));
        System.assert(modelPriceDTO3.equals(modelPriceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModelPriceDTO modelPriceDTO1 = OASModelPriceDTO.getExample();
        OASModelPriceDTO modelPriceDTO2 = OASModelPriceDTO.getExample();
        OASModelPriceDTO modelPriceDTO3 = new OASModelPriceDTO();
        OASModelPriceDTO modelPriceDTO4 = new OASModelPriceDTO();

        System.assert(modelPriceDTO1.equals(modelPriceDTO2));
        System.assert(modelPriceDTO2.equals(modelPriceDTO1));
        System.assert(modelPriceDTO3.equals(modelPriceDTO4));
        System.assert(modelPriceDTO4.equals(modelPriceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModelPriceDTO modelPriceDTO1 = OASModelPriceDTO.getExample();
        OASModelPriceDTO modelPriceDTO2 = new OASModelPriceDTO();

        System.assertEquals(false, modelPriceDTO1.equals('foo'));
        System.assertEquals(false, modelPriceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModelPriceDTO modelPriceDTO1 = OASModelPriceDTO.getExample();
        OASModelPriceDTO modelPriceDTO2 = new OASModelPriceDTO();
        OASModelPriceDTO modelPriceDTO3;

        System.assertEquals(false, modelPriceDTO1.equals(modelPriceDTO3));
        System.assertEquals(false, modelPriceDTO2.equals(modelPriceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModelPriceDTO modelPriceDTO1 = OASModelPriceDTO.getExample();
        OASModelPriceDTO modelPriceDTO2 = new OASModelPriceDTO();

        System.assertEquals(modelPriceDTO1.hashCode(), modelPriceDTO1.hashCode());
        System.assertEquals(modelPriceDTO2.hashCode(), modelPriceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModelPriceDTO modelPriceDTO1 = OASModelPriceDTO.getExample();
        OASModelPriceDTO modelPriceDTO2 = OASModelPriceDTO.getExample();
        OASModelPriceDTO modelPriceDTO3 = new OASModelPriceDTO();
        OASModelPriceDTO modelPriceDTO4 = new OASModelPriceDTO();

        System.assert(modelPriceDTO1.equals(modelPriceDTO2));
        System.assert(modelPriceDTO3.equals(modelPriceDTO4));
        System.assertEquals(modelPriceDTO1.hashCode(), modelPriceDTO2.hashCode());
        System.assertEquals(modelPriceDTO3.hashCode(), modelPriceDTO4.hashCode());
    }
}
