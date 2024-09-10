<?php

/**
 * Партнерский API Маркета
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 * Extend this class with your controller. You can inject dependencies via class constructor,
 * @see https://github.com/PHP-DI/Slim-Bridge basic example.
 */
namespace OpenAPIServer\Api;

use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;
use Slim\Exception\HttpNotImplementedException;

/**
 * AbstractReturnsApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractReturnsApi
{
    /**
     * GET getReturn
     * Summary: Информация о невыкупе или возврате
     * Notes: Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)
     * @param int $orderId Идентификатор заказа.
     * @param int $returnId Идентификатор возврата.
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getReturn(
        ServerRequestInterface $request,
        ResponseInterface $response,
        int $campaignId,
        int $orderId,
        int $returnId
    ): ResponseInterface {
        $message = "How about implementing getReturn as a GET method in OpenAPIServer\Api\ReturnsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getReturnApplication
     * Summary: Получение заявления на возврат
     * Notes: Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-|
     * Output-Formats: [application/octet-stream, application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)
     * @param int $orderId Идентификатор заказа.
     * @param int $returnId Идентификатор возврата.
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getReturnApplication(
        ServerRequestInterface $request,
        ResponseInterface $response,
        int $campaignId,
        int $orderId,
        int $returnId
    ): ResponseInterface {
        $message = "How about implementing getReturnApplication as a GET method in OpenAPIServer\Api\ReturnsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getReturnPhoto
     * Summary: Получение фотографии возврата
     * Notes: Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-|
     * Output-Formats: [application/octet-stream, application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)
     * @param int $orderId Идентификатор заказа.
     * @param int $returnId Идентификатор возврата.
     * @param int $itemId Идентификатор товара в возврате.
     * @param string $imageHash Хеш ссылки изображения для загрузки.
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getReturnPhoto(
        ServerRequestInterface $request,
        ResponseInterface $response,
        int $campaignId,
        int $orderId,
        int $returnId,
        int $itemId,
        string $imageHash
    ): ResponseInterface {
        $message = "How about implementing getReturnPhoto as a GET method in OpenAPIServer\Api\ReturnsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getReturns
     * Summary: Список невыкупов и возвратов
     * Notes: Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getReturns(
        ServerRequestInterface $request,
        ResponseInterface $response,
        int $campaignId
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $pageToken = (key_exists('page_token', $queryParams)) ? $queryParams['page_token'] : null;
        $limit = (key_exists('limit', $queryParams)) ? $queryParams['limit'] : null;
        $orderIds = (key_exists('orderIds', $queryParams)) ? $queryParams['orderIds'] : null;
        $statuses = (key_exists('statuses', $queryParams)) ? $queryParams['statuses'] : null;
        $type = (key_exists('type', $queryParams)) ? $queryParams['type'] : null;
        $fromDate = (key_exists('fromDate', $queryParams)) ? $queryParams['fromDate'] : null;
        $toDate = (key_exists('toDate', $queryParams)) ? $queryParams['toDate'] : null;
        $fromDate2 = (key_exists('from_date', $queryParams)) ? $queryParams['from_date'] : null;
        $toDate2 = (key_exists('to_date', $queryParams)) ? $queryParams['to_date'] : null;
        $message = "How about implementing getReturns as a GET method in OpenAPIServer\Api\ReturnsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST setReturnDecision
     * Summary: Принятие или изменение решения по возврату
     * Notes: Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)
     * @param int $orderId Идентификатор заказа.
     * @param int $returnId Идентификатор возврата.
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function setReturnDecision(
        ServerRequestInterface $request,
        ResponseInterface $response,
        int $campaignId,
        int $orderId,
        int $returnId
    ): ResponseInterface {
        $body = $request->getParsedBody();
        $message = "How about implementing setReturnDecision as a POST method in OpenAPIServer\Api\ReturnsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST submitReturnDecision
     * Summary: Подтверждение решения по возврату
     * Notes: Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)
     * @param int $orderId Идентификатор заказа.
     * @param int $returnId Идентификатор возврата.
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function submitReturnDecision(
        ServerRequestInterface $request,
        ResponseInterface $response,
        int $campaignId,
        int $orderId,
        int $returnId
    ): ResponseInterface {
        $message = "How about implementing submitReturnDecision as a POST method in OpenAPIServer\Api\ReturnsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }
}
