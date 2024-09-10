

#include "QualityRatingComponentDTO.h"

using namespace Tiny;

QualityRatingComponentDTO::QualityRatingComponentDTO()
{
	value = float(0);
	componentType = QualityRatingComponentType();
}

QualityRatingComponentDTO::QualityRatingComponentDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

QualityRatingComponentDTO::~QualityRatingComponentDTO()
{

}

void
QualityRatingComponentDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "double");


    }

    const char *componentTypeKey = "componentType";

    if(object.has_key(componentTypeKey))
    {
        bourne::json value = object[componentTypeKey];




        QualityRatingComponentType* obj = &componentType;
		obj->fromJson(value.dump());

    }


}

bourne::json
QualityRatingComponentDTO::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();







	object["componentType"] = getComponentType().toJson();


    return object;

}

double
QualityRatingComponentDTO::getValue()
{
	return value;
}

void
QualityRatingComponentDTO::setValue(double  value)
{
	this->value = value;
}

QualityRatingComponentType
QualityRatingComponentDTO::getComponentType()
{
	return componentType;
}

void
QualityRatingComponentDTO::setComponentType(QualityRatingComponentType  componentType)
{
	this->componentType = componentType;
}



