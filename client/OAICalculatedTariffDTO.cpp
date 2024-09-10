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

#include "OAICalculatedTariffDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICalculatedTariffDTO::OAICalculatedTariffDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICalculatedTariffDTO::OAICalculatedTariffDTO() {
    this->initializeModel();
}

OAICalculatedTariffDTO::~OAICalculatedTariffDTO() {}

void OAICalculatedTariffDTO::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_amount_isSet = false;
    m_amount_isValid = false;

    m_parameters_isSet = false;
    m_parameters_isValid = false;
}

void OAICalculatedTariffDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICalculatedTariffDTO::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_amount_isValid = ::OpenAPI::fromJsonValue(m_amount, json[QString("amount")]);
    m_amount_isSet = !json[QString("amount")].isNull() && m_amount_isValid;

    m_parameters_isValid = ::OpenAPI::fromJsonValue(m_parameters, json[QString("parameters")]);
    m_parameters_isSet = !json[QString("parameters")].isNull() && m_parameters_isValid;
}

QString OAICalculatedTariffDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICalculatedTariffDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_amount_isSet) {
        obj.insert(QString("amount"), ::OpenAPI::toJsonValue(m_amount));
    }
    if (m_parameters.size() > 0) {
        obj.insert(QString("parameters"), ::OpenAPI::toJsonValue(m_parameters));
    }
    return obj;
}

OAICalculatedTariffType OAICalculatedTariffDTO::getType() const {
    return m_type;
}
void OAICalculatedTariffDTO::setType(const OAICalculatedTariffType &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAICalculatedTariffDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAICalculatedTariffDTO::is_type_Valid() const{
    return m_type_isValid;
}

double OAICalculatedTariffDTO::getAmount() const {
    return m_amount;
}
void OAICalculatedTariffDTO::setAmount(const double &amount) {
    m_amount = amount;
    m_amount_isSet = true;
}

bool OAICalculatedTariffDTO::is_amount_Set() const{
    return m_amount_isSet;
}

bool OAICalculatedTariffDTO::is_amount_Valid() const{
    return m_amount_isValid;
}

QList<OAITariffParameterDTO> OAICalculatedTariffDTO::getParameters() const {
    return m_parameters;
}
void OAICalculatedTariffDTO::setParameters(const QList<OAITariffParameterDTO> &parameters) {
    m_parameters = parameters;
    m_parameters_isSet = true;
}

bool OAICalculatedTariffDTO::is_parameters_Set() const{
    return m_parameters_isSet;
}

bool OAICalculatedTariffDTO::is_parameters_Valid() const{
    return m_parameters_isValid;
}

bool OAICalculatedTariffDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_amount_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_parameters.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICalculatedTariffDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && m_parameters_isValid && true;
}

} // namespace OpenAPI
