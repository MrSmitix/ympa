<?php
/**
 * FeedsApiInterface
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
use OpenAPI\Server\Model\ApiLockedErrorResponse;
use OpenAPI\Server\Model\ApiNotFoundErrorResponse;
use OpenAPI\Server\Model\ApiServerErrorResponse;
use OpenAPI\Server\Model\ApiUnauthorizedErrorResponse;
use OpenAPI\Server\Model\EmptyApiResponse;
use OpenAPI\Server\Model\FeedIndexLogsStatusType;
use OpenAPI\Server\Model\GetFeedIndexLogsResponse;
use OpenAPI\Server\Model\GetFeedResponse;
use OpenAPI\Server\Model\GetFeedsResponse;
use OpenAPI\Server\Model\SetFeedParamsRequest;

/**
 * FeedsApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface FeedsApiInterface
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
     * Operation getFeed
     *
     * Информация о прайс-листе
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $feedId  Идентификатор прайс-листа. (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     * @deprecated
     */
    public function getFeed(
        int $campaignId,
        int $feedId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getFeedIndexLogs
     *
     * Отчет по индексации прайс-листа
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $feedId  Идентификатор прайс-листа. (required)
     * @param  int|null $limit  Количество значений на одной странице. (optional)
     * @param  \DateTime|null $publishedTimeFrom  Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса. (optional)
     * @param  \DateTime|null $publishedTimeTo  Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %} (optional)
     * @param  \OpenAPI\Server\Model\FeedIndexLogsStatusType|null $status  Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     * @deprecated
     */
    public function getFeedIndexLogs(
        int $campaignId,
        int $feedId,
        ?int $limit,
        ?\DateTime $publishedTimeFrom,
        ?\DateTime $publishedTimeTo,
        ?\OpenAPI\Server\Model\FeedIndexLogsStatusType $status,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getFeeds
     *
     * Список прайс-листов магазина
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     * @deprecated
     */
    public function getFeeds(
        int $campaignId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation refreshFeed
     *
     * Сообщить, что прайс-лист обновился
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $feedId  Идентификатор прайс-листа. (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     * @deprecated
     */
    public function refreshFeed(
        int $campaignId,
        int $feedId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation setFeedParams
     *
     * Изменение параметров прайс-листа
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $feedId  Идентификатор прайс-листа. (required)
     * @param  SetFeedParamsRequest $setFeedParamsRequest   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     * @deprecated
     */
    public function setFeedParams(
        int $campaignId,
        int $feedId,
        SetFeedParamsRequest $setFeedParamsRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}
