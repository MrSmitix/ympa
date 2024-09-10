<?php
/**
 * OfferPriceByOfferIdsResponseDTO
 */
namespace app\Models;

/**
 * OfferPriceByOfferIdsResponseDTO
 * @description Информация об установленной цене.
 */
class OfferPriceByOfferIdsResponseDTO {

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\PriceDTO $price */
    public $price;

    /** @var \DateTime $updatedAt Дата и время последнего обновления цены.*/
    public $updatedAt;

}
