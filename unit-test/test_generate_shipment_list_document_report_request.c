#ifndef generate_shipment_list_document_report_request_TEST
#define generate_shipment_list_document_report_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generate_shipment_list_document_report_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generate_shipment_list_document_report_request.h"
generate_shipment_list_document_report_request_t* instantiate_generate_shipment_list_document_report_request(int include_optional);



generate_shipment_list_document_report_request_t* instantiate_generate_shipment_list_document_report_request(int include_optional) {
  generate_shipment_list_document_report_request_t* generate_shipment_list_document_report_request = NULL;
  if (include_optional) {
    generate_shipment_list_document_report_request = generate_shipment_list_document_report_request_create(
      56,
      56,
      list_createList()
    );
  } else {
    generate_shipment_list_document_report_request = generate_shipment_list_document_report_request_create(
      56,
      56,
      list_createList()
    );
  }

  return generate_shipment_list_document_report_request;
}


#ifdef generate_shipment_list_document_report_request_MAIN

void test_generate_shipment_list_document_report_request(int include_optional) {
    generate_shipment_list_document_report_request_t* generate_shipment_list_document_report_request_1 = instantiate_generate_shipment_list_document_report_request(include_optional);

	cJSON* jsongenerate_shipment_list_document_report_request_1 = generate_shipment_list_document_report_request_convertToJSON(generate_shipment_list_document_report_request_1);
	printf("generate_shipment_list_document_report_request :\n%s\n", cJSON_Print(jsongenerate_shipment_list_document_report_request_1));
	generate_shipment_list_document_report_request_t* generate_shipment_list_document_report_request_2 = generate_shipment_list_document_report_request_parseFromJSON(jsongenerate_shipment_list_document_report_request_1);
	cJSON* jsongenerate_shipment_list_document_report_request_2 = generate_shipment_list_document_report_request_convertToJSON(generate_shipment_list_document_report_request_2);
	printf("repeating generate_shipment_list_document_report_request:\n%s\n", cJSON_Print(jsongenerate_shipment_list_document_report_request_2));
}

int main() {
  test_generate_shipment_list_document_report_request(1);
  test_generate_shipment_list_document_report_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // generate_shipment_list_document_report_request_MAIN
#endif // generate_shipment_list_document_report_request_TEST
