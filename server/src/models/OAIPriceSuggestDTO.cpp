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

#include "OAIPriceSuggestDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPriceSuggestDTO::OAIPriceSuggestDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPriceSuggestDTO::OAIPriceSuggestDTO() {
    this->initializeModel();
}

OAIPriceSuggestDTO::~OAIPriceSuggestDTO() {}

void OAIPriceSuggestDTO::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_price_isSet = false;
    m_price_isValid = false;
}

void OAIPriceSuggestDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPriceSuggestDTO::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_price_isValid = ::OpenAPI::fromJsonValue(price, json[QString("price")]);
    m_price_isSet = !json[QString("price")].isNull() && m_price_isValid;
}

QString OAIPriceSuggestDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPriceSuggestDTO::asJsonObject() const {
    QJsonObject obj;
    if (type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_price_isSet) {
        obj.insert(QString("price"), ::OpenAPI::toJsonValue(price));
    }
    return obj;
}

OAIPriceSuggestType OAIPriceSuggestDTO::getType() const {
    return type;
}
void OAIPriceSuggestDTO::setType(const OAIPriceSuggestType &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIPriceSuggestDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIPriceSuggestDTO::is_type_Valid() const{
    return m_type_isValid;
}

double OAIPriceSuggestDTO::getPrice() const {
    return price;
}
void OAIPriceSuggestDTO::setPrice(const double &price) {
    this->price = price;
    this->m_price_isSet = true;
}

bool OAIPriceSuggestDTO::is_price_Set() const{
    return m_price_isSet;
}

bool OAIPriceSuggestDTO::is_price_Valid() const{
    return m_price_isValid;
}

bool OAIPriceSuggestDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_price_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPriceSuggestDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
