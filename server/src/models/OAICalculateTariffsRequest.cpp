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

#include "OAICalculateTariffsRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICalculateTariffsRequest::OAICalculateTariffsRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICalculateTariffsRequest::OAICalculateTariffsRequest() {
    this->initializeModel();
}

OAICalculateTariffsRequest::~OAICalculateTariffsRequest() {}

void OAICalculateTariffsRequest::initializeModel() {

    m_parameters_isSet = false;
    m_parameters_isValid = false;

    m_offers_isSet = false;
    m_offers_isValid = false;
}

void OAICalculateTariffsRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICalculateTariffsRequest::fromJsonObject(QJsonObject json) {

    m_parameters_isValid = ::OpenAPI::fromJsonValue(parameters, json[QString("parameters")]);
    m_parameters_isSet = !json[QString("parameters")].isNull() && m_parameters_isValid;

    m_offers_isValid = ::OpenAPI::fromJsonValue(offers, json[QString("offers")]);
    m_offers_isSet = !json[QString("offers")].isNull() && m_offers_isValid;
}

QString OAICalculateTariffsRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICalculateTariffsRequest::asJsonObject() const {
    QJsonObject obj;
    if (parameters.isSet()) {
        obj.insert(QString("parameters"), ::OpenAPI::toJsonValue(parameters));
    }
    if (offers.size() > 0) {
        obj.insert(QString("offers"), ::OpenAPI::toJsonValue(offers));
    }
    return obj;
}

OAICalculateTariffsParametersDTO OAICalculateTariffsRequest::getParameters() const {
    return parameters;
}
void OAICalculateTariffsRequest::setParameters(const OAICalculateTariffsParametersDTO &parameters) {
    this->parameters = parameters;
    this->m_parameters_isSet = true;
}

bool OAICalculateTariffsRequest::is_parameters_Set() const{
    return m_parameters_isSet;
}

bool OAICalculateTariffsRequest::is_parameters_Valid() const{
    return m_parameters_isValid;
}

QList<OAICalculateTariffsOfferDTO> OAICalculateTariffsRequest::getOffers() const {
    return offers;
}
void OAICalculateTariffsRequest::setOffers(const QList<OAICalculateTariffsOfferDTO> &offers) {
    this->offers = offers;
    this->m_offers_isSet = true;
}

bool OAICalculateTariffsRequest::is_offers_Set() const{
    return m_offers_isSet;
}

bool OAICalculateTariffsRequest::is_offers_Valid() const{
    return m_offers_isValid;
}

bool OAICalculateTariffsRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (parameters.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (offers.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICalculateTariffsRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_parameters_isValid && m_offers_isValid && true;
}

} // namespace OpenAPI
