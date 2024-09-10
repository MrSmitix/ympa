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


from typing import List, Optional
from pydantic import BaseModel, Field, conlist
from ympa_python_pydantic_v1_client.models.api_error_dto import ApiErrorDTO
from ympa_python_pydantic_v1_client.models.api_response_status_type import ApiResponseStatusType

class ApiUnauthorizedErrorResponse(BaseModel):
    """
    В запросе не указаны авторизационные данные.  # noqa: E501
    """
    status: Optional[ApiResponseStatusType] = None
    errors: Optional[conlist(ApiErrorDTO)] = Field(default=None, description="Список ошибок.")
    __properties = ["status", "errors"]

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
    def from_json(cls, json_str: str) -> ApiUnauthorizedErrorResponse:
        """Create an instance of ApiUnauthorizedErrorResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in errors (list)
        _items = []
        if self.errors:
            for _item in self.errors:
                if _item:
                    _items.append(_item.to_dict())
            _dict['errors'] = _items
        # set to None if errors (nullable) is None
        # and __fields_set__ contains the field
        if self.errors is None and "errors" in self.__fields_set__:
            _dict['errors'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> ApiUnauthorizedErrorResponse:
        """Create an instance of ApiUnauthorizedErrorResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return ApiUnauthorizedErrorResponse.parse_obj(obj)

        _obj = ApiUnauthorizedErrorResponse.parse_obj({
            "status": obj.get("status"),
            "errors": [ApiErrorDTO.from_dict(_item) for _item in obj.get("errors")] if obj.get("errors") is not None else None
        })
        return _obj


