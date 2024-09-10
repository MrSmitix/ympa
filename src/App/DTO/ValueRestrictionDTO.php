<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;.
 */
class ValueRestrictionDTO
{
    /**
     * Идентификатор ограничивающей характеристики.
     * @DTA\Data(field="limitingParameterId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $limiting_parameter_id = null;

    /**
     * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
     * @DTA\Data(field="limitedValues")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $limited_values = null;

}
