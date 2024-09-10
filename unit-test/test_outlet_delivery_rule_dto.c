#ifndef outlet_delivery_rule_dto_TEST
#define outlet_delivery_rule_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define outlet_delivery_rule_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/outlet_delivery_rule_dto.h"
outlet_delivery_rule_dto_t* instantiate_outlet_delivery_rule_dto(int include_optional);



outlet_delivery_rule_dto_t* instantiate_outlet_delivery_rule_dto(int include_optional) {
  outlet_delivery_rule_dto_t* outlet_delivery_rule_dto = NULL;
  if (include_optional) {
    outlet_delivery_rule_dto = outlet_delivery_rule_dto_create(
      56,
      56,
      56,
      0,
      1.337,
      1
    );
  } else {
    outlet_delivery_rule_dto = outlet_delivery_rule_dto_create(
      56,
      56,
      56,
      0,
      1.337,
      1
    );
  }

  return outlet_delivery_rule_dto;
}


#ifdef outlet_delivery_rule_dto_MAIN

void test_outlet_delivery_rule_dto(int include_optional) {
    outlet_delivery_rule_dto_t* outlet_delivery_rule_dto_1 = instantiate_outlet_delivery_rule_dto(include_optional);

	cJSON* jsonoutlet_delivery_rule_dto_1 = outlet_delivery_rule_dto_convertToJSON(outlet_delivery_rule_dto_1);
	printf("outlet_delivery_rule_dto :\n%s\n", cJSON_Print(jsonoutlet_delivery_rule_dto_1));
	outlet_delivery_rule_dto_t* outlet_delivery_rule_dto_2 = outlet_delivery_rule_dto_parseFromJSON(jsonoutlet_delivery_rule_dto_1);
	cJSON* jsonoutlet_delivery_rule_dto_2 = outlet_delivery_rule_dto_convertToJSON(outlet_delivery_rule_dto_2);
	printf("repeating outlet_delivery_rule_dto:\n%s\n", cJSON_Print(jsonoutlet_delivery_rule_dto_2));
}

int main() {
  test_outlet_delivery_rule_dto(1);
  test_outlet_delivery_rule_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // outlet_delivery_rule_dto_MAIN
#endif // outlet_delivery_rule_dto_TEST
