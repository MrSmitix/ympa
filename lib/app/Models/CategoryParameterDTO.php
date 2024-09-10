<?php
/**
 * CategoryParameterDTO
 */
namespace app\Models;

/**
 * CategoryParameterDTO
 * @description Характеристика товара.
 */
class CategoryParameterDTO {

    /** @var int $id Идентификатор характеристики.*/
    public $id = 0;

    /** @var string $name Название характеристики.*/
    public $name = "";

    /** @var string $type */
    public $type = "";

    /** @var \app\Models\CategoryParameterUnitDTO $unit */
    public $unit;

    /** @var string $description Описание характеристики.*/
    public $description = "";

    /** @var \app\Models\OfferCardRecommendationType[]|null $recommendationTypes Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.*/
    public $recommendationTypes = null;

    /** @var bool $required Обязательность характеристики.*/
    public $required = false;

    /** @var bool $filtering Используется ли характеристика в фильтре.*/
    public $filtering = false;

    /** @var bool $distinctive Является ли характеристика особенностью варианта.*/
    public $distinctive = false;

    /** @var bool $multivalue Можно ли передать сразу несколько значений.*/
    public $multivalue = false;

    /** @var bool $allowCustomValues Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.*/
    public $allowCustomValues = false;

    /** @var \app\Models\ParameterValueOptionDTO[]|null $values Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.*/
    public $values = null;

    /** @var \app\Models\ParameterValueConstraintsDTO $constraints */
    public $constraints;

    /** @var \app\Models\ValueRestrictionDTO[]|null $valueRestrictions Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.*/
    public $valueRestrictions = null;

}
