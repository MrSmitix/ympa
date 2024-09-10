#ifndef suggest_prices_result_dto_TEST
#define suggest_prices_result_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define suggest_prices_result_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/suggest_prices_result_dto.h"
suggest_prices_result_dto_t* instantiate_suggest_prices_result_dto(int include_optional);



suggest_prices_result_dto_t* instantiate_suggest_prices_result_dto(int include_optional) {
  suggest_prices_result_dto_t* suggest_prices_result_dto = NULL;
  if (include_optional) {
    suggest_prices_result_dto = suggest_prices_result_dto_create(
      list_createList()
    );
  } else {
    suggest_prices_result_dto = suggest_prices_result_dto_create(
      list_createList()
    );
  }

  return suggest_prices_result_dto;
}


#ifdef suggest_prices_result_dto_MAIN

void test_suggest_prices_result_dto(int include_optional) {
    suggest_prices_result_dto_t* suggest_prices_result_dto_1 = instantiate_suggest_prices_result_dto(include_optional);

	cJSON* jsonsuggest_prices_result_dto_1 = suggest_prices_result_dto_convertToJSON(suggest_prices_result_dto_1);
	printf("suggest_prices_result_dto :\n%s\n", cJSON_Print(jsonsuggest_prices_result_dto_1));
	suggest_prices_result_dto_t* suggest_prices_result_dto_2 = suggest_prices_result_dto_parseFromJSON(jsonsuggest_prices_result_dto_1);
	cJSON* jsonsuggest_prices_result_dto_2 = suggest_prices_result_dto_convertToJSON(suggest_prices_result_dto_2);
	printf("repeating suggest_prices_result_dto:\n%s\n", cJSON_Print(jsonsuggest_prices_result_dto_2));
}

int main() {
  test_suggest_prices_result_dto(1);
  test_suggest_prices_result_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // suggest_prices_result_dto_MAIN
#endif // suggest_prices_result_dto_TEST
