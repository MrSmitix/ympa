@isTest
private class OASOrdersApiTest {
    /**
     * Отмена заказа покупателем
     *
     * Подтверждает или отклоняет запрос покупателя на отмену заказа, который передан службе доставки.\n\nПокупатель может отменить заказ в течение его обработки или доставки. Если заказ еще обрабатывается (имеет статус PROCESSING), вам не нужно подтверждать отмену заказа — он будет отменен автоматически.\n\nЕсли заказ уже передан службе доставки (принимает статус &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;) и пользователь отменил его, вы можете предупредить службу об отмене в течение 48 часов. Если служба доставки узнала об отмене до передачи заказа покупателю, подтвердите отмену с помощью запроса [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation.md). Если заказ уже доставлен, отклоните отмену с помощью этого же запроса. Тогда у покупателя останется заказ, и деньги за него возвращаться не будут.\n\nЧтобы узнать, какие заказы были отменены в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;, отправьте запрос [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md). В его URL добавьте входной параметр &#x60;onlyWaitingForCancellationApprove&#x3D;true&#x60;. Вы также можете узнать об отмененных заказах в кабинете или через почту — на нее придет уведомление об отмене.\n\nЕсли в течение 48 часов вы не подтвердите или отклоните отмену, заказ будет отменен автоматически.\n\n|**⚙️ Лимит:** 500 запросов в час|\n|-|\n
     */
    @isTest
    private static void acceptOrderCancellationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSAcceptOrderCancellationRequest' => ''
        };

        OASClient client;
        OASOrdersApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.acceptOrderCancellation(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.acceptOrderCancellation(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.acceptOrderCancellation(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.acceptOrderCancellation(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.acceptOrderCancellation(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.acceptOrderCancellation(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.acceptOrderCancellation(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация об одном заказе
     *
     * Возвращает информацию о заказе.\n\nПолучить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASOrdersApi api;
        OASGetOrderResponse response;
        OASGetOrderResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о нескольких заказах
     *
     * Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.\n\nДоступна фильтрация по нескольким характеристикам заказов:\n\n* дате оформления;\n\n* статусу;\n\n* идентификаторам заказов;\n\n* этапу обработки или причине отмены;\n\n* типу (настоящий или тестовый);\n\n* дате отгрузки в службу доставки;\n\n* дате и времени обновления заказа.\n\nИнформация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).\n\nМаксимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.\n\nРезультаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.\n\nПолучить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrdersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderIds' => new List<Long>{123456789L},
            'status' => new Set<OASOrderStatusType>{OASOrderStatusType.getExample()},
            'substatus' => new Set<OASOrderSubstatusType>{OASOrderSubstatusType.getExample()},
            'fromDate' => Date.newInstance(1960, 2, 17),
            'toDate' => Date.newInstance(1960, 2, 17),
            'supplierShipmentDateFrom' => Date.newInstance(1960, 2, 17),
            'supplierShipmentDateTo' => Date.newInstance(1960, 2, 17),
            'updatedAtFrom' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'updatedAtTo' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'dispatchType' => '',
            'fake' => '',
            'hasCis' => '',
            'onlyWaitingForCancellationApprove' => '',
            'onlyEstimatedDelivery' => '',
            'buyerType' => '',
            'page' => '',
            'pageSize' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASOrdersApi api;
        OASGetOrdersResponse response;
        OASGetOrdersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача ключей цифровых товаров
     *
     * Передает ключи цифровых товаров, которые покупатель заказал и оплатил. После выполнения запроса Маркет отправит ему письмо с ключами и инструкциями по активации, а также переведет заказ в финальный статус &#x60;DELIVERED&#x60;.\n\nКлюч нужно передать в течение 30 минут после перехода заказа в статус &#x60;PROCESSING&#x60;.\n\nЕсли в один заказ входят несколько ключей, передавайте их все в одном запросе.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void provideOrderDigitalCodesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSProvideOrderDigitalCodesRequest' => ''
        };

        OASClient client;
        OASOrdersApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.provideOrderDigitalCodes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.provideOrderDigitalCodes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.provideOrderDigitalCodes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.provideOrderDigitalCodes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.provideOrderDigitalCodes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.provideOrderDigitalCodes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.provideOrderDigitalCodes(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача кодов маркировки единиц товара
     *
     * {% note warning &quot;Этот запрос только для DBS&quot; %}\n\nЕсли вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).\n\n{% endnote %}\n\nПередает Маркету коды маркировки для единиц товара в указанном заказе.\n\nПринимаются коды следующих типов:\n\n* Коды «Честного знака».\n* УИН для ювелирных изделий.\n* РНПТ и ГТД для импортных прослеживаемых товаров.\n\n{% note warning %}\n\nПрежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).\n\n{% endnote %}\n\nДля каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void provideOrderItemIdentifiersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSProvideOrderItemIdentifiersReques' => ''
        };

        OASClient client;
        OASOrdersApi api;
        OASProvideOrderItemIdentifiersRespon response;
        OASProvideOrderItemIdentifiersRespon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Подготовка заказа
     *
     * {% note tip &quot;Подходит и для DBS&quot; %}\n\nЗапрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.\n\n{% endnote %}\n\nПозволяет выполнить три операции:\n\n* передать Маркету информацию о распределении товаров по коробкам;\n* передать Маркету коды маркировки для товаров;\n* удалить товар из заказа, если его не оказалось на складе.\n\nЕсли нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.\n\n## Как передать информацию о распределении товаров\n\nВ этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:\n\n* **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.\n\n* **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.\n\n⚠️ Одна коробка не может содержать и товары целиком, и части товаров.\n\n## Как передавать коды маркировки\n\nЕсли в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)\n\nПринимаются коды следующих типов:\n\n* Коды «Честного знака».\n* УИН для ювелирных изделий.\n* РНПТ и ГТД для импортных прослеживаемых товаров.\n\nДля каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.\n\nЕсли товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.\n\n## Как удалить товар из заказа\n\nЧтобы удалить товар из заказа:\n\n1. Добавьте в запрос &#x60;allowRemove: true&#x60;.\n2. Передайте распределение по коробкам без товара, который нужно удалить.\n\n{% note warning &quot;Удаление нельзя отменить&quot; %}\n\nЭта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.\n\n{% endnote %}\n\nЧтобы удалить позицию целиком, не передавайте соответствующий &#x60;OrderBoxLayoutItemDTO&#x60;. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле &#x60;fullCount&#x60;.\n\nНельзя удалить или уменьшить количество товара, если он:\n\n* добавлен по акции;\n* составляет 99% стоимости заказа;\n* единственный товар в заказе.\n\nЕсли вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа &#x60;CANCELLED&#x60; с причиной отмены &#x60;SHOP_FAILED&#x60;.\n\n{% note info &quot;Увеличить заказ нельзя&quot; %}\n\nС помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.\n\n{% endnote %}\n\n## Примеры\n\n{% cut &quot;Товар умещается в коробку&quot; %}\n\nВот как будет выглядеть запрос, если в одной коробке едут:\n\n  * три единицы одного товара, требующего маркировки;\n  * одна единица другого товара, не требущего маркировки.\n\n  &#x60;&#x60;&#x60;json\n  {\n      &quot;boxes&quot;: [\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;fullCount&quot;: 3,\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          },\n                          {\n                              &quot;cis&quot;: &quot;010304109478gftJ14545762!\u001dhGt264&quot;\n                          },\n                          {\n                              &quot;cis&quot;: &quot;010304109478fRs28323ks23!\u001dhet201&quot;\n                          }\n                      ]\n                  },\n                  {\n                      &quot;id&quot;: 654321,\n                      &quot;fullCount&quot;: 1\n                  }\n              ]\n          }\n      ]\n  }\n  &#x60;&#x60;&#x60;\n\n{% endcut %}\n\n{% cut &quot;Товар едет в разных коробках&quot; %}\n\nВот как будет выглядеть запрос, если товар едет в двух коробках:\n\n  &#x60;&#x60;&#x60;json\n  {\n      &quot;boxes&quot;: [\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 1,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          },\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 2,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          }\n      ]\n  }\n  &#x60;&#x60;&#x60;\n\n{% endcut %}\n\n{% cut &quot;Одинаковые товары, где каждый едет в нескольких коробках&quot; %}\n\nВот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:\n\n  &#x60;&#x60;&#x60;json\n  {\n      &quot;boxes&quot;: [\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 1,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          },\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 2,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          },\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 1,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          },\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 2,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          }\n      ]\n  }\n  &#x60;&#x60;&#x60;\n\n{% endcut %}\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void setOrderBoxLayoutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSSetOrderBoxLayoutRequest' => ''
        };

        OASClient client;
        OASOrdersApi api;
        OASSetOrderBoxLayoutResponse response;
        OASSetOrderBoxLayoutResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача количества грузовых мест в заказе
     *
     * {% note warning &quot;Этот запрос только для DBS&quot; %}\n\nЕсли вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).\n\n{% endnote %}\n\nОтгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.\n\nКоличество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).\n\nМетод устроен немного нестандартно: количество задается длиной массива пустых объектов.\n\nРаньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.\n\n{% cut &quot;Как было раньше&quot; %}\n\nСтруктура тела PUT-запроса:\n\n&#x60;&#x60;&#x60;\n{\n  &quot;boxes&quot;:\n  [\n    {\n      &quot;fulfilmentId&quot;: &quot;{string}&quot;,\n      &quot;weight&quot;: {int64},\n      &quot;width&quot;: {int64},\n      &quot;height&quot;: {int64},\n      &quot;depth&quot;: {int64},\n      &quot;items&quot;:\n      [\n        {\n          &quot;id&quot;: {int64},\n          &quot;count&quot;: {int32}\n        },\n        ...\n      ]\n    },\n    ...\n  ]\n}\n&#x60;&#x60;&#x60;\n| **Параметр**  | **Тип**  | **Значение**  |\n| ----------- | ----------- | ----------- |\n| &#x60;boxes&#x60;       |           | Список грузовых мест.       |\n\n**Параметры, вложенные в &#x60;boxes&#x60;**\n| **Параметр**  | **Тип**  | **Значение**  |\n| ----------- | ----------- | ----------- |\n| &#x60;fulfilmentId&#x60;       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: &#x60;номер заказа на Маркете-номер грузового места&#x60;. Например, &#x60;7206821‑1, 7206821‑2&#x60; и т. д. |\n| &#x60;weight&#x60;       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. |\n| &#x60;width&#x60;       | Int64   | Ширина грузового места в сантиметрах.       |\n| &#x60;height&#x60;       | Int64   | Высота грузового места в сантиметрах.       |\n| &#x60;depth&#x60;       | Int64   | Глубина грузового места в сантиметрах.        |\n| &#x60;items&#x60;       | Int64   | Список товаров в грузовом месте.       |\n\n**Параметры, вложенные в &#x60;items&#x60;**\n| **Параметр**  | **Тип**  | **Значение**  |\n| ----------- | ----------- | ----------- |\n| &#x60;id&#x60;       | Int64     | Идентификатор товара в рамках заказа.   |\n| &#x60;count&#x60;    | Int32     | Количество единиц товара в грузовом месте.       |\n\n{% endcut %}\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void setOrderShipmentBoxesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'oaSSetOrderShipmentBoxesRequest' => ''
        };

        OASClient client;
        OASOrdersApi api;
        OASSetOrderShipmentBoxesResponse response;
        OASSetOrderShipmentBoxesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление товара из заказа или уменьшение числа единиц
     *
     * {% note warning &quot;Этот запрос только для DBS&quot; %}\n\nЕсли вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).\n\n{% endnote %}\n\nИзменяет состав заказа, если позволяет выбранная служба доставки, в случаях:\n\n* покупатель уменьшил количество товара;\n* магазин не может поставить все товары в заказе.\n\nДля этого заказ должен находится в статусе &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60;. После передачи статуса &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60; изменить состав невозможно.\n\nЕсли одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте &#x60;count&#x60; параметра &#x60;item&#x60;.\n\nЧтобы полностью удалить товар из заказа:\n\n* передайте значение &#x60;0&#x60;; или\n* не передавайте параметр &#x60;item&#x60;.\n\nНельзя удалить или уменьшить количество товара, если он:\n\n* добавлен по акции;\n* составляет 99% стоимости заказа;\n* единственный товар в заказе.\n\nЕсли необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа &#x60;CANCELLED&#x60; с причиной отмены &#x60;SHOP_FAILED&#x60;.\n\n{% note info &quot;Увеличить заказ нельзя&quot; %}\n\nС помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.\n\n{% endnote %}\n\n**Возврат денег покупателю**\n\nЕсли покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:\n\n* при оплате банковской картой — с момента, когда магазин переведет заказ в статус &#x60;SHIPPED&#x60;;\n\n* при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOrderItemsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSUpdateOrderItemRequest' => ''
        };

        OASClient client;
        OASOrdersApi api;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение статуса одного заказа
     *
     * Изменяет статус заказа. Возможные изменения статусов:\n\n* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этап обработки &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60;.\n* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;CANCELLED&quot;&#x60; с причиной отмены заказа &#x60;&quot;substatus&quot;: &quot;SHOP_FAILED&quot;&#x60;.\n* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;CANCELLED&quot;&#x60; с причиной отмены заказа &#x60;&quot;substatus&quot;: &quot;SHOP_FAILED&quot;&#x60;.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOrderStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSUpdateOrderStatusRequest' => ''
        };

        OASClient client;
        OASOrdersApi api;
        OASUpdateOrderStatusResponse response;
        OASUpdateOrderStatusResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение статусов нескольких заказов
     *
     * Изменяет статусы нескольких заказов.\n\nВозможные изменения статусов:\n\n* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60;и этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этап обработки &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60;.\n* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;CANCELLED&quot;&#x60; с причиной отмены заказа &#x60;&quot;substatus&quot;: &quot;SHOP_FAILED&quot;&#x60;.\n* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;CANCELLED&quot;&#x60; с причиной отмены заказа &#x60;&quot;substatus&quot;: &quot;SHOP_FAILED&quot;&#x60;.\n\nМаксимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOrderStatusesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateOrderStatusesRequest' => ''
        };

        OASClient client;
        OASOrdersApi api;
        OASUpdateOrderStatusesResponse response;
        OASUpdateOrderStatusesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASOrdersApi(client);

        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);
    }
}