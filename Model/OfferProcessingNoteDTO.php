<?php
/**
 * OfferProcessingNoteDTO
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
 * Class representing the OfferProcessingNoteDTO model.
 *
 * Причины, по которым товар не прошел модерацию.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OfferProcessingNoteDTO  implements \JsonSerializable
{
        /**
     * @var OfferProcessingNoteType|null
     * @SerializedName("type")
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public ?OfferProcessingNoteType $type;

    /**
     * Дополнительная информация о причине отклонения товара.
     *
     * @var string|null
     * @SerializedName("payload")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $payload;

    /**
     * Constructor
     *
     * @param OfferProcessingNoteType|null $type
     * @param string|null $payload
     */
    public function __construct(?OfferProcessingNoteType $type, ?string $payload)
    {
        $this->type = $type;
        $this->payload = $payload;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['type']) ? OfferProcessingNoteType::tryFrom($data['type']) : null, 
            $data['payload'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'type' => $this->type, 
            'payload' => $this->payload, 
        ];
    }
}


