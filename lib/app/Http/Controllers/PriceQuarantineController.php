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

class PriceQuarantineController extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getBusinessQuarantineOffers
     *
     * Список товаров, находящихся в карантине по цене в кабинете.
     *
     * @param int $businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function getBusinessQuarantineOffers($businessId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getBusinessQuarantineOffers as a post method ?');
    }
    /**
     * Operation confirmBusinessPrices
     *
     * Удаление товара из карантина по цене в кабинете.
     *
     * @param int $businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function confirmBusinessPrices($businessId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing confirmBusinessPrices as a post method ?');
    }
    /**
     * Operation getCampaignQuarantineOffers
     *
     * Список товаров, находящихся в карантине по цене в магазине.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function getCampaignQuarantineOffers($campaignId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getCampaignQuarantineOffers as a post method ?');
    }
    /**
     * Operation confirmCampaignPrices
     *
     * Удаление товара из карантина по цене в магазине.
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function confirmCampaignPrices($campaignId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing confirmCampaignPrices as a post method ?');
    }
}
