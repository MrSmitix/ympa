

#include "CalculateTariffsRequest.h"

using namespace Tiny;

CalculateTariffsRequest::CalculateTariffsRequest()
{
	parameters = CalculateTariffsParametersDTO();
	offers = std::list<CalculateTariffsOfferDTO>();
}

CalculateTariffsRequest::CalculateTariffsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CalculateTariffsRequest::~CalculateTariffsRequest()
{

}

void
CalculateTariffsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *parametersKey = "parameters";

    if(object.has_key(parametersKey))
    {
        bourne::json value = object[parametersKey];




        CalculateTariffsParametersDTO* obj = &parameters;
		obj->fromJson(value.dump());

    }

    const char *offersKey = "offers";

    if(object.has_key(offersKey))
    {
        bourne::json value = object[offersKey];


        std::list<CalculateTariffsOfferDTO> offers_list;
        CalculateTariffsOfferDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            offers_list.push_back(element);
        }
        offers = offers_list;


    }


}

bourne::json
CalculateTariffsRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["parameters"] = getParameters().toJson();




    std::list<CalculateTariffsOfferDTO> offers_list = getOffers();
    bourne::json offers_arr = bourne::json::array();

    for(auto& var : offers_list)
    {
        CalculateTariffsOfferDTO obj = var;
        offers_arr.append(obj.toJson());
    }
    object["offers"] = offers_arr;




    return object;

}

CalculateTariffsParametersDTO
CalculateTariffsRequest::getParameters()
{
	return parameters;
}

void
CalculateTariffsRequest::setParameters(CalculateTariffsParametersDTO  parameters)
{
	this->parameters = parameters;
}

std::list<CalculateTariffsOfferDTO>
CalculateTariffsRequest::getOffers()
{
	return offers;
}

void
CalculateTariffsRequest::setOffers(std::list <CalculateTariffsOfferDTO> offers)
{
	this->offers = offers;
}



