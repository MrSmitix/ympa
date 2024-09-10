<?php
/**
 * OfferMappingErrorDTO
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
 * Class representing the OfferMappingErrorDTO model.
 *
 * Текст ошибки.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OfferMappingErrorDTO  implements \JsonSerializable
{
        /**
     * @var OfferMappingErrorType
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public OfferMappingErrorType $type;

    /**
     * Идентификатор характеристики, с которой связана ошибка.
     *
     * @var int|null
     * @SerializedName("parameterId")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $parameterId;

    /**
     * Текст ошибки.
     *
     * @var string
     * @SerializedName("message")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    public string $message;

    /**
     * Constructor
     *
     * @param OfferMappingErrorType $type
     * @param int|null $parameterId
     * @param string $message
     */
    public function __construct(OfferMappingErrorType $type, ?int $parameterId, string $message)
    {
        $this->type = $type;
        $this->parameterId = $parameterId;
        $this->message = $message;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['type']) ? OfferMappingErrorType::tryFrom($data['type']) : null, 
            $data['parameterId'] ?? null, 
            $data['message'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'type' => $this->type, 
            'parameterId' => $this->parameterId, 
            'message' => $this->message, 
        ];
    }
}


