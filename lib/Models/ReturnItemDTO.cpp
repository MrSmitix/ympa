

#include "ReturnItemDTO.h"

using namespace Tiny;

ReturnItemDTO::ReturnItemDTO()
{
	marketSku = long(0);
	shopSku = std::string();
	count = long(0);
	decisions = std::list<ReturnDecisionDTO>();
	instances = std::list<ReturnInstanceDTO>();
	tracks = std::list<TrackDTO>();
}

ReturnItemDTO::ReturnItemDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReturnItemDTO::~ReturnItemDTO()
{

}

void
ReturnItemDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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



        jsonToValue(&count, value, "long");


    }

    const char *decisionsKey = "decisions";

    if(object.has_key(decisionsKey))
    {
        bourne::json value = object[decisionsKey];


        std::list<ReturnDecisionDTO> decisions_list;
        ReturnDecisionDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            decisions_list.push_back(element);
        }
        decisions = decisions_list;


    }

    const char *instancesKey = "instances";

    if(object.has_key(instancesKey))
    {
        bourne::json value = object[instancesKey];


        std::list<ReturnInstanceDTO> instances_list;
        ReturnInstanceDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            instances_list.push_back(element);
        }
        instances = instances_list;


    }

    const char *tracksKey = "tracks";

    if(object.has_key(tracksKey))
    {
        bourne::json value = object[tracksKey];


        std::list<TrackDTO> tracks_list;
        TrackDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tracks_list.push_back(element);
        }
        tracks = tracks_list;


    }


}

bourne::json
ReturnItemDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["marketSku"] = getMarketSku();






    object["shopSku"] = getShopSku();






    object["count"] = getCount();





    std::list<ReturnDecisionDTO> decisions_list = getDecisions();
    bourne::json decisions_arr = bourne::json::array();

    for(auto& var : decisions_list)
    {
        ReturnDecisionDTO obj = var;
        decisions_arr.append(obj.toJson());
    }
    object["decisions"] = decisions_arr;






    std::list<ReturnInstanceDTO> instances_list = getInstances();
    bourne::json instances_arr = bourne::json::array();

    for(auto& var : instances_list)
    {
        ReturnInstanceDTO obj = var;
        instances_arr.append(obj.toJson());
    }
    object["instances"] = instances_arr;






    std::list<TrackDTO> tracks_list = getTracks();
    bourne::json tracks_arr = bourne::json::array();

    for(auto& var : tracks_list)
    {
        TrackDTO obj = var;
        tracks_arr.append(obj.toJson());
    }
    object["tracks"] = tracks_arr;




    return object;

}

long
ReturnItemDTO::getMarketSku()
{
	return marketSku;
}

void
ReturnItemDTO::setMarketSku(long  marketSku)
{
	this->marketSku = marketSku;
}

std::string
ReturnItemDTO::getShopSku()
{
	return shopSku;
}

void
ReturnItemDTO::setShopSku(std::string  shopSku)
{
	this->shopSku = shopSku;
}

long
ReturnItemDTO::getCount()
{
	return count;
}

void
ReturnItemDTO::setCount(long  count)
{
	this->count = count;
}

std::list<ReturnDecisionDTO>
ReturnItemDTO::getDecisions()
{
	return decisions;
}

void
ReturnItemDTO::setDecisions(std::list <ReturnDecisionDTO> decisions)
{
	this->decisions = decisions;
}

std::list<ReturnInstanceDTO>
ReturnItemDTO::getInstances()
{
	return instances;
}

void
ReturnItemDTO::setInstances(std::list <ReturnInstanceDTO> instances)
{
	this->instances = instances;
}

std::list<TrackDTO>
ReturnItemDTO::getTracks()
{
	return tracks;
}

void
ReturnItemDTO::setTracks(std::list <TrackDTO> tracks)
{
	this->tracks = tracks;
}



