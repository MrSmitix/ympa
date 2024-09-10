<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о товарах в каталоге.
 */
class GetMappingDTO
{
    /**
     * SKU на Маркете.
     * @DTA\Data(field="marketSku", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $market_sku;

    /**
     * Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
     * @DTA\Data(field="marketSkuName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $market_sku_name;

    /**
     * Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
     * @DTA\Data(field="marketModelId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $market_model_id;

    /**
     * Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
     * @DTA\Data(field="marketModelName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $market_model_name;

    /**
     * Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.
     * @DTA\Data(field="marketCategoryId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $market_category_id;

    /**
     * Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.
     * @DTA\Data(field="marketCategoryName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $market_category_name;

}
