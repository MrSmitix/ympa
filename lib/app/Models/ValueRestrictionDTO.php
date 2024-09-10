<?php
/**
 * ValueRestrictionDTO
 */
namespace app\Models;

/**
 * ValueRestrictionDTO
 * @description Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`.
 */
class ValueRestrictionDTO {

    /** @var int $limitingParameterId Идентификатор ограничивающей характеристики.*/
    public $limitingParameterId = 0;

    /** @var \app\Models\OptionValuesLimitedDTO[] $limitedValues Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.*/
    public $limitedValues = [];

}
