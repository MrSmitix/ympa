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


from typing import Optional
from pydantic import BaseModel, Field, StrictStr

class GoodsFeedbackDescriptionDTO(BaseModel):
    """
    Текстовая часть отзыва.  # noqa: E501
    """
    advantages: Optional[StrictStr] = Field(default=None, description="Описание плюсов товара в отзыве.")
    disadvantages: Optional[StrictStr] = Field(default=None, description="Описание минусов товара в отзыве.")
    comment: Optional[StrictStr] = Field(default=None, description="Комментарий в отзыве.")
    __properties = ["advantages", "disadvantages", "comment"]

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
    def from_json(cls, json_str: str) -> GoodsFeedbackDescriptionDTO:
        """Create an instance of GoodsFeedbackDescriptionDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> GoodsFeedbackDescriptionDTO:
        """Create an instance of GoodsFeedbackDescriptionDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return GoodsFeedbackDescriptionDTO.parse_obj(obj)

        _obj = GoodsFeedbackDescriptionDTO.parse_obj({
            "advantages": obj.get("advantages"),
            "disadvantages": obj.get("disadvantages"),
            "comment": obj.get("comment")
        })
        return _obj


