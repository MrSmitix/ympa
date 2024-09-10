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
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist
from ympa_python_pydantic_v1_client.models.feedback_comment_author_dto import FeedbackCommentAuthorDTO

class FeedbackCommentDTO(BaseModel):
    """
    Комментарий к отзыву на магазин.  # noqa: E501
    """
    id: Optional[StrictInt] = Field(default=None, description="Идентификатор ответа.")
    parent_id: Optional[StrictInt] = Field(default=None, alias="parentId", description="Идентификатор родительского ответа.")
    body: Optional[StrictStr] = Field(default=None, description="Текст ответа.")
    created_at: Optional[datetime] = Field(default=None, alias="createdAt", description="Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
    updated_at: Optional[datetime] = Field(default=None, alias="updatedAt", description="Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
    author: Optional[FeedbackCommentAuthorDTO] = None
    children: Optional[conlist(FeedbackCommentDTO)] = Field(default=None, description="Дочерние ответы.")
    __properties = ["id", "parentId", "body", "createdAt", "updatedAt", "author", "children"]

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
    def from_json(cls, json_str: str) -> FeedbackCommentDTO:
        """Create an instance of FeedbackCommentDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of author
        if self.author:
            _dict['author'] = self.author.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in children (list)
        _items = []
        if self.children:
            for _item in self.children:
                if _item:
                    _items.append(_item.to_dict())
            _dict['children'] = _items
        # set to None if children (nullable) is None
        # and __fields_set__ contains the field
        if self.children is None and "children" in self.__fields_set__:
            _dict['children'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> FeedbackCommentDTO:
        """Create an instance of FeedbackCommentDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return FeedbackCommentDTO.parse_obj(obj)

        _obj = FeedbackCommentDTO.parse_obj({
            "id": obj.get("id"),
            "parent_id": obj.get("parentId"),
            "body": obj.get("body"),
            "created_at": obj.get("createdAt"),
            "updated_at": obj.get("updatedAt"),
            "author": FeedbackCommentAuthorDTO.from_dict(obj.get("author")) if obj.get("author") is not None else None,
            "children": [FeedbackCommentDTO.from_dict(_item) for _item in obj.get("children")] if obj.get("children") is not None else None
        })
        return _obj

FeedbackCommentDTO.update_forward_refs()

