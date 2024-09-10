#ifndef quantum_dto_TEST
#define quantum_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quantum_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quantum_dto.h"
quantum_dto_t* instantiate_quantum_dto(int include_optional);



quantum_dto_t* instantiate_quantum_dto(int include_optional) {
  quantum_dto_t* quantum_dto = NULL;
  if (include_optional) {
    quantum_dto = quantum_dto_create(
      1,
      1
    );
  } else {
    quantum_dto = quantum_dto_create(
      1,
      1
    );
  }

  return quantum_dto;
}


#ifdef quantum_dto_MAIN

void test_quantum_dto(int include_optional) {
    quantum_dto_t* quantum_dto_1 = instantiate_quantum_dto(include_optional);

	cJSON* jsonquantum_dto_1 = quantum_dto_convertToJSON(quantum_dto_1);
	printf("quantum_dto :\n%s\n", cJSON_Print(jsonquantum_dto_1));
	quantum_dto_t* quantum_dto_2 = quantum_dto_parseFromJSON(jsonquantum_dto_1);
	cJSON* jsonquantum_dto_2 = quantum_dto_convertToJSON(quantum_dto_2);
	printf("repeating quantum_dto:\n%s\n", cJSON_Print(jsonquantum_dto_2));
}

int main() {
  test_quantum_dto(1);
  test_quantum_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // quantum_dto_MAIN
#endif // quantum_dto_TEST
