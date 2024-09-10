<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png)
 */
class OfferWeightDimensionsDTO
{
    /**
     * Длина упаковки в см.
     * @DTA\Data(field="length")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $length = null;

    /**
     * Ширина упаковки в см.
     * @DTA\Data(field="width")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $width = null;

    /**
     * Высота упаковки в см.
     * @DTA\Data(field="height")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $height = null;

    /**
     * Вес товара в кг с учетом упаковки (брутто).
     * @DTA\Data(field="weight")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $weight = null;

}
