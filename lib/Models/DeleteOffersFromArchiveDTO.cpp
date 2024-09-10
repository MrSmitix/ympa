

#include "DeleteOffersFromArchiveDTO.h"

using namespace Tiny;

DeleteOffersFromArchiveDTO::DeleteOffersFromArchiveDTO()
{
	notUnarchivedOfferIds = std::list<std::string>();
}

DeleteOffersFromArchiveDTO::DeleteOffersFromArchiveDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteOffersFromArchiveDTO::~DeleteOffersFromArchiveDTO()
{

}

void
DeleteOffersFromArchiveDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *notUnarchivedOfferIdsKey = "notUnarchivedOfferIds";

    if(object.has_key(notUnarchivedOfferIdsKey))
    {
        bourne::json value = object[notUnarchivedOfferIdsKey];


        std::list<std::string> notUnarchivedOfferIds_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            notUnarchivedOfferIds_list.push_back(element);
        }
        notUnarchivedOfferIds = notUnarchivedOfferIds_list;


    }


}

bourne::json
DeleteOffersFromArchiveDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> notUnarchivedOfferIds_list = getNotUnarchivedOfferIds();
    bourne::json notUnarchivedOfferIds_arr = bourne::json::array();

    for(auto& var : notUnarchivedOfferIds_list)
    {
        notUnarchivedOfferIds_arr.append(var);
    }
    object["notUnarchivedOfferIds"] = notUnarchivedOfferIds_arr;






    return object;

}

std::list<std::string>
DeleteOffersFromArchiveDTO::getNotUnarchivedOfferIds()
{
	return notUnarchivedOfferIds;
}

void
DeleteOffersFromArchiveDTO::setNotUnarchivedOfferIds(std::list <std::string> notUnarchivedOfferIds)
{
	this->notUnarchivedOfferIds = notUnarchivedOfferIds;
}



