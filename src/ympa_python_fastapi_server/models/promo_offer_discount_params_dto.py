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




from pydantic import BaseModel, ConfigDict, Field, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class PromoOfferDiscountParamsDTO(BaseModel):
    """
    Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
    """ # noqa: E501
    price: Optional[StrictInt] = Field(default=None, description="Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
    promo_price: Optional[StrictInt] = Field(default=None, description="Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ", alias="promoPrice")
    max_promo_price: StrictInt = Field(description="Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. ", alias="maxPromoPrice")
    __properties: ClassVar[List[str]] = ["price", "promoPrice", "maxPromoPrice"]

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
        """Create an instance of PromoOfferDiscountParamsDTO from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of PromoOfferDiscountParamsDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "price": obj.get("price"),
            "promoPrice": obj.get("promoPrice"),
            "maxPromoPrice": obj.get("maxPromoPrice")
        })
        return _obj


