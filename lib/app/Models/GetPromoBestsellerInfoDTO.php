<?php
/**
 * GetPromoBestsellerInfoDTO
 */
namespace app\Models;

/**
 * GetPromoBestsellerInfoDTO
 * @description Информация об акции «Бестселлеры Маркета».
 */
class GetPromoBestsellerInfoDTO {

    /** @var bool $bestseller Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).*/
    public $bestseller = false;

    /** @var \DateTime $entryDeadline До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».*/
    public $entryDeadline;

}
