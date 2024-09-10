<?php
/**
 * OfferProcessingNoteDTO
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
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

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the OfferProcessingNoteDTO model.
 *
 * Причины, по которым товар не прошел модерацию.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OfferProcessingNoteDTO 
{
        /**
     * @var OfferProcessingNoteType|null
     * @SerializedName("type")
    * @Accessor(getter="getSerializedType", setter="setDeserializedType")
    * @Type("string")
    */
    protected ?OfferProcessingNoteType $type = null;

    /**
     * Дополнительная информация о причине отклонения товара.
     *
     * @var string|null
     * @SerializedName("payload")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $payload = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->payload = array_key_exists('payload', $data) ? $data['payload'] : $this->payload;
        }
    }

    /**
     * Gets type.
     *
     * @return OfferProcessingNoteType|null
     */
    public function getType(): ?OfferProcessingNoteType
    {
        return $this->type;
    }

    /**
    * Sets type.
    *
    * @param OfferProcessingNoteType|null $type
    *
    * @return $this
    */
    public function setType(?OfferProcessingNoteType $type = null): self
    {
        $this->type = $type;

        return $this;
    }

    /**
    * Gets type for serialization.
    *
    * @return string|null
    */
    public function getSerializedType(): string|null
    {
        return $this->type?->value ? (string) $this->type->value : null;
    }

    /**
    * Sets type.
    *
    * @param string|OfferProcessingNoteType|null $type
    *
    * @return $this
    */
    public function setDeserializedType(string|OfferProcessingNoteType|null $type = null): self
    {
        if (is_string($type)) {
            $type = OfferProcessingNoteType::tryFrom($type);
        }

        $this->type = $type;

        return $this;
    }



    /**
     * Gets payload.
     *
     * @return string|null
     */
    public function getPayload(): ?string
    {
        return $this->payload;
    }

    /**
    * Sets payload.
    *
    * @param string|null $payload  Дополнительная информация о причине отклонения товара.
    *
    * @return $this
    */
    public function setPayload(?string $payload = null): self
    {
        $this->payload = $payload;

        return $this;
    }



}


