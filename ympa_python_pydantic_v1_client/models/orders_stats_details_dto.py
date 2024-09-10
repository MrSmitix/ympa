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
from pydantic import BaseModel, Field, StrictInt
from ympa_python_pydantic_v1_client.models.orders_stats_item_status_type import OrdersStatsItemStatusType
from ympa_python_pydantic_v1_client.models.orders_stats_stock_type import OrdersStatsStockType

class OrdersStatsDetailsDTO(BaseModel):
    """
    Информация об удалении товара из заказа.  # noqa: E501
    """
    item_status: Optional[OrdersStatsItemStatusType] = Field(default=None, alias="itemStatus")
    item_count: Optional[StrictInt] = Field(default=None, alias="itemCount", description="Количество товара со статусом, указанном в параметре `itemStatus`.")
    update_date: Optional[date] = Field(default=None, alias="updateDate", description="Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
    stock_type: Optional[OrdersStatsStockType] = Field(default=None, alias="stockType")
    __properties = ["itemStatus", "itemCount", "updateDate", "stockType"]

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
    def from_json(cls, json_str: str) -> OrdersStatsDetailsDTO:
        """Create an instance of OrdersStatsDetailsDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OrdersStatsDetailsDTO:
        """Create an instance of OrdersStatsDetailsDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OrdersStatsDetailsDTO.parse_obj(obj)

        _obj = OrdersStatsDetailsDTO.parse_obj({
            "item_status": obj.get("itemStatus"),
            "item_count": obj.get("itemCount"),
            "update_date": obj.get("updateDate"),
            "stock_type": obj.get("stockType")
        })
        return _obj


