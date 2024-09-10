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





class LicenseType(str, Enum):
    """
    Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
    """

    """
    allowed enum values
    """
    ALCOHOL = 'ALCOHOL'
    UNKNOWN = 'UNKNOWN'

    @classmethod
    def from_json(cls, json_str: str) -> LicenseType:
        """Create an instance of LicenseType from a JSON string"""
        return LicenseType(json.loads(json_str))


