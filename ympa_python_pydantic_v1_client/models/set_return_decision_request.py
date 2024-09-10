# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr
from ympa_python_pydantic_v1_client.models.return_request_decision_type import ReturnRequestDecisionType

class SetReturnDecisionRequest(BaseModel):
    """
    Решения по позиции в возврате.  # noqa: E501
    """
    return_item_id: StrictInt = Field(default=..., alias="returnItemId", description="Идентификатор товара в возврате.")
    decision_type: ReturnRequestDecisionType = Field(default=..., alias="decisionType")
    comment: Optional[StrictStr] = Field(default=None, description="Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. ")
    __properties = ["returnItemId", "decisionType", "comment"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> SetReturnDecisionRequest:
        """Create an instance of SetReturnDecisionRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> SetReturnDecisionRequest:
        """Create an instance of SetReturnDecisionRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return SetReturnDecisionRequest.parse_obj(obj)

        _obj = SetReturnDecisionRequest.parse_obj({
            "return_item_id": obj.get("returnItemId"),
            "decision_type": obj.get("decisionType"),
            "comment": obj.get("comment")
        })
        return _obj


