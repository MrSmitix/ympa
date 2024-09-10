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
from pydantic import BaseModel, Field, conlist, constr, validator

class DeleteCampaignOffersDTO(BaseModel):
    """
    Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.  # noqa: E501
    """
    not_deleted_offer_ids: Optional[conlist(constr(strict=True, max_length=255, min_length=1))] = Field(default=None, alias="notDeletedOfferIds", description="Список SKU.")
    __properties = ["notDeletedOfferIds"]

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
    def from_json(cls, json_str: str) -> DeleteCampaignOffersDTO:
        """Create an instance of DeleteCampaignOffersDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # set to None if not_deleted_offer_ids (nullable) is None
        # and __fields_set__ contains the field
        if self.not_deleted_offer_ids is None and "not_deleted_offer_ids" in self.__fields_set__:
            _dict['notDeletedOfferIds'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> DeleteCampaignOffersDTO:
        """Create an instance of DeleteCampaignOffersDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return DeleteCampaignOffersDTO.parse_obj(obj)

        _obj = DeleteCampaignOffersDTO.parse_obj({
            "not_deleted_offer_ids": obj.get("notDeletedOfferIds")
        })
        return _obj


