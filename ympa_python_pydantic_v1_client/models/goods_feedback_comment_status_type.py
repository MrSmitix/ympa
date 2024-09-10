# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import json
import pprint
import re  # noqa: F401
from aenum import Enum, no_arg





class GoodsFeedbackCommentStatusType(str, Enum):
    """
    Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
    """

    """
    allowed enum values
    """
    PUBLISHED = 'PUBLISHED'
    UNMODERATED = 'UNMODERATED'
    BANNED = 'BANNED'
    DELETED = 'DELETED'

    @classmethod
    def from_json(cls, json_str: str) -> GoodsFeedbackCommentStatusType:
        """Create an instance of GoodsFeedbackCommentStatusType from a JSON string"""
        return GoodsFeedbackCommentStatusType(json.loads(json_str))


