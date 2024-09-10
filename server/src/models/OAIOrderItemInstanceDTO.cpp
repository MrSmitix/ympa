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

#include "OAIOrderItemInstanceDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrderItemInstanceDTO::OAIOrderItemInstanceDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrderItemInstanceDTO::OAIOrderItemInstanceDTO() {
    this->initializeModel();
}

OAIOrderItemInstanceDTO::~OAIOrderItemInstanceDTO() {}

void OAIOrderItemInstanceDTO::initializeModel() {

    m_cis_isSet = false;
    m_cis_isValid = false;

    m_cis_full_isSet = false;
    m_cis_full_isValid = false;

    m_uin_isSet = false;
    m_uin_isValid = false;

    m_rnpt_isSet = false;
    m_rnpt_isValid = false;

    m_gtd_isSet = false;
    m_gtd_isValid = false;
}

void OAIOrderItemInstanceDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrderItemInstanceDTO::fromJsonObject(QJsonObject json) {

    m_cis_isValid = ::OpenAPI::fromJsonValue(cis, json[QString("cis")]);
    m_cis_isSet = !json[QString("cis")].isNull() && m_cis_isValid;

    m_cis_full_isValid = ::OpenAPI::fromJsonValue(cis_full, json[QString("cisFull")]);
    m_cis_full_isSet = !json[QString("cisFull")].isNull() && m_cis_full_isValid;

    m_uin_isValid = ::OpenAPI::fromJsonValue(uin, json[QString("uin")]);
    m_uin_isSet = !json[QString("uin")].isNull() && m_uin_isValid;

    m_rnpt_isValid = ::OpenAPI::fromJsonValue(rnpt, json[QString("rnpt")]);
    m_rnpt_isSet = !json[QString("rnpt")].isNull() && m_rnpt_isValid;

    m_gtd_isValid = ::OpenAPI::fromJsonValue(gtd, json[QString("gtd")]);
    m_gtd_isSet = !json[QString("gtd")].isNull() && m_gtd_isValid;
}

QString OAIOrderItemInstanceDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrderItemInstanceDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_cis_isSet) {
        obj.insert(QString("cis"), ::OpenAPI::toJsonValue(cis));
    }
    if (m_cis_full_isSet) {
        obj.insert(QString("cisFull"), ::OpenAPI::toJsonValue(cis_full));
    }
    if (m_uin_isSet) {
        obj.insert(QString("uin"), ::OpenAPI::toJsonValue(uin));
    }
    if (m_rnpt_isSet) {
        obj.insert(QString("rnpt"), ::OpenAPI::toJsonValue(rnpt));
    }
    if (m_gtd_isSet) {
        obj.insert(QString("gtd"), ::OpenAPI::toJsonValue(gtd));
    }
    return obj;
}

QString OAIOrderItemInstanceDTO::getCis() const {
    return cis;
}
void OAIOrderItemInstanceDTO::setCis(const QString &cis) {
    this->cis = cis;
    this->m_cis_isSet = true;
}

bool OAIOrderItemInstanceDTO::is_cis_Set() const{
    return m_cis_isSet;
}

bool OAIOrderItemInstanceDTO::is_cis_Valid() const{
    return m_cis_isValid;
}

QString OAIOrderItemInstanceDTO::getCisFull() const {
    return cis_full;
}
void OAIOrderItemInstanceDTO::setCisFull(const QString &cis_full) {
    this->cis_full = cis_full;
    this->m_cis_full_isSet = true;
}

bool OAIOrderItemInstanceDTO::is_cis_full_Set() const{
    return m_cis_full_isSet;
}

bool OAIOrderItemInstanceDTO::is_cis_full_Valid() const{
    return m_cis_full_isValid;
}

QString OAIOrderItemInstanceDTO::getUin() const {
    return uin;
}
void OAIOrderItemInstanceDTO::setUin(const QString &uin) {
    this->uin = uin;
    this->m_uin_isSet = true;
}

bool OAIOrderItemInstanceDTO::is_uin_Set() const{
    return m_uin_isSet;
}

bool OAIOrderItemInstanceDTO::is_uin_Valid() const{
    return m_uin_isValid;
}

QString OAIOrderItemInstanceDTO::getRnpt() const {
    return rnpt;
}
void OAIOrderItemInstanceDTO::setRnpt(const QString &rnpt) {
    this->rnpt = rnpt;
    this->m_rnpt_isSet = true;
}

bool OAIOrderItemInstanceDTO::is_rnpt_Set() const{
    return m_rnpt_isSet;
}

bool OAIOrderItemInstanceDTO::is_rnpt_Valid() const{
    return m_rnpt_isValid;
}

QString OAIOrderItemInstanceDTO::getGtd() const {
    return gtd;
}
void OAIOrderItemInstanceDTO::setGtd(const QString &gtd) {
    this->gtd = gtd;
    this->m_gtd_isSet = true;
}

bool OAIOrderItemInstanceDTO::is_gtd_Set() const{
    return m_gtd_isSet;
}

bool OAIOrderItemInstanceDTO::is_gtd_Valid() const{
    return m_gtd_isValid;
}

bool OAIOrderItemInstanceDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_cis_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_cis_full_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_uin_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_rnpt_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_gtd_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrderItemInstanceDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
