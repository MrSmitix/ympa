<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Характеристика товара.
 */
class CategoryParameterDTO
{
    /**
     * Идентификатор характеристики.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Название характеристики.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ParameterType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ParameterType::class})
     * @var \App\DTO\ParameterType|null
     */
    public $type;

    /**
     * @DTA\Data(field="unit", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CategoryParameterUnitDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CategoryParameterUnitDTO::class})
     * @var \App\DTO\CategoryParameterUnitDTO|null
     */
    public $unit;

    /**
     * Описание характеристики.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
     * @DTA\Data(field="recommendationTypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\OfferCardRecommendationType[]|null
     */
    public $recommendation_types;

    /**
     * Обязательность характеристики.
     * @DTA\Data(field="required")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $required;

    /**
     * Используется ли характеристика в фильтре.
     * @DTA\Data(field="filtering")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $filtering;

    /**
     * Является ли характеристика особенностью варианта.
     * @DTA\Data(field="distinctive")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $distinctive;

    /**
     * Можно ли передать сразу несколько значений.
     * @DTA\Data(field="multivalue")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $multivalue;

    /**
     * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.
     * @DTA\Data(field="allowCustomValues")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $allow_custom_values;

    /**
     * Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.
     * @DTA\Data(field="values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ParameterValueOptionDTO[]|null
     */
    public $values;

    /**
     * @DTA\Data(field="constraints", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ParameterValueConstraintsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ParameterValueConstraintsDTO::class})
     * @var \App\DTO\ParameterValueConstraintsDTO|null
     */
    public $constraints;

    /**
     * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.
     * @DTA\Data(field="valueRestrictions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ValueRestrictionDTO[]|null
     */
    public $value_restrictions;

}
