@isTest
private class OASChatMessagesResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatMessagesResultDTO chatMessagesResultDTO1 = OASChatMessagesResultDTO.getExample();
        OASChatMessagesResultDTO chatMessagesResultDTO2 = chatMessagesResultDTO1;
        OASChatMessagesResultDTO chatMessagesResultDTO3 = new OASChatMessagesResultDTO();
        OASChatMessagesResultDTO chatMessagesResultDTO4 = chatMessagesResultDTO3;

        System.assert(chatMessagesResultDTO1.equals(chatMessagesResultDTO2));
        System.assert(chatMessagesResultDTO2.equals(chatMessagesResultDTO1));
        System.assert(chatMessagesResultDTO1.equals(chatMessagesResultDTO1));
        System.assert(chatMessagesResultDTO3.equals(chatMessagesResultDTO4));
        System.assert(chatMessagesResultDTO4.equals(chatMessagesResultDTO3));
        System.assert(chatMessagesResultDTO3.equals(chatMessagesResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatMessagesResultDTO chatMessagesResultDTO1 = OASChatMessagesResultDTO.getExample();
        OASChatMessagesResultDTO chatMessagesResultDTO2 = OASChatMessagesResultDTO.getExample();
        OASChatMessagesResultDTO chatMessagesResultDTO3 = new OASChatMessagesResultDTO();
        OASChatMessagesResultDTO chatMessagesResultDTO4 = new OASChatMessagesResultDTO();

        System.assert(chatMessagesResultDTO1.equals(chatMessagesResultDTO2));
        System.assert(chatMessagesResultDTO2.equals(chatMessagesResultDTO1));
        System.assert(chatMessagesResultDTO3.equals(chatMessagesResultDTO4));
        System.assert(chatMessagesResultDTO4.equals(chatMessagesResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatMessagesResultDTO chatMessagesResultDTO1 = OASChatMessagesResultDTO.getExample();
        OASChatMessagesResultDTO chatMessagesResultDTO2 = new OASChatMessagesResultDTO();

        System.assertEquals(false, chatMessagesResultDTO1.equals('foo'));
        System.assertEquals(false, chatMessagesResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatMessagesResultDTO chatMessagesResultDTO1 = OASChatMessagesResultDTO.getExample();
        OASChatMessagesResultDTO chatMessagesResultDTO2 = new OASChatMessagesResultDTO();
        OASChatMessagesResultDTO chatMessagesResultDTO3;

        System.assertEquals(false, chatMessagesResultDTO1.equals(chatMessagesResultDTO3));
        System.assertEquals(false, chatMessagesResultDTO2.equals(chatMessagesResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatMessagesResultDTO chatMessagesResultDTO1 = OASChatMessagesResultDTO.getExample();
        OASChatMessagesResultDTO chatMessagesResultDTO2 = new OASChatMessagesResultDTO();

        System.assertEquals(chatMessagesResultDTO1.hashCode(), chatMessagesResultDTO1.hashCode());
        System.assertEquals(chatMessagesResultDTO2.hashCode(), chatMessagesResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatMessagesResultDTO chatMessagesResultDTO1 = OASChatMessagesResultDTO.getExample();
        OASChatMessagesResultDTO chatMessagesResultDTO2 = OASChatMessagesResultDTO.getExample();
        OASChatMessagesResultDTO chatMessagesResultDTO3 = new OASChatMessagesResultDTO();
        OASChatMessagesResultDTO chatMessagesResultDTO4 = new OASChatMessagesResultDTO();

        System.assert(chatMessagesResultDTO1.equals(chatMessagesResultDTO2));
        System.assert(chatMessagesResultDTO3.equals(chatMessagesResultDTO4));
        System.assertEquals(chatMessagesResultDTO1.hashCode(), chatMessagesResultDTO2.hashCode());
        System.assertEquals(chatMessagesResultDTO3.hashCode(), chatMessagesResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChatMessagesResultDTO chatMessagesResultDTO = new OASChatMessagesResultDTO();
        System.assertEquals(new List<OASChatMessageDTO>(), chatMessagesResultDTO.messages);
        System.assertEquals(null, chatMessagesResultDTO.orderId);
        System.assertEquals(null, chatMessagesResultDTO.paging);
    }
}
