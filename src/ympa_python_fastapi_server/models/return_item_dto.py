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




from pydantic import BaseModel, ConfigDict, Field, StrictInt, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from ympa_python_fastapi_server.models.return_decision_dto import ReturnDecisionDTO
from ympa_python_fastapi_server.models.return_instance_dto import ReturnInstanceDTO
from ympa_python_fastapi_server.models.track_dto import TrackDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class ReturnItemDTO(BaseModel):
    """
    Список товаров в возврате.
    """ # noqa: E501
    market_sku: Optional[StrictInt] = Field(default=None, description="SKU на Маркете.", alias="marketSku")
    shop_sku: Annotated[str, Field(min_length=1, strict=True, max_length=255)] = Field(description="Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", alias="shopSku")
    count: StrictInt = Field(description="Количество единиц товара.")
    decisions: Optional[List[ReturnDecisionDTO]] = Field(default=None, description="Список решений по возврату.")
    instances: Optional[List[ReturnInstanceDTO]] = Field(default=None, description="Список логистических позиций возврата.")
    tracks: Optional[List[TrackDTO]] = Field(default=None, description="Список трек-кодов для почтовых отправлений.")
    __properties: ClassVar[List[str]] = ["marketSku", "shopSku", "count", "decisions", "instances", "tracks"]

    @field_validator('shop_sku')
    def shop_sku_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if not re.match(r"^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$", value):
            raise ValueError(r"must validate the regular expression /^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/")
        return value

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
        """Create an instance of ReturnItemDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in decisions (list)
        _items = []
        if self.decisions:
            for _item in self.decisions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['decisions'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in instances (list)
        _items = []
        if self.instances:
            for _item in self.instances:
                if _item:
                    _items.append(_item.to_dict())
            _dict['instances'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in tracks (list)
        _items = []
        if self.tracks:
            for _item in self.tracks:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tracks'] = _items
        # set to None if decisions (nullable) is None
        # and model_fields_set contains the field
        if self.decisions is None and "decisions" in self.model_fields_set:
            _dict['decisions'] = None

        # set to None if instances (nullable) is None
        # and model_fields_set contains the field
        if self.instances is None and "instances" in self.model_fields_set:
            _dict['instances'] = None

        # set to None if tracks (nullable) is None
        # and model_fields_set contains the field
        if self.tracks is None and "tracks" in self.model_fields_set:
            _dict['tracks'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of ReturnItemDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "marketSku": obj.get("marketSku"),
            "shopSku": obj.get("shopSku"),
            "count": obj.get("count"),
            "decisions": [ReturnDecisionDTO.from_dict(_item) for _item in obj.get("decisions")] if obj.get("decisions") is not None else None,
            "instances": [ReturnInstanceDTO.from_dict(_item) for _item in obj.get("instances")] if obj.get("instances") is not None else None,
            "tracks": [TrackDTO.from_dict(_item) for _item in obj.get("tracks")] if obj.get("tracks") is not None else None
        })
        return _obj

