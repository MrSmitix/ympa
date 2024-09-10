# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class CalculatedTariffType(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    AGENCY_COMMISSION = 'AGENCY_COMMISSION'
    PAYMENT_TRANSFER = 'PAYMENT_TRANSFER'
    FEE = 'FEE'
    DELIVERY_TO_CUSTOMER = 'DELIVERY_TO_CUSTOMER'
    CROSSREGIONAL_DELIVERY = 'CROSSREGIONAL_DELIVERY'
    EXPRESS_DELIVERY = 'EXPRESS_DELIVERY'
    SORTING = 'SORTING'
    MIDDLE_MILE = 'MIDDLE_MILE'

    def __init__(self):  # noqa: E501
        """CalculatedTariffType - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'CalculatedTariffType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CalculatedTariffType of this CalculatedTariffType.  # noqa: E501
        :rtype: CalculatedTariffType
        """
        return util.deserialize_model(dikt, cls)
