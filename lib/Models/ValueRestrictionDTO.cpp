

#include "ValueRestrictionDTO.h"

using namespace Tiny;

ValueRestrictionDTO::ValueRestrictionDTO()
{
	limitingParameterId = long(0);
	limitedValues = std::list<OptionValuesLimitedDTO>();
}

ValueRestrictionDTO::ValueRestrictionDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

ValueRestrictionDTO::~ValueRestrictionDTO()
{

}

void
ValueRestrictionDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *limitingParameterIdKey = "limitingParameterId";

    if(object.has_key(limitingParameterIdKey))
    {
        bourne::json value = object[limitingParameterIdKey];



        jsonToValue(&limitingParameterId, value, "long");


    }

    const char *limitedValuesKey = "limitedValues";

    if(object.has_key(limitedValuesKey))
    {
        bourne::json value = object[limitedValuesKey];


        std::list<OptionValuesLimitedDTO> limitedValues_list;
        OptionValuesLimitedDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            limitedValues_list.push_back(element);
        }
        limitedValues = limitedValues_list;


    }


}

bourne::json
ValueRestrictionDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["limitingParameterId"] = getLimitingParameterId();





    std::list<OptionValuesLimitedDTO> limitedValues_list = getLimitedValues();
    bourne::json limitedValues_arr = bourne::json::array();

    for(auto& var : limitedValues_list)
    {
        OptionValuesLimitedDTO obj = var;
        limitedValues_arr.append(obj.toJson());
    }
    object["limitedValues"] = limitedValues_arr;




    return object;

}

long
ValueRestrictionDTO::getLimitingParameterId()
{
	return limitingParameterId;
}

void
ValueRestrictionDTO::setLimitingParameterId(long  limitingParameterId)
{
	this->limitingParameterId = limitingParameterId;
}

std::list<OptionValuesLimitedDTO>
ValueRestrictionDTO::getLimitedValues()
{
	return limitedValues;
}

void
ValueRestrictionDTO::setLimitedValues(std::list <OptionValuesLimitedDTO> limitedValues)
{
	this->limitedValues = limitedValues;
}



