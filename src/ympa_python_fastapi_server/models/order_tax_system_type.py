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


class OrderTaxSystemType(str, Enum):
    """
    Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`. 
    """

    """
    allowed enum values
    """
    OSN = 'OSN'
    USN = 'USN'
    USN_MINUS_COST = 'USN_MINUS_COST'
    ENVD = 'ENVD'
    ECHN = 'ECHN'
    PSN = 'PSN'
    NPD = 'NPD'
    UNKNOWN_VALUE = 'UNKNOWN_VALUE'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of OrderTaxSystemType from a JSON string"""
        return cls(json.loads(json_str))

