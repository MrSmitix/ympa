#ifndef price_competitiveness_type_TEST
#define price_competitiveness_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_competitiveness_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_competitiveness_type.h"
price_competitiveness_type_t* instantiate_price_competitiveness_type(int include_optional);



price_competitiveness_type_t* instantiate_price_competitiveness_type(int include_optional) {
  price_competitiveness_type_t* price_competitiveness_type = NULL;
  if (include_optional) {
    price_competitiveness_type = price_competitiveness_type_create(
    );
  } else {
    price_competitiveness_type = price_competitiveness_type_create(
    );
  }

  return price_competitiveness_type;
}


#ifdef price_competitiveness_type_MAIN

void test_price_competitiveness_type(int include_optional) {
    price_competitiveness_type_t* price_competitiveness_type_1 = instantiate_price_competitiveness_type(include_optional);

	cJSON* jsonprice_competitiveness_type_1 = price_competitiveness_type_convertToJSON(price_competitiveness_type_1);
	printf("price_competitiveness_type :\n%s\n", cJSON_Print(jsonprice_competitiveness_type_1));
	price_competitiveness_type_t* price_competitiveness_type_2 = price_competitiveness_type_parseFromJSON(jsonprice_competitiveness_type_1);
	cJSON* jsonprice_competitiveness_type_2 = price_competitiveness_type_convertToJSON(price_competitiveness_type_2);
	printf("repeating price_competitiveness_type:\n%s\n", cJSON_Print(jsonprice_competitiveness_type_2));
}

int main() {
  test_price_competitiveness_type(1);
  test_price_competitiveness_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_competitiveness_type_MAIN
#endif // price_competitiveness_type_TEST
