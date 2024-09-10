<?php
/**
 * OrderItemDTO
 */
namespace app\Models;

/**
 * OrderItemDTO
 * @description Список товаров в заказе.
 */
class OrderItemDTO {

    /** @var int $id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.*/
    public $id = 0;

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var string $offerName Название товара.*/
    public $offerName = "";

    /** @var float $price Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;).*/
    public $price = 0;

    /** @var float $buyerPrice Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.*/
    public $buyerPrice = 0;

    /** @var float $buyerPriceBeforeDiscount Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.*/
    public $buyerPriceBeforeDiscount = 0;

    /** @var float $priceBeforeDiscount {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.*/
    /** @deprecated */
    public $priceBeforeDiscount = 0;

    /** @var int $count Количество единиц товара.*/
    public $count = 0;

    /** @var string $vat */
    public $vat = "";

    /** @var string $shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $shopSku = "";

    /** @var float $subsidy {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.*/
    /** @deprecated */
    public $subsidy = 0;

    /** @var string $partnerWarehouseId {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.*/
    /** @deprecated */
    public $partnerWarehouseId = "";

    /** @var \app\Models\OrderItemPromoDTO[]|null $promos Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.*/
    public $promos = null;

    /** @var \app\Models\OrderItemInstanceDTO[]|null $instances Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует.*/
    public $instances = null;

    /** @var \app\Models\OrderItemDetailDTO[]|null $details Информация об удалении товара из заказа.*/
    public $details = null;

    /** @var \app\Models\OrderItemSubsidyDTO[]|null $subsidies Список субсидий по типам.*/
    public $subsidies = null;

    /** @var \app\Models\OrderItemInstanceType[]|null $requiredInstanceTypes Список необходимых маркировок товара.*/
    public $requiredInstanceTypes = null;

}
