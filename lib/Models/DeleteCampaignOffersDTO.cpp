

#include "DeleteCampaignOffersDTO.h"

using namespace Tiny;

DeleteCampaignOffersDTO::DeleteCampaignOffersDTO()
{
	notDeletedOfferIds = std::list<std::string>();
}

DeleteCampaignOffersDTO::DeleteCampaignOffersDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteCampaignOffersDTO::~DeleteCampaignOffersDTO()
{

}

void
DeleteCampaignOffersDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *notDeletedOfferIdsKey = "notDeletedOfferIds";

    if(object.has_key(notDeletedOfferIdsKey))
    {
        bourne::json value = object[notDeletedOfferIdsKey];


        std::list<std::string> notDeletedOfferIds_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            notDeletedOfferIds_list.push_back(element);
        }
        notDeletedOfferIds = notDeletedOfferIds_list;


    }


}

bourne::json
DeleteCampaignOffersDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> notDeletedOfferIds_list = getNotDeletedOfferIds();
    bourne::json notDeletedOfferIds_arr = bourne::json::array();

    for(auto& var : notDeletedOfferIds_list)
    {
        notDeletedOfferIds_arr.append(var);
    }
    object["notDeletedOfferIds"] = notDeletedOfferIds_arr;






    return object;

}

std::list<std::string>
DeleteCampaignOffersDTO::getNotDeletedOfferIds()
{
	return notDeletedOfferIds;
}

void
DeleteCampaignOffersDTO::setNotDeletedOfferIds(std::list <std::string> notDeletedOfferIds)
{
	this->notDeletedOfferIds = notDeletedOfferIds;
}



