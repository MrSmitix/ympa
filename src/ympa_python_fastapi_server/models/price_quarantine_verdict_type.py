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


class PriceQuarantineVerdictType(str, Enum):
    """
    Типы карантина:  * `PRICE_CHANGE` — новая цена слишком сильно отличается от прежней. В поле `params` будет  новая цена `CURRENT_PRICE` и последняя цена до попадания в карантин `LAST_VALID_PRICE`. * `LOW_PRICE` — установленная цена слишком сильно отличается от рыночной. В поле `params` будет установленная вами цена `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. * `LOW_PRICE_PROMO` — цена после применения акций слишком сильно отличается от рыночной. В поле `params` будет цена после применения акций `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. 
    """

    """
    allowed enum values
    """
    PRICE_CHANGE = 'PRICE_CHANGE'
    LOW_PRICE = 'LOW_PRICE'
    LOW_PRICE_PROMO = 'LOW_PRICE_PROMO'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of PriceQuarantineVerdictType from a JSON string"""
        return cls(json.loads(json_str))

