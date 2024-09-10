@isTest
private class OASPalletsCountDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPalletsCountDTO palletsCountDTO1 = OASPalletsCountDTO.getExample();
        OASPalletsCountDTO palletsCountDTO2 = palletsCountDTO1;
        OASPalletsCountDTO palletsCountDTO3 = new OASPalletsCountDTO();
        OASPalletsCountDTO palletsCountDTO4 = palletsCountDTO3;

        System.assert(palletsCountDTO1.equals(palletsCountDTO2));
        System.assert(palletsCountDTO2.equals(palletsCountDTO1));
        System.assert(palletsCountDTO1.equals(palletsCountDTO1));
        System.assert(palletsCountDTO3.equals(palletsCountDTO4));
        System.assert(palletsCountDTO4.equals(palletsCountDTO3));
        System.assert(palletsCountDTO3.equals(palletsCountDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPalletsCountDTO palletsCountDTO1 = OASPalletsCountDTO.getExample();
        OASPalletsCountDTO palletsCountDTO2 = OASPalletsCountDTO.getExample();
        OASPalletsCountDTO palletsCountDTO3 = new OASPalletsCountDTO();
        OASPalletsCountDTO palletsCountDTO4 = new OASPalletsCountDTO();

        System.assert(palletsCountDTO1.equals(palletsCountDTO2));
        System.assert(palletsCountDTO2.equals(palletsCountDTO1));
        System.assert(palletsCountDTO3.equals(palletsCountDTO4));
        System.assert(palletsCountDTO4.equals(palletsCountDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPalletsCountDTO palletsCountDTO1 = OASPalletsCountDTO.getExample();
        OASPalletsCountDTO palletsCountDTO2 = new OASPalletsCountDTO();

        System.assertEquals(false, palletsCountDTO1.equals('foo'));
        System.assertEquals(false, palletsCountDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPalletsCountDTO palletsCountDTO1 = OASPalletsCountDTO.getExample();
        OASPalletsCountDTO palletsCountDTO2 = new OASPalletsCountDTO();
        OASPalletsCountDTO palletsCountDTO3;

        System.assertEquals(false, palletsCountDTO1.equals(palletsCountDTO3));
        System.assertEquals(false, palletsCountDTO2.equals(palletsCountDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPalletsCountDTO palletsCountDTO1 = OASPalletsCountDTO.getExample();
        OASPalletsCountDTO palletsCountDTO2 = new OASPalletsCountDTO();

        System.assertEquals(palletsCountDTO1.hashCode(), palletsCountDTO1.hashCode());
        System.assertEquals(palletsCountDTO2.hashCode(), palletsCountDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPalletsCountDTO palletsCountDTO1 = OASPalletsCountDTO.getExample();
        OASPalletsCountDTO palletsCountDTO2 = OASPalletsCountDTO.getExample();
        OASPalletsCountDTO palletsCountDTO3 = new OASPalletsCountDTO();
        OASPalletsCountDTO palletsCountDTO4 = new OASPalletsCountDTO();

        System.assert(palletsCountDTO1.equals(palletsCountDTO2));
        System.assert(palletsCountDTO3.equals(palletsCountDTO4));
        System.assertEquals(palletsCountDTO1.hashCode(), palletsCountDTO2.hashCode());
        System.assertEquals(palletsCountDTO3.hashCode(), palletsCountDTO4.hashCode());
    }
}
