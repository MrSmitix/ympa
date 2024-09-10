@isTest
private class OASTurnoverDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASTurnoverDTO turnoverDTO1 = OASTurnoverDTO.getExample();
        OASTurnoverDTO turnoverDTO2 = turnoverDTO1;
        OASTurnoverDTO turnoverDTO3 = new OASTurnoverDTO();
        OASTurnoverDTO turnoverDTO4 = turnoverDTO3;

        System.assert(turnoverDTO1.equals(turnoverDTO2));
        System.assert(turnoverDTO2.equals(turnoverDTO1));
        System.assert(turnoverDTO1.equals(turnoverDTO1));
        System.assert(turnoverDTO3.equals(turnoverDTO4));
        System.assert(turnoverDTO4.equals(turnoverDTO3));
        System.assert(turnoverDTO3.equals(turnoverDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTurnoverDTO turnoverDTO1 = OASTurnoverDTO.getExample();
        OASTurnoverDTO turnoverDTO2 = OASTurnoverDTO.getExample();
        OASTurnoverDTO turnoverDTO3 = new OASTurnoverDTO();
        OASTurnoverDTO turnoverDTO4 = new OASTurnoverDTO();

        System.assert(turnoverDTO1.equals(turnoverDTO2));
        System.assert(turnoverDTO2.equals(turnoverDTO1));
        System.assert(turnoverDTO3.equals(turnoverDTO4));
        System.assert(turnoverDTO4.equals(turnoverDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTurnoverDTO turnoverDTO1 = OASTurnoverDTO.getExample();
        OASTurnoverDTO turnoverDTO2 = new OASTurnoverDTO();

        System.assertEquals(false, turnoverDTO1.equals('foo'));
        System.assertEquals(false, turnoverDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTurnoverDTO turnoverDTO1 = OASTurnoverDTO.getExample();
        OASTurnoverDTO turnoverDTO2 = new OASTurnoverDTO();
        OASTurnoverDTO turnoverDTO3;

        System.assertEquals(false, turnoverDTO1.equals(turnoverDTO3));
        System.assertEquals(false, turnoverDTO2.equals(turnoverDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTurnoverDTO turnoverDTO1 = OASTurnoverDTO.getExample();
        OASTurnoverDTO turnoverDTO2 = new OASTurnoverDTO();

        System.assertEquals(turnoverDTO1.hashCode(), turnoverDTO1.hashCode());
        System.assertEquals(turnoverDTO2.hashCode(), turnoverDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTurnoverDTO turnoverDTO1 = OASTurnoverDTO.getExample();
        OASTurnoverDTO turnoverDTO2 = OASTurnoverDTO.getExample();
        OASTurnoverDTO turnoverDTO3 = new OASTurnoverDTO();
        OASTurnoverDTO turnoverDTO4 = new OASTurnoverDTO();

        System.assert(turnoverDTO1.equals(turnoverDTO2));
        System.assert(turnoverDTO3.equals(turnoverDTO4));
        System.assertEquals(turnoverDTO1.hashCode(), turnoverDTO2.hashCode());
        System.assertEquals(turnoverDTO3.hashCode(), turnoverDTO4.hashCode());
    }
}
