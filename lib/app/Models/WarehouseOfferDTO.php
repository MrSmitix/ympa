<?php
/**
 * WarehouseOfferDTO
 */
namespace app\Models;

/**
 * WarehouseOfferDTO
 * @description Информация об остатках товара.
 */
class WarehouseOfferDTO {

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\TurnoverDTO $turnoverSummary */
    public $turnoverSummary;

    /** @var \app\Models\WarehouseStockDTO[] $stocks Информация об остатках.*/
    public $stocks = [];

    /** @var \DateTime $updatedAt Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;.*/
    public $updatedAt;

}
