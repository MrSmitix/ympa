

#include "QualityRatingDetailsDTO.h"

using namespace Tiny;

QualityRatingDetailsDTO::QualityRatingDetailsDTO()
{
	affectedOrders = std::list<QualityRatingAffectedOrderDTO>();
}

QualityRatingDetailsDTO::QualityRatingDetailsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

QualityRatingDetailsDTO::~QualityRatingDetailsDTO()
{

}

void
QualityRatingDetailsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *affectedOrdersKey = "affectedOrders";

    if(object.has_key(affectedOrdersKey))
    {
        bourne::json value = object[affectedOrdersKey];


        std::list<QualityRatingAffectedOrderDTO> affectedOrders_list;
        QualityRatingAffectedOrderDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            affectedOrders_list.push_back(element);
        }
        affectedOrders = affectedOrders_list;


    }


}

bourne::json
QualityRatingDetailsDTO::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<QualityRatingAffectedOrderDTO> affectedOrders_list = getAffectedOrders();
    bourne::json affectedOrders_arr = bourne::json::array();

    for(auto& var : affectedOrders_list)
    {
        QualityRatingAffectedOrderDTO obj = var;
        affectedOrders_arr.append(obj.toJson());
    }
    object["affectedOrders"] = affectedOrders_arr;




    return object;

}

std::list<QualityRatingAffectedOrderDTO>
QualityRatingDetailsDTO::getAffectedOrders()
{
	return affectedOrders;
}

void
QualityRatingDetailsDTO::setAffectedOrders(std::list <QualityRatingAffectedOrderDTO> affectedOrders)
{
	this->affectedOrders = affectedOrders;
}



