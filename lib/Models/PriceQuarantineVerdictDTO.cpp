

#include "PriceQuarantineVerdictDTO.h"

using namespace Tiny;

PriceQuarantineVerdictDTO::PriceQuarantineVerdictDTO()
{
	type = PriceQuarantineVerdictType();
	params = std::list<PriceQuarantineVerdictParameterDTO>();
}

PriceQuarantineVerdictDTO::PriceQuarantineVerdictDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceQuarantineVerdictDTO::~PriceQuarantineVerdictDTO()
{

}

void
PriceQuarantineVerdictDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        PriceQuarantineVerdictType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *paramsKey = "params";

    if(object.has_key(paramsKey))
    {
        bourne::json value = object[paramsKey];


        std::list<PriceQuarantineVerdictParameterDTO> params_list;
        PriceQuarantineVerdictParameterDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            params_list.push_back(element);
        }
        params = params_list;


    }


}

bourne::json
PriceQuarantineVerdictDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();




    std::list<PriceQuarantineVerdictParameterDTO> params_list = getParams();
    bourne::json params_arr = bourne::json::array();

    for(auto& var : params_list)
    {
        PriceQuarantineVerdictParameterDTO obj = var;
        params_arr.append(obj.toJson());
    }
    object["params"] = params_arr;




    return object;

}

PriceQuarantineVerdictType
PriceQuarantineVerdictDTO::getType()
{
	return type;
}

void
PriceQuarantineVerdictDTO::setType(PriceQuarantineVerdictType  type)
{
	this->type = type;
}

std::list<PriceQuarantineVerdictParameterDTO>
PriceQuarantineVerdictDTO::getParams()
{
	return params;
}

void
PriceQuarantineVerdictDTO::setParams(std::list <PriceQuarantineVerdictParameterDTO> params)
{
	this->params = params;
}



