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
 * GetOfferDTO.h
 *
 * Параметры товара.
 */

#ifndef GetOfferDTO_H_
#define GetOfferDTO_H_


#include "OfferWeightDimensionsDTO.h"
#include "OfferManualDTO.h"
#include <string>
#include "AgeDTO.h"
#include <vector>
#include "OfferSellingProgramDTO.h"
#include "OfferCampaignStatusDTO.h"
#include "OfferConditionDTO.h"
#include "TimePeriodDTO.h"
#include "GetPriceWithDiscountDTO.h"
#include "OfferParamDTO.h"
#include "GetPriceDTO.h"
#include "OfferType.h"
#include "OfferCardStatusType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Параметры товара.
/// </summary>
class  GetOfferDTO
{
public:
    GetOfferDTO();
    virtual ~GetOfferDTO() = default;


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

    bool operator==(const GetOfferDTO& rhs) const;
    bool operator!=(const GetOfferDTO& rhs) const;

    /////////////////////////////////////////////
    /// GetOfferDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getOfferId() const;
    void setOfferId(std::string const& value);
    /// <summary>
    /// Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать &#x60;marketCategoryId&#x60;, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    /// </summary>
    int64_t getMarketCategoryId() const;
    void setMarketCategoryId(int64_t const value);
    bool marketCategoryIdIsSet() const;
    void unsetMarketCategoryId();
    /// <summary>
    /// Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре &#x60;marketCategoryId&#x60;. 
    /// </summary>
    std::string getCategory() const;
    void setCategory(std::string const& value);
    bool categoryIsSet() const;
    void unsetCategory();
    /// <summary>
    /// Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/images/sku12345.jpg&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/images/sku12345.jpg&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/tovar.jpg&#x60;  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
    /// </summary>
    std::vector<std::string> getPictures() const;
    void setPictures(std::vector<std::string> const& value);
    bool picturesIsSet() const;
    void unsetPictures();
    /// <summary>
    /// Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ &#x60;https://example-shop.ru/video/sku12345.avi&#x60;  ✅ &#x60;https://yadi.sk/i/NaBoRsimVOLov&#x60;  ❌ &#x60;/video/sku12345.avi&#x60;  ❌ &#x60;https://www.dropbox.com/s/818f/super-tovar.avi&#x60;  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
    /// </summary>
    std::vector<std::string> getVideos() const;
    void setVideos(std::vector<std::string> const& value);
    bool videosIsSet() const;
    void unsetVideos();
    /// <summary>
    /// Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле &#x60;manuals&#x60;, загруженные ранее инструкции удалятся. 
    /// </summary>
    std::vector<org::openapitools::server::model::OfferManualDTO> getManuals() const;
    void setManuals(std::vector<org::openapitools::server::model::OfferManualDTO> const& value);
    bool manualsIsSet() const;
    void unsetManuals();
    /// <summary>
    /// Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
    /// </summary>
    std::string getVendor() const;
    void setVendor(std::string const& value);
    bool vendorIsSet() const;
    void unsetVendor();
    /// <summary>
    /// Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
    /// </summary>
    std::vector<std::string> getBarcodes() const;
    void setBarcodes(std::vector<std::string> const& value);
    bool barcodesIsSet() const;
    void unsetBarcodes();
    /// <summary>
    /// Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\&lt;h&gt;, \\&lt;h1&gt;, \\&lt;h2&gt; и так далее — для заголовков; * \\&lt;br&gt; и \\&lt;p&gt; — для переноса строки; * \\&lt;ol&gt; — для нумерованного списка; * \\&lt;ul&gt; — для маркированного списка; * \\&lt;li&gt; — для создания элементов списка (должен находиться внутри \\&lt;ol&gt; или \\&lt;ul&gt;); * \\&lt;div&gt; — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
    /// </summary>
    std::vector<std::string> getManufacturerCountries() const;
    void setManufacturerCountries(std::vector<std::string> const& value);
    bool manufacturerCountriesIsSet() const;
    void unsetManufacturerCountries();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferWeightDimensionsDTO getWeightDimensions() const;
    void setWeightDimensions(org::openapitools::server::model::OfferWeightDimensionsDTO const& value);
    bool weightDimensionsIsSet() const;
    void unsetWeightDimensions();
    /// <summary>
    /// Артикул товара от производителя.
    /// </summary>
    std::string getVendorCode() const;
    void setVendorCode(std::string const& value);
    bool vendorCodeIsSet() const;
    void unsetVendorCode();
    /// <summary>
    /// Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
    /// </summary>
    std::vector<std::string> getTags() const;
    void setTags(std::vector<std::string> const& value);
    bool tagsIsSet() const;
    void unsetTags();
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
    /// Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
    /// </summary>
    std::string getCustomsCommodityCode() const;
    void setCustomsCommodityCode(std::string const& value);
    bool customsCommodityCodeIsSet() const;
    void unsetCustomsCommodityCode();
    /// <summary>
    /// Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
    /// </summary>
    std::vector<std::string> getCertificates() const;
    void setCertificates(std::vector<std::string> const& value);
    bool certificatesIsSet() const;
    void unsetCertificates();
    /// <summary>
    /// Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
    /// </summary>
    int32_t getBoxCount() const;
    void setBoxCount(int32_t const value);
    bool boxCountIsSet() const;
    void unsetBoxCount();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferConditionDTO getCondition() const;
    void setCondition(org::openapitools::server::model::OfferConditionDTO const& value);
    bool conditionIsSet() const;
    void unsetCondition();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferType getType() const;
    void setType(org::openapitools::server::model::OfferType const& value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// Признак цифрового товара. Укажите &#x60;true&#x60;, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
    /// </summary>
    bool isDownloadable() const;
    void setDownloadable(bool const value);
    bool downloadableIsSet() const;
    void unsetDownloadable();
    /// <summary>
    /// Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
    /// </summary>
    bool isAdult() const;
    void setAdult(bool const value);
    bool adultIsSet() const;
    void unsetAdult();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::AgeDTO getAge() const;
    void setAge(org::openapitools::server::model::AgeDTO const& value);
    bool ageIsSet() const;
    void unsetAge();
    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. При передаче характеристик используйте &#x60;parameterValues&#x60;.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
    /// </summary>
    std::vector<org::openapitools::server::model::OfferParamDTO> getParams() const;
    void setParams(std::vector<org::openapitools::server::model::OfferParamDTO> const& value);
    bool paramsIsSet() const;
    void unsetParams();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GetPriceWithDiscountDTO getBasicPrice() const;
    void setBasicPrice(org::openapitools::server::model::GetPriceWithDiscountDTO const& value);
    bool basicPriceIsSet() const;
    void unsetBasicPrice();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GetPriceDTO getPurchasePrice() const;
    void setPurchasePrice(org::openapitools::server::model::GetPriceDTO const& value);
    bool purchasePriceIsSet() const;
    void unsetPurchasePrice();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GetPriceDTO getAdditionalExpenses() const;
    void setAdditionalExpenses(org::openapitools::server::model::GetPriceDTO const& value);
    bool additionalExpensesIsSet() const;
    void unsetAdditionalExpenses();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GetPriceDTO getCofinancePrice() const;
    void setCofinancePrice(org::openapitools::server::model::GetPriceDTO const& value);
    bool cofinancePriceIsSet() const;
    void unsetCofinancePrice();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OfferCardStatusType getCardStatus() const;
    void setCardStatus(org::openapitools::server::model::OfferCardStatusType const& value);
    bool cardStatusIsSet() const;
    void unsetCardStatus();
    /// <summary>
    /// Список магазинов, в которых размещен товар. 
    /// </summary>
    std::vector<org::openapitools::server::model::OfferCampaignStatusDTO> getCampaigns() const;
    void setCampaigns(std::vector<org::openapitools::server::model::OfferCampaignStatusDTO> const& value);
    bool campaignsIsSet() const;
    void unsetCampaigns();
    /// <summary>
    /// Информация о том, какие для товара доступны модели размещения. 
    /// </summary>
    std::vector<org::openapitools::server::model::OfferSellingProgramDTO> getSellingPrograms() const;
    void setSellingPrograms(std::vector<org::openapitools::server::model::OfferSellingProgramDTO> const& value);
    bool sellingProgramsIsSet() const;
    void unsetSellingPrograms();
    /// <summary>
    /// Товар помещен в архив. 
    /// </summary>
    bool isArchived() const;
    void setArchived(bool const value);
    bool archivedIsSet() const;
    void unsetArchived();

    friend  void to_json(nlohmann::json& j, const GetOfferDTO& o);
    friend  void from_json(const nlohmann::json& j, GetOfferDTO& o);
protected:
    std::string m_OfferId;

    std::string m_Name;
    bool m_NameIsSet;
    int64_t m_MarketCategoryId;
    bool m_MarketCategoryIdIsSet;
    std::string m_Category;
    bool m_CategoryIsSet;
    std::vector<std::string> m_Pictures;
    bool m_PicturesIsSet;
    std::vector<std::string> m_Videos;
    bool m_VideosIsSet;
    std::vector<org::openapitools::server::model::OfferManualDTO> m_Manuals;
    bool m_ManualsIsSet;
    std::string m_Vendor;
    bool m_VendorIsSet;
    std::vector<std::string> m_Barcodes;
    bool m_BarcodesIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    std::vector<std::string> m_ManufacturerCountries;
    bool m_ManufacturerCountriesIsSet;
    org::openapitools::server::model::OfferWeightDimensionsDTO m_WeightDimensions;
    bool m_WeightDimensionsIsSet;
    std::string m_VendorCode;
    bool m_VendorCodeIsSet;
    std::vector<std::string> m_Tags;
    bool m_TagsIsSet;
    org::openapitools::server::model::TimePeriodDTO m_ShelfLife;
    bool m_ShelfLifeIsSet;
    org::openapitools::server::model::TimePeriodDTO m_LifeTime;
    bool m_LifeTimeIsSet;
    org::openapitools::server::model::TimePeriodDTO m_GuaranteePeriod;
    bool m_GuaranteePeriodIsSet;
    std::string m_CustomsCommodityCode;
    bool m_CustomsCommodityCodeIsSet;
    std::vector<std::string> m_Certificates;
    bool m_CertificatesIsSet;
    int32_t m_BoxCount;
    bool m_BoxCountIsSet;
    org::openapitools::server::model::OfferConditionDTO m_Condition;
    bool m_ConditionIsSet;
    org::openapitools::server::model::OfferType m_Type;
    bool m_TypeIsSet;
    bool m_Downloadable;
    bool m_DownloadableIsSet;
    bool m_Adult;
    bool m_AdultIsSet;
    org::openapitools::server::model::AgeDTO m_Age;
    bool m_AgeIsSet;
    std::vector<org::openapitools::server::model::OfferParamDTO> m_Params;
    bool m_ParamsIsSet;
    org::openapitools::server::model::GetPriceWithDiscountDTO m_BasicPrice;
    bool m_BasicPriceIsSet;
    org::openapitools::server::model::GetPriceDTO m_PurchasePrice;
    bool m_PurchasePriceIsSet;
    org::openapitools::server::model::GetPriceDTO m_AdditionalExpenses;
    bool m_AdditionalExpensesIsSet;
    org::openapitools::server::model::GetPriceDTO m_CofinancePrice;
    bool m_CofinancePriceIsSet;
    org::openapitools::server::model::OfferCardStatusType m_CardStatus;
    bool m_CardStatusIsSet;
    std::vector<org::openapitools::server::model::OfferCampaignStatusDTO> m_Campaigns;
    bool m_CampaignsIsSet;
    std::vector<org::openapitools::server::model::OfferSellingProgramDTO> m_SellingPrograms;
    bool m_SellingProgramsIsSet;
    bool m_Archived;
    bool m_ArchivedIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* GetOfferDTO_H_ */
