

#include "DeleteOffersFromArchiveRequest.h"

using namespace Tiny;

DeleteOffersFromArchiveRequest::DeleteOffersFromArchiveRequest()
{
	offerIds = std::list<std::string>();
}

DeleteOffersFromArchiveRequest::DeleteOffersFromArchiveRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteOffersFromArchiveRequest::~DeleteOffersFromArchiveRequest()
{

}

void
DeleteOffersFromArchiveRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
DeleteOffersFromArchiveRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> offerIds_list = getOfferIds();
    bourne::json offerIds_arr = bourne::json::array();

    for(auto& var : offerIds_list)
    {
        offerIds_arr.append(var);
    }
    object["offerIds"] = offerIds_arr;






    return object;

}

std::list<std::string>
DeleteOffersFromArchiveRequest::getOfferIds()
{
	return offerIds;
}

void
DeleteOffersFromArchiveRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}



