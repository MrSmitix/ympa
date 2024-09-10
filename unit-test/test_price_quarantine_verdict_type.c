#ifndef price_quarantine_verdict_type_TEST
#define price_quarantine_verdict_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_quarantine_verdict_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_quarantine_verdict_type.h"
price_quarantine_verdict_type_t* instantiate_price_quarantine_verdict_type(int include_optional);



price_quarantine_verdict_type_t* instantiate_price_quarantine_verdict_type(int include_optional) {
  price_quarantine_verdict_type_t* price_quarantine_verdict_type = NULL;
  if (include_optional) {
    price_quarantine_verdict_type = price_quarantine_verdict_type_create(
    );
  } else {
    price_quarantine_verdict_type = price_quarantine_verdict_type_create(
    );
  }

  return price_quarantine_verdict_type;
}


#ifdef price_quarantine_verdict_type_MAIN

void test_price_quarantine_verdict_type(int include_optional) {
    price_quarantine_verdict_type_t* price_quarantine_verdict_type_1 = instantiate_price_quarantine_verdict_type(include_optional);

	cJSON* jsonprice_quarantine_verdict_type_1 = price_quarantine_verdict_type_convertToJSON(price_quarantine_verdict_type_1);
	printf("price_quarantine_verdict_type :\n%s\n", cJSON_Print(jsonprice_quarantine_verdict_type_1));
	price_quarantine_verdict_type_t* price_quarantine_verdict_type_2 = price_quarantine_verdict_type_parseFromJSON(jsonprice_quarantine_verdict_type_1);
	cJSON* jsonprice_quarantine_verdict_type_2 = price_quarantine_verdict_type_convertToJSON(price_quarantine_verdict_type_2);
	printf("repeating price_quarantine_verdict_type:\n%s\n", cJSON_Print(jsonprice_quarantine_verdict_type_2));
}

int main() {
  test_price_quarantine_verdict_type(1);
  test_price_quarantine_verdict_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_quarantine_verdict_type_MAIN
#endif // price_quarantine_verdict_type_TEST
