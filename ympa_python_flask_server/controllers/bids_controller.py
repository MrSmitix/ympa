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
from ympa_python_flask_server.models.get_bids_info_request import GetBidsInfoRequest  # noqa: E501
from ympa_python_flask_server.models.get_bids_info_response import GetBidsInfoResponse  # noqa: E501
from ympa_python_flask_server.models.get_bids_recommendations_request import GetBidsRecommendationsRequest  # noqa: E501
from ympa_python_flask_server.models.get_bids_recommendations_response import GetBidsRecommendationsResponse  # noqa: E501
from ympa_python_flask_server.models.put_sku_bids_request import PutSkuBidsRequest  # noqa: E501
from ympa_python_flask_server import util


def get_bids_info_for_business(business_id, page_token=None, limit=None, get_bids_info_request=None):  # noqa: E501
    """Информация об установленных ставках

    Возвращает значения ставок для заданных товаров.  {% note warning \&quot;\&quot; %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param page_token: Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. 
    :type page_token: str
    :param limit: Количество значений на одной странице. 
    :type limit: int
    :param get_bids_info_request: description
    :type get_bids_info_request: dict | bytes

    :rtype: Union[GetBidsInfoResponse, Tuple[GetBidsInfoResponse, int], Tuple[GetBidsInfoResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_bids_info_request = GetBidsInfoRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_bids_recommendations(business_id, get_bids_recommendations_request):  # noqa: E501
    """Рекомендованные ставки для заданных товаров

    Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param get_bids_recommendations_request: description.
    :type get_bids_recommendations_request: dict | bytes

    :rtype: Union[GetBidsRecommendationsResponse, Tuple[GetBidsRecommendationsResponse, int], Tuple[GetBidsRecommendationsResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        get_bids_recommendations_request = GetBidsRecommendationsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_bids_for_business(business_id, put_sku_bids_request):  # noqa: E501
    """Включение буста продаж и установка ставок

    Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \&quot;Как в кабинете выглядит кампания, созданная через API\&quot; %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-|  # noqa: E501

    :param business_id: Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type business_id: int
    :param put_sku_bids_request: description
    :type put_sku_bids_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_sku_bids_request = PutSkuBidsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_bids_for_campaign(campaign_id, put_sku_bids_request):  # noqa: E501
    """Включение буста продаж и установка ставок для магазина

    Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-|  # noqa: E501

    :param campaign_id: Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    :type campaign_id: int
    :param put_sku_bids_request: description
    :type put_sku_bids_request: dict | bytes

    :rtype: Union[EmptyApiResponse, Tuple[EmptyApiResponse, int], Tuple[EmptyApiResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        put_sku_bids_request = PutSkuBidsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
