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




from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ympa_python_fastapi_server.models.channel_type import ChannelType
from ympa_python_fastapi_server.models.get_promo_assortment_info_dto import GetPromoAssortmentInfoDTO
from ympa_python_fastapi_server.models.get_promo_bestseller_info_dto import GetPromoBestsellerInfoDTO
from ympa_python_fastapi_server.models.get_promo_constraints_dto import GetPromoConstraintsDTO
from ympa_python_fastapi_server.models.get_promo_mechanics_info_dto import GetPromoMechanicsInfoDTO
from ympa_python_fastapi_server.models.promo_period_dto import PromoPeriodDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class GetPromoDTO(BaseModel):
    """
    Информация об акции.
    """ # noqa: E501
    id: StrictStr = Field(description="Идентификатор акции.")
    name: StrictStr = Field(description="Название акции.")
    period: PromoPeriodDTO
    participating: StrictBool = Field(description="Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ")
    assortment_info: GetPromoAssortmentInfoDTO = Field(alias="assortmentInfo")
    mechanics_info: GetPromoMechanicsInfoDTO = Field(alias="mechanicsInfo")
    bestseller_info: GetPromoBestsellerInfoDTO = Field(alias="bestsellerInfo")
    channels: Optional[List[ChannelType]] = Field(default=None, description="Список каналов продвижения товаров.")
    constraints: Optional[GetPromoConstraintsDTO] = None
    __properties: ClassVar[List[str]] = ["id", "name", "period", "participating", "assortmentInfo", "mechanicsInfo", "bestsellerInfo", "channels", "constraints"]

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
        """Create an instance of GetPromoDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of period
        if self.period:
            _dict['period'] = self.period.to_dict()
        # override the default output from pydantic by calling `to_dict()` of assortment_info
        if self.assortment_info:
            _dict['assortmentInfo'] = self.assortment_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of mechanics_info
        if self.mechanics_info:
            _dict['mechanicsInfo'] = self.mechanics_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of bestseller_info
        if self.bestseller_info:
            _dict['bestsellerInfo'] = self.bestseller_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of constraints
        if self.constraints:
            _dict['constraints'] = self.constraints.to_dict()
        # set to None if channels (nullable) is None
        # and model_fields_set contains the field
        if self.channels is None and "channels" in self.model_fields_set:
            _dict['channels'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of GetPromoDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "name": obj.get("name"),
            "period": PromoPeriodDTO.from_dict(obj.get("period")) if obj.get("period") is not None else None,
            "participating": obj.get("participating"),
            "assortmentInfo": GetPromoAssortmentInfoDTO.from_dict(obj.get("assortmentInfo")) if obj.get("assortmentInfo") is not None else None,
            "mechanicsInfo": GetPromoMechanicsInfoDTO.from_dict(obj.get("mechanicsInfo")) if obj.get("mechanicsInfo") is not None else None,
            "bestsellerInfo": GetPromoBestsellerInfoDTO.from_dict(obj.get("bestsellerInfo")) if obj.get("bestsellerInfo") is not None else None,
            "channels": obj.get("channels"),
            "constraints": GetPromoConstraintsDTO.from_dict(obj.get("constraints")) if obj.get("constraints") is not None else None
        })
        return _obj


