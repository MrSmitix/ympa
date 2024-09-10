-module(ympa_erlang_client_calculated_tariff_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_calculated_tariff_dto/0]).

-type ympa_erlang_client_calculated_tariff_dto() ::
    #{ 'type' := ympa_erlang_client_calculated_tariff_type:ympa_erlang_client_calculated_tariff_type(),
       'amount' => integer(),
       'parameters' := list()
     }.

encode(#{ 'type' := Type,
          'amount' := Amount,
          'parameters' := Parameters
        }) ->
    #{ 'type' => Type,
       'amount' => Amount,
       'parameters' => Parameters
     }.
