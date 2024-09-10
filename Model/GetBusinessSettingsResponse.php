<?php
/**
 * GetBusinessSettingsResponse
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
 * Class representing the GetBusinessSettingsResponse model.
 *
 * Ответ на запрос настроек кабинета.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetBusinessSettingsResponse 
{
        /**
     * @var ApiResponseStatusType|null
     * @SerializedName("status")
    * @Accessor(getter="getSerializedStatus", setter="setDeserializedStatus")
    * @Type("string")
    */
    protected ?ApiResponseStatusType $status = null;

    /**
     * @var GetBusinessSettingsInfoDTO|null
     * @SerializedName("result")
     * @Type("OpenAPI\Server\Model\GetBusinessSettingsInfoDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\GetBusinessSettingsInfoDTO")]
    protected ?GetBusinessSettingsInfoDTO $result = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->result = array_key_exists('result', $data) ? $data['result'] : $this->result;
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
     * Gets result.
     *
     * @return GetBusinessSettingsInfoDTO|null
     */
    public function getResult(): ?GetBusinessSettingsInfoDTO
    {
        return $this->result;
    }

    /**
    * Sets result.
    *
    * @param GetBusinessSettingsInfoDTO|null $result
    *
    * @return $this
    */
    public function setResult(?GetBusinessSettingsInfoDTO $result = null): self
    {
        $this->result = $result;

        return $this;
    }



}


