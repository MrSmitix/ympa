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


class LogisticPointType(str, Enum):
    """
    Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал. 
    """

    """
    allowed enum values
    """
    WAREHOUSE = 'WAREHOUSE'
    PICKUP_POINT = 'PICKUP_POINT'
    PICKUP_TERMINAL = 'PICKUP_TERMINAL'
    PICKUP_POST_OFFICE = 'PICKUP_POST_OFFICE'
    PICKUP_MIXED = 'PICKUP_MIXED'
    PICKUP_RETAIL = 'PICKUP_RETAIL'
    UNKNOWN = 'UNKNOWN'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of LogisticPointType from a JSON string"""
        return cls(json.loads(json_str))

