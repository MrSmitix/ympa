# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
import pprint
import re  # noqa: F401
from enum import Enum



try:
    from typing import Self
except ImportError:
    from typing_extensions import Self


class GoodsFeedbackCommentAuthorType(str, Enum):
    """
    Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
    """

    """
    allowed enum values
    """
    USER = 'USER'
    BUSINESS = 'BUSINESS'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of GoodsFeedbackCommentAuthorType from a JSON string"""
        return cls(json.loads(json_str))


