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

#include "OAIGetPromoPromocodeInfoDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetPromoPromocodeInfoDTO::OAIGetPromoPromocodeInfoDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetPromoPromocodeInfoDTO::OAIGetPromoPromocodeInfoDTO() {
    this->initializeModel();
}

OAIGetPromoPromocodeInfoDTO::~OAIGetPromoPromocodeInfoDTO() {}

void OAIGetPromoPromocodeInfoDTO::initializeModel() {

    m_promocode_isSet = false;
    m_promocode_isValid = false;

    m_discount_isSet = false;
    m_discount_isValid = false;
}

void OAIGetPromoPromocodeInfoDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetPromoPromocodeInfoDTO::fromJsonObject(QJsonObject json) {

    m_promocode_isValid = ::OpenAPI::fromJsonValue(promocode, json[QString("promocode")]);
    m_promocode_isSet = !json[QString("promocode")].isNull() && m_promocode_isValid;

    m_discount_isValid = ::OpenAPI::fromJsonValue(discount, json[QString("discount")]);
    m_discount_isSet = !json[QString("discount")].isNull() && m_discount_isValid;
}

QString OAIGetPromoPromocodeInfoDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetPromoPromocodeInfoDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_promocode_isSet) {
        obj.insert(QString("promocode"), ::OpenAPI::toJsonValue(promocode));
    }
    if (m_discount_isSet) {
        obj.insert(QString("discount"), ::OpenAPI::toJsonValue(discount));
    }
    return obj;
}

QString OAIGetPromoPromocodeInfoDTO::getPromocode() const {
    return promocode;
}
void OAIGetPromoPromocodeInfoDTO::setPromocode(const QString &promocode) {
    this->promocode = promocode;
    this->m_promocode_isSet = true;
}

bool OAIGetPromoPromocodeInfoDTO::is_promocode_Set() const{
    return m_promocode_isSet;
}

bool OAIGetPromoPromocodeInfoDTO::is_promocode_Valid() const{
    return m_promocode_isValid;
}

qint32 OAIGetPromoPromocodeInfoDTO::getDiscount() const {
    return discount;
}
void OAIGetPromoPromocodeInfoDTO::setDiscount(const qint32 &discount) {
    this->discount = discount;
    this->m_discount_isSet = true;
}

bool OAIGetPromoPromocodeInfoDTO::is_discount_Set() const{
    return m_discount_isSet;
}

bool OAIGetPromoPromocodeInfoDTO::is_discount_Valid() const{
    return m_discount_isValid;
}

bool OAIGetPromoPromocodeInfoDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_promocode_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_discount_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetPromoPromocodeInfoDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_promocode_isValid && m_discount_isValid && true;
}

} // namespace OpenAPI
