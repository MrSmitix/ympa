<?php
/**
 * PromoOfferAutoParticipatingDetailsDTO
 */
namespace app\Models;

/**
 * PromoOfferAutoParticipatingDetailsDTO
 * @description Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
 */
class PromoOfferAutoParticipatingDetailsDTO {

    /** @var int[]|null $campaignIds Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;.*/
    public $campaignIds = null;

}
