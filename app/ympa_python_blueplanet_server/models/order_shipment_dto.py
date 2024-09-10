# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.order_parcel_box_dto import OrderParcelBoxDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.order_track_dto import OrderTrackDTO  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OrderShipmentDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, shipment_date: str=None, shipment_time: str=None, tracks: List[OrderTrackDTO]=None, boxes: List[OrderParcelBoxDTO]=None):  # noqa: E501
        """OrderShipmentDTO - a model defined in Swagger

        :param id: The id of this OrderShipmentDTO.  # noqa: E501
        :type id: int
        :param shipment_date: The shipment_date of this OrderShipmentDTO.  # noqa: E501
        :type shipment_date: str
        :param shipment_time: The shipment_time of this OrderShipmentDTO.  # noqa: E501
        :type shipment_time: str
        :param tracks: The tracks of this OrderShipmentDTO.  # noqa: E501
        :type tracks: List[OrderTrackDTO]
        :param boxes: The boxes of this OrderShipmentDTO.  # noqa: E501
        :type boxes: List[OrderParcelBoxDTO]
        """
        self.swagger_types = {
            'id': int,
            'shipment_date': str,
            'shipment_time': str,
            'tracks': List[OrderTrackDTO],
            'boxes': List[OrderParcelBoxDTO]
        }

        self.attribute_map = {
            'id': 'id',
            'shipment_date': 'shipmentDate',
            'shipment_time': 'shipmentTime',
            'tracks': 'tracks',
            'boxes': 'boxes'
        }

        self._id = id
        self._shipment_date = shipment_date
        self._shipment_time = shipment_time
        self._tracks = tracks
        self._boxes = boxes

    @classmethod
    def from_dict(cls, dikt) -> 'OrderShipmentDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderShipmentDTO of this OrderShipmentDTO.  # noqa: E501
        :rtype: OrderShipmentDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this OrderShipmentDTO.

        Идентификатор посылки, присвоенный Маркетом.  # noqa: E501

        :return: The id of this OrderShipmentDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this OrderShipmentDTO.

        Идентификатор посылки, присвоенный Маркетом.  # noqa: E501

        :param id: The id of this OrderShipmentDTO.
        :type id: int
        """

        self._id = id

    @property
    def shipment_date(self) -> str:
        """Gets the shipment_date of this OrderShipmentDTO.

        Формат даты: `ДД-ММ-ГГГГ`.   # noqa: E501

        :return: The shipment_date of this OrderShipmentDTO.
        :rtype: str
        """
        return self._shipment_date

    @shipment_date.setter
    def shipment_date(self, shipment_date: str):
        """Sets the shipment_date of this OrderShipmentDTO.

        Формат даты: `ДД-ММ-ГГГГ`.   # noqa: E501

        :param shipment_date: The shipment_date of this OrderShipmentDTO.
        :type shipment_date: str
        """

        self._shipment_date = shipment_date

    @property
    def shipment_time(self) -> str:
        """Gets the shipment_time of this OrderShipmentDTO.

        **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.   # noqa: E501

        :return: The shipment_time of this OrderShipmentDTO.
        :rtype: str
        """
        return self._shipment_time

    @shipment_time.setter
    def shipment_time(self, shipment_time: str):
        """Sets the shipment_time of this OrderShipmentDTO.

        **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.   # noqa: E501

        :param shipment_time: The shipment_time of this OrderShipmentDTO.
        :type shipment_time: str
        """

        self._shipment_time = shipment_time

    @property
    def tracks(self) -> List[OrderTrackDTO]:
        """Gets the tracks of this OrderShipmentDTO.

        **Только для модели DBS**  Информация для отслеживания перемещений посылки.   # noqa: E501

        :return: The tracks of this OrderShipmentDTO.
        :rtype: List[OrderTrackDTO]
        """
        return self._tracks

    @tracks.setter
    def tracks(self, tracks: List[OrderTrackDTO]):
        """Sets the tracks of this OrderShipmentDTO.

        **Только для модели DBS**  Информация для отслеживания перемещений посылки.   # noqa: E501

        :param tracks: The tracks of this OrderShipmentDTO.
        :type tracks: List[OrderTrackDTO]
        """

        self._tracks = tracks

    @property
    def boxes(self) -> List[OrderParcelBoxDTO]:
        """Gets the boxes of this OrderShipmentDTO.

        Список грузовых мест.  # noqa: E501

        :return: The boxes of this OrderShipmentDTO.
        :rtype: List[OrderParcelBoxDTO]
        """
        return self._boxes

    @boxes.setter
    def boxes(self, boxes: List[OrderParcelBoxDTO]):
        """Sets the boxes of this OrderShipmentDTO.

        Список грузовых мест.  # noqa: E501

        :param boxes: The boxes of this OrderShipmentDTO.
        :type boxes: List[OrderParcelBoxDTO]
        """

        self._boxes = boxes