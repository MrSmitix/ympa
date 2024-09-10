<?php
/**
 * GetPromoDTO
 */
namespace app\Models;

/**
 * GetPromoDTO
 * @description Информация об акции.
 */
class GetPromoDTO {

    /** @var string $id Идентификатор акции.*/
    public $id = "";

    /** @var string $name Название акции.*/
    public $name = "";

    /** @var \app\Models\PromoPeriodDTO $period */
    public $period;

    /** @var bool $participating Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).*/
    public $participating = false;

    /** @var \app\Models\GetPromoAssortmentInfoDTO $assortmentInfo */
    public $assortmentInfo;

    /** @var \app\Models\GetPromoMechanicsInfoDTO $mechanicsInfo */
    public $mechanicsInfo;

    /** @var \app\Models\GetPromoBestsellerInfoDTO $bestsellerInfo */
    public $bestsellerInfo;

    /** @var \app\Models\ChannelType[]|null $channels Список каналов продвижения товаров.*/
    public $channels = null;

    /** @var \app\Models\GetPromoConstraintsDTO $constraints */
    public $constraints;

}
