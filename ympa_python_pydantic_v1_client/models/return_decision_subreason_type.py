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





class ReturnDecisionSubreasonType(str, Enum):
    """
    Детали причин возврата:   * `DO_NOT_FIT`:     * `USER_DID_NOT_LIKE` — товар не понравился.     * `USER_CHANGED_MIND` — передумал покупать.     * `DELIVERED_TOO_LONG` — длительный срок доставки, поэтому передумал.    * `BAD_QUALITY`:     * `BAD_PACKAGE` — упаковка товара была нарушена.     * `DAMAGED` — царапины, сколы.     * `NOT_WORKING` — не включается / не работает.     * `INCOMPLETENESS` — некомплект (не хватает детали в наборе, к товару).    * `WRONG_ITEM`:     * `WRONG_ITEM` — не тот товар.     * `WRONG_COLOR` — не соответствует по цвету.     * `DID_NOT_MATCH_DESCRIPTION` — не соответствует заявленным характеристикам/описанию. 
    """

    """
    allowed enum values
    """
    USER_DID_NOT_LIKE = 'USER_DID_NOT_LIKE'
    USER_CHANGED_MIND = 'USER_CHANGED_MIND'
    DELIVERED_TOO_LONG = 'DELIVERED_TOO_LONG'
    BAD_PACKAGE = 'BAD_PACKAGE'
    DAMAGED = 'DAMAGED'
    NOT_WORKING = 'NOT_WORKING'
    INCOMPLETENESS = 'INCOMPLETENESS'
    WRONG_ITEM = 'WRONG_ITEM'
    WRONG_COLOR = 'WRONG_COLOR'
    DID_NOT_MATCH_DESCRIPTION = 'DID_NOT_MATCH_DESCRIPTION'
    UNKNOWN = 'UNKNOWN'

    @classmethod
    def from_json(cls, json_str: str) -> ReturnDecisionSubreasonType:
        """Create an instance of ReturnDecisionSubreasonType from a JSON string"""
        return ReturnDecisionSubreasonType(json.loads(json_str))


