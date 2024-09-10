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

class CategoriesApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation getCategoriesMaxSaleQuantum
     *
     * Лимит на установку кванта продажи и минимального количества товаров в заказе.
     *
     *
     * @return Http response
     */
    public function getCategoriesMaxSaleQuantum()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        if (!isset($input['get_categories_max_sale_quantum_request'])) {
            throw new \InvalidArgumentException('Missing the required parameter $get_categories_max_sale_quantum_request when calling getCategoriesMaxSaleQuantum');
        }
        $get_categories_max_sale_quantum_request = $input['get_categories_max_sale_quantum_request'];


        return response('How about implementing getCategoriesMaxSaleQuantum as a post method ?');
    }
    /**
     * Operation getCategoriesTree
     *
     * Дерево категорий.
     *
     *
     * @return Http response
     */
    public function getCategoriesTree()
    {
        $input = Request::all();

        //path params validation


        //not path params validation
        $get_categories_request = $input['get_categories_request'];


        return response('How about implementing getCategoriesTree as a post method ?');
    }
}
