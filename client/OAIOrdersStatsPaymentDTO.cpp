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

#include "OAIOrdersStatsPaymentDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrdersStatsPaymentDTO::OAIOrdersStatsPaymentDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrdersStatsPaymentDTO::OAIOrdersStatsPaymentDTO() {
    this->initializeModel();
}

OAIOrdersStatsPaymentDTO::~OAIOrdersStatsPaymentDTO() {}

void OAIOrdersStatsPaymentDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_date_isSet = false;
    m_date_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_source_isSet = false;
    m_source_isValid = false;

    m_total_isSet = false;
    m_total_isValid = false;

    m_payment_order_isSet = false;
    m_payment_order_isValid = false;
}

void OAIOrdersStatsPaymentDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrdersStatsPaymentDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_date_isValid = ::OpenAPI::fromJsonValue(m_date, json[QString("date")]);
    m_date_isSet = !json[QString("date")].isNull() && m_date_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_source_isValid = ::OpenAPI::fromJsonValue(m_source, json[QString("source")]);
    m_source_isSet = !json[QString("source")].isNull() && m_source_isValid;

    m_total_isValid = ::OpenAPI::fromJsonValue(m_total, json[QString("total")]);
    m_total_isSet = !json[QString("total")].isNull() && m_total_isValid;

    m_payment_order_isValid = ::OpenAPI::fromJsonValue(m_payment_order, json[QString("paymentOrder")]);
    m_payment_order_isSet = !json[QString("paymentOrder")].isNull() && m_payment_order_isValid;
}

QString OAIOrdersStatsPaymentDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrdersStatsPaymentDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_date_isSet) {
        obj.insert(QString("date"), ::OpenAPI::toJsonValue(m_date));
    }
    if (m_type.isSet()) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_source.isSet()) {
        obj.insert(QString("source"), ::OpenAPI::toJsonValue(m_source));
    }
    if (m_total_isSet) {
        obj.insert(QString("total"), ::OpenAPI::toJsonValue(m_total));
    }
    if (m_payment_order.isSet()) {
        obj.insert(QString("paymentOrder"), ::OpenAPI::toJsonValue(m_payment_order));
    }
    return obj;
}

QString OAIOrdersStatsPaymentDTO::getId() const {
    return m_id;
}
void OAIOrdersStatsPaymentDTO::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIOrdersStatsPaymentDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIOrdersStatsPaymentDTO::is_id_Valid() const{
    return m_id_isValid;
}

QDate OAIOrdersStatsPaymentDTO::getDate() const {
    return m_date;
}
void OAIOrdersStatsPaymentDTO::setDate(const QDate &date) {
    m_date = date;
    m_date_isSet = true;
}

bool OAIOrdersStatsPaymentDTO::is_date_Set() const{
    return m_date_isSet;
}

bool OAIOrdersStatsPaymentDTO::is_date_Valid() const{
    return m_date_isValid;
}

OAIOrdersStatsPaymentType OAIOrdersStatsPaymentDTO::getType() const {
    return m_type;
}
void OAIOrdersStatsPaymentDTO::setType(const OAIOrdersStatsPaymentType &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIOrdersStatsPaymentDTO::is_type_Set() const{
    return m_type_isSet;
}

bool OAIOrdersStatsPaymentDTO::is_type_Valid() const{
    return m_type_isValid;
}

OAIOrdersStatsPaymentSourceType OAIOrdersStatsPaymentDTO::getSource() const {
    return m_source;
}
void OAIOrdersStatsPaymentDTO::setSource(const OAIOrdersStatsPaymentSourceType &source) {
    m_source = source;
    m_source_isSet = true;
}

bool OAIOrdersStatsPaymentDTO::is_source_Set() const{
    return m_source_isSet;
}

bool OAIOrdersStatsPaymentDTO::is_source_Valid() const{
    return m_source_isValid;
}

double OAIOrdersStatsPaymentDTO::getTotal() const {
    return m_total;
}
void OAIOrdersStatsPaymentDTO::setTotal(const double &total) {
    m_total = total;
    m_total_isSet = true;
}

bool OAIOrdersStatsPaymentDTO::is_total_Set() const{
    return m_total_isSet;
}

bool OAIOrdersStatsPaymentDTO::is_total_Valid() const{
    return m_total_isValid;
}

OAIOrdersStatsPaymentOrderDTO OAIOrdersStatsPaymentDTO::getPaymentOrder() const {
    return m_payment_order;
}
void OAIOrdersStatsPaymentDTO::setPaymentOrder(const OAIOrdersStatsPaymentOrderDTO &payment_order) {
    m_payment_order = payment_order;
    m_payment_order_isSet = true;
}

bool OAIOrdersStatsPaymentDTO::is_payment_order_Set() const{
    return m_payment_order_isSet;
}

bool OAIOrdersStatsPaymentDTO::is_payment_order_Valid() const{
    return m_payment_order_isValid;
}

bool OAIOrdersStatsPaymentDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_source.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_total_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_payment_order.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrdersStatsPaymentDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
