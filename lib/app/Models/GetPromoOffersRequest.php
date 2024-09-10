<?php
/**
 * GetPromoOffersRequest
 */
namespace app\Models;

/**
 * GetPromoOffersRequest
 * @description Получение списка товаров, которые участвуют или могут участвовать в акции.
 */
class GetPromoOffersRequest {

    /** @var string $promoId Идентификатор акции.*/
    public $promoId = "";

    /** @var string $statusType */
    public $statusType = "";

}
