

#include "OrderBusinessDocumentsDTO.h"

using namespace Tiny;

OrderBusinessDocumentsDTO::OrderBusinessDocumentsDTO()
{
	upd = DocumentDTO();
	ukd = DocumentDTO();
	torgTwelve = DocumentDTO();
	sf = DocumentDTO();
	ksf = DocumentDTO();
}

OrderBusinessDocumentsDTO::OrderBusinessDocumentsDTO(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderBusinessDocumentsDTO::~OrderBusinessDocumentsDTO()
{

}

void
OrderBusinessDocumentsDTO::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *updKey = "upd";

    if(object.has_key(updKey))
    {
        bourne::json value = object[updKey];




        DocumentDTO* obj = &upd;
		obj->fromJson(value.dump());

    }

    const char *ukdKey = "ukd";

    if(object.has_key(ukdKey))
    {
        bourne::json value = object[ukdKey];




        DocumentDTO* obj = &ukd;
		obj->fromJson(value.dump());

    }

    const char *torgTwelveKey = "torgTwelve";

    if(object.has_key(torgTwelveKey))
    {
        bourne::json value = object[torgTwelveKey];




        DocumentDTO* obj = &torgTwelve;
		obj->fromJson(value.dump());

    }

    const char *sfKey = "sf";

    if(object.has_key(sfKey))
    {
        bourne::json value = object[sfKey];




        DocumentDTO* obj = &sf;
		obj->fromJson(value.dump());

    }

    const char *ksfKey = "ksf";

    if(object.has_key(ksfKey))
    {
        bourne::json value = object[ksfKey];




        DocumentDTO* obj = &ksf;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrderBusinessDocumentsDTO::toJson()
{
    bourne::json object = bourne::json::object();






	object["upd"] = getUpd().toJson();






	object["ukd"] = getUkd().toJson();






	object["torgTwelve"] = getTorgTwelve().toJson();






	object["sf"] = getSf().toJson();






	object["ksf"] = getKsf().toJson();


    return object;

}

DocumentDTO
OrderBusinessDocumentsDTO::getUpd()
{
	return upd;
}

void
OrderBusinessDocumentsDTO::setUpd(DocumentDTO  upd)
{
	this->upd = upd;
}

DocumentDTO
OrderBusinessDocumentsDTO::getUkd()
{
	return ukd;
}

void
OrderBusinessDocumentsDTO::setUkd(DocumentDTO  ukd)
{
	this->ukd = ukd;
}

DocumentDTO
OrderBusinessDocumentsDTO::getTorgTwelve()
{
	return torgTwelve;
}

void
OrderBusinessDocumentsDTO::setTorgTwelve(DocumentDTO  torgTwelve)
{
	this->torgTwelve = torgTwelve;
}

DocumentDTO
OrderBusinessDocumentsDTO::getSf()
{
	return sf;
}

void
OrderBusinessDocumentsDTO::setSf(DocumentDTO  sf)
{
	this->sf = sf;
}

DocumentDTO
OrderBusinessDocumentsDTO::getKsf()
{
	return ksf;
}

void
OrderBusinessDocumentsDTO::setKsf(DocumentDTO  ksf)
{
	this->ksf = ksf;
}



