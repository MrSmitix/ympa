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

#include "OAISetFeedParamsRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISetFeedParamsRequest::OAISetFeedParamsRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISetFeedParamsRequest::OAISetFeedParamsRequest() {
    this->initializeModel();
}

OAISetFeedParamsRequest::~OAISetFeedParamsRequest() {}

void OAISetFeedParamsRequest::initializeModel() {

    m_parameters_isSet = false;
    m_parameters_isValid = false;
}

void OAISetFeedParamsRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISetFeedParamsRequest::fromJsonObject(QJsonObject json) {

    m_parameters_isValid = ::OpenAPI::fromJsonValue(parameters, json[QString("parameters")]);
    m_parameters_isSet = !json[QString("parameters")].isNull() && m_parameters_isValid;
}

QString OAISetFeedParamsRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISetFeedParamsRequest::asJsonObject() const {
    QJsonObject obj;
    if (parameters.size() > 0) {
        obj.insert(QString("parameters"), ::OpenAPI::toJsonValue(parameters));
    }
    return obj;
}

QList<OAIFeedParameterDTO> OAISetFeedParamsRequest::getParameters() const {
    return parameters;
}
void OAISetFeedParamsRequest::setParameters(const QList<OAIFeedParameterDTO> &parameters) {
    this->parameters = parameters;
    this->m_parameters_isSet = true;
}

bool OAISetFeedParamsRequest::is_parameters_Set() const{
    return m_parameters_isSet;
}

bool OAISetFeedParamsRequest::is_parameters_Valid() const{
    return m_parameters_isValid;
}

bool OAISetFeedParamsRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (parameters.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISetFeedParamsRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_parameters_isValid && true;
}

} // namespace OpenAPI
