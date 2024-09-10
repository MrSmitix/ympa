<?php

/**
 * ModelsController
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
use OpenAPI\Server\Api\ModelsApiInterface;
use OpenAPI\Server\Model\ApiClientDataErrorResponse;
use OpenAPI\Server\Model\ApiForbiddenErrorResponse;
use OpenAPI\Server\Model\ApiLimitErrorResponse;
use OpenAPI\Server\Model\ApiNotFoundErrorResponse;
use OpenAPI\Server\Model\ApiServerErrorResponse;
use OpenAPI\Server\Model\ApiUnauthorizedErrorResponse;
use OpenAPI\Server\Model\CurrencyType;
use OpenAPI\Server\Model\GetModelsOffersResponse;
use OpenAPI\Server\Model\GetModelsRequest;
use OpenAPI\Server\Model\GetModelsResponse;
use OpenAPI\Server\Model\SearchModelsResponse;
use OpenAPI\Server\Model\SortOrderType;

/**
 * ModelsController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class ModelsController extends Controller
{

    /**
     * Operation getModel
     *
     * Информация об одной модели
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getModelAction(Request $request, $modelId)
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
        $regionId = $request->query->get('regionId');
        $currency = $request->query->get('currency');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $modelId = $this->deserialize($modelId, 'int', 'string');
            $regionId = $this->deserialize($regionId, 'int', 'string');
            $currency = $this->deserialize($currency, '\OpenAPI\Server\Model\CurrencyType', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\GreaterThan(0);
        $response = $this->validate($modelId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($regionId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\CurrencyType");
        $response = $this->validate($currency, $asserts);
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

            $result = $handler->getModel($modelId, $regionId, $currency, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Информация о модели.',
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
     * Operation getModelOffers
     *
     * Список предложений для одной модели
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getModelOffersAction(Request $request, $modelId)
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
        $regionId = $request->query->get('regionId');
        $currency = $request->query->get('currency');
        $orderByPrice = $request->query->get('orderByPrice');
        $count = $request->query->get('count', 10);
        $page = $request->query->get('page', 1);

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $modelId = $this->deserialize($modelId, 'int', 'string');
            $regionId = $this->deserialize($regionId, 'int', 'string');
            $currency = $this->deserialize($currency, '\OpenAPI\Server\Model\CurrencyType', 'string');
            $orderByPrice = $this->deserialize($orderByPrice, '\OpenAPI\Server\Model\SortOrderType', 'string');
            $count = $this->deserialize($count, 'int', 'string');
            $page = $this->deserialize($page, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\GreaterThan(0);
        $response = $this->validate($modelId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($regionId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\CurrencyType");
        $response = $this->validate($currency, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\SortOrderType");
        $response = $this->validate($orderByPrice, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($count, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\LessThanOrEqual(10000);
        $response = $this->validate($page, $asserts);
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

            $result = $handler->getModelOffers($modelId, $regionId, $currency, $orderByPrice, $count, $page, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Список предложений для модели.',
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
     * Operation getModels
     *
     * Информация о нескольких моделях
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getModelsAction(Request $request)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        if (!static::isContentTypeAllowed($request, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

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
        $regionId = $request->query->get('regionId');
        $currency = $request->query->get('currency');
        $getModelsRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $regionId = $this->deserialize($regionId, 'int', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $getModelsRequest = $this->deserialize($getModelsRequest, 'OpenAPI\Server\Model\GetModelsRequest', $inputFormat);
            $currency = $this->deserialize($currency, '\OpenAPI\Server\Model\CurrencyType', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($regionId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\GetModelsRequest");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($getModelsRequest, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\CurrencyType");
        $response = $this->validate($currency, $asserts);
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

            $result = $handler->getModels($regionId, $getModelsRequest, $currency, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Информация о моделях.',
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
     * Operation getModelsOffers
     *
     * Список предложений для нескольких моделей
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function getModelsOffersAction(Request $request)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        if (!static::isContentTypeAllowed($request, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

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
        $regionId = $request->query->get('regionId');
        $currency = $request->query->get('currency');
        $orderByPrice = $request->query->get('orderByPrice');
        $getModelsRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $regionId = $this->deserialize($regionId, 'int', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $getModelsRequest = $this->deserialize($getModelsRequest, 'OpenAPI\Server\Model\GetModelsRequest', $inputFormat);
            $currency = $this->deserialize($currency, '\OpenAPI\Server\Model\CurrencyType', 'string');
            $orderByPrice = $this->deserialize($orderByPrice, '\OpenAPI\Server\Model\SortOrderType', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($regionId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\GetModelsRequest");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($getModelsRequest, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\CurrencyType");
        $response = $this->validate($currency, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\SortOrderType");
        $response = $this->validate($orderByPrice, $asserts);
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

            $result = $handler->getModelsOffers($regionId, $getModelsRequest, $currency, $orderByPrice, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Список предложений для моделей.',
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
     * Operation searchModels
     *
     * Поиск модели товара
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function searchModelsAction(Request $request)
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
        $query = $request->query->get('query');
        $regionId = $request->query->get('regionId');
        $currency = $request->query->get('currency');
        $page = $request->query->get('page', 1);
        $pageSize = $request->query->get('pageSize');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $query = $this->deserialize($query, 'string', 'string');
            $regionId = $this->deserialize($regionId, 'int', 'string');
            $currency = $this->deserialize($currency, '\OpenAPI\Server\Model\CurrencyType', 'string');
            $page = $this->deserialize($page, 'int', 'string');
            $pageSize = $this->deserialize($pageSize, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($query, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($regionId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\CurrencyType");
        $response = $this->validate($currency, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\LessThanOrEqual(10000);
        $response = $this->validate($page, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($pageSize, $asserts);
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

            $result = $handler->searchModels($query, $regionId, $currency, $page, $pageSize, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Информация о моделях.',
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
     * @return ModelsApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('models');
    }
}
