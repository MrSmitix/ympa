#ifndef put_sku_bids_request_TEST
#define put_sku_bids_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define put_sku_bids_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/put_sku_bids_request.h"
put_sku_bids_request_t* instantiate_put_sku_bids_request(int include_optional);



put_sku_bids_request_t* instantiate_put_sku_bids_request(int include_optional) {
  put_sku_bids_request_t* put_sku_bids_request = NULL;
  if (include_optional) {
    put_sku_bids_request = put_sku_bids_request_create(
      list_createList()
    );
  } else {
    put_sku_bids_request = put_sku_bids_request_create(
      list_createList()
    );
  }

  return put_sku_bids_request;
}


#ifdef put_sku_bids_request_MAIN

void test_put_sku_bids_request(int include_optional) {
    put_sku_bids_request_t* put_sku_bids_request_1 = instantiate_put_sku_bids_request(include_optional);

	cJSON* jsonput_sku_bids_request_1 = put_sku_bids_request_convertToJSON(put_sku_bids_request_1);
	printf("put_sku_bids_request :\n%s\n", cJSON_Print(jsonput_sku_bids_request_1));
	put_sku_bids_request_t* put_sku_bids_request_2 = put_sku_bids_request_parseFromJSON(jsonput_sku_bids_request_1);
	cJSON* jsonput_sku_bids_request_2 = put_sku_bids_request_convertToJSON(put_sku_bids_request_2);
	printf("repeating put_sku_bids_request:\n%s\n", cJSON_Print(jsonput_sku_bids_request_2));
}

int main() {
  test_put_sku_bids_request(1);
  test_put_sku_bids_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // put_sku_bids_request_MAIN
#endif // put_sku_bids_request_TEST
