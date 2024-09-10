-module(ympa_erlang_client_tariff_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_tariff_dto/0]).

-type ympa_erlang_client_tariff_dto() ::
    #{ 'type' := ympa_erlang_client_tariff_type:ympa_erlang_client_tariff_type(),
       'percent' => integer(),
       'amount' := integer(),
       'parameters' := list()
     }.

encode(#{ 'type' := Type,
          'percent' := Percent,
          'amount' := Amount,
          'parameters' := Parameters
        }) ->
    #{ 'type' => Type,
       'percent' => Percent,
       'amount' => Amount,
       'parameters' => Parameters
     }.
