

#include "QualityRatingDTO.h"

using namespace Tiny;

QualityRatingDTO::QualityRatingDTO()
{
	rating = long(0);
	calculationDate = std::string();
	components = std::list<QualityRatingComponentDTO>();
}

QualityRatingDTO::QualityRatingDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

QualityRatingDTO::~QualityRatingDTO()
{

}

void
QualityRatingDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ratingKey = "rating";

    if(object.has_key(ratingKey))
    {
        bourne::json value = object[ratingKey];



        jsonToValue(&rating, value, "long");


    }

    const char *calculationDateKey = "calculationDate";

    if(object.has_key(calculationDateKey))
    {
        bourne::json value = object[calculationDateKey];




        Date* obj = &calculationDate;
		obj->fromJson(value.dump());

    }

    const char *componentsKey = "components";

    if(object.has_key(componentsKey))
    {
        bourne::json value = object[componentsKey];


        std::list<QualityRatingComponentDTO> components_list;
        QualityRatingComponentDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            components_list.push_back(element);
        }
        components = components_list;


    }


}

bourne::json
QualityRatingDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["rating"] = getRating();







	object["calculationDate"] = getCalculationDate().toJson();




    std::list<QualityRatingComponentDTO> components_list = getComponents();
    bourne::json components_arr = bourne::json::array();

    for(auto& var : components_list)
    {
        QualityRatingComponentDTO obj = var;
        components_arr.append(obj.toJson());
    }
    object["components"] = components_arr;




    return object;

}

long
QualityRatingDTO::getRating()
{
	return rating;
}

void
QualityRatingDTO::setRating(long  rating)
{
	this->rating = rating;
}

Date
QualityRatingDTO::getCalculationDate()
{
	return calculationDate;
}

void
QualityRatingDTO::setCalculationDate(Date  calculationDate)
{
	this->calculationDate = calculationDate;
}

std::list<QualityRatingComponentDTO>
QualityRatingDTO::getComponents()
{
	return components;
}

void
QualityRatingDTO::setComponents(std::list <QualityRatingComponentDTO> components)
{
	this->components = components;
}



