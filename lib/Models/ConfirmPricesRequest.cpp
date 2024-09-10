

#include "ConfirmPricesRequest.h"

using namespace Tiny;

ConfirmPricesRequest::ConfirmPricesRequest()
{
	offerIds = std::list<std::string>();
}

ConfirmPricesRequest::ConfirmPricesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConfirmPricesRequest::~ConfirmPricesRequest()
{

}

void
ConfirmPricesRequest::fromJson(std::string jsonObj)
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
ConfirmPricesRequest::toJson()
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
ConfirmPricesRequest::getOfferIds()
{
	return offerIds;
}

void
ConfirmPricesRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}



