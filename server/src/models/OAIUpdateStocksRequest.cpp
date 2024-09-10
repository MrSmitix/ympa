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

#include "OAIUpdateStocksRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdateStocksRequest::OAIUpdateStocksRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdateStocksRequest::OAIUpdateStocksRequest() {
    this->initializeModel();
}

OAIUpdateStocksRequest::~OAIUpdateStocksRequest() {}

void OAIUpdateStocksRequest::initializeModel() {

    m_skus_isSet = false;
    m_skus_isValid = false;
}

void OAIUpdateStocksRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdateStocksRequest::fromJsonObject(QJsonObject json) {

    m_skus_isValid = ::OpenAPI::fromJsonValue(skus, json[QString("skus")]);
    m_skus_isSet = !json[QString("skus")].isNull() && m_skus_isValid;
}

QString OAIUpdateStocksRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdateStocksRequest::asJsonObject() const {
    QJsonObject obj;
    if (skus.size() > 0) {
        obj.insert(QString("skus"), ::OpenAPI::toJsonValue(skus));
    }
    return obj;
}

QSet<OAIUpdateStockDTO> OAIUpdateStocksRequest::getSkus() const {
    return skus;
}
void OAIUpdateStocksRequest::setSkus(const QSet<OAIUpdateStockDTO> &skus) {
    this->skus = skus;
    this->m_skus_isSet = true;
}

bool OAIUpdateStocksRequest::is_skus_Set() const{
    return m_skus_isSet;
}

bool OAIUpdateStocksRequest::is_skus_Valid() const{
    return m_skus_isValid;
}

bool OAIUpdateStocksRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (skus.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdateStocksRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_skus_isValid && true;
}

} // namespace OpenAPI
