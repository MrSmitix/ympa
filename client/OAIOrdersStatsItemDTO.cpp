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

#include "OAIOrdersStatsItemDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrdersStatsItemDTO::OAIOrdersStatsItemDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrdersStatsItemDTO::OAIOrdersStatsItemDTO() {
    this->initializeModel();
}

OAIOrdersStatsItemDTO::~OAIOrdersStatsItemDTO() {}

void OAIOrdersStatsItemDTO::initializeModel() {

    m_offer_name_isSet = false;
    m_offer_name_isValid = false;

    m_market_sku_isSet = false;
    m_market_sku_isValid = false;

    m_shop_sku_isSet = false;
    m_shop_sku_isValid = false;

    m_count_isSet = false;
    m_count_isValid = false;

    m_prices_isSet = false;
    m_prices_isValid = false;

    m_warehouse_isSet = false;
    m_warehouse_isValid = false;

    m_details_isSet = false;
    m_details_isValid = false;

    m_cis_list_isSet = false;
    m_cis_list_isValid = false;

    m_initial_count_isSet = false;
    m_initial_count_isValid = false;

    m_bid_fee_isSet = false;
    m_bid_fee_isValid = false;

    m_cofinance_threshold_isSet = false;
    m_cofinance_threshold_isValid = false;

    m_cofinance_value_isSet = false;
    m_cofinance_value_isValid = false;
}

void OAIOrdersStatsItemDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIOrdersStatsItemDTO::fromJsonObject(QJsonObject json) {

    m_offer_name_isValid = ::OpenAPI::fromJsonValue(m_offer_name, json[QString("offerName")]);
    m_offer_name_isSet = !json[QString("offerName")].isNull() && m_offer_name_isValid;

    m_market_sku_isValid = ::OpenAPI::fromJsonValue(m_market_sku, json[QString("marketSku")]);
    m_market_sku_isSet = !json[QString("marketSku")].isNull() && m_market_sku_isValid;

    m_shop_sku_isValid = ::OpenAPI::fromJsonValue(m_shop_sku, json[QString("shopSku")]);
    m_shop_sku_isSet = !json[QString("shopSku")].isNull() && m_shop_sku_isValid;

    m_count_isValid = ::OpenAPI::fromJsonValue(m_count, json[QString("count")]);
    m_count_isSet = !json[QString("count")].isNull() && m_count_isValid;

    m_prices_isValid = ::OpenAPI::fromJsonValue(m_prices, json[QString("prices")]);
    m_prices_isSet = !json[QString("prices")].isNull() && m_prices_isValid;

    m_warehouse_isValid = ::OpenAPI::fromJsonValue(m_warehouse, json[QString("warehouse")]);
    m_warehouse_isSet = !json[QString("warehouse")].isNull() && m_warehouse_isValid;

    m_details_isValid = ::OpenAPI::fromJsonValue(m_details, json[QString("details")]);
    m_details_isSet = !json[QString("details")].isNull() && m_details_isValid;

    m_cis_list_isValid = ::OpenAPI::fromJsonValue(m_cis_list, json[QString("cisList")]);
    m_cis_list_isSet = !json[QString("cisList")].isNull() && m_cis_list_isValid;

    m_initial_count_isValid = ::OpenAPI::fromJsonValue(m_initial_count, json[QString("initialCount")]);
    m_initial_count_isSet = !json[QString("initialCount")].isNull() && m_initial_count_isValid;

    m_bid_fee_isValid = ::OpenAPI::fromJsonValue(m_bid_fee, json[QString("bidFee")]);
    m_bid_fee_isSet = !json[QString("bidFee")].isNull() && m_bid_fee_isValid;

    m_cofinance_threshold_isValid = ::OpenAPI::fromJsonValue(m_cofinance_threshold, json[QString("cofinanceThreshold")]);
    m_cofinance_threshold_isSet = !json[QString("cofinanceThreshold")].isNull() && m_cofinance_threshold_isValid;

    m_cofinance_value_isValid = ::OpenAPI::fromJsonValue(m_cofinance_value, json[QString("cofinanceValue")]);
    m_cofinance_value_isSet = !json[QString("cofinanceValue")].isNull() && m_cofinance_value_isValid;
}

QString OAIOrdersStatsItemDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIOrdersStatsItemDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_offer_name_isSet) {
        obj.insert(QString("offerName"), ::OpenAPI::toJsonValue(m_offer_name));
    }
    if (m_market_sku_isSet) {
        obj.insert(QString("marketSku"), ::OpenAPI::toJsonValue(m_market_sku));
    }
    if (m_shop_sku_isSet) {
        obj.insert(QString("shopSku"), ::OpenAPI::toJsonValue(m_shop_sku));
    }
    if (m_count_isSet) {
        obj.insert(QString("count"), ::OpenAPI::toJsonValue(m_count));
    }
    if (m_prices.size() > 0) {
        obj.insert(QString("prices"), ::OpenAPI::toJsonValue(m_prices));
    }
    if (m_warehouse.isSet()) {
        obj.insert(QString("warehouse"), ::OpenAPI::toJsonValue(m_warehouse));
    }
    if (m_details.size() > 0) {
        obj.insert(QString("details"), ::OpenAPI::toJsonValue(m_details));
    }
    if (m_cis_list.size() > 0) {
        obj.insert(QString("cisList"), ::OpenAPI::toJsonValue(m_cis_list));
    }
    if (m_initial_count_isSet) {
        obj.insert(QString("initialCount"), ::OpenAPI::toJsonValue(m_initial_count));
    }
    if (m_bid_fee_isSet) {
        obj.insert(QString("bidFee"), ::OpenAPI::toJsonValue(m_bid_fee));
    }
    if (m_cofinance_threshold_isSet) {
        obj.insert(QString("cofinanceThreshold"), ::OpenAPI::toJsonValue(m_cofinance_threshold));
    }
    if (m_cofinance_value_isSet) {
        obj.insert(QString("cofinanceValue"), ::OpenAPI::toJsonValue(m_cofinance_value));
    }
    return obj;
}

QString OAIOrdersStatsItemDTO::getOfferName() const {
    return m_offer_name;
}
void OAIOrdersStatsItemDTO::setOfferName(const QString &offer_name) {
    m_offer_name = offer_name;
    m_offer_name_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_offer_name_Set() const{
    return m_offer_name_isSet;
}

bool OAIOrdersStatsItemDTO::is_offer_name_Valid() const{
    return m_offer_name_isValid;
}

qint64 OAIOrdersStatsItemDTO::getMarketSku() const {
    return m_market_sku;
}
void OAIOrdersStatsItemDTO::setMarketSku(const qint64 &market_sku) {
    m_market_sku = market_sku;
    m_market_sku_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_market_sku_Set() const{
    return m_market_sku_isSet;
}

bool OAIOrdersStatsItemDTO::is_market_sku_Valid() const{
    return m_market_sku_isValid;
}

QString OAIOrdersStatsItemDTO::getShopSku() const {
    return m_shop_sku;
}
void OAIOrdersStatsItemDTO::setShopSku(const QString &shop_sku) {
    m_shop_sku = shop_sku;
    m_shop_sku_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_shop_sku_Set() const{
    return m_shop_sku_isSet;
}

bool OAIOrdersStatsItemDTO::is_shop_sku_Valid() const{
    return m_shop_sku_isValid;
}

qint32 OAIOrdersStatsItemDTO::getCount() const {
    return m_count;
}
void OAIOrdersStatsItemDTO::setCount(const qint32 &count) {
    m_count = count;
    m_count_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_count_Set() const{
    return m_count_isSet;
}

bool OAIOrdersStatsItemDTO::is_count_Valid() const{
    return m_count_isValid;
}

QList<OAIOrdersStatsPriceDTO> OAIOrdersStatsItemDTO::getPrices() const {
    return m_prices;
}
void OAIOrdersStatsItemDTO::setPrices(const QList<OAIOrdersStatsPriceDTO> &prices) {
    m_prices = prices;
    m_prices_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_prices_Set() const{
    return m_prices_isSet;
}

bool OAIOrdersStatsItemDTO::is_prices_Valid() const{
    return m_prices_isValid;
}

OAIOrdersStatsWarehouseDTO OAIOrdersStatsItemDTO::getWarehouse() const {
    return m_warehouse;
}
void OAIOrdersStatsItemDTO::setWarehouse(const OAIOrdersStatsWarehouseDTO &warehouse) {
    m_warehouse = warehouse;
    m_warehouse_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_warehouse_Set() const{
    return m_warehouse_isSet;
}

bool OAIOrdersStatsItemDTO::is_warehouse_Valid() const{
    return m_warehouse_isValid;
}

QList<OAIOrdersStatsDetailsDTO> OAIOrdersStatsItemDTO::getDetails() const {
    return m_details;
}
void OAIOrdersStatsItemDTO::setDetails(const QList<OAIOrdersStatsDetailsDTO> &details) {
    m_details = details;
    m_details_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_details_Set() const{
    return m_details_isSet;
}

bool OAIOrdersStatsItemDTO::is_details_Valid() const{
    return m_details_isValid;
}

QList<QString> OAIOrdersStatsItemDTO::getCisList() const {
    return m_cis_list;
}
void OAIOrdersStatsItemDTO::setCisList(const QList<QString> &cis_list) {
    m_cis_list = cis_list;
    m_cis_list_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_cis_list_Set() const{
    return m_cis_list_isSet;
}

bool OAIOrdersStatsItemDTO::is_cis_list_Valid() const{
    return m_cis_list_isValid;
}

qint32 OAIOrdersStatsItemDTO::getInitialCount() const {
    return m_initial_count;
}
void OAIOrdersStatsItemDTO::setInitialCount(const qint32 &initial_count) {
    m_initial_count = initial_count;
    m_initial_count_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_initial_count_Set() const{
    return m_initial_count_isSet;
}

bool OAIOrdersStatsItemDTO::is_initial_count_Valid() const{
    return m_initial_count_isValid;
}

qint32 OAIOrdersStatsItemDTO::getBidFee() const {
    return m_bid_fee;
}
void OAIOrdersStatsItemDTO::setBidFee(const qint32 &bid_fee) {
    m_bid_fee = bid_fee;
    m_bid_fee_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_bid_fee_Set() const{
    return m_bid_fee_isSet;
}

bool OAIOrdersStatsItemDTO::is_bid_fee_Valid() const{
    return m_bid_fee_isValid;
}

double OAIOrdersStatsItemDTO::getCofinanceThreshold() const {
    return m_cofinance_threshold;
}
void OAIOrdersStatsItemDTO::setCofinanceThreshold(const double &cofinance_threshold) {
    m_cofinance_threshold = cofinance_threshold;
    m_cofinance_threshold_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_cofinance_threshold_Set() const{
    return m_cofinance_threshold_isSet;
}

bool OAIOrdersStatsItemDTO::is_cofinance_threshold_Valid() const{
    return m_cofinance_threshold_isValid;
}

double OAIOrdersStatsItemDTO::getCofinanceValue() const {
    return m_cofinance_value;
}
void OAIOrdersStatsItemDTO::setCofinanceValue(const double &cofinance_value) {
    m_cofinance_value = cofinance_value;
    m_cofinance_value_isSet = true;
}

bool OAIOrdersStatsItemDTO::is_cofinance_value_Set() const{
    return m_cofinance_value_isSet;
}

bool OAIOrdersStatsItemDTO::is_cofinance_value_Valid() const{
    return m_cofinance_value_isValid;
}

bool OAIOrdersStatsItemDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_offer_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_market_sku_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_shop_sku_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_prices.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_warehouse.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_details.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_cis_list.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_initial_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_bid_fee_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_cofinance_threshold_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_cofinance_value_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIOrdersStatsItemDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
