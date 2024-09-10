#ifndef generate_report_dto_TEST
#define generate_report_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generate_report_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generate_report_dto.h"
generate_report_dto_t* instantiate_generate_report_dto(int include_optional);



generate_report_dto_t* instantiate_generate_report_dto(int include_optional) {
  generate_report_dto_t* generate_report_dto = NULL;
  if (include_optional) {
    generate_report_dto = generate_report_dto_create(
      "0",
      56
    );
  } else {
    generate_report_dto = generate_report_dto_create(
      "0",
      56
    );
  }

  return generate_report_dto;
}


#ifdef generate_report_dto_MAIN

void test_generate_report_dto(int include_optional) {
    generate_report_dto_t* generate_report_dto_1 = instantiate_generate_report_dto(include_optional);

	cJSON* jsongenerate_report_dto_1 = generate_report_dto_convertToJSON(generate_report_dto_1);
	printf("generate_report_dto :\n%s\n", cJSON_Print(jsongenerate_report_dto_1));
	generate_report_dto_t* generate_report_dto_2 = generate_report_dto_parseFromJSON(jsongenerate_report_dto_1);
	cJSON* jsongenerate_report_dto_2 = generate_report_dto_convertToJSON(generate_report_dto_2);
	printf("repeating generate_report_dto:\n%s\n", cJSON_Print(jsongenerate_report_dto_2));
}

int main() {
  test_generate_report_dto(1);
  test_generate_report_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // generate_report_dto_MAIN
#endif // generate_report_dto_TEST
