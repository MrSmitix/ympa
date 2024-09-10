<?php
/**
 * AgeDTO
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
 * Class representing the AgeDTO model.
 *
 * Возраст в заданных единицах измерения.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class AgeDTO 
{
        /**
     * Значение.
     *
     * @var float|null
     * @SerializedName("value")
     * @Type("float")
    */
    #[Assert\NotNull]
    #[Assert\Type("float")]
    #[Assert\GreaterThanOrEqual(0)]
    protected ?float $value = null;

    /**
     * @var AgeUnitType|null
     * @SerializedName("ageUnit")
    * @Accessor(getter="getSerializedAgeUnit", setter="setDeserializedAgeUnit")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?AgeUnitType $ageUnit = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->value = array_key_exists('value', $data) ? $data['value'] : $this->value;
            $this->ageUnit = array_key_exists('ageUnit', $data) ? $data['ageUnit'] : $this->ageUnit;
        }
    }

    /**
     * Gets value.
     *
     * @return float|null
     */
    public function getValue(): ?float
    {
        return $this->value;
    }

    /**
    * Sets value.
    *
    * @param float|null $value  Значение.
    *
    * @return $this
    */
    public function setValue(?float $value): self
    {
        $this->value = $value;

        return $this;
    }




    /**
     * Gets ageUnit.
     *
     * @return AgeUnitType|null
     */
    public function getAgeUnit(): ?AgeUnitType
    {
        return $this->ageUnit;
    }

    /**
    * Sets ageUnit.
    *
    * @param AgeUnitType|null $ageUnit
    *
    * @return $this
    */
    public function setAgeUnit(?AgeUnitType $ageUnit): self
    {
        $this->ageUnit = $ageUnit;

        return $this;
    }

    /**
    * Gets ageUnit for serialization.
    *
    * @return string|null
    */
    public function getSerializedAgeUnit(): string|null
    {
        return $this->ageUnit?->value ? (string) $this->ageUnit->value : null;
    }

    /**
    * Sets ageUnit.
    *
    * @param string|AgeUnitType|null $ageUnit
    *
    * @return $this
    */
    public function setDeserializedAgeUnit(string|AgeUnitType|null $ageUnit): self
    {
        if (is_string($ageUnit)) {
            $ageUnit = AgeUnitType::tryFrom($ageUnit);
        }

        $this->ageUnit = $ageUnit;

        return $this;
    }


}


