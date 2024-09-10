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
from pydantic import BaseModel, Field, confloat, conint
from ympa_python_pydantic_v1_client.models.currency_type import CurrencyType

class UpdatePriceWithDiscountDTO(BaseModel):
    """
    Цена с указанием скидки.  # noqa: E501
    """
    value: Union[confloat(gt=0, strict=True), conint(gt=0, strict=True)] = Field(default=..., description="Значение.")
    currency_id: CurrencyType = Field(default=..., alias="currencyId")
    discount_base: Optional[Union[confloat(gt=0, strict=True), conint(gt=0, strict=True)]] = Field(default=None, alias="discountBase", description="Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ")
    __properties = ["value", "currencyId", "discountBase"]

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
    def from_json(cls, json_str: str) -> UpdatePriceWithDiscountDTO:
        """Create an instance of UpdatePriceWithDiscountDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> UpdatePriceWithDiscountDTO:
        """Create an instance of UpdatePriceWithDiscountDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return UpdatePriceWithDiscountDTO.parse_obj(obj)

        _obj = UpdatePriceWithDiscountDTO.parse_obj({
            "value": obj.get("value"),
            "currency_id": obj.get("currencyId"),
            "discount_base": obj.get("discountBase")
        })
        return _obj


