

#include "CalculateTariffsOfferInfoDTO.h"

using namespace Tiny;

CalculateTariffsOfferInfoDTO::CalculateTariffsOfferInfoDTO()
{
	offer = CalculateTariffsOfferDTO();
	tariffs = std::list<CalculatedTariffDTO>();
}

CalculateTariffsOfferInfoDTO::CalculateTariffsOfferInfoDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CalculateTariffsOfferInfoDTO::~CalculateTariffsOfferInfoDTO()
{

}

void
CalculateTariffsOfferInfoDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerKey = "offer";

    if(object.has_key(offerKey))
    {
        bourne::json value = object[offerKey];




        CalculateTariffsOfferDTO* obj = &offer;
		obj->fromJson(value.dump());

    }

    const char *tariffsKey = "tariffs";

    if(object.has_key(tariffsKey))
    {
        bourne::json value = object[tariffsKey];


        std::list<CalculatedTariffDTO> tariffs_list;
        CalculatedTariffDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tariffs_list.push_back(element);
        }
        tariffs = tariffs_list;


    }


}

bourne::json
CalculateTariffsOfferInfoDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["offer"] = getOffer().toJson();




    std::list<CalculatedTariffDTO> tariffs_list = getTariffs();
    bourne::json tariffs_arr = bourne::json::array();

    for(auto& var : tariffs_list)
    {
        CalculatedTariffDTO obj = var;
        tariffs_arr.append(obj.toJson());
    }
    object["tariffs"] = tariffs_arr;




    return object;

}

CalculateTariffsOfferDTO
CalculateTariffsOfferInfoDTO::getOffer()
{
	return offer;
}

void
CalculateTariffsOfferInfoDTO::setOffer(CalculateTariffsOfferDTO  offer)
{
	this->offer = offer;
}

std::list<CalculatedTariffDTO>
CalculateTariffsOfferInfoDTO::getTariffs()
{
	return tariffs;
}

void
CalculateTariffsOfferInfoDTO::setTariffs(std::list <CalculatedTariffDTO> tariffs)
{
	this->tariffs = tariffs;
}



