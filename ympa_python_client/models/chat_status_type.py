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
from enum import Enum
from typing_extensions import Self


class ChatStatusType(str, Enum):
    """
    Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. 
    """

    """
    allowed enum values
    """
    NEW = 'NEW'
    WAITING_FOR_CUSTOMER = 'WAITING_FOR_CUSTOMER'
    WAITING_FOR_PARTNER = 'WAITING_FOR_PARTNER'
    WAITING_FOR_ARBITER = 'WAITING_FOR_ARBITER'
    WAITING_FOR_MARKET = 'WAITING_FOR_MARKET'
    FINISHED = 'FINISHED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ChatStatusType from a JSON string"""
        return cls(json.loads(json_str))


