#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "OrdersManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


OrdersManager::OrdersManager()
{

}

OrdersManager::~OrdersManager()
{

}

static gboolean __OrdersManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __OrdersManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__OrdersManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool acceptOrderCancellationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EmptyApiResponse, Error, void* )
	= reinterpret_cast<void(*)(EmptyApiResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EmptyApiResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EmptyApiResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EmptyApiResponse", "EmptyApiResponse");
			json_node_free(pJson);

			if ("EmptyApiResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool acceptOrderCancellationHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<AcceptOrderCancellationRequest> acceptOrderCancellationRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("AcceptOrderCancellationRequest")) {
		node = converttoJson(&acceptOrderCancellationRequest, "AcceptOrderCancellationRequest", "");
	}
	
	char *jsonStr =  acceptOrderCancellationRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/cancellation/accept");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = acceptOrderCancellationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), acceptOrderCancellationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::acceptOrderCancellationAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<AcceptOrderCancellationRequest> acceptOrderCancellationRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return acceptOrderCancellationHelper(accessToken,
	campaignId, orderId, acceptOrderCancellationRequest, 
	handler, userData, true);
}

bool OrdersManager::acceptOrderCancellationSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<AcceptOrderCancellationRequest> acceptOrderCancellationRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return acceptOrderCancellationHelper(accessToken,
	campaignId, orderId, acceptOrderCancellationRequest, 
	handler, userData, false);
}

static bool getOrderProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOrderResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOrderResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOrderResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOrderResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOrderResponse", "GetOrderResponse");
			json_node_free(pJson);

			if ("GetOrderResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getOrderHelper(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/orders/{orderId}");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrderProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrderProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::getOrderAsync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderResponse, Error, void* )
	, void* userData)
{
	return getOrderHelper(accessToken,
	campaignId, orderId, 
	handler, userData, true);
}

bool OrdersManager::getOrderSync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderResponse, Error, void* )
	, void* userData)
{
	return getOrderHelper(accessToken,
	campaignId, orderId, 
	handler, userData, false);
}

static bool getOrdersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOrdersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOrdersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOrdersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOrdersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOrdersResponse", "GetOrdersResponse");
			json_node_free(pJson);

			if ("GetOrdersResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool getOrdersHelper(char * accessToken,
	long long campaignId, std::list<long long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, std::string updatedAtFrom, std::string updatedAtTo, OrderDeliveryDispatchType dispatchType, bool fake, bool hasCis, bool onlyWaitingForCancellationApprove, bool onlyEstimatedDelivery, OrderBuyerType buyerType, int page, int pageSize, std::string pageToken, int limit, 
	void(* handler)(GetOrdersResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	for (std::list
	<long long>::iterator queryIter = orderIds.begin(); queryIter != orderIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "long long");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("orderIds", itemAt));
	}
	
	for (Set
	<OrderStatusType>::iterator queryIter = status.begin(); queryIter != status.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "OrderStatusType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("status", itemAt));
	}
	
	for (Set
	<OrderSubstatusType>::iterator queryIter = substatus.begin(); queryIter != substatus.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "OrderSubstatusType");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("substatus", itemAt));
	}
	

	itemAtq = stringify(&fromDate, "Date");
	queryParams.insert(pair<string, string>("fromDate", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("fromDate");
	}


	itemAtq = stringify(&toDate, "Date");
	queryParams.insert(pair<string, string>("toDate", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("toDate");
	}


	itemAtq = stringify(&supplierShipmentDateFrom, "Date");
	queryParams.insert(pair<string, string>("supplierShipmentDateFrom", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("supplierShipmentDateFrom");
	}


	itemAtq = stringify(&supplierShipmentDateTo, "Date");
	queryParams.insert(pair<string, string>("supplierShipmentDateTo", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("supplierShipmentDateTo");
	}


	itemAtq = stringify(&updatedAtFrom, "std::string");
	queryParams.insert(pair<string, string>("updatedAtFrom", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("updatedAtFrom");
	}


	itemAtq = stringify(&updatedAtTo, "std::string");
	queryParams.insert(pair<string, string>("updatedAtTo", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("updatedAtTo");
	}


	itemAtq = stringify(&dispatchType, "OrderDeliveryDispatchType");
	queryParams.insert(pair<string, string>("dispatchType", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("dispatchType");
	}


	itemAtq = stringify(&fake, "bool");
	queryParams.insert(pair<string, string>("fake", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("fake");
	}


	itemAtq = stringify(&hasCis, "bool");
	queryParams.insert(pair<string, string>("hasCis", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("hasCis");
	}


	itemAtq = stringify(&onlyWaitingForCancellationApprove, "bool");
	queryParams.insert(pair<string, string>("onlyWaitingForCancellationApprove", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("onlyWaitingForCancellationApprove");
	}


	itemAtq = stringify(&onlyEstimatedDelivery, "bool");
	queryParams.insert(pair<string, string>("onlyEstimatedDelivery", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("onlyEstimatedDelivery");
	}


	itemAtq = stringify(&buyerType, "OrderBuyerType");
	queryParams.insert(pair<string, string>("buyerType", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("buyerType");
	}


	itemAtq = stringify(&page, "int");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}


	itemAtq = stringify(&pageSize, "int");
	queryParams.insert(pair<string, string>("pageSize", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("pageSize");
	}


	itemAtq = stringify(&pageToken, "std::string");
	queryParams.insert(pair<string, string>("page_token", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page_token");
	}


	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/orders");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOrdersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOrdersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::getOrdersAsync(char * accessToken,
	long long campaignId, std::list<long long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, std::string updatedAtFrom, std::string updatedAtTo, OrderDeliveryDispatchType dispatchType, bool fake, bool hasCis, bool onlyWaitingForCancellationApprove, bool onlyEstimatedDelivery, OrderBuyerType buyerType, int page, int pageSize, std::string pageToken, int limit, 
	void(* handler)(GetOrdersResponse, Error, void* )
	, void* userData)
{
	return getOrdersHelper(accessToken,
	campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit, 
	handler, userData, true);
}

bool OrdersManager::getOrdersSync(char * accessToken,
	long long campaignId, std::list<long long> orderIds, Set<OrderStatusType> status, Set<OrderSubstatusType> substatus, Date fromDate, Date toDate, Date supplierShipmentDateFrom, Date supplierShipmentDateTo, std::string updatedAtFrom, std::string updatedAtTo, OrderDeliveryDispatchType dispatchType, bool fake, bool hasCis, bool onlyWaitingForCancellationApprove, bool onlyEstimatedDelivery, OrderBuyerType buyerType, int page, int pageSize, std::string pageToken, int limit, 
	void(* handler)(GetOrdersResponse, Error, void* )
	, void* userData)
{
	return getOrdersHelper(accessToken,
	campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit, 
	handler, userData, false);
}

static bool provideOrderDigitalCodesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EmptyApiResponse, Error, void* )
	= reinterpret_cast<void(*)(EmptyApiResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EmptyApiResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EmptyApiResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EmptyApiResponse", "EmptyApiResponse");
			json_node_free(pJson);

			if ("EmptyApiResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool provideOrderDigitalCodesHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderDigitalCodesRequest> provideOrderDigitalCodesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("ProvideOrderDigitalCodesRequest")) {
		node = converttoJson(&provideOrderDigitalCodesRequest, "ProvideOrderDigitalCodesRequest", "");
	}
	
	char *jsonStr =  provideOrderDigitalCodesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = provideOrderDigitalCodesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), provideOrderDigitalCodesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::provideOrderDigitalCodesAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderDigitalCodesRequest> provideOrderDigitalCodesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return provideOrderDigitalCodesHelper(accessToken,
	campaignId, orderId, provideOrderDigitalCodesRequest, 
	handler, userData, true);
}

bool OrdersManager::provideOrderDigitalCodesSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderDigitalCodesRequest> provideOrderDigitalCodesRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return provideOrderDigitalCodesHelper(accessToken,
	campaignId, orderId, provideOrderDigitalCodesRequest, 
	handler, userData, false);
}

static bool provideOrderItemIdentifiersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProvideOrderItemIdentifiersResponse, Error, void* )
	= reinterpret_cast<void(*)(ProvideOrderItemIdentifiersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProvideOrderItemIdentifiersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProvideOrderItemIdentifiersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProvideOrderItemIdentifiersResponse", "ProvideOrderItemIdentifiersResponse");
			json_node_free(pJson);

			if ("ProvideOrderItemIdentifiersResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool provideOrderItemIdentifiersHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderItemIdentifiersRequest> provideOrderItemIdentifiersRequest, 
	void(* handler)(ProvideOrderItemIdentifiersResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("ProvideOrderItemIdentifiersRequest")) {
		node = converttoJson(&provideOrderItemIdentifiersRequest, "ProvideOrderItemIdentifiersRequest", "");
	}
	
	char *jsonStr =  provideOrderItemIdentifiersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/identifiers");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = provideOrderItemIdentifiersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), provideOrderItemIdentifiersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::provideOrderItemIdentifiersAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderItemIdentifiersRequest> provideOrderItemIdentifiersRequest, 
	void(* handler)(ProvideOrderItemIdentifiersResponse, Error, void* )
	, void* userData)
{
	return provideOrderItemIdentifiersHelper(accessToken,
	campaignId, orderId, provideOrderItemIdentifiersRequest, 
	handler, userData, true);
}

bool OrdersManager::provideOrderItemIdentifiersSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<ProvideOrderItemIdentifiersRequest> provideOrderItemIdentifiersRequest, 
	void(* handler)(ProvideOrderItemIdentifiersResponse, Error, void* )
	, void* userData)
{
	return provideOrderItemIdentifiersHelper(accessToken,
	campaignId, orderId, provideOrderItemIdentifiersRequest, 
	handler, userData, false);
}

static bool setOrderBoxLayoutProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SetOrderBoxLayoutResponse, Error, void* )
	= reinterpret_cast<void(*)(SetOrderBoxLayoutResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SetOrderBoxLayoutResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SetOrderBoxLayoutResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SetOrderBoxLayoutResponse", "SetOrderBoxLayoutResponse");
			json_node_free(pJson);

			if ("SetOrderBoxLayoutResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool setOrderBoxLayoutHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderBoxLayoutRequest> setOrderBoxLayoutRequest, 
	void(* handler)(SetOrderBoxLayoutResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("SetOrderBoxLayoutRequest")) {
		node = converttoJson(&setOrderBoxLayoutRequest, "SetOrderBoxLayoutRequest", "");
	}
	
	char *jsonStr =  setOrderBoxLayoutRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/boxes");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setOrderBoxLayoutProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setOrderBoxLayoutProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::setOrderBoxLayoutAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderBoxLayoutRequest> setOrderBoxLayoutRequest, 
	void(* handler)(SetOrderBoxLayoutResponse, Error, void* )
	, void* userData)
{
	return setOrderBoxLayoutHelper(accessToken,
	campaignId, orderId, setOrderBoxLayoutRequest, 
	handler, userData, true);
}

bool OrdersManager::setOrderBoxLayoutSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<SetOrderBoxLayoutRequest> setOrderBoxLayoutRequest, 
	void(* handler)(SetOrderBoxLayoutResponse, Error, void* )
	, void* userData)
{
	return setOrderBoxLayoutHelper(accessToken,
	campaignId, orderId, setOrderBoxLayoutRequest, 
	handler, userData, false);
}

static bool setOrderShipmentBoxesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(SetOrderShipmentBoxesResponse, Error, void* )
	= reinterpret_cast<void(*)(SetOrderShipmentBoxesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	SetOrderShipmentBoxesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("SetOrderShipmentBoxesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "SetOrderShipmentBoxesResponse", "SetOrderShipmentBoxesResponse");
			json_node_free(pJson);

			if ("SetOrderShipmentBoxesResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool setOrderShipmentBoxesHelper(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, std::shared_ptr<SetOrderShipmentBoxesRequest> setOrderShipmentBoxesRequest, 
	void(* handler)(SetOrderShipmentBoxesResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("SetOrderShipmentBoxesRequest")) {
		node = converttoJson(&setOrderShipmentBoxesRequest, "SetOrderShipmentBoxesRequest", "");
	}
	
	char *jsonStr =  setOrderShipmentBoxesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));
	string s_shipmentId("{");
	s_shipmentId.append("shipmentId");
	s_shipmentId.append("}");
	pos = url.find(s_shipmentId);
	url.erase(pos, s_shipmentId.length());
	url.insert(pos, stringify(&shipmentId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = setOrderShipmentBoxesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), setOrderShipmentBoxesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::setOrderShipmentBoxesAsync(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, std::shared_ptr<SetOrderShipmentBoxesRequest> setOrderShipmentBoxesRequest, 
	void(* handler)(SetOrderShipmentBoxesResponse, Error, void* )
	, void* userData)
{
	return setOrderShipmentBoxesHelper(accessToken,
	campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest, 
	handler, userData, true);
}

bool OrdersManager::setOrderShipmentBoxesSync(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, std::shared_ptr<SetOrderShipmentBoxesRequest> setOrderShipmentBoxesRequest, 
	void(* handler)(SetOrderShipmentBoxesResponse, Error, void* )
	, void* userData)
{
	return setOrderShipmentBoxesHelper(accessToken,
	campaignId, orderId, shipmentId, setOrderShipmentBoxesRequest, 
	handler, userData, false);
}

static bool updateOrderItemsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	
	void(* handler)(Error, void* ) = reinterpret_cast<void(*)(Error, void* )> (voidHandler);
	JsonNode* pJson;
	char * data = p_chunk.memory;

	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));


		handler(error, userData);
		return true;



	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		handler(error, userData);
		return false;
	}
}

static bool updateOrderItemsHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderItemRequest> updateOrderItemRequest, 
	
	void(* handler)(Error, void* ) , void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("UpdateOrderItemRequest")) {
		node = converttoJson(&updateOrderItemRequest, "UpdateOrderItemRequest", "");
	}
	
	char *jsonStr =  updateOrderItemRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/items");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOrderItemsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOrderItemsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::updateOrderItemsAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderItemRequest> updateOrderItemRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return updateOrderItemsHelper(accessToken,
	campaignId, orderId, updateOrderItemRequest, 
	handler, userData, true);
}

bool OrdersManager::updateOrderItemsSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderItemRequest> updateOrderItemRequest, 
	
	void(* handler)(Error, void* ) , void* userData)
{
	return updateOrderItemsHelper(accessToken,
	campaignId, orderId, updateOrderItemRequest, 
	handler, userData, false);
}

static bool updateOrderStatusProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateOrderStatusResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdateOrderStatusResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateOrderStatusResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateOrderStatusResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateOrderStatusResponse", "UpdateOrderStatusResponse");
			json_node_free(pJson);

			if ("UpdateOrderStatusResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool updateOrderStatusHelper(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStatusRequest> updateOrderStatusRequest, 
	void(* handler)(UpdateOrderStatusResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("UpdateOrderStatusRequest")) {
		node = converttoJson(&updateOrderStatusRequest, "UpdateOrderStatusRequest", "");
	}
	
	char *jsonStr =  updateOrderStatusRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/{orderId}/status");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));
	string s_orderId("{");
	s_orderId.append("orderId");
	s_orderId.append("}");
	pos = url.find(s_orderId);
	url.erase(pos, s_orderId.length());
	url.insert(pos, stringify(&orderId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("PUT");

	if(strcmp("PUT", "PUT") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOrderStatusProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOrderStatusProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::updateOrderStatusAsync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStatusRequest> updateOrderStatusRequest, 
	void(* handler)(UpdateOrderStatusResponse, Error, void* )
	, void* userData)
{
	return updateOrderStatusHelper(accessToken,
	campaignId, orderId, updateOrderStatusRequest, 
	handler, userData, true);
}

bool OrdersManager::updateOrderStatusSync(char * accessToken,
	long long campaignId, long long orderId, std::shared_ptr<UpdateOrderStatusRequest> updateOrderStatusRequest, 
	void(* handler)(UpdateOrderStatusResponse, Error, void* )
	, void* userData)
{
	return updateOrderStatusHelper(accessToken,
	campaignId, orderId, updateOrderStatusRequest, 
	handler, userData, false);
}

static bool updateOrderStatusesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UpdateOrderStatusesResponse, Error, void* )
	= reinterpret_cast<void(*)(UpdateOrderStatusesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UpdateOrderStatusesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UpdateOrderStatusesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UpdateOrderStatusesResponse", "UpdateOrderStatusesResponse");
			json_node_free(pJson);

			if ("UpdateOrderStatusesResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool updateOrderStatusesHelper(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOrderStatusesRequest> updateOrderStatusesRequest, 
	void(* handler)(UpdateOrderStatusesResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("UpdateOrderStatusesRequest")) {
		node = converttoJson(&updateOrderStatusesRequest, "UpdateOrderStatusesRequest", "");
	}
	
	char *jsonStr =  updateOrderStatusesRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/orders/status-update");
	int pos;

	string s_campaignId("{");
	s_campaignId.append("campaignId");
	s_campaignId.append("}");
	pos = url.find(s_campaignId);
	url.erase(pos, s_campaignId.length());
	url.insert(pos, stringify(&campaignId, "long long"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateOrderStatusesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (OrdersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateOrderStatusesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OrdersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OrdersManager::updateOrderStatusesAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOrderStatusesRequest> updateOrderStatusesRequest, 
	void(* handler)(UpdateOrderStatusesResponse, Error, void* )
	, void* userData)
{
	return updateOrderStatusesHelper(accessToken,
	campaignId, updateOrderStatusesRequest, 
	handler, userData, true);
}

bool OrdersManager::updateOrderStatusesSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateOrderStatusesRequest> updateOrderStatusesRequest, 
	void(* handler)(UpdateOrderStatusesResponse, Error, void* )
	, void* userData)
{
	return updateOrderStatusesHelper(accessToken,
	campaignId, updateOrderStatusesRequest, 
	handler, userData, false);
}

