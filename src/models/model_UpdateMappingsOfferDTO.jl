# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""UpdateMappingsOfferDTO
Информация о товарах в каталоге.

    UpdateMappingsOfferDTO(;
        name=nothing,
        shopSku=nothing,
        category=nothing,
        vendor=nothing,
        vendorCode=nothing,
        description=nothing,
        id=nothing,
        feedId=nothing,
        barcodes=nothing,
        urls=nothing,
        pictures=nothing,
        manufacturer=nothing,
        manufacturerCountries=nothing,
        minShipment=nothing,
        transportUnitSize=nothing,
        quantumOfSupply=nothing,
        deliveryDurationDays=nothing,
        boxCount=nothing,
        customsCommodityCodes=nothing,
        weightDimensions=nothing,
        supplyScheduleDays=nothing,
        shelfLifeDays=nothing,
        lifeTimeDays=nothing,
        guaranteePeriodDays=nothing,
        processingState=nothing,
        availability=nothing,
        shelfLife=nothing,
        lifeTime=nothing,
        guaranteePeriod=nothing,
        certificate=nothing,
    )

    - name::String : Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    - shopSku::String : Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    - category::String : Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
    - vendor::String : Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    - vendorCode::String : Артикул товара от производителя.
    - description::String : Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    - id::String : Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    - feedId::Int64 : Идентификатор фида.
    - barcodes::Vector{String} : Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    - urls::Vector{String} : URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
    - pictures::Vector{String} : Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. 
    - manufacturer::String : Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
    - manufacturerCountries::Vector{String} : Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
    - minShipment::Int64 : Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
    - transportUnitSize::Int64 : Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
    - quantumOfSupply::Int64 : Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
    - deliveryDurationDays::Int64 : Срок, за который продавец поставляет товары на склад, в днях.
    - boxCount::Int64 : Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
    - customsCommodityCodes::Vector{String} : Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
    - weightDimensions::OfferWeightDimensionsDTO
    - supplyScheduleDays::Vector{DayOfWeekType} : Дни недели, в которые продавец поставляет товары на склад.
    - shelfLifeDays::Int64 : {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
    - lifeTimeDays::Int64 : {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
    - guaranteePeriodDays::Int64 : Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
    - processingState::OfferProcessingStateDTO
    - availability::OfferAvailabilityStatusType
    - shelfLife::TimePeriodDTO
    - lifeTime::TimePeriodDTO
    - guaranteePeriod::TimePeriodDTO
    - certificate::String : Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
"""
Base.@kwdef mutable struct UpdateMappingsOfferDTO <: OpenAPI.APIModel
    name::Union{Nothing, String} = nothing
    shopSku::Union{Nothing, String} = nothing
    category::Union{Nothing, String} = nothing
    vendor::Union{Nothing, String} = nothing
    vendorCode::Union{Nothing, String} = nothing
    description::Union{Nothing, String} = nothing
    id::Union{Nothing, String} = nothing
    feedId::Union{Nothing, Int64} = nothing
    barcodes::Union{Nothing, Vector{String}} = nothing
    urls::Union{Nothing, Vector{String}} = nothing
    pictures::Union{Nothing, Vector{String}} = nothing
    manufacturer::Union{Nothing, String} = nothing
    manufacturerCountries::Union{Nothing, Vector{String}} = nothing
    minShipment::Union{Nothing, Int64} = nothing
    transportUnitSize::Union{Nothing, Int64} = nothing
    quantumOfSupply::Union{Nothing, Int64} = nothing
    deliveryDurationDays::Union{Nothing, Int64} = nothing
    boxCount::Union{Nothing, Int64} = nothing
    customsCommodityCodes::Union{Nothing, Vector{String}} = nothing
    weightDimensions = nothing # spec type: Union{ Nothing, OfferWeightDimensionsDTO }
    supplyScheduleDays::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{DayOfWeekType} }
    shelfLifeDays::Union{Nothing, Int64} = nothing
    lifeTimeDays::Union{Nothing, Int64} = nothing
    guaranteePeriodDays::Union{Nothing, Int64} = nothing
    processingState = nothing # spec type: Union{ Nothing, OfferProcessingStateDTO }
    availability = nothing # spec type: Union{ Nothing, OfferAvailabilityStatusType }
    shelfLife = nothing # spec type: Union{ Nothing, TimePeriodDTO }
    lifeTime = nothing # spec type: Union{ Nothing, TimePeriodDTO }
    guaranteePeriod = nothing # spec type: Union{ Nothing, TimePeriodDTO }
    certificate::Union{Nothing, String} = nothing

    function UpdateMappingsOfferDTO(name, shopSku, category, vendor, vendorCode, description, id, feedId, barcodes, urls, pictures, manufacturer, manufacturerCountries, minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, customsCommodityCodes, weightDimensions, supplyScheduleDays, shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate, )
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("name"), name)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("shopSku"), shopSku)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("category"), category)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("vendor"), vendor)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("vendorCode"), vendorCode)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("description"), description)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("id"), id)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("feedId"), feedId)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("barcodes"), barcodes)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("urls"), urls)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("pictures"), pictures)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("manufacturer"), manufacturer)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("manufacturerCountries"), manufacturerCountries)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("minShipment"), minShipment)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("transportUnitSize"), transportUnitSize)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("quantumOfSupply"), quantumOfSupply)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("deliveryDurationDays"), deliveryDurationDays)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("boxCount"), boxCount)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("customsCommodityCodes"), customsCommodityCodes)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("weightDimensions"), weightDimensions)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("supplyScheduleDays"), supplyScheduleDays)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("shelfLifeDays"), shelfLifeDays)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("lifeTimeDays"), lifeTimeDays)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("guaranteePeriodDays"), guaranteePeriodDays)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("processingState"), processingState)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("availability"), availability)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("shelfLife"), shelfLife)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("lifeTime"), lifeTime)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("guaranteePeriod"), guaranteePeriod)
        OpenAPI.validate_property(UpdateMappingsOfferDTO, Symbol("certificate"), certificate)
        return new(name, shopSku, category, vendor, vendorCode, description, id, feedId, barcodes, urls, pictures, manufacturer, manufacturerCountries, minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, customsCommodityCodes, weightDimensions, supplyScheduleDays, shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate, )
    end
end # type UpdateMappingsOfferDTO

const _property_types_UpdateMappingsOfferDTO = Dict{Symbol,String}(Symbol("name")=>"String", Symbol("shopSku")=>"String", Symbol("category")=>"String", Symbol("vendor")=>"String", Symbol("vendorCode")=>"String", Symbol("description")=>"String", Symbol("id")=>"String", Symbol("feedId")=>"Int64", Symbol("barcodes")=>"Vector{String}", Symbol("urls")=>"Vector{String}", Symbol("pictures")=>"Vector{String}", Symbol("manufacturer")=>"String", Symbol("manufacturerCountries")=>"Vector{String}", Symbol("minShipment")=>"Int64", Symbol("transportUnitSize")=>"Int64", Symbol("quantumOfSupply")=>"Int64", Symbol("deliveryDurationDays")=>"Int64", Symbol("boxCount")=>"Int64", Symbol("customsCommodityCodes")=>"Vector{String}", Symbol("weightDimensions")=>"OfferWeightDimensionsDTO", Symbol("supplyScheduleDays")=>"Vector{DayOfWeekType}", Symbol("shelfLifeDays")=>"Int64", Symbol("lifeTimeDays")=>"Int64", Symbol("guaranteePeriodDays")=>"Int64", Symbol("processingState")=>"OfferProcessingStateDTO", Symbol("availability")=>"OfferAvailabilityStatusType", Symbol("shelfLife")=>"TimePeriodDTO", Symbol("lifeTime")=>"TimePeriodDTO", Symbol("guaranteePeriod")=>"TimePeriodDTO", Symbol("certificate")=>"String", )
OpenAPI.property_type(::Type{ UpdateMappingsOfferDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_UpdateMappingsOfferDTO[name]))}

function check_required(o::UpdateMappingsOfferDTO)
    true
end

function OpenAPI.validate_property(::Type{ UpdateMappingsOfferDTO }, name::Symbol, val)
    if name === Symbol("name")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :maxLength, val, 256)
    end
    if name === Symbol("shopSku")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :maxLength, val, 255)
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :minLength, val, 1)
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :pattern, val, r"^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$")
    end
    if name === Symbol("description")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :maxLength, val, 6000)
    end
    if name === Symbol("id")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :maxLength, val, 255)
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :minLength, val, 1)
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :pattern, val, r"^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$")
    end
    if name === Symbol("feedId")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int64")
    end
    if name === Symbol("minShipment")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int32")
    end
    if name === Symbol("transportUnitSize")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int32")
    end
    if name === Symbol("quantumOfSupply")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int32")
    end
    if name === Symbol("deliveryDurationDays")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int32")
    end
    if name === Symbol("boxCount")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int32")
    end
    if name === Symbol("shelfLifeDays")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int32")
    end
    if name === Symbol("lifeTimeDays")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int32")
    end
    if name === Symbol("guaranteePeriodDays")
        OpenAPI.validate_param(name, "UpdateMappingsOfferDTO", :format, val, "int32")
    end
end
