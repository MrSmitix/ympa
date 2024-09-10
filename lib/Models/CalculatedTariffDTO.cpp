

#include "CalculatedTariffDTO.h"

using namespace Tiny;

CalculatedTariffDTO::CalculatedTariffDTO()
{
	type = CalculatedTariffType();
	amount = float(0);
	parameters = std::list<TariffParameterDTO>();
}

CalculatedTariffDTO::CalculatedTariffDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CalculatedTariffDTO::~CalculatedTariffDTO()
{

}

void
CalculatedTariffDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        CalculatedTariffType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *amountKey = "amount";

    if(object.has_key(amountKey))
    {
        bourne::json value = object[amountKey];



        jsonToValue(&amount, value, "long");


    }

    const char *parametersKey = "parameters";

    if(object.has_key(parametersKey))
    {
        bourne::json value = object[parametersKey];


        std::list<TariffParameterDTO> parameters_list;
        TariffParameterDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            parameters_list.push_back(element);
        }
        parameters = parameters_list;


    }


}

bourne::json
CalculatedTariffDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["amount"] = getAmount();





    std::list<TariffParameterDTO> parameters_list = getParameters();
    bourne::json parameters_arr = bourne::json::array();

    for(auto& var : parameters_list)
    {
        TariffParameterDTO obj = var;
        parameters_arr.append(obj.toJson());
    }
    object["parameters"] = parameters_arr;




    return object;

}

CalculatedTariffType
CalculatedTariffDTO::getType()
{
	return type;
}

void
CalculatedTariffDTO::setType(CalculatedTariffType  type)
{
	this->type = type;
}

long
CalculatedTariffDTO::getAmount()
{
	return amount;
}

void
CalculatedTariffDTO::setAmount(long  amount)
{
	this->amount = amount;
}

std::list<TariffParameterDTO>
CalculatedTariffDTO::getParameters()
{
	return parameters;
}

void
CalculatedTariffDTO::setParameters(std::list <TariffParameterDTO> parameters)
{
	this->parameters = parameters;
}



