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

class ContentApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getOfferCardsContentStatus
     *
     * Получение информации о заполненности карточек магазина.
     *
     * @param int $business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function getOfferCardsContentStatus($business_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getOfferCardsContentStatus as a post method ?');
    }
    /**
     * Operation updateOfferContent
     *
     * Редактирование категорийных характеристик товара.
     *
     * @param int $business_id Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function updateOfferContent($business_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing updateOfferContent as a post method ?');
    }
    /**
     * Operation getCategoryContentParameters
     *
     * Списки характеристик товаров по категориям.
     *
     * @param int $category_id Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). (required)
     *
     * @return Http response
     */
    public function getCategoryContentParameters($category_id)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getCategoryContentParameters as a post method ?');
    }
}
