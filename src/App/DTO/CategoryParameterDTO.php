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
     */
    public ?int $id = null;

    /**
     * Название характеристики.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ParameterType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ParameterType::class})
     */
    public ?\App\DTO\ParameterType $type = null;

    /**
     * @DTA\Data(field="unit", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CategoryParameterUnitDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CategoryParameterUnitDTO::class})
     */
    public ?\App\DTO\CategoryParameterUnitDTO $unit = null;

    /**
     * Описание характеристики.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
     * @DTA\Data(field="recommendationTypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $recommendation_types = null;

    /**
     * Обязательность характеристики.
     * @DTA\Data(field="required")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $required = null;

    /**
     * Используется ли характеристика в фильтре.
     * @DTA\Data(field="filtering")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $filtering = null;

    /**
     * Является ли характеристика особенностью варианта.
     * @DTA\Data(field="distinctive")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $distinctive = null;

    /**
     * Можно ли передать сразу несколько значений.
     * @DTA\Data(field="multivalue")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $multivalue = null;

    /**
     * Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.
     * @DTA\Data(field="allowCustomValues")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $allow_custom_values = null;

    /**
     * Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.
     * @DTA\Data(field="values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $values = null;

    /**
     * @DTA\Data(field="constraints", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ParameterValueConstraintsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ParameterValueConstraintsDTO::class})
     */
    public ?\App\DTO\ParameterValueConstraintsDTO $constraints = null;

    /**
     * Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.
     * @DTA\Data(field="valueRestrictions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $value_restrictions = null;

}
