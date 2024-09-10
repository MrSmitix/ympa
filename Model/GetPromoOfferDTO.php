<?php
/**
 * GetPromoOfferDTO
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
 * Class representing the GetPromoOfferDTO model.
 *
 * Товар, который участвует или может участвовать в акции.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetPromoOfferDTO 
{
        /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     *
     * @var string|null
     * @SerializedName("offerId")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Length(max: 255)]
    #[Assert\Length(min: 1)]
    #[Assert\Regex("/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/")]
    protected ?string $offerId = null;

    /**
     * @var PromoOfferParticipationStatusType|null
     * @SerializedName("status")
    * @Accessor(getter="getSerializedStatus", setter="setDeserializedStatus")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?PromoOfferParticipationStatusType $status = null;

    /**
     * @var PromoOfferParamsDTO|null
     * @SerializedName("params")
     * @Type("OpenAPI\Server\Model\PromoOfferParamsDTO")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\Type("OpenAPI\Server\Model\PromoOfferParamsDTO")]
    protected ?PromoOfferParamsDTO $params = null;

    /**
     * @var PromoOfferAutoParticipatingDetailsDTO|null
     * @SerializedName("autoParticipatingDetails")
     * @Type("OpenAPI\Server\Model\PromoOfferAutoParticipatingDetailsDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\PromoOfferAutoParticipatingDetailsDTO")]
    protected ?PromoOfferAutoParticipatingDetailsDTO $autoParticipatingDetails = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->offerId = array_key_exists('offerId', $data) ? $data['offerId'] : $this->offerId;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->params = array_key_exists('params', $data) ? $data['params'] : $this->params;
            $this->autoParticipatingDetails = array_key_exists('autoParticipatingDetails', $data) ? $data['autoParticipatingDetails'] : $this->autoParticipatingDetails;
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
    public function setOfferId(?string $offerId): self
    {
        $this->offerId = $offerId;

        return $this;
    }




    /**
     * Gets status.
     *
     * @return PromoOfferParticipationStatusType|null
     */
    public function getStatus(): ?PromoOfferParticipationStatusType
    {
        return $this->status;
    }

    /**
    * Sets status.
    *
    * @param PromoOfferParticipationStatusType|null $status
    *
    * @return $this
    */
    public function setStatus(?PromoOfferParticipationStatusType $status): self
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
    * @param string|PromoOfferParticipationStatusType|null $status
    *
    * @return $this
    */
    public function setDeserializedStatus(string|PromoOfferParticipationStatusType|null $status): self
    {
        if (is_string($status)) {
            $status = PromoOfferParticipationStatusType::tryFrom($status);
        }

        $this->status = $status;

        return $this;
    }



    /**
     * Gets params.
     *
     * @return PromoOfferParamsDTO|null
     */
    public function getParams(): ?PromoOfferParamsDTO
    {
        return $this->params;
    }

    /**
    * Sets params.
    *
    * @param PromoOfferParamsDTO|null $params
    *
    * @return $this
    */
    public function setParams(?PromoOfferParamsDTO $params): self
    {
        $this->params = $params;

        return $this;
    }




    /**
     * Gets autoParticipatingDetails.
     *
     * @return PromoOfferAutoParticipatingDetailsDTO|null
     */
    public function getAutoParticipatingDetails(): ?PromoOfferAutoParticipatingDetailsDTO
    {
        return $this->autoParticipatingDetails;
    }

    /**
    * Sets autoParticipatingDetails.
    *
    * @param PromoOfferAutoParticipatingDetailsDTO|null $autoParticipatingDetails
    *
    * @return $this
    */
    public function setAutoParticipatingDetails(?PromoOfferAutoParticipatingDetailsDTO $autoParticipatingDetails = null): self
    {
        $this->autoParticipatingDetails = $autoParticipatingDetails;

        return $this;
    }



}


