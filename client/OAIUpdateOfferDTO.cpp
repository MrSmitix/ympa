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

    m_offer_id_isValid = ::OpenAPI::fromJsonValue(m_offer_id, json[QString("offerId")]);
    m_offer_id_isSet = !json[QString("offerId")].isNull() && m_offer_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_market_category_id_isValid = ::OpenAPI::fromJsonValue(m_market_category_id, json[QString("marketCategoryId")]);
    m_market_category_id_isSet = !json[QString("marketCategoryId")].isNull() && m_market_category_id_isValid;

    m_category_isValid = ::OpenAPI::fromJsonValue(m_category, json[QString("category")]);
    m_category_isSet = !json[QString("category")].isNull() && m_category_isValid;

    m_pictures_isValid = ::OpenAPI::fromJsonValue(m_pictures, json[QString("pictures")]);
    m_pictures_isSet = !json[QString("pictures")].isNull() && m_pictures_isValid;

    m_videos_isValid = ::OpenAPI::fromJsonValue(m_videos, json[QString("videos")]);
    m_videos_isSet = !json[QString("videos")].isNull() && m_videos_isValid;

    m_manuals_isValid = ::OpenAPI::fromJsonValue(m_manuals, json[QString("manuals")]);
    m_manuals_isSet = !json[QString("manuals")].isNull() && m_manuals_isValid;

    m_vendor_isValid = ::OpenAPI::fromJsonValue(m_vendor, json[QString("vendor")]);
    m_vendor_isSet = !json[QString("vendor")].isNull() && m_vendor_isValid;

    m_barcodes_isValid = ::OpenAPI::fromJsonValue(m_barcodes, json[QString("barcodes")]);
    m_barcodes_isSet = !json[QString("barcodes")].isNull() && m_barcodes_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(m_description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_manufacturer_countries_isValid = ::OpenAPI::fromJsonValue(m_manufacturer_countries, json[QString("manufacturerCountries")]);
    m_manufacturer_countries_isSet = !json[QString("manufacturerCountries")].isNull() && m_manufacturer_countries_isValid;

    m_weight_dimensions_isValid = ::OpenAPI::fromJsonValue(m_weight_dimensions, json[QString("weightDimensions")]);
    m_weight_dimensions_isSet = !json[QString("weightDimensions")].isNull() && m_weight_dimensions_isValid;

    m_vendor_code_isValid = ::OpenAPI::fromJsonValue(m_vendor_code, json[QString("vendorCode")]);
    m_vendor_code_isSet = !json[QString("vendorCode")].isNull() && m_vendor_code_isValid;

    m_tags_isValid = ::OpenAPI::fromJsonValue(m_tags, json[QString("tags")]);
    m_tags_isSet = !json[QString("tags")].isNull() && m_tags_isValid;

    m_shelf_life_isValid = ::OpenAPI::fromJsonValue(m_shelf_life, json[QString("shelfLife")]);
    m_shelf_life_isSet = !json[QString("shelfLife")].isNull() && m_shelf_life_isValid;

    m_life_time_isValid = ::OpenAPI::fromJsonValue(m_life_time, json[QString("lifeTime")]);
    m_life_time_isSet = !json[QString("lifeTime")].isNull() && m_life_time_isValid;

    m_guarantee_period_isValid = ::OpenAPI::fromJsonValue(m_guarantee_period, json[QString("guaranteePeriod")]);
    m_guarantee_period_isSet = !json[QString("guaranteePeriod")].isNull() && m_guarantee_period_isValid;

    m_customs_commodity_code_isValid = ::OpenAPI::fromJsonValue(m_customs_commodity_code, json[QString("customsCommodityCode")]);
    m_customs_commodity_code_isSet = !json[QString("customsCommodityCode")].isNull() && m_customs_commodity_code_isValid;

    m_certificates_isValid = ::OpenAPI::fromJsonValue(m_certificates, json[QString("certificates")]);
    m_certificates_isSet = !json[QString("certificates")].isNull() && m_certificates_isValid;

    m_box_count_isValid = ::OpenAPI::fromJsonValue(m_box_count, json[QString("boxCount")]);
    m_box_count_isSet = !json[QString("boxCount")].isNull() && m_box_count_isValid;

    m_condition_isValid = ::OpenAPI::fromJsonValue(m_condition, json[QString("condition")]);
    m_condition_isSet = !json[QString("condition")].isNull() && m_condition_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_downloadable_isValid = ::OpenAPI::fromJsonValue(m_downloadable, json[QString("downloadable")]);
    m_downloadable_isSet = !json[QString("downloadable")].isNull() && m_downloadable_isValid;

    m_adult_isValid = ::OpenAPI::fromJsonValue(m_adult, json[QString("adult")]);
    m_adult_isSet = !json[QString("adult")].isNull() && m_adult_isValid;

    m_age_isValid = ::OpenAPI::fromJsonValue(m_age, json[QString("age")]);
    m_age_isSet = !json[QString("age")].isNull() && m_age_isValid;

    m_params_isValid = ::OpenAPI::fromJsonValue(m_params, json[QString("params")]);
    m_params_isSet = !json[QString("params")].isNull() && m_params_isValid;

    m_parameter_values_isValid = ::OpenAPI::fromJsonValue(m_parameter_values, json[QString("parameterValues")]);
    m_parameter_values_isSet = !json[QString("parameterValues")].isNull() && m_parameter_values_isValid;

    m_basic_price_isValid = ::OpenAPI::fromJsonValue(m_basic_price, json[QString("basicPrice")]);
    m_basic_price_isSet = !json[QString("basicPrice")].isNull() && m_basic_price_isValid;

    m_purchase_price_isValid = ::OpenAPI::fromJsonValue(m_purchase_price, json[QString("purchasePrice")]);
    m_purchase_price_isSet = !json[QString("purchasePrice")].isNull() && m_purchase_price_isValid;

    m_additional_expenses_isValid = ::OpenAPI::fromJsonValue(m_additional_expenses, json[QString("additionalExpenses")]);
    m_additional_expenses_isSet = !json[QString("additionalExpenses")].isNull() && m_additional_expenses_isValid;

    m_cofinance_price_isValid = ::OpenAPI::fromJsonValue(m_cofinance_price, json[QString("cofinancePrice")]);
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
        obj.insert(QString("offerId"), ::OpenAPI::toJsonValue(m_offer_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    if (m_market_category_id_isSet) {
        obj.insert(QString("marketCategoryId"), ::OpenAPI::toJsonValue(m_market_category_id));
    }
    if (m_category_isSet) {
        obj.insert(QString("category"), ::OpenAPI::toJsonValue(m_category));
    }
    if (m_pictures.size() > 0) {
        obj.insert(QString("pictures"), ::OpenAPI::toJsonValue(m_pictures));
    }
    if (m_videos.size() > 0) {
        obj.insert(QString("videos"), ::OpenAPI::toJsonValue(m_videos));
    }
    if (m_manuals.size() > 0) {
        obj.insert(QString("manuals"), ::OpenAPI::toJsonValue(m_manuals));
    }
    if (m_vendor_isSet) {
        obj.insert(QString("vendor"), ::OpenAPI::toJsonValue(m_vendor));
    }
    if (m_barcodes.size() > 0) {
        obj.insert(QString("barcodes"), ::OpenAPI::toJsonValue(m_barcodes));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(m_description));
    }
    if (m_manufacturer_countries.size() > 0) {
        obj.insert(QString("manufacturerCountries"), ::OpenAPI::toJsonValue(m_manufacturer_countries));
    }
    if (m_weight_dimensions.isSet()) {
        obj.insert(QString("weightDimensions"), ::OpenAPI::toJsonValue(m_weight_dimensions));
    }
    if (m_vendor_code_isSet) {
        obj.insert(QString("vendorCode"), ::OpenAPI::toJsonValue(m_vendor_code));
    }
    if (m_tags.size() > 0) {
        obj.insert(QString("tags"), ::OpenAPI::toJsonValue(m_tags));
    }
    if (m_shelf_life.isSet()) {
        obj.insert(QString("shelfLife"), ::OpenAPI::toJsonValue(m_shelf_life));
    }
    if (m_life_time.isSet()) {
        obj.insert(QString("lifeTime"), ::OpenAPI::toJsonValue(m_life_time));
    }
    if (m_guarantee_period.isSet()) {
        obj.insert(QString("guaranteePeriod"), ::OpenAPI::toJsonValue(m_guarantee_period));
    }
    if (m_customs_commodity_code_isSet) {
        obj.insert(QString("customsCommodityCode"), ::OpenAPI::toJsonValue(m_customs_commodity_code));
    }
    if (m_certificates.size() > 0) {
        obj.insert(QString("certificates"), ::OpenAPI::toJsonValue(m_certificates));
    }
    if (m_box_count_isSet) {
        obj.insert(QString("boxCount"), ::OpenAPI::toJsonValue(m_box_count));
    }
    if (m_condition.isSet()) {
        obj.insert(QString("condition"), ::OpenAPI::toJsonValue(m_condition));
    }
    if (m_type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_downloadable_isSet) {
        obj.insert(QString("downloadable"), ::OpenAPI::toJsonValue(m_downloadable));
    }
    if (m_adult_isSet) {
        obj.insert(QString("adult"), ::OpenAPI::toJsonValue(m_adult));
    }
    if (m_age.isSet()) {
        obj.insert(QString("age"), ::OpenAPI::toJsonValue(m_age));
    }
    if (m_params.size() > 0) {
        obj.insert(QString("params"), ::OpenAPI::toJsonValue(m_params));
    }
    if (m_parameter_values.size() > 0) {
        obj.insert(QString("parameterValues"), ::OpenAPI::toJsonValue(m_parameter_values));
    }
    if (m_basic_price.isSet()) {
        obj.insert(QString("basicPrice"), ::OpenAPI::toJsonValue(m_basic_price));
    }
    if (m_purchase_price.isSet()) {
        obj.insert(QString("purchasePrice"), ::OpenAPI::toJsonValue(m_purchase_price));
    }
    if (m_additional_expenses.isSet()) {
        obj.insert(QString("additionalExpenses"), ::OpenAPI::toJsonValue(m_additional_expenses));
    }
    if (m_cofinance_price.isSet()) {
        obj.insert(QString("cofinancePrice"), ::OpenAPI::toJsonValue(m_cofinance_price));
    }
    return obj;
}

QString OAIUpdateOfferDTO::getOfferId() const {
    return m_offer_id;
}
void OAIUpdateOfferDTO::setOfferId(const QString &offer_id) {
    m_offer_id = offer_id;
    m_offer_id_isSet = true;
}

bool OAIUpdateOfferDTO::is_offer_id_Set() const{
    return m_offer_id_isSet;
}

bool OAIUpdateOfferDTO::is_offer_id_Valid() const{
    return m_offer_id_isValid;
}

QString OAIUpdateOfferDTO::getName() const {
    return m_name;
}
void OAIUpdateOfferDTO::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAIUpdateOfferDTO::is_name_Set() const{
    return m_name_isSet;
}

bool OAIUpdateOfferDTO::is_name_Valid() const{
    return m_name_isValid;
}

qint64 OAIUpdateOfferDTO::getMarketCategoryId() const {
    return m_market_category_id;
}
void OAIUpdateOfferDTO::setMarketCategoryId(const qint64 &market_category_id) {
    m_market_category_id = market_category_id;
    m_market_category_id_isSet = true;
}

bool OAIUpdateOfferDTO::is_market_category_id_Set() const{
    return m_market_category_id_isSet;
}

bool OAIUpdateOfferDTO::is_market_category_id_Valid() const{
    return m_market_category_id_isValid;
}

QString OAIUpdateOfferDTO::getCategory() const {
    return m_category;
}
void OAIUpdateOfferDTO::setCategory(const QString &category) {
    m_category = category;
    m_category_isSet = true;
}

bool OAIUpdateOfferDTO::is_category_Set() const{
    return m_category_isSet;
}

bool OAIUpdateOfferDTO::is_category_Valid() const{
    return m_category_isValid;
}

QList<QString> OAIUpdateOfferDTO::getPictures() const {
    return m_pictures;
}
void OAIUpdateOfferDTO::setPictures(const QList<QString> &pictures) {
    m_pictures = pictures;
    m_pictures_isSet = true;
}

bool OAIUpdateOfferDTO::is_pictures_Set() const{
    return m_pictures_isSet;
}

bool OAIUpdateOfferDTO::is_pictures_Valid() const{
    return m_pictures_isValid;
}

QList<QString> OAIUpdateOfferDTO::getVideos() const {
    return m_videos;
}
void OAIUpdateOfferDTO::setVideos(const QList<QString> &videos) {
    m_videos = videos;
    m_videos_isSet = true;
}

bool OAIUpdateOfferDTO::is_videos_Set() const{
    return m_videos_isSet;
}

bool OAIUpdateOfferDTO::is_videos_Valid() const{
    return m_videos_isValid;
}

QList<OAIOfferManualDTO> OAIUpdateOfferDTO::getManuals() const {
    return m_manuals;
}
void OAIUpdateOfferDTO::setManuals(const QList<OAIOfferManualDTO> &manuals) {
    m_manuals = manuals;
    m_manuals_isSet = true;
}

bool OAIUpdateOfferDTO::is_manuals_Set() const{
    return m_manuals_isSet;
}

bool OAIUpdateOfferDTO::is_manuals_Valid() const{
    return m_manuals_isValid;
}

QString OAIUpdateOfferDTO::getVendor() const {
    return m_vendor;
}
void OAIUpdateOfferDTO::setVendor(const QString &vendor) {
    m_vendor = vendor;
    m_vendor_isSet = true;
}

bool OAIUpdateOfferDTO::is_vendor_Set() const{
    return m_vendor_isSet;
}

bool OAIUpdateOfferDTO::is_vendor_Valid() const{
    return m_vendor_isValid;
}

QList<QString> OAIUpdateOfferDTO::getBarcodes() const {
    return m_barcodes;
}
void OAIUpdateOfferDTO::setBarcodes(const QList<QString> &barcodes) {
    m_barcodes = barcodes;
    m_barcodes_isSet = true;
}

bool OAIUpdateOfferDTO::is_barcodes_Set() const{
    return m_barcodes_isSet;
}

bool OAIUpdateOfferDTO::is_barcodes_Valid() const{
    return m_barcodes_isValid;
}

QString OAIUpdateOfferDTO::getDescription() const {
    return m_description;
}
void OAIUpdateOfferDTO::setDescription(const QString &description) {
    m_description = description;
    m_description_isSet = true;
}

bool OAIUpdateOfferDTO::is_description_Set() const{
    return m_description_isSet;
}

bool OAIUpdateOfferDTO::is_description_Valid() const{
    return m_description_isValid;
}

QList<QString> OAIUpdateOfferDTO::getManufacturerCountries() const {
    return m_manufacturer_countries;
}
void OAIUpdateOfferDTO::setManufacturerCountries(const QList<QString> &manufacturer_countries) {
    m_manufacturer_countries = manufacturer_countries;
    m_manufacturer_countries_isSet = true;
}

bool OAIUpdateOfferDTO::is_manufacturer_countries_Set() const{
    return m_manufacturer_countries_isSet;
}

bool OAIUpdateOfferDTO::is_manufacturer_countries_Valid() const{
    return m_manufacturer_countries_isValid;
}

OAIOfferWeightDimensionsDTO OAIUpdateOfferDTO::getWeightDimensions() const {
    return m_weight_dimensions;
}
void OAIUpdateOfferDTO::setWeightDimensions(const OAIOfferWeightDimensionsDTO &weight_dimensions) {
    m_weight_dimensions = weight_dimensions;
    m_weight_dimensions_isSet = true;
}

bool OAIUpdateOfferDTO::is_weight_dimensions_Set() const{
    return m_weight_dimensions_isSet;
}

bool OAIUpdateOfferDTO::is_weight_dimensions_Valid() const{
    return m_weight_dimensions_isValid;
}

QString OAIUpdateOfferDTO::getVendorCode() const {
    return m_vendor_code;
}
void OAIUpdateOfferDTO::setVendorCode(const QString &vendor_code) {
    m_vendor_code = vendor_code;
    m_vendor_code_isSet = true;
}

bool OAIUpdateOfferDTO::is_vendor_code_Set() const{
    return m_vendor_code_isSet;
}

bool OAIUpdateOfferDTO::is_vendor_code_Valid() const{
    return m_vendor_code_isValid;
}

QList<QString> OAIUpdateOfferDTO::getTags() const {
    return m_tags;
}
void OAIUpdateOfferDTO::setTags(const QList<QString> &tags) {
    m_tags = tags;
    m_tags_isSet = true;
}

bool OAIUpdateOfferDTO::is_tags_Set() const{
    return m_tags_isSet;
}

bool OAIUpdateOfferDTO::is_tags_Valid() const{
    return m_tags_isValid;
}

OAITimePeriodDTO OAIUpdateOfferDTO::getShelfLife() const {
    return m_shelf_life;
}
void OAIUpdateOfferDTO::setShelfLife(const OAITimePeriodDTO &shelf_life) {
    m_shelf_life = shelf_life;
    m_shelf_life_isSet = true;
}

bool OAIUpdateOfferDTO::is_shelf_life_Set() const{
    return m_shelf_life_isSet;
}

bool OAIUpdateOfferDTO::is_shelf_life_Valid() const{
    return m_shelf_life_isValid;
}

OAITimePeriodDTO OAIUpdateOfferDTO::getLifeTime() const {
    return m_life_time;
}
void OAIUpdateOfferDTO::setLifeTime(const OAITimePeriodDTO &life_time) {
    m_life_time = life_time;
    m_life_time_isSet = true;
}

bool OAIUpdateOfferDTO::is_life_time_Set() const{
    return m_life_time_isSet;
}

bool OAIUpdateOfferDTO::is_life_time_Valid() const{
    return m_life_time_isValid;
}

OAITimePeriodDTO OAIUpdateOfferDTO::getGuaranteePeriod() const {
    return m_guarantee_period;
}
void OAIUpdateOfferDTO::setGuaranteePeriod(const OAITimePeriodDTO &guarantee_period) {
    m_guarantee_period = guarantee_period;
    m_guarantee_period_isSet = true;
}

bool OAIUpdateOfferDTO::is_guarantee_period_Set() const{
    return m_guarantee_period_isSet;
}

bool OAIUpdateOfferDTO::is_guarantee_period_Valid() const{
    return m_guarantee_period_isValid;
}

QString OAIUpdateOfferDTO::getCustomsCommodityCode() const {
    return m_customs_commodity_code;
}
void OAIUpdateOfferDTO::setCustomsCommodityCode(const QString &customs_commodity_code) {
    m_customs_commodity_code = customs_commodity_code;
    m_customs_commodity_code_isSet = true;
}

bool OAIUpdateOfferDTO::is_customs_commodity_code_Set() const{
    return m_customs_commodity_code_isSet;
}

bool OAIUpdateOfferDTO::is_customs_commodity_code_Valid() const{
    return m_customs_commodity_code_isValid;
}

QList<QString> OAIUpdateOfferDTO::getCertificates() const {
    return m_certificates;
}
void OAIUpdateOfferDTO::setCertificates(const QList<QString> &certificates) {
    m_certificates = certificates;
    m_certificates_isSet = true;
}

bool OAIUpdateOfferDTO::is_certificates_Set() const{
    return m_certificates_isSet;
}

bool OAIUpdateOfferDTO::is_certificates_Valid() const{
    return m_certificates_isValid;
}

qint32 OAIUpdateOfferDTO::getBoxCount() const {
    return m_box_count;
}
void OAIUpdateOfferDTO::setBoxCount(const qint32 &box_count) {
    m_box_count = box_count;
    m_box_count_isSet = true;
}

bool OAIUpdateOfferDTO::is_box_count_Set() const{
    return m_box_count_isSet;
}

bool OAIUpdateOfferDTO::is_box_count_Valid() const{
    return m_box_count_isValid;
}

OAIOfferConditionDTO OAIUpdateOfferDTO::getCondition() const {
    return m_condition;
}
void OAIUpdateOfferDTO::setCondition(const OAIOfferConditionDTO &condition) {
    m_condition = condition;
    m_condition_isSet = true;
}

bool OAIUpdateOfferDTO::is_condition_Set() const{
    return m_condition_isSet;
}

bool OAIUpdateOfferDTO::is_condition_Valid() const{
    return m_condition_isValid;
}

OAIOfferType OAIUpdateOfferDTO::getType() const {
    return m_type;
}
void OAIUpdateOfferDTO::setType(const OAIOfferType &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIUpdateOfferDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIUpdateOfferDTO::is_type_Valid() const{
    return m_type_isValid;
}

bool OAIUpdateOfferDTO::isDownloadable() const {
    return m_downloadable;
}
void OAIUpdateOfferDTO::setDownloadable(const bool &downloadable) {
    m_downloadable = downloadable;
    m_downloadable_isSet = true;
}

bool OAIUpdateOfferDTO::is_downloadable_Set() const{
    return m_downloadable_isSet;
}

bool OAIUpdateOfferDTO::is_downloadable_Valid() const{
    return m_downloadable_isValid;
}

bool OAIUpdateOfferDTO::isAdult() const {
    return m_adult;
}
void OAIUpdateOfferDTO::setAdult(const bool &adult) {
    m_adult = adult;
    m_adult_isSet = true;
}

bool OAIUpdateOfferDTO::is_adult_Set() const{
    return m_adult_isSet;
}

bool OAIUpdateOfferDTO::is_adult_Valid() const{
    return m_adult_isValid;
}

OAIAgeDTO OAIUpdateOfferDTO::getAge() const {
    return m_age;
}
void OAIUpdateOfferDTO::setAge(const OAIAgeDTO &age) {
    m_age = age;
    m_age_isSet = true;
}

bool OAIUpdateOfferDTO::is_age_Set() const{
    return m_age_isSet;
}

bool OAIUpdateOfferDTO::is_age_Valid() const{
    return m_age_isValid;
}

QList<OAIOfferParamDTO> OAIUpdateOfferDTO::getParams() const {
    return m_params;
}
void OAIUpdateOfferDTO::setParams(const QList<OAIOfferParamDTO> &params) {
    m_params = params;
    m_params_isSet = true;
}

bool OAIUpdateOfferDTO::is_params_Set() const{
    return m_params_isSet;
}

bool OAIUpdateOfferDTO::is_params_Valid() const{
    return m_params_isValid;
}

QList<OAIParameterValueDTO> OAIUpdateOfferDTO::getParameterValues() const {
    return m_parameter_values;
}
void OAIUpdateOfferDTO::setParameterValues(const QList<OAIParameterValueDTO> &parameter_values) {
    m_parameter_values = parameter_values;
    m_parameter_values_isSet = true;
}

bool OAIUpdateOfferDTO::is_parameter_values_Set() const{
    return m_parameter_values_isSet;
}

bool OAIUpdateOfferDTO::is_parameter_values_Valid() const{
    return m_parameter_values_isValid;
}

OAIUpdatePriceWithDiscountDTO OAIUpdateOfferDTO::getBasicPrice() const {
    return m_basic_price;
}
void OAIUpdateOfferDTO::setBasicPrice(const OAIUpdatePriceWithDiscountDTO &basic_price) {
    m_basic_price = basic_price;
    m_basic_price_isSet = true;
}

bool OAIUpdateOfferDTO::is_basic_price_Set() const{
    return m_basic_price_isSet;
}

bool OAIUpdateOfferDTO::is_basic_price_Valid() const{
    return m_basic_price_isValid;
}

OAIBasePriceDTO OAIUpdateOfferDTO::getPurchasePrice() const {
    return m_purchase_price;
}
void OAIUpdateOfferDTO::setPurchasePrice(const OAIBasePriceDTO &purchase_price) {
    m_purchase_price = purchase_price;
    m_purchase_price_isSet = true;
}

bool OAIUpdateOfferDTO::is_purchase_price_Set() const{
    return m_purchase_price_isSet;
}

bool OAIUpdateOfferDTO::is_purchase_price_Valid() const{
    return m_purchase_price_isValid;
}

OAIBasePriceDTO OAIUpdateOfferDTO::getAdditionalExpenses() const {
    return m_additional_expenses;
}
void OAIUpdateOfferDTO::setAdditionalExpenses(const OAIBasePriceDTO &additional_expenses) {
    m_additional_expenses = additional_expenses;
    m_additional_expenses_isSet = true;
}

bool OAIUpdateOfferDTO::is_additional_expenses_Set() const{
    return m_additional_expenses_isSet;
}

bool OAIUpdateOfferDTO::is_additional_expenses_Valid() const{
    return m_additional_expenses_isValid;
}

OAIBasePriceDTO OAIUpdateOfferDTO::getCofinancePrice() const {
    return m_cofinance_price;
}
void OAIUpdateOfferDTO::setCofinancePrice(const OAIBasePriceDTO &cofinance_price) {
    m_cofinance_price = cofinance_price;
    m_cofinance_price_isSet = true;
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

        if (m_pictures.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_videos.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_manuals.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_vendor_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_barcodes.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_manufacturer_countries.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_weight_dimensions.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_vendor_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_tags.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_shelf_life.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_life_time.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_guarantee_period.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_customs_commodity_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_certificates.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_box_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_condition.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_type.isSet()) {
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

        if (m_age.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_params.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_parameter_values.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_basic_price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_purchase_price.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_additional_expenses.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_cofinance_price.isSet()) {
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
