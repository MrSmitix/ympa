@isTest
private class OASGetChatsInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetChatsInfoDTO getChatsInfoDTO1 = OASGetChatsInfoDTO.getExample();
        OASGetChatsInfoDTO getChatsInfoDTO2 = getChatsInfoDTO1;
        OASGetChatsInfoDTO getChatsInfoDTO3 = new OASGetChatsInfoDTO();
        OASGetChatsInfoDTO getChatsInfoDTO4 = getChatsInfoDTO3;

        System.assert(getChatsInfoDTO1.equals(getChatsInfoDTO2));
        System.assert(getChatsInfoDTO2.equals(getChatsInfoDTO1));
        System.assert(getChatsInfoDTO1.equals(getChatsInfoDTO1));
        System.assert(getChatsInfoDTO3.equals(getChatsInfoDTO4));
        System.assert(getChatsInfoDTO4.equals(getChatsInfoDTO3));
        System.assert(getChatsInfoDTO3.equals(getChatsInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetChatsInfoDTO getChatsInfoDTO1 = OASGetChatsInfoDTO.getExample();
        OASGetChatsInfoDTO getChatsInfoDTO2 = OASGetChatsInfoDTO.getExample();
        OASGetChatsInfoDTO getChatsInfoDTO3 = new OASGetChatsInfoDTO();
        OASGetChatsInfoDTO getChatsInfoDTO4 = new OASGetChatsInfoDTO();

        System.assert(getChatsInfoDTO1.equals(getChatsInfoDTO2));
        System.assert(getChatsInfoDTO2.equals(getChatsInfoDTO1));
        System.assert(getChatsInfoDTO3.equals(getChatsInfoDTO4));
        System.assert(getChatsInfoDTO4.equals(getChatsInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetChatsInfoDTO getChatsInfoDTO1 = OASGetChatsInfoDTO.getExample();
        OASGetChatsInfoDTO getChatsInfoDTO2 = new OASGetChatsInfoDTO();

        System.assertEquals(false, getChatsInfoDTO1.equals('foo'));
        System.assertEquals(false, getChatsInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetChatsInfoDTO getChatsInfoDTO1 = OASGetChatsInfoDTO.getExample();
        OASGetChatsInfoDTO getChatsInfoDTO2 = new OASGetChatsInfoDTO();
        OASGetChatsInfoDTO getChatsInfoDTO3;

        System.assertEquals(false, getChatsInfoDTO1.equals(getChatsInfoDTO3));
        System.assertEquals(false, getChatsInfoDTO2.equals(getChatsInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetChatsInfoDTO getChatsInfoDTO1 = OASGetChatsInfoDTO.getExample();
        OASGetChatsInfoDTO getChatsInfoDTO2 = new OASGetChatsInfoDTO();

        System.assertEquals(getChatsInfoDTO1.hashCode(), getChatsInfoDTO1.hashCode());
        System.assertEquals(getChatsInfoDTO2.hashCode(), getChatsInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetChatsInfoDTO getChatsInfoDTO1 = OASGetChatsInfoDTO.getExample();
        OASGetChatsInfoDTO getChatsInfoDTO2 = OASGetChatsInfoDTO.getExample();
        OASGetChatsInfoDTO getChatsInfoDTO3 = new OASGetChatsInfoDTO();
        OASGetChatsInfoDTO getChatsInfoDTO4 = new OASGetChatsInfoDTO();

        System.assert(getChatsInfoDTO1.equals(getChatsInfoDTO2));
        System.assert(getChatsInfoDTO3.equals(getChatsInfoDTO4));
        System.assertEquals(getChatsInfoDTO1.hashCode(), getChatsInfoDTO2.hashCode());
        System.assertEquals(getChatsInfoDTO3.hashCode(), getChatsInfoDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetChatsInfoDTO getChatsInfoDTO = new OASGetChatsInfoDTO();
        System.assertEquals(new List<OASGetChatInfoDTO>(), getChatsInfoDTO.chats);
        System.assertEquals(null, getChatsInfoDTO.paging);
    }
}
