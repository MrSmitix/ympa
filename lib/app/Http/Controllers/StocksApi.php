<?php

/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 * PHP version 7.2.5
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class StocksApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getStocks
     *
     * Информация об остатках и оборачиваемости.
     *
     * @param int $campaign_id Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function getStocks($campaign_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getStocks as a post method ?');
    }
    /**
     * Operation updateStocks
     *
     * Передача информации об остатках.
     *
     * @param int $campaign_id Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function updateStocks($campaign_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateStocks as a put method ?');
    }
}
