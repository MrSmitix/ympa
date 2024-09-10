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
from typing import List, Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist

class GenerateUnitedOrdersRequest(BaseModel):
    """
    Данные, необходимые для генерации отчета.   # noqa: E501
    """
    business_id: StrictInt = Field(default=..., alias="businessId", description="Идентификатор бизнеса.")
    date_from: date = Field(default=..., alias="dateFrom", description="Начало периода, включительно.")
    date_to: date = Field(default=..., alias="dateTo", description="Конец периода, включительно. Максимальный период — 1 год.")
    campaign_ids: Optional[conlist(StrictInt)] = Field(default=None, alias="campaignIds", description="Список магазинов, которые нужны в отчете.")
    promo_id: Optional[StrictStr] = Field(default=None, alias="promoId", description="Идентификатор акции, товары из которой нужны в отчете.")
    __properties = ["businessId", "dateFrom", "dateTo", "campaignIds", "promoId"]

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
    def from_json(cls, json_str: str) -> GenerateUnitedOrdersRequest:
        """Create an instance of GenerateUnitedOrdersRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # set to None if campaign_ids (nullable) is None
        # and __fields_set__ contains the field
        if self.campaign_ids is None and "campaign_ids" in self.__fields_set__:
            _dict['campaignIds'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> GenerateUnitedOrdersRequest:
        """Create an instance of GenerateUnitedOrdersRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return GenerateUnitedOrdersRequest.parse_obj(obj)

        _obj = GenerateUnitedOrdersRequest.parse_obj({
            "business_id": obj.get("businessId"),
            "date_from": obj.get("dateFrom"),
            "date_to": obj.get("dateTo"),
            "campaign_ids": obj.get("campaignIds"),
            "promo_id": obj.get("promoId")
        })
        return _obj


