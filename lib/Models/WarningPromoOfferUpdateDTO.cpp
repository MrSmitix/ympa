

#include "WarningPromoOfferUpdateDTO.h"

using namespace Tiny;

WarningPromoOfferUpdateDTO::WarningPromoOfferUpdateDTO()
{
	offerId = std::string();
	warnings = std::list<PromoOfferUpdateWarningDTO>();
}

WarningPromoOfferUpdateDTO::WarningPromoOfferUpdateDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

WarningPromoOfferUpdateDTO::~WarningPromoOfferUpdateDTO()
{

}

void
WarningPromoOfferUpdateDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *warningsKey = "warnings";

    if(object.has_key(warningsKey))
    {
        bourne::json value = object[warningsKey];


        std::list<PromoOfferUpdateWarningDTO> warnings_list;
        PromoOfferUpdateWarningDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warnings_list.push_back(element);
        }
        warnings = warnings_list;


    }


}

bourne::json
WarningPromoOfferUpdateDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();





    std::list<PromoOfferUpdateWarningDTO> warnings_list = getWarnings();
    bourne::json warnings_arr = bourne::json::array();

    for(auto& var : warnings_list)
    {
        PromoOfferUpdateWarningDTO obj = var;
        warnings_arr.append(obj.toJson());
    }
    object["warnings"] = warnings_arr;




    return object;

}

std::string
WarningPromoOfferUpdateDTO::getOfferId()
{
	return offerId;
}

void
WarningPromoOfferUpdateDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

std::list<PromoOfferUpdateWarningDTO>
WarningPromoOfferUpdateDTO::getWarnings()
{
	return warnings;
}

void
WarningPromoOfferUpdateDTO::setWarnings(std::list <PromoOfferUpdateWarningDTO> warnings)
{
	this->warnings = warnings;
}



