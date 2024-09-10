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

from datetime import date
from typing import Optional
from pydantic import BaseModel, Field, StrictStr
from ympa_python_pydantic_v1_client.models.order_document_status_type import OrderDocumentStatusType

class DocumentDTO(BaseModel):
    """
    Информация о документе.  # noqa: E501
    """
    status: Optional[OrderDocumentStatusType] = None
    number: Optional[StrictStr] = Field(default=None, description="Номер документа.")
    var_date: Optional[date] = Field(default=None, alias="date", description="Дата создания документа.")
    __properties = ["status", "number", "date"]

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
    def from_json(cls, json_str: str) -> DocumentDTO:
        """Create an instance of DocumentDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> DocumentDTO:
        """Create an instance of DocumentDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return DocumentDTO.parse_obj(obj)

        _obj = DocumentDTO.parse_obj({
            "status": obj.get("status"),
            "number": obj.get("number"),
            "var_date": obj.get("date")
        })
        return _obj


