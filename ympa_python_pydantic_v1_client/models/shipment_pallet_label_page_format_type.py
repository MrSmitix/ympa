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





class ShipmentPalletLabelPageFormatType(str, Enum):
    """
    Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
    """

    """
    allowed enum values
    """
    A4 = 'A4'
    A8 = 'A8'

    @classmethod
    def from_json(cls, json_str: str) -> ShipmentPalletLabelPageFormatType:
        """Create an instance of ShipmentPalletLabelPageFormatType from a JSON string"""
        return ShipmentPalletLabelPageFormatType(json.loads(json_str))


