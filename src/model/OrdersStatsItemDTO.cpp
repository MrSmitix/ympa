/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ympa_cpp_restsdk_client/model/OrdersStatsItemDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrdersStatsItemDTO::OrdersStatsItemDTO()
{
    m_OfferName = utility::conversions::to_string_t("");
    m_OfferNameIsSet = false;
    m_MarketSku = 0L;
    m_MarketSkuIsSet = false;
    m_ShopSku = utility::conversions::to_string_t("");
    m_ShopSkuIsSet = false;
    m_Count = 0;
    m_CountIsSet = false;
    m_PricesIsSet = false;
    m_WarehouseIsSet = false;
    m_DetailsIsSet = false;
    m_CisListIsSet = false;
    m_InitialCount = 0;
    m_InitialCountIsSet = false;
    m_BidFee = 0;
    m_BidFeeIsSet = false;
    m_CofinanceThreshold = 0.0;
    m_CofinanceThresholdIsSet = false;
    m_CofinanceValue = 0.0;
    m_CofinanceValueIsSet = false;
}

OrdersStatsItemDTO::~OrdersStatsItemDTO()
{
}

void OrdersStatsItemDTO::validate()
{
    // TODO: implement validation
}

web::json::value OrdersStatsItemDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_OfferNameIsSet)
    {
        val[utility::conversions::to_string_t(U("offerName"))] = ModelBase::toJson(m_OfferName);
    }
    if(m_MarketSkuIsSet)
    {
        val[utility::conversions::to_string_t(U("marketSku"))] = ModelBase::toJson(m_MarketSku);
    }
    if(m_ShopSkuIsSet)
    {
        val[utility::conversions::to_string_t(U("shopSku"))] = ModelBase::toJson(m_ShopSku);
    }
    if(m_CountIsSet)
    {
        val[utility::conversions::to_string_t(U("count"))] = ModelBase::toJson(m_Count);
    }
    if(m_PricesIsSet)
    {
        val[utility::conversions::to_string_t(U("prices"))] = ModelBase::toJson(m_Prices);
    }
    if(m_WarehouseIsSet)
    {
        val[utility::conversions::to_string_t(U("warehouse"))] = ModelBase::toJson(m_Warehouse);
    }
    if(m_DetailsIsSet)
    {
        val[utility::conversions::to_string_t(U("details"))] = ModelBase::toJson(m_Details);
    }
    if(m_CisListIsSet)
    {
        val[utility::conversions::to_string_t(U("cisList"))] = ModelBase::toJson(m_CisList);
    }
    if(m_InitialCountIsSet)
    {
        val[utility::conversions::to_string_t(U("initialCount"))] = ModelBase::toJson(m_InitialCount);
    }
    if(m_BidFeeIsSet)
    {
        val[utility::conversions::to_string_t(U("bidFee"))] = ModelBase::toJson(m_BidFee);
    }
    if(m_CofinanceThresholdIsSet)
    {
        val[utility::conversions::to_string_t(U("cofinanceThreshold"))] = ModelBase::toJson(m_CofinanceThreshold);
    }
    if(m_CofinanceValueIsSet)
    {
        val[utility::conversions::to_string_t(U("cofinanceValue"))] = ModelBase::toJson(m_CofinanceValue);
    }

    return val;
}

bool OrdersStatsItemDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("offerName"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("offerName")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOfferName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOfferName);
            setOfferName(refVal_setOfferName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("marketSku"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketSku")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setMarketSku;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketSku);
            setMarketSku(refVal_setMarketSku);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("shopSku"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("shopSku")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setShopSku;
            ok &= ModelBase::fromJson(fieldValue, refVal_setShopSku);
            setShopSku(refVal_setShopSku);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("count")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCount);
            setCount(refVal_setCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("prices"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("prices")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<OrdersStatsPriceDTO>> refVal_setPrices;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPrices);
            setPrices(refVal_setPrices);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("warehouse"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("warehouse")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrdersStatsWarehouseDTO> refVal_setWarehouse;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWarehouse);
            setWarehouse(refVal_setWarehouse);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("details"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("details")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<OrdersStatsDetailsDTO>> refVal_setDetails;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDetails);
            setDetails(refVal_setDetails);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("cisList"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("cisList")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setCisList;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCisList);
            setCisList(refVal_setCisList);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("initialCount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("initialCount")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setInitialCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setInitialCount);
            setInitialCount(refVal_setInitialCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("bidFee"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("bidFee")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setBidFee;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBidFee);
            setBidFee(refVal_setBidFee);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("cofinanceThreshold"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("cofinanceThreshold")));
        if(!fieldValue.is_null())
        {
            double refVal_setCofinanceThreshold;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCofinanceThreshold);
            setCofinanceThreshold(refVal_setCofinanceThreshold);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("cofinanceValue"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("cofinanceValue")));
        if(!fieldValue.is_null())
        {
            double refVal_setCofinanceValue;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCofinanceValue);
            setCofinanceValue(refVal_setCofinanceValue);
        }
    }
    return ok;
}

void OrdersStatsItemDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_OfferNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("offerName")), m_OfferName));
    }
    if(m_MarketSkuIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketSku")), m_MarketSku));
    }
    if(m_ShopSkuIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("shopSku")), m_ShopSku));
    }
    if(m_CountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("count")), m_Count));
    }
    if(m_PricesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("prices")), m_Prices));
    }
    if(m_WarehouseIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("warehouse")), m_Warehouse));
    }
    if(m_DetailsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("details")), m_Details));
    }
    if(m_CisListIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("cisList")), m_CisList));
    }
    if(m_InitialCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("initialCount")), m_InitialCount));
    }
    if(m_BidFeeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("bidFee")), m_BidFee));
    }
    if(m_CofinanceThresholdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("cofinanceThreshold")), m_CofinanceThreshold));
    }
    if(m_CofinanceValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("cofinanceValue")), m_CofinanceValue));
    }
}

bool OrdersStatsItemDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("offerName"))))
    {
        utility::string_t refVal_setOfferName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("offerName"))), refVal_setOfferName );
        setOfferName(refVal_setOfferName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("marketSku"))))
    {
        int64_t refVal_setMarketSku;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketSku"))), refVal_setMarketSku );
        setMarketSku(refVal_setMarketSku);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("shopSku"))))
    {
        utility::string_t refVal_setShopSku;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("shopSku"))), refVal_setShopSku );
        setShopSku(refVal_setShopSku);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("count"))))
    {
        int32_t refVal_setCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("count"))), refVal_setCount );
        setCount(refVal_setCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("prices"))))
    {
        std::vector<std::shared_ptr<OrdersStatsPriceDTO>> refVal_setPrices;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("prices"))), refVal_setPrices );
        setPrices(refVal_setPrices);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("warehouse"))))
    {
        std::shared_ptr<OrdersStatsWarehouseDTO> refVal_setWarehouse;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("warehouse"))), refVal_setWarehouse );
        setWarehouse(refVal_setWarehouse);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("details"))))
    {
        std::vector<std::shared_ptr<OrdersStatsDetailsDTO>> refVal_setDetails;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("details"))), refVal_setDetails );
        setDetails(refVal_setDetails);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("cisList"))))
    {
        std::vector<utility::string_t> refVal_setCisList;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("cisList"))), refVal_setCisList );
        setCisList(refVal_setCisList);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("initialCount"))))
    {
        int32_t refVal_setInitialCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("initialCount"))), refVal_setInitialCount );
        setInitialCount(refVal_setInitialCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("bidFee"))))
    {
        int32_t refVal_setBidFee;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("bidFee"))), refVal_setBidFee );
        setBidFee(refVal_setBidFee);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("cofinanceThreshold"))))
    {
        double refVal_setCofinanceThreshold;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("cofinanceThreshold"))), refVal_setCofinanceThreshold );
        setCofinanceThreshold(refVal_setCofinanceThreshold);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("cofinanceValue"))))
    {
        double refVal_setCofinanceValue;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("cofinanceValue"))), refVal_setCofinanceValue );
        setCofinanceValue(refVal_setCofinanceValue);
    }
    return ok;
}

utility::string_t OrdersStatsItemDTO::getOfferName() const
{
    return m_OfferName;
}

void OrdersStatsItemDTO::setOfferName(const utility::string_t& value)
{
    m_OfferName = value;
    m_OfferNameIsSet = true;
}

bool OrdersStatsItemDTO::offerNameIsSet() const
{
    return m_OfferNameIsSet;
}

void OrdersStatsItemDTO::unsetOfferName()
{
    m_OfferNameIsSet = false;
}
int64_t OrdersStatsItemDTO::getMarketSku() const
{
    return m_MarketSku;
}

void OrdersStatsItemDTO::setMarketSku(int64_t value)
{
    m_MarketSku = value;
    m_MarketSkuIsSet = true;
}

bool OrdersStatsItemDTO::marketSkuIsSet() const
{
    return m_MarketSkuIsSet;
}

void OrdersStatsItemDTO::unsetMarketSku()
{
    m_MarketSkuIsSet = false;
}
utility::string_t OrdersStatsItemDTO::getShopSku() const
{
    return m_ShopSku;
}

void OrdersStatsItemDTO::setShopSku(const utility::string_t& value)
{
    m_ShopSku = value;
    m_ShopSkuIsSet = true;
}

bool OrdersStatsItemDTO::shopSkuIsSet() const
{
    return m_ShopSkuIsSet;
}

void OrdersStatsItemDTO::unsetShopSku()
{
    m_ShopSkuIsSet = false;
}
int32_t OrdersStatsItemDTO::getCount() const
{
    return m_Count;
}

void OrdersStatsItemDTO::setCount(int32_t value)
{
    m_Count = value;
    m_CountIsSet = true;
}

bool OrdersStatsItemDTO::countIsSet() const
{
    return m_CountIsSet;
}

void OrdersStatsItemDTO::unsetCount()
{
    m_CountIsSet = false;
}
std::vector<std::shared_ptr<OrdersStatsPriceDTO>>& OrdersStatsItemDTO::getPrices()
{
    return m_Prices;
}

void OrdersStatsItemDTO::setPrices(const std::vector<std::shared_ptr<OrdersStatsPriceDTO>>& value)
{
    m_Prices = value;
    m_PricesIsSet = true;
}

bool OrdersStatsItemDTO::pricesIsSet() const
{
    return m_PricesIsSet;
}

void OrdersStatsItemDTO::unsetPrices()
{
    m_PricesIsSet = false;
}
std::shared_ptr<OrdersStatsWarehouseDTO> OrdersStatsItemDTO::getWarehouse() const
{
    return m_Warehouse;
}

void OrdersStatsItemDTO::setWarehouse(const std::shared_ptr<OrdersStatsWarehouseDTO>& value)
{
    m_Warehouse = value;
    m_WarehouseIsSet = true;
}

bool OrdersStatsItemDTO::warehouseIsSet() const
{
    return m_WarehouseIsSet;
}

void OrdersStatsItemDTO::unsetWarehouse()
{
    m_WarehouseIsSet = false;
}
std::vector<std::shared_ptr<OrdersStatsDetailsDTO>>& OrdersStatsItemDTO::getDetails()
{
    return m_Details;
}

void OrdersStatsItemDTO::setDetails(const std::vector<std::shared_ptr<OrdersStatsDetailsDTO>>& value)
{
    m_Details = value;
    m_DetailsIsSet = true;
}

bool OrdersStatsItemDTO::detailsIsSet() const
{
    return m_DetailsIsSet;
}

void OrdersStatsItemDTO::unsetDetails()
{
    m_DetailsIsSet = false;
}
std::vector<utility::string_t>& OrdersStatsItemDTO::getCisList()
{
    return m_CisList;
}

void OrdersStatsItemDTO::setCisList(const std::vector<utility::string_t>& value)
{
    m_CisList = value;
    m_CisListIsSet = true;
}

bool OrdersStatsItemDTO::cisListIsSet() const
{
    return m_CisListIsSet;
}

void OrdersStatsItemDTO::unsetCisList()
{
    m_CisListIsSet = false;
}
int32_t OrdersStatsItemDTO::getInitialCount() const
{
    return m_InitialCount;
}

void OrdersStatsItemDTO::setInitialCount(int32_t value)
{
    m_InitialCount = value;
    m_InitialCountIsSet = true;
}

bool OrdersStatsItemDTO::initialCountIsSet() const
{
    return m_InitialCountIsSet;
}

void OrdersStatsItemDTO::unsetInitialCount()
{
    m_InitialCountIsSet = false;
}
int32_t OrdersStatsItemDTO::getBidFee() const
{
    return m_BidFee;
}

void OrdersStatsItemDTO::setBidFee(int32_t value)
{
    m_BidFee = value;
    m_BidFeeIsSet = true;
}

bool OrdersStatsItemDTO::bidFeeIsSet() const
{
    return m_BidFeeIsSet;
}

void OrdersStatsItemDTO::unsetBidFee()
{
    m_BidFeeIsSet = false;
}
double OrdersStatsItemDTO::getCofinanceThreshold() const
{
    return m_CofinanceThreshold;
}

void OrdersStatsItemDTO::setCofinanceThreshold(double value)
{
    m_CofinanceThreshold = value;
    m_CofinanceThresholdIsSet = true;
}

bool OrdersStatsItemDTO::cofinanceThresholdIsSet() const
{
    return m_CofinanceThresholdIsSet;
}

void OrdersStatsItemDTO::unsetCofinanceThreshold()
{
    m_CofinanceThresholdIsSet = false;
}
double OrdersStatsItemDTO::getCofinanceValue() const
{
    return m_CofinanceValue;
}

void OrdersStatsItemDTO::setCofinanceValue(double value)
{
    m_CofinanceValue = value;
    m_CofinanceValueIsSet = true;
}

bool OrdersStatsItemDTO::cofinanceValueIsSet() const
{
    return m_CofinanceValueIsSet;
}

void OrdersStatsItemDTO::unsetCofinanceValue()
{
    m_CofinanceValueIsSet = false;
}
}
}
}
}


