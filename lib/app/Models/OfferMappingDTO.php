<?php
/**
 * OfferMappingDTO
 */
namespace app\Models;

/**
 * OfferMappingDTO
 * @description Информация о текущей карточке товара на Маркете.
 */
class OfferMappingDTO {

    /** @var int $marketSku SKU на Маркете.*/
    public $marketSku = 0;

    /** @var int $modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара.*/
    public $modelId = 0;

    /** @var int $categoryId Идентификатор категории для текущей карточки товара на Маркете.*/
    public $categoryId = 0;

}
