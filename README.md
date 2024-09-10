# ympa_php_slim4_server - PHP Slim 4 Server library for Партнерский API Маркета

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.
[PHP-DI](https://php-di.org/doc/frameworks/slim.html) package used as dependency container.

## Requirements

* Web server with URL rewriting
* PHP 7.4 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Add configs

[PHP-DI package](https://php-di.org/doc/getting-started.html) helps to decouple configuration from implementation. App loads configuration files in straight order(`$env` can be `prod` or `dev`):
1. `config/$env/default.inc.php` (contains safe values, can be committed to vcs)
2. `config/$env/config.inc.php` (user config, excluded from vcs, can contain sensitive values, passwords etc.)
3. `lib/App/RegisterDependencies.php`

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/public/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server/public
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 8 or 9(depends from your PHP version) for unit testing.
[Test folder](tests) contains templates which you can fill with real test assertions.
How to write tests read at [2. Writing Tests for PHPUnit - PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch your app environment to development
- When using with some webserver => in `public/.htaccess` file:
```ini
## .htaccess
<IfModule mod_env.c>
    SetEnv APP_ENV 'development'
</IfModule>
```

- Or when using whatever else, set `APP_ENV` environment variable like this:
```bash
export APP_ENV=development
```
or simply
```bash
export APP_ENV=dev
```

## Mock Server
Since this feature should be used for development only, change environment to `development` and send additional HTTP header `X-OpenAPIServer-Mock: ping` with any request to get mocked response.
CURL example:
```console
curl --request GET \
    --url 'http://localhost:8888/v2/pet/findByStatus?status=available' \
    --header 'accept: application/json' \
    --header 'X-OpenAPIServer-Mock: ping'
[{"id":-8738629417578509312,"category":{"id":-4162503862215270400,"name":"Lorem ipsum dol"},"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem i","photoUrls":["Lor"],"tags":[{"id":-3506202845849391104,"name":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectet"}],"status":"pending"}]
```

Used packages:
* [Openapi Data Mocker](https://github.com/ybelenko/openapi-data-mocker) - first implementation of OAS3 fake data generator.
* [Openapi Data Mocker Server Middleware](https://github.com/ybelenko/openapi-data-mocker-server-middleware) - PSR-15 HTTP server middleware.
* [Openapi Data Mocker Interfaces](https://github.com/ybelenko/openapi-data-mocker-interfaces) - package with mocking interfaces.

## Logging

Build contains pre-configured [`monolog/monolog`](https://github.com/Seldaek/monolog) package. Make sure that `logs` folder is writable.
Add required log handlers/processors/formatters in `lib/App/RegisterDependencies.php`.

## API Endpoints

All URIs are relative to *https://api.partner.market.yandex.ru*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;
use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;

class PetApi extends AbstractPetApi
{
    public function addPet(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        // your implementation of addPet method here
    }
}
```

When you need to inject dependencies into API controller check [PHP-DI - Controllers as services](https://github.com/PHP-DI/Slim-Bridge#controllers-as-services) guide.

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractBidsApi* | **getBidsInfoForBusiness** | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*AbstractBidsApi* | **getBidsRecommendations** | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*AbstractBidsApi* | **putBidsForBusiness** | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*AbstractBidsApi* | **putBidsForCampaign** | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*AbstractBusinessOfferMappingsApi* | **addOffersToArchive** | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*AbstractBusinessOfferMappingsApi* | **deleteOffers** | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*AbstractBusinessOfferMappingsApi* | **deleteOffersFromArchive** | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*AbstractBusinessOfferMappingsApi* | **getOfferMappings** | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*AbstractBusinessOfferMappingsApi* | **getSuggestedOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*AbstractBusinessOfferMappingsApi* | **updateOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*AbstractBusinessesApi* | **getBusinessSettings** | **POST** /businesses/{businessId}/settings | Настройки кабинета
*AbstractCampaignsApi* | **getCampaigns** | **GET** /campaigns | Список магазинов пользователя
*AbstractCampaignsApi* | **getCampaign** | **GET** /campaigns/{campaignId} | Информация о магазине
*AbstractCampaignsApi* | **getCampaignLogins** | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*AbstractCampaignsApi* | **getCampaignRegion** | **GET** /campaigns/{campaignId}/region | Регион магазина
*AbstractCampaignsApi* | **getCampaignSettings** | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*AbstractCampaignsApi* | **getCampaignsByLogin** | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*AbstractCategoriesApi* | **getCategoriesMaxSaleQuantum** | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*AbstractCategoriesApi* | **getCategoriesTree** | **POST** /categories/tree | Дерево категорий
*AbstractChatsApi* | **createChat** | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*AbstractChatsApi* | **getChatHistory** | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*AbstractChatsApi* | **getChats** | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*AbstractChatsApi* | **sendFileToChat** | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*AbstractChatsApi* | **sendMessageToChat** | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*AbstractContentApi* | **getCategoryContentParameters** | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*AbstractContentApi* | **getOfferCardsContentStatus** | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*AbstractContentApi* | **updateOfferContent** | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*AbstractDbsApi* | **calculateTariffs** | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*AbstractDbsApi* | **generateBoostConsolidatedReport** | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*AbstractDbsApi* | **generateCompetitorsPositionReport** | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*AbstractDbsApi* | **generateGoodsFeedbackReport** | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*AbstractDbsApi* | **generateMassOrderLabelsReport** | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*AbstractDbsApi* | **generatePricesReport** | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*AbstractDbsApi* | **generateShelfsStatisticsReport** | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*AbstractDbsApi* | **generateShowsSalesReport** | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*AbstractDbsApi* | **generateStocksOnWarehousesReport** | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*AbstractDbsApi* | **generateUnitedMarketplaceServicesReport** | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*AbstractDbsApi* | **generateUnitedNettingReport** | **POST** /reports/united-netting/generate | Отчет по платежам
*AbstractDbsApi* | **generateUnitedOrdersReport** | **POST** /reports/united-orders/generate | Отчет по заказам
*AbstractDbsApi* | **getCampaigns** | **GET** /campaigns | Список магазинов пользователя
*AbstractDbsApi* | **getCategoriesMaxSaleQuantum** | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*AbstractDbsApi* | **getCategoriesTree** | **POST** /categories/tree | Дерево категорий
*AbstractDbsApi* | **getDeliveryServices** | **GET** /delivery/services | Справочник служб доставки
*AbstractDbsApi* | **getModels** | **POST** /models | Информация о нескольких моделях
*AbstractDbsApi* | **getModelsOffers** | **POST** /models/offers | Список предложений для нескольких моделей
*AbstractDbsApi* | **searchModels** | **GET** /models | Поиск модели товара
*AbstractDbsApi* | **searchRegionsByName** | **GET** /regions | Поиск регионов по их имени
*AbstractDbsApi* | **acceptOrderCancellation** | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*AbstractDbsApi* | **addHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*AbstractDbsApi* | **addOffersToArchive** | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*AbstractDbsApi* | **confirmBusinessPrices** | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*AbstractDbsApi* | **confirmCampaignPrices** | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*AbstractDbsApi* | **createChat** | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*AbstractDbsApi* | **createOutlet** | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*AbstractDbsApi* | **deleteCampaignOffers** | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*AbstractDbsApi* | **deleteGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*AbstractDbsApi* | **deleteHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*AbstractDbsApi* | **deleteOffers** | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*AbstractDbsApi* | **deleteOffersFromArchive** | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*AbstractDbsApi* | **deleteOutlet** | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*AbstractDbsApi* | **deleteOutletLicenses** | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*AbstractDbsApi* | **deletePromoOffers** | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*AbstractDbsApi* | **generateOrderLabel** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*AbstractDbsApi* | **generateOrderLabels** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*AbstractDbsApi* | **getAllOffers** | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*AbstractDbsApi* | **getBidsInfoForBusiness** | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*AbstractDbsApi* | **getBidsRecommendations** | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*AbstractDbsApi* | **getBusinessQuarantineOffers** | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*AbstractDbsApi* | **getBusinessSettings** | **POST** /businesses/{businessId}/settings | Настройки кабинета
*AbstractDbsApi* | **getCampaign** | **GET** /campaigns/{campaignId} | Информация о магазине
*AbstractDbsApi* | **getCampaignLogins** | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*AbstractDbsApi* | **getCampaignOffers** | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*AbstractDbsApi* | **getCampaignQuarantineOffers** | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*AbstractDbsApi* | **getCampaignRegion** | **GET** /campaigns/{campaignId}/region | Регион магазина
*AbstractDbsApi* | **getCampaignSettings** | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*AbstractDbsApi* | **getCampaignsByLogin** | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*AbstractDbsApi* | **getCategoryContentParameters** | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*AbstractDbsApi* | **getChatHistory** | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*AbstractDbsApi* | **getChats** | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*AbstractDbsApi* | **getFeed** | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*AbstractDbsApi* | **getFeedIndexLogs** | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*AbstractDbsApi* | **getFeedbackAndCommentUpdates** | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*AbstractDbsApi* | **getFeeds** | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*AbstractDbsApi* | **getGoodsFeedbackComments** | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*AbstractDbsApi* | **getGoodsFeedbacks** | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*AbstractDbsApi* | **getGoodsStats** | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*AbstractDbsApi* | **getHiddenOffers** | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*AbstractDbsApi* | **getModel** | **GET** /models/{modelId} | Информация об одной модели
*AbstractDbsApi* | **getModelOffers** | **GET** /models/{modelId}/offers | Список предложений для одной модели
*AbstractDbsApi* | **getOfferCardsContentStatus** | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*AbstractDbsApi* | **getOfferMappingEntries** | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*AbstractDbsApi* | **getOfferMappings** | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*AbstractDbsApi* | **getOfferRecommendations** | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*AbstractDbsApi* | **getOffers** | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*AbstractDbsApi* | **getOrder** | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*AbstractDbsApi* | **getOrderBusinessBuyerInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*AbstractDbsApi* | **getOrderBusinessDocumentsInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*AbstractDbsApi* | **getOrderBuyerInfo** | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*AbstractDbsApi* | **getOrderLabelsData** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*AbstractDbsApi* | **getOrders** | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*AbstractDbsApi* | **getOrdersStats** | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*AbstractDbsApi* | **getOutlet** | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*AbstractDbsApi* | **getOutletLicenses** | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*AbstractDbsApi* | **getOutlets** | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*AbstractDbsApi* | **getPrices** | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*AbstractDbsApi* | **getPricesByOfferIds** | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*AbstractDbsApi* | **getPromoOffers** | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*AbstractDbsApi* | **getPromos** | **POST** /businesses/{businessId}/promos | Получение списка акций
*AbstractDbsApi* | **getQualityRatingDetails** | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*AbstractDbsApi* | **getQualityRatings** | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*AbstractDbsApi* | **getReportInfo** | **GET** /reports/info/{reportId} | Получение заданного отчета
*AbstractDbsApi* | **getReturn** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*AbstractDbsApi* | **getReturnApplication** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*AbstractDbsApi* | **getReturnPhoto** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*AbstractDbsApi* | **getReturns** | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*AbstractDbsApi* | **getStocks** | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*AbstractDbsApi* | **getSuggestedOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*AbstractDbsApi* | **getSuggestedOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*AbstractDbsApi* | **getSuggestedPrices** | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*AbstractDbsApi* | **getWarehouses** | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*AbstractDbsApi* | **provideOrderDigitalCodes** | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*AbstractDbsApi* | **provideOrderItemIdentifiers** | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*AbstractDbsApi* | **putBidsForBusiness** | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*AbstractDbsApi* | **putBidsForCampaign** | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*AbstractDbsApi* | **refreshFeed** | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*AbstractDbsApi* | **searchRegionChildren** | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*AbstractDbsApi* | **searchRegionsById** | **GET** /regions/{regionId} | Информация о регионе
*AbstractDbsApi* | **sendFileToChat** | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*AbstractDbsApi* | **sendMessageToChat** | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*AbstractDbsApi* | **setFeedParams** | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*AbstractDbsApi* | **setOrderBoxLayout** | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*AbstractDbsApi* | **setOrderDeliveryDate** | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*AbstractDbsApi* | **setOrderDeliveryTrackCode** | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*AbstractDbsApi* | **setOrderShipmentBoxes** | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*AbstractDbsApi* | **setReturnDecision** | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*AbstractDbsApi* | **skipGoodsFeedbacksReaction** | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*AbstractDbsApi* | **submitReturnDecision** | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*AbstractDbsApi* | **updateBusinessPrices** | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*AbstractDbsApi* | **updateCampaignOffers** | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*AbstractDbsApi* | **updateGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*AbstractDbsApi* | **updateOfferContent** | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*AbstractDbsApi* | **updateOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*AbstractDbsApi* | **updateOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*AbstractDbsApi* | **updateOrderItems** | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*AbstractDbsApi* | **updateOrderStatus** | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*AbstractDbsApi* | **updateOrderStatuses** | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*AbstractDbsApi* | **updateOrderStorageLimit** | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*AbstractDbsApi* | **updateOutlet** | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*AbstractDbsApi* | **updateOutletLicenses** | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*AbstractDbsApi* | **updatePrices** | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*AbstractDbsApi* | **updatePromoOffers** | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*AbstractDbsApi* | **updateStocks** | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*AbstractDeliveryServicesApi* | **getDeliveryServices** | **GET** /delivery/services | Справочник служб доставки
*AbstractExpressApi* | **calculateTariffs** | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*AbstractExpressApi* | **generateBoostConsolidatedReport** | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*AbstractExpressApi* | **generateCompetitorsPositionReport** | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*AbstractExpressApi* | **generateGoodsFeedbackReport** | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*AbstractExpressApi* | **generateGoodsRealizationReport** | **POST** /reports/goods-realization/generate | Отчет по реализации
*AbstractExpressApi* | **generateMassOrderLabelsReport** | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*AbstractExpressApi* | **generatePricesReport** | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*AbstractExpressApi* | **generateShelfsStatisticsReport** | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*AbstractExpressApi* | **generateShowsSalesReport** | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*AbstractExpressApi* | **generateStocksOnWarehousesReport** | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*AbstractExpressApi* | **generateUnitedMarketplaceServicesReport** | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*AbstractExpressApi* | **generateUnitedNettingReport** | **POST** /reports/united-netting/generate | Отчет по платежам
*AbstractExpressApi* | **generateUnitedOrdersReport** | **POST** /reports/united-orders/generate | Отчет по заказам
*AbstractExpressApi* | **getCampaigns** | **GET** /campaigns | Список магазинов пользователя
*AbstractExpressApi* | **getCategoriesMaxSaleQuantum** | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*AbstractExpressApi* | **getCategoriesTree** | **POST** /categories/tree | Дерево категорий
*AbstractExpressApi* | **getDeliveryServices** | **GET** /delivery/services | Справочник служб доставки
*AbstractExpressApi* | **searchRegionsByName** | **GET** /regions | Поиск регионов по их имени
*AbstractExpressApi* | **addHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*AbstractExpressApi* | **addOffersToArchive** | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*AbstractExpressApi* | **confirmBusinessPrices** | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*AbstractExpressApi* | **confirmCampaignPrices** | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*AbstractExpressApi* | **createChat** | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*AbstractExpressApi* | **deleteCampaignOffers** | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*AbstractExpressApi* | **deleteGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*AbstractExpressApi* | **deleteHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*AbstractExpressApi* | **deleteOffers** | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*AbstractExpressApi* | **deleteOffersFromArchive** | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*AbstractExpressApi* | **deletePromoOffers** | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*AbstractExpressApi* | **generateOrderLabel** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*AbstractExpressApi* | **generateOrderLabels** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*AbstractExpressApi* | **getAllOffers** | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*AbstractExpressApi* | **getBidsInfoForBusiness** | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*AbstractExpressApi* | **getBidsRecommendations** | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*AbstractExpressApi* | **getBusinessQuarantineOffers** | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*AbstractExpressApi* | **getBusinessSettings** | **POST** /businesses/{businessId}/settings | Настройки кабинета
*AbstractExpressApi* | **getCampaign** | **GET** /campaigns/{campaignId} | Информация о магазине
*AbstractExpressApi* | **getCampaignLogins** | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*AbstractExpressApi* | **getCampaignOffers** | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*AbstractExpressApi* | **getCampaignQuarantineOffers** | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*AbstractExpressApi* | **getCampaignRegion** | **GET** /campaigns/{campaignId}/region | Регион магазина
*AbstractExpressApi* | **getCampaignSettings** | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*AbstractExpressApi* | **getCampaignsByLogin** | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*AbstractExpressApi* | **getCategoryContentParameters** | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*AbstractExpressApi* | **getChatHistory** | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*AbstractExpressApi* | **getChats** | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*AbstractExpressApi* | **getFeed** | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*AbstractExpressApi* | **getFeedIndexLogs** | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*AbstractExpressApi* | **getFeedbackAndCommentUpdates** | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*AbstractExpressApi* | **getFeeds** | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*AbstractExpressApi* | **getGoodsFeedbackComments** | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*AbstractExpressApi* | **getGoodsFeedbacks** | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*AbstractExpressApi* | **getGoodsStats** | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*AbstractExpressApi* | **getHiddenOffers** | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*AbstractExpressApi* | **getOfferCardsContentStatus** | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*AbstractExpressApi* | **getOfferMappingEntries** | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*AbstractExpressApi* | **getOfferMappings** | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*AbstractExpressApi* | **getOfferRecommendations** | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*AbstractExpressApi* | **getOffers** | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*AbstractExpressApi* | **getOrder** | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*AbstractExpressApi* | **getOrderBusinessBuyerInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*AbstractExpressApi* | **getOrderBusinessDocumentsInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*AbstractExpressApi* | **getOrderLabelsData** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*AbstractExpressApi* | **getOrders** | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*AbstractExpressApi* | **getOrdersStats** | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*AbstractExpressApi* | **getPrices** | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*AbstractExpressApi* | **getPricesByOfferIds** | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*AbstractExpressApi* | **getPromoOffers** | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*AbstractExpressApi* | **getPromos** | **POST** /businesses/{businessId}/promos | Получение списка акций
*AbstractExpressApi* | **getQualityRatingDetails** | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*AbstractExpressApi* | **getQualityRatings** | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*AbstractExpressApi* | **getReportInfo** | **GET** /reports/info/{reportId} | Получение заданного отчета
*AbstractExpressApi* | **getReturn** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*AbstractExpressApi* | **getReturnApplication** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*AbstractExpressApi* | **getReturnPhoto** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*AbstractExpressApi* | **getReturns** | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*AbstractExpressApi* | **getStocks** | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*AbstractExpressApi* | **getSuggestedOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*AbstractExpressApi* | **getSuggestedOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*AbstractExpressApi* | **getSuggestedPrices** | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*AbstractExpressApi* | **getWarehouses** | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*AbstractExpressApi* | **provideOrderItemIdentifiers** | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*AbstractExpressApi* | **putBidsForBusiness** | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*AbstractExpressApi* | **putBidsForCampaign** | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*AbstractExpressApi* | **refreshFeed** | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*AbstractExpressApi* | **searchRegionChildren** | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*AbstractExpressApi* | **searchRegionsById** | **GET** /regions/{regionId} | Информация о регионе
*AbstractExpressApi* | **sendFileToChat** | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*AbstractExpressApi* | **sendMessageToChat** | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*AbstractExpressApi* | **setFeedParams** | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*AbstractExpressApi* | **setOrderBoxLayout** | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*AbstractExpressApi* | **setOrderShipmentBoxes** | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*AbstractExpressApi* | **skipGoodsFeedbacksReaction** | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*AbstractExpressApi* | **updateBusinessPrices** | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*AbstractExpressApi* | **updateCampaignOffers** | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*AbstractExpressApi* | **updateGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*AbstractExpressApi* | **updateOfferContent** | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*AbstractExpressApi* | **updateOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*AbstractExpressApi* | **updateOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*AbstractExpressApi* | **updateOrderItems** | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*AbstractExpressApi* | **updateOrderStatus** | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*AbstractExpressApi* | **updateOrderStatuses** | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*AbstractExpressApi* | **updatePrices** | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*AbstractExpressApi* | **updatePromoOffers** | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*AbstractExpressApi* | **updateStocks** | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*AbstractExpressApi* | **verifyOrderEac** | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*AbstractFbsApi* | **calculateTariffs** | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*AbstractFbsApi* | **generateBoostConsolidatedReport** | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*AbstractFbsApi* | **generateCompetitorsPositionReport** | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*AbstractFbsApi* | **generateGoodsFeedbackReport** | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*AbstractFbsApi* | **generateGoodsRealizationReport** | **POST** /reports/goods-realization/generate | Отчет по реализации
*AbstractFbsApi* | **generateMassOrderLabelsReport** | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*AbstractFbsApi* | **generatePricesReport** | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*AbstractFbsApi* | **generateShelfsStatisticsReport** | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*AbstractFbsApi* | **generateShipmentListDocumentReport** | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*AbstractFbsApi* | **generateShowsSalesReport** | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*AbstractFbsApi* | **generateStocksOnWarehousesReport** | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*AbstractFbsApi* | **generateUnitedMarketplaceServicesReport** | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*AbstractFbsApi* | **generateUnitedNettingReport** | **POST** /reports/united-netting/generate | Отчет по платежам
*AbstractFbsApi* | **generateUnitedOrdersReport** | **POST** /reports/united-orders/generate | Отчет по заказам
*AbstractFbsApi* | **getCampaigns** | **GET** /campaigns | Список магазинов пользователя
*AbstractFbsApi* | **getCategoriesMaxSaleQuantum** | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*AbstractFbsApi* | **getCategoriesTree** | **POST** /categories/tree | Дерево категорий
*AbstractFbsApi* | **getDeliveryServices** | **GET** /delivery/services | Справочник служб доставки
*AbstractFbsApi* | **searchRegionsByName** | **GET** /regions | Поиск регионов по их имени
*AbstractFbsApi* | **addHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*AbstractFbsApi* | **addOffersToArchive** | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*AbstractFbsApi* | **confirmBusinessPrices** | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*AbstractFbsApi* | **confirmCampaignPrices** | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*AbstractFbsApi* | **confirmShipment** | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*AbstractFbsApi* | **createChat** | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*AbstractFbsApi* | **deleteCampaignOffers** | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*AbstractFbsApi* | **deleteGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*AbstractFbsApi* | **deleteHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*AbstractFbsApi* | **deleteOffers** | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*AbstractFbsApi* | **deleteOffersFromArchive** | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*AbstractFbsApi* | **deletePromoOffers** | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*AbstractFbsApi* | **downloadShipmentAct** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*AbstractFbsApi* | **downloadShipmentDiscrepancyAct** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*AbstractFbsApi* | **downloadShipmentInboundAct** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*AbstractFbsApi* | **downloadShipmentPalletLabels** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*AbstractFbsApi* | **downloadShipmentReceptionTransferAct** | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*AbstractFbsApi* | **downloadShipmentTransportationWaybill** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*AbstractFbsApi* | **generateOrderLabel** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*AbstractFbsApi* | **generateOrderLabels** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*AbstractFbsApi* | **getAllOffers** | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*AbstractFbsApi* | **getBidsInfoForBusiness** | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*AbstractFbsApi* | **getBidsRecommendations** | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*AbstractFbsApi* | **getBusinessQuarantineOffers** | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*AbstractFbsApi* | **getBusinessSettings** | **POST** /businesses/{businessId}/settings | Настройки кабинета
*AbstractFbsApi* | **getCampaign** | **GET** /campaigns/{campaignId} | Информация о магазине
*AbstractFbsApi* | **getCampaignLogins** | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*AbstractFbsApi* | **getCampaignOffers** | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*AbstractFbsApi* | **getCampaignQuarantineOffers** | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*AbstractFbsApi* | **getCampaignRegion** | **GET** /campaigns/{campaignId}/region | Регион магазина
*AbstractFbsApi* | **getCampaignSettings** | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*AbstractFbsApi* | **getCampaignsByLogin** | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*AbstractFbsApi* | **getCategoryContentParameters** | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*AbstractFbsApi* | **getChatHistory** | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*AbstractFbsApi* | **getChats** | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*AbstractFbsApi* | **getFeed** | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*AbstractFbsApi* | **getFeedIndexLogs** | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*AbstractFbsApi* | **getFeedbackAndCommentUpdates** | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*AbstractFbsApi* | **getFeeds** | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*AbstractFbsApi* | **getGoodsFeedbackComments** | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*AbstractFbsApi* | **getGoodsFeedbacks** | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*AbstractFbsApi* | **getGoodsStats** | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*AbstractFbsApi* | **getHiddenOffers** | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*AbstractFbsApi* | **getOfferCardsContentStatus** | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*AbstractFbsApi* | **getOfferMappingEntries** | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*AbstractFbsApi* | **getOfferMappings** | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*AbstractFbsApi* | **getOfferRecommendations** | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*AbstractFbsApi* | **getOffers** | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*AbstractFbsApi* | **getOrder** | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*AbstractFbsApi* | **getOrderBusinessBuyerInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*AbstractFbsApi* | **getOrderBusinessDocumentsInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*AbstractFbsApi* | **getOrderLabelsData** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*AbstractFbsApi* | **getOrders** | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*AbstractFbsApi* | **getOrdersStats** | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*AbstractFbsApi* | **getPrices** | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*AbstractFbsApi* | **getPricesByOfferIds** | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*AbstractFbsApi* | **getPromoOffers** | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*AbstractFbsApi* | **getPromos** | **POST** /businesses/{businessId}/promos | Получение списка акций
*AbstractFbsApi* | **getQualityRatingDetails** | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*AbstractFbsApi* | **getQualityRatings** | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*AbstractFbsApi* | **getReportInfo** | **GET** /reports/info/{reportId} | Получение заданного отчета
*AbstractFbsApi* | **getReturn** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*AbstractFbsApi* | **getReturnApplication** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*AbstractFbsApi* | **getReturnPhoto** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*AbstractFbsApi* | **getReturns** | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*AbstractFbsApi* | **getShipment** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*AbstractFbsApi* | **getShipmentOrdersInfo** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*AbstractFbsApi* | **getStocks** | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*AbstractFbsApi* | **getSuggestedOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*AbstractFbsApi* | **getSuggestedOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*AbstractFbsApi* | **getSuggestedPrices** | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*AbstractFbsApi* | **getWarehouses** | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*AbstractFbsApi* | **provideOrderItemIdentifiers** | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*AbstractFbsApi* | **putBidsForBusiness** | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*AbstractFbsApi* | **putBidsForCampaign** | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*AbstractFbsApi* | **refreshFeed** | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*AbstractFbsApi* | **searchRegionChildren** | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*AbstractFbsApi* | **searchRegionsById** | **GET** /regions/{regionId} | Информация о регионе
*AbstractFbsApi* | **searchShipments** | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*AbstractFbsApi* | **sendFileToChat** | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*AbstractFbsApi* | **sendMessageToChat** | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*AbstractFbsApi* | **setFeedParams** | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*AbstractFbsApi* | **setOrderBoxLayout** | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*AbstractFbsApi* | **setOrderShipmentBoxes** | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*AbstractFbsApi* | **setShipmentPalletsCount** | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*AbstractFbsApi* | **skipGoodsFeedbacksReaction** | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*AbstractFbsApi* | **transferOrdersFromShipment** | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*AbstractFbsApi* | **updateBusinessPrices** | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*AbstractFbsApi* | **updateCampaignOffers** | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*AbstractFbsApi* | **updateGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*AbstractFbsApi* | **updateOfferContent** | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*AbstractFbsApi* | **updateOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*AbstractFbsApi* | **updateOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*AbstractFbsApi* | **updateOrderItems** | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*AbstractFbsApi* | **updateOrderStatus** | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*AbstractFbsApi* | **updateOrderStatuses** | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*AbstractFbsApi* | **updatePrices** | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*AbstractFbsApi* | **updatePromoOffers** | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*AbstractFbsApi* | **updateStocks** | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*AbstractFbyApi* | **calculateTariffs** | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*AbstractFbyApi* | **generateBoostConsolidatedReport** | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*AbstractFbyApi* | **generateCompetitorsPositionReport** | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*AbstractFbyApi* | **generateGoodsFeedbackReport** | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*AbstractFbyApi* | **generateGoodsMovementReport** | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*AbstractFbyApi* | **generateGoodsRealizationReport** | **POST** /reports/goods-realization/generate | Отчет по реализации
*AbstractFbyApi* | **generateGoodsTurnoverReport** | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*AbstractFbyApi* | **generatePricesReport** | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*AbstractFbyApi* | **generateShelfsStatisticsReport** | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*AbstractFbyApi* | **generateShowsSalesReport** | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*AbstractFbyApi* | **generateStocksOnWarehousesReport** | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*AbstractFbyApi* | **generateUnitedMarketplaceServicesReport** | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*AbstractFbyApi* | **generateUnitedNettingReport** | **POST** /reports/united-netting/generate | Отчет по платежам
*AbstractFbyApi* | **generateUnitedOrdersReport** | **POST** /reports/united-orders/generate | Отчет по заказам
*AbstractFbyApi* | **getCampaigns** | **GET** /campaigns | Список магазинов пользователя
*AbstractFbyApi* | **getCategoriesMaxSaleQuantum** | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*AbstractFbyApi* | **getCategoriesTree** | **POST** /categories/tree | Дерево категорий
*AbstractFbyApi* | **getFulfillmentWarehouses** | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*AbstractFbyApi* | **searchRegionsByName** | **GET** /regions | Поиск регионов по их имени
*AbstractFbyApi* | **addHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*AbstractFbyApi* | **addOffersToArchive** | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*AbstractFbyApi* | **confirmBusinessPrices** | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*AbstractFbyApi* | **confirmCampaignPrices** | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*AbstractFbyApi* | **createChat** | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*AbstractFbyApi* | **deleteCampaignOffers** | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*AbstractFbyApi* | **deleteGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*AbstractFbyApi* | **deleteHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*AbstractFbyApi* | **deleteOffers** | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*AbstractFbyApi* | **deleteOffersFromArchive** | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*AbstractFbyApi* | **deletePromoOffers** | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*AbstractFbyApi* | **getAllOffers** | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*AbstractFbyApi* | **getBidsInfoForBusiness** | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*AbstractFbyApi* | **getBidsRecommendations** | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*AbstractFbyApi* | **getBusinessQuarantineOffers** | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*AbstractFbyApi* | **getBusinessSettings** | **POST** /businesses/{businessId}/settings | Настройки кабинета
*AbstractFbyApi* | **getCampaign** | **GET** /campaigns/{campaignId} | Информация о магазине
*AbstractFbyApi* | **getCampaignLogins** | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*AbstractFbyApi* | **getCampaignOffers** | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*AbstractFbyApi* | **getCampaignQuarantineOffers** | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*AbstractFbyApi* | **getCampaignRegion** | **GET** /campaigns/{campaignId}/region | Регион магазина
*AbstractFbyApi* | **getCampaignSettings** | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*AbstractFbyApi* | **getCampaignsByLogin** | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*AbstractFbyApi* | **getCategoryContentParameters** | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*AbstractFbyApi* | **getChatHistory** | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*AbstractFbyApi* | **getChats** | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*AbstractFbyApi* | **getFeed** | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*AbstractFbyApi* | **getFeedIndexLogs** | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*AbstractFbyApi* | **getFeedbackAndCommentUpdates** | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*AbstractFbyApi* | **getFeeds** | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*AbstractFbyApi* | **getGoodsFeedbackComments** | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*AbstractFbyApi* | **getGoodsFeedbacks** | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*AbstractFbyApi* | **getGoodsStats** | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*AbstractFbyApi* | **getHiddenOffers** | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*AbstractFbyApi* | **getOfferCardsContentStatus** | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*AbstractFbyApi* | **getOfferMappingEntries** | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*AbstractFbyApi* | **getOfferMappings** | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*AbstractFbyApi* | **getOfferRecommendations** | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*AbstractFbyApi* | **getOffers** | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*AbstractFbyApi* | **getOrder** | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*AbstractFbyApi* | **getOrderBusinessBuyerInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*AbstractFbyApi* | **getOrderBusinessDocumentsInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*AbstractFbyApi* | **getOrders** | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*AbstractFbyApi* | **getOrdersStats** | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*AbstractFbyApi* | **getPrices** | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*AbstractFbyApi* | **getPricesByOfferIds** | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*AbstractFbyApi* | **getPromoOffers** | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*AbstractFbyApi* | **getPromos** | **POST** /businesses/{businessId}/promos | Получение списка акций
*AbstractFbyApi* | **getQualityRatings** | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*AbstractFbyApi* | **getReportInfo** | **GET** /reports/info/{reportId} | Получение заданного отчета
*AbstractFbyApi* | **getReturn** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*AbstractFbyApi* | **getReturnPhoto** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*AbstractFbyApi* | **getReturns** | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*AbstractFbyApi* | **getStocks** | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*AbstractFbyApi* | **getSuggestedOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*AbstractFbyApi* | **getSuggestedOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*AbstractFbyApi* | **getSuggestedPrices** | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*AbstractFbyApi* | **putBidsForBusiness** | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*AbstractFbyApi* | **putBidsForCampaign** | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*AbstractFbyApi* | **refreshFeed** | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*AbstractFbyApi* | **searchRegionChildren** | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*AbstractFbyApi* | **searchRegionsById** | **GET** /regions/{regionId} | Информация о регионе
*AbstractFbyApi* | **sendFileToChat** | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*AbstractFbyApi* | **sendMessageToChat** | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*AbstractFbyApi* | **setFeedParams** | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*AbstractFbyApi* | **skipGoodsFeedbacksReaction** | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*AbstractFbyApi* | **updateBusinessPrices** | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*AbstractFbyApi* | **updateCampaignOffers** | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*AbstractFbyApi* | **updateGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*AbstractFbyApi* | **updateOfferContent** | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*AbstractFbyApi* | **updateOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*AbstractFbyApi* | **updateOfferMappings** | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*AbstractFbyApi* | **updatePrices** | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*AbstractFbyApi* | **updatePromoOffers** | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*AbstractFeedbacksApi* | **getFeedbackAndCommentUpdates** | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*AbstractFeedsApi* | **getFeed** | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*AbstractFeedsApi* | **getFeedIndexLogs** | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*AbstractFeedsApi* | **getFeeds** | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*AbstractFeedsApi* | **refreshFeed** | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*AbstractFeedsApi* | **setFeedParams** | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*AbstractGoodsFeedbackApi* | **deleteGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*AbstractGoodsFeedbackApi* | **getGoodsFeedbackComments** | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*AbstractGoodsFeedbackApi* | **getGoodsFeedbacks** | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*AbstractGoodsFeedbackApi* | **skipGoodsFeedbacksReaction** | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*AbstractGoodsFeedbackApi* | **updateGoodsFeedbackComment** | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*AbstractGoodsStatsApi* | **getGoodsStats** | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*AbstractHiddenOffersApi* | **addHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*AbstractHiddenOffersApi* | **deleteHiddenOffers** | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*AbstractHiddenOffersApi* | **getHiddenOffers** | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*AbstractModelsApi* | **getModels** | **POST** /models | Информация о нескольких моделях
*AbstractModelsApi* | **getModelsOffers** | **POST** /models/offers | Список предложений для нескольких моделей
*AbstractModelsApi* | **searchModels** | **GET** /models | Поиск модели товара
*AbstractModelsApi* | **getModel** | **GET** /models/{modelId} | Информация об одной модели
*AbstractModelsApi* | **getModelOffers** | **GET** /models/{modelId}/offers | Список предложений для одной модели
*AbstractOfferMappingsApi* | **getOfferMappingEntries** | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*AbstractOfferMappingsApi* | **getSuggestedOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*AbstractOfferMappingsApi* | **updateOfferMappingEntries** | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*AbstractOffersApi* | **deleteCampaignOffers** | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*AbstractOffersApi* | **getAllOffers** | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*AbstractOffersApi* | **getCampaignOffers** | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*AbstractOffersApi* | **getOfferRecommendations** | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*AbstractOffersApi* | **getOffers** | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*AbstractOffersApi* | **updateCampaignOffers** | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*AbstractOrderBusinessInformationApi* | **getOrderBusinessBuyerInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*AbstractOrderBusinessInformationApi* | **getOrderBusinessDocumentsInfo** | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*AbstractOrderDeliveryApi* | **getOrderBuyerInfo** | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*AbstractOrderDeliveryApi* | **setOrderDeliveryDate** | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*AbstractOrderDeliveryApi* | **setOrderDeliveryTrackCode** | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*AbstractOrderDeliveryApi* | **updateOrderStorageLimit** | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*AbstractOrderDeliveryApi* | **verifyOrderEac** | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*AbstractOrderLabelsApi* | **generateOrderLabel** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*AbstractOrderLabelsApi* | **generateOrderLabels** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*AbstractOrderLabelsApi* | **getOrderLabelsData** | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*AbstractOrdersApi* | **acceptOrderCancellation** | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*AbstractOrdersApi* | **getOrder** | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*AbstractOrdersApi* | **getOrders** | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*AbstractOrdersApi* | **provideOrderDigitalCodes** | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*AbstractOrdersApi* | **provideOrderItemIdentifiers** | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*AbstractOrdersApi* | **setOrderBoxLayout** | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*AbstractOrdersApi* | **setOrderShipmentBoxes** | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*AbstractOrdersApi* | **updateOrderItems** | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*AbstractOrdersApi* | **updateOrderStatus** | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*AbstractOrdersApi* | **updateOrderStatuses** | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*AbstractOrdersStatsApi* | **getOrdersStats** | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*AbstractOutletLicensesApi* | **deleteOutletLicenses** | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*AbstractOutletLicensesApi* | **getOutletLicenses** | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*AbstractOutletLicensesApi* | **updateOutletLicenses** | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*AbstractOutletsApi* | **createOutlet** | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*AbstractOutletsApi* | **deleteOutlet** | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*AbstractOutletsApi* | **getOutlet** | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*AbstractOutletsApi* | **getOutlets** | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*AbstractOutletsApi* | **updateOutlet** | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*AbstractPriceQuarantineApi* | **confirmBusinessPrices** | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*AbstractPriceQuarantineApi* | **confirmCampaignPrices** | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*AbstractPriceQuarantineApi* | **getBusinessQuarantineOffers** | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*AbstractPriceQuarantineApi* | **getCampaignQuarantineOffers** | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*AbstractPricesApi* | **getPrices** | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*AbstractPricesApi* | **getPricesByOfferIds** | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*AbstractPricesApi* | **getSuggestedPrices** | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*AbstractPricesApi* | **updateBusinessPrices** | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*AbstractPricesApi* | **updatePrices** | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*AbstractPromosApi* | **deletePromoOffers** | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*AbstractPromosApi* | **getPromoOffers** | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*AbstractPromosApi* | **getPromos** | **POST** /businesses/{businessId}/promos | Получение списка акций
*AbstractPromosApi* | **updatePromoOffers** | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*AbstractRatingsApi* | **getQualityRatingDetails** | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*AbstractRatingsApi* | **getQualityRatings** | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*AbstractRegionsApi* | **searchRegionsByName** | **GET** /regions | Поиск регионов по их имени
*AbstractRegionsApi* | **searchRegionChildren** | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*AbstractRegionsApi* | **searchRegionsById** | **GET** /regions/{regionId} | Информация о регионе
*AbstractReportsApi* | **generateBoostConsolidatedReport** | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*AbstractReportsApi* | **generateCompetitorsPositionReport** | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*AbstractReportsApi* | **generateGoodsFeedbackReport** | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*AbstractReportsApi* | **generateGoodsMovementReport** | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*AbstractReportsApi* | **generateGoodsRealizationReport** | **POST** /reports/goods-realization/generate | Отчет по реализации
*AbstractReportsApi* | **generateGoodsTurnoverReport** | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*AbstractReportsApi* | **generateMassOrderLabelsReport** | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*AbstractReportsApi* | **generatePricesReport** | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*AbstractReportsApi* | **generateShelfsStatisticsReport** | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*AbstractReportsApi* | **generateShipmentListDocumentReport** | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*AbstractReportsApi* | **generateShowsSalesReport** | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*AbstractReportsApi* | **generateStocksOnWarehousesReport** | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*AbstractReportsApi* | **generateUnitedMarketplaceServicesReport** | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*AbstractReportsApi* | **generateUnitedNettingReport** | **POST** /reports/united-netting/generate | Отчет по платежам
*AbstractReportsApi* | **generateUnitedOrdersReport** | **POST** /reports/united-orders/generate | Отчет по заказам
*AbstractReportsApi* | **getReportInfo** | **GET** /reports/info/{reportId} | Получение заданного отчета
*AbstractReturnsApi* | **getReturn** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*AbstractReturnsApi* | **getReturnApplication** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*AbstractReturnsApi* | **getReturnPhoto** | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*AbstractReturnsApi* | **getReturns** | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*AbstractReturnsApi* | **setReturnDecision** | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*AbstractReturnsApi* | **submitReturnDecision** | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*AbstractShipmentsApi* | **confirmShipment** | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*AbstractShipmentsApi* | **downloadShipmentAct** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*AbstractShipmentsApi* | **downloadShipmentDiscrepancyAct** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*AbstractShipmentsApi* | **downloadShipmentInboundAct** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*AbstractShipmentsApi* | **downloadShipmentPalletLabels** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*AbstractShipmentsApi* | **downloadShipmentReceptionTransferAct** | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*AbstractShipmentsApi* | **downloadShipmentTransportationWaybill** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*AbstractShipmentsApi* | **getShipment** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*AbstractShipmentsApi* | **getShipmentOrdersInfo** | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*AbstractShipmentsApi* | **searchShipments** | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*AbstractShipmentsApi* | **setShipmentPalletsCount** | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*AbstractShipmentsApi* | **transferOrdersFromShipment** | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*AbstractStocksApi* | **getStocks** | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*AbstractStocksApi* | **updateStocks** | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*AbstractTariffsApi* | **calculateTariffs** | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*AbstractWarehousesApi* | **getFulfillmentWarehouses** | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*AbstractWarehousesApi* | **getWarehouses** | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


## Models

* OpenAPIServer\Model\AcceptOrderCancellationRequest
* OpenAPIServer\Model\AddHiddenOffersRequest
* OpenAPIServer\Model\AddOffersToArchiveDTO
* OpenAPIServer\Model\AddOffersToArchiveErrorDTO
* OpenAPIServer\Model\AddOffersToArchiveErrorType
* OpenAPIServer\Model\AddOffersToArchiveRequest
* OpenAPIServer\Model\AddOffersToArchiveResponse
* OpenAPIServer\Model\AffectedOrderQualityRatingComponentType
* OpenAPIServer\Model\AgeDTO
* OpenAPIServer\Model\AgeUnitType
* OpenAPIServer\Model\ApiClientDataErrorResponse
* OpenAPIServer\Model\ApiErrorDTO
* OpenAPIServer\Model\ApiErrorResponse
* OpenAPIServer\Model\ApiForbiddenErrorResponse
* OpenAPIServer\Model\ApiLimitErrorResponse
* OpenAPIServer\Model\ApiLockedErrorResponse
* OpenAPIServer\Model\ApiNotFoundErrorResponse
* OpenAPIServer\Model\ApiResponse
* OpenAPIServer\Model\ApiResponseStatusType
* OpenAPIServer\Model\ApiServerErrorResponse
* OpenAPIServer\Model\ApiUnauthorizedErrorResponse
* OpenAPIServer\Model\BaseCampaignOfferDTO
* OpenAPIServer\Model\BaseOfferDTO
* OpenAPIServer\Model\BasePriceDTO
* OpenAPIServer\Model\BaseShipmentDTO
* OpenAPIServer\Model\BidRecommendationItemDTO
* OpenAPIServer\Model\BriefOrderItemDTO
* OpenAPIServer\Model\BriefOrderItemInstanceDTO
* OpenAPIServer\Model\BusinessDTO
* OpenAPIServer\Model\BusinessSettingsDTO
* OpenAPIServer\Model\CalculateTariffsOfferDTO
* OpenAPIServer\Model\CalculateTariffsOfferInfoDTO
* OpenAPIServer\Model\CalculateTariffsParametersDTO
* OpenAPIServer\Model\CalculateTariffsRequest
* OpenAPIServer\Model\CalculateTariffsResponse
* OpenAPIServer\Model\CalculateTariffsResponseDTO
* OpenAPIServer\Model\CalculatedTariffDTO
* OpenAPIServer\Model\CalculatedTariffType
* OpenAPIServer\Model\CampaignDTO
* OpenAPIServer\Model\CampaignQualityRatingDTO
* OpenAPIServer\Model\CampaignSettingsDTO
* OpenAPIServer\Model\CampaignSettingsDeliveryDTO
* OpenAPIServer\Model\CampaignSettingsLocalRegionDTO
* OpenAPIServer\Model\CampaignSettingsScheduleDTO
* OpenAPIServer\Model\CampaignSettingsScheduleSourceType
* OpenAPIServer\Model\CampaignSettingsTimePeriodDTO
* OpenAPIServer\Model\CampaignsQualityRatingDTO
* OpenAPIServer\Model\CategoryContentParametersDTO
* OpenAPIServer\Model\CategoryDTO
* OpenAPIServer\Model\CategoryErrorDTO
* OpenAPIServer\Model\CategoryErrorType
* OpenAPIServer\Model\CategoryParameterDTO
* OpenAPIServer\Model\CategoryParameterUnitDTO
* OpenAPIServer\Model\ChangeOutletRequest
* OpenAPIServer\Model\ChannelType
* OpenAPIServer\Model\ChatMessageDTO
* OpenAPIServer\Model\ChatMessagePayloadDTO
* OpenAPIServer\Model\ChatMessageSenderType
* OpenAPIServer\Model\ChatMessagesResultDTO
* OpenAPIServer\Model\ChatStatusType
* OpenAPIServer\Model\ChatType
* OpenAPIServer\Model\ConfirmPricesRequest
* OpenAPIServer\Model\ConfirmShipmentRequest
* OpenAPIServer\Model\CreateChatRequest
* OpenAPIServer\Model\CreateChatResponse
* OpenAPIServer\Model\CreateChatResultDTO
* OpenAPIServer\Model\CreateOutletResponse
* OpenAPIServer\Model\CurrencyType
* OpenAPIServer\Model\DayOfWeekType
* OpenAPIServer\Model\DeleteCampaignOffersDTO
* OpenAPIServer\Model\DeleteCampaignOffersRequest
* OpenAPIServer\Model\DeleteCampaignOffersResponse
* OpenAPIServer\Model\DeleteGoodsFeedbackCommentRequest
* OpenAPIServer\Model\DeleteHiddenOffersRequest
* OpenAPIServer\Model\DeleteOffersDTO
* OpenAPIServer\Model\DeleteOffersFromArchiveDTO
* OpenAPIServer\Model\DeleteOffersFromArchiveRequest
* OpenAPIServer\Model\DeleteOffersFromArchiveResponse
* OpenAPIServer\Model\DeleteOffersRequest
* OpenAPIServer\Model\DeleteOffersResponse
* OpenAPIServer\Model\DeletePromoOffersRequest
* OpenAPIServer\Model\DeletePromoOffersResponse
* OpenAPIServer\Model\DeletePromoOffersResultDTO
* OpenAPIServer\Model\DeliveryServiceDTO
* OpenAPIServer\Model\DeliveryServiceInfoDTO
* OpenAPIServer\Model\DeliveryServicesDTO
* OpenAPIServer\Model\DocumentDTO
* OpenAPIServer\Model\EacVerificationResultDTO
* OpenAPIServer\Model\EacVerificationStatusType
* OpenAPIServer\Model\EmptyApiResponse
* OpenAPIServer\Model\EnrichedMappingsOfferDTO
* OpenAPIServer\Model\EnrichedModelDTO
* OpenAPIServer\Model\EnrichedModelsDTO
* OpenAPIServer\Model\EnrichedOrderBoxLayoutDTO
* OpenAPIServer\Model\ExtensionShipmentDTO
* OpenAPIServer\Model\FeedContentDTO
* OpenAPIServer\Model\FeedContentErrorDTO
* OpenAPIServer\Model\FeedContentErrorType
* OpenAPIServer\Model\FeedDTO
* OpenAPIServer\Model\FeedDownloadDTO
* OpenAPIServer\Model\FeedDownloadErrorDTO
* OpenAPIServer\Model\FeedDownloadErrorType
* OpenAPIServer\Model\FeedIndexLogsErrorDTO
* OpenAPIServer\Model\FeedIndexLogsErrorType
* OpenAPIServer\Model\FeedIndexLogsFeedDTO
* OpenAPIServer\Model\FeedIndexLogsIndexType
* OpenAPIServer\Model\FeedIndexLogsOffersDTO
* OpenAPIServer\Model\FeedIndexLogsRecordDTO
* OpenAPIServer\Model\FeedIndexLogsResultDTO
* OpenAPIServer\Model\FeedIndexLogsStatusType
* OpenAPIServer\Model\FeedParameterDTO
* OpenAPIServer\Model\FeedPlacementDTO
* OpenAPIServer\Model\FeedPublicationDTO
* OpenAPIServer\Model\FeedPublicationFullDTO
* OpenAPIServer\Model\FeedPublicationPriceAndStockUpdateDTO
* OpenAPIServer\Model\FeedStatusType
* OpenAPIServer\Model\FeedbackAuthorDTO
* OpenAPIServer\Model\FeedbackCommentAuthorDTO
* OpenAPIServer\Model\FeedbackCommentAuthorType
* OpenAPIServer\Model\FeedbackCommentDTO
* OpenAPIServer\Model\FeedbackDTO
* OpenAPIServer\Model\FeedbackDeliveryType
* OpenAPIServer\Model\FeedbackFactorDTO
* OpenAPIServer\Model\FeedbackGradesDTO
* OpenAPIServer\Model\FeedbackListDTO
* OpenAPIServer\Model\FeedbackOrderDTO
* OpenAPIServer\Model\FeedbackReactionStatusType
* OpenAPIServer\Model\FeedbackShopDTO
* OpenAPIServer\Model\FeedbackStateType
* OpenAPIServer\Model\FieldStateType
* OpenAPIServer\Model\FlippingPagerDTO
* OpenAPIServer\Model\ForwardScrollingPagerDTO
* OpenAPIServer\Model\FulfillmentWarehouseDTO
* OpenAPIServer\Model\FulfillmentWarehousesDTO
* OpenAPIServer\Model\FullOutletDTO
* OpenAPIServer\Model\FullOutletLicenseDTO
* OpenAPIServer\Model\GenerateBoostConsolidatedRequest
* OpenAPIServer\Model\GenerateCompetitorsPositionReportRequest
* OpenAPIServer\Model\GenerateGoodsFeedbackRequest
* OpenAPIServer\Model\GenerateGoodsMovementReportRequest
* OpenAPIServer\Model\GenerateGoodsRealizationReportRequest
* OpenAPIServer\Model\GenerateGoodsTurnoverRequest
* OpenAPIServer\Model\GenerateMassOrderLabelsRequest
* OpenAPIServer\Model\GeneratePricesReportRequest
* OpenAPIServer\Model\GenerateReportDTO
* OpenAPIServer\Model\GenerateReportResponse
* OpenAPIServer\Model\GenerateShelfsStatisticsRequest
* OpenAPIServer\Model\GenerateShipmentListDocumentReportRequest
* OpenAPIServer\Model\GenerateShowsSalesReportRequest
* OpenAPIServer\Model\GenerateStocksOnWarehousesReportRequest
* OpenAPIServer\Model\GenerateUnitedMarketplaceServicesReportRequest
* OpenAPIServer\Model\GenerateUnitedNettingReportRequest
* OpenAPIServer\Model\GenerateUnitedOrdersRequest
* OpenAPIServer\Model\GetAllOffersResponse
* OpenAPIServer\Model\GetBidsInfoRequest
* OpenAPIServer\Model\GetBidsInfoResponse
* OpenAPIServer\Model\GetBidsInfoResponseDTO
* OpenAPIServer\Model\GetBidsRecommendationsRequest
* OpenAPIServer\Model\GetBidsRecommendationsResponse
* OpenAPIServer\Model\GetBidsRecommendationsResponseDTO
* OpenAPIServer\Model\GetBusinessBuyerInfoResponse
* OpenAPIServer\Model\GetBusinessDocumentsInfoResponse
* OpenAPIServer\Model\GetBusinessSettingsInfoDTO
* OpenAPIServer\Model\GetBusinessSettingsResponse
* OpenAPIServer\Model\GetCampaignLoginsResponse
* OpenAPIServer\Model\GetCampaignOfferDTO
* OpenAPIServer\Model\GetCampaignOffersRequest
* OpenAPIServer\Model\GetCampaignOffersResponse
* OpenAPIServer\Model\GetCampaignOffersResultDTO
* OpenAPIServer\Model\GetCampaignRegionResponse
* OpenAPIServer\Model\GetCampaignResponse
* OpenAPIServer\Model\GetCampaignSettingsResponse
* OpenAPIServer\Model\GetCampaignsResponse
* OpenAPIServer\Model\GetCategoriesMaxSaleQuantumDTO
* OpenAPIServer\Model\GetCategoriesMaxSaleQuantumRequest
* OpenAPIServer\Model\GetCategoriesMaxSaleQuantumResponse
* OpenAPIServer\Model\GetCategoriesRequest
* OpenAPIServer\Model\GetCategoriesResponse
* OpenAPIServer\Model\GetCategoryContentParametersResponse
* OpenAPIServer\Model\GetChatHistoryRequest
* OpenAPIServer\Model\GetChatHistoryResponse
* OpenAPIServer\Model\GetChatInfoDTO
* OpenAPIServer\Model\GetChatsInfoDTO
* OpenAPIServer\Model\GetChatsRequest
* OpenAPIServer\Model\GetChatsResponse
* OpenAPIServer\Model\GetDeliveryServicesResponse
* OpenAPIServer\Model\GetFeedIndexLogsResponse
* OpenAPIServer\Model\GetFeedResponse
* OpenAPIServer\Model\GetFeedbackListResponse
* OpenAPIServer\Model\GetFeedsResponse
* OpenAPIServer\Model\GetFulfillmentWarehousesResponse
* OpenAPIServer\Model\GetGoodsFeedbackCommentsRequest
* OpenAPIServer\Model\GetGoodsFeedbackCommentsResponse
* OpenAPIServer\Model\GetGoodsFeedbackRequest
* OpenAPIServer\Model\GetGoodsFeedbackResponse
* OpenAPIServer\Model\GetGoodsStatsRequest
* OpenAPIServer\Model\GetGoodsStatsResponse
* OpenAPIServer\Model\GetHiddenOffersResponse
* OpenAPIServer\Model\GetHiddenOffersResultDTO
* OpenAPIServer\Model\GetMappingDTO
* OpenAPIServer\Model\GetModelsOffersResponse
* OpenAPIServer\Model\GetModelsRequest
* OpenAPIServer\Model\GetModelsResponse
* OpenAPIServer\Model\GetOfferCardsContentStatusRequest
* OpenAPIServer\Model\GetOfferCardsContentStatusResponse
* OpenAPIServer\Model\GetOfferDTO
* OpenAPIServer\Model\GetOfferMappingDTO
* OpenAPIServer\Model\GetOfferMappingEntriesResponse
* OpenAPIServer\Model\GetOfferMappingsRequest
* OpenAPIServer\Model\GetOfferMappingsResponse
* OpenAPIServer\Model\GetOfferMappingsResultDTO
* OpenAPIServer\Model\GetOfferRecommendationsRequest
* OpenAPIServer\Model\GetOfferRecommendationsResponse
* OpenAPIServer\Model\GetOffersResponse
* OpenAPIServer\Model\GetOrderBuyerInfoResponse
* OpenAPIServer\Model\GetOrderLabelsDataResponse
* OpenAPIServer\Model\GetOrderResponse
* OpenAPIServer\Model\GetOrdersResponse
* OpenAPIServer\Model\GetOrdersStatsRequest
* OpenAPIServer\Model\GetOrdersStatsResponse
* OpenAPIServer\Model\GetOutletLicensesResponse
* OpenAPIServer\Model\GetOutletResponse
* OpenAPIServer\Model\GetOutletsResponse
* OpenAPIServer\Model\GetPriceDTO
* OpenAPIServer\Model\GetPriceWithDiscountDTO
* OpenAPIServer\Model\GetPriceWithVatDTO
* OpenAPIServer\Model\GetPricesByOfferIdsRequest
* OpenAPIServer\Model\GetPricesByOfferIdsResponse
* OpenAPIServer\Model\GetPricesResponse
* OpenAPIServer\Model\GetPromoAssortmentInfoDTO
* OpenAPIServer\Model\GetPromoBestsellerInfoDTO
* OpenAPIServer\Model\GetPromoConstraintsDTO
* OpenAPIServer\Model\GetPromoDTO
* OpenAPIServer\Model\GetPromoMechanicsInfoDTO
* OpenAPIServer\Model\GetPromoOfferDTO
* OpenAPIServer\Model\GetPromoOffersRequest
* OpenAPIServer\Model\GetPromoOffersResponse
* OpenAPIServer\Model\GetPromoOffersResultDTO
* OpenAPIServer\Model\GetPromoPromocodeInfoDTO
* OpenAPIServer\Model\GetPromosRequest
* OpenAPIServer\Model\GetPromosResponse
* OpenAPIServer\Model\GetPromosResultDTO
* OpenAPIServer\Model\GetQualityRatingDetailsResponse
* OpenAPIServer\Model\GetQualityRatingRequest
* OpenAPIServer\Model\GetQualityRatingResponse
* OpenAPIServer\Model\GetQuarantineOffersRequest
* OpenAPIServer\Model\GetQuarantineOffersResponse
* OpenAPIServer\Model\GetQuarantineOffersResultDTO
* OpenAPIServer\Model\GetRegionWithChildrenResponse
* OpenAPIServer\Model\GetRegionsResponse
* OpenAPIServer\Model\GetReportInfoResponse
* OpenAPIServer\Model\GetReturnResponse
* OpenAPIServer\Model\GetReturnsResponse
* OpenAPIServer\Model\GetShipmentOrdersInfoResponse
* OpenAPIServer\Model\GetShipmentResponse
* OpenAPIServer\Model\GetSuggestedOfferMappingEntriesRequest
* OpenAPIServer\Model\GetSuggestedOfferMappingEntriesResponse
* OpenAPIServer\Model\GetSuggestedOfferMappingsRequest
* OpenAPIServer\Model\GetSuggestedOfferMappingsResponse
* OpenAPIServer\Model\GetSuggestedOfferMappingsResultDTO
* OpenAPIServer\Model\GetWarehouseStocksDTO
* OpenAPIServer\Model\GetWarehouseStocksRequest
* OpenAPIServer\Model\GetWarehouseStocksResponse
* OpenAPIServer\Model\GetWarehousesResponse
* OpenAPIServer\Model\GoodsFeedbackCommentAuthorDTO
* OpenAPIServer\Model\GoodsFeedbackCommentAuthorType
* OpenAPIServer\Model\GoodsFeedbackCommentDTO
* OpenAPIServer\Model\GoodsFeedbackCommentListDTO
* OpenAPIServer\Model\GoodsFeedbackCommentStatusType
* OpenAPIServer\Model\GoodsFeedbackDTO
* OpenAPIServer\Model\GoodsFeedbackDescriptionDTO
* OpenAPIServer\Model\GoodsFeedbackIdentifiersDTO
* OpenAPIServer\Model\GoodsFeedbackListDTO
* OpenAPIServer\Model\GoodsFeedbackMediaDTO
* OpenAPIServer\Model\GoodsFeedbackStatisticsDTO
* OpenAPIServer\Model\GoodsStatsDTO
* OpenAPIServer\Model\GoodsStatsGoodsDTO
* OpenAPIServer\Model\GoodsStatsWarehouseDTO
* OpenAPIServer\Model\GoodsStatsWeightDimensionsDTO
* OpenAPIServer\Model\GpsDTO
* OpenAPIServer\Model\HiddenOfferDTO
* OpenAPIServer\Model\LanguageType
* OpenAPIServer\Model\LicenseCheckStatusType
* OpenAPIServer\Model\LicenseType
* OpenAPIServer\Model\LogisticPickupPointDTO
* OpenAPIServer\Model\LogisticPointType
* OpenAPIServer\Model\MappingsOfferDTO
* OpenAPIServer\Model\MappingsOfferInfoDTO
* OpenAPIServer\Model\MaxSaleQuantumDTO
* OpenAPIServer\Model\MechanicsType
* OpenAPIServer\Model\ModelDTO
* OpenAPIServer\Model\ModelOfferDTO
* OpenAPIServer\Model\ModelPriceDTO
* OpenAPIServer\Model\ModelsDTO
* OpenAPIServer\Model\OfferAvailabilityStatusType
* OpenAPIServer\Model\OfferCampaignStatusDTO
* OpenAPIServer\Model\OfferCampaignStatusType
* OpenAPIServer\Model\OfferCardDTO
* OpenAPIServer\Model\OfferCardRecommendationDTO
* OpenAPIServer\Model\OfferCardRecommendationType
* OpenAPIServer\Model\OfferCardStatusType
* OpenAPIServer\Model\OfferCardsContentStatusDTO
* OpenAPIServer\Model\OfferConditionDTO
* OpenAPIServer\Model\OfferConditionQualityType
* OpenAPIServer\Model\OfferConditionType
* OpenAPIServer\Model\OfferContentDTO
* OpenAPIServer\Model\OfferContentErrorDTO
* OpenAPIServer\Model\OfferContentErrorType
* OpenAPIServer\Model\OfferDTO
* OpenAPIServer\Model\OfferErrorDTO
* OpenAPIServer\Model\OfferForRecommendationDTO
* OpenAPIServer\Model\OfferManualDTO
* OpenAPIServer\Model\OfferMappingDTO
* OpenAPIServer\Model\OfferMappingEntriesDTO
* OpenAPIServer\Model\OfferMappingEntryDTO
* OpenAPIServer\Model\OfferMappingErrorDTO
* OpenAPIServer\Model\OfferMappingErrorType
* OpenAPIServer\Model\OfferMappingInfoDTO
* OpenAPIServer\Model\OfferMappingKindType
* OpenAPIServer\Model\OfferMappingSuggestionsListDTO
* OpenAPIServer\Model\OfferParamDTO
* OpenAPIServer\Model\OfferPriceByOfferIdsListResponseDTO
* OpenAPIServer\Model\OfferPriceByOfferIdsResponseDTO
* OpenAPIServer\Model\OfferPriceDTO
* OpenAPIServer\Model\OfferPriceListResponseDTO
* OpenAPIServer\Model\OfferPriceResponseDTO
* OpenAPIServer\Model\OfferProcessingNoteDTO
* OpenAPIServer\Model\OfferProcessingNoteType
* OpenAPIServer\Model\OfferProcessingStateDTO
* OpenAPIServer\Model\OfferProcessingStatusType
* OpenAPIServer\Model\OfferRecommendationDTO
* OpenAPIServer\Model\OfferRecommendationInfoDTO
* OpenAPIServer\Model\OfferRecommendationsResultDTO
* OpenAPIServer\Model\OfferSellingProgramDTO
* OpenAPIServer\Model\OfferSellingProgramStatusType
* OpenAPIServer\Model\OfferType
* OpenAPIServer\Model\OfferWeightDimensionsDTO
* OpenAPIServer\Model\OffersDTO
* OpenAPIServer\Model\OptionValuesLimitedDTO
* OpenAPIServer\Model\OrderBoxLayoutDTO
* OpenAPIServer\Model\OrderBoxLayoutItemDTO
* OpenAPIServer\Model\OrderBoxLayoutPartialCountDTO
* OpenAPIServer\Model\OrderBoxesLayoutDTO
* OpenAPIServer\Model\OrderBusinessBuyerDTO
* OpenAPIServer\Model\OrderBusinessDocumentsDTO
* OpenAPIServer\Model\OrderBuyerBasicInfoDTO
* OpenAPIServer\Model\OrderBuyerDTO
* OpenAPIServer\Model\OrderBuyerInfoDTO
* OpenAPIServer\Model\OrderBuyerType
* OpenAPIServer\Model\OrderCancellationReasonType
* OpenAPIServer\Model\OrderCourierDTO
* OpenAPIServer\Model\OrderDTO
* OpenAPIServer\Model\OrderDeliveryAddressDTO
* OpenAPIServer\Model\OrderDeliveryDTO
* OpenAPIServer\Model\OrderDeliveryDateDTO
* OpenAPIServer\Model\OrderDeliveryDateReasonType
* OpenAPIServer\Model\OrderDeliveryDatesDTO
* OpenAPIServer\Model\OrderDeliveryDispatchType
* OpenAPIServer\Model\OrderDeliveryEacType
* OpenAPIServer\Model\OrderDeliveryPartnerType
* OpenAPIServer\Model\OrderDeliveryType
* OpenAPIServer\Model\OrderDigitalItemDTO
* OpenAPIServer\Model\OrderDocumentStatusType
* OpenAPIServer\Model\OrderItemDTO
* OpenAPIServer\Model\OrderItemDetailDTO
* OpenAPIServer\Model\OrderItemInstanceDTO
* OpenAPIServer\Model\OrderItemInstanceModificationDTO
* OpenAPIServer\Model\OrderItemInstanceType
* OpenAPIServer\Model\OrderItemModificationDTO
* OpenAPIServer\Model\OrderItemPromoDTO
* OpenAPIServer\Model\OrderItemStatusType
* OpenAPIServer\Model\OrderItemSubsidyDTO
* OpenAPIServer\Model\OrderItemSubsidyType
* OpenAPIServer\Model\OrderItemsModificationRequestReasonType
* OpenAPIServer\Model\OrderItemsModificationResultDTO
* OpenAPIServer\Model\OrderLabelDTO
* OpenAPIServer\Model\OrderLiftType
* OpenAPIServer\Model\OrderParcelBoxDTO
* OpenAPIServer\Model\OrderPaymentMethodType
* OpenAPIServer\Model\OrderPaymentType
* OpenAPIServer\Model\OrderPromoType
* OpenAPIServer\Model\OrderShipmentDTO
* OpenAPIServer\Model\OrderStateDTO
* OpenAPIServer\Model\OrderStatsStatusType
* OpenAPIServer\Model\OrderStatusChangeDTO
* OpenAPIServer\Model\OrderStatusChangeDeliveryDTO
* OpenAPIServer\Model\OrderStatusChangeDeliveryDatesDTO
* OpenAPIServer\Model\OrderStatusType
* OpenAPIServer\Model\OrderSubsidyDTO
* OpenAPIServer\Model\OrderSubsidyType
* OpenAPIServer\Model\OrderSubstatusType
* OpenAPIServer\Model\OrderTaxSystemType
* OpenAPIServer\Model\OrderTrackDTO
* OpenAPIServer\Model\OrderUpdateStatusType
* OpenAPIServer\Model\OrderVatType
* OpenAPIServer\Model\OrdersShipmentInfoDTO
* OpenAPIServer\Model\OrdersStatsCommissionDTO
* OpenAPIServer\Model\OrdersStatsCommissionType
* OpenAPIServer\Model\OrdersStatsDTO
* OpenAPIServer\Model\OrdersStatsDeliveryRegionDTO
* OpenAPIServer\Model\OrdersStatsDetailsDTO
* OpenAPIServer\Model\OrdersStatsItemDTO
* OpenAPIServer\Model\OrdersStatsItemStatusType
* OpenAPIServer\Model\OrdersStatsOrderDTO
* OpenAPIServer\Model\OrdersStatsOrderPaymentType
* OpenAPIServer\Model\OrdersStatsPaymentDTO
* OpenAPIServer\Model\OrdersStatsPaymentOrderDTO
* OpenAPIServer\Model\OrdersStatsPaymentSourceType
* OpenAPIServer\Model\OrdersStatsPaymentType
* OpenAPIServer\Model\OrdersStatsPriceDTO
* OpenAPIServer\Model\OrdersStatsPriceType
* OpenAPIServer\Model\OrdersStatsStockType
* OpenAPIServer\Model\OrdersStatsWarehouseDTO
* OpenAPIServer\Model\OutletAddressDTO
* OpenAPIServer\Model\OutletDTO
* OpenAPIServer\Model\OutletDeliveryRuleDTO
* OpenAPIServer\Model\OutletLicenseDTO
* OpenAPIServer\Model\OutletLicensesResponseDTO
* OpenAPIServer\Model\OutletResponseDTO
* OpenAPIServer\Model\OutletStatusType
* OpenAPIServer\Model\OutletType
* OpenAPIServer\Model\OutletVisibilityType
* OpenAPIServer\Model\OutletWorkingScheduleDTO
* OpenAPIServer\Model\OutletWorkingScheduleItemDTO
* OpenAPIServer\Model\PageFormatType
* OpenAPIServer\Model\PagedReturnsDTO
* OpenAPIServer\Model\PalletsCountDTO
* OpenAPIServer\Model\ParameterType
* OpenAPIServer\Model\ParameterValueConstraintsDTO
* OpenAPIServer\Model\ParameterValueDTO
* OpenAPIServer\Model\ParameterValueOptionDTO
* OpenAPIServer\Model\ParcelBoxDTO
* OpenAPIServer\Model\ParcelBoxLabelDTO
* OpenAPIServer\Model\ParcelDTO
* OpenAPIServer\Model\PartnerShipmentWarehouseDTO
* OpenAPIServer\Model\PaymentFrequencyType
* OpenAPIServer\Model\PickupAddressDTO
* OpenAPIServer\Model\PlacementType
* OpenAPIServer\Model\PriceCompetitivenessThresholdsDTO
* OpenAPIServer\Model\PriceCompetitivenessType
* OpenAPIServer\Model\PriceDTO
* OpenAPIServer\Model\PriceQuarantineVerdictDTO
* OpenAPIServer\Model\PriceQuarantineVerdictParamNameType
* OpenAPIServer\Model\PriceQuarantineVerdictParameterDTO
* OpenAPIServer\Model\PriceQuarantineVerdictType
* OpenAPIServer\Model\PriceRecommendationItemDTO
* OpenAPIServer\Model\PriceSuggestDTO
* OpenAPIServer\Model\PriceSuggestOfferDTO
* OpenAPIServer\Model\PriceSuggestType
* OpenAPIServer\Model\PromoOfferAutoParticipatingDetailsDTO
* OpenAPIServer\Model\PromoOfferDiscountParamsDTO
* OpenAPIServer\Model\PromoOfferParamsDTO
* OpenAPIServer\Model\PromoOfferParticipationStatusFilterType
* OpenAPIServer\Model\PromoOfferParticipationStatusType
* OpenAPIServer\Model\PromoOfferPromocodeParamsDTO
* OpenAPIServer\Model\PromoOfferUpdateWarningCodeType
* OpenAPIServer\Model\PromoOfferUpdateWarningDTO
* OpenAPIServer\Model\PromoParticipationType
* OpenAPIServer\Model\PromoPeriodDTO
* OpenAPIServer\Model\ProvideOrderDigitalCodesRequest
* OpenAPIServer\Model\ProvideOrderItemIdentifiersRequest
* OpenAPIServer\Model\ProvideOrderItemIdentifiersResponse
* OpenAPIServer\Model\PutSkuBidsRequest
* OpenAPIServer\Model\QualityRatingAffectedOrderDTO
* OpenAPIServer\Model\QualityRatingComponentDTO
* OpenAPIServer\Model\QualityRatingComponentType
* OpenAPIServer\Model\QualityRatingDTO
* OpenAPIServer\Model\QualityRatingDetailsDTO
* OpenAPIServer\Model\QuantumDTO
* OpenAPIServer\Model\QuarantineOfferDTO
* OpenAPIServer\Model\RecipientType
* OpenAPIServer\Model\RefundStatusType
* OpenAPIServer\Model\RegionDTO
* OpenAPIServer\Model\RegionType
* OpenAPIServer\Model\RegionalModelInfoDTO
* OpenAPIServer\Model\RejectedPromoOfferDeleteDTO
* OpenAPIServer\Model\RejectedPromoOfferDeleteReasonType
* OpenAPIServer\Model\RejectedPromoOfferUpdateDTO
* OpenAPIServer\Model\RejectedPromoOfferUpdateReasonType
* OpenAPIServer\Model\ReportFormatType
* OpenAPIServer\Model\ReportInfoDTO
* OpenAPIServer\Model\ReportStatusType
* OpenAPIServer\Model\ReportSubStatusType
* OpenAPIServer\Model\ReturnDTO
* OpenAPIServer\Model\ReturnDecisionDTO
* OpenAPIServer\Model\ReturnDecisionReasonType
* OpenAPIServer\Model\ReturnDecisionSubreasonType
* OpenAPIServer\Model\ReturnDecisionType
* OpenAPIServer\Model\ReturnInstanceDTO
* OpenAPIServer\Model\ReturnInstanceStatusType
* OpenAPIServer\Model\ReturnInstanceStockType
* OpenAPIServer\Model\ReturnItemDTO
* OpenAPIServer\Model\ReturnRequestDecisionType
* OpenAPIServer\Model\ReturnShipmentStatusType
* OpenAPIServer\Model\ReturnType
* OpenAPIServer\Model\ScrollingPagerDTO
* OpenAPIServer\Model\SearchModelsResponse
* OpenAPIServer\Model\SearchShipmentsRequest
* OpenAPIServer\Model\SearchShipmentsResponse
* OpenAPIServer\Model\SearchShipmentsResponseDTO
* OpenAPIServer\Model\SellingProgramType
* OpenAPIServer\Model\SendMessageToChatRequest
* OpenAPIServer\Model\SetFeedParamsRequest
* OpenAPIServer\Model\SetOrderBoxLayoutRequest
* OpenAPIServer\Model\SetOrderBoxLayoutResponse
* OpenAPIServer\Model\SetOrderDeliveryDateRequest
* OpenAPIServer\Model\SetOrderDeliveryTrackCodeRequest
* OpenAPIServer\Model\SetOrderShipmentBoxesRequest
* OpenAPIServer\Model\SetOrderShipmentBoxesResponse
* OpenAPIServer\Model\SetReturnDecisionRequest
* OpenAPIServer\Model\SetShipmentPalletsCountRequest
* OpenAPIServer\Model\ShelfsStatisticsAttributionType
* OpenAPIServer\Model\ShipmentActionType
* OpenAPIServer\Model\ShipmentBoxesDTO
* OpenAPIServer\Model\ShipmentDTO
* OpenAPIServer\Model\ShipmentInfoDTO
* OpenAPIServer\Model\ShipmentPalletLabelPageFormatType
* OpenAPIServer\Model\ShipmentStatusChangeDTO
* OpenAPIServer\Model\ShipmentStatusType
* OpenAPIServer\Model\ShipmentType
* OpenAPIServer\Model\ShowsSalesGroupingType
* OpenAPIServer\Model\SkipGoodsFeedbackReactionRequest
* OpenAPIServer\Model\SkuBidItemDTO
* OpenAPIServer\Model\SkuBidRecommendationItemDTO
* OpenAPIServer\Model\SortOrderType
* OpenAPIServer\Model\SuggestOfferPriceDTO
* OpenAPIServer\Model\SuggestPricesRequest
* OpenAPIServer\Model\SuggestPricesResponse
* OpenAPIServer\Model\SuggestPricesResultDTO
* OpenAPIServer\Model\SuggestedOfferDTO
* OpenAPIServer\Model\SuggestedOfferMappingDTO
* OpenAPIServer\Model\TariffDTO
* OpenAPIServer\Model\TariffParameterDTO
* OpenAPIServer\Model\TariffType
* OpenAPIServer\Model\TimePeriodDTO
* OpenAPIServer\Model\TimeUnitType
* OpenAPIServer\Model\TrackDTO
* OpenAPIServer\Model\TransferOrdersFromShipmentRequest
* OpenAPIServer\Model\TurnoverDTO
* OpenAPIServer\Model\TurnoverType
* OpenAPIServer\Model\UnitDTO
* OpenAPIServer\Model\UpdateBusinessOfferPriceDTO
* OpenAPIServer\Model\UpdateBusinessPricesRequest
* OpenAPIServer\Model\UpdateCampaignOfferDTO
* OpenAPIServer\Model\UpdateCampaignOffersRequest
* OpenAPIServer\Model\UpdateGoodsFeedbackCommentDTO
* OpenAPIServer\Model\UpdateGoodsFeedbackCommentRequest
* OpenAPIServer\Model\UpdateGoodsFeedbackCommentResponse
* OpenAPIServer\Model\UpdateMappingDTO
* OpenAPIServer\Model\UpdateMappingsOfferDTO
* OpenAPIServer\Model\UpdateOfferContentRequest
* OpenAPIServer\Model\UpdateOfferContentResponse
* OpenAPIServer\Model\UpdateOfferContentResultDTO
* OpenAPIServer\Model\UpdateOfferDTO
* OpenAPIServer\Model\UpdateOfferMappingDTO
* OpenAPIServer\Model\UpdateOfferMappingEntryDTO
* OpenAPIServer\Model\UpdateOfferMappingEntryRequest
* OpenAPIServer\Model\UpdateOfferMappingResultDTO
* OpenAPIServer\Model\UpdateOfferMappingsRequest
* OpenAPIServer\Model\UpdateOfferMappingsResponse
* OpenAPIServer\Model\UpdateOrderItemRequest
* OpenAPIServer\Model\UpdateOrderStatusDTO
* OpenAPIServer\Model\UpdateOrderStatusRequest
* OpenAPIServer\Model\UpdateOrderStatusResponse
* OpenAPIServer\Model\UpdateOrderStatusesDTO
* OpenAPIServer\Model\UpdateOrderStatusesRequest
* OpenAPIServer\Model\UpdateOrderStatusesResponse
* OpenAPIServer\Model\UpdateOrderStorageLimitRequest
* OpenAPIServer\Model\UpdateOutletLicenseRequest
* OpenAPIServer\Model\UpdatePriceWithDiscountDTO
* OpenAPIServer\Model\UpdatePricesRequest
* OpenAPIServer\Model\UpdatePromoOfferDTO
* OpenAPIServer\Model\UpdatePromoOfferDiscountParamsDTO
* OpenAPIServer\Model\UpdatePromoOfferParamsDTO
* OpenAPIServer\Model\UpdatePromoOffersRequest
* OpenAPIServer\Model\UpdatePromoOffersResponse
* OpenAPIServer\Model\UpdatePromoOffersResultDTO
* OpenAPIServer\Model\UpdateStockDTO
* OpenAPIServer\Model\UpdateStockItemDTO
* OpenAPIServer\Model\UpdateStocksRequest
* OpenAPIServer\Model\UpdateTimeDTO
* OpenAPIServer\Model\ValueRestrictionDTO
* OpenAPIServer\Model\VerifyOrderEacRequest
* OpenAPIServer\Model\VerifyOrderEacResponse
* OpenAPIServer\Model\WarehouseAddressDTO
* OpenAPIServer\Model\WarehouseDTO
* OpenAPIServer\Model\WarehouseGroupDTO
* OpenAPIServer\Model\WarehouseOfferDTO
* OpenAPIServer\Model\WarehouseOffersDTO
* OpenAPIServer\Model\WarehouseStockDTO
* OpenAPIServer\Model\WarehouseStockType
* OpenAPIServer\Model\WarehousesDTO
* OpenAPIServer\Model\WarningPromoOfferUpdateDTO


## Authentication

### Security schema `OAuth`
> Important! To make OAuth authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\OAuthAuthenticator](./src/Auth/OAuthAuthenticator.php) class.

Scope list:
* `market:partner-api` - API Яндекс.Маркета / Поиска по товарам для партнеров

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)
