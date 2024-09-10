#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ReportsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ReportsManager::ReportsManager()
{

}

ReportsManager::~ReportsManager()
{

}

static gboolean __ReportsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ReportsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ReportsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool generateBoostConsolidatedReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateBoostConsolidatedReportHelper(char * accessToken,
	std::shared_ptr<GenerateBoostConsolidatedRequest> generateBoostConsolidatedRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateBoostConsolidatedRequest")) {
		node = converttoJson(&generateBoostConsolidatedRequest, "GenerateBoostConsolidatedRequest", "");
	}
	
	char *jsonStr =  generateBoostConsolidatedRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/boost-consolidated/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateBoostConsolidatedReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateBoostConsolidatedReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateBoostConsolidatedReportAsync(char * accessToken,
	std::shared_ptr<GenerateBoostConsolidatedRequest> generateBoostConsolidatedRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateBoostConsolidatedReportHelper(accessToken,
	generateBoostConsolidatedRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateBoostConsolidatedReportSync(char * accessToken,
	std::shared_ptr<GenerateBoostConsolidatedRequest> generateBoostConsolidatedRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateBoostConsolidatedReportHelper(accessToken,
	generateBoostConsolidatedRequest, format, 
	handler, userData, false);
}

static bool generateCompetitorsPositionReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateCompetitorsPositionReportHelper(char * accessToken,
	std::shared_ptr<GenerateCompetitorsPositionReportRequest> generateCompetitorsPositionReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateCompetitorsPositionReportRequest")) {
		node = converttoJson(&generateCompetitorsPositionReportRequest, "GenerateCompetitorsPositionReportRequest", "");
	}
	
	char *jsonStr =  generateCompetitorsPositionReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/competitors-position/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateCompetitorsPositionReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateCompetitorsPositionReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateCompetitorsPositionReportAsync(char * accessToken,
	std::shared_ptr<GenerateCompetitorsPositionReportRequest> generateCompetitorsPositionReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateCompetitorsPositionReportHelper(accessToken,
	generateCompetitorsPositionReportRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateCompetitorsPositionReportSync(char * accessToken,
	std::shared_ptr<GenerateCompetitorsPositionReportRequest> generateCompetitorsPositionReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateCompetitorsPositionReportHelper(accessToken,
	generateCompetitorsPositionReportRequest, format, 
	handler, userData, false);
}

static bool generateGoodsFeedbackReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateGoodsFeedbackReportHelper(char * accessToken,
	std::shared_ptr<GenerateGoodsFeedbackRequest> generateGoodsFeedbackRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateGoodsFeedbackRequest")) {
		node = converttoJson(&generateGoodsFeedbackRequest, "GenerateGoodsFeedbackRequest", "");
	}
	
	char *jsonStr =  generateGoodsFeedbackRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/goods-feedback/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateGoodsFeedbackReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateGoodsFeedbackReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateGoodsFeedbackReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsFeedbackRequest> generateGoodsFeedbackRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsFeedbackReportHelper(accessToken,
	generateGoodsFeedbackRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateGoodsFeedbackReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsFeedbackRequest> generateGoodsFeedbackRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsFeedbackReportHelper(accessToken,
	generateGoodsFeedbackRequest, format, 
	handler, userData, false);
}

static bool generateGoodsMovementReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateGoodsMovementReportHelper(char * accessToken,
	std::shared_ptr<GenerateGoodsMovementReportRequest> generateGoodsMovementReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateGoodsMovementReportRequest")) {
		node = converttoJson(&generateGoodsMovementReportRequest, "GenerateGoodsMovementReportRequest", "");
	}
	
	char *jsonStr =  generateGoodsMovementReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/goods-movement/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateGoodsMovementReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateGoodsMovementReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateGoodsMovementReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsMovementReportRequest> generateGoodsMovementReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsMovementReportHelper(accessToken,
	generateGoodsMovementReportRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateGoodsMovementReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsMovementReportRequest> generateGoodsMovementReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsMovementReportHelper(accessToken,
	generateGoodsMovementReportRequest, format, 
	handler, userData, false);
}

static bool generateGoodsRealizationReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateGoodsRealizationReportHelper(char * accessToken,
	std::shared_ptr<GenerateGoodsRealizationReportRequest> generateGoodsRealizationReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateGoodsRealizationReportRequest")) {
		node = converttoJson(&generateGoodsRealizationReportRequest, "GenerateGoodsRealizationReportRequest", "");
	}
	
	char *jsonStr =  generateGoodsRealizationReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/goods-realization/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateGoodsRealizationReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateGoodsRealizationReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateGoodsRealizationReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsRealizationReportRequest> generateGoodsRealizationReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsRealizationReportHelper(accessToken,
	generateGoodsRealizationReportRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateGoodsRealizationReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsRealizationReportRequest> generateGoodsRealizationReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsRealizationReportHelper(accessToken,
	generateGoodsRealizationReportRequest, format, 
	handler, userData, false);
}

static bool generateGoodsTurnoverReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateGoodsTurnoverReportHelper(char * accessToken,
	std::shared_ptr<GenerateGoodsTurnoverRequest> generateGoodsTurnoverRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateGoodsTurnoverRequest")) {
		node = converttoJson(&generateGoodsTurnoverRequest, "GenerateGoodsTurnoverRequest", "");
	}
	
	char *jsonStr =  generateGoodsTurnoverRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/goods-turnover/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateGoodsTurnoverReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateGoodsTurnoverReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateGoodsTurnoverReportAsync(char * accessToken,
	std::shared_ptr<GenerateGoodsTurnoverRequest> generateGoodsTurnoverRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsTurnoverReportHelper(accessToken,
	generateGoodsTurnoverRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateGoodsTurnoverReportSync(char * accessToken,
	std::shared_ptr<GenerateGoodsTurnoverRequest> generateGoodsTurnoverRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateGoodsTurnoverReportHelper(accessToken,
	generateGoodsTurnoverRequest, format, 
	handler, userData, false);
}

static bool generateMassOrderLabelsReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateMassOrderLabelsReportHelper(char * accessToken,
	std::shared_ptr<GenerateMassOrderLabelsRequest> generateMassOrderLabelsRequest, PageFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "PageFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateMassOrderLabelsRequest")) {
		node = converttoJson(&generateMassOrderLabelsRequest, "GenerateMassOrderLabelsRequest", "");
	}
	
	char *jsonStr =  generateMassOrderLabelsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/documents/labels/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateMassOrderLabelsReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateMassOrderLabelsReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateMassOrderLabelsReportAsync(char * accessToken,
	std::shared_ptr<GenerateMassOrderLabelsRequest> generateMassOrderLabelsRequest, PageFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateMassOrderLabelsReportHelper(accessToken,
	generateMassOrderLabelsRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateMassOrderLabelsReportSync(char * accessToken,
	std::shared_ptr<GenerateMassOrderLabelsRequest> generateMassOrderLabelsRequest, PageFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateMassOrderLabelsReportHelper(accessToken,
	generateMassOrderLabelsRequest, format, 
	handler, userData, false);
}

static bool generatePricesReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generatePricesReportHelper(char * accessToken,
	std::shared_ptr<GeneratePricesReportRequest> generatePricesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GeneratePricesReportRequest")) {
		node = converttoJson(&generatePricesReportRequest, "GeneratePricesReportRequest", "");
	}
	
	char *jsonStr =  generatePricesReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/prices/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generatePricesReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generatePricesReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generatePricesReportAsync(char * accessToken,
	std::shared_ptr<GeneratePricesReportRequest> generatePricesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generatePricesReportHelper(accessToken,
	generatePricesReportRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generatePricesReportSync(char * accessToken,
	std::shared_ptr<GeneratePricesReportRequest> generatePricesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generatePricesReportHelper(accessToken,
	generatePricesReportRequest, format, 
	handler, userData, false);
}

static bool generateShelfsStatisticsReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateShelfsStatisticsReportHelper(char * accessToken,
	std::shared_ptr<GenerateShelfsStatisticsRequest> generateShelfsStatisticsRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateShelfsStatisticsRequest")) {
		node = converttoJson(&generateShelfsStatisticsRequest, "GenerateShelfsStatisticsRequest", "");
	}
	
	char *jsonStr =  generateShelfsStatisticsRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/shelf-statistics/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateShelfsStatisticsReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateShelfsStatisticsReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateShelfsStatisticsReportAsync(char * accessToken,
	std::shared_ptr<GenerateShelfsStatisticsRequest> generateShelfsStatisticsRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShelfsStatisticsReportHelper(accessToken,
	generateShelfsStatisticsRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateShelfsStatisticsReportSync(char * accessToken,
	std::shared_ptr<GenerateShelfsStatisticsRequest> generateShelfsStatisticsRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShelfsStatisticsReportHelper(accessToken,
	generateShelfsStatisticsRequest, format, 
	handler, userData, false);
}

static bool generateShipmentListDocumentReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateShipmentListDocumentReportHelper(char * accessToken,
	std::shared_ptr<GenerateShipmentListDocumentReportRequest> generateShipmentListDocumentReportRequest, 
	void(* handler)(GenerateReportResponse, Error, void* )
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

	if (isprimitive("GenerateShipmentListDocumentReportRequest")) {
		node = converttoJson(&generateShipmentListDocumentReportRequest, "GenerateShipmentListDocumentReportRequest", "");
	}
	
	char *jsonStr =  generateShipmentListDocumentReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/documents/shipment-list/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateShipmentListDocumentReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateShipmentListDocumentReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateShipmentListDocumentReportAsync(char * accessToken,
	std::shared_ptr<GenerateShipmentListDocumentReportRequest> generateShipmentListDocumentReportRequest, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShipmentListDocumentReportHelper(accessToken,
	generateShipmentListDocumentReportRequest, 
	handler, userData, true);
}

bool ReportsManager::generateShipmentListDocumentReportSync(char * accessToken,
	std::shared_ptr<GenerateShipmentListDocumentReportRequest> generateShipmentListDocumentReportRequest, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShipmentListDocumentReportHelper(accessToken,
	generateShipmentListDocumentReportRequest, 
	handler, userData, false);
}

static bool generateShowsSalesReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateShowsSalesReportHelper(char * accessToken,
	std::shared_ptr<GenerateShowsSalesReportRequest> generateShowsSalesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateShowsSalesReportRequest")) {
		node = converttoJson(&generateShowsSalesReportRequest, "GenerateShowsSalesReportRequest", "");
	}
	
	char *jsonStr =  generateShowsSalesReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/shows-sales/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateShowsSalesReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateShowsSalesReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateShowsSalesReportAsync(char * accessToken,
	std::shared_ptr<GenerateShowsSalesReportRequest> generateShowsSalesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShowsSalesReportHelper(accessToken,
	generateShowsSalesReportRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateShowsSalesReportSync(char * accessToken,
	std::shared_ptr<GenerateShowsSalesReportRequest> generateShowsSalesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateShowsSalesReportHelper(accessToken,
	generateShowsSalesReportRequest, format, 
	handler, userData, false);
}

static bool generateStocksOnWarehousesReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateStocksOnWarehousesReportHelper(char * accessToken,
	std::shared_ptr<GenerateStocksOnWarehousesReportRequest> generateStocksOnWarehousesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateStocksOnWarehousesReportRequest")) {
		node = converttoJson(&generateStocksOnWarehousesReportRequest, "GenerateStocksOnWarehousesReportRequest", "");
	}
	
	char *jsonStr =  generateStocksOnWarehousesReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/stocks-on-warehouses/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateStocksOnWarehousesReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateStocksOnWarehousesReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateStocksOnWarehousesReportAsync(char * accessToken,
	std::shared_ptr<GenerateStocksOnWarehousesReportRequest> generateStocksOnWarehousesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateStocksOnWarehousesReportHelper(accessToken,
	generateStocksOnWarehousesReportRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateStocksOnWarehousesReportSync(char * accessToken,
	std::shared_ptr<GenerateStocksOnWarehousesReportRequest> generateStocksOnWarehousesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateStocksOnWarehousesReportHelper(accessToken,
	generateStocksOnWarehousesReportRequest, format, 
	handler, userData, false);
}

static bool generateUnitedMarketplaceServicesReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateUnitedMarketplaceServicesReportHelper(char * accessToken,
	std::shared_ptr<GenerateUnitedMarketplaceServicesReportRequest> generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateUnitedMarketplaceServicesReportRequest")) {
		node = converttoJson(&generateUnitedMarketplaceServicesReportRequest, "GenerateUnitedMarketplaceServicesReportRequest", "");
	}
	
	char *jsonStr =  generateUnitedMarketplaceServicesReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/united-marketplace-services/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateUnitedMarketplaceServicesReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateUnitedMarketplaceServicesReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateUnitedMarketplaceServicesReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedMarketplaceServicesReportRequest> generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedMarketplaceServicesReportHelper(accessToken,
	generateUnitedMarketplaceServicesReportRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateUnitedMarketplaceServicesReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedMarketplaceServicesReportRequest> generateUnitedMarketplaceServicesReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedMarketplaceServicesReportHelper(accessToken,
	generateUnitedMarketplaceServicesReportRequest, format, 
	handler, userData, false);
}

static bool generateUnitedNettingReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateUnitedNettingReportHelper(char * accessToken,
	std::shared_ptr<GenerateUnitedNettingReportRequest> generateUnitedNettingReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateUnitedNettingReportRequest")) {
		node = converttoJson(&generateUnitedNettingReportRequest, "GenerateUnitedNettingReportRequest", "");
	}
	
	char *jsonStr =  generateUnitedNettingReportRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/united-netting/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateUnitedNettingReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateUnitedNettingReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateUnitedNettingReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedNettingReportRequest> generateUnitedNettingReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedNettingReportHelper(accessToken,
	generateUnitedNettingReportRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateUnitedNettingReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedNettingReportRequest> generateUnitedNettingReportRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedNettingReportHelper(accessToken,
	generateUnitedNettingReportRequest, format, 
	handler, userData, false);
}

static bool generateUnitedOrdersReportProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenerateReportResponse, Error, void* )
	= reinterpret_cast<void(*)(GenerateReportResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenerateReportResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenerateReportResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenerateReportResponse", "GenerateReportResponse");
			json_node_free(pJson);

			if ("GenerateReportResponse" == "std::string") {
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

static bool generateUnitedOrdersReportHelper(char * accessToken,
	std::shared_ptr<GenerateUnitedOrdersRequest> generateUnitedOrdersRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
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
	

	itemAtq = stringify(&format, "ReportFormatType");
	queryParams.insert(pair<string, string>("format", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("format");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("GenerateUnitedOrdersRequest")) {
		node = converttoJson(&generateUnitedOrdersRequest, "GenerateUnitedOrdersRequest", "");
	}
	
	char *jsonStr =  generateUnitedOrdersRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/reports/united-orders/generate");
	int pos;


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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = generateUnitedOrdersReportProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), generateUnitedOrdersReportProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::generateUnitedOrdersReportAsync(char * accessToken,
	std::shared_ptr<GenerateUnitedOrdersRequest> generateUnitedOrdersRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedOrdersReportHelper(accessToken,
	generateUnitedOrdersRequest, format, 
	handler, userData, true);
}

bool ReportsManager::generateUnitedOrdersReportSync(char * accessToken,
	std::shared_ptr<GenerateUnitedOrdersRequest> generateUnitedOrdersRequest, ReportFormatType format, 
	void(* handler)(GenerateReportResponse, Error, void* )
	, void* userData)
{
	return generateUnitedOrdersReportHelper(accessToken,
	generateUnitedOrdersRequest, format, 
	handler, userData, false);
}

static bool getReportInfoProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GetReportInfoResponse, Error, void* )
	= reinterpret_cast<void(*)(GetReportInfoResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GetReportInfoResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GetReportInfoResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GetReportInfoResponse", "GetReportInfoResponse");
			json_node_free(pJson);

			if ("GetReportInfoResponse" == "std::string") {
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

static bool getReportInfoHelper(char * accessToken,
	std::string reportId, 
	void(* handler)(GetReportInfoResponse, Error, void* )
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

	string url("/reports/info/{reportId}");
	int pos;

	string s_reportId("{");
	s_reportId.append("reportId");
	s_reportId.append("}");
	pos = url.find(s_reportId);
	url.erase(pos, s_reportId.length());
	url.insert(pos, stringify(&reportId, "std::string"));

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
		NetClient::easycurl(ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getReportInfoProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ReportsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getReportInfoProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ReportsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ReportsManager::getReportInfoAsync(char * accessToken,
	std::string reportId, 
	void(* handler)(GetReportInfoResponse, Error, void* )
	, void* userData)
{
	return getReportInfoHelper(accessToken,
	reportId, 
	handler, userData, true);
}

bool ReportsManager::getReportInfoSync(char * accessToken,
	std::string reportId, 
	void(* handler)(GetReportInfoResponse, Error, void* )
	, void* userData)
{
	return getReportInfoHelper(accessToken,
	reportId, 
	handler, userData, false);
}

