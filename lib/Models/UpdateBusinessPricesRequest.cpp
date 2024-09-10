

#include "UpdateBusinessPricesRequest.h"

using namespace Tiny;

UpdateBusinessPricesRequest::UpdateBusinessPricesRequest()
{
	offers = std::list<UpdateBusinessOfferPriceDTO>();
}

UpdateBusinessPricesRequest::UpdateBusinessPricesRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateBusinessPricesRequest::~UpdateBusinessPricesRequest()
{

}

void
UpdateBusinessPricesRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<UpdateBusinessOfferPriceDTO> offers_list;
        UpdateBusinessOfferPriceDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
UpdateBusinessPricesRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateBusinessOfferPriceDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        UpdateBusinessOfferPriceDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<UpdateBusinessOfferPriceDTO>
UpdateBusinessPricesRequest::getOffers()
{
	return offers;
}

void
UpdateBusinessPricesRequest::setOffers(std::list <UpdateBusinessOfferPriceDTO> offers)
{
	this->offers = offers;
}



