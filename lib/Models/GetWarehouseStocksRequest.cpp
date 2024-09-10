

#include "GetWarehouseStocksRequest.h"

using namespace Tiny;

GetWarehouseStocksRequest::GetWarehouseStocksRequest()
{
	withTurnover = bool(false);
	archived = bool(false);
	offerIds = std::list<std::string>();
}

GetWarehouseStocksRequest::GetWarehouseStocksRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetWarehouseStocksRequest::~GetWarehouseStocksRequest()
{

}

void
GetWarehouseStocksRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *withTurnoverKey = "withTurnover";

    if(object.has_key(withTurnoverKey))
    {
        bourne::json value = object[withTurnoverKey];



        jsonToValue(&withTurnover, value, "bool");


    }

    const char *archivedKey = "archived";

    if(object.has_key(archivedKey))
    {
        bourne::json value = object[archivedKey];



        jsonToValue(&archived, value, "bool");


    }

    const char *offerIdsKey = "offerIds";

    if(object.has_key(offerIdsKey))
    {
        bourne::json value = object[offerIdsKey];


        std::list<std::string> offerIds_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            offerIds_list.push_back(element);
        }
        offerIds = offerIds_list;


    }


}

bourne::json
GetWarehouseStocksRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["withTurnover"] = isWithTurnover();






    object["archived"] = isArchived();





    std::list<std::string> offerIds_list = getOfferIds();
    bourne::json offerIds_arr = bourne::json::array();

    for(auto& var : offerIds_list)
    {
        offerIds_arr.append(var);
    }
    object["offerIds"] = offerIds_arr;






    return object;

}

bool
GetWarehouseStocksRequest::isWithTurnover()
{
	return withTurnover;
}

void
GetWarehouseStocksRequest::setWithTurnover(bool  withTurnover)
{
	this->withTurnover = withTurnover;
}

bool
GetWarehouseStocksRequest::isArchived()
{
	return archived;
}

void
GetWarehouseStocksRequest::setArchived(bool  archived)
{
	this->archived = archived;
}

Set<std::string>
GetWarehouseStocksRequest::getOfferIds()
{
	return offerIds;
}

void
GetWarehouseStocksRequest::setOfferIds(Set <std::string> offerIds)
{
	this->offerIds = offerIds;
}



