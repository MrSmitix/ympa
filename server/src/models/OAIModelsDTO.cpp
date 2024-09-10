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

#include "OAIModelsDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIModelsDTO::OAIModelsDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIModelsDTO::OAIModelsDTO() {
    this->initializeModel();
}

OAIModelsDTO::~OAIModelsDTO() {}

void OAIModelsDTO::initializeModel() {

    m_models_isSet = false;
    m_models_isValid = false;
}

void OAIModelsDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIModelsDTO::fromJsonObject(QJsonObject json) {

    m_models_isValid = ::OpenAPI::fromJsonValue(models, json[QString("models")]);
    m_models_isSet = !json[QString("models")].isNull() && m_models_isValid;
}

QString OAIModelsDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIModelsDTO::asJsonObject() const {
    QJsonObject obj;
    if (models.size() > 0) {
        obj.insert(QString("models"), ::OpenAPI::toJsonValue(models));
    }
    return obj;
}

QList<OAIModelDTO> OAIModelsDTO::getModels() const {
    return models;
}
void OAIModelsDTO::setModels(const QList<OAIModelDTO> &models) {
    this->models = models;
    this->m_models_isSet = true;
}

bool OAIModelsDTO::is_models_Set() const{
    return m_models_isSet;
}

bool OAIModelsDTO::is_models_Valid() const{
    return m_models_isValid;
}

bool OAIModelsDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (models.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIModelsDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_models_isValid && true;
}

} // namespace OpenAPI
