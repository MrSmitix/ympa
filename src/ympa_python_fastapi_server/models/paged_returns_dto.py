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
from ympa_python_fastapi_server.models.forward_scrolling_pager_dto import ForwardScrollingPagerDTO
from ympa_python_fastapi_server.models.return_dto import ReturnDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class PagedReturnsDTO(BaseModel):
    """
    Возвраты.
    """ # noqa: E501
    paging: Optional[ForwardScrollingPagerDTO] = None
    returns: List[ReturnDTO] = Field(description="Список возвратов.")
    __properties: ClassVar[List[str]] = ["paging", "returns"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of PagedReturnsDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
            },
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of paging
        if self.paging:
            _dict['paging'] = self.paging.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in returns (list)
        _items = []
        if self.returns:
            for _item in self.returns:
                if _item:
                    _items.append(_item.to_dict())
            _dict['returns'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of PagedReturnsDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "paging": ForwardScrollingPagerDTO.from_dict(obj.get("paging")) if obj.get("paging") is not None else None,
            "returns": [ReturnDTO.from_dict(_item) for _item in obj.get("returns")] if obj.get("returns") is not None else None
        })
        return _obj


