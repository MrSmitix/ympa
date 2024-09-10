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


class OfferMappingKindType(str, Enum):
    """
    Вид маппинга.
    """

    """
    allowed enum values
    """
    ACTIVE = 'ACTIVE'
    ALL = 'ALL'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of OfferMappingKindType from a JSON string"""
        return cls(json.loads(json_str))


