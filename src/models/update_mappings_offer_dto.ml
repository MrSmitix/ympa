(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 * Schema Update_mappings_offer_dto.t : Информация о товарах в каталоге.
 *)

type t = {
    (* Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html)  *)
    name: string option [@default None];
    (* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  *)
    shop_sku: string option [@default None];
    (* Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  *)
    category: string option [@default None];
    (* Название бренда или производителя. Должно быть записано так, как его пишет сам бренд. *)
    vendor: string option [@default None];
    (* Артикул товара от производителя. *)
    vendor_code: string option [@default None];
    (* Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html)  *)
    description: string option [@default None];
    (* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  *)
    id: string option [@default None];
    (* Идентификатор фида. *)
    feed_id: int64 option [@default None];
    (* Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](_*gtin)   *)
    barcodes: string list;
    (* URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url.  *)
    urls: string list;
    (* Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`.  *)
    pictures: string list;
    (* Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр.  *)
    manufacturer: string option [@default None];
    (* Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран.  *)
    manufacturer_countries: string list;
    (* Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60.  *)
    min_shipment: int32 option [@default None];
    (* Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6.  *)
    transport_unit_size: int32 option [@default None];
    (* Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12.  *)
    quantum_of_supply: int32 option [@default None];
    (* Срок, за который продавец поставляет товары на склад, в днях. *)
    delivery_duration_days: int32 option [@default None];
    (* Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр.  *)
    box_count: int32 option [@default None];
    (* Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД.  *)
    customs_commodity_codes: string list;
    weight_dimensions: Offer_weight_dimensions_dto.t option [@default None];
    (* Дни недели, в которые продавец поставляет товары на склад. *)
    supply_schedule_days: Enums.dayofweektype list;
    (* {% note warning \''\'' %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования.  *)
    shelf_life_days: int32 option [@default None];
    (* {% note warning \''\'' %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки.  *)
    life_time_days: int32 option [@default None];
    (* Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара.  *)
    guarantee_period_days: int32 option [@default None];
    processing_state: Offer_processing_state_dto.t option [@default None];
    availability: Enums.offeravailabilitystatustype option [@default None];
    shelf_life: Time_period_dto.t option [@default None];
    life_time: Time_period_dto.t option [@default None];
    guarantee_period: Time_period_dto.t option [@default None];
    (* Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html)  *)
    certificate: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

(** Информация о товарах в каталоге. *)
let create () : t = {
    name = None;
    shop_sku = None;
    category = None;
    vendor = None;
    vendor_code = None;
    description = None;
    id = None;
    feed_id = None;
    barcodes = [];
    urls = [];
    pictures = [];
    manufacturer = None;
    manufacturer_countries = [];
    min_shipment = None;
    transport_unit_size = None;
    quantum_of_supply = None;
    delivery_duration_days = None;
    box_count = None;
    customs_commodity_codes = [];
    weight_dimensions = None;
    supply_schedule_days = [];
    shelf_life_days = None;
    life_time_days = None;
    guarantee_period_days = None;
    processing_state = None;
    availability = None;
    shelf_life = None;
    life_time = None;
    guarantee_period = None;
    certificate = None;
}

