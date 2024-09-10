<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры товара.
 */
class GetOfferDTO
{
    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="offerId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":255})
     * @DTA\Validator(name="Match", options={"pattern":"/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/"})
     */
    public ?string $offer_id = null;

    /**
     * Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256})
     */
    public ?string $name = null;

    /**
     * Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     * @DTA\Data(field="marketCategoryId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $market_category_id = null;

    /**
     * Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.
     * @DTA\Data(field="category", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $category = null;

    /**
     * Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html)
     * @DTA\Data(field="pictures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $pictures = null;

    /**
     * Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html)
     * @DTA\Data(field="videos", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $videos = null;

    /**
     * Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся.
     * @DTA\Data(field="manuals", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $manuals = null;

    /**
     * Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
     * @DTA\Data(field="vendor", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $vendor = null;

    /**
     * Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)
     * @DTA\Data(field="barcodes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection44::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection44::class})
     */
    public ?\App\DTO\Collection44 $barcodes = null;

    /**
     * Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":6000})
     */
    public ?string $description = null;

    /**
     * Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx).
     * @DTA\Data(field="manufacturerCountries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $manufacturer_countries = null;

    /**
     * @DTA\Data(field="weightDimensions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferWeightDimensionsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferWeightDimensionsDTO::class})
     */
    public ?\App\DTO\OfferWeightDimensionsDTO $weight_dimensions = null;

    /**
     * Артикул товара от производителя.
     * @DTA\Data(field="vendorCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $vendor_code = null;

    /**
     * Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов.
     * @DTA\Data(field="tags", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $tags = null;

    /**
     * @DTA\Data(field="shelfLife", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TimePeriodDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TimePeriodDTO::class})
     */
    public ?\App\DTO\TimePeriodDTO $shelf_life = null;

    /**
     * @DTA\Data(field="lifeTime", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TimePeriodDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TimePeriodDTO::class})
     */
    public ?\App\DTO\TimePeriodDTO $life_time = null;

    /**
     * @DTA\Data(field="guaranteePeriod", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TimePeriodDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TimePeriodDTO::class})
     */
    public ?\App\DTO\TimePeriodDTO $guarantee_period = null;

    /**
     * Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть.
     * @DTA\Data(field="customsCommodityCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $customs_commodity_code = null;

    /**
     * Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html).
     * @DTA\Data(field="certificates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $certificates = null;

    /**
     * Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр.
     * @DTA\Data(field="boxCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $box_count = null;

    /**
     * @DTA\Data(field="condition", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferConditionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferConditionDTO::class})
     */
    public ?\App\DTO\OfferConditionDTO $condition = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferType::class})
     */
    public ?\App\DTO\OfferType $type = null;

    /**
     * Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md)
     * @DTA\Data(field="downloadable", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $downloadable = null;

    /**
     * Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей.
     * @DTA\Data(field="adult", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $adult = null;

    /**
     * @DTA\Data(field="age", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AgeDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AgeDTO::class})
     */
    public ?\App\DTO\AgeDTO $age = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви.
     * @DTA\Data(field="params", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $params = null;

    /**
     * @DTA\Data(field="basicPrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPriceWithDiscountDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPriceWithDiscountDTO::class})
     */
    public ?\App\DTO\GetPriceWithDiscountDTO $basic_price = null;

    /**
     * @DTA\Data(field="purchasePrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPriceDTO::class})
     */
    public ?\App\DTO\GetPriceDTO $purchase_price = null;

    /**
     * @DTA\Data(field="additionalExpenses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPriceDTO::class})
     */
    public ?\App\DTO\GetPriceDTO $additional_expenses = null;

    /**
     * @DTA\Data(field="cofinancePrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPriceDTO::class})
     */
    public ?\App\DTO\GetPriceDTO $cofinance_price = null;

    /**
     * @DTA\Data(field="cardStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferCardStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferCardStatusType::class})
     */
    public ?\App\DTO\OfferCardStatusType $card_status = null;

    /**
     * Список магазинов, в которых размещен товар.
     * @DTA\Data(field="campaigns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $campaigns = null;

    /**
     * Информация о том, какие для товара доступны модели размещения.
     * @DTA\Data(field="sellingPrograms", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $selling_programs = null;

    /**
     * Товар помещен в архив.
     * @DTA\Data(field="archived", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $archived = null;

}
