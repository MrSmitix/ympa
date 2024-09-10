-module(ympa_erlang_client_calculate_tariffs_request).

-export([encode/1]).

-export_type([ympa_erlang_client_calculate_tariffs_request/0]).

-type ympa_erlang_client_calculate_tariffs_request() ::
    #{ 'parameters' := ympa_erlang_client_calculate_tariffs_parameters_dto:ympa_erlang_client_calculate_tariffs_parameters_dto(),
       'offers' := list()
     }.

encode(#{ 'parameters' := Parameters,
          'offers' := Offers
        }) ->
    #{ 'parameters' => Parameters,
       'offers' => Offers
     }.
