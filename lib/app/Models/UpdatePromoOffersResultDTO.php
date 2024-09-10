<?php
/**
 * UpdatePromoOffersResultDTO
 */
namespace app\Models;

/**
 * UpdatePromoOffersResultDTO
 * @description Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */
class UpdatePromoOffersResultDTO {

    /** @var \app\Models\RejectedPromoOfferUpdateDTO[]|null $rejectedOffers Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.*/
    public $rejectedOffers = null;

    /** @var \app\Models\WarningPromoOfferUpdateDTO[]|null $warningOffers Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.*/
    public $warningOffers = null;

}
