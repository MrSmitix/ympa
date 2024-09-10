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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from ympa_python_client.models.offer_card_status_type import OfferCardStatusType
from typing import Optional, Set
from typing_extensions import Self

class GetOfferMappingsRequest(BaseModel):
    """
    GetOfferMappingsRequest
    """ # noqa: E501
    offer_ids: Optional[Annotated[List[Annotated[str, Field(min_length=1, strict=True, max_length=255)]], Field(min_length=1, max_length=200)]] = Field(default=None, description="Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    ", alias="offerIds")
    card_statuses: Optional[Annotated[List[OfferCardStatusType], Field(min_length=1)]] = Field(default=None, description="Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ", alias="cardStatuses")
    category_ids: Optional[Annotated[List[StrictInt], Field(min_length=1)]] = Field(default=None, description="Фильтр по категориям на Маркете.", alias="categoryIds")
    vendor_names: Optional[Annotated[List[StrictStr], Field(min_length=1)]] = Field(default=None, description="Фильтр по брендам.", alias="vendorNames")
    tags: Optional[Annotated[List[StrictStr], Field(min_length=1)]] = Field(default=None, description="Фильтр по тегам.")
    archived: Optional[StrictBool] = Field(default=None, description="Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. ")
    __properties: ClassVar[List[str]] = ["offerIds", "cardStatuses", "categoryIds", "vendorNames", "tags", "archived"]

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
        """Create an instance of GetOfferMappingsRequest from a JSON string"""
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
        # set to None if offer_ids (nullable) is None
        # and model_fields_set contains the field
        if self.offer_ids is None and "offer_ids" in self.model_fields_set:
            _dict['offerIds'] = None

        # set to None if card_statuses (nullable) is None
        # and model_fields_set contains the field
        if self.card_statuses is None and "card_statuses" in self.model_fields_set:
            _dict['cardStatuses'] = None

        # set to None if category_ids (nullable) is None
        # and model_fields_set contains the field
        if self.category_ids is None and "category_ids" in self.model_fields_set:
            _dict['categoryIds'] = None

        # set to None if vendor_names (nullable) is None
        # and model_fields_set contains the field
        if self.vendor_names is None and "vendor_names" in self.model_fields_set:
            _dict['vendorNames'] = None

        # set to None if tags (nullable) is None
        # and model_fields_set contains the field
        if self.tags is None and "tags" in self.model_fields_set:
            _dict['tags'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of GetOfferMappingsRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "offerIds": obj.get("offerIds"),
            "cardStatuses": obj.get("cardStatuses"),
            "categoryIds": obj.get("categoryIds"),
            "vendorNames": obj.get("vendorNames"),
            "tags": obj.get("tags"),
            "archived": obj.get("archived")
        })
        return _obj


