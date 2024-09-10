/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIUpdateOfferDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdateOfferDTO::OAIUpdateOfferDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdateOfferDTO::OAIUpdateOfferDTO() {
    this->initializeModel();
}

OAIUpdateOfferDTO::~OAIUpdateOfferDTO() {}

void OAIUpdateOfferDTO::initializeModel() {

    m_offer_id_isSet = false;
    m_offer_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_market_category_id_isSet = false;
    m_market_category_id_isValid = false;

    m_category_isSet = false;
    m_category_isValid = false;

    m_pictures_isSet = false;
    m_pictures_isValid = false;

    m_videos_isSet = false;
    m_videos_isValid = false;

    m_manuals_isSet = false;
    m_manuals_isValid = false;

    m_vendor_isSet = false;
    m_vendor_isValid = false;

    m_barcodes_isSet = false;
    m_barcodes_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_manufacturer_countries_isSet = false;
    m_manufacturer_countries_isValid = false;

    m_weight_dimensions_isSet = false;
    m_weight_dimensions_isValid = false;

    m_vendor_code_isSet = false;
    m_vendor_code_isValid = false;

    m_tags_isSet = false;
    m_tags_isValid = false;

    m_shelf_life_isSet = false;
    m_shelf_life_isValid = false;

    m_life_time_isSet = false;
    m_life_time_isValid = false;

    m_guarantee_period_isSet = false;
    m_guarantee_period_isValid = false;

    m_customs_commodity_code_isSet = false;
    m_customs_commodity_code_isValid = false;

    m_certificates_isSet = false;
    m_certificates_isValid = false;

    m_box_count_isSet = false;
    m_box_count_isValid = false;

    m_condition_isSet = false;
    m_condition_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_downloadable_isSet = false;
    m_downloadable_isValid = false;

    m_adult_isSet = false;
    m_adult_isValid = false;

    m_age_isSet = false;
    m_age_isValid = false;

    m_params_isSet = false;
    m_params_isValid = false;

    m_parameter_values_isSet = false;
    m_parameter_values_isValid = false;

    m_basic_price_isSet = false;
    m_basic_price_isValid = false;

    m_purchase_price_isSet = false;
    m_purchase_price_isValid = false;

    m_additional_expenses_isSet = false;
    m_additional_expenses_isValid = false;

    m_cofinance_price_isSet = false;
    m_cofinance_price_isValid = false;
}

void OAIUpdateOfferDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdateOfferDTO::fromJsonObject(QJsonObject json) {

    m_offer_id_isValid = ::OpenAPI::fromJsonValue(offer_id, json[QString("offerId")]);
    m_offer_id_isSet = !json[QString("offerId")].isNull() && m_offer_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_market_category_id_isValid = ::OpenAPI::fromJsonValue(market_category_id, json[QString("marketCategoryId")]);
    m_market_category_id_isSet = !json[QString("marketCategoryId")].isNull() && m_market_category_id_isValid;

    m_category_isValid = ::OpenAPI::fromJsonValue(category, json[QString("category")]);
    m_category_isSet = !json[QString("category")].isNull() && m_category_isValid;

    m_pictures_isValid = ::OpenAPI::fromJsonValue(pictures, json[QString("pictures")]);
    m_pictures_isSet = !json[QString("pictures")].isNull() && m_pictures_isValid;

    m_videos_isValid = ::OpenAPI::fromJsonValue(videos, json[QString("videos")]);
    m_videos_isSet = !json[QString("videos")].isNull() && m_videos_isValid;

    m_manuals_isValid = ::OpenAPI::fromJsonValue(manuals, json[QString("manuals")]);
    m_manuals_isSet = !json[QString("manuals")].isNull() && m_manuals_isValid;

    m_vendor_isValid = ::OpenAPI::fromJsonValue(vendor, json[QString("vendor")]);
    m_vendor_isSet = !json[QString("vendor")].isNull() && m_vendor_isValid;

    m_barcodes_isValid = ::OpenAPI::fromJsonValue(barcodes, json[QString("barcodes")]);
    m_barcodes_isSet = !json[QString("barcodes")].isNull() && m_barcodes_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_manufacturer_countries_isValid = ::OpenAPI::fromJsonValue(manufacturer_countries, json[QString("manufacturerCountries")]);
    m_manufacturer_countries_isSet = !json[QString("manufacturerCountries")].isNull() && m_manufacturer_countries_isValid;

    m_weight_dimensions_isValid = ::OpenAPI::fromJsonValue(weight_dimensions, json[QString("weightDimensions")]);
    m_weight_dimensions_isSet = !json[QString("weightDimensions")].isNull() && m_weight_dimensions_isValid;

    m_vendor_code_isValid = ::OpenAPI::fromJsonValue(vendor_code, json[QString("vendorCode")]);
    m_vendor_code_isSet = !json[QString("vendorCode")].isNull() && m_vendor_code_isValid;

    m_tags_isValid = ::OpenAPI::fromJsonValue(tags, json[QString("tags")]);
    m_tags_isSet = !json[QString("tags")].isNull() && m_tags_isValid;

    m_shelf_life_isValid = ::OpenAPI::fromJsonValue(shelf_life, json[QString("shelfLife")]);
    m_shelf_life_isSet = !json[QString("shelfLife")].isNull() && m_shelf_life_isValid;

    m_life_time_isValid = ::OpenAPI::fromJsonValue(life_time, json[QString("lifeTime")]);
    m_life_time_isSet = !json[QString("lifeTime")].isNull() && m_life_time_isValid;

    m_guarantee_period_isValid = ::OpenAPI::fromJsonValue(guarantee_period, json[QString("guaranteePeriod")]);
    m_guarantee_period_isSet = !json[QString("guaranteePeriod")].isNull() && m_guarantee_period_isValid;

    m_customs_commodity_code_isValid = ::OpenAPI::fromJsonValue(customs_commodity_code, json[QString("customsCommodityCode")]);
    m_customs_commodity_code_isSet = !json[QString("customsCommodityCode")].isNull() && m_customs_commodity_code_isValid;

    m_certificates_isValid = ::OpenAPI::fromJsonValue(certificates, json[QString("certificates")]);
    m_certificates_isSet = !json[QString("certificates")].isNull() && m_certificates_isValid;

    m_box_count_isValid = ::OpenAPI::fromJsonValue(box_count, json[QString("boxCount")]);
    m_box_count_isSet = !json[QString("boxCount")].isNull() && m_box_count_isValid;

    m_condition_isValid = ::OpenAPI::fromJsonValue(condition, json[QString("condition")]);
    m_condition_isSet = !json[QString("condition")].isNull() && m_condition_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_downloadable_isValid = ::OpenAPI::fromJsonValue(downloadable, json[QString("downloadable")]);
    m_downloadable_isSet = !json[QString("downloadable")].isNull() && m_downloadable_isValid;

    m_adult_isValid = ::OpenAPI::fromJsonValue(adult, json[QString("adult")]);
    m_adult_isSet = !json[QString("adult")].isNull() && m_adult_isValid;

    m_age_isValid = ::OpenAPI::fromJsonValue(age, json[QString("age")]);
    m_age_isSet = !json[QString("age")].isNull() && m_age_isValid;

    m_params_isValid = ::OpenAPI::fromJsonValue(params, json[QString("params")]);
    m_params_isSet = !json[QString("params")].isNull() && m_params_isValid;

    m_parameter_values_isValid = ::OpenAPI::fromJsonValue(parameter_values, json[QString("parameterValues")]);
    m_parameter_values_isSet = !json[QString("parameterValues")].isNull() && m_parameter_values_isValid;

    m_basic_price_isValid = ::OpenAPI::fromJsonValue(basic_price, json[QString("basicPrice")]);
    m_basic_price_isSet = !json[QString("basicPrice")].isNull() && m_basic_price_isValid;

    m_purchase_price_isValid = ::OpenAPI::fromJsonValue(purchase_price, json[QString("purchasePrice")]);
    m_purchase_price_isSet = !json[QString("purchasePrice")].isNull() && m_purchase_price_isValid;

    m_additional_expenses_isValid = ::OpenAPI::fromJsonValue(additional_expenses, json[QString("additionalExpenses")]);
    m_additional_expenses_isSet = !json[QString("additionalExpenses")].isNull() && m_additional_expenses_isValid;

    m_cofinance_price_isValid = ::OpenAPI::fromJsonValue(cofinance_price, json[QString("cofinancePrice")]);
    m_cofinance_price_isSet = !json[QString("cofinancePrice")].isNull() && m_cofinance_price_isValid;
}

QString OAIUpdateOfferDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdateOfferDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_offer_id_isSet) {
        obj.insert(QString("offerId"), ::OpenAPI::toJsonValue(offer_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_market_category_id_isSet) {
        obj.insert(QString("marketCategoryId"), ::OpenAPI::toJsonValue(market_category_id));
    }
    if (m_category_isSet) {
        obj.insert(QString("category"), ::OpenAPI::toJsonValue(category));
    }
    if (pictures.size() > 0) {
        obj.insert(QString("pictures"), ::OpenAPI::toJsonValue(pictures));
    }
    if (videos.size() > 0) {
        obj.insert(QString("videos"), ::OpenAPI::toJsonValue(videos));
    }
    if (manuals.size() > 0) {
        obj.insert(QString("manuals"), ::OpenAPI::toJsonValue(manuals));
    }
    if (m_vendor_isSet) {
        obj.insert(QString("vendor"), ::OpenAPI::toJsonValue(vendor));
    }
    if (barcodes.size() > 0) {
        obj.insert(QString("barcodes"), ::OpenAPI::toJsonValue(barcodes));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (manufacturer_countries.size() > 0) {
        obj.insert(QString("manufacturerCountries"), ::OpenAPI::toJsonValue(manufacturer_countries));
    }
    if (weight_dimensions.isSet()) {
        obj.insert(QString("weightDimensions"), ::OpenAPI::toJsonValue(weight_dimensions));
    }
    if (m_vendor_code_isSet) {
        obj.insert(QString("vendorCode"), ::OpenAPI::toJsonValue(vendor_code));
    }
    if (tags.size() > 0) {
        obj.insert(QString("tags"), ::OpenAPI::toJsonValue(tags));
    }
    if (shelf_life.isSet()) {
        obj.insert(QString("shelfLife"), ::OpenAPI::toJsonValue(shelf_life));
    }
    if (life_time.isSet()) {
        obj.insert(QString("lifeTime"), ::OpenAPI::toJsonValue(life_time));
    }
    if (guarantee_period.isSet()) {
        obj.insert(QString("guaranteePeriod"), ::OpenAPI::toJsonValue(guarantee_period));
    }
    if (m_customs_commodity_code_isSet) {
        obj.insert(QString("customsCommodityCode"), ::OpenAPI::toJsonValue(customs_commodity_code));
    }
    if (certificates.size() > 0) {
        obj.insert(QString("certificates"), ::OpenAPI::toJsonValue(certificates));
    }
    if (m_box_count_isSet) {
        obj.insert(QString("boxCount"), ::OpenAPI::toJsonValue(box_count));
    }
    if (condition.isSet()) {
        obj.insert(QString("condition"), ::OpenAPI::toJsonValue(condition));
    }
    if (type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_downloadable_isSet) {
        obj.insert(QString("downloadable"), ::OpenAPI::toJsonValue(downloadable));
    }
    if (m_adult_isSet) {
        obj.insert(QString("adult"), ::OpenAPI::toJsonValue(adult));
    }
    if (age.isSet()) {
        obj.insert(QString("age"), ::OpenAPI::toJsonValue(age));
    }
    if (params.size() > 0) {
        obj.insert(QString("params"), ::OpenAPI::toJsonValue(params));
    }
    if (parameter_values.size() > 0) {
        obj.insert(QString("parameterValues"), ::OpenAPI::toJsonValue(parameter_values));
    }
    if (basic_price.isSet()) {
        obj.insert(QString("basicPrice"), ::OpenAPI::toJsonValue(basic_price));
    }
    if (purchase_price.isSet()) {
        obj.insert(QString("purchasePrice"), ::OpenAPI::toJsonValue(purchase_price));
    }
    if (additional_expenses.isSet()) {
        obj.insert(QString("additionalExpenses"), ::OpenAPI::toJsonValue(additional_expenses));
    }
    if (cofinance_price.isSet()) {
        obj.insert(QString("cofinancePrice"), ::OpenAPI::toJsonValue(cofinance_price));
    }
    return obj;
}

QString OAIUpdateOfferDTO::getOfferId() const {
    return offer_id;
}
void OAIUpdateOfferDTO::setOfferId(const QString &offer_id) {
    this->offer_id = offer_id;
    this->m_offer_id_isSet = true;
}

bool OAIUpdateOfferDTO::is_offer_id_Set() const{
    return m_offer_id_isSet;
}

bool OAIUpdateOfferDTO::is_offer_id_Valid() const{
    return m_offer_id_isValid;
}

QString OAIUpdateOfferDTO::getName() const {
    return name;
}
void OAIUpdateOfferDTO::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIUpdateOfferDTO::is_name_Set() const{
    return m_name_isSet;
}

bool OAIUpdateOfferDTO::is_name_Valid() const{
    return m_name_isValid;
}

qint64 OAIUpdateOfferDTO::getMarketCategoryId() const {
    return market_category_id;
}
void OAIUpdateOfferDTO::setMarketCategoryId(const qint64 &market_category_id) {
    this->market_category_id = market_category_id;
    this->m_market_category_id_isSet = true;
}

bool OAIUpdateOfferDTO::is_market_category_id_Set() const{
    return m_market_category_id_isSet;
}

bool OAIUpdateOfferDTO::is_market_category_id_Valid() const{
    return m_market_category_id_isValid;
}

QString OAIUpdateOfferDTO::getCategory() const {
    return category;
}
void OAIUpdateOfferDTO::setCategory(const QString &category) {
    this->category = category;
    this->m_category_isSet = true;
}

bool OAIUpdateOfferDTO::is_category_Set() const{
    return m_category_isSet;
}

bool OAIUpdateOfferDTO::is_category_Valid() const{
    return m_category_isValid;
}

QList<QString> OAIUpdateOfferDTO::getPictures() const {
    return pictures;
}
void OAIUpdateOfferDTO::setPictures(const QList<QString> &pictures) {
    this->pictures = pictures;
    this->m_pictures_isSet = true;
}

bool OAIUpdateOfferDTO::is_pictures_Set() const{
    return m_pictures_isSet;
}

bool OAIUpdateOfferDTO::is_pictures_Valid() const{
    return m_pictures_isValid;
}

QList<QString> OAIUpdateOfferDTO::getVideos() const {
    return videos;
}
void OAIUpdateOfferDTO::setVideos(const QList<QString> &videos) {
    this->videos = videos;
    this->m_videos_isSet = true;
}

bool OAIUpdateOfferDTO::is_videos_Set() const{
    return m_videos_isSet;
}

bool OAIUpdateOfferDTO::is_videos_Valid() const{
    return m_videos_isValid;
}

QList<OAIOfferManualDTO> OAIUpdateOfferDTO::getManuals() const {
    return manuals;
}
void OAIUpdateOfferDTO::setManuals(const QList<OAIOfferManualDTO> &manuals) {
    this->manuals = manuals;
    this->m_manuals_isSet = true;
}

bool OAIUpdateOfferDTO::is_manuals_Set() const{
    return m_manuals_isSet;
}

bool OAIUpdateOfferDTO::is_manuals_Valid() const{
    return m_manuals_isValid;
}

QString OAIUpdateOfferDTO::getVendor() const {
    return vendor;
}
void OAIUpdateOfferDTO::setVendor(const QString &vendor) {
    this->vendor = vendor;
    this->m_vendor_isSet = true;
}

bool OAIUpdateOfferDTO::is_vendor_Set() const{
    return m_vendor_isSet;
}

bool OAIUpdateOfferDTO::is_vendor_Valid() const{
    return m_vendor_isValid;
}

QList<QString> OAIUpdateOfferDTO::getBarcodes() const {
    return barcodes;
}
void OAIUpdateOfferDTO::setBarcodes(const QList<QString> &barcodes) {
    this->barcodes = barcodes;
    this->m_barcodes_isSet = true;
}

bool OAIUpdateOfferDTO::is_barcodes_Set() const{
    return m_barcodes_isSet;
}

bool OAIUpdateOfferDTO::is_barcodes_Valid() const{
    return m_barcodes_isValid;
}

QString OAIUpdateOfferDTO::getDescription() const {
    return description;
}
void OAIUpdateOfferDTO::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAIUpdateOfferDTO::is_description_Set() const{
    return m_description_isSet;
}

bool OAIUpdateOfferDTO::is_description_Valid() const{
    return m_description_isValid;
}

QList<QString> OAIUpdateOfferDTO::getManufacturerCountries() const {
    return manufacturer_countries;
}
void OAIUpdateOfferDTO::setManufacturerCountries(const QList<QString> &manufacturer_countries) {
    this->manufacturer_countries = manufacturer_countries;
    this->m_manufacturer_countries_isSet = true;
}

bool OAIUpdateOfferDTO::is_manufacturer_countries_Set() const{
    return m_manufacturer_countries_isSet;
}

bool OAIUpdateOfferDTO::is_manufacturer_countries_Valid() const{
    return m_manufacturer_countries_isValid;
}

OAIOfferWeightDimensionsDTO OAIUpdateOfferDTO::getWeightDimensions() const {
    return weight_dimensions;
}
void OAIUpdateOfferDTO::setWeightDimensions(const OAIOfferWeightDimensionsDTO &weight_dimensions) {
    this->weight_dimensions = weight_dimensions;
    this->m_weight_dimensions_isSet = true;
}

bool OAIUpdateOfferDTO::is_weight_dimensions_Set() const{
    return m_weight_dimensions_isSet;
}

bool OAIUpdateOfferDTO::is_weight_dimensions_Valid() const{
    return m_weight_dimensions_isValid;
}

QString OAIUpdateOfferDTO::getVendorCode() const {
    return vendor_code;
}
void OAIUpdateOfferDTO::setVendorCode(const QString &vendor_code) {
    this->vendor_code = vendor_code;
    this->m_vendor_code_isSet = true;
}

bool OAIUpdateOfferDTO::is_vendor_code_Set() const{
    return m_vendor_code_isSet;
}

bool OAIUpdateOfferDTO::is_vendor_code_Valid() const{
    return m_vendor_code_isValid;
}

QList<QString> OAIUpdateOfferDTO::getTags() const {
    return tags;
}
void OAIUpdateOfferDTO::setTags(const QList<QString> &tags) {
    this->tags = tags;
    this->m_tags_isSet = true;
}

bool OAIUpdateOfferDTO::is_tags_Set() const{
    return m_tags_isSet;
}

bool OAIUpdateOfferDTO::is_tags_Valid() const{
    return m_tags_isValid;
}

OAITimePeriodDTO OAIUpdateOfferDTO::getShelfLife() const {
    return shelf_life;
}
void OAIUpdateOfferDTO::setShelfLife(const OAITimePeriodDTO &shelf_life) {
    this->shelf_life = shelf_life;
    this->m_shelf_life_isSet = true;
}

bool OAIUpdateOfferDTO::is_shelf_life_Set() const{
    return m_shelf_life_isSet;
}

bool OAIUpdateOfferDTO::is_shelf_life_Valid() const{
    return m_shelf_life_isValid;
}

OAITimePeriodDTO OAIUpdateOfferDTO::getLifeTime() const {
    return life_time;
}
void OAIUpdateOfferDTO::setLifeTime(const OAITimePeriodDTO &life_time) {
    this->life_time = life_time;
    this->m_life_time_isSet = true;
}

bool OAIUpdateOfferDTO::is_life_time_Set() const{
    return m_life_time_isSet;
}

bool OAIUpdateOfferDTO::is_life_time_Valid() const{
    return m_life_time_isValid;
}

OAITimePeriodDTO OAIUpdateOfferDTO::getGuaranteePeriod() const {
    return guarantee_period;
}
void OAIUpdateOfferDTO::setGuaranteePeriod(const OAITimePeriodDTO &guarantee_period) {
    this->guarantee_period = guarantee_period;
    this->m_guarantee_period_isSet = true;
}

bool OAIUpdateOfferDTO::is_guarantee_period_Set() const{
    return m_guarantee_period_isSet;
}

bool OAIUpdateOfferDTO::is_guarantee_period_Valid() const{
    return m_guarantee_period_isValid;
}

QString OAIUpdateOfferDTO::getCustomsCommodityCode() const {
    return customs_commodity_code;
}
void OAIUpdateOfferDTO::setCustomsCommodityCode(const QString &customs_commodity_code) {
    this->customs_commodity_code = customs_commodity_code;
    this->m_customs_commodity_code_isSet = true;
}

bool OAIUpdateOfferDTO::is_customs_commodity_code_Set() const{
    return m_customs_commodity_code_isSet;
}

bool OAIUpdateOfferDTO::is_customs_commodity_code_Valid() const{
    return m_customs_commodity_code_isValid;
}

QList<QString> OAIUpdateOfferDTO::getCertificates() const {
    return certificates;
}
void OAIUpdateOfferDTO::setCertificates(const QList<QString> &certificates) {
    this->certificates = certificates;
    this->m_certificates_isSet = true;
}

bool OAIUpdateOfferDTO::is_certificates_Set() const{
    return m_certificates_isSet;
}

bool OAIUpdateOfferDTO::is_certificates_Valid() const{
    return m_certificates_isValid;
}

qint32 OAIUpdateOfferDTO::getBoxCount() const {
    return box_count;
}
void OAIUpdateOfferDTO::setBoxCount(const qint32 &box_count) {
    this->box_count = box_count;
    this->m_box_count_isSet = true;
}

bool OAIUpdateOfferDTO::is_box_count_Set() const{
    return m_box_count_isSet;
}

bool OAIUpdateOfferDTO::is_box_count_Valid() const{
    return m_box_count_isValid;
}

OAIOfferConditionDTO OAIUpdateOfferDTO::getCondition() const {
    return condition;
}
void OAIUpdateOfferDTO::setCondition(const OAIOfferConditionDTO &condition) {
    this->condition = condition;
    this->m_condition_isSet = true;
}

bool OAIUpdateOfferDTO::is_condition_Set() const{
    return m_condition_isSet;
}

bool OAIUpdateOfferDTO::is_condition_Valid() const{
    return m_condition_isValid;
}

OAIOfferType OAIUpdateOfferDTO::getType() const {
    return type;
}
void OAIUpdateOfferDTO::setType(const OAIOfferType &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIUpdateOfferDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIUpdateOfferDTO::is_type_Valid() const{
    return m_type_isValid;
}

bool OAIUpdateOfferDTO::isDownloadable() const {
    return downloadable;
}
void OAIUpdateOfferDTO::setDownloadable(const bool &downloadable) {
    this->downloadable = downloadable;
    this->m_downloadable_isSet = true;
}

bool OAIUpdateOfferDTO::is_downloadable_Set() const{
    return m_downloadable_isSet;
}

bool OAIUpdateOfferDTO::is_downloadable_Valid() const{
    return m_downloadable_isValid;
}

bool OAIUpdateOfferDTO::isAdult() const {
    return adult;
}
void OAIUpdateOfferDTO::setAdult(const bool &adult) {
    this->adult = adult;
    this->m_adult_isSet = true;
}

bool OAIUpdateOfferDTO::is_adult_Set() const{
    return m_adult_isSet;
}

bool OAIUpdateOfferDTO::is_adult_Valid() const{
    return m_adult_isValid;
}

OAIAgeDTO OAIUpdateOfferDTO::getAge() const {
    return age;
}
void OAIUpdateOfferDTO::setAge(const OAIAgeDTO &age) {
    this->age = age;
    this->m_age_isSet = true;
}

bool OAIUpdateOfferDTO::is_age_Set() const{
    return m_age_isSet;
}

bool OAIUpdateOfferDTO::is_age_Valid() const{
    return m_age_isValid;
}

QList<OAIOfferParamDTO> OAIUpdateOfferDTO::getParams() const {
    return params;
}
void OAIUpdateOfferDTO::setParams(const QList<OAIOfferParamDTO> &params) {
    this->params = params;
    this->m_params_isSet = true;
}

bool OAIUpdateOfferDTO::is_params_Set() const{
    return m_params_isSet;
}

bool OAIUpdateOfferDTO::is_params_Valid() const{
    return m_params_isValid;
}

QList<OAIParameterValueDTO> OAIUpdateOfferDTO::getParameterValues() const {
    return parameter_values;
}
void OAIUpdateOfferDTO::setParameterValues(const QList<OAIParameterValueDTO> &parameter_values) {
    this->parameter_values = parameter_values;
    this->m_parameter_values_isSet = true;
}

bool OAIUpdateOfferDTO::is_parameter_values_Set() const{
    return m_parameter_values_isSet;
}

bool OAIUpdateOfferDTO::is_parameter_values_Valid() const{
    return m_parameter_values_isValid;
}

OAIUpdatePriceWithDiscountDTO OAIUpdateOfferDTO::getBasicPrice() const {
    return basic_price;
}
void OAIUpdateOfferDTO::setBasicPrice(const OAIUpdatePriceWithDiscountDTO &basic_price) {
    this->basic_price = basic_price;
    this->m_basic_price_isSet = true;
}

bool OAIUpdateOfferDTO::is_basic_price_Set() const{
    return m_basic_price_isSet;
}

bool OAIUpdateOfferDTO::is_basic_price_Valid() const{
    return m_basic_price_isValid;
}

OAIBasePriceDTO OAIUpdateOfferDTO::getPurchasePrice() const {
    return purchase_price;
}
void OAIUpdateOfferDTO::setPurchasePrice(const OAIBasePriceDTO &purchase_price) {
    this->purchase_price = purchase_price;
    this->m_purchase_price_isSet = true;
}

bool OAIUpdateOfferDTO::is_purchase_price_Set() const{
    return m_purchase_price_isSet;
}

bool OAIUpdateOfferDTO::is_purchase_price_Valid() const{
    return m_purchase_price_isValid;
}

OAIBasePriceDTO OAIUpdateOfferDTO::getAdditionalExpenses() const {
    return additional_expenses;
}
void OAIUpdateOfferDTO::setAdditionalExpenses(const OAIBasePriceDTO &additional_expenses) {
    this->additional_expenses = additional_expenses;
    this->m_additional_expenses_isSet = true;
}

bool OAIUpdateOfferDTO::is_additional_expenses_Set() const{
    return m_additional_expenses_isSet;
}

bool OAIUpdateOfferDTO::is_additional_expenses_Valid() const{
    return m_additional_expenses_isValid;
}

OAIBasePriceDTO OAIUpdateOfferDTO::getCofinancePrice() const {
    return cofinance_price;
}
void OAIUpdateOfferDTO::setCofinancePrice(const OAIBasePriceDTO &cofinance_price) {
    this->cofinance_price = cofinance_price;
    this->m_cofinance_price_isSet = true;
}

bool OAIUpdateOfferDTO::is_cofinance_price_Set() const{
    return m_cofinance_price_isSet;
}

bool OAIUpdateOfferDTO::is_cofinance_price_Valid() const{
    return m_cofinance_price_isValid;
}

bool OAIUpdateOfferDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_offer_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_market_category_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_category_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (pictures.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (videos.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (manuals.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_vendor_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (barcodes.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (manufacturer_countries.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (weight_dimensions.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_vendor_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (tags.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (shelf_life.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (life_time.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (guarantee_period.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_customs_commodity_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (certificates.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_box_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (condition.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_downloadable_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_adult_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (age.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (params.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (parameter_values.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (basic_price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (purchase_price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (additional_expenses.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (cofinance_price.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdateOfferDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offer_id_isValid && true;
}

} // namespace OpenAPI
