
package org.openapitools.client.model


case class CategoryParameterDTO (
    /* Идентификатор характеристики. */
    _id: Long,
    /* Название характеристики. */
    _name: Option[String],
    _type: ParameterType,
    _unit: Option[CategoryParameterUnitDTO],
    /* Описание характеристики. */
    _description: Option[String],
    /* Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. */
    _recommendationTypes: Option[List[OfferCardRecommendationType]],
    /* Обязательность характеристики. */
    _required: Boolean,
    /* Используется ли характеристика в фильтре. */
    _filtering: Boolean,
    /* Является ли характеристика особенностью варианта. */
    _distinctive: Boolean,
    /* Можно ли передать сразу несколько значений. */
    _multivalue: Boolean,
    /* Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. */
    _allowCustomValues: Boolean,
    /* Список допустимых значений параметра. Только для характеристик типа `ENUM`. */
    _values: Option[List[ParameterValueOptionDTO]],
    _constraints: Option[ParameterValueConstraintsDTO],
    /* Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. */
    _valueRestrictions: Option[List[ValueRestrictionDTO]]
)
object CategoryParameterDTO {
    def toStringBody(var_id: Object, var_name: Object, var_type: Object, var_unit: Object, var_description: Object, var_recommendationTypes: Object, var_required: Object, var_filtering: Object, var_distinctive: Object, var_multivalue: Object, var_allowCustomValues: Object, var_values: Object, var_constraints: Object, var_valueRestrictions: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"type":$var_type,"unit":$var_unit,"description":$var_description,"recommendationTypes":$var_recommendationTypes,"required":$var_required,"filtering":$var_filtering,"distinctive":$var_distinctive,"multivalue":$var_multivalue,"allowCustomValues":$var_allowCustomValues,"values":$var_values,"constraints":$var_constraints,"valueRestrictions":$var_valueRestrictions
        | }
        """.stripMargin
}
