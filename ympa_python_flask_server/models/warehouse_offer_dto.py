from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.turnover_dto import TurnoverDTO
from ympa_python_flask_server.models.warehouse_stock_dto import WarehouseStockDTO
import re
from ympa_python_flask_server import util

from ympa_python_flask_server.models.turnover_dto import TurnoverDTO  # noqa: E501
from ympa_python_flask_server.models.warehouse_stock_dto import WarehouseStockDTO  # noqa: E501
import re  # noqa: E501

class WarehouseOfferDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_id=None, turnover_summary=None, stocks=None, updated_at=None):  # noqa: E501
        """WarehouseOfferDTO - a model defined in OpenAPI

        :param offer_id: The offer_id of this WarehouseOfferDTO.  # noqa: E501
        :type offer_id: str
        :param turnover_summary: The turnover_summary of this WarehouseOfferDTO.  # noqa: E501
        :type turnover_summary: TurnoverDTO
        :param stocks: The stocks of this WarehouseOfferDTO.  # noqa: E501
        :type stocks: List[WarehouseStockDTO]
        :param updated_at: The updated_at of this WarehouseOfferDTO.  # noqa: E501
        :type updated_at: datetime
        """
        self.openapi_types = {
            'offer_id': str,
            'turnover_summary': TurnoverDTO,
            'stocks': List[WarehouseStockDTO],
            'updated_at': datetime
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'turnover_summary': 'turnoverSummary',
            'stocks': 'stocks',
            'updated_at': 'updatedAt'
        }

        self._offer_id = offer_id
        self._turnover_summary = turnover_summary
        self._stocks = stocks
        self._updated_at = updated_at

    @classmethod
    def from_dict(cls, dikt) -> 'WarehouseOfferDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WarehouseOfferDTO of this WarehouseOfferDTO.  # noqa: E501
        :rtype: WarehouseOfferDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this WarehouseOfferDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this WarehouseOfferDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this WarehouseOfferDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this WarehouseOfferDTO.
        :type offer_id: str
        """
        if offer_id is None:
            raise ValueError("Invalid value for `offer_id`, must not be `None`")  # noqa: E501
        if offer_id is not None and len(offer_id) > 255:
            raise ValueError("Invalid value for `offer_id`, length must be less than or equal to `255`")  # noqa: E501
        if offer_id is not None and len(offer_id) < 1:
            raise ValueError("Invalid value for `offer_id`, length must be greater than or equal to `1`")  # noqa: E501
        if offer_id is not None and not re.search(r'^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$', offer_id):  # noqa: E501
            raise ValueError("Invalid value for `offer_id`, must be a follow pattern or equal to `/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/`")  # noqa: E501

        self._offer_id = offer_id

    @property
    def turnover_summary(self) -> TurnoverDTO:
        """Gets the turnover_summary of this WarehouseOfferDTO.


        :return: The turnover_summary of this WarehouseOfferDTO.
        :rtype: TurnoverDTO
        """
        return self._turnover_summary

    @turnover_summary.setter
    def turnover_summary(self, turnover_summary: TurnoverDTO):
        """Sets the turnover_summary of this WarehouseOfferDTO.


        :param turnover_summary: The turnover_summary of this WarehouseOfferDTO.
        :type turnover_summary: TurnoverDTO
        """

        self._turnover_summary = turnover_summary

    @property
    def stocks(self) -> List[WarehouseStockDTO]:
        """Gets the stocks of this WarehouseOfferDTO.

        Информация об остатках.  # noqa: E501

        :return: The stocks of this WarehouseOfferDTO.
        :rtype: List[WarehouseStockDTO]
        """
        return self._stocks

    @stocks.setter
    def stocks(self, stocks: List[WarehouseStockDTO]):
        """Sets the stocks of this WarehouseOfferDTO.

        Информация об остатках.  # noqa: E501

        :param stocks: The stocks of this WarehouseOfferDTO.
        :type stocks: List[WarehouseStockDTO]
        """
        if stocks is None:
            raise ValueError("Invalid value for `stocks`, must not be `None`")  # noqa: E501

        self._stocks = stocks

    @property
    def updated_at(self) -> datetime:
        """Gets the updated_at of this WarehouseOfferDTO.

        Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`.   # noqa: E501

        :return: The updated_at of this WarehouseOfferDTO.
        :rtype: datetime
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: datetime):
        """Sets the updated_at of this WarehouseOfferDTO.

        Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`.   # noqa: E501

        :param updated_at: The updated_at of this WarehouseOfferDTO.
        :type updated_at: datetime
        """

        self._updated_at = updated_at
