#ifndef max_sale_quantum_dto_TEST
#define max_sale_quantum_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define max_sale_quantum_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/max_sale_quantum_dto.h"
max_sale_quantum_dto_t* instantiate_max_sale_quantum_dto(int include_optional);



max_sale_quantum_dto_t* instantiate_max_sale_quantum_dto(int include_optional) {
  max_sale_quantum_dto_t* max_sale_quantum_dto = NULL;
  if (include_optional) {
    max_sale_quantum_dto = max_sale_quantum_dto_create(
      56,
      "0",
      56
    );
  } else {
    max_sale_quantum_dto = max_sale_quantum_dto_create(
      56,
      "0",
      56
    );
  }

  return max_sale_quantum_dto;
}


#ifdef max_sale_quantum_dto_MAIN

void test_max_sale_quantum_dto(int include_optional) {
    max_sale_quantum_dto_t* max_sale_quantum_dto_1 = instantiate_max_sale_quantum_dto(include_optional);

	cJSON* jsonmax_sale_quantum_dto_1 = max_sale_quantum_dto_convertToJSON(max_sale_quantum_dto_1);
	printf("max_sale_quantum_dto :\n%s\n", cJSON_Print(jsonmax_sale_quantum_dto_1));
	max_sale_quantum_dto_t* max_sale_quantum_dto_2 = max_sale_quantum_dto_parseFromJSON(jsonmax_sale_quantum_dto_1);
	cJSON* jsonmax_sale_quantum_dto_2 = max_sale_quantum_dto_convertToJSON(max_sale_quantum_dto_2);
	printf("repeating max_sale_quantum_dto:\n%s\n", cJSON_Print(jsonmax_sale_quantum_dto_2));
}

int main() {
  test_max_sale_quantum_dto(1);
  test_max_sale_quantum_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // max_sale_quantum_dto_MAIN
#endif // max_sale_quantum_dto_TEST
