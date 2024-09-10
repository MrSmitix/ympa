<?php
/**
 * ApiUnauthorizedErrorResponse
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
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


namespace OpenAPIServer\Model;

/**
 * Class representing the ApiUnauthorizedErrorResponse model.
 *
 * В запросе не указаны авторизационные данные.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class ApiUnauthorizedErrorResponse  implements \JsonSerializable
{
        /**
     * @var ApiResponseStatusType|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    public ?ApiResponseStatusType $status;

    /**
     * Список ошибок.
     *
     * @var ApiErrorDTO[]|null
     * @SerializedName("errors")
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\ApiErrorDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\ApiErrorDTO>")
     */
    public ?array $errors;

    /**
     * Constructor
     *
     * @param ApiResponseStatusType|null $status
     * @param ApiErrorDTO[]|null $errors
     */
    public function __construct(?ApiResponseStatusType $status, ?array $errors)
    {
        $this->status = $status;
        $this->errors = $errors;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['status']) ? ApiResponseStatusType::tryFrom($data['status']) : null, 
            isset($data['errors']) ? array_map(fn($item) => ApiErrorDTO::fromArray($item), $data['errors']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'status' => $this->status, 
            'errors' => $this->errors, 
        ];
    }
}


