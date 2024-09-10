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
     */
    public ?int $market_sku = null;

    /**
     * Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
     * @DTA\Data(field="marketSkuName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $market_sku_name = null;

    /**
     * Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
     * @DTA\Data(field="marketModelId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $market_model_id = null;

    /**
     * Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.
     * @DTA\Data(field="marketModelName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $market_model_name = null;

    /**
     * Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.
     * @DTA\Data(field="marketCategoryId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $market_category_id = null;

    /**
     * Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.
     * @DTA\Data(field="marketCategoryName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $market_category_name = null;

}
