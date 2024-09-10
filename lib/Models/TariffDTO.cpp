

#include "TariffDTO.h"

using namespace Tiny;

TariffDTO::TariffDTO()
{
	type = TariffType();
	percent = float(0);
	amount = float(0);
	parameters = std::list<TariffParameterDTO>();
}

TariffDTO::TariffDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

TariffDTO::~TariffDTO()
{

}

void
TariffDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        TariffType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *percentKey = "percent";

    if(object.has_key(percentKey))
    {
        bourne::json value = object[percentKey];



        jsonToValue(&percent, value, "long");


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
TariffDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["percent"] = getPercent();






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

TariffType
TariffDTO::getType()
{
	return type;
}

void
TariffDTO::setType(TariffType  type)
{
	this->type = type;
}

long
TariffDTO::getPercent()
{
	return percent;
}

void
TariffDTO::setPercent(long  percent)
{
	this->percent = percent;
}

long
TariffDTO::getAmount()
{
	return amount;
}

void
TariffDTO::setAmount(long  amount)
{
	this->amount = amount;
}

std::list<TariffParameterDTO>
TariffDTO::getParameters()
{
	return parameters;
}

void
TariffDTO::setParameters(std::list <TariffParameterDTO> parameters)
{
	this->parameters = parameters;
}



