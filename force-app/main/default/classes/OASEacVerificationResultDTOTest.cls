@isTest
private class OASEacVerificationResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASEacVerificationResultDTO eacVerificationResultDTO1 = OASEacVerificationResultDTO.getExample();
        OASEacVerificationResultDTO eacVerificationResultDTO2 = eacVerificationResultDTO1;
        OASEacVerificationResultDTO eacVerificationResultDTO3 = new OASEacVerificationResultDTO();
        OASEacVerificationResultDTO eacVerificationResultDTO4 = eacVerificationResultDTO3;

        System.assert(eacVerificationResultDTO1.equals(eacVerificationResultDTO2));
        System.assert(eacVerificationResultDTO2.equals(eacVerificationResultDTO1));
        System.assert(eacVerificationResultDTO1.equals(eacVerificationResultDTO1));
        System.assert(eacVerificationResultDTO3.equals(eacVerificationResultDTO4));
        System.assert(eacVerificationResultDTO4.equals(eacVerificationResultDTO3));
        System.assert(eacVerificationResultDTO3.equals(eacVerificationResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEacVerificationResultDTO eacVerificationResultDTO1 = OASEacVerificationResultDTO.getExample();
        OASEacVerificationResultDTO eacVerificationResultDTO2 = OASEacVerificationResultDTO.getExample();
        OASEacVerificationResultDTO eacVerificationResultDTO3 = new OASEacVerificationResultDTO();
        OASEacVerificationResultDTO eacVerificationResultDTO4 = new OASEacVerificationResultDTO();

        System.assert(eacVerificationResultDTO1.equals(eacVerificationResultDTO2));
        System.assert(eacVerificationResultDTO2.equals(eacVerificationResultDTO1));
        System.assert(eacVerificationResultDTO3.equals(eacVerificationResultDTO4));
        System.assert(eacVerificationResultDTO4.equals(eacVerificationResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEacVerificationResultDTO eacVerificationResultDTO1 = OASEacVerificationResultDTO.getExample();
        OASEacVerificationResultDTO eacVerificationResultDTO2 = new OASEacVerificationResultDTO();

        System.assertEquals(false, eacVerificationResultDTO1.equals('foo'));
        System.assertEquals(false, eacVerificationResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEacVerificationResultDTO eacVerificationResultDTO1 = OASEacVerificationResultDTO.getExample();
        OASEacVerificationResultDTO eacVerificationResultDTO2 = new OASEacVerificationResultDTO();
        OASEacVerificationResultDTO eacVerificationResultDTO3;

        System.assertEquals(false, eacVerificationResultDTO1.equals(eacVerificationResultDTO3));
        System.assertEquals(false, eacVerificationResultDTO2.equals(eacVerificationResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEacVerificationResultDTO eacVerificationResultDTO1 = OASEacVerificationResultDTO.getExample();
        OASEacVerificationResultDTO eacVerificationResultDTO2 = new OASEacVerificationResultDTO();

        System.assertEquals(eacVerificationResultDTO1.hashCode(), eacVerificationResultDTO1.hashCode());
        System.assertEquals(eacVerificationResultDTO2.hashCode(), eacVerificationResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEacVerificationResultDTO eacVerificationResultDTO1 = OASEacVerificationResultDTO.getExample();
        OASEacVerificationResultDTO eacVerificationResultDTO2 = OASEacVerificationResultDTO.getExample();
        OASEacVerificationResultDTO eacVerificationResultDTO3 = new OASEacVerificationResultDTO();
        OASEacVerificationResultDTO eacVerificationResultDTO4 = new OASEacVerificationResultDTO();

        System.assert(eacVerificationResultDTO1.equals(eacVerificationResultDTO2));
        System.assert(eacVerificationResultDTO3.equals(eacVerificationResultDTO4));
        System.assertEquals(eacVerificationResultDTO1.hashCode(), eacVerificationResultDTO2.hashCode());
        System.assertEquals(eacVerificationResultDTO3.hashCode(), eacVerificationResultDTO4.hashCode());
    }
}
