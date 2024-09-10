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
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о рекомендованных карточках товаров.
/// </summary>
class  EnrichedMappingsOfferDTO : public MappingsOfferDTO
{
public:
    EnrichedMappingsOfferDTO() = default;
    explicit EnrichedMappingsOfferDTO(boost::property_tree::ptree const& pt);
    virtual ~EnrichedMappingsOfferDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// EnrichedMappingsOfferDTO members

    /// <summary>
    /// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getShopSku() const;
    void setShopSku(std::string value);

    /// <summary>
    /// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
    /// </summary>
    std::string getCategory() const;
    void setCategory(std::string value);

    /// <summary>
    /// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    /// </summary>
    std::string getVendor() const;
    void setVendor(std::string value);

    /// <summary>
    /// Артикул товара от производителя.
    /// </summary>
    std::string getVendorCode() const;
    void setVendorCode(std::string value);

    /// <summary>
    /// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// Идентификатор фида.
    /// </summary>
    int64_t getFeedId() const;
    void setFeedId(int64_t value);

    /// <summary>
    /// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    /// </summary>
    std::vector<std::string> getBarcodes() const;
    void setBarcodes(std::vector<std::string> value);

    /// <summary>
    /// URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
    /// </summary>
    std::vector<std::string> getUrls() const;
    void setUrls(std::vector<std::string> value);

    /// <summary>
    /// Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр &#x60;picture&#x60;. 
    /// </summary>
    std::vector<std::string> getPictures() const;
    void setPictures(std::vector<std::string> value);

    /// <summary>
    /// Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
    /// </summary>
    std::string getManufacturer() const;
    void setManufacturer(std::string value);

    /// <summary>
    /// Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
    /// </summary>
    std::vector<std::string> getManufacturerCountries() const;
    void setManufacturerCountries(std::vector<std::string> value);

    /// <summary>
    /// Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
    /// </summary>
    int32_t getMinShipment() const;
    void setMinShipment(int32_t value);

    /// <summary>
    /// Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
    /// </summary>
    int32_t getTransportUnitSize() const;
    void setTransportUnitSize(int32_t value);

    /// <summary>
    /// Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
    /// </summary>
    int32_t getQuantumOfSupply() const;
    void setQuantumOfSupply(int32_t value);

    /// <summary>
    /// Срок, за который продавец поставляет товары на склад, в днях.
    /// </summary>
    int32_t getDeliveryDurationDays() const;
    void setDeliveryDurationDays(int32_t value);

    /// <summary>
    /// Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
    /// </summary>
    int32_t getBoxCount() const;
    void setBoxCount(int32_t value);

    /// <summary>
    /// Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
    /// </summary>
    std::vector<std::string> getCustomsCommodityCodes() const;
    void setCustomsCommodityCodes(std::vector<std::string> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferWeightDimensionsDTO> getWeightDimensions() const;
    void setWeightDimensions(std::shared_ptr<OfferWeightDimensionsDTO> value);

    /// <summary>
    /// Дни недели, в которые продавец поставляет товары на склад.
    /// </summary>
    std::vector<std::shared_ptr<DayOfWeekType>> getSupplyScheduleDays() const;
    void setSupplyScheduleDays(std::vector<std::shared_ptr<DayOfWeekType>> value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;shelfLife&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
    /// </summary>
    int32_t getShelfLifeDays() const;
    void setShelfLifeDays(int32_t value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;lifeTime&#x60;. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
    /// </summary>
    int32_t getLifeTimeDays() const;
    void setLifeTimeDays(int32_t value);

    /// <summary>
    /// Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
    /// </summary>
    int32_t getGuaranteePeriodDays() const;
    void setGuaranteePeriodDays(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferProcessingStateDTO> getProcessingState() const;
    void setProcessingState(std::shared_ptr<OfferProcessingStateDTO> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferAvailabilityStatusType> getAvailability() const;
    void setAvailability(std::shared_ptr<OfferAvailabilityStatusType> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TimePeriodDTO> getShelfLife() const;
    void setShelfLife(std::shared_ptr<TimePeriodDTO> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TimePeriodDTO> getLifeTime() const;
    void setLifeTime(std::shared_ptr<TimePeriodDTO> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TimePeriodDTO> getGuaranteePeriod() const;
    void setGuaranteePeriod(std::shared_ptr<TimePeriodDTO> value);

    /// <summary>
    /// Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
    /// </summary>
    std::string getCertificate() const;
    void setCertificate(std::string value);

    /// <summary>
    /// Цена на товар в рублях.
    /// </summary>
    double getPrice() const;
    void setPrice(double value);

    /// <summary>
    /// Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
    /// </summary>
    int64_t getMarketCategoryId() const;
    void setMarketCategoryId(int64_t value);

    /// <summary>
    /// Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
    /// </summary>
    std::string getMarketCategoryName() const;
    void setMarketCategoryName(std::string value);

    /// <summary>
    /// Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
    /// </summary>
    int64_t getMarketModelId() const;
    void setMarketModelId(int64_t value);

    /// <summary>
    /// Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
    /// </summary>
    std::string getMarketModelName() const;
    void setMarketModelName(std::string value);

    /// <summary>
    /// SKU на Маркете.
    /// </summary>
    int64_t getMarketSku() const;
    void setMarketSku(int64_t value);

    /// <summary>
    /// Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. 
    /// </summary>
    std::string getMarketSkuName() const;
    void setMarketSkuName(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Name = "";
    std::string m_ShopSku = "";
    std::string m_Category = "";
    std::string m_Vendor = "";
    std::string m_VendorCode = "";
    std::string m_Description = "";
    std::string m_Id = "";
    int64_t m_FeedId = 0L;
    std::vector<std::string> m_Barcodes;
    std::vector<std::string> m_Urls;
    std::vector<std::string> m_Pictures;
    std::string m_Manufacturer = "";
    std::vector<std::string> m_ManufacturerCountries;
    int32_t m_MinShipment = 0;
    int32_t m_TransportUnitSize = 0;
    int32_t m_QuantumOfSupply = 0;
    int32_t m_DeliveryDurationDays = 0;
    int32_t m_BoxCount = 0;
    std::vector<std::string> m_CustomsCommodityCodes;
    std::shared_ptr<OfferWeightDimensionsDTO> m_WeightDimensions;
    std::vector<std::shared_ptr<DayOfWeekType>> m_SupplyScheduleDays;
    int32_t m_ShelfLifeDays = 0;
    int32_t m_LifeTimeDays = 0;
    int32_t m_GuaranteePeriodDays = 0;
    std::shared_ptr<OfferProcessingStateDTO> m_ProcessingState;
    std::shared_ptr<OfferAvailabilityStatusType> m_Availability = std::make_shared<OfferAvailabilityStatusType>();
    std::shared_ptr<TimePeriodDTO> m_ShelfLife;
    std::shared_ptr<TimePeriodDTO> m_LifeTime;
    std::shared_ptr<TimePeriodDTO> m_GuaranteePeriod;
    std::string m_Certificate = "";
    double m_Price = 0.0;
    int64_t m_MarketCategoryId = 0L;
    std::string m_MarketCategoryName = "";
    int64_t m_MarketModelId = 0L;
    std::string m_MarketModelName = "";
    int64_t m_MarketSku = 0L;
    std::string m_MarketSkuName = "";
};

std::vector<EnrichedMappingsOfferDTO> createEnrichedMappingsOfferDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* EnrichedMappingsOfferDTO_H_ */
