# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.get_price_with_discount_dto import GetPriceWithDiscountDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.get_price_with_vat_dto import GetPriceWithVatDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.offer_campaign_status_type import OfferCampaignStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.offer_error_dto import OfferErrorDTO  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.quantum_dto import QuantumDTO  # noqa: F401,E501
import re  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class GetCampaignOfferDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, offer_id: str=None, quantum: QuantumDTO=None, available: bool=None, basic_price: GetPriceWithDiscountDTO=None, campaign_price: GetPriceWithVatDTO=None, status: OfferCampaignStatusType=None, errors: List[OfferErrorDTO]=None, warnings: List[OfferErrorDTO]=None):  # noqa: E501
        """GetCampaignOfferDTO - a model defined in Swagger

        :param offer_id: The offer_id of this GetCampaignOfferDTO.  # noqa: E501
        :type offer_id: str
        :param quantum: The quantum of this GetCampaignOfferDTO.  # noqa: E501
        :type quantum: QuantumDTO
        :param available: The available of this GetCampaignOfferDTO.  # noqa: E501
        :type available: bool
        :param basic_price: The basic_price of this GetCampaignOfferDTO.  # noqa: E501
        :type basic_price: GetPriceWithDiscountDTO
        :param campaign_price: The campaign_price of this GetCampaignOfferDTO.  # noqa: E501
        :type campaign_price: GetPriceWithVatDTO
        :param status: The status of this GetCampaignOfferDTO.  # noqa: E501
        :type status: OfferCampaignStatusType
        :param errors: The errors of this GetCampaignOfferDTO.  # noqa: E501
        :type errors: List[OfferErrorDTO]
        :param warnings: The warnings of this GetCampaignOfferDTO.  # noqa: E501
        :type warnings: List[OfferErrorDTO]
        """
        self.swagger_types = {
            'offer_id': str,
            'quantum': QuantumDTO,
            'available': bool,
            'basic_price': GetPriceWithDiscountDTO,
            'campaign_price': GetPriceWithVatDTO,
            'status': OfferCampaignStatusType,
            'errors': List[OfferErrorDTO],
            'warnings': List[OfferErrorDTO]
        }

        self.attribute_map = {
            'offer_id': 'offerId',
            'quantum': 'quantum',
            'available': 'available',
            'basic_price': 'basicPrice',
            'campaign_price': 'campaignPrice',
            'status': 'status',
            'errors': 'errors',
            'warnings': 'warnings'
        }

        self._offer_id = offer_id
        self._quantum = quantum
        self._available = available
        self._basic_price = basic_price
        self._campaign_price = campaign_price
        self._status = status
        self._errors = errors
        self._warnings = warnings

    @classmethod
    def from_dict(cls, dikt) -> 'GetCampaignOfferDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetCampaignOfferDTO of this GetCampaignOfferDTO.  # noqa: E501
        :rtype: GetCampaignOfferDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_id(self) -> str:
        """Gets the offer_id of this GetCampaignOfferDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :return: The offer_id of this GetCampaignOfferDTO.
        :rtype: str
        """
        return self._offer_id

    @offer_id.setter
    def offer_id(self, offer_id: str):
        """Sets the offer_id of this GetCampaignOfferDTO.

        Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)   # noqa: E501

        :param offer_id: The offer_id of this GetCampaignOfferDTO.
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
    def quantum(self) -> QuantumDTO:
        """Gets the quantum of this GetCampaignOfferDTO.


        :return: The quantum of this GetCampaignOfferDTO.
        :rtype: QuantumDTO
        """
        return self._quantum

    @quantum.setter
    def quantum(self, quantum: QuantumDTO):
        """Sets the quantum of this GetCampaignOfferDTO.


        :param quantum: The quantum of this GetCampaignOfferDTO.
        :type quantum: QuantumDTO
        """

        self._quantum = quantum

    @property
    def available(self) -> bool:
        """Gets the available of this GetCampaignOfferDTO.

        Есть ли товар в продаже.   # noqa: E501

        :return: The available of this GetCampaignOfferDTO.
        :rtype: bool
        """
        return self._available

    @available.setter
    def available(self, available: bool):
        """Sets the available of this GetCampaignOfferDTO.

        Есть ли товар в продаже.   # noqa: E501

        :param available: The available of this GetCampaignOfferDTO.
        :type available: bool
        """

        self._available = available

    @property
    def basic_price(self) -> GetPriceWithDiscountDTO:
        """Gets the basic_price of this GetCampaignOfferDTO.


        :return: The basic_price of this GetCampaignOfferDTO.
        :rtype: GetPriceWithDiscountDTO
        """
        return self._basic_price

    @basic_price.setter
    def basic_price(self, basic_price: GetPriceWithDiscountDTO):
        """Sets the basic_price of this GetCampaignOfferDTO.


        :param basic_price: The basic_price of this GetCampaignOfferDTO.
        :type basic_price: GetPriceWithDiscountDTO
        """

        self._basic_price = basic_price

    @property
    def campaign_price(self) -> GetPriceWithVatDTO:
        """Gets the campaign_price of this GetCampaignOfferDTO.


        :return: The campaign_price of this GetCampaignOfferDTO.
        :rtype: GetPriceWithVatDTO
        """
        return self._campaign_price

    @campaign_price.setter
    def campaign_price(self, campaign_price: GetPriceWithVatDTO):
        """Sets the campaign_price of this GetCampaignOfferDTO.


        :param campaign_price: The campaign_price of this GetCampaignOfferDTO.
        :type campaign_price: GetPriceWithVatDTO
        """

        self._campaign_price = campaign_price

    @property
    def status(self) -> OfferCampaignStatusType:
        """Gets the status of this GetCampaignOfferDTO.


        :return: The status of this GetCampaignOfferDTO.
        :rtype: OfferCampaignStatusType
        """
        return self._status

    @status.setter
    def status(self, status: OfferCampaignStatusType):
        """Sets the status of this GetCampaignOfferDTO.


        :param status: The status of this GetCampaignOfferDTO.
        :type status: OfferCampaignStatusType
        """

        self._status = status

    @property
    def errors(self) -> List[OfferErrorDTO]:
        """Gets the errors of this GetCampaignOfferDTO.

        Ошибки, препятствующие размещению товара на витрине.   # noqa: E501

        :return: The errors of this GetCampaignOfferDTO.
        :rtype: List[OfferErrorDTO]
        """
        return self._errors

    @errors.setter
    def errors(self, errors: List[OfferErrorDTO]):
        """Sets the errors of this GetCampaignOfferDTO.

        Ошибки, препятствующие размещению товара на витрине.   # noqa: E501

        :param errors: The errors of this GetCampaignOfferDTO.
        :type errors: List[OfferErrorDTO]
        """

        self._errors = errors

    @property
    def warnings(self) -> List[OfferErrorDTO]:
        """Gets the warnings of this GetCampaignOfferDTO.

        Предупреждения, не препятствующие размещению товара на витрине.   # noqa: E501

        :return: The warnings of this GetCampaignOfferDTO.
        :rtype: List[OfferErrorDTO]
        """
        return self._warnings

    @warnings.setter
    def warnings(self, warnings: List[OfferErrorDTO]):
        """Sets the warnings of this GetCampaignOfferDTO.

        Предупреждения, не препятствующие размещению товара на витрине.   # noqa: E501

        :param warnings: The warnings of this GetCampaignOfferDTO.
        :type warnings: List[OfferErrorDTO]
        """

        self._warnings = warnings