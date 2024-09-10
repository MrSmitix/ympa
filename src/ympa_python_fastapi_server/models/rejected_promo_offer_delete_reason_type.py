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


class RejectedPromoOfferDeleteReasonType(str, Enum):
    """
    Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
    """

    """
    allowed enum values
    """
    OFFER_DOES_NOT_EXIST = 'OFFER_DOES_NOT_EXIST'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of RejectedPromoOfferDeleteReasonType from a JSON string"""
        return cls(json.loads(json_str))

