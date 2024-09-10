<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */
class CalculateTariffsOfferDTO
{
    /**
     * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     * @DTA\Data(field="categoryId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "exclude_min":true})
     */
    public ?int $category_id = null;

    /**
     * Цена на товар в рублях.
     * @DTA\Data(field="price")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "exclude_min":true})
     */
    public ?float $price = null;

    /**
     * Длина товара в сантиметрах.
     * @DTA\Data(field="length")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "exclude_min":true})
     */
    public ?float $length = null;

    /**
     * Ширина товара в сантиметрах.
     * @DTA\Data(field="width")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "exclude_min":true})
     */
    public ?float $width = null;

    /**
     * Высота товара в сантиметрах.
     * @DTA\Data(field="height")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "exclude_min":true})
     */
    public ?float $height = null;

    /**
     * Вес товара в килограммах.
     * @DTA\Data(field="weight")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "exclude_min":true})
     */
    public ?float $weight = null;

    /**
     * Квант продажи — количество единиц товара в одном товарном предложении.
     * @DTA\Data(field="quantity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1})
     */
    public ?int $quantity = null;

}
