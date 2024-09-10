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


class FeedbackDeliveryType(str, Enum):
    """
    Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. 
    """

    """
    allowed enum values
    """
    DELIVERY = 'DELIVERY'
    PICKUP = 'PICKUP'
    INSTORE = 'INSTORE'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of FeedbackDeliveryType from a JSON string"""
        return cls(json.loads(json_str))


