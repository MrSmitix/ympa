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

#include "OAIGetBidsRecommendationsResponseDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetBidsRecommendationsResponseDTO::OAIGetBidsRecommendationsResponseDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetBidsRecommendationsResponseDTO::OAIGetBidsRecommendationsResponseDTO() {
    this->initializeModel();
}

OAIGetBidsRecommendationsResponseDTO::~OAIGetBidsRecommendationsResponseDTO() {}

void OAIGetBidsRecommendationsResponseDTO::initializeModel() {

    m_recommendations_isSet = false;
    m_recommendations_isValid = false;
}

void OAIGetBidsRecommendationsResponseDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetBidsRecommendationsResponseDTO::fromJsonObject(QJsonObject json) {

    m_recommendations_isValid = ::OpenAPI::fromJsonValue(m_recommendations, json[QString("recommendations")]);
    m_recommendations_isSet = !json[QString("recommendations")].isNull() && m_recommendations_isValid;
}

QString OAIGetBidsRecommendationsResponseDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetBidsRecommendationsResponseDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_recommendations.size() > 0) {
        obj.insert(QString("recommendations"), ::OpenAPI::toJsonValue(m_recommendations));
    }
    return obj;
}

QList<OAISkuBidRecommendationItemDTO> OAIGetBidsRecommendationsResponseDTO::getRecommendations() const {
    return m_recommendations;
}
void OAIGetBidsRecommendationsResponseDTO::setRecommendations(const QList<OAISkuBidRecommendationItemDTO> &recommendations) {
    m_recommendations = recommendations;
    m_recommendations_isSet = true;
}

bool OAIGetBidsRecommendationsResponseDTO::is_recommendations_Set() const{
    return m_recommendations_isSet;
}

bool OAIGetBidsRecommendationsResponseDTO::is_recommendations_Valid() const{
    return m_recommendations_isValid;
}

bool OAIGetBidsRecommendationsResponseDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_recommendations.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetBidsRecommendationsResponseDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_recommendations_isValid && true;
}

} // namespace OpenAPI
