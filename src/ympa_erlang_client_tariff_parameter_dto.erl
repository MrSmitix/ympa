-module(ympa_erlang_client_tariff_parameter_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_tariff_parameter_dto/0]).

-type ympa_erlang_client_tariff_parameter_dto() ::
    #{ 'name' := binary(),
       'value' := binary()
     }.

encode(#{ 'name' := Name,
          'value' := Value
        }) ->
    #{ 'name' => Name,
       'value' => Value
     }.
