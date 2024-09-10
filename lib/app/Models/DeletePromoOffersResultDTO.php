<?php
/**
 * DeletePromoOffersResultDTO
 */
namespace app\Models;

/**
 * DeletePromoOffersResultDTO
 * @description Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`.
 */
class DeletePromoOffersResultDTO {

    /** @var \app\Models\RejectedPromoOfferDeleteDTO[]|null $rejectedOffers Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.*/
    public $rejectedOffers = null;

}
