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
from pydantic import BaseModel, Field
from ympa_python_pydantic_v1_client.models.order_status_change_delivery_dto import OrderStatusChangeDeliveryDTO
from ympa_python_pydantic_v1_client.models.order_status_type import OrderStatusType
from ympa_python_pydantic_v1_client.models.order_substatus_type import OrderSubstatusType

class OrderStatusChangeDTO(BaseModel):
    """
    Заказ.  # noqa: E501
    """
    status: OrderStatusType = Field(...)
    substatus: Optional[OrderSubstatusType] = None
    delivery: Optional[OrderStatusChangeDeliveryDTO] = None
    __properties = ["status", "substatus", "delivery"]

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
    def from_json(cls, json_str: str) -> OrderStatusChangeDTO:
        """Create an instance of OrderStatusChangeDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of delivery
        if self.delivery:
            _dict['delivery'] = self.delivery.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OrderStatusChangeDTO:
        """Create an instance of OrderStatusChangeDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OrderStatusChangeDTO.parse_obj(obj)

        _obj = OrderStatusChangeDTO.parse_obj({
            "status": obj.get("status"),
            "substatus": obj.get("substatus"),
            "delivery": OrderStatusChangeDeliveryDTO.from_dict(obj.get("delivery")) if obj.get("delivery") is not None else None
        })
        return _obj


