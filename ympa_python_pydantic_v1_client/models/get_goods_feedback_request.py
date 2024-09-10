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

from datetime import datetime
from typing import List, Optional
from pydantic import BaseModel, Field, StrictBool, StrictInt, conlist
from ympa_python_pydantic_v1_client.models.feedback_reaction_status_type import FeedbackReactionStatusType

class GetGoodsFeedbackRequest(BaseModel):
    """
    Фильтр запроса отзывов в кабинете.   # noqa: E501
    """
    date_time_from: Optional[datetime] = Field(default=None, alias="dateTimeFrom", description="Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. ")
    date_time_to: Optional[datetime] = Field(default=None, alias="dateTimeTo", description="Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. ")
    reaction_status: Optional[FeedbackReactionStatusType] = Field(default=None, alias="reactionStatus")
    rating_values: Optional[conlist(StrictInt, max_items=5, unique_items=True)] = Field(default=None, alias="ratingValues", description="Оценка товара.")
    model_ids: Optional[conlist(StrictInt, max_items=20, unique_items=True)] = Field(default=None, alias="modelIds", description="Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). ")
    paid: Optional[StrictBool] = Field(default=None, description="Фильтр отзывов за баллы Плюса.")
    __properties = ["dateTimeFrom", "dateTimeTo", "reactionStatus", "ratingValues", "modelIds", "paid"]

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
    def from_json(cls, json_str: str) -> GetGoodsFeedbackRequest:
        """Create an instance of GetGoodsFeedbackRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # set to None if rating_values (nullable) is None
        # and __fields_set__ contains the field
        if self.rating_values is None and "rating_values" in self.__fields_set__:
            _dict['ratingValues'] = None

        # set to None if model_ids (nullable) is None
        # and __fields_set__ contains the field
        if self.model_ids is None and "model_ids" in self.__fields_set__:
            _dict['modelIds'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> GetGoodsFeedbackRequest:
        """Create an instance of GetGoodsFeedbackRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return GetGoodsFeedbackRequest.parse_obj(obj)

        _obj = GetGoodsFeedbackRequest.parse_obj({
            "date_time_from": obj.get("dateTimeFrom"),
            "date_time_to": obj.get("dateTimeTo"),
            "reaction_status": obj.get("reactionStatus"),
            "rating_values": obj.get("ratingValues"),
            "model_ids": obj.get("modelIds"),
            "paid": obj.get("paid")
        })
        return _obj


