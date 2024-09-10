<?php

/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 * PHP version 7.2.5
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Source files are located at:
 *
 * > https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/resources/php-laravel/
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class OrdersController extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getOrders
     *
     * Информация о нескольких заказах.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function getOrders($campaignId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getOrders as a get method ?');
    }
    /**
     * Operation updateOrderStatuses
     *
     * Изменение статусов нескольких заказов.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function updateOrderStatuses($campaignId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateOrderStatuses as a post method ?');
    }
    /**
     * Operation getOrder
     *
     * Информация об одном заказе.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $orderId Идентификатор заказа. (required)
     *
     * @return Http response
     */
    public function getOrder($campaignId, $orderId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getOrder as a get method ?');
    }
    /**
     * Operation setOrderBoxLayout
     *
     * Подготовка заказа.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $orderId Идентификатор заказа. (required)
     *
     * @return Http response
     */
    public function setOrderBoxLayout($campaignId, $orderId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing setOrderBoxLayout as a put method ?');
    }
    /**
     * Operation acceptOrderCancellation
     *
     * Отмена заказа покупателем.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $orderId Идентификатор заказа. (required)
     *
     * @return Http response
     */
    public function acceptOrderCancellation($campaignId, $orderId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing acceptOrderCancellation as a put method ?');
    }
    /**
     * Operation provideOrderDigitalCodes
     *
     * Передача ключей цифровых товаров.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $orderId Идентификатор заказа. (required)
     *
     * @return Http response
     */
    public function provideOrderDigitalCodes($campaignId, $orderId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing provideOrderDigitalCodes as a post method ?');
    }
    /**
     * Operation setOrderShipmentBoxes
     *
     * Передача количества грузовых мест в заказе.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $orderId Идентификатор заказа. (required)
     * @param int $shipmentId Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL. (required)
     *
     * @return Http response
     */
    public function setOrderShipmentBoxes($campaignId, $orderId, $shipmentId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing setOrderShipmentBoxes as a put method ?');
    }
    /**
     * Operation provideOrderItemIdentifiers
     *
     * Передача кодов маркировки единиц товара.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $orderId Идентификатор заказа. (required)
     *
     * @return Http response
     */
    public function provideOrderItemIdentifiers($campaignId, $orderId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing provideOrderItemIdentifiers as a put method ?');
    }
    /**
     * Operation updateOrderItems
     *
     * Удаление товара из заказа или уменьшение числа единиц.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $orderId Идентификатор заказа. (required)
     *
     * @return Http response
     */
    public function updateOrderItems($campaignId, $orderId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateOrderItems as a put method ?');
    }
    /**
     * Operation updateOrderStatus
     *
     * Изменение статуса одного заказа.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $orderId Идентификатор заказа. (required)
     *
     * @return Http response
     */
    public function updateOrderStatus($campaignId, $orderId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateOrderStatus as a put method ?');
    }
}
