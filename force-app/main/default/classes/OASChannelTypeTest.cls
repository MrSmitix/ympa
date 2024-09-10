@isTest
private class OASChannelTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASChannelType channelType1 = OASChannelType.getExample();
        OASChannelType channelType2 = channelType1;
        OASChannelType channelType3 = new OASChannelType();
        OASChannelType channelType4 = channelType3;

        System.assert(channelType1.equals(channelType2));
        System.assert(channelType2.equals(channelType1));
        System.assert(channelType1.equals(channelType1));
        System.assert(channelType3.equals(channelType4));
        System.assert(channelType4.equals(channelType3));
        System.assert(channelType3.equals(channelType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChannelType channelType1 = OASChannelType.getExample();
        OASChannelType channelType2 = OASChannelType.getExample();
        OASChannelType channelType3 = new OASChannelType();
        OASChannelType channelType4 = new OASChannelType();

        System.assert(channelType1.equals(channelType2));
        System.assert(channelType2.equals(channelType1));
        System.assert(channelType3.equals(channelType4));
        System.assert(channelType4.equals(channelType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChannelType channelType1 = OASChannelType.getExample();
        OASChannelType channelType2 = new OASChannelType();

        System.assertEquals(false, channelType1.equals('foo'));
        System.assertEquals(false, channelType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChannelType channelType1 = OASChannelType.getExample();
        OASChannelType channelType2 = new OASChannelType();
        OASChannelType channelType3;

        System.assertEquals(false, channelType1.equals(channelType3));
        System.assertEquals(false, channelType2.equals(channelType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChannelType channelType1 = OASChannelType.getExample();
        OASChannelType channelType2 = new OASChannelType();

        System.assertEquals(channelType1.hashCode(), channelType1.hashCode());
        System.assertEquals(channelType2.hashCode(), channelType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChannelType channelType1 = OASChannelType.getExample();
        OASChannelType channelType2 = OASChannelType.getExample();
        OASChannelType channelType3 = new OASChannelType();
        OASChannelType channelType4 = new OASChannelType();

        System.assert(channelType1.equals(channelType2));
        System.assert(channelType3.equals(channelType4));
        System.assertEquals(channelType1.hashCode(), channelType2.hashCode());
        System.assertEquals(channelType3.hashCode(), channelType4.hashCode());
    }
}
