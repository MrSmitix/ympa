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

#include "OAIOfferCardRecommendationDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOfferCardRecommendationDTO::OAIOfferCardRecommendationDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOfferCardRecommendationDTO::OAIOfferCardRecommendationDTO() {
    this->initializeModel();
}

OAIOfferCardRecommendationDTO::~OAIOfferCardRecommendationDTO() {}

void OAIOfferCardRecommendationDTO::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_percent_isSet = false;
    m_percent_isValid = false;
}

void OAIOfferCardRecommendationDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOfferCardRecommendationDTO::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_percent_isValid = ::OpenAPI::fromJsonValue(m_percent, json[QString("percent")]);
    m_percent_isSet = !json[QString("percent")].isNull() && m_percent_isValid;
}

QString OAIOfferCardRecommendationDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOfferCardRecommendationDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_percent_isSet) {
        obj.insert(QString("percent"), ::OpenAPI::toJsonValue(m_percent));
    }
    return obj;
}

OAIOfferCardRecommendationType OAIOfferCardRecommendationDTO::getType() const {
    return m_type;
}
void OAIOfferCardRecommendationDTO::setType(const OAIOfferCardRecommendationType &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIOfferCardRecommendationDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIOfferCardRecommendationDTO::is_type_Valid() const{
    return m_type_isValid;
}

qint32 OAIOfferCardRecommendationDTO::getPercent() const {
    return m_percent;
}
void OAIOfferCardRecommendationDTO::setPercent(const qint32 &percent) {
    m_percent = percent;
    m_percent_isSet = true;
}

bool OAIOfferCardRecommendationDTO::is_percent_Set() const{
    return m_percent_isSet;
}

bool OAIOfferCardRecommendationDTO::is_percent_Valid() const{
    return m_percent_isValid;
}

bool OAIOfferCardRecommendationDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_percent_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOfferCardRecommendationDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && true;
}

} // namespace OpenAPI
