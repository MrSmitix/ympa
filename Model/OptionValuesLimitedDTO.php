<?php
/**
 * OptionValuesLimitedDTO
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
 * Class representing the OptionValuesLimitedDTO model.
 *
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OptionValuesLimitedDTO 
{
        /**
     * Идентификатор значения ограничивающей характеристики.
     *
     * @var int|null
     * @SerializedName("limitingOptionValueId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $limitingOptionValueId = null;

    /**
     * Идентификаторы допустимых значений ограничиваемой характеристики.
     *
     * @var int[]|null
     * @SerializedName("optionValueIds")
     * @Type("array<int>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("int"),
    ])]
    protected ?array $optionValueIds = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->limitingOptionValueId = array_key_exists('limitingOptionValueId', $data) ? $data['limitingOptionValueId'] : $this->limitingOptionValueId;
            $this->optionValueIds = array_key_exists('optionValueIds', $data) ? $data['optionValueIds'] : $this->optionValueIds;
        }
    }

    /**
     * Gets limitingOptionValueId.
     *
     * @return int|null
     */
    public function getLimitingOptionValueId(): ?int
    {
        return $this->limitingOptionValueId;
    }

    /**
    * Sets limitingOptionValueId.
    *
    * @param int|null $limitingOptionValueId  Идентификатор значения ограничивающей характеристики.
    *
    * @return $this
    */
    public function setLimitingOptionValueId(?int $limitingOptionValueId): self
    {
        $this->limitingOptionValueId = $limitingOptionValueId;

        return $this;
    }




    /**
     * Gets optionValueIds.
     *
     * @return int[]|null
     */
    public function getOptionValueIds(): ?array
    {
        return $this->optionValueIds;
    }

    /**
    * Sets optionValueIds.
    *
    * @param int[]|null $optionValueIds  Идентификаторы допустимых значений ограничиваемой характеристики.
    *
    * @return $this
    */
    public function setOptionValueIds(?array $optionValueIds): self
    {
        $this->optionValueIds = $optionValueIds;

        return $this;
    }



}


