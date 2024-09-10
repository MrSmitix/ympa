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





class OrdersStatsStockType(str, Enum):
    """
    Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
    """

    """
    allowed enum values
    """
    FIT = 'FIT'
    FREEZE = 'FREEZE'
    AVAILABLE = 'AVAILABLE'
    QUARANTINE = 'QUARANTINE'
    UTILIZATION = 'UTILIZATION'
    DEFECT = 'DEFECT'
    EXPIRED = 'EXPIRED'

    @classmethod
    def from_json(cls, json_str: str) -> OrdersStatsStockType:
        """Create an instance of OrdersStatsStockType from a JSON string"""
        return OrdersStatsStockType(json.loads(json_str))


