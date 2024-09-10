<?php
/**
 * GetPriceWithVatDTO
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
 * Class representing the GetPriceWithVatDTO model.
 *
 * Цена с указанием ставки НДС и времени последнего обновления.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class GetPriceWithVatDTO  implements \JsonSerializable
{
        /**
     * Цена на товар.
     *
     * @var float|null
     * @SerializedName("value")
     * @Assert\Type("float")
     * @Type("float")
     */
    public ?float $value;

    /**
     * Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.
     *
     * @var float|null
     * @SerializedName("discountBase")
     * @Assert\Type("float")
     * @Type("float")
     */
    public ?float $discountBase;

    /**
     * @var CurrencyType|null
     * @SerializedName("currencyId")
        * @Accessor(getter="getSerializedCurrencyId")
        * @Type("string")
     */
    public ?CurrencyType $currencyId;

    /**
     * Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.
     *
     * @var int|null
     * @SerializedName("vat")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $vat;

    /**
     * Время последнего обновления.
     *
     * @var \DateTime
     * @SerializedName("updatedAt")
     * @Assert\NotNull()
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    public \DateTime $updatedAt;

    /**
     * Constructor
     *
     * @param float|null $value
     * @param float|null $discountBase
     * @param CurrencyType|null $currencyId
     * @param int|null $vat
     * @param \DateTime $updatedAt
     */
    public function __construct(?float $value, ?float $discountBase, ?CurrencyType $currencyId, ?int $vat, \DateTime $updatedAt)
    {
        $this->value = $value;
        $this->discountBase = $discountBase;
        $this->currencyId = $currencyId;
        $this->vat = $vat;
        $this->updatedAt = $updatedAt;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['value'] ?? null, 
            $data['discountBase'] ?? null, 
            isset($data['currencyId']) ? CurrencyType::tryFrom($data['currencyId']) : null, 
            $data['vat'] ?? null, 
            isset($data['updatedAt']) ? new \DateTime($data['updatedAt']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'value' => $this->value, 
            'discountBase' => $this->discountBase, 
            'currencyId' => $this->currencyId, 
            'vat' => $this->vat, 
            'updatedAt' => $this->updatedAt?->format('c'), 
        ];
    }
}


