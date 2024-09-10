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


from typing import List
from pydantic import BaseModel, Field, conlist
from ympa_python_pydantic_v1_client.models.enriched_model_dto import EnrichedModelDTO

class EnrichedModelsDTO(BaseModel):
    """
    Список моделей товаров.  # noqa: E501
    """
    models: conlist(EnrichedModelDTO) = Field(default=..., description="Список моделей товаров.")
    __properties = ["models"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> EnrichedModelsDTO:
        """Create an instance of EnrichedModelsDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in models (list)
        _items = []
        if self.models:
            for _item in self.models:
                if _item:
                    _items.append(_item.to_dict())
            _dict['models'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> EnrichedModelsDTO:
        """Create an instance of EnrichedModelsDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return EnrichedModelsDTO.parse_obj(obj)

        _obj = EnrichedModelsDTO.parse_obj({
            "models": [EnrichedModelDTO.from_dict(_item) for _item in obj.get("models")] if obj.get("models") is not None else None
        })
        return _obj


