<?php
/**
 * OfferParamDTO
 */
namespace app\Models;

/**
 * OfferParamDTO
 * @description Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же `name`, но разными `value`.  {% cut \"Пример\" %}  ```json \"params\": [   {     \"name\": \"Цвет\",     \"value\": \"Зеленый\"   },   {     \"name\": \"Цвет\",     \"value\": \"Желтый\"   } ] ```  {% endcut %}
 */
class OfferParamDTO {

    /** @var string $name Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).*/
    public $name = "";

    /** @var string $value Значение.*/
    public $value = "";

}
