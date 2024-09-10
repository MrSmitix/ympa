# OpenapiClient::DbsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**accept_order_cancellation**](DbsApi.md#accept_order_cancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем |
| [**add_hidden_offers**](DbsApi.md#add_hidden_offers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
| [**add_offers_to_archive**](DbsApi.md#add_offers_to_archive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив |
| [**calculate_tariffs**](DbsApi.md#calculate_tariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |
| [**confirm_business_prices**](DbsApi.md#confirm_business_prices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
| [**confirm_campaign_prices**](DbsApi.md#confirm_campaign_prices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
| [**create_chat**](DbsApi.md#create_chat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
| [**create_outlet**](DbsApi.md#create_outlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж |
| [**delete_campaign_offers**](DbsApi.md#delete_campaign_offers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
| [**delete_goods_feedback_comment**](DbsApi.md#delete_goods_feedback_comment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
| [**delete_hidden_offers**](DbsApi.md#delete_hidden_offers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
| [**delete_offers**](DbsApi.md#delete_offers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога |
| [**delete_offers_from_archive**](DbsApi.md#delete_offers_from_archive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива |
| [**delete_outlet**](DbsApi.md#delete_outlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж |
| [**delete_outlet_licenses**](DbsApi.md#delete_outlet_licenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж |
| [**delete_promo_offers**](DbsApi.md#delete_promo_offers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
| [**generate_boost_consolidated_report**](DbsApi.md#generate_boost_consolidated_report) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
| [**generate_competitors_position_report**](DbsApi.md#generate_competitors_position_report) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
| [**generate_goods_feedback_report**](DbsApi.md#generate_goods_feedback_report) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
| [**generate_mass_order_labels_report**](DbsApi.md#generate_mass_order_labels_report) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах |
| [**generate_order_label**](DbsApi.md#generate_order_label) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе |
| [**generate_order_labels**](DbsApi.md#generate_order_labels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе |
| [**generate_prices_report**](DbsApi.md#generate_prices_report) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
| [**generate_shelfs_statistics_report**](DbsApi.md#generate_shelfs_statistics_report) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
| [**generate_shows_sales_report**](DbsApi.md#generate_shows_sales_report) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
| [**generate_stocks_on_warehouses_report**](DbsApi.md#generate_stocks_on_warehouses_report) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
| [**generate_united_marketplace_services_report**](DbsApi.md#generate_united_marketplace_services_report) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
| [**generate_united_netting_report**](DbsApi.md#generate_united_netting_report) | **POST** /reports/united-netting/generate | Отчет по платежам |
| [**generate_united_orders_report**](DbsApi.md#generate_united_orders_report) | **POST** /reports/united-orders/generate | Отчет по заказам |
| [**get_all_offers**](DbsApi.md#get_all_offers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
| [**get_bids_info_for_business**](DbsApi.md#get_bids_info_for_business) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
| [**get_bids_recommendations**](DbsApi.md#get_bids_recommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
| [**get_business_quarantine_offers**](DbsApi.md#get_business_quarantine_offers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
| [**get_business_settings**](DbsApi.md#get_business_settings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |
| [**get_campaign**](DbsApi.md#get_campaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
| [**get_campaign_logins**](DbsApi.md#get_campaign_logins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
| [**get_campaign_offers**](DbsApi.md#get_campaign_offers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
| [**get_campaign_quarantine_offers**](DbsApi.md#get_campaign_quarantine_offers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |
| [**get_campaign_region**](DbsApi.md#get_campaign_region) | **GET** /campaigns/{campaignId}/region | Регион магазина |
| [**get_campaign_settings**](DbsApi.md#get_campaign_settings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
| [**get_campaigns**](DbsApi.md#get_campaigns) | **GET** /campaigns | Список магазинов пользователя |
| [**get_campaigns_by_login**](DbsApi.md#get_campaigns_by_login) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |
| [**get_categories_max_sale_quantum**](DbsApi.md#get_categories_max_sale_quantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
| [**get_categories_tree**](DbsApi.md#get_categories_tree) | **POST** /categories/tree | Дерево категорий |
| [**get_category_content_parameters**](DbsApi.md#get_category_content_parameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
| [**get_chat_history**](DbsApi.md#get_chat_history) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
| [**get_chats**](DbsApi.md#get_chats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
| [**get_delivery_services**](DbsApi.md#get_delivery_services) | **GET** /delivery/services | Справочник служб доставки |
| [**get_feed**](DbsApi.md#get_feed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
| [**get_feed_index_logs**](DbsApi.md#get_feed_index_logs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
| [**get_feedback_and_comment_updates**](DbsApi.md#get_feedback_and_comment_updates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине |
| [**get_feeds**](DbsApi.md#get_feeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
| [**get_goods_feedback_comments**](DbsApi.md#get_goods_feedback_comments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
| [**get_goods_feedbacks**](DbsApi.md#get_goods_feedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
| [**get_goods_stats**](DbsApi.md#get_goods_stats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |
| [**get_hidden_offers**](DbsApi.md#get_hidden_offers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |
| [**get_model**](DbsApi.md#get_model) | **GET** /models/{modelId} | Информация об одной модели |
| [**get_model_offers**](DbsApi.md#get_model_offers) | **GET** /models/{modelId}/offers | Список предложений для одной модели |
| [**get_models**](DbsApi.md#get_models) | **POST** /models | Информация о нескольких моделях |
| [**get_models_offers**](DbsApi.md#get_models_offers) | **POST** /models/offers | Список предложений для нескольких моделей |
| [**get_offer_cards_content_status**](DbsApi.md#get_offer_cards_content_status) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
| [**get_offer_mapping_entries**](DbsApi.md#get_offer_mapping_entries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге |
| [**get_offer_mappings**](DbsApi.md#get_offer_mappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге |
| [**get_offer_recommendations**](DbsApi.md#get_offer_recommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
| [**get_offers**](DbsApi.md#get_offers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
| [**get_order**](DbsApi.md#get_order) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе |
| [**get_order_business_buyer_info**](DbsApi.md#get_order_business_buyer_info) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
| [**get_order_business_documents_info**](DbsApi.md#get_order_business_documents_info) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |
| [**get_order_buyer_info**](DbsApi.md#get_order_buyer_info) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице |
| [**get_order_labels_data**](DbsApi.md#get_order_labels_data) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков |
| [**get_orders**](DbsApi.md#get_orders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах |
| [**get_orders_stats**](DbsApi.md#get_orders_stats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам |
| [**get_outlet**](DbsApi.md#get_outlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж |
| [**get_outlet_licenses**](DbsApi.md#get_outlet_licenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж |
| [**get_outlets**](DbsApi.md#get_outlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж |
| [**get_prices**](DbsApi.md#get_prices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
| [**get_prices_by_offer_ids**](DbsApi.md#get_prices_by_offer_ids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
| [**get_promo_offers**](DbsApi.md#get_promo_offers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
| [**get_promos**](DbsApi.md#get_promos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
| [**get_quality_rating_details**](DbsApi.md#get_quality_rating_details) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества |
| [**get_quality_ratings**](DbsApi.md#get_quality_ratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |
| [**get_report_info**](DbsApi.md#get_report_info) | **GET** /reports/info/{reportId} | Получение заданного отчета |
| [**get_return**](DbsApi.md#get_return) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
| [**get_return_application**](DbsApi.md#get_return_application) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
| [**get_return_photo**](DbsApi.md#get_return_photo) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
| [**get_returns**](DbsApi.md#get_returns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
| [**get_stocks**](DbsApi.md#get_stocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
| [**get_suggested_offer_mapping_entries**](DbsApi.md#get_suggested_offer_mapping_entries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров |
| [**get_suggested_offer_mappings**](DbsApi.md#get_suggested_offer_mappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам |
| [**get_suggested_prices**](DbsApi.md#get_suggested_prices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
| [**get_warehouses**](DbsApi.md#get_warehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов |
| [**provide_order_digital_codes**](DbsApi.md#provide_order_digital_codes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров |
| [**provide_order_item_identifiers**](DbsApi.md#provide_order_item_identifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара |
| [**put_bids_for_business**](DbsApi.md#put_bids_for_business) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
| [**put_bids_for_campaign**](DbsApi.md#put_bids_for_campaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |
| [**refresh_feed**](DbsApi.md#refresh_feed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
| [**search_models**](DbsApi.md#search_models) | **GET** /models | Поиск модели товара |
| [**search_region_children**](DbsApi.md#search_region_children) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
| [**search_regions_by_id**](DbsApi.md#search_regions_by_id) | **GET** /regions/{regionId} | Информация о регионе |
| [**search_regions_by_name**](DbsApi.md#search_regions_by_name) | **GET** /regions | Поиск регионов по их имени |
| [**send_file_to_chat**](DbsApi.md#send_file_to_chat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
| [**send_message_to_chat**](DbsApi.md#send_message_to_chat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |
| [**set_feed_params**](DbsApi.md#set_feed_params) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |
| [**set_order_box_layout**](DbsApi.md#set_order_box_layout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа |
| [**set_order_delivery_date**](DbsApi.md#set_order_delivery_date) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа |
| [**set_order_delivery_track_code**](DbsApi.md#set_order_delivery_track_code) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки |
| [**set_order_shipment_boxes**](DbsApi.md#set_order_shipment_boxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе |
| [**set_return_decision**](DbsApi.md#set_return_decision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату |
| [**skip_goods_feedbacks_reaction**](DbsApi.md#skip_goods_feedbacks_reaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
| [**submit_return_decision**](DbsApi.md#submit_return_decision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату |
| [**update_business_prices**](DbsApi.md#update_business_prices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
| [**update_campaign_offers**](DbsApi.md#update_campaign_offers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |
| [**update_goods_feedback_comment**](DbsApi.md#update_goods_feedback_comment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |
| [**update_offer_content**](DbsApi.md#update_offer_content) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |
| [**update_offer_mapping_entries**](DbsApi.md#update_offer_mapping_entries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге |
| [**update_offer_mappings**](DbsApi.md#update_offer_mappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них |
| [**update_order_items**](DbsApi.md#update_order_items) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц |
| [**update_order_status**](DbsApi.md#update_order_status) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа |
| [**update_order_statuses**](DbsApi.md#update_order_statuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов |
| [**update_order_storage_limit**](DbsApi.md#update_order_storage_limit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа |
| [**update_outlet**](DbsApi.md#update_outlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж |
| [**update_outlet_licenses**](DbsApi.md#update_outlet_licenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж |
| [**update_prices**](DbsApi.md#update_prices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |
| [**update_promo_offers**](DbsApi.md#update_promo_offers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |
| [**update_stocks**](DbsApi.md#update_stocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках |


## accept_order_cancellation

> <EmptyApiResponse> accept_order_cancellation(campaign_id, order_id, accept_order_cancellation_request)

Отмена заказа покупателем

Подтверждает или отклоняет запрос покупателя на отмену заказа, который передан службе доставки.  Покупатель может отменить заказ в течение его обработки или доставки. Если заказ еще обрабатывается (имеет статус PROCESSING), вам не нужно подтверждать отмену заказа — он будет отменен автоматически.  Если заказ уже передан службе доставки (принимает статус `DELIVERY` или `PICKUP`) и пользователь отменил его, вы можете предупредить службу об отмене в течение 48 часов. Если служба доставки узнала об отмене до передачи заказа покупателю, подтвердите отмену с помощью запроса [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation.md). Если заказ уже доставлен, отклоните отмену с помощью этого же запроса. Тогда у покупателя останется заказ, и деньги за него возвращаться не будут.  Чтобы узнать, какие заказы были отменены в статусе `DELIVERY` или `PICKUP`, отправьте запрос [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md). В его URL добавьте входной параметр `onlyWaitingForCancellationApprove=true`. Вы также можете узнать об отмененных заказах в кабинете или через почту — на нее придет уведомление об отмене.  Если в течение 48 часов вы не подтвердите или отклоните отмену, заказ будет отменен автоматически.  |**⚙️ Лимит:** 500 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
accept_order_cancellation_request = OpenapiClient::AcceptOrderCancellationRequest.new({accepted: false}) # AcceptOrderCancellationRequest | 

begin
  # Отмена заказа покупателем
  result = api_instance.accept_order_cancellation(campaign_id, order_id, accept_order_cancellation_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->accept_order_cancellation: #{e}"
end
```

#### Using the accept_order_cancellation_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> accept_order_cancellation_with_http_info(campaign_id, order_id, accept_order_cancellation_request)

```ruby
begin
  # Отмена заказа покупателем
  data, status_code, headers = api_instance.accept_order_cancellation_with_http_info(campaign_id, order_id, accept_order_cancellation_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->accept_order_cancellation_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **accept_order_cancellation_request** | [**AcceptOrderCancellationRequest**](AcceptOrderCancellationRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## add_hidden_offers

> <EmptyApiResponse> add_hidden_offers(campaign_id, add_hidden_offers_request)

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
add_hidden_offers_request = OpenapiClient::AddHiddenOffersRequest.new({hidden_offers: [OpenapiClient::HiddenOfferDTO.new({offer_id: 'offer_id_example'})]}) # AddHiddenOffersRequest | Запрос на скрытие оферов.

begin
  # Скрытие товаров и настройки скрытия
  result = api_instance.add_hidden_offers(campaign_id, add_hidden_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->add_hidden_offers: #{e}"
end
```

#### Using the add_hidden_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> add_hidden_offers_with_http_info(campaign_id, add_hidden_offers_request)

```ruby
begin
  # Скрытие товаров и настройки скрытия
  data, status_code, headers = api_instance.add_hidden_offers_with_http_info(campaign_id, add_hidden_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->add_hidden_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **add_hidden_offers_request** | [**AddHiddenOffersRequest**](AddHiddenOffersRequest.md) | Запрос на скрытие оферов. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## add_offers_to_archive

> <AddOffersToArchiveResponse> add_offers_to_archive(business_id, add_offers_to_archive_request)

Добавление товаров в архив

Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
add_offers_to_archive_request = OpenapiClient::AddOffersToArchiveRequest.new({offer_ids: ['offer_ids_example']}) # AddOffersToArchiveRequest | 

begin
  # Добавление товаров в архив
  result = api_instance.add_offers_to_archive(business_id, add_offers_to_archive_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->add_offers_to_archive: #{e}"
end
```

#### Using the add_offers_to_archive_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AddOffersToArchiveResponse>, Integer, Hash)> add_offers_to_archive_with_http_info(business_id, add_offers_to_archive_request)

```ruby
begin
  # Добавление товаров в архив
  data, status_code, headers = api_instance.add_offers_to_archive_with_http_info(business_id, add_offers_to_archive_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AddOffersToArchiveResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->add_offers_to_archive_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **add_offers_to_archive_request** | [**AddOffersToArchiveRequest**](AddOffersToArchiveRequest.md) |  |  |

### Return type

[**AddOffersToArchiveResponse**](AddOffersToArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## calculate_tariffs

> <CalculateTariffsResponse> calculate_tariffs(calculate_tariffs_request)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
calculate_tariffs_request = OpenapiClient::CalculateTariffsRequest.new({parameters: OpenapiClient::CalculateTariffsParametersDTO.new, offers: [OpenapiClient::CalculateTariffsOfferDTO.new({category_id: 3.56, price: 3.56, length: 3.56, width: 3.56, height: 3.56, weight: 3.56})]}) # CalculateTariffsRequest | 

begin
  # Калькулятор стоимости услуг
  result = api_instance.calculate_tariffs(calculate_tariffs_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->calculate_tariffs: #{e}"
end
```

#### Using the calculate_tariffs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CalculateTariffsResponse>, Integer, Hash)> calculate_tariffs_with_http_info(calculate_tariffs_request)

```ruby
begin
  # Калькулятор стоимости услуг
  data, status_code, headers = api_instance.calculate_tariffs_with_http_info(calculate_tariffs_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CalculateTariffsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->calculate_tariffs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **calculate_tariffs_request** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md) |  |  |

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## confirm_business_prices

> <EmptyApiResponse> confirm_business_prices(business_id, confirm_prices_request)

Удаление товара из карантина по цене в кабинете

Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
confirm_prices_request = OpenapiClient::ConfirmPricesRequest.new({offer_ids: ['offer_ids_example']}) # ConfirmPricesRequest | 

begin
  # Удаление товара из карантина по цене в кабинете
  result = api_instance.confirm_business_prices(business_id, confirm_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->confirm_business_prices: #{e}"
end
```

#### Using the confirm_business_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> confirm_business_prices_with_http_info(business_id, confirm_prices_request)

```ruby
begin
  # Удаление товара из карантина по цене в кабинете
  data, status_code, headers = api_instance.confirm_business_prices_with_http_info(business_id, confirm_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->confirm_business_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **confirm_prices_request** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## confirm_campaign_prices

> <EmptyApiResponse> confirm_campaign_prices(campaign_id, confirm_prices_request)

Удаление товара из карантина по цене в магазине

Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
confirm_prices_request = OpenapiClient::ConfirmPricesRequest.new({offer_ids: ['offer_ids_example']}) # ConfirmPricesRequest | 

begin
  # Удаление товара из карантина по цене в магазине
  result = api_instance.confirm_campaign_prices(campaign_id, confirm_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->confirm_campaign_prices: #{e}"
end
```

#### Using the confirm_campaign_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> confirm_campaign_prices_with_http_info(campaign_id, confirm_prices_request)

```ruby
begin
  # Удаление товара из карантина по цене в магазине
  data, status_code, headers = api_instance.confirm_campaign_prices_with_http_info(campaign_id, confirm_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->confirm_campaign_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **confirm_prices_request** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_chat

> <CreateChatResponse> create_chat(business_id, create_chat_request)

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
create_chat_request = OpenapiClient::CreateChatRequest.new({order_id: 3.56}) # CreateChatRequest | description

begin
  # Создание нового чата с покупателем
  result = api_instance.create_chat(business_id, create_chat_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->create_chat: #{e}"
end
```

#### Using the create_chat_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateChatResponse>, Integer, Hash)> create_chat_with_http_info(business_id, create_chat_request)

```ruby
begin
  # Создание нового чата с покупателем
  data, status_code, headers = api_instance.create_chat_with_http_info(business_id, create_chat_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateChatResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->create_chat_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **create_chat_request** | [**CreateChatRequest**](CreateChatRequest.md) | description |  |

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_outlet

> <CreateOutletResponse> create_outlet(campaign_id, change_outlet_request)

Создание точки продаж

Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
change_outlet_request = OpenapiClient::ChangeOutletRequest.new({name: 'name_example', type: OpenapiClient::OutletType::DEPOT, address: OpenapiClient::OutletAddressDTO.new({region_id: 3.56}), phones: ['phones_example'], working_schedule: OpenapiClient::OutletWorkingScheduleDTO.new({schedule_items: [OpenapiClient::OutletWorkingScheduleItemDTO.new({start_day: OpenapiClient::DayOfWeekType::MONDAY, end_day: OpenapiClient::DayOfWeekType::MONDAY, start_time: 'start_time_example', end_time: 'end_time_example'})]})}) # ChangeOutletRequest | 

begin
  # Создание точки продаж
  result = api_instance.create_outlet(campaign_id, change_outlet_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->create_outlet: #{e}"
end
```

#### Using the create_outlet_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateOutletResponse>, Integer, Hash)> create_outlet_with_http_info(campaign_id, change_outlet_request)

```ruby
begin
  # Создание точки продаж
  data, status_code, headers = api_instance.create_outlet_with_http_info(campaign_id, change_outlet_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateOutletResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->create_outlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **change_outlet_request** | [**ChangeOutletRequest**](ChangeOutletRequest.md) |  |  |

### Return type

[**CreateOutletResponse**](CreateOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_campaign_offers

> <DeleteCampaignOffersResponse> delete_campaign_offers(campaign_id, delete_campaign_offers_request)

Удаление товаров из ассортимента магазина

Удаляет заданные товары из заданного магазина.  {% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_campaign_offers_request = OpenapiClient::DeleteCampaignOffersRequest.new({offer_ids: ['offer_ids_example']}) # DeleteCampaignOffersRequest | 

begin
  # Удаление товаров из ассортимента магазина
  result = api_instance.delete_campaign_offers(campaign_id, delete_campaign_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_campaign_offers: #{e}"
end
```

#### Using the delete_campaign_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteCampaignOffersResponse>, Integer, Hash)> delete_campaign_offers_with_http_info(campaign_id, delete_campaign_offers_request)

```ruby
begin
  # Удаление товаров из ассортимента магазина
  data, status_code, headers = api_instance.delete_campaign_offers_with_http_info(campaign_id, delete_campaign_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteCampaignOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_campaign_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_campaign_offers_request** | [**DeleteCampaignOffersRequest**](DeleteCampaignOffersRequest.md) |  |  |

### Return type

[**DeleteCampaignOffersResponse**](DeleteCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_goods_feedback_comment

> <EmptyApiResponse> delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request)

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_goods_feedback_comment_request = OpenapiClient::DeleteGoodsFeedbackCommentRequest.new({id: 3.56}) # DeleteGoodsFeedbackCommentRequest | 

begin
  # Удаление комментария к отзыву
  result = api_instance.delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_goods_feedback_comment: #{e}"
end
```

#### Using the delete_goods_feedback_comment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> delete_goods_feedback_comment_with_http_info(business_id, delete_goods_feedback_comment_request)

```ruby
begin
  # Удаление комментария к отзыву
  data, status_code, headers = api_instance.delete_goods_feedback_comment_with_http_info(business_id, delete_goods_feedback_comment_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_goods_feedback_comment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_goods_feedback_comment_request** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_hidden_offers

> <EmptyApiResponse> delete_hidden_offers(campaign_id, delete_hidden_offers_request)

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_hidden_offers_request = OpenapiClient::DeleteHiddenOffersRequest.new({hidden_offers: [OpenapiClient::HiddenOfferDTO.new({offer_id: 'offer_id_example'})]}) # DeleteHiddenOffersRequest | Запрос на возобновление показа оферов.

begin
  # Возобновление показа товаров
  result = api_instance.delete_hidden_offers(campaign_id, delete_hidden_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_hidden_offers: #{e}"
end
```

#### Using the delete_hidden_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> delete_hidden_offers_with_http_info(campaign_id, delete_hidden_offers_request)

```ruby
begin
  # Возобновление показа товаров
  data, status_code, headers = api_instance.delete_hidden_offers_with_http_info(campaign_id, delete_hidden_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_hidden_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_hidden_offers_request** | [**DeleteHiddenOffersRequest**](DeleteHiddenOffersRequest.md) | Запрос на возобновление показа оферов. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_offers

> <DeleteOffersResponse> delete_offers(business_id, delete_offers_request)

Удаление товаров из каталога

Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_offers_request = OpenapiClient::DeleteOffersRequest.new({offer_ids: ['offer_ids_example']}) # DeleteOffersRequest | 

begin
  # Удаление товаров из каталога
  result = api_instance.delete_offers(business_id, delete_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_offers: #{e}"
end
```

#### Using the delete_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteOffersResponse>, Integer, Hash)> delete_offers_with_http_info(business_id, delete_offers_request)

```ruby
begin
  # Удаление товаров из каталога
  data, status_code, headers = api_instance.delete_offers_with_http_info(business_id, delete_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_offers_request** | [**DeleteOffersRequest**](DeleteOffersRequest.md) |  |  |

### Return type

[**DeleteOffersResponse**](DeleteOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_offers_from_archive

> <DeleteOffersFromArchiveResponse> delete_offers_from_archive(business_id, delete_offers_from_archive_request)

Удаление товаров из архива

Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_offers_from_archive_request = OpenapiClient::DeleteOffersFromArchiveRequest.new({offer_ids: ['offer_ids_example']}) # DeleteOffersFromArchiveRequest | 

begin
  # Удаление товаров из архива
  result = api_instance.delete_offers_from_archive(business_id, delete_offers_from_archive_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_offers_from_archive: #{e}"
end
```

#### Using the delete_offers_from_archive_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteOffersFromArchiveResponse>, Integer, Hash)> delete_offers_from_archive_with_http_info(business_id, delete_offers_from_archive_request)

```ruby
begin
  # Удаление товаров из архива
  data, status_code, headers = api_instance.delete_offers_from_archive_with_http_info(business_id, delete_offers_from_archive_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteOffersFromArchiveResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_offers_from_archive_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_offers_from_archive_request** | [**DeleteOffersFromArchiveRequest**](DeleteOffersFromArchiveRequest.md) |  |  |

### Return type

[**DeleteOffersFromArchiveResponse**](DeleteOffersFromArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_outlet

> <EmptyApiResponse> delete_outlet(campaign_id, outlet_id)

Удаление точки продаж

Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
outlet_id = 789 # Integer | Идентификатор точки продаж.

begin
  # Удаление точки продаж
  result = api_instance.delete_outlet(campaign_id, outlet_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_outlet: #{e}"
end
```

#### Using the delete_outlet_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> delete_outlet_with_http_info(campaign_id, outlet_id)

```ruby
begin
  # Удаление точки продаж
  data, status_code, headers = api_instance.delete_outlet_with_http_info(campaign_id, outlet_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_outlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **outlet_id** | **Integer** | Идентификатор точки продаж. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delete_outlet_licenses

> <EmptyApiResponse> delete_outlet_licenses(campaign_id, opts)

Удаление лицензий для точек продаж

Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  ids: [3.56] # Array<Integer> | Список идентификаторов лицензий.
}

begin
  # Удаление лицензий для точек продаж
  result = api_instance.delete_outlet_licenses(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_outlet_licenses: #{e}"
end
```

#### Using the delete_outlet_licenses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> delete_outlet_licenses_with_http_info(campaign_id, opts)

```ruby
begin
  # Удаление лицензий для точек продаж
  data, status_code, headers = api_instance.delete_outlet_licenses_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_outlet_licenses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **ids** | [**Array&lt;Integer&gt;**](Integer.md) | Список идентификаторов лицензий. | [optional] |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delete_promo_offers

> <DeletePromoOffersResponse> delete_promo_offers(business_id, delete_promo_offers_request)

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_promo_offers_request = OpenapiClient::DeletePromoOffersRequest.new({promo_id: 'promo_id_example'}) # DeletePromoOffersRequest | 

begin
  # Удаление товаров из акции
  result = api_instance.delete_promo_offers(business_id, delete_promo_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_promo_offers: #{e}"
end
```

#### Using the delete_promo_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeletePromoOffersResponse>, Integer, Hash)> delete_promo_offers_with_http_info(business_id, delete_promo_offers_request)

```ruby
begin
  # Удаление товаров из акции
  data, status_code, headers = api_instance.delete_promo_offers_with_http_info(business_id, delete_promo_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeletePromoOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->delete_promo_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_promo_offers_request** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md) |  |  |

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_boost_consolidated_report

> <GenerateReportResponse> generate_boost_consolidated_report(generate_boost_consolidated_request, opts)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_boost_consolidated_request = OpenapiClient::GenerateBoostConsolidatedRequest.new({business_id: 3.56, date_from: Date.today, date_to: Date.today}) # GenerateBoostConsolidatedRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по бусту продаж
  result = api_instance.generate_boost_consolidated_report(generate_boost_consolidated_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_boost_consolidated_report: #{e}"
end
```

#### Using the generate_boost_consolidated_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_boost_consolidated_report_with_http_info(generate_boost_consolidated_request, opts)

```ruby
begin
  # Отчет по бусту продаж
  data, status_code, headers = api_instance.generate_boost_consolidated_report_with_http_info(generate_boost_consolidated_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_boost_consolidated_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_boost_consolidated_request** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_competitors_position_report

> <GenerateReportResponse> generate_competitors_position_report(generate_competitors_position_report_request, opts)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_competitors_position_report_request = OpenapiClient::GenerateCompetitorsPositionReportRequest.new({business_id: 3.56, category_id: 3.56, date_from: Date.today, date_to: Date.today}) # GenerateCompetitorsPositionReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет «Конкурентная позиция»
  result = api_instance.generate_competitors_position_report(generate_competitors_position_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_competitors_position_report: #{e}"
end
```

#### Using the generate_competitors_position_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_competitors_position_report_with_http_info(generate_competitors_position_report_request, opts)

```ruby
begin
  # Отчет «Конкурентная позиция»
  data, status_code, headers = api_instance.generate_competitors_position_report_with_http_info(generate_competitors_position_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_competitors_position_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_competitors_position_report_request** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_goods_feedback_report

> <GenerateReportResponse> generate_goods_feedback_report(generate_goods_feedback_request, opts)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_goods_feedback_request = OpenapiClient::GenerateGoodsFeedbackRequest.new({business_id: 3.56}) # GenerateGoodsFeedbackRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по отзывам о товарах
  result = api_instance.generate_goods_feedback_report(generate_goods_feedback_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_goods_feedback_report: #{e}"
end
```

#### Using the generate_goods_feedback_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_goods_feedback_report_with_http_info(generate_goods_feedback_request, opts)

```ruby
begin
  # Отчет по отзывам о товарах
  data, status_code, headers = api_instance.generate_goods_feedback_report_with_http_info(generate_goods_feedback_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_goods_feedback_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_goods_feedback_request** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_mass_order_labels_report

> <GenerateReportResponse> generate_mass_order_labels_report(generate_mass_order_labels_request, opts)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_mass_order_labels_request = OpenapiClient::GenerateMassOrderLabelsRequest.new({business_id: 3.56, order_ids: [3.56]}) # GenerateMassOrderLabelsRequest | 
opts = {
  format: OpenapiClient::PageFormatType::A7 # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
}

begin
  # Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  result = api_instance.generate_mass_order_labels_report(generate_mass_order_labels_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_mass_order_labels_report: #{e}"
end
```

#### Using the generate_mass_order_labels_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_mass_order_labels_report_with_http_info(generate_mass_order_labels_request, opts)

```ruby
begin
  # Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  data, status_code, headers = api_instance.generate_mass_order_labels_report_with_http_info(generate_mass_order_labels_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_mass_order_labels_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_mass_order_labels_request** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md) |  |  |
| **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_order_label

> File generate_order_label(campaign_id, order_id, shipment_id, box_id, opts)

Готовый ярлык‑наклейка для коробки в заказе

Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
shipment_id = 789 # Integer | Идентификатор грузоместа.
box_id = 789 # Integer | Идентификатор коробки.
opts = {
  format: OpenapiClient::PageFormatType::A7 # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
}

begin
  # Готовый ярлык‑наклейка для коробки в заказе
  result = api_instance.generate_order_label(campaign_id, order_id, shipment_id, box_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_order_label: #{e}"
end
```

#### Using the generate_order_label_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> generate_order_label_with_http_info(campaign_id, order_id, shipment_id, box_id, opts)

```ruby
begin
  # Готовый ярлык‑наклейка для коробки в заказе
  data, status_code, headers = api_instance.generate_order_label_with_http_info(campaign_id, order_id, shipment_id, box_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_order_label_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **shipment_id** | **Integer** | Идентификатор грузоместа. |  |
| **box_id** | **Integer** | Идентификатор коробки. |  |
| **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## generate_order_labels

> File generate_order_labels(campaign_id, order_id, opts)

Готовые ярлыки‑наклейки на все коробки в одном заказе

Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
opts = {
  format: OpenapiClient::PageFormatType::A7 # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
}

begin
  # Готовые ярлыки‑наклейки на все коробки в одном заказе
  result = api_instance.generate_order_labels(campaign_id, order_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_order_labels: #{e}"
end
```

#### Using the generate_order_labels_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> generate_order_labels_with_http_info(campaign_id, order_id, opts)

```ruby
begin
  # Готовые ярлыки‑наклейки на все коробки в одном заказе
  data, status_code, headers = api_instance.generate_order_labels_with_http_info(campaign_id, order_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_order_labels_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## generate_prices_report

> <GenerateReportResponse> generate_prices_report(generate_prices_report_request, opts)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_prices_report_request = OpenapiClient::GeneratePricesReportRequest.new # GeneratePricesReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет «Цены на рынке»
  result = api_instance.generate_prices_report(generate_prices_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_prices_report: #{e}"
end
```

#### Using the generate_prices_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_prices_report_with_http_info(generate_prices_report_request, opts)

```ruby
begin
  # Отчет «Цены на рынке»
  data, status_code, headers = api_instance.generate_prices_report_with_http_info(generate_prices_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_prices_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_prices_report_request** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_shelfs_statistics_report

> <GenerateReportResponse> generate_shelfs_statistics_report(generate_shelfs_statistics_request, opts)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_shelfs_statistics_request = OpenapiClient::GenerateShelfsStatisticsRequest.new({business_id: 3.56, date_from: Date.today, date_to: Date.today, attribution_type: OpenapiClient::ShelfsStatisticsAttributionType::CLICKS}) # GenerateShelfsStatisticsRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по полкам
  result = api_instance.generate_shelfs_statistics_report(generate_shelfs_statistics_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_shelfs_statistics_report: #{e}"
end
```

#### Using the generate_shelfs_statistics_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_shelfs_statistics_report_with_http_info(generate_shelfs_statistics_request, opts)

```ruby
begin
  # Отчет по полкам
  data, status_code, headers = api_instance.generate_shelfs_statistics_report_with_http_info(generate_shelfs_statistics_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_shelfs_statistics_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_shelfs_statistics_request** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_shows_sales_report

> <GenerateReportResponse> generate_shows_sales_report(generate_shows_sales_report_request, opts)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_shows_sales_report_request = OpenapiClient::GenerateShowsSalesReportRequest.new({date_from: Date.today, date_to: Date.today, grouping: OpenapiClient::ShowsSalesGroupingType::CATEGORIES}) # GenerateShowsSalesReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет «Аналитика продаж»
  result = api_instance.generate_shows_sales_report(generate_shows_sales_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_shows_sales_report: #{e}"
end
```

#### Using the generate_shows_sales_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_shows_sales_report_with_http_info(generate_shows_sales_report_request, opts)

```ruby
begin
  # Отчет «Аналитика продаж»
  data, status_code, headers = api_instance.generate_shows_sales_report_with_http_info(generate_shows_sales_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_shows_sales_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_shows_sales_report_request** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_stocks_on_warehouses_report

> <GenerateReportResponse> generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, opts)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_stocks_on_warehouses_report_request = OpenapiClient::GenerateStocksOnWarehousesReportRequest.new({campaign_id: 3.56}) # GenerateStocksOnWarehousesReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по остаткам на складах
  result = api_instance.generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_stocks_on_warehouses_report: #{e}"
end
```

#### Using the generate_stocks_on_warehouses_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_stocks_on_warehouses_report_with_http_info(generate_stocks_on_warehouses_report_request, opts)

```ruby
begin
  # Отчет по остаткам на складах
  data, status_code, headers = api_instance.generate_stocks_on_warehouses_report_with_http_info(generate_stocks_on_warehouses_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_stocks_on_warehouses_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_stocks_on_warehouses_report_request** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_united_marketplace_services_report

> <GenerateReportResponse> generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, opts)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_united_marketplace_services_report_request = OpenapiClient::GenerateUnitedMarketplaceServicesReportRequest.new({business_id: 3.56}) # GenerateUnitedMarketplaceServicesReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по стоимости услуг
  result = api_instance.generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_united_marketplace_services_report: #{e}"
end
```

#### Using the generate_united_marketplace_services_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_united_marketplace_services_report_with_http_info(generate_united_marketplace_services_report_request, opts)

```ruby
begin
  # Отчет по стоимости услуг
  data, status_code, headers = api_instance.generate_united_marketplace_services_report_with_http_info(generate_united_marketplace_services_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_united_marketplace_services_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_united_marketplace_services_report_request** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_united_netting_report

> <GenerateReportResponse> generate_united_netting_report(generate_united_netting_report_request, opts)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_united_netting_report_request = OpenapiClient::GenerateUnitedNettingReportRequest.new({business_id: 3.56}) # GenerateUnitedNettingReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по платежам
  result = api_instance.generate_united_netting_report(generate_united_netting_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_united_netting_report: #{e}"
end
```

#### Using the generate_united_netting_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_united_netting_report_with_http_info(generate_united_netting_report_request, opts)

```ruby
begin
  # Отчет по платежам
  data, status_code, headers = api_instance.generate_united_netting_report_with_http_info(generate_united_netting_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_united_netting_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_united_netting_report_request** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_united_orders_report

> <GenerateReportResponse> generate_united_orders_report(generate_united_orders_request, opts)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
generate_united_orders_request = OpenapiClient::GenerateUnitedOrdersRequest.new({business_id: 3.56, date_from: Date.today, date_to: Date.today}) # GenerateUnitedOrdersRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по заказам
  result = api_instance.generate_united_orders_report(generate_united_orders_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_united_orders_report: #{e}"
end
```

#### Using the generate_united_orders_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_united_orders_report_with_http_info(generate_united_orders_request, opts)

```ruby
begin
  # Отчет по заказам
  data, status_code, headers = api_instance.generate_united_orders_report_with_http_info(generate_united_orders_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->generate_united_orders_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_united_orders_request** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_all_offers

> <GetAllOffersResponse> get_all_offers(campaign_id, opts)

Все предложения магазина

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  feed_id: 789, # Integer | Идентификатор прайс-листа.
  chunk: 56 # Integer | Номер сегмента с результатами.  Значение по умолчанию: `0`.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать `chunk=0` и т. д.  {% endnote %} 
}

begin
  # Все предложения магазина
  result = api_instance.get_all_offers(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_all_offers: #{e}"
end
```

#### Using the get_all_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetAllOffersResponse>, Integer, Hash)> get_all_offers_with_http_info(campaign_id, opts)

```ruby
begin
  # Все предложения магазина
  data, status_code, headers = api_instance.get_all_offers_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetAllOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_all_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. | [optional] |
| **chunk** | **Integer** | Номер сегмента с результатами.  Значение по умолчанию: &#x60;0&#x60;.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#x60;chunk&#x3D;0&#x60; и т. д.  {% endnote %}  | [optional] |

### Return type

[**GetAllOffersResponse**](GetAllOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_bids_info_for_business

> <GetBidsInfoResponse> get_bids_info_for_business(business_id, opts)

Информация об установленных ставках

Возвращает значения ставок для заданных товаров.  {% note warning \"\" %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_bids_info_request: OpenapiClient::GetBidsInfoRequest.new # GetBidsInfoRequest | description
}

begin
  # Информация об установленных ставках
  result = api_instance.get_bids_info_for_business(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_bids_info_for_business: #{e}"
end
```

#### Using the get_bids_info_for_business_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBidsInfoResponse>, Integer, Hash)> get_bids_info_for_business_with_http_info(business_id, opts)

```ruby
begin
  # Информация об установленных ставках
  data, status_code, headers = api_instance.get_bids_info_for_business_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBidsInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_bids_info_for_business_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_bids_info_request** | [**GetBidsInfoRequest**](GetBidsInfoRequest.md) | description | [optional] |

### Return type

[**GetBidsInfoResponse**](GetBidsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_bids_recommendations

> <GetBidsRecommendationsResponse> get_bids_recommendations(business_id, get_bids_recommendations_request)

Рекомендованные ставки для заданных товаров

Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_bids_recommendations_request = OpenapiClient::GetBidsRecommendationsRequest.new({skus: ['skus_example']}) # GetBidsRecommendationsRequest | description.

begin
  # Рекомендованные ставки для заданных товаров
  result = api_instance.get_bids_recommendations(business_id, get_bids_recommendations_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_bids_recommendations: #{e}"
end
```

#### Using the get_bids_recommendations_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBidsRecommendationsResponse>, Integer, Hash)> get_bids_recommendations_with_http_info(business_id, get_bids_recommendations_request)

```ruby
begin
  # Рекомендованные ставки для заданных товаров
  data, status_code, headers = api_instance.get_bids_recommendations_with_http_info(business_id, get_bids_recommendations_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBidsRecommendationsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_bids_recommendations_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_bids_recommendations_request** | [**GetBidsRecommendationsRequest**](GetBidsRecommendationsRequest.md) | description. |  |

### Return type

[**GetBidsRecommendationsResponse**](GetBidsRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_business_quarantine_offers

> <GetQuarantineOffersResponse> get_business_quarantine_offers(business_id, get_quarantine_offers_request, opts)

Список товаров, находящихся в карантине по цене в кабинете

Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_quarantine_offers_request = OpenapiClient::GetQuarantineOffersRequest.new # GetQuarantineOffersRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Список товаров, находящихся в карантине по цене в кабинете
  result = api_instance.get_business_quarantine_offers(business_id, get_quarantine_offers_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_business_quarantine_offers: #{e}"
end
```

#### Using the get_business_quarantine_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetQuarantineOffersResponse>, Integer, Hash)> get_business_quarantine_offers_with_http_info(business_id, get_quarantine_offers_request, opts)

```ruby
begin
  # Список товаров, находящихся в карантине по цене в кабинете
  data, status_code, headers = api_instance.get_business_quarantine_offers_with_http_info(business_id, get_quarantine_offers_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetQuarantineOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_business_quarantine_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_quarantine_offers_request** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_business_settings

> <GetBusinessSettingsResponse> get_business_settings(business_id)

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Настройки кабинета
  result = api_instance.get_business_settings(business_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_business_settings: #{e}"
end
```

#### Using the get_business_settings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessSettingsResponse>, Integer, Hash)> get_business_settings_with_http_info(business_id)

```ruby
begin
  # Настройки кабинета
  data, status_code, headers = api_instance.get_business_settings_with_http_info(business_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessSettingsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_business_settings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaign

> <GetCampaignResponse> get_campaign(campaign_id)

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Информация о магазине
  result = api_instance.get_campaign(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign: #{e}"
end
```

#### Using the get_campaign_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignResponse>, Integer, Hash)> get_campaign_with_http_info(campaign_id)

```ruby
begin
  # Информация о магазине
  data, status_code, headers = api_instance.get_campaign_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaign_logins

> <GetCampaignLoginsResponse> get_campaign_logins(campaign_id)

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Логины, связанные с магазином
  result = api_instance.get_campaign_logins(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_logins: #{e}"
end
```

#### Using the get_campaign_logins_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignLoginsResponse>, Integer, Hash)> get_campaign_logins_with_http_info(campaign_id)

```ruby
begin
  # Логины, связанные с магазином
  data, status_code, headers = api_instance.get_campaign_logins_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignLoginsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_logins_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaign_offers

> <GetCampaignOffersResponse> get_campaign_offers(campaign_id, get_campaign_offers_request, opts)

Информация о товарах, которые размещены в заданном магазине

Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_campaign_offers_request = OpenapiClient::GetCampaignOffersRequest.new # GetCampaignOffersRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Информация о товарах, которые размещены в заданном магазине
  result = api_instance.get_campaign_offers(campaign_id, get_campaign_offers_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_offers: #{e}"
end
```

#### Using the get_campaign_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignOffersResponse>, Integer, Hash)> get_campaign_offers_with_http_info(campaign_id, get_campaign_offers_request, opts)

```ruby
begin
  # Информация о товарах, которые размещены в заданном магазине
  data, status_code, headers = api_instance.get_campaign_offers_with_http_info(campaign_id, get_campaign_offers_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_campaign_offers_request** | [**GetCampaignOffersRequest**](GetCampaignOffersRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetCampaignOffersResponse**](GetCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_campaign_quarantine_offers

> <GetQuarantineOffersResponse> get_campaign_quarantine_offers(campaign_id, get_quarantine_offers_request, opts)

Список товаров, находящихся в карантине по цене в магазине

Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_quarantine_offers_request = OpenapiClient::GetQuarantineOffersRequest.new # GetQuarantineOffersRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Список товаров, находящихся в карантине по цене в магазине
  result = api_instance.get_campaign_quarantine_offers(campaign_id, get_quarantine_offers_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_quarantine_offers: #{e}"
end
```

#### Using the get_campaign_quarantine_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetQuarantineOffersResponse>, Integer, Hash)> get_campaign_quarantine_offers_with_http_info(campaign_id, get_quarantine_offers_request, opts)

```ruby
begin
  # Список товаров, находящихся в карантине по цене в магазине
  data, status_code, headers = api_instance.get_campaign_quarantine_offers_with_http_info(campaign_id, get_quarantine_offers_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetQuarantineOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_quarantine_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_quarantine_offers_request** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_campaign_region

> <GetCampaignRegionResponse> get_campaign_region(campaign_id)

Регион магазина

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Регион магазина
  result = api_instance.get_campaign_region(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_region: #{e}"
end
```

#### Using the get_campaign_region_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignRegionResponse>, Integer, Hash)> get_campaign_region_with_http_info(campaign_id)

```ruby
begin
  # Регион магазина
  data, status_code, headers = api_instance.get_campaign_region_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignRegionResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_region_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaign_settings

> <GetCampaignSettingsResponse> get_campaign_settings(campaign_id)

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Настройки магазина
  result = api_instance.get_campaign_settings(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_settings: #{e}"
end
```

#### Using the get_campaign_settings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignSettingsResponse>, Integer, Hash)> get_campaign_settings_with_http_info(campaign_id)

```ruby
begin
  # Настройки магазина
  data, status_code, headers = api_instance.get_campaign_settings_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignSettingsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaign_settings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaigns

> <GetCampaignsResponse> get_campaigns(opts)

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
opts = {
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Список магазинов пользователя
  result = api_instance.get_campaigns(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaigns: #{e}"
end
```

#### Using the get_campaigns_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignsResponse>, Integer, Hash)> get_campaigns_with_http_info(opts)

```ruby
begin
  # Список магазинов пользователя
  data, status_code, headers = api_instance.get_campaigns_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaigns_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaigns_by_login

> <GetCampaignsResponse> get_campaigns_by_login(login, opts)

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
login = 'login_example' # String | Логин пользователя.
opts = {
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Магазины, доступные логину
  result = api_instance.get_campaigns_by_login(login, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaigns_by_login: #{e}"
end
```

#### Using the get_campaigns_by_login_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignsResponse>, Integer, Hash)> get_campaigns_by_login_with_http_info(login, opts)

```ruby
begin
  # Магазины, доступные логину
  data, status_code, headers = api_instance.get_campaigns_by_login_with_http_info(login, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_campaigns_by_login_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **login** | **String** | Логин пользователя. |  |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_categories_max_sale_quantum

> <GetCategoriesMaxSaleQuantumResponse> get_categories_max_sale_quantum(get_categories_max_sale_quantum_request)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
get_categories_max_sale_quantum_request = OpenapiClient::GetCategoriesMaxSaleQuantumRequest.new({market_category_ids: [3.56]}) # GetCategoriesMaxSaleQuantumRequest | 

begin
  # Лимит на установку кванта продажи и минимального количества товаров в заказе
  result = api_instance.get_categories_max_sale_quantum(get_categories_max_sale_quantum_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_categories_max_sale_quantum: #{e}"
end
```

#### Using the get_categories_max_sale_quantum_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCategoriesMaxSaleQuantumResponse>, Integer, Hash)> get_categories_max_sale_quantum_with_http_info(get_categories_max_sale_quantum_request)

```ruby
begin
  # Лимит на установку кванта продажи и минимального количества товаров в заказе
  data, status_code, headers = api_instance.get_categories_max_sale_quantum_with_http_info(get_categories_max_sale_quantum_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCategoriesMaxSaleQuantumResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_categories_max_sale_quantum_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **get_categories_max_sale_quantum_request** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md) |  |  |

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_categories_tree

> <GetCategoriesResponse> get_categories_tree(opts)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
opts = {
  get_categories_request: OpenapiClient::GetCategoriesRequest.new # GetCategoriesRequest | 
}

begin
  # Дерево категорий
  result = api_instance.get_categories_tree(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_categories_tree: #{e}"
end
```

#### Using the get_categories_tree_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCategoriesResponse>, Integer, Hash)> get_categories_tree_with_http_info(opts)

```ruby
begin
  # Дерево категорий
  data, status_code, headers = api_instance.get_categories_tree_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCategoriesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_categories_tree_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **get_categories_request** | [**GetCategoriesRequest**](GetCategoriesRequest.md) |  | [optional] |

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_category_content_parameters

> <GetCategoryContentParametersResponse> get_category_content_parameters(category_id)

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
category_id = 789 # Integer | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 

begin
  # Списки характеристик товаров по категориям
  result = api_instance.get_category_content_parameters(category_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_category_content_parameters: #{e}"
end
```

#### Using the get_category_content_parameters_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCategoryContentParametersResponse>, Integer, Hash)> get_category_content_parameters_with_http_info(category_id)

```ruby
begin
  # Списки характеристик товаров по категориям
  data, status_code, headers = api_instance.get_category_content_parameters_with_http_info(category_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCategoryContentParametersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_category_content_parameters_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **category_id** | **Integer** | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  |  |

### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_chat_history

> <GetChatHistoryResponse> get_chat_history(business_id, chat_id, get_chat_history_request, opts)

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
chat_id = 789 # Integer | Идентификатор чата.
get_chat_history_request = OpenapiClient::GetChatHistoryRequest.new # GetChatHistoryRequest | description
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение истории сообщений в чате
  result = api_instance.get_chat_history(business_id, chat_id, get_chat_history_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_chat_history: #{e}"
end
```

#### Using the get_chat_history_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetChatHistoryResponse>, Integer, Hash)> get_chat_history_with_http_info(business_id, chat_id, get_chat_history_request, opts)

```ruby
begin
  # Получение истории сообщений в чате
  data, status_code, headers = api_instance.get_chat_history_with_http_info(business_id, chat_id, get_chat_history_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetChatHistoryResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_chat_history_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **chat_id** | **Integer** | Идентификатор чата. |  |
| **get_chat_history_request** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md) | description |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_chats

> <GetChatsResponse> get_chats(business_id, get_chats_request, opts)

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_chats_request = OpenapiClient::GetChatsRequest.new # GetChatsRequest | description
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение доступных чатов
  result = api_instance.get_chats(business_id, get_chats_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_chats: #{e}"
end
```

#### Using the get_chats_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetChatsResponse>, Integer, Hash)> get_chats_with_http_info(business_id, get_chats_request, opts)

```ruby
begin
  # Получение доступных чатов
  data, status_code, headers = api_instance.get_chats_with_http_info(business_id, get_chats_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetChatsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_chats_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_chats_request** | [**GetChatsRequest**](GetChatsRequest.md) | description |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_delivery_services

> <GetDeliveryServicesResponse> get_delivery_services

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new

begin
  # Справочник служб доставки
  result = api_instance.get_delivery_services
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_delivery_services: #{e}"
end
```

#### Using the get_delivery_services_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetDeliveryServicesResponse>, Integer, Hash)> get_delivery_services_with_http_info

```ruby
begin
  # Справочник служб доставки
  data, status_code, headers = api_instance.get_delivery_services_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetDeliveryServicesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_delivery_services_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_feed

> <GetFeedResponse> get_feed(campaign_id, feed_id)

Информация о прайс-листе

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
feed_id = 789 # Integer | Идентификатор прайс-листа.

begin
  # Информация о прайс-листе
  result = api_instance.get_feed(campaign_id, feed_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_feed: #{e}"
end
```

#### Using the get_feed_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetFeedResponse>, Integer, Hash)> get_feed_with_http_info(campaign_id, feed_id)

```ruby
begin
  # Информация о прайс-листе
  data, status_code, headers = api_instance.get_feed_with_http_info(campaign_id, feed_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetFeedResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_feed_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. |  |

### Return type

[**GetFeedResponse**](GetFeedResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_feed_index_logs

> <GetFeedIndexLogsResponse> get_feed_index_logs(campaign_id, feed_id, opts)

Отчет по индексации прайс-листа

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
feed_id = 789 # Integer | Идентификатор прайс-листа.
opts = {
  limit: 20, # Integer | Количество значений на одной странице. 
  published_time_from: Time.parse('2013-10-20T19:20:30+01:00'), # Time | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Значение по умолчанию: последние восемь дней со времени отправки запроса. 
  published_time_to: Time.parse('2013-10-20T19:20:30+01:00'), # Time | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-31T00:42:42+03:00`.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра `published_time_to`. Значение параметра не должно быть датой из будущего.  {% endnote %} 
  status: OpenapiClient::FeedIndexLogsStatusType::ERROR # FeedIndexLogsStatusType | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 
}

begin
  # Отчет по индексации прайс-листа
  result = api_instance.get_feed_index_logs(campaign_id, feed_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_feed_index_logs: #{e}"
end
```

#### Using the get_feed_index_logs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetFeedIndexLogsResponse>, Integer, Hash)> get_feed_index_logs_with_http_info(campaign_id, feed_id, opts)

```ruby
begin
  # Отчет по индексации прайс-листа
  data, status_code, headers = api_instance.get_feed_index_logs_with_http_info(campaign_id, feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetFeedIndexLogsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_feed_index_logs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. |  |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **published_time_from** | **Time** | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  | [optional] |
| **published_time_to** | **Time** | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %}  | [optional] |
| **status** | [**FeedIndexLogsStatusType**](.md) | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы.  | [optional] |

### Return type

[**GetFeedIndexLogsResponse**](GetFeedIndexLogsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_feedback_and_comment_updates

> <GetFeedbackListResponse> get_feedback_and_comment_updates(campaign_id, opts)

Новые и обновленные отзывы о магазине

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  from_date: Date.parse('2013-10-20') # Date | Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: `ГГГГ-ММ-ДД`. 
}

begin
  # Новые и обновленные отзывы о магазине
  result = api_instance.get_feedback_and_comment_updates(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_feedback_and_comment_updates: #{e}"
end
```

#### Using the get_feedback_and_comment_updates_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetFeedbackListResponse>, Integer, Hash)> get_feedback_and_comment_updates_with_http_info(campaign_id, opts)

```ruby
begin
  # Новые и обновленные отзывы о магазине
  data, status_code, headers = api_instance.get_feedback_and_comment_updates_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetFeedbackListResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_feedback_and_comment_updates_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **from_date** | **Date** | Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |

### Return type

[**GetFeedbackListResponse**](GetFeedbackListResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_feeds

> <GetFeedsResponse> get_feeds(campaign_id)

Список прайс-листов магазина

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Список прайс-листов магазина
  result = api_instance.get_feeds(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_feeds: #{e}"
end
```

#### Using the get_feeds_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetFeedsResponse>, Integer, Hash)> get_feeds_with_http_info(campaign_id)

```ruby
begin
  # Список прайс-листов магазина
  data, status_code, headers = api_instance.get_feeds_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetFeedsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_feeds_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetFeedsResponse**](GetFeedsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_goods_feedback_comments

> <GetGoodsFeedbackCommentsResponse> get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, opts)

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_goods_feedback_comments_request = OpenapiClient::GetGoodsFeedbackCommentsRequest.new({feedback_id: 3.56}) # GetGoodsFeedbackCommentsRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение комментариев к отзыву
  result = api_instance.get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_goods_feedback_comments: #{e}"
end
```

#### Using the get_goods_feedback_comments_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetGoodsFeedbackCommentsResponse>, Integer, Hash)> get_goods_feedback_comments_with_http_info(business_id, get_goods_feedback_comments_request, opts)

```ruby
begin
  # Получение комментариев к отзыву
  data, status_code, headers = api_instance.get_goods_feedback_comments_with_http_info(business_id, get_goods_feedback_comments_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetGoodsFeedbackCommentsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_goods_feedback_comments_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_goods_feedback_comments_request** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_goods_feedbacks

> <GetGoodsFeedbackResponse> get_goods_feedbacks(business_id, opts)

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_goods_feedback_request: OpenapiClient::GetGoodsFeedbackRequest.new # GetGoodsFeedbackRequest | 
}

begin
  # Получение отзывов о товарах продавца
  result = api_instance.get_goods_feedbacks(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_goods_feedbacks: #{e}"
end
```

#### Using the get_goods_feedbacks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetGoodsFeedbackResponse>, Integer, Hash)> get_goods_feedbacks_with_http_info(business_id, opts)

```ruby
begin
  # Получение отзывов о товарах продавца
  data, status_code, headers = api_instance.get_goods_feedbacks_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetGoodsFeedbackResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_goods_feedbacks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_goods_feedback_request** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md) |  | [optional] |

### Return type

[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_goods_stats

> <GetGoodsStatsResponse> get_goods_stats(campaign_id, get_goods_stats_request)

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_goods_stats_request = OpenapiClient::GetGoodsStatsRequest.new({shop_skus: ['shop_skus_example']}) # GetGoodsStatsRequest | 

begin
  # Отчет по товарам
  result = api_instance.get_goods_stats(campaign_id, get_goods_stats_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_goods_stats: #{e}"
end
```

#### Using the get_goods_stats_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetGoodsStatsResponse>, Integer, Hash)> get_goods_stats_with_http_info(campaign_id, get_goods_stats_request)

```ruby
begin
  # Отчет по товарам
  data, status_code, headers = api_instance.get_goods_stats_with_http_info(campaign_id, get_goods_stats_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetGoodsStatsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_goods_stats_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_goods_stats_request** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md) |  |  |

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_hidden_offers

> <GetHiddenOffersResponse> get_hidden_offers(campaign_id, opts)

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  offer_id: ['inner_example'], # Array<String> | Идентификатор скрытого предложения. 
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  offset: 56, # Integer | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром `limit`.  Если задан `offset`, параметры `page_number` и `page_size` игнорируются.  `offset` игнорируется, если задан `page_token`. 
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Информация о скрытых вами товарах
  result = api_instance.get_hidden_offers(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_hidden_offers: #{e}"
end
```

#### Using the get_hidden_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetHiddenOffersResponse>, Integer, Hash)> get_hidden_offers_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация о скрытых вами товарах
  data, status_code, headers = api_instance.get_hidden_offers_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetHiddenOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_hidden_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **offer_id** | [**Array&lt;String&gt;**](String.md) | Идентификатор скрытого предложения.  | [optional] |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **offset** | **Integer** | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;.  | [optional] |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetHiddenOffersResponse**](GetHiddenOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_model

> <GetModelsResponse> get_model(model_id, region_id, opts)

Информация об одной модели

Возвращает информацию о модели товара.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
model_id = 789 # Integer | Идентификатор модели товара.
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
opts = {
  currency: OpenapiClient::CurrencyType::RUR # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
}

begin
  # Информация об одной модели
  result = api_instance.get_model(model_id, region_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_model: #{e}"
end
```

#### Using the get_model_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetModelsResponse>, Integer, Hash)> get_model_with_http_info(model_id, region_id, opts)

```ruby
begin
  # Информация об одной модели
  data, status_code, headers = api_instance.get_model_with_http_info(model_id, region_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetModelsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_model_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model_id** | **Integer** | Идентификатор модели товара. |  |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_model_offers

> <GetModelsOffersResponse> get_model_offers(model_id, region_id, opts)

Список предложений для одной модели

Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
model_id = 789 # Integer | Идентификатор модели товара.
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
opts = {
  currency: OpenapiClient::CurrencyType::RUR, # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  order_by_price: OpenapiClient::SortOrderType::ASC, # SortOrderType | Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. 
  count: 56, # Integer | Количество предложений на странице ответа.
  page: 56 # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Список предложений для одной модели
  result = api_instance.get_model_offers(model_id, region_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_model_offers: #{e}"
end
```

#### Using the get_model_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetModelsOffersResponse>, Integer, Hash)> get_model_offers_with_http_info(model_id, region_id, opts)

```ruby
begin
  # Список предложений для одной модели
  data, status_code, headers = api_instance.get_model_offers_with_http_info(model_id, region_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetModelsOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_model_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model_id** | **Integer** | Идентификатор модели товара. |  |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |
| **order_by_price** | [**SortOrderType**](.md) | Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  | [optional] |
| **count** | **Integer** | Количество предложений на странице ответа. | [optional][default to 10] |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |

### Return type

[**GetModelsOffersResponse**](GetModelsOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_models

> <GetModelsResponse> get_models(region_id, get_models_request, opts)

Информация о нескольких моделях

Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
get_models_request = OpenapiClient::GetModelsRequest.new({models: [3.56]}) # GetModelsRequest | 
opts = {
  currency: OpenapiClient::CurrencyType::RUR # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
}

begin
  # Информация о нескольких моделях
  result = api_instance.get_models(region_id, get_models_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_models: #{e}"
end
```

#### Using the get_models_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetModelsResponse>, Integer, Hash)> get_models_with_http_info(region_id, get_models_request, opts)

```ruby
begin
  # Информация о нескольких моделях
  data, status_code, headers = api_instance.get_models_with_http_info(region_id, get_models_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetModelsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_models_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **get_models_request** | [**GetModelsRequest**](GetModelsRequest.md) |  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_models_offers

> <GetModelsOffersResponse> get_models_offers(region_id, get_models_request, opts)

Список предложений для нескольких моделей

Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
get_models_request = OpenapiClient::GetModelsRequest.new({models: [3.56]}) # GetModelsRequest | 
opts = {
  currency: OpenapiClient::CurrencyType::RUR, # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  order_by_price: OpenapiClient::SortOrderType::ASC # SortOrderType | Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. 
}

begin
  # Список предложений для нескольких моделей
  result = api_instance.get_models_offers(region_id, get_models_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_models_offers: #{e}"
end
```

#### Using the get_models_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetModelsOffersResponse>, Integer, Hash)> get_models_offers_with_http_info(region_id, get_models_request, opts)

```ruby
begin
  # Список предложений для нескольких моделей
  data, status_code, headers = api_instance.get_models_offers_with_http_info(region_id, get_models_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetModelsOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_models_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **get_models_request** | [**GetModelsRequest**](GetModelsRequest.md) |  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |
| **order_by_price** | [**SortOrderType**](.md) | Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  | [optional] |

### Return type

[**GetModelsOffersResponse**](GetModelsOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_offer_cards_content_status

> <GetOfferCardsContentStatusResponse> get_offer_cards_content_status(business_id, opts)

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_offer_cards_content_status_request: OpenapiClient::GetOfferCardsContentStatusRequest.new # GetOfferCardsContentStatusRequest | 
}

begin
  # Получение информации о заполненности карточек магазина
  result = api_instance.get_offer_cards_content_status(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offer_cards_content_status: #{e}"
end
```

#### Using the get_offer_cards_content_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOfferCardsContentStatusResponse>, Integer, Hash)> get_offer_cards_content_status_with_http_info(business_id, opts)

```ruby
begin
  # Получение информации о заполненности карточек магазина
  data, status_code, headers = api_instance.get_offer_cards_content_status_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOfferCardsContentStatusResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offer_cards_content_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_offer_cards_content_status_request** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md) |  | [optional] |

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_offer_mapping_entries

> <GetOfferMappingEntriesResponse> get_offer_mapping_entries(campaign_id, opts)

Список товаров в каталоге

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  offer_id: ['inner_example'], # Array<String> | Идентификатор товара в каталоге.
  shop_sku: ['inner_example'], # Array<String> | Ваш SKU товара.  Параметр может быть указан несколько раз, например:  ``` ...shop_sku=123&shop_sku=129&shop_sku=141... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. 
  mapping_kind: OpenapiClient::OfferMappingKindType::ACTIVE, # OfferMappingKindType | Тип маппинга.
  status: [OpenapiClient::OfferProcessingStatusType::UNKNOWN], # Array<OfferProcessingStatusType> | Фильтрация по статусу публикации товара:  * `READY` — товар прошел модерацию. * `IN_WORK` — товар проходит модерацию. * `NEED_CONTENT` — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * `OTHER` — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...status=READY,IN_WORK... ...status=READY&status=IN_WORK... ```  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. 
  availability: [OpenapiClient::OfferAvailabilityStatusType::ACTIVE], # Array<OfferAvailabilityStatusType> | Фильтрация по планам поставок товара:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...availability=INACTIVE,DELISTED... ...availability=INACTIVE&availability=DELISTED... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. 
  category_id: [37], # Array<Integer> | Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...category_id=14727164,14382343... ...category_id=14727164&category_id=14382343... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. 
  vendor: ['inner_example'], # Array<String> | Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...vendor=Aqua%20Minerale,Borjomi... ...vendor=Aqua%20Minerale&vendor=Borjomi... ```  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «'» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. 
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Список товаров в каталоге
  result = api_instance.get_offer_mapping_entries(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offer_mapping_entries: #{e}"
end
```

#### Using the get_offer_mapping_entries_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOfferMappingEntriesResponse>, Integer, Hash)> get_offer_mapping_entries_with_http_info(campaign_id, opts)

```ruby
begin
  # Список товаров в каталоге
  data, status_code, headers = api_instance.get_offer_mapping_entries_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOfferMappingEntriesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offer_mapping_entries_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **offer_id** | [**Array&lt;String&gt;**](String.md) | Идентификатор товара в каталоге. | [optional] |
| **shop_sku** | [**Array&lt;String&gt;**](String.md) | Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] |
| **mapping_kind** | [**OfferMappingKindType**](.md) | Тип маппинга. | [optional] |
| **status** | [**Array&lt;OfferProcessingStatusType&gt;**](OfferProcessingStatusType.md) | Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | [optional] |
| **availability** | [**Array&lt;OfferAvailabilityStatusType&gt;**](OfferAvailabilityStatusType.md) | Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] |
| **category_id** | [**Array&lt;Integer&gt;**](Integer.md) | Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] |
| **vendor** | [**Array&lt;String&gt;**](String.md) | Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | [optional] |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetOfferMappingEntriesResponse**](GetOfferMappingEntriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_offer_mappings

> <GetOfferMappingsResponse> get_offer_mappings(business_id, opts)

Информация о товарах в каталоге

Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_offer_mappings_request: OpenapiClient::GetOfferMappingsRequest.new # GetOfferMappingsRequest | 
}

begin
  # Информация о товарах в каталоге
  result = api_instance.get_offer_mappings(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offer_mappings: #{e}"
end
```

#### Using the get_offer_mappings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOfferMappingsResponse>, Integer, Hash)> get_offer_mappings_with_http_info(business_id, opts)

```ruby
begin
  # Информация о товарах в каталоге
  data, status_code, headers = api_instance.get_offer_mappings_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOfferMappingsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offer_mappings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_offer_mappings_request** | [**GetOfferMappingsRequest**](GetOfferMappingsRequest.md) |  | [optional] |

### Return type

[**GetOfferMappingsResponse**](GetOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_offer_recommendations

> <GetOfferRecommendationsResponse> get_offer_recommendations(business_id, get_offer_recommendations_request, opts)

Рекомендации Маркета, касающиеся цен

Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_offer_recommendations_request = OpenapiClient::GetOfferRecommendationsRequest.new # GetOfferRecommendationsRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Рекомендации Маркета, касающиеся цен
  result = api_instance.get_offer_recommendations(business_id, get_offer_recommendations_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offer_recommendations: #{e}"
end
```

#### Using the get_offer_recommendations_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOfferRecommendationsResponse>, Integer, Hash)> get_offer_recommendations_with_http_info(business_id, get_offer_recommendations_request, opts)

```ruby
begin
  # Рекомендации Маркета, касающиеся цен
  data, status_code, headers = api_instance.get_offer_recommendations_with_http_info(business_id, get_offer_recommendations_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOfferRecommendationsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offer_recommendations_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_offer_recommendations_request** | [**GetOfferRecommendationsRequest**](GetOfferRecommendationsRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetOfferRecommendationsResponse**](GetOfferRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_offers

> <GetOffersResponse> get_offers(campaign_id, opts)

Предложения магазина

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  query: 'query_example', # String | Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете. 
  feed_id: 789, # Integer | Идентификатор прайс-листа.
  shop_category_id: 'shop_category_id_example', # String | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
  currency: OpenapiClient::CurrencyType::RUR, # CurrencyType | Валюта, в которой указана цена предложения.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна. 
  matched: true, # Boolean | Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * `0 / FALSE / NO` — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * `1 / TRUE / YES` — поиск выполняется среди предложений, соотнесенных с карточками моделей). 
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Предложения магазина
  result = api_instance.get_offers(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offers: #{e}"
end
```

#### Using the get_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOffersResponse>, Integer, Hash)> get_offers_with_http_info(campaign_id, opts)

```ruby
begin
  # Предложения магазина
  data, status_code, headers = api_instance.get_offers_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **query** | **String** | Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете.  | [optional] |
| **feed_id** | **Integer** | Идентификатор прайс-листа. | [optional] |
| **shop_category_id** | **String** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой указана цена предложения.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  | [optional] |
| **matched** | **Boolean** | Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * &#x60;0 / FALSE / NO&#x60; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * &#x60;1 / TRUE / YES&#x60; — поиск выполняется среди предложений, соотнесенных с карточками моделей).  | [optional] |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetOffersResponse**](GetOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_order

> <GetOrderResponse> get_order(campaign_id, order_id)

Информация об одном заказе

Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Информация об одном заказе
  result = api_instance.get_order(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order: #{e}"
end
```

#### Using the get_order_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOrderResponse>, Integer, Hash)> get_order_with_http_info(campaign_id, order_id)

```ruby
begin
  # Информация об одном заказе
  data, status_code, headers = api_instance.get_order_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOrderResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_order_business_buyer_info

> <GetBusinessBuyerInfoResponse> get_order_business_buyer_info(campaign_id, order_id)

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Информация о покупателе — юридическом лице
  result = api_instance.get_order_business_buyer_info(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_business_buyer_info: #{e}"
end
```

#### Using the get_order_business_buyer_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessBuyerInfoResponse>, Integer, Hash)> get_order_business_buyer_info_with_http_info(campaign_id, order_id)

```ruby
begin
  # Информация о покупателе — юридическом лице
  data, status_code, headers = api_instance.get_order_business_buyer_info_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessBuyerInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_business_buyer_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetBusinessBuyerInfoResponse**](GetBusinessBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_order_business_documents_info

> <GetBusinessDocumentsInfoResponse> get_order_business_documents_info(campaign_id, order_id)

Информация о документах

Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Информация о документах
  result = api_instance.get_order_business_documents_info(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_business_documents_info: #{e}"
end
```

#### Using the get_order_business_documents_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessDocumentsInfoResponse>, Integer, Hash)> get_order_business_documents_info_with_http_info(campaign_id, order_id)

```ruby
begin
  # Информация о документах
  data, status_code, headers = api_instance.get_order_business_documents_info_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessDocumentsInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_business_documents_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetBusinessDocumentsInfoResponse**](GetBusinessDocumentsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_order_buyer_info

> <GetOrderBuyerInfoResponse> get_order_buyer_info(campaign_id, order_id)

Информация о покупателе — физическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Информация о покупателе — физическом лице
  result = api_instance.get_order_buyer_info(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_buyer_info: #{e}"
end
```

#### Using the get_order_buyer_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOrderBuyerInfoResponse>, Integer, Hash)> get_order_buyer_info_with_http_info(campaign_id, order_id)

```ruby
begin
  # Информация о покупателе — физическом лице
  data, status_code, headers = api_instance.get_order_buyer_info_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOrderBuyerInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_buyer_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetOrderBuyerInfoResponse**](GetOrderBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_order_labels_data

> <GetOrderLabelsDataResponse> get_order_labels_data(campaign_id, order_id)

Данные для самостоятельного изготовления ярлыков

Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Данные для самостоятельного изготовления ярлыков
  result = api_instance.get_order_labels_data(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_labels_data: #{e}"
end
```

#### Using the get_order_labels_data_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOrderLabelsDataResponse>, Integer, Hash)> get_order_labels_data_with_http_info(campaign_id, order_id)

```ruby
begin
  # Данные для самостоятельного изготовления ярлыков
  data, status_code, headers = api_instance.get_order_labels_data_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOrderLabelsDataResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_order_labels_data_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetOrderLabelsDataResponse**](GetOrderLabelsDataResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_orders

> <GetOrdersResponse> get_orders(campaign_id, opts)

Информация о нескольких заказах

Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры `page_token` и `limit`.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  order_ids: [3.56], # Array<Integer> | Фильтрация заказов по идентификаторам. <br><br> ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым. 
  status: [OpenapiClient::OrderStatusType::PLACING], # Array<OrderStatusType> | Статус заказа:  * `CANCELLED` — заказ отменен.  * `DELIVERED` — заказ получен покупателем.  * `DELIVERY` — заказ передан в службу доставки.  * `PICKUP` — заказ доставлен в пункт самовывоза.  * `PROCESSING` — заказ находится в обработке.  * `UNPAID` — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
  substatus: [OpenapiClient::OrderSubstatusType::RESERVATION_EXPIRED], # Array<OrderSubstatusType> | Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  Возможные значения для заказа в статусе `PROCESSING`:  * `STARTED` — заказ подтвержден, его можно начать обрабатывать. * `READY_TO_SHIP` — заказ собран и готов к отправке. * `SHIPPED` — заказ передан службе доставки.  Возможные значения для заказа в статусе `CANCELLED`:  * `DELIVERY_SERVICE_UNDELIVERED` — служба доставки не смогла доставить заказ.  * `PROCESSING_EXPIRED` — значение более не используется.  * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.  * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * `RESERVATION_FAILED` — Маркет не может продолжить дальнейшую обработку заказа.  * `SHOP_FAILED` — магазин не может выполнить заказ.  * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.  * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.  * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.  * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.  * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.  * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * `USER_WANTS_TO_CHANGE_DELIVERY_DATE` — покупатель хочет получить заказ в другой день. * `CANCELLED_COURIER_NOT_FOUND` — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
  from_date: Date.parse('2013-10-20'), # Date | Начальная дата для фильтрации заказов по дате оформления.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `toDate`) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты. 
  to_date: Date.parse('2013-10-20'), # Date | Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `fromDate`) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата. 
  supplier_shipment_date_from: Date.parse('2013-10-20'), # Date | Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `supplierShipmentDateTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. 
  supplier_shipment_date_to: Date.parse('2013-10-20'), # Date | Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `supplierShipmentDateFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. 
  updated_at_from: Time.parse('2013-10-20T19:20:30+01:00'), # Time | Начальная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной и конечной датой (параметр `updatedAtTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. 
  updated_at_to: Time.parse('2013-10-20T19:20:30+01:00'), # Time | Конечная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной (параметр `updatedAtFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. 
  dispatch_type: OpenapiClient::OrderDeliveryDispatchType::UNKNOWN, # OrderDeliveryDispatchType | Способ отгрузки
  fake: true, # Boolean | Фильтрация заказов по типам:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  has_cis: true, # Boolean | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да.  * `false` — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
  only_waiting_for_cancellation_approve: true, # Boolean | **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение `true` возвращаются только заказы, которые находятся в статусе `DELIVERY` или `PICKUP` и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation). 
  only_estimated_delivery: true, # Boolean | Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * `true` — возвращаются только заказы с неподтвержденной датой доставки. * `false` — фильтрация не применяется. 
  buyer_type: OpenapiClient::OrderBuyerType::PERSON, # OrderBuyerType | Фильтрация заказов по типу покупателя. 
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56, # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Информация о нескольких заказах
  result = api_instance.get_orders(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_orders: #{e}"
end
```

#### Using the get_orders_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOrdersResponse>, Integer, Hash)> get_orders_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация о нескольких заказах
  data, status_code, headers = api_instance.get_orders_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOrdersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_orders_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_ids** | [**Array&lt;Integer&gt;**](Integer.md) | Фильтрация заказов по идентификаторам. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым.  | [optional] |
| **status** | [**Array&lt;OrderStatusType&gt;**](OrderStatusType.md) | Статус заказа:  * &#x60;CANCELLED&#x60; — заказ отменен.  * &#x60;DELIVERED&#x60; — заказ получен покупателем.  * &#x60;DELIVERY&#x60; — заказ передан в службу доставки.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — заказ находится в обработке.  * &#x60;UNPAID&#x60; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | [optional] |
| **substatus** | [**Array&lt;OrderSubstatusType&gt;**](OrderSubstatusType.md) | Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  Возможные значения для заказа в статусе &#x60;PROCESSING&#x60;:  * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать. * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке. * &#x60;SHIPPED&#x60; — заказ передан службе доставки.  Возможные значения для заказа в статусе &#x60;CANCELLED&#x60;:  * &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60; — служба доставки не смогла доставить заказ.  * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.  * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.  * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * &#x60;RESERVATION_FAILED&#x60; — Маркет не может продолжить дальнейшую обработку заказа.  * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.  * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.  * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.  * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.  * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.  * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.  * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * &#x60;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#x60; — покупатель хочет получить заказ в другой день. * &#x60;CANCELLED_COURIER_NOT_FOUND&#x60; — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | [optional] |
| **from_date** | **Date** | Начальная дата для фильтрации заказов по дате оформления.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;toDate&#x60;) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты.  | [optional] |
| **to_date** | **Date** | Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;fromDate&#x60;) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата.  | [optional] |
| **supplier_shipment_date_from** | **Date** | Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;supplierShipmentDateTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | [optional] |
| **supplier_shipment_date_to** | **Date** | Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;supplierShipmentDateFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | [optional] |
| **updated_at_from** | **Time** | Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной и конечной датой (параметр &#x60;updatedAtTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | [optional] |
| **updated_at_to** | **Time** | Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной (параметр &#x60;updatedAtFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | [optional] |
| **dispatch_type** | [**OrderDeliveryDispatchType**](.md) | Способ отгрузки | [optional] |
| **fake** | **Boolean** | Фильтрация заказов по типам:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional][default to false] |
| **has_cis** | **Boolean** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да.  * &#x60;false&#x60; — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional][default to false] |
| **only_waiting_for_cancellation_approve** | **Boolean** | **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение &#x60;true&#x60; возвращаются только заказы, которые находятся в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60; и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation).  | [optional][default to false] |
| **only_estimated_delivery** | **Boolean** | Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * &#x60;true&#x60; — возвращаются только заказы с неподтвержденной датой доставки. * &#x60;false&#x60; — фильтрация не применяется.  | [optional][default to false] |
| **buyer_type** | [**OrderBuyerType**](.md) | Фильтрация заказов по типу покупателя.  | [optional] |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetOrdersResponse**](GetOrdersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_orders_stats

> <GetOrdersStatsResponse> get_orders_stats(campaign_id, opts)

Детальная информация по заказам

Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_orders_stats_request: OpenapiClient::GetOrdersStatsRequest.new # GetOrdersStatsRequest | 
}

begin
  # Детальная информация по заказам
  result = api_instance.get_orders_stats(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_orders_stats: #{e}"
end
```

#### Using the get_orders_stats_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOrdersStatsResponse>, Integer, Hash)> get_orders_stats_with_http_info(campaign_id, opts)

```ruby
begin
  # Детальная информация по заказам
  data, status_code, headers = api_instance.get_orders_stats_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOrdersStatsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_orders_stats_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_orders_stats_request** | [**GetOrdersStatsRequest**](GetOrdersStatsRequest.md) |  | [optional] |

### Return type

[**GetOrdersStatsResponse**](GetOrdersStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_outlet

> <GetOutletResponse> get_outlet(campaign_id, outlet_id)

Информация об одной точке продаж

Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
outlet_id = 789 # Integer | Идентификатор точки продаж.

begin
  # Информация об одной точке продаж
  result = api_instance.get_outlet(campaign_id, outlet_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_outlet: #{e}"
end
```

#### Using the get_outlet_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOutletResponse>, Integer, Hash)> get_outlet_with_http_info(campaign_id, outlet_id)

```ruby
begin
  # Информация об одной точке продаж
  data, status_code, headers = api_instance.get_outlet_with_http_info(campaign_id, outlet_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOutletResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_outlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **outlet_id** | **Integer** | Идентификатор точки продаж. |  |

### Return type

[**GetOutletResponse**](GetOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_outlet_licenses

> <GetOutletLicensesResponse> get_outlet_licenses(campaign_id, opts)

Информация о лицензиях для точек продаж

Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  outlet_ids: [3.56], # Array<Integer> | Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр `outletIds`, либо параметр `ids`. Запрос с обоими параметрами или без них приведет к ошибке. 
  ids: [3.56] # Array<Integer> | Список идентификаторов лицензий.
}

begin
  # Информация о лицензиях для точек продаж
  result = api_instance.get_outlet_licenses(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_outlet_licenses: #{e}"
end
```

#### Using the get_outlet_licenses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOutletLicensesResponse>, Integer, Hash)> get_outlet_licenses_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация о лицензиях для точек продаж
  data, status_code, headers = api_instance.get_outlet_licenses_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOutletLicensesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_outlet_licenses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **outlet_ids** | [**Array&lt;Integer&gt;**](Integer.md) | Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр &#x60;outletIds&#x60;, либо параметр &#x60;ids&#x60;. Запрос с обоими параметрами или без них приведет к ошибке.  | [optional] |
| **ids** | [**Array&lt;Integer&gt;**](Integer.md) | Список идентификаторов лицензий. | [optional] |

### Return type

[**GetOutletLicensesResponse**](GetOutletLicensesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_outlets

> <GetOutletsResponse> get_outlets(campaign_id, opts)

Информация о нескольких точках продаж

Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  region_id: 789, # Integer | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). 
  shop_outlet_code: 'shop_outlet_code_example', # String | Идентификатор точки продаж, присвоенный магазином.
  region_id2: 789 # Integer | {% note warning \"\" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %} 
}

begin
  # Информация о нескольких точках продаж
  result = api_instance.get_outlets(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_outlets: #{e}"
end
```

#### Using the get_outlets_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOutletsResponse>, Integer, Hash)> get_outlets_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация о нескольких точках продаж
  data, status_code, headers = api_instance.get_outlets_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOutletsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_outlets_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **region_id** | **Integer** | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  | [optional] |
| **shop_outlet_code** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] |
| **region_id2** | **Integer** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %}  | [optional] |

### Return type

[**GetOutletsResponse**](GetOutletsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_prices

> <GetPricesResponse> get_prices(campaign_id, opts)

Список цен

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  archived: true # Boolean | Фильтр по нахождению в архиве.
}

begin
  # Список цен
  result = api_instance.get_prices(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_prices: #{e}"
end
```

#### Using the get_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetPricesResponse>, Integer, Hash)> get_prices_with_http_info(campaign_id, opts)

```ruby
begin
  # Список цен
  data, status_code, headers = api_instance.get_prices_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetPricesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **archived** | **Boolean** | Фильтр по нахождению в архиве. | [optional][default to false] |

### Return type

[**GetPricesResponse**](GetPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_prices_by_offer_ids

> <GetPricesByOfferIdsResponse> get_prices_by_offer_ids(campaign_id, opts)

Просмотр цен на указанные товары в магазине

Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_prices_by_offer_ids_request: OpenapiClient::GetPricesByOfferIdsRequest.new # GetPricesByOfferIdsRequest | 
}

begin
  # Просмотр цен на указанные товары в магазине
  result = api_instance.get_prices_by_offer_ids(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_prices_by_offer_ids: #{e}"
end
```

#### Using the get_prices_by_offer_ids_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetPricesByOfferIdsResponse>, Integer, Hash)> get_prices_by_offer_ids_with_http_info(campaign_id, opts)

```ruby
begin
  # Просмотр цен на указанные товары в магазине
  data, status_code, headers = api_instance.get_prices_by_offer_ids_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetPricesByOfferIdsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_prices_by_offer_ids_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_prices_by_offer_ids_request** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md) |  | [optional] |

### Return type

[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_promo_offers

> <GetPromoOffersResponse> get_promo_offers(business_id, get_promo_offers_request, opts)

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_promo_offers_request = OpenapiClient::GetPromoOffersRequest.new({promo_id: 'promo_id_example'}) # GetPromoOffersRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение списка товаров, которые участвуют или могут участвовать в акции
  result = api_instance.get_promo_offers(business_id, get_promo_offers_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_promo_offers: #{e}"
end
```

#### Using the get_promo_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetPromoOffersResponse>, Integer, Hash)> get_promo_offers_with_http_info(business_id, get_promo_offers_request, opts)

```ruby
begin
  # Получение списка товаров, которые участвуют или могут участвовать в акции
  data, status_code, headers = api_instance.get_promo_offers_with_http_info(business_id, get_promo_offers_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetPromoOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_promo_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_promo_offers_request** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_promos

> <GetPromosResponse> get_promos(business_id, opts)

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  get_promos_request: OpenapiClient::GetPromosRequest.new # GetPromosRequest | 
}

begin
  # Получение списка акций
  result = api_instance.get_promos(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_promos: #{e}"
end
```

#### Using the get_promos_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetPromosResponse>, Integer, Hash)> get_promos_with_http_info(business_id, opts)

```ruby
begin
  # Получение списка акций
  data, status_code, headers = api_instance.get_promos_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetPromosResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_promos_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_promos_request** | [**GetPromosRequest**](GetPromosRequest.md) |  | [optional] |

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_quality_rating_details

> <GetQualityRatingDetailsResponse> get_quality_rating_details(campaign_id)

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Заказы, которые повлияли на индекс качества
  result = api_instance.get_quality_rating_details(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_quality_rating_details: #{e}"
end
```

#### Using the get_quality_rating_details_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetQualityRatingDetailsResponse>, Integer, Hash)> get_quality_rating_details_with_http_info(campaign_id)

```ruby
begin
  # Заказы, которые повлияли на индекс качества
  data, status_code, headers = api_instance.get_quality_rating_details_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetQualityRatingDetailsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_quality_rating_details_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetQualityRatingDetailsResponse**](GetQualityRatingDetailsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_quality_ratings

> <GetQualityRatingResponse> get_quality_ratings(business_id, get_quality_rating_request)

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_quality_rating_request = OpenapiClient::GetQualityRatingRequest.new({campaign_ids: [3.56]}) # GetQualityRatingRequest | 

begin
  # Индекс качества магазинов
  result = api_instance.get_quality_ratings(business_id, get_quality_rating_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_quality_ratings: #{e}"
end
```

#### Using the get_quality_ratings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetQualityRatingResponse>, Integer, Hash)> get_quality_ratings_with_http_info(business_id, get_quality_rating_request)

```ruby
begin
  # Индекс качества магазинов
  data, status_code, headers = api_instance.get_quality_ratings_with_http_info(business_id, get_quality_rating_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetQualityRatingResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_quality_ratings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_quality_rating_request** | [**GetQualityRatingRequest**](GetQualityRatingRequest.md) |  |  |

### Return type

[**GetQualityRatingResponse**](GetQualityRatingResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_report_info

> <GetReportInfoResponse> get_report_info(report_id)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
report_id = 'report_id_example' # String | Идентификатор отчета, который вы получили после запуска генерации. 

begin
  # Получение заданного отчета
  result = api_instance.get_report_info(report_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_report_info: #{e}"
end
```

#### Using the get_report_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetReportInfoResponse>, Integer, Hash)> get_report_info_with_http_info(report_id)

```ruby
begin
  # Получение заданного отчета
  data, status_code, headers = api_instance.get_report_info_with_http_info(report_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetReportInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_report_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_id** | **String** | Идентификатор отчета, который вы получили после запуска генерации.  |  |

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_return

> <GetReturnResponse> get_return(campaign_id, order_id, return_id)

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.

begin
  # Информация о невыкупе или возврате
  result = api_instance.get_return(campaign_id, order_id, return_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_return: #{e}"
end
```

#### Using the get_return_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetReturnResponse>, Integer, Hash)> get_return_with_http_info(campaign_id, order_id, return_id)

```ruby
begin
  # Информация о невыкупе или возврате
  data, status_code, headers = api_instance.get_return_with_http_info(campaign_id, order_id, return_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetReturnResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_return_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |

### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_return_application

> File get_return_application(campaign_id, order_id, return_id)

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.

begin
  # Получение заявления на возврат
  result = api_instance.get_return_application(campaign_id, order_id, return_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_return_application: #{e}"
end
```

#### Using the get_return_application_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> get_return_application_with_http_info(campaign_id, order_id, return_id)

```ruby
begin
  # Получение заявления на возврат
  data, status_code, headers = api_instance.get_return_application_with_http_info(campaign_id, order_id, return_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_return_application_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


## get_return_photo

> File get_return_photo(campaign_id, order_id, return_id, item_id, image_hash)

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.
item_id = 789 # Integer | Идентификатор товара в возврате.
image_hash = 'image_hash_example' # String | Хеш ссылки изображения для загрузки.

begin
  # Получение фотографии возврата
  result = api_instance.get_return_photo(campaign_id, order_id, return_id, item_id, image_hash)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_return_photo: #{e}"
end
```

#### Using the get_return_photo_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> get_return_photo_with_http_info(campaign_id, order_id, return_id, item_id, image_hash)

```ruby
begin
  # Получение фотографии возврата
  data, status_code, headers = api_instance.get_return_photo_with_http_info(campaign_id, order_id, return_id, item_id, image_hash)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_return_photo_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |
| **item_id** | **Integer** | Идентификатор товара в возврате. |  |
| **image_hash** | **String** | Хеш ссылки изображения для загрузки. |  |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


## get_returns

> <GetReturnsResponse> get_returns(campaign_id, opts)

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  order_ids: [123543], # Array<Integer> | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
  statuses: [OpenapiClient::RefundStatusType::STARTED_BY_USER], # Array<RefundStatusType> | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
  type: OpenapiClient::ReturnType::UNREDEEMED, # ReturnType | Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
  from_date: Date.parse('2022-10-31'), # Date | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  to_date: Date.parse('2022-11-30'), # Date | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  from_date2: Date.parse('2022-10-31'), # Date | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
  to_date2: Date.parse('2022-11-30') # Date | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
}

begin
  # Список невыкупов и возвратов
  result = api_instance.get_returns(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_returns: #{e}"
end
```

#### Using the get_returns_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetReturnsResponse>, Integer, Hash)> get_returns_with_http_info(campaign_id, opts)

```ruby
begin
  # Список невыкупов и возвратов
  data, status_code, headers = api_instance.get_returns_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetReturnsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_returns_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **order_ids** | [**Array&lt;Integer&gt;**](Integer.md) | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional] |
| **statuses** | [**Array&lt;RefundStatusType&gt;**](RefundStatusType.md) | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional] |
| **type** | [**ReturnType**](.md) | Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional] |
| **from_date** | **Date** | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **to_date** | **Date** | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **from_date2** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] |
| **to_date2** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] |

### Return type

[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_stocks

> <GetWarehouseStocksResponse> get_stocks(campaign_id, opts)

Информация об остатках и оборачиваемости

Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \"По умолчанию данные по оборачивамости не возращаются\" %}  Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_warehouse_stocks_request: OpenapiClient::GetWarehouseStocksRequest.new # GetWarehouseStocksRequest | 
}

begin
  # Информация об остатках и оборачиваемости
  result = api_instance.get_stocks(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_stocks: #{e}"
end
```

#### Using the get_stocks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetWarehouseStocksResponse>, Integer, Hash)> get_stocks_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация об остатках и оборачиваемости
  data, status_code, headers = api_instance.get_stocks_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetWarehouseStocksResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_stocks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_warehouse_stocks_request** | [**GetWarehouseStocksRequest**](GetWarehouseStocksRequest.md) |  | [optional] |

### Return type

[**GetWarehouseStocksResponse**](GetWarehouseStocksResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_suggested_offer_mapping_entries

> <GetSuggestedOfferMappingEntriesResponse> get_suggested_offer_mapping_entries(campaign_id, get_suggested_offer_mapping_entries_request)

Рекомендованные карточки для товаров

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_suggested_offer_mapping_entries_request = OpenapiClient::GetSuggestedOfferMappingEntriesRequest.new({offers: [OpenapiClient::MappingsOfferDTO.new]}) # GetSuggestedOfferMappingEntriesRequest | 

begin
  # Рекомендованные карточки для товаров
  result = api_instance.get_suggested_offer_mapping_entries(campaign_id, get_suggested_offer_mapping_entries_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_suggested_offer_mapping_entries: #{e}"
end
```

#### Using the get_suggested_offer_mapping_entries_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetSuggestedOfferMappingEntriesResponse>, Integer, Hash)> get_suggested_offer_mapping_entries_with_http_info(campaign_id, get_suggested_offer_mapping_entries_request)

```ruby
begin
  # Рекомендованные карточки для товаров
  data, status_code, headers = api_instance.get_suggested_offer_mapping_entries_with_http_info(campaign_id, get_suggested_offer_mapping_entries_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetSuggestedOfferMappingEntriesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_suggested_offer_mapping_entries_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_suggested_offer_mapping_entries_request** | [**GetSuggestedOfferMappingEntriesRequest**](GetSuggestedOfferMappingEntriesRequest.md) |  |  |

### Return type

[**GetSuggestedOfferMappingEntriesResponse**](GetSuggestedOfferMappingEntriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_suggested_offer_mappings

> <GetSuggestedOfferMappingsResponse> get_suggested_offer_mappings(business_id, opts)

Просмотр карточек на Маркете, которые подходят вашим товарам

Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  get_suggested_offer_mappings_request: OpenapiClient::GetSuggestedOfferMappingsRequest.new # GetSuggestedOfferMappingsRequest | 
}

begin
  # Просмотр карточек на Маркете, которые подходят вашим товарам
  result = api_instance.get_suggested_offer_mappings(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_suggested_offer_mappings: #{e}"
end
```

#### Using the get_suggested_offer_mappings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetSuggestedOfferMappingsResponse>, Integer, Hash)> get_suggested_offer_mappings_with_http_info(business_id, opts)

```ruby
begin
  # Просмотр карточек на Маркете, которые подходят вашим товарам
  data, status_code, headers = api_instance.get_suggested_offer_mappings_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetSuggestedOfferMappingsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_suggested_offer_mappings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_suggested_offer_mappings_request** | [**GetSuggestedOfferMappingsRequest**](GetSuggestedOfferMappingsRequest.md) |  | [optional] |

### Return type

[**GetSuggestedOfferMappingsResponse**](GetSuggestedOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_suggested_prices

> <SuggestPricesResponse> get_suggested_prices(campaign_id, suggest_prices_request)

Цены для продвижения товаров

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
suggest_prices_request = OpenapiClient::SuggestPricesRequest.new({offers: [OpenapiClient::SuggestOfferPriceDTO.new]}) # SuggestPricesRequest | 

begin
  # Цены для продвижения товаров
  result = api_instance.get_suggested_prices(campaign_id, suggest_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_suggested_prices: #{e}"
end
```

#### Using the get_suggested_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SuggestPricesResponse>, Integer, Hash)> get_suggested_prices_with_http_info(campaign_id, suggest_prices_request)

```ruby
begin
  # Цены для продвижения товаров
  data, status_code, headers = api_instance.get_suggested_prices_with_http_info(campaign_id, suggest_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SuggestPricesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_suggested_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **suggest_prices_request** | [**SuggestPricesRequest**](SuggestPricesRequest.md) |  |  |

### Return type

[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_warehouses

> <GetWarehousesResponse> get_warehouses(business_id)

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Список складов и групп складов
  result = api_instance.get_warehouses(business_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_warehouses: #{e}"
end
```

#### Using the get_warehouses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetWarehousesResponse>, Integer, Hash)> get_warehouses_with_http_info(business_id)

```ruby
begin
  # Список складов и групп складов
  data, status_code, headers = api_instance.get_warehouses_with_http_info(business_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetWarehousesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->get_warehouses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## provide_order_digital_codes

> <EmptyApiResponse> provide_order_digital_codes(campaign_id, order_id, provide_order_digital_codes_request)

Передача ключей цифровых товаров

Передает ключи цифровых товаров, которые покупатель заказал и оплатил. После выполнения запроса Маркет отправит ему письмо с ключами и инструкциями по активации, а также переведет заказ в финальный статус `DELIVERED`.  Ключ нужно передать в течение 30 минут после перехода заказа в статус `PROCESSING`.  Если в один заказ входят несколько ключей, передавайте их все в одном запросе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
provide_order_digital_codes_request = OpenapiClient::ProvideOrderDigitalCodesRequest.new({items: [OpenapiClient::OrderDigitalItemDTO.new({id: 3.56, code: 'code_example', slip: 'slip_example', activate_till: Date.today})]}) # ProvideOrderDigitalCodesRequest | 

begin
  # Передача ключей цифровых товаров
  result = api_instance.provide_order_digital_codes(campaign_id, order_id, provide_order_digital_codes_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->provide_order_digital_codes: #{e}"
end
```

#### Using the provide_order_digital_codes_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> provide_order_digital_codes_with_http_info(campaign_id, order_id, provide_order_digital_codes_request)

```ruby
begin
  # Передача ключей цифровых товаров
  data, status_code, headers = api_instance.provide_order_digital_codes_with_http_info(campaign_id, order_id, provide_order_digital_codes_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->provide_order_digital_codes_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **provide_order_digital_codes_request** | [**ProvideOrderDigitalCodesRequest**](ProvideOrderDigitalCodesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## provide_order_item_identifiers

> <ProvideOrderItemIdentifiersResponse> provide_order_item_identifiers(campaign_id, order_id, provide_order_item_identifiers_request)

Передача кодов маркировки единиц товара

{% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Передает Маркету коды маркировки для единиц товара в указанном заказе.  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  {% note warning %}  Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).  {% endnote %}  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
provide_order_item_identifiers_request = OpenapiClient::ProvideOrderItemIdentifiersRequest.new({items: [OpenapiClient::OrderItemInstanceModificationDTO.new({id: 3.56, instances: [OpenapiClient::BriefOrderItemInstanceDTO.new]})]}) # ProvideOrderItemIdentifiersRequest | 

begin
  # Передача кодов маркировки единиц товара
  result = api_instance.provide_order_item_identifiers(campaign_id, order_id, provide_order_item_identifiers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->provide_order_item_identifiers: #{e}"
end
```

#### Using the provide_order_item_identifiers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProvideOrderItemIdentifiersResponse>, Integer, Hash)> provide_order_item_identifiers_with_http_info(campaign_id, order_id, provide_order_item_identifiers_request)

```ruby
begin
  # Передача кодов маркировки единиц товара
  data, status_code, headers = api_instance.provide_order_item_identifiers_with_http_info(campaign_id, order_id, provide_order_item_identifiers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProvideOrderItemIdentifiersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->provide_order_item_identifiers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **provide_order_item_identifiers_request** | [**ProvideOrderItemIdentifiersRequest**](ProvideOrderItemIdentifiersRequest.md) |  |  |

### Return type

[**ProvideOrderItemIdentifiersResponse**](ProvideOrderItemIdentifiersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## put_bids_for_business

> <EmptyApiResponse> put_bids_for_business(business_id, put_sku_bids_request)

Включение буста продаж и установка ставок

Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \"Как в кабинете выглядит кампания, созданная через API\" %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
put_sku_bids_request = OpenapiClient::PutSkuBidsRequest.new({bids: [OpenapiClient::SkuBidItemDTO.new({sku: 'sku_example', bid: 570})]}) # PutSkuBidsRequest | description

begin
  # Включение буста продаж и установка ставок
  result = api_instance.put_bids_for_business(business_id, put_sku_bids_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->put_bids_for_business: #{e}"
end
```

#### Using the put_bids_for_business_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> put_bids_for_business_with_http_info(business_id, put_sku_bids_request)

```ruby
begin
  # Включение буста продаж и установка ставок
  data, status_code, headers = api_instance.put_bids_for_business_with_http_info(business_id, put_sku_bids_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->put_bids_for_business_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **put_sku_bids_request** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md) | description |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## put_bids_for_campaign

> <EmptyApiResponse> put_bids_for_campaign(campaign_id, put_sku_bids_request)

Включение буста продаж и установка ставок для магазина

Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
put_sku_bids_request = OpenapiClient::PutSkuBidsRequest.new({bids: [OpenapiClient::SkuBidItemDTO.new({sku: 'sku_example', bid: 570})]}) # PutSkuBidsRequest | description

begin
  # Включение буста продаж и установка ставок для магазина
  result = api_instance.put_bids_for_campaign(campaign_id, put_sku_bids_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->put_bids_for_campaign: #{e}"
end
```

#### Using the put_bids_for_campaign_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> put_bids_for_campaign_with_http_info(campaign_id, put_sku_bids_request)

```ruby
begin
  # Включение буста продаж и установка ставок для магазина
  data, status_code, headers = api_instance.put_bids_for_campaign_with_http_info(campaign_id, put_sku_bids_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->put_bids_for_campaign_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **put_sku_bids_request** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md) | description |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## refresh_feed

> <EmptyApiResponse> refresh_feed(campaign_id, feed_id)

Сообщить, что прайс-лист обновился

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
feed_id = 789 # Integer | Идентификатор прайс-листа.

begin
  # Сообщить, что прайс-лист обновился
  result = api_instance.refresh_feed(campaign_id, feed_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->refresh_feed: #{e}"
end
```

#### Using the refresh_feed_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> refresh_feed_with_http_info(campaign_id, feed_id)

```ruby
begin
  # Сообщить, что прайс-лист обновился
  data, status_code, headers = api_instance.refresh_feed_with_http_info(campaign_id, feed_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->refresh_feed_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_models

> <SearchModelsResponse> search_models(query, region_id, opts)

Поиск модели товара

Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
query = 'query_example' # String | Поисковый запрос по названию модели товара.
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
opts = {
  currency: OpenapiClient::CurrencyType::RUR, # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Поиск модели товара
  result = api_instance.search_models(query, region_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->search_models: #{e}"
end
```

#### Using the search_models_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SearchModelsResponse>, Integer, Hash)> search_models_with_http_info(query, region_id, opts)

```ruby
begin
  # Поиск модели товара
  data, status_code, headers = api_instance.search_models_with_http_info(query, region_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SearchModelsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->search_models_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **query** | **String** | Поисковый запрос по названию модели товара. |  |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**SearchModelsResponse**](SearchModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_region_children

> <GetRegionWithChildrenResponse> search_region_children(region_id, opts)

Информация о дочерних регионах

Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
opts = {
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Информация о дочерних регионах
  result = api_instance.search_region_children(region_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->search_region_children: #{e}"
end
```

#### Using the search_region_children_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetRegionWithChildrenResponse>, Integer, Hash)> search_region_children_with_http_info(region_id, opts)

```ruby
begin
  # Информация о дочерних регионах
  data, status_code, headers = api_instance.search_region_children_with_http_info(region_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetRegionWithChildrenResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->search_region_children_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetRegionWithChildrenResponse**](GetRegionWithChildrenResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_regions_by_id

> <GetRegionsResponse> search_regions_by_id(region_id)

Информация о регионе

Возвращает информацию о регионе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 

begin
  # Информация о регионе
  result = api_instance.search_regions_by_id(region_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->search_regions_by_id: #{e}"
end
```

#### Using the search_regions_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetRegionsResponse>, Integer, Hash)> search_regions_by_id_with_http_info(region_id)

```ruby
begin
  # Информация о регионе
  data, status_code, headers = api_instance.search_regions_by_id_with_http_info(region_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetRegionsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->search_regions_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_regions_by_name

> <GetRegionsResponse> search_regions_by_name(name, opts)

Поиск регионов по их имени

Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
name = 'name_example' # String | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Поиск регионов по их имени
  result = api_instance.search_regions_by_name(name, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->search_regions_by_name: #{e}"
end
```

#### Using the search_regions_by_name_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetRegionsResponse>, Integer, Hash)> search_regions_by_name_with_http_info(name, opts)

```ruby
begin
  # Поиск регионов по их имени
  data, status_code, headers = api_instance.search_regions_by_name_with_http_info(name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetRegionsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->search_regions_by_name_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## send_file_to_chat

> <EmptyApiResponse> send_file_to_chat(business_id, chat_id, file)

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
chat_id = 789 # Integer | Идентификатор чата.
file = File.new('/path/to/some/file') # File | Содержимое файла. Максимальный размер файла — 5 Мбайт.

begin
  # Отправка файла в чат
  result = api_instance.send_file_to_chat(business_id, chat_id, file)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->send_file_to_chat: #{e}"
end
```

#### Using the send_file_to_chat_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> send_file_to_chat_with_http_info(business_id, chat_id, file)

```ruby
begin
  # Отправка файла в чат
  data, status_code, headers = api_instance.send_file_to_chat_with_http_info(business_id, chat_id, file)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->send_file_to_chat_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **chat_id** | **Integer** | Идентификатор чата. |  |
| **file** | **File** | Содержимое файла. Максимальный размер файла — 5 Мбайт. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## send_message_to_chat

> <EmptyApiResponse> send_message_to_chat(business_id, chat_id, send_message_to_chat_request)

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
chat_id = 789 # Integer | Идентификатор чата.
send_message_to_chat_request = OpenapiClient::SendMessageToChatRequest.new({message: 'message_example'}) # SendMessageToChatRequest | description

begin
  # Отправка сообщения в чат
  result = api_instance.send_message_to_chat(business_id, chat_id, send_message_to_chat_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->send_message_to_chat: #{e}"
end
```

#### Using the send_message_to_chat_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> send_message_to_chat_with_http_info(business_id, chat_id, send_message_to_chat_request)

```ruby
begin
  # Отправка сообщения в чат
  data, status_code, headers = api_instance.send_message_to_chat_with_http_info(business_id, chat_id, send_message_to_chat_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->send_message_to_chat_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **chat_id** | **Integer** | Идентификатор чата. |  |
| **send_message_to_chat_request** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md) | description |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## set_feed_params

> <EmptyApiResponse> set_feed_params(campaign_id, feed_id, set_feed_params_request)

Изменение параметров прайс-листа

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
feed_id = 789 # Integer | Идентификатор прайс-листа.
set_feed_params_request = OpenapiClient::SetFeedParamsRequest.new({parameters: [OpenapiClient::FeedParameterDTO.new({name: 'name_example'})]}) # SetFeedParamsRequest | 

begin
  # Изменение параметров прайс-листа
  result = api_instance.set_feed_params(campaign_id, feed_id, set_feed_params_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_feed_params: #{e}"
end
```

#### Using the set_feed_params_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_feed_params_with_http_info(campaign_id, feed_id, set_feed_params_request)

```ruby
begin
  # Изменение параметров прайс-листа
  data, status_code, headers = api_instance.set_feed_params_with_http_info(campaign_id, feed_id, set_feed_params_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_feed_params_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. |  |
| **set_feed_params_request** | [**SetFeedParamsRequest**](SetFeedParamsRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## set_order_box_layout

> <SetOrderBoxLayoutResponse> set_order_box_layout(campaign_id, order_id, set_order_box_layout_request)

Подготовка заказа

{% note tip \"Подходит и для DBS\" %}  Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.  {% endnote %}  Позволяет выполнить три операции:  * передать Маркету информацию о распределении товаров по коробкам; * передать Маркету коды маркировки для товаров; * удалить товар из заказа, если его не оказалось на складе.  Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.  ## Как передать информацию о распределении товаров  В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:  * **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.  * **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.  ⚠️ Одна коробка не может содержать и товары целиком, и части товаров.  ## Как передавать коды маркировки  Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.  ## Как удалить товар из заказа  Чтобы удалить товар из заказа:  1. Добавьте в запрос `allowRemove: true`. 2. Передайте распределение по коробкам без товара, который нужно удалить.  {% note warning \"Удаление нельзя отменить\" %}  Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.  {% endnote %}  Чтобы удалить позицию целиком, не передавайте соответствующий `OrderBoxLayoutItemDTO`. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле `fullCount`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  ## Примеры  {% cut \"Товар умещается в коробку\" %}  Вот как будет выглядеть запрос, если в одной коробке едут:    * три единицы одного товара, требующего маркировки;   * одна единица другого товара, не требущего маркировки.    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"fullCount\": 3,                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           },                           {                               \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"                           },                           {                               \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"                           }                       ]                   },                   {                       \"id\": 654321,                       \"fullCount\": 1                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Товар едет в разных коробках\" %}  Вот как будет выглядеть запрос, если товар едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}  Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
set_order_box_layout_request = OpenapiClient::SetOrderBoxLayoutRequest.new({boxes: [OpenapiClient::OrderBoxLayoutDTO.new({items: [OpenapiClient::OrderBoxLayoutItemDTO.new({id: 3.56})]})]}) # SetOrderBoxLayoutRequest | 

begin
  # Подготовка заказа
  result = api_instance.set_order_box_layout(campaign_id, order_id, set_order_box_layout_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_order_box_layout: #{e}"
end
```

#### Using the set_order_box_layout_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SetOrderBoxLayoutResponse>, Integer, Hash)> set_order_box_layout_with_http_info(campaign_id, order_id, set_order_box_layout_request)

```ruby
begin
  # Подготовка заказа
  data, status_code, headers = api_instance.set_order_box_layout_with_http_info(campaign_id, order_id, set_order_box_layout_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SetOrderBoxLayoutResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_order_box_layout_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **set_order_box_layout_request** | [**SetOrderBoxLayoutRequest**](SetOrderBoxLayoutRequest.md) |  |  |

### Return type

[**SetOrderBoxLayoutResponse**](SetOrderBoxLayoutResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## set_order_delivery_date

> <EmptyApiResponse> set_order_delivery_date(campaign_id, order_id, set_order_delivery_date_request)

Изменение даты доставки заказа

Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
set_order_delivery_date_request = OpenapiClient::SetOrderDeliveryDateRequest.new({dates: OpenapiClient::OrderDeliveryDateDTO.new({to_date: Date.today}), reason: OpenapiClient::OrderDeliveryDateReasonType::USER_MOVED_DELIVERY_DATES}) # SetOrderDeliveryDateRequest | 

begin
  # Изменение даты доставки заказа
  result = api_instance.set_order_delivery_date(campaign_id, order_id, set_order_delivery_date_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_order_delivery_date: #{e}"
end
```

#### Using the set_order_delivery_date_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_order_delivery_date_with_http_info(campaign_id, order_id, set_order_delivery_date_request)

```ruby
begin
  # Изменение даты доставки заказа
  data, status_code, headers = api_instance.set_order_delivery_date_with_http_info(campaign_id, order_id, set_order_delivery_date_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_order_delivery_date_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **set_order_delivery_date_request** | [**SetOrderDeliveryDateRequest**](SetOrderDeliveryDateRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## set_order_delivery_track_code

> <EmptyApiResponse> set_order_delivery_track_code(campaign_id, order_id, set_order_delivery_track_code_request)

Передача трек‑номера посылки

{% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
set_order_delivery_track_code_request = OpenapiClient::SetOrderDeliveryTrackCodeRequest.new({track_code: 'track_code_example', delivery_service_id: 3.56}) # SetOrderDeliveryTrackCodeRequest | 

begin
  # Передача трек‑номера посылки
  result = api_instance.set_order_delivery_track_code(campaign_id, order_id, set_order_delivery_track_code_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_order_delivery_track_code: #{e}"
end
```

#### Using the set_order_delivery_track_code_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_order_delivery_track_code_with_http_info(campaign_id, order_id, set_order_delivery_track_code_request)

```ruby
begin
  # Передача трек‑номера посылки
  data, status_code, headers = api_instance.set_order_delivery_track_code_with_http_info(campaign_id, order_id, set_order_delivery_track_code_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_order_delivery_track_code_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **set_order_delivery_track_code_request** | [**SetOrderDeliveryTrackCodeRequest**](SetOrderDeliveryTrackCodeRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## set_order_shipment_boxes

> <SetOrderShipmentBoxesResponse> set_order_shipment_boxes(campaign_id, order_id, shipment_id, set_order_shipment_boxes_request)

Передача количества грузовых мест в заказе

{% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.  Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).  Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.  Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.  {% cut \"Как было раньше\" %}  Структура тела PUT-запроса:  ``` {   \"boxes\":   [     {       \"fulfilmentId\": \"{string}\",       \"weight\": {int64},       \"width\": {int64},       \"height\": {int64},       \"depth\": {int64},       \"items\":       [         {           \"id\": {int64},           \"count\": {int32}         },         ...       ]     },     ...   ] } ``` | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `boxes`       |           | Список грузовых мест.       |  **Параметры, вложенные в `boxes`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `fulfilmentId`       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: `номер заказа на Маркете-номер грузового места`. Например, `7206821‑1, 7206821‑2` и т. д. | | `weight`       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. | | `width`       | Int64   | Ширина грузового места в сантиметрах.       | | `height`       | Int64   | Высота грузового места в сантиметрах.       | | `depth`       | Int64   | Глубина грузового места в сантиметрах.        | | `items`       | Int64   | Список товаров в грузовом месте.       |  **Параметры, вложенные в `items`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `id`       | Int64     | Идентификатор товара в рамках заказа.   | | `count`    | Int32     | Количество единиц товара в грузовом месте.       |  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
shipment_id = 789 # Integer | Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL. 
set_order_shipment_boxes_request = OpenapiClient::SetOrderShipmentBoxesRequest.new({boxes: [OpenapiClient::ParcelBoxDTO.new]}) # SetOrderShipmentBoxesRequest | 

begin
  # Передача количества грузовых мест в заказе
  result = api_instance.set_order_shipment_boxes(campaign_id, order_id, shipment_id, set_order_shipment_boxes_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_order_shipment_boxes: #{e}"
end
```

#### Using the set_order_shipment_boxes_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SetOrderShipmentBoxesResponse>, Integer, Hash)> set_order_shipment_boxes_with_http_info(campaign_id, order_id, shipment_id, set_order_shipment_boxes_request)

```ruby
begin
  # Передача количества грузовых мест в заказе
  data, status_code, headers = api_instance.set_order_shipment_boxes_with_http_info(campaign_id, order_id, shipment_id, set_order_shipment_boxes_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SetOrderShipmentBoxesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_order_shipment_boxes_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **shipment_id** | **Integer** | Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL.  |  |
| **set_order_shipment_boxes_request** | [**SetOrderShipmentBoxesRequest**](SetOrderShipmentBoxesRequest.md) |  |  |

### Return type

[**SetOrderShipmentBoxesResponse**](SetOrderShipmentBoxesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## set_return_decision

> <EmptyApiResponse> set_return_decision(campaign_id, order_id, return_id, set_return_decision_request)

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.
set_return_decision_request = OpenapiClient::SetReturnDecisionRequest.new({return_item_id: 3.56, decision_type: OpenapiClient::ReturnRequestDecisionType::REFUND_MONEY}) # SetReturnDecisionRequest | 

begin
  # Принятие или изменение решения по возврату
  result = api_instance.set_return_decision(campaign_id, order_id, return_id, set_return_decision_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_return_decision: #{e}"
end
```

#### Using the set_return_decision_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_return_decision_with_http_info(campaign_id, order_id, return_id, set_return_decision_request)

```ruby
begin
  # Принятие или изменение решения по возврату
  data, status_code, headers = api_instance.set_return_decision_with_http_info(campaign_id, order_id, return_id, set_return_decision_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->set_return_decision_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |
| **set_return_decision_request** | [**SetReturnDecisionRequest**](SetReturnDecisionRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## skip_goods_feedbacks_reaction

> <EmptyApiResponse> skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request)

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
skip_goods_feedback_reaction_request = OpenapiClient::SkipGoodsFeedbackReactionRequest.new({feedback_ids: [3.56]}) # SkipGoodsFeedbackReactionRequest | 

begin
  # Отказ от ответа на отзывы
  result = api_instance.skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->skip_goods_feedbacks_reaction: #{e}"
end
```

#### Using the skip_goods_feedbacks_reaction_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> skip_goods_feedbacks_reaction_with_http_info(business_id, skip_goods_feedback_reaction_request)

```ruby
begin
  # Отказ от ответа на отзывы
  data, status_code, headers = api_instance.skip_goods_feedbacks_reaction_with_http_info(business_id, skip_goods_feedback_reaction_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->skip_goods_feedbacks_reaction_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **skip_goods_feedback_reaction_request** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## submit_return_decision

> <EmptyApiResponse> submit_return_decision(campaign_id, order_id, return_id)

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.

begin
  # Подтверждение решения по возврату
  result = api_instance.submit_return_decision(campaign_id, order_id, return_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->submit_return_decision: #{e}"
end
```

#### Using the submit_return_decision_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> submit_return_decision_with_http_info(campaign_id, order_id, return_id)

```ruby
begin
  # Подтверждение решения по возврату
  data, status_code, headers = api_instance.submit_return_decision_with_http_info(campaign_id, order_id, return_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->submit_return_decision_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_business_prices

> <EmptyApiResponse> update_business_prices(business_id, update_business_prices_request)

Установка цен на товары во всех магазинах

Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_business_prices_request = OpenapiClient::UpdateBusinessPricesRequest.new({offers: [OpenapiClient::UpdateBusinessOfferPriceDTO.new({offer_id: 'offer_id_example', price: OpenapiClient::UpdatePriceWithDiscountDTO.new({value: 3.56, currency_id: OpenapiClient::CurrencyType::RUR})})]}) # UpdateBusinessPricesRequest | 

begin
  # Установка цен на товары во всех магазинах
  result = api_instance.update_business_prices(business_id, update_business_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_business_prices: #{e}"
end
```

#### Using the update_business_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_business_prices_with_http_info(business_id, update_business_prices_request)

```ruby
begin
  # Установка цен на товары во всех магазинах
  data, status_code, headers = api_instance.update_business_prices_with_http_info(business_id, update_business_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_business_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_business_prices_request** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_campaign_offers

> <EmptyApiResponse> update_campaign_offers(campaign_id, update_campaign_offers_request)

Изменение условий продажи товаров в магазине

Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_campaign_offers_request = OpenapiClient::UpdateCampaignOffersRequest.new({offers: [OpenapiClient::UpdateCampaignOfferDTO.new({offer_id: 'offer_id_example'})]}) # UpdateCampaignOffersRequest | 

begin
  # Изменение условий продажи товаров в магазине
  result = api_instance.update_campaign_offers(campaign_id, update_campaign_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_campaign_offers: #{e}"
end
```

#### Using the update_campaign_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_campaign_offers_with_http_info(campaign_id, update_campaign_offers_request)

```ruby
begin
  # Изменение условий продажи товаров в магазине
  data, status_code, headers = api_instance.update_campaign_offers_with_http_info(campaign_id, update_campaign_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_campaign_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_campaign_offers_request** | [**UpdateCampaignOffersRequest**](UpdateCampaignOffersRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_goods_feedback_comment

> <UpdateGoodsFeedbackCommentResponse> update_goods_feedback_comment(business_id, update_goods_feedback_comment_request)

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_goods_feedback_comment_request = OpenapiClient::UpdateGoodsFeedbackCommentRequest.new({feedback_id: 3.56, comment: OpenapiClient::UpdateGoodsFeedbackCommentDTO.new({text: 'text_example'})}) # UpdateGoodsFeedbackCommentRequest | 

begin
  # Добавление нового или изменение созданного комментария
  result = api_instance.update_goods_feedback_comment(business_id, update_goods_feedback_comment_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_goods_feedback_comment: #{e}"
end
```

#### Using the update_goods_feedback_comment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateGoodsFeedbackCommentResponse>, Integer, Hash)> update_goods_feedback_comment_with_http_info(business_id, update_goods_feedback_comment_request)

```ruby
begin
  # Добавление нового или изменение созданного комментария
  data, status_code, headers = api_instance.update_goods_feedback_comment_with_http_info(business_id, update_goods_feedback_comment_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateGoodsFeedbackCommentResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_goods_feedback_comment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_goods_feedback_comment_request** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md) |  |  |

### Return type

[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_offer_content

> <UpdateOfferContentResponse> update_offer_content(business_id, update_offer_content_request)

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_offer_content_request = OpenapiClient::UpdateOfferContentRequest.new({offers_content: [OpenapiClient::OfferContentDTO.new({offer_id: 'offer_id_example', category_id: 37, parameter_values: [OpenapiClient::ParameterValueDTO.new({parameter_id: 3.56})]})]}) # UpdateOfferContentRequest | 

begin
  # Редактирование категорийных характеристик товара
  result = api_instance.update_offer_content(business_id, update_offer_content_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_offer_content: #{e}"
end
```

#### Using the update_offer_content_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateOfferContentResponse>, Integer, Hash)> update_offer_content_with_http_info(business_id, update_offer_content_request)

```ruby
begin
  # Редактирование категорийных характеристик товара
  data, status_code, headers = api_instance.update_offer_content_with_http_info(business_id, update_offer_content_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateOfferContentResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_offer_content_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_offer_content_request** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md) |  |  |

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_offer_mapping_entries

> <EmptyApiResponse> update_offer_mapping_entries(campaign_id, update_offer_mapping_entry_request)

Добавление и редактирование товаров в каталоге

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_offer_mapping_entry_request = OpenapiClient::UpdateOfferMappingEntryRequest.new({offer_mapping_entries: [OpenapiClient::UpdateOfferMappingEntryDTO.new]}) # UpdateOfferMappingEntryRequest | 

begin
  # Добавление и редактирование товаров в каталоге
  result = api_instance.update_offer_mapping_entries(campaign_id, update_offer_mapping_entry_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_offer_mapping_entries: #{e}"
end
```

#### Using the update_offer_mapping_entries_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_offer_mapping_entries_with_http_info(campaign_id, update_offer_mapping_entry_request)

```ruby
begin
  # Добавление и редактирование товаров в каталоге
  data, status_code, headers = api_instance.update_offer_mapping_entries_with_http_info(campaign_id, update_offer_mapping_entry_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_offer_mapping_entries_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_offer_mapping_entry_request** | [**UpdateOfferMappingEntryRequest**](UpdateOfferMappingEntryRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_offer_mappings

> <UpdateOfferMappingsResponse> update_offer_mappings(business_id, update_offer_mappings_request)

Добавление товаров в каталог и изменение информации о них

Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_offer_mappings_request = OpenapiClient::UpdateOfferMappingsRequest.new({offer_mappings: [OpenapiClient::UpdateOfferMappingDTO.new({offer: OpenapiClient::UpdateOfferDTO.new({offer_id: 'offer_id_example'})})]}) # UpdateOfferMappingsRequest | 

begin
  # Добавление товаров в каталог и изменение информации о них
  result = api_instance.update_offer_mappings(business_id, update_offer_mappings_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_offer_mappings: #{e}"
end
```

#### Using the update_offer_mappings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateOfferMappingsResponse>, Integer, Hash)> update_offer_mappings_with_http_info(business_id, update_offer_mappings_request)

```ruby
begin
  # Добавление товаров в каталог и изменение информации о них
  data, status_code, headers = api_instance.update_offer_mappings_with_http_info(business_id, update_offer_mappings_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateOfferMappingsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_offer_mappings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_offer_mappings_request** | [**UpdateOfferMappingsRequest**](UpdateOfferMappingsRequest.md) |  |  |

### Return type

[**UpdateOfferMappingsResponse**](UpdateOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_order_items

> update_order_items(campaign_id, order_id, update_order_item_request)

Удаление товара из заказа или уменьшение числа единиц

{% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:  * покупатель уменьшил количество товара; * магазин не может поставить все товары в заказе.  Для этого заказ должен находится в статусе `\"status\": \"PROCESSING\"` этапа обработки `\"substatus\": \"STARTED\"`. После передачи статуса `\"substatus\": \"READY_TO_SHIP\"` изменить состав невозможно.  Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте `count` параметра `item`.  Чтобы полностью удалить товар из заказа:  * передайте значение `0`; или * не передавайте параметр `item`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  **Возврат денег покупателю**  Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:  * при оплате банковской картой — с момента, когда магазин переведет заказ в статус `SHIPPED`;  * при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
update_order_item_request = OpenapiClient::UpdateOrderItemRequest.new({items: [OpenapiClient::OrderItemModificationDTO.new({id: 3.56, count: 37})]}) # UpdateOrderItemRequest | 

begin
  # Удаление товара из заказа или уменьшение числа единиц
  api_instance.update_order_items(campaign_id, order_id, update_order_item_request)
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_order_items: #{e}"
end
```

#### Using the update_order_items_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> update_order_items_with_http_info(campaign_id, order_id, update_order_item_request)

```ruby
begin
  # Удаление товара из заказа или уменьшение числа единиц
  data, status_code, headers = api_instance.update_order_items_with_http_info(campaign_id, order_id, update_order_item_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_order_items_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **update_order_item_request** | [**UpdateOrderItemRequest**](UpdateOrderItemRequest.md) |  |  |

### Return type

nil (empty response body)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_order_status

> <UpdateOrderStatusResponse> update_order_status(campaign_id, order_id, update_order_status_request)

Изменение статуса одного заказа

Изменяет статус заказа. Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
update_order_status_request = OpenapiClient::UpdateOrderStatusRequest.new({order: OpenapiClient::OrderStatusChangeDTO.new({status: OpenapiClient::OrderStatusType::PLACING})}) # UpdateOrderStatusRequest | 

begin
  # Изменение статуса одного заказа
  result = api_instance.update_order_status(campaign_id, order_id, update_order_status_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_order_status: #{e}"
end
```

#### Using the update_order_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateOrderStatusResponse>, Integer, Hash)> update_order_status_with_http_info(campaign_id, order_id, update_order_status_request)

```ruby
begin
  # Изменение статуса одного заказа
  data, status_code, headers = api_instance.update_order_status_with_http_info(campaign_id, order_id, update_order_status_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateOrderStatusResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_order_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **update_order_status_request** | [**UpdateOrderStatusRequest**](UpdateOrderStatusRequest.md) |  |  |

### Return type

[**UpdateOrderStatusResponse**](UpdateOrderStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_order_statuses

> <UpdateOrderStatusesResponse> update_order_statuses(campaign_id, update_order_statuses_request)

Изменение статусов нескольких заказов

Изменяет статусы нескольких заказов.  Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"`и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_order_statuses_request = OpenapiClient::UpdateOrderStatusesRequest.new({orders: [OpenapiClient::OrderStateDTO.new({id: 3.56, status: OpenapiClient::OrderStatusType::PLACING})]}) # UpdateOrderStatusesRequest | 

begin
  # Изменение статусов нескольких заказов
  result = api_instance.update_order_statuses(campaign_id, update_order_statuses_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_order_statuses: #{e}"
end
```

#### Using the update_order_statuses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateOrderStatusesResponse>, Integer, Hash)> update_order_statuses_with_http_info(campaign_id, update_order_statuses_request)

```ruby
begin
  # Изменение статусов нескольких заказов
  data, status_code, headers = api_instance.update_order_statuses_with_http_info(campaign_id, update_order_statuses_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateOrderStatusesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_order_statuses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_order_statuses_request** | [**UpdateOrderStatusesRequest**](UpdateOrderStatusesRequest.md) |  |  |

### Return type

[**UpdateOrderStatusesResponse**](UpdateOrderStatusesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_order_storage_limit

> <EmptyApiResponse> update_order_storage_limit(campaign_id, order_id, update_order_storage_limit_request)

Продление срока хранения заказа

Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
update_order_storage_limit_request = OpenapiClient::UpdateOrderStorageLimitRequest.new({new_date: Date.today}) # UpdateOrderStorageLimitRequest | 

begin
  # Продление срока хранения заказа
  result = api_instance.update_order_storage_limit(campaign_id, order_id, update_order_storage_limit_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_order_storage_limit: #{e}"
end
```

#### Using the update_order_storage_limit_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_order_storage_limit_with_http_info(campaign_id, order_id, update_order_storage_limit_request)

```ruby
begin
  # Продление срока хранения заказа
  data, status_code, headers = api_instance.update_order_storage_limit_with_http_info(campaign_id, order_id, update_order_storage_limit_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_order_storage_limit_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **update_order_storage_limit_request** | [**UpdateOrderStorageLimitRequest**](UpdateOrderStorageLimitRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_outlet

> <EmptyApiResponse> update_outlet(campaign_id, outlet_id, change_outlet_request)

Изменение информации о точке продаж

Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
outlet_id = 789 # Integer | Идентификатор точки продаж.
change_outlet_request = OpenapiClient::ChangeOutletRequest.new({name: 'name_example', type: OpenapiClient::OutletType::DEPOT, address: OpenapiClient::OutletAddressDTO.new({region_id: 3.56}), phones: ['phones_example'], working_schedule: OpenapiClient::OutletWorkingScheduleDTO.new({schedule_items: [OpenapiClient::OutletWorkingScheduleItemDTO.new({start_day: OpenapiClient::DayOfWeekType::MONDAY, end_day: OpenapiClient::DayOfWeekType::MONDAY, start_time: 'start_time_example', end_time: 'end_time_example'})]})}) # ChangeOutletRequest | 

begin
  # Изменение информации о точке продаж
  result = api_instance.update_outlet(campaign_id, outlet_id, change_outlet_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_outlet: #{e}"
end
```

#### Using the update_outlet_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_outlet_with_http_info(campaign_id, outlet_id, change_outlet_request)

```ruby
begin
  # Изменение информации о точке продаж
  data, status_code, headers = api_instance.update_outlet_with_http_info(campaign_id, outlet_id, change_outlet_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_outlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **outlet_id** | **Integer** | Идентификатор точки продаж. |  |
| **change_outlet_request** | [**ChangeOutletRequest**](ChangeOutletRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_outlet_licenses

> <EmptyApiResponse> update_outlet_licenses(campaign_id, update_outlet_license_request)

Создание и изменение лицензий для точек продаж

Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_outlet_license_request = OpenapiClient::UpdateOutletLicenseRequest.new({licenses: [OpenapiClient::OutletLicenseDTO.new]}) # UpdateOutletLicenseRequest | 

begin
  # Создание и изменение лицензий для точек продаж
  result = api_instance.update_outlet_licenses(campaign_id, update_outlet_license_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_outlet_licenses: #{e}"
end
```

#### Using the update_outlet_licenses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_outlet_licenses_with_http_info(campaign_id, update_outlet_license_request)

```ruby
begin
  # Создание и изменение лицензий для точек продаж
  data, status_code, headers = api_instance.update_outlet_licenses_with_http_info(campaign_id, update_outlet_license_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_outlet_licenses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_outlet_license_request** | [**UpdateOutletLicenseRequest**](UpdateOutletLicenseRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_prices

> <EmptyApiResponse> update_prices(campaign_id, update_prices_request)

Установка цен на товары в конкретном магазине

Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_prices_request = OpenapiClient::UpdatePricesRequest.new({offers: [OpenapiClient::OfferPriceDTO.new]}) # UpdatePricesRequest | 

begin
  # Установка цен на товары в конкретном магазине
  result = api_instance.update_prices(campaign_id, update_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_prices: #{e}"
end
```

#### Using the update_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_prices_with_http_info(campaign_id, update_prices_request)

```ruby
begin
  # Установка цен на товары в конкретном магазине
  data, status_code, headers = api_instance.update_prices_with_http_info(campaign_id, update_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_prices_request** | [**UpdatePricesRequest**](UpdatePricesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_promo_offers

> <UpdatePromoOffersResponse> update_promo_offers(business_id, update_promo_offers_request)

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_promo_offers_request = OpenapiClient::UpdatePromoOffersRequest.new({promo_id: 'promo_id_example', offers: [OpenapiClient::UpdatePromoOfferDTO.new({offer_id: 'offer_id_example'})]}) # UpdatePromoOffersRequest | 

begin
  # Добавление товаров в акцию или изменение их цен
  result = api_instance.update_promo_offers(business_id, update_promo_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_promo_offers: #{e}"
end
```

#### Using the update_promo_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdatePromoOffersResponse>, Integer, Hash)> update_promo_offers_with_http_info(business_id, update_promo_offers_request)

```ruby
begin
  # Добавление товаров в акцию или изменение их цен
  data, status_code, headers = api_instance.update_promo_offers_with_http_info(business_id, update_promo_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdatePromoOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_promo_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_promo_offers_request** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md) |  |  |

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_stocks

> <EmptyApiResponse> update_stocks(campaign_id, update_stocks_request)

Передача информации об остатках

Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DbsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_stocks_request = OpenapiClient::UpdateStocksRequest.new({skus: [OpenapiClient::UpdateStockDTO.new({sku: 'sku_example', items: [OpenapiClient::UpdateStockItemDTO.new({count: 3.56})]})]}) # UpdateStocksRequest | 

begin
  # Передача информации об остатках
  result = api_instance.update_stocks(campaign_id, update_stocks_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_stocks: #{e}"
end
```

#### Using the update_stocks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_stocks_with_http_info(campaign_id, update_stocks_request)

```ruby
begin
  # Передача информации об остатках
  data, status_code, headers = api_instance.update_stocks_with_http_info(campaign_id, update_stocks_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DbsApi->update_stocks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_stocks_request** | [**UpdateStocksRequest**](UpdateStocksRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

