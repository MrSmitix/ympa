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

#include "OAIGetPromoOfferDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetPromoOfferDTO::OAIGetPromoOfferDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetPromoOfferDTO::OAIGetPromoOfferDTO() {
    this->initializeModel();
}

OAIGetPromoOfferDTO::~OAIGetPromoOfferDTO() {}

void OAIGetPromoOfferDTO::initializeModel() {

    m_offer_id_isSet = false;
    m_offer_id_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_params_isSet = false;
    m_params_isValid = false;

    m_auto_participating_details_isSet = false;
    m_auto_participating_details_isValid = false;
}

void OAIGetPromoOfferDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetPromoOfferDTO::fromJsonObject(QJsonObject json) {

    m_offer_id_isValid = ::OpenAPI::fromJsonValue(offer_id, json[QString("offerId")]);
    m_offer_id_isSet = !json[QString("offerId")].isNull() && m_offer_id_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_params_isValid = ::OpenAPI::fromJsonValue(params, json[QString("params")]);
    m_params_isSet = !json[QString("params")].isNull() && m_params_isValid;

    m_auto_participating_details_isValid = ::OpenAPI::fromJsonValue(auto_participating_details, json[QString("autoParticipatingDetails")]);
    m_auto_participating_details_isSet = !json[QString("autoParticipatingDetails")].isNull() && m_auto_participating_details_isValid;
}

QString OAIGetPromoOfferDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetPromoOfferDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_offer_id_isSet) {
        obj.insert(QString("offerId"), ::OpenAPI::toJsonValue(offer_id));
    }
    if (status.isSet()) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (params.isSet()) {
        obj.insert(QString("params"), ::OpenAPI::toJsonValue(params));
    }
    if (auto_participating_details.isSet()) {
        obj.insert(QString("autoParticipatingDetails"), ::OpenAPI::toJsonValue(auto_participating_details));
    }
    return obj;
}

QString OAIGetPromoOfferDTO::getOfferId() const {
    return offer_id;
}
void OAIGetPromoOfferDTO::setOfferId(const QString &offer_id) {
    this->offer_id = offer_id;
    this->m_offer_id_isSet = true;
}

bool OAIGetPromoOfferDTO::is_offer_id_Set() const{
    return m_offer_id_isSet;
}

bool OAIGetPromoOfferDTO::is_offer_id_Valid() const{
    return m_offer_id_isValid;
}

OAIPromoOfferParticipationStatusType OAIGetPromoOfferDTO::getStatus() const {
    return status;
}
void OAIGetPromoOfferDTO::setStatus(const OAIPromoOfferParticipationStatusType &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIGetPromoOfferDTO::is_status_Set() const{
    return m_status_isSet;
}

bool OAIGetPromoOfferDTO::is_status_Valid() const{
    return m_status_isValid;
}

OAIPromoOfferParamsDTO OAIGetPromoOfferDTO::getParams() const {
    return params;
}
void OAIGetPromoOfferDTO::setParams(const OAIPromoOfferParamsDTO &params) {
    this->params = params;
    this->m_params_isSet = true;
}

bool OAIGetPromoOfferDTO::is_params_Set() const{
    return m_params_isSet;
}

bool OAIGetPromoOfferDTO::is_params_Valid() const{
    return m_params_isValid;
}

OAIPromoOfferAutoParticipatingDetailsDTO OAIGetPromoOfferDTO::getAutoParticipatingDetails() const {
    return auto_participating_details;
}
void OAIGetPromoOfferDTO::setAutoParticipatingDetails(const OAIPromoOfferAutoParticipatingDetailsDTO &auto_participating_details) {
    this->auto_participating_details = auto_participating_details;
    this->m_auto_participating_details_isSet = true;
}

bool OAIGetPromoOfferDTO::is_auto_participating_details_Set() const{
    return m_auto_participating_details_isSet;
}

bool OAIGetPromoOfferDTO::is_auto_participating_details_Valid() const{
    return m_auto_participating_details_isValid;
}

bool OAIGetPromoOfferDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_offer_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (status.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (params.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (auto_participating_details.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetPromoOfferDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_offer_id_isValid && m_status_isValid && m_params_isValid && true;
}

} // namespace OpenAPI
