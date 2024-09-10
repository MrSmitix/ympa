#ifndef get_report_info_response_TEST
#define get_report_info_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_report_info_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_report_info_response.h"
get_report_info_response_t* instantiate_get_report_info_response(int include_optional);

#include "test_report_info_dto.c"


get_report_info_response_t* instantiate_get_report_info_response(int include_optional) {
  get_report_info_response_t* get_report_info_response = NULL;
  if (include_optional) {
    get_report_info_response = get_report_info_response_create(
      _api__get_report_info_response__OK,
       // false, not to have infinite recursion
      instantiate_report_info_dto(0)
    );
  } else {
    get_report_info_response = get_report_info_response_create(
      _api__get_report_info_response__OK,
      NULL
    );
  }

  return get_report_info_response;
}


#ifdef get_report_info_response_MAIN

void test_get_report_info_response(int include_optional) {
    get_report_info_response_t* get_report_info_response_1 = instantiate_get_report_info_response(include_optional);

	cJSON* jsonget_report_info_response_1 = get_report_info_response_convertToJSON(get_report_info_response_1);
	printf("get_report_info_response :\n%s\n", cJSON_Print(jsonget_report_info_response_1));
	get_report_info_response_t* get_report_info_response_2 = get_report_info_response_parseFromJSON(jsonget_report_info_response_1);
	cJSON* jsonget_report_info_response_2 = get_report_info_response_convertToJSON(get_report_info_response_2);
	printf("repeating get_report_info_response:\n%s\n", cJSON_Print(jsonget_report_info_response_2));
}

int main() {
  test_get_report_info_response(1);
  test_get_report_info_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_report_info_response_MAIN
#endif // get_report_info_response_TEST
