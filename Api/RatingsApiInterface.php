<?php
/**
 * RatingsApiInterface
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
use OpenAPI\Server\Model\GetQualityRatingDetailsResponse;
use OpenAPI\Server\Model\GetQualityRatingRequest;
use OpenAPI\Server\Model\GetQualityRatingResponse;

/**
 * RatingsApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface RatingsApiInterface
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
     * Operation getQualityRatingDetails
     *
     * Заказы, которые повлияли на индекс качества
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getQualityRatingDetails(
        int $campaignId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getQualityRatings
     *
     * Индекс качества магазинов
     *
     * @param  int $businessId  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  GetQualityRatingRequest $getQualityRatingRequest   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getQualityRatings(
        int $businessId,
        GetQualityRatingRequest $getQualityRatingRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}
