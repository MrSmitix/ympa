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




from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ympa_python_fastapi_server.models.order_parcel_box_dto import OrderParcelBoxDTO
from ympa_python_fastapi_server.models.order_track_dto import OrderTrackDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class OrderShipmentDTO(BaseModel):
    """
    Список посылок.  В параметре может указываться несколько посылок. 
    """ # noqa: E501
    id: Optional[StrictInt] = Field(default=None, description="Идентификатор посылки, присвоенный Маркетом.")
    shipment_date: Optional[StrictStr] = Field(default=None, description="Формат даты: `ДД-ММ-ГГГГ`. ", alias="shipmentDate")
    shipment_time: Optional[StrictStr] = Field(default=None, description="**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ", alias="shipmentTime")
    tracks: Optional[List[OrderTrackDTO]] = Field(default=None, description="**Только для модели DBS**  Информация для отслеживания перемещений посылки. ")
    boxes: Optional[List[OrderParcelBoxDTO]] = Field(default=None, description="Список грузовых мест.")
    __properties: ClassVar[List[str]] = ["id", "shipmentDate", "shipmentTime", "tracks", "boxes"]

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
        """Create an instance of OrderShipmentDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in tracks (list)
        _items = []
        if self.tracks:
            for _item in self.tracks:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tracks'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in boxes (list)
        _items = []
        if self.boxes:
            for _item in self.boxes:
                if _item:
                    _items.append(_item.to_dict())
            _dict['boxes'] = _items
        # set to None if tracks (nullable) is None
        # and model_fields_set contains the field
        if self.tracks is None and "tracks" in self.model_fields_set:
            _dict['tracks'] = None

        # set to None if boxes (nullable) is None
        # and model_fields_set contains the field
        if self.boxes is None and "boxes" in self.model_fields_set:
            _dict['boxes'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of OrderShipmentDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "shipmentDate": obj.get("shipmentDate"),
            "shipmentTime": obj.get("shipmentTime"),
            "tracks": [OrderTrackDTO.from_dict(_item) for _item in obj.get("tracks")] if obj.get("tracks") is not None else None,
            "boxes": [OrderParcelBoxDTO.from_dict(_item) for _item in obj.get("boxes")] if obj.get("boxes") is not None else None
        })
        return _obj


