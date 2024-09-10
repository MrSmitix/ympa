<?php
/**
 * DeletePromoOffersRequest
 */
namespace app\Models;

/**
 * DeletePromoOffersRequest
 * @description Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`.
 */
class DeletePromoOffersRequest {

    /** @var string $promoId Идентификатор акции.*/
    public $promoId = "";

    /** @var bool $deleteAllOffers Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.*/
    public $deleteAllOffers = false;

    /** @var string[]|null $offerIds Товары, которые нужно убрать из акции.*/
    public $offerIds = null;

}
