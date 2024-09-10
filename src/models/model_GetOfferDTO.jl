# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetOfferDTO
Параметры товара.

    GetOfferDTO(;
        offerId=nothing,
        name=nothing,
        marketCategoryId=nothing,
        category=nothing,
        pictures=nothing,
        videos=nothing,
        manuals=nothing,
        vendor=nothing,
        barcodes=nothing,
        description=nothing,
        manufacturerCountries=nothing,
        weightDimensions=nothing,
        vendorCode=nothing,
        tags=nothing,
        shelfLife=nothing,
        lifeTime=nothing,
        guaranteePeriod=nothing,
        customsCommodityCode=nothing,
        certificates=nothing,
        boxCount=nothing,
        condition=nothing,
        type=nothing,
        downloadable=nothing,
        adult=nothing,
        age=nothing,
        params=nothing,
        basicPrice=nothing,
        purchasePrice=nothing,
        additionalExpenses=nothing,
        cofinancePrice=nothing,
        cardStatus=nothing,
        campaigns=nothing,
        sellingPrograms=nothing,
        archived=nothing,
    )

    - offerId::String : Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    - name::String : Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    - marketCategoryId::Int64 : Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    - category::String : Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
    - pictures::Vector{String} : Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
    - videos::Vector{String} : Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
    - manuals::Vector{OfferManualDTO} : Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. 
    - vendor::String : Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    - barcodes::Vector{String} : Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    - description::String : Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    - manufacturerCountries::Vector{String} : Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
    - weightDimensions::OfferWeightDimensionsDTO
    - vendorCode::String : Артикул товара от производителя.
    - tags::Vector{String} : Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
    - shelfLife::TimePeriodDTO
    - lifeTime::TimePeriodDTO
    - guaranteePeriod::TimePeriodDTO
    - customsCommodityCode::String : Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
    - certificates::Vector{String} : Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
    - boxCount::Int64 : Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
    - condition::OfferConditionDTO
    - type::OfferType
    - downloadable::Bool : Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
    - adult::Bool : Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
    - age::AgeDTO
    - params::Vector{OfferParamDTO} : {% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
    - basicPrice::GetPriceWithDiscountDTO
    - purchasePrice::GetPriceDTO
    - additionalExpenses::GetPriceDTO
    - cofinancePrice::GetPriceDTO
    - cardStatus::OfferCardStatusType
    - campaigns::Vector{OfferCampaignStatusDTO} : Список магазинов, в которых размещен товар. 
    - sellingPrograms::Vector{OfferSellingProgramDTO} : Информация о том, какие для товара доступны модели размещения. 
    - archived::Bool : Товар помещен в архив. 
"""
Base.@kwdef mutable struct GetOfferDTO <: OpenAPI.APIModel
    offerId::Union{Nothing, String} = nothing
    name::Union{Nothing, String} = nothing
    marketCategoryId::Union{Nothing, Int64} = nothing
    category::Union{Nothing, String} = nothing
    pictures::Union{Nothing, Vector{String}} = nothing
    videos::Union{Nothing, Vector{String}} = nothing
    manuals::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{OfferManualDTO} }
    vendor::Union{Nothing, String} = nothing
    barcodes::Union{Nothing, Vector{String}} = nothing
    description::Union{Nothing, String} = nothing
    manufacturerCountries::Union{Nothing, Vector{String}} = nothing
    weightDimensions = nothing # spec type: Union{ Nothing, OfferWeightDimensionsDTO }
    vendorCode::Union{Nothing, String} = nothing
    tags::Union{Nothing, Vector{String}} = nothing
    shelfLife = nothing # spec type: Union{ Nothing, TimePeriodDTO }
    lifeTime = nothing # spec type: Union{ Nothing, TimePeriodDTO }
    guaranteePeriod = nothing # spec type: Union{ Nothing, TimePeriodDTO }
    customsCommodityCode::Union{Nothing, String} = nothing
    certificates::Union{Nothing, Vector{String}} = nothing
    boxCount::Union{Nothing, Int64} = nothing
    condition = nothing # spec type: Union{ Nothing, OfferConditionDTO }
    type = nothing # spec type: Union{ Nothing, OfferType }
    downloadable::Union{Nothing, Bool} = nothing
    adult::Union{Nothing, Bool} = nothing
    age = nothing # spec type: Union{ Nothing, AgeDTO }
    params::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{OfferParamDTO} }
    basicPrice = nothing # spec type: Union{ Nothing, GetPriceWithDiscountDTO }
    purchasePrice = nothing # spec type: Union{ Nothing, GetPriceDTO }
    additionalExpenses = nothing # spec type: Union{ Nothing, GetPriceDTO }
    cofinancePrice = nothing # spec type: Union{ Nothing, GetPriceDTO }
    cardStatus = nothing # spec type: Union{ Nothing, OfferCardStatusType }
    campaigns::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{OfferCampaignStatusDTO} }
    sellingPrograms::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{OfferSellingProgramDTO} }
    archived::Union{Nothing, Bool} = nothing

    function GetOfferDTO(offerId, name, marketCategoryId, category, pictures, videos, manuals, vendor, barcodes, description, manufacturerCountries, weightDimensions, vendorCode, tags, shelfLife, lifeTime, guaranteePeriod, customsCommodityCode, certificates, boxCount, condition, type, downloadable, adult, age, params, basicPrice, purchasePrice, additionalExpenses, cofinancePrice, cardStatus, campaigns, sellingPrograms, archived, )
        OpenAPI.validate_property(GetOfferDTO, Symbol("offerId"), offerId)
        OpenAPI.validate_property(GetOfferDTO, Symbol("name"), name)
        OpenAPI.validate_property(GetOfferDTO, Symbol("marketCategoryId"), marketCategoryId)
        OpenAPI.validate_property(GetOfferDTO, Symbol("category"), category)
        OpenAPI.validate_property(GetOfferDTO, Symbol("pictures"), pictures)
        OpenAPI.validate_property(GetOfferDTO, Symbol("videos"), videos)
        OpenAPI.validate_property(GetOfferDTO, Symbol("manuals"), manuals)
        OpenAPI.validate_property(GetOfferDTO, Symbol("vendor"), vendor)
        OpenAPI.validate_property(GetOfferDTO, Symbol("barcodes"), barcodes)
        OpenAPI.validate_property(GetOfferDTO, Symbol("description"), description)
        OpenAPI.validate_property(GetOfferDTO, Symbol("manufacturerCountries"), manufacturerCountries)
        OpenAPI.validate_property(GetOfferDTO, Symbol("weightDimensions"), weightDimensions)
        OpenAPI.validate_property(GetOfferDTO, Symbol("vendorCode"), vendorCode)
        OpenAPI.validate_property(GetOfferDTO, Symbol("tags"), tags)
        OpenAPI.validate_property(GetOfferDTO, Symbol("shelfLife"), shelfLife)
        OpenAPI.validate_property(GetOfferDTO, Symbol("lifeTime"), lifeTime)
        OpenAPI.validate_property(GetOfferDTO, Symbol("guaranteePeriod"), guaranteePeriod)
        OpenAPI.validate_property(GetOfferDTO, Symbol("customsCommodityCode"), customsCommodityCode)
        OpenAPI.validate_property(GetOfferDTO, Symbol("certificates"), certificates)
        OpenAPI.validate_property(GetOfferDTO, Symbol("boxCount"), boxCount)
        OpenAPI.validate_property(GetOfferDTO, Symbol("condition"), condition)
        OpenAPI.validate_property(GetOfferDTO, Symbol("type"), type)
        OpenAPI.validate_property(GetOfferDTO, Symbol("downloadable"), downloadable)
        OpenAPI.validate_property(GetOfferDTO, Symbol("adult"), adult)
        OpenAPI.validate_property(GetOfferDTO, Symbol("age"), age)
        OpenAPI.validate_property(GetOfferDTO, Symbol("params"), params)
        OpenAPI.validate_property(GetOfferDTO, Symbol("basicPrice"), basicPrice)
        OpenAPI.validate_property(GetOfferDTO, Symbol("purchasePrice"), purchasePrice)
        OpenAPI.validate_property(GetOfferDTO, Symbol("additionalExpenses"), additionalExpenses)
        OpenAPI.validate_property(GetOfferDTO, Symbol("cofinancePrice"), cofinancePrice)
        OpenAPI.validate_property(GetOfferDTO, Symbol("cardStatus"), cardStatus)
        OpenAPI.validate_property(GetOfferDTO, Symbol("campaigns"), campaigns)
        OpenAPI.validate_property(GetOfferDTO, Symbol("sellingPrograms"), sellingPrograms)
        OpenAPI.validate_property(GetOfferDTO, Symbol("archived"), archived)
        return new(offerId, name, marketCategoryId, category, pictures, videos, manuals, vendor, barcodes, description, manufacturerCountries, weightDimensions, vendorCode, tags, shelfLife, lifeTime, guaranteePeriod, customsCommodityCode, certificates, boxCount, condition, type, downloadable, adult, age, params, basicPrice, purchasePrice, additionalExpenses, cofinancePrice, cardStatus, campaigns, sellingPrograms, archived, )
    end
end # type GetOfferDTO

const _property_types_GetOfferDTO = Dict{Symbol,String}(Symbol("offerId")=>"String", Symbol("name")=>"String", Symbol("marketCategoryId")=>"Int64", Symbol("category")=>"String", Symbol("pictures")=>"Vector{String}", Symbol("videos")=>"Vector{String}", Symbol("manuals")=>"Vector{OfferManualDTO}", Symbol("vendor")=>"String", Symbol("barcodes")=>"Vector{String}", Symbol("description")=>"String", Symbol("manufacturerCountries")=>"Vector{String}", Symbol("weightDimensions")=>"OfferWeightDimensionsDTO", Symbol("vendorCode")=>"String", Symbol("tags")=>"Vector{String}", Symbol("shelfLife")=>"TimePeriodDTO", Symbol("lifeTime")=>"TimePeriodDTO", Symbol("guaranteePeriod")=>"TimePeriodDTO", Symbol("customsCommodityCode")=>"String", Symbol("certificates")=>"Vector{String}", Symbol("boxCount")=>"Int64", Symbol("condition")=>"OfferConditionDTO", Symbol("type")=>"OfferType", Symbol("downloadable")=>"Bool", Symbol("adult")=>"Bool", Symbol("age")=>"AgeDTO", Symbol("params")=>"Vector{OfferParamDTO}", Symbol("basicPrice")=>"GetPriceWithDiscountDTO", Symbol("purchasePrice")=>"GetPriceDTO", Symbol("additionalExpenses")=>"GetPriceDTO", Symbol("cofinancePrice")=>"GetPriceDTO", Symbol("cardStatus")=>"OfferCardStatusType", Symbol("campaigns")=>"Vector{OfferCampaignStatusDTO}", Symbol("sellingPrograms")=>"Vector{OfferSellingProgramDTO}", Symbol("archived")=>"Bool", )
OpenAPI.property_type(::Type{ GetOfferDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetOfferDTO[name]))}

function check_required(o::GetOfferDTO)
    o.offerId === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GetOfferDTO }, name::Symbol, val)
    if name === Symbol("offerId")
        OpenAPI.validate_param(name, "GetOfferDTO", :maxLength, val, 255)
        OpenAPI.validate_param(name, "GetOfferDTO", :minLength, val, 1)
        OpenAPI.validate_param(name, "GetOfferDTO", :pattern, val, r"^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$")
    end
    if name === Symbol("name")
        OpenAPI.validate_param(name, "GetOfferDTO", :maxLength, val, 256)
    end
    if name === Symbol("marketCategoryId")
        OpenAPI.validate_param(name, "GetOfferDTO", :format, val, "int64")
    end
    if name === Symbol("videos")
        OpenAPI.validate_param(name, "GetOfferDTO", :maxItems, val, 6)
    end
    if name === Symbol("manuals")
        OpenAPI.validate_param(name, "GetOfferDTO", :maxItems, val, 6)
    end
    if name === Symbol("description")
        OpenAPI.validate_param(name, "GetOfferDTO", :maxLength, val, 6000)
    end
    if name === Symbol("boxCount")
        OpenAPI.validate_param(name, "GetOfferDTO", :format, val, "int32")
    end
end
