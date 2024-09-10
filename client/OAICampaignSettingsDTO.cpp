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

#include "OAICampaignSettingsDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICampaignSettingsDTO::OAICampaignSettingsDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICampaignSettingsDTO::OAICampaignSettingsDTO() {
    this->initializeModel();
}

OAICampaignSettingsDTO::~OAICampaignSettingsDTO() {}

void OAICampaignSettingsDTO::initializeModel() {

    m_country_region_isSet = false;
    m_country_region_isValid = false;

    m_shop_name_isSet = false;
    m_shop_name_isValid = false;

    m_show_in_context_isSet = false;
    m_show_in_context_isValid = false;

    m_show_in_premium_isSet = false;
    m_show_in_premium_isValid = false;

    m_use_open_stat_isSet = false;
    m_use_open_stat_isValid = false;

    m_local_region_isSet = false;
    m_local_region_isValid = false;
}

void OAICampaignSettingsDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICampaignSettingsDTO::fromJsonObject(QJsonObject json) {

    m_country_region_isValid = ::OpenAPI::fromJsonValue(m_country_region, json[QString("countryRegion")]);
    m_country_region_isSet = !json[QString("countryRegion")].isNull() && m_country_region_isValid;

    m_shop_name_isValid = ::OpenAPI::fromJsonValue(m_shop_name, json[QString("shopName")]);
    m_shop_name_isSet = !json[QString("shopName")].isNull() && m_shop_name_isValid;

    m_show_in_context_isValid = ::OpenAPI::fromJsonValue(m_show_in_context, json[QString("showInContext")]);
    m_show_in_context_isSet = !json[QString("showInContext")].isNull() && m_show_in_context_isValid;

    m_show_in_premium_isValid = ::OpenAPI::fromJsonValue(m_show_in_premium, json[QString("showInPremium")]);
    m_show_in_premium_isSet = !json[QString("showInPremium")].isNull() && m_show_in_premium_isValid;

    m_use_open_stat_isValid = ::OpenAPI::fromJsonValue(m_use_open_stat, json[QString("useOpenStat")]);
    m_use_open_stat_isSet = !json[QString("useOpenStat")].isNull() && m_use_open_stat_isValid;

    m_local_region_isValid = ::OpenAPI::fromJsonValue(m_local_region, json[QString("localRegion")]);
    m_local_region_isSet = !json[QString("localRegion")].isNull() && m_local_region_isValid;
}

QString OAICampaignSettingsDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICampaignSettingsDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_country_region_isSet) {
        obj.insert(QString("countryRegion"), ::OpenAPI::toJsonValue(m_country_region));
    }
    if (m_shop_name_isSet) {
        obj.insert(QString("shopName"), ::OpenAPI::toJsonValue(m_shop_name));
    }
    if (m_show_in_context_isSet) {
        obj.insert(QString("showInContext"), ::OpenAPI::toJsonValue(m_show_in_context));
    }
    if (m_show_in_premium_isSet) {
        obj.insert(QString("showInPremium"), ::OpenAPI::toJsonValue(m_show_in_premium));
    }
    if (m_use_open_stat_isSet) {
        obj.insert(QString("useOpenStat"), ::OpenAPI::toJsonValue(m_use_open_stat));
    }
    if (m_local_region.isSet()) {
        obj.insert(QString("localRegion"), ::OpenAPI::toJsonValue(m_local_region));
    }
    return obj;
}

qint64 OAICampaignSettingsDTO::getCountryRegion() const {
    return m_country_region;
}
void OAICampaignSettingsDTO::setCountryRegion(const qint64 &country_region) {
    m_country_region = country_region;
    m_country_region_isSet = true;
}

bool OAICampaignSettingsDTO::is_country_region_Set() const{
    return m_country_region_isSet;
}

bool OAICampaignSettingsDTO::is_country_region_Valid() const{
    return m_country_region_isValid;
}

QString OAICampaignSettingsDTO::getShopName() const {
    return m_shop_name;
}
void OAICampaignSettingsDTO::setShopName(const QString &shop_name) {
    m_shop_name = shop_name;
    m_shop_name_isSet = true;
}

bool OAICampaignSettingsDTO::is_shop_name_Set() const{
    return m_shop_name_isSet;
}

bool OAICampaignSettingsDTO::is_shop_name_Valid() const{
    return m_shop_name_isValid;
}

bool OAICampaignSettingsDTO::isShowInContext() const {
    return m_show_in_context;
}
void OAICampaignSettingsDTO::setShowInContext(const bool &show_in_context) {
    m_show_in_context = show_in_context;
    m_show_in_context_isSet = true;
}

bool OAICampaignSettingsDTO::is_show_in_context_Set() const{
    return m_show_in_context_isSet;
}

bool OAICampaignSettingsDTO::is_show_in_context_Valid() const{
    return m_show_in_context_isValid;
}

bool OAICampaignSettingsDTO::isShowInPremium() const {
    return m_show_in_premium;
}
void OAICampaignSettingsDTO::setShowInPremium(const bool &show_in_premium) {
    m_show_in_premium = show_in_premium;
    m_show_in_premium_isSet = true;
}

bool OAICampaignSettingsDTO::is_show_in_premium_Set() const{
    return m_show_in_premium_isSet;
}

bool OAICampaignSettingsDTO::is_show_in_premium_Valid() const{
    return m_show_in_premium_isValid;
}

bool OAICampaignSettingsDTO::isUseOpenStat() const {
    return m_use_open_stat;
}
void OAICampaignSettingsDTO::setUseOpenStat(const bool &use_open_stat) {
    m_use_open_stat = use_open_stat;
    m_use_open_stat_isSet = true;
}

bool OAICampaignSettingsDTO::is_use_open_stat_Set() const{
    return m_use_open_stat_isSet;
}

bool OAICampaignSettingsDTO::is_use_open_stat_Valid() const{
    return m_use_open_stat_isValid;
}

OAICampaignSettingsLocalRegionDTO OAICampaignSettingsDTO::getLocalRegion() const {
    return m_local_region;
}
void OAICampaignSettingsDTO::setLocalRegion(const OAICampaignSettingsLocalRegionDTO &local_region) {
    m_local_region = local_region;
    m_local_region_isSet = true;
}

bool OAICampaignSettingsDTO::is_local_region_Set() const{
    return m_local_region_isSet;
}

bool OAICampaignSettingsDTO::is_local_region_Valid() const{
    return m_local_region_isValid;
}

bool OAICampaignSettingsDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_country_region_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_shop_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_show_in_context_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_show_in_premium_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_use_open_stat_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_local_region.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICampaignSettingsDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
