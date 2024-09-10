

#include "OfferContentDTO.h"

using namespace Tiny;

OfferContentDTO::OfferContentDTO()
{
	offerId = std::string();
	categoryId = int(0);
	parameterValues = std::list<ParameterValueDTO>();
}

OfferContentDTO::OfferContentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferContentDTO::~OfferContentDTO()
{

}

void
OfferContentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *categoryIdKey = "categoryId";

    if(object.has_key(categoryIdKey))
    {
        bourne::json value = object[categoryIdKey];



        jsonToValue(&categoryId, value, "int");


    }

    const char *parameterValuesKey = "parameterValues";

    if(object.has_key(parameterValuesKey))
    {
        bourne::json value = object[parameterValuesKey];


        std::list<ParameterValueDTO> parameterValues_list;
        ParameterValueDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            parameterValues_list.push_back(element);
        }
        parameterValues = parameterValues_list;


    }


}

bourne::json
OfferContentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();






    object["categoryId"] = getCategoryId();





    std::list<ParameterValueDTO> parameterValues_list = getParameterValues();
    bourne::json parameterValues_arr = bourne::json::array();

    for(auto& var : parameterValues_list)
    {
        ParameterValueDTO obj = var;
        parameterValues_arr.append(obj.toJson());
    }
    object["parameterValues"] = parameterValues_arr;




    return object;

}

std::string
OfferContentDTO::getOfferId()
{
	return offerId;
}

void
OfferContentDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

int
OfferContentDTO::getCategoryId()
{
	return categoryId;
}

void
OfferContentDTO::setCategoryId(int  categoryId)
{
	this->categoryId = categoryId;
}

std::list<ParameterValueDTO>
OfferContentDTO::getParameterValues()
{
	return parameterValues;
}

void
OfferContentDTO::setParameterValues(std::list <ParameterValueDTO> parameterValues)
{
	this->parameterValues = parameterValues;
}



