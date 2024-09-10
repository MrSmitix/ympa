<?php
/**
 * OfferRecommendationInfoDTO
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
 * Class representing the OfferRecommendationInfoDTO model.
 *
 * Рекомендации, касающиеся цены на товар.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OfferRecommendationInfoDTO 
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
     * @SerializedName("recommendedCofinancePrice")
     * @Type("OpenAPI\Server\Model\BasePriceDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\BasePriceDTO")]
    protected ?BasePriceDTO $recommendedCofinancePrice = null;

    /**
     * @var PriceCompetitivenessThresholdsDTO|null
     * @SerializedName("competitivenessThresholds")
     * @Type("OpenAPI\Server\Model\PriceCompetitivenessThresholdsDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\PriceCompetitivenessThresholdsDTO")]
    protected ?PriceCompetitivenessThresholdsDTO $competitivenessThresholds = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->offerId = array_key_exists('offerId', $data) ? $data['offerId'] : $this->offerId;
            $this->recommendedCofinancePrice = array_key_exists('recommendedCofinancePrice', $data) ? $data['recommendedCofinancePrice'] : $this->recommendedCofinancePrice;
            $this->competitivenessThresholds = array_key_exists('competitivenessThresholds', $data) ? $data['competitivenessThresholds'] : $this->competitivenessThresholds;
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
     * Gets recommendedCofinancePrice.
     *
     * @return BasePriceDTO|null
     */
    public function getRecommendedCofinancePrice(): ?BasePriceDTO
    {
        return $this->recommendedCofinancePrice;
    }

    /**
    * Sets recommendedCofinancePrice.
    *
    * @param BasePriceDTO|null $recommendedCofinancePrice
    *
    * @return $this
    */
    public function setRecommendedCofinancePrice(?BasePriceDTO $recommendedCofinancePrice = null): self
    {
        $this->recommendedCofinancePrice = $recommendedCofinancePrice;

        return $this;
    }




    /**
     * Gets competitivenessThresholds.
     *
     * @return PriceCompetitivenessThresholdsDTO|null
     */
    public function getCompetitivenessThresholds(): ?PriceCompetitivenessThresholdsDTO
    {
        return $this->competitivenessThresholds;
    }

    /**
    * Sets competitivenessThresholds.
    *
    * @param PriceCompetitivenessThresholdsDTO|null $competitivenessThresholds
    *
    * @return $this
    */
    public function setCompetitivenessThresholds(?PriceCompetitivenessThresholdsDTO $competitivenessThresholds = null): self
    {
        $this->competitivenessThresholds = $competitivenessThresholds;

        return $this;
    }



}


