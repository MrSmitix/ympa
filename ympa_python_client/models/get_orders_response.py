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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from ympa_python_client.models.flipping_pager_dto import FlippingPagerDTO
from ympa_python_client.models.forward_scrolling_pager_dto import ForwardScrollingPagerDTO
from ympa_python_client.models.order_dto import OrderDTO
from typing import Optional, Set
from typing_extensions import Self

class GetOrdersResponse(BaseModel):
    """
    Модель для ответа API списка информации по заказам.
    """ # noqa: E501
    pager: Optional[FlippingPagerDTO] = None
    orders: List[OrderDTO] = Field(description="Модель заказа. ")
    paging: Optional[ForwardScrollingPagerDTO] = None
    __properties: ClassVar[List[str]] = ["pager", "orders", "paging"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of GetOrdersResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of pager
        if self.pager:
            _dict['pager'] = self.pager.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in orders (list)
        _items = []
        if self.orders:
            for _item_orders in self.orders:
                if _item_orders:
                    _items.append(_item_orders.to_dict())
            _dict['orders'] = _items
        # override the default output from pydantic by calling `to_dict()` of paging
        if self.paging:
            _dict['paging'] = self.paging.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of GetOrdersResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "pager": FlippingPagerDTO.from_dict(obj["pager"]) if obj.get("pager") is not None else None,
            "orders": [OrderDTO.from_dict(_item) for _item in obj["orders"]] if obj.get("orders") is not None else None,
            "paging": ForwardScrollingPagerDTO.from_dict(obj["paging"]) if obj.get("paging") is not None else None
        })
        return _obj


