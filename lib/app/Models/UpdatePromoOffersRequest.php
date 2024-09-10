<?php
/**
 * UpdatePromoOffersRequest
 */
namespace app\Models;

/**
 * UpdatePromoOffersRequest
 * @description Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`.
 */
class UpdatePromoOffersRequest {

    /** @var string $promoId Идентификатор акции.*/
    public $promoId = "";

    /** @var \app\Models\UpdatePromoOfferDTO[] $offers Товары, которые необходимо добавить в акцию или цены которых нужно изменить.*/
    public $offers = [];

}
