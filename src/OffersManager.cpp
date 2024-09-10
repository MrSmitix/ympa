#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "OffersManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


OffersManager::OffersManager()
{

}

OffersManager::~OffersManager()
{

}

static gboolean __OffersManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __OffersManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__OffersManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool deleteCampaignOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteCampaignOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteCampaignOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteCampaignOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteCampaignOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteCampaignOffersResponse", "DeleteCampaignOffersResponse");
			json_node_free(pJson);

			if ("DeleteCampaignOffersResponse" == "std::string") {
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

static bool deleteCampaignOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteCampaignOffersRequest> deleteCampaignOffersRequest, 
	void(* handler)(DeleteCampaignOffersResponse, Error, void* )
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

	if (isprimitive("DeleteCampaignOffersRequest")) {
		node = converttoJson(&deleteCampaignOffersRequest, "DeleteCampaignOffersRequest", "");
	}
	
	char *jsonStr =  deleteCampaignOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offers/delete");
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
		NetClient::easycurl(OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteCampaignOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteCampaignOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OffersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OffersManager::deleteCampaignOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteCampaignOffersRequest> deleteCampaignOffersRequest, 
	void(* handler)(DeleteCampaignOffersResponse, Error, void* )
	, void* userData)
{
	return deleteCampaignOffersHelper(accessToken,
	campaignId, deleteCampaignOffersRequest, 
	handler, userData, true);
}

bool OffersManager::deleteCampaignOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<DeleteCampaignOffersRequest> deleteCampaignOffersRequest, 
	void(* handler)(DeleteCampaignOffersResponse, Error, void* )
	, void* userData)
{
	return deleteCampaignOffersHelper(accessToken,
	campaignId, deleteCampaignOffersRequest, 
	handler, userData, false);
}

static bool getAllOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetAllOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetAllOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetAllOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetAllOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetAllOffersResponse", "GetAllOffersResponse");
			json_node_free(pJson);

			if ("GetAllOffersResponse" == "std::string") {
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

static bool getAllOffersHelper(char * accessToken,
	long long campaignId, long long feedId, int chunk, 
	void(* handler)(GetAllOffersResponse, Error, void* )
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
	

	itemAtq = stringify(&feedId, "long long");
	queryParams.insert(pair<string, string>("feedId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("feedId");
	}


	itemAtq = stringify(&chunk, "int");
	queryParams.insert(pair<string, string>("chunk", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("chunk");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/offers/all");
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
		NetClient::easycurl(OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAllOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAllOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OffersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OffersManager::getAllOffersAsync(char * accessToken,
	long long campaignId, long long feedId, int chunk, 
	void(* handler)(GetAllOffersResponse, Error, void* )
	, void* userData)
{
	return getAllOffersHelper(accessToken,
	campaignId, feedId, chunk, 
	handler, userData, true);
}

bool OffersManager::getAllOffersSync(char * accessToken,
	long long campaignId, long long feedId, int chunk, 
	void(* handler)(GetAllOffersResponse, Error, void* )
	, void* userData)
{
	return getAllOffersHelper(accessToken,
	campaignId, feedId, chunk, 
	handler, userData, false);
}

static bool getCampaignOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetCampaignOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetCampaignOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetCampaignOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetCampaignOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetCampaignOffersResponse", "GetCampaignOffersResponse");
			json_node_free(pJson);

			if ("GetCampaignOffersResponse" == "std::string") {
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

static bool getCampaignOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<GetCampaignOffersRequest> getCampaignOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetCampaignOffersResponse, Error, void* )
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

	if (isprimitive("GetCampaignOffersRequest")) {
		node = converttoJson(&getCampaignOffersRequest, "GetCampaignOffersRequest", "");
	}
	
	char *jsonStr =  getCampaignOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offers");
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
		NetClient::easycurl(OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getCampaignOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getCampaignOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OffersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OffersManager::getCampaignOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<GetCampaignOffersRequest> getCampaignOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetCampaignOffersResponse, Error, void* )
	, void* userData)
{
	return getCampaignOffersHelper(accessToken,
	campaignId, getCampaignOffersRequest, pageToken, limit, 
	handler, userData, true);
}

bool OffersManager::getCampaignOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<GetCampaignOffersRequest> getCampaignOffersRequest, std::string pageToken, int limit, 
	void(* handler)(GetCampaignOffersResponse, Error, void* )
	, void* userData)
{
	return getCampaignOffersHelper(accessToken,
	campaignId, getCampaignOffersRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getOfferRecommendationsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOfferRecommendationsResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOfferRecommendationsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOfferRecommendationsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOfferRecommendationsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOfferRecommendationsResponse", "GetOfferRecommendationsResponse");
			json_node_free(pJson);

			if ("GetOfferRecommendationsResponse" == "std::string") {
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

static bool getOfferRecommendationsHelper(char * accessToken,
	long long businessId, std::shared_ptr<GetOfferRecommendationsRequest> getOfferRecommendationsRequest, std::string pageToken, int limit, 
	void(* handler)(GetOfferRecommendationsResponse, Error, void* )
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

	if (isprimitive("GetOfferRecommendationsRequest")) {
		node = converttoJson(&getOfferRecommendationsRequest, "GetOfferRecommendationsRequest", "");
	}
	
	char *jsonStr =  getOfferRecommendationsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/businesses/{businessId}/offers/recommendations");
	int pos;

	string s_businessId("{");
	s_businessId.append("businessId");
	s_businessId.append("}");
	pos = url.find(s_businessId);
	url.erase(pos, s_businessId.length());
	url.insert(pos, stringify(&businessId, "long long"));

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
		NetClient::easycurl(OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOfferRecommendationsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOfferRecommendationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OffersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OffersManager::getOfferRecommendationsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetOfferRecommendationsRequest> getOfferRecommendationsRequest, std::string pageToken, int limit, 
	void(* handler)(GetOfferRecommendationsResponse, Error, void* )
	, void* userData)
{
	return getOfferRecommendationsHelper(accessToken,
	businessId, getOfferRecommendationsRequest, pageToken, limit, 
	handler, userData, true);
}

bool OffersManager::getOfferRecommendationsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetOfferRecommendationsRequest> getOfferRecommendationsRequest, std::string pageToken, int limit, 
	void(* handler)(GetOfferRecommendationsResponse, Error, void* )
	, void* userData)
{
	return getOfferRecommendationsHelper(accessToken,
	businessId, getOfferRecommendationsRequest, pageToken, limit, 
	handler, userData, false);
}

static bool getOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetOffersResponse, Error, void* )
	= reinterpret_cast<void(*)(GetOffersResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetOffersResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetOffersResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetOffersResponse", "GetOffersResponse");
			json_node_free(pJson);

			if ("GetOffersResponse" == "std::string") {
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

static bool getOffersHelper(char * accessToken,
	long long campaignId, std::string query, long long feedId, std::string shopCategoryId, CurrencyType currency, bool matched, int page, int pageSize, 
	void(* handler)(GetOffersResponse, Error, void* )
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
	

	itemAtq = stringify(&query, "std::string");
	queryParams.insert(pair<string, string>("query", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("query");
	}


	itemAtq = stringify(&feedId, "long long");
	queryParams.insert(pair<string, string>("feedId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("feedId");
	}


	itemAtq = stringify(&shopCategoryId, "std::string");
	queryParams.insert(pair<string, string>("shopCategoryId", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("shopCategoryId");
	}


	itemAtq = stringify(&currency, "CurrencyType");
	queryParams.insert(pair<string, string>("currency", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("currency");
	}


	itemAtq = stringify(&matched, "bool");
	queryParams.insert(pair<string, string>("matched", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("matched");
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

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/campaigns/{campaignId}/offers");
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
		NetClient::easycurl(OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OffersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OffersManager::getOffersAsync(char * accessToken,
	long long campaignId, std::string query, long long feedId, std::string shopCategoryId, CurrencyType currency, bool matched, int page, int pageSize, 
	void(* handler)(GetOffersResponse, Error, void* )
	, void* userData)
{
	return getOffersHelper(accessToken,
	campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize, 
	handler, userData, true);
}

bool OffersManager::getOffersSync(char * accessToken,
	long long campaignId, std::string query, long long feedId, std::string shopCategoryId, CurrencyType currency, bool matched, int page, int pageSize, 
	void(* handler)(GetOffersResponse, Error, void* )
	, void* userData)
{
	return getOffersHelper(accessToken,
	campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize, 
	handler, userData, false);
}

static bool updateCampaignOffersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
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

static bool updateCampaignOffersHelper(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateCampaignOffersRequest> updateCampaignOffersRequest, 
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

	if (isprimitive("UpdateCampaignOffersRequest")) {
		node = converttoJson(&updateCampaignOffersRequest, "UpdateCampaignOffersRequest", "");
	}
	
	char *jsonStr =  updateCampaignOffersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/campaigns/{campaignId}/offers/update");
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
		NetClient::easycurl(OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateCampaignOffersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OffersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateCampaignOffersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OffersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OffersManager::updateCampaignOffersAsync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateCampaignOffersRequest> updateCampaignOffersRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateCampaignOffersHelper(accessToken,
	campaignId, updateCampaignOffersRequest, 
	handler, userData, true);
}

bool OffersManager::updateCampaignOffersSync(char * accessToken,
	long long campaignId, std::shared_ptr<UpdateCampaignOffersRequest> updateCampaignOffersRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData)
{
	return updateCampaignOffersHelper(accessToken,
	campaignId, updateCampaignOffersRequest, 
	handler, userData, false);
}

