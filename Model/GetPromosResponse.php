<?php
/**
 * GetPromosResponse
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
 * Class representing the GetPromosResponse model.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class GetPromosResponse  implements \JsonSerializable
{
        /**
     * @var ApiResponseStatusType|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    public ?ApiResponseStatusType $status;

    /**
     * @var GetPromosResultDTO|null
     * @SerializedName("result")
     * @Assert\Type("\OpenAPIServer\Model\GetPromosResultDTO")
     * @Type("\OpenAPIServer\Model\GetPromosResultDTO")
     */
    public ?GetPromosResultDTO $result;

    /**
     * Constructor
     *
     * @param ApiResponseStatusType|null $status
     * @param GetPromosResultDTO|null $result
     */
    public function __construct(?ApiResponseStatusType $status, ?GetPromosResultDTO $result)
    {
        $this->status = $status;
        $this->result = $result;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['status']) ? ApiResponseStatusType::tryFrom($data['status']) : null, 
            isset($data['result']) ? GetPromosResultDTO::fromArray($data['result']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'status' => $this->status, 
            'result' => $this->result, 
        ];
    }
}


