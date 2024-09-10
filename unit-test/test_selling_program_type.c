#ifndef selling_program_type_TEST
#define selling_program_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define selling_program_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/selling_program_type.h"
selling_program_type_t* instantiate_selling_program_type(int include_optional);



selling_program_type_t* instantiate_selling_program_type(int include_optional) {
  selling_program_type_t* selling_program_type = NULL;
  if (include_optional) {
    selling_program_type = selling_program_type_create(
    );
  } else {
    selling_program_type = selling_program_type_create(
    );
  }

  return selling_program_type;
}


#ifdef selling_program_type_MAIN

void test_selling_program_type(int include_optional) {
    selling_program_type_t* selling_program_type_1 = instantiate_selling_program_type(include_optional);

	cJSON* jsonselling_program_type_1 = selling_program_type_convertToJSON(selling_program_type_1);
	printf("selling_program_type :\n%s\n", cJSON_Print(jsonselling_program_type_1));
	selling_program_type_t* selling_program_type_2 = selling_program_type_parseFromJSON(jsonselling_program_type_1);
	cJSON* jsonselling_program_type_2 = selling_program_type_convertToJSON(selling_program_type_2);
	printf("repeating selling_program_type:\n%s\n", cJSON_Print(jsonselling_program_type_2));
}

int main() {
  test_selling_program_type(1);
  test_selling_program_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // selling_program_type_MAIN
#endif // selling_program_type_TEST
