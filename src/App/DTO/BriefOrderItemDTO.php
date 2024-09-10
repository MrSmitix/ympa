<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о маркированном товаре.
 */
class BriefOrderItemDTO
{
    /**
     * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="vat", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderVatType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderVatType::class})
     * @var \App\DTO\OrderVatType|null
     */
    public $vat;

    /**
     * Количество единиц товара.
     * @DTA\Data(field="count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $count;

    /**
     * Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $price;

    /**
     * Название товара.
     * @DTA\Data(field="offerName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $offer_name;

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="offerId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":255})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/"})
     * @var string|null
     */
    public $offer_id;

    /**
     * Переданные вами коды маркировки.
     * @DTA\Data(field="instances", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OrderItemInstanceDTO[]|null
     */
    public $instances;

}
