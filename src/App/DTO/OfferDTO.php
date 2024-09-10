<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Предложение.
 */
class OfferDTO
{
    /**
     * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $price;

    /**
     * Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.
     * @DTA\Data(field="feedId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $feed_id;

    /**
     * Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.
     * @DTA\Data(field="shopCategoryId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $shop_category_id;

    /**
     * Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.
     * @DTA\Data(field="marketCategoryId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $market_category_id;

    /**
     * Цена предложения без скидки.
     * @DTA\Data(field="preDiscountPrice", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $pre_discount_price;

    /**
     * Скидка на предложение в процентах.
     * @DTA\Data(field="discount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $discount;

    /**
     * Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API.
     * @DTA\Data(field="cutPrice", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $cut_price;

    /**
     * URL-адрес предложения на сайте магазина.
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %}
     * @DTA\Data(field="modelId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $model_id;

    /**
     * Наименование предложения.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CurrencyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CurrencyType::class})
     * @var \App\DTO\CurrencyType|null
     */
    public $currency;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.
     * @DTA\Data(field="bid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $bid;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.
     * @DTA\Data(field="cbid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $cbid;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.
     * @DTA\Data(field="fee", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $fee;

    /**
     * Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.
     * @DTA\Data(field="blocked", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $blocked;

}
