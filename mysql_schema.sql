/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `AcceptOrderCancellationRequest` generated from model 'AcceptOrderCancellationRequest'
--

CREATE TABLE IF NOT EXISTS `AcceptOrderCancellationRequest` (
  `accepted` TINYINT(1) NOT NULL COMMENT 'Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. ',
  `reason` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AddHiddenOffersRequest` generated from model 'AddHiddenOffersRequest'
-- Запрос на скрытие оферов.
--

CREATE TABLE IF NOT EXISTS `AddHiddenOffersRequest` (
  `hiddenOffers` JSON NOT NULL COMMENT 'Список скрытых товаров. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на скрытие оферов.';

--
-- Table structure for table `AddOffersToArchiveDTO` generated from model 'AddOffersToArchiveDTO'
-- Товары, которые не удалось поместить в архив.
--

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveDTO` (
  `notArchivedOffers` JSON DEFAULT NULL COMMENT 'Список товаров, которые не удалось поместить в архив.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товары, которые не удалось поместить в архив.';

--
-- Table structure for table `AddOffersToArchiveErrorDTO` generated from model 'AddOffersToArchiveErrorDTO'
-- Товар, который не удалось поместить в архив.
--

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveErrorDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `error` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар, который не удалось поместить в архив.';

--
-- Table structure for table `AddOffersToArchiveRequest` generated from model 'AddOffersToArchiveRequest'
-- Товары, которые нужно поместить в архив. 
--

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveRequest` (
  `offerIds` JSON NOT NULL COMMENT 'Список товаров, которые нужно поместить в архив.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товары, которые нужно поместить в архив. ';

--
-- Table structure for table `AddOffersToArchiveResponse` generated from model 'AddOffersToArchiveResponse'
-- Результат архивации товаров.
--

CREATE TABLE IF NOT EXISTS `AddOffersToArchiveResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат архивации товаров.';

--
-- Table structure for table `AgeDTO` generated from model 'AgeDTO'
-- Возраст в заданных единицах измерения.
--

CREATE TABLE IF NOT EXISTS `AgeDTO` (
  `value` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Значение. ',
  `ageUnit` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Возраст в заданных единицах измерения.';

--
-- Table structure for table `ApiClientDataErrorResponse` generated from model 'ApiClientDataErrorResponse'
-- Ошибка в данных переданных от клиента.
--

CREATE TABLE IF NOT EXISTS `ApiClientDataErrorResponse` (
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Список ошибок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ошибка в данных переданных от клиента.';

--
-- Table structure for table `ApiErrorDTO` generated from model 'ApiErrorDTO'
-- Общий формат ошибки.
--

CREATE TABLE IF NOT EXISTS `ApiErrorDTO` (
  `code` TEXT NOT NULL COMMENT 'Код ошибки.',
  `message` TEXT DEFAULT NULL COMMENT 'Описание ошибки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Общий формат ошибки.';

--
-- Table structure for table `ApiErrorResponse` generated from model 'ApiErrorResponse'
-- Стандартная обертка для ошибок сервера.
--

CREATE TABLE IF NOT EXISTS `ApiErrorResponse` (
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Список ошибок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Стандартная обертка для ошибок сервера.';

--
-- Table structure for table `ApiForbiddenErrorResponse` generated from model 'ApiForbiddenErrorResponse'
-- Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
--

CREATE TABLE IF NOT EXISTS `ApiForbiddenErrorResponse` (
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Список ошибок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.';

--
-- Table structure for table `ApiLimitErrorResponse` generated from model 'ApiLimitErrorResponse'
-- Превышено ограничение на доступ к ресурсу.
--

CREATE TABLE IF NOT EXISTS `ApiLimitErrorResponse` (
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Список ошибок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Превышено ограничение на доступ к ресурсу.';

--
-- Table structure for table `ApiLockedErrorResponse` generated from model 'ApiLockedErrorResponse'
-- Ресурс из запроса заблокирован от применения к нему указанного метода.
--

CREATE TABLE IF NOT EXISTS `ApiLockedErrorResponse` (
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Список ошибок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ресурс из запроса заблокирован от применения к нему указанного метода.';

--
-- Table structure for table `ApiNotFoundErrorResponse` generated from model 'ApiNotFoundErrorResponse'
-- Запрашиваемый ресурс не найден.
--

CREATE TABLE IF NOT EXISTS `ApiNotFoundErrorResponse` (
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Список ошибок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрашиваемый ресурс не найден.';

--
-- Table structure for table `ApiResponse` generated from model 'ApiResponse'
-- Стандартная обертка для ответов сервера.
--

CREATE TABLE IF NOT EXISTS `ApiResponse` (
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Стандартная обертка для ответов сервера.';

--
-- Table structure for table `ApiServerErrorResponse` generated from model 'ApiServerErrorResponse'
-- Внутренняя ошибка сервера.
--

CREATE TABLE IF NOT EXISTS `ApiServerErrorResponse` (
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Список ошибок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Внутренняя ошибка сервера.';

--
-- Table structure for table `ApiUnauthorizedErrorResponse` generated from model 'ApiUnauthorizedErrorResponse'
-- В запросе не указаны авторизационные данные.
--

CREATE TABLE IF NOT EXISTS `ApiUnauthorizedErrorResponse` (
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Список ошибок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='В запросе не указаны авторизационные данные.';

--
-- Table structure for table `BaseCampaignOfferDTO` generated from model 'BaseCampaignOfferDTO'
-- Информация о новой цене на товар.
--

CREATE TABLE IF NOT EXISTS `BaseCampaignOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `quantum` TEXT DEFAULT NULL,
  `available` TINYINT(1) DEFAULT NULL COMMENT 'Есть ли товар в продаже. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о новой цене на товар.';

--
-- Table structure for table `BaseOfferDTO` generated from model 'BaseOfferDTO'
-- Основные параметры товара.
--

CREATE TABLE IF NOT EXISTS `BaseOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `name` TEXT DEFAULT NULL COMMENT 'Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ',
  `marketCategoryId` BIGINT DEFAULT NULL COMMENT 'Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). ',
  `category` TEXT DEFAULT NULL COMMENT 'Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. ',
  `pictures` JSON DEFAULT NULL COMMENT 'Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) ',
  `videos` JSON DEFAULT NULL COMMENT 'Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) ',
  `manuals` JSON DEFAULT NULL COMMENT 'Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. ',
  `vendor` TEXT DEFAULT NULL COMMENT 'Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.',
  `barcodes` JSON DEFAULT NULL COMMENT 'Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ',
  `description` TEXT DEFAULT NULL COMMENT 'Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ',
  `manufacturerCountries` JSON DEFAULT NULL COMMENT 'Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). ',
  `weightDimensions` TEXT DEFAULT NULL,
  `vendorCode` TEXT DEFAULT NULL COMMENT 'Артикул товара от производителя.',
  `tags` JSON DEFAULT NULL COMMENT 'Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. ',
  `shelfLife` TEXT DEFAULT NULL,
  `lifeTime` TEXT DEFAULT NULL,
  `guaranteePeriod` TEXT DEFAULT NULL,
  `customsCommodityCode` TEXT DEFAULT NULL COMMENT 'Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. ',
  `certificates` JSON DEFAULT NULL COMMENT 'Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). ',
  `boxCount` INT DEFAULT NULL COMMENT 'Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. ',
  `condition` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL,
  `downloadable` TINYINT(1) DEFAULT NULL COMMENT 'Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) ',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. ',
  `age` TEXT DEFAULT NULL,
  `params` JSON DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Основные параметры товара.';

--
-- Table structure for table `BasePriceDTO` generated from model 'BasePriceDTO'
-- Цена на товар.
--

CREATE TABLE IF NOT EXISTS `BasePriceDTO` (
  `value` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Значение.',
  `currencyId` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Цена на товар.';

--
-- Table structure for table `BaseShipmentDTO` generated from model 'BaseShipmentDTO'
-- Информация об отгрузке.
--

CREATE TABLE IF NOT EXISTS `BaseShipmentDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор отгрузки.',
  `planIntervalFrom` DATETIME DEFAULT NULL COMMENT 'Начало планового интервала отгрузки.',
  `planIntervalTo` DATETIME DEFAULT NULL COMMENT 'Конец планового интервала отгрузки.',
  `shipmentType` TEXT DEFAULT NULL,
  `warehouse` TEXT DEFAULT NULL,
  `warehouseTo` TEXT DEFAULT NULL,
  `externalId` TEXT DEFAULT NULL COMMENT 'Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.',
  `deliveryService` TEXT DEFAULT NULL,
  `palletsCount` TEXT DEFAULT NULL,
  `orderIds` JSON NOT NULL COMMENT 'Идентификаторы заказов в отгрузке.',
  `draftCount` INT DEFAULT NULL COMMENT 'Количество заказов, которое Маркет запланировал к отгрузке.',
  `plannedCount` INT DEFAULT NULL COMMENT 'Количество заказов, которое Маркет подтвердил к отгрузке.',
  `factCount` INT DEFAULT NULL COMMENT 'Количество заказов, принятых в сортировочном центре или пункте приема.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об отгрузке.';

--
-- Table structure for table `BidRecommendationItemDTO` generated from model 'BidRecommendationItemDTO'
-- Рекомендованная ставка и возможная доля показов.
--

CREATE TABLE IF NOT EXISTS `BidRecommendationItemDTO` (
  `bid` SMALLINT UNSIGNED NOT NULL COMMENT 'Значение ставки.',
  `showPercent` BIGINT NOT NULL COMMENT 'Доля показов. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Рекомендованная ставка и возможная доля показов.';

--
-- Table structure for table `BriefOrderItemDTO` generated from model 'BriefOrderItemDTO'
-- Информация о маркированном товаре.
--

CREATE TABLE IF NOT EXISTS `BriefOrderItemDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ',
  `vat` TEXT DEFAULT NULL,
  `count` INT DEFAULT NULL COMMENT 'Количество единиц товара.',
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. ',
  `offerName` TEXT DEFAULT NULL COMMENT 'Название товара.',
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `instances` JSON DEFAULT NULL COMMENT 'Переданные вами коды маркировки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о маркированном товаре.';

--
-- Table structure for table `BriefOrderItemInstanceDTO` generated from model 'BriefOrderItemInstanceDTO'
-- Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
--

CREATE TABLE IF NOT EXISTS `BriefOrderItemInstanceDTO` (
  `cis` TEXT DEFAULT NULL COMMENT 'Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя &#x60;\\u001d&#x60;!  ✅ &#x60;01030410947874432155Qbag!\\u001d93Zjqw&#x60;  ❌ &#x60;01030410947874432155Qbag!\\\\u001d93Zjqw&#x60;  Косые черты и кавычки в других местах экранируйте по правилам JSON: &#x60;\\\\&#x60; и &#x60;\\\&quot;&#x60;  {% endnote %} ',
  `uin` TEXT DEFAULT NULL COMMENT 'Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. ',
  `rnpt` TEXT DEFAULT NULL COMMENT 'Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. ',
  `gtd` TEXT DEFAULT NULL COMMENT 'Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). ';

--
-- Table structure for table `BusinessDTO` generated from model 'BusinessDTO'
-- Информация о кабинете.
--

CREATE TABLE IF NOT EXISTS `BusinessDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор кабинета.',
  `name` TEXT DEFAULT NULL COMMENT 'Название бизнеса.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о кабинете.';

--
-- Table structure for table `BusinessSettingsDTO` generated from model 'BusinessSettingsDTO'
-- Настройки кабинета.
--

CREATE TABLE IF NOT EXISTS `BusinessSettingsDTO` (
  `onlyDefaultPrice` TINYINT(1) DEFAULT NULL COMMENT 'Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену. ',
  `currency` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Настройки кабинета.';

--
-- Table structure for table `CalculateTariffsOfferDTO` generated from model 'CalculateTariffsOfferDTO'
-- Параметры товара, для которого нужно рассчитать стоимость услуг.
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsOfferDTO` (
  `categoryId` BIGINT NOT NULL COMMENT 'Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ',
  `price` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Цена на товар в рублях.',
  `length` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Длина товара в сантиметрах.',
  `width` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Ширина товара в сантиметрах.',
  `height` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Высота товара в сантиметрах.',
  `weight` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Вес товара в килограммах.',
  `quantity` INT UNSIGNED DEFAULT 1 COMMENT 'Квант продажи — количество единиц товара в одном товарном предложении.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара, для которого нужно рассчитать стоимость услуг.';

--
-- Table structure for table `CalculateTariffsOfferInfoDTO` generated from model 'CalculateTariffsOfferInfoDTO'
-- Стоимость услуг.
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsOfferInfoDTO` (
  `offer` TEXT NOT NULL,
  `tariffs` JSON NOT NULL COMMENT 'Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Стоимость услуг.';

--
-- Table structure for table `CalculateTariffsParametersDTO` generated from model 'CalculateTariffsParametersDTO'
-- Параметры для расчета стоимости услуг.
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsParametersDTO` (
  `campaignId` BIGINT DEFAULT NULL COMMENT 'Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке. ',
  `sellingProgram` TEXT DEFAULT NULL,
  `frequency` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры для расчета стоимости услуг.';

--
-- Table structure for table `CalculateTariffsRequest` generated from model 'CalculateTariffsRequest'
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsRequest` (
  `parameters` TEXT NOT NULL,
  `offers` JSON NOT NULL COMMENT 'Товары, для которых нужно рассчитать стоимость услуг.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CalculateTariffsResponse` generated from model 'CalculateTariffsResponse'
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CalculateTariffsResponseDTO` generated from model 'CalculateTariffsResponseDTO'
-- Расчет стоимости услуг.
--

CREATE TABLE IF NOT EXISTS `CalculateTariffsResponseDTO` (
  `offers` JSON NOT NULL COMMENT 'Стоимость услуг.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Расчет стоимости услуг.';

--
-- Table structure for table `CalculatedTariffDTO` generated from model 'CalculatedTariffDTO'
-- Информация об услугах Маркета.
--

CREATE TABLE IF NOT EXISTS `CalculatedTariffDTO` (
  `type` TEXT NOT NULL,
  `amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Стоимость услуги в рублях.',
  `parameters` JSON NOT NULL COMMENT 'Параметры расчета тарифа.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об услугах Маркета.';

--
-- Table structure for table `CampaignDTO` generated from model 'CampaignDTO'
-- Информация о магазине.
--

CREATE TABLE IF NOT EXISTS `CampaignDTO` (
  `domain` TEXT DEFAULT NULL COMMENT 'URL магазина.',
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор кампании.',
  `clientId` BIGINT DEFAULT NULL COMMENT 'Идентификатор плательщика в Яндекс Балансе.',
  `business` TEXT DEFAULT NULL,
  `placementType` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о магазине.';

--
-- Table structure for table `CampaignQualityRatingDTO` generated from model 'CampaignQualityRatingDTO'
-- Информация об индексе качества магазина.
--

CREATE TABLE IF NOT EXISTS `CampaignQualityRatingDTO` (
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор магазина.',
  `ratings` JSON NOT NULL COMMENT 'Список значений индекса качества.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об индексе качества магазина.';

--
-- Table structure for table `CampaignSettingsDTO` generated from model 'CampaignSettingsDTO'
-- Настройки магазина.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsDTO` (
  `countryRegion` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона, в котором находится магазин.',
  `shopName` TEXT DEFAULT NULL COMMENT 'Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;. ',
  `showInContext` TINYINT(1) DEFAULT NULL COMMENT 'Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции. ',
  `showInPremium` TINYINT(1) DEFAULT NULL COMMENT 'Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения. ',
  `useOpenStat` TINYINT(1) DEFAULT NULL COMMENT 'Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется. ',
  `localRegion` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Настройки магазина.';

--
-- Table structure for table `CampaignSettingsDeliveryDTO` generated from model 'CampaignSettingsDeliveryDTO'
-- Информация о доставке в своем регионе магазина.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsDeliveryDTO` (
  `schedule` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о доставке в своем регионе магазина.';

--
-- Table structure for table `CampaignSettingsLocalRegionDTO` generated from model 'CampaignSettingsLocalRegionDTO'
-- Информация о своем регионе магазина.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsLocalRegionDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона.',
  `name` TEXT DEFAULT NULL COMMENT 'Название региона.',
  `type` TEXT DEFAULT NULL,
  `deliveryOptionsSource` TEXT DEFAULT NULL,
  `delivery` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о своем регионе магазина.';

--
-- Table structure for table `CampaignSettingsScheduleDTO` generated from model 'CampaignSettingsScheduleDTO'
-- Расписание работы службы доставки в своем регионе.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsScheduleDTO` (
  `availableOnHolidays` TINYINT(1) DEFAULT NULL COMMENT 'Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни. ',
  `customHolidays` JSON NOT NULL COMMENT 'Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.',
  `customWorkingDays` JSON NOT NULL COMMENT 'Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.',
  `period` TEXT DEFAULT NULL,
  `totalHolidays` JSON NOT NULL COMMENT 'Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.',
  `weeklyHolidays` JSON NOT NULL COMMENT 'Список выходных дней недели и государственных праздников.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Расписание работы службы доставки в своем регионе.';

--
-- Table structure for table `CampaignSettingsTimePeriodDTO` generated from model 'CampaignSettingsTimePeriodDTO'
-- Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
--

CREATE TABLE IF NOT EXISTS `CampaignSettingsTimePeriodDTO` (
  `fromDate` TEXT DEFAULT NULL COMMENT 'Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. ',
  `toDate` TEXT DEFAULT NULL COMMENT 'Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Период, за который рассчитывается итоговый список нерабочих дней службы доставки.';

--
-- Table structure for table `CampaignsQualityRatingDTO` generated from model 'CampaignsQualityRatingDTO'
-- Информация об индексе качества магазинов.
--

CREATE TABLE IF NOT EXISTS `CampaignsQualityRatingDTO` (
  `campaignRatings` JSON NOT NULL COMMENT 'Список магазинов c информацией об их индексе качества.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об индексе качества магазинов.';

--
-- Table structure for table `CategoryContentParametersDTO` generated from model 'CategoryContentParametersDTO'
-- Информация о параметрах категории.
--

CREATE TABLE IF NOT EXISTS `CategoryContentParametersDTO` (
  `categoryId` INT NOT NULL COMMENT 'Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).',
  `parameters` JSON DEFAULT NULL COMMENT 'Список характеристик.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о параметрах категории.';

--
-- Table structure for table `CategoryDTO` generated from model 'CategoryDTO'
-- Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
--

CREATE TABLE IF NOT EXISTS `CategoryDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор категории.',
  `name` TEXT NOT NULL COMMENT 'Название категории.',
  `children` JSON DEFAULT NULL COMMENT 'Дочерние категории.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. ';

--
-- Table structure for table `CategoryErrorDTO` generated from model 'CategoryErrorDTO'
-- Текст ошибки.
--

CREATE TABLE IF NOT EXISTS `CategoryErrorDTO` (
  `categoryId` BIGINT DEFAULT NULL COMMENT 'Идентификатор категории.',
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Текст ошибки.';

--
-- Table structure for table `CategoryParameterDTO` generated from model 'CategoryParameterDTO'
-- Характеристика товара.
--

CREATE TABLE IF NOT EXISTS `CategoryParameterDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор характеристики.',
  `name` TEXT DEFAULT NULL COMMENT 'Название характеристики.',
  `type` TEXT NOT NULL,
  `unit` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL COMMENT 'Описание характеристики.',
  `recommendationTypes` JSON DEFAULT NULL COMMENT 'Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.',
  `required` TINYINT(1) NOT NULL COMMENT 'Обязательность характеристики.',
  `filtering` TINYINT(1) NOT NULL COMMENT 'Используется ли характеристика в фильтре.',
  `distinctive` TINYINT(1) NOT NULL COMMENT 'Является ли характеристика особенностью варианта.',
  `multivalue` TINYINT(1) NOT NULL COMMENT 'Можно ли передать сразу несколько значений.',
  `allowCustomValues` TINYINT(1) NOT NULL COMMENT 'Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.',
  `values` JSON DEFAULT NULL COMMENT 'Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.',
  `constraints` TEXT DEFAULT NULL,
  `valueRestrictions` JSON DEFAULT NULL COMMENT 'Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Характеристика товара.';

--
-- Table structure for table `CategoryParameterUnitDTO` generated from model 'CategoryParameterUnitDTO'
-- Единицы измерения характеристики товара.
--

CREATE TABLE IF NOT EXISTS `CategoryParameterUnitDTO` (
  `defaultUnitId` BIGINT NOT NULL COMMENT 'Единица измерения по умолчанию.',
  `units` JSON NOT NULL COMMENT 'Допустимые единицы измерения.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Единицы измерения характеристики товара.';

--
-- Table structure for table `ChangeOutletRequest` generated from model 'ChangeOutletRequest'
--

CREATE TABLE IF NOT EXISTS `ChangeOutletRequest` (
  `name` TEXT NOT NULL COMMENT 'Название точки продаж. ',
  `type` TEXT NOT NULL,
  `coords` TEXT DEFAULT NULL COMMENT 'Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. ',
  `isMain` TINYINT(1) DEFAULT NULL COMMENT 'Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. ',
  `shopOutletCode` TEXT DEFAULT NULL COMMENT 'Идентификатор точки продаж, присвоенный магазином.',
  `visibility` TEXT DEFAULT NULL,
  `address` TEXT NOT NULL,
  `phones` JSON NOT NULL COMMENT 'Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. ',
  `workingSchedule` TEXT NOT NULL,
  `deliveryRules` JSON DEFAULT NULL COMMENT 'Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. ',
  `storagePeriod` BIGINT DEFAULT NULL COMMENT 'Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ChatMessageDTO` generated from model 'ChatMessageDTO'
-- Информация о сообщениях.
--

CREATE TABLE IF NOT EXISTS `ChatMessageDTO` (
  `messageId` BIGINT NOT NULL COMMENT 'Идентификатор сообщения.',
  `createdAt` DATETIME NOT NULL COMMENT 'Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. ',
  `sender` TEXT NOT NULL,
  `message` TEXT DEFAULT NULL COMMENT 'Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;. ',
  `payload` JSON DEFAULT NULL COMMENT 'Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о сообщениях.';

--
-- Table structure for table `ChatMessagePayloadDTO` generated from model 'ChatMessagePayloadDTO'
-- Информация о приложенных к сообщению файлах.
--

CREATE TABLE IF NOT EXISTS `ChatMessagePayloadDTO` (
  `name` TEXT NOT NULL COMMENT 'Имя файла.',
  `url` TEXT NOT NULL COMMENT 'Ссылка для скачивания файла.',
  `size` INT NOT NULL COMMENT 'Размер файла в байтах.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о приложенных к сообщению файлах.';

--
-- Table structure for table `ChatMessagesResultDTO` generated from model 'ChatMessagesResultDTO'
-- Информация о сообщениях.
--

CREATE TABLE IF NOT EXISTS `ChatMessagesResultDTO` (
  `orderId` BIGINT NOT NULL COMMENT 'Идентификатор заказа.',
  `messages` JSON NOT NULL COMMENT 'Информация о сообщениях.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о сообщениях.';

--
-- Table structure for table `ConfirmPricesRequest` generated from model 'ConfirmPricesRequest'
-- Запрос на подтверждение цены. 
--

CREATE TABLE IF NOT EXISTS `ConfirmPricesRequest` (
  `offerIds` JSON NOT NULL COMMENT 'Идентификаторы товаров, у которых подтверждается цена.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на подтверждение цены. ';

--
-- Table structure for table `ConfirmShipmentRequest` generated from model 'ConfirmShipmentRequest'
-- Запрос для подтверждения отгрузки.
--

CREATE TABLE IF NOT EXISTS `ConfirmShipmentRequest` (
  `externalShipmentId` TEXT DEFAULT NULL COMMENT 'Идентификатор отгрузки в системе поставщика.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос для подтверждения отгрузки.';

--
-- Table structure for table `CreateChatRequest` generated from model 'CreateChatRequest'
-- Заказ, для которого нужно создать чат. 
--

CREATE TABLE IF NOT EXISTS `CreateChatRequest` (
  `orderId` BIGINT NOT NULL COMMENT 'Идентификатор заказа на Маркете.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Заказ, для которого нужно создать чат. ';

--
-- Table structure for table `CreateChatResponse` generated from model 'CreateChatResponse'
-- Результат создания чата.
--

CREATE TABLE IF NOT EXISTS `CreateChatResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат создания чата.';

--
-- Table structure for table `CreateChatResultDTO` generated from model 'CreateChatResultDTO'
-- Информация о созданном чате.
--

CREATE TABLE IF NOT EXISTS `CreateChatResultDTO` (
  `chatId` BIGINT NOT NULL COMMENT 'Идентификатор чата.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о созданном чате.';

--
-- Table structure for table `CreateOutletResponse` generated from model 'CreateOutletResponse'
-- Ответ на запрос о создании точки продаж.
--

CREATE TABLE IF NOT EXISTS `CreateOutletResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос о создании точки продаж.';

--
-- Table structure for table `DeleteCampaignOffersDTO` generated from model 'DeleteCampaignOffersDTO'
-- Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
--

CREATE TABLE IF NOT EXISTS `DeleteCampaignOffersDTO` (
  `notDeletedOfferIds` JSON DEFAULT NULL COMMENT 'Список SKU.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.';

--
-- Table structure for table `DeleteCampaignOffersRequest` generated from model 'DeleteCampaignOffersRequest'
-- Фильтрации удаляемых товаров по offerIds. 
--

CREATE TABLE IF NOT EXISTS `DeleteCampaignOffersRequest` (
  `offerIds` JSON NOT NULL COMMENT 'Идентификаторы товаров в каталоге.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтрации удаляемых товаров по offerIds. ';

--
-- Table structure for table `DeleteCampaignOffersResponse` generated from model 'DeleteCampaignOffersResponse'
-- Результат удаления товаров.
--

CREATE TABLE IF NOT EXISTS `DeleteCampaignOffersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат удаления товаров.';

--
-- Table structure for table `DeleteGoodsFeedbackCommentRequest` generated from model 'DeleteGoodsFeedbackCommentRequest'
-- Фильтр запроса отзывов по бизнесу. 
--

CREATE TABLE IF NOT EXISTS `DeleteGoodsFeedbackCommentRequest` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор комментария к отзыву. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтр запроса отзывов по бизнесу. ';

--
-- Table structure for table `DeleteHiddenOffersRequest` generated from model 'DeleteHiddenOffersRequest'
-- Запрос на возобновление показа оферов.
--

CREATE TABLE IF NOT EXISTS `DeleteHiddenOffersRequest` (
  `hiddenOffers` JSON NOT NULL COMMENT 'Список скрытых товаров. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на возобновление показа оферов.';

--
-- Table structure for table `DeleteOffersDTO` generated from model 'DeleteOffersDTO'
-- Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
--

CREATE TABLE IF NOT EXISTS `DeleteOffersDTO` (
  `notDeletedOfferIds` JSON DEFAULT NULL COMMENT 'Список SKU товаров, которые не удалось удалить.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.';

--
-- Table structure for table `DeleteOffersFromArchiveDTO` generated from model 'DeleteOffersFromArchiveDTO'
-- Товары, которые не удалось восстановить из архива.
--

CREATE TABLE IF NOT EXISTS `DeleteOffersFromArchiveDTO` (
  `notUnarchivedOfferIds` JSON DEFAULT NULL COMMENT 'Список товаров, которые не удалось восстановить из архива.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товары, которые не удалось восстановить из архива.';

--
-- Table structure for table `DeleteOffersFromArchiveRequest` generated from model 'DeleteOffersFromArchiveRequest'
-- Товары, которые нужно восстановить из архива. 
--

CREATE TABLE IF NOT EXISTS `DeleteOffersFromArchiveRequest` (
  `offerIds` JSON NOT NULL COMMENT 'Список товаров, которые нужно восстановить из архива.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товары, которые нужно восстановить из архива. ';

--
-- Table structure for table `DeleteOffersFromArchiveResponse` generated from model 'DeleteOffersFromArchiveResponse'
-- Результат разархивации товаров.
--

CREATE TABLE IF NOT EXISTS `DeleteOffersFromArchiveResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат разархивации товаров.';

--
-- Table structure for table `DeleteOffersRequest` generated from model 'DeleteOffersRequest'
-- Фильтрации удаляемых товаров по offerIds. 
--

CREATE TABLE IF NOT EXISTS `DeleteOffersRequest` (
  `offerIds` JSON NOT NULL COMMENT 'Список SKU товаров, которые нужно удалить.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтрации удаляемых товаров по offerIds. ';

--
-- Table structure for table `DeleteOffersResponse` generated from model 'DeleteOffersResponse'
-- Результат удаления товаров.
--

CREATE TABLE IF NOT EXISTS `DeleteOffersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат удаления товаров.';

--
-- Table structure for table `DeletePromoOffersRequest` generated from model 'DeletePromoOffersRequest'
-- Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
--

CREATE TABLE IF NOT EXISTS `DeletePromoOffersRequest` (
  `promoId` TEXT NOT NULL COMMENT 'Идентификатор акции.',
  `deleteAllOffers` TINYINT(1) DEFAULT NULL COMMENT 'Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;.',
  `offerIds` JSON DEFAULT NULL COMMENT 'Товары, которые нужно убрать из акции.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. ';

--
-- Table structure for table `DeletePromoOffersResponse` generated from model 'DeletePromoOffersResponse'
-- Результат удаления товаров из акции.
--

CREATE TABLE IF NOT EXISTS `DeletePromoOffersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат удаления товаров из акции.';

--
-- Table structure for table `DeletePromoOffersResultDTO` generated from model 'DeletePromoOffersResultDTO'
-- Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
--

CREATE TABLE IF NOT EXISTS `DeletePromoOffersResultDTO` (
  `rejectedOffers` JSON DEFAULT NULL COMMENT 'Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. ';

--
-- Table structure for table `DeliveryServiceDTO` generated from model 'DeliveryServiceDTO'
-- Служба доставки.
--

CREATE TABLE IF NOT EXISTS `DeliveryServiceDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор службы доставки.',
  `name` TEXT DEFAULT NULL COMMENT 'Наименование службы доставки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Служба доставки.';

--
-- Table structure for table `DeliveryServiceInfoDTO` generated from model 'DeliveryServiceInfoDTO'
-- Информация о службе доставки.
--

CREATE TABLE IF NOT EXISTS `DeliveryServiceInfoDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор службы доставки.',
  `name` TEXT NOT NULL COMMENT 'Наименование службы доставки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о службе доставки.';

--
-- Table structure for table `DeliveryServicesDTO` generated from model 'DeliveryServicesDTO'
-- Информация о службах доставки.
--

CREATE TABLE IF NOT EXISTS `DeliveryServicesDTO` (
  `deliveryService` JSON NOT NULL COMMENT 'Информация о службе доставки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о службах доставки.';

--
-- Table structure for table `DocumentDTO` generated from model 'DocumentDTO'
-- Информация о документе.
--

CREATE TABLE IF NOT EXISTS `DocumentDTO` (
  `status` TEXT DEFAULT NULL,
  `number` TEXT DEFAULT NULL COMMENT 'Номер документа.',
  `date` DATE DEFAULT NULL COMMENT 'Дата создания документа.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о документе.';

--
-- Table structure for table `EacVerificationResultDTO` generated from model 'EacVerificationResultDTO'
-- Результат выполнения запроса.
--

CREATE TABLE IF NOT EXISTS `EacVerificationResultDTO` (
  `verificationResult` TEXT DEFAULT NULL,
  `attemptsLeft` INT DEFAULT NULL COMMENT 'Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат выполнения запроса.';

--
-- Table structure for table `EmptyApiResponse` generated from model 'EmptyApiResponse'
-- Пустой ответ сервера.
--

CREATE TABLE IF NOT EXISTS `EmptyApiResponse` (
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Пустой ответ сервера.';

--
-- Table structure for table `EnrichedMappingsOfferDTO` generated from model 'EnrichedMappingsOfferDTO'
-- Информация о рекомендованных карточках товаров.
--

CREATE TABLE IF NOT EXISTS `EnrichedMappingsOfferDTO` (
  `name` TEXT DEFAULT NULL COMMENT 'Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ',
  `shopSku` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `category` TEXT DEFAULT NULL COMMENT 'Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. ',
  `vendor` TEXT DEFAULT NULL COMMENT 'Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.',
  `vendorCode` TEXT DEFAULT NULL COMMENT 'Артикул товара от производителя.',
  `description` TEXT DEFAULT NULL COMMENT 'Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ',
  `id` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `feedId` BIGINT DEFAULT NULL COMMENT 'Идентификатор фида.',
  `barcodes` JSON DEFAULT NULL COMMENT 'Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ',
  `urls` JSON DEFAULT NULL COMMENT 'URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ',
  `pictures` JSON DEFAULT NULL COMMENT 'Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. ',
  `manufacturer` TEXT DEFAULT NULL COMMENT 'Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ',
  `manufacturerCountries` JSON DEFAULT NULL COMMENT 'Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ',
  `minShipment` INT DEFAULT NULL COMMENT 'Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ',
  `transportUnitSize` INT DEFAULT NULL COMMENT 'Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ',
  `quantumOfSupply` INT DEFAULT NULL COMMENT 'Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ',
  `deliveryDurationDays` INT DEFAULT NULL COMMENT 'Срок, за который продавец поставляет товары на склад, в днях.',
  `boxCount` INT DEFAULT NULL COMMENT 'Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ',
  `customsCommodityCodes` JSON DEFAULT NULL COMMENT 'Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ',
  `weightDimensions` TEXT DEFAULT NULL,
  `supplyScheduleDays` JSON DEFAULT NULL COMMENT 'Дни недели, в которые продавец поставляет товары на склад.',
  `shelfLifeDays` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ',
  `lifeTimeDays` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ',
  `guaranteePeriodDays` INT DEFAULT NULL COMMENT 'Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ',
  `processingState` TEXT DEFAULT NULL,
  `availability` TEXT DEFAULT NULL,
  `shelfLife` TEXT DEFAULT NULL,
  `lifeTime` TEXT DEFAULT NULL,
  `guaranteePeriod` TEXT DEFAULT NULL,
  `certificate` TEXT DEFAULT NULL COMMENT 'Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) ',
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар в рублях.',
  `marketCategoryId` BIGINT DEFAULT NULL COMMENT 'Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. ',
  `marketCategoryName` TEXT DEFAULT NULL COMMENT 'Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. ',
  `marketModelId` BIGINT DEFAULT NULL COMMENT 'Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. ',
  `marketModelName` TEXT DEFAULT NULL COMMENT 'Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. ',
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.',
  `marketSkuName` TEXT DEFAULT NULL COMMENT 'Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о рекомендованных карточках товаров.';

--
-- Table structure for table `EnrichedModelDTO` generated from model 'EnrichedModelDTO'
-- Модель товара.
--

CREATE TABLE IF NOT EXISTS `EnrichedModelDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор модели товара.',
  `name` TEXT DEFAULT NULL COMMENT 'Название модели товара.',
  `prices` TEXT DEFAULT NULL,
  `offers` JSON DEFAULT NULL COMMENT 'Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. ',
  `offlineOffers` INT DEFAULT NULL COMMENT 'Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.',
  `onlineOffers` INT DEFAULT NULL COMMENT 'Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Модель товара.';

--
-- Table structure for table `EnrichedModelsDTO` generated from model 'EnrichedModelsDTO'
-- Список моделей товаров.
--

CREATE TABLE IF NOT EXISTS `EnrichedModelsDTO` (
  `models` JSON NOT NULL COMMENT 'Список моделей товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список моделей товаров.';

--
-- Table structure for table `EnrichedOrderBoxLayoutDTO` generated from model 'EnrichedOrderBoxLayoutDTO'
-- Информация о коробке.
--

CREATE TABLE IF NOT EXISTS `EnrichedOrderBoxLayoutDTO` (
  `items` JSON NOT NULL COMMENT 'Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ',
  `boxId` BIGINT DEFAULT NULL COMMENT 'Идентификатор коробки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о коробке.';

--
-- Table structure for table `ExtensionShipmentDTO` generated from model 'ExtensionShipmentDTO'
-- Информация об отгрузке.
--

CREATE TABLE IF NOT EXISTS `ExtensionShipmentDTO` (
  `currentStatus` TEXT DEFAULT NULL,
  `availableActions` JSON NOT NULL COMMENT 'Доступные действия над отгрузкой.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об отгрузке.';

--
-- Table structure for table `FeedContentDTO` generated from model 'FeedContentDTO'
-- Информация о проверке содержимого прайс-листа, загруженного на Маркет.
--

CREATE TABLE IF NOT EXISTS `FeedContentDTO` (
  `rejectedOffersCount` BIGINT DEFAULT NULL COMMENT 'Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. ',
  `status` TEXT DEFAULT NULL,
  `totalOffersCount` BIGINT DEFAULT NULL COMMENT 'Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;. ',
  `error` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о проверке содержимого прайс-листа, загруженного на Маркет.';

--
-- Table structure for table `FeedContentErrorDTO` generated from model 'FeedContentErrorDTO'
-- Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. 
--

CREATE TABLE IF NOT EXISTS `FeedContentErrorDTO` (
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. ';

--
-- Table structure for table `FeedDTO` generated from model 'FeedDTO'
-- Информация о прайс-листе.
--

CREATE TABLE IF NOT EXISTS `FeedDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор прайс-листа.',
  `login` TEXT DEFAULT NULL COMMENT 'Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ',
  `name` TEXT DEFAULT NULL COMMENT 'Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. ',
  `password` TEXT DEFAULT NULL COMMENT 'Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ',
  `uploadDate` DATETIME DEFAULT NULL COMMENT 'Дата загрузки прайс-листа на Маркет.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Параметр выводится при размещении прайс-листа на сервере Маркета. ',
  `url` TEXT DEFAULT NULL COMMENT 'URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. ',
  `content` TEXT DEFAULT NULL,
  `download` TEXT DEFAULT NULL,
  `placement` TEXT DEFAULT NULL,
  `publication` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о прайс-листе.';

--
-- Table structure for table `FeedDownloadDTO` generated from model 'FeedDownloadDTO'
-- Информация о последней загрузке прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedDownloadDTO` (
  `status` TEXT DEFAULT NULL,
  `error` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о последней загрузке прайс-листа.';

--
-- Table structure for table `FeedDownloadErrorDTO` generated from model 'FeedDownloadErrorDTO'
-- Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
--

CREATE TABLE IF NOT EXISTS `FeedDownloadErrorDTO` (
  `httpStatusCode` INT DEFAULT NULL COMMENT 'HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. ',
  `type` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL COMMENT 'Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. ';

--
-- Table structure for table `FeedIndexLogsErrorDTO` generated from model 'FeedIndexLogsErrorDTO'
-- Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). 
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsErrorDTO` (
  `httpStatusCode` INT DEFAULT NULL COMMENT 'HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. ',
  `type` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL COMMENT 'Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). ';

--
-- Table structure for table `FeedIndexLogsFeedDTO` generated from model 'FeedIndexLogsFeedDTO'
-- Информация о прайс-листе.
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsFeedDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор прайс-листа.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о прайс-листе.';

--
-- Table structure for table `FeedIndexLogsOffersDTO` generated from model 'FeedIndexLogsOffersDTO'
-- Информация о предложениях прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsOffersDTO` (
  `rejectedCount` BIGINT DEFAULT NULL COMMENT 'Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.',
  `totalCount` BIGINT DEFAULT NULL COMMENT 'Количество предложений в прайс-листе.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о предложениях прайс-листа.';

--
-- Table structure for table `FeedIndexLogsRecordDTO` generated from model 'FeedIndexLogsRecordDTO'
-- Список отчетов по индексации прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsRecordDTO` (
  `downloadTime` DATETIME DEFAULT NULL COMMENT 'Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. ',
  `fileTime` DATETIME DEFAULT NULL COMMENT 'Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. ',
  `generationId` BIGINT DEFAULT NULL COMMENT 'Идентификатор индексации.',
  `indexType` TEXT DEFAULT NULL,
  `publishedTime` DATETIME DEFAULT NULL COMMENT 'Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. ',
  `status` TEXT DEFAULT NULL,
  `error` TEXT DEFAULT NULL,
  `offers` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список отчетов по индексации прайс-листа.';

--
-- Table structure for table `FeedIndexLogsResultDTO` generated from model 'FeedIndexLogsResultDTO'
-- Результат выполнения запроса отчета по индексации прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedIndexLogsResultDTO` (
  `feed` TEXT DEFAULT NULL,
  `indexLogRecords` JSON NOT NULL COMMENT 'Список отчетов по индексации прайс-листа.',
  `total` BIGINT DEFAULT NULL COMMENT 'Количество отчетов на всех страницах выходных данных.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат выполнения запроса отчета по индексации прайс-листа.';

--
-- Table structure for table `FeedParameterDTO` generated from model 'FeedParameterDTO'
-- Параметр прайс-листа.
--

CREATE TABLE IF NOT EXISTS `FeedParameterDTO` (
  `deleted` TINYINT(1) DEFAULT NULL COMMENT 'Удалить ли значение параметра.  Возможное значение: * &#x60;true&#x60; — удалить значение параметра.  Используется вместе с параметром &#x60;name&#x60;. ',
  `name` TEXT NOT NULL COMMENT 'Название параметра.  Возможное значение: - &#x60;reparseIntervalMinutes&#x60; — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре &#x60;value&#x60;. Например, при &#x60;value&#x3D;1440&#x60;, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. ',
  `values` JSON DEFAULT NULL COMMENT 'Значения параметра.  Используется вместе с параметром &#x60;name&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметр прайс-листа.';

--
-- Table structure for table `FeedPlacementDTO` generated from model 'FeedPlacementDTO'
-- Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
--

CREATE TABLE IF NOT EXISTS `FeedPlacementDTO` (
  `status` TEXT DEFAULT NULL,
  `totalOffersCount` INT DEFAULT NULL COMMENT 'Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.';

--
-- Table structure for table `FeedPublicationDTO` generated from model 'FeedPublicationDTO'
-- Информация о последней публикации предложений из прайс-листа на Маркете.
--

CREATE TABLE IF NOT EXISTS `FeedPublicationDTO` (
  `status` TEXT DEFAULT NULL,
  `full` TEXT DEFAULT NULL,
  `priceAndStockUpdate` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о последней публикации предложений из прайс-листа на Маркете.';

--
-- Table structure for table `FeedPublicationFullDTO` generated from model 'FeedPublicationFullDTO'
-- Информация о последней публикации предложений из прайс-листа на Маркете. 
--

CREATE TABLE IF NOT EXISTS `FeedPublicationFullDTO` (
  `fileTime` DATETIME DEFAULT NULL COMMENT 'Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. ',
  `publishedTime` DATETIME DEFAULT NULL COMMENT 'Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о последней публикации предложений из прайс-листа на Маркете. ';

--
-- Table structure for table `FeedPublicationPriceAndStockUpdateDTO` generated from model 'FeedPublicationPriceAndStockUpdateDTO'
-- Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
--

CREATE TABLE IF NOT EXISTS `FeedPublicationPriceAndStockUpdateDTO` (
  `fileTime` DATETIME DEFAULT NULL COMMENT 'Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. ',
  `publishedTime` DATETIME DEFAULT NULL COMMENT 'Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. ';

--
-- Table structure for table `FeedbackAuthorDTO` generated from model 'FeedbackAuthorDTO'
-- Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
--

CREATE TABLE IF NOT EXISTS `FeedbackAuthorDTO` (
  `name` TEXT DEFAULT NULL COMMENT 'Имя автора отзыва.',
  `region` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. ';

--
-- Table structure for table `FeedbackCommentAuthorDTO` generated from model 'FeedbackCommentAuthorDTO'
-- Информация об авторе комментария.
--

CREATE TABLE IF NOT EXISTS `FeedbackCommentAuthorDTO` (
  `type` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Имя автора отзыва или название магазина.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об авторе комментария.';

--
-- Table structure for table `FeedbackCommentDTO` generated from model 'FeedbackCommentDTO'
-- Комментарий к отзыву на магазин.
--

CREATE TABLE IF NOT EXISTS `FeedbackCommentDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор ответа.',
  `parentId` BIGINT DEFAULT NULL COMMENT 'Идентификатор родительского ответа.',
  `body` TEXT DEFAULT NULL COMMENT 'Текст ответа.',
  `createdAt` DATETIME DEFAULT NULL COMMENT 'Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. ',
  `updatedAt` DATETIME DEFAULT NULL COMMENT 'Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. ',
  `author` TEXT DEFAULT NULL,
  `children` JSON DEFAULT NULL COMMENT 'Дочерние ответы.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Комментарий к отзыву на магазин.';

--
-- Table structure for table `FeedbackDTO` generated from model 'FeedbackDTO'
-- Отзыв пользователя Яндекс Маркета об указанном магазине.
--

CREATE TABLE IF NOT EXISTS `FeedbackDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор отзыва.',
  `createdAt` DATETIME DEFAULT NULL COMMENT 'Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. ',
  `text` TEXT DEFAULT NULL COMMENT 'Комментарий автора отзыва.',
  `state` TEXT DEFAULT NULL,
  `author` TEXT DEFAULT NULL,
  `pro` TEXT DEFAULT NULL COMMENT 'Достоинства магазина, описанные в отзыве.',
  `contra` TEXT DEFAULT NULL COMMENT 'Недостатки магазина, описанные в отзыве.',
  `comments` JSON NOT NULL COMMENT 'Переписка автора отзыва с магазином.',
  `shop` TEXT DEFAULT NULL,
  `resolved` TINYINT(1) DEFAULT NULL COMMENT 'Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. ',
  `verified` TINYINT(1) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. ',
  `recommend` TINYINT(1) DEFAULT NULL COMMENT 'Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. ',
  `grades` TEXT DEFAULT NULL,
  `order` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Отзыв пользователя Яндекс Маркета об указанном магазине.';

--
-- Table structure for table `FeedbackFactorDTO` generated from model 'FeedbackFactorDTO'
-- Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
--

CREATE TABLE IF NOT EXISTS `FeedbackFactorDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор параметра.',
  `title` TEXT DEFAULT NULL COMMENT 'Название параметра. Например, &#x60;Скорость обработки заказа&#x60;.',
  `description` TEXT DEFAULT NULL COMMENT 'Описание параметра. Например, &#x60;Как быстро с вами связались для подтверждения заказа?&#x60;.',
  `value` INT DEFAULT NULL COMMENT 'Оценка по параметру, указанная в отзыве: от &#x60;1&#x60; (низшая оценка) до &#x60;5&#x60; (высшая оценка). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. ';

--
-- Table structure for table `FeedbackGradesDTO` generated from model 'FeedbackGradesDTO'
-- Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
--

CREATE TABLE IF NOT EXISTS `FeedbackGradesDTO` (
  `average` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Общая оценка, указанная в отзыве: от &#x60;1&#x60; («Ужасный магазин») до &#x60;5&#x60; («Отличный магазин»).',
  `agreeCount` BIGINT DEFAULT NULL COMMENT 'Количество пользователей, считающих отзыв полезным.',
  `rejectCount` BIGINT DEFAULT NULL COMMENT 'Количество пользователей, считающих отзыв бесполезным.',
  `factors` JSON NOT NULL COMMENT 'Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.';

--
-- Table structure for table `FeedbackListDTO` generated from model 'FeedbackListDTO'
-- Отзывы пользователей Яндекс Маркета об указанном магазине.
--

CREATE TABLE IF NOT EXISTS `FeedbackListDTO` (
  `paging` TEXT DEFAULT NULL,
  `feedbackList` JSON NOT NULL COMMENT 'Список отзывов.  Содержит не более 20 отзывов. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Отзывы пользователей Яндекс Маркета об указанном магазине.';

--
-- Table structure for table `FeedbackOrderDTO` generated from model 'FeedbackOrderDTO'
-- Информация о заказе, указанная в отзыве.
--

CREATE TABLE IF NOT EXISTS `FeedbackOrderDTO` (
  `shopOrderId` TEXT DEFAULT NULL COMMENT 'Номер заказа, указанный в отзыве.',
  `delivery` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о заказе, указанная в отзыве.';

--
-- Table structure for table `FeedbackShopDTO` generated from model 'FeedbackShopDTO'
-- Информация о магазине.
--

CREATE TABLE IF NOT EXISTS `FeedbackShopDTO` (
  `name` TEXT DEFAULT NULL COMMENT 'Название магазина.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о магазине.';

--
-- Table structure for table `FlippingPagerDTO` generated from model 'FlippingPagerDTO'
-- Модель для пагинации.
--

CREATE TABLE IF NOT EXISTS `FlippingPagerDTO` (
  `total` INT DEFAULT NULL COMMENT 'Сколько всего найдено элементов.',
  `from` INT DEFAULT NULL COMMENT 'Начальный номер найденного элемента на странице.',
  `to` INT DEFAULT NULL COMMENT 'Конечный номер найденного элемента на странице.',
  `currentPage` INT DEFAULT NULL COMMENT 'Текущая страница.',
  `pagesCount` INT DEFAULT NULL COMMENT 'Общее количество страниц.',
  `pageSize` INT DEFAULT NULL COMMENT 'Размер страницы.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Модель для пагинации.';

--
-- Table structure for table `ForwardScrollingPagerDTO` generated from model 'ForwardScrollingPagerDTO'
-- Ссылка на следующую страницу. 
--

CREATE TABLE IF NOT EXISTS `ForwardScrollingPagerDTO` (
  `nextPageToken` TEXT DEFAULT NULL COMMENT 'Идентификатор следующей страницы результатов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ссылка на следующую страницу. ';

--
-- Table structure for table `FulfillmentWarehouseDTO` generated from model 'FulfillmentWarehouseDTO'
-- Склад Маркета (FBY).
--

CREATE TABLE IF NOT EXISTS `FulfillmentWarehouseDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор склада.',
  `name` TEXT NOT NULL COMMENT 'Название склада.',
  `address` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Склад Маркета (FBY).';

--
-- Table structure for table `FulfillmentWarehousesDTO` generated from model 'FulfillmentWarehousesDTO'
-- Список складов Маркета (FBY).
--

CREATE TABLE IF NOT EXISTS `FulfillmentWarehousesDTO` (
  `warehouses` JSON NOT NULL COMMENT 'Список складов Маркета (FBY).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список складов Маркета (FBY).';

--
-- Table structure for table `FullOutletDTO` generated from model 'FullOutletDTO'
-- Информация о точке продаж.
--

CREATE TABLE IF NOT EXISTS `FullOutletDTO` (
  `name` TEXT NOT NULL COMMENT 'Название точки продаж. ',
  `type` TEXT NOT NULL,
  `coords` TEXT DEFAULT NULL COMMENT 'Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. ',
  `isMain` TINYINT(1) DEFAULT NULL COMMENT 'Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. ',
  `shopOutletCode` TEXT DEFAULT NULL COMMENT 'Идентификатор точки продаж, присвоенный магазином.',
  `visibility` TEXT DEFAULT NULL,
  `address` TEXT NOT NULL,
  `phones` JSON NOT NULL COMMENT 'Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. ',
  `workingSchedule` TEXT NOT NULL,
  `deliveryRules` JSON DEFAULT NULL COMMENT 'Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. ',
  `storagePeriod` BIGINT DEFAULT NULL COMMENT 'Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.',
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор точки продаж, присвоенный Маркетом.',
  `status` TEXT DEFAULT NULL,
  `region` TEXT DEFAULT NULL,
  `shopOutletId` TEXT DEFAULT NULL COMMENT 'Идентификатор точки продаж, заданный магазином.',
  `workingTime` TEXT DEFAULT NULL COMMENT 'Рабочее время.',
  `moderationReason` TEXT DEFAULT NULL COMMENT 'Статус модерации.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о точке продаж.';

--
-- Table structure for table `FullOutletLicenseDTO` generated from model 'FullOutletLicenseDTO'
-- Информация о лицензии.
--

CREATE TABLE IF NOT EXISTS `FullOutletLicenseDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;. ',
  `outletId` BIGINT DEFAULT NULL COMMENT 'Идентификатор точки продаж, для которой действительна лицензия.',
  `licenseType` TEXT DEFAULT NULL,
  `number` TEXT DEFAULT NULL COMMENT 'Номер лицензии.',
  `dateOfIssue` DATETIME DEFAULT NULL COMMENT 'Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;. ',
  `dateOfExpiry` DATETIME DEFAULT NULL COMMENT 'Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;. ',
  `checkStatus` TEXT DEFAULT NULL,
  `checkComment` TEXT DEFAULT NULL COMMENT 'Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр &#x60;checkStatus&#x60; имеет значение &#x60;FAIL&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о лицензии.';

--
-- Table structure for table `GenerateBoostConsolidatedRequest` generated from model 'GenerateBoostConsolidatedRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateBoostConsolidatedRequest` (
  `businessId` BIGINT NOT NULL COMMENT 'Идентификатор бизнеса.',
  `dateFrom` DATE NOT NULL COMMENT 'Начало периода, включительно.',
  `dateTo` DATE NOT NULL COMMENT 'Конец периода, включительно.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета. ';

--
-- Table structure for table `GenerateCompetitorsPositionReportRequest` generated from model 'GenerateCompetitorsPositionReportRequest'
-- Данные, необходимые для генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateCompetitorsPositionReportRequest` (
  `businessId` BIGINT NOT NULL COMMENT 'Идентификатор бизнеса.',
  `categoryId` BIGINT NOT NULL COMMENT 'Идентификатор категории.',
  `dateFrom` DATE NOT NULL COMMENT 'Начало периода, включительно.',
  `dateTo` DATE NOT NULL COMMENT 'Конец периода, включительно.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета.';

--
-- Table structure for table `GenerateGoodsFeedbackRequest` generated from model 'GenerateGoodsFeedbackRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateGoodsFeedbackRequest` (
  `businessId` BIGINT NOT NULL COMMENT 'Идентификатор бизнеса.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета. ';

--
-- Table structure for table `GenerateGoodsMovementReportRequest` generated from model 'GenerateGoodsMovementReportRequest'
-- Данные, необходимые для генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateGoodsMovementReportRequest` (
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор кампании.',
  `dateFrom` DATE NOT NULL COMMENT 'Начало периода, включительно.',
  `dateTo` DATE NOT NULL COMMENT 'Конец периода, включительно.',
  `shopSku` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета.';

--
-- Table structure for table `GenerateGoodsRealizationReportRequest` generated from model 'GenerateGoodsRealizationReportRequest'
-- Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
--

CREATE TABLE IF NOT EXISTS `GenerateGoodsRealizationReportRequest` (
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор кампании.',
  `year` INT NOT NULL COMMENT 'Год.',
  `month` TINYINT UNSIGNED NOT NULL COMMENT 'Номер месяца.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. ';

--
-- Table structure for table `GenerateGoodsTurnoverRequest` generated from model 'GenerateGoodsTurnoverRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateGoodsTurnoverRequest` (
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор кампании.',
  `date` DATE DEFAULT NULL COMMENT 'Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета. ';

--
-- Table structure for table `GenerateMassOrderLabelsRequest` generated from model 'GenerateMassOrderLabelsRequest'
-- Данные, необходимые для генерации файла. 
--

CREATE TABLE IF NOT EXISTS `GenerateMassOrderLabelsRequest` (
  `businessId` BIGINT NOT NULL COMMENT 'Идентификатор кабинета.',
  `orderIds` JSON NOT NULL COMMENT 'Список идентификаторов заказов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации файла. ';

--
-- Table structure for table `GeneratePricesReportRequest` generated from model 'GeneratePricesReportRequest'
-- Данные, необходимые для генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GeneratePricesReportRequest` (
  `businessId` BIGINT DEFAULT NULL COMMENT 'Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;. ',
  `campaignId` BIGINT DEFAULT NULL COMMENT 'Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно. ',
  `categoryIds` JSON DEFAULT NULL COMMENT 'Фильтр по категориям на Маркете.',
  `creationDateFrom` DATE DEFAULT NULL COMMENT 'Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. ',
  `creationDateTo` DATE DEFAULT NULL COMMENT 'Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета.';

--
-- Table structure for table `GenerateReportDTO` generated from model 'GenerateReportDTO'
-- Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateReportDTO` (
  `reportId` TEXT NOT NULL COMMENT 'Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.',
  `estimatedGenerationTime` BIGINT NOT NULL COMMENT 'Ожидаемая продолжительность генерации в миллисекундах.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.';

--
-- Table structure for table `GenerateReportResponse` generated from model 'GenerateReportResponse'
-- Ответ на запрос генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateReportResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос генерации отчета.';

--
-- Table structure for table `GenerateShelfsStatisticsRequest` generated from model 'GenerateShelfsStatisticsRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateShelfsStatisticsRequest` (
  `businessId` BIGINT NOT NULL COMMENT 'Идентификатор бизнеса.',
  `dateFrom` DATE NOT NULL COMMENT 'Начало периода, включительно.',
  `dateTo` DATE NOT NULL COMMENT 'Конец периода, включительно.',
  `attributionType` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета. ';

--
-- Table structure for table `GenerateShipmentListDocumentReportRequest` generated from model 'GenerateShipmentListDocumentReportRequest'
-- Данные, необходимые для генерации документа. 
--

CREATE TABLE IF NOT EXISTS `GenerateShipmentListDocumentReportRequest` (
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор кампании.',
  `shipmentId` BIGINT DEFAULT NULL COMMENT 'Идентификатор отгрузки.',
  `orderIds` JSON DEFAULT NULL COMMENT 'Фильтр по идентификаторам заказа в отгрузке.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации документа. ';

--
-- Table structure for table `GenerateShowsSalesReportRequest` generated from model 'GenerateShowsSalesReportRequest'
-- Данные, необходимые для генерации отчета.
--

CREATE TABLE IF NOT EXISTS `GenerateShowsSalesReportRequest` (
  `businessId` BIGINT DEFAULT NULL COMMENT 'Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. ',
  `campaignId` BIGINT DEFAULT NULL COMMENT 'Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу. ',
  `dateFrom` DATE NOT NULL COMMENT 'Начало периода, включительно.',
  `dateTo` DATE NOT NULL COMMENT 'Конец периода, включительно.',
  `grouping` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета.';

--
-- Table structure for table `GenerateStocksOnWarehousesReportRequest` generated from model 'GenerateStocksOnWarehousesReportRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateStocksOnWarehousesReportRequest` (
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор магазина.',
  `warehouseIds` JSON DEFAULT NULL COMMENT 'Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).',
  `reportDate` DATE DEFAULT NULL COMMENT 'Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.',
  `categoryIds` JSON DEFAULT NULL COMMENT 'Фильтр по категориям на Маркете (кроме модели FBY).',
  `hasStocks` TINYINT(1) DEFAULT NULL COMMENT 'Фильтр по наличию остатков (кроме модели FBY).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета. ';

--
-- Table structure for table `GenerateUnitedMarketplaceServicesReportRequest` generated from model 'GenerateUnitedMarketplaceServicesReportRequest'
-- Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
--

CREATE TABLE IF NOT EXISTS `GenerateUnitedMarketplaceServicesReportRequest` (
  `businessId` BIGINT NOT NULL COMMENT 'Идентификатор бизнеса.',
  `dateTimeFrom` DATETIME DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ',
  `dateTimeTo` DATETIME DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ',
  `dateFrom` DATE DEFAULT NULL COMMENT 'Начало периода, включительно.',
  `dateTo` DATE DEFAULT NULL COMMENT 'Конец периода, включительно. Максимальный период — 1 год.',
  `yearFrom` INT DEFAULT NULL COMMENT 'Начальный год формирования акта.',
  `monthFrom` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Начальный номер месяца формирования акта.',
  `yearTo` INT DEFAULT NULL COMMENT 'Конечный год формирования акта.',
  `monthTo` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Конечный номер месяца формирования акта.',
  `placementPrograms` JSON DEFAULT NULL COMMENT 'Список моделей, которые нужны в отчете. ',
  `inns` JSON DEFAULT NULL COMMENT 'Список ИНН, которые нужны в отчете.',
  `campaignIds` JSON DEFAULT NULL COMMENT 'Список магазинов, которые нужны в отчете.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ';

--
-- Table structure for table `GenerateUnitedNettingReportRequest` generated from model 'GenerateUnitedNettingReportRequest'
-- Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
--

CREATE TABLE IF NOT EXISTS `GenerateUnitedNettingReportRequest` (
  `businessId` BIGINT NOT NULL COMMENT 'Идентификатор бизнеса.',
  `dateTimeFrom` DATETIME DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ',
  `dateTimeTo` DATETIME DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ',
  `dateFrom` DATE DEFAULT NULL COMMENT 'Начало периода, включительно.',
  `dateTo` DATE DEFAULT NULL COMMENT 'Конец периода, включительно. Максимальный период — 1 год.',
  `bankOrderId` BIGINT DEFAULT NULL COMMENT 'Номер платежного поручения.',
  `bankOrderDateTime` DATETIME DEFAULT NULL COMMENT 'Дата платежного поручения.',
  `placementPrograms` JSON DEFAULT NULL COMMENT 'Список моделей, которые нужны в отчете. ',
  `inns` JSON DEFAULT NULL COMMENT 'Список ИНН, которые нужны в отчете.',
  `campaignIds` JSON DEFAULT NULL COMMENT 'Список магазинов, которые нужны в отчете.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. ';

--
-- Table structure for table `GenerateUnitedOrdersRequest` generated from model 'GenerateUnitedOrdersRequest'
-- Данные, необходимые для генерации отчета. 
--

CREATE TABLE IF NOT EXISTS `GenerateUnitedOrdersRequest` (
  `businessId` BIGINT NOT NULL COMMENT 'Идентификатор бизнеса.',
  `dateFrom` DATE NOT NULL COMMENT 'Начало периода, включительно.',
  `dateTo` DATE NOT NULL COMMENT 'Конец периода, включительно. Максимальный период — 1 год.',
  `campaignIds` JSON DEFAULT NULL COMMENT 'Список магазинов, которые нужны в отчете.',
  `promoId` TEXT DEFAULT NULL COMMENT 'Идентификатор акции, товары из которой нужны в отчете.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные, необходимые для генерации отчета. ';

--
-- Table structure for table `GetAllOffersResponse` generated from model 'GetAllOffersResponse'
-- Список предложений.
--

CREATE TABLE IF NOT EXISTS `GetAllOffersResponse` (
  `offers` JSON NOT NULL COMMENT 'Список предложений магазина.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список предложений.';

--
-- Table structure for table `GetBidsInfoRequest` generated from model 'GetBidsInfoRequest'
-- description.
--

CREATE TABLE IF NOT EXISTS `GetBidsInfoRequest` (
  `skus` JSON DEFAULT NULL COMMENT 'Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры &#x60;page_token&#x60; и &#x60;limit&#x60; игнорируются. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='description.';

--
-- Table structure for table `GetBidsInfoResponse` generated from model 'GetBidsInfoResponse'
-- description.
--

CREATE TABLE IF NOT EXISTS `GetBidsInfoResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='description.';

--
-- Table structure for table `GetBidsInfoResponseDTO` generated from model 'GetBidsInfoResponseDTO'
-- Список товаров с указанными ставками.
--

CREATE TABLE IF NOT EXISTS `GetBidsInfoResponseDTO` (
  `bids` JSON NOT NULL COMMENT 'Страница списка товаров.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров с указанными ставками.';

--
-- Table structure for table `GetBidsRecommendationsRequest` generated from model 'GetBidsRecommendationsRequest'
-- description.
--

CREATE TABLE IF NOT EXISTS `GetBidsRecommendationsRequest` (
  `skus` JSON NOT NULL COMMENT 'Список товаров, для которых нужно получить рекомендации по ставкам. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='description.';

--
-- Table structure for table `GetBidsRecommendationsResponse` generated from model 'GetBidsRecommendationsResponse'
-- description.
--

CREATE TABLE IF NOT EXISTS `GetBidsRecommendationsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='description.';

--
-- Table structure for table `GetBidsRecommendationsResponseDTO` generated from model 'GetBidsRecommendationsResponseDTO'
-- Список товаров с рекомендованными ставками.
--

CREATE TABLE IF NOT EXISTS `GetBidsRecommendationsResponseDTO` (
  `recommendations` JSON NOT NULL COMMENT 'Список товаров с рекомендованными ставками.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров с рекомендованными ставками.';

--
-- Table structure for table `GetBusinessBuyerInfoResponse` generated from model 'GetBusinessBuyerInfoResponse'
--

CREATE TABLE IF NOT EXISTS `GetBusinessBuyerInfoResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetBusinessDocumentsInfoResponse` generated from model 'GetBusinessDocumentsInfoResponse'
--

CREATE TABLE IF NOT EXISTS `GetBusinessDocumentsInfoResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetBusinessSettingsInfoDTO` generated from model 'GetBusinessSettingsInfoDTO'
-- Информация о кабинете и его настройках.
--

CREATE TABLE IF NOT EXISTS `GetBusinessSettingsInfoDTO` (
  `info` TEXT DEFAULT NULL,
  `settings` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о кабинете и его настройках.';

--
-- Table structure for table `GetBusinessSettingsResponse` generated from model 'GetBusinessSettingsResponse'
-- Ответ на запрос настроек кабинета.
--

CREATE TABLE IF NOT EXISTS `GetBusinessSettingsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос настроек кабинета.';

--
-- Table structure for table `GetCampaignLoginsResponse` generated from model 'GetCampaignLoginsResponse'
-- Ответ на запрос списка логинов, связанных с магазином.
--

CREATE TABLE IF NOT EXISTS `GetCampaignLoginsResponse` (
  `logins` JSON NOT NULL COMMENT 'Список логинов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка логинов, связанных с магазином.';

--
-- Table structure for table `GetCampaignOfferDTO` generated from model 'GetCampaignOfferDTO'
-- Параметры размещения товара в магазине.
--

CREATE TABLE IF NOT EXISTS `GetCampaignOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `quantum` TEXT DEFAULT NULL,
  `available` TINYINT(1) DEFAULT NULL COMMENT 'Есть ли товар в продаже. ',
  `basicPrice` TEXT DEFAULT NULL,
  `campaignPrice` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Ошибки, препятствующие размещению товара на витрине. ',
  `warnings` JSON DEFAULT NULL COMMENT 'Предупреждения, не препятствующие размещению товара на витрине. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры размещения товара в магазине.';

--
-- Table structure for table `GetCampaignOffersRequest` generated from model 'GetCampaignOffersRequest'
-- Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
--

CREATE TABLE IF NOT EXISTS `GetCampaignOffersRequest` (
  `offerIds` JSON DEFAULT NULL COMMENT 'Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    ',
  `statuses` JSON DEFAULT NULL COMMENT 'Фильтр по статусам товаров. ',
  `categoryIds` JSON DEFAULT NULL COMMENT 'Фильтр по категориям на Маркете.',
  `vendorNames` JSON DEFAULT NULL COMMENT 'Фильтр по брендам.',
  `tags` JSON DEFAULT NULL COMMENT 'Фильтр по тегам.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ';

--
-- Table structure for table `GetCampaignOffersResponse` generated from model 'GetCampaignOffersResponse'
-- Ответ на запрос списка товаров в магазине.
--

CREATE TABLE IF NOT EXISTS `GetCampaignOffersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка товаров в магазине.';

--
-- Table structure for table `GetCampaignOffersResultDTO` generated from model 'GetCampaignOffersResultDTO'
-- Список товаров в заданном магазине.
--

CREATE TABLE IF NOT EXISTS `GetCampaignOffersResultDTO` (
  `paging` TEXT DEFAULT NULL,
  `offers` JSON NOT NULL COMMENT 'Страница списка товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров в заданном магазине.';

--
-- Table structure for table `GetCampaignRegionResponse` generated from model 'GetCampaignRegionResponse'
-- Ответ на запрос региона магазина.
--

CREATE TABLE IF NOT EXISTS `GetCampaignRegionResponse` (
  `region` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос региона магазина.';

--
-- Table structure for table `GetCampaignResponse` generated from model 'GetCampaignResponse'
-- Информация о магазине к данным идентификатора кампании.
--

CREATE TABLE IF NOT EXISTS `GetCampaignResponse` (
  `campaign` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о магазине к данным идентификатора кампании.';

--
-- Table structure for table `GetCampaignSettingsResponse` generated from model 'GetCampaignSettingsResponse'
-- Ответ на запрос настроек магазина.
--

CREATE TABLE IF NOT EXISTS `GetCampaignSettingsResponse` (
  `settings` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос настроек магазина.';

--
-- Table structure for table `GetCampaignsResponse` generated from model 'GetCampaignsResponse'
-- Результаты поиска магазинов.
--

CREATE TABLE IF NOT EXISTS `GetCampaignsResponse` (
  `campaigns` JSON NOT NULL COMMENT 'Список с информацией по каждому магазину.',
  `pager` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результаты поиска магазинов.';

--
-- Table structure for table `GetCategoriesMaxSaleQuantumDTO` generated from model 'GetCategoriesMaxSaleQuantumDTO'
-- Категории и лимит на установку кванта и минимального количества товаров.
--

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumDTO` (
  `results` JSON NOT NULL COMMENT 'Категории и лимит на установку кванта и минимального количества товаров.',
  `errors` JSON DEFAULT NULL COMMENT 'Ошибки, которые появились из-за переданных категорий.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Категории и лимит на установку кванта и минимального количества товаров.';

--
-- Table structure for table `GetCategoriesMaxSaleQuantumRequest` generated from model 'GetCategoriesMaxSaleQuantumRequest'
-- Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
--

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumRequest` (
  `marketCategoryIds` JSON NOT NULL COMMENT 'Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. ';

--
-- Table structure for table `GetCategoriesMaxSaleQuantumResponse` generated from model 'GetCategoriesMaxSaleQuantumResponse'
--

CREATE TABLE IF NOT EXISTS `GetCategoriesMaxSaleQuantumResponse` (
  `status` TEXT DEFAULT NULL,
  `results` JSON NOT NULL COMMENT 'Категории и лимит на установку кванта и минимального количества товаров.',
  `errors` JSON DEFAULT NULL COMMENT 'Ошибки, которые появились из-за переданных категорий.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetCategoriesRequest` generated from model 'GetCategoriesRequest'
-- Параметры запроса категорий. 
--

CREATE TABLE IF NOT EXISTS `GetCategoriesRequest` (
  `language` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры запроса категорий. ';

--
-- Table structure for table `GetCategoriesResponse` generated from model 'GetCategoriesResponse'
--

CREATE TABLE IF NOT EXISTS `GetCategoriesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetCategoryContentParametersResponse` generated from model 'GetCategoryContentParametersResponse'
-- Ответ со списком характеристик для категории и их допустимыми значениями.
--

CREATE TABLE IF NOT EXISTS `GetCategoryContentParametersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ со списком характеристик для категории и их допустимыми значениями.';

--
-- Table structure for table `GetChatHistoryRequest` generated from model 'GetChatHistoryRequest'
-- Историю какого чата нужно получить — и начиная с какого сообщения. 
--

CREATE TABLE IF NOT EXISTS `GetChatHistoryRequest` (
  `messageIdFrom` BIGINT DEFAULT NULL COMMENT 'Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Историю какого чата нужно получить — и начиная с какого сообщения. ';

--
-- Table structure for table `GetChatHistoryResponse` generated from model 'GetChatHistoryResponse'
--

CREATE TABLE IF NOT EXISTS `GetChatHistoryResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetChatInfoDTO` generated from model 'GetChatInfoDTO'
-- Информация о чатах.
--

CREATE TABLE IF NOT EXISTS `GetChatInfoDTO` (
  `chatId` BIGINT NOT NULL COMMENT 'Идентификатор чата.',
  `orderId` BIGINT NOT NULL COMMENT 'Идентификатор заказа.',
  `type` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `createdAt` DATETIME NOT NULL COMMENT 'Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. ',
  `updatedAt` DATETIME NOT NULL COMMENT 'Дата и время последнего сообщения в чате.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о чатах.';

--
-- Table structure for table `GetChatsInfoDTO` generated from model 'GetChatsInfoDTO'
-- Список чатов.
--

CREATE TABLE IF NOT EXISTS `GetChatsInfoDTO` (
  `chats` JSON NOT NULL COMMENT 'Информация о чатах.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список чатов.';

--
-- Table structure for table `GetChatsRequest` generated from model 'GetChatsRequest'
-- Фильтры по чатам, которые нужно вернуть. 
--

CREATE TABLE IF NOT EXISTS `GetChatsRequest` (
  `orderIds` JSON DEFAULT NULL COMMENT 'Фильтр по идентификаторам заказов на Маркете.',
  `types` JSON DEFAULT NULL COMMENT 'Фильтр по типам чатов.',
  `statuses` JSON DEFAULT NULL COMMENT 'Фильтр по статусам чатов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтры по чатам, которые нужно вернуть. ';

--
-- Table structure for table `GetChatsResponse` generated from model 'GetChatsResponse'
--

CREATE TABLE IF NOT EXISTS `GetChatsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetDeliveryServicesResponse` generated from model 'GetDeliveryServicesResponse'
-- Ответ на запрос списка служб доставки.
--

CREATE TABLE IF NOT EXISTS `GetDeliveryServicesResponse` (
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка служб доставки.';

--
-- Table structure for table `GetFeedIndexLogsResponse` generated from model 'GetFeedIndexLogsResponse'
--

CREATE TABLE IF NOT EXISTS `GetFeedIndexLogsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetFeedResponse` generated from model 'GetFeedResponse'
-- Ответ на запрос информации о прайс-листе.
--

CREATE TABLE IF NOT EXISTS `GetFeedResponse` (
  `feed` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос информации о прайс-листе.';

--
-- Table structure for table `GetFeedbackListResponse` generated from model 'GetFeedbackListResponse'
--

CREATE TABLE IF NOT EXISTS `GetFeedbackListResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetFeedsResponse` generated from model 'GetFeedsResponse'
-- Ответ на запрос списка прайс-листов.
--

CREATE TABLE IF NOT EXISTS `GetFeedsResponse` (
  `feeds` JSON NOT NULL COMMENT 'Список прайс-листов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка прайс-листов.';

--
-- Table structure for table `GetFulfillmentWarehousesResponse` generated from model 'GetFulfillmentWarehousesResponse'
--

CREATE TABLE IF NOT EXISTS `GetFulfillmentWarehousesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetGoodsFeedbackCommentsRequest` generated from model 'GetGoodsFeedbackCommentsRequest'
-- Фильтр запроса комментариев отзыва. 
--

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackCommentsRequest` (
  `feedbackId` BIGINT NOT NULL COMMENT 'Идентификатор отзыва. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтр запроса комментариев отзыва. ';

--
-- Table structure for table `GetGoodsFeedbackCommentsResponse` generated from model 'GetGoodsFeedbackCommentsResponse'
--

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackCommentsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetGoodsFeedbackRequest` generated from model 'GetGoodsFeedbackRequest'
-- Фильтр запроса отзывов в кабинете. 
--

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackRequest` (
  `dateTimeFrom` DATETIME DEFAULT NULL COMMENT 'Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты. ',
  `dateTimeTo` DATETIME DEFAULT NULL COMMENT 'Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. ',
  `reactionStatus` TEXT DEFAULT NULL,
  `ratingValues` JSON DEFAULT NULL COMMENT 'Оценка товара.',
  `modelIds` JSON DEFAULT NULL COMMENT 'Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). ',
  `paid` TINYINT(1) DEFAULT NULL COMMENT 'Фильтр отзывов за баллы Плюса.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтр запроса отзывов в кабинете. ';

--
-- Table structure for table `GetGoodsFeedbackResponse` generated from model 'GetGoodsFeedbackResponse'
--

CREATE TABLE IF NOT EXISTS `GetGoodsFeedbackResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetGoodsStatsRequest` generated from model 'GetGoodsStatsRequest'
-- Запрос отчета по товарам.
--

CREATE TABLE IF NOT EXISTS `GetGoodsStatsRequest` (
  `shopSkus` JSON NOT NULL COMMENT 'Список ваших идентификаторов SKU. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос отчета по товарам.';

--
-- Table structure for table `GetGoodsStatsResponse` generated from model 'GetGoodsStatsResponse'
-- Ответ на запрос отчета по товарам.
--

CREATE TABLE IF NOT EXISTS `GetGoodsStatsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос отчета по товарам.';

--
-- Table structure for table `GetHiddenOffersResponse` generated from model 'GetHiddenOffersResponse'
-- Ответ на запрос списка скрытий.
--

CREATE TABLE IF NOT EXISTS `GetHiddenOffersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка скрытий.';

--
-- Table structure for table `GetHiddenOffersResultDTO` generated from model 'GetHiddenOffersResultDTO'
-- Список скрытых вами товаров. 
--

CREATE TABLE IF NOT EXISTS `GetHiddenOffersResultDTO` (
  `paging` TEXT DEFAULT NULL,
  `hiddenOffers` JSON NOT NULL COMMENT 'Список скрытых товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список скрытых вами товаров. ';

--
-- Table structure for table `GetMappingDTO` generated from model 'GetMappingDTO'
-- Информация о товарах в каталоге. 
--

CREATE TABLE IF NOT EXISTS `GetMappingDTO` (
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.',
  `marketSkuName` TEXT DEFAULT NULL COMMENT 'Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ',
  `marketModelId` BIGINT DEFAULT NULL COMMENT 'Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ',
  `marketModelName` TEXT DEFAULT NULL COMMENT 'Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ',
  `marketCategoryId` BIGINT DEFAULT NULL COMMENT 'Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ',
  `marketCategoryName` TEXT DEFAULT NULL COMMENT 'Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товарах в каталоге. ';

--
-- Table structure for table `GetModelsOffersResponse` generated from model 'GetModelsOffersResponse'
-- Ответ на запрос списка предложений для моделей.
--

CREATE TABLE IF NOT EXISTS `GetModelsOffersResponse` (
  `models` JSON NOT NULL COMMENT 'Список моделей товаров.',
  `currency` TEXT DEFAULT NULL,
  `regionId` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка предложений для моделей.';

--
-- Table structure for table `GetModelsRequest` generated from model 'GetModelsRequest'
-- Запрос информации о моделях.
--

CREATE TABLE IF NOT EXISTS `GetModelsRequest` (
  `models` JSON NOT NULL COMMENT 'Список моделей.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос информации о моделях.';

--
-- Table structure for table `GetModelsResponse` generated from model 'GetModelsResponse'
-- Ответ на запрос информации о моделях.
--

CREATE TABLE IF NOT EXISTS `GetModelsResponse` (
  `models` JSON NOT NULL COMMENT 'Список моделей товаров.',
  `currency` TEXT DEFAULT NULL,
  `regionId` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос информации о моделях.';

--
-- Table structure for table `GetOfferCardsContentStatusRequest` generated from model 'GetOfferCardsContentStatusRequest'
--

CREATE TABLE IF NOT EXISTS `GetOfferCardsContentStatusRequest` (
  `offerIds` JSON DEFAULT NULL COMMENT 'Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ',
  `cardStatuses` JSON DEFAULT NULL COMMENT 'Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ',
  `categoryIds` JSON DEFAULT NULL COMMENT 'Фильтр по категориям на Маркете.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetOfferCardsContentStatusResponse` generated from model 'GetOfferCardsContentStatusResponse'
-- Ответ со списком состояний товаров и пагинацией.
--

CREATE TABLE IF NOT EXISTS `GetOfferCardsContentStatusResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ со списком состояний товаров и пагинацией.';

--
-- Table structure for table `GetOfferDTO` generated from model 'GetOfferDTO'
-- Параметры товара.
--

CREATE TABLE IF NOT EXISTS `GetOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `name` TEXT DEFAULT NULL COMMENT 'Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ',
  `marketCategoryId` BIGINT DEFAULT NULL COMMENT 'Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). ',
  `category` TEXT DEFAULT NULL COMMENT 'Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. ',
  `pictures` JSON DEFAULT NULL COMMENT 'Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) ',
  `videos` JSON DEFAULT NULL COMMENT 'Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) ',
  `manuals` JSON DEFAULT NULL COMMENT 'Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. ',
  `vendor` TEXT DEFAULT NULL COMMENT 'Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.',
  `barcodes` JSON DEFAULT NULL COMMENT 'Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ',
  `description` TEXT DEFAULT NULL COMMENT 'Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ',
  `manufacturerCountries` JSON DEFAULT NULL COMMENT 'Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). ',
  `weightDimensions` TEXT DEFAULT NULL,
  `vendorCode` TEXT DEFAULT NULL COMMENT 'Артикул товара от производителя.',
  `tags` JSON DEFAULT NULL COMMENT 'Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. ',
  `shelfLife` TEXT DEFAULT NULL,
  `lifeTime` TEXT DEFAULT NULL,
  `guaranteePeriod` TEXT DEFAULT NULL,
  `customsCommodityCode` TEXT DEFAULT NULL COMMENT 'Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. ',
  `certificates` JSON DEFAULT NULL COMMENT 'Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). ',
  `boxCount` INT DEFAULT NULL COMMENT 'Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. ',
  `condition` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL,
  `downloadable` TINYINT(1) DEFAULT NULL COMMENT 'Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) ',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. ',
  `age` TEXT DEFAULT NULL,
  `params` JSON DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. ',
  `basicPrice` TEXT DEFAULT NULL,
  `purchasePrice` TEXT DEFAULT NULL,
  `additionalExpenses` TEXT DEFAULT NULL,
  `cofinancePrice` TEXT DEFAULT NULL,
  `cardStatus` TEXT DEFAULT NULL,
  `campaigns` JSON DEFAULT NULL COMMENT 'Список магазинов, в которых размещен товар. ',
  `sellingPrograms` JSON DEFAULT NULL COMMENT 'Информация о том, какие для товара доступны модели размещения. ',
  `archived` TINYINT(1) DEFAULT NULL COMMENT 'Товар помещен в архив. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара.';

--
-- Table structure for table `GetOfferMappingDTO` generated from model 'GetOfferMappingDTO'
-- Информация о товаре.
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingDTO` (
  `offer` TEXT DEFAULT NULL,
  `mapping` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товаре.';

--
-- Table structure for table `GetOfferMappingEntriesResponse` generated from model 'GetOfferMappingEntriesResponse'
-- Ответ на запрос списка товаров в каталоге.
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingEntriesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка товаров в каталоге.';

--
-- Table structure for table `GetOfferMappingsRequest` generated from model 'GetOfferMappingsRequest'
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingsRequest` (
  `offerIds` JSON DEFAULT NULL COMMENT 'Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}    ',
  `cardStatuses` JSON DEFAULT NULL COMMENT 'Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ',
  `categoryIds` JSON DEFAULT NULL COMMENT 'Фильтр по категориям на Маркете.',
  `vendorNames` JSON DEFAULT NULL COMMENT 'Фильтр по брендам.',
  `tags` JSON DEFAULT NULL COMMENT 'Фильтр по тегам.',
  `archived` TINYINT(1) DEFAULT NULL COMMENT 'Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetOfferMappingsResponse` generated from model 'GetOfferMappingsResponse'
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetOfferMappingsResultDTO` generated from model 'GetOfferMappingsResultDTO'
-- Информация о товарах.
--

CREATE TABLE IF NOT EXISTS `GetOfferMappingsResultDTO` (
  `paging` TEXT DEFAULT NULL,
  `offerMappings` JSON NOT NULL COMMENT 'Информация о товарах.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товарах.';

--
-- Table structure for table `GetOfferRecommendationsRequest` generated from model 'GetOfferRecommendationsRequest'
--

CREATE TABLE IF NOT EXISTS `GetOfferRecommendationsRequest` (
  `offerIds` JSON DEFAULT NULL COMMENT 'Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.',
  `cofinancePriceFilter` TEXT DEFAULT NULL,
  `recommendedCofinancePriceFilter` TEXT DEFAULT NULL,
  `competitivenessFilter` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetOfferRecommendationsResponse` generated from model 'GetOfferRecommendationsResponse'
--

CREATE TABLE IF NOT EXISTS `GetOfferRecommendationsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetOffersResponse` generated from model 'GetOffersResponse'
-- Список предложений с пагинатором.
--

CREATE TABLE IF NOT EXISTS `GetOffersResponse` (
  `offers` JSON NOT NULL COMMENT 'Список предложений магазина.',
  `pager` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список предложений с пагинатором.';

--
-- Table structure for table `GetOrderBuyerInfoResponse` generated from model 'GetOrderBuyerInfoResponse'
--

CREATE TABLE IF NOT EXISTS `GetOrderBuyerInfoResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetOrderLabelsDataResponse` generated from model 'GetOrderLabelsDataResponse'
-- Ответ с информацией для печати ярлыков.
--

CREATE TABLE IF NOT EXISTS `GetOrderLabelsDataResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ с информацией для печати ярлыков.';

--
-- Table structure for table `GetOrderResponse` generated from model 'GetOrderResponse'
--

CREATE TABLE IF NOT EXISTS `GetOrderResponse` (
  `order` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetOrdersResponse` generated from model 'GetOrdersResponse'
-- Модель для ответа API списка информации по заказам.
--

CREATE TABLE IF NOT EXISTS `GetOrdersResponse` (
  `pager` TEXT DEFAULT NULL,
  `orders` JSON NOT NULL COMMENT 'Модель заказа. ',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Модель для ответа API списка информации по заказам.';

--
-- Table structure for table `GetOrdersStatsRequest` generated from model 'GetOrdersStatsRequest'
-- Запрос информации по заказам.
--

CREATE TABLE IF NOT EXISTS `GetOrdersStatsRequest` (
  `dateFrom` DATE DEFAULT NULL COMMENT 'Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. ',
  `dateTo` DATE DEFAULT NULL COMMENT 'Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. ',
  `updateFrom` DATE DEFAULT NULL COMMENT 'Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. ',
  `updateTo` DATE DEFAULT NULL COMMENT 'Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. ',
  `orders` JSON DEFAULT NULL COMMENT 'Список идентификаторов заказов.',
  `statuses` JSON DEFAULT NULL COMMENT 'Список статусов заказов.',
  `hasCis` TINYINT(1) DEFAULT NULL COMMENT 'Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос информации по заказам.';

--
-- Table structure for table `GetOrdersStatsResponse` generated from model 'GetOrdersStatsResponse'
-- Ответ на запрос информации по заказам.
--

CREATE TABLE IF NOT EXISTS `GetOrdersStatsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос информации по заказам.';

--
-- Table structure for table `GetOutletLicensesResponse` generated from model 'GetOutletLicensesResponse'
--

CREATE TABLE IF NOT EXISTS `GetOutletLicensesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetOutletResponse` generated from model 'GetOutletResponse'
-- Ответ на запрос информации о точке продаж.
--

CREATE TABLE IF NOT EXISTS `GetOutletResponse` (
  `outlet` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос информации о точке продаж.';

--
-- Table structure for table `GetOutletsResponse` generated from model 'GetOutletsResponse'
-- Ответ на запрос информации о точках продаж.
--

CREATE TABLE IF NOT EXISTS `GetOutletsResponse` (
  `outlets` JSON NOT NULL COMMENT 'Информация о точках продаж.',
  `paging` TEXT DEFAULT NULL,
  `pager` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос информации о точках продаж.';

--
-- Table structure for table `GetPriceDTO` generated from model 'GetPriceDTO'
-- Цена с указанием времени последнего обновления.
--

CREATE TABLE IF NOT EXISTS `GetPriceDTO` (
  `value` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Значение.',
  `currencyId` TEXT NOT NULL,
  `updatedAt` DATETIME NOT NULL COMMENT 'Время последнего обновления.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Цена с указанием времени последнего обновления.';

--
-- Table structure for table `GetPriceWithDiscountDTO` generated from model 'GetPriceWithDiscountDTO'
-- Цена с указанием скидки и времени последнего обновления.
--

CREATE TABLE IF NOT EXISTS `GetPriceWithDiscountDTO` (
  `value` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Значение.',
  `currencyId` TEXT NOT NULL,
  `discountBase` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT 'Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ',
  `updatedAt` DATETIME NOT NULL COMMENT 'Время последнего обновления.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Цена с указанием скидки и времени последнего обновления.';

--
-- Table structure for table `GetPriceWithVatDTO` generated from model 'GetPriceWithVatDTO'
-- Цена с указанием ставки НДС и времени последнего обновления.
--

CREATE TABLE IF NOT EXISTS `GetPriceWithVatDTO` (
  `value` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар.',
  `discountBase` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ',
  `currencyId` TEXT DEFAULT NULL,
  `vat` INT DEFAULT NULL COMMENT 'Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. ',
  `updatedAt` DATETIME NOT NULL COMMENT 'Время последнего обновления.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Цена с указанием ставки НДС и времени последнего обновления.';

--
-- Table structure for table `GetPricesByOfferIdsRequest` generated from model 'GetPricesByOfferIdsRequest'
-- Запрос списка цен.
--

CREATE TABLE IF NOT EXISTS `GetPricesByOfferIdsRequest` (
  `offerIds` JSON DEFAULT NULL COMMENT 'Список SKU.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос списка цен.';

--
-- Table structure for table `GetPricesByOfferIdsResponse` generated from model 'GetPricesByOfferIdsResponse'
-- Ответ на запрос списка цен.
--

CREATE TABLE IF NOT EXISTS `GetPricesByOfferIdsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка цен.';

--
-- Table structure for table `GetPricesResponse` generated from model 'GetPricesResponse'
-- Ответ на запрос списка цен.
--

CREATE TABLE IF NOT EXISTS `GetPricesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка цен.';

--
-- Table structure for table `GetPromoAssortmentInfoDTO` generated from model 'GetPromoAssortmentInfoDTO'
-- Информация о товарах в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoAssortmentInfoDTO` (
  `activeOffers` INT NOT NULL COMMENT 'Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ',
  `potentialOffers` INT DEFAULT NULL COMMENT 'Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. ',
  `processing` TINYINT(1) DEFAULT NULL COMMENT 'Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товарах в акции.';

--
-- Table structure for table `GetPromoBestsellerInfoDTO` generated from model 'GetPromoBestsellerInfoDTO'
-- Информация об акции «Бестселлеры Маркета».
--

CREATE TABLE IF NOT EXISTS `GetPromoBestsellerInfoDTO` (
  `bestseller` TINYINT(1) NOT NULL COMMENT 'Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).',
  `entryDeadline` DATETIME DEFAULT NULL COMMENT 'До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об акции «Бестселлеры Маркета».';

--
-- Table structure for table `GetPromoConstraintsDTO` generated from model 'GetPromoConstraintsDTO'
-- Ограничения в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoConstraintsDTO` (
  `warehouseIds` JSON DEFAULT NULL COMMENT 'Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ограничения в акции.';

--
-- Table structure for table `GetPromoDTO` generated from model 'GetPromoDTO'
-- Информация об акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoDTO` (
  `id` TEXT NOT NULL COMMENT 'Идентификатор акции.',
  `name` TEXT NOT NULL COMMENT 'Название акции.',
  `period` TEXT NOT NULL,
  `participating` TINYINT(1) NOT NULL COMMENT 'Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ',
  `assortmentInfo` TEXT NOT NULL,
  `mechanicsInfo` TEXT NOT NULL,
  `bestsellerInfo` TEXT NOT NULL,
  `channels` JSON DEFAULT NULL COMMENT 'Список каналов продвижения товаров.',
  `constraints` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об акции.';

--
-- Table structure for table `GetPromoMechanicsInfoDTO` generated from model 'GetPromoMechanicsInfoDTO'
-- Информация о типе акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoMechanicsInfoDTO` (
  `type` TEXT NOT NULL,
  `promocodeInfo` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о типе акции.';

--
-- Table structure for table `GetPromoOfferDTO` generated from model 'GetPromoOfferDTO'
-- Товар, который участвует или может участвовать в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `status` TEXT NOT NULL,
  `params` TEXT NOT NULL,
  `autoParticipatingDetails` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар, который участвует или может участвовать в акции.';

--
-- Table structure for table `GetPromoOffersRequest` generated from model 'GetPromoOffersRequest'
-- Получение списка товаров, которые участвуют или могут участвовать в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoOffersRequest` (
  `promoId` TEXT NOT NULL COMMENT 'Идентификатор акции.',
  `statusType` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Получение списка товаров, которые участвуют или могут участвовать в акции.';

--
-- Table structure for table `GetPromoOffersResponse` generated from model 'GetPromoOffersResponse'
--

CREATE TABLE IF NOT EXISTS `GetPromoOffersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetPromoOffersResultDTO` generated from model 'GetPromoOffersResultDTO'
-- Список товаров, которые участвуют или могут участвовать в акции.
--

CREATE TABLE IF NOT EXISTS `GetPromoOffersResultDTO` (
  `offers` JSON NOT NULL COMMENT 'Товары, которые участвуют или могут участвовать в акции.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров, которые участвуют или могут участвовать в акции.';

--
-- Table structure for table `GetPromoPromocodeInfoDTO` generated from model 'GetPromoPromocodeInfoDTO'
-- Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
--

CREATE TABLE IF NOT EXISTS `GetPromoPromocodeInfoDTO` (
  `promocode` TEXT NOT NULL COMMENT 'Промокод.',
  `discount` INT NOT NULL COMMENT 'Процент скидки по промокоду.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. ';

--
-- Table structure for table `GetPromosRequest` generated from model 'GetPromosRequest'
-- Фильтры для получения списка акций.
--

CREATE TABLE IF NOT EXISTS `GetPromosRequest` (
  `participation` TEXT DEFAULT NULL,
  `mechanics` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтры для получения списка акций.';

--
-- Table structure for table `GetPromosResponse` generated from model 'GetPromosResponse'
--

CREATE TABLE IF NOT EXISTS `GetPromosResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetPromosResultDTO` generated from model 'GetPromosResultDTO'
-- Информация об акциях Маркета.
--

CREATE TABLE IF NOT EXISTS `GetPromosResultDTO` (
  `promos` JSON NOT NULL COMMENT 'Акции Маркета.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об акциях Маркета.';

--
-- Table structure for table `GetQualityRatingDetailsResponse` generated from model 'GetQualityRatingDetailsResponse'
--

CREATE TABLE IF NOT EXISTS `GetQualityRatingDetailsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetQualityRatingRequest` generated from model 'GetQualityRatingRequest'
-- Запрос информации по индексу качества.
--

CREATE TABLE IF NOT EXISTS `GetQualityRatingRequest` (
  `dateFrom` DATE DEFAULT NULL COMMENT 'Начало периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть раньше 30 дней от текущей даты. ',
  `dateTo` DATE DEFAULT NULL COMMENT 'Конец периода.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Не может быть позже текущей даты. ',
  `campaignIds` JSON NOT NULL COMMENT 'Список идентификаторов магазинов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос информации по индексу качества.';

--
-- Table structure for table `GetQualityRatingResponse` generated from model 'GetQualityRatingResponse'
-- Информация об индексе качества магазинов.
--

CREATE TABLE IF NOT EXISTS `GetQualityRatingResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об индексе качества магазинов.';

--
-- Table structure for table `GetQuarantineOffersRequest` generated from model 'GetQuarantineOffersRequest'
-- Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
--

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersRequest` (
  `offerIds` JSON DEFAULT NULL COMMENT 'Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ',
  `cardStatuses` JSON DEFAULT NULL COMMENT 'Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ',
  `categoryIds` JSON DEFAULT NULL COMMENT 'Фильтр по категориям на Маркете.',
  `vendorNames` JSON DEFAULT NULL COMMENT 'Фильтр по брендам.',
  `tags` JSON DEFAULT NULL COMMENT 'Фильтр по тегам.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ';

--
-- Table structure for table `GetQuarantineOffersResponse` generated from model 'GetQuarantineOffersResponse'
-- Ответ на запрос списка товаров в карантине.
--

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка товаров в карантине.';

--
-- Table structure for table `GetQuarantineOffersResultDTO` generated from model 'GetQuarantineOffersResultDTO'
-- Список товаров в карантине.
--

CREATE TABLE IF NOT EXISTS `GetQuarantineOffersResultDTO` (
  `paging` TEXT DEFAULT NULL,
  `offers` JSON NOT NULL COMMENT 'Страница списка товаров в карантине.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров в карантине.';

--
-- Table structure for table `GetRegionWithChildrenResponse` generated from model 'GetRegionWithChildrenResponse'
--

CREATE TABLE IF NOT EXISTS `GetRegionWithChildrenResponse` (
  `pager` TEXT DEFAULT NULL,
  `regions` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetRegionsResponse` generated from model 'GetRegionsResponse'
--

CREATE TABLE IF NOT EXISTS `GetRegionsResponse` (
  `regions` JSON NOT NULL COMMENT 'Регион доставки.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetReportInfoResponse` generated from model 'GetReportInfoResponse'
-- Ответ на запрос информации об отчете.
--

CREATE TABLE IF NOT EXISTS `GetReportInfoResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос информации об отчете.';

--
-- Table structure for table `GetReturnResponse` generated from model 'GetReturnResponse'
--

CREATE TABLE IF NOT EXISTS `GetReturnResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetReturnsResponse` generated from model 'GetReturnsResponse'
--

CREATE TABLE IF NOT EXISTS `GetReturnsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetShipmentOrdersInfoResponse` generated from model 'GetShipmentOrdersInfoResponse'
--

CREATE TABLE IF NOT EXISTS `GetShipmentOrdersInfoResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetShipmentResponse` generated from model 'GetShipmentResponse'
--

CREATE TABLE IF NOT EXISTS `GetShipmentResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetSuggestedOfferMappingEntriesRequest` generated from model 'GetSuggestedOfferMappingEntriesRequest'
-- Запрос рекомендованных карточек товара.
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingEntriesRequest` (
  `offers` JSON NOT NULL COMMENT 'Список товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос рекомендованных карточек товара.';

--
-- Table structure for table `GetSuggestedOfferMappingEntriesResponse` generated from model 'GetSuggestedOfferMappingEntriesResponse'
-- Ответ со списком рекомендованных карточек товара.
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingEntriesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ со списком рекомендованных карточек товара.';

--
-- Table structure for table `GetSuggestedOfferMappingsRequest` generated from model 'GetSuggestedOfferMappingsRequest'
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingsRequest` (
  `offers` JSON DEFAULT NULL COMMENT 'Список товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetSuggestedOfferMappingsResponse` generated from model 'GetSuggestedOfferMappingsResponse'
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetSuggestedOfferMappingsResultDTO` generated from model 'GetSuggestedOfferMappingsResultDTO'
-- Подобранные карточки на Маркете.
--

CREATE TABLE IF NOT EXISTS `GetSuggestedOfferMappingsResultDTO` (
  `offers` JSON NOT NULL COMMENT 'Список товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Подобранные карточки на Маркете.';

--
-- Table structure for table `GetWarehouseStocksDTO` generated from model 'GetWarehouseStocksDTO'
-- Список складов с информацией об остатках на каждом из них.
--

CREATE TABLE IF NOT EXISTS `GetWarehouseStocksDTO` (
  `paging` TEXT DEFAULT NULL,
  `warehouses` JSON NOT NULL COMMENT 'Страница списка складов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список складов с информацией об остатках на каждом из них.';

--
-- Table structure for table `GetWarehouseStocksRequest` generated from model 'GetWarehouseStocksRequest'
-- Фильтры для запроса остатков. 
--

CREATE TABLE IF NOT EXISTS `GetWarehouseStocksRequest` (
  `withTurnover` TINYINT(1) DEFAULT false COMMENT '**Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — &#x60;false&#x60;. Если информация нужна, передайте значение &#x60;true&#x60;. ',
  `archived` TINYINT(1) DEFAULT NULL COMMENT 'Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращается информация о товарах, которые не находятся в архиве. ',
  `offerIds` JSON DEFAULT NULL COMMENT 'Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60; * &#x60;archived&#x60;  {% endnote %}    '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фильтры для запроса остатков. ';

--
-- Table structure for table `GetWarehouseStocksResponse` generated from model 'GetWarehouseStocksResponse'
--

CREATE TABLE IF NOT EXISTS `GetWarehouseStocksResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetWarehousesResponse` generated from model 'GetWarehousesResponse'
--

CREATE TABLE IF NOT EXISTS `GetWarehousesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GoodsFeedbackCommentAuthorDTO` generated from model 'GoodsFeedbackCommentAuthorDTO'
-- Информация об авторе комментария.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackCommentAuthorDTO` (
  `type` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Имя автора или название кабинета.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об авторе комментария.';

--
-- Table structure for table `GoodsFeedbackCommentDTO` generated from model 'GoodsFeedbackCommentDTO'
-- Комментарий к отзыву.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackCommentDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор комментария к отзыву. ',
  `text` TEXT NOT NULL COMMENT 'Текст комментария.',
  `canModify` TINYINT(1) DEFAULT NULL COMMENT 'Может ли продавец изменять комментарий или удалять его.',
  `parentId` BIGINT DEFAULT NULL COMMENT 'Идентификатор комментария к отзыву. ',
  `author` TEXT NOT NULL,
  `status` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Комментарий к отзыву.';

--
-- Table structure for table `GoodsFeedbackCommentListDTO` generated from model 'GoodsFeedbackCommentListDTO'
-- Комментарии к отзыву.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackCommentListDTO` (
  `comments` JSON NOT NULL COMMENT 'Список комментариев.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Комментарии к отзыву.';

--
-- Table structure for table `GoodsFeedbackDTO` generated from model 'GoodsFeedbackDTO'
-- Отзыв о товаре.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackDTO` (
  `feedbackId` BIGINT NOT NULL COMMENT 'Идентификатор отзыва. ',
  `createdAt` DATETIME NOT NULL COMMENT 'Дата и время создания отзыва.',
  `needReaction` TINYINT(1) NOT NULL COMMENT 'Нужен ли ответ на отзыв.',
  `identifiers` TEXT NOT NULL,
  `author` TEXT DEFAULT NULL COMMENT 'Имя автора отзыва.',
  `description` TEXT DEFAULT NULL,
  `media` TEXT DEFAULT NULL,
  `statistics` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Отзыв о товаре.';

--
-- Table structure for table `GoodsFeedbackDescriptionDTO` generated from model 'GoodsFeedbackDescriptionDTO'
-- Текстовая часть отзыва.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackDescriptionDTO` (
  `advantages` TEXT DEFAULT NULL COMMENT 'Описание плюсов товара в отзыве.',
  `disadvantages` TEXT DEFAULT NULL COMMENT 'Описание минусов товара в отзыве.',
  `comment` TEXT DEFAULT NULL COMMENT 'Комментарий в отзыве.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Текстовая часть отзыва.';

--
-- Table structure for table `GoodsFeedbackIdentifiersDTO` generated from model 'GoodsFeedbackIdentifiersDTO'
-- Идентификаторы, которые связаны с отзывом.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackIdentifiersDTO` (
  `orderId` BIGINT NOT NULL COMMENT 'Идентификатор заказа на Маркете.',
  `modelId` BIGINT NOT NULL COMMENT 'Идентификатор модели товара.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Идентификаторы, которые связаны с отзывом.';

--
-- Table structure for table `GoodsFeedbackListDTO` generated from model 'GoodsFeedbackListDTO'
-- Список отзывов о товарах. 
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackListDTO` (
  `feedbacks` JSON NOT NULL COMMENT 'Список отзывов.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список отзывов о товарах. ';

--
-- Table structure for table `GoodsFeedbackMediaDTO` generated from model 'GoodsFeedbackMediaDTO'
-- Фото и видео.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackMediaDTO` (
  `photos` JSON DEFAULT NULL COMMENT 'Ссылки на фото.',
  `videos` JSON DEFAULT NULL COMMENT 'Ссылки на видео.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Фото и видео.';

--
-- Table structure for table `GoodsFeedbackStatisticsDTO` generated from model 'GoodsFeedbackStatisticsDTO'
-- Статистическая информация по отзыву.
--

CREATE TABLE IF NOT EXISTS `GoodsFeedbackStatisticsDTO` (
  `rating` TINYINT UNSIGNED NOT NULL COMMENT 'Оценка товара.',
  `commentsCount` BIGINT NOT NULL COMMENT 'Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. ',
  `recommended` TINYINT(1) DEFAULT NULL COMMENT 'Рекомендуют ли этот товар.',
  `paidAmount` BIGINT DEFAULT NULL COMMENT 'Количество баллов Плюса, которое автор получил за отзыв.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Статистическая информация по отзыву.';

--
-- Table structure for table `GoodsStatsDTO` generated from model 'GoodsStatsDTO'
-- Отчет по товарам.
--

CREATE TABLE IF NOT EXISTS `GoodsStatsDTO` (
  `shopSkus` JSON NOT NULL COMMENT 'Список товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Отчет по товарам.';

--
-- Table structure for table `GoodsStatsGoodsDTO` generated from model 'GoodsStatsGoodsDTO'
-- Информация о товаре.
--

CREATE TABLE IF NOT EXISTS `GoodsStatsGoodsDTO` (
  `shopSku` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.',
  `name` TEXT DEFAULT NULL COMMENT 'Название товара.',
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).',
  `categoryId` BIGINT DEFAULT NULL COMMENT 'Идентификатор категории товара на Маркете.',
  `categoryName` TEXT DEFAULT NULL COMMENT 'Название категории товара на Маркете.',
  `weightDimensions` TEXT DEFAULT NULL,
  `warehouses` JSON DEFAULT NULL COMMENT 'Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. ',
  `tariffs` JSON DEFAULT NULL COMMENT 'Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). ',
  `pictures` JSON DEFAULT NULL COMMENT 'Ссылки (URL) изображений товара в хорошем качестве.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товаре.';

--
-- Table structure for table `GoodsStatsWarehouseDTO` generated from model 'GoodsStatsWarehouseDTO'
-- Информация о складе.
--

CREATE TABLE IF NOT EXISTS `GoodsStatsWarehouseDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор склада.',
  `name` TEXT DEFAULT NULL COMMENT 'Название склада.',
  `stocks` JSON NOT NULL COMMENT 'Информация об остатках товаров на складе.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о складе.';

--
-- Table structure for table `GoodsStatsWeightDimensionsDTO` generated from model 'GoodsStatsWeightDimensionsDTO'
-- Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
--

CREATE TABLE IF NOT EXISTS `GoodsStatsWeightDimensionsDTO` (
  `length` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Длина товара в сантиметрах.',
  `width` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Ширина товара в сантиметрах.',
  `height` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Высота товара в сантиметрах.',
  `weight` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Вес товара в килограммах.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. ';

--
-- Table structure for table `GpsDTO` generated from model 'GpsDTO'
-- GPS-координаты широты и долготы. 
--

CREATE TABLE IF NOT EXISTS `GpsDTO` (
  `latitude` DECIMAL(20, 9) NOT NULL COMMENT 'Широта.',
  `longitude` DECIMAL(20, 9) NOT NULL COMMENT 'Долгота.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='GPS-координаты широты и долготы. ';

--
-- Table structure for table `HiddenOfferDTO` generated from model 'HiddenOfferDTO'
-- Информация о скрытии.
--

CREATE TABLE IF NOT EXISTS `HiddenOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о скрытии.';

--
-- Table structure for table `LogisticPickupPointDTO` generated from model 'LogisticPickupPointDTO'
-- Описание пункта вывоза для возврата.
--

CREATE TABLE IF NOT EXISTS `LogisticPickupPointDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор пункта вывоза.',
  `name` TEXT DEFAULT NULL COMMENT 'Название пункта вывоза.',
  `address` TEXT DEFAULT NULL,
  `instruction` TEXT DEFAULT NULL COMMENT 'Дополнительные инструкции к вывозу.',
  `type` TEXT DEFAULT NULL,
  `logisticPartnerId` BIGINT DEFAULT NULL COMMENT 'Идентификатор логистического партнера, к которому относится логистическая точка.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Описание пункта вывоза для возврата.';

--
-- Table structure for table `MappingsOfferDTO` generated from model 'MappingsOfferDTO'
-- Информация о товарах в каталоге.
--

CREATE TABLE IF NOT EXISTS `MappingsOfferDTO` (
  `name` TEXT DEFAULT NULL COMMENT 'Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ',
  `shopSku` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `category` TEXT DEFAULT NULL COMMENT 'Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. ',
  `vendor` TEXT DEFAULT NULL COMMENT 'Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.',
  `vendorCode` TEXT DEFAULT NULL COMMENT 'Артикул товара от производителя.',
  `description` TEXT DEFAULT NULL COMMENT 'Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ',
  `id` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `feedId` BIGINT DEFAULT NULL COMMENT 'Идентификатор фида.',
  `barcodes` JSON DEFAULT NULL COMMENT 'Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ',
  `urls` JSON DEFAULT NULL COMMENT 'URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ',
  `pictures` JSON DEFAULT NULL COMMENT 'Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. ',
  `manufacturer` TEXT DEFAULT NULL COMMENT 'Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ',
  `manufacturerCountries` JSON DEFAULT NULL COMMENT 'Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ',
  `minShipment` INT DEFAULT NULL COMMENT 'Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ',
  `transportUnitSize` INT DEFAULT NULL COMMENT 'Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ',
  `quantumOfSupply` INT DEFAULT NULL COMMENT 'Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ',
  `deliveryDurationDays` INT DEFAULT NULL COMMENT 'Срок, за который продавец поставляет товары на склад, в днях.',
  `boxCount` INT DEFAULT NULL COMMENT 'Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ',
  `customsCommodityCodes` JSON DEFAULT NULL COMMENT 'Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ',
  `weightDimensions` TEXT DEFAULT NULL,
  `supplyScheduleDays` JSON DEFAULT NULL COMMENT 'Дни недели, в которые продавец поставляет товары на склад.',
  `shelfLifeDays` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ',
  `lifeTimeDays` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ',
  `guaranteePeriodDays` INT DEFAULT NULL COMMENT 'Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ',
  `processingState` TEXT DEFAULT NULL,
  `availability` TEXT DEFAULT NULL,
  `shelfLife` TEXT DEFAULT NULL,
  `lifeTime` TEXT DEFAULT NULL,
  `guaranteePeriod` TEXT DEFAULT NULL,
  `certificate` TEXT DEFAULT NULL COMMENT 'Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) ',
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар в рублях.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товарах в каталоге.';

--
-- Table structure for table `MappingsOfferInfoDTO` generated from model 'MappingsOfferInfoDTO'
-- Базовая информация о товарах в каталоге.
--

CREATE TABLE IF NOT EXISTS `MappingsOfferInfoDTO` (
  `name` TEXT DEFAULT NULL COMMENT 'Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ',
  `shopSku` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `category` TEXT DEFAULT NULL COMMENT 'Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. ',
  `vendor` TEXT DEFAULT NULL COMMENT 'Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.',
  `vendorCode` TEXT DEFAULT NULL COMMENT 'Артикул товара от производителя.',
  `description` TEXT DEFAULT NULL COMMENT 'Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ',
  `id` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `feedId` BIGINT DEFAULT NULL COMMENT 'Идентификатор фида.',
  `barcodes` JSON DEFAULT NULL COMMENT 'Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ',
  `urls` JSON DEFAULT NULL COMMENT 'URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ',
  `pictures` JSON DEFAULT NULL COMMENT 'Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. ',
  `manufacturer` TEXT DEFAULT NULL COMMENT 'Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ',
  `manufacturerCountries` JSON DEFAULT NULL COMMENT 'Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ',
  `minShipment` INT DEFAULT NULL COMMENT 'Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ',
  `transportUnitSize` INT DEFAULT NULL COMMENT 'Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ',
  `quantumOfSupply` INT DEFAULT NULL COMMENT 'Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ',
  `deliveryDurationDays` INT DEFAULT NULL COMMENT 'Срок, за который продавец поставляет товары на склад, в днях.',
  `boxCount` INT DEFAULT NULL COMMENT 'Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ',
  `customsCommodityCodes` JSON DEFAULT NULL COMMENT 'Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ',
  `weightDimensions` TEXT DEFAULT NULL,
  `supplyScheduleDays` JSON DEFAULT NULL COMMENT 'Дни недели, в которые продавец поставляет товары на склад.',
  `shelfLifeDays` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ',
  `lifeTimeDays` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ',
  `guaranteePeriodDays` INT DEFAULT NULL COMMENT 'Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ',
  `processingState` TEXT DEFAULT NULL,
  `availability` TEXT DEFAULT NULL,
  `shelfLife` TEXT DEFAULT NULL,
  `lifeTime` TEXT DEFAULT NULL,
  `guaranteePeriod` TEXT DEFAULT NULL,
  `certificate` TEXT DEFAULT NULL COMMENT 'Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Базовая информация о товарах в каталоге.';

--
-- Table structure for table `MaxSaleQuantumDTO` generated from model 'MaxSaleQuantumDTO'
-- Лимит на установку кванта и минимального количества товаров по категориям. 
--

CREATE TABLE IF NOT EXISTS `MaxSaleQuantumDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор категории.',
  `name` TEXT DEFAULT NULL COMMENT 'Название категории.',
  `maxSaleQuantum` INT DEFAULT NULL COMMENT 'Лимит на установку кванта и минимального количества товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Лимит на установку кванта и минимального количества товаров по категориям. ';

--
-- Table structure for table `ModelDTO` generated from model 'ModelDTO'
-- Модель товара.
--

CREATE TABLE IF NOT EXISTS `ModelDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор модели товара.',
  `name` TEXT DEFAULT NULL COMMENT 'Название модели товара.',
  `prices` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Модель товара.';

--
-- Table structure for table `ModelOfferDTO` generated from model 'ModelOfferDTO'
-- Информация о предложении.
--

CREATE TABLE IF NOT EXISTS `ModelOfferDTO` (
  `discount` INT DEFAULT NULL COMMENT 'Скидка на предложение в процентах.',
  `name` TEXT DEFAULT NULL COMMENT 'Наименование предложения.',
  `pos` INT DEFAULT NULL COMMENT 'Позиция предложения в выдаче Маркета на карточке модели.',
  `preDiscountPrice` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена предложения без скидки магазина.',
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.',
  `regionId` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них. ',
  `shippingCost` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. ',
  `shopName` TEXT DEFAULT NULL COMMENT 'Название магазина (в том виде, в котором отображается на Маркете).',
  `shopRating` INT DEFAULT NULL COMMENT 'Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;. ',
  `inStock` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о предложении.';

--
-- Table structure for table `ModelPriceDTO` generated from model 'ModelPriceDTO'
-- Информация о ценах на модель товара.
--

CREATE TABLE IF NOT EXISTS `ModelPriceDTO` (
  `avg` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Средняя цена предложения для модели в регионе.',
  `max` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Максимальная цена предложения для модели в регионе.',
  `min` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Минимальная цена предложения для модели в регионе.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о ценах на модель товара.';

--
-- Table structure for table `ModelsDTO` generated from model 'ModelsDTO'
-- Список моделей товаров.
--

CREATE TABLE IF NOT EXISTS `ModelsDTO` (
  `models` JSON NOT NULL COMMENT 'Список моделей товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список моделей товаров.';

--
-- Table structure for table `OfferCampaignStatusDTO` generated from model 'OfferCampaignStatusDTO'
-- Статус товара в магазине.
--

CREATE TABLE IF NOT EXISTS `OfferCampaignStatusDTO` (
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор кампании. ',
  `status` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Статус товара в магазине.';

--
-- Table structure for table `OfferCardDTO` generated from model 'OfferCardDTO'
-- Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
--

CREATE TABLE IF NOT EXISTS `OfferCardDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `mapping` TEXT DEFAULT NULL,
  `parameterValues` JSON DEFAULT NULL COMMENT 'Список характеристик с их значениями. ',
  `cardStatus` TEXT DEFAULT NULL,
  `contentRating` INT DEFAULT NULL COMMENT 'Процент заполненности карточки.',
  `recommendations` JSON DEFAULT NULL COMMENT 'Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. ',
  `errors` JSON DEFAULT NULL COMMENT 'Ошибки в контенте, препятствующие размещению товара на витрине.',
  `warnings` JSON DEFAULT NULL COMMENT 'Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. ';

--
-- Table structure for table `OfferCardRecommendationDTO` generated from model 'OfferCardRecommendationDTO'
-- Рекомендация по заполнению карточки товара.
--

CREATE TABLE IF NOT EXISTS `OfferCardRecommendationDTO` (
  `type` TEXT NOT NULL,
  `percent` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Рекомендация по заполнению карточки товара.';

--
-- Table structure for table `OfferCardsContentStatusDTO` generated from model 'OfferCardsContentStatusDTO'
-- Список товаров с информацией о состоянии карточек.
--

CREATE TABLE IF NOT EXISTS `OfferCardsContentStatusDTO` (
  `offerCards` JSON NOT NULL COMMENT 'Страница списка товаров с информацией о состоянии карточек.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров с информацией о состоянии карточек.';

--
-- Table structure for table `OfferConditionDTO` generated from model 'OfferConditionDTO'
-- Состояние уцененного товара. 
--

CREATE TABLE IF NOT EXISTS `OfferConditionDTO` (
  `type` TEXT DEFAULT NULL,
  `quality` TEXT DEFAULT NULL,
  `reason` TEXT DEFAULT NULL COMMENT 'Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Состояние уцененного товара. ';

--
-- Table structure for table `OfferContentDTO` generated from model 'OfferContentDTO'
-- Товар с указанными характеристиками.
--

CREATE TABLE IF NOT EXISTS `OfferContentDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `categoryId` INT NOT NULL COMMENT 'Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).',
  `parameterValues` JSON NOT NULL COMMENT 'Список характеристик с их значениями.  С &#x60;parameterValues&#x60; обязательно передавайте &#x60;marketCategoryId&#x60; — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее &#x60;parameterId&#x60; с пустым &#x60;value&#x60;.  Максимальное количество характеристик — 300. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар с указанными характеристиками.';

--
-- Table structure for table `OfferContentErrorDTO` generated from model 'OfferContentErrorDTO'
-- Текст ошибки.
--

CREATE TABLE IF NOT EXISTS `OfferContentErrorDTO` (
  `type` TEXT NOT NULL,
  `parameterId` BIGINT DEFAULT NULL COMMENT 'Идентификатор характеристики, с которой связана ошибка.',
  `message` TEXT NOT NULL COMMENT 'Текст ошибки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Текст ошибки.';

--
-- Table structure for table `OfferDTO` generated from model 'OfferDTO'
-- Предложение.
--

CREATE TABLE IF NOT EXISTS `OfferDTO` (
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. ',
  `feedId` BIGINT DEFAULT NULL COMMENT 'Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. ',
  `id` TEXT DEFAULT NULL COMMENT 'Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. ',
  `shopCategoryId` TEXT DEFAULT NULL COMMENT 'Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. ',
  `marketCategoryId` INT DEFAULT NULL COMMENT 'Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. ',
  `preDiscountPrice` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена предложения без скидки.',
  `discount` INT DEFAULT NULL COMMENT 'Скидка на предложение в процентах.',
  `cutPrice` TINYINT(1) DEFAULT NULL COMMENT 'Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API. ',
  `url` TEXT DEFAULT NULL COMMENT 'URL-адрес предложения на сайте магазина.',
  `modelId` BIGINT NOT NULL COMMENT 'Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %} ',
  `name` TEXT DEFAULT NULL COMMENT 'Наименование предложения.',
  `currency` TEXT DEFAULT NULL,
  `bid` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ',
  `cbid` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ',
  `fee` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. ',
  `blocked` TINYINT(1) DEFAULT NULL COMMENT 'Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Предложение.';

--
-- Table structure for table `OfferErrorDTO` generated from model 'OfferErrorDTO'
-- Сообщение об ошибке, связанной с размещением товара.
--

CREATE TABLE IF NOT EXISTS `OfferErrorDTO` (
  `message` TEXT DEFAULT NULL COMMENT 'Тип ошибки.',
  `comment` TEXT DEFAULT NULL COMMENT 'Пояснение.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Сообщение об ошибке, связанной с размещением товара.';

--
-- Table structure for table `OfferForRecommendationDTO` generated from model 'OfferForRecommendationDTO'
-- Информация о состоянии цены на товар.
--

CREATE TABLE IF NOT EXISTS `OfferForRecommendationDTO` (
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `price` TEXT DEFAULT NULL,
  `cofinancePrice` TEXT DEFAULT NULL,
  `competitiveness` TEXT DEFAULT NULL,
  `shows` BIGINT DEFAULT NULL COMMENT 'Количество показов карточки товара за последние 7 дней.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о состоянии цены на товар.';

--
-- Table structure for table `OfferManualDTO` generated from model 'OfferManualDTO'
-- Инструкция по использованию товара. 
--

CREATE TABLE IF NOT EXISTS `OfferManualDTO` (
  `url` TEXT NOT NULL COMMENT 'Ссылка на инструкцию.',
  `title` TEXT DEFAULT NULL COMMENT 'Название инструкции, которое будет отображаться на карточке товара. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Инструкция по использованию товара. ';

--
-- Table structure for table `OfferMappingDTO` generated from model 'OfferMappingDTO'
-- Информация о текущей карточке товара на Маркете.
--

CREATE TABLE IF NOT EXISTS `OfferMappingDTO` (
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.',
  `modelId` BIGINT DEFAULT NULL COMMENT 'Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара. ',
  `categoryId` BIGINT DEFAULT NULL COMMENT 'Идентификатор категории для текущей карточки товара на Маркете.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о текущей карточке товара на Маркете.';

--
-- Table structure for table `OfferMappingEntriesDTO` generated from model 'OfferMappingEntriesDTO'
-- Информация о товарах в каталоге.
--

CREATE TABLE IF NOT EXISTS `OfferMappingEntriesDTO` (
  `paging` TEXT DEFAULT NULL,
  `offerMappingEntries` JSON NOT NULL COMMENT 'Информация о товарах в каталоге.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товарах в каталоге.';

--
-- Table structure for table `OfferMappingEntryDTO` generated from model 'OfferMappingEntryDTO'
-- Список товаров. 
--

CREATE TABLE IF NOT EXISTS `OfferMappingEntryDTO` (
  `mapping` TEXT DEFAULT NULL,
  `awaitingModerationMapping` TEXT DEFAULT NULL,
  `rejectedMapping` TEXT DEFAULT NULL,
  `offer` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров. ';

--
-- Table structure for table `OfferMappingErrorDTO` generated from model 'OfferMappingErrorDTO'
-- Текст ошибки.
--

CREATE TABLE IF NOT EXISTS `OfferMappingErrorDTO` (
  `type` TEXT NOT NULL,
  `parameterId` BIGINT DEFAULT NULL COMMENT 'Идентификатор характеристики, с которой связана ошибка.',
  `message` TEXT NOT NULL COMMENT 'Текст ошибки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Текст ошибки.';

--
-- Table structure for table `OfferMappingInfoDTO` generated from model 'OfferMappingInfoDTO'
-- Информация о карточке товара.
--

CREATE TABLE IF NOT EXISTS `OfferMappingInfoDTO` (
  `mapping` TEXT DEFAULT NULL,
  `awaitingModerationMapping` TEXT DEFAULT NULL,
  `rejectedMapping` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о карточке товара.';

--
-- Table structure for table `OfferMappingSuggestionsListDTO` generated from model 'OfferMappingSuggestionsListDTO'
-- Список рекомендованных карточек товара.
--

CREATE TABLE IF NOT EXISTS `OfferMappingSuggestionsListDTO` (
  `offers` JSON NOT NULL COMMENT 'Список товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список рекомендованных карточек товара.';

--
-- Table structure for table `OfferParamDTO` generated from model 'OfferParamDTO'
-- Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %} 
--

CREATE TABLE IF NOT EXISTS `OfferParamDTO` (
  `name` TEXT NOT NULL COMMENT 'Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). ',
  `value` TEXT NOT NULL COMMENT 'Значение. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %} ';

--
-- Table structure for table `OfferPriceByOfferIdsListResponseDTO` generated from model 'OfferPriceByOfferIdsListResponseDTO'
-- Список цен.
--

CREATE TABLE IF NOT EXISTS `OfferPriceByOfferIdsListResponseDTO` (
  `offers` JSON NOT NULL COMMENT 'Страница списка цен.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список цен.';

--
-- Table structure for table `OfferPriceByOfferIdsResponseDTO` generated from model 'OfferPriceByOfferIdsResponseDTO'
-- Информация об установленной цене.
--

CREATE TABLE IF NOT EXISTS `OfferPriceByOfferIdsResponseDTO` (
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `price` TEXT DEFAULT NULL,
  `updatedAt` DATETIME DEFAULT NULL COMMENT 'Дата и время последнего обновления цены.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об установленной цене.';

--
-- Table structure for table `OfferPriceDTO` generated from model 'OfferPriceDTO'
-- Товар с информацией о новой цене на него.
--

CREATE TABLE IF NOT EXISTS `OfferPriceDTO` (
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `price` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар с информацией о новой цене на него.';

--
-- Table structure for table `OfferPriceListResponseDTO` generated from model 'OfferPriceListResponseDTO'
-- Список цен на товары.
--

CREATE TABLE IF NOT EXISTS `OfferPriceListResponseDTO` (
  `offers` JSON NOT NULL COMMENT 'Страница списка.',
  `paging` TEXT DEFAULT NULL,
  `total` INT DEFAULT NULL COMMENT 'Количество всех цен магазина, измененных через API.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список цен на товары.';

--
-- Table structure for table `OfferPriceResponseDTO` generated from model 'OfferPriceResponseDTO'
-- Информация об установленной цене на товар.
--

CREATE TABLE IF NOT EXISTS `OfferPriceResponseDTO` (
  `id` TEXT DEFAULT NULL COMMENT 'Идентификатор предложения из прайс-листа.',
  `price` TEXT DEFAULT NULL,
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.',
  `updatedAt` DATETIME DEFAULT NULL COMMENT 'Дата и время последнего обновления цены на товар.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об установленной цене на товар.';

--
-- Table structure for table `OfferProcessingNoteDTO` generated from model 'OfferProcessingNoteDTO'
-- Причины, по которым товар не прошел модерацию.
--

CREATE TABLE IF NOT EXISTS `OfferProcessingNoteDTO` (
  `type` TEXT DEFAULT NULL,
  `payload` TEXT DEFAULT NULL COMMENT 'Дополнительная информация о причине отклонения товара. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Причины, по которым товар не прошел модерацию.';

--
-- Table structure for table `OfferProcessingStateDTO` generated from model 'OfferProcessingStateDTO'
-- Информация о статусе публикации товара на Маркете.
--

CREATE TABLE IF NOT EXISTS `OfferProcessingStateDTO` (
  `status` TEXT DEFAULT NULL,
  `notes` JSON DEFAULT NULL COMMENT 'Причины, по которым товар не прошел модерацию.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о статусе публикации товара на Маркете.';

--
-- Table structure for table `OfferRecommendationDTO` generated from model 'OfferRecommendationDTO'
-- Информация о состоянии цен и рекомендации. 
--

CREATE TABLE IF NOT EXISTS `OfferRecommendationDTO` (
  `offer` TEXT DEFAULT NULL,
  `recommendation` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о состоянии цен и рекомендации. ';

--
-- Table structure for table `OfferRecommendationInfoDTO` generated from model 'OfferRecommendationInfoDTO'
-- Рекомендации, касающиеся цены на товар.
--

CREATE TABLE IF NOT EXISTS `OfferRecommendationInfoDTO` (
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `recommendedCofinancePrice` TEXT DEFAULT NULL,
  `competitivenessThresholds` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Рекомендации, касающиеся цены на товар.';

--
-- Table structure for table `OfferRecommendationsResultDTO` generated from model 'OfferRecommendationsResultDTO'
-- Список товаров с рекомендациями.
--

CREATE TABLE IF NOT EXISTS `OfferRecommendationsResultDTO` (
  `paging` TEXT DEFAULT NULL,
  `offerRecommendations` JSON NOT NULL COMMENT 'Страница списка товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров с рекомендациями.';

--
-- Table structure for table `OfferSellingProgramDTO` generated from model 'OfferSellingProgramDTO'
-- Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
--

CREATE TABLE IF NOT EXISTS `OfferSellingProgramDTO` (
  `sellingProgram` TEXT NOT NULL,
  `status` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о том, по каким моделям можно продавать товар, а по каким нельзя.';

--
-- Table structure for table `OfferWeightDimensionsDTO` generated from model 'OfferWeightDimensionsDTO'
-- Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
--

CREATE TABLE IF NOT EXISTS `OfferWeightDimensionsDTO` (
  `length` DECIMAL(20, 9) NOT NULL COMMENT 'Длина упаковки в см. ',
  `width` DECIMAL(20, 9) NOT NULL COMMENT 'Ширина упаковки в см. ',
  `height` DECIMAL(20, 9) NOT NULL COMMENT 'Высота упаковки в см. ',
  `weight` DECIMAL(20, 9) NOT NULL COMMENT 'Вес товара в кг с учетом упаковки (брутто). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) ';

--
-- Table structure for table `OffersDTO` generated from model 'OffersDTO'
-- Найденные предложения магазина.
--

CREATE TABLE IF NOT EXISTS `OffersDTO` (
  `offers` JSON NOT NULL COMMENT 'Список предложений магазина.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Найденные предложения магазина.';

--
-- Table structure for table `OptionValuesLimitedDTO` generated from model 'OptionValuesLimitedDTO'
-- Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
--

CREATE TABLE IF NOT EXISTS `OptionValuesLimitedDTO` (
  `limitingOptionValueId` BIGINT NOT NULL COMMENT 'Идентификатор значения ограничивающей характеристики.',
  `optionValueIds` JSON NOT NULL COMMENT 'Идентификаторы допустимых значений ограничиваемой характеристики. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.';

--
-- Table structure for table `OrderBoxLayoutDTO` generated from model 'OrderBoxLayoutDTO'
-- Информация о коробке.
--

CREATE TABLE IF NOT EXISTS `OrderBoxLayoutDTO` (
  `items` JSON NOT NULL COMMENT 'Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о коробке.';

--
-- Table structure for table `OrderBoxLayoutItemDTO` generated from model 'OrderBoxLayoutItemDTO'
-- Информация о товаре в коробке.
--

CREATE TABLE IF NOT EXISTS `OrderBoxLayoutItemDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}   ',
  `fullCount` INT UNSIGNED DEFAULT NULL COMMENT 'Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;. ',
  `partialCount` TEXT DEFAULT NULL,
  `instances` JSON DEFAULT NULL COMMENT 'Переданные вами коды маркировки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товаре в коробке.';

--
-- Table structure for table `OrderBoxLayoutPartialCountDTO` generated from model 'OrderBoxLayoutPartialCountDTO'
-- Информация о части товара в коробке.
--

CREATE TABLE IF NOT EXISTS `OrderBoxLayoutPartialCountDTO` (
  `current` INT UNSIGNED NOT NULL COMMENT 'Номер части, начиная с 1.',
  `total` INT UNSIGNED NOT NULL COMMENT 'На сколько всего частей разделен товар.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о части товара в коробке.';

--
-- Table structure for table `OrderBoxesLayoutDTO` generated from model 'OrderBoxesLayoutDTO'
-- Распределение товаров по коробкам.
--

CREATE TABLE IF NOT EXISTS `OrderBoxesLayoutDTO` (
  `boxes` JSON NOT NULL COMMENT 'Список коробок.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Распределение товаров по коробкам.';

--
-- Table structure for table `OrderBusinessBuyerDTO` generated from model 'OrderBusinessBuyerDTO'
-- Информация о покупателе. 
--

CREATE TABLE IF NOT EXISTS `OrderBusinessBuyerDTO` (
  `inn` TEXT DEFAULT NULL COMMENT 'ИНН.',
  `kpp` TEXT DEFAULT NULL COMMENT 'КПП.',
  `organizationName` TEXT DEFAULT NULL COMMENT 'Наименование юридического лица.',
  `organizationJurAddress` TEXT DEFAULT NULL COMMENT 'Юридический адрес.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о покупателе. ';

--
-- Table structure for table `OrderBusinessDocumentsDTO` generated from model 'OrderBusinessDocumentsDTO'
-- Информация о документах. 
--

CREATE TABLE IF NOT EXISTS `OrderBusinessDocumentsDTO` (
  `upd` TEXT DEFAULT NULL,
  `ukd` TEXT DEFAULT NULL,
  `torgTwelve` TEXT DEFAULT NULL,
  `sf` TEXT DEFAULT NULL,
  `ksf` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о документах. ';

--
-- Table structure for table `OrderBuyerBasicInfoDTO` generated from model 'OrderBuyerBasicInfoDTO'
-- Информация о покупателе с базовыми полями.
--

CREATE TABLE IF NOT EXISTS `OrderBuyerBasicInfoDTO` (
  `id` TEXT DEFAULT NULL COMMENT 'Идентификатор покупателя.',
  `lastName` TEXT DEFAULT NULL COMMENT 'Фамилия покупателя.',
  `firstName` TEXT DEFAULT NULL COMMENT 'Имя покупателя.',
  `middleName` TEXT DEFAULT NULL COMMENT 'Отчество покупателя.',
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о покупателе с базовыми полями.';

--
-- Table structure for table `OrderBuyerDTO` generated from model 'OrderBuyerDTO'
-- Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS. 
--

CREATE TABLE IF NOT EXISTS `OrderBuyerDTO` (
  `id` TEXT DEFAULT NULL COMMENT 'Идентификатор покупателя.',
  `lastName` TEXT DEFAULT NULL COMMENT 'Фамилия покупателя.',
  `firstName` TEXT DEFAULT NULL COMMENT 'Имя покупателя.',
  `middleName` TEXT DEFAULT NULL COMMENT 'Отчество покупателя.',
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS. ';

--
-- Table structure for table `OrderBuyerInfoDTO` generated from model 'OrderBuyerInfoDTO'
-- Информация о покупателе и его номере телефона.
--

CREATE TABLE IF NOT EXISTS `OrderBuyerInfoDTO` (
  `id` TEXT DEFAULT NULL COMMENT 'Идентификатор покупателя.',
  `lastName` TEXT DEFAULT NULL COMMENT 'Фамилия покупателя.',
  `firstName` TEXT DEFAULT NULL COMMENT 'Имя покупателя.',
  `middleName` TEXT DEFAULT NULL COMMENT 'Отчество покупателя.',
  `type` TEXT DEFAULT NULL,
  `phone` TEXT DEFAULT NULL COMMENT 'Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о покупателе и его номере телефона.';

--
-- Table structure for table `OrderCourierDTO` generated from model 'OrderCourierDTO'
-- Информация о курьере.
--

CREATE TABLE IF NOT EXISTS `OrderCourierDTO` (
  `fullName` TEXT DEFAULT NULL COMMENT 'Полное имя курьера.',
  `phone` TEXT DEFAULT NULL COMMENT 'Номер телефона курьера.',
  `phoneExtension` TEXT DEFAULT NULL COMMENT 'Добавочный номер телефона.',
  `vehicleNumber` TEXT DEFAULT NULL COMMENT 'Номер транспортного средства.',
  `vehicleDescription` TEXT DEFAULT NULL COMMENT 'Описание машины. Например, модель и цвет.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о курьере.';

--
-- Table structure for table `OrderDTO` generated from model 'OrderDTO'
-- Заказ.
--

CREATE TABLE IF NOT EXISTS `OrderDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор заказа.',
  `status` TEXT DEFAULT NULL,
  `substatus` TEXT DEFAULT NULL,
  `creationDate` TEXT DEFAULT NULL,
  `updatedAt` TEXT DEFAULT NULL,
  `currency` TEXT DEFAULT NULL,
  `itemsTotal` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Платеж покупателя. ',
  `deliveryTotal` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Стоимость доставки. ',
  `buyerItemsTotal` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. ',
  `buyerTotal` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. ',
  `buyerItemsTotalBeforeDiscount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. ',
  `buyerTotalBeforeDiscount` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). ',
  `paymentType` TEXT DEFAULT NULL,
  `paymentMethod` TEXT DEFAULT NULL,
  `fake` TINYINT(1) DEFAULT NULL COMMENT 'Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ',
  `items` JSON NOT NULL COMMENT 'Список товаров в заказе.',
  `subsidies` JSON DEFAULT NULL COMMENT 'Список субсидий по типам.',
  `delivery` TEXT DEFAULT NULL,
  `buyer` TEXT DEFAULT NULL,
  `notes` TEXT DEFAULT NULL COMMENT 'Комментарий к заказу.',
  `taxSystem` TEXT DEFAULT NULL,
  `cancelRequested` TINYINT(1) DEFAULT NULL COMMENT '**Только для модели DBS**  Запрошена ли отмена. ',
  `expiryDate` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Заказ.';

--
-- Table structure for table `OrderDeliveryAddressDTO` generated from model 'OrderDeliveryAddressDTO'
-- Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
--

CREATE TABLE IF NOT EXISTS `OrderDeliveryAddressDTO` (
  `country` TEXT DEFAULT NULL COMMENT 'Страна.  Обязательный параметр. ',
  `postcode` TEXT DEFAULT NULL COMMENT 'Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;). ',
  `city` TEXT DEFAULT NULL COMMENT 'Город или населенный пункт.  Обязательный параметр. ',
  `district` TEXT DEFAULT NULL COMMENT 'Район.',
  `subway` TEXT DEFAULT NULL COMMENT 'Станция метро.',
  `street` TEXT DEFAULT NULL COMMENT 'Улица.  Обязательный параметр. ',
  `house` TEXT DEFAULT NULL COMMENT 'Дом или владение.  Обязательный параметр. ',
  `block` TEXT DEFAULT NULL COMMENT 'Корпус или строение.',
  `entrance` TEXT DEFAULT NULL COMMENT 'Подъезд.',
  `entryphone` TEXT DEFAULT NULL COMMENT 'Код домофона.',
  `floor` TEXT DEFAULT NULL COMMENT 'Этаж.',
  `apartment` TEXT DEFAULT NULL COMMENT 'Квартира или офис.',
  `phone` TEXT DEFAULT NULL COMMENT 'Телефон получателя заказа.  Обязательный параметр. ',
  `recipient` TEXT DEFAULT NULL COMMENT 'Фамилия, имя и отчество получателя заказа.  Обязательный параметр. ',
  `gps` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). ';

--
-- Table structure for table `OrderDeliveryDTO` generated from model 'OrderDeliveryDTO'
-- Информация о доставке.
--

CREATE TABLE IF NOT EXISTS `OrderDeliveryDTO` (
  `id` TEXT DEFAULT NULL COMMENT 'Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). ',
  `type` TEXT DEFAULT NULL,
  `serviceName` TEXT DEFAULT NULL COMMENT 'Наименование службы доставки.',
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа. ',
  `deliveryPartnerType` TEXT DEFAULT NULL,
  `courier` TEXT DEFAULT NULL,
  `dates` TEXT DEFAULT NULL,
  `region` TEXT DEFAULT NULL,
  `address` TEXT DEFAULT NULL,
  `vat` TEXT DEFAULT NULL,
  `deliveryServiceId` BIGINT DEFAULT NULL COMMENT 'Идентификатор службы доставки.',
  `liftType` TEXT DEFAULT NULL,
  `liftPrice` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Стоимость подъема на этаж.',
  `outletCode` TEXT DEFAULT NULL COMMENT 'Идентификатор пункта самовывоза, присвоенный магазином.',
  `outletStorageLimitDate` TEXT DEFAULT NULL COMMENT 'Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. ',
  `dispatchType` TEXT DEFAULT NULL,
  `tracks` JSON DEFAULT NULL COMMENT 'Информация для отслеживания перемещений посылки.',
  `shipments` JSON DEFAULT NULL COMMENT 'Информация о посылках.',
  `estimated` TINYINT(1) DEFAULT NULL COMMENT 'Приблизительная ли дата доставки.',
  `eacType` TEXT DEFAULT NULL,
  `eacCode` TEXT DEFAULT NULL COMMENT 'Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о доставке.';

--
-- Table structure for table `OrderDeliveryDateDTO` generated from model 'OrderDeliveryDateDTO'
-- Информация о новой дате доставки заказа.
--

CREATE TABLE IF NOT EXISTS `OrderDeliveryDateDTO` (
  `toDate` DATE NOT NULL COMMENT 'Новая дата доставки заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о новой дате доставки заказа.';

--
-- Table structure for table `OrderDeliveryDatesDTO` generated from model 'OrderDeliveryDatesDTO'
-- Диапазон дат доставки.
--

CREATE TABLE IF NOT EXISTS `OrderDeliveryDatesDTO` (
  `fromDate` TEXT DEFAULT NULL COMMENT 'Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. ',
  `toDate` TEXT DEFAULT NULL COMMENT 'Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. ',
  `fromTime` TEXT DEFAULT NULL COMMENT 'Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;. ',
  `toTime` TEXT DEFAULT NULL COMMENT 'Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;. ',
  `realDeliveryDate` TEXT DEFAULT NULL COMMENT 'Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Диапазон дат доставки.';

--
-- Table structure for table `OrderDigitalItemDTO` generated from model 'OrderDigitalItemDTO'
-- Ключ цифрового товара.
--

CREATE TABLE IF NOT EXISTS `OrderDigitalItemDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. ',
  `code` TEXT NOT NULL COMMENT 'Сам ключ.',
  `slip` TEXT NOT NULL COMMENT 'Инструкция по активации.',
  `activate_till` DATE NOT NULL COMMENT 'Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ключ цифрового товара.';

--
-- Table structure for table `OrderItemDTO` generated from model 'OrderItemDTO'
-- Список товаров в заказе.
--

CREATE TABLE IF NOT EXISTS `OrderItemDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ',
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `offerName` TEXT DEFAULT NULL COMMENT 'Название товара.',
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;). ',
  `buyerPrice` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. ',
  `buyerPriceBeforeDiscount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. ',
  `priceBeforeDiscount` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. ',
  `count` INT DEFAULT NULL COMMENT 'Количество единиц товара.',
  `vat` TEXT DEFAULT NULL,
  `shopSku` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `subsidy` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. ',
  `partnerWarehouseId` TEXT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. ',
  `promos` JSON DEFAULT NULL COMMENT 'Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.',
  `instances` JSON DEFAULT NULL COMMENT 'Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует. ',
  `details` JSON DEFAULT NULL COMMENT 'Информация об удалении товара из заказа. ',
  `subsidies` JSON DEFAULT NULL COMMENT 'Список субсидий по типам.',
  `requiredInstanceTypes` JSON DEFAULT NULL COMMENT 'Список необходимых маркировок товара.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров в заказе.';

--
-- Table structure for table `OrderItemDetailDTO` generated from model 'OrderItemDetailDTO'
-- Детали по товару в заказе.
--

CREATE TABLE IF NOT EXISTS `OrderItemDetailDTO` (
  `itemCount` BIGINT DEFAULT NULL COMMENT 'Количество единиц товара.',
  `itemStatus` TEXT DEFAULT NULL,
  `updateDate` TEXT DEFAULT NULL COMMENT 'Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Детали по товару в заказе.';

--
-- Table structure for table `OrderItemInstanceDTO` generated from model 'OrderItemInstanceDTO'
-- Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
--

CREATE TABLE IF NOT EXISTS `OrderItemInstanceDTO` (
  `cis` TEXT DEFAULT NULL COMMENT 'Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.',
  `cisFull` TEXT DEFAULT NULL COMMENT 'Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.',
  `uin` TEXT DEFAULT NULL COMMENT 'УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. ',
  `rnpt` TEXT DEFAULT NULL COMMENT 'Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. ',
  `gtd` TEXT DEFAULT NULL COMMENT 'Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. ';

--
-- Table structure for table `OrderItemInstanceModificationDTO` generated from model 'OrderItemInstanceModificationDTO'
-- Позиция в корзине, требующая маркировки.
--

CREATE TABLE IF NOT EXISTS `OrderItemInstanceModificationDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;. ',
  `instances` JSON NOT NULL COMMENT 'Список кодов маркировки единиц товара. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Позиция в корзине, требующая маркировки.';

--
-- Table structure for table `OrderItemModificationDTO` generated from model 'OrderItemModificationDTO'
-- Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
--

CREATE TABLE IF NOT EXISTS `OrderItemModificationDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. ',
  `count` INT UNSIGNED NOT NULL COMMENT 'Новое количество товара.',
  `instances` JSON DEFAULT NULL COMMENT 'Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. ';

--
-- Table structure for table `OrderItemPromoDTO` generated from model 'OrderItemPromoDTO'
-- Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
--

CREATE TABLE IF NOT EXISTS `OrderItemPromoDTO` (
  `type` TEXT NOT NULL,
  `discount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Размер пользовательской скидки в валюте покупателя. ',
  `subsidy` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. ',
  `shopPromoId` TEXT DEFAULT NULL COMMENT 'Идентификатор акции поставщика. ',
  `marketPromoId` TEXT DEFAULT NULL COMMENT 'Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.';

--
-- Table structure for table `OrderItemSubsidyDTO` generated from model 'OrderItemSubsidyDTO'
-- Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
--

CREATE TABLE IF NOT EXISTS `OrderItemSubsidyDTO` (
  `type` TEXT DEFAULT NULL,
  `amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Сумма субсидии.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. ';

--
-- Table structure for table `OrderItemsModificationResultDTO` generated from model 'OrderItemsModificationResultDTO'
-- Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
--

CREATE TABLE IF NOT EXISTS `OrderItemsModificationResultDTO` (
  `items` JSON NOT NULL COMMENT 'Список позиций в заказе, подлежащих маркировке.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. ';

--
-- Table structure for table `OrderLabelDTO` generated from model 'OrderLabelDTO'
-- Данные для печати ярлыка.
--

CREATE TABLE IF NOT EXISTS `OrderLabelDTO` (
  `orderId` BIGINT NOT NULL COMMENT 'Идентификатор заказа.',
  `placesNumber` INT NOT NULL COMMENT 'Количество коробок в заказе.',
  `url` TEXT NOT NULL COMMENT 'URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). ',
  `parcelBoxLabels` JSON NOT NULL COMMENT 'Информация на ярлыке.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные для печати ярлыка.';

--
-- Table structure for table `OrderParcelBoxDTO` generated from model 'OrderParcelBoxDTO'
-- Информация о грузоместе.
--

CREATE TABLE IF NOT EXISTS `OrderParcelBoxDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор грузоместа.',
  `fulfilmentId` TEXT DEFAULT NULL COMMENT 'Идентификатор грузового места в информационной системе магазина.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о грузоместе.';

--
-- Table structure for table `OrderShipmentDTO` generated from model 'OrderShipmentDTO'
-- Список посылок.  В параметре может указываться несколько посылок. 
--

CREATE TABLE IF NOT EXISTS `OrderShipmentDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор посылки, присвоенный Маркетом.',
  `shipmentDate` TEXT DEFAULT NULL COMMENT 'Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. ',
  `shipmentTime` TEXT DEFAULT NULL COMMENT '**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ',
  `tracks` JSON DEFAULT NULL COMMENT '**Только для модели DBS**  Информация для отслеживания перемещений посылки. ',
  `boxes` JSON DEFAULT NULL COMMENT 'Список грузовых мест.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список посылок.  В параметре может указываться несколько посылок. ';

--
-- Table structure for table `OrderStateDTO` generated from model 'OrderStateDTO'
-- Информация по заказу.
--

CREATE TABLE IF NOT EXISTS `OrderStateDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор заказа.',
  `status` TEXT NOT NULL,
  `substatus` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация по заказу.';

--
-- Table structure for table `OrderStatusChangeDTO` generated from model 'OrderStatusChangeDTO'
-- Заказ.
--

CREATE TABLE IF NOT EXISTS `OrderStatusChangeDTO` (
  `status` TEXT NOT NULL,
  `substatus` TEXT DEFAULT NULL,
  `delivery` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Заказ.';

--
-- Table structure for table `OrderStatusChangeDeliveryDTO` generated from model 'OrderStatusChangeDeliveryDTO'
-- Информация о доставке.
--

CREATE TABLE IF NOT EXISTS `OrderStatusChangeDeliveryDTO` (
  `dates` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о доставке.';

--
-- Table structure for table `OrderStatusChangeDeliveryDatesDTO` generated from model 'OrderStatusChangeDeliveryDatesDTO'
-- Диапазон дат доставки.
--

CREATE TABLE IF NOT EXISTS `OrderStatusChangeDeliveryDatesDTO` (
  `realDeliveryDate` DATE DEFAULT NULL COMMENT '**Только для модели DBS**  Фактическая дата доставки. &lt;br&gt;&lt;br&gt; Когда передавать параметр &#x60;realDeliveryDate&#x60;:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;;   * меняете статус заказа на &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \&quot;Индекс качества\&quot; %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Диапазон дат доставки.';

--
-- Table structure for table `OrderSubsidyDTO` generated from model 'OrderSubsidyDTO'
-- Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
--

CREATE TABLE IF NOT EXISTS `OrderSubsidyDTO` (
  `type` TEXT DEFAULT NULL,
  `amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Сумма субсидии.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. ';

--
-- Table structure for table `OrderTrackDTO` generated from model 'OrderTrackDTO'
-- Информация о трек-номере посылки (DBS).
--

CREATE TABLE IF NOT EXISTS `OrderTrackDTO` (
  `trackCode` TEXT DEFAULT NULL COMMENT 'Трек‑номер посылки.',
  `deliveryServiceId` BIGINT DEFAULT NULL COMMENT 'Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о трек-номере посылки (DBS).';

--
-- Table structure for table `OrdersShipmentInfoDTO` generated from model 'OrdersShipmentInfoDTO'
-- Годные/негодные ярлыки по заказам в отгрузке.
--

CREATE TABLE IF NOT EXISTS `OrdersShipmentInfoDTO` (
  `orderIdsWithLabels` JSON NOT NULL COMMENT 'Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.',
  `orderIdsWithoutLabels` JSON NOT NULL COMMENT 'Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Годные/негодные ярлыки по заказам в отгрузке.';

--
-- Table structure for table `OrdersStatsCommissionDTO` generated from model 'OrdersStatsCommissionDTO'
-- Информация о стоимости услуг.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsCommissionDTO` (
  `type` TEXT DEFAULT NULL,
  `actual` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о стоимости услуг.';

--
-- Table structure for table `OrdersStatsDTO` generated from model 'OrdersStatsDTO'
-- Информация по заказам.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsDTO` (
  `orders` JSON NOT NULL COMMENT 'Список заказов.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация по заказам.';

--
-- Table structure for table `OrdersStatsDeliveryRegionDTO` generated from model 'OrdersStatsDeliveryRegionDTO'
-- Информация о регионе доставки.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsDeliveryRegionDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона доставки.',
  `name` TEXT DEFAULT NULL COMMENT 'Название региона доставки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о регионе доставки.';

--
-- Table structure for table `OrdersStatsDetailsDTO` generated from model 'OrdersStatsDetailsDTO'
-- Информация об удалении товара из заказа.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsDetailsDTO` (
  `itemStatus` TEXT DEFAULT NULL,
  `itemCount` BIGINT DEFAULT NULL COMMENT 'Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.',
  `updateDate` DATE DEFAULT NULL COMMENT 'Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. ',
  `stockType` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об удалении товара из заказа.';

--
-- Table structure for table `OrdersStatsItemDTO` generated from model 'OrdersStatsItemDTO'
-- Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
--

CREATE TABLE IF NOT EXISTS `OrdersStatsItemDTO` (
  `offerName` TEXT DEFAULT NULL COMMENT 'Название товара.',
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.',
  `shopSku` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `count` INT DEFAULT NULL COMMENT 'Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;. ',
  `prices` JSON DEFAULT NULL COMMENT 'Цена или скидки на товар.',
  `warehouse` TEXT DEFAULT NULL,
  `details` JSON DEFAULT NULL COMMENT 'Информация об удалении товара из заказа.',
  `cisList` JSON DEFAULT NULL COMMENT 'Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).',
  `initialCount` INT DEFAULT NULL COMMENT 'Первоначальное количество единиц товара.',
  `bidFee` SMALLINT UNSIGNED DEFAULT NULL COMMENT 'Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. ',
  `cofinanceThreshold` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. ',
  `cofinanceValue` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). ';

--
-- Table structure for table `OrdersStatsOrderDTO` generated from model 'OrdersStatsOrderDTO'
-- Информация о заказе.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsOrderDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор заказа.',
  `creationDate` DATE DEFAULT NULL COMMENT 'Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. ',
  `statusUpdateDate` DATETIME DEFAULT NULL COMMENT 'Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). ',
  `status` TEXT DEFAULT NULL,
  `partnerOrderId` TEXT DEFAULT NULL COMMENT 'Идентификатор заказа в информационной системе магазина.',
  `paymentType` TEXT DEFAULT NULL,
  `fake` TINYINT(1) DEFAULT NULL COMMENT 'Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ',
  `deliveryRegion` TEXT DEFAULT NULL,
  `items` JSON NOT NULL COMMENT 'Список товаров в заказе после возможных изменений.',
  `initialItems` JSON DEFAULT NULL COMMENT 'Список товаров в заказе до изменений.',
  `payments` JSON NOT NULL COMMENT 'Информация о денежных переводах по заказу.',
  `commissions` JSON NOT NULL COMMENT 'Информация о комиссиях за заказ.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о заказе.';

--
-- Table structure for table `OrdersStatsPaymentDTO` generated from model 'OrdersStatsPaymentDTO'
-- Информация о денежных переводах по заказу.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsPaymentDTO` (
  `id` TEXT DEFAULT NULL COMMENT 'Идентификатор денежного перевода.',
  `date` DATE DEFAULT NULL COMMENT 'Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. ',
  `type` TEXT DEFAULT NULL,
  `source` TEXT DEFAULT NULL,
  `total` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. ',
  `paymentOrder` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о денежных переводах по заказу.';

--
-- Table structure for table `OrdersStatsPaymentOrderDTO` generated from model 'OrdersStatsPaymentOrderDTO'
-- Информация о платежном получении.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsPaymentOrderDTO` (
  `id` TEXT DEFAULT NULL COMMENT 'Номер платежного поручения.',
  `date` DATE DEFAULT NULL COMMENT 'Дата платежного поручения.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о платежном получении.';

--
-- Table structure for table `OrdersStatsPriceDTO` generated from model 'OrdersStatsPriceDTO'
-- Цена или скидки на товар.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsPriceDTO` (
  `type` TEXT DEFAULT NULL,
  `costPerItem` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. ',
  `total` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Цена или скидки на товар.';

--
-- Table structure for table `OrdersStatsWarehouseDTO` generated from model 'OrdersStatsWarehouseDTO'
-- Информация о складе, на котором хранится товар.
--

CREATE TABLE IF NOT EXISTS `OrdersStatsWarehouseDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор склада.',
  `name` TEXT DEFAULT NULL COMMENT 'Название склада.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о складе, на котором хранится товар.';

--
-- Table structure for table `OutletAddressDTO` generated from model 'OutletAddressDTO'
-- Адрес точки продаж. 
--

CREATE TABLE IF NOT EXISTS `OutletAddressDTO` (
  `regionId` BIGINT NOT NULL COMMENT 'Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} ',
  `street` TEXT DEFAULT NULL COMMENT 'Улица.',
  `number` TEXT DEFAULT NULL COMMENT 'Номер дома.',
  `building` VARCHAR(16) DEFAULT NULL COMMENT 'Номер строения.',
  `estate` VARCHAR(16) DEFAULT NULL COMMENT 'Номер владения.',
  `block` VARCHAR(16) DEFAULT NULL COMMENT 'Номер корпуса.',
  `additional` TEXT DEFAULT NULL COMMENT 'Дополнительная информация.',
  `km` INT DEFAULT NULL COMMENT 'Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.',
  `city` VARCHAR(200) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %} '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Адрес точки продаж. ';

--
-- Table structure for table `OutletDTO` generated from model 'OutletDTO'
-- Информация о точке продаж.
--

CREATE TABLE IF NOT EXISTS `OutletDTO` (
  `name` TEXT NOT NULL COMMENT 'Название точки продаж. ',
  `type` TEXT NOT NULL,
  `coords` TEXT DEFAULT NULL COMMENT 'Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;. ',
  `isMain` TINYINT(1) DEFAULT NULL COMMENT 'Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж. ',
  `shopOutletCode` TEXT DEFAULT NULL COMMENT 'Идентификатор точки продаж, присвоенный магазином.',
  `visibility` TEXT DEFAULT NULL,
  `address` TEXT NOT NULL,
  `phones` JSON NOT NULL COMMENT 'Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;. ',
  `workingSchedule` TEXT NOT NULL,
  `deliveryRules` JSON DEFAULT NULL COMMENT 'Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;. ',
  `storagePeriod` BIGINT DEFAULT NULL COMMENT 'Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о точке продаж.';

--
-- Table structure for table `OutletDeliveryRuleDTO` generated from model 'OutletDeliveryRuleDTO'
-- Информация об условиях доставки для данной точки продаж.
--

CREATE TABLE IF NOT EXISTS `OutletDeliveryRuleDTO` (
  `minDeliveryDays` INT DEFAULT NULL COMMENT 'Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;. ',
  `maxDeliveryDays` INT DEFAULT NULL COMMENT 'Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: &#x60;0&#x60; — доставка в день заказа.  Максимальное значение: &#x60;60&#x60;.  Допустимые сроки доставки (разница между &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если &#x60;minDeliveryDays&#x60; равно 1, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если &#x60;minDeliveryDays&#x60; до 18 дней, разница не должна превышать четырех дней. Например, если &#x60;minDeliveryDays&#x60; равно 10, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 10 до 14. * Если &#x60;minDeliveryDays&#x60; больше 18 дней, разница должна быть не больше чем в два раза. Например, если &#x60;minDeliveryDays&#x60; равно 21, то для &#x60;maxDeliveryDays&#x60; допускаются значения от 21 до 42.  Обязательный параметр, если &#x60;type&#x3D;\&quot;DEPOT\&quot;&#x60; или &#x60;type&#x3D;\&quot;MIXED\&quot;&#x60;.  Взаимоисключающий с параметром &#x60;unspecifiedDeliveryInterval&#x60;. ',
  `deliveryServiceId` BIGINT DEFAULT NULL COMMENT 'Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). ',
  `orderBefore` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от &#x60;minDeliveryDays&#x60; до &#x60;maxDeliveryDays&#x60;.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от &#x60;minDeliveryDays&#x60; + 1 рабочий день до &#x60;maxDeliveryDays&#x60; + 1 рабочий день.  Значение по умолчанию: &#x60;24&#x60;. ',
  `priceFreePickup` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.',
  `unspecifiedDeliveryInterval` TINYINT(1) DEFAULT NULL COMMENT 'Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * &#x60;true&#x60; — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением &#x60;true&#x60;.  Взаимоисключающий с параметрами &#x60;minDeliveryDays&#x60; и &#x60;maxDeliveryDays&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об условиях доставки для данной точки продаж.';

--
-- Table structure for table `OutletLicenseDTO` generated from model 'OutletLicenseDTO'
-- Информация о лицензии.
--

CREATE TABLE IF NOT EXISTS `OutletLicenseDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре &#x60;number&#x60;. ',
  `outletId` BIGINT DEFAULT NULL COMMENT 'Идентификатор точки продаж, для которой действительна лицензия.',
  `licenseType` TEXT DEFAULT NULL,
  `number` TEXT DEFAULT NULL COMMENT 'Номер лицензии.',
  `dateOfIssue` DATETIME DEFAULT NULL COMMENT 'Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение &#x60;2017-11-13T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре &#x60;dateOfExpiry&#x60;. ',
  `dateOfExpiry` DATETIME DEFAULT NULL COMMENT 'Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время &#x60;00:00:00&#x60; и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение &#x60;2022-11-20T00:00:00+03:00&#x60;.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре &#x60;dateOfIssue&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о лицензии.';

--
-- Table structure for table `OutletLicensesResponseDTO` generated from model 'OutletLicensesResponseDTO'
-- Ответ на запрос информации о лицензиях для точек продаж.
--

CREATE TABLE IF NOT EXISTS `OutletLicensesResponseDTO` (
  `licenses` JSON NOT NULL COMMENT 'Список лицензий.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос информации о лицензиях для точек продаж.';

--
-- Table structure for table `OutletResponseDTO` generated from model 'OutletResponseDTO'
-- Результат выполнения запроса. Выводится, если &#x60;status&#x3D;\&quot;OK\&quot;&#x60;. 
--

CREATE TABLE IF NOT EXISTS `OutletResponseDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор точки продаж, присвоенный Маркетом.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат выполнения запроса. Выводится, если &#x60;status&#x3D;\&quot;OK\&quot;&#x60;. ';

--
-- Table structure for table `OutletWorkingScheduleDTO` generated from model 'OutletWorkingScheduleDTO'
-- Список режимов работы точки продаж. 
--

CREATE TABLE IF NOT EXISTS `OutletWorkingScheduleDTO` (
  `workInHoliday` TINYINT(1) DEFAULT NULL COMMENT 'Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников. ',
  `scheduleItems` JSON NOT NULL COMMENT 'Список расписаний работы точки продаж. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список режимов работы точки продаж. ';

--
-- Table structure for table `OutletWorkingScheduleItemDTO` generated from model 'OutletWorkingScheduleItemDTO'
-- Расписание работы точки продаж.
--

CREATE TABLE IF NOT EXISTS `OutletWorkingScheduleItemDTO` (
  `startDay` TEXT NOT NULL,
  `endDay` TEXT NOT NULL,
  `startTime` TEXT NOT NULL COMMENT 'Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. ',
  `endTime` TEXT NOT NULL COMMENT 'Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Расписание работы точки продаж.';

--
-- Table structure for table `PagedReturnsDTO` generated from model 'PagedReturnsDTO'
-- Возвраты.
--

CREATE TABLE IF NOT EXISTS `PagedReturnsDTO` (
  `paging` TEXT DEFAULT NULL,
  `returns` JSON NOT NULL COMMENT 'Список возвратов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Возвраты.';

--
-- Table structure for table `PalletsCountDTO` generated from model 'PalletsCountDTO'
-- Количество палет в отгрузке.
--

CREATE TABLE IF NOT EXISTS `PalletsCountDTO` (
  `planned` INT DEFAULT NULL COMMENT 'Количество палет, которое заявил продавец.',
  `fact` INT DEFAULT NULL COMMENT 'Количество палет, которое приняли в сортировочном центре.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Количество палет в отгрузке.';

--
-- Table structure for table `ParameterValueConstraintsDTO` generated from model 'ParameterValueConstraintsDTO'
-- Ограничения на значения характеристик.
--

CREATE TABLE IF NOT EXISTS `ParameterValueConstraintsDTO` (
  `minValue` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Минимальное число.',
  `maxValue` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Максимальное число.',
  `maxLength` INT DEFAULT NULL COMMENT 'Максимальная длина текста.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ограничения на значения характеристик.';

--
-- Table structure for table `ParameterValueDTO` generated from model 'ParameterValueDTO'
-- Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. 
--

CREATE TABLE IF NOT EXISTS `ParameterValueDTO` (
  `parameterId` BIGINT NOT NULL COMMENT 'Идентификатор характеристики.',
  `unitId` BIGINT DEFAULT NULL COMMENT 'Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию.',
  `valueId` BIGINT DEFAULT NULL COMMENT 'Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;. ',
  `value` TEXT DEFAULT NULL COMMENT 'Значение.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. ';

--
-- Table structure for table `ParameterValueOptionDTO` generated from model 'ParameterValueOptionDTO'
-- Значение характеристики.
--

CREATE TABLE IF NOT EXISTS `ParameterValueOptionDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор значения.',
  `value` TEXT NOT NULL COMMENT 'Значение.',
  `description` TEXT DEFAULT NULL COMMENT 'Описание значения.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Значение характеристики.';

--
-- Table structure for table `ParcelBoxDTO` generated from model 'ParcelBoxDTO'
-- Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
--

CREATE TABLE IF NOT EXISTS `ParcelBoxDTO` (
  `id` BIGINT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} ',
  `fulfilmentId` TEXT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.';

--
-- Table structure for table `ParcelBoxLabelDTO` generated from model 'ParcelBoxLabelDTO'
-- Информация о ярлыке для коробки.
--

CREATE TABLE IF NOT EXISTS `ParcelBoxLabelDTO` (
  `url` TEXT NOT NULL COMMENT 'Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). ',
  `supplierName` TEXT NOT NULL COMMENT 'Юридическое название магазина.',
  `deliveryServiceName` TEXT NOT NULL COMMENT 'Юридическое название службы доставки.',
  `orderId` BIGINT NOT NULL COMMENT 'Идентификатор заказа в системе Маркета.',
  `orderNum` TEXT NOT NULL COMMENT 'Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина. ',
  `recipientName` TEXT NOT NULL COMMENT 'Фамилия и инициалы получателя заказа.',
  `boxId` BIGINT NOT NULL COMMENT 'Идентификатор коробки.',
  `fulfilmentId` TEXT NOT NULL COMMENT 'Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д. ',
  `place` TEXT NOT NULL COMMENT 'Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;. ',
  `weight` TEXT NOT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;. ',
  `deliveryServiceId` TEXT NOT NULL COMMENT 'Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).',
  `deliveryAddress` TEXT DEFAULT NULL COMMENT 'Адрес получателя.',
  `shipmentDate` TEXT DEFAULT NULL COMMENT 'Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о ярлыке для коробки.';

--
-- Table structure for table `ParcelDTO` generated from model 'ParcelDTO'
-- Информация о грузовых местах в заказе.
--

CREATE TABLE IF NOT EXISTS `ParcelDTO` (
  `boxes` JSON NOT NULL COMMENT 'Список грузовых мест. Маркет определяет количество мест по длине этого списка.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о грузовых местах в заказе.';

--
-- Table structure for table `PartnerShipmentWarehouseDTO` generated from model 'PartnerShipmentWarehouseDTO'
-- Данные о складе отправления.
--

CREATE TABLE IF NOT EXISTS `PartnerShipmentWarehouseDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор склада отправления.',
  `name` TEXT DEFAULT NULL COMMENT 'Наименование склада отправления.',
  `address` TEXT DEFAULT NULL COMMENT 'Адрес склада отправления.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Данные о складе отправления.';

--
-- Table structure for table `PickupAddressDTO` generated from model 'PickupAddressDTO'
-- Адрес доставки.
--

CREATE TABLE IF NOT EXISTS `PickupAddressDTO` (
  `country` TEXT DEFAULT NULL COMMENT 'Страна.',
  `city` TEXT DEFAULT NULL COMMENT 'Город.',
  `street` TEXT DEFAULT NULL COMMENT 'Улица.',
  `house` TEXT DEFAULT NULL COMMENT 'Номер дома.',
  `postcode` TEXT DEFAULT NULL COMMENT 'Почтовый индекс.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Адрес доставки.';

--
-- Table structure for table `PriceCompetitivenessThresholdsDTO` generated from model 'PriceCompetitivenessThresholdsDTO'
-- Максимальные значения цены, при которых она является привлекательной или умеренной.
--

CREATE TABLE IF NOT EXISTS `PriceCompetitivenessThresholdsDTO` (
  `optimalPrice` TEXT DEFAULT NULL,
  `averagePrice` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Максимальные значения цены, при которых она является привлекательной или умеренной.';

--
-- Table structure for table `PriceDTO` generated from model 'PriceDTO'
-- Цена с указанием скидки, валюты и времени последнего обновления.
--

CREATE TABLE IF NOT EXISTS `PriceDTO` (
  `value` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар.',
  `discountBase` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ',
  `currencyId` TEXT DEFAULT NULL,
  `vat` INT DEFAULT NULL COMMENT 'Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Цена с указанием скидки, валюты и времени последнего обновления.';

--
-- Table structure for table `PriceQuarantineVerdictDTO` generated from model 'PriceQuarantineVerdictDTO'
-- Причина попадания товара в карантин.
--

CREATE TABLE IF NOT EXISTS `PriceQuarantineVerdictDTO` (
  `type` TEXT DEFAULT NULL,
  `params` JSON NOT NULL COMMENT 'Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Причина попадания товара в карантин.';

--
-- Table structure for table `PriceQuarantineVerdictParameterDTO` generated from model 'PriceQuarantineVerdictParameterDTO'
-- Параметр карантина.
--

CREATE TABLE IF NOT EXISTS `PriceQuarantineVerdictParameterDTO` (
  `name` TEXT NOT NULL,
  `value` TEXT NOT NULL COMMENT 'Значение параметра.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметр карантина.';

--
-- Table structure for table `PriceRecommendationItemDTO` generated from model 'PriceRecommendationItemDTO'
-- Рекомендованная цена.
--

CREATE TABLE IF NOT EXISTS `PriceRecommendationItemDTO` (
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор кампании.',
  `price` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Рекомендованная цена.';

--
-- Table structure for table `PriceSuggestDTO` generated from model 'PriceSuggestDTO'
-- Тип цены.
--

CREATE TABLE IF NOT EXISTS `PriceSuggestDTO` (
  `type` TEXT DEFAULT NULL,
  `price` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Цена в рублях.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Тип цены.';

--
-- Table structure for table `PriceSuggestOfferDTO` generated from model 'PriceSuggestOfferDTO'
-- Товар с ценами для продвижения.
--

CREATE TABLE IF NOT EXISTS `PriceSuggestOfferDTO` (
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.',
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `priceSuggestion` JSON DEFAULT NULL COMMENT 'Цены для продвижения. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар с ценами для продвижения.';

--
-- Table structure for table `PromoOfferAutoParticipatingDetailsDTO` generated from model 'PromoOfferAutoParticipatingDetailsDTO'
-- Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
--

CREATE TABLE IF NOT EXISTS `PromoOfferAutoParticipatingDetailsDTO` (
  `campaignIds` JSON DEFAULT NULL COMMENT 'Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). ';

--
-- Table structure for table `PromoOfferDiscountParamsDTO` generated from model 'PromoOfferDiscountParamsDTO'
-- Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
--

CREATE TABLE IF NOT EXISTS `PromoOfferDiscountParamsDTO` (
  `price` BIGINT DEFAULT NULL COMMENT 'Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ',
  `promoPrice` BIGINT DEFAULT NULL COMMENT 'Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ',
  `maxPromoPrice` BIGINT NOT NULL COMMENT 'Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.';

--
-- Table structure for table `PromoOfferParamsDTO` generated from model 'PromoOfferParamsDTO'
-- Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
--

CREATE TABLE IF NOT EXISTS `PromoOfferParamsDTO` (
  `discountParams` TEXT DEFAULT NULL,
  `promocodeParams` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. ';

--
-- Table structure for table `PromoOfferPromocodeParamsDTO` generated from model 'PromoOfferPromocodeParamsDTO'
-- Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
--

CREATE TABLE IF NOT EXISTS `PromoOfferPromocodeParamsDTO` (
  `maxPrice` BIGINT NOT NULL COMMENT 'Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.';

--
-- Table structure for table `PromoOfferUpdateWarningDTO` generated from model 'PromoOfferUpdateWarningDTO'
-- Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
--

CREATE TABLE IF NOT EXISTS `PromoOfferUpdateWarningDTO` (
  `code` TEXT NOT NULL,
  `campaignIds` JSON DEFAULT NULL COMMENT 'Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.';

--
-- Table structure for table `PromoPeriodDTO` generated from model 'PromoPeriodDTO'
-- Время проведения акции.
--

CREATE TABLE IF NOT EXISTS `PromoPeriodDTO` (
  `dateTimeFrom` DATETIME NOT NULL COMMENT 'Дата и время начала акции.',
  `dateTimeTo` DATETIME NOT NULL COMMENT 'Дата и время окончания акции.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Время проведения акции.';

--
-- Table structure for table `ProvideOrderDigitalCodesRequest` generated from model 'ProvideOrderDigitalCodesRequest'
-- Запрос на передачу ключей цифровых товаров.
--

CREATE TABLE IF NOT EXISTS `ProvideOrderDigitalCodesRequest` (
  `items` JSON NOT NULL COMMENT 'Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на передачу ключей цифровых товаров.';

--
-- Table structure for table `ProvideOrderItemIdentifiersRequest` generated from model 'ProvideOrderItemIdentifiersRequest'
--

CREATE TABLE IF NOT EXISTS `ProvideOrderItemIdentifiersRequest` (
  `items` JSON NOT NULL COMMENT 'Список позиций, требующих маркировки. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProvideOrderItemIdentifiersResponse` generated from model 'ProvideOrderItemIdentifiersResponse'
--

CREATE TABLE IF NOT EXISTS `ProvideOrderItemIdentifiersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PutSkuBidsRequest` generated from model 'PutSkuBidsRequest'
-- description.
--

CREATE TABLE IF NOT EXISTS `PutSkuBidsRequest` (
  `bids` JSON NOT NULL COMMENT 'Список товаров и ставки для продвижения, которые на них нужно установить.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='description.';

--
-- Table structure for table `QualityRatingAffectedOrderDTO` generated from model 'QualityRatingAffectedOrderDTO'
-- Информация о заказе, который повлиял на индекс качества.
--

CREATE TABLE IF NOT EXISTS `QualityRatingAffectedOrderDTO` (
  `orderId` BIGINT NOT NULL COMMENT 'Идентификатор заказа.',
  `description` TEXT NOT NULL COMMENT 'Описание проблемы.',
  `componentType` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о заказе, который повлиял на индекс качества.';

--
-- Table structure for table `QualityRatingComponentDTO` generated from model 'QualityRatingComponentDTO'
-- Составляющая индекса качества.
--

CREATE TABLE IF NOT EXISTS `QualityRatingComponentDTO` (
  `value` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Значение составляющей в процентах.',
  `componentType` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Составляющая индекса качества.';

--
-- Table structure for table `QualityRatingDTO` generated from model 'QualityRatingDTO'
-- Информация об индексе качества.
--

CREATE TABLE IF NOT EXISTS `QualityRatingDTO` (
  `rating` BIGINT NOT NULL COMMENT 'Значение индекса качества.',
  `calculationDate` DATE NOT NULL COMMENT 'Дата вычисления.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. ',
  `components` JSON NOT NULL COMMENT 'Составляющие индекса качества.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об индексе качества.';

--
-- Table structure for table `QualityRatingDetailsDTO` generated from model 'QualityRatingDetailsDTO'
-- Информация о заказах, которые повлияли на индекс качества.
--

CREATE TABLE IF NOT EXISTS `QualityRatingDetailsDTO` (
  `affectedOrders` JSON NOT NULL COMMENT 'Список заказов, которые повлияли на индекс качества.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о заказах, которые повлияли на индекс качества.';

--
-- Table structure for table `QuantumDTO` generated from model 'QuantumDTO'
-- Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} 
--

CREATE TABLE IF NOT EXISTS `QuantumDTO` (
  `minQuantity` INT UNSIGNED DEFAULT NULL COMMENT 'Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. ',
  `stepQuantity` TINYINT UNSIGNED DEFAULT NULL COMMENT 'На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} ';

--
-- Table structure for table `QuarantineOfferDTO` generated from model 'QuarantineOfferDTO'
-- Товар в карантине.
--

CREATE TABLE IF NOT EXISTS `QuarantineOfferDTO` (
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `currentPrice` TEXT DEFAULT NULL,
  `lastValidPrice` TEXT DEFAULT NULL,
  `verdicts` JSON DEFAULT NULL COMMENT 'Причины попадания товара в карантин.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар в карантине.';

--
-- Table structure for table `RegionDTO` generated from model 'RegionDTO'
-- Регион доставки.
--

CREATE TABLE IF NOT EXISTS `RegionDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона.',
  `name` TEXT NOT NULL COMMENT 'Название региона.',
  `type` TEXT NOT NULL,
  `parent` TEXT DEFAULT NULL,
  `children` JSON DEFAULT NULL COMMENT 'Дочерние регионы.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Регион доставки.';

--
-- Table structure for table `RegionalModelInfoDTO` generated from model 'RegionalModelInfoDTO'
-- Региональная информация.
--

CREATE TABLE IF NOT EXISTS `RegionalModelInfoDTO` (
  `currency` TEXT DEFAULT NULL,
  `regionId` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Региональная информация.';

--
-- Table structure for table `RejectedPromoOfferDeleteDTO` generated from model 'RejectedPromoOfferDeleteDTO'
-- Информация о товаре и ошибки, которые появились при его удалении.
--

CREATE TABLE IF NOT EXISTS `RejectedPromoOfferDeleteDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `reason` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товаре и ошибки, которые появились при его удалении.';

--
-- Table structure for table `RejectedPromoOfferUpdateDTO` generated from model 'RejectedPromoOfferUpdateDTO'
-- Описание отклоненного изменения.
--

CREATE TABLE IF NOT EXISTS `RejectedPromoOfferUpdateDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `reason` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Описание отклоненного изменения.';

--
-- Table structure for table `ReportInfoDTO` generated from model 'ReportInfoDTO'
-- Статус генерации и ссылка на готовый отчет.
--

CREATE TABLE IF NOT EXISTS `ReportInfoDTO` (
  `status` TEXT NOT NULL,
  `subStatus` TEXT DEFAULT NULL,
  `generationRequestedAt` DATETIME NOT NULL COMMENT 'Дата и время запроса на генерацию.',
  `generationFinishedAt` DATETIME DEFAULT NULL COMMENT 'Дата и время завершения генерации.',
  `file` TEXT DEFAULT NULL COMMENT 'Ссылка на готовый отчет.',
  `estimatedGenerationTime` BIGINT DEFAULT NULL COMMENT 'Ожидаемая продолжительность генерации в миллисекундах.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Статус генерации и ссылка на готовый отчет.';

--
-- Table structure for table `ReturnDTO` generated from model 'ReturnDTO'
-- Возврат заказа.
--

CREATE TABLE IF NOT EXISTS `ReturnDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор возврата.',
  `orderId` BIGINT DEFAULT NULL COMMENT 'Номер заказа.',
  `creationDate` DATETIME DEFAULT NULL COMMENT 'Дата создания возврата клиентом.',
  `updateDate` DATETIME DEFAULT NULL COMMENT 'Дата обновления возврата.',
  `refundStatus` TEXT DEFAULT NULL,
  `logisticPickupPoint` TEXT DEFAULT NULL,
  `shipmentRecipientType` TEXT DEFAULT NULL,
  `shipmentStatus` TEXT DEFAULT NULL,
  `refundAmount` BIGINT DEFAULT NULL COMMENT 'Сумма возврата.',
  `items` JSON NOT NULL COMMENT 'Список товаров в возврате.',
  `returnType` TEXT DEFAULT NULL,
  `fastReturn` TINYINT(1) DEFAULT NULL COMMENT 'Используется ли опция **Быстрый возврат денег за дешевый брак**. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Возврат заказа.';

--
-- Table structure for table `ReturnDecisionDTO` generated from model 'ReturnDecisionDTO'
-- Решения по возвратам.
--

CREATE TABLE IF NOT EXISTS `ReturnDecisionDTO` (
  `returnItemId` BIGINT DEFAULT NULL COMMENT 'Идентификатор товара в возврате.',
  `count` INT DEFAULT NULL COMMENT 'Количество единиц товара.',
  `comment` TEXT DEFAULT NULL COMMENT 'Комментарий.',
  `reasonType` TEXT DEFAULT NULL,
  `subreasonType` TEXT DEFAULT NULL,
  `decisionType` TEXT DEFAULT NULL,
  `refundAmount` BIGINT DEFAULT NULL COMMENT 'Сумма возврата.',
  `partnerCompensation` BIGINT DEFAULT NULL COMMENT 'Компенсация за обратную доставку.',
  `images` JSON DEFAULT NULL COMMENT 'Список хеш-кодов фотографий товара от покупателя.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Решения по возвратам.';

--
-- Table structure for table `ReturnInstanceDTO` generated from model 'ReturnInstanceDTO'
-- Логистическая информация по возврату.
--

CREATE TABLE IF NOT EXISTS `ReturnInstanceDTO` (
  `stockType` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `cis` TEXT DEFAULT NULL COMMENT 'Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).',
  `imei` TEXT DEFAULT NULL COMMENT 'Международный идентификатор мобильного оборудования.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Логистическая информация по возврату.';

--
-- Table structure for table `ReturnItemDTO` generated from model 'ReturnItemDTO'
-- Список товаров в возврате.
--

CREATE TABLE IF NOT EXISTS `ReturnItemDTO` (
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.',
  `shopSku` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `count` BIGINT NOT NULL COMMENT 'Количество единиц товара.',
  `decisions` JSON DEFAULT NULL COMMENT 'Список решений по возврату.',
  `instances` JSON DEFAULT NULL COMMENT 'Список логистических позиций возврата.',
  `tracks` JSON DEFAULT NULL COMMENT 'Список трек-кодов для почтовых отправлений.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров в возврате.';

--
-- Table structure for table `ScrollingPagerDTO` generated from model 'ScrollingPagerDTO'
-- Информация о страницах результатов.
--

CREATE TABLE IF NOT EXISTS `ScrollingPagerDTO` (
  `nextPageToken` TEXT DEFAULT NULL COMMENT 'Идентификатор следующей страницы результатов.',
  `prevPageToken` TEXT DEFAULT NULL COMMENT 'Идентификатор предыдущей страницы результатов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о страницах результатов.';

--
-- Table structure for table `SearchModelsResponse` generated from model 'SearchModelsResponse'
--

CREATE TABLE IF NOT EXISTS `SearchModelsResponse` (
  `models` JSON NOT NULL COMMENT 'Список моделей товаров.',
  `currency` TEXT DEFAULT NULL,
  `regionId` BIGINT DEFAULT NULL COMMENT 'Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). ',
  `pager` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SearchShipmentsRequest` generated from model 'SearchShipmentsRequest'
-- Запрос информации об отгрузках.
--

CREATE TABLE IF NOT EXISTS `SearchShipmentsRequest` (
  `dateFrom` DATE NOT NULL COMMENT 'Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. ',
  `dateTo` DATE NOT NULL COMMENT 'Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. ',
  `statuses` JSON DEFAULT NULL COMMENT 'Список статусов отгрузок.',
  `orderIds` JSON DEFAULT NULL COMMENT 'Список идентификаторов заказов из отгрузок.',
  `cancelledOrders` TINYINT(1) DEFAULT true COMMENT 'Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос информации об отгрузках.';

--
-- Table structure for table `SearchShipmentsResponse` generated from model 'SearchShipmentsResponse'
-- Ответ на запрос информации об отгрузках.
--

CREATE TABLE IF NOT EXISTS `SearchShipmentsResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос информации об отгрузках.';

--
-- Table structure for table `SearchShipmentsResponseDTO` generated from model 'SearchShipmentsResponseDTO'
-- Информация об отгрузках.
--

CREATE TABLE IF NOT EXISTS `SearchShipmentsResponseDTO` (
  `shipments` JSON NOT NULL COMMENT 'Список с информацией об отгрузках.',
  `paging` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об отгрузках.';

--
-- Table structure for table `SendMessageToChatRequest` generated from model 'SendMessageToChatRequest'
-- В какой чат нужно отправить сообщение и текст сообщения.
--

CREATE TABLE IF NOT EXISTS `SendMessageToChatRequest` (
  `message` TEXT NOT NULL COMMENT 'Текст сообщения. Максимальная длина — 4096 символа.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='В какой чат нужно отправить сообщение и текст сообщения.';

--
-- Table structure for table `SetFeedParamsRequest` generated from model 'SetFeedParamsRequest'
-- Запрос на обновление изменение параметров прайс-листа.
--

CREATE TABLE IF NOT EXISTS `SetFeedParamsRequest` (
  `parameters` JSON NOT NULL COMMENT 'Параметры прайс-листа.  Обязательный параметр. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на обновление изменение параметров прайс-листа.';

--
-- Table structure for table `SetOrderBoxLayoutRequest` generated from model 'SetOrderBoxLayoutRequest'
--

CREATE TABLE IF NOT EXISTS `SetOrderBoxLayoutRequest` (
  `boxes` JSON NOT NULL COMMENT 'Список коробок.',
  `allowRemove` TINYINT(1) DEFAULT false COMMENT 'Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SetOrderBoxLayoutResponse` generated from model 'SetOrderBoxLayoutResponse'
--

CREATE TABLE IF NOT EXISTS `SetOrderBoxLayoutResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SetOrderDeliveryDateRequest` generated from model 'SetOrderDeliveryDateRequest'
--

CREATE TABLE IF NOT EXISTS `SetOrderDeliveryDateRequest` (
  `dates` TEXT NOT NULL,
  `reason` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SetOrderDeliveryTrackCodeRequest` generated from model 'SetOrderDeliveryTrackCodeRequest'
--

CREATE TABLE IF NOT EXISTS `SetOrderDeliveryTrackCodeRequest` (
  `trackCode` TEXT NOT NULL COMMENT 'Трек‑номер посылки.',
  `deliveryServiceId` BIGINT NOT NULL COMMENT 'Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SetOrderShipmentBoxesRequest` generated from model 'SetOrderShipmentBoxesRequest'
--

CREATE TABLE IF NOT EXISTS `SetOrderShipmentBoxesRequest` (
  `boxes` JSON NOT NULL COMMENT 'Список грузовых мест. Маркет определяет количество мест по длине этого списка.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SetOrderShipmentBoxesResponse` generated from model 'SetOrderShipmentBoxesResponse'
--

CREATE TABLE IF NOT EXISTS `SetOrderShipmentBoxesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SetReturnDecisionRequest` generated from model 'SetReturnDecisionRequest'
-- Решения по позиции в возврате.
--

CREATE TABLE IF NOT EXISTS `SetReturnDecisionRequest` (
  `returnItemId` BIGINT NOT NULL COMMENT 'Идентификатор товара в возврате.',
  `decisionType` TEXT NOT NULL,
  `comment` TEXT DEFAULT NULL COMMENT 'Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Решения по позиции в возврате.';

--
-- Table structure for table `SetShipmentPalletsCountRequest` generated from model 'SetShipmentPalletsCountRequest'
-- Запрос на передачу количества упаковок в отгрузке.
--

CREATE TABLE IF NOT EXISTS `SetShipmentPalletsCountRequest` (
  `placesCount` INT UNSIGNED NOT NULL COMMENT 'Количество упаковок в отгрузке.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на передачу количества упаковок в отгрузке.';

--
-- Table structure for table `ShipmentBoxesDTO` generated from model 'ShipmentBoxesDTO'
-- В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
--

CREATE TABLE IF NOT EXISTS `ShipmentBoxesDTO` (
  `boxes` JSON NOT NULL COMMENT 'Список грузовых мест. Маркет определил количество мест по длине этого списка. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. ';

--
-- Table structure for table `ShipmentDTO` generated from model 'ShipmentDTO'
-- Информация об отгрузке.
--

CREATE TABLE IF NOT EXISTS `ShipmentDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор отгрузки.',
  `planIntervalFrom` DATETIME DEFAULT NULL COMMENT 'Начало планового интервала отгрузки.',
  `planIntervalTo` DATETIME DEFAULT NULL COMMENT 'Конец планового интервала отгрузки.',
  `shipmentType` TEXT DEFAULT NULL,
  `warehouse` TEXT DEFAULT NULL,
  `warehouseTo` TEXT DEFAULT NULL,
  `externalId` TEXT DEFAULT NULL COMMENT 'Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.',
  `deliveryService` TEXT DEFAULT NULL,
  `palletsCount` TEXT DEFAULT NULL,
  `orderIds` JSON NOT NULL COMMENT 'Идентификаторы заказов в отгрузке.',
  `draftCount` INT DEFAULT NULL COMMENT 'Количество заказов, которое Маркет запланировал к отгрузке.',
  `plannedCount` INT DEFAULT NULL COMMENT 'Количество заказов, которое Маркет подтвердил к отгрузке.',
  `factCount` INT DEFAULT NULL COMMENT 'Количество заказов, принятых в сортировочном центре или пункте приема.',
  `currentStatus` TEXT DEFAULT NULL,
  `availableActions` JSON NOT NULL COMMENT 'Доступные действия над отгрузкой.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об отгрузке.';

--
-- Table structure for table `ShipmentInfoDTO` generated from model 'ShipmentInfoDTO'
-- Список с информацией об отгрузках.
--

CREATE TABLE IF NOT EXISTS `ShipmentInfoDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор отгрузки.',
  `planIntervalFrom` DATETIME DEFAULT NULL COMMENT 'Начало планового интервала отгрузки.',
  `planIntervalTo` DATETIME DEFAULT NULL COMMENT 'Конец планового интервала отгрузки.',
  `shipmentType` TEXT DEFAULT NULL,
  `warehouse` TEXT DEFAULT NULL,
  `warehouseTo` TEXT DEFAULT NULL,
  `externalId` TEXT DEFAULT NULL COMMENT 'Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.',
  `deliveryService` TEXT DEFAULT NULL,
  `palletsCount` TEXT DEFAULT NULL,
  `orderIds` JSON NOT NULL COMMENT 'Идентификаторы заказов в отгрузке.',
  `draftCount` INT DEFAULT NULL COMMENT 'Количество заказов, которое Маркет запланировал к отгрузке.',
  `plannedCount` INT DEFAULT NULL COMMENT 'Количество заказов, которое Маркет подтвердил к отгрузке.',
  `factCount` INT DEFAULT NULL COMMENT 'Количество заказов, принятых в сортировочном центре или пункте приема.',
  `status` TEXT DEFAULT NULL,
  `statusDescription` TEXT DEFAULT NULL COMMENT 'Описание статуса отгрузки.',
  `statusUpdateTime` DATETIME DEFAULT NULL COMMENT 'Время последнего изменения статуса отгрузки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список с информацией об отгрузках.';

--
-- Table structure for table `ShipmentStatusChangeDTO` generated from model 'ShipmentStatusChangeDTO'
-- Статус отгрузки.
--

CREATE TABLE IF NOT EXISTS `ShipmentStatusChangeDTO` (
  `status` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL COMMENT 'Описание статуса отгрузки.',
  `updateTime` DATETIME DEFAULT NULL COMMENT 'Время последнего изменения статуса отгрузки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Статус отгрузки.';

--
-- Table structure for table `SkipGoodsFeedbackReactionRequest` generated from model 'SkipGoodsFeedbackReactionRequest'
-- Идентификаторы отзывов.
--

CREATE TABLE IF NOT EXISTS `SkipGoodsFeedbackReactionRequest` (
  `feedbackIds` JSON NOT NULL COMMENT 'Список идентификаторов отзывов, на которые магазин не будет отвечать.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Идентификаторы отзывов.';

--
-- Table structure for table `SkuBidItemDTO` generated from model 'SkuBidItemDTO'
-- Список товаров и ставок на них.
--

CREATE TABLE IF NOT EXISTS `SkuBidItemDTO` (
  `sku` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `bid` SMALLINT UNSIGNED NOT NULL COMMENT 'Значение ставки.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров и ставок на них.';

--
-- Table structure for table `SkuBidRecommendationItemDTO` generated from model 'SkuBidRecommendationItemDTO'
-- Список товаров с рекомендованными ставками.
--

CREATE TABLE IF NOT EXISTS `SkuBidRecommendationItemDTO` (
  `sku` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `bid` SMALLINT UNSIGNED NOT NULL COMMENT 'Значение ставки.',
  `bidRecommendations` JSON DEFAULT NULL COMMENT 'Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. ',
  `priceRecommendations` JSON DEFAULT NULL COMMENT 'Рекомендованные цены.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров с рекомендованными ставками.';

--
-- Table structure for table `SuggestOfferPriceDTO` generated from model 'SuggestOfferPriceDTO'
-- Товар, для которого требуется получить цены для продвижения.
--

CREATE TABLE IF NOT EXISTS `SuggestOfferPriceDTO` (
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар, для которого требуется получить цены для продвижения.';

--
-- Table structure for table `SuggestPricesRequest` generated from model 'SuggestPricesRequest'
-- Запрос на получение списка цен для продвижения.
--

CREATE TABLE IF NOT EXISTS `SuggestPricesRequest` (
  `offers` JSON NOT NULL COMMENT 'Список товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на получение списка цен для продвижения.';

--
-- Table structure for table `SuggestPricesResponse` generated from model 'SuggestPricesResponse'
-- Ответ на запрос списка цен для продвижения.
--

CREATE TABLE IF NOT EXISTS `SuggestPricesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ответ на запрос списка цен для продвижения.';

--
-- Table structure for table `SuggestPricesResultDTO` generated from model 'SuggestPricesResultDTO'
-- Результат запроса цен для продвижения.
--

CREATE TABLE IF NOT EXISTS `SuggestPricesResultDTO` (
  `offers` JSON NOT NULL COMMENT 'Список товаров с ценами для продвижения.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат запроса цен для продвижения.';

--
-- Table structure for table `SuggestedOfferDTO` generated from model 'SuggestedOfferDTO'
-- Информация о товаре.
--

CREATE TABLE IF NOT EXISTS `SuggestedOfferDTO` (
  `offerId` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `name` TEXT DEFAULT NULL COMMENT 'Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ',
  `category` TEXT DEFAULT NULL COMMENT 'Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. ',
  `vendor` TEXT DEFAULT NULL COMMENT 'Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.',
  `barcodes` JSON DEFAULT NULL COMMENT 'Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ',
  `description` TEXT DEFAULT NULL COMMENT 'Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ',
  `vendorCode` TEXT DEFAULT NULL COMMENT 'Артикул товара от производителя.',
  `basicPrice` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товаре.';

--
-- Table structure for table `SuggestedOfferMappingDTO` generated from model 'SuggestedOfferMappingDTO'
-- Товар с соответствующей карточкой на Маркете.
--

CREATE TABLE IF NOT EXISTS `SuggestedOfferMappingDTO` (
  `offer` TEXT DEFAULT NULL,
  `mapping` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар с соответствующей карточкой на Маркете.';

--
-- Table structure for table `TariffDTO` generated from model 'TariffDTO'
-- Информация о тарифах, по которым нужно заплатить за услуги Маркета.
--

CREATE TABLE IF NOT EXISTS `TariffDTO` (
  `type` TEXT NOT NULL,
  `percent` DECIMAL(20, 9) DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. ',
  `amount` DECIMAL(20, 9) NOT NULL COMMENT 'Значение тарифа в рублях.',
  `parameters` JSON NOT NULL COMMENT 'Параметры расчета тарифа.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о тарифах, по которым нужно заплатить за услуги Маркета.';

--
-- Table structure for table `TariffParameterDTO` generated from model 'TariffParameterDTO'
-- Детали расчета конкретной услуги Маркета.
--

CREATE TABLE IF NOT EXISTS `TariffParameterDTO` (
  `name` TEXT NOT NULL COMMENT 'Название параметра.',
  `value` TEXT NOT NULL COMMENT 'Значение параметра.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Детали расчета конкретной услуги Маркета.';

--
-- Table structure for table `TimePeriodDTO` generated from model 'TimePeriodDTO'
-- Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
--

CREATE TABLE IF NOT EXISTS `TimePeriodDTO` (
  `timePeriod` INT NOT NULL COMMENT 'Продолжительность в указанных единицах.',
  `timeUnit` TEXT NOT NULL,
  `comment` TEXT DEFAULT NULL COMMENT 'Комментарий.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.';

--
-- Table structure for table `TrackDTO` generated from model 'TrackDTO'
-- Информация о трек-номерах.
--

CREATE TABLE IF NOT EXISTS `TrackDTO` (
  `trackCode` TEXT DEFAULT NULL COMMENT 'Трек-код почтового отправления.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о трек-номерах.';

--
-- Table structure for table `TransferOrdersFromShipmentRequest` generated from model 'TransferOrdersFromShipmentRequest'
-- Запрос переноса заказов из отгрузки.
--

CREATE TABLE IF NOT EXISTS `TransferOrdersFromShipmentRequest` (
  `orderIds` JSON NOT NULL COMMENT 'Список заказов, которые вы не успеваете подготовить.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос переноса заказов из отгрузки.';

--
-- Table structure for table `TurnoverDTO` generated from model 'TurnoverDTO'
-- Информация об оборачиваемости товара.
--

CREATE TABLE IF NOT EXISTS `TurnoverDTO` (
  `turnover` TEXT NOT NULL,
  `turnoverDays` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об оборачиваемости товара.';

--
-- Table structure for table `UnitDTO` generated from model 'UnitDTO'
-- Единица измерения.
--

CREATE TABLE IF NOT EXISTS `UnitDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор единицы измерения.',
  `name` TEXT NOT NULL COMMENT 'Сокращенное название единицы измерения.',
  `fullName` TEXT NOT NULL COMMENT 'Полное название единицы измерения.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Единица измерения.';

--
-- Table structure for table `UpdateBusinessOfferPriceDTO` generated from model 'UpdateBusinessOfferPriceDTO'
-- Товар с новой ценой.
--

CREATE TABLE IF NOT EXISTS `UpdateBusinessOfferPriceDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `price` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Товар с новой ценой.';

--
-- Table structure for table `UpdateBusinessPricesRequest` generated from model 'UpdateBusinessPricesRequest'
-- Запрос на установку базовых цен на товары.
--

CREATE TABLE IF NOT EXISTS `UpdateBusinessPricesRequest` (
  `offers` JSON NOT NULL COMMENT 'Список товаров с ценами.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на установку базовых цен на товары.';

--
-- Table structure for table `UpdateCampaignOfferDTO` generated from model 'UpdateCampaignOfferDTO'
-- Параметры размещения товара в магазине.
--

CREATE TABLE IF NOT EXISTS `UpdateCampaignOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `quantum` TEXT DEFAULT NULL,
  `available` TINYINT(1) DEFAULT NULL COMMENT 'Есть ли товар в продаже. ',
  `vat` INT DEFAULT NULL COMMENT 'Ставка НДС, применяемая для товара. Задается цифрой:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры размещения товара в магазине.';

--
-- Table structure for table `UpdateCampaignOffersRequest` generated from model 'UpdateCampaignOffersRequest'
-- Запрос на обновление предложений товаров магазина.
--

CREATE TABLE IF NOT EXISTS `UpdateCampaignOffersRequest` (
  `offers` JSON NOT NULL COMMENT 'Параметры размещения товаров в заданном магазине.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на обновление предложений товаров магазина.';

--
-- Table structure for table `UpdateGoodsFeedbackCommentDTO` generated from model 'UpdateGoodsFeedbackCommentDTO'
-- Комментарий к отзыву или другому комментарию.
--

CREATE TABLE IF NOT EXISTS `UpdateGoodsFeedbackCommentDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор комментария к отзыву. ',
  `parentId` BIGINT DEFAULT NULL COMMENT 'Идентификатор комментария к отзыву. ',
  `text` TEXT NOT NULL COMMENT 'Текст комментария.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Комментарий к отзыву или другому комментарию.';

--
-- Table structure for table `UpdateGoodsFeedbackCommentRequest` generated from model 'UpdateGoodsFeedbackCommentRequest'
-- Комментарий к отзыву.
--

CREATE TABLE IF NOT EXISTS `UpdateGoodsFeedbackCommentRequest` (
  `feedbackId` BIGINT NOT NULL COMMENT 'Идентификатор отзыва. ',
  `comment` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Комментарий к отзыву.';

--
-- Table structure for table `UpdateGoodsFeedbackCommentResponse` generated from model 'UpdateGoodsFeedbackCommentResponse'
--

CREATE TABLE IF NOT EXISTS `UpdateGoodsFeedbackCommentResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMappingDTO` generated from model 'UpdateMappingDTO'
-- Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
--

CREATE TABLE IF NOT EXISTS `UpdateMappingDTO` (
  `marketSku` BIGINT DEFAULT NULL COMMENT 'SKU на Маркете.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. ';

--
-- Table structure for table `UpdateMappingsOfferDTO` generated from model 'UpdateMappingsOfferDTO'
-- Информация о товарах в каталоге.
--

CREATE TABLE IF NOT EXISTS `UpdateMappingsOfferDTO` (
  `name` TEXT DEFAULT NULL COMMENT 'Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ',
  `shopSku` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `category` TEXT DEFAULT NULL COMMENT 'Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. ',
  `vendor` TEXT DEFAULT NULL COMMENT 'Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.',
  `vendorCode` TEXT DEFAULT NULL COMMENT 'Артикул товара от производителя.',
  `description` TEXT DEFAULT NULL COMMENT 'Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ',
  `id` VARCHAR(255) DEFAULT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `feedId` BIGINT DEFAULT NULL COMMENT 'Идентификатор фида.',
  `barcodes` JSON DEFAULT NULL COMMENT 'Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ',
  `urls` JSON DEFAULT NULL COMMENT 'URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. ',
  `pictures` JSON DEFAULT NULL COMMENT 'Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. ',
  `manufacturer` TEXT DEFAULT NULL COMMENT 'Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. ',
  `manufacturerCountries` JSON DEFAULT NULL COMMENT 'Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. ',
  `minShipment` INT DEFAULT NULL COMMENT 'Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. ',
  `transportUnitSize` INT DEFAULT NULL COMMENT 'Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. ',
  `quantumOfSupply` INT DEFAULT NULL COMMENT 'Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. ',
  `deliveryDurationDays` INT DEFAULT NULL COMMENT 'Срок, за который продавец поставляет товары на склад, в днях.',
  `boxCount` INT DEFAULT NULL COMMENT 'Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. ',
  `customsCommodityCodes` JSON DEFAULT NULL COMMENT 'Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. ',
  `weightDimensions` TEXT DEFAULT NULL,
  `supplyScheduleDays` JSON DEFAULT NULL COMMENT 'Дни недели, в которые продавец поставляет товары на склад.',
  `shelfLifeDays` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. ',
  `lifeTimeDays` INT DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. ',
  `guaranteePeriodDays` INT DEFAULT NULL COMMENT 'Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. ',
  `processingState` TEXT DEFAULT NULL,
  `availability` TEXT DEFAULT NULL,
  `shelfLife` TEXT DEFAULT NULL,
  `lifeTime` TEXT DEFAULT NULL,
  `guaranteePeriod` TEXT DEFAULT NULL,
  `certificate` TEXT DEFAULT NULL COMMENT 'Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товарах в каталоге.';

--
-- Table structure for table `UpdateOfferContentRequest` generated from model 'UpdateOfferContentRequest'
-- Запрос на установку новых значений для параметров.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferContentRequest` (
  `offersContent` JSON NOT NULL COMMENT 'Список товаров с указанными характеристиками.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на установку новых значений для параметров.';

--
-- Table structure for table `UpdateOfferContentResponse` generated from model 'UpdateOfferContentResponse'
-- Описывает проблемы, которые появились при сохранении товара.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferContentResponse` (
  `status` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL COMMENT 'Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Описывает проблемы, которые появились при сохранении товара.';

--
-- Table structure for table `UpdateOfferContentResultDTO` generated from model 'UpdateOfferContentResultDTO'
-- Ошибки и предупреждения, которые появились из-за переданных характеристик.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferContentResultDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `errors` JSON DEFAULT NULL COMMENT 'Ошибки — информация в каталоге не обновится.',
  `warnings` JSON DEFAULT NULL COMMENT 'Предупреждения — информация в каталоге обновится.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ошибки и предупреждения, которые появились из-за переданных характеристик.';

--
-- Table structure for table `UpdateOfferDTO` generated from model 'UpdateOfferDTO'
-- Параметры товара.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `name` TEXT DEFAULT NULL COMMENT 'Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) ',
  `marketCategoryId` BIGINT DEFAULT NULL COMMENT 'Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). ',
  `category` TEXT DEFAULT NULL COMMENT 'Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. ',
  `pictures` JSON DEFAULT NULL COMMENT 'Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) ',
  `videos` JSON DEFAULT NULL COMMENT 'Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) ',
  `manuals` JSON DEFAULT NULL COMMENT 'Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. ',
  `vendor` TEXT DEFAULT NULL COMMENT 'Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.',
  `barcodes` JSON DEFAULT NULL COMMENT 'Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  ',
  `description` TEXT DEFAULT NULL COMMENT 'Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) ',
  `manufacturerCountries` JSON DEFAULT NULL COMMENT 'Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). ',
  `weightDimensions` TEXT DEFAULT NULL,
  `vendorCode` TEXT DEFAULT NULL COMMENT 'Артикул товара от производителя.',
  `tags` JSON DEFAULT NULL COMMENT 'Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. ',
  `shelfLife` TEXT DEFAULT NULL,
  `lifeTime` TEXT DEFAULT NULL,
  `guaranteePeriod` TEXT DEFAULT NULL,
  `customsCommodityCode` TEXT DEFAULT NULL COMMENT 'Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. ',
  `certificates` JSON DEFAULT NULL COMMENT 'Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). ',
  `boxCount` INT DEFAULT NULL COMMENT 'Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. ',
  `condition` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL,
  `downloadable` TINYINT(1) DEFAULT NULL COMMENT 'Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) ',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. ',
  `age` TEXT DEFAULT NULL,
  `params` JSON DEFAULT NULL COMMENT '{% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. ',
  `parameterValues` JSON DEFAULT NULL COMMENT 'Список характеристик с их значениями.  С &#x60;parameterValues&#x60; обязательно передавайте &#x60;marketCategoryId&#x60; — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее &#x60;parameterId&#x60; с пустым &#x60;value&#x60;.  Максимальное количество характеристик — 300. ',
  `basicPrice` TEXT DEFAULT NULL,
  `purchasePrice` TEXT DEFAULT NULL,
  `additionalExpenses` TEXT DEFAULT NULL,
  `cofinancePrice` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара.';

--
-- Table structure for table `UpdateOfferMappingDTO` generated from model 'UpdateOfferMappingDTO'
-- Информация о товаре.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingDTO` (
  `offer` TEXT NOT NULL,
  `mapping` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о товаре.';

--
-- Table structure for table `UpdateOfferMappingEntryDTO` generated from model 'UpdateOfferMappingEntryDTO'
-- Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingEntryDTO` (
  `mapping` TEXT DEFAULT NULL,
  `awaitingModerationMapping` TEXT DEFAULT NULL,
  `rejectedMapping` TEXT DEFAULT NULL,
  `offer` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. ';

--
-- Table structure for table `UpdateOfferMappingEntryRequest` generated from model 'UpdateOfferMappingEntryRequest'
-- Запрос на обновление товаров.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingEntryRequest` (
  `offerMappingEntries` JSON NOT NULL COMMENT 'Информация о товарах в каталоге.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на обновление товаров.';

--
-- Table structure for table `UpdateOfferMappingResultDTO` generated from model 'UpdateOfferMappingResultDTO'
-- Ошибки и предупреждения, которые появились из-за переданных характеристик.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingResultDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `errors` JSON DEFAULT NULL COMMENT 'Ошибки — информация в каталоге не обновится.',
  `warnings` JSON DEFAULT NULL COMMENT 'Предупреждения — информация в каталоге обновится.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ошибки и предупреждения, которые появились из-за переданных характеристик.';

--
-- Table structure for table `UpdateOfferMappingsRequest` generated from model 'UpdateOfferMappingsRequest'
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingsRequest` (
  `offerMappings` JSON NOT NULL COMMENT 'Перечень товаров, которые нужно добавить или обновить.',
  `onlyPartnerMediaContent` TINYINT(1) DEFAULT NULL COMMENT 'Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateOfferMappingsResponse` generated from model 'UpdateOfferMappingsResponse'
-- Описывает проблемы, возникшие при сохранении товара.
--

CREATE TABLE IF NOT EXISTS `UpdateOfferMappingsResponse` (
  `status` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL COMMENT 'Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Описывает проблемы, возникшие при сохранении товара.';

--
-- Table structure for table `UpdateOrderItemRequest` generated from model 'UpdateOrderItemRequest'
-- Запрос на обновление состава заказа.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderItemRequest` (
  `items` JSON NOT NULL COMMENT 'Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. ',
  `reason` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на обновление состава заказа.';

--
-- Table structure for table `UpdateOrderStatusDTO` generated from model 'UpdateOrderStatusDTO'
-- Список заказов.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusDTO` (
  `id` BIGINT DEFAULT NULL COMMENT 'Идентификатор заказа.',
  `status` TEXT DEFAULT NULL,
  `substatus` TEXT DEFAULT NULL,
  `updateStatus` TEXT DEFAULT NULL,
  `errorDetails` TEXT DEFAULT NULL COMMENT 'Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список заказов.';

--
-- Table structure for table `UpdateOrderStatusRequest` generated from model 'UpdateOrderStatusRequest'
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusRequest` (
  `order` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateOrderStatusResponse` generated from model 'UpdateOrderStatusResponse'
-- Информация об изменении статуса заказа.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusResponse` (
  `order` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об изменении статуса заказа.';

--
-- Table structure for table `UpdateOrderStatusesDTO` generated from model 'UpdateOrderStatusesDTO'
-- Список заказов, статус которых обновился.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusesDTO` (
  `orders` JSON NOT NULL COMMENT 'Список с обновленными заказами.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список заказов, статус которых обновился.';

--
-- Table structure for table `UpdateOrderStatusesRequest` generated from model 'UpdateOrderStatusesRequest'
-- Список заказов.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusesRequest` (
  `orders` JSON NOT NULL COMMENT 'Список заказов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Список заказов.';

--
-- Table structure for table `UpdateOrderStatusesResponse` generated from model 'UpdateOrderStatusesResponse'
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStatusesResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateOrderStorageLimitRequest` generated from model 'UpdateOrderStorageLimitRequest'
-- Запрос на обновление срока хранения заказа в ПВЗ.
--

CREATE TABLE IF NOT EXISTS `UpdateOrderStorageLimitRequest` (
  `newDate` DATE NOT NULL COMMENT 'Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на обновление срока хранения заказа в ПВЗ.';

--
-- Table structure for table `UpdateOutletLicenseRequest` generated from model 'UpdateOutletLicenseRequest'
-- Запрос на создание или изменение лицензий для точек продаж.
--

CREATE TABLE IF NOT EXISTS `UpdateOutletLicenseRequest` (
  `licenses` JSON NOT NULL COMMENT 'Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на создание или изменение лицензий для точек продаж.';

--
-- Table structure for table `UpdatePriceWithDiscountDTO` generated from model 'UpdatePriceWithDiscountDTO'
-- Цена с указанием скидки.
--

CREATE TABLE IF NOT EXISTS `UpdatePriceWithDiscountDTO` (
  `value` DECIMAL(20, 9) UNSIGNED NOT NULL COMMENT 'Значение.',
  `currencyId` TEXT NOT NULL,
  `discountBase` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT 'Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Цена с указанием скидки.';

--
-- Table structure for table `UpdatePricesRequest` generated from model 'UpdatePricesRequest'
-- Запрос на установку цен на товары.
--

CREATE TABLE IF NOT EXISTS `UpdatePricesRequest` (
  `offers` JSON NOT NULL COMMENT 'Список товаров.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на установку цен на товары.';

--
-- Table structure for table `UpdatePromoOfferDTO` generated from model 'UpdatePromoOfferDTO'
-- Описание товаров, которые участвуют в акции.
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `params` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Описание товаров, которые участвуют в акции.';

--
-- Table structure for table `UpdatePromoOfferDiscountParamsDTO` generated from model 'UpdatePromoOfferDiscountParamsDTO'
-- Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOfferDiscountParamsDTO` (
  `price` BIGINT DEFAULT NULL COMMENT 'Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. ',
  `promoPrice` BIGINT DEFAULT NULL COMMENT 'Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. ';

--
-- Table structure for table `UpdatePromoOfferParamsDTO` generated from model 'UpdatePromoOfferParamsDTO'
-- Параметры товара, который участвует в акции.
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOfferParamsDTO` (
  `discountParams` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Параметры товара, который участвует в акции.';

--
-- Table structure for table `UpdatePromoOffersRequest` generated from model 'UpdatePromoOffersRequest'
-- Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersRequest` (
  `promoId` TEXT NOT NULL COMMENT 'Идентификатор акции.',
  `offers` JSON NOT NULL COMMENT 'Товары, которые необходимо добавить в акцию или цены которых нужно изменить.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. ';

--
-- Table structure for table `UpdatePromoOffersResponse` generated from model 'UpdatePromoOffersResponse'
-- Результат добавления товаров в акцию.
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Результат добавления товаров в акцию.';

--
-- Table structure for table `UpdatePromoOffersResultDTO` generated from model 'UpdatePromoOffersResultDTO'
-- Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
--

CREATE TABLE IF NOT EXISTS `UpdatePromoOffersResultDTO` (
  `rejectedOffers` JSON DEFAULT NULL COMMENT 'Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. ',
  `warningOffers` JSON DEFAULT NULL COMMENT 'Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ошибки и предупреждения, которые появились при добавлении товаров в акцию.';

--
-- Table structure for table `UpdateStockDTO` generated from model 'UpdateStockDTO'
-- Информация об остатках одного товара на одном из складов.
--

CREATE TABLE IF NOT EXISTS `UpdateStockDTO` (
  `sku` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `items` JSON NOT NULL COMMENT 'Информация об остатках товара. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об остатках одного товара на одном из складов.';

--
-- Table structure for table `UpdateStockItemDTO` generated from model 'UpdateStockItemDTO'
-- Информация об остатках товара. 
--

CREATE TABLE IF NOT EXISTS `UpdateStockItemDTO` (
  `count` BIGINT NOT NULL COMMENT 'Количество доступного товара. ',
  `updatedAt` DATETIME DEFAULT NULL COMMENT 'Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об остатках товара. ';

--
-- Table structure for table `UpdateStocksRequest` generated from model 'UpdateStocksRequest'
-- Запрос на изменение информации по остаткам товаров.
--

CREATE TABLE IF NOT EXISTS `UpdateStocksRequest` (
  `skus` JSON NOT NULL COMMENT 'Данные об остатках товаров. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Запрос на изменение информации по остаткам товаров.';

--
-- Table structure for table `UpdateTimeDTO` generated from model 'UpdateTimeDTO'
-- Время последнего обновления.
--

CREATE TABLE IF NOT EXISTS `UpdateTimeDTO` (
  `updatedAt` DATETIME NOT NULL COMMENT 'Время последнего обновления.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Время последнего обновления.';

--
-- Table structure for table `ValueRestrictionDTO` generated from model 'ValueRestrictionDTO'
-- Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
--

CREATE TABLE IF NOT EXISTS `ValueRestrictionDTO` (
  `limitingParameterId` BIGINT NOT NULL COMMENT 'Идентификатор ограничивающей характеристики.',
  `limitedValues` JSON NOT NULL COMMENT 'Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. ';

--
-- Table structure for table `VerifyOrderEacRequest` generated from model 'VerifyOrderEacRequest'
--

CREATE TABLE IF NOT EXISTS `VerifyOrderEacRequest` (
  `code` TEXT DEFAULT NULL COMMENT 'Код для подтверждения ЭАПП.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VerifyOrderEacResponse` generated from model 'VerifyOrderEacResponse'
--

CREATE TABLE IF NOT EXISTS `VerifyOrderEacResponse` (
  `status` TEXT DEFAULT NULL,
  `result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `WarehouseAddressDTO` generated from model 'WarehouseAddressDTO'
-- Адрес склада.
--

CREATE TABLE IF NOT EXISTS `WarehouseAddressDTO` (
  `city` VARCHAR(200) NOT NULL COMMENT 'Город.',
  `street` TEXT DEFAULT NULL COMMENT 'Улица.',
  `number` TEXT DEFAULT NULL COMMENT 'Номер дома.',
  `building` VARCHAR(16) DEFAULT NULL COMMENT 'Номер строения.',
  `block` VARCHAR(16) DEFAULT NULL COMMENT 'Номер корпуса.',
  `gps` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Адрес склада.';

--
-- Table structure for table `WarehouseDTO` generated from model 'WarehouseDTO'
-- Информация о складе.
--

CREATE TABLE IF NOT EXISTS `WarehouseDTO` (
  `id` BIGINT NOT NULL COMMENT 'Идентификатор склада.',
  `name` TEXT NOT NULL COMMENT 'Название склада.',
  `campaignId` BIGINT NOT NULL COMMENT 'Идентификатор кампании в API и идентификатор магазина.',
  `express` TINYINT(1) NOT NULL COMMENT 'Возможна ли доставка по модели Экспресс.',
  `address` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о складе.';

--
-- Table structure for table `WarehouseGroupDTO` generated from model 'WarehouseGroupDTO'
-- Информация о группе складов.
--

CREATE TABLE IF NOT EXISTS `WarehouseGroupDTO` (
  `name` TEXT NOT NULL COMMENT 'Название группы складов.',
  `mainWarehouse` TEXT NOT NULL,
  `warehouses` JSON NOT NULL COMMENT 'Список складов, входящих в группу.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о группе складов.';

--
-- Table structure for table `WarehouseOfferDTO` generated from model 'WarehouseOfferDTO'
-- Информация об остатках товара.
--

CREATE TABLE IF NOT EXISTS `WarehouseOfferDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `turnoverSummary` TEXT DEFAULT NULL,
  `stocks` JSON NOT NULL COMMENT 'Информация об остатках.',
  `updatedAt` DATETIME DEFAULT NULL COMMENT 'Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об остатках товара.';

--
-- Table structure for table `WarehouseOffersDTO` generated from model 'WarehouseOffersDTO'
-- Информация об остатках товаров на складе.
--

CREATE TABLE IF NOT EXISTS `WarehouseOffersDTO` (
  `warehouseId` BIGINT NOT NULL COMMENT 'Идентификатор склада.',
  `offers` JSON NOT NULL COMMENT 'Информация об остатках.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об остатках товаров на складе.';

--
-- Table structure for table `WarehouseStockDTO` generated from model 'WarehouseStockDTO'
-- Информация об остатках товара.
--

CREATE TABLE IF NOT EXISTS `WarehouseStockDTO` (
  `type` TEXT NOT NULL,
  `count` BIGINT NOT NULL COMMENT 'Значение остатков.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация об остатках товара.';

--
-- Table structure for table `WarehousesDTO` generated from model 'WarehousesDTO'
-- Информация о складах и группах складов.
--

CREATE TABLE IF NOT EXISTS `WarehousesDTO` (
  `warehouses` JSON NOT NULL COMMENT 'Список складов, не входящих в группы.',
  `warehouseGroups` JSON NOT NULL COMMENT 'Список групп складов.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Информация о складах и группах складов.';

--
-- Table structure for table `WarningPromoOfferUpdateDTO` generated from model 'WarningPromoOfferUpdateDTO'
-- Описание предупреждения, которое появилось при добавлении товара.
--

CREATE TABLE IF NOT EXISTS `WarningPromoOfferUpdateDTO` (
  `offerId` VARCHAR(255) NOT NULL COMMENT 'Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ',
  `warnings` JSON NOT NULL COMMENT 'Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Описание предупреждения, которое появилось при добавлении товара.';


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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_refresh_tokens`
--
CREATE TABLE IF NOT EXISTS `oauth_refresh_tokens` (
  `refresh_token`       VARCHAR(40)    NOT NULL,
  `client_id`           VARCHAR(80)    DEFAULT NULL,
  `user_id`             VARCHAR(80)    DEFAULT NULL,
  `expires`             TIMESTAMP      on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `scope`               VARCHAR(4000)  DEFAULT NULL,
  PRIMARY KEY (`refresh_token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_scopes`
--
CREATE TABLE IF NOT EXISTS `oauth_scopes` (
  `scope`               VARCHAR(80)  NOT NULL,
  `is_default`          TINYINT(1)   DEFAULT NULL,
  PRIMARY KEY (`scope`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_jwt`
--
CREATE TABLE IF NOT EXISTS `oauth_jwt` (
  `client_id`           VARCHAR(80)    NOT NULL,
  `subject`             VARCHAR(80)    DEFAULT NULL,
  `public_key`          VARCHAR(2000)  NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_jti`
--
CREATE TABLE IF NOT EXISTS `oauth_jti` (
  `issuer`              VARCHAR(80)    NOT NULL,
  `subject`             VARCHAR(80)    DEFAULT NULL,
  `audience`            VARCHAR(80)    DEFAULT NULL,
  `expires`             TIMESTAMP      NOT NULL,
  `jti`                 VARCHAR(2000)  NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_public_keys`
--
CREATE TABLE IF NOT EXISTS `oauth_public_keys` (
  `client_id`            VARCHAR(80)    DEFAULT NULL,
  `public_key`           VARCHAR(2000)  DEFAULT NULL,
  `private_key`          VARCHAR(2000)  DEFAULT NULL,
  `encryption_algorithm` VARCHAR(100)   DEFAULT 'RS256'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
