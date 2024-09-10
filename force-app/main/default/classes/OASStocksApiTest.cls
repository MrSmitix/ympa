@isTest
private class OASStocksApiTest {
    /**
     * Информация об остатках и оборачиваемости
     *
     * Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).\n\n{% note info &quot;По умолчанию данные по оборачивамости не возращаются&quot; %}\n\nЧтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 100 000 товаров в минуту|\n|-|\n\n[//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.)\n
     */
    @isTest
    private static void getStocksTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetWarehouseStocksRequest' => ''
        };

        OASClient client;
        OASStocksApi api;
        OASGetWarehouseStocksResponse response;
        OASGetWarehouseStocksResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASStocksApi(client);

        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача информации об остатках
     *
     * Передает данные об остатках товаров на витрине.\n\nОбязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 100 000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updateStocksTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateStocksRequest' => ''
        };

        OASClient client;
        OASStocksApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASStocksApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);
    }
}