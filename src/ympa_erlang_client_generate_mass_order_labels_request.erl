-module(ympa_erlang_client_generate_mass_order_labels_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_mass_order_labels_request/0]).

-type ympa_erlang_client_generate_mass_order_labels_request() ::
    #{ 'businessId' := integer(),
       'orderIds' := ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'businessId' := BusinessId,
          'orderIds' := OrderIds
        }) ->
    #{ 'businessId' => BusinessId,
       'orderIds' => OrderIds
     }.
