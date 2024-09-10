<?php
/**
 * ReturnItemDTO
 */
namespace app\Models;

/**
 * ReturnItemDTO
 * @description Список товаров в возврате.
 */
class ReturnItemDTO {

    /** @var int $marketSku SKU на Маркете.*/
    public $marketSku = 0;

    /** @var string $shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $shopSku = "";

    /** @var int $count Количество единиц товара.*/
    public $count = 0;

    /** @var \app\Models\ReturnDecisionDTO[]|null $decisions Список решений по возврату.*/
    public $decisions = null;

    /** @var \app\Models\ReturnInstanceDTO[]|null $instances Список логистических позиций возврата.*/
    public $instances = null;

    /** @var \app\Models\TrackDTO[]|null $tracks Список трек-кодов для почтовых отправлений.*/
    public $tracks = null;

}
