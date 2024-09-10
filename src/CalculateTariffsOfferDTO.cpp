#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CalculateTariffsOfferDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CalculateTariffsOfferDTO::CalculateTariffsOfferDTO()
{
	//__init();
}

CalculateTariffsOfferDTO::~CalculateTariffsOfferDTO()
{
	//__cleanup();
}

void
CalculateTariffsOfferDTO::__init()
{
	//categoryId = long(0);
	//price = double(0);
	//length = double(0);
	//width = double(0);
	//height = double(0);
	//weight = double(0);
	//quantity = int(0);
}

void
CalculateTariffsOfferDTO::__cleanup()
{
	//if(categoryId != NULL) {
	//
	//delete categoryId;
	//categoryId = NULL;
	//}
	//if(price != NULL) {
	//
	//delete price;
	//price = NULL;
	//}
	//if(length != NULL) {
	//
	//delete length;
	//length = NULL;
	//}
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//if(height != NULL) {
	//
	//delete height;
	//height = NULL;
	//}
	//if(weight != NULL) {
	//
	//delete weight;
	//weight = NULL;
	//}
	//if(quantity != NULL) {
	//
	//delete quantity;
	//quantity = NULL;
	//}
	//
}

void
CalculateTariffsOfferDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *categoryIdKey = "categoryId";
	node = json_object_get_member(pJsonObject, categoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&categoryId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *priceKey = "price";
	node = json_object_get_member(pJsonObject, priceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&price, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&price);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lengthKey = "length";
	node = json_object_get_member(pJsonObject, lengthKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&length, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&length);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *widthKey = "width";
	node = json_object_get_member(pJsonObject, widthKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&width, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&width);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *heightKey = "height";
	node = json_object_get_member(pJsonObject, heightKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&height, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&height);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *weightKey = "weight";
	node = json_object_get_member(pJsonObject, weightKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&weight, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&weight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *quantityKey = "quantity";
	node = json_object_get_member(pJsonObject, quantityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&quantity, node, "int", "");
		} else {
			
		}
	}
}

CalculateTariffsOfferDTO::CalculateTariffsOfferDTO(char* json)
{
	this->fromJson(json);
}

char*
CalculateTariffsOfferDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getCategoryId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *categoryIdKey = "categoryId";
	json_object_set_member(pJsonObject, categoryIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getPrice();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPrice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priceKey = "price";
	json_object_set_member(pJsonObject, priceKey, node);
	if (isprimitive("long long")) {
		long long obj = getLength();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lengthKey = "length";
	json_object_set_member(pJsonObject, lengthKey, node);
	if (isprimitive("long long")) {
		long long obj = getWidth();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getWidth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *widthKey = "width";
	json_object_set_member(pJsonObject, widthKey, node);
	if (isprimitive("long long")) {
		long long obj = getHeight();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getHeight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *heightKey = "height";
	json_object_set_member(pJsonObject, heightKey, node);
	if (isprimitive("long long")) {
		long long obj = getWeight();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getWeight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *weightKey = "weight";
	json_object_set_member(pJsonObject, weightKey, node);
	if (isprimitive("int")) {
		int obj = getQuantity();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *quantityKey = "quantity";
	json_object_set_member(pJsonObject, quantityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CalculateTariffsOfferDTO::getCategoryId()
{
	return categoryId;
}

void
CalculateTariffsOfferDTO::setCategoryId(long long  categoryId)
{
	this->categoryId = categoryId;
}

long long
CalculateTariffsOfferDTO::getPrice()
{
	return price;
}

void
CalculateTariffsOfferDTO::setPrice(long long  price)
{
	this->price = price;
}

long long
CalculateTariffsOfferDTO::getLength()
{
	return length;
}

void
CalculateTariffsOfferDTO::setLength(long long  length)
{
	this->length = length;
}

long long
CalculateTariffsOfferDTO::getWidth()
{
	return width;
}

void
CalculateTariffsOfferDTO::setWidth(long long  width)
{
	this->width = width;
}

long long
CalculateTariffsOfferDTO::getHeight()
{
	return height;
}

void
CalculateTariffsOfferDTO::setHeight(long long  height)
{
	this->height = height;
}

long long
CalculateTariffsOfferDTO::getWeight()
{
	return weight;
}

void
CalculateTariffsOfferDTO::setWeight(long long  weight)
{
	this->weight = weight;
}

int
CalculateTariffsOfferDTO::getQuantity()
{
	return quantity;
}

void
CalculateTariffsOfferDTO::setQuantity(int  quantity)
{
	this->quantity = quantity;
}


