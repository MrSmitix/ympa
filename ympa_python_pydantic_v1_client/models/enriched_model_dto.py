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
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist
from ympa_python_pydantic_v1_client.models.model_offer_dto import ModelOfferDTO
from ympa_python_pydantic_v1_client.models.model_price_dto import ModelPriceDTO

class EnrichedModelDTO(BaseModel):
    """
    Модель товара.  # noqa: E501
    """
    id: Optional[StrictInt] = Field(default=None, description="Идентификатор модели товара.")
    name: Optional[StrictStr] = Field(default=None, description="Название модели товара.")
    prices: Optional[ModelPriceDTO] = None
    offers: Optional[conlist(ModelOfferDTO)] = Field(default=None, description="Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. ")
    offline_offers: Optional[StrictInt] = Field(default=None, alias="offlineOffers", description="Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.")
    online_offers: Optional[StrictInt] = Field(default=None, alias="onlineOffers", description="Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.")
    __properties = ["id", "name", "prices", "offers", "offlineOffers", "onlineOffers"]

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
    def from_json(cls, json_str: str) -> EnrichedModelDTO:
        """Create an instance of EnrichedModelDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of prices
        if self.prices:
            _dict['prices'] = self.prices.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in offers (list)
        _items = []
        if self.offers:
            for _item in self.offers:
                if _item:
                    _items.append(_item.to_dict())
            _dict['offers'] = _items
        # set to None if offers (nullable) is None
        # and __fields_set__ contains the field
        if self.offers is None and "offers" in self.__fields_set__:
            _dict['offers'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> EnrichedModelDTO:
        """Create an instance of EnrichedModelDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return EnrichedModelDTO.parse_obj(obj)

        _obj = EnrichedModelDTO.parse_obj({
            "id": obj.get("id"),
            "name": obj.get("name"),
            "prices": ModelPriceDTO.from_dict(obj.get("prices")) if obj.get("prices") is not None else None,
            "offers": [ModelOfferDTO.from_dict(_item) for _item in obj.get("offers")] if obj.get("offers") is not None else None,
            "offline_offers": obj.get("offlineOffers"),
            "online_offers": obj.get("onlineOffers")
        })
        return _obj


