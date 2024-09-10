@isTest
private class OASOrderDeliveryApiTest {
    /**
     * Информация о покупателе — физическом лице
     *
     * Возвращает информацию о покупателе по идентификатору заказа.\n\n{% note info &quot;&quot; %}\n\nЧтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).\n\n{% endnote %}\n\nПолучить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.\n\nЕсли у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).\n\n|**⚙️ Лимит:** 3 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderBuyerInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASOrderDeliveryApi api;
        OASGetOrderBuyerInfoResponse response;
        OASGetOrderBuyerInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderDeliveryApi(client);

        js = JSON.serialize(OASGetOrderBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderBuyerInfoResponse.getExample();
        response = (OASGetOrderBuyerInfoResponse) api.getOrderBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderBuyerInfoResponse.getExample();
        response = (OASGetOrderBuyerInfoResponse) api.getOrderBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderBuyerInfoResponse.getExample();
        response = (OASGetOrderBuyerInfoResponse) api.getOrderBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderBuyerInfoResponse.getExample();
        response = (OASGetOrderBuyerInfoResponse) api.getOrderBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderBuyerInfoResponse.getExample();
        response = (OASGetOrderBuyerInfoResponse) api.getOrderBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderBuyerInfoResponse.getExample();
        response = (OASGetOrderBuyerInfoResponse) api.getOrderBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderBuyerInfoResponse.getExample();
        response = (OASGetOrderBuyerInfoResponse) api.getOrderBuyerInfo(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение даты доставки заказа
     *
     * Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void setOrderDeliveryDateTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSSetOrderDeliveryDateRequest' => ''
        };

        OASClient client;
        OASOrderDeliveryApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderDeliveryApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryDate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryDate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryDate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryDate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryDate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryDate(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryDate(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача трек‑номера посылки
     *
     * {% note warning &quot;Этот запрос только для DBS&quot; %}\n\nВы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.\n\n{% endnote %}\n\nПередает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.\n\nПередать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void setOrderDeliveryTrackCodeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSSetOrderDeliveryTrackCodeRequest' => ''
        };

        OASClient client;
        OASOrderDeliveryApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderDeliveryApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryTrackCode(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryTrackCode(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryTrackCode(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryTrackCode(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryTrackCode(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryTrackCode(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setOrderDeliveryTrackCode(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Продление срока хранения заказа
     *
     * Продлевает срок хранения заказа в пункте выдачи продавца.\n\nЗаказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.\n\nНовый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOrderStorageLimitTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSUpdateOrderStorageLimitRequest' => ''
        };

        OASClient client;
        OASOrderDeliveryApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderDeliveryApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOrderStorageLimit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOrderStorageLimit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOrderStorageLimit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOrderStorageLimit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOrderStorageLimit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOrderStorageLimit(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOrderStorageLimit(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача кода подтверждения
     *
     * Отправляет Маркету код подтверждения для его проверки.\n\nКод подтверждает передачу заказа или невыкупа:\n\n* курьеру — курьер должен назвать магазину код;\n* магазину — магазин называет код курьеру.\n\nЕсли магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.\n\nЕсли у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.\n\nВозможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.\n\nПараметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void verifyOrderEacTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSVerifyOrderEacRequest' => ''
        };

        OASClient client;
        OASOrderDeliveryApi api;
        OASVerifyOrderEacResponse response;
        OASVerifyOrderEacResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrderDeliveryApi(client);

        js = JSON.serialize(OASVerifyOrderEacResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVerifyOrderEacResponse.getExample();
        response = (OASVerifyOrderEacResponse) api.verifyOrderEac(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASVerifyOrderEacResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVerifyOrderEacResponse.getExample();
        response = (OASVerifyOrderEacResponse) api.verifyOrderEac(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASVerifyOrderEacResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVerifyOrderEacResponse.getExample();
        response = (OASVerifyOrderEacResponse) api.verifyOrderEac(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASVerifyOrderEacResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVerifyOrderEacResponse.getExample();
        response = (OASVerifyOrderEacResponse) api.verifyOrderEac(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASVerifyOrderEacResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVerifyOrderEacResponse.getExample();
        response = (OASVerifyOrderEacResponse) api.verifyOrderEac(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASVerifyOrderEacResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVerifyOrderEacResponse.getExample();
        response = (OASVerifyOrderEacResponse) api.verifyOrderEac(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASVerifyOrderEacResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVerifyOrderEacResponse.getExample();
        response = (OASVerifyOrderEacResponse) api.verifyOrderEac(params);
        System.assertEquals(expectedResponse, response);
    }
}