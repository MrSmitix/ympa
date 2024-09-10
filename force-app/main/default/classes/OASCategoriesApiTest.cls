@isTest
private class OASCategoriesApiTest {
    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.\n\nЕсли вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.\n\nПодробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCategoriesMaxSaleQuantumTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGetCategoriesMaxSaleQuantumReques' => ''
        };

        OASClient client;
        OASCategoriesApi api;
        OASGetCategoriesMaxSaleQuantumRespon response;
        OASGetCategoriesMaxSaleQuantumRespon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCategoriesApi(client);

        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Дерево категорий
     *
     * Возвращает дерево категорий Маркета.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCategoriesTreeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGetCategoriesRequest' => ''
        };

        OASClient client;
        OASCategoriesApi api;
        OASGetCategoriesResponse response;
        OASGetCategoriesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASCategoriesApi(client);

        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);
    }
}