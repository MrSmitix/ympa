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


from typing import Optional, Union
from pydantic import BaseModel, Field, StrictFloat, StrictInt
from ympa_python_pydantic_v1_client.models.orders_stats_price_type import OrdersStatsPriceType

class OrdersStatsPriceDTO(BaseModel):
    """
    Цена или скидки на товар.  # noqa: E501
    """
    type: Optional[OrdersStatsPriceType] = None
    cost_per_item: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="costPerItem", description="Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
    total: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
    __properties = ["type", "costPerItem", "total"]

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
    def from_json(cls, json_str: str) -> OrdersStatsPriceDTO:
        """Create an instance of OrdersStatsPriceDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OrdersStatsPriceDTO:
        """Create an instance of OrdersStatsPriceDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OrdersStatsPriceDTO.parse_obj(obj)

        _obj = OrdersStatsPriceDTO.parse_obj({
            "type": obj.get("type"),
            "cost_per_item": obj.get("costPerItem"),
            "total": obj.get("total")
        })
        return _obj


