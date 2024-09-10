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

class WarehousesController extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getWarehouses
     *
     * Список складов и групп складов.
     *
     * @param int $businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     *
     * @return Http response
     */
    public function getWarehouses($businessId)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getWarehouses as a get method ?');
    }
    /**
     * Operation getFulfillmentWarehouses
     *
     * Идентификаторы складов Маркета (FBY).
     *
     *
     * @return Http response
     */
    public function getFulfillmentWarehouses()
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing getFulfillmentWarehouses as a get method ?');
    }
}
