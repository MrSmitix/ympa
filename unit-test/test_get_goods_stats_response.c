#ifndef get_goods_stats_response_TEST
#define get_goods_stats_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_goods_stats_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_goods_stats_response.h"
get_goods_stats_response_t* instantiate_get_goods_stats_response(int include_optional);

#include "test_goods_stats_dto.c"


get_goods_stats_response_t* instantiate_get_goods_stats_response(int include_optional) {
  get_goods_stats_response_t* get_goods_stats_response = NULL;
  if (include_optional) {
    get_goods_stats_response = get_goods_stats_response_create(
      _api__get_goods_stats_response__OK,
       // false, not to have infinite recursion
      instantiate_goods_stats_dto(0)
    );
  } else {
    get_goods_stats_response = get_goods_stats_response_create(
      _api__get_goods_stats_response__OK,
      NULL
    );
  }

  return get_goods_stats_response;
}


#ifdef get_goods_stats_response_MAIN

void test_get_goods_stats_response(int include_optional) {
    get_goods_stats_response_t* get_goods_stats_response_1 = instantiate_get_goods_stats_response(include_optional);

	cJSON* jsonget_goods_stats_response_1 = get_goods_stats_response_convertToJSON(get_goods_stats_response_1);
	printf("get_goods_stats_response :\n%s\n", cJSON_Print(jsonget_goods_stats_response_1));
	get_goods_stats_response_t* get_goods_stats_response_2 = get_goods_stats_response_parseFromJSON(jsonget_goods_stats_response_1);
	cJSON* jsonget_goods_stats_response_2 = get_goods_stats_response_convertToJSON(get_goods_stats_response_2);
	printf("repeating get_goods_stats_response:\n%s\n", cJSON_Print(jsonget_goods_stats_response_2));
}

int main() {
  test_get_goods_stats_response(1);
  test_get_goods_stats_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_goods_stats_response_MAIN
#endif // get_goods_stats_response_TEST
