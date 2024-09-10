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
from ympa_python_flask_server.models.empty_api_response import EmptyApiResponse  # noqa: E501
from ympa_python_flask_server.models.get_warehouse_stocks_request import GetWarehouseStocksRequest  # noqa: E501
from ympa_python_flask_server.models.get_warehouse_stocks_response import GetWarehouseStocksResponse  # noqa: E501
from ympa_python_flask_server.models.update_stocks_request import UpdateStocksRequest  # noqa: E501
from ympa_python_flask_server import util


def get_stocks(campaign_id, page_token=None, limit=None, get_warehouse_stocks_request=None):  # noqa: E501
    """Информация об остатках и оборачиваемости

    Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.)  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_warehouse_stocks_request: 
    :type get_warehouse_stocks_request: dict | bytes

    :rtype: Union[GetWarehouseStocksResponse, Tuple[GetWarehouseStocksResponse, int], Tuple[GetWarehouseStocksResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_warehouse_stocks_request = GetWarehouseStocksRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_stocks(campaign_id, update_stocks_request):  # noqa: E501
    """Передача информации об остатках

    Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param update_stocks_request: 
    :type update_stocks_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_stocks_request = UpdateStocksRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
