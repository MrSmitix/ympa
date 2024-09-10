@isTest
private class OASUnitDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUnitDTO unitDTO1 = OASUnitDTO.getExample();
        OASUnitDTO unitDTO2 = unitDTO1;
        OASUnitDTO unitDTO3 = new OASUnitDTO();
        OASUnitDTO unitDTO4 = unitDTO3;

        System.assert(unitDTO1.equals(unitDTO2));
        System.assert(unitDTO2.equals(unitDTO1));
        System.assert(unitDTO1.equals(unitDTO1));
        System.assert(unitDTO3.equals(unitDTO4));
        System.assert(unitDTO4.equals(unitDTO3));
        System.assert(unitDTO3.equals(unitDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUnitDTO unitDTO1 = OASUnitDTO.getExample();
        OASUnitDTO unitDTO2 = OASUnitDTO.getExample();
        OASUnitDTO unitDTO3 = new OASUnitDTO();
        OASUnitDTO unitDTO4 = new OASUnitDTO();

        System.assert(unitDTO1.equals(unitDTO2));
        System.assert(unitDTO2.equals(unitDTO1));
        System.assert(unitDTO3.equals(unitDTO4));
        System.assert(unitDTO4.equals(unitDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUnitDTO unitDTO1 = OASUnitDTO.getExample();
        OASUnitDTO unitDTO2 = new OASUnitDTO();

        System.assertEquals(false, unitDTO1.equals('foo'));
        System.assertEquals(false, unitDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUnitDTO unitDTO1 = OASUnitDTO.getExample();
        OASUnitDTO unitDTO2 = new OASUnitDTO();
        OASUnitDTO unitDTO3;

        System.assertEquals(false, unitDTO1.equals(unitDTO3));
        System.assertEquals(false, unitDTO2.equals(unitDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUnitDTO unitDTO1 = OASUnitDTO.getExample();
        OASUnitDTO unitDTO2 = new OASUnitDTO();

        System.assertEquals(unitDTO1.hashCode(), unitDTO1.hashCode());
        System.assertEquals(unitDTO2.hashCode(), unitDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUnitDTO unitDTO1 = OASUnitDTO.getExample();
        OASUnitDTO unitDTO2 = OASUnitDTO.getExample();
        OASUnitDTO unitDTO3 = new OASUnitDTO();
        OASUnitDTO unitDTO4 = new OASUnitDTO();

        System.assert(unitDTO1.equals(unitDTO2));
        System.assert(unitDTO3.equals(unitDTO4));
        System.assertEquals(unitDTO1.hashCode(), unitDTO2.hashCode());
        System.assertEquals(unitDTO3.hashCode(), unitDTO4.hashCode());
    }
}
