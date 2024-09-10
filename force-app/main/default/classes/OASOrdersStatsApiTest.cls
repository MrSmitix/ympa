@isTest
private class OASOrdersStatsApiTest {
    /**
     * Детальная информация по заказам
     *
     * Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.\n\n{% note info &quot;&quot; %}\n\nРаньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)\n\n{% endnote %}\n\nВ одном запросе можно получить информацию не более чем по 200 заказам.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrdersStatsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetOrdersStatsRequest' => ''
        };

        OASClient client;
        OASOrdersStatsApi api;
        OASGetOrdersStatsResponse response;
        OASGetOrdersStatsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersStatsApi(client);

        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);
    }
}