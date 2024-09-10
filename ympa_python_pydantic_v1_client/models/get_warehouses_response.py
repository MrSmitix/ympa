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
from pydantic import BaseModel
from ympa_python_pydantic_v1_client.models.api_response_status_type import ApiResponseStatusType
from ympa_python_pydantic_v1_client.models.warehouses_dto import WarehousesDTO

class GetWarehousesResponse(BaseModel):
    """
    GetWarehousesResponse
    """
    status: Optional[ApiResponseStatusType] = None
    result: Optional[WarehousesDTO] = None
    __properties = ["status", "result"]

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
    def from_json(cls, json_str: str) -> GetWarehousesResponse:
        """Create an instance of GetWarehousesResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of result
        if self.result:
            _dict['result'] = self.result.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> GetWarehousesResponse:
        """Create an instance of GetWarehousesResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return GetWarehousesResponse.parse_obj(obj)

        _obj = GetWarehousesResponse.parse_obj({
            "status": obj.get("status"),
            "result": WarehousesDTO.from_dict(obj.get("result")) if obj.get("result") is not None else None
        })
        return _obj


