<?php
/**
 * EmptyApiResponse
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
 * Class representing the EmptyApiResponse model.
 *
 * Пустой ответ сервера.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class EmptyApiResponse  implements \JsonSerializable
{
        /**
     * @var ApiResponseStatusType|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    public ?ApiResponseStatusType $status;

    /**
     * Constructor
     *
     * @param ApiResponseStatusType|null $status
     */
    public function __construct(?ApiResponseStatusType $status)
    {
        $this->status = $status;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['status']) ? ApiResponseStatusType::tryFrom($data['status']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'status' => $this->status, 
        ];
    }
}


