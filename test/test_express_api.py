# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ympa_python_client.api.express_api import ExpressApi


class TestExpressApi(unittest.TestCase):
    """ExpressApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ExpressApi()

    def tearDown(self) -> None:
        pass

    def test_add_hidden_offers(self) -> None:
        """Test case for add_hidden_offers

        Скрытие товаров и настройки скрытия
        """
        pass

    def test_add_offers_to_archive(self) -> None:
        """Test case for add_offers_to_archive

        Добавление товаров в архив
        """
        pass

    def test_calculate_tariffs(self) -> None:
        """Test case for calculate_tariffs

        Калькулятор стоимости услуг
        """
        pass

    def test_confirm_business_prices(self) -> None:
        """Test case for confirm_business_prices

        Удаление товара из карантина по цене в кабинете
        """
        pass

    def test_confirm_campaign_prices(self) -> None:
        """Test case for confirm_campaign_prices

        Удаление товара из карантина по цене в магазине
        """
        pass

    def test_create_chat(self) -> None:
        """Test case for create_chat

        Создание нового чата с покупателем
        """
        pass

    def test_delete_campaign_offers(self) -> None:
        """Test case for delete_campaign_offers

        Удаление товаров из ассортимента магазина
        """
        pass

    def test_delete_goods_feedback_comment(self) -> None:
        """Test case for delete_goods_feedback_comment

        Удаление комментария к отзыву
        """
        pass

    def test_delete_hidden_offers(self) -> None:
        """Test case for delete_hidden_offers

        Возобновление показа товаров
        """
        pass

    def test_delete_offers(self) -> None:
        """Test case for delete_offers

        Удаление товаров из каталога
        """
        pass

    def test_delete_offers_from_archive(self) -> None:
        """Test case for delete_offers_from_archive

        Удаление товаров из архива
        """
        pass

    def test_delete_promo_offers(self) -> None:
        """Test case for delete_promo_offers

        Удаление товаров из акции
        """
        pass

    def test_generate_boost_consolidated_report(self) -> None:
        """Test case for generate_boost_consolidated_report

        Отчет по бусту продаж
        """
        pass

    def test_generate_competitors_position_report(self) -> None:
        """Test case for generate_competitors_position_report

        Отчет «Конкурентная позиция»
        """
        pass

    def test_generate_goods_feedback_report(self) -> None:
        """Test case for generate_goods_feedback_report

        Отчет по отзывам о товарах
        """
        pass

    def test_generate_goods_realization_report(self) -> None:
        """Test case for generate_goods_realization_report

        Отчет по реализации
        """
        pass

    def test_generate_mass_order_labels_report(self) -> None:
        """Test case for generate_mass_order_labels_report

        Готовые ярлыки‑наклейки на все коробки в нескольких заказах
        """
        pass

    def test_generate_order_label(self) -> None:
        """Test case for generate_order_label

        Готовый ярлык‑наклейка для коробки в заказе
        """
        pass

    def test_generate_order_labels(self) -> None:
        """Test case for generate_order_labels

        Готовые ярлыки‑наклейки на все коробки в одном заказе
        """
        pass

    def test_generate_prices_report(self) -> None:
        """Test case for generate_prices_report

        Отчет «Цены на рынке»
        """
        pass

    def test_generate_shelfs_statistics_report(self) -> None:
        """Test case for generate_shelfs_statistics_report

        Отчет по полкам
        """
        pass

    def test_generate_shows_sales_report(self) -> None:
        """Test case for generate_shows_sales_report

        Отчет «Аналитика продаж»
        """
        pass

    def test_generate_stocks_on_warehouses_report(self) -> None:
        """Test case for generate_stocks_on_warehouses_report

        Отчет по остаткам на складах
        """
        pass

    def test_generate_united_marketplace_services_report(self) -> None:
        """Test case for generate_united_marketplace_services_report

        Отчет по стоимости услуг
        """
        pass

    def test_generate_united_netting_report(self) -> None:
        """Test case for generate_united_netting_report

        Отчет по платежам
        """
        pass

    def test_generate_united_orders_report(self) -> None:
        """Test case for generate_united_orders_report

        Отчет по заказам
        """
        pass

    def test_get_all_offers(self) -> None:
        """Test case for get_all_offers

        Все предложения магазина
        """
        pass

    def test_get_bids_info_for_business(self) -> None:
        """Test case for get_bids_info_for_business

        Информация об установленных ставках
        """
        pass

    def test_get_bids_recommendations(self) -> None:
        """Test case for get_bids_recommendations

        Рекомендованные ставки для заданных товаров
        """
        pass

    def test_get_business_quarantine_offers(self) -> None:
        """Test case for get_business_quarantine_offers

        Список товаров, находящихся в карантине по цене в кабинете
        """
        pass

    def test_get_business_settings(self) -> None:
        """Test case for get_business_settings

        Настройки кабинета
        """
        pass

    def test_get_campaign(self) -> None:
        """Test case for get_campaign

        Информация о магазине
        """
        pass

    def test_get_campaign_logins(self) -> None:
        """Test case for get_campaign_logins

        Логины, связанные с магазином
        """
        pass

    def test_get_campaign_offers(self) -> None:
        """Test case for get_campaign_offers

        Информация о товарах, которые размещены в заданном магазине
        """
        pass

    def test_get_campaign_quarantine_offers(self) -> None:
        """Test case for get_campaign_quarantine_offers

        Список товаров, находящихся в карантине по цене в магазине
        """
        pass

    def test_get_campaign_region(self) -> None:
        """Test case for get_campaign_region

        Регион магазина
        """
        pass

    def test_get_campaign_settings(self) -> None:
        """Test case for get_campaign_settings

        Настройки магазина
        """
        pass

    def test_get_campaigns(self) -> None:
        """Test case for get_campaigns

        Список магазинов пользователя
        """
        pass

    def test_get_campaigns_by_login(self) -> None:
        """Test case for get_campaigns_by_login

        Магазины, доступные логину
        """
        pass

    def test_get_categories_max_sale_quantum(self) -> None:
        """Test case for get_categories_max_sale_quantum

        Лимит на установку кванта продажи и минимального количества товаров в заказе
        """
        pass

    def test_get_categories_tree(self) -> None:
        """Test case for get_categories_tree

        Дерево категорий
        """
        pass

    def test_get_category_content_parameters(self) -> None:
        """Test case for get_category_content_parameters

        Списки характеристик товаров по категориям
        """
        pass

    def test_get_chat_history(self) -> None:
        """Test case for get_chat_history

        Получение истории сообщений в чате
        """
        pass

    def test_get_chats(self) -> None:
        """Test case for get_chats

        Получение доступных чатов
        """
        pass

    def test_get_delivery_services(self) -> None:
        """Test case for get_delivery_services

        Справочник служб доставки
        """
        pass

    def test_get_feed(self) -> None:
        """Test case for get_feed

        Информация о прайс-листе
        """
        pass

    def test_get_feed_index_logs(self) -> None:
        """Test case for get_feed_index_logs

        Отчет по индексации прайс-листа
        """
        pass

    def test_get_feedback_and_comment_updates(self) -> None:
        """Test case for get_feedback_and_comment_updates

        Новые и обновленные отзывы о магазине
        """
        pass

    def test_get_feeds(self) -> None:
        """Test case for get_feeds

        Список прайс-листов магазина
        """
        pass

    def test_get_goods_feedback_comments(self) -> None:
        """Test case for get_goods_feedback_comments

        Получение комментариев к отзыву
        """
        pass

    def test_get_goods_feedbacks(self) -> None:
        """Test case for get_goods_feedbacks

        Получение отзывов о товарах продавца
        """
        pass

    def test_get_goods_stats(self) -> None:
        """Test case for get_goods_stats

        Отчет по товарам
        """
        pass

    def test_get_hidden_offers(self) -> None:
        """Test case for get_hidden_offers

        Информация о скрытых вами товарах
        """
        pass

    def test_get_offer_cards_content_status(self) -> None:
        """Test case for get_offer_cards_content_status

        Получение информации о заполненности карточек магазина
        """
        pass

    def test_get_offer_mapping_entries(self) -> None:
        """Test case for get_offer_mapping_entries

        Список товаров в каталоге
        """
        pass

    def test_get_offer_mappings(self) -> None:
        """Test case for get_offer_mappings

        Информация о товарах в каталоге
        """
        pass

    def test_get_offer_recommendations(self) -> None:
        """Test case for get_offer_recommendations

        Рекомендации Маркета, касающиеся цен
        """
        pass

    def test_get_offers(self) -> None:
        """Test case for get_offers

        Предложения магазина
        """
        pass

    def test_get_order(self) -> None:
        """Test case for get_order

        Информация об одном заказе
        """
        pass

    def test_get_order_business_buyer_info(self) -> None:
        """Test case for get_order_business_buyer_info

        Информация о покупателе — юридическом лице
        """
        pass

    def test_get_order_business_documents_info(self) -> None:
        """Test case for get_order_business_documents_info

        Информация о документах
        """
        pass

    def test_get_order_labels_data(self) -> None:
        """Test case for get_order_labels_data

        Данные для самостоятельного изготовления ярлыков
        """
        pass

    def test_get_orders(self) -> None:
        """Test case for get_orders

        Информация о нескольких заказах
        """
        pass

    def test_get_orders_stats(self) -> None:
        """Test case for get_orders_stats

        Детальная информация по заказам
        """
        pass

    def test_get_prices(self) -> None:
        """Test case for get_prices

        Список цен
        """
        pass

    def test_get_prices_by_offer_ids(self) -> None:
        """Test case for get_prices_by_offer_ids

        Просмотр цен на указанные товары в магазине
        """
        pass

    def test_get_promo_offers(self) -> None:
        """Test case for get_promo_offers

        Получение списка товаров, которые участвуют или могут участвовать в акции
        """
        pass

    def test_get_promos(self) -> None:
        """Test case for get_promos

        Получение списка акций
        """
        pass

    def test_get_quality_rating_details(self) -> None:
        """Test case for get_quality_rating_details

        Заказы, которые повлияли на индекс качества
        """
        pass

    def test_get_quality_ratings(self) -> None:
        """Test case for get_quality_ratings

        Индекс качества магазинов
        """
        pass

    def test_get_report_info(self) -> None:
        """Test case for get_report_info

        Получение заданного отчета
        """
        pass

    def test_get_return(self) -> None:
        """Test case for get_return

        Информация о невыкупе или возврате
        """
        pass

    def test_get_return_application(self) -> None:
        """Test case for get_return_application

        Получение заявления на возврат
        """
        pass

    def test_get_return_photo(self) -> None:
        """Test case for get_return_photo

        Получение фотографии возврата
        """
        pass

    def test_get_returns(self) -> None:
        """Test case for get_returns

        Список невыкупов и возвратов
        """
        pass

    def test_get_stocks(self) -> None:
        """Test case for get_stocks

        Информация об остатках и оборачиваемости
        """
        pass

    def test_get_suggested_offer_mapping_entries(self) -> None:
        """Test case for get_suggested_offer_mapping_entries

        Рекомендованные карточки для товаров
        """
        pass

    def test_get_suggested_offer_mappings(self) -> None:
        """Test case for get_suggested_offer_mappings

        Просмотр карточек на Маркете, которые подходят вашим товарам
        """
        pass

    def test_get_suggested_prices(self) -> None:
        """Test case for get_suggested_prices

        Цены для продвижения товаров
        """
        pass

    def test_get_warehouses(self) -> None:
        """Test case for get_warehouses

        Список складов и групп складов
        """
        pass

    def test_provide_order_item_identifiers(self) -> None:
        """Test case for provide_order_item_identifiers

        Передача кодов маркировки единиц товара
        """
        pass

    def test_put_bids_for_business(self) -> None:
        """Test case for put_bids_for_business

        Включение буста продаж и установка ставок
        """
        pass

    def test_put_bids_for_campaign(self) -> None:
        """Test case for put_bids_for_campaign

        Включение буста продаж и установка ставок для магазина
        """
        pass

    def test_refresh_feed(self) -> None:
        """Test case for refresh_feed

        Сообщить, что прайс-лист обновился
        """
        pass

    def test_search_region_children(self) -> None:
        """Test case for search_region_children

        Информация о дочерних регионах
        """
        pass

    def test_search_regions_by_id(self) -> None:
        """Test case for search_regions_by_id

        Информация о регионе
        """
        pass

    def test_search_regions_by_name(self) -> None:
        """Test case for search_regions_by_name

        Поиск регионов по их имени
        """
        pass

    def test_send_file_to_chat(self) -> None:
        """Test case for send_file_to_chat

        Отправка файла в чат
        """
        pass

    def test_send_message_to_chat(self) -> None:
        """Test case for send_message_to_chat

        Отправка сообщения в чат
        """
        pass

    def test_set_feed_params(self) -> None:
        """Test case for set_feed_params

        Изменение параметров прайс-листа
        """
        pass

    def test_set_order_box_layout(self) -> None:
        """Test case for set_order_box_layout

        Подготовка заказа
        """
        pass

    def test_set_order_shipment_boxes(self) -> None:
        """Test case for set_order_shipment_boxes

        Передача количества грузовых мест в заказе
        """
        pass

    def test_skip_goods_feedbacks_reaction(self) -> None:
        """Test case for skip_goods_feedbacks_reaction

        Отказ от ответа на отзывы
        """
        pass

    def test_update_business_prices(self) -> None:
        """Test case for update_business_prices

        Установка цен на товары во всех магазинах
        """
        pass

    def test_update_campaign_offers(self) -> None:
        """Test case for update_campaign_offers

        Изменение условий продажи товаров в магазине
        """
        pass

    def test_update_goods_feedback_comment(self) -> None:
        """Test case for update_goods_feedback_comment

        Добавление нового или изменение созданного комментария
        """
        pass

    def test_update_offer_content(self) -> None:
        """Test case for update_offer_content

        Редактирование категорийных характеристик товара
        """
        pass

    def test_update_offer_mapping_entries(self) -> None:
        """Test case for update_offer_mapping_entries

        Добавление и редактирование товаров в каталоге
        """
        pass

    def test_update_offer_mappings(self) -> None:
        """Test case for update_offer_mappings

        Добавление товаров в каталог и изменение информации о них
        """
        pass

    def test_update_order_items(self) -> None:
        """Test case for update_order_items

        Удаление товара из заказа или уменьшение числа единиц
        """
        pass

    def test_update_order_status(self) -> None:
        """Test case for update_order_status

        Изменение статуса одного заказа
        """
        pass

    def test_update_order_statuses(self) -> None:
        """Test case for update_order_statuses

        Изменение статусов нескольких заказов
        """
        pass

    def test_update_prices(self) -> None:
        """Test case for update_prices

        Установка цен на товары в конкретном магазине
        """
        pass

    def test_update_promo_offers(self) -> None:
        """Test case for update_promo_offers

        Добавление товаров в акцию или изменение их цен
        """
        pass

    def test_update_stocks(self) -> None:
        """Test case for update_stocks

        Передача информации об остатках
        """
        pass

    def test_verify_order_eac(self) -> None:
        """Test case for verify_order_eac

        Передача кода подтверждения
        """
        pass


if __name__ == '__main__':
    unittest.main()
