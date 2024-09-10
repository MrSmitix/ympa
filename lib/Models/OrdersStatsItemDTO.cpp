

#include "OrdersStatsItemDTO.h"

using namespace Tiny;

OrdersStatsItemDTO::OrdersStatsItemDTO()
{
	offerName = std::string();
	marketSku = long(0);
	shopSku = std::string();
	count = int(0);
	prices = std::list<OrdersStatsPriceDTO>();
	warehouse = OrdersStatsWarehouseDTO();
	details = std::list<OrdersStatsDetailsDTO>();
	cisList = std::list<std::string>();
	initialCount = int(0);
	bidFee = int(0);
	cofinanceThreshold = float(0);
	cofinanceValue = float(0);
}

OrdersStatsItemDTO::OrdersStatsItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrdersStatsItemDTO::~OrdersStatsItemDTO()
{

}

void
OrdersStatsItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerNameKey = "offerName";

    if(object.has_key(offerNameKey))
    {
        bourne::json value = object[offerNameKey];



        jsonToValue(&offerName, value, "std::string");


    }

    const char *marketSkuKey = "marketSku";

    if(object.has_key(marketSkuKey))
    {
        bourne::json value = object[marketSkuKey];



        jsonToValue(&marketSku, value, "long");


    }

    const char *shopSkuKey = "shopSku";

    if(object.has_key(shopSkuKey))
    {
        bourne::json value = object[shopSkuKey];



        jsonToValue(&shopSku, value, "std::string");


    }

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *pricesKey = "prices";

    if(object.has_key(pricesKey))
    {
        bourne::json value = object[pricesKey];


        std::list<OrdersStatsPriceDTO> prices_list;
        OrdersStatsPriceDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            prices_list.push_back(element);
        }
        prices = prices_list;


    }

    const char *warehouseKey = "warehouse";

    if(object.has_key(warehouseKey))
    {
        bourne::json value = object[warehouseKey];




        OrdersStatsWarehouseDTO* obj = &warehouse;
		obj->fromJson(value.dump());

    }

    const char *detailsKey = "details";

    if(object.has_key(detailsKey))
    {
        bourne::json value = object[detailsKey];


        std::list<OrdersStatsDetailsDTO> details_list;
        OrdersStatsDetailsDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            details_list.push_back(element);
        }
        details = details_list;


    }

    const char *cisListKey = "cisList";

    if(object.has_key(cisListKey))
    {
        bourne::json value = object[cisListKey];


        std::list<std::string> cisList_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            cisList_list.push_back(element);
        }
        cisList = cisList_list;


    }

    const char *initialCountKey = "initialCount";

    if(object.has_key(initialCountKey))
    {
        bourne::json value = object[initialCountKey];



        jsonToValue(&initialCount, value, "int");


    }

    const char *bidFeeKey = "bidFee";

    if(object.has_key(bidFeeKey))
    {
        bourne::json value = object[bidFeeKey];



        jsonToValue(&bidFee, value, "int");


    }

    const char *cofinanceThresholdKey = "cofinanceThreshold";

    if(object.has_key(cofinanceThresholdKey))
    {
        bourne::json value = object[cofinanceThresholdKey];



        jsonToValue(&cofinanceThreshold, value, "long");


    }

    const char *cofinanceValueKey = "cofinanceValue";

    if(object.has_key(cofinanceValueKey))
    {
        bourne::json value = object[cofinanceValueKey];



        jsonToValue(&cofinanceValue, value, "long");


    }


}

bourne::json
OrdersStatsItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerName"] = getOfferName();






    object["marketSku"] = getMarketSku();






    object["shopSku"] = getShopSku();






    object["count"] = getCount();





    std::list<OrdersStatsPriceDTO> prices_list = getPrices();
    bourne::json prices_arr = bourne::json::array();

    for(auto& var : prices_list)
    {
        OrdersStatsPriceDTO obj = var;
        prices_arr.append(obj.toJson());
    }
    object["prices"] = prices_arr;








	object["warehouse"] = getWarehouse().toJson();




    std::list<OrdersStatsDetailsDTO> details_list = getDetails();
    bourne::json details_arr = bourne::json::array();

    for(auto& var : details_list)
    {
        OrdersStatsDetailsDTO obj = var;
        details_arr.append(obj.toJson());
    }
    object["details"] = details_arr;






    std::list<std::string> cisList_list = getCisList();
    bourne::json cisList_arr = bourne::json::array();

    for(auto& var : cisList_list)
    {
        cisList_arr.append(var);
    }
    object["cisList"] = cisList_arr;









    object["initialCount"] = getInitialCount();






    object["bidFee"] = getBidFee();






    object["cofinanceThreshold"] = getCofinanceThreshold();






    object["cofinanceValue"] = getCofinanceValue();



    return object;

}

std::string
OrdersStatsItemDTO::getOfferName()
{
	return offerName;
}

void
OrdersStatsItemDTO::setOfferName(std::string  offerName)
{
	this->offerName = offerName;
}

long
OrdersStatsItemDTO::getMarketSku()
{
	return marketSku;
}

void
OrdersStatsItemDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
OrdersStatsItemDTO::getShopSku()
{
	return shopSku;
}

void
OrdersStatsItemDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

int
OrdersStatsItemDTO::getCount()
{
	return count;
}

void
OrdersStatsItemDTO::setCount(int  count)
{
	this->count = count;
}

std::list<OrdersStatsPriceDTO>
OrdersStatsItemDTO::getPrices()
{
	return prices;
}

void
OrdersStatsItemDTO::setPrices(std::list <OrdersStatsPriceDTO> prices)
{
	this->prices = prices;
}

OrdersStatsWarehouseDTO
OrdersStatsItemDTO::getWarehouse()
{
	return warehouse;
}

void
OrdersStatsItemDTO::setWarehouse(OrdersStatsWarehouseDTO  warehouse)
{
	this->warehouse = warehouse;
}

std::list<OrdersStatsDetailsDTO>
OrdersStatsItemDTO::getDetails()
{
	return details;
}

void
OrdersStatsItemDTO::setDetails(std::list <OrdersStatsDetailsDTO> details)
{
	this->details = details;
}

std::list<std::string>
OrdersStatsItemDTO::getCisList()
{
	return cisList;
}

void
OrdersStatsItemDTO::setCisList(std::list <std::string> cisList)
{
	this->cisList = cisList;
}

int
OrdersStatsItemDTO::getInitialCount()
{
	return initialCount;
}

void
OrdersStatsItemDTO::setInitialCount(int  initialCount)
{
	this->initialCount = initialCount;
}

int
OrdersStatsItemDTO::getBidFee()
{
	return bidFee;
}

void
OrdersStatsItemDTO::setBidFee(int  bidFee)
{
	this->bidFee = bidFee;
}

long
OrdersStatsItemDTO::getCofinanceThreshold()
{
	return cofinanceThreshold;
}

void
OrdersStatsItemDTO::setCofinanceThreshold(long  cofinanceThreshold)
{
	this->cofinanceThreshold = cofinanceThreshold;
}

long
OrdersStatsItemDTO::getCofinanceValue()
{
	return cofinanceValue;
}

void
OrdersStatsItemDTO::setCofinanceValue(long  cofinanceValue)
{
	this->cofinanceValue = cofinanceValue;
}



