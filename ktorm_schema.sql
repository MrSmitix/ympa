

-- --------------------------------------------------------------------------
-- Table structure for table `AcceptOrderCancellationRequest` generated from model 'acceptOrderCancellationRequest'
--

CREATE TABLE IF NOT EXISTS `AcceptOrderCancellationRequest` (
  `accepted` boolean NOT NULL /*Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. */,
  `reason` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AddHiddenOffersRequest` generated from model 'addHiddenOffersRequest'
-- Запрос на скрытие оферов.
--

CREATE TABLE IF NOT EXISTS `AddHiddenOffersRequest` (
);  /*Запрос на скрытие оферов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AddHiddenOffersRequestHiddenOfferDTO` generated from model 'AddHiddenOffersRequestHiddenOfferDTO'

CREATE TABLE IF NOT EXISTS `AddHiddenOffersRequestHiddenOfferDTO` (
  `addHiddenOffersRequest` long NOT NULL
  `hiddenOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AddOffersToArchiveDTO` generated from model 'addOffersToArchiveDTO'
-- Товары, которые не удалось поместить в архив.
--

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveDTO` (
);  /*Товары, которые не удалось поместить в архив.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AddOffersToArchiveDTOAddOffersToArchiveErrorDTO` generated from model 'AddOffersToArchiveDTOAddOffersToArchiveErrorDTO'

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveDTOAddOffersToArchiveErrorDTO` (
  `addOffersToArchiveDTO` long NOT NULL
  `addOffersToArchiveErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AddOffersToArchiveErrorDTO` generated from model 'addOffersToArchiveErrorDTO'
-- Товар, который не удалось поместить в архив.
--

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveErrorDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `error` long NOT NULL
);  /*Товар, который не удалось поместить в архив.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AddOffersToArchiveRequest` generated from model 'addOffersToArchiveRequest'
-- Товары, которые нужно поместить в архив. 
--

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveRequest` (
);  /*Товары, которые нужно поместить в архив. */

-- --------------------------------------------------------------------------
-- Table structure for table `AddOffersToArchiveRequestOfferIds` generated from model 'AddOffersToArchiveRequestOfferIds'

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveRequestOfferIds` (
  `addOffersToArchiveRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AddOffersToArchiveResponse` generated from model 'addOffersToArchiveResponse'
-- Результат архивации товаров.
--

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveResponse` (
  `status` long,
  `result` long
);  /*Результат архивации товаров.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AgeDTO` generated from model 'ageDTO'
-- Возраст в заданных единицах измерения.
--

CREATE TABLE IF NOT EXISTS `AgeDTO` (
  `value` decimal NOT NULL /*Значение. */,
  `ageUnit` long NOT NULL
);  /*Возраст в заданных единицах измерения.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ApiClientDataErrorResponse` generated from model 'apiClientDataErrorResponse'
-- Ошибка в данных переданных от клиента.
--

CREATE TABLE IF NOT EXISTS `ApiClientDataErrorResponse` (
  `status` long,
);  /*Ошибка в данных переданных от клиента.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ApiClientDataErrorResponseApiErrorDTO` generated from model 'ApiClientDataErrorResponseApiErrorDTO'

CREATE TABLE IF NOT EXISTS `ApiClientDataErrorResponseApiErrorDTO` (
  `apiClientDataErrorResponse` long NOT NULL
  `apiErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ApiErrorDTO` generated from model 'apiErrorDTO'
-- Общий формат ошибки.
--

CREATE TABLE IF NOT EXISTS `ApiErrorDTO` (
  `code` text NOT NULL /*Код ошибки.*/,
  `message` text /*Описание ошибки.*/
);  /*Общий формат ошибки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ApiErrorResponse` generated from model 'apiErrorResponse'
-- Стандартная обертка для ошибок сервера.
--

CREATE TABLE IF NOT EXISTS `ApiErrorResponse` (
  `status` long,
);  /*Стандартная обертка для ошибок сервера.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ApiErrorResponseApiErrorDTO` generated from model 'ApiErrorResponseApiErrorDTO'

CREATE TABLE IF NOT EXISTS `ApiErrorResponseApiErrorDTO` (
  `apiErrorResponse` long NOT NULL
  `apiErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ApiForbiddenErrorResponse` generated from model 'apiForbiddenErrorResponse'
-- Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
--

CREATE TABLE IF NOT EXISTS `ApiForbiddenErrorResponse` (
  `status` long,
);  /*Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ApiForbiddenErrorResponseApiErrorDTO` generated from model 'ApiForbiddenErrorResponseApiErrorDTO'

CREATE TABLE IF NOT EXISTS `ApiForbiddenErrorResponseApiErrorDTO` (
  `apiForbiddenErrorResponse` long NOT NULL
  `apiErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ApiLimitErrorResponse` generated from model 'apiLimitErrorResponse'
-- Превышено ограничение на доступ к ресурсу.
--

CREATE TABLE IF NOT EXISTS `ApiLimitErrorResponse` (
  `status` long,
);  /*Превышено ограничение на доступ к ресурсу.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ApiLimitErrorResponseApiErrorDTO` generated from model 'ApiLimitErrorResponseApiErrorDTO'

CREATE TABLE IF NOT EXISTS `ApiLimitErrorResponseApiErrorDTO` (
  `apiLimitErrorResponse` long NOT NULL
  `apiErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ApiLockedErrorResponse` generated from model 'apiLockedErrorResponse'
-- Ресурс из запроса заблокирован от применения к нему указанного метода.
--

CREATE TABLE IF NOT EXISTS `ApiLockedErrorResponse` (
  `status` long,
);  /*Ресурс из запроса заблокирован от применения к нему указанного метода.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ApiLockedErrorResponseApiErrorDTO` generated from model 'ApiLockedErrorResponseApiErrorDTO'

CREATE TABLE IF NOT EXISTS `ApiLockedErrorResponseApiErrorDTO` (
  `apiLockedErrorResponse` long NOT NULL
  `apiErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ApiNotFoundErrorResponse` generated from model 'apiNotFoundErrorResponse'
-- Запрашиваемый ресурс не найден.
--

CREATE TABLE IF NOT EXISTS `ApiNotFoundErrorResponse` (
  `status` long,
);  /*Запрашиваемый ресурс не найден.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ApiNotFoundErrorResponseApiErrorDTO` generated from model 'ApiNotFoundErrorResponseApiErrorDTO'

CREATE TABLE IF NOT EXISTS `ApiNotFoundErrorResponseApiErrorDTO` (
  `apiNotFoundErrorResponse` long NOT NULL
  `apiErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ApiResponse` generated from model 'apiResponse'
-- Стандартная обертка для ответов сервера.
--

CREATE TABLE IF NOT EXISTS `ApiResponse` (
  `status` long
);  /*Стандартная обертка для ответов сервера.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ApiServerErrorResponse` generated from model 'apiServerErrorResponse'
-- Внутренняя ошибка сервера.
--

CREATE TABLE IF NOT EXISTS `ApiServerErrorResponse` (
  `status` long,
);  /*Внутренняя ошибка сервера.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ApiServerErrorResponseApiErrorDTO` generated from model 'ApiServerErrorResponseApiErrorDTO'

CREATE TABLE IF NOT EXISTS `ApiServerErrorResponseApiErrorDTO` (
  `apiServerErrorResponse` long NOT NULL
  `apiErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ApiUnauthorizedErrorResponse` generated from model 'apiUnauthorizedErrorResponse'
-- В запросе не указаны авторизационные данные.
--

CREATE TABLE IF NOT EXISTS `ApiUnauthorizedErrorResponse` (
  `status` long,
);  /*В запросе не указаны авторизационные данные.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ApiUnauthorizedErrorResponseApiErrorDTO` generated from model 'ApiUnauthorizedErrorResponseApiErrorDTO'

CREATE TABLE IF NOT EXISTS `ApiUnauthorizedErrorResponseApiErrorDTO` (
  `apiUnauthorizedErrorResponse` long NOT NULL
  `apiErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BaseCampaignOfferDTO` generated from model 'baseCampaignOfferDTO'
-- Информация о новой цене на товар.
--

CREATE TABLE IF NOT EXISTS `BaseCampaignOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `quantum` long,
  `available` boolean /*Есть ли товар в продаже. */
);  /*Информация о новой цене на товар.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTO` generated from model 'baseOfferDTO'
-- Основные параметры товара.
--

CREATE TABLE IF NOT EXISTS `BaseOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `name` text /*Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) */,
  `marketCategoryId` long /*Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). */,
  `category` text /*Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. */,
  `vendor` text /*Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.*/,
  `description` text /*Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) */,
  `weightDimensions` long,
  `vendorCode` text /*Артикул товара от производителя.*/,
  `shelfLife` long,
  `lifeTime` long,
  `guaranteePeriod` long,
  `customsCommodityCode` text /*Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. */,
  `boxCount` int /*Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. */,
  `condition` long,
  `type` long,
  `downloadable` boolean /*Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) */,
  `adult` boolean /*Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. */,
  `age` long,
);  /*Основные параметры товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTOPictures` generated from model 'BaseOfferDTOPictures'

CREATE TABLE IF NOT EXISTS `BaseOfferDTOPictures` (
  `baseOfferDTO` long NOT NULL
  `pictures` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTOVideos` generated from model 'BaseOfferDTOVideos'

CREATE TABLE IF NOT EXISTS `BaseOfferDTOVideos` (
  `baseOfferDTO` long NOT NULL
  `videos` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTOOfferManualDTO` generated from model 'BaseOfferDTOOfferManualDTO'

CREATE TABLE IF NOT EXISTS `BaseOfferDTOOfferManualDTO` (
  `baseOfferDTO` long NOT NULL
  `offerManualDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTOBarcodes` generated from model 'BaseOfferDTOBarcodes'

CREATE TABLE IF NOT EXISTS `BaseOfferDTOBarcodes` (
  `baseOfferDTO` long NOT NULL
  `barcodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTOManufacturerCountries` generated from model 'BaseOfferDTOManufacturerCountries'

CREATE TABLE IF NOT EXISTS `BaseOfferDTOManufacturerCountries` (
  `baseOfferDTO` long NOT NULL
  `manufacturerCountries` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTOTags` generated from model 'BaseOfferDTOTags'

CREATE TABLE IF NOT EXISTS `BaseOfferDTOTags` (
  `baseOfferDTO` long NOT NULL
  `tags` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTOCertificates` generated from model 'BaseOfferDTOCertificates'

CREATE TABLE IF NOT EXISTS `BaseOfferDTOCertificates` (
  `baseOfferDTO` long NOT NULL
  `certificates` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BaseOfferDTOOfferParamDTO` generated from model 'BaseOfferDTOOfferParamDTO'

CREATE TABLE IF NOT EXISTS `BaseOfferDTOOfferParamDTO` (
  `baseOfferDTO` long NOT NULL
  `offerParamDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BasePriceDTO` generated from model 'basePriceDTO'
-- Цена на товар.
--

CREATE TABLE IF NOT EXISTS `BasePriceDTO` (
  `value` decimal NOT NULL /*Значение.*/,
  `currencyId` long NOT NULL
);  /*Цена на товар.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BaseShipmentDTO` generated from model 'baseShipmentDTO'
-- Информация об отгрузке.
--

CREATE TABLE IF NOT EXISTS `BaseShipmentDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор отгрузки.*/,
  `planIntervalFrom` datetime /*Начало планового интервала отгрузки.*/,
  `planIntervalTo` datetime /*Конец планового интервала отгрузки.*/,
  `shipmentType` long,
  `warehouse` long,
  `warehouseTo` long,
  `externalId` text /*Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.*/,
  `deliveryService` long,
  `palletsCount` long,
  `draftCount` int /*Количество заказов, которое Маркет запланировал к отгрузке.*/,
  `plannedCount` int /*Количество заказов, которое Маркет подтвердил к отгрузке.*/,
  `factCount` int /*Количество заказов, принятых в сортировочном центре или пункте приема.*/
);  /*Информация об отгрузке.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BaseShipmentDTOOrderIds` generated from model 'BaseShipmentDTOOrderIds'

CREATE TABLE IF NOT EXISTS `BaseShipmentDTOOrderIds` (
  `baseShipmentDTO` long NOT NULL
  `orderIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BidRecommendationItemDTO` generated from model 'bidRecommendationItemDTO'
-- Рекомендованная ставка и возможная доля показов.
--

CREATE TABLE IF NOT EXISTS `BidRecommendationItemDTO` (
  `bid` int UNSIGNED NOT NULL /*Значение ставки.*/,
  `showPercent` long UNSIGNED NOT NULL /*Доля показов. */
);  /*Рекомендованная ставка и возможная доля показов.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BriefOrderItemDTO` generated from model 'briefOrderItemDTO'
-- Информация о маркированном товаре.
--

CREATE TABLE IF NOT EXISTS `BriefOrderItemDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. */,
  `vat` long,
  `count` int /*Количество единиц товара.*/,
  `price` decimal /*Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. */,
  `offerName` text /*Название товара.*/,
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
);  /*Информация о маркированном товаре.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BriefOrderItemDTOOrderItemInstanceDTO` generated from model 'BriefOrderItemDTOOrderItemInstanceDTO'

CREATE TABLE IF NOT EXISTS `BriefOrderItemDTOOrderItemInstanceDTO` (
  `briefOrderItemDTO` long NOT NULL
  `orderItemInstanceDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BriefOrderItemInstanceDTO` generated from model 'briefOrderItemInstanceDTO'
-- Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
--

CREATE TABLE IF NOT EXISTS `BriefOrderItemInstanceDTO` (
  `cis` text /*Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя &#x60;\\u001d&#x60;!  ✅ &#x60;01030410947874432155Qbag!\\u001d93Zjqw&#x60;  ❌ &#x60;01030410947874432155Qbag!\\\\u001d93Zjqw&#x60;  Косые черты и кавычки в других местах экранируйте по правилам JSON: &#x60;\\\\&#x60; и &#x60;\\\&quot;&#x60;  {% endnote %} */,
  `uin` text /*Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. */,
  `rnpt` text /*Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. */,
  `gtd` text /*Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. */
);  /*Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). */


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessDTO` generated from model 'businessDTO'
-- Информация о кабинете.
--

CREATE TABLE IF NOT EXISTS `BusinessDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор кабинета.*/,
  `name` text /*Название бизнеса.*/
);  /*Информация о кабинете.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessSettingsDTO` generated from model 'businessSettingsDTO'
-- Настройки кабинета.
--

CREATE TABLE IF NOT EXISTS `BusinessSettingsDTO` (
  `onlyDefaultPrice` boolean /*Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену. */,
  `currency` long
);  /*Настройки кабинета.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsOfferDTO` generated from model 'calculateTariffsOfferDTO'
-- Параметры товара, для которого нужно рассчитать стоимость услуг.
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsOfferDTO` (
  `categoryId` long UNSIGNED NOT NULL /*Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). */,
  `price` decimal NOT NULL /*Цена на товар в рублях.*/,
  `length` decimal NOT NULL /*Длина товара в сантиметрах.*/,
  `width` decimal NOT NULL /*Ширина товара в сантиметрах.*/,
  `height` decimal NOT NULL /*Высота товара в сантиметрах.*/,
  `weight` decimal NOT NULL /*Вес товара в килограммах.*/,
  `quantity` int UNSIGNED /*Квант продажи — количество единиц товара в одном товарном предложении.*/
);  /*Параметры товара, для которого нужно рассчитать стоимость услуг.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsOfferInfoDTO` generated from model 'calculateTariffsOfferInfoDTO'
-- Стоимость услуг.
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsOfferInfoDTO` (
  `offer` long NOT NULL,
);  /*Стоимость услуг.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsOfferInfoDTOCalculatedTariffDTO` generated from model 'CalculateTariffsOfferInfoDTOCalculatedTariffDTO'

CREATE TABLE IF NOT EXISTS `CalculateTariffsOfferInfoDTOCalculatedTariffDTO` (
  `calculateTariffsOfferInfoDTO` long NOT NULL
  `calculatedTariffDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsParametersDTO` generated from model 'calculateTariffsParametersDTO'
-- Параметры для расчета стоимости услуг.
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsParametersDTO` (
  `campaignId` long /*Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке. */,
  `sellingProgram` long,
  `frequency` long
);  /*Параметры для расчета стоимости услуг.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsRequest` generated from model 'calculateTariffsRequest'
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsRequest` (
  `parameters` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsRequestCalculateTariffsOfferDTO` generated from model 'CalculateTariffsRequestCalculateTariffsOfferDTO'

CREATE TABLE IF NOT EXISTS `CalculateTariffsRequestCalculateTariffsOfferDTO` (
  `calculateTariffsRequest` long NOT NULL
  `calculateTariffsOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsResponse` generated from model 'calculateTariffsResponse'
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsResponseDTO` generated from model 'calculateTariffsResponseDTO'
-- Расчет стоимости услуг.
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsResponseDTO` (
);  /*Расчет стоимости услуг.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CalculateTariffsResponseDTOCalculateTariffsOfferInfoDTO` generated from model 'CalculateTariffsResponseDTOCalculateTariffsOfferInfoDTO'

CREATE TABLE IF NOT EXISTS `CalculateTariffsResponseDTOCalculateTariffsOfferInfoDTO` (
  `calculateTariffsResponseDTO` long NOT NULL
  `calculateTariffsOfferInfoDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CalculatedTariffDTO` generated from model 'calculatedTariffDTO'
-- Информация об услугах Маркета.
--

CREATE TABLE IF NOT EXISTS `CalculatedTariffDTO` (
  `type` long NOT NULL,
  `amount` decimal /*Стоимость услуги в рублях.*/
);  /*Информация об услугах Маркета.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CalculatedTariffDTOTariffParameterDTO` generated from model 'CalculatedTariffDTOTariffParameterDTO'

CREATE TABLE IF NOT EXISTS `CalculatedTariffDTOTariffParameterDTO` (
  `calculatedTariffDTO` long NOT NULL
  `tariffParameterDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignDTO` generated from model 'campaignDTO'
-- Информация о магазине.
--

CREATE TABLE IF NOT EXISTS `CampaignDTO` (
  `domain` text /*URL магазина.*/,
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор кампании.*/,
  `clientId` long /*Идентификатор плательщика в Яндекс Балансе.*/,
  `business` long,
  `placementType` long
);  /*Информация о магазине.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignQualityRatingDTO` generated from model 'campaignQualityRatingDTO'
-- Информация об индексе качества магазина.
--

CREATE TABLE IF NOT EXISTS `CampaignQualityRatingDTO` (
  `campaignId` long NOT NULL /*Идентификатор магазина.*/,
);  /*Информация об индексе качества магазина.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignQualityRatingDTOQualityRatingDTO` generated from model 'CampaignQualityRatingDTOQualityRatingDTO'

CREATE TABLE IF NOT EXISTS `CampaignQualityRatingDTOQualityRatingDTO` (
  `campaignQualityRatingDTO` long NOT NULL
  `qualityRatingDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsDTO` generated from model 'campaignSettingsDTO'
-- Настройки магазина.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsDTO` (
  `countryRegion` long /*Идентификатор региона, в котором находится магазин.*/,
  `shopName` text /*Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;. */,
  `showInContext` boolean /*Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции. */,
  `showInPremium` boolean /*Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения. */,
  `useOpenStat` boolean /*Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется. */,
  `localRegion` long
);  /*Настройки магазина.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsDeliveryDTO` generated from model 'campaignSettingsDeliveryDTO'
-- Информация о доставке в своем регионе магазина.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsDeliveryDTO` (
  `schedule` long
);  /*Информация о доставке в своем регионе магазина.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsLocalRegionDTO` generated from model 'campaignSettingsLocalRegionDTO'
-- Информация о своем регионе магазина.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsLocalRegionDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор региона.*/,
  `name` text /*Название региона.*/,
  `type` long,
  `deliveryOptionsSource` long,
  `delivery` long
);  /*Информация о своем регионе магазина.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsScheduleDTO` generated from model 'campaignSettingsScheduleDTO'
-- Расписание работы службы доставки в своем регионе.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsScheduleDTO` (
  `availableOnHolidays` boolean /*Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни. */,
  `period` long
);  /*Расписание работы службы доставки в своем регионе.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsScheduleDTOCustomHolidays` generated from model 'CampaignSettingsScheduleDTOCustomHolidays'

CREATE TABLE IF NOT EXISTS `CampaignSettingsScheduleDTOCustomHolidays` (
  `campaignSettingsScheduleDTO` long NOT NULL
  `customHolidays` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsScheduleDTOCustomWorkingDays` generated from model 'CampaignSettingsScheduleDTOCustomWorkingDays'

CREATE TABLE IF NOT EXISTS `CampaignSettingsScheduleDTOCustomWorkingDays` (
  `campaignSettingsScheduleDTO` long NOT NULL
  `customWorkingDays` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsScheduleDTOTotalHolidays` generated from model 'CampaignSettingsScheduleDTOTotalHolidays'

CREATE TABLE IF NOT EXISTS `CampaignSettingsScheduleDTOTotalHolidays` (
  `campaignSettingsScheduleDTO` long NOT NULL
  `totalHolidays` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsScheduleDTOWeeklyHolidays` generated from model 'CampaignSettingsScheduleDTOWeeklyHolidays'

CREATE TABLE IF NOT EXISTS `CampaignSettingsScheduleDTOWeeklyHolidays` (
  `campaignSettingsScheduleDTO` long NOT NULL
  `weeklyHolidays` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignSettingsTimePeriodDTO` generated from model 'campaignSettingsTimePeriodDTO'
-- Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsTimePeriodDTO` (
  `fromDate` text /*Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */,
  `toDate` text /*Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */
);  /*Период, за который рассчитывается итоговый список нерабочих дней службы доставки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignsQualityRatingDTO` generated from model 'campaignsQualityRatingDTO'
-- Информация об индексе качества магазинов.
--

CREATE TABLE IF NOT EXISTS `CampaignsQualityRatingDTO` (
);  /*Информация об индексе качества магазинов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignsQualityRatingDTOCampaignQualityRatingDTO` generated from model 'CampaignsQualityRatingDTOCampaignQualityRatingDTO'

CREATE TABLE IF NOT EXISTS `CampaignsQualityRatingDTOCampaignQualityRatingDTO` (
  `campaignsQualityRatingDTO` long NOT NULL
  `campaignQualityRatingDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CategoryContentParametersDTO` generated from model 'categoryContentParametersDTO'
-- Информация о параметрах категории.
--

CREATE TABLE IF NOT EXISTS `CategoryContentParametersDTO` (
  `categoryId` int NOT NULL /*Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).*/,
);  /*Информация о параметрах категории.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CategoryContentParametersDTOCategoryParameterDTO` generated from model 'CategoryContentParametersDTOCategoryParameterDTO'

CREATE TABLE IF NOT EXISTS `CategoryContentParametersDTOCategoryParameterDTO` (
  `categoryContentParametersDTO` long NOT NULL
  `categoryParameterDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CategoryDTO` generated from model 'categoryDTO'
-- Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
--

CREATE TABLE IF NOT EXISTS `CategoryDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор категории.*/,
  `name` text NOT NULL /*Название категории.*/,
);  /*Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. */

-- --------------------------------------------------------------------------
-- Table structure for table `CategoryDTOCategoryDTO` generated from model 'CategoryDTOCategoryDTO'

CREATE TABLE IF NOT EXISTS `CategoryDTOCategoryDTO` (
  `categoryDTO` long NOT NULL
  `categoryDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CategoryErrorDTO` generated from model 'categoryErrorDTO'
-- Текст ошибки.
--

CREATE TABLE IF NOT EXISTS `CategoryErrorDTO` (
  `categoryId` long /*Идентификатор категории.*/,
  `type` long
);  /*Текст ошибки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CategoryParameterDTO` generated from model 'categoryParameterDTO'
-- Характеристика товара.
--

CREATE TABLE IF NOT EXISTS `CategoryParameterDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор характеристики.*/,
  `type` long NOT NULL,
  `required` boolean NOT NULL /*Обязательность характеристики.*/,
  `filtering` boolean NOT NULL /*Используется ли характеристика в фильтре.*/,
  `distinctive` boolean NOT NULL /*Является ли характеристика особенностью варианта.*/,
  `multivalue` boolean NOT NULL /*Можно ли передать сразу несколько значений.*/,
  `allowCustomValues` boolean NOT NULL /*Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.*/,
  `name` text /*Название характеристики.*/,
  `unit` long,
  `description` text /*Описание характеристики.*/,
  `constraints` long,
);  /*Характеристика товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CategoryParameterDTOOfferCardRecommendationType` generated from model 'CategoryParameterDTOOfferCardRecommendationType'

CREATE TABLE IF NOT EXISTS `CategoryParameterDTOOfferCardRecommendationType` (
  `categoryParameterDTO` long NOT NULL
  `offerCardRecommendationType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CategoryParameterDTOParameterValueOptionDTO` generated from model 'CategoryParameterDTOParameterValueOptionDTO'

CREATE TABLE IF NOT EXISTS `CategoryParameterDTOParameterValueOptionDTO` (
  `categoryParameterDTO` long NOT NULL
  `parameterValueOptionDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CategoryParameterDTOValueRestrictionDTO` generated from model 'CategoryParameterDTOValueRestrictionDTO'

CREATE TABLE IF NOT EXISTS `CategoryParameterDTOValueRestrictionDTO` (
  `categoryParameterDTO` long NOT NULL
  `valueRestrictionDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CategoryParameterUnitDTO` generated from model 'categoryParameterUnitDTO'
-- Единицы измерения характеристики товара.
--

CREATE TABLE IF NOT EXISTS `CategoryParameterUnitDTO` (
  `defaultUnitId` long NOT NULL /*Единица измерения по умолчанию.*/,
);  /*Единицы измерения характеристики товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CategoryParameterUnitDTOUnitDTO` generated from model 'CategoryParameterUnitDTOUnitDTO'

CREATE TABLE IF NOT EXISTS `CategoryParameterUnitDTOUnitDTO` (
  `categoryParameterUnitDTO` long NOT NULL
  `unitDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChangeOutletRequest` generated from model 'changeOutletRequest'
--

CREATE TABLE IF NOT EXISTS `ChangeOutletRequest` (
  `name` text NOT NULL /*Название точки продаж. */,
  `type` long NOT NULL,
  `address` long NOT NULL,
  `workingSchedule` long NOT NULL,
  `coords` text /*Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. */,
  `isMain` boolean /*Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. */,
  `shopOutletCode` text /*Идентификатор точки продаж, присвоенный магазином.*/,
  `visibility` long,
  `storagePeriod` long /*Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ChangeOutletRequestPhones` generated from model 'ChangeOutletRequestPhones'

CREATE TABLE IF NOT EXISTS `ChangeOutletRequestPhones` (
  `changeOutletRequest` long NOT NULL
  `phones` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ChangeOutletRequestOutletDeliveryRuleDTO` generated from model 'ChangeOutletRequestOutletDeliveryRuleDTO'

CREATE TABLE IF NOT EXISTS `ChangeOutletRequestOutletDeliveryRuleDTO` (
  `changeOutletRequest` long NOT NULL
  `outletDeliveryRuleDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChatMessageDTO` generated from model 'chatMessageDTO'
-- Информация о сообщениях.
--

CREATE TABLE IF NOT EXISTS `ChatMessageDTO` (
  `messageId` long NOT NULL /*Идентификатор сообщения.*/,
  `createdAt` datetime NOT NULL /*Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. */,
  `sender` long NOT NULL,
  `message` text /*Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;. */,
);  /*Информация о сообщениях.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ChatMessageDTOChatMessagePayloadDTO` generated from model 'ChatMessageDTOChatMessagePayloadDTO'

CREATE TABLE IF NOT EXISTS `ChatMessageDTOChatMessagePayloadDTO` (
  `chatMessageDTO` long NOT NULL
  `chatMessagePayloadDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ChatMessagePayloadDTO` generated from model 'chatMessagePayloadDTO'
-- Информация о приложенных к сообщению файлах.
--

CREATE TABLE IF NOT EXISTS `ChatMessagePayloadDTO` (
  `name` text NOT NULL /*Имя файла.*/,
  `url` text NOT NULL /*Ссылка для скачивания файла.*/,
  `size` int NOT NULL /*Размер файла в байтах.*/
);  /*Информация о приложенных к сообщению файлах.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ChatMessagesResultDTO` generated from model 'chatMessagesResultDTO'
-- Информация о сообщениях.
--

CREATE TABLE IF NOT EXISTS `ChatMessagesResultDTO` (
  `orderId` long NOT NULL /*Идентификатор заказа.*/,
  `paging` long
);  /*Информация о сообщениях.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ChatMessagesResultDTOChatMessageDTO` generated from model 'ChatMessagesResultDTOChatMessageDTO'

CREATE TABLE IF NOT EXISTS `ChatMessagesResultDTOChatMessageDTO` (
  `chatMessagesResultDTO` long NOT NULL
  `chatMessageDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConfirmPricesRequest` generated from model 'confirmPricesRequest'
-- Запрос на подтверждение цены. 
--

CREATE TABLE IF NOT EXISTS `ConfirmPricesRequest` (
);  /*Запрос на подтверждение цены. */

-- --------------------------------------------------------------------------
-- Table structure for table `ConfirmPricesRequestOfferIds` generated from model 'ConfirmPricesRequestOfferIds'

CREATE TABLE IF NOT EXISTS `ConfirmPricesRequestOfferIds` (
  `confirmPricesRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConfirmShipmentRequest` generated from model 'confirmShipmentRequest'
-- Запрос для подтверждения отгрузки.
--

CREATE TABLE IF NOT EXISTS `ConfirmShipmentRequest` (
  `externalShipmentId` text /*Идентификатор отгрузки в системе поставщика.*/
);  /*Запрос для подтверждения отгрузки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatRequest` generated from model 'createChatRequest'
-- Заказ, для которого нужно создать чат. 
--

CREATE TABLE IF NOT EXISTS `CreateChatRequest` (
  `orderId` long NOT NULL /*Идентификатор заказа на Маркете.*/
);  /*Заказ, для которого нужно создать чат. */


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatResponse` generated from model 'createChatResponse'
-- Результат создания чата.
--

CREATE TABLE IF NOT EXISTS `CreateChatResponse` (
  `status` long,
  `result` long
);  /*Результат создания чата.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateChatResultDTO` generated from model 'createChatResultDTO'
-- Информация о созданном чате.
--

CREATE TABLE IF NOT EXISTS `CreateChatResultDTO` (
  `chatId` long NOT NULL /*Идентификатор чата.*/
);  /*Информация о созданном чате.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateOutletResponse` generated from model 'createOutletResponse'
-- Ответ на запрос о создании точки продаж.
--

CREATE TABLE IF NOT EXISTS `CreateOutletResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос о создании точки продаж.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteCampaignOffersDTO` generated from model 'deleteCampaignOffersDTO'
-- Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
--

CREATE TABLE IF NOT EXISTS `DeleteCampaignOffersDTO` (
);  /*Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteCampaignOffersDTONotDeletedOfferIds` generated from model 'DeleteCampaignOffersDTONotDeletedOfferIds'

CREATE TABLE IF NOT EXISTS `DeleteCampaignOffersDTONotDeletedOfferIds` (
  `deleteCampaignOffersDTO` long NOT NULL
  `notDeletedOfferIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteCampaignOffersRequest` generated from model 'deleteCampaignOffersRequest'
-- Фильтрации удаляемых товаров по offerIds. 
--

CREATE TABLE IF NOT EXISTS `DeleteCampaignOffersRequest` (
);  /*Фильтрации удаляемых товаров по offerIds. */

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteCampaignOffersRequestOfferIds` generated from model 'DeleteCampaignOffersRequestOfferIds'

CREATE TABLE IF NOT EXISTS `DeleteCampaignOffersRequestOfferIds` (
  `deleteCampaignOffersRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteCampaignOffersResponse` generated from model 'deleteCampaignOffersResponse'
-- Результат удаления товаров.
--

CREATE TABLE IF NOT EXISTS `DeleteCampaignOffersResponse` (
  `status` long,
  `result` long
);  /*Результат удаления товаров.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteGoodsFeedbackCommentRequest` generated from model 'deleteGoodsFeedbackCommentRequest'
-- Фильтр запроса отзывов по бизнесу. 
--

CREATE TABLE IF NOT EXISTS `DeleteGoodsFeedbackCommentRequest` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор комментария к отзыву. */
);  /*Фильтр запроса отзывов по бизнесу. */


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteHiddenOffersRequest` generated from model 'deleteHiddenOffersRequest'
-- Запрос на возобновление показа оферов.
--

CREATE TABLE IF NOT EXISTS `DeleteHiddenOffersRequest` (
);  /*Запрос на возобновление показа оферов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteHiddenOffersRequestHiddenOfferDTO` generated from model 'DeleteHiddenOffersRequestHiddenOfferDTO'

CREATE TABLE IF NOT EXISTS `DeleteHiddenOffersRequestHiddenOfferDTO` (
  `deleteHiddenOffersRequest` long NOT NULL
  `hiddenOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersDTO` generated from model 'deleteOffersDTO'
-- Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
--

CREATE TABLE IF NOT EXISTS `DeleteOffersDTO` (
);  /*Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersDTONotDeletedOfferIds` generated from model 'DeleteOffersDTONotDeletedOfferIds'

CREATE TABLE IF NOT EXISTS `DeleteOffersDTONotDeletedOfferIds` (
  `deleteOffersDTO` long NOT NULL
  `notDeletedOfferIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersFromArchiveDTO` generated from model 'deleteOffersFromArchiveDTO'
-- Товары, которые не удалось восстановить из архива.
--

CREATE TABLE IF NOT EXISTS `DeleteOffersFromArchiveDTO` (
);  /*Товары, которые не удалось восстановить из архива.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersFromArchiveDTONotUnarchivedOfferIds` generated from model 'DeleteOffersFromArchiveDTONotUnarchivedOfferIds'

CREATE TABLE IF NOT EXISTS `DeleteOffersFromArchiveDTONotUnarchivedOfferIds` (
  `deleteOffersFromArchiveDTO` long NOT NULL
  `notUnarchivedOfferIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersFromArchiveRequest` generated from model 'deleteOffersFromArchiveRequest'
-- Товары, которые нужно восстановить из архива. 
--

CREATE TABLE IF NOT EXISTS `DeleteOffersFromArchiveRequest` (
);  /*Товары, которые нужно восстановить из архива. */

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersFromArchiveRequestOfferIds` generated from model 'DeleteOffersFromArchiveRequestOfferIds'

CREATE TABLE IF NOT EXISTS `DeleteOffersFromArchiveRequestOfferIds` (
  `deleteOffersFromArchiveRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersFromArchiveResponse` generated from model 'deleteOffersFromArchiveResponse'
-- Результат разархивации товаров.
--

CREATE TABLE IF NOT EXISTS `DeleteOffersFromArchiveResponse` (
  `status` long,
  `result` long
);  /*Результат разархивации товаров.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersRequest` generated from model 'deleteOffersRequest'
-- Фильтрации удаляемых товаров по offerIds. 
--

CREATE TABLE IF NOT EXISTS `DeleteOffersRequest` (
);  /*Фильтрации удаляемых товаров по offerIds. */

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersRequestOfferIds` generated from model 'DeleteOffersRequestOfferIds'

CREATE TABLE IF NOT EXISTS `DeleteOffersRequestOfferIds` (
  `deleteOffersRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteOffersResponse` generated from model 'deleteOffersResponse'
-- Результат удаления товаров.
--

CREATE TABLE IF NOT EXISTS `DeleteOffersResponse` (
  `status` long,
  `result` long
);  /*Результат удаления товаров.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePromoOffersRequest` generated from model 'deletePromoOffersRequest'
-- Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
--

CREATE TABLE IF NOT EXISTS `DeletePromoOffersRequest` (
  `promoId` text NOT NULL /*Идентификатор акции.*/,
  `deleteAllOffers` boolean /*Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.*/,
);  /*Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. */

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePromoOffersRequestOfferIds` generated from model 'DeletePromoOffersRequestOfferIds'

CREATE TABLE IF NOT EXISTS `DeletePromoOffersRequestOfferIds` (
  `deletePromoOffersRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePromoOffersResponse` generated from model 'deletePromoOffersResponse'
-- Результат удаления товаров из акции.
--

CREATE TABLE IF NOT EXISTS `DeletePromoOffersResponse` (
  `status` long,
  `result` long
);  /*Результат удаления товаров из акции.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePromoOffersResultDTO` generated from model 'deletePromoOffersResultDTO'
-- Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
--

CREATE TABLE IF NOT EXISTS `DeletePromoOffersResultDTO` (
);  /*Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. */

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePromoOffersResultDTORejectedPromoOfferDeleteDTO` generated from model 'DeletePromoOffersResultDTORejectedPromoOfferDeleteDTO'

CREATE TABLE IF NOT EXISTS `DeletePromoOffersResultDTORejectedPromoOfferDeleteDTO` (
  `deletePromoOffersResultDTO` long NOT NULL
  `rejectedPromoOfferDeleteDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryServiceDTO` generated from model 'deliveryServiceDTO'
-- Служба доставки.
--

CREATE TABLE IF NOT EXISTS `DeliveryServiceDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор службы доставки.*/,
  `name` text /*Наименование службы доставки.*/
);  /*Служба доставки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryServiceInfoDTO` generated from model 'deliveryServiceInfoDTO'
-- Информация о службе доставки.
--

CREATE TABLE IF NOT EXISTS `DeliveryServiceInfoDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор службы доставки.*/,
  `name` text NOT NULL /*Наименование службы доставки.*/
);  /*Информация о службе доставки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryServicesDTO` generated from model 'deliveryServicesDTO'
-- Информация о службах доставки.
--

CREATE TABLE IF NOT EXISTS `DeliveryServicesDTO` (
);  /*Информация о службах доставки.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryServicesDTODeliveryServiceInfoDTO` generated from model 'DeliveryServicesDTODeliveryServiceInfoDTO'

CREATE TABLE IF NOT EXISTS `DeliveryServicesDTODeliveryServiceInfoDTO` (
  `deliveryServicesDTO` long NOT NULL
  `deliveryServiceInfoDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DocumentDTO` generated from model 'documentDTO'
-- Информация о документе.
--

CREATE TABLE IF NOT EXISTS `DocumentDTO` (
  `status` long,
  `number` text /*Номер документа.*/,
  `date` date /*Дата создания документа.*/
);  /*Информация о документе.*/


-- --------------------------------------------------------------------------
-- Table structure for table `EacVerificationResultDTO` generated from model 'eacVerificationResultDTO'
-- Результат выполнения запроса.
--

CREATE TABLE IF NOT EXISTS `EacVerificationResultDTO` (
  `verificationResult` long,
  `attemptsLeft` int /*Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. */
);  /*Результат выполнения запроса.*/


-- --------------------------------------------------------------------------
-- Table structure for table `EmptyApiResponse` generated from model 'emptyApiResponse'
-- Пустой ответ сервера.
--

CREATE TABLE IF NOT EXISTS `EmptyApiResponse` (
  `status` long
);  /*Пустой ответ сервера.*/


-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedMappingsOfferDTO` generated from model 'enrichedMappingsOfferDTO'
-- Информация о рекомендованных карточках товаров.
--

CREATE TABLE IF NOT EXISTS `EnrichedMappingsOfferDTO` (
  `name` text /*Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) */,
  `shopSku` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `category` text /*Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. */,
  `vendor` text /*Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.*/,
  `vendorCode` text /*Артикул товара от производителя.*/,
  `description` text /*Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) */,
  `id` text PRIMARY KEY /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `feedId` long /*Идентификатор фида.*/,
  `manufacturer` text /*Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. */,
  `minShipment` int /*Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. */,
  `transportUnitSize` int /*Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. */,
  `quantumOfSupply` int /*Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. */,
  `deliveryDurationDays` int /*Срок, за который продавец поставляет товары на склад, в днях.*/,
  `boxCount` int /*Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. */,
  `weightDimensions` long,
  `shelfLifeDays` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. */,
  `lifeTimeDays` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. */,
  `guaranteePeriodDays` int /*Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. */,
  `processingState` long,
  `availability` long,
  `shelfLife` long,
  `lifeTime` long,
  `guaranteePeriod` long,
  `certificate` text /*Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) */,
  `price` decimal /*Цена на товар в рублях.*/,
  `marketCategoryId` long /*Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. */,
  `marketCategoryName` text /*Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. */,
  `marketModelId` long /*Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. */,
  `marketModelName` text /*Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. */,
  `marketSku` long /*SKU на Маркете.*/,
  `marketSkuName` text /*Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. */
);  /*Информация о рекомендованных карточках товаров.*/

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedMappingsOfferDTOBarcodes` generated from model 'EnrichedMappingsOfferDTOBarcodes'

CREATE TABLE IF NOT EXISTS `EnrichedMappingsOfferDTOBarcodes` (
  `enrichedMappingsOfferDTO` long NOT NULL
  `barcodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedMappingsOfferDTOUrls` generated from model 'EnrichedMappingsOfferDTOUrls'

CREATE TABLE IF NOT EXISTS `EnrichedMappingsOfferDTOUrls` (
  `enrichedMappingsOfferDTO` long NOT NULL
  `urls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedMappingsOfferDTOPictures` generated from model 'EnrichedMappingsOfferDTOPictures'

CREATE TABLE IF NOT EXISTS `EnrichedMappingsOfferDTOPictures` (
  `enrichedMappingsOfferDTO` long NOT NULL
  `pictures` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedMappingsOfferDTOManufacturerCountries` generated from model 'EnrichedMappingsOfferDTOManufacturerCountries'

CREATE TABLE IF NOT EXISTS `EnrichedMappingsOfferDTOManufacturerCountries` (
  `enrichedMappingsOfferDTO` long NOT NULL
  `manufacturerCountries` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedMappingsOfferDTOCustomsCommodityCodes` generated from model 'EnrichedMappingsOfferDTOCustomsCommodityCodes'

CREATE TABLE IF NOT EXISTS `EnrichedMappingsOfferDTOCustomsCommodityCodes` (
  `enrichedMappingsOfferDTO` long NOT NULL
  `customsCommodityCodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedMappingsOfferDTODayOfWeekType` generated from model 'EnrichedMappingsOfferDTODayOfWeekType'

CREATE TABLE IF NOT EXISTS `EnrichedMappingsOfferDTODayOfWeekType` (
  `enrichedMappingsOfferDTO` long NOT NULL
  `dayOfWeekType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedModelDTO` generated from model 'enrichedModelDTO'
-- Модель товара.
--

CREATE TABLE IF NOT EXISTS `EnrichedModelDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор модели товара.*/,
  `name` text /*Название модели товара.*/,
  `prices` long,
  `offlineOffers` int /*Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.*/,
  `onlineOffers` int /*Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.*/
);  /*Модель товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedModelDTOModelOfferDTO` generated from model 'EnrichedModelDTOModelOfferDTO'

CREATE TABLE IF NOT EXISTS `EnrichedModelDTOModelOfferDTO` (
  `enrichedModelDTO` long NOT NULL
  `modelOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedModelsDTO` generated from model 'enrichedModelsDTO'
-- Список моделей товаров.
--

CREATE TABLE IF NOT EXISTS `EnrichedModelsDTO` (
);  /*Список моделей товаров.*/

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedModelsDTOEnrichedModelDTO` generated from model 'EnrichedModelsDTOEnrichedModelDTO'

CREATE TABLE IF NOT EXISTS `EnrichedModelsDTOEnrichedModelDTO` (
  `enrichedModelsDTO` long NOT NULL
  `enrichedModelDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedOrderBoxLayoutDTO` generated from model 'enrichedOrderBoxLayoutDTO'
-- Информация о коробке.
--

CREATE TABLE IF NOT EXISTS `EnrichedOrderBoxLayoutDTO` (
  `boxId` long /*Идентификатор коробки.*/
);  /*Информация о коробке.*/

-- --------------------------------------------------------------------------
-- Table structure for table `EnrichedOrderBoxLayoutDTOOrderBoxLayoutItemDTO` generated from model 'EnrichedOrderBoxLayoutDTOOrderBoxLayoutItemDTO'

CREATE TABLE IF NOT EXISTS `EnrichedOrderBoxLayoutDTOOrderBoxLayoutItemDTO` (
  `enrichedOrderBoxLayoutDTO` long NOT NULL
  `orderBoxLayoutItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ExtensionShipmentDTO` generated from model 'extensionShipmentDTO'
-- Информация об отгрузке.
--

CREATE TABLE IF NOT EXISTS `ExtensionShipmentDTO` (
  `currentStatus` long
);  /*Информация об отгрузке.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ExtensionShipmentDTOShipmentActionType` generated from model 'ExtensionShipmentDTOShipmentActionType'

CREATE TABLE IF NOT EXISTS `ExtensionShipmentDTOShipmentActionType` (
  `extensionShipmentDTO` long NOT NULL
  `shipmentActionType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FeedContentDTO` generated from model 'feedContentDTO'
-- Информация о проверке содержимого прайс-листа, загруженного на Маркет.
--

CREATE TABLE IF NOT EXISTS `FeedContentDTO` (
  `rejectedOffersCount` long /*Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. */,
  `status` long,
  `totalOffersCount` long /*Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. */,
  `error` long
);  /*Информация о проверке содержимого прайс-листа, загруженного на Маркет.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedContentErrorDTO` generated from model 'feedContentErrorDTO'
-- Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. 
--

CREATE TABLE IF NOT EXISTS `FeedContentErrorDTO` (
  `type` long
);  /*Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. */


-- --------------------------------------------------------------------------
-- Table structure for table `FeedDTO` generated from model 'feedDTO'
-- Информация о прайс-листе.
--

CREATE TABLE IF NOT EXISTS `FeedDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор прайс-листа.*/,
  `login` text /*Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. */,
  `name` text /*Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. */,
  `password` text /*Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. */,
  `uploadDate` datetime /*Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета. */,
  `url` text /*URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. */,
  `content` long,
  `download` long,
  `placement` long,
  `publication` long
);  /*Информация о прайс-листе.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedDownloadDTO` generated from model 'feedDownloadDTO'
-- Информация о последней загрузке прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedDownloadDTO` (
  `status` long,
  `error` long
);  /*Информация о последней загрузке прайс-листа.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedDownloadErrorDTO` generated from model 'feedDownloadErrorDTO'
-- Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
--

CREATE TABLE IF NOT EXISTS `FeedDownloadErrorDTO` (
  `httpStatusCode` int /*HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. */,
  `type` long,
  `description` text /*Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. */
);  /*Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. */


-- --------------------------------------------------------------------------
-- Table structure for table `FeedIndexLogsErrorDTO` generated from model 'feedIndexLogsErrorDTO'
-- Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). 
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsErrorDTO` (
  `httpStatusCode` int /*HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. */,
  `type` long,
  `description` text /*Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. */
);  /*Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). */


-- --------------------------------------------------------------------------
-- Table structure for table `FeedIndexLogsFeedDTO` generated from model 'feedIndexLogsFeedDTO'
-- Информация о прайс-листе.
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsFeedDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор прайс-листа.*/
);  /*Информация о прайс-листе.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedIndexLogsOffersDTO` generated from model 'feedIndexLogsOffersDTO'
-- Информация о предложениях прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsOffersDTO` (
  `rejectedCount` long /*Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.*/,
  `totalCount` long /*Количество предложений в прайс-листе.*/
);  /*Информация о предложениях прайс-листа.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedIndexLogsRecordDTO` generated from model 'feedIndexLogsRecordDTO'
-- Список отчетов по индексации прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsRecordDTO` (
  `downloadTime` datetime /*Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. */,
  `fileTime` datetime /*Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. */,
  `generationId` long /*Идентификатор индексации.*/,
  `indexType` long,
  `publishedTime` datetime /*Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. */,
  `status` long,
  `error` long,
  `offers` long
);  /*Список отчетов по индексации прайс-листа.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedIndexLogsResultDTO` generated from model 'feedIndexLogsResultDTO'
-- Результат выполнения запроса отчета по индексации прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsResultDTO` (
  `feed` long,
  `total` long /*Количество отчетов на всех страницах выходных данных.*/
);  /*Результат выполнения запроса отчета по индексации прайс-листа.*/

-- --------------------------------------------------------------------------
-- Table structure for table `FeedIndexLogsResultDTOFeedIndexLogsRecordDTO` generated from model 'FeedIndexLogsResultDTOFeedIndexLogsRecordDTO'

CREATE TABLE IF NOT EXISTS `FeedIndexLogsResultDTOFeedIndexLogsRecordDTO` (
  `feedIndexLogsResultDTO` long NOT NULL
  `feedIndexLogsRecordDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FeedParameterDTO` generated from model 'feedParameterDTO'
-- Параметр прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedParameterDTO` (
  `name` text NOT NULL /*Название параметра.  Возможное значение: - &#x60;reparseIntervalMinutes&#x60; — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре &#x60;value&#x60;. Например, при &#x60;value&#x3D;1440&#x60;, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. */,
  `deleted` boolean /*Удалить ли значение параметра.  Возможное значение: * &#x60;true&#x60; — удалить значение параметра.  Используется вместе с параметром &#x60;name&#x60;. */,
);  /*Параметр прайс-листа.*/

-- --------------------------------------------------------------------------
-- Table structure for table `FeedParameterDTOPropertyValues` generated from model 'FeedParameterDTOPropertyValues'

CREATE TABLE IF NOT EXISTS `FeedParameterDTOPropertyValues` (
  `feedParameterDTO` long NOT NULL
  `propertyValues` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FeedPlacementDTO` generated from model 'feedPlacementDTO'
-- Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
--

CREATE TABLE IF NOT EXISTS `FeedPlacementDTO` (
  `status` long,
  `totalOffersCount` int /*Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.*/
);  /*Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedPublicationDTO` generated from model 'feedPublicationDTO'
-- Информация о последней публикации предложений из прайс-листа на Маркете.
--

CREATE TABLE IF NOT EXISTS `FeedPublicationDTO` (
  `status` long,
  `full` long,
  `priceAndStockUpdate` long
);  /*Информация о последней публикации предложений из прайс-листа на Маркете.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedPublicationFullDTO` generated from model 'feedPublicationFullDTO'
-- Информация о последней публикации предложений из прайс-листа на Маркете. 
--

CREATE TABLE IF NOT EXISTS `FeedPublicationFullDTO` (
  `fileTime` datetime /*Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. */,
  `publishedTime` datetime /*Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. */
);  /*Информация о последней публикации предложений из прайс-листа на Маркете. */


-- --------------------------------------------------------------------------
-- Table structure for table `FeedPublicationPriceAndStockUpdateDTO` generated from model 'feedPublicationPriceAndStockUpdateDTO'
-- Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
--

CREATE TABLE IF NOT EXISTS `FeedPublicationPriceAndStockUpdateDTO` (
  `fileTime` datetime /*Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. */,
  `publishedTime` datetime /*Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. */
);  /*Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. */


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackAuthorDTO` generated from model 'feedbackAuthorDTO'
-- Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
--

CREATE TABLE IF NOT EXISTS `FeedbackAuthorDTO` (
  `name` text /*Имя автора отзыва.*/,
  `region` long
);  /*Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. */


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackCommentAuthorDTO` generated from model 'feedbackCommentAuthorDTO'
-- Информация об авторе комментария.
--

CREATE TABLE IF NOT EXISTS `FeedbackCommentAuthorDTO` (
  `type` long,
  `name` text /*Имя автора отзыва или название магазина.*/
);  /*Информация об авторе комментария.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackCommentDTO` generated from model 'feedbackCommentDTO'
-- Комментарий к отзыву на магазин.
--

CREATE TABLE IF NOT EXISTS `FeedbackCommentDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор ответа.*/,
  `parentId` long /*Идентификатор родительского ответа.*/,
  `body` text /*Текст ответа.*/,
  `createdAt` datetime /*Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. */,
  `updatedAt` datetime /*Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. */,
  `author` long,
);  /*Комментарий к отзыву на магазин.*/

-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackCommentDTOFeedbackCommentDTO` generated from model 'FeedbackCommentDTOFeedbackCommentDTO'

CREATE TABLE IF NOT EXISTS `FeedbackCommentDTOFeedbackCommentDTO` (
  `feedbackCommentDTO` long NOT NULL
  `feedbackCommentDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackDTO` generated from model 'feedbackDTO'
-- Отзыв пользователя Яндекс Маркета об указанном магазине.
--

CREATE TABLE IF NOT EXISTS `FeedbackDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор отзыва.*/,
  `createdAt` datetime /*Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. */,
  `text` text /*Комментарий автора отзыва.*/,
  `state` long,
  `author` long,
  `pro` text /*Достоинства магазина, описанные в отзыве.*/,
  `contra` text /*Недостатки магазина, описанные в отзыве.*/,
  `shop` long,
  `resolved` boolean /*Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. */,
  `verified` boolean /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. */,
  `recommend` boolean /*Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. */,
  `grades` long,
  `order` long
);  /*Отзыв пользователя Яндекс Маркета об указанном магазине.*/

-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackDTOFeedbackCommentDTO` generated from model 'FeedbackDTOFeedbackCommentDTO'

CREATE TABLE IF NOT EXISTS `FeedbackDTOFeedbackCommentDTO` (
  `feedbackDTO` long NOT NULL
  `feedbackCommentDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackFactorDTO` generated from model 'feedbackFactorDTO'
-- Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
--

CREATE TABLE IF NOT EXISTS `FeedbackFactorDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор параметра.*/,
  `title` text /*Название параметра. Например, &#x60;Скорость обработки заказа&#x60;.*/,
  `description` text /*Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;.*/,
  `value` int /*Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка). */
);  /*Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. */


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackGradesDTO` generated from model 'feedbackGradesDTO'
-- Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
--

CREATE TABLE IF NOT EXISTS `FeedbackGradesDTO` (
  `average` decimal /*Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»).*/,
  `agreeCount` long /*Количество пользователей, считающих отзыв полезным.*/,
  `rejectCount` long /*Количество пользователей, считающих отзыв бесполезным.*/
);  /*Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.*/

-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackGradesDTOFeedbackFactorDTO` generated from model 'FeedbackGradesDTOFeedbackFactorDTO'

CREATE TABLE IF NOT EXISTS `FeedbackGradesDTOFeedbackFactorDTO` (
  `feedbackGradesDTO` long NOT NULL
  `feedbackFactorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackListDTO` generated from model 'feedbackListDTO'
-- Отзывы пользователей Яндекс Маркета об указанном магазине.
--

CREATE TABLE IF NOT EXISTS `FeedbackListDTO` (
  `paging` long
);  /*Отзывы пользователей Яндекс Маркета об указанном магазине.*/

-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackListDTOFeedbackDTO` generated from model 'FeedbackListDTOFeedbackDTO'

CREATE TABLE IF NOT EXISTS `FeedbackListDTOFeedbackDTO` (
  `feedbackListDTO` long NOT NULL
  `feedbackDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackOrderDTO` generated from model 'feedbackOrderDTO'
-- Информация о заказе, указанная в отзыве.
--

CREATE TABLE IF NOT EXISTS `FeedbackOrderDTO` (
  `shopOrderId` text /*Номер заказа, указанный в отзыве.*/,
  `delivery` long
);  /*Информация о заказе, указанная в отзыве.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FeedbackShopDTO` generated from model 'feedbackShopDTO'
-- Информация о магазине.
--

CREATE TABLE IF NOT EXISTS `FeedbackShopDTO` (
  `name` text /*Название магазина.*/
);  /*Информация о магазине.*/


-- --------------------------------------------------------------------------
-- Table structure for table `FlippingPagerDTO` generated from model 'flippingPagerDTO'
-- Модель для пагинации.
--

CREATE TABLE IF NOT EXISTS `FlippingPagerDTO` (
  `total` int /*Сколько всего найдено элементов.*/,
  `from` int /*Начальный номер найденного элемента на странице.*/,
  `to` int /*Конечный номер найденного элемента на странице.*/,
  `currentPage` int /*Текущая страница.*/,
  `pagesCount` int /*Общее количество страниц.*/,
  `pageSize` int /*Размер страницы.*/
);  /*Модель для пагинации.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ForwardScrollingPagerDTO` generated from model 'forwardScrollingPagerDTO'
-- Ссылка на следующую страницу. 
--

CREATE TABLE IF NOT EXISTS `ForwardScrollingPagerDTO` (
  `nextPageToken` text /*Идентификатор следующей страницы результатов.*/
);  /*Ссылка на следующую страницу. */


-- --------------------------------------------------------------------------
-- Table structure for table `FulfillmentWarehouseDTO` generated from model 'fulfillmentWarehouseDTO'
-- Склад Маркета (FBY).
--

CREATE TABLE IF NOT EXISTS `FulfillmentWarehouseDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор склада.*/,
  `name` text NOT NULL /*Название склада.*/,
  `address` long
);  /*Склад Маркета (FBY).*/


-- --------------------------------------------------------------------------
-- Table structure for table `FulfillmentWarehousesDTO` generated from model 'fulfillmentWarehousesDTO'
-- Список складов Маркета (FBY).
--

CREATE TABLE IF NOT EXISTS `FulfillmentWarehousesDTO` (
);  /*Список складов Маркета (FBY).*/

-- --------------------------------------------------------------------------
-- Table structure for table `FulfillmentWarehousesDTOFulfillmentWarehouseDTO` generated from model 'FulfillmentWarehousesDTOFulfillmentWarehouseDTO'

CREATE TABLE IF NOT EXISTS `FulfillmentWarehousesDTOFulfillmentWarehouseDTO` (
  `fulfillmentWarehousesDTO` long NOT NULL
  `fulfillmentWarehouseDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FullOutletDTO` generated from model 'fullOutletDTO'
-- Информация о точке продаж.
--

CREATE TABLE IF NOT EXISTS `FullOutletDTO` (
  `name` text NOT NULL /*Название точки продаж. */,
  `type` long NOT NULL,
  `address` long NOT NULL,
  `workingSchedule` long NOT NULL,
  `coords` text /*Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. */,
  `isMain` boolean /*Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. */,
  `shopOutletCode` text /*Идентификатор точки продаж, присвоенный магазином.*/,
  `visibility` long,
  `storagePeriod` long /*Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.*/,
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор точки продаж, присвоенный Маркетом.*/,
  `status` long,
  `region` long,
  `shopOutletId` text /*Идентификатор точки продаж, заданный магазином.*/,
  `workingTime` text /*Рабочее время.*/,
  `moderationReason` text /*Статус модерации.*/
);  /*Информация о точке продаж.*/

-- --------------------------------------------------------------------------
-- Table structure for table `FullOutletDTOPhones` generated from model 'FullOutletDTOPhones'

CREATE TABLE IF NOT EXISTS `FullOutletDTOPhones` (
  `fullOutletDTO` long NOT NULL
  `phones` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `FullOutletDTOOutletDeliveryRuleDTO` generated from model 'FullOutletDTOOutletDeliveryRuleDTO'

CREATE TABLE IF NOT EXISTS `FullOutletDTOOutletDeliveryRuleDTO` (
  `fullOutletDTO` long NOT NULL
  `outletDeliveryRuleDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FullOutletLicenseDTO` generated from model 'fullOutletLicenseDTO'
-- Информация о лицензии.
--

CREATE TABLE IF NOT EXISTS `FullOutletLicenseDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;. */,
  `outletId` long /*Идентификатор точки продаж, для которой действительна лицензия.*/,
  `licenseType` long,
  `number` text /*Номер лицензии.*/,
  `dateOfIssue` datetime /*Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;. */,
  `dateOfExpiry` datetime /*Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;. */,
  `checkStatus` long,
  `checkComment` text /*Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр &#x60;checkStatus&#x60; имеет значение &#x60;FAIL&#x60;. */
);  /*Информация о лицензии.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateBoostConsolidatedRequest` generated from model 'generateBoostConsolidatedRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateBoostConsolidatedRequest` (
  `businessId` long NOT NULL /*Идентификатор бизнеса.*/,
  `dateFrom` date NOT NULL /*Начало периода, включительно.*/,
  `dateTo` date NOT NULL /*Конец периода, включительно.*/
);  /*Данные, необходимые для генерации отчета. */


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateCompetitorsPositionReportRequest` generated from model 'generateCompetitorsPositionReportRequest'
-- Данные, необходимые для генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateCompetitorsPositionReportRequest` (
  `businessId` long NOT NULL /*Идентификатор бизнеса.*/,
  `categoryId` long NOT NULL /*Идентификатор категории.*/,
  `dateFrom` date NOT NULL /*Начало периода, включительно.*/,
  `dateTo` date NOT NULL /*Конец периода, включительно.*/
);  /*Данные, необходимые для генерации отчета.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateGoodsFeedbackRequest` generated from model 'generateGoodsFeedbackRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateGoodsFeedbackRequest` (
  `businessId` long NOT NULL /*Идентификатор бизнеса.*/
);  /*Данные, необходимые для генерации отчета. */


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateGoodsMovementReportRequest` generated from model 'generateGoodsMovementReportRequest'
-- Данные, необходимые для генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateGoodsMovementReportRequest` (
  `campaignId` long NOT NULL /*Идентификатор кампании.*/,
  `dateFrom` date NOT NULL /*Начало периода, включительно.*/,
  `dateTo` date NOT NULL /*Конец периода, включительно.*/,
  `shopSku` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */
);  /*Данные, необходимые для генерации отчета.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateGoodsRealizationReportRequest` generated from model 'generateGoodsRealizationReportRequest'
-- Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
--

CREATE TABLE IF NOT EXISTS `GenerateGoodsRealizationReportRequest` (
  `campaignId` long NOT NULL /*Идентификатор кампании.*/,
  `year` int NOT NULL /*Год.*/,
  `month` int UNSIGNED NOT NULL /*Номер месяца.*/
);  /*Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. */


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateGoodsTurnoverRequest` generated from model 'generateGoodsTurnoverRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateGoodsTurnoverRequest` (
  `campaignId` long NOT NULL /*Идентификатор кампании.*/,
  `date` date /*Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.*/
);  /*Данные, необходимые для генерации отчета. */


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateMassOrderLabelsRequest` generated from model 'generateMassOrderLabelsRequest'
-- Данные, необходимые для генерации файла. 
--

CREATE TABLE IF NOT EXISTS `GenerateMassOrderLabelsRequest` (
  `businessId` long NOT NULL /*Идентификатор кабинета.*/,
);  /*Данные, необходимые для генерации файла. */

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateMassOrderLabelsRequestOrderIds` generated from model 'GenerateMassOrderLabelsRequestOrderIds'

CREATE TABLE IF NOT EXISTS `GenerateMassOrderLabelsRequestOrderIds` (
  `generateMassOrderLabelsRequest` long NOT NULL
  `orderIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GeneratePricesReportRequest` generated from model 'generatePricesReportRequest'
-- Данные, необходимые для генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GeneratePricesReportRequest` (
  `businessId` long /*Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;. */,
  `campaignId` long /*Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно. */,
  `creationDateFrom` date /*Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */,
  `creationDateTo` date /*Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */
);  /*Данные, необходимые для генерации отчета.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GeneratePricesReportRequestCategoryIds` generated from model 'GeneratePricesReportRequestCategoryIds'

CREATE TABLE IF NOT EXISTS `GeneratePricesReportRequestCategoryIds` (
  `generatePricesReportRequest` long NOT NULL
  `categoryIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateReportDTO` generated from model 'generateReportDTO'
-- Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateReportDTO` (
  `reportId` text NOT NULL /*Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.*/,
  `estimatedGenerationTime` long NOT NULL /*Ожидаемая продолжительность генерации в миллисекундах.*/
);  /*Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateReportResponse` generated from model 'generateReportResponse'
-- Ответ на запрос генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateReportResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос генерации отчета.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateShelfsStatisticsRequest` generated from model 'generateShelfsStatisticsRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateShelfsStatisticsRequest` (
  `businessId` long NOT NULL /*Идентификатор бизнеса.*/,
  `dateFrom` date NOT NULL /*Начало периода, включительно.*/,
  `dateTo` date NOT NULL /*Конец периода, включительно.*/,
  `attributionType` long NOT NULL
);  /*Данные, необходимые для генерации отчета. */


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateShipmentListDocumentReportRequest` generated from model 'generateShipmentListDocumentReportRequest'
-- Данные, необходимые для генерации документа. 
--

CREATE TABLE IF NOT EXISTS `GenerateShipmentListDocumentReportRequest` (
  `campaignId` long NOT NULL /*Идентификатор кампании.*/,
  `shipmentId` long /*Идентификатор отгрузки.*/,
);  /*Данные, необходимые для генерации документа. */

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateShipmentListDocumentReportRequestOrderIds` generated from model 'GenerateShipmentListDocumentReportRequestOrderIds'

CREATE TABLE IF NOT EXISTS `GenerateShipmentListDocumentReportRequestOrderIds` (
  `generateShipmentListDocumentReportRequest` long NOT NULL
  `orderIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateShowsSalesReportRequest` generated from model 'generateShowsSalesReportRequest'
-- Данные, необходимые для генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateShowsSalesReportRequest` (
  `dateFrom` date NOT NULL /*Начало периода, включительно.*/,
  `dateTo` date NOT NULL /*Конец периода, включительно.*/,
  `grouping` long NOT NULL,
  `businessId` long /*Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. */,
  `campaignId` long /*Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. */
);  /*Данные, необходимые для генерации отчета.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateStocksOnWarehousesReportRequest` generated from model 'generateStocksOnWarehousesReportRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateStocksOnWarehousesReportRequest` (
  `campaignId` long NOT NULL /*Идентификатор магазина.*/,
  `reportDate` date /*Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.*/,
  `hasStocks` boolean /*Фильтр по наличию остатков (кроме модели FBY).*/
);  /*Данные, необходимые для генерации отчета. */

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateStocksOnWarehousesReportRequestWarehouseIds` generated from model 'GenerateStocksOnWarehousesReportRequestWarehouseIds'

CREATE TABLE IF NOT EXISTS `GenerateStocksOnWarehousesReportRequestWarehouseIds` (
  `generateStocksOnWarehousesReportRequest` long NOT NULL
  `warehouseIds` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateStocksOnWarehousesReportRequestCategoryIds` generated from model 'GenerateStocksOnWarehousesReportRequestCategoryIds'

CREATE TABLE IF NOT EXISTS `GenerateStocksOnWarehousesReportRequestCategoryIds` (
  `generateStocksOnWarehousesReportRequest` long NOT NULL
  `categoryIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedMarketplaceServicesReportRequest` generated from model 'generateUnitedMarketplaceServicesReportRequest'
-- Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
--

CREATE TABLE IF NOT EXISTS `GenerateUnitedMarketplaceServicesReportRequest` (
  `businessId` long NOT NULL /*Идентификатор бизнеса.*/,
  `dateTimeFrom` datetime /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. */,
  `dateTimeTo` datetime /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. */,
  `dateFrom` date /*Начало периода, включительно.*/,
  `dateTo` date /*Конец периода, включительно. Максимальный период — 1 год.*/,
  `yearFrom` int /*Начальный год формирования акта.*/,
  `monthFrom` int UNSIGNED /*Начальный номер месяца формирования акта.*/,
  `yearTo` int /*Конечный год формирования акта.*/,
  `monthTo` int UNSIGNED /*Конечный номер месяца формирования акта.*/,
);  /*Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. */

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedMarketplaceServicesReportRequestPlacementType` generated from model 'GenerateUnitedMarketplaceServicesReportRequestPlacementType'

CREATE TABLE IF NOT EXISTS `GenerateUnitedMarketplaceServicesReportRequestPlacementType` (
  `generateUnitedMarketplaceServicesReportRequest` long NOT NULL
  `placementType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedMarketplaceServicesReportRequestInns` generated from model 'GenerateUnitedMarketplaceServicesReportRequestInns'

CREATE TABLE IF NOT EXISTS `GenerateUnitedMarketplaceServicesReportRequestInns` (
  `generateUnitedMarketplaceServicesReportRequest` long NOT NULL
  `inns` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedMarketplaceServicesReportRequestCampaignIds` generated from model 'GenerateUnitedMarketplaceServicesReportRequestCampaignIds'

CREATE TABLE IF NOT EXISTS `GenerateUnitedMarketplaceServicesReportRequestCampaignIds` (
  `generateUnitedMarketplaceServicesReportRequest` long NOT NULL
  `campaignIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedNettingReportRequest` generated from model 'generateUnitedNettingReportRequest'
-- Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
--

CREATE TABLE IF NOT EXISTS `GenerateUnitedNettingReportRequest` (
  `businessId` long NOT NULL /*Идентификатор бизнеса.*/,
  `dateTimeFrom` datetime /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. */,
  `dateTimeTo` datetime /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. */,
  `dateFrom` date /*Начало периода, включительно.*/,
  `dateTo` date /*Конец периода, включительно. Максимальный период — 1 год.*/,
  `bankOrderId` long /*Номер платежного поручения.*/,
  `bankOrderDateTime` datetime /*Дата платежного поручения.*/,
);  /*Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. */

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedNettingReportRequestPlacementType` generated from model 'GenerateUnitedNettingReportRequestPlacementType'

CREATE TABLE IF NOT EXISTS `GenerateUnitedNettingReportRequestPlacementType` (
  `generateUnitedNettingReportRequest` long NOT NULL
  `placementType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedNettingReportRequestInns` generated from model 'GenerateUnitedNettingReportRequestInns'

CREATE TABLE IF NOT EXISTS `GenerateUnitedNettingReportRequestInns` (
  `generateUnitedNettingReportRequest` long NOT NULL
  `inns` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedNettingReportRequestCampaignIds` generated from model 'GenerateUnitedNettingReportRequestCampaignIds'

CREATE TABLE IF NOT EXISTS `GenerateUnitedNettingReportRequestCampaignIds` (
  `generateUnitedNettingReportRequest` long NOT NULL
  `campaignIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedOrdersRequest` generated from model 'generateUnitedOrdersRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateUnitedOrdersRequest` (
  `businessId` long NOT NULL /*Идентификатор бизнеса.*/,
  `dateFrom` date NOT NULL /*Начало периода, включительно.*/,
  `dateTo` date NOT NULL /*Конец периода, включительно. Максимальный период — 1 год.*/,
  `promoId` text /*Идентификатор акции, товары из которой нужны в отчете.*/
);  /*Данные, необходимые для генерации отчета. */

-- --------------------------------------------------------------------------
-- Table structure for table `GenerateUnitedOrdersRequestCampaignIds` generated from model 'GenerateUnitedOrdersRequestCampaignIds'

CREATE TABLE IF NOT EXISTS `GenerateUnitedOrdersRequestCampaignIds` (
  `generateUnitedOrdersRequest` long NOT NULL
  `campaignIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetAllOffersResponse` generated from model 'getAllOffersResponse'
-- Список предложений.
--

CREATE TABLE IF NOT EXISTS `GetAllOffersResponse` (
);  /*Список предложений.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetAllOffersResponseOfferDTO` generated from model 'GetAllOffersResponseOfferDTO'

CREATE TABLE IF NOT EXISTS `GetAllOffersResponseOfferDTO` (
  `getAllOffersResponse` long NOT NULL
  `offerDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsInfoRequest` generated from model 'getBidsInfoRequest'
-- description.
--

CREATE TABLE IF NOT EXISTS `GetBidsInfoRequest` (
);  /*description.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsInfoRequestSkus` generated from model 'GetBidsInfoRequestSkus'

CREATE TABLE IF NOT EXISTS `GetBidsInfoRequestSkus` (
  `getBidsInfoRequest` long NOT NULL
  `skus` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsInfoResponse` generated from model 'getBidsInfoResponse'
-- description.
--

CREATE TABLE IF NOT EXISTS `GetBidsInfoResponse` (
  `status` long,
  `result` long
);  /*description.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsInfoResponseDTO` generated from model 'getBidsInfoResponseDTO'
-- Список товаров с указанными ставками.
--

CREATE TABLE IF NOT EXISTS `GetBidsInfoResponseDTO` (
  `paging` long
);  /*Список товаров с указанными ставками.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsInfoResponseDTOSkuBidItemDTO` generated from model 'GetBidsInfoResponseDTOSkuBidItemDTO'

CREATE TABLE IF NOT EXISTS `GetBidsInfoResponseDTOSkuBidItemDTO` (
  `getBidsInfoResponseDTO` long NOT NULL
  `skuBidItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsRecommendationsRequest` generated from model 'getBidsRecommendationsRequest'
-- description.
--

CREATE TABLE IF NOT EXISTS `GetBidsRecommendationsRequest` (
);  /*description.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsRecommendationsRequestSkus` generated from model 'GetBidsRecommendationsRequestSkus'

CREATE TABLE IF NOT EXISTS `GetBidsRecommendationsRequestSkus` (
  `getBidsRecommendationsRequest` long NOT NULL
  `skus` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsRecommendationsResponse` generated from model 'getBidsRecommendationsResponse'
-- description.
--

CREATE TABLE IF NOT EXISTS `GetBidsRecommendationsResponse` (
  `status` long,
  `result` long
);  /*description.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsRecommendationsResponseDTO` generated from model 'getBidsRecommendationsResponseDTO'
-- Список товаров с рекомендованными ставками.
--

CREATE TABLE IF NOT EXISTS `GetBidsRecommendationsResponseDTO` (
);  /*Список товаров с рекомендованными ставками.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetBidsRecommendationsResponseDTOSkuBidRecommendationItemDTO` generated from model 'GetBidsRecommendationsResponseDTOSkuBidRecommendationItemDTO'

CREATE TABLE IF NOT EXISTS `GetBidsRecommendationsResponseDTOSkuBidRecommendationItemDTO` (
  `getBidsRecommendationsResponseDTO` long NOT NULL
  `skuBidRecommendationItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetBusinessBuyerInfoResponse` generated from model 'getBusinessBuyerInfoResponse'
--

CREATE TABLE IF NOT EXISTS `GetBusinessBuyerInfoResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetBusinessDocumentsInfoResponse` generated from model 'getBusinessDocumentsInfoResponse'
--

CREATE TABLE IF NOT EXISTS `GetBusinessDocumentsInfoResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetBusinessSettingsInfoDTO` generated from model 'getBusinessSettingsInfoDTO'
-- Информация о кабинете и его настройках.
--

CREATE TABLE IF NOT EXISTS `GetBusinessSettingsInfoDTO` (
  `info` long,
  `settings` long
);  /*Информация о кабинете и его настройках.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetBusinessSettingsResponse` generated from model 'getBusinessSettingsResponse'
-- Ответ на запрос настроек кабинета.
--

CREATE TABLE IF NOT EXISTS `GetBusinessSettingsResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос настроек кабинета.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignLoginsResponse` generated from model 'getCampaignLoginsResponse'
-- Ответ на запрос списка логинов, связанных с магазином.
--

CREATE TABLE IF NOT EXISTS `GetCampaignLoginsResponse` (
);  /*Ответ на запрос списка логинов, связанных с магазином.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignLoginsResponseLogins` generated from model 'GetCampaignLoginsResponseLogins'

CREATE TABLE IF NOT EXISTS `GetCampaignLoginsResponseLogins` (
  `getCampaignLoginsResponse` long NOT NULL
  `logins` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOfferDTO` generated from model 'getCampaignOfferDTO'
-- Параметры размещения товара в магазине.
--

CREATE TABLE IF NOT EXISTS `GetCampaignOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `quantum` long,
  `available` boolean /*Есть ли товар в продаже. */,
  `basicPrice` long,
  `campaignPrice` long,
  `status` long,
);  /*Параметры размещения товара в магазине.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOfferDTOOfferErrorDTO` generated from model 'GetCampaignOfferDTOOfferErrorDTO'

CREATE TABLE IF NOT EXISTS `GetCampaignOfferDTOOfferErrorDTO` (
  `getCampaignOfferDTO` long NOT NULL
  `offerErrorDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOfferDTOOfferErrorDTO` generated from model 'GetCampaignOfferDTOOfferErrorDTO'

CREATE TABLE IF NOT EXISTS `GetCampaignOfferDTOOfferErrorDTO` (
  `getCampaignOfferDTO` long NOT NULL
  `offerErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersRequest` generated from model 'getCampaignOffersRequest'
-- Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
--

CREATE TABLE IF NOT EXISTS `GetCampaignOffersRequest` (
);  /*Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. */

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersRequestOfferIds` generated from model 'GetCampaignOffersRequestOfferIds'

CREATE TABLE IF NOT EXISTS `GetCampaignOffersRequestOfferIds` (
  `getCampaignOffersRequest` long NOT NULL
  `offerIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersRequestOfferCampaignStatusType` generated from model 'GetCampaignOffersRequestOfferCampaignStatusType'

CREATE TABLE IF NOT EXISTS `GetCampaignOffersRequestOfferCampaignStatusType` (
  `getCampaignOffersRequest` long NOT NULL
  `offerCampaignStatusType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersRequestCategoryIds` generated from model 'GetCampaignOffersRequestCategoryIds'

CREATE TABLE IF NOT EXISTS `GetCampaignOffersRequestCategoryIds` (
  `getCampaignOffersRequest` long NOT NULL
  `categoryIds` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersRequestVendorNames` generated from model 'GetCampaignOffersRequestVendorNames'

CREATE TABLE IF NOT EXISTS `GetCampaignOffersRequestVendorNames` (
  `getCampaignOffersRequest` long NOT NULL
  `vendorNames` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersRequestTags` generated from model 'GetCampaignOffersRequestTags'

CREATE TABLE IF NOT EXISTS `GetCampaignOffersRequestTags` (
  `getCampaignOffersRequest` long NOT NULL
  `tags` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersResponse` generated from model 'getCampaignOffersResponse'
-- Ответ на запрос списка товаров в магазине.
--

CREATE TABLE IF NOT EXISTS `GetCampaignOffersResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос списка товаров в магазине.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersResultDTO` generated from model 'getCampaignOffersResultDTO'
-- Список товаров в заданном магазине.
--

CREATE TABLE IF NOT EXISTS `GetCampaignOffersResultDTO` (
  `paging` long
);  /*Список товаров в заданном магазине.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignOffersResultDTOGetCampaignOfferDTO` generated from model 'GetCampaignOffersResultDTOGetCampaignOfferDTO'

CREATE TABLE IF NOT EXISTS `GetCampaignOffersResultDTOGetCampaignOfferDTO` (
  `getCampaignOffersResultDTO` long NOT NULL
  `getCampaignOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignRegionResponse` generated from model 'getCampaignRegionResponse'
-- Ответ на запрос региона магазина.
--

CREATE TABLE IF NOT EXISTS `GetCampaignRegionResponse` (
  `region` long
);  /*Ответ на запрос региона магазина.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignResponse` generated from model 'getCampaignResponse'
-- Информация о магазине к данным идентификатора кампании.
--

CREATE TABLE IF NOT EXISTS `GetCampaignResponse` (
  `campaign` long
);  /*Информация о магазине к данным идентификатора кампании.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignSettingsResponse` generated from model 'getCampaignSettingsResponse'
-- Ответ на запрос настроек магазина.
--

CREATE TABLE IF NOT EXISTS `GetCampaignSettingsResponse` (
  `settings` long
);  /*Ответ на запрос настроек магазина.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignsResponse` generated from model 'getCampaignsResponse'
-- Результаты поиска магазинов.
--

CREATE TABLE IF NOT EXISTS `GetCampaignsResponse` (
  `pager` long
);  /*Результаты поиска магазинов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetCampaignsResponseCampaignDTO` generated from model 'GetCampaignsResponseCampaignDTO'

CREATE TABLE IF NOT EXISTS `GetCampaignsResponseCampaignDTO` (
  `getCampaignsResponse` long NOT NULL
  `campaignDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesMaxSaleQuantumDTO` generated from model 'getCategoriesMaxSaleQuantumDTO'
-- Категории и лимит на установку кванта и минимального количества товаров.
--

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumDTO` (
);  /*Категории и лимит на установку кванта и минимального количества товаров.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesMaxSaleQuantumDTOMaxSaleQuantumDTO` generated from model 'GetCategoriesMaxSaleQuantumDTOMaxSaleQuantumDTO'

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumDTOMaxSaleQuantumDTO` (
  `getCategoriesMaxSaleQuantumDTO` long NOT NULL
  `maxSaleQuantumDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesMaxSaleQuantumDTOCategoryErrorDTO` generated from model 'GetCategoriesMaxSaleQuantumDTOCategoryErrorDTO'

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumDTOCategoryErrorDTO` (
  `getCategoriesMaxSaleQuantumDTO` long NOT NULL
  `categoryErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesMaxSaleQuantumRequest` generated from model 'getCategoriesMaxSaleQuantumRequest'
-- Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
--

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumRequest` (
);  /*Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. */

-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesMaxSaleQuantumRequestMarketCategoryIds` generated from model 'GetCategoriesMaxSaleQuantumRequestMarketCategoryIds'

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumRequestMarketCategoryIds` (
  `getCategoriesMaxSaleQuantumRequest` long NOT NULL
  `marketCategoryIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesMaxSaleQuantumResponse` generated from model 'getCategoriesMaxSaleQuantumResponse'
--

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumResponse` (
  `status` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesMaxSaleQuantumResponseMaxSaleQuantumDTO` generated from model 'GetCategoriesMaxSaleQuantumResponseMaxSaleQuantumDTO'

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumResponseMaxSaleQuantumDTO` (
  `getCategoriesMaxSaleQuantumResponse` long NOT NULL
  `maxSaleQuantumDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesMaxSaleQuantumResponseCategoryErrorDTO` generated from model 'GetCategoriesMaxSaleQuantumResponseCategoryErrorDTO'

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumResponseCategoryErrorDTO` (
  `getCategoriesMaxSaleQuantumResponse` long NOT NULL
  `categoryErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesRequest` generated from model 'getCategoriesRequest'
-- Параметры запроса категорий. 
--

CREATE TABLE IF NOT EXISTS `GetCategoriesRequest` (
  `language` long
);  /*Параметры запроса категорий. */


-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoriesResponse` generated from model 'getCategoriesResponse'
--

CREATE TABLE IF NOT EXISTS `GetCategoriesResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetCategoryContentParametersResponse` generated from model 'getCategoryContentParametersResponse'
-- Ответ со списком характеристик для категории и их допустимыми значениями.
--

CREATE TABLE IF NOT EXISTS `GetCategoryContentParametersResponse` (
  `status` long,
  `result` long
);  /*Ответ со списком характеристик для категории и их допустимыми значениями.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetChatHistoryRequest` generated from model 'getChatHistoryRequest'
-- Историю какого чата нужно получить — и начиная с какого сообщения. 
--

CREATE TABLE IF NOT EXISTS `GetChatHistoryRequest` (
  `messageIdFrom` long /*Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.*/
);  /*Историю какого чата нужно получить — и начиная с какого сообщения. */


-- --------------------------------------------------------------------------
-- Table structure for table `GetChatHistoryResponse` generated from model 'getChatHistoryResponse'
--

CREATE TABLE IF NOT EXISTS `GetChatHistoryResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetChatInfoDTO` generated from model 'getChatInfoDTO'
-- Информация о чатах.
--

CREATE TABLE IF NOT EXISTS `GetChatInfoDTO` (
  `chatId` long NOT NULL /*Идентификатор чата.*/,
  `orderId` long NOT NULL /*Идентификатор заказа.*/,
  `type` long NOT NULL,
  `status` long NOT NULL,
  `createdAt` datetime NOT NULL /*Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. */,
  `updatedAt` datetime NOT NULL /*Дата и время последнего сообщения в чате.*/
);  /*Информация о чатах.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetChatsInfoDTO` generated from model 'getChatsInfoDTO'
-- Список чатов.
--

CREATE TABLE IF NOT EXISTS `GetChatsInfoDTO` (
  `paging` long
);  /*Список чатов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetChatsInfoDTOGetChatInfoDTO` generated from model 'GetChatsInfoDTOGetChatInfoDTO'

CREATE TABLE IF NOT EXISTS `GetChatsInfoDTOGetChatInfoDTO` (
  `getChatsInfoDTO` long NOT NULL
  `getChatInfoDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetChatsRequest` generated from model 'getChatsRequest'
-- Фильтры по чатам, которые нужно вернуть. 
--

CREATE TABLE IF NOT EXISTS `GetChatsRequest` (
);  /*Фильтры по чатам, которые нужно вернуть. */

-- --------------------------------------------------------------------------
-- Table structure for table `GetChatsRequestOrderIds` generated from model 'GetChatsRequestOrderIds'

CREATE TABLE IF NOT EXISTS `GetChatsRequestOrderIds` (
  `getChatsRequest` long NOT NULL
  `orderIds` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetChatsRequestChatType` generated from model 'GetChatsRequestChatType'

CREATE TABLE IF NOT EXISTS `GetChatsRequestChatType` (
  `getChatsRequest` long NOT NULL
  `chatType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetChatsRequestChatStatusType` generated from model 'GetChatsRequestChatStatusType'

CREATE TABLE IF NOT EXISTS `GetChatsRequestChatStatusType` (
  `getChatsRequest` long NOT NULL
  `chatStatusType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetChatsResponse` generated from model 'getChatsResponse'
--

CREATE TABLE IF NOT EXISTS `GetChatsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetDeliveryServicesResponse` generated from model 'getDeliveryServicesResponse'
-- Ответ на запрос списка служб доставки.
--

CREATE TABLE IF NOT EXISTS `GetDeliveryServicesResponse` (
  `result` long
);  /*Ответ на запрос списка служб доставки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetFeedIndexLogsResponse` generated from model 'getFeedIndexLogsResponse'
--

CREATE TABLE IF NOT EXISTS `GetFeedIndexLogsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetFeedResponse` generated from model 'getFeedResponse'
-- Ответ на запрос информации о прайс-листе.
--

CREATE TABLE IF NOT EXISTS `GetFeedResponse` (
  `feed` long
);  /*Ответ на запрос информации о прайс-листе.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetFeedbackListResponse` generated from model 'getFeedbackListResponse'
--

CREATE TABLE IF NOT EXISTS `GetFeedbackListResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetFeedsResponse` generated from model 'getFeedsResponse'
-- Ответ на запрос списка прайс-листов.
--

CREATE TABLE IF NOT EXISTS `GetFeedsResponse` (
);  /*Ответ на запрос списка прайс-листов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetFeedsResponseFeedDTO` generated from model 'GetFeedsResponseFeedDTO'

CREATE TABLE IF NOT EXISTS `GetFeedsResponseFeedDTO` (
  `getFeedsResponse` long NOT NULL
  `feedDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetFulfillmentWarehousesResponse` generated from model 'getFulfillmentWarehousesResponse'
--

CREATE TABLE IF NOT EXISTS `GetFulfillmentWarehousesResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsFeedbackCommentsRequest` generated from model 'getGoodsFeedbackCommentsRequest'
-- Фильтр запроса комментариев отзыва. 
--

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackCommentsRequest` (
  `feedbackId` long NOT NULL /*Идентификатор отзыва. */
);  /*Фильтр запроса комментариев отзыва. */


-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsFeedbackCommentsResponse` generated from model 'getGoodsFeedbackCommentsResponse'
--

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackCommentsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsFeedbackRequest` generated from model 'getGoodsFeedbackRequest'
-- Фильтр запроса отзывов в кабинете. 
--

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackRequest` (
  `dateTimeFrom` datetime /*Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты. */,
  `dateTimeTo` datetime /*Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. */,
  `reactionStatus` long,
  `paid` boolean /*Фильтр отзывов за баллы Плюса.*/
);  /*Фильтр запроса отзывов в кабинете. */

-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsFeedbackRequestRatingValues` generated from model 'GetGoodsFeedbackRequestRatingValues'

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackRequestRatingValues` (
  `getGoodsFeedbackRequest` long NOT NULL
  `ratingValues` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsFeedbackRequestModelIds` generated from model 'GetGoodsFeedbackRequestModelIds'

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackRequestModelIds` (
  `getGoodsFeedbackRequest` long NOT NULL
  `modelIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsFeedbackResponse` generated from model 'getGoodsFeedbackResponse'
--

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsStatsRequest` generated from model 'getGoodsStatsRequest'
-- Запрос отчета по товарам.
--

CREATE TABLE IF NOT EXISTS `GetGoodsStatsRequest` (
);  /*Запрос отчета по товарам.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsStatsRequestShopSkus` generated from model 'GetGoodsStatsRequestShopSkus'

CREATE TABLE IF NOT EXISTS `GetGoodsStatsRequestShopSkus` (
  `getGoodsStatsRequest` long NOT NULL
  `shopSkus` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetGoodsStatsResponse` generated from model 'getGoodsStatsResponse'
-- Ответ на запрос отчета по товарам.
--

CREATE TABLE IF NOT EXISTS `GetGoodsStatsResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос отчета по товарам.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetHiddenOffersResponse` generated from model 'getHiddenOffersResponse'
-- Ответ на запрос списка скрытий.
--

CREATE TABLE IF NOT EXISTS `GetHiddenOffersResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос списка скрытий.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetHiddenOffersResultDTO` generated from model 'getHiddenOffersResultDTO'
-- Список скрытых вами товаров. 
--

CREATE TABLE IF NOT EXISTS `GetHiddenOffersResultDTO` (
  `paging` long
);  /*Список скрытых вами товаров. */

-- --------------------------------------------------------------------------
-- Table structure for table `GetHiddenOffersResultDTOHiddenOfferDTO` generated from model 'GetHiddenOffersResultDTOHiddenOfferDTO'

CREATE TABLE IF NOT EXISTS `GetHiddenOffersResultDTOHiddenOfferDTO` (
  `getHiddenOffersResultDTO` long NOT NULL
  `hiddenOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetMappingDTO` generated from model 'getMappingDTO'
-- Информация о товарах в каталоге. 
--

CREATE TABLE IF NOT EXISTS `GetMappingDTO` (
  `marketSku` long /*SKU на Маркете.*/,
  `marketSkuName` text /*Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. */,
  `marketModelId` long /*Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. */,
  `marketModelName` text /*Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. */,
  `marketCategoryId` long /*Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. */,
  `marketCategoryName` text /*Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. */
);  /*Информация о товарах в каталоге. */


-- --------------------------------------------------------------------------
-- Table structure for table `GetModelsOffersResponse` generated from model 'getModelsOffersResponse'
-- Ответ на запрос списка предложений для моделей.
--

CREATE TABLE IF NOT EXISTS `GetModelsOffersResponse` (
  `currency` long,
  `regionId` long /*Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). */
);  /*Ответ на запрос списка предложений для моделей.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetModelsOffersResponseEnrichedModelDTO` generated from model 'GetModelsOffersResponseEnrichedModelDTO'

CREATE TABLE IF NOT EXISTS `GetModelsOffersResponseEnrichedModelDTO` (
  `getModelsOffersResponse` long NOT NULL
  `enrichedModelDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetModelsRequest` generated from model 'getModelsRequest'
-- Запрос информации о моделях.
--

CREATE TABLE IF NOT EXISTS `GetModelsRequest` (
);  /*Запрос информации о моделях.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetModelsRequestModels` generated from model 'GetModelsRequestModels'

CREATE TABLE IF NOT EXISTS `GetModelsRequestModels` (
  `getModelsRequest` long NOT NULL
  `models` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetModelsResponse` generated from model 'getModelsResponse'
-- Ответ на запрос информации о моделях.
--

CREATE TABLE IF NOT EXISTS `GetModelsResponse` (
  `currency` long,
  `regionId` long /*Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). */
);  /*Ответ на запрос информации о моделях.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetModelsResponseModelDTO` generated from model 'GetModelsResponseModelDTO'

CREATE TABLE IF NOT EXISTS `GetModelsResponseModelDTO` (
  `getModelsResponse` long NOT NULL
  `modelDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferCardsContentStatusRequest` generated from model 'getOfferCardsContentStatusRequest'
--

CREATE TABLE IF NOT EXISTS `GetOfferCardsContentStatusRequest` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferCardsContentStatusRequestOfferIds` generated from model 'GetOfferCardsContentStatusRequestOfferIds'

CREATE TABLE IF NOT EXISTS `GetOfferCardsContentStatusRequestOfferIds` (
  `getOfferCardsContentStatusRequest` long NOT NULL
  `offerIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferCardsContentStatusRequestOfferCardStatusType` generated from model 'GetOfferCardsContentStatusRequestOfferCardStatusType'

CREATE TABLE IF NOT EXISTS `GetOfferCardsContentStatusRequestOfferCardStatusType` (
  `getOfferCardsContentStatusRequest` long NOT NULL
  `offerCardStatusType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferCardsContentStatusRequestCategoryIds` generated from model 'GetOfferCardsContentStatusRequestCategoryIds'

CREATE TABLE IF NOT EXISTS `GetOfferCardsContentStatusRequestCategoryIds` (
  `getOfferCardsContentStatusRequest` long NOT NULL
  `categoryIds` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferCardsContentStatusResponse` generated from model 'getOfferCardsContentStatusResponse'
-- Ответ со списком состояний товаров и пагинацией.
--

CREATE TABLE IF NOT EXISTS `GetOfferCardsContentStatusResponse` (
  `status` long,
  `result` long
);  /*Ответ со списком состояний товаров и пагинацией.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTO` generated from model 'getOfferDTO'
-- Параметры товара.
--

CREATE TABLE IF NOT EXISTS `GetOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `name` text /*Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) */,
  `marketCategoryId` long /*Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). */,
  `category` text /*Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. */,
  `vendor` text /*Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.*/,
  `description` text /*Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) */,
  `weightDimensions` long,
  `vendorCode` text /*Артикул товара от производителя.*/,
  `shelfLife` long,
  `lifeTime` long,
  `guaranteePeriod` long,
  `customsCommodityCode` text /*Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. */,
  `boxCount` int /*Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. */,
  `condition` long,
  `type` long,
  `downloadable` boolean /*Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) */,
  `adult` boolean /*Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. */,
  `age` long,
  `basicPrice` long,
  `purchasePrice` long,
  `additionalExpenses` long,
  `cofinancePrice` long,
  `cardStatus` long,
  `archived` boolean /*Товар помещен в архив. */
);  /*Параметры товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOPictures` generated from model 'GetOfferDTOPictures'

CREATE TABLE IF NOT EXISTS `GetOfferDTOPictures` (
  `getOfferDTO` long NOT NULL
  `pictures` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOVideos` generated from model 'GetOfferDTOVideos'

CREATE TABLE IF NOT EXISTS `GetOfferDTOVideos` (
  `getOfferDTO` long NOT NULL
  `videos` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOOfferManualDTO` generated from model 'GetOfferDTOOfferManualDTO'

CREATE TABLE IF NOT EXISTS `GetOfferDTOOfferManualDTO` (
  `getOfferDTO` long NOT NULL
  `offerManualDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOBarcodes` generated from model 'GetOfferDTOBarcodes'

CREATE TABLE IF NOT EXISTS `GetOfferDTOBarcodes` (
  `getOfferDTO` long NOT NULL
  `barcodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOManufacturerCountries` generated from model 'GetOfferDTOManufacturerCountries'

CREATE TABLE IF NOT EXISTS `GetOfferDTOManufacturerCountries` (
  `getOfferDTO` long NOT NULL
  `manufacturerCountries` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOTags` generated from model 'GetOfferDTOTags'

CREATE TABLE IF NOT EXISTS `GetOfferDTOTags` (
  `getOfferDTO` long NOT NULL
  `tags` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOCertificates` generated from model 'GetOfferDTOCertificates'

CREATE TABLE IF NOT EXISTS `GetOfferDTOCertificates` (
  `getOfferDTO` long NOT NULL
  `certificates` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOOfferParamDTO` generated from model 'GetOfferDTOOfferParamDTO'

CREATE TABLE IF NOT EXISTS `GetOfferDTOOfferParamDTO` (
  `getOfferDTO` long NOT NULL
  `offerParamDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOOfferCampaignStatusDTO` generated from model 'GetOfferDTOOfferCampaignStatusDTO'

CREATE TABLE IF NOT EXISTS `GetOfferDTOOfferCampaignStatusDTO` (
  `getOfferDTO` long NOT NULL
  `offerCampaignStatusDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferDTOOfferSellingProgramDTO` generated from model 'GetOfferDTOOfferSellingProgramDTO'

CREATE TABLE IF NOT EXISTS `GetOfferDTOOfferSellingProgramDTO` (
  `getOfferDTO` long NOT NULL
  `offerSellingProgramDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingDTO` generated from model 'getOfferMappingDTO'
-- Информация о товаре.
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingDTO` (
  `offer` long,
  `mapping` long
);  /*Информация о товаре.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingEntriesResponse` generated from model 'getOfferMappingEntriesResponse'
-- Ответ на запрос списка товаров в каталоге.
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingEntriesResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос списка товаров в каталоге.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsRequest` generated from model 'getOfferMappingsRequest'
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingsRequest` (
  `archived` boolean /*Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsRequestOfferIds` generated from model 'GetOfferMappingsRequestOfferIds'

CREATE TABLE IF NOT EXISTS `GetOfferMappingsRequestOfferIds` (
  `getOfferMappingsRequest` long NOT NULL
  `offerIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsRequestOfferCardStatusType` generated from model 'GetOfferMappingsRequestOfferCardStatusType'

CREATE TABLE IF NOT EXISTS `GetOfferMappingsRequestOfferCardStatusType` (
  `getOfferMappingsRequest` long NOT NULL
  `offerCardStatusType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsRequestCategoryIds` generated from model 'GetOfferMappingsRequestCategoryIds'

CREATE TABLE IF NOT EXISTS `GetOfferMappingsRequestCategoryIds` (
  `getOfferMappingsRequest` long NOT NULL
  `categoryIds` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsRequestVendorNames` generated from model 'GetOfferMappingsRequestVendorNames'

CREATE TABLE IF NOT EXISTS `GetOfferMappingsRequestVendorNames` (
  `getOfferMappingsRequest` long NOT NULL
  `vendorNames` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsRequestTags` generated from model 'GetOfferMappingsRequestTags'

CREATE TABLE IF NOT EXISTS `GetOfferMappingsRequestTags` (
  `getOfferMappingsRequest` long NOT NULL
  `tags` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsResponse` generated from model 'getOfferMappingsResponse'
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsResultDTO` generated from model 'getOfferMappingsResultDTO'
-- Информация о товарах.
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingsResultDTO` (
  `paging` long
);  /*Информация о товарах.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferMappingsResultDTOGetOfferMappingDTO` generated from model 'GetOfferMappingsResultDTOGetOfferMappingDTO'

CREATE TABLE IF NOT EXISTS `GetOfferMappingsResultDTOGetOfferMappingDTO` (
  `getOfferMappingsResultDTO` long NOT NULL
  `getOfferMappingDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferRecommendationsRequest` generated from model 'getOfferRecommendationsRequest'
--

CREATE TABLE IF NOT EXISTS `GetOfferRecommendationsRequest` (
  `cofinancePriceFilter` long,
  `recommendedCofinancePriceFilter` long,
  `competitivenessFilter` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferRecommendationsRequestOfferIds` generated from model 'GetOfferRecommendationsRequestOfferIds'

CREATE TABLE IF NOT EXISTS `GetOfferRecommendationsRequestOfferIds` (
  `getOfferRecommendationsRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOfferRecommendationsResponse` generated from model 'getOfferRecommendationsResponse'
--

CREATE TABLE IF NOT EXISTS `GetOfferRecommendationsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetOffersResponse` generated from model 'getOffersResponse'
-- Список предложений с пагинатором.
--

CREATE TABLE IF NOT EXISTS `GetOffersResponse` (
  `pager` long
);  /*Список предложений с пагинатором.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetOffersResponseOfferDTO` generated from model 'GetOffersResponseOfferDTO'

CREATE TABLE IF NOT EXISTS `GetOffersResponseOfferDTO` (
  `getOffersResponse` long NOT NULL
  `offerDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOrderBuyerInfoResponse` generated from model 'getOrderBuyerInfoResponse'
--

CREATE TABLE IF NOT EXISTS `GetOrderBuyerInfoResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetOrderLabelsDataResponse` generated from model 'getOrderLabelsDataResponse'
-- Ответ с информацией для печати ярлыков.
--

CREATE TABLE IF NOT EXISTS `GetOrderLabelsDataResponse` (
  `status` long,
  `result` long
);  /*Ответ с информацией для печати ярлыков.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetOrderResponse` generated from model 'getOrderResponse'
--

CREATE TABLE IF NOT EXISTS `GetOrderResponse` (
  `order` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetOrdersResponse` generated from model 'getOrdersResponse'
-- Модель для ответа API списка информации по заказам.
--

CREATE TABLE IF NOT EXISTS `GetOrdersResponse` (
  `pager` long,
  `paging` long
);  /*Модель для ответа API списка информации по заказам.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetOrdersResponseOrderDTO` generated from model 'GetOrdersResponseOrderDTO'

CREATE TABLE IF NOT EXISTS `GetOrdersResponseOrderDTO` (
  `getOrdersResponse` long NOT NULL
  `orderDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOrdersStatsRequest` generated from model 'getOrdersStatsRequest'
-- Запрос информации по заказам.
--

CREATE TABLE IF NOT EXISTS `GetOrdersStatsRequest` (
  `dateFrom` date /*Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. */,
  `dateTo` date /*Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. */,
  `updateFrom` date /*Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. */,
  `updateTo` date /*Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. */,
  `hasCis` boolean /*Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. */
);  /*Запрос информации по заказам.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetOrdersStatsRequestOrders` generated from model 'GetOrdersStatsRequestOrders'

CREATE TABLE IF NOT EXISTS `GetOrdersStatsRequestOrders` (
  `getOrdersStatsRequest` long NOT NULL
  `orders` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetOrdersStatsRequestOrderStatsStatusType` generated from model 'GetOrdersStatsRequestOrderStatsStatusType'

CREATE TABLE IF NOT EXISTS `GetOrdersStatsRequestOrderStatsStatusType` (
  `getOrdersStatsRequest` long NOT NULL
  `orderStatsStatusType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetOrdersStatsResponse` generated from model 'getOrdersStatsResponse'
-- Ответ на запрос информации по заказам.
--

CREATE TABLE IF NOT EXISTS `GetOrdersStatsResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос информации по заказам.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetOutletLicensesResponse` generated from model 'getOutletLicensesResponse'
--

CREATE TABLE IF NOT EXISTS `GetOutletLicensesResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetOutletResponse` generated from model 'getOutletResponse'
-- Ответ на запрос информации о точке продаж.
--

CREATE TABLE IF NOT EXISTS `GetOutletResponse` (
  `outlet` long
);  /*Ответ на запрос информации о точке продаж.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetOutletsResponse` generated from model 'getOutletsResponse'
-- Ответ на запрос информации о точках продаж.
--

CREATE TABLE IF NOT EXISTS `GetOutletsResponse` (
  `paging` long,
  `pager` long
);  /*Ответ на запрос информации о точках продаж.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetOutletsResponseFullOutletDTO` generated from model 'GetOutletsResponseFullOutletDTO'

CREATE TABLE IF NOT EXISTS `GetOutletsResponseFullOutletDTO` (
  `getOutletsResponse` long NOT NULL
  `fullOutletDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetPriceDTO` generated from model 'getPriceDTO'
-- Цена с указанием времени последнего обновления.
--

CREATE TABLE IF NOT EXISTS `GetPriceDTO` (
  `value` decimal NOT NULL /*Значение.*/,
  `currencyId` long NOT NULL,
  `updatedAt` datetime NOT NULL /*Время последнего обновления.*/
);  /*Цена с указанием времени последнего обновления.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPriceWithDiscountDTO` generated from model 'getPriceWithDiscountDTO'
-- Цена с указанием скидки и времени последнего обновления.
--

CREATE TABLE IF NOT EXISTS `GetPriceWithDiscountDTO` (
  `value` decimal NOT NULL /*Значение.*/,
  `currencyId` long NOT NULL,
  `updatedAt` datetime NOT NULL /*Время последнего обновления.*/,
  `discountBase` decimal /*Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. */
);  /*Цена с указанием скидки и времени последнего обновления.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPriceWithVatDTO` generated from model 'getPriceWithVatDTO'
-- Цена с указанием ставки НДС и времени последнего обновления.
--

CREATE TABLE IF NOT EXISTS `GetPriceWithVatDTO` (
  `updatedAt` datetime NOT NULL /*Время последнего обновления.*/,
  `value` decimal /*Цена на товар.*/,
  `discountBase` decimal /*Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. */,
  `currencyId` long,
  `vat` int /*Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. */
);  /*Цена с указанием ставки НДС и времени последнего обновления.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPricesByOfferIdsRequest` generated from model 'getPricesByOfferIdsRequest'
-- Запрос списка цен.
--

CREATE TABLE IF NOT EXISTS `GetPricesByOfferIdsRequest` (
);  /*Запрос списка цен.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetPricesByOfferIdsRequestOfferIds` generated from model 'GetPricesByOfferIdsRequestOfferIds'

CREATE TABLE IF NOT EXISTS `GetPricesByOfferIdsRequestOfferIds` (
  `getPricesByOfferIdsRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetPricesByOfferIdsResponse` generated from model 'getPricesByOfferIdsResponse'
-- Ответ на запрос списка цен.
--

CREATE TABLE IF NOT EXISTS `GetPricesByOfferIdsResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос списка цен.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPricesResponse` generated from model 'getPricesResponse'
-- Ответ на запрос списка цен.
--

CREATE TABLE IF NOT EXISTS `GetPricesResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос списка цен.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoAssortmentInfoDTO` generated from model 'getPromoAssortmentInfoDTO'
-- Информация о товарах в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoAssortmentInfoDTO` (
  `activeOffers` int NOT NULL /*Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). */,
  `potentialOffers` int /*Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. */,
  `processing` boolean /*Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. */
);  /*Информация о товарах в акции.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoBestsellerInfoDTO` generated from model 'getPromoBestsellerInfoDTO'
-- Информация об акции «Бестселлеры Маркета».
--

CREATE TABLE IF NOT EXISTS `GetPromoBestsellerInfoDTO` (
  `bestseller` boolean NOT NULL /*Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).*/,
  `entryDeadline` datetime /*До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». */
);  /*Информация об акции «Бестселлеры Маркета».*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoConstraintsDTO` generated from model 'getPromoConstraintsDTO'
-- Ограничения в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoConstraintsDTO` (
);  /*Ограничения в акции.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoConstraintsDTOWarehouseIds` generated from model 'GetPromoConstraintsDTOWarehouseIds'

CREATE TABLE IF NOT EXISTS `GetPromoConstraintsDTOWarehouseIds` (
  `getPromoConstraintsDTO` long NOT NULL
  `warehouseIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoDTO` generated from model 'getPromoDTO'
-- Информация об акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoDTO` (
  `id` text NOT NULL PRIMARY KEY /*Идентификатор акции.*/,
  `name` text NOT NULL /*Название акции.*/,
  `period` long NOT NULL,
  `participating` boolean NOT NULL /*Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). */,
  `assortmentInfo` long NOT NULL,
  `mechanicsInfo` long NOT NULL,
  `bestsellerInfo` long NOT NULL,
  `constraints` long
);  /*Информация об акции.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoDTOChannelType` generated from model 'GetPromoDTOChannelType'

CREATE TABLE IF NOT EXISTS `GetPromoDTOChannelType` (
  `getPromoDTO` long NOT NULL
  `channelType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoMechanicsInfoDTO` generated from model 'getPromoMechanicsInfoDTO'
-- Информация о типе акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoMechanicsInfoDTO` (
  `type` long NOT NULL,
  `promocodeInfo` long
);  /*Информация о типе акции.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoOfferDTO` generated from model 'getPromoOfferDTO'
-- Товар, который участвует или может участвовать в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `status` long NOT NULL,
  `params` long NOT NULL,
  `autoParticipatingDetails` long
);  /*Товар, который участвует или может участвовать в акции.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoOffersRequest` generated from model 'getPromoOffersRequest'
-- Получение списка товаров, которые участвуют или могут участвовать в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoOffersRequest` (
  `promoId` text NOT NULL /*Идентификатор акции.*/,
  `statusType` long
);  /*Получение списка товаров, которые участвуют или могут участвовать в акции.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoOffersResponse` generated from model 'getPromoOffersResponse'
--

CREATE TABLE IF NOT EXISTS `GetPromoOffersResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoOffersResultDTO` generated from model 'getPromoOffersResultDTO'
-- Список товаров, которые участвуют или могут участвовать в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoOffersResultDTO` (
  `paging` long
);  /*Список товаров, которые участвуют или могут участвовать в акции.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoOffersResultDTOGetPromoOfferDTO` generated from model 'GetPromoOffersResultDTOGetPromoOfferDTO'

CREATE TABLE IF NOT EXISTS `GetPromoOffersResultDTOGetPromoOfferDTO` (
  `getPromoOffersResultDTO` long NOT NULL
  `getPromoOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromoPromocodeInfoDTO` generated from model 'getPromoPromocodeInfoDTO'
-- Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
--

CREATE TABLE IF NOT EXISTS `GetPromoPromocodeInfoDTO` (
  `promocode` text NOT NULL /*Промокод.*/,
  `discount` int NOT NULL /*Процент скидки по промокоду.*/
);  /*Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. */


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromosRequest` generated from model 'getPromosRequest'
-- Фильтры для получения списка акций.
--

CREATE TABLE IF NOT EXISTS `GetPromosRequest` (
  `participation` long,
  `mechanics` long
);  /*Фильтры для получения списка акций.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromosResponse` generated from model 'getPromosResponse'
--

CREATE TABLE IF NOT EXISTS `GetPromosResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetPromosResultDTO` generated from model 'getPromosResultDTO'
-- Информация об акциях Маркета.
--

CREATE TABLE IF NOT EXISTS `GetPromosResultDTO` (
);  /*Информация об акциях Маркета.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetPromosResultDTOGetPromoDTO` generated from model 'GetPromosResultDTOGetPromoDTO'

CREATE TABLE IF NOT EXISTS `GetPromosResultDTOGetPromoDTO` (
  `getPromosResultDTO` long NOT NULL
  `getPromoDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetQualityRatingDetailsResponse` generated from model 'getQualityRatingDetailsResponse'
--

CREATE TABLE IF NOT EXISTS `GetQualityRatingDetailsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetQualityRatingRequest` generated from model 'getQualityRatingRequest'
-- Запрос информации по индексу качества.
--

CREATE TABLE IF NOT EXISTS `GetQualityRatingRequest` (
  `dateFrom` date /*Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты. */,
  `dateTo` date /*Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты. */
);  /*Запрос информации по индексу качества.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetQualityRatingRequestCampaignIds` generated from model 'GetQualityRatingRequestCampaignIds'

CREATE TABLE IF NOT EXISTS `GetQualityRatingRequestCampaignIds` (
  `getQualityRatingRequest` long NOT NULL
  `campaignIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetQualityRatingResponse` generated from model 'getQualityRatingResponse'
-- Информация об индексе качества магазинов.
--

CREATE TABLE IF NOT EXISTS `GetQualityRatingResponse` (
  `status` long,
  `result` long
);  /*Информация об индексе качества магазинов.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersRequest` generated from model 'getQuarantineOffersRequest'
-- Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
--

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersRequest` (
);  /*Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. */

-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersRequestOfferIds` generated from model 'GetQuarantineOffersRequestOfferIds'

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersRequestOfferIds` (
  `getQuarantineOffersRequest` long NOT NULL
  `offerIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersRequestOfferCardStatusType` generated from model 'GetQuarantineOffersRequestOfferCardStatusType'

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersRequestOfferCardStatusType` (
  `getQuarantineOffersRequest` long NOT NULL
  `offerCardStatusType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersRequestCategoryIds` generated from model 'GetQuarantineOffersRequestCategoryIds'

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersRequestCategoryIds` (
  `getQuarantineOffersRequest` long NOT NULL
  `categoryIds` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersRequestVendorNames` generated from model 'GetQuarantineOffersRequestVendorNames'

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersRequestVendorNames` (
  `getQuarantineOffersRequest` long NOT NULL
  `vendorNames` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersRequestTags` generated from model 'GetQuarantineOffersRequestTags'

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersRequestTags` (
  `getQuarantineOffersRequest` long NOT NULL
  `tags` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersResponse` generated from model 'getQuarantineOffersResponse'
-- Ответ на запрос списка товаров в карантине.
--

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос списка товаров в карантине.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersResultDTO` generated from model 'getQuarantineOffersResultDTO'
-- Список товаров в карантине.
--

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersResultDTO` (
  `paging` long
);  /*Список товаров в карантине.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetQuarantineOffersResultDTOQuarantineOfferDTO` generated from model 'GetQuarantineOffersResultDTOQuarantineOfferDTO'

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersResultDTOQuarantineOfferDTO` (
  `getQuarantineOffersResultDTO` long NOT NULL
  `quarantineOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetRegionWithChildrenResponse` generated from model 'getRegionWithChildrenResponse'
--

CREATE TABLE IF NOT EXISTS `GetRegionWithChildrenResponse` (
  `pager` long,
  `regions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetRegionsResponse` generated from model 'getRegionsResponse'
--

CREATE TABLE IF NOT EXISTS `GetRegionsResponse` (
  `paging` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetRegionsResponseRegionDTO` generated from model 'GetRegionsResponseRegionDTO'

CREATE TABLE IF NOT EXISTS `GetRegionsResponseRegionDTO` (
  `getRegionsResponse` long NOT NULL
  `regionDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetReportInfoResponse` generated from model 'getReportInfoResponse'
-- Ответ на запрос информации об отчете.
--

CREATE TABLE IF NOT EXISTS `GetReportInfoResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос информации об отчете.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetReturnResponse` generated from model 'getReturnResponse'
--

CREATE TABLE IF NOT EXISTS `GetReturnResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetReturnsResponse` generated from model 'getReturnsResponse'
--

CREATE TABLE IF NOT EXISTS `GetReturnsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetShipmentOrdersInfoResponse` generated from model 'getShipmentOrdersInfoResponse'
--

CREATE TABLE IF NOT EXISTS `GetShipmentOrdersInfoResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetShipmentResponse` generated from model 'getShipmentResponse'
--

CREATE TABLE IF NOT EXISTS `GetShipmentResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetSuggestedOfferMappingEntriesRequest` generated from model 'getSuggestedOfferMappingEntriesRequest'
-- Запрос рекомендованных карточек товара.
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingEntriesRequest` (
);  /*Запрос рекомендованных карточек товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO` generated from model 'GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO'

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingEntriesRequestMappingsOfferDTO` (
  `getSuggestedOfferMappingEntriesRequest` long NOT NULL
  `mappingsOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetSuggestedOfferMappingEntriesResponse` generated from model 'getSuggestedOfferMappingEntriesResponse'
-- Ответ со списком рекомендованных карточек товара.
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingEntriesResponse` (
  `status` long,
  `result` long
);  /*Ответ со списком рекомендованных карточек товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetSuggestedOfferMappingsRequest` generated from model 'getSuggestedOfferMappingsRequest'
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingsRequest` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetSuggestedOfferMappingsRequestSuggestedOfferDTO` generated from model 'GetSuggestedOfferMappingsRequestSuggestedOfferDTO'

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingsRequestSuggestedOfferDTO` (
  `getSuggestedOfferMappingsRequest` long NOT NULL
  `suggestedOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetSuggestedOfferMappingsResponse` generated from model 'getSuggestedOfferMappingsResponse'
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingsResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetSuggestedOfferMappingsResultDTO` generated from model 'getSuggestedOfferMappingsResultDTO'
-- Подобранные карточки на Маркете.
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingsResultDTO` (
);  /*Подобранные карточки на Маркете.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetSuggestedOfferMappingsResultDTOSuggestedOfferMappingDTO` generated from model 'GetSuggestedOfferMappingsResultDTOSuggestedOfferMappingDTO'

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingsResultDTOSuggestedOfferMappingDTO` (
  `getSuggestedOfferMappingsResultDTO` long NOT NULL
  `suggestedOfferMappingDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetWarehouseStocksDTO` generated from model 'getWarehouseStocksDTO'
-- Список складов с информацией об остатках на каждом из них.
--

CREATE TABLE IF NOT EXISTS `GetWarehouseStocksDTO` (
  `paging` long
);  /*Список складов с информацией об остатках на каждом из них.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetWarehouseStocksDTOWarehouseOffersDTO` generated from model 'GetWarehouseStocksDTOWarehouseOffersDTO'

CREATE TABLE IF NOT EXISTS `GetWarehouseStocksDTOWarehouseOffersDTO` (
  `getWarehouseStocksDTO` long NOT NULL
  `warehouseOffersDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetWarehouseStocksRequest` generated from model 'getWarehouseStocksRequest'
-- Фильтры для запроса остатков. 
--

CREATE TABLE IF NOT EXISTS `GetWarehouseStocksRequest` (
  `withTurnover` boolean /***Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — &#x60;false&#x60;. Если информация нужна, передайте значение &#x60;true&#x60;. */,
  `archived` boolean /*Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращается информация о товарах, которые не находятся в архиве. */,
);  /*Фильтры для запроса остатков. */

-- --------------------------------------------------------------------------
-- Table structure for table `GetWarehouseStocksRequestOfferIds` generated from model 'GetWarehouseStocksRequestOfferIds'

CREATE TABLE IF NOT EXISTS `GetWarehouseStocksRequestOfferIds` (
  `getWarehouseStocksRequest` long NOT NULL
  `offerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GetWarehouseStocksResponse` generated from model 'getWarehouseStocksResponse'
--

CREATE TABLE IF NOT EXISTS `GetWarehouseStocksResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetWarehousesResponse` generated from model 'getWarehousesResponse'
--

CREATE TABLE IF NOT EXISTS `GetWarehousesResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackCommentAuthorDTO` generated from model 'goodsFeedbackCommentAuthorDTO'
-- Информация об авторе комментария.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackCommentAuthorDTO` (
  `type` long,
  `name` text /*Имя автора или название кабинета.*/
);  /*Информация об авторе комментария.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackCommentDTO` generated from model 'goodsFeedbackCommentDTO'
-- Комментарий к отзыву.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackCommentDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор комментария к отзыву. */,
  `text` text NOT NULL /*Текст комментария.*/,
  `author` long NOT NULL,
  `status` long NOT NULL,
  `canModify` boolean /*Может ли продавец изменять комментарий или удалять его.*/,
  `parentId` long /*Идентификатор комментария к отзыву. */
);  /*Комментарий к отзыву.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackCommentListDTO` generated from model 'goodsFeedbackCommentListDTO'
-- Комментарии к отзыву.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackCommentListDTO` (
  `paging` long
);  /*Комментарии к отзыву.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackCommentListDTOGoodsFeedbackCommentDTO` generated from model 'GoodsFeedbackCommentListDTOGoodsFeedbackCommentDTO'

CREATE TABLE IF NOT EXISTS `GoodsFeedbackCommentListDTOGoodsFeedbackCommentDTO` (
  `goodsFeedbackCommentListDTO` long NOT NULL
  `goodsFeedbackCommentDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackDTO` generated from model 'goodsFeedbackDTO'
-- Отзыв о товаре.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackDTO` (
  `feedbackId` long NOT NULL /*Идентификатор отзыва. */,
  `createdAt` datetime NOT NULL /*Дата и время создания отзыва.*/,
  `needReaction` boolean NOT NULL /*Нужен ли ответ на отзыв.*/,
  `identifiers` long NOT NULL,
  `statistics` long NOT NULL,
  `author` text /*Имя автора отзыва.*/,
  `description` long,
  `media` long
);  /*Отзыв о товаре.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackDescriptionDTO` generated from model 'goodsFeedbackDescriptionDTO'
-- Текстовая часть отзыва.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackDescriptionDTO` (
  `advantages` text /*Описание плюсов товара в отзыве.*/,
  `disadvantages` text /*Описание минусов товара в отзыве.*/,
  `comment` text /*Комментарий в отзыве.*/
);  /*Текстовая часть отзыва.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackIdentifiersDTO` generated from model 'goodsFeedbackIdentifiersDTO'
-- Идентификаторы, которые связаны с отзывом.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackIdentifiersDTO` (
  `orderId` long NOT NULL /*Идентификатор заказа на Маркете.*/,
  `modelId` long NOT NULL /*Идентификатор модели товара.*/
);  /*Идентификаторы, которые связаны с отзывом.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackListDTO` generated from model 'goodsFeedbackListDTO'
-- Список отзывов о товарах. 
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackListDTO` (
  `paging` long
);  /*Список отзывов о товарах. */

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackListDTOGoodsFeedbackDTO` generated from model 'GoodsFeedbackListDTOGoodsFeedbackDTO'

CREATE TABLE IF NOT EXISTS `GoodsFeedbackListDTOGoodsFeedbackDTO` (
  `goodsFeedbackListDTO` long NOT NULL
  `goodsFeedbackDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackMediaDTO` generated from model 'goodsFeedbackMediaDTO'
-- Фото и видео.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackMediaDTO` (
);  /*Фото и видео.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackMediaDTOPhotos` generated from model 'GoodsFeedbackMediaDTOPhotos'

CREATE TABLE IF NOT EXISTS `GoodsFeedbackMediaDTOPhotos` (
  `goodsFeedbackMediaDTO` long NOT NULL
  `photos` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackMediaDTOVideos` generated from model 'GoodsFeedbackMediaDTOVideos'

CREATE TABLE IF NOT EXISTS `GoodsFeedbackMediaDTOVideos` (
  `goodsFeedbackMediaDTO` long NOT NULL
  `videos` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsFeedbackStatisticsDTO` generated from model 'goodsFeedbackStatisticsDTO'
-- Статистическая информация по отзыву.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackStatisticsDTO` (
  `rating` int UNSIGNED NOT NULL /*Оценка товара.*/,
  `commentsCount` long NOT NULL /*Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. */,
  `recommended` boolean /*Рекомендуют ли этот товар.*/,
  `paidAmount` long /*Количество баллов Плюса, которое автор получил за отзыв.*/
);  /*Статистическая информация по отзыву.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsDTO` generated from model 'goodsStatsDTO'
-- Отчет по товарам.
--

CREATE TABLE IF NOT EXISTS `GoodsStatsDTO` (
);  /*Отчет по товарам.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsDTOGoodsStatsGoodsDTO` generated from model 'GoodsStatsDTOGoodsStatsGoodsDTO'

CREATE TABLE IF NOT EXISTS `GoodsStatsDTOGoodsStatsGoodsDTO` (
  `goodsStatsDTO` long NOT NULL
  `goodsStatsGoodsDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsGoodsDTO` generated from model 'goodsStatsGoodsDTO'
-- Информация о товаре.
--

CREATE TABLE IF NOT EXISTS `GoodsStatsGoodsDTO` (
  `shopSku` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `marketSku` long /*SKU на Маркете.*/,
  `name` text /*Название товара.*/,
  `price` decimal /*Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).*/,
  `categoryId` long /*Идентификатор категории товара на Маркете.*/,
  `categoryName` text /*Название категории товара на Маркете.*/,
  `weightDimensions` long,
);  /*Информация о товаре.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsGoodsDTOGoodsStatsWarehouseDTO` generated from model 'GoodsStatsGoodsDTOGoodsStatsWarehouseDTO'

CREATE TABLE IF NOT EXISTS `GoodsStatsGoodsDTOGoodsStatsWarehouseDTO` (
  `goodsStatsGoodsDTO` long NOT NULL
  `goodsStatsWarehouseDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsGoodsDTOTariffDTO` generated from model 'GoodsStatsGoodsDTOTariffDTO'

CREATE TABLE IF NOT EXISTS `GoodsStatsGoodsDTOTariffDTO` (
  `goodsStatsGoodsDTO` long NOT NULL
  `tariffDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsGoodsDTOPictures` generated from model 'GoodsStatsGoodsDTOPictures'

CREATE TABLE IF NOT EXISTS `GoodsStatsGoodsDTOPictures` (
  `goodsStatsGoodsDTO` long NOT NULL
  `pictures` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsWarehouseDTO` generated from model 'goodsStatsWarehouseDTO'
-- Информация о складе.
--

CREATE TABLE IF NOT EXISTS `GoodsStatsWarehouseDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор склада.*/,
  `name` text /*Название склада.*/
);  /*Информация о складе.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsWarehouseDTOWarehouseStockDTO` generated from model 'GoodsStatsWarehouseDTOWarehouseStockDTO'

CREATE TABLE IF NOT EXISTS `GoodsStatsWarehouseDTOWarehouseStockDTO` (
  `goodsStatsWarehouseDTO` long NOT NULL
  `warehouseStockDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GoodsStatsWeightDimensionsDTO` generated from model 'goodsStatsWeightDimensionsDTO'
-- Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
--

CREATE TABLE IF NOT EXISTS `GoodsStatsWeightDimensionsDTO` (
  `length` decimal /*Длина товара в сантиметрах.*/,
  `width` decimal /*Ширина товара в сантиметрах.*/,
  `height` decimal /*Высота товара в сантиметрах.*/,
  `weight` decimal /*Вес товара в килограммах.*/
);  /*Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. */


-- --------------------------------------------------------------------------
-- Table structure for table `GpsDTO` generated from model 'gpsDTO'
-- GPS-координаты широты и долготы. 
--

CREATE TABLE IF NOT EXISTS `GpsDTO` (
  `latitude` decimal NOT NULL /*Широта.*/,
  `longitude` decimal NOT NULL /*Долгота.*/
);  /*GPS-координаты широты и долготы. */


-- --------------------------------------------------------------------------
-- Table structure for table `HiddenOfferDTO` generated from model 'hiddenOfferDTO'
-- Информация о скрытии.
--

CREATE TABLE IF NOT EXISTS `HiddenOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */
);  /*Информация о скрытии.*/


-- --------------------------------------------------------------------------
-- Table structure for table `LogisticPickupPointDTO` generated from model 'logisticPickupPointDTO'
-- Описание пункта вывоза для возврата.
--

CREATE TABLE IF NOT EXISTS `LogisticPickupPointDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор пункта вывоза.*/,
  `name` text /*Название пункта вывоза.*/,
  `address` long,
  `instruction` text /*Дополнительные инструкции к вывозу.*/,
  `type` long,
  `logisticPartnerId` long /*Идентификатор логистического партнера, к которому относится логистическая точка.*/
);  /*Описание пункта вывоза для возврата.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferDTO` generated from model 'mappingsOfferDTO'
-- Информация о товарах в каталоге.
--

CREATE TABLE IF NOT EXISTS `MappingsOfferDTO` (
  `name` text /*Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) */,
  `shopSku` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `category` text /*Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. */,
  `vendor` text /*Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.*/,
  `vendorCode` text /*Артикул товара от производителя.*/,
  `description` text /*Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) */,
  `id` text PRIMARY KEY /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `feedId` long /*Идентификатор фида.*/,
  `manufacturer` text /*Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. */,
  `minShipment` int /*Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. */,
  `transportUnitSize` int /*Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. */,
  `quantumOfSupply` int /*Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. */,
  `deliveryDurationDays` int /*Срок, за который продавец поставляет товары на склад, в днях.*/,
  `boxCount` int /*Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. */,
  `weightDimensions` long,
  `shelfLifeDays` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. */,
  `lifeTimeDays` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. */,
  `guaranteePeriodDays` int /*Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. */,
  `processingState` long,
  `availability` long,
  `shelfLife` long,
  `lifeTime` long,
  `guaranteePeriod` long,
  `certificate` text /*Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) */,
  `price` decimal /*Цена на товар в рублях.*/
);  /*Информация о товарах в каталоге.*/

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferDTOBarcodes` generated from model 'MappingsOfferDTOBarcodes'

CREATE TABLE IF NOT EXISTS `MappingsOfferDTOBarcodes` (
  `mappingsOfferDTO` long NOT NULL
  `barcodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferDTOUrls` generated from model 'MappingsOfferDTOUrls'

CREATE TABLE IF NOT EXISTS `MappingsOfferDTOUrls` (
  `mappingsOfferDTO` long NOT NULL
  `urls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferDTOPictures` generated from model 'MappingsOfferDTOPictures'

CREATE TABLE IF NOT EXISTS `MappingsOfferDTOPictures` (
  `mappingsOfferDTO` long NOT NULL
  `pictures` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferDTOManufacturerCountries` generated from model 'MappingsOfferDTOManufacturerCountries'

CREATE TABLE IF NOT EXISTS `MappingsOfferDTOManufacturerCountries` (
  `mappingsOfferDTO` long NOT NULL
  `manufacturerCountries` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferDTOCustomsCommodityCodes` generated from model 'MappingsOfferDTOCustomsCommodityCodes'

CREATE TABLE IF NOT EXISTS `MappingsOfferDTOCustomsCommodityCodes` (
  `mappingsOfferDTO` long NOT NULL
  `customsCommodityCodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferDTODayOfWeekType` generated from model 'MappingsOfferDTODayOfWeekType'

CREATE TABLE IF NOT EXISTS `MappingsOfferDTODayOfWeekType` (
  `mappingsOfferDTO` long NOT NULL
  `dayOfWeekType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferInfoDTO` generated from model 'mappingsOfferInfoDTO'
-- Базовая информация о товарах в каталоге.
--

CREATE TABLE IF NOT EXISTS `MappingsOfferInfoDTO` (
  `name` text /*Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) */,
  `shopSku` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `category` text /*Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. */,
  `vendor` text /*Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.*/,
  `vendorCode` text /*Артикул товара от производителя.*/,
  `description` text /*Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) */,
  `id` text PRIMARY KEY /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `feedId` long /*Идентификатор фида.*/,
  `manufacturer` text /*Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. */,
  `minShipment` int /*Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. */,
  `transportUnitSize` int /*Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. */,
  `quantumOfSupply` int /*Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. */,
  `deliveryDurationDays` int /*Срок, за который продавец поставляет товары на склад, в днях.*/,
  `boxCount` int /*Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. */,
  `weightDimensions` long,
  `shelfLifeDays` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. */,
  `lifeTimeDays` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. */,
  `guaranteePeriodDays` int /*Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. */,
  `processingState` long,
  `availability` long,
  `shelfLife` long,
  `lifeTime` long,
  `guaranteePeriod` long,
  `certificate` text /*Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) */
);  /*Базовая информация о товарах в каталоге.*/

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferInfoDTOBarcodes` generated from model 'MappingsOfferInfoDTOBarcodes'

CREATE TABLE IF NOT EXISTS `MappingsOfferInfoDTOBarcodes` (
  `mappingsOfferInfoDTO` long NOT NULL
  `barcodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferInfoDTOUrls` generated from model 'MappingsOfferInfoDTOUrls'

CREATE TABLE IF NOT EXISTS `MappingsOfferInfoDTOUrls` (
  `mappingsOfferInfoDTO` long NOT NULL
  `urls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferInfoDTOPictures` generated from model 'MappingsOfferInfoDTOPictures'

CREATE TABLE IF NOT EXISTS `MappingsOfferInfoDTOPictures` (
  `mappingsOfferInfoDTO` long NOT NULL
  `pictures` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferInfoDTOManufacturerCountries` generated from model 'MappingsOfferInfoDTOManufacturerCountries'

CREATE TABLE IF NOT EXISTS `MappingsOfferInfoDTOManufacturerCountries` (
  `mappingsOfferInfoDTO` long NOT NULL
  `manufacturerCountries` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferInfoDTOCustomsCommodityCodes` generated from model 'MappingsOfferInfoDTOCustomsCommodityCodes'

CREATE TABLE IF NOT EXISTS `MappingsOfferInfoDTOCustomsCommodityCodes` (
  `mappingsOfferInfoDTO` long NOT NULL
  `customsCommodityCodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MappingsOfferInfoDTODayOfWeekType` generated from model 'MappingsOfferInfoDTODayOfWeekType'

CREATE TABLE IF NOT EXISTS `MappingsOfferInfoDTODayOfWeekType` (
  `mappingsOfferInfoDTO` long NOT NULL
  `dayOfWeekType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MaxSaleQuantumDTO` generated from model 'maxSaleQuantumDTO'
-- Лимит на установку кванта и минимального количества товаров по категориям. 
--

CREATE TABLE IF NOT EXISTS `MaxSaleQuantumDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор категории.*/,
  `name` text /*Название категории.*/,
  `maxSaleQuantum` int /*Лимит на установку кванта и минимального количества товаров.*/
);  /*Лимит на установку кванта и минимального количества товаров по категориям. */


-- --------------------------------------------------------------------------
-- Table structure for table `ModelDTO` generated from model 'modelDTO'
-- Модель товара.
--

CREATE TABLE IF NOT EXISTS `ModelDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор модели товара.*/,
  `name` text /*Название модели товара.*/,
  `prices` long
);  /*Модель товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ModelOfferDTO` generated from model 'modelOfferDTO'
-- Информация о предложении.
--

CREATE TABLE IF NOT EXISTS `ModelOfferDTO` (
  `discount` int /*Скидка на предложение в процентах.*/,
  `name` text /*Наименование предложения.*/,
  `pos` int /*Позиция предложения в выдаче Маркета на карточке модели.*/,
  `preDiscountPrice` decimal /*Цена предложения без скидки магазина.*/,
  `price` decimal /*Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.*/,
  `regionId` long /*Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них. */,
  `shippingCost` decimal /*Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. */,
  `shopName` text /*Название магазина (в том виде, в котором отображается на Маркете).*/,
  `shopRating` int /*Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;. */,
  `inStock` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} */
);  /*Информация о предложении.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ModelPriceDTO` generated from model 'modelPriceDTO'
-- Информация о ценах на модель товара.
--

CREATE TABLE IF NOT EXISTS `ModelPriceDTO` (
  `avg` decimal /*Средняя цена предложения для модели в регионе.*/,
  `max` decimal /*Максимальная цена предложения для модели в регионе.*/,
  `min` decimal /*Минимальная цена предложения для модели в регионе.*/
);  /*Информация о ценах на модель товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ModelsDTO` generated from model 'modelsDTO'
-- Список моделей товаров.
--

CREATE TABLE IF NOT EXISTS `ModelsDTO` (
);  /*Список моделей товаров.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ModelsDTOModelDTO` generated from model 'ModelsDTOModelDTO'

CREATE TABLE IF NOT EXISTS `ModelsDTOModelDTO` (
  `modelsDTO` long NOT NULL
  `modelDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferCampaignStatusDTO` generated from model 'offerCampaignStatusDTO'
-- Статус товара в магазине.
--

CREATE TABLE IF NOT EXISTS `OfferCampaignStatusDTO` (
  `campaignId` long NOT NULL /*Идентификатор кампании. */,
  `status` long NOT NULL
);  /*Статус товара в магазине.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferCardDTO` generated from model 'offerCardDTO'
-- Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
--

CREATE TABLE IF NOT EXISTS `OfferCardDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `mapping` long,
  `cardStatus` long,
  `contentRating` int /*Процент заполненности карточки.*/,
);  /*Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. */

-- --------------------------------------------------------------------------
-- Table structure for table `OfferCardDTOParameterValueDTO` generated from model 'OfferCardDTOParameterValueDTO'

CREATE TABLE IF NOT EXISTS `OfferCardDTOParameterValueDTO` (
  `offerCardDTO` long NOT NULL
  `parameterValueDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OfferCardDTOOfferCardRecommendationDTO` generated from model 'OfferCardDTOOfferCardRecommendationDTO'

CREATE TABLE IF NOT EXISTS `OfferCardDTOOfferCardRecommendationDTO` (
  `offerCardDTO` long NOT NULL
  `offerCardRecommendationDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OfferCardDTOOfferErrorDTO` generated from model 'OfferCardDTOOfferErrorDTO'

CREATE TABLE IF NOT EXISTS `OfferCardDTOOfferErrorDTO` (
  `offerCardDTO` long NOT NULL
  `offerErrorDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OfferCardDTOOfferErrorDTO` generated from model 'OfferCardDTOOfferErrorDTO'

CREATE TABLE IF NOT EXISTS `OfferCardDTOOfferErrorDTO` (
  `offerCardDTO` long NOT NULL
  `offerErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferCardRecommendationDTO` generated from model 'offerCardRecommendationDTO'
-- Рекомендация по заполнению карточки товара.
--

CREATE TABLE IF NOT EXISTS `OfferCardRecommendationDTO` (
  `type` long NOT NULL,
  `percent` int UNSIGNED /*Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.*/
);  /*Рекомендация по заполнению карточки товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferCardsContentStatusDTO` generated from model 'offerCardsContentStatusDTO'
-- Список товаров с информацией о состоянии карточек.
--

CREATE TABLE IF NOT EXISTS `OfferCardsContentStatusDTO` (
  `paging` long
);  /*Список товаров с информацией о состоянии карточек.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OfferCardsContentStatusDTOOfferCardDTO` generated from model 'OfferCardsContentStatusDTOOfferCardDTO'

CREATE TABLE IF NOT EXISTS `OfferCardsContentStatusDTOOfferCardDTO` (
  `offerCardsContentStatusDTO` long NOT NULL
  `offerCardDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferConditionDTO` generated from model 'offerConditionDTO'
-- Состояние уцененного товара. 
--

CREATE TABLE IF NOT EXISTS `OfferConditionDTO` (
  `type` long,
  `quality` long,
  `reason` text /*Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. */
);  /*Состояние уцененного товара. */


-- --------------------------------------------------------------------------
-- Table structure for table `OfferContentDTO` generated from model 'offerContentDTO'
-- Товар с указанными характеристиками.
--

CREATE TABLE IF NOT EXISTS `OfferContentDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `categoryId` int NOT NULL /*Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).*/,
);  /*Товар с указанными характеристиками.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OfferContentDTOParameterValueDTO` generated from model 'OfferContentDTOParameterValueDTO'

CREATE TABLE IF NOT EXISTS `OfferContentDTOParameterValueDTO` (
  `offerContentDTO` long NOT NULL
  `parameterValueDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferContentErrorDTO` generated from model 'offerContentErrorDTO'
-- Текст ошибки.
--

CREATE TABLE IF NOT EXISTS `OfferContentErrorDTO` (
  `type` long NOT NULL,
  `message` text NOT NULL /*Текст ошибки.*/,
  `parameterId` long /*Идентификатор характеристики, с которой связана ошибка.*/
);  /*Текст ошибки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferDTO` generated from model 'offerDTO'
-- Предложение.
--

CREATE TABLE IF NOT EXISTS `OfferDTO` (
  `modelId` long NOT NULL /*Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %} */,
  `price` decimal /*Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. */,
  `feedId` long /*Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. */,
  `id` text PRIMARY KEY /*Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. */,
  `shopCategoryId` text /*Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. */,
  `marketCategoryId` int /*Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. */,
  `preDiscountPrice` decimal /*Цена предложения без скидки.*/,
  `discount` int /*Скидка на предложение в процентах.*/,
  `cutPrice` boolean /*Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API. */,
  `url` text /*URL-адрес предложения на сайте магазина.*/,
  `name` text /*Наименование предложения.*/,
  `currency` long,
  `bid` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. */,
  `cbid` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. */,
  `fee` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. */,
  `blocked` boolean /*Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. */
);  /*Предложение.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferErrorDTO` generated from model 'offerErrorDTO'
-- Сообщение об ошибке, связанной с размещением товара.
--

CREATE TABLE IF NOT EXISTS `OfferErrorDTO` (
  `message` text /*Тип ошибки.*/,
  `comment` text /*Пояснение.*/
);  /*Сообщение об ошибке, связанной с размещением товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferForRecommendationDTO` generated from model 'offerForRecommendationDTO'
-- Информация о состоянии цены на товар.
--

CREATE TABLE IF NOT EXISTS `OfferForRecommendationDTO` (
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `price` long,
  `cofinancePrice` long,
  `competitiveness` long,
  `shows` long /*Количество показов карточки товара за последние 7 дней.*/
);  /*Информация о состоянии цены на товар.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferManualDTO` generated from model 'offerManualDTO'
-- Инструкция по использованию товара. 
--

CREATE TABLE IF NOT EXISTS `OfferManualDTO` (
  `url` text NOT NULL /*Ссылка на инструкцию.*/,
  `title` text /*Название инструкции, которое будет отображаться на карточке товара. */
);  /*Инструкция по использованию товара. */


-- --------------------------------------------------------------------------
-- Table structure for table `OfferMappingDTO` generated from model 'offerMappingDTO'
-- Информация о текущей карточке товара на Маркете.
--

CREATE TABLE IF NOT EXISTS `OfferMappingDTO` (
  `marketSku` long /*SKU на Маркете.*/,
  `modelId` long /*Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара. */,
  `categoryId` long /*Идентификатор категории для текущей карточки товара на Маркете.*/
);  /*Информация о текущей карточке товара на Маркете.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferMappingEntriesDTO` generated from model 'offerMappingEntriesDTO'
-- Информация о товарах в каталоге.
--

CREATE TABLE IF NOT EXISTS `OfferMappingEntriesDTO` (
  `paging` long
);  /*Информация о товарах в каталоге.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OfferMappingEntriesDTOOfferMappingEntryDTO` generated from model 'OfferMappingEntriesDTOOfferMappingEntryDTO'

CREATE TABLE IF NOT EXISTS `OfferMappingEntriesDTOOfferMappingEntryDTO` (
  `offerMappingEntriesDTO` long NOT NULL
  `offerMappingEntryDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferMappingEntryDTO` generated from model 'offerMappingEntryDTO'
-- Список товаров. 
--

CREATE TABLE IF NOT EXISTS `OfferMappingEntryDTO` (
  `mapping` long,
  `awaitingModerationMapping` long,
  `rejectedMapping` long,
  `offer` long
);  /*Список товаров. */


-- --------------------------------------------------------------------------
-- Table structure for table `OfferMappingErrorDTO` generated from model 'offerMappingErrorDTO'
-- Текст ошибки.
--

CREATE TABLE IF NOT EXISTS `OfferMappingErrorDTO` (
  `type` long NOT NULL,
  `message` text NOT NULL /*Текст ошибки.*/,
  `parameterId` long /*Идентификатор характеристики, с которой связана ошибка.*/
);  /*Текст ошибки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferMappingInfoDTO` generated from model 'offerMappingInfoDTO'
-- Информация о карточке товара.
--

CREATE TABLE IF NOT EXISTS `OfferMappingInfoDTO` (
  `mapping` long,
  `awaitingModerationMapping` long,
  `rejectedMapping` long
);  /*Информация о карточке товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferMappingSuggestionsListDTO` generated from model 'offerMappingSuggestionsListDTO'
-- Список рекомендованных карточек товара.
--

CREATE TABLE IF NOT EXISTS `OfferMappingSuggestionsListDTO` (
);  /*Список рекомендованных карточек товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OfferMappingSuggestionsListDTOEnrichedMappingsOfferDTO` generated from model 'OfferMappingSuggestionsListDTOEnrichedMappingsOfferDTO'

CREATE TABLE IF NOT EXISTS `OfferMappingSuggestionsListDTOEnrichedMappingsOfferDTO` (
  `offerMappingSuggestionsListDTO` long NOT NULL
  `enrichedMappingsOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferParamDTO` generated from model 'offerParamDTO'
-- Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %} 
--

CREATE TABLE IF NOT EXISTS `OfferParamDTO` (
  `name` text NOT NULL /*Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). */,
  `value` text NOT NULL /*Значение. */
);  /*Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %} */


-- --------------------------------------------------------------------------
-- Table structure for table `OfferPriceByOfferIdsListResponseDTO` generated from model 'offerPriceByOfferIdsListResponseDTO'
-- Список цен.
--

CREATE TABLE IF NOT EXISTS `OfferPriceByOfferIdsListResponseDTO` (
  `paging` long
);  /*Список цен.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OfferPriceByOfferIdsListResponseDTOOfferPriceByOfferIdsResponseDTO` generated from model 'OfferPriceByOfferIdsListResponseDTOOfferPriceByOfferIdsResponseDTO'

CREATE TABLE IF NOT EXISTS `OfferPriceByOfferIdsListResponseDTOOfferPriceByOfferIdsResponseDTO` (
  `offerPriceByOfferIdsListResponseDTO` long NOT NULL
  `offerPriceByOfferIdsResponseDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferPriceByOfferIdsResponseDTO` generated from model 'offerPriceByOfferIdsResponseDTO'
-- Информация об установленной цене.
--

CREATE TABLE IF NOT EXISTS `OfferPriceByOfferIdsResponseDTO` (
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `price` long,
  `updatedAt` datetime /*Дата и время последнего обновления цены.*/
);  /*Информация об установленной цене.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferPriceDTO` generated from model 'offerPriceDTO'
-- Товар с информацией о новой цене на него.
--

CREATE TABLE IF NOT EXISTS `OfferPriceDTO` (
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `price` long
);  /*Товар с информацией о новой цене на него.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferPriceListResponseDTO` generated from model 'offerPriceListResponseDTO'
-- Список цен на товары.
--

CREATE TABLE IF NOT EXISTS `OfferPriceListResponseDTO` (
  `paging` long,
  `total` int /*Количество всех цен магазина, измененных через API.*/
);  /*Список цен на товары.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OfferPriceListResponseDTOOfferPriceResponseDTO` generated from model 'OfferPriceListResponseDTOOfferPriceResponseDTO'

CREATE TABLE IF NOT EXISTS `OfferPriceListResponseDTOOfferPriceResponseDTO` (
  `offerPriceListResponseDTO` long NOT NULL
  `offerPriceResponseDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferPriceResponseDTO` generated from model 'offerPriceResponseDTO'
-- Информация об установленной цене на товар.
--

CREATE TABLE IF NOT EXISTS `OfferPriceResponseDTO` (
  `id` text PRIMARY KEY /*Идентификатор предложения из прайс-листа.*/,
  `price` long,
  `marketSku` long /*SKU на Маркете.*/,
  `updatedAt` datetime /*Дата и время последнего обновления цены на товар.*/
);  /*Информация об установленной цене на товар.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferProcessingNoteDTO` generated from model 'offerProcessingNoteDTO'
-- Причины, по которым товар не прошел модерацию.
--

CREATE TABLE IF NOT EXISTS `OfferProcessingNoteDTO` (
  `type` long,
  `payload` text /*Дополнительная информация о причине отклонения товара. */
);  /*Причины, по которым товар не прошел модерацию.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferProcessingStateDTO` generated from model 'offerProcessingStateDTO'
-- Информация о статусе публикации товара на Маркете.
--

CREATE TABLE IF NOT EXISTS `OfferProcessingStateDTO` (
  `status` long,
);  /*Информация о статусе публикации товара на Маркете.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OfferProcessingStateDTOOfferProcessingNoteDTO` generated from model 'OfferProcessingStateDTOOfferProcessingNoteDTO'

CREATE TABLE IF NOT EXISTS `OfferProcessingStateDTOOfferProcessingNoteDTO` (
  `offerProcessingStateDTO` long NOT NULL
  `offerProcessingNoteDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferRecommendationDTO` generated from model 'offerRecommendationDTO'
-- Информация о состоянии цен и рекомендации. 
--

CREATE TABLE IF NOT EXISTS `OfferRecommendationDTO` (
  `offer` long,
  `recommendation` long
);  /*Информация о состоянии цен и рекомендации. */


-- --------------------------------------------------------------------------
-- Table structure for table `OfferRecommendationInfoDTO` generated from model 'offerRecommendationInfoDTO'
-- Рекомендации, касающиеся цены на товар.
--

CREATE TABLE IF NOT EXISTS `OfferRecommendationInfoDTO` (
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `recommendedCofinancePrice` long,
  `competitivenessThresholds` long
);  /*Рекомендации, касающиеся цены на товар.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferRecommendationsResultDTO` generated from model 'offerRecommendationsResultDTO'
-- Список товаров с рекомендациями.
--

CREATE TABLE IF NOT EXISTS `OfferRecommendationsResultDTO` (
  `paging` long
);  /*Список товаров с рекомендациями.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OfferRecommendationsResultDTOOfferRecommendationDTO` generated from model 'OfferRecommendationsResultDTOOfferRecommendationDTO'

CREATE TABLE IF NOT EXISTS `OfferRecommendationsResultDTOOfferRecommendationDTO` (
  `offerRecommendationsResultDTO` long NOT NULL
  `offerRecommendationDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OfferSellingProgramDTO` generated from model 'offerSellingProgramDTO'
-- Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
--

CREATE TABLE IF NOT EXISTS `OfferSellingProgramDTO` (
  `sellingProgram` long NOT NULL,
  `status` long NOT NULL
);  /*Информация о том, по каким моделям можно продавать товар, а по каким нельзя.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OfferWeightDimensionsDTO` generated from model 'offerWeightDimensionsDTO'
-- Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
--

CREATE TABLE IF NOT EXISTS `OfferWeightDimensionsDTO` (
  `length` decimal NOT NULL /*Длина упаковки в см. */,
  `width` decimal NOT NULL /*Ширина упаковки в см. */,
  `height` decimal NOT NULL /*Высота упаковки в см. */,
  `weight` decimal NOT NULL /*Вес товара в кг с учетом упаковки (брутто). */
);  /*Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) */


-- --------------------------------------------------------------------------
-- Table structure for table `OffersDTO` generated from model 'offersDTO'
-- Найденные предложения магазина.
--

CREATE TABLE IF NOT EXISTS `OffersDTO` (
);  /*Найденные предложения магазина.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OffersDTOOfferDTO` generated from model 'OffersDTOOfferDTO'

CREATE TABLE IF NOT EXISTS `OffersDTOOfferDTO` (
  `offersDTO` long NOT NULL
  `offerDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OptionValuesLimitedDTO` generated from model 'optionValuesLimitedDTO'
-- Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
--

CREATE TABLE IF NOT EXISTS `OptionValuesLimitedDTO` (
  `limitingOptionValueId` long NOT NULL /*Идентификатор значения ограничивающей характеристики.*/,
);  /*Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OptionValuesLimitedDTOOptionValueIds` generated from model 'OptionValuesLimitedDTOOptionValueIds'

CREATE TABLE IF NOT EXISTS `OptionValuesLimitedDTOOptionValueIds` (
  `optionValuesLimitedDTO` long NOT NULL
  `optionValueIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBoxLayoutDTO` generated from model 'orderBoxLayoutDTO'
-- Информация о коробке.
--

CREATE TABLE IF NOT EXISTS `OrderBoxLayoutDTO` (
);  /*Информация о коробке.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrderBoxLayoutDTOOrderBoxLayoutItemDTO` generated from model 'OrderBoxLayoutDTOOrderBoxLayoutItemDTO'

CREATE TABLE IF NOT EXISTS `OrderBoxLayoutDTOOrderBoxLayoutItemDTO` (
  `orderBoxLayoutDTO` long NOT NULL
  `orderBoxLayoutItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBoxLayoutItemDTO` generated from model 'orderBoxLayoutItemDTO'
-- Информация о товаре в коробке.
--

CREATE TABLE IF NOT EXISTS `OrderBoxLayoutItemDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}   */,
  `fullCount` int UNSIGNED /*Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;. */,
  `partialCount` long,
);  /*Информация о товаре в коробке.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrderBoxLayoutItemDTOBriefOrderItemInstanceDTO` generated from model 'OrderBoxLayoutItemDTOBriefOrderItemInstanceDTO'

CREATE TABLE IF NOT EXISTS `OrderBoxLayoutItemDTOBriefOrderItemInstanceDTO` (
  `orderBoxLayoutItemDTO` long NOT NULL
  `briefOrderItemInstanceDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBoxLayoutPartialCountDTO` generated from model 'orderBoxLayoutPartialCountDTO'
-- Информация о части товара в коробке.
--

CREATE TABLE IF NOT EXISTS `OrderBoxLayoutPartialCountDTO` (
  `current` int UNSIGNED NOT NULL /*Номер части, начиная с 1.*/,
  `total` int UNSIGNED NOT NULL /*На сколько всего частей разделен товар.*/
);  /*Информация о части товара в коробке.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBoxesLayoutDTO` generated from model 'orderBoxesLayoutDTO'
-- Распределение товаров по коробкам.
--

CREATE TABLE IF NOT EXISTS `OrderBoxesLayoutDTO` (
);  /*Распределение товаров по коробкам.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrderBoxesLayoutDTOEnrichedOrderBoxLayoutDTO` generated from model 'OrderBoxesLayoutDTOEnrichedOrderBoxLayoutDTO'

CREATE TABLE IF NOT EXISTS `OrderBoxesLayoutDTOEnrichedOrderBoxLayoutDTO` (
  `orderBoxesLayoutDTO` long NOT NULL
  `enrichedOrderBoxLayoutDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBusinessBuyerDTO` generated from model 'orderBusinessBuyerDTO'
-- Информация о покупателе. 
--

CREATE TABLE IF NOT EXISTS `OrderBusinessBuyerDTO` (
  `inn` text /*ИНН.*/,
  `kpp` text /*КПП.*/,
  `organizationName` text /*Наименование юридического лица.*/,
  `organizationJurAddress` text /*Юридический адрес.*/
);  /*Информация о покупателе. */


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBusinessDocumentsDTO` generated from model 'orderBusinessDocumentsDTO'
-- Информация о документах. 
--

CREATE TABLE IF NOT EXISTS `OrderBusinessDocumentsDTO` (
  `upd` long,
  `ukd` long,
  `torgTwelve` long,
  `sf` long,
  `ksf` long
);  /*Информация о документах. */


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBuyerBasicInfoDTO` generated from model 'orderBuyerBasicInfoDTO'
-- Информация о покупателе с базовыми полями.
--

CREATE TABLE IF NOT EXISTS `OrderBuyerBasicInfoDTO` (
  `id` text PRIMARY KEY /*Идентификатор покупателя.*/,
  `lastName` text /*Фамилия покупателя.*/,
  `firstName` text /*Имя покупателя.*/,
  `middleName` text /*Отчество покупателя.*/,
  `type` long
);  /*Информация о покупателе с базовыми полями.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBuyerDTO` generated from model 'orderBuyerDTO'
-- Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS. 
--

CREATE TABLE IF NOT EXISTS `OrderBuyerDTO` (
  `id` text PRIMARY KEY /*Идентификатор покупателя.*/,
  `lastName` text /*Фамилия покупателя.*/,
  `firstName` text /*Имя покупателя.*/,
  `middleName` text /*Отчество покупателя.*/,
  `type` long
);  /*Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS. */


-- --------------------------------------------------------------------------
-- Table structure for table `OrderBuyerInfoDTO` generated from model 'orderBuyerInfoDTO'
-- Информация о покупателе и его номере телефона.
--

CREATE TABLE IF NOT EXISTS `OrderBuyerInfoDTO` (
  `id` text PRIMARY KEY /*Идентификатор покупателя.*/,
  `lastName` text /*Фамилия покупателя.*/,
  `firstName` text /*Имя покупателя.*/,
  `middleName` text /*Отчество покупателя.*/,
  `type` long,
  `phone` text /*Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;. */
);  /*Информация о покупателе и его номере телефона.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderCourierDTO` generated from model 'orderCourierDTO'
-- Информация о курьере.
--

CREATE TABLE IF NOT EXISTS `OrderCourierDTO` (
  `fullName` text /*Полное имя курьера.*/,
  `phone` text /*Номер телефона курьера.*/,
  `phoneExtension` text /*Добавочный номер телефона.*/,
  `vehicleNumber` text /*Номер транспортного средства.*/,
  `vehicleDescription` text /*Описание машины. Например, модель и цвет.*/
);  /*Информация о курьере.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderDTO` generated from model 'orderDTO'
-- Заказ.
--

CREATE TABLE IF NOT EXISTS `OrderDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор заказа.*/,
  `status` long,
  `substatus` long,
  `creationDate` text,
  `updatedAt` text,
  `currency` long,
  `itemsTotal` decimal /*Платеж покупателя. */,
  `deliveryTotal` decimal /*Стоимость доставки. */,
  `buyerItemsTotal` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. */,
  `buyerTotal` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. */,
  `buyerItemsTotalBeforeDiscount` decimal /*Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. */,
  `buyerTotalBeforeDiscount` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). */,
  `paymentType` long,
  `paymentMethod` long,
  `fake` boolean /*Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. */,
  `delivery` long,
  `buyer` long,
  `notes` text /*Комментарий к заказу.*/,
  `taxSystem` long,
  `cancelRequested` boolean /***Только для модели DBS**  Запрошена ли отмена. */,
  `expiryDate` text
);  /*Заказ.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrderDTOOrderItemDTO` generated from model 'OrderDTOOrderItemDTO'

CREATE TABLE IF NOT EXISTS `OrderDTOOrderItemDTO` (
  `orderDTO` long NOT NULL
  `orderItemDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderDTOOrderSubsidyDTO` generated from model 'OrderDTOOrderSubsidyDTO'

CREATE TABLE IF NOT EXISTS `OrderDTOOrderSubsidyDTO` (
  `orderDTO` long NOT NULL
  `orderSubsidyDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderDeliveryAddressDTO` generated from model 'orderDeliveryAddressDTO'
-- Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
--

CREATE TABLE IF NOT EXISTS `OrderDeliveryAddressDTO` (
  `country` text /*Страна.  Обязательный параметр. */,
  `postcode` text /*Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;). */,
  `city` text /*Город или населенный пункт.  Обязательный параметр. */,
  `district` text /*Район.*/,
  `subway` text /*Станция метро.*/,
  `street` text /*Улица.  Обязательный параметр. */,
  `house` text /*Дом или владение.  Обязательный параметр. */,
  `block` text /*Корпус или строение.*/,
  `entrance` text /*Подъезд.*/,
  `entryphone` text /*Код домофона.*/,
  `floor` text /*Этаж.*/,
  `apartment` text /*Квартира или офис.*/,
  `phone` text /*Телефон получателя заказа.  Обязательный параметр. */,
  `recipient` text /*Фамилия, имя и отчество получателя заказа.  Обязательный параметр. */,
  `gps` long
);  /*Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). */


-- --------------------------------------------------------------------------
-- Table structure for table `OrderDeliveryDTO` generated from model 'orderDeliveryDTO'
-- Информация о доставке.
--

CREATE TABLE IF NOT EXISTS `OrderDeliveryDTO` (
  `id` text PRIMARY KEY /*Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). */,
  `type` long,
  `serviceName` text /*Наименование службы доставки.*/,
  `price` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа. */,
  `deliveryPartnerType` long,
  `courier` long,
  `dates` long,
  `region` long,
  `address` long,
  `vat` long,
  `deliveryServiceId` long /*Идентификатор службы доставки.*/,
  `liftType` long,
  `liftPrice` decimal /*Стоимость подъема на этаж.*/,
  `outletCode` text /*Идентификатор пункта самовывоза, присвоенный магазином.*/,
  `outletStorageLimitDate` text /*Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */,
  `dispatchType` long,
  `estimated` boolean /*Приблизительная ли дата доставки.*/,
  `eacType` long,
  `eacCode` text /*Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;). */
);  /*Информация о доставке.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrderDeliveryDTOOrderTrackDTO` generated from model 'OrderDeliveryDTOOrderTrackDTO'

CREATE TABLE IF NOT EXISTS `OrderDeliveryDTOOrderTrackDTO` (
  `orderDeliveryDTO` long NOT NULL
  `orderTrackDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderDeliveryDTOOrderShipmentDTO` generated from model 'OrderDeliveryDTOOrderShipmentDTO'

CREATE TABLE IF NOT EXISTS `OrderDeliveryDTOOrderShipmentDTO` (
  `orderDeliveryDTO` long NOT NULL
  `orderShipmentDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderDeliveryDateDTO` generated from model 'orderDeliveryDateDTO'
-- Информация о новой дате доставки заказа.
--

CREATE TABLE IF NOT EXISTS `OrderDeliveryDateDTO` (
  `toDate` date NOT NULL /*Новая дата доставки заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. */
);  /*Информация о новой дате доставки заказа.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderDeliveryDatesDTO` generated from model 'orderDeliveryDatesDTO'
-- Диапазон дат доставки.
--

CREATE TABLE IF NOT EXISTS `OrderDeliveryDatesDTO` (
  `fromDate` text /*Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */,
  `toDate` text /*Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */,
  `fromTime` text /*Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;. */,
  `toTime` text /*Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;. */,
  `realDeliveryDate` text /*Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */
);  /*Диапазон дат доставки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderDigitalItemDTO` generated from model 'orderDigitalItemDTO'
-- Ключ цифрового товара.
--

CREATE TABLE IF NOT EXISTS `OrderDigitalItemDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. */,
  `code` text NOT NULL /*Сам ключ.*/,
  `slip` text NOT NULL /*Инструкция по активации.*/,
  `activate_till` date NOT NULL /*Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. */
);  /*Ключ цифрового товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemDTO` generated from model 'orderItemDTO'
-- Список товаров в заказе.
--

CREATE TABLE IF NOT EXISTS `OrderItemDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. */,
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `offerName` text /*Название товара.*/,
  `price` decimal /*Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;). */,
  `buyerPrice` decimal /*Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. */,
  `buyerPriceBeforeDiscount` decimal /*Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. */,
  `priceBeforeDiscount` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. */,
  `count` int /*Количество единиц товара.*/,
  `vat` long,
  `shopSku` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `subsidy` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. */,
  `partnerWarehouseId` text /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. */,
);  /*Список товаров в заказе.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemDTOOrderItemPromoDTO` generated from model 'OrderItemDTOOrderItemPromoDTO'

CREATE TABLE IF NOT EXISTS `OrderItemDTOOrderItemPromoDTO` (
  `orderItemDTO` long NOT NULL
  `orderItemPromoDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemDTOOrderItemInstanceDTO` generated from model 'OrderItemDTOOrderItemInstanceDTO'

CREATE TABLE IF NOT EXISTS `OrderItemDTOOrderItemInstanceDTO` (
  `orderItemDTO` long NOT NULL
  `orderItemInstanceDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemDTOOrderItemDetailDTO` generated from model 'OrderItemDTOOrderItemDetailDTO'

CREATE TABLE IF NOT EXISTS `OrderItemDTOOrderItemDetailDTO` (
  `orderItemDTO` long NOT NULL
  `orderItemDetailDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemDTOOrderItemSubsidyDTO` generated from model 'OrderItemDTOOrderItemSubsidyDTO'

CREATE TABLE IF NOT EXISTS `OrderItemDTOOrderItemSubsidyDTO` (
  `orderItemDTO` long NOT NULL
  `orderItemSubsidyDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemDTOOrderItemInstanceType` generated from model 'OrderItemDTOOrderItemInstanceType'

CREATE TABLE IF NOT EXISTS `OrderItemDTOOrderItemInstanceType` (
  `orderItemDTO` long NOT NULL
  `orderItemInstanceType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemDetailDTO` generated from model 'orderItemDetailDTO'
-- Детали по товару в заказе.
--

CREATE TABLE IF NOT EXISTS `OrderItemDetailDTO` (
  `itemCount` long /*Количество единиц товара.*/,
  `itemStatus` long,
  `updateDate` text /*Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */
);  /*Детали по товару в заказе.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemInstanceDTO` generated from model 'orderItemInstanceDTO'
-- Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
--

CREATE TABLE IF NOT EXISTS `OrderItemInstanceDTO` (
  `cis` text /*Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.*/,
  `cisFull` text /*Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.*/,
  `uin` text /*УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. */,
  `rnpt` text /*Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. */,
  `gtd` text /*Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. */
);  /*Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. */


-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemInstanceModificationDTO` generated from model 'orderItemInstanceModificationDTO'
-- Позиция в корзине, требующая маркировки.
--

CREATE TABLE IF NOT EXISTS `OrderItemInstanceModificationDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. */,
);  /*Позиция в корзине, требующая маркировки.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemInstanceModificationDTOBriefOrderItemInstanceDTO` generated from model 'OrderItemInstanceModificationDTOBriefOrderItemInstanceDTO'

CREATE TABLE IF NOT EXISTS `OrderItemInstanceModificationDTOBriefOrderItemInstanceDTO` (
  `orderItemInstanceModificationDTO` long NOT NULL
  `briefOrderItemInstanceDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemModificationDTO` generated from model 'orderItemModificationDTO'
-- Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
--

CREATE TABLE IF NOT EXISTS `OrderItemModificationDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. */,
  `count` int UNSIGNED NOT NULL /*Новое количество товара.*/,
);  /*Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. */

-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemModificationDTOBriefOrderItemInstanceDTO` generated from model 'OrderItemModificationDTOBriefOrderItemInstanceDTO'

CREATE TABLE IF NOT EXISTS `OrderItemModificationDTOBriefOrderItemInstanceDTO` (
  `orderItemModificationDTO` long NOT NULL
  `briefOrderItemInstanceDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemPromoDTO` generated from model 'orderItemPromoDTO'
-- Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
--

CREATE TABLE IF NOT EXISTS `OrderItemPromoDTO` (
  `type` long NOT NULL,
  `discount` decimal /*Размер пользовательской скидки в валюте покупателя. */,
  `subsidy` decimal /*Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. */,
  `shopPromoId` text /*Идентификатор акции поставщика. */,
  `marketPromoId` text /*Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;. */
);  /*Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemSubsidyDTO` generated from model 'orderItemSubsidyDTO'
-- Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
--

CREATE TABLE IF NOT EXISTS `OrderItemSubsidyDTO` (
  `type` long,
  `amount` decimal /*Сумма субсидии.*/
);  /*Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. */


-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemsModificationResultDTO` generated from model 'orderItemsModificationResultDTO'
-- Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
--

CREATE TABLE IF NOT EXISTS `OrderItemsModificationResultDTO` (
);  /*Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. */

-- --------------------------------------------------------------------------
-- Table structure for table `OrderItemsModificationResultDTOBriefOrderItemDTO` generated from model 'OrderItemsModificationResultDTOBriefOrderItemDTO'

CREATE TABLE IF NOT EXISTS `OrderItemsModificationResultDTOBriefOrderItemDTO` (
  `orderItemsModificationResultDTO` long NOT NULL
  `briefOrderItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLabelDTO` generated from model 'orderLabelDTO'
-- Данные для печати ярлыка.
--

CREATE TABLE IF NOT EXISTS `OrderLabelDTO` (
  `orderId` long NOT NULL /*Идентификатор заказа.*/,
  `placesNumber` int NOT NULL /*Количество коробок в заказе.*/,
  `url` text NOT NULL /*URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). */,
);  /*Данные для печати ярлыка.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLabelDTOParcelBoxLabelDTO` generated from model 'OrderLabelDTOParcelBoxLabelDTO'

CREATE TABLE IF NOT EXISTS `OrderLabelDTOParcelBoxLabelDTO` (
  `orderLabelDTO` long NOT NULL
  `parcelBoxLabelDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderParcelBoxDTO` generated from model 'orderParcelBoxDTO'
-- Информация о грузоместе.
--

CREATE TABLE IF NOT EXISTS `OrderParcelBoxDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор грузоместа.*/,
  `fulfilmentId` text /*Идентификатор грузового места в информационной системе магазина.*/
);  /*Информация о грузоместе.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderShipmentDTO` generated from model 'orderShipmentDTO'
-- Список посылок.  В параметре может указываться несколько посылок. 
--

CREATE TABLE IF NOT EXISTS `OrderShipmentDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор посылки, присвоенный Маркетом.*/,
  `shipmentDate` text /*Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */,
  `shipmentTime` text /***Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. */,
);  /*Список посылок.  В параметре может указываться несколько посылок. */

-- --------------------------------------------------------------------------
-- Table structure for table `OrderShipmentDTOOrderTrackDTO` generated from model 'OrderShipmentDTOOrderTrackDTO'

CREATE TABLE IF NOT EXISTS `OrderShipmentDTOOrderTrackDTO` (
  `orderShipmentDTO` long NOT NULL
  `orderTrackDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderShipmentDTOOrderParcelBoxDTO` generated from model 'OrderShipmentDTOOrderParcelBoxDTO'

CREATE TABLE IF NOT EXISTS `OrderShipmentDTOOrderParcelBoxDTO` (
  `orderShipmentDTO` long NOT NULL
  `orderParcelBoxDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderStateDTO` generated from model 'orderStateDTO'
-- Информация по заказу.
--

CREATE TABLE IF NOT EXISTS `OrderStateDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор заказа.*/,
  `status` long NOT NULL,
  `substatus` long
);  /*Информация по заказу.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderStatusChangeDTO` generated from model 'orderStatusChangeDTO'
-- Заказ.
--

CREATE TABLE IF NOT EXISTS `OrderStatusChangeDTO` (
  `status` long NOT NULL,
  `substatus` long,
  `delivery` long
);  /*Заказ.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderStatusChangeDeliveryDTO` generated from model 'orderStatusChangeDeliveryDTO'
-- Информация о доставке.
--

CREATE TABLE IF NOT EXISTS `OrderStatusChangeDeliveryDTO` (
  `dates` long
);  /*Информация о доставке.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderStatusChangeDeliveryDatesDTO` generated from model 'orderStatusChangeDeliveryDatesDTO'
-- Диапазон дат доставки.
--

CREATE TABLE IF NOT EXISTS `OrderStatusChangeDeliveryDatesDTO` (
  `realDeliveryDate` date /***Только для модели DBS**  Фактическая дата доставки. &lt;br&gt;&lt;br&gt; Когда передавать параметр &#x60;realDeliveryDate&#x60;:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;;   * меняете статус заказа на &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \&quot;Индекс качества\&quot; %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      */
);  /*Диапазон дат доставки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderSubsidyDTO` generated from model 'orderSubsidyDTO'
-- Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
--

CREATE TABLE IF NOT EXISTS `OrderSubsidyDTO` (
  `type` long,
  `amount` decimal /*Сумма субсидии.*/
);  /*Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. */


-- --------------------------------------------------------------------------
-- Table structure for table `OrderTrackDTO` generated from model 'orderTrackDTO'
-- Информация о трек-номере посылки (DBS).
--

CREATE TABLE IF NOT EXISTS `OrderTrackDTO` (
  `trackCode` text /*Трек‑номер посылки.*/,
  `deliveryServiceId` long /*Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).*/
);  /*Информация о трек-номере посылки (DBS).*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersShipmentInfoDTO` generated from model 'ordersShipmentInfoDTO'
-- Годные/негодные ярлыки по заказам в отгрузке.
--

CREATE TABLE IF NOT EXISTS `OrdersShipmentInfoDTO` (
);  /*Годные/негодные ярлыки по заказам в отгрузке.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersShipmentInfoDTOOrderIdsWithLabels` generated from model 'OrdersShipmentInfoDTOOrderIdsWithLabels'

CREATE TABLE IF NOT EXISTS `OrdersShipmentInfoDTOOrderIdsWithLabels` (
  `ordersShipmentInfoDTO` long NOT NULL
  `orderIdsWithLabels` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersShipmentInfoDTOOrderIdsWithoutLabels` generated from model 'OrdersShipmentInfoDTOOrderIdsWithoutLabels'

CREATE TABLE IF NOT EXISTS `OrdersShipmentInfoDTOOrderIdsWithoutLabels` (
  `ordersShipmentInfoDTO` long NOT NULL
  `orderIdsWithoutLabels` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsCommissionDTO` generated from model 'ordersStatsCommissionDTO'
-- Информация о стоимости услуг.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsCommissionDTO` (
  `type` long,
  `actual` decimal /*Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. */
);  /*Информация о стоимости услуг.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsDTO` generated from model 'ordersStatsDTO'
-- Информация по заказам.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsDTO` (
  `paging` long
);  /*Информация по заказам.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsDTOOrdersStatsOrderDTO` generated from model 'OrdersStatsDTOOrdersStatsOrderDTO'

CREATE TABLE IF NOT EXISTS `OrdersStatsDTOOrdersStatsOrderDTO` (
  `ordersStatsDTO` long NOT NULL
  `ordersStatsOrderDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsDeliveryRegionDTO` generated from model 'ordersStatsDeliveryRegionDTO'
-- Информация о регионе доставки.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsDeliveryRegionDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор региона доставки.*/,
  `name` text /*Название региона доставки.*/
);  /*Информация о регионе доставки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsDetailsDTO` generated from model 'ordersStatsDetailsDTO'
-- Информация об удалении товара из заказа.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsDetailsDTO` (
  `itemStatus` long,
  `itemCount` long /*Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.*/,
  `updateDate` date /*Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. */,
  `stockType` long
);  /*Информация об удалении товара из заказа.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsItemDTO` generated from model 'ordersStatsItemDTO'
-- Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
--

CREATE TABLE IF NOT EXISTS `OrdersStatsItemDTO` (
  `offerName` text /*Название товара.*/,
  `marketSku` long /*SKU на Маркете.*/,
  `shopSku` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `count` int /*Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;. */,
  `warehouse` long,
  `initialCount` int /*Первоначальное количество единиц товара.*/,
  `bidFee` int UNSIGNED /*Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. */,
  `cofinanceThreshold` decimal /*Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. */,
  `cofinanceValue` decimal /*Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. */
);  /*Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). */

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsItemDTOOrdersStatsPriceDTO` generated from model 'OrdersStatsItemDTOOrdersStatsPriceDTO'

CREATE TABLE IF NOT EXISTS `OrdersStatsItemDTOOrdersStatsPriceDTO` (
  `ordersStatsItemDTO` long NOT NULL
  `ordersStatsPriceDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsItemDTOOrdersStatsDetailsDTO` generated from model 'OrdersStatsItemDTOOrdersStatsDetailsDTO'

CREATE TABLE IF NOT EXISTS `OrdersStatsItemDTOOrdersStatsDetailsDTO` (
  `ordersStatsItemDTO` long NOT NULL
  `ordersStatsDetailsDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsItemDTOCisList` generated from model 'OrdersStatsItemDTOCisList'

CREATE TABLE IF NOT EXISTS `OrdersStatsItemDTOCisList` (
  `ordersStatsItemDTO` long NOT NULL
  `cisList` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsOrderDTO` generated from model 'ordersStatsOrderDTO'
-- Информация о заказе.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsOrderDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор заказа.*/,
  `creationDate` date /*Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. */,
  `statusUpdateDate` datetime /*Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). */,
  `status` long,
  `partnerOrderId` text /*Идентификатор заказа в информационной системе магазина.*/,
  `paymentType` long,
  `fake` boolean /*Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. */,
  `deliveryRegion` long,
);  /*Информация о заказе.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsOrderDTOOrdersStatsItemDTO` generated from model 'OrdersStatsOrderDTOOrdersStatsItemDTO'

CREATE TABLE IF NOT EXISTS `OrdersStatsOrderDTOOrdersStatsItemDTO` (
  `ordersStatsOrderDTO` long NOT NULL
  `ordersStatsItemDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsOrderDTOOrdersStatsPaymentDTO` generated from model 'OrdersStatsOrderDTOOrdersStatsPaymentDTO'

CREATE TABLE IF NOT EXISTS `OrdersStatsOrderDTOOrdersStatsPaymentDTO` (
  `ordersStatsOrderDTO` long NOT NULL
  `ordersStatsPaymentDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsOrderDTOOrdersStatsCommissionDTO` generated from model 'OrdersStatsOrderDTOOrdersStatsCommissionDTO'

CREATE TABLE IF NOT EXISTS `OrdersStatsOrderDTOOrdersStatsCommissionDTO` (
  `ordersStatsOrderDTO` long NOT NULL
  `ordersStatsCommissionDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsOrderDTOOrdersStatsItemDTO` generated from model 'OrdersStatsOrderDTOOrdersStatsItemDTO'

CREATE TABLE IF NOT EXISTS `OrdersStatsOrderDTOOrdersStatsItemDTO` (
  `ordersStatsOrderDTO` long NOT NULL
  `ordersStatsItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsPaymentDTO` generated from model 'ordersStatsPaymentDTO'
-- Информация о денежных переводах по заказу.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsPaymentDTO` (
  `id` text PRIMARY KEY /*Идентификатор денежного перевода.*/,
  `date` date /*Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. */,
  `type` long,
  `source` long,
  `total` decimal /*Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. */,
  `paymentOrder` long
);  /*Информация о денежных переводах по заказу.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsPaymentOrderDTO` generated from model 'ordersStatsPaymentOrderDTO'
-- Информация о платежном получении.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsPaymentOrderDTO` (
  `id` text PRIMARY KEY /*Номер платежного поручения.*/,
  `date` date /*Дата платежного поручения.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. */
);  /*Информация о платежном получении.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsPriceDTO` generated from model 'ordersStatsPriceDTO'
-- Цена или скидки на товар.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsPriceDTO` (
  `type` long,
  `costPerItem` decimal /*Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. */,
  `total` decimal /*Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. */
);  /*Цена или скидки на товар.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrdersStatsWarehouseDTO` generated from model 'ordersStatsWarehouseDTO'
-- Информация о складе, на котором хранится товар.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsWarehouseDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор склада.*/,
  `name` text /*Название склада.*/
);  /*Информация о складе, на котором хранится товар.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OutletAddressDTO` generated from model 'outletAddressDTO'
-- Адрес точки продаж. 
--

CREATE TABLE IF NOT EXISTS `OutletAddressDTO` (
  `regionId` long NOT NULL /*Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} */,
  `street` text /*Улица.*/,
  `number` text /*Номер дома.*/,
  `building` text /*Номер строения.*/,
  `estate` text /*Номер владения.*/,
  `block` text /*Номер корпуса.*/,
  `additional` text /*Дополнительная информация.*/,
  `km` int /*Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.*/,
  `city` text /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %} */
);  /*Адрес точки продаж. */


-- --------------------------------------------------------------------------
-- Table structure for table `OutletDTO` generated from model 'outletDTO'
-- Информация о точке продаж.
--

CREATE TABLE IF NOT EXISTS `OutletDTO` (
  `name` text NOT NULL /*Название точки продаж. */,
  `type` long NOT NULL,
  `address` long NOT NULL,
  `workingSchedule` long NOT NULL,
  `coords` text /*Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. */,
  `isMain` boolean /*Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. */,
  `shopOutletCode` text /*Идентификатор точки продаж, присвоенный магазином.*/,
  `visibility` long,
  `storagePeriod` long /*Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.*/
);  /*Информация о точке продаж.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OutletDTOPhones` generated from model 'OutletDTOPhones'

CREATE TABLE IF NOT EXISTS `OutletDTOPhones` (
  `outletDTO` long NOT NULL
  `phones` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OutletDTOOutletDeliveryRuleDTO` generated from model 'OutletDTOOutletDeliveryRuleDTO'

CREATE TABLE IF NOT EXISTS `OutletDTOOutletDeliveryRuleDTO` (
  `outletDTO` long NOT NULL
  `outletDeliveryRuleDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OutletDeliveryRuleDTO` generated from model 'outletDeliveryRuleDTO'
-- Информация об условиях доставки для данной точки продаж.
--

CREATE TABLE IF NOT EXISTS `OutletDeliveryRuleDTO` (
  `minDeliveryDays` int /*Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;. */,
  `maxDeliveryDays` int /*Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;. */,
  `deliveryServiceId` long /*Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */,
  `orderBefore` int UNSIGNED /*Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от &#x60;minDeliveryDays&#x60; до &#x60;maxDeliveryDays&#x60;.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от &#x60;minDeliveryDays&#x60; + 1 рабочий день до &#x60;maxDeliveryDays&#x60; + 1 рабочий день.  Значение по умолчанию: &#x60;24&#x60;. */,
  `priceFreePickup` decimal /*Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.*/,
  `unspecifiedDeliveryInterval` boolean /*Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * &#x60;true&#x60; — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением &#x60;true&#x60;.  Взаимоисключающий с параметрами &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;. */
);  /*Информация об условиях доставки для данной точки продаж.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OutletLicenseDTO` generated from model 'outletLicenseDTO'
-- Информация о лицензии.
--

CREATE TABLE IF NOT EXISTS `OutletLicenseDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;. */,
  `outletId` long /*Идентификатор точки продаж, для которой действительна лицензия.*/,
  `licenseType` long,
  `number` text /*Номер лицензии.*/,
  `dateOfIssue` datetime /*Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;. */,
  `dateOfExpiry` datetime /*Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;. */
);  /*Информация о лицензии.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OutletLicensesResponseDTO` generated from model 'outletLicensesResponseDTO'
-- Ответ на запрос информации о лицензиях для точек продаж.
--

CREATE TABLE IF NOT EXISTS `OutletLicensesResponseDTO` (
);  /*Ответ на запрос информации о лицензиях для точек продаж.*/

-- --------------------------------------------------------------------------
-- Table structure for table `OutletLicensesResponseDTOFullOutletLicenseDTO` generated from model 'OutletLicensesResponseDTOFullOutletLicenseDTO'

CREATE TABLE IF NOT EXISTS `OutletLicensesResponseDTOFullOutletLicenseDTO` (
  `outletLicensesResponseDTO` long NOT NULL
  `fullOutletLicenseDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OutletResponseDTO` generated from model 'outletResponseDTO'
-- Результат выполнения запроса. Выводится, если &#x60;status&#x3D;\&quot;OK\&quot;&#x60;. 
--

CREATE TABLE IF NOT EXISTS `OutletResponseDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор точки продаж, присвоенный Маркетом.*/
);  /*Результат выполнения запроса. Выводится, если &#x60;status&#x3D;\&quot;OK\&quot;&#x60;. */


-- --------------------------------------------------------------------------
-- Table structure for table `OutletWorkingScheduleDTO` generated from model 'outletWorkingScheduleDTO'
-- Список режимов работы точки продаж. 
--

CREATE TABLE IF NOT EXISTS `OutletWorkingScheduleDTO` (
  `workInHoliday` boolean /*Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников. */
);  /*Список режимов работы точки продаж. */

-- --------------------------------------------------------------------------
-- Table structure for table `OutletWorkingScheduleDTOOutletWorkingScheduleItemDTO` generated from model 'OutletWorkingScheduleDTOOutletWorkingScheduleItemDTO'

CREATE TABLE IF NOT EXISTS `OutletWorkingScheduleDTOOutletWorkingScheduleItemDTO` (
  `outletWorkingScheduleDTO` long NOT NULL
  `outletWorkingScheduleItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OutletWorkingScheduleItemDTO` generated from model 'outletWorkingScheduleItemDTO'
-- Расписание работы точки продаж.
--

CREATE TABLE IF NOT EXISTS `OutletWorkingScheduleItemDTO` (
  `startDay` long NOT NULL,
  `endDay` long NOT NULL,
  `startTime` text NOT NULL /*Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. */,
  `endTime` text NOT NULL /*Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. */
);  /*Расписание работы точки продаж.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PagedReturnsDTO` generated from model 'pagedReturnsDTO'
-- Возвраты.
--

CREATE TABLE IF NOT EXISTS `PagedReturnsDTO` (
  `paging` long
);  /*Возвраты.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PagedReturnsDTOReturnDTO` generated from model 'PagedReturnsDTOReturnDTO'

CREATE TABLE IF NOT EXISTS `PagedReturnsDTOReturnDTO` (
  `pagedReturnsDTO` long NOT NULL
  `returnDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PalletsCountDTO` generated from model 'palletsCountDTO'
-- Количество палет в отгрузке.
--

CREATE TABLE IF NOT EXISTS `PalletsCountDTO` (
  `planned` int /*Количество палет, которое заявил продавец.*/,
  `fact` int /*Количество палет, которое приняли в сортировочном центре.*/
);  /*Количество палет в отгрузке.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ParameterValueConstraintsDTO` generated from model 'parameterValueConstraintsDTO'
-- Ограничения на значения характеристик.
--

CREATE TABLE IF NOT EXISTS `ParameterValueConstraintsDTO` (
  `minValue` double /*Минимальное число.*/,
  `maxValue` double /*Максимальное число.*/,
  `maxLength` int /*Максимальная длина текста.*/
);  /*Ограничения на значения характеристик.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ParameterValueDTO` generated from model 'parameterValueDTO'
-- Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. 
--

CREATE TABLE IF NOT EXISTS `ParameterValueDTO` (
  `parameterId` long NOT NULL /*Идентификатор характеристики.*/,
  `unitId` long /*Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию.*/,
  `valueId` long /*Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;. */,
  `value` text /*Значение.*/
);  /*Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. */


-- --------------------------------------------------------------------------
-- Table structure for table `ParameterValueOptionDTO` generated from model 'parameterValueOptionDTO'
-- Значение характеристики.
--

CREATE TABLE IF NOT EXISTS `ParameterValueOptionDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор значения.*/,
  `value` text NOT NULL /*Значение.*/,
  `description` text /*Описание значения.*/
);  /*Значение характеристики.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ParcelBoxDTO` generated from model 'parcelBoxDTO'
-- Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
--

CREATE TABLE IF NOT EXISTS `ParcelBoxDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} */,
  `fulfilmentId` text /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} */
);  /*Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ParcelBoxLabelDTO` generated from model 'parcelBoxLabelDTO'
-- Информация о ярлыке для коробки.
--

CREATE TABLE IF NOT EXISTS `ParcelBoxLabelDTO` (
  `url` text NOT NULL /*Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). */,
  `supplierName` text NOT NULL /*Юридическое название магазина.*/,
  `deliveryServiceName` text NOT NULL /*Юридическое название службы доставки.*/,
  `orderId` long NOT NULL /*Идентификатор заказа в системе Маркета.*/,
  `orderNum` text NOT NULL /*Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина. */,
  `recipientName` text NOT NULL /*Фамилия и инициалы получателя заказа.*/,
  `boxId` long NOT NULL /*Идентификатор коробки.*/,
  `fulfilmentId` text NOT NULL /*Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д. */,
  `place` text NOT NULL /*Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;. */,
  `weight` text NOT NULL /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;. */,
  `deliveryServiceId` text NOT NULL /*Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).*/,
  `deliveryAddress` text /*Адрес получателя.*/,
  `shipmentDate` text /*Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.*/
);  /*Информация о ярлыке для коробки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ParcelDTO` generated from model 'parcelDTO'
-- Информация о грузовых местах в заказе.
--

CREATE TABLE IF NOT EXISTS `ParcelDTO` (
);  /*Информация о грузовых местах в заказе.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ParcelDTOParcelBoxDTO` generated from model 'ParcelDTOParcelBoxDTO'

CREATE TABLE IF NOT EXISTS `ParcelDTOParcelBoxDTO` (
  `parcelDTO` long NOT NULL
  `parcelBoxDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PartnerShipmentWarehouseDTO` generated from model 'partnerShipmentWarehouseDTO'
-- Данные о складе отправления.
--

CREATE TABLE IF NOT EXISTS `PartnerShipmentWarehouseDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор склада отправления.*/,
  `name` text /*Наименование склада отправления.*/,
  `address` text /*Адрес склада отправления.*/
);  /*Данные о складе отправления.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PickupAddressDTO` generated from model 'pickupAddressDTO'
-- Адрес доставки.
--

CREATE TABLE IF NOT EXISTS `PickupAddressDTO` (
  `country` text /*Страна.*/,
  `city` text /*Город.*/,
  `street` text /*Улица.*/,
  `house` text /*Номер дома.*/,
  `postcode` text /*Почтовый индекс.*/
);  /*Адрес доставки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PriceCompetitivenessThresholdsDTO` generated from model 'priceCompetitivenessThresholdsDTO'
-- Максимальные значения цены, при которых она является привлекательной или умеренной.
--

CREATE TABLE IF NOT EXISTS `PriceCompetitivenessThresholdsDTO` (
  `optimalPrice` long,
  `averagePrice` long
);  /*Максимальные значения цены, при которых она является привлекательной или умеренной.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PriceDTO` generated from model 'priceDTO'
-- Цена с указанием скидки, валюты и времени последнего обновления.
--

CREATE TABLE IF NOT EXISTS `PriceDTO` (
  `value` decimal /*Цена на товар.*/,
  `discountBase` decimal /*Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. */,
  `currencyId` long,
  `vat` int /*Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. */
);  /*Цена с указанием скидки, валюты и времени последнего обновления.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PriceQuarantineVerdictDTO` generated from model 'priceQuarantineVerdictDTO'
-- Причина попадания товара в карантин.
--

CREATE TABLE IF NOT EXISTS `PriceQuarantineVerdictDTO` (
  `type` long
);  /*Причина попадания товара в карантин.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PriceQuarantineVerdictDTOPriceQuarantineVerdictParameterDTO` generated from model 'PriceQuarantineVerdictDTOPriceQuarantineVerdictParameterDTO'

CREATE TABLE IF NOT EXISTS `PriceQuarantineVerdictDTOPriceQuarantineVerdictParameterDTO` (
  `priceQuarantineVerdictDTO` long NOT NULL
  `priceQuarantineVerdictParameterDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PriceQuarantineVerdictParameterDTO` generated from model 'priceQuarantineVerdictParameterDTO'
-- Параметр карантина.
--

CREATE TABLE IF NOT EXISTS `PriceQuarantineVerdictParameterDTO` (
  `name` long NOT NULL,
  `value` text NOT NULL /*Значение параметра.*/
);  /*Параметр карантина.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PriceRecommendationItemDTO` generated from model 'priceRecommendationItemDTO'
-- Рекомендованная цена.
--

CREATE TABLE IF NOT EXISTS `PriceRecommendationItemDTO` (
  `campaignId` long NOT NULL /*Идентификатор кампании.*/,
  `price` decimal NOT NULL /*Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) */
);  /*Рекомендованная цена.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PriceSuggestDTO` generated from model 'priceSuggestDTO'
-- Тип цены.
--

CREATE TABLE IF NOT EXISTS `PriceSuggestDTO` (
  `type` long,
  `price` decimal /*Цена в рублях.*/
);  /*Тип цены.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PriceSuggestOfferDTO` generated from model 'priceSuggestOfferDTO'
-- Товар с ценами для продвижения.
--

CREATE TABLE IF NOT EXISTS `PriceSuggestOfferDTO` (
  `marketSku` long /*SKU на Маркете.*/,
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
);  /*Товар с ценами для продвижения.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PriceSuggestOfferDTOPriceSuggestDTO` generated from model 'PriceSuggestOfferDTOPriceSuggestDTO'

CREATE TABLE IF NOT EXISTS `PriceSuggestOfferDTOPriceSuggestDTO` (
  `priceSuggestOfferDTO` long NOT NULL
  `priceSuggestDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromoOfferAutoParticipatingDetailsDTO` generated from model 'promoOfferAutoParticipatingDetailsDTO'
-- Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
--

CREATE TABLE IF NOT EXISTS `PromoOfferAutoParticipatingDetailsDTO` (
);  /*Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). */

-- --------------------------------------------------------------------------
-- Table structure for table `PromoOfferAutoParticipatingDetailsDTOCampaignIds` generated from model 'PromoOfferAutoParticipatingDetailsDTOCampaignIds'

CREATE TABLE IF NOT EXISTS `PromoOfferAutoParticipatingDetailsDTOCampaignIds` (
  `promoOfferAutoParticipatingDetailsDTO` long NOT NULL
  `campaignIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromoOfferDiscountParamsDTO` generated from model 'promoOfferDiscountParamsDTO'
-- Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
--

CREATE TABLE IF NOT EXISTS `PromoOfferDiscountParamsDTO` (
  `maxPromoPrice` long NOT NULL /*Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. */,
  `price` long /*Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. */,
  `promoPrice` long /*Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. */
);  /*Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PromoOfferParamsDTO` generated from model 'promoOfferParamsDTO'
-- Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
--

CREATE TABLE IF NOT EXISTS `PromoOfferParamsDTO` (
  `discountParams` long,
  `promocodeParams` long
);  /*Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. */


-- --------------------------------------------------------------------------
-- Table structure for table `PromoOfferPromocodeParamsDTO` generated from model 'promoOfferPromocodeParamsDTO'
-- Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
--

CREATE TABLE IF NOT EXISTS `PromoOfferPromocodeParamsDTO` (
  `maxPrice` long NOT NULL /*Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. */
);  /*Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PromoOfferUpdateWarningDTO` generated from model 'promoOfferUpdateWarningDTO'
-- Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
--

CREATE TABLE IF NOT EXISTS `PromoOfferUpdateWarningDTO` (
  `code` long NOT NULL,
);  /*Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PromoOfferUpdateWarningDTOCampaignIds` generated from model 'PromoOfferUpdateWarningDTOCampaignIds'

CREATE TABLE IF NOT EXISTS `PromoOfferUpdateWarningDTOCampaignIds` (
  `promoOfferUpdateWarningDTO` long NOT NULL
  `campaignIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromoPeriodDTO` generated from model 'promoPeriodDTO'
-- Время проведения акции.
--

CREATE TABLE IF NOT EXISTS `PromoPeriodDTO` (
  `dateTimeFrom` datetime NOT NULL /*Дата и время начала акции.*/,
  `dateTimeTo` datetime NOT NULL /*Дата и время окончания акции.*/
);  /*Время проведения акции.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ProvideOrderDigitalCodesRequest` generated from model 'provideOrderDigitalCodesRequest'
-- Запрос на передачу ключей цифровых товаров.
--

CREATE TABLE IF NOT EXISTS `ProvideOrderDigitalCodesRequest` (
);  /*Запрос на передачу ключей цифровых товаров.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProvideOrderDigitalCodesRequestOrderDigitalItemDTO` generated from model 'ProvideOrderDigitalCodesRequestOrderDigitalItemDTO'

CREATE TABLE IF NOT EXISTS `ProvideOrderDigitalCodesRequestOrderDigitalItemDTO` (
  `provideOrderDigitalCodesRequest` long NOT NULL
  `orderDigitalItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProvideOrderItemIdentifiersRequest` generated from model 'provideOrderItemIdentifiersRequest'
--

CREATE TABLE IF NOT EXISTS `ProvideOrderItemIdentifiersRequest` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ProvideOrderItemIdentifiersRequestOrderItemInstanceModificationDTO` generated from model 'ProvideOrderItemIdentifiersRequestOrderItemInstanceModificationDTO'

CREATE TABLE IF NOT EXISTS `ProvideOrderItemIdentifiersRequestOrderItemInstanceModificationDTO` (
  `provideOrderItemIdentifiersRequest` long NOT NULL
  `orderItemInstanceModificationDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProvideOrderItemIdentifiersResponse` generated from model 'provideOrderItemIdentifiersResponse'
--

CREATE TABLE IF NOT EXISTS `ProvideOrderItemIdentifiersResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PutSkuBidsRequest` generated from model 'putSkuBidsRequest'
-- description.
--

CREATE TABLE IF NOT EXISTS `PutSkuBidsRequest` (
);  /*description.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PutSkuBidsRequestSkuBidItemDTO` generated from model 'PutSkuBidsRequestSkuBidItemDTO'

CREATE TABLE IF NOT EXISTS `PutSkuBidsRequestSkuBidItemDTO` (
  `putSkuBidsRequest` long NOT NULL
  `skuBidItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `QualityRatingAffectedOrderDTO` generated from model 'qualityRatingAffectedOrderDTO'
-- Информация о заказе, который повлиял на индекс качества.
--

CREATE TABLE IF NOT EXISTS `QualityRatingAffectedOrderDTO` (
  `orderId` long UNSIGNED NOT NULL /*Идентификатор заказа.*/,
  `description` text NOT NULL /*Описание проблемы.*/,
  `componentType` long NOT NULL
);  /*Информация о заказе, который повлиял на индекс качества.*/


-- --------------------------------------------------------------------------
-- Table structure for table `QualityRatingComponentDTO` generated from model 'qualityRatingComponentDTO'
-- Составляющая индекса качества.
--

CREATE TABLE IF NOT EXISTS `QualityRatingComponentDTO` (
  `value` double NOT NULL /*Значение составляющей в процентах.*/,
  `componentType` long NOT NULL
);  /*Составляющая индекса качества.*/


-- --------------------------------------------------------------------------
-- Table structure for table `QualityRatingDTO` generated from model 'qualityRatingDTO'
-- Информация об индексе качества.
--

CREATE TABLE IF NOT EXISTS `QualityRatingDTO` (
  `rating` long UNSIGNED NOT NULL /*Значение индекса качества.*/,
  `calculationDate` date NOT NULL /*Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. */,
);  /*Информация об индексе качества.*/

-- --------------------------------------------------------------------------
-- Table structure for table `QualityRatingDTOQualityRatingComponentDTO` generated from model 'QualityRatingDTOQualityRatingComponentDTO'

CREATE TABLE IF NOT EXISTS `QualityRatingDTOQualityRatingComponentDTO` (
  `qualityRatingDTO` long NOT NULL
  `qualityRatingComponentDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `QualityRatingDetailsDTO` generated from model 'qualityRatingDetailsDTO'
-- Информация о заказах, которые повлияли на индекс качества.
--

CREATE TABLE IF NOT EXISTS `QualityRatingDetailsDTO` (
);  /*Информация о заказах, которые повлияли на индекс качества.*/

-- --------------------------------------------------------------------------
-- Table structure for table `QualityRatingDetailsDTOQualityRatingAffectedOrderDTO` generated from model 'QualityRatingDetailsDTOQualityRatingAffectedOrderDTO'

CREATE TABLE IF NOT EXISTS `QualityRatingDetailsDTOQualityRatingAffectedOrderDTO` (
  `qualityRatingDetailsDTO` long NOT NULL
  `qualityRatingAffectedOrderDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `QuantumDTO` generated from model 'quantumDTO'
-- Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} 
--

CREATE TABLE IF NOT EXISTS `QuantumDTO` (
  `minQuantity` int UNSIGNED /*Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. */,
  `stepQuantity` int UNSIGNED /*На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. */
);  /*Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} */


-- --------------------------------------------------------------------------
-- Table structure for table `QuarantineOfferDTO` generated from model 'quarantineOfferDTO'
-- Товар в карантине.
--

CREATE TABLE IF NOT EXISTS `QuarantineOfferDTO` (
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `currentPrice` long,
  `lastValidPrice` long,
);  /*Товар в карантине.*/

-- --------------------------------------------------------------------------
-- Table structure for table `QuarantineOfferDTOPriceQuarantineVerdictDTO` generated from model 'QuarantineOfferDTOPriceQuarantineVerdictDTO'

CREATE TABLE IF NOT EXISTS `QuarantineOfferDTOPriceQuarantineVerdictDTO` (
  `quarantineOfferDTO` long NOT NULL
  `priceQuarantineVerdictDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RegionDTO` generated from model 'regionDTO'
-- Регион доставки.
--

CREATE TABLE IF NOT EXISTS `RegionDTO` (
  `name` text NOT NULL /*Название региона.*/,
  `type` long NOT NULL,
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор региона.*/,
  `parent` long,
);  /*Регион доставки.*/

-- --------------------------------------------------------------------------
-- Table structure for table `RegionDTORegionDTO` generated from model 'RegionDTORegionDTO'

CREATE TABLE IF NOT EXISTS `RegionDTORegionDTO` (
  `regionDTO` long NOT NULL
  `regionDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RegionalModelInfoDTO` generated from model 'regionalModelInfoDTO'
-- Региональная информация.
--

CREATE TABLE IF NOT EXISTS `RegionalModelInfoDTO` (
  `currency` long,
  `regionId` long /*Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). */
);  /*Региональная информация.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RejectedPromoOfferDeleteDTO` generated from model 'rejectedPromoOfferDeleteDTO'
-- Информация о товаре и ошибки, которые появились при его удалении.
--

CREATE TABLE IF NOT EXISTS `RejectedPromoOfferDeleteDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `reason` long NOT NULL
);  /*Информация о товаре и ошибки, которые появились при его удалении.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RejectedPromoOfferUpdateDTO` generated from model 'rejectedPromoOfferUpdateDTO'
-- Описание отклоненного изменения.
--

CREATE TABLE IF NOT EXISTS `RejectedPromoOfferUpdateDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `reason` long NOT NULL
);  /*Описание отклоненного изменения.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ReportInfoDTO` generated from model 'reportInfoDTO'
-- Статус генерации и ссылка на готовый отчет.
--

CREATE TABLE IF NOT EXISTS `ReportInfoDTO` (
  `status` long NOT NULL,
  `generationRequestedAt` datetime NOT NULL /*Дата и время запроса на генерацию.*/,
  `subStatus` long,
  `generationFinishedAt` datetime /*Дата и время завершения генерации.*/,
  `file` text /*Ссылка на готовый отчет.*/,
  `estimatedGenerationTime` long /*Ожидаемая продолжительность генерации в миллисекундах.*/
);  /*Статус генерации и ссылка на готовый отчет.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ReturnDTO` generated from model 'returnDTO'
-- Возврат заказа.
--

CREATE TABLE IF NOT EXISTS `ReturnDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор возврата.*/,
  `orderId` long /*Номер заказа.*/,
  `creationDate` datetime /*Дата создания возврата клиентом.*/,
  `updateDate` datetime /*Дата обновления возврата.*/,
  `refundStatus` long,
  `logisticPickupPoint` long,
  `shipmentRecipientType` long,
  `shipmentStatus` long,
  `refundAmount` long /*Сумма возврата.*/,
  `returnType` long,
  `fastReturn` boolean /*Используется ли опция **Быстрый возврат денег за дешевый брак**. */
);  /*Возврат заказа.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ReturnDTOReturnItemDTO` generated from model 'ReturnDTOReturnItemDTO'

CREATE TABLE IF NOT EXISTS `ReturnDTOReturnItemDTO` (
  `returnDTO` long NOT NULL
  `returnItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ReturnDecisionDTO` generated from model 'returnDecisionDTO'
-- Решения по возвратам.
--

CREATE TABLE IF NOT EXISTS `ReturnDecisionDTO` (
  `returnItemId` long /*Идентификатор товара в возврате.*/,
  `count` int /*Количество единиц товара.*/,
  `comment` text /*Комментарий.*/,
  `reasonType` long,
  `subreasonType` long,
  `decisionType` long,
  `refundAmount` long /*Сумма возврата.*/,
  `partnerCompensation` long /*Компенсация за обратную доставку.*/,
);  /*Решения по возвратам.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ReturnDecisionDTOImages` generated from model 'ReturnDecisionDTOImages'

CREATE TABLE IF NOT EXISTS `ReturnDecisionDTOImages` (
  `returnDecisionDTO` long NOT NULL
  `images` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ReturnInstanceDTO` generated from model 'returnInstanceDTO'
-- Логистическая информация по возврату.
--

CREATE TABLE IF NOT EXISTS `ReturnInstanceDTO` (
  `stockType` long,
  `status` long,
  `cis` text /*Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).*/,
  `imei` text /*Международный идентификатор мобильного оборудования.*/
);  /*Логистическая информация по возврату.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ReturnItemDTO` generated from model 'returnItemDTO'
-- Список товаров в возврате.
--

CREATE TABLE IF NOT EXISTS `ReturnItemDTO` (
  `shopSku` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `count` long NOT NULL /*Количество единиц товара.*/,
  `marketSku` long /*SKU на Маркете.*/,
);  /*Список товаров в возврате.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ReturnItemDTOReturnDecisionDTO` generated from model 'ReturnItemDTOReturnDecisionDTO'

CREATE TABLE IF NOT EXISTS `ReturnItemDTOReturnDecisionDTO` (
  `returnItemDTO` long NOT NULL
  `returnDecisionDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ReturnItemDTOReturnInstanceDTO` generated from model 'ReturnItemDTOReturnInstanceDTO'

CREATE TABLE IF NOT EXISTS `ReturnItemDTOReturnInstanceDTO` (
  `returnItemDTO` long NOT NULL
  `returnInstanceDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ReturnItemDTOTrackDTO` generated from model 'ReturnItemDTOTrackDTO'

CREATE TABLE IF NOT EXISTS `ReturnItemDTOTrackDTO` (
  `returnItemDTO` long NOT NULL
  `trackDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ScrollingPagerDTO` generated from model 'scrollingPagerDTO'
-- Информация о страницах результатов.
--

CREATE TABLE IF NOT EXISTS `ScrollingPagerDTO` (
  `nextPageToken` text /*Идентификатор следующей страницы результатов.*/,
  `prevPageToken` text /*Идентификатор предыдущей страницы результатов.*/
);  /*Информация о страницах результатов.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SearchModelsResponse` generated from model 'searchModelsResponse'
--

CREATE TABLE IF NOT EXISTS `SearchModelsResponse` (
  `currency` long,
  `regionId` long /*Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). */,
  `pager` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SearchModelsResponseModelDTO` generated from model 'SearchModelsResponseModelDTO'

CREATE TABLE IF NOT EXISTS `SearchModelsResponseModelDTO` (
  `searchModelsResponse` long NOT NULL
  `modelDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SearchShipmentsRequest` generated from model 'searchShipmentsRequest'
-- Запрос информации об отгрузках.
--

CREATE TABLE IF NOT EXISTS `SearchShipmentsRequest` (
  `dateFrom` date NOT NULL /*Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */,
  `dateTo` date NOT NULL /*Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. */,
  `cancelledOrders` boolean /*Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. */
);  /*Запрос информации об отгрузках.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SearchShipmentsRequestShipmentStatusType` generated from model 'SearchShipmentsRequestShipmentStatusType'

CREATE TABLE IF NOT EXISTS `SearchShipmentsRequestShipmentStatusType` (
  `searchShipmentsRequest` long NOT NULL
  `shipmentStatusType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `SearchShipmentsRequestOrderIds` generated from model 'SearchShipmentsRequestOrderIds'

CREATE TABLE IF NOT EXISTS `SearchShipmentsRequestOrderIds` (
  `searchShipmentsRequest` long NOT NULL
  `orderIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SearchShipmentsResponse` generated from model 'searchShipmentsResponse'
-- Ответ на запрос информации об отгрузках.
--

CREATE TABLE IF NOT EXISTS `SearchShipmentsResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос информации об отгрузках.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SearchShipmentsResponseDTO` generated from model 'searchShipmentsResponseDTO'
-- Информация об отгрузках.
--

CREATE TABLE IF NOT EXISTS `SearchShipmentsResponseDTO` (
  `paging` long
);  /*Информация об отгрузках.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SearchShipmentsResponseDTOShipmentInfoDTO` generated from model 'SearchShipmentsResponseDTOShipmentInfoDTO'

CREATE TABLE IF NOT EXISTS `SearchShipmentsResponseDTOShipmentInfoDTO` (
  `searchShipmentsResponseDTO` long NOT NULL
  `shipmentInfoDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SendMessageToChatRequest` generated from model 'sendMessageToChatRequest'
-- В какой чат нужно отправить сообщение и текст сообщения.
--

CREATE TABLE IF NOT EXISTS `SendMessageToChatRequest` (
  `message` text NOT NULL /*Текст сообщения. Максимальная длина — 4096 символа.*/
);  /*В какой чат нужно отправить сообщение и текст сообщения.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SetFeedParamsRequest` generated from model 'setFeedParamsRequest'
-- Запрос на обновление изменение параметров прайс-листа.
--

CREATE TABLE IF NOT EXISTS `SetFeedParamsRequest` (
);  /*Запрос на обновление изменение параметров прайс-листа.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SetFeedParamsRequestFeedParameterDTO` generated from model 'SetFeedParamsRequestFeedParameterDTO'

CREATE TABLE IF NOT EXISTS `SetFeedParamsRequestFeedParameterDTO` (
  `setFeedParamsRequest` long NOT NULL
  `feedParameterDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SetOrderBoxLayoutRequest` generated from model 'setOrderBoxLayoutRequest'
--

CREATE TABLE IF NOT EXISTS `SetOrderBoxLayoutRequest` (
  `allowRemove` boolean /*Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SetOrderBoxLayoutRequestOrderBoxLayoutDTO` generated from model 'SetOrderBoxLayoutRequestOrderBoxLayoutDTO'

CREATE TABLE IF NOT EXISTS `SetOrderBoxLayoutRequestOrderBoxLayoutDTO` (
  `setOrderBoxLayoutRequest` long NOT NULL
  `orderBoxLayoutDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SetOrderBoxLayoutResponse` generated from model 'setOrderBoxLayoutResponse'
--

CREATE TABLE IF NOT EXISTS `SetOrderBoxLayoutResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SetOrderDeliveryDateRequest` generated from model 'setOrderDeliveryDateRequest'
--

CREATE TABLE IF NOT EXISTS `SetOrderDeliveryDateRequest` (
  `dates` long NOT NULL,
  `reason` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SetOrderDeliveryTrackCodeRequest` generated from model 'setOrderDeliveryTrackCodeRequest'
--

CREATE TABLE IF NOT EXISTS `SetOrderDeliveryTrackCodeRequest` (
  `trackCode` text NOT NULL /*Трек‑номер посылки.*/,
  `deliveryServiceId` long NOT NULL /*Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SetOrderShipmentBoxesRequest` generated from model 'setOrderShipmentBoxesRequest'
--

CREATE TABLE IF NOT EXISTS `SetOrderShipmentBoxesRequest` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SetOrderShipmentBoxesRequestParcelBoxDTO` generated from model 'SetOrderShipmentBoxesRequestParcelBoxDTO'

CREATE TABLE IF NOT EXISTS `SetOrderShipmentBoxesRequestParcelBoxDTO` (
  `setOrderShipmentBoxesRequest` long NOT NULL
  `parcelBoxDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SetOrderShipmentBoxesResponse` generated from model 'setOrderShipmentBoxesResponse'
--

CREATE TABLE IF NOT EXISTS `SetOrderShipmentBoxesResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SetReturnDecisionRequest` generated from model 'setReturnDecisionRequest'
-- Решения по позиции в возврате.
--

CREATE TABLE IF NOT EXISTS `SetReturnDecisionRequest` (
  `returnItemId` long NOT NULL /*Идентификатор товара в возврате.*/,
  `decisionType` long NOT NULL,
  `comment` text /*Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете. */
);  /*Решения по позиции в возврате.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SetShipmentPalletsCountRequest` generated from model 'setShipmentPalletsCountRequest'
-- Запрос на передачу количества упаковок в отгрузке.
--

CREATE TABLE IF NOT EXISTS `SetShipmentPalletsCountRequest` (
  `placesCount` int UNSIGNED NOT NULL /*Количество упаковок в отгрузке.*/
);  /*Запрос на передачу количества упаковок в отгрузке.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ShipmentBoxesDTO` generated from model 'shipmentBoxesDTO'
-- В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
--

CREATE TABLE IF NOT EXISTS `ShipmentBoxesDTO` (
);  /*В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. */

-- --------------------------------------------------------------------------
-- Table structure for table `ShipmentBoxesDTOParcelBoxDTO` generated from model 'ShipmentBoxesDTOParcelBoxDTO'

CREATE TABLE IF NOT EXISTS `ShipmentBoxesDTOParcelBoxDTO` (
  `shipmentBoxesDTO` long NOT NULL
  `parcelBoxDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ShipmentDTO` generated from model 'shipmentDTO'
-- Информация об отгрузке.
--

CREATE TABLE IF NOT EXISTS `ShipmentDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор отгрузки.*/,
  `planIntervalFrom` datetime /*Начало планового интервала отгрузки.*/,
  `planIntervalTo` datetime /*Конец планового интервала отгрузки.*/,
  `shipmentType` long,
  `warehouse` long,
  `warehouseTo` long,
  `externalId` text /*Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.*/,
  `deliveryService` long,
  `palletsCount` long,
  `draftCount` int /*Количество заказов, которое Маркет запланировал к отгрузке.*/,
  `plannedCount` int /*Количество заказов, которое Маркет подтвердил к отгрузке.*/,
  `factCount` int /*Количество заказов, принятых в сортировочном центре или пункте приема.*/,
  `currentStatus` long
);  /*Информация об отгрузке.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ShipmentDTOOrderIds` generated from model 'ShipmentDTOOrderIds'

CREATE TABLE IF NOT EXISTS `ShipmentDTOOrderIds` (
  `shipmentDTO` long NOT NULL
  `orderIds` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ShipmentDTOShipmentActionType` generated from model 'ShipmentDTOShipmentActionType'

CREATE TABLE IF NOT EXISTS `ShipmentDTOShipmentActionType` (
  `shipmentDTO` long NOT NULL
  `shipmentActionType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ShipmentInfoDTO` generated from model 'shipmentInfoDTO'
-- Список с информацией об отгрузках.
--

CREATE TABLE IF NOT EXISTS `ShipmentInfoDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор отгрузки.*/,
  `planIntervalFrom` datetime /*Начало планового интервала отгрузки.*/,
  `planIntervalTo` datetime /*Конец планового интервала отгрузки.*/,
  `shipmentType` long,
  `warehouse` long,
  `warehouseTo` long,
  `externalId` text /*Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.*/,
  `deliveryService` long,
  `palletsCount` long,
  `draftCount` int /*Количество заказов, которое Маркет запланировал к отгрузке.*/,
  `plannedCount` int /*Количество заказов, которое Маркет подтвердил к отгрузке.*/,
  `factCount` int /*Количество заказов, принятых в сортировочном центре или пункте приема.*/,
  `status` long,
  `statusDescription` text /*Описание статуса отгрузки.*/,
  `statusUpdateTime` datetime /*Время последнего изменения статуса отгрузки.*/
);  /*Список с информацией об отгрузках.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ShipmentInfoDTOOrderIds` generated from model 'ShipmentInfoDTOOrderIds'

CREATE TABLE IF NOT EXISTS `ShipmentInfoDTOOrderIds` (
  `shipmentInfoDTO` long NOT NULL
  `orderIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ShipmentStatusChangeDTO` generated from model 'shipmentStatusChangeDTO'
-- Статус отгрузки.
--

CREATE TABLE IF NOT EXISTS `ShipmentStatusChangeDTO` (
  `status` long,
  `description` text /*Описание статуса отгрузки.*/,
  `updateTime` datetime /*Время последнего изменения статуса отгрузки.*/
);  /*Статус отгрузки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SkipGoodsFeedbackReactionRequest` generated from model 'skipGoodsFeedbackReactionRequest'
-- Идентификаторы отзывов.
--

CREATE TABLE IF NOT EXISTS `SkipGoodsFeedbackReactionRequest` (
);  /*Идентификаторы отзывов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SkipGoodsFeedbackReactionRequestFeedbackIds` generated from model 'SkipGoodsFeedbackReactionRequestFeedbackIds'

CREATE TABLE IF NOT EXISTS `SkipGoodsFeedbackReactionRequestFeedbackIds` (
  `skipGoodsFeedbackReactionRequest` long NOT NULL
  `feedbackIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SkuBidItemDTO` generated from model 'skuBidItemDTO'
-- Список товаров и ставок на них.
--

CREATE TABLE IF NOT EXISTS `SkuBidItemDTO` (
  `sku` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `bid` int UNSIGNED NOT NULL /*Значение ставки.*/
);  /*Список товаров и ставок на них.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SkuBidRecommendationItemDTO` generated from model 'skuBidRecommendationItemDTO'
-- Список товаров с рекомендованными ставками.
--

CREATE TABLE IF NOT EXISTS `SkuBidRecommendationItemDTO` (
  `sku` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `bid` int UNSIGNED NOT NULL /*Значение ставки.*/,
);  /*Список товаров с рекомендованными ставками.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SkuBidRecommendationItemDTOBidRecommendationItemDTO` generated from model 'SkuBidRecommendationItemDTOBidRecommendationItemDTO'

CREATE TABLE IF NOT EXISTS `SkuBidRecommendationItemDTOBidRecommendationItemDTO` (
  `skuBidRecommendationItemDTO` long NOT NULL
  `bidRecommendationItemDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `SkuBidRecommendationItemDTOPriceRecommendationItemDTO` generated from model 'SkuBidRecommendationItemDTOPriceRecommendationItemDTO'

CREATE TABLE IF NOT EXISTS `SkuBidRecommendationItemDTOPriceRecommendationItemDTO` (
  `skuBidRecommendationItemDTO` long NOT NULL
  `priceRecommendationItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SuggestOfferPriceDTO` generated from model 'suggestOfferPriceDTO'
-- Товар, для которого требуется получить цены для продвижения.
--

CREATE TABLE IF NOT EXISTS `SuggestOfferPriceDTO` (
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `marketSku` long /*SKU на Маркете.*/
);  /*Товар, для которого требуется получить цены для продвижения.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SuggestPricesRequest` generated from model 'suggestPricesRequest'
-- Запрос на получение списка цен для продвижения.
--

CREATE TABLE IF NOT EXISTS `SuggestPricesRequest` (
);  /*Запрос на получение списка цен для продвижения.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SuggestPricesRequestSuggestOfferPriceDTO` generated from model 'SuggestPricesRequestSuggestOfferPriceDTO'

CREATE TABLE IF NOT EXISTS `SuggestPricesRequestSuggestOfferPriceDTO` (
  `suggestPricesRequest` long NOT NULL
  `suggestOfferPriceDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SuggestPricesResponse` generated from model 'suggestPricesResponse'
-- Ответ на запрос списка цен для продвижения.
--

CREATE TABLE IF NOT EXISTS `SuggestPricesResponse` (
  `status` long,
  `result` long
);  /*Ответ на запрос списка цен для продвижения.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SuggestPricesResultDTO` generated from model 'suggestPricesResultDTO'
-- Результат запроса цен для продвижения.
--

CREATE TABLE IF NOT EXISTS `SuggestPricesResultDTO` (
);  /*Результат запроса цен для продвижения.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SuggestPricesResultDTOPriceSuggestOfferDTO` generated from model 'SuggestPricesResultDTOPriceSuggestOfferDTO'

CREATE TABLE IF NOT EXISTS `SuggestPricesResultDTOPriceSuggestOfferDTO` (
  `suggestPricesResultDTO` long NOT NULL
  `priceSuggestOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SuggestedOfferDTO` generated from model 'suggestedOfferDTO'
-- Информация о товаре.
--

CREATE TABLE IF NOT EXISTS `SuggestedOfferDTO` (
  `offerId` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `name` text /*Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) */,
  `category` text /*Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. */,
  `vendor` text /*Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.*/,
  `description` text /*Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) */,
  `vendorCode` text /*Артикул товара от производителя.*/,
  `basicPrice` long
);  /*Информация о товаре.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SuggestedOfferDTOBarcodes` generated from model 'SuggestedOfferDTOBarcodes'

CREATE TABLE IF NOT EXISTS `SuggestedOfferDTOBarcodes` (
  `suggestedOfferDTO` long NOT NULL
  `barcodes` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SuggestedOfferMappingDTO` generated from model 'suggestedOfferMappingDTO'
-- Товар с соответствующей карточкой на Маркете.
--

CREATE TABLE IF NOT EXISTS `SuggestedOfferMappingDTO` (
  `offer` long,
  `mapping` long
);  /*Товар с соответствующей карточкой на Маркете.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TariffDTO` generated from model 'tariffDTO'
-- Информация о тарифах, по которым нужно заплатить за услуги Маркета.
--

CREATE TABLE IF NOT EXISTS `TariffDTO` (
  `type` long NOT NULL,
  `amount` decimal NOT NULL /*Значение тарифа в рублях.*/,
  `percent` decimal /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. */
);  /*Информация о тарифах, по которым нужно заплатить за услуги Маркета.*/

-- --------------------------------------------------------------------------
-- Table structure for table `TariffDTOTariffParameterDTO` generated from model 'TariffDTOTariffParameterDTO'

CREATE TABLE IF NOT EXISTS `TariffDTOTariffParameterDTO` (
  `tariffDTO` long NOT NULL
  `tariffParameterDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TariffParameterDTO` generated from model 'tariffParameterDTO'
-- Детали расчета конкретной услуги Маркета.
--

CREATE TABLE IF NOT EXISTS `TariffParameterDTO` (
  `name` text NOT NULL /*Название параметра.*/,
  `value` text NOT NULL /*Значение параметра.*/
);  /*Детали расчета конкретной услуги Маркета.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TimePeriodDTO` generated from model 'timePeriodDTO'
-- Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
--

CREATE TABLE IF NOT EXISTS `TimePeriodDTO` (
  `timePeriod` int NOT NULL /*Продолжительность в указанных единицах.*/,
  `timeUnit` long NOT NULL,
  `comment` text /*Комментарий.*/
);  /*Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrackDTO` generated from model 'trackDTO'
-- Информация о трек-номерах.
--

CREATE TABLE IF NOT EXISTS `TrackDTO` (
  `trackCode` text /*Трек-код почтового отправления.*/
);  /*Информация о трек-номерах.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TransferOrdersFromShipmentRequest` generated from model 'transferOrdersFromShipmentRequest'
-- Запрос переноса заказов из отгрузки.
--

CREATE TABLE IF NOT EXISTS `TransferOrdersFromShipmentRequest` (
);  /*Запрос переноса заказов из отгрузки.*/

-- --------------------------------------------------------------------------
-- Table structure for table `TransferOrdersFromShipmentRequestOrderIds` generated from model 'TransferOrdersFromShipmentRequestOrderIds'

CREATE TABLE IF NOT EXISTS `TransferOrdersFromShipmentRequestOrderIds` (
  `transferOrdersFromShipmentRequest` long NOT NULL
  `orderIds` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TurnoverDTO` generated from model 'turnoverDTO'
-- Информация об оборачиваемости товара.
--

CREATE TABLE IF NOT EXISTS `TurnoverDTO` (
  `turnover` long NOT NULL,
  `turnoverDays` double /*Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)*/
);  /*Информация об оборачиваемости товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UnitDTO` generated from model 'unitDTO'
-- Единица измерения.
--

CREATE TABLE IF NOT EXISTS `UnitDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор единицы измерения.*/,
  `name` text NOT NULL /*Сокращенное название единицы измерения.*/,
  `fullName` text NOT NULL /*Полное название единицы измерения.*/
);  /*Единица измерения.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateBusinessOfferPriceDTO` generated from model 'updateBusinessOfferPriceDTO'
-- Товар с новой ценой.
--

CREATE TABLE IF NOT EXISTS `UpdateBusinessOfferPriceDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `price` long NOT NULL
);  /*Товар с новой ценой.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateBusinessPricesRequest` generated from model 'updateBusinessPricesRequest'
-- Запрос на установку базовых цен на товары.
--

CREATE TABLE IF NOT EXISTS `UpdateBusinessPricesRequest` (
);  /*Запрос на установку базовых цен на товары.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateBusinessPricesRequestUpdateBusinessOfferPriceDTO` generated from model 'UpdateBusinessPricesRequestUpdateBusinessOfferPriceDTO'

CREATE TABLE IF NOT EXISTS `UpdateBusinessPricesRequestUpdateBusinessOfferPriceDTO` (
  `updateBusinessPricesRequest` long NOT NULL
  `updateBusinessOfferPriceDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateCampaignOfferDTO` generated from model 'updateCampaignOfferDTO'
-- Параметры размещения товара в магазине.
--

CREATE TABLE IF NOT EXISTS `UpdateCampaignOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `quantum` long,
  `available` boolean /*Есть ли товар в продаже. */,
  `vat` int /*Ставка НДС, применяемая для товара. Задается цифрой:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. */
);  /*Параметры размещения товара в магазине.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateCampaignOffersRequest` generated from model 'updateCampaignOffersRequest'
-- Запрос на обновление предложений товаров магазина.
--

CREATE TABLE IF NOT EXISTS `UpdateCampaignOffersRequest` (
);  /*Запрос на обновление предложений товаров магазина.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateCampaignOffersRequestUpdateCampaignOfferDTO` generated from model 'UpdateCampaignOffersRequestUpdateCampaignOfferDTO'

CREATE TABLE IF NOT EXISTS `UpdateCampaignOffersRequestUpdateCampaignOfferDTO` (
  `updateCampaignOffersRequest` long NOT NULL
  `updateCampaignOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateGoodsFeedbackCommentDTO` generated from model 'updateGoodsFeedbackCommentDTO'
-- Комментарий к отзыву или другому комментарию.
--

CREATE TABLE IF NOT EXISTS `UpdateGoodsFeedbackCommentDTO` (
  `text` text NOT NULL /*Текст комментария.*/,
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор комментария к отзыву. */,
  `parentId` long /*Идентификатор комментария к отзыву. */
);  /*Комментарий к отзыву или другому комментарию.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateGoodsFeedbackCommentRequest` generated from model 'updateGoodsFeedbackCommentRequest'
-- Комментарий к отзыву.
--

CREATE TABLE IF NOT EXISTS `UpdateGoodsFeedbackCommentRequest` (
  `feedbackId` long NOT NULL /*Идентификатор отзыва. */,
  `comment` long NOT NULL
);  /*Комментарий к отзыву.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateGoodsFeedbackCommentResponse` generated from model 'updateGoodsFeedbackCommentResponse'
--

CREATE TABLE IF NOT EXISTS `UpdateGoodsFeedbackCommentResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMappingDTO` generated from model 'updateMappingDTO'
-- Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
--

CREATE TABLE IF NOT EXISTS `UpdateMappingDTO` (
  `marketSku` long /*SKU на Маркете.*/
);  /*Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. */


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMappingsOfferDTO` generated from model 'updateMappingsOfferDTO'
-- Информация о товарах в каталоге.
--

CREATE TABLE IF NOT EXISTS `UpdateMappingsOfferDTO` (
  `name` text /*Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) */,
  `shopSku` text /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `category` text /*Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. */,
  `vendor` text /*Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.*/,
  `vendorCode` text /*Артикул товара от производителя.*/,
  `description` text /*Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) */,
  `id` text PRIMARY KEY /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `feedId` long /*Идентификатор фида.*/,
  `manufacturer` text /*Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. */,
  `minShipment` int /*Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. */,
  `transportUnitSize` int /*Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. */,
  `quantumOfSupply` int /*Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. */,
  `deliveryDurationDays` int /*Срок, за который продавец поставляет товары на склад, в днях.*/,
  `boxCount` int /*Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. */,
  `weightDimensions` long,
  `shelfLifeDays` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. */,
  `lifeTimeDays` int /*{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. */,
  `guaranteePeriodDays` int /*Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. */,
  `processingState` long,
  `availability` long,
  `shelfLife` long,
  `lifeTime` long,
  `guaranteePeriod` long,
  `certificate` text /*Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) */
);  /*Информация о товарах в каталоге.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMappingsOfferDTOBarcodes` generated from model 'UpdateMappingsOfferDTOBarcodes'

CREATE TABLE IF NOT EXISTS `UpdateMappingsOfferDTOBarcodes` (
  `updateMappingsOfferDTO` long NOT NULL
  `barcodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMappingsOfferDTOUrls` generated from model 'UpdateMappingsOfferDTOUrls'

CREATE TABLE IF NOT EXISTS `UpdateMappingsOfferDTOUrls` (
  `updateMappingsOfferDTO` long NOT NULL
  `urls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMappingsOfferDTOPictures` generated from model 'UpdateMappingsOfferDTOPictures'

CREATE TABLE IF NOT EXISTS `UpdateMappingsOfferDTOPictures` (
  `updateMappingsOfferDTO` long NOT NULL
  `pictures` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMappingsOfferDTOManufacturerCountries` generated from model 'UpdateMappingsOfferDTOManufacturerCountries'

CREATE TABLE IF NOT EXISTS `UpdateMappingsOfferDTOManufacturerCountries` (
  `updateMappingsOfferDTO` long NOT NULL
  `manufacturerCountries` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMappingsOfferDTOCustomsCommodityCodes` generated from model 'UpdateMappingsOfferDTOCustomsCommodityCodes'

CREATE TABLE IF NOT EXISTS `UpdateMappingsOfferDTOCustomsCommodityCodes` (
  `updateMappingsOfferDTO` long NOT NULL
  `customsCommodityCodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMappingsOfferDTODayOfWeekType` generated from model 'UpdateMappingsOfferDTODayOfWeekType'

CREATE TABLE IF NOT EXISTS `UpdateMappingsOfferDTODayOfWeekType` (
  `updateMappingsOfferDTO` long NOT NULL
  `dayOfWeekType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferContentRequest` generated from model 'updateOfferContentRequest'
-- Запрос на установку новых значений для параметров.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferContentRequest` (
);  /*Запрос на установку новых значений для параметров.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferContentRequestOfferContentDTO` generated from model 'UpdateOfferContentRequestOfferContentDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferContentRequestOfferContentDTO` (
  `updateOfferContentRequest` long NOT NULL
  `offerContentDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferContentResponse` generated from model 'updateOfferContentResponse'
-- Описывает проблемы, которые появились при сохранении товара.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferContentResponse` (
  `status` long,
);  /*Описывает проблемы, которые появились при сохранении товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferContentResponseUpdateOfferContentResultDTO` generated from model 'UpdateOfferContentResponseUpdateOfferContentResultDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferContentResponseUpdateOfferContentResultDTO` (
  `updateOfferContentResponse` long NOT NULL
  `updateOfferContentResultDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferContentResultDTO` generated from model 'updateOfferContentResultDTO'
-- Ошибки и предупреждения, которые появились из-за переданных характеристик.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferContentResultDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
);  /*Ошибки и предупреждения, которые появились из-за переданных характеристик.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferContentResultDTOOfferContentErrorDTO` generated from model 'UpdateOfferContentResultDTOOfferContentErrorDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferContentResultDTOOfferContentErrorDTO` (
  `updateOfferContentResultDTO` long NOT NULL
  `offerContentErrorDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferContentResultDTOOfferContentErrorDTO` generated from model 'UpdateOfferContentResultDTOOfferContentErrorDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferContentResultDTOOfferContentErrorDTO` (
  `updateOfferContentResultDTO` long NOT NULL
  `offerContentErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTO` generated from model 'updateOfferDTO'
-- Параметры товара.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `name` text /*Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) */,
  `marketCategoryId` long /*Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). */,
  `category` text /*Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. */,
  `vendor` text /*Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.*/,
  `description` text /*Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) */,
  `weightDimensions` long,
  `vendorCode` text /*Артикул товара от производителя.*/,
  `shelfLife` long,
  `lifeTime` long,
  `guaranteePeriod` long,
  `customsCommodityCode` text /*Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. */,
  `boxCount` int /*Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. */,
  `condition` long,
  `type` long,
  `downloadable` boolean /*Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) */,
  `adult` boolean /*Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. */,
  `age` long,
  `basicPrice` long,
  `purchasePrice` long,
  `additionalExpenses` long,
  `cofinancePrice` long
);  /*Параметры товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOPictures` generated from model 'UpdateOfferDTOPictures'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOPictures` (
  `updateOfferDTO` long NOT NULL
  `pictures` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOVideos` generated from model 'UpdateOfferDTOVideos'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOVideos` (
  `updateOfferDTO` long NOT NULL
  `videos` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOOfferManualDTO` generated from model 'UpdateOfferDTOOfferManualDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOOfferManualDTO` (
  `updateOfferDTO` long NOT NULL
  `offerManualDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOBarcodes` generated from model 'UpdateOfferDTOBarcodes'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOBarcodes` (
  `updateOfferDTO` long NOT NULL
  `barcodes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOManufacturerCountries` generated from model 'UpdateOfferDTOManufacturerCountries'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOManufacturerCountries` (
  `updateOfferDTO` long NOT NULL
  `manufacturerCountries` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOTags` generated from model 'UpdateOfferDTOTags'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOTags` (
  `updateOfferDTO` long NOT NULL
  `tags` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOCertificates` generated from model 'UpdateOfferDTOCertificates'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOCertificates` (
  `updateOfferDTO` long NOT NULL
  `certificates` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOOfferParamDTO` generated from model 'UpdateOfferDTOOfferParamDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOOfferParamDTO` (
  `updateOfferDTO` long NOT NULL
  `offerParamDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferDTOParameterValueDTO` generated from model 'UpdateOfferDTOParameterValueDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferDTOParameterValueDTO` (
  `updateOfferDTO` long NOT NULL
  `parameterValueDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingDTO` generated from model 'updateOfferMappingDTO'
-- Информация о товаре.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingDTO` (
  `offer` long NOT NULL,
  `mapping` long
);  /*Информация о товаре.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingEntryDTO` generated from model 'updateOfferMappingEntryDTO'
-- Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingEntryDTO` (
  `mapping` long,
  `awaitingModerationMapping` long,
  `rejectedMapping` long,
  `offer` long
);  /*Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. */


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingEntryRequest` generated from model 'updateOfferMappingEntryRequest'
-- Запрос на обновление товаров.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingEntryRequest` (
);  /*Запрос на обновление товаров.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingEntryRequestUpdateOfferMappingEntryDTO` generated from model 'UpdateOfferMappingEntryRequestUpdateOfferMappingEntryDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingEntryRequestUpdateOfferMappingEntryDTO` (
  `updateOfferMappingEntryRequest` long NOT NULL
  `updateOfferMappingEntryDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingResultDTO` generated from model 'updateOfferMappingResultDTO'
-- Ошибки и предупреждения, которые появились из-за переданных характеристик.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingResultDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
);  /*Ошибки и предупреждения, которые появились из-за переданных характеристик.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingResultDTOOfferMappingErrorDTO` generated from model 'UpdateOfferMappingResultDTOOfferMappingErrorDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingResultDTOOfferMappingErrorDTO` (
  `updateOfferMappingResultDTO` long NOT NULL
  `offerMappingErrorDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingResultDTOOfferMappingErrorDTO` generated from model 'UpdateOfferMappingResultDTOOfferMappingErrorDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingResultDTOOfferMappingErrorDTO` (
  `updateOfferMappingResultDTO` long NOT NULL
  `offerMappingErrorDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingsRequest` generated from model 'updateOfferMappingsRequest'
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingsRequest` (
  `onlyPartnerMediaContent` boolean /*Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;. */
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingsRequestUpdateOfferMappingDTO` generated from model 'UpdateOfferMappingsRequestUpdateOfferMappingDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingsRequestUpdateOfferMappingDTO` (
  `updateOfferMappingsRequest` long NOT NULL
  `updateOfferMappingDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingsResponse` generated from model 'updateOfferMappingsResponse'
-- Описывает проблемы, возникшие при сохранении товара.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingsResponse` (
  `status` long,
);  /*Описывает проблемы, возникшие при сохранении товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOfferMappingsResponseUpdateOfferMappingResultDTO` generated from model 'UpdateOfferMappingsResponseUpdateOfferMappingResultDTO'

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingsResponseUpdateOfferMappingResultDTO` (
  `updateOfferMappingsResponse` long NOT NULL
  `updateOfferMappingResultDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderItemRequest` generated from model 'updateOrderItemRequest'
-- Запрос на обновление состава заказа.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderItemRequest` (
  `reason` long
);  /*Запрос на обновление состава заказа.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderItemRequestOrderItemModificationDTO` generated from model 'UpdateOrderItemRequestOrderItemModificationDTO'

CREATE TABLE IF NOT EXISTS `UpdateOrderItemRequestOrderItemModificationDTO` (
  `updateOrderItemRequest` long NOT NULL
  `orderItemModificationDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStatusDTO` generated from model 'updateOrderStatusDTO'
-- Список заказов.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusDTO` (
  `id` long PRIMARY KEY AUTOINCREMENT /*Идентификатор заказа.*/,
  `status` long,
  `substatus` long,
  `updateStatus` long,
  `errorDetails` text /*Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;. */
);  /*Список заказов.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStatusRequest` generated from model 'updateOrderStatusRequest'
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusRequest` (
  `order` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStatusResponse` generated from model 'updateOrderStatusResponse'
-- Информация об изменении статуса заказа.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusResponse` (
  `order` long
);  /*Информация об изменении статуса заказа.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStatusesDTO` generated from model 'updateOrderStatusesDTO'
-- Список заказов, статус которых обновился.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusesDTO` (
);  /*Список заказов, статус которых обновился.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStatusesDTOUpdateOrderStatusDTO` generated from model 'UpdateOrderStatusesDTOUpdateOrderStatusDTO'

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusesDTOUpdateOrderStatusDTO` (
  `updateOrderStatusesDTO` long NOT NULL
  `updateOrderStatusDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStatusesRequest` generated from model 'updateOrderStatusesRequest'
-- Список заказов.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusesRequest` (
);  /*Список заказов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStatusesRequestOrderStateDTO` generated from model 'UpdateOrderStatusesRequestOrderStateDTO'

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusesRequestOrderStateDTO` (
  `updateOrderStatusesRequest` long NOT NULL
  `orderStateDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStatusesResponse` generated from model 'updateOrderStatusesResponse'
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusesResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOrderStorageLimitRequest` generated from model 'updateOrderStorageLimitRequest'
-- Запрос на обновление срока хранения заказа в ПВЗ.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStorageLimitRequest` (
  `newDate` date NOT NULL /*Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. */
);  /*Запрос на обновление срока хранения заказа в ПВЗ.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOutletLicenseRequest` generated from model 'updateOutletLicenseRequest'
-- Запрос на создание или изменение лицензий для точек продаж.
--

CREATE TABLE IF NOT EXISTS `UpdateOutletLicenseRequest` (
);  /*Запрос на создание или изменение лицензий для точек продаж.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateOutletLicenseRequestOutletLicenseDTO` generated from model 'UpdateOutletLicenseRequestOutletLicenseDTO'

CREATE TABLE IF NOT EXISTS `UpdateOutletLicenseRequestOutletLicenseDTO` (
  `updateOutletLicenseRequest` long NOT NULL
  `outletLicenseDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePriceWithDiscountDTO` generated from model 'updatePriceWithDiscountDTO'
-- Цена с указанием скидки.
--

CREATE TABLE IF NOT EXISTS `UpdatePriceWithDiscountDTO` (
  `value` decimal NOT NULL /*Значение.*/,
  `currencyId` long NOT NULL,
  `discountBase` decimal /*Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. */
);  /*Цена с указанием скидки.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePricesRequest` generated from model 'updatePricesRequest'
-- Запрос на установку цен на товары.
--

CREATE TABLE IF NOT EXISTS `UpdatePricesRequest` (
);  /*Запрос на установку цен на товары.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePricesRequestOfferPriceDTO` generated from model 'UpdatePricesRequestOfferPriceDTO'

CREATE TABLE IF NOT EXISTS `UpdatePricesRequestOfferPriceDTO` (
  `updatePricesRequest` long NOT NULL
  `offerPriceDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOfferDTO` generated from model 'updatePromoOfferDTO'
-- Описание товаров, которые участвуют в акции.
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `params` long
);  /*Описание товаров, которые участвуют в акции.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOfferDiscountParamsDTO` generated from model 'updatePromoOfferDiscountParamsDTO'
-- Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOfferDiscountParamsDTO` (
  `price` long UNSIGNED /*Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. */,
  `promoPrice` long UNSIGNED /*Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. */
);  /*Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. */


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOfferParamsDTO` generated from model 'updatePromoOfferParamsDTO'
-- Параметры товара, который участвует в акции.
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOfferParamsDTO` (
  `discountParams` long
);  /*Параметры товара, который участвует в акции.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOffersRequest` generated from model 'updatePromoOffersRequest'
-- Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersRequest` (
  `promoId` text NOT NULL /*Идентификатор акции.*/,
);  /*Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. */

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOffersRequestUpdatePromoOfferDTO` generated from model 'UpdatePromoOffersRequestUpdatePromoOfferDTO'

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersRequestUpdatePromoOfferDTO` (
  `updatePromoOffersRequest` long NOT NULL
  `updatePromoOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOffersResponse` generated from model 'updatePromoOffersResponse'
-- Результат добавления товаров в акцию.
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersResponse` (
  `status` long,
  `result` long
);  /*Результат добавления товаров в акцию.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOffersResultDTO` generated from model 'updatePromoOffersResultDTO'
-- Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersResultDTO` (
);  /*Ошибки и предупреждения, которые появились при добавлении товаров в акцию.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOffersResultDTORejectedPromoOfferUpdateDTO` generated from model 'UpdatePromoOffersResultDTORejectedPromoOfferUpdateDTO'

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersResultDTORejectedPromoOfferUpdateDTO` (
  `updatePromoOffersResultDTO` long NOT NULL
  `rejectedPromoOfferUpdateDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePromoOffersResultDTOWarningPromoOfferUpdateDTO` generated from model 'UpdatePromoOffersResultDTOWarningPromoOfferUpdateDTO'

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersResultDTOWarningPromoOfferUpdateDTO` (
  `updatePromoOffersResultDTO` long NOT NULL
  `warningPromoOfferUpdateDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateStockDTO` generated from model 'updateStockDTO'
-- Информация об остатках одного товара на одном из складов.
--

CREATE TABLE IF NOT EXISTS `UpdateStockDTO` (
  `sku` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
);  /*Информация об остатках одного товара на одном из складов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateStockDTOUpdateStockItemDTO` generated from model 'UpdateStockDTOUpdateStockItemDTO'

CREATE TABLE IF NOT EXISTS `UpdateStockDTOUpdateStockItemDTO` (
  `updateStockDTO` long NOT NULL
  `updateStockItemDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateStockItemDTO` generated from model 'updateStockItemDTO'
-- Информация об остатках товара. 
--

CREATE TABLE IF NOT EXISTS `UpdateStockItemDTO` (
  `count` long UNSIGNED NOT NULL /*Количество доступного товара. */,
  `updatedAt` datetime /*Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. */
);  /*Информация об остатках товара. */


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateStocksRequest` generated from model 'updateStocksRequest'
-- Запрос на изменение информации по остаткам товаров.
--

CREATE TABLE IF NOT EXISTS `UpdateStocksRequest` (
);  /*Запрос на изменение информации по остаткам товаров.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateStocksRequestUpdateStockDTO` generated from model 'UpdateStocksRequestUpdateStockDTO'

CREATE TABLE IF NOT EXISTS `UpdateStocksRequestUpdateStockDTO` (
  `updateStocksRequest` long NOT NULL
  `updateStockDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateTimeDTO` generated from model 'updateTimeDTO'
-- Время последнего обновления.
--

CREATE TABLE IF NOT EXISTS `UpdateTimeDTO` (
  `updatedAt` datetime NOT NULL /*Время последнего обновления.*/
);  /*Время последнего обновления.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ValueRestrictionDTO` generated from model 'valueRestrictionDTO'
-- Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
--

CREATE TABLE IF NOT EXISTS `ValueRestrictionDTO` (
  `limitingParameterId` long NOT NULL /*Идентификатор ограничивающей характеристики.*/,
);  /*Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. */

-- --------------------------------------------------------------------------
-- Table structure for table `ValueRestrictionDTOOptionValuesLimitedDTO` generated from model 'ValueRestrictionDTOOptionValuesLimitedDTO'

CREATE TABLE IF NOT EXISTS `ValueRestrictionDTOOptionValuesLimitedDTO` (
  `valueRestrictionDTO` long NOT NULL
  `optionValuesLimitedDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `VerifyOrderEacRequest` generated from model 'verifyOrderEacRequest'
--

CREATE TABLE IF NOT EXISTS `VerifyOrderEacRequest` (
  `code` text /*Код для подтверждения ЭАПП.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VerifyOrderEacResponse` generated from model 'verifyOrderEacResponse'
--

CREATE TABLE IF NOT EXISTS `VerifyOrderEacResponse` (
  `status` long,
  `result` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseAddressDTO` generated from model 'warehouseAddressDTO'
-- Адрес склада.
--

CREATE TABLE IF NOT EXISTS `WarehouseAddressDTO` (
  `city` text NOT NULL /*Город.*/,
  `gps` long NOT NULL,
  `street` text /*Улица.*/,
  `number` text /*Номер дома.*/,
  `building` text /*Номер строения.*/,
  `block` text /*Номер корпуса.*/
);  /*Адрес склада.*/


-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseDTO` generated from model 'warehouseDTO'
-- Информация о складе.
--

CREATE TABLE IF NOT EXISTS `WarehouseDTO` (
  `id` long NOT NULL PRIMARY KEY AUTOINCREMENT /*Идентификатор склада.*/,
  `name` text NOT NULL /*Название склада.*/,
  `campaignId` long NOT NULL /*Идентификатор кампании в API и идентификатор магазина.*/,
  `express` boolean NOT NULL /*Возможна ли доставка по модели Экспресс.*/,
  `address` long
);  /*Информация о складе.*/


-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseGroupDTO` generated from model 'warehouseGroupDTO'
-- Информация о группе складов.
--

CREATE TABLE IF NOT EXISTS `WarehouseGroupDTO` (
  `name` text NOT NULL /*Название группы складов.*/,
  `mainWarehouse` long NOT NULL,
);  /*Информация о группе складов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseGroupDTOWarehouseDTO` generated from model 'WarehouseGroupDTOWarehouseDTO'

CREATE TABLE IF NOT EXISTS `WarehouseGroupDTOWarehouseDTO` (
  `warehouseGroupDTO` long NOT NULL
  `warehouseDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseOfferDTO` generated from model 'warehouseOfferDTO'
-- Информация об остатках товара.
--

CREATE TABLE IF NOT EXISTS `WarehouseOfferDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
  `turnoverSummary` long,
  `updatedAt` datetime /*Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;. */
);  /*Информация об остатках товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseOfferDTOWarehouseStockDTO` generated from model 'WarehouseOfferDTOWarehouseStockDTO'

CREATE TABLE IF NOT EXISTS `WarehouseOfferDTOWarehouseStockDTO` (
  `warehouseOfferDTO` long NOT NULL
  `warehouseStockDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseOffersDTO` generated from model 'warehouseOffersDTO'
-- Информация об остатках товаров на складе.
--

CREATE TABLE IF NOT EXISTS `WarehouseOffersDTO` (
  `warehouseId` long NOT NULL /*Идентификатор склада.*/,
);  /*Информация об остатках товаров на складе.*/

-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseOffersDTOWarehouseOfferDTO` generated from model 'WarehouseOffersDTOWarehouseOfferDTO'

CREATE TABLE IF NOT EXISTS `WarehouseOffersDTOWarehouseOfferDTO` (
  `warehouseOffersDTO` long NOT NULL
  `warehouseOfferDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `WarehouseStockDTO` generated from model 'warehouseStockDTO'
-- Информация об остатках товара.
--

CREATE TABLE IF NOT EXISTS `WarehouseStockDTO` (
  `type` long NOT NULL,
  `count` long NOT NULL /*Значение остатков.*/
);  /*Информация об остатках товара.*/


-- --------------------------------------------------------------------------
-- Table structure for table `WarehousesDTO` generated from model 'warehousesDTO'
-- Информация о складах и группах складов.
--

CREATE TABLE IF NOT EXISTS `WarehousesDTO` (
);  /*Информация о складах и группах складов.*/

-- --------------------------------------------------------------------------
-- Table structure for table `WarehousesDTOWarehouseDTO` generated from model 'WarehousesDTOWarehouseDTO'

CREATE TABLE IF NOT EXISTS `WarehousesDTOWarehouseDTO` (
  `warehousesDTO` long NOT NULL
  `warehouseDTO` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `WarehousesDTOWarehouseGroupDTO` generated from model 'WarehousesDTOWarehouseGroupDTO'

CREATE TABLE IF NOT EXISTS `WarehousesDTOWarehouseGroupDTO` (
  `warehousesDTO` long NOT NULL
  `warehouseGroupDTO` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `WarningPromoOfferUpdateDTO` generated from model 'warningPromoOfferUpdateDTO'
-- Описание предупреждения, которое появилось при добавлении товара.
--

CREATE TABLE IF NOT EXISTS `WarningPromoOfferUpdateDTO` (
  `offerId` text NOT NULL /*Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) */,
);  /*Описание предупреждения, которое появилось при добавлении товара.*/

-- --------------------------------------------------------------------------
-- Table structure for table `WarningPromoOfferUpdateDTOPromoOfferUpdateWarningDTO` generated from model 'WarningPromoOfferUpdateDTOPromoOfferUpdateWarningDTO'

CREATE TABLE IF NOT EXISTS `WarningPromoOfferUpdateDTOPromoOfferUpdateWarningDTO` (
  `warningPromoOfferUpdateDTO` long NOT NULL
  `promoOfferUpdateWarningDTO` long NOT NULL
);


--
-- OAuth2 framework tables
-- Thanks to https://github.com/dsquier/oauth2-server-php-mysql repo
--

--
-- Table structure for table `oauth_clients`
--
CREATE TABLE IF NOT EXISTS `oauth_clients` (
  `client_id`            VARCHAR(80)    NOT NULL,
  `client_secret`        VARCHAR(80)    DEFAULT NULL,
  `redirect_uri`         VARCHAR(2000)  DEFAULT NULL,
  `grant_types`          VARCHAR(80)    DEFAULT NULL,
  `scope`                VARCHAR(4000)  DEFAULT NULL,
  `user_id`              VARCHAR(80)    DEFAULT NULL,
  PRIMARY KEY (`client_id`)
);

--
-- Table structure for table `oauth_access_tokens`
--
CREATE TABLE IF NOT EXISTS `oauth_access_tokens` (
  `access_token`         VARCHAR(40)    NOT NULL,
  `client_id`            VARCHAR(80)    DEFAULT NULL,
  `user_id`              VARCHAR(80)    DEFAULT NULL,
  `expires`              TIMESTAMP      NOT NULL,
  `scope`                VARCHAR(4000)  DEFAULT NULL,
  PRIMARY KEY (`access_token`)
);

--
-- Table structure for table `oauth_authorization_codes`
--
CREATE TABLE IF NOT EXISTS `oauth_authorization_codes` (
  `authorization_code`  VARCHAR(40)    NOT NULL,
  `client_id`           VARCHAR(80)    DEFAULT NULL,
  `user_id`             VARCHAR(80)    DEFAULT NULL,
  `redirect_uri`        VARCHAR(2000)  NOT NULL,
  `expires`             TIMESTAMP      NOT NULL,
  `scope`               VARCHAR(4000)  DEFAULT NULL,
  `id_token`            VARCHAR(1000)  DEFAULT NULL,
  PRIMARY KEY (`authorization_code`)
);

--
-- Table structure for table `oauth_refresh_tokens`
--
CREATE TABLE IF NOT EXISTS `oauth_refresh_tokens` (
  `refresh_token`       VARCHAR(40)    NOT NULL,
  `client_id`           VARCHAR(80)    DEFAULT NULL,
  `user_id`             VARCHAR(80)    DEFAULT NULL,
  `expires`             TIMESTAMP      DEFAULT CURRENT_TIMESTAMP,
  `scope`               VARCHAR(4000)  DEFAULT NULL,
  PRIMARY KEY (`refresh_token`)
);

--
-- Table structure for table `oauth_users`
--
CREATE TABLE IF NOT EXISTS `oauth_users` (
  `username`            VARCHAR(80)    DEFAULT NULL,
  `password`            VARCHAR(255)   DEFAULT NULL,
  `first_name`          VARCHAR(80)    DEFAULT NULL,
  `last_name`           VARCHAR(80)    DEFAULT NULL,
  `email`               VARCHAR(2000)  DEFAULT NULL,
  `email_verified`      TINYINT(1)     DEFAULT NULL,
  `scope`               VARCHAR(4000)  DEFAULT NULL
);

--
-- Table structure for table `oauth_scopes`
--
CREATE TABLE IF NOT EXISTS `oauth_scopes` (
  `scope`               VARCHAR(80)  NOT NULL,
  `is_default`          TINYINT(1)   DEFAULT NULL,
  PRIMARY KEY (`scope`)
);

--
-- Table structure for table `oauth_jwt`
--
CREATE TABLE IF NOT EXISTS `oauth_jwt` (
  `client_id`           VARCHAR(80)    NOT NULL,
  `subject`             VARCHAR(80)    DEFAULT NULL,
  `public_key`          VARCHAR(2000)  NOT NULL
);

--
-- Table structure for table `oauth_jti`
--
CREATE TABLE IF NOT EXISTS `oauth_jti` (
  `issuer`              VARCHAR(80)    NOT NULL,
  `subject`             VARCHAR(80)    DEFAULT NULL,
  `audience`            VARCHAR(80)    DEFAULT NULL,
  `expires`             TIMESTAMP      NOT NULL,
  `jti`                 VARCHAR(2000)  NOT NULL
);

--
-- Table structure for table `oauth_public_keys`
--
CREATE TABLE IF NOT EXISTS `oauth_public_keys` (
  `client_id`            VARCHAR(80)    DEFAULT NULL,
  `public_key`           VARCHAR(2000)  DEFAULT NULL,
  `private_key`          VARCHAR(2000)  DEFAULT NULL,
  `encryption_algorithm` VARCHAR(100)   DEFAULT 'RS256'
);

--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
