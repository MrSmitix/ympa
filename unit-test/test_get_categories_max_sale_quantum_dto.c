#ifndef get_categories_max_sale_quantum_dto_TEST
#define get_categories_max_sale_quantum_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_categories_max_sale_quantum_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_categories_max_sale_quantum_dto.h"
get_categories_max_sale_quantum_dto_t* instantiate_get_categories_max_sale_quantum_dto(int include_optional);



get_categories_max_sale_quantum_dto_t* instantiate_get_categories_max_sale_quantum_dto(int include_optional) {
  get_categories_max_sale_quantum_dto_t* get_categories_max_sale_quantum_dto = NULL;
  if (include_optional) {
    get_categories_max_sale_quantum_dto = get_categories_max_sale_quantum_dto_create(
      list_createList(),
      list_createList()
    );
  } else {
    get_categories_max_sale_quantum_dto = get_categories_max_sale_quantum_dto_create(
      list_createList(),
      list_createList()
    );
  }

  return get_categories_max_sale_quantum_dto;
}


#ifdef get_categories_max_sale_quantum_dto_MAIN

void test_get_categories_max_sale_quantum_dto(int include_optional) {
    get_categories_max_sale_quantum_dto_t* get_categories_max_sale_quantum_dto_1 = instantiate_get_categories_max_sale_quantum_dto(include_optional);

	cJSON* jsonget_categories_max_sale_quantum_dto_1 = get_categories_max_sale_quantum_dto_convertToJSON(get_categories_max_sale_quantum_dto_1);
	printf("get_categories_max_sale_quantum_dto :\n%s\n", cJSON_Print(jsonget_categories_max_sale_quantum_dto_1));
	get_categories_max_sale_quantum_dto_t* get_categories_max_sale_quantum_dto_2 = get_categories_max_sale_quantum_dto_parseFromJSON(jsonget_categories_max_sale_quantum_dto_1);
	cJSON* jsonget_categories_max_sale_quantum_dto_2 = get_categories_max_sale_quantum_dto_convertToJSON(get_categories_max_sale_quantum_dto_2);
	printf("repeating get_categories_max_sale_quantum_dto:\n%s\n", cJSON_Print(jsonget_categories_max_sale_quantum_dto_2));
}

int main() {
  test_get_categories_max_sale_quantum_dto(1);
  test_get_categories_max_sale_quantum_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_categories_max_sale_quantum_dto_MAIN
#endif // get_categories_max_sale_quantum_dto_TEST
