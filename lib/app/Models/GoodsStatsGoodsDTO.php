<?php
/**
 * GoodsStatsGoodsDTO
 */
namespace app\Models;

/**
 * GoodsStatsGoodsDTO
 * @description Информация о товаре.
 */
class GoodsStatsGoodsDTO {

    /** @var string $shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $shopSku = "";

    /** @var int $marketSku SKU на Маркете.*/
    public $marketSku = 0;

    /** @var string $name Название товара.*/
    public $name = "";

    /** @var float $price Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).*/
    public $price = 0;

    /** @var int $categoryId Идентификатор категории товара на Маркете.*/
    public $categoryId = 0;

    /** @var string $categoryName Название категории товара на Маркете.*/
    public $categoryName = "";

    /** @var \app\Models\GoodsStatsWeightDimensionsDTO $weightDimensions */
    public $weightDimensions;

    /** @var \app\Models\GoodsStatsWarehouseDTO[]|null $warehouses Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.*/
    public $warehouses = null;

    /** @var \app\Models\TariffDTO[]|null $tariffs Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).*/
    public $tariffs = null;

    /** @var string[]|null $pictures Ссылки (URL) изображений товара в хорошем качестве.*/
    public $pictures = null;

}
