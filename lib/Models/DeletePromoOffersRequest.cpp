

#include "DeletePromoOffersRequest.h"

using namespace Tiny;

DeletePromoOffersRequest::DeletePromoOffersRequest()
{
	promoId = std::string();
	deleteAllOffers = bool(false);
	offerIds = std::list<std::string>();
}

DeletePromoOffersRequest::DeletePromoOffersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePromoOffersRequest::~DeletePromoOffersRequest()
{

}

void
DeletePromoOffersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *promoIdKey = "promoId";

    if(object.has_key(promoIdKey))
    {
        bourne::json value = object[promoIdKey];



        jsonToValue(&promoId, value, "std::string");


    }

    const char *deleteAllOffersKey = "deleteAllOffers";

    if(object.has_key(deleteAllOffersKey))
    {
        bourne::json value = object[deleteAllOffersKey];



        jsonToValue(&deleteAllOffers, value, "bool");


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
DeletePromoOffersRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["promoId"] = getPromoId();






    object["deleteAllOffers"] = isDeleteAllOffers();





    std::list<std::string> offerIds_list = getOfferIds();
    bourne::json offerIds_arr = bourne::json::array();

    for(auto& var : offerIds_list)
    {
        offerIds_arr.append(var);
    }
    object["offerIds"] = offerIds_arr;






    return object;

}

std::string
DeletePromoOffersRequest::getPromoId()
{
	return promoId;
}

void
DeletePromoOffersRequest::setPromoId(std::string  promoId)
{
	this->promoId = promoId;
}

bool
DeletePromoOffersRequest::isDeleteAllOffers()
{
	return deleteAllOffers;
}

void
DeletePromoOffersRequest::setDeleteAllOffers(bool  deleteAllOffers)
{
	this->deleteAllOffers = deleteAllOffers;
}

std::list<std::string>
DeletePromoOffersRequest::getOfferIds()
{
	return offerIds;
}

void
DeletePromoOffersRequest::setOfferIds(std::list <std::string> offerIds)
{
	this->offerIds = offerIds;
}



