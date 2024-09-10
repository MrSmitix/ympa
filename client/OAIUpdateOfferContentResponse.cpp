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

#include "OAIUpdateOfferContentResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdateOfferContentResponse::OAIUpdateOfferContentResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdateOfferContentResponse::OAIUpdateOfferContentResponse() {
    this->initializeModel();
}

OAIUpdateOfferContentResponse::~OAIUpdateOfferContentResponse() {}

void OAIUpdateOfferContentResponse::initializeModel() {

    m_status_isSet = false;
    m_status_isValid = false;

    m_results_isSet = false;
    m_results_isValid = false;
}

void OAIUpdateOfferContentResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdateOfferContentResponse::fromJsonObject(QJsonObject json) {

    m_status_isValid = ::OpenAPI::fromJsonValue(m_status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_results_isValid = ::OpenAPI::fromJsonValue(m_results, json[QString("results")]);
    m_results_isSet = !json[QString("results")].isNull() && m_results_isValid;
}

QString OAIUpdateOfferContentResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdateOfferContentResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(m_status));
    }
    if (m_results.size() > 0) {
        obj.insert(QString("results"), ::OpenAPI::toJsonValue(m_results));
    }
    return obj;
}

OAIApiResponseStatusType OAIUpdateOfferContentResponse::getStatus() const {
    return m_status;
}
void OAIUpdateOfferContentResponse::setStatus(const OAIApiResponseStatusType &status) {
    m_status = status;
    m_status_isSet = true;
}

bool OAIUpdateOfferContentResponse::is_status_Set() const{
    return m_status_isSet;
}

bool OAIUpdateOfferContentResponse::is_status_Valid() const{
    return m_status_isValid;
}

QList<OAIUpdateOfferContentResultDTO> OAIUpdateOfferContentResponse::getResults() const {
    return m_results;
}
void OAIUpdateOfferContentResponse::setResults(const QList<OAIUpdateOfferContentResultDTO> &results) {
    m_results = results;
    m_results_isSet = true;
}

bool OAIUpdateOfferContentResponse::is_results_Set() const{
    return m_results_isSet;
}

bool OAIUpdateOfferContentResponse::is_results_Valid() const{
    return m_results_isValid;
}

bool OAIUpdateOfferContentResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_results.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdateOfferContentResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
