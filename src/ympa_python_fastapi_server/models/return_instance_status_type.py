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


class ReturnInstanceStatusType(str, Enum):
    """
    Логистический статус конкретного товара.
    """

    """
    allowed enum values
    """
    CREATED = 'CREATED'
    RECEIVED = 'RECEIVED'
    IN_TRANSIT = 'IN_TRANSIT'
    READY_FOR_PICKUP = 'READY_FOR_PICKUP'
    PICKED = 'PICKED'
    RECEIVED_ON_FULFILLMENT = 'RECEIVED_ON_FULFILLMENT'
    CANCELLED = 'CANCELLED'
    LOST = 'LOST'
    UTILIZED = 'UTILIZED'
    PREPARED_FOR_UTILIZATION = 'PREPARED_FOR_UTILIZATION'
    EXPROPRIATED = 'EXPROPRIATED'
    NOT_IN_DEMAND = 'NOT_IN_DEMAND'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ReturnInstanceStatusType from a JSON string"""
        return cls(json.loads(json_str))

