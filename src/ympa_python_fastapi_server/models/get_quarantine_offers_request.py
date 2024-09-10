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




from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from ympa_python_fastapi_server.models.offer_card_status_type import OfferCardStatusType
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class GetQuarantineOffersRequest(BaseModel):
    """
    Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
    """ # noqa: E501
    offer_ids: Optional[Annotated[List[Annotated[str, Field(min_length=1, strict=True, max_length=255)]], Field(min_length=1, max_length=500)]] = Field(default=None, description="Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ", alias="offerIds")
    card_statuses: Optional[Annotated[List[OfferCardStatusType], Field(min_length=1)]] = Field(default=None, description="Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ", alias="cardStatuses")
    category_ids: Optional[Annotated[List[StrictInt], Field(min_length=1)]] = Field(default=None, description="Фильтр по категориям на Маркете.", alias="categoryIds")
    vendor_names: Optional[Annotated[List[StrictStr], Field(min_length=1)]] = Field(default=None, description="Фильтр по брендам.", alias="vendorNames")
    tags: Optional[Annotated[List[StrictStr], Field(min_length=1)]] = Field(default=None, description="Фильтр по тегам.")
    __properties: ClassVar[List[str]] = ["offerIds", "cardStatuses", "categoryIds", "vendorNames", "tags"]

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
        """Create an instance of GetQuarantineOffersRequest from a JSON string"""
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
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of GetQuarantineOffersRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "offerIds": obj.get("offerIds"),
            "cardStatuses": obj.get("cardStatuses"),
            "categoryIds": obj.get("categoryIds"),
            "vendorNames": obj.get("vendorNames"),
            "tags": obj.get("tags")
        })
        return _obj


