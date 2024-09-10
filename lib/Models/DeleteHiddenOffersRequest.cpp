

#include "DeleteHiddenOffersRequest.h"

using namespace Tiny;

DeleteHiddenOffersRequest::DeleteHiddenOffersRequest()
{
	hiddenOffers = std::list<HiddenOfferDTO>();
}

DeleteHiddenOffersRequest::DeleteHiddenOffersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteHiddenOffersRequest::~DeleteHiddenOffersRequest()
{

}

void
DeleteHiddenOffersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hiddenOffersKey = "hiddenOffers";

    if(object.has_key(hiddenOffersKey))
    {
        bourne::json value = object[hiddenOffersKey];


        std::list<HiddenOfferDTO> hiddenOffers_list;
        HiddenOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            hiddenOffers_list.push_back(element);
        }
        hiddenOffers = hiddenOffers_list;


    }


}

bourne::json
DeleteHiddenOffersRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<HiddenOfferDTO> hiddenOffers_list = getHiddenOffers();
    bourne::json hiddenOffers_arr = bourne::json::array();

    for(auto& var : hiddenOffers_list)
    {
        HiddenOfferDTO obj = var;
        hiddenOffers_arr.append(obj.toJson());
    }
    object["hiddenOffers"] = hiddenOffers_arr;




    return object;

}

std::list<HiddenOfferDTO>
DeleteHiddenOffersRequest::getHiddenOffers()
{
	return hiddenOffers;
}

void
DeleteHiddenOffersRequest::setHiddenOffers(std::list <HiddenOfferDTO> hiddenOffers)
{
	this->hiddenOffers = hiddenOffers;
}



