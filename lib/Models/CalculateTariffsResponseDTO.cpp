

#include "CalculateTariffsResponseDTO.h"

using namespace Tiny;

CalculateTariffsResponseDTO::CalculateTariffsResponseDTO()
{
	offers = std::list<CalculateTariffsOfferInfoDTO>();
}

CalculateTariffsResponseDTO::CalculateTariffsResponseDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CalculateTariffsResponseDTO::~CalculateTariffsResponseDTO()
{

}

void
CalculateTariffsResponseDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<CalculateTariffsOfferInfoDTO> offers_list;
        CalculateTariffsOfferInfoDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
CalculateTariffsResponseDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CalculateTariffsOfferInfoDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        CalculateTariffsOfferInfoDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

std::list<CalculateTariffsOfferInfoDTO>
CalculateTariffsResponseDTO::getOffers()
{
	return offers;
}

void
CalculateTariffsResponseDTO::setOffers(std::list <CalculateTariffsOfferInfoDTO> offers)
{
	this->offers = offers;
}



