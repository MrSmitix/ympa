<?php
/**
 * CategoriesApiInterface
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\ApiClientDataErrorResponse;
use OpenAPI\Server\Model\ApiForbiddenErrorResponse;
use OpenAPI\Server\Model\ApiLimitErrorResponse;
use OpenAPI\Server\Model\ApiNotFoundErrorResponse;
use OpenAPI\Server\Model\ApiServerErrorResponse;
use OpenAPI\Server\Model\ApiUnauthorizedErrorResponse;
use OpenAPI\Server\Model\GetCategoriesMaxSaleQuantumRequest;
use OpenAPI\Server\Model\GetCategoriesMaxSaleQuantumResponse;
use OpenAPI\Server\Model\GetCategoriesRequest;
use OpenAPI\Server\Model\GetCategoriesResponse;

/**
 * CategoriesApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface CategoriesApiInterface
{

    /**
     * Sets authentication method OAuth
     *
     * @param string|null $value Value of the OAuth authentication method.
     *
     * @return void
     */
    public function setOAuth(?string $value): void;

    /**
     * Operation getCategoriesMaxSaleQuantum
     *
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * @param  GetCategoriesMaxSaleQuantumRequest $getCategoriesMaxSaleQuantumRequest   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getCategoriesMaxSaleQuantum(
        GetCategoriesMaxSaleQuantumRequest $getCategoriesMaxSaleQuantumRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getCategoriesTree
     *
     * Дерево категорий
     *
     * @param  GetCategoriesRequest|null $getCategoriesRequest   (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getCategoriesTree(
        ?GetCategoriesRequest $getCategoriesRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}
