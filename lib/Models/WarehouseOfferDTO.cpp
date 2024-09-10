

#include "WarehouseOfferDTO.h"

using namespace Tiny;

WarehouseOfferDTO::WarehouseOfferDTO()
{
	offerId = std::string();
	turnoverSummary = TurnoverDTO();
	stocks = std::list<WarehouseStockDTO>();
	updatedAt = std::string();
}

WarehouseOfferDTO::WarehouseOfferDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarehouseOfferDTO::~WarehouseOfferDTO()
{

}

void
WarehouseOfferDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *turnoverSummaryKey = "turnoverSummary";

    if(object.has_key(turnoverSummaryKey))
    {
        bourne::json value = object[turnoverSummaryKey];




        TurnoverDTO* obj = &turnoverSummary;
		obj->fromJson(value.dump());

    }

    const char *stocksKey = "stocks";

    if(object.has_key(stocksKey))
    {
        bourne::json value = object[stocksKey];


        std::list<WarehouseStockDTO> stocks_list;
        WarehouseStockDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            stocks_list.push_back(element);
        }
        stocks = stocks_list;


    }

    const char *updatedAtKey = "updatedAt";

    if(object.has_key(updatedAtKey))
    {
        bourne::json value = object[updatedAtKey];



        jsonToValue(&updatedAt, value, "std::string");


    }


}

bourne::json
WarehouseOfferDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["turnoverSummary"] = getTurnoverSummary().toJson();




    std::list<WarehouseStockDTO> stocks_list = getStocks();
    bourne::json stocks_arr = bourne::json::array();

    for(auto& var : stocks_list)
    {
        WarehouseStockDTO obj = var;
        stocks_arr.append(obj.toJson());
    }
    object["stocks"] = stocks_arr;







    object["updatedAt"] = getUpdatedAt();



    return object;

}

std::string
WarehouseOfferDTO::getOfferId()
{
	return offerId;
}

void
WarehouseOfferDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

TurnoverDTO
WarehouseOfferDTO::getTurnoverSummary()
{
	return turnoverSummary;
}

void
WarehouseOfferDTO::setTurnoverSummary(TurnoverDTO  turnoverSummary)
{
	this->turnoverSummary = turnoverSummary;
}

std::list<WarehouseStockDTO>
WarehouseOfferDTO::getStocks()
{
	return stocks;
}

void
WarehouseOfferDTO::setStocks(std::list <WarehouseStockDTO> stocks)
{
	this->stocks = stocks;
}

std::string
WarehouseOfferDTO::getUpdatedAt()
{
	return updatedAt;
}

void
WarehouseOfferDTO::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}



