<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о текущей карточке товара на Маркете.
 */
class OfferMappingDTO
{
    /**
     * SKU на Маркете.
     * @DTA\Data(field="marketSku", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $market_sku;

    /**
     * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара.
     * @DTA\Data(field="modelId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $model_id;

    /**
     * Идентификатор категории для текущей карточки товара на Маркете.
     * @DTA\Data(field="categoryId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $category_id;

}
