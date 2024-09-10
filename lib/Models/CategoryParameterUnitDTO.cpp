

#include "CategoryParameterUnitDTO.h"

using namespace Tiny;

CategoryParameterUnitDTO::CategoryParameterUnitDTO()
{
	defaultUnitId = long(0);
	units = std::list<UnitDTO>();
}

CategoryParameterUnitDTO::CategoryParameterUnitDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

CategoryParameterUnitDTO::~CategoryParameterUnitDTO()
{

}

void
CategoryParameterUnitDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *defaultUnitIdKey = "defaultUnitId";

    if(object.has_key(defaultUnitIdKey))
    {
        bourne::json value = object[defaultUnitIdKey];



        jsonToValue(&defaultUnitId, value, "long");


    }

    const char *unitsKey = "units";

    if(object.has_key(unitsKey))
    {
        bourne::json value = object[unitsKey];


        std::list<UnitDTO> units_list;
        UnitDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            units_list.push_back(element);
        }
        units = units_list;


    }


}

bourne::json
CategoryParameterUnitDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["defaultUnitId"] = getDefaultUnitId();





    std::list<UnitDTO> units_list = getUnits();
    bourne::json units_arr = bourne::json::array();

    for(auto& var : units_list)
    {
        UnitDTO obj = var;
        units_arr.append(obj.toJson());
    }
    object["units"] = units_arr;




    return object;

}

long
CategoryParameterUnitDTO::getDefaultUnitId()
{
	return defaultUnitId;
}

void
CategoryParameterUnitDTO::setDefaultUnitId(long  defaultUnitId)
{
	this->defaultUnitId = defaultUnitId;
}

std::list<UnitDTO>
CategoryParameterUnitDTO::getUnits()
{
	return units;
}

void
CategoryParameterUnitDTO::setUnits(std::list <UnitDTO> units)
{
	this->units = units;
}



