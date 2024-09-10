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

#include "OAIUpdateOutletLicenseRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdateOutletLicenseRequest::OAIUpdateOutletLicenseRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdateOutletLicenseRequest::OAIUpdateOutletLicenseRequest() {
    this->initializeModel();
}

OAIUpdateOutletLicenseRequest::~OAIUpdateOutletLicenseRequest() {}

void OAIUpdateOutletLicenseRequest::initializeModel() {

    m_licenses_isSet = false;
    m_licenses_isValid = false;
}

void OAIUpdateOutletLicenseRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdateOutletLicenseRequest::fromJsonObject(QJsonObject json) {

    m_licenses_isValid = ::OpenAPI::fromJsonValue(m_licenses, json[QString("licenses")]);
    m_licenses_isSet = !json[QString("licenses")].isNull() && m_licenses_isValid;
}

QString OAIUpdateOutletLicenseRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdateOutletLicenseRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_licenses.size() > 0) {
        obj.insert(QString("licenses"), ::OpenAPI::toJsonValue(m_licenses));
    }
    return obj;
}

QList<OAIOutletLicenseDTO> OAIUpdateOutletLicenseRequest::getLicenses() const {
    return m_licenses;
}
void OAIUpdateOutletLicenseRequest::setLicenses(const QList<OAIOutletLicenseDTO> &licenses) {
    m_licenses = licenses;
    m_licenses_isSet = true;
}

bool OAIUpdateOutletLicenseRequest::is_licenses_Set() const{
    return m_licenses_isSet;
}

bool OAIUpdateOutletLicenseRequest::is_licenses_Valid() const{
    return m_licenses_isValid;
}

bool OAIUpdateOutletLicenseRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_licenses.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdateOutletLicenseRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_licenses_isValid && true;
}

} // namespace OpenAPI
