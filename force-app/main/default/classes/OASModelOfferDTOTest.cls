@isTest
private class OASModelOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASModelOfferDTO modelOfferDTO1 = OASModelOfferDTO.getExample();
        OASModelOfferDTO modelOfferDTO2 = modelOfferDTO1;
        OASModelOfferDTO modelOfferDTO3 = new OASModelOfferDTO();
        OASModelOfferDTO modelOfferDTO4 = modelOfferDTO3;

        System.assert(modelOfferDTO1.equals(modelOfferDTO2));
        System.assert(modelOfferDTO2.equals(modelOfferDTO1));
        System.assert(modelOfferDTO1.equals(modelOfferDTO1));
        System.assert(modelOfferDTO3.equals(modelOfferDTO4));
        System.assert(modelOfferDTO4.equals(modelOfferDTO3));
        System.assert(modelOfferDTO3.equals(modelOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModelOfferDTO modelOfferDTO1 = OASModelOfferDTO.getExample();
        OASModelOfferDTO modelOfferDTO2 = OASModelOfferDTO.getExample();
        OASModelOfferDTO modelOfferDTO3 = new OASModelOfferDTO();
        OASModelOfferDTO modelOfferDTO4 = new OASModelOfferDTO();

        System.assert(modelOfferDTO1.equals(modelOfferDTO2));
        System.assert(modelOfferDTO2.equals(modelOfferDTO1));
        System.assert(modelOfferDTO3.equals(modelOfferDTO4));
        System.assert(modelOfferDTO4.equals(modelOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModelOfferDTO modelOfferDTO1 = OASModelOfferDTO.getExample();
        OASModelOfferDTO modelOfferDTO2 = new OASModelOfferDTO();

        System.assertEquals(false, modelOfferDTO1.equals('foo'));
        System.assertEquals(false, modelOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModelOfferDTO modelOfferDTO1 = OASModelOfferDTO.getExample();
        OASModelOfferDTO modelOfferDTO2 = new OASModelOfferDTO();
        OASModelOfferDTO modelOfferDTO3;

        System.assertEquals(false, modelOfferDTO1.equals(modelOfferDTO3));
        System.assertEquals(false, modelOfferDTO2.equals(modelOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModelOfferDTO modelOfferDTO1 = OASModelOfferDTO.getExample();
        OASModelOfferDTO modelOfferDTO2 = new OASModelOfferDTO();

        System.assertEquals(modelOfferDTO1.hashCode(), modelOfferDTO1.hashCode());
        System.assertEquals(modelOfferDTO2.hashCode(), modelOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModelOfferDTO modelOfferDTO1 = OASModelOfferDTO.getExample();
        OASModelOfferDTO modelOfferDTO2 = OASModelOfferDTO.getExample();
        OASModelOfferDTO modelOfferDTO3 = new OASModelOfferDTO();
        OASModelOfferDTO modelOfferDTO4 = new OASModelOfferDTO();

        System.assert(modelOfferDTO1.equals(modelOfferDTO2));
        System.assert(modelOfferDTO3.equals(modelOfferDTO4));
        System.assertEquals(modelOfferDTO1.hashCode(), modelOfferDTO2.hashCode());
        System.assertEquals(modelOfferDTO3.hashCode(), modelOfferDTO4.hashCode());
    }
}
