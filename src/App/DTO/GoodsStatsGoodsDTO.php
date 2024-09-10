<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о товаре.
 */
class GoodsStatsGoodsDTO
{
    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="shopSku", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":255})
     * @DTA\Validator(name="Match", options={"pattern":"/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/"})
     */
    public ?string $shop_sku = null;

    /**
     * SKU на Маркете.
     * @DTA\Data(field="marketSku", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $market_sku = null;

    /**
     * Название товара.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $price = null;

    /**
     * Идентификатор категории товара на Маркете.
     * @DTA\Data(field="categoryId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $category_id = null;

    /**
     * Название категории товара на Маркете.
     * @DTA\Data(field="categoryName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $category_name = null;

    /**
     * @DTA\Data(field="weightDimensions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsStatsWeightDimensionsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsStatsWeightDimensionsDTO::class})
     */
    public ?\App\DTO\GoodsStatsWeightDimensionsDTO $weight_dimensions = null;

    /**
     * Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.
     * @DTA\Data(field="warehouses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $warehouses = null;

    /**
     * Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).
     * @DTA\Data(field="tariffs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $tariffs = null;

    /**
     * Ссылки (URL) изображений товара в хорошем качестве.
     * @DTA\Data(field="pictures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $pictures = null;

}
