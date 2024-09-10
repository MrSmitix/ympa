-module(ympa_erlang_client_get_categories_max_sale_quantum_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_categories_max_sale_quantum_request/0]).

-type ympa_erlang_client_get_categories_max_sale_quantum_request() ::
    #{ 'marketCategoryIds' := ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'marketCategoryIds' := MarketCategoryIds
        }) ->
    #{ 'marketCategoryIds' => MarketCategoryIds
     }.
