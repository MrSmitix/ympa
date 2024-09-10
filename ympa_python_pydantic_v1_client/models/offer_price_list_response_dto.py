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
from pydantic import BaseModel, Field, StrictInt, conlist
from ympa_python_pydantic_v1_client.models.offer_price_response_dto import OfferPriceResponseDTO
from ympa_python_pydantic_v1_client.models.scrolling_pager_dto import ScrollingPagerDTO

class OfferPriceListResponseDTO(BaseModel):
    """
    Список цен на товары.  # noqa: E501
    """
    offers: conlist(OfferPriceResponseDTO) = Field(default=..., description="Страница списка.")
    paging: Optional[ScrollingPagerDTO] = None
    total: Optional[StrictInt] = Field(default=None, description="Количество всех цен магазина, измененных через API.")
    __properties = ["offers", "paging", "total"]

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
    def from_json(cls, json_str: str) -> OfferPriceListResponseDTO:
        """Create an instance of OfferPriceListResponseDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in offers (list)
        _items = []
        if self.offers:
            for _item in self.offers:
                if _item:
                    _items.append(_item.to_dict())
            _dict['offers'] = _items
        # override the default output from pydantic by calling `to_dict()` of paging
        if self.paging:
            _dict['paging'] = self.paging.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OfferPriceListResponseDTO:
        """Create an instance of OfferPriceListResponseDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OfferPriceListResponseDTO.parse_obj(obj)

        _obj = OfferPriceListResponseDTO.parse_obj({
            "offers": [OfferPriceResponseDTO.from_dict(_item) for _item in obj.get("offers")] if obj.get("offers") is not None else None,
            "paging": ScrollingPagerDTO.from_dict(obj.get("paging")) if obj.get("paging") is not None else None,
            "total": obj.get("total")
        })
        return _obj


