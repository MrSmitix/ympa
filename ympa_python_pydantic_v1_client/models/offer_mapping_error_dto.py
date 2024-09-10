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
from pydantic import BaseModel, Field, StrictInt, StrictStr
from ympa_python_pydantic_v1_client.models.offer_mapping_error_type import OfferMappingErrorType

class OfferMappingErrorDTO(BaseModel):
    """
    Текст ошибки.  # noqa: E501
    """
    type: OfferMappingErrorType = Field(...)
    parameter_id: Optional[StrictInt] = Field(default=None, alias="parameterId", description="Идентификатор характеристики, с которой связана ошибка.")
    message: StrictStr = Field(default=..., description="Текст ошибки.")
    __properties = ["type", "parameterId", "message"]

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
    def from_json(cls, json_str: str) -> OfferMappingErrorDTO:
        """Create an instance of OfferMappingErrorDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OfferMappingErrorDTO:
        """Create an instance of OfferMappingErrorDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OfferMappingErrorDTO.parse_obj(obj)

        _obj = OfferMappingErrorDTO.parse_obj({
            "type": obj.get("type"),
            "parameter_id": obj.get("parameterId"),
            "message": obj.get("message")
        })
        return _obj


