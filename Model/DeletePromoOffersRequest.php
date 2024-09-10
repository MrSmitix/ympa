<?php
/**
 * DeletePromoOffersRequest
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
 * Class representing the DeletePromoOffersRequest model.
 *
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class DeletePromoOffersRequest  implements \JsonSerializable
{
        /**
     * Идентификатор акции.
     *
     * @var string
     * @SerializedName("promoId")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    public string $promoId;

    /**
     * Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.
     *
     * @var bool|null
     * @SerializedName("deleteAllOffers")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    public ?bool $deleteAllOffers;

    /**
     * Товары, которые нужно убрать из акции.
     *
     * @var string[]|null
     * @SerializedName("offerIds")
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     * @Assert\Count(
     *   max = 500
     * )
     * @Assert\Count(
     *   min = 1
     * )
     */
    public ?array $offerIds;

    /**
     * Constructor
     *
     * @param string $promoId
     * @param bool|null $deleteAllOffers
     * @param string[]|null $offerIds
     */
    public function __construct(string $promoId, ?bool $deleteAllOffers, ?array $offerIds)
    {
        $this->promoId = $promoId;
        $this->deleteAllOffers = $deleteAllOffers;
        $this->offerIds = $offerIds;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['promoId'] ?? null, 
            $data['deleteAllOffers'] ?? null, 
            $data['offerIds'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'promoId' => $this->promoId, 
            'deleteAllOffers' => $this->deleteAllOffers, 
            'offerIds' => $this->offerIds, 
        ];
    }
}


