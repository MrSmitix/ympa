<?php
/**
 * OfferForRecommendationDTO
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
 * Class representing the OfferForRecommendationDTO model.
 *
 * Информация о состоянии цены на товар.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OfferForRecommendationDTO 
{
        /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     *
     * @var string|null
     * @SerializedName("offerId")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Length(max: 255)]
    #[Assert\Length(min: 1)]
    #[Assert\Regex("/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/")]
    protected ?string $offerId = null;

    /**
     * @var BasePriceDTO|null
     * @SerializedName("price")
     * @Type("OpenAPI\Server\Model\BasePriceDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\BasePriceDTO")]
    protected ?BasePriceDTO $price = null;

    /**
     * @var GetPriceDTO|null
     * @SerializedName("cofinancePrice")
     * @Type("OpenAPI\Server\Model\GetPriceDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\GetPriceDTO")]
    protected ?GetPriceDTO $cofinancePrice = null;

    /**
     * @var PriceCompetitivenessType|null
     * @SerializedName("competitiveness")
    * @Accessor(getter="getSerializedCompetitiveness", setter="setDeserializedCompetitiveness")
    * @Type("string")
    */
    protected ?PriceCompetitivenessType $competitiveness = null;

    /**
     * Количество показов карточки товара за последние 7 дней.
     *
     * @var int|null
     * @SerializedName("shows")
     * @Type("int")
    */
    #[Assert\Type("int")]
    protected ?int $shows = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->offerId = array_key_exists('offerId', $data) ? $data['offerId'] : $this->offerId;
            $this->price = array_key_exists('price', $data) ? $data['price'] : $this->price;
            $this->cofinancePrice = array_key_exists('cofinancePrice', $data) ? $data['cofinancePrice'] : $this->cofinancePrice;
            $this->competitiveness = array_key_exists('competitiveness', $data) ? $data['competitiveness'] : $this->competitiveness;
            $this->shows = array_key_exists('shows', $data) ? $data['shows'] : $this->shows;
        }
    }

    /**
     * Gets offerId.
     *
     * @return string|null
     */
    public function getOfferId(): ?string
    {
        return $this->offerId;
    }

    /**
    * Sets offerId.
    *
    * @param string|null $offerId  Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    *
    * @return $this
    */
    public function setOfferId(?string $offerId = null): self
    {
        $this->offerId = $offerId;

        return $this;
    }




    /**
     * Gets price.
     *
     * @return BasePriceDTO|null
     */
    public function getPrice(): ?BasePriceDTO
    {
        return $this->price;
    }

    /**
    * Sets price.
    *
    * @param BasePriceDTO|null $price
    *
    * @return $this
    */
    public function setPrice(?BasePriceDTO $price = null): self
    {
        $this->price = $price;

        return $this;
    }




    /**
     * Gets cofinancePrice.
     *
     * @return GetPriceDTO|null
     */
    public function getCofinancePrice(): ?GetPriceDTO
    {
        return $this->cofinancePrice;
    }

    /**
    * Sets cofinancePrice.
    *
    * @param GetPriceDTO|null $cofinancePrice
    *
    * @return $this
    */
    public function setCofinancePrice(?GetPriceDTO $cofinancePrice = null): self
    {
        $this->cofinancePrice = $cofinancePrice;

        return $this;
    }




    /**
     * Gets competitiveness.
     *
     * @return PriceCompetitivenessType|null
     */
    public function getCompetitiveness(): ?PriceCompetitivenessType
    {
        return $this->competitiveness;
    }

    /**
    * Sets competitiveness.
    *
    * @param PriceCompetitivenessType|null $competitiveness
    *
    * @return $this
    */
    public function setCompetitiveness(?PriceCompetitivenessType $competitiveness = null): self
    {
        $this->competitiveness = $competitiveness;

        return $this;
    }

    /**
    * Gets competitiveness for serialization.
    *
    * @return string|null
    */
    public function getSerializedCompetitiveness(): string|null
    {
        return $this->competitiveness?->value ? (string) $this->competitiveness->value : null;
    }

    /**
    * Sets competitiveness.
    *
    * @param string|PriceCompetitivenessType|null $competitiveness
    *
    * @return $this
    */
    public function setDeserializedCompetitiveness(string|PriceCompetitivenessType|null $competitiveness = null): self
    {
        if (is_string($competitiveness)) {
            $competitiveness = PriceCompetitivenessType::tryFrom($competitiveness);
        }

        $this->competitiveness = $competitiveness;

        return $this;
    }



    /**
     * Gets shows.
     *
     * @return int|null
     */
    public function getShows(): ?int
    {
        return $this->shows;
    }

    /**
    * Sets shows.
    *
    * @param int|null $shows  Количество показов карточки товара за последние 7 дней.
    *
    * @return $this
    */
    public function setShows(?int $shows = null): self
    {
        $this->shows = $shows;

        return $this;
    }



}


