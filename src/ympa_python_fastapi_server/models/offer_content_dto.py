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
from typing import Any, ClassVar, Dict, List
from typing_extensions import Annotated
from ympa_python_fastapi_server.models.parameter_value_dto import ParameterValueDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class OfferContentDTO(BaseModel):
    """
    Товар с указанными характеристиками.
    """ # noqa: E501
    offer_id: Annotated[str, Field(min_length=1, strict=True, max_length=255)] = Field(description="Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", alias="offerId")
    category_id: StrictInt = Field(description="Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).", alias="categoryId")
    parameter_values: Annotated[List[ParameterValueDTO], Field(min_length=1, max_length=300)] = Field(description="Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. ", alias="parameterValues")
    __properties: ClassVar[List[str]] = ["offerId", "categoryId", "parameterValues"]

    @field_validator('offer_id')
    def offer_id_validate_regular_expression(cls, value):
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
        """Create an instance of OfferContentDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in parameter_values (list)
        _items = []
        if self.parameter_values:
            for _item in self.parameter_values:
                if _item:
                    _items.append(_item.to_dict())
            _dict['parameterValues'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of OfferContentDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "offerId": obj.get("offerId"),
            "categoryId": obj.get("categoryId"),
            "parameterValues": [ParameterValueDTO.from_dict(_item) for _item in obj.get("parameterValues")] if obj.get("parameterValues") is not None else None
        })
        return _obj


