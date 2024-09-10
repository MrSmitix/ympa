<?php
/**
 * TariffDTO
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
 * Class representing the TariffDTO model.
 *
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class TariffDTO 
{
        /**
     * @var TariffType|null
     * @SerializedName("type")
    * @Accessor(getter="getSerializedType", setter="setDeserializedType")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?TariffType $type = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.
     *
     * @var float|null
     * @SerializedName("percent")
     * @Type("float")
    */
    #[Assert\Type("float")]
    protected ?float $percent = null;

    /**
     * Значение тарифа в рублях.
     *
     * @var float|null
     * @SerializedName("amount")
     * @Type("float")
    */
    #[Assert\NotNull]
    #[Assert\Type("float")]
    protected ?float $amount = null;

    /**
     * Параметры расчета тарифа.
     *
     * @var TariffParameterDTO[]|null
     * @SerializedName("parameters")
     * @Type("array<OpenAPI\Server\Model\TariffParameterDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\TariffParameterDTO"),
    ])]
    protected ?array $parameters = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->percent = array_key_exists('percent', $data) ? $data['percent'] : $this->percent;
            $this->amount = array_key_exists('amount', $data) ? $data['amount'] : $this->amount;
            $this->parameters = array_key_exists('parameters', $data) ? $data['parameters'] : $this->parameters;
        }
    }

    /**
     * Gets type.
     *
     * @return TariffType|null
     */
    public function getType(): ?TariffType
    {
        return $this->type;
    }

    /**
    * Sets type.
    *
    * @param TariffType|null $type
    *
    * @return $this
    */
    public function setType(?TariffType $type): self
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
    * @param string|TariffType|null $type
    *
    * @return $this
    */
    public function setDeserializedType(string|TariffType|null $type): self
    {
        if (is_string($type)) {
            $type = TariffType::tryFrom($type);
        }

        $this->type = $type;

        return $this;
    }



    /**
     * Gets percent.
     *
     * @return float|null
     */
    public function getPercent(): ?float
    {
        return $this->percent;
    }

    /**
    * Sets percent.
    *
    * @param float|null $percent  {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.
    *
    * @return $this
    */
    public function setPercent(?float $percent = null): self
    {
        $this->percent = $percent;

        return $this;
    }




    /**
     * Gets amount.
     *
     * @return float|null
     */
    public function getAmount(): ?float
    {
        return $this->amount;
    }

    /**
    * Sets amount.
    *
    * @param float|null $amount  Значение тарифа в рублях.
    *
    * @return $this
    */
    public function setAmount(?float $amount): self
    {
        $this->amount = $amount;

        return $this;
    }




    /**
     * Gets parameters.
     *
     * @return TariffParameterDTO[]|null
     */
    public function getParameters(): ?array
    {
        return $this->parameters;
    }

    /**
    * Sets parameters.
    *
    * @param TariffParameterDTO[]|null $parameters  Параметры расчета тарифа.
    *
    * @return $this
    */
    public function setParameters(?array $parameters): self
    {
        $this->parameters = $parameters;

        return $this;
    }



}


