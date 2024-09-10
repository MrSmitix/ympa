

#include "OptionValuesLimitedDTO.h"

using namespace Tiny;

OptionValuesLimitedDTO::OptionValuesLimitedDTO()
{
	limitingOptionValueId = long(0);
	optionValueIds = std::list<long>();
}

OptionValuesLimitedDTO::OptionValuesLimitedDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OptionValuesLimitedDTO::~OptionValuesLimitedDTO()
{

}

void
OptionValuesLimitedDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *limitingOptionValueIdKey = "limitingOptionValueId";

    if(object.has_key(limitingOptionValueIdKey))
    {
        bourne::json value = object[limitingOptionValueIdKey];



        jsonToValue(&limitingOptionValueId, value, "long");


    }

    const char *optionValueIdsKey = "optionValueIds";

    if(object.has_key(optionValueIdsKey))
    {
        bourne::json value = object[optionValueIdsKey];


        std::list<long> optionValueIds_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            optionValueIds_list.push_back(element);
        }
        optionValueIds = optionValueIds_list;


    }


}

bourne::json
OptionValuesLimitedDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["limitingOptionValueId"] = getLimitingOptionValueId();





    std::list<long> optionValueIds_list = getOptionValueIds();
    bourne::json optionValueIds_arr = bourne::json::array();

    for(auto& var : optionValueIds_list)
    {
        optionValueIds_arr.append(var);
    }
    object["optionValueIds"] = optionValueIds_arr;






    return object;

}

long
OptionValuesLimitedDTO::getLimitingOptionValueId()
{
	return limitingOptionValueId;
}

void
OptionValuesLimitedDTO::setLimitingOptionValueId(long  limitingOptionValueId)
{
	this->limitingOptionValueId = limitingOptionValueId;
}

std::list<long>
OptionValuesLimitedDTO::getOptionValueIds()
{
	return optionValueIds;
}

void
OptionValuesLimitedDTO::setOptionValueIds(std::list <long> optionValueIds)
{
	this->optionValueIds = optionValueIds;
}



