import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from ympa_python_flask_server.models.api_client_data_error_response import ApiClientDataErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_limit_error_response import ApiLimitErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_not_found_error_response import ApiNotFoundErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_server_error_response import ApiServerErrorResponse  # noqa: E501
from ympa_python_flask_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse  # noqa: E501
from ympa_python_flask_server.models.get_fulfillment_warehouses_response import GetFulfillmentWarehousesResponse  # noqa: E501
from ympa_python_flask_server.models.get_warehouses_response import GetWarehousesResponse  # noqa: E501
from ympa_python_flask_server import util


def get_fulfillment_warehouses():  # noqa: E501
    """Идентификаторы складов Маркета (FBY)

    Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-|  # noqa: E501


    :rtype: Union[GetFulfillmentWarehousesResponse, Tuple[GetFulfillmentWarehousesResponse, int], Tuple[GetFulfillmentWarehousesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_warehouses(business_id):  # noqa: E501
    """Список складов и групп складов

    Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int

    :rtype: Union[GetWarehousesResponse, Tuple[GetWarehousesResponse, int], Tuple[GetWarehousesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
