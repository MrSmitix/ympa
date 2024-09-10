#ifndef get_promos_result_dto_TEST
#define get_promos_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_promos_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_promos_result_dto.h"
get_promos_result_dto_t* instantiate_get_promos_result_dto(int include_optional);



get_promos_result_dto_t* instantiate_get_promos_result_dto(int include_optional) {
  get_promos_result_dto_t* get_promos_result_dto = NULL;
  if (include_optional) {
    get_promos_result_dto = get_promos_result_dto_create(
      list_createList()
    );
  } else {
    get_promos_result_dto = get_promos_result_dto_create(
      list_createList()
    );
  }

  return get_promos_result_dto;
}


#ifdef get_promos_result_dto_MAIN

void test_get_promos_result_dto(int include_optional) {
    get_promos_result_dto_t* get_promos_result_dto_1 = instantiate_get_promos_result_dto(include_optional);

	cJSON* jsonget_promos_result_dto_1 = get_promos_result_dto_convertToJSON(get_promos_result_dto_1);
	printf("get_promos_result_dto :\n%s\n", cJSON_Print(jsonget_promos_result_dto_1));
	get_promos_result_dto_t* get_promos_result_dto_2 = get_promos_result_dto_parseFromJSON(jsonget_promos_result_dto_1);
	cJSON* jsonget_promos_result_dto_2 = get_promos_result_dto_convertToJSON(get_promos_result_dto_2);
	printf("repeating get_promos_result_dto:\n%s\n", cJSON_Print(jsonget_promos_result_dto_2));
}

int main() {
  test_get_promos_result_dto(1);
  test_get_promos_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_promos_result_dto_MAIN
#endif // get_promos_result_dto_TEST
