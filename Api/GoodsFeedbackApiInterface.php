<?php
/**
 * GoodsFeedbackApiInterface
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
use OpenAPI\Server\Model\DeleteGoodsFeedbackCommentRequest;
use OpenAPI\Server\Model\EmptyApiResponse;
use OpenAPI\Server\Model\GetGoodsFeedbackCommentsRequest;
use OpenAPI\Server\Model\GetGoodsFeedbackCommentsResponse;
use OpenAPI\Server\Model\GetGoodsFeedbackRequest;
use OpenAPI\Server\Model\GetGoodsFeedbackResponse;
use OpenAPI\Server\Model\SkipGoodsFeedbackReactionRequest;
use OpenAPI\Server\Model\UpdateGoodsFeedbackCommentRequest;
use OpenAPI\Server\Model\UpdateGoodsFeedbackCommentResponse;

/**
 * GoodsFeedbackApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface GoodsFeedbackApiInterface
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
     * Operation deleteGoodsFeedbackComment
     *
     * Удаление комментария к отзыву
     *
     * @param  int $businessId  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  DeleteGoodsFeedbackCommentRequest $deleteGoodsFeedbackCommentRequest   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function deleteGoodsFeedbackComment(
        int $businessId,
        DeleteGoodsFeedbackCommentRequest $deleteGoodsFeedbackCommentRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getGoodsFeedbackComments
     *
     * Получение комментариев к отзыву
     *
     * @param  int $businessId  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  GetGoodsFeedbackCommentsRequest $getGoodsFeedbackCommentsRequest   (required)
     * @param  string|null $pageToken  Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. (optional)
     * @param  int|null $limit  Количество значений на одной странице. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getGoodsFeedbackComments(
        int $businessId,
        GetGoodsFeedbackCommentsRequest $getGoodsFeedbackCommentsRequest,
        ?string $pageToken,
        ?int $limit,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getGoodsFeedbacks
     *
     * Получение отзывов о товарах продавца
     *
     * @param  int $businessId  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  string|null $pageToken  Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. (optional)
     * @param  int|null $limit  Количество значений на одной странице. (optional)
     * @param  GetGoodsFeedbackRequest|null $getGoodsFeedbackRequest   (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getGoodsFeedbacks(
        int $businessId,
        ?string $pageToken,
        ?int $limit,
        ?GetGoodsFeedbackRequest $getGoodsFeedbackRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation skipGoodsFeedbacksReaction
     *
     * Отказ от ответа на отзывы
     *
     * @param  int $businessId  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  SkipGoodsFeedbackReactionRequest $skipGoodsFeedbackReactionRequest   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function skipGoodsFeedbacksReaction(
        int $businessId,
        SkipGoodsFeedbackReactionRequest $skipGoodsFeedbackReactionRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation updateGoodsFeedbackComment
     *
     * Добавление нового или изменение созданного комментария
     *
     * @param  int $businessId  Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  UpdateGoodsFeedbackCommentRequest $updateGoodsFeedbackCommentRequest   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function updateGoodsFeedbackComment(
        int $businessId,
        UpdateGoodsFeedbackCommentRequest $updateGoodsFeedbackCommentRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}
