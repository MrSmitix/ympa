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

class FeedsController extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getFeeds
     *
     * Список прайс-листов магазина.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     * @deprecated
     */
    public function getFeeds($campaignId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getFeeds as a get method ?');
    }
    /**
     * Operation getFeed
     *
     * Информация о прайс-листе.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $feedId Идентификатор прайс-листа. (required)
     *
     * @return Http response
     * @deprecated
     */
    public function getFeed($campaignId, $feedId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getFeed as a get method ?');
    }
    /**
     * Operation getFeedIndexLogs
     *
     * Отчет по индексации прайс-листа.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $feedId Идентификатор прайс-листа. (required)
     *
     * @return Http response
     * @deprecated
     */
    public function getFeedIndexLogs($campaignId, $feedId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getFeedIndexLogs as a get method ?');
    }
    /**
     * Operation setFeedParams
     *
     * Изменение параметров прайс-листа.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $feedId Идентификатор прайс-листа. (required)
     *
     * @return Http response
     * @deprecated
     */
    public function setFeedParams($campaignId, $feedId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing setFeedParams as a post method ?');
    }
    /**
     * Operation refreshFeed
     *
     * Сообщить, что прайс-лист обновился.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $feedId Идентификатор прайс-листа. (required)
     *
     * @return Http response
     * @deprecated
     */
    public function refreshFeed($campaignId, $feedId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing refreshFeed as a post method ?');
    }
}
