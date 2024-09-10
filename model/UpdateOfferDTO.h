/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * UpdateOfferDTO.h
 *
 * Параметры товара.
 */

#ifndef UpdateOfferDTO_H_
#define UpdateOfferDTO_H_



#include "OfferWeightDimensionsDTO.h"
#include "OfferConditionDTO.h"
#include "TimePeriodDTO.h"
#include "OfferManualDTO.h"
#include "BasePriceDTO.h"
#include "OfferParamDTO.h"
#include <string>
#include "AgeDTO.h"
#include "OfferType.h"
#include "ParameterValueDTO.h"
#include <vector>
#include "UpdatePriceWithDiscountDTO.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "BaseOfferDTO.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Параметры товара.
/// </summary>
class  UpdateOfferDTO : public BaseOfferDTO
{
public:
    UpdateOfferDTO() = default;
    explicit UpdateOfferDTO(boost::property_tree::ptree const& pt);
    virtual ~UpdateOfferDTO() = default;

    UpdateOfferDTO(const UpdateOfferDTO& other) = default; // copy constructor
    UpdateOfferDTO(UpdateOfferDTO&& other) noexcept = default; // move constructor

    UpdateOfferDTO& operator=(const UpdateOfferDTO& other) = default; // copy assignment
    UpdateOfferDTO& operator=(UpdateOfferDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UpdateOfferDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getOfferId() const;
    void setOfferId(std::string value);

    /// <summary>
    /// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    /// </summary>
    int64_t getMarketCategoryId() const;
    void setMarketCategoryId(int64_t value);

    /// <summary>
    /// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
    /// </summary>
    std::string getCategory() const;
    void setCategory(std::string value);

    /// <summary>
    /// Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
    /// </summary>
    std::vector<std::string> getPictures() const;
    void setPictures(std::vector<std::string> value);

    /// <summary>
    /// Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
    /// </summary>
    std::vector<std::string> getVideos() const;
    void setVideos(std::vector<std::string> value);

    /// <summary>
    /// Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. 
    /// </summary>
    std::vector<OfferManualDTO> getManuals() const;
    void setManuals(std::vector<OfferManualDTO> value);

    /// <summary>
    /// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    /// </summary>
    std::string getVendor() const;
    void setVendor(std::string value);

    /// <summary>
    /// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    /// </summary>
    std::vector<std::string> getBarcodes() const;
    void setBarcodes(std::vector<std::string> value);

    /// <summary>
    /// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
    /// </summary>
    std::vector<std::string> getManufacturerCountries() const;
    void setManufacturerCountries(std::vector<std::string> value);

    /// <summary>
    /// 
    /// </summary>
    OfferWeightDimensionsDTO getWeightDimensions() const;
    void setWeightDimensions(OfferWeightDimensionsDTO value);

    /// <summary>
    /// Артикул товара от производителя.
    /// </summary>
    std::string getVendorCode() const;
    void setVendorCode(std::string value);

    /// <summary>
    /// Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
    /// </summary>
    std::vector<std::string> getTags() const;
    void setTags(std::vector<std::string> value);

    /// <summary>
    /// 
    /// </summary>
    TimePeriodDTO getShelfLife() const;
    void setShelfLife(TimePeriodDTO value);

    /// <summary>
    /// 
    /// </summary>
    TimePeriodDTO getLifeTime() const;
    void setLifeTime(TimePeriodDTO value);

    /// <summary>
    /// 
    /// </summary>
    TimePeriodDTO getGuaranteePeriod() const;
    void setGuaranteePeriod(TimePeriodDTO value);

    /// <summary>
    /// Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
    /// </summary>
    std::string getCustomsCommodityCode() const;
    void setCustomsCommodityCode(std::string value);

    /// <summary>
    /// Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
    /// </summary>
    std::vector<std::string> getCertificates() const;
    void setCertificates(std::vector<std::string> value);

    /// <summary>
    /// Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
    /// </summary>
    int32_t getBoxCount() const;
    void setBoxCount(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    OfferConditionDTO getCondition() const;
    void setCondition(OfferConditionDTO value);

    /// <summary>
    /// 
    /// </summary>
    OfferType getType() const;
    void setType(OfferType value);

    /// <summary>
    /// Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
    /// </summary>
    bool isDownloadable() const;
    void setDownloadable(bool value);

    /// <summary>
    /// Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
    /// </summary>
    bool isAdult() const;
    void setAdult(bool value);

    /// <summary>
    /// 
    /// </summary>
    AgeDTO getAge() const;
    void setAge(AgeDTO value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
    /// </summary>
    std::vector<OfferParamDTO> getParams() const;
    void setParams(std::vector<OfferParamDTO> value);

    /// <summary>
    /// Список характеристик с их значениями.  С &#x60;parameterValues&#x60; обязательно передавайте &#x60;marketCategoryId&#x60; — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее &#x60;parameterId&#x60; с пустым &#x60;value&#x60;.  Максимальное количество характеристик — 300. 
    /// </summary>
    std::vector<ParameterValueDTO> getParameterValues() const;
    void setParameterValues(std::vector<ParameterValueDTO> value);

    /// <summary>
    /// 
    /// </summary>
    UpdatePriceWithDiscountDTO getBasicPrice() const;
    void setBasicPrice(UpdatePriceWithDiscountDTO value);

    /// <summary>
    /// 
    /// </summary>
    BasePriceDTO getPurchasePrice() const;
    void setPurchasePrice(BasePriceDTO value);

    /// <summary>
    /// 
    /// </summary>
    BasePriceDTO getAdditionalExpenses() const;
    void setAdditionalExpenses(BasePriceDTO value);

    /// <summary>
    /// 
    /// </summary>
    BasePriceDTO getCofinancePrice() const;
    void setCofinancePrice(BasePriceDTO value);

protected:
    std::string m_OfferId = "";
    std::string m_Name = "";
    int64_t m_MarketCategoryId = 0L;
    std::string m_Category = "";
    std::vector<std::string> m_Pictures;
    std::vector<std::string> m_Videos;
    std::vector<OfferManualDTO> m_Manuals;
    std::string m_Vendor = "";
    std::vector<std::string> m_Barcodes;
    std::string m_Description = "";
    std::vector<std::string> m_ManufacturerCountries;
    OfferWeightDimensionsDTO m_WeightDimensions;
    std::string m_VendorCode = "";
    std::vector<std::string> m_Tags;
    TimePeriodDTO m_ShelfLife;
    TimePeriodDTO m_LifeTime;
    TimePeriodDTO m_GuaranteePeriod;
    std::string m_CustomsCommodityCode = "";
    std::vector<std::string> m_Certificates;
    int32_t m_BoxCount = 0;
    OfferConditionDTO m_Condition;
    OfferType m_Type = OfferType{};
    bool m_Downloadable = false;
    bool m_Adult = false;
    AgeDTO m_Age;
    std::vector<OfferParamDTO> m_Params;
    std::vector<ParameterValueDTO> m_ParameterValues;
    UpdatePriceWithDiscountDTO m_BasicPrice;
    BasePriceDTO m_PurchasePrice;
    BasePriceDTO m_AdditionalExpenses;
    BasePriceDTO m_CofinancePrice;
};

std::vector<UpdateOfferDTO> createUpdateOfferDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UpdateOfferDTO>(const UpdateOfferDTO& val) {
    return val.toPropertyTree();
}

template<>
inline UpdateOfferDTO fromPt<UpdateOfferDTO>(const boost::property_tree::ptree& pt) {
    UpdateOfferDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UpdateOfferDTO_H_ */
