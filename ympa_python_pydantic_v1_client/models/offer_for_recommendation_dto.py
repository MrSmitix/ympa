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
from pydantic import BaseModel, Field, StrictInt, constr, validator
from ympa_python_pydantic_v1_client.models.base_price_dto import BasePriceDTO
from ympa_python_pydantic_v1_client.models.get_price_dto import GetPriceDTO
from ympa_python_pydantic_v1_client.models.price_competitiveness_type import PriceCompetitivenessType

class OfferForRecommendationDTO(BaseModel):
    """
    Информация о состоянии цены на товар.  # noqa: E501
    """
    offer_id: Optional[constr(strict=True, max_length=255, min_length=1)] = Field(default=None, alias="offerId", description="Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    price: Optional[BasePriceDTO] = None
    cofinance_price: Optional[GetPriceDTO] = Field(default=None, alias="cofinancePrice")
    competitiveness: Optional[PriceCompetitivenessType] = None
    shows: Optional[StrictInt] = Field(default=None, description="Количество показов карточки товара за последние 7 дней.")
    __properties = ["offerId", "price", "cofinancePrice", "competitiveness", "shows"]

    @validator('offer_id')
    def offer_id_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$", value):
            raise ValueError(r"must validate the regular expression /^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/")
        return value

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
    def from_json(cls, json_str: str) -> OfferForRecommendationDTO:
        """Create an instance of OfferForRecommendationDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of price
        if self.price:
            _dict['price'] = self.price.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cofinance_price
        if self.cofinance_price:
            _dict['cofinancePrice'] = self.cofinance_price.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> OfferForRecommendationDTO:
        """Create an instance of OfferForRecommendationDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return OfferForRecommendationDTO.parse_obj(obj)

        _obj = OfferForRecommendationDTO.parse_obj({
            "offer_id": obj.get("offerId"),
            "price": BasePriceDTO.from_dict(obj.get("price")) if obj.get("price") is not None else None,
            "cofinance_price": GetPriceDTO.from_dict(obj.get("cofinancePrice")) if obj.get("cofinancePrice") is not None else None,
            "competitiveness": obj.get("competitiveness"),
            "shows": obj.get("shows")
        })
        return _obj


