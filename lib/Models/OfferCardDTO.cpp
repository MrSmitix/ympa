

#include "OfferCardDTO.h"

using namespace Tiny;

OfferCardDTO::OfferCardDTO()
{
	offerId = std::string();
	mapping = GetMappingDTO();
	parameterValues = std::list<ParameterValueDTO>();
	cardStatus = OfferCardStatusType();
	contentRating = int(0);
	recommendations = std::list<OfferCardRecommendationDTO>();
	errors = std::list<OfferErrorDTO>();
	warnings = std::list<OfferErrorDTO>();
}

OfferCardDTO::OfferCardDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OfferCardDTO::~OfferCardDTO()
{

}

void
OfferCardDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerIdKey = "offerId";

    if(object.has_key(offerIdKey))
    {
        bourne::json value = object[offerIdKey];



        jsonToValue(&offerId, value, "std::string");


    }

    const char *mappingKey = "mapping";

    if(object.has_key(mappingKey))
    {
        bourne::json value = object[mappingKey];




        GetMappingDTO* obj = &mapping;
		obj->fromJson(value.dump());

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

    const char *cardStatusKey = "cardStatus";

    if(object.has_key(cardStatusKey))
    {
        bourne::json value = object[cardStatusKey];




        OfferCardStatusType* obj = &cardStatus;
		obj->fromJson(value.dump());

    }

    const char *contentRatingKey = "contentRating";

    if(object.has_key(contentRatingKey))
    {
        bourne::json value = object[contentRatingKey];



        jsonToValue(&contentRating, value, "int");


    }

    const char *recommendationsKey = "recommendations";

    if(object.has_key(recommendationsKey))
    {
        bourne::json value = object[recommendationsKey];


        std::list<OfferCardRecommendationDTO> recommendations_list;
        OfferCardRecommendationDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            recommendations_list.push_back(element);
        }
        recommendations = recommendations_list;


    }

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<OfferErrorDTO> errors_list;
        OfferErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }

    const char *warningsKey = "warnings";

    if(object.has_key(warningsKey))
    {
        bourne::json value = object[warningsKey];


        std::list<OfferErrorDTO> warnings_list;
        OfferErrorDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            warnings_list.push_back(element);
        }
        warnings = warnings_list;


    }


}

bourne::json
OfferCardDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerId"] = getOfferId();







	object["mapping"] = getMapping().toJson();




    std::list<ParameterValueDTO> parameterValues_list = getParameterValues();
    bourne::json parameterValues_arr = bourne::json::array();

    for(auto& var : parameterValues_list)
    {
        ParameterValueDTO obj = var;
        parameterValues_arr.append(obj.toJson());
    }
    object["parameterValues"] = parameterValues_arr;








	object["cardStatus"] = getCardStatus().toJson();





    object["contentRating"] = getContentRating();





    std::list<OfferCardRecommendationDTO> recommendations_list = getRecommendations();
    bourne::json recommendations_arr = bourne::json::array();

    for(auto& var : recommendations_list)
    {
        OfferCardRecommendationDTO obj = var;
        recommendations_arr.append(obj.toJson());
    }
    object["recommendations"] = recommendations_arr;






    std::list<OfferErrorDTO> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        OfferErrorDTO obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;






    std::list<OfferErrorDTO> warnings_list = getWarnings();
    bourne::json warnings_arr = bourne::json::array();

    for(auto& var : warnings_list)
    {
        OfferErrorDTO obj = var;
        warnings_arr.append(obj.toJson());
    }
    object["warnings"] = warnings_arr;




    return object;

}

std::string
OfferCardDTO::getOfferId()
{
	return offerId;
}

void
OfferCardDTO::setOfferId(std::string  offerId)
{
	this->offerId = offerId;
}

GetMappingDTO
OfferCardDTO::getMapping()
{
	return mapping;
}

void
OfferCardDTO::setMapping(GetMappingDTO  mapping)
{
	this->mapping = mapping;
}

std::list<ParameterValueDTO>
OfferCardDTO::getParameterValues()
{
	return parameterValues;
}

void
OfferCardDTO::setParameterValues(std::list <ParameterValueDTO> parameterValues)
{
	this->parameterValues = parameterValues;
}

OfferCardStatusType
OfferCardDTO::getCardStatus()
{
	return cardStatus;
}

void
OfferCardDTO::setCardStatus(OfferCardStatusType  cardStatus)
{
	this->cardStatus = cardStatus;
}

int
OfferCardDTO::getContentRating()
{
	return contentRating;
}

void
OfferCardDTO::setContentRating(int  contentRating)
{
	this->contentRating = contentRating;
}

std::list<OfferCardRecommendationDTO>
OfferCardDTO::getRecommendations()
{
	return recommendations;
}

void
OfferCardDTO::setRecommendations(std::list <OfferCardRecommendationDTO> recommendations)
{
	this->recommendations = recommendations;
}

std::list<OfferErrorDTO>
OfferCardDTO::getErrors()
{
	return errors;
}

void
OfferCardDTO::setErrors(std::list <OfferErrorDTO> errors)
{
	this->errors = errors;
}

std::list<OfferErrorDTO>
OfferCardDTO::getWarnings()
{
	return warnings;
}

void
OfferCardDTO::setWarnings(std::list <OfferErrorDTO> warnings)
{
	this->warnings = warnings;
}



