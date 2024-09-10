<?php
/**
 * ParameterValueDTO
 */
namespace app\Models;

/**
 * ParameterValueDTO
 * @description Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым.
 */
class ParameterValueDTO {

    /** @var int $parameterId Идентификатор характеристики.*/
    public $parameterId = 0;

    /** @var int $unitId Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию.*/
    public $unitId = 0;

    /** @var int $valueId Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;.*/
    public $valueId = 0;

    /** @var string $value Значение.*/
    public $value = "";

}
