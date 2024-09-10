<?php
/**
 * GetReturnResponse
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
 * Class representing the GetReturnResponse model.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class GetReturnResponse  implements \JsonSerializable
{
        /**
     * @var ApiResponseStatusType|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    public ?ApiResponseStatusType $status;

    /**
     * @var ReturnDTO|null
     * @SerializedName("result")
     * @Assert\Type("\OpenAPIServer\Model\ReturnDTO")
     * @Type("\OpenAPIServer\Model\ReturnDTO")
     */
    public ?ReturnDTO $result;

    /**
     * Constructor
     *
     * @param ApiResponseStatusType|null $status
     * @param ReturnDTO|null $result
     */
    public function __construct(?ApiResponseStatusType $status, ?ReturnDTO $result)
    {
        $this->status = $status;
        $this->result = $result;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['status']) ? ApiResponseStatusType::tryFrom($data['status']) : null, 
            isset($data['result']) ? ReturnDTO::fromArray($data['result']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'status' => $this->status, 
            'result' => $this->result, 
        ];
    }
}


