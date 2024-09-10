

#include "DeleteOffersRequest.h"

using namespace Tiny;

DeleteOffersRequest::DeleteOffersRequest()
{
	offerIds = std::list<std::string>();
}

DeleteOffersRequest::DeleteOffersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteOffersRequest::~DeleteOffersRequest()
{

}

void
DeleteOffersRequest::fromJson(std::string jsonObj)
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
DeleteOffersRequest::toJson()
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
DeleteOffersRequest::getOfferIds()
{
	return offerIds;
}

void
DeleteOffersRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}



