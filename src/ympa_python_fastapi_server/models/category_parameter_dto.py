# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json




from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ympa_python_fastapi_server.models.category_parameter_unit_dto import CategoryParameterUnitDTO
from ympa_python_fastapi_server.models.offer_card_recommendation_type import OfferCardRecommendationType
from ympa_python_fastapi_server.models.parameter_type import ParameterType
from ympa_python_fastapi_server.models.parameter_value_constraints_dto import ParameterValueConstraintsDTO
from ympa_python_fastapi_server.models.parameter_value_option_dto import ParameterValueOptionDTO
from ympa_python_fastapi_server.models.value_restriction_dto import ValueRestrictionDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class CategoryParameterDTO(BaseModel):
    """
    Характеристика товара.
    """ # noqa: E501
    id: StrictInt = Field(description="Идентификатор характеристики.")
    name: Optional[StrictStr] = Field(default=None, description="Название характеристики.")
    type: ParameterType
    unit: Optional[CategoryParameterUnitDTO] = None
    description: Optional[StrictStr] = Field(default=None, description="Описание характеристики.")
    recommendation_types: Optional[List[OfferCardRecommendationType]] = Field(default=None, description="Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.", alias="recommendationTypes")
    required: StrictBool = Field(description="Обязательность характеристики.")
    filtering: StrictBool = Field(description="Используется ли характеристика в фильтре.")
    distinctive: StrictBool = Field(description="Является ли характеристика особенностью варианта.")
    multivalue: StrictBool = Field(description="Можно ли передать сразу несколько значений.")
    allow_custom_values: StrictBool = Field(description="Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.", alias="allowCustomValues")
    values: Optional[List[ParameterValueOptionDTO]] = Field(default=None, description="Список допустимых значений параметра. Только для характеристик типа `ENUM`.")
    constraints: Optional[ParameterValueConstraintsDTO] = None
    value_restrictions: Optional[List[ValueRestrictionDTO]] = Field(default=None, description="Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.", alias="valueRestrictions")
    __properties: ClassVar[List[str]] = ["id", "name", "type", "unit", "description", "recommendationTypes", "required", "filtering", "distinctive", "multivalue", "allowCustomValues", "values", "constraints", "valueRestrictions"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of CategoryParameterDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
            },
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of unit
        if self.unit:
            _dict['unit'] = self.unit.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in values (list)
        _items = []
        if self.values:
            for _item in self.values:
                if _item:
                    _items.append(_item.to_dict())
            _dict['values'] = _items
        # override the default output from pydantic by calling `to_dict()` of constraints
        if self.constraints:
            _dict['constraints'] = self.constraints.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in value_restrictions (list)
        _items = []
        if self.value_restrictions:
            for _item in self.value_restrictions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['valueRestrictions'] = _items
        # set to None if recommendation_types (nullable) is None
        # and model_fields_set contains the field
        if self.recommendation_types is None and "recommendation_types" in self.model_fields_set:
            _dict['recommendationTypes'] = None

        # set to None if values (nullable) is None
        # and model_fields_set contains the field
        if self.values is None and "values" in self.model_fields_set:
            _dict['values'] = None

        # set to None if value_restrictions (nullable) is None
        # and model_fields_set contains the field
        if self.value_restrictions is None and "value_restrictions" in self.model_fields_set:
            _dict['valueRestrictions'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of CategoryParameterDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "name": obj.get("name"),
            "type": obj.get("type"),
            "unit": CategoryParameterUnitDTO.from_dict(obj.get("unit")) if obj.get("unit") is not None else None,
            "description": obj.get("description"),
            "recommendationTypes": obj.get("recommendationTypes"),
            "required": obj.get("required"),
            "filtering": obj.get("filtering"),
            "distinctive": obj.get("distinctive"),
            "multivalue": obj.get("multivalue"),
            "allowCustomValues": obj.get("allowCustomValues"),
            "values": [ParameterValueOptionDTO.from_dict(_item) for _item in obj.get("values")] if obj.get("values") is not None else None,
            "constraints": ParameterValueConstraintsDTO.from_dict(obj.get("constraints")) if obj.get("constraints") is not None else None,
            "valueRestrictions": [ValueRestrictionDTO.from_dict(_item) for _item in obj.get("valueRestrictions")] if obj.get("valueRestrictions") is not None else None
        })
        return _obj


