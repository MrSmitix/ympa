@isTest
private class OASFeedPublicationPriceAndStockUpdatTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO1 = OASFeedPublicationPriceAndStockUpdat.getExample();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO2 = feedPublicationPriceAndStockUpdateDTO1;
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO3 = new OASFeedPublicationPriceAndStockUpdat();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO4 = feedPublicationPriceAndStockUpdateDTO3;

        System.assert(feedPublicationPriceAndStockUpdateDTO1.equals(feedPublicationPriceAndStockUpdateDTO2));
        System.assert(feedPublicationPriceAndStockUpdateDTO2.equals(feedPublicationPriceAndStockUpdateDTO1));
        System.assert(feedPublicationPriceAndStockUpdateDTO1.equals(feedPublicationPriceAndStockUpdateDTO1));
        System.assert(feedPublicationPriceAndStockUpdateDTO3.equals(feedPublicationPriceAndStockUpdateDTO4));
        System.assert(feedPublicationPriceAndStockUpdateDTO4.equals(feedPublicationPriceAndStockUpdateDTO3));
        System.assert(feedPublicationPriceAndStockUpdateDTO3.equals(feedPublicationPriceAndStockUpdateDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO1 = OASFeedPublicationPriceAndStockUpdat.getExample();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO2 = OASFeedPublicationPriceAndStockUpdat.getExample();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO3 = new OASFeedPublicationPriceAndStockUpdat();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO4 = new OASFeedPublicationPriceAndStockUpdat();

        System.assert(feedPublicationPriceAndStockUpdateDTO1.equals(feedPublicationPriceAndStockUpdateDTO2));
        System.assert(feedPublicationPriceAndStockUpdateDTO2.equals(feedPublicationPriceAndStockUpdateDTO1));
        System.assert(feedPublicationPriceAndStockUpdateDTO3.equals(feedPublicationPriceAndStockUpdateDTO4));
        System.assert(feedPublicationPriceAndStockUpdateDTO4.equals(feedPublicationPriceAndStockUpdateDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO1 = OASFeedPublicationPriceAndStockUpdat.getExample();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO2 = new OASFeedPublicationPriceAndStockUpdat();

        System.assertEquals(false, feedPublicationPriceAndStockUpdateDTO1.equals('foo'));
        System.assertEquals(false, feedPublicationPriceAndStockUpdateDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO1 = OASFeedPublicationPriceAndStockUpdat.getExample();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO2 = new OASFeedPublicationPriceAndStockUpdat();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO3;

        System.assertEquals(false, feedPublicationPriceAndStockUpdateDTO1.equals(feedPublicationPriceAndStockUpdateDTO3));
        System.assertEquals(false, feedPublicationPriceAndStockUpdateDTO2.equals(feedPublicationPriceAndStockUpdateDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO1 = OASFeedPublicationPriceAndStockUpdat.getExample();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO2 = new OASFeedPublicationPriceAndStockUpdat();

        System.assertEquals(feedPublicationPriceAndStockUpdateDTO1.hashCode(), feedPublicationPriceAndStockUpdateDTO1.hashCode());
        System.assertEquals(feedPublicationPriceAndStockUpdateDTO2.hashCode(), feedPublicationPriceAndStockUpdateDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO1 = OASFeedPublicationPriceAndStockUpdat.getExample();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO2 = OASFeedPublicationPriceAndStockUpdat.getExample();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO3 = new OASFeedPublicationPriceAndStockUpdat();
        OASFeedPublicationPriceAndStockUpdat feedPublicationPriceAndStockUpdateDTO4 = new OASFeedPublicationPriceAndStockUpdat();

        System.assert(feedPublicationPriceAndStockUpdateDTO1.equals(feedPublicationPriceAndStockUpdateDTO2));
        System.assert(feedPublicationPriceAndStockUpdateDTO3.equals(feedPublicationPriceAndStockUpdateDTO4));
        System.assertEquals(feedPublicationPriceAndStockUpdateDTO1.hashCode(), feedPublicationPriceAndStockUpdateDTO2.hashCode());
        System.assertEquals(feedPublicationPriceAndStockUpdateDTO3.hashCode(), feedPublicationPriceAndStockUpdateDTO4.hashCode());
    }
}
