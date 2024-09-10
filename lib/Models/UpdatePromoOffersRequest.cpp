

#include "UpdatePromoOffersRequest.h"

using namespace Tiny;

UpdatePromoOffersRequest::UpdatePromoOffersRequest()
{
	promoId = std::string();
	offers = std::list<UpdatePromoOfferDTO>();
}

UpdatePromoOffersRequest::UpdatePromoOffersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePromoOffersRequest::~UpdatePromoOffersRequest()
{

}

void
UpdatePromoOffersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *promoIdKey = "promoId";

    if(object.has_key(promoIdKey))
    {
        bourne::json value = object[promoIdKey];



        jsonToValue(&promoId, value, "std::string");


    }

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<UpdatePromoOfferDTO> offers_list;
        UpdatePromoOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
UpdatePromoOffersRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["promoId"] = getPromoId();





    std::list<UpdatePromoOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        UpdatePromoOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::string
UpdatePromoOffersRequest::getPromoId()
{
	return promoId;
}

void
UpdatePromoOffersRequest::setPromoId(std::string  promoId)
{
	this->promoId = promoId;
}

std::list<UpdatePromoOfferDTO>
UpdatePromoOffersRequest::getOffers()
{
	return offers;
}

void
UpdatePromoOffersRequest::setOffers(std::list <UpdatePromoOfferDTO> offers)
{
	this->offers = offers;
}



