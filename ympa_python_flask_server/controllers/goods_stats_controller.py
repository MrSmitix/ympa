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
from ympa_python_flask_server.models.get_goods_stats_request import GetGoodsStatsRequest  # noqa: E501
from ympa_python_flask_server.models.get_goods_stats_response import GetGoodsStatsResponse  # noqa: E501
from ympa_python_flask_server import util


def get_goods_stats(campaign_id, get_goods_stats_request):  # noqa: E501
    """Отчет по товарам

    Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param get_goods_stats_request: 
    :type get_goods_stats_request: dict | bytes

    :rtype: Union[GetGoodsStatsResponse, Tuple[GetGoodsStatsResponse, int], Tuple[GetGoodsStatsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_goods_stats_request = GetGoodsStatsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
