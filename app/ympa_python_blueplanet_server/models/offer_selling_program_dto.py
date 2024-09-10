# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from app.ympa_python_blueplanet_server.models.offer_selling_program_status_type import OfferSellingProgramStatusType  # noqa: F401,E501
from app.ympa_python_blueplanet_server.models.selling_program_type import SellingProgramType  # noqa: F401,E501
from ympa_python_blueplanet_server import util


class OfferSellingProgramDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, selling_program: SellingProgramType=None, status: OfferSellingProgramStatusType=None):  # noqa: E501
        """OfferSellingProgramDTO - a model defined in Swagger

        :param selling_program: The selling_program of this OfferSellingProgramDTO.  # noqa: E501
        :type selling_program: SellingProgramType
        :param status: The status of this OfferSellingProgramDTO.  # noqa: E501
        :type status: OfferSellingProgramStatusType
        """
        self.swagger_types = {
            'selling_program': SellingProgramType,
            'status': OfferSellingProgramStatusType
        }

        self.attribute_map = {
            'selling_program': 'sellingProgram',
            'status': 'status'
        }

        self._selling_program = selling_program
        self._status = status

    @classmethod
    def from_dict(cls, dikt) -> 'OfferSellingProgramDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OfferSellingProgramDTO of this OfferSellingProgramDTO.  # noqa: E501
        :rtype: OfferSellingProgramDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def selling_program(self) -> SellingProgramType:
        """Gets the selling_program of this OfferSellingProgramDTO.


        :return: The selling_program of this OfferSellingProgramDTO.
        :rtype: SellingProgramType
        """
        return self._selling_program

    @selling_program.setter
    def selling_program(self, selling_program: SellingProgramType):
        """Sets the selling_program of this OfferSellingProgramDTO.


        :param selling_program: The selling_program of this OfferSellingProgramDTO.
        :type selling_program: SellingProgramType
        """
        if selling_program is None:
            raise ValueError("Invalid value for `selling_program`, must not be `None`")  # noqa: E501

        self._selling_program = selling_program

    @property
    def status(self) -> OfferSellingProgramStatusType:
        """Gets the status of this OfferSellingProgramDTO.


        :return: The status of this OfferSellingProgramDTO.
        :rtype: OfferSellingProgramStatusType
        """
        return self._status

    @status.setter
    def status(self, status: OfferSellingProgramStatusType):
        """Sets the status of this OfferSellingProgramDTO.


        :param status: The status of this OfferSellingProgramDTO.
        :type status: OfferSellingProgramStatusType
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status
