<?php
/**
 * BriefOrderItemDTO
 */
namespace app\Models;

/**
 * BriefOrderItemDTO
 * @description Информация о маркированном товаре.
 */
class BriefOrderItemDTO {

    /** @var int $id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.*/
    public $id = 0;

    /** @var string $vat */
    public $vat = "";

    /** @var int $count Количество единиц товара.*/
    public $count = 0;

    /** @var float $price Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.*/
    public $price = 0;

    /** @var string $offerName Название товара.*/
    public $offerName = "";

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\OrderItemInstanceDTO[]|null $instances Переданные вами коды маркировки.*/
    public $instances = null;

}
