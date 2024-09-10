

#include "OrderLabelDTO.h"

using namespace Tiny;

OrderLabelDTO::OrderLabelDTO()
{
	orderId = long(0);
	placesNumber = int(0);
	url = std::string();
	parcelBoxLabels = std::list<ParcelBoxLabelDTO>();
}

OrderLabelDTO::OrderLabelDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLabelDTO::~OrderLabelDTO()
{

}

void
OrderLabelDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orderIdKey = "orderId";

    if(object.has_key(orderIdKey))
    {
        bourne::json value = object[orderIdKey];



        jsonToValue(&orderId, value, "long");


    }

    const char *placesNumberKey = "placesNumber";

    if(object.has_key(placesNumberKey))
    {
        bourne::json value = object[placesNumberKey];



        jsonToValue(&placesNumber, value, "int");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *parcelBoxLabelsKey = "parcelBoxLabels";

    if(object.has_key(parcelBoxLabelsKey))
    {
        bourne::json value = object[parcelBoxLabelsKey];


        std::list<ParcelBoxLabelDTO> parcelBoxLabels_list;
        ParcelBoxLabelDTO element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            parcelBoxLabels_list.push_back(element);
        }
        parcelBoxLabels = parcelBoxLabels_list;


    }


}

bourne::json
OrderLabelDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["orderId"] = getOrderId();






    object["placesNumber"] = getPlacesNumber();






    object["url"] = getUrl();





    std::list<ParcelBoxLabelDTO> parcelBoxLabels_list = getParcelBoxLabels();
    bourne::json parcelBoxLabels_arr = bourne::json::array();

    for(auto& var : parcelBoxLabels_list)
    {
        ParcelBoxLabelDTO obj = var;
        parcelBoxLabels_arr.append(obj.toJson());
    }
    object["parcelBoxLabels"] = parcelBoxLabels_arr;




    return object;

}

long
OrderLabelDTO::getOrderId()
{
	return orderId;
}

void
OrderLabelDTO::setOrderId(long  orderId)
{
	this->orderId = orderId;
}

int
OrderLabelDTO::getPlacesNumber()
{
	return placesNumber;
}

void
OrderLabelDTO::setPlacesNumber(int  placesNumber)
{
	this->placesNumber = placesNumber;
}

std::string
OrderLabelDTO::getUrl()
{
	return url;
}

void
OrderLabelDTO::setUrl(std::string  url)
{
	this->url = url;
}

std::list<ParcelBoxLabelDTO>
OrderLabelDTO::getParcelBoxLabels()
{
	return parcelBoxLabels;
}

void
OrderLabelDTO::setParcelBoxLabels(std::list <ParcelBoxLabelDTO> parcelBoxLabels)
{
	this->parcelBoxLabels = parcelBoxLabels;
}



