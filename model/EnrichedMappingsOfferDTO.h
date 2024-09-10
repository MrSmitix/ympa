/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * EnrichedMappingsOfferDTO.h
 *
 * Информация о рекомендованных карточках товаров.
 */

#ifndef EnrichedMappingsOfferDTO_H_
#define EnrichedMappingsOfferDTO_H_


#include "OfferWeightDimensionsDTO.h"
#include "OfferAvailabilityStatusType.h"
#include "OfferProcessingStateDTO.h"
#include "TimePeriodDTO.h"
#include "DayOfWeekType.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация о рекомендованных карточках товаров.
/// </summary>
class  EnrichedMappingsOfferDTO
{
public:
    EnrichedMappingsOfferDTO();
    virtual ~EnrichedMappingsOfferDTO() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const EnrichedMappingsOfferDTO& rhs) const;
    bool operator!=(const EnrichedMappingsOfferDTO& rhs) const;

    /////////////////////////////////////////////
    /// EnrichedMappingsOfferDTO members

    /// <summary>
    /// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getShopSku() const;
    void setShopSku(std::string const& value);
    bool shopSkuIsSet() const;
    void unsetShopSku();
    /// <summary>
    /// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
    /// </summary>
    std::string getCategory() const;
    void setCategory(std::string const& value);
    bool categoryIsSet() const;
    void unsetCategory();
    /// <summary>
    /// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    /// </summary>
    std::string getVendor() const;
    void setVendor(std::string const& value);
    bool vendorIsSet() const;
    void unsetVendor();
    /// <summary>
    /// Артикул товара от производителя.
    /// </summary>
    std::string getVendorCode() const;
    void setVendorCode(std::string const& value);
    bool vendorCodeIsSet() const;
    void unsetVendorCode();
    /// <summary>
    /// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Идентификатор фида.
    /// </summary>
    int64_t getFeedId() const;
    void setFeedId(int64_t const value);
    bool feedIdIsSet() const;
    void unsetFeedId();
    /// <summary>
    /// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    /// </summary>
    std::vector<std::string> getBarcodes() const;
    void setBarcodes(std::vector<std::string> const& value);
    bool barcodesIsSet() const;
    void unsetBarcodes();
    /// <summary>
    /// URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
    /// </summary>
    std::vector<std::string> getUrls() const;
    void setUrls(std::vector<std::string> const& value);
    bool urlsIsSet() const;
    void unsetUrls();
    /// <summary>
    /// Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. 
    /// </summary>
    std::vector<std::string> getPictures() const;
    void setPictures(std::vector<std::string> const& value);
    bool picturesIsSet() const;
    void unsetPictures();
    /// <summary>
    /// Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
    /// </summary>
    std::string getManufacturer() const;
    void setManufacturer(std::string const& value);
    bool manufacturerIsSet() const;
    void unsetManufacturer();
    /// <summary>
    /// Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
    /// </summary>
    std::vector<std::string> getManufacturerCountries() const;
    void setManufacturerCountries(std::vector<std::string> const& value);
    bool manufacturerCountriesIsSet() const;
    void unsetManufacturerCountries();
    /// <summary>
    /// Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
    /// </summary>
    int32_t getMinShipment() const;
    void setMinShipment(int32_t const value);
    bool minShipmentIsSet() const;
    void unsetMinShipment();
    /// <summary>
    /// Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
    /// </summary>
    int32_t getTransportUnitSize() const;
    void setTransportUnitSize(int32_t const value);
    bool transportUnitSizeIsSet() const;
    void unsetTransportUnitSize();
    /// <summary>
    /// Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
    /// </summary>
    int32_t getQuantumOfSupply() const;
    void setQuantumOfSupply(int32_t const value);
    bool quantumOfSupplyIsSet() const;
    void unsetQuantumOfSupply();
    /// <summary>
    /// Срок, за который продавец поставляет товары на склад, в днях.
    /// </summary>
    int32_t getDeliveryDurationDays() const;
    void setDeliveryDurationDays(int32_t const value);
    bool deliveryDurationDaysIsSet() const;
    void unsetDeliveryDurationDays();
    /// <summary>
    /// Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
    /// </summary>
    int32_t getBoxCount() const;
    void setBoxCount(int32_t const value);
    bool boxCountIsSet() const;
    void unsetBoxCount();
    /// <summary>
    /// Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
    /// </summary>
    std::vector<std::string> getCustomsCommodityCodes() const;
    void setCustomsCommodityCodes(std::vector<std::string> const& value);
    bool customsCommodityCodesIsSet() const;
    void unsetCustomsCommodityCodes();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferWeightDimensionsDTO getWeightDimensions() const;
    void setWeightDimensions(org::openapitools::server::model::OfferWeightDimensionsDTO const& value);
    bool weightDimensionsIsSet() const;
    void unsetWeightDimensions();
    /// <summary>
    /// Дни недели, в которые продавец поставляет товары на склад.
    /// </summary>
    std::vector<org::openapitools::server::model::DayOfWeekType> getSupplyScheduleDays() const;
    void setSupplyScheduleDays(std::vector<org::openapitools::server::model::DayOfWeekType> const& value);
    bool supplyScheduleDaysIsSet() const;
    void unsetSupplyScheduleDays();
    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
    /// </summary>
    int32_t getShelfLifeDays() const;
    void setShelfLifeDays(int32_t const value);
    bool shelfLifeDaysIsSet() const;
    void unsetShelfLifeDays();
    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
    /// </summary>
    int32_t getLifeTimeDays() const;
    void setLifeTimeDays(int32_t const value);
    bool lifeTimeDaysIsSet() const;
    void unsetLifeTimeDays();
    /// <summary>
    /// Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
    /// </summary>
    int32_t getGuaranteePeriodDays() const;
    void setGuaranteePeriodDays(int32_t const value);
    bool guaranteePeriodDaysIsSet() const;
    void unsetGuaranteePeriodDays();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferProcessingStateDTO getProcessingState() const;
    void setProcessingState(org::openapitools::server::model::OfferProcessingStateDTO const& value);
    bool processingStateIsSet() const;
    void unsetProcessingState();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferAvailabilityStatusType getAvailability() const;
    void setAvailability(org::openapitools::server::model::OfferAvailabilityStatusType const& value);
    bool availabilityIsSet() const;
    void unsetAvailability();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::TimePeriodDTO getShelfLife() const;
    void setShelfLife(org::openapitools::server::model::TimePeriodDTO const& value);
    bool shelfLifeIsSet() const;
    void unsetShelfLife();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::TimePeriodDTO getLifeTime() const;
    void setLifeTime(org::openapitools::server::model::TimePeriodDTO const& value);
    bool lifeTimeIsSet() const;
    void unsetLifeTime();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::TimePeriodDTO getGuaranteePeriod() const;
    void setGuaranteePeriod(org::openapitools::server::model::TimePeriodDTO const& value);
    bool guaranteePeriodIsSet() const;
    void unsetGuaranteePeriod();
    /// <summary>
    /// Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
    /// </summary>
    std::string getCertificate() const;
    void setCertificate(std::string const& value);
    bool certificateIsSet() const;
    void unsetCertificate();
    /// <summary>
    /// Цена на товар в рублях.
    /// </summary>
    double getPrice() const;
    void setPrice(double const value);
    bool priceIsSet() const;
    void unsetPrice();
    /// <summary>
    /// Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
    /// </summary>
    int64_t getMarketCategoryId() const;
    void setMarketCategoryId(int64_t const value);
    bool marketCategoryIdIsSet() const;
    void unsetMarketCategoryId();
    /// <summary>
    /// Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
    /// </summary>
    std::string getMarketCategoryName() const;
    void setMarketCategoryName(std::string const& value);
    bool marketCategoryNameIsSet() const;
    void unsetMarketCategoryName();
    /// <summary>
    /// Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
    /// </summary>
    int64_t getMarketModelId() const;
    void setMarketModelId(int64_t const value);
    bool marketModelIdIsSet() const;
    void unsetMarketModelId();
    /// <summary>
    /// Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
    /// </summary>
    std::string getMarketModelName() const;
    void setMarketModelName(std::string const& value);
    bool marketModelNameIsSet() const;
    void unsetMarketModelName();
    /// <summary>
    /// SKU на Маркете.
    /// </summary>
    int64_t getMarketSku() const;
    void setMarketSku(int64_t const value);
    bool marketSkuIsSet() const;
    void unsetMarketSku();
    /// <summary>
    /// Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. 
    /// </summary>
    std::string getMarketSkuName() const;
    void setMarketSkuName(std::string const& value);
    bool marketSkuNameIsSet() const;
    void unsetMarketSkuName();

    friend  void to_json(nlohmann::json& j, const EnrichedMappingsOfferDTO& o);
    friend  void from_json(const nlohmann::json& j, EnrichedMappingsOfferDTO& o);
protected:
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_ShopSku;
    bool m_ShopSkuIsSet;
    std::string m_Category;
    bool m_CategoryIsSet;
    std::string m_Vendor;
    bool m_VendorIsSet;
    std::string m_VendorCode;
    bool m_VendorCodeIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    std::string m_Id;
    bool m_IdIsSet;
    int64_t m_FeedId;
    bool m_FeedIdIsSet;
    std::vector<std::string> m_Barcodes;
    bool m_BarcodesIsSet;
    std::vector<std::string> m_Urls;
    bool m_UrlsIsSet;
    std::vector<std::string> m_Pictures;
    bool m_PicturesIsSet;
    std::string m_Manufacturer;
    bool m_ManufacturerIsSet;
    std::vector<std::string> m_ManufacturerCountries;
    bool m_ManufacturerCountriesIsSet;
    int32_t m_MinShipment;
    bool m_MinShipmentIsSet;
    int32_t m_TransportUnitSize;
    bool m_TransportUnitSizeIsSet;
    int32_t m_QuantumOfSupply;
    bool m_QuantumOfSupplyIsSet;
    int32_t m_DeliveryDurationDays;
    bool m_DeliveryDurationDaysIsSet;
    int32_t m_BoxCount;
    bool m_BoxCountIsSet;
    std::vector<std::string> m_CustomsCommodityCodes;
    bool m_CustomsCommodityCodesIsSet;
    org::openapitools::server::model::OfferWeightDimensionsDTO m_WeightDimensions;
    bool m_WeightDimensionsIsSet;
    std::vector<org::openapitools::server::model::DayOfWeekType> m_SupplyScheduleDays;
    bool m_SupplyScheduleDaysIsSet;
    int32_t m_ShelfLifeDays;
    bool m_ShelfLifeDaysIsSet;
    int32_t m_LifeTimeDays;
    bool m_LifeTimeDaysIsSet;
    int32_t m_GuaranteePeriodDays;
    bool m_GuaranteePeriodDaysIsSet;
    org::openapitools::server::model::OfferProcessingStateDTO m_ProcessingState;
    bool m_ProcessingStateIsSet;
    org::openapitools::server::model::OfferAvailabilityStatusType m_Availability;
    bool m_AvailabilityIsSet;
    org::openapitools::server::model::TimePeriodDTO m_ShelfLife;
    bool m_ShelfLifeIsSet;
    org::openapitools::server::model::TimePeriodDTO m_LifeTime;
    bool m_LifeTimeIsSet;
    org::openapitools::server::model::TimePeriodDTO m_GuaranteePeriod;
    bool m_GuaranteePeriodIsSet;
    std::string m_Certificate;
    bool m_CertificateIsSet;
    double m_Price;
    bool m_PriceIsSet;
    int64_t m_MarketCategoryId;
    bool m_MarketCategoryIdIsSet;
    std::string m_MarketCategoryName;
    bool m_MarketCategoryNameIsSet;
    int64_t m_MarketModelId;
    bool m_MarketModelIdIsSet;
    std::string m_MarketModelName;
    bool m_MarketModelNameIsSet;
    int64_t m_MarketSku;
    bool m_MarketSkuIsSet;
    std::string m_MarketSkuName;
    bool m_MarketSkuNameIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* EnrichedMappingsOfferDTO_H_ */
