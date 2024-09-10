<?php

/**
 * OrderBusinessInformationController
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
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

namespace OpenAPI\Server\Controller;

use \Exception;
use JMS\Serializer\Exception\RuntimeException as SerializerRuntimeException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use OpenAPI\Server\Api\OrderBusinessInformationApiInterface;
use OpenAPI\Server\Model\ApiClientDataErrorResponse;
use OpenAPI\Server\Model\ApiForbiddenErrorResponse;
use OpenAPI\Server\Model\ApiLimitErrorResponse;
use OpenAPI\Server\Model\ApiNotFoundErrorResponse;
use OpenAPI\Server\Model\ApiServerErrorResponse;
use OpenAPI\Server\Model\ApiUnauthorizedErrorResponse;
use OpenAPI\Server\Model\GetBusinessBuyerInfoResponse;
use OpenAPI\Server\Model\GetBusinessDocumentsInfoResponse;

/**
 * OrderBusinessInformationController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class OrderBusinessInformationController extends Controller
{

    /**
     * Operation getOrderBusinessBuyerInfo
     *
     * Информация о покупателе — юридическом лице
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getOrderBusinessBuyerInfoAction(Request $request, $campaignId, $orderId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'OAuth' required
        // Oauth required
        $securityOAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $campaignId = $this->deserialize($campaignId, 'int', 'string');
            $orderId = $this->deserialize($orderId, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($campaignId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($orderId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'OAuth'
            $handler->setOAuth($securityOAuth);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->getOrderBusinessBuyerInfo($campaignId, $orderId, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Информация о покупателе.',
                400 => 'Запрос содержит неправильные данные.',
                401 => 'В запросе не указаны данные для авторизации.',
                403 => 'Данные для авторизации неверны или доступ к ресурсу запрещен.',
                404 => 'Запрашиваемый ресурс не найден.',
                420 => 'Превышено ограничение на доступ к ресурсу.',
                500 => 'Внутренняя ошибка сервера.',
                default => '',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation getOrderBusinessDocumentsInfo
     *
     * Информация о документах
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getOrderBusinessDocumentsInfoAction(Request $request, $campaignId, $orderId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'OAuth' required
        // Oauth required
        $securityOAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $campaignId = $this->deserialize($campaignId, 'int', 'string');
            $orderId = $this->deserialize($orderId, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($campaignId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($orderId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'OAuth'
            $handler->setOAuth($securityOAuth);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->getOrderBusinessDocumentsInfo($campaignId, $orderId, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Информация о документах.',
                400 => 'Запрос содержит неправильные данные.',
                401 => 'В запросе не указаны данные для авторизации.',
                403 => 'Данные для авторизации неверны или доступ к ресурсу запрещен.',
                404 => 'Запрашиваемый ресурс не найден.',
                420 => 'Превышено ограничение на доступ к ресурсу.',
                500 => 'Внутренняя ошибка сервера.',
                default => '',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Returns the handler for this API controller.
     * @return OrderBusinessInformationApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('orderBusinessInformation');
    }
}
