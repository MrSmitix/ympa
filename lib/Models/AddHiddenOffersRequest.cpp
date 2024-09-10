

#include "AddHiddenOffersRequest.h"

using namespace Tiny;

AddHiddenOffersRequest::AddHiddenOffersRequest()
{
	hiddenOffers = std::list<HiddenOfferDTO>();
}

AddHiddenOffersRequest::AddHiddenOffersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AddHiddenOffersRequest::~AddHiddenOffersRequest()
{

}

void
AddHiddenOffersRequest::fromJson(std::string jsonObj)
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
AddHiddenOffersRequest::toJson()
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
AddHiddenOffersRequest::getHiddenOffers()
{
	return hiddenOffers;
}

void
AddHiddenOffersRequest::setHiddenOffers(std::list <HiddenOfferDTO> hiddenOffers)
{
	this->hiddenOffers = hiddenOffers;
}



