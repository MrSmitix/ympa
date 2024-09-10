

#include "OfferCardRecommendationDTO.h"

using namespace Tiny;

OfferCardRecommendationDTO::OfferCardRecommendationDTO()
{
	type = OfferCardRecommendationType();
	percent = int(0);
}

OfferCardRecommendationDTO::OfferCardRecommendationDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferCardRecommendationDTO::~OfferCardRecommendationDTO()
{

}

void
OfferCardRecommendationDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        OfferCardRecommendationType* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *percentKey = "percent";

    if(object.has_key(percentKey))
    {
        bourne::json value = object[percentKey];



        jsonToValue(&percent, value, "int");


    }


}

bourne::json
OfferCardRecommendationDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["type"] = getType().toJson();





    object["percent"] = getPercent();



    return object;

}

OfferCardRecommendationType
OfferCardRecommendationDTO::getType()
{
	return type;
}

void
OfferCardRecommendationDTO::setType(OfferCardRecommendationType  type)
{
	this->type = type;
}

int
OfferCardRecommendationDTO::getPercent()
{
	return percent;
}

void
OfferCardRecommendationDTO::setPercent(int  percent)
{
	this->percent = percent;
}



