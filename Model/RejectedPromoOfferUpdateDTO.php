<?php
/**
 * RejectedPromoOfferUpdateDTO
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
 * Class representing the RejectedPromoOfferUpdateDTO model.
 *
 * Описание отклоненного изменения.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class RejectedPromoOfferUpdateDTO  implements \JsonSerializable
{
        /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     *
     * @var string
     * @SerializedName("offerId")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 255
     * )
     * @Assert\Length(
     *   min = 1
     * )
     * @Assert\Regex("//^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$//")
     */
    public string $offerId;

    /**
     * @var RejectedPromoOfferUpdateReasonType
     * @SerializedName("reason")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedReason")
        * @Type("string")
     */
    public RejectedPromoOfferUpdateReasonType $reason;

    /**
     * Constructor
     *
     * @param string $offerId
     * @param RejectedPromoOfferUpdateReasonType $reason
     */
    public function __construct(string $offerId, RejectedPromoOfferUpdateReasonType $reason)
    {
        $this->offerId = $offerId;
        $this->reason = $reason;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['offerId'] ?? null, 
            isset($data['reason']) ? RejectedPromoOfferUpdateReasonType::tryFrom($data['reason']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'offerId' => $this->offerId, 
            'reason' => $this->reason, 
        ];
    }
}


