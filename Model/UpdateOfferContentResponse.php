<?php
/**
 * UpdateOfferContentResponse
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
 * Class representing the UpdateOfferContentResponse model.
 *
 * Описывает проблемы, которые появились при сохранении товара.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class UpdateOfferContentResponse 
{
        /**
     * @var ApiResponseStatusType|null
     * @SerializedName("status")
    * @Accessor(getter="getSerializedStatus", setter="setDeserializedStatus")
    * @Type("string")
    */
    protected ?ApiResponseStatusType $status = null;

    /**
     * Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.
     *
     * @var UpdateOfferContentResultDTO[]|null
     * @SerializedName("results")
     * @Type("array<OpenAPI\Server\Model\UpdateOfferContentResultDTO>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\UpdateOfferContentResultDTO"),
    ])]
    protected ?array $results = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->results = array_key_exists('results', $data) ? $data['results'] : $this->results;
        }
    }

    /**
     * Gets status.
     *
     * @return ApiResponseStatusType|null
     */
    public function getStatus(): ?ApiResponseStatusType
    {
        return $this->status;
    }

    /**
    * Sets status.
    *
    * @param ApiResponseStatusType|null $status
    *
    * @return $this
    */
    public function setStatus(?ApiResponseStatusType $status = null): self
    {
        $this->status = $status;

        return $this;
    }

    /**
    * Gets status for serialization.
    *
    * @return string|null
    */
    public function getSerializedStatus(): string|null
    {
        return $this->status?->value ? (string) $this->status->value : null;
    }

    /**
    * Sets status.
    *
    * @param string|ApiResponseStatusType|null $status
    *
    * @return $this
    */
    public function setDeserializedStatus(string|ApiResponseStatusType|null $status = null): self
    {
        if (is_string($status)) {
            $status = ApiResponseStatusType::tryFrom($status);
        }

        $this->status = $status;

        return $this;
    }



    /**
     * Gets results.
     *
     * @return UpdateOfferContentResultDTO[]|null
     */
    public function getResults(): ?array
    {
        return $this->results;
    }

    /**
    * Sets results.
    *
    * @param UpdateOfferContentResultDTO[]|null $results  Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.
    *
    * @return $this
    */
    public function setResults(?array $results = null): self
    {
        $this->results = $results;

        return $this;
    }



}


