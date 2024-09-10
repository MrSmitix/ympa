<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;.
 */
class DeletePromoOffersRequest
{
    /**
     * Идентификатор акции.
     * @DTA\Data(field="promoId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $promo_id = null;

    /**
     * Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.
     * @DTA\Data(field="deleteAllOffers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $delete_all_offers = null;

    /**
     * Товары, которые нужно убрать из акции.
     * @DTA\Data(field="offerIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection123::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection123::class})
     */
    public ?\App\DTO\Collection123 $offer_ids = null;

}
